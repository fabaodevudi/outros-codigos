import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/**
 * "Caça-fantasmas": compara dois BPMN (ex.: local vs produção) por métricas de negócio.
 * Largura de linha de tabela: {@value #ROW_WIDTH} caracteres (alinhado ao hard-wrap ~130 do monólito).
 *
 * <ul>
 *   <li>{@code bpmn:scriptTask} — corpo {@code bpmn:script}</li>
 *   <li>{@code bpmn:serviceTask} / {@code bpmn:userTask} — {@code inputParameter} / {@code outputParameter} + {@code map}/{@code entry}</li>
 *   <li>{@code camunda:formField} (em {@code userTask}) — atributos serializados</li>
 *   <li>{@code camunda:field} (p.ex. {@code withError}, {@code throwExpression}) — texto em {@code expression}/{@code string}</li>
 *   <li>{@code camunda:executionListener} com {@code camunda:script} ou {@code expression}</li>
 *   <li>{@code bpmn:sequenceFlow} + {@code conditionExpression}</li>
 * </ul>
 * <p><b>Não cobre (por ora):</b> {@code callActivity}, {@code connector}, multi-instância, filhos de {@code formField}
 * (validação), mensagens em eventos intermediários — pedir extensão se fizer falta.</p>
 */
public final class BpmnGhostHunter {

    /** Mesma ordem de grandeza do wrap do BPMN (BpmnLongLines / ~130). */
    public static final int ROW_WIDTH = 130;

    private static final String BPMN_NS = "http://www.omg.org/spec/BPMN/20100524/MODEL";
    private static final String CAMUNDA_NS = "http://camunda.org/schema/1.0/bpmn";

    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Uso: java BpmnGhostHunter <referencia.bpmn> <comparar.bpmn> [--dump-on-mismatch] [--snippet N] [--quiet]");
            System.exit(2);
        }
        Path ref = Paths.get(args[0]).toAbsolutePath().normalize();
        Path cmp = Paths.get(args[1]).toAbsolutePath().normalize();
        boolean dumpMismatch = false;
        int snippetMax = 1200;
        boolean quiet = false;
        for (int i = 2; i < args.length; i++) {
            if ("--dump-on-mismatch".equals(args[i])) {
                dumpMismatch = true;
            } else if ("--snippet".equals(args[i]) && i + 1 < args.length) {
                snippetMax = Integer.parseInt(args[++i]);
            } else if ("--quiet".equals(args[i])) {
                quiet = true;
            }
        }
        try {
            Model refModel = parseModel(ref);
            Model cmpModel = parseModel(cmp);
            int exit = compareAndPrint(ref, cmp, refModel, cmpModel, dumpMismatch, snippetMax, quiet);
            System.exit(exit);
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
            e.printStackTrace(System.err);
            System.exit(2);
        }
    }

    private static int compareAndPrint(Path refPath, Path cmpPath, Model a, Model b,
                                         boolean dumpMismatch, int snippetMax, boolean quiet) {
        int problems = 0;
        if (!quiet) {
            System.out.println("=== BpmnGhostHunter ===");
            System.out.println("Referência: " + refPath);
            System.out.println("Comparar:   " + cmpPath);
            System.out.println("(linhas de tabela ≤ " + ROW_WIDTH + " caracteres)");
            System.out.println();
        }

        problems += compareScriptBlocks("scriptTask", "scriptTask", a.scriptTasks(), b.scriptTasks(), dumpMismatch, snippetMax, quiet);
        problems += compareIoBlocks("serviceTask I/O", "svcIO", a.serviceTasks(), b.serviceTasks(), dumpMismatch, snippetMax, quiet);
        problems += compareIoBlocks("userTask form+I/O", "usrTask", a.userTasks(), b.userTasks(), dumpMismatch, snippetMax, quiet);
        problems += compareScriptBlocks("embedded script (listener)", "embListen", a.embeddedScripts(), b.embeddedScripts(), dumpMismatch, snippetMax, quiet);
        problems += compareScriptBlocks("sequenceFlow condition", "flowCond", a.flowConditions(), b.flowConditions(), dumpMismatch, snippetMax, quiet);

        System.out.println("Resumo: " + (problems == 0 ? "sem divergências de métricas." : problems + " divergência(ões)."));
        return problems == 0 ? 0 : 1;
    }

    private static int compareScriptBlocks(String sectionTitle, String colKind,
                                           Map<String, ScriptTaskBlock> a, Map<String, ScriptTaskBlock> b,
                                           boolean dumpMismatch, int snippetMax, boolean quiet) {
        int n = 0;
        if (!quiet) {
            System.out.println("--- " + sectionTitle + " ---");
        }
        TreeMap<String, Void> ids = new TreeMap<>();
        a.keySet().forEach(k -> ids.put(k, null));
        b.keySet().forEach(k -> ids.put(k, null));

        for (String id : ids.keySet()) {
            ScriptTaskBlock ba = a.get(id);
            ScriptTaskBlock bb = b.get(id);
            if (ba == null) {
                if (!quiet) {
                    System.out.println(truncateRow("[!]   FALTA-REF " + id));
                }
                n++;
                continue;
            }
            if (bb == null) {
                if (!quiet) {
                    System.out.println(truncateRow("[!]   FALTA-CMP " + id));
                }
                n++;
                continue;
            }
            boolean ok = ba.lines() == bb.lines() && ba.chars() == bb.chars() && ba.body().equals(bb.body());
            if (!ok) {
                n++;
                System.out.println(truncateRow("[MIS] " + id + " | ref L" + ba.fileStartLine() + "-" + ba.fileEndLine()
                        + " ln=" + ba.lines() + " c=" + ba.chars() + " | cmp L" + bb.fileStartLine() + "-" + bb.fileEndLine()
                        + " ln=" + bb.lines() + " c=" + bb.chars()));
                System.out.println(truncateRow("      preview ref " + shortPreview(ba.body()) + " … cmp " + shortPreview(bb.body())));
                if (dumpMismatch) {
                    dumpSide("REF", ba.body(), snippetMax);
                    dumpSide("CMP", bb.body(), snippetMax);
                }
            } else if (!quiet) {
                System.out.println(fmtOkLine("OK", colKind, id, ba.fileStartLine(), ba.fileEndLine(), ba.lines(), ba.chars(), ba.body()));
            }
        }
        return n;
    }

    private static int compareIoBlocks(String sectionTitle, String colKind,
                                       Map<String, IoTaskBlock> a, Map<String, IoTaskBlock> b,
                                       boolean dumpMismatch, int snippetMax, boolean quiet) {
        int n = 0;
        if (!quiet) {
            System.out.println();
            System.out.println("--- " + sectionTitle + " ---");
        }
        TreeMap<String, Void> ids = new TreeMap<>();
        a.keySet().forEach(k -> ids.put(k, null));
        b.keySet().forEach(k -> ids.put(k, null));

        for (String id : ids.keySet()) {
            IoTaskBlock sa = a.get(id);
            IoTaskBlock sb = b.get(id);
            if (sa == null) {
                if (!quiet) {
                    System.out.println(truncateRow("[!]   FALTA-REF task=" + id));
                }
                n++;
                continue;
            }
            if (sb == null) {
                if (!quiet) {
                    System.out.println(truncateRow("[!]   FALTA-CMP task=" + id));
                }
                n++;
                continue;
            }
            List<String> paramKeys = new ArrayList<>();
            sa.params().keySet().forEach(paramKeys::add);
            sb.params().keySet().forEach(k -> {
                if (!paramKeys.contains(k)) {
                    paramKeys.add(k);
                }
            });
            paramKeys.sort(Comparator.naturalOrder());

            for (String pk : paramKeys) {
                IoParam pa = sa.params().get(pk);
                IoParam pb = sb.params().get(pk);
                if (pa == null || pb == null) {
                    n++;
                    System.out.println(truncateRow("[!]   IO-FALTA task=" + id + " " + pk
                            + (pa == null ? " só-CMP" : " só-REF")));
                    continue;
                }
                boolean ok = pa.lines() == pb.lines() && pa.chars() == pb.chars() && pa.text().equals(pb.text());
                if (!ok) {
                    n++;
                    System.out.println(truncateRow("[MIS] " + id + " | " + pk));
                    System.out.println(truncateRow("      ref L" + pa.fileStartLine() + "-" + pa.fileEndLine()
                            + " ln=" + pa.lines() + " c=" + pa.chars() + " prev=" + shortPreview(pa.text())));
                    System.out.println(truncateRow("      cmp L" + pb.fileStartLine() + "-" + pb.fileEndLine()
                            + " ln=" + pb.lines() + " c=" + pb.chars() + " prev=" + shortPreview(pb.text())));
                    if (dumpMismatch) {
                        dumpSide("REF " + pk, pa.text(), snippetMax);
                        dumpSide("CMP " + pk, pb.text(), snippetMax);
                    }
                } else if (!quiet) {
                    System.out.println(fmtOkLine("OK", colKind, id + " | " + pk, pa.fileStartLine(), pa.fileEndLine(), pa.lines(), pa.chars(), pa.text()));
                }
            }
        }
        return n;
    }

    private static String fmtOkLine(String status, String kindOrTask, String key, int f0, int f1, int ln, int c, String textForPreview) {
        String col1 = String.format(Locale.ROOT, "%-4s", truncate(status, 4));
        String col2 = truncate(kindOrTask, 22);
        String col3 = truncate(key, 56);
        String col4 = String.format(Locale.ROOT, "L%d-%d", f0, f1);
        String col5 = String.format(Locale.ROOT, "ln=%d c=%d", ln, c);
        String col6 = shortPreview(textForPreview);
        String raw = String.format(Locale.ROOT, "%s %-22s %-56s %-12s %-14s %s", col1, col2, col3, col4, col5, col6);
        return truncateRow(raw);
    }

    /** Primeiros 8 caracteres do texto (coluna compacta no relatório; não é hash). */
    private static String shortPreview(String full) {
        if (full == null || full.length() < 8) {
            return full == null ? "" : full;
        }
        return full.substring(0, 8);
    }

    private static String truncateRow(String s) {
        if (s.length() <= ROW_WIDTH) {
            return s;
        }
        return s.substring(0, ROW_WIDTH - 3) + "...";
    }

    private static void dumpSide(String label, String text, int max) {
        if (text == null) {
            text = "";
        }
        String t = text.length() > max ? text.substring(0, max) + "\n... (" + text.length() + " chars total)" : text;
        System.out.println(truncateRow("  --- " + label + " ---"));
        for (String line : t.split("\n", -1)) {
            System.out.println(truncateRow("  | " + line));
        }
    }

    private static String truncate(String s, int max) {
        if (s == null) {
            return "";
        }
        if (s.length() <= max) {
            return s;
        }
        return s.substring(0, max - 1) + "…";
    }

    private static Model parseModel(Path file) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory f = SAXParserFactory.newInstance();
        f.setNamespaceAware(true);
        SAXParser parser = f.newSAXParser();
        BpmnHandler h = new BpmnHandler();
        parser.parse(file.toFile(), h);
        return h.buildModel();
    }

    private static final class Model {
        private final Map<String, ScriptTaskBlock> scriptTasks;
        private final Map<String, IoTaskBlock> serviceTasks;
        private final Map<String, IoTaskBlock> userTasks;
        private final Map<String, ScriptTaskBlock> embeddedScripts;
        private final Map<String, ScriptTaskBlock> flowConditions;

        Model(Map<String, ScriptTaskBlock> scriptTasks,
              Map<String, IoTaskBlock> serviceTasks,
              Map<String, IoTaskBlock> userTasks,
              Map<String, ScriptTaskBlock> embeddedScripts,
              Map<String, ScriptTaskBlock> flowConditions) {
            this.scriptTasks = scriptTasks;
            this.serviceTasks = serviceTasks;
            this.userTasks = userTasks;
            this.embeddedScripts = embeddedScripts;
            this.flowConditions = flowConditions;
        }

        Map<String, ScriptTaskBlock> scriptTasks() {
            return scriptTasks;
        }

        Map<String, IoTaskBlock> serviceTasks() {
            return serviceTasks;
        }

        Map<String, IoTaskBlock> userTasks() {
            return userTasks;
        }

        Map<String, ScriptTaskBlock> embeddedScripts() {
            return embeddedScripts;
        }

        Map<String, ScriptTaskBlock> flowConditions() {
            return flowConditions;
        }
    }

    private static final class BpmnHandler extends DefaultHandler {
        private Locator locator;

        private final Map<String, ScriptTaskBlock> scriptTasks = new LinkedHashMap<>();
        private final Map<String, IoTaskBlock> serviceTasks = new LinkedHashMap<>();
        private final Map<String, IoTaskBlock> userTasks = new LinkedHashMap<>();
        private final Map<String, ScriptTaskBlock> embeddedScripts = new LinkedHashMap<>();
        private final Map<String, ScriptTaskBlock> flowConditions = new LinkedHashMap<>();

        private final Deque<String[]> scopeStack = new ArrayDeque<>();

        private String scriptTaskId;
        private String scriptTaskName;
        private int scriptTaskFileStart;
        private final StringBuilder scriptBody = new StringBuilder();
        private boolean insideBpmnScript;

        private String serviceTaskId;
        private String serviceTaskName;
        private int serviceTaskFileStart;
        private String userTaskId;
        private String userTaskName;
        private int userTaskFileStart;

        private final Map<String, IoParam> currentParams = new LinkedHashMap<>();

        private String paramKind;
        private String paramName;
        private final StringBuilder paramText = new StringBuilder();
        private int paramFileStart;
        private boolean insideParam;
        private boolean paramContainsMap;
        private int paramMapEntryCount;
        private boolean insideMap;
        private boolean insideEntry;
        private String entryKey;
        private final StringBuilder entryText = new StringBuilder();
        private int entryFileStart;

        private boolean insideFormField;
        private String formFieldId;
        private int formFieldStartLine;
        private final StringBuilder formFieldAttrText = new StringBuilder();

        private boolean insideExecutionListener;
        private String executionListenerEvent;
        private int executionListenerStartLine;
        private String executionListenerExpression;
        private final StringBuilder listenerScriptBody = new StringBuilder();
        private boolean insideCamundaScript;

        private String sequenceFlowId;
        private int sequenceFlowStartLine;
        private boolean insideConditionExpression;
        private final StringBuilder conditionBody = new StringBuilder();
        private int conditionStartLine;

        private boolean insideField;
        private String fieldName;
        private int fieldStartLine;
        private final StringBuilder fieldBody = new StringBuilder();
        private int fieldPartIndex;
        private boolean insideFieldPayload;

        @Override
        public void setDocumentLocator(Locator locator) {
            this.locator = locator;
        }

        private boolean ioTaskActive() {
            return serviceTaskId != null || userTaskId != null;
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) {
            int line = locator != null ? locator.getLineNumber() : -1;
            if (BPMN_NS.equals(uri) && "process".equals(localName)) {
                String pid = attributes.getValue("id");
                if (pid != null) {
                    scopeStack.push(new String[]{"process", pid});
                }
            } else if (BPMN_NS.equals(uri) && "subProcess".equals(localName)) {
                String sid = attributes.getValue("id");
                if (sid != null) {
                    scopeStack.push(new String[]{"subProcess", sid});
                }
            } else if (BPMN_NS.equals(uri) && "scriptTask".equals(localName)) {
                scriptTaskId = attributes.getValue("id");
                scriptTaskName = attributes.getValue("name");
                scriptTaskFileStart = line;
                scriptBody.setLength(0);
            } else if (BPMN_NS.equals(uri) && "script".equals(localName) && scriptTaskId != null) {
                insideBpmnScript = true;
                scriptBody.setLength(0);
            } else if (BPMN_NS.equals(uri) && "serviceTask".equals(localName)) {
                userTaskId = null;
                serviceTaskId = attributes.getValue("id");
                serviceTaskName = attributes.getValue("name");
                serviceTaskFileStart = line;
                currentParams.clear();
                scopeStack.push(new String[]{"serviceTask", serviceTaskId});
            } else if (BPMN_NS.equals(uri) && "userTask".equals(localName)) {
                serviceTaskId = null;
                userTaskId = attributes.getValue("id");
                userTaskName = attributes.getValue("name");
                userTaskFileStart = line;
                currentParams.clear();
                scopeStack.push(new String[]{"userTask", userTaskId});
            } else if (BPMN_NS.equals(uri) && "sequenceFlow".equals(localName)) {
                sequenceFlowId = attributes.getValue("id");
                sequenceFlowStartLine = line;
            } else if (BPMN_NS.equals(uri) && "conditionExpression".equals(localName) && sequenceFlowId != null) {
                insideConditionExpression = true;
                conditionBody.setLength(0);
                conditionStartLine = line;
            } else if (CAMUNDA_NS.equals(uri) && "inputParameter".equals(localName) && ioTaskActive()) {
                insideParam = true;
                paramKind = "IN";
                paramName = attributes.getValue("name");
                paramText.setLength(0);
                paramFileStart = line;
                paramContainsMap = false;
                paramMapEntryCount = 0;
                insideMap = false;
                insideEntry = false;
            } else if (CAMUNDA_NS.equals(uri) && "outputParameter".equals(localName) && ioTaskActive()) {
                insideParam = true;
                paramKind = "OUT";
                paramName = attributes.getValue("name");
                paramText.setLength(0);
                paramFileStart = line;
                paramContainsMap = false;
                paramMapEntryCount = 0;
                insideMap = false;
                insideEntry = false;
            } else if (CAMUNDA_NS.equals(uri) && "map".equals(localName) && ioTaskActive() && insideParam) {
                insideMap = true;
                paramContainsMap = true;
            } else if (CAMUNDA_NS.equals(uri) && "entry".equals(localName) && insideMap) {
                insideEntry = true;
                entryKey = attributes.getValue("key");
                entryText.setLength(0);
                entryFileStart = line;
            } else if (CAMUNDA_NS.equals(uri) && "formField".equals(localName) && userTaskId != null) {
                insideFormField = true;
                formFieldId = attributes.getValue("id");
                formFieldStartLine = line;
                formFieldAttrText.setLength(0);
                for (int i = 0; i < attributes.getLength(); i++) {
                    String an = attributes.getLocalName(i);
                    if (an == null || an.isEmpty()) {
                        an = attributes.getQName(i);
                    }
                    formFieldAttrText.append(an).append('=').append(attributes.getValue(i)).append(';');
                }
            } else if (CAMUNDA_NS.equals(uri) && "field".equals(localName) && ioTaskActive()) {
                insideField = true;
                fieldName = attributes.getValue("name");
                fieldStartLine = line;
                fieldBody.setLength(0);
                fieldPartIndex = 0;
                insideFieldPayload = false;
            } else if (CAMUNDA_NS.equals(uri) && ("expression".equals(localName) || "string".equals(localName)) && insideField) {
                if (fieldPartIndex > 0) {
                    fieldBody.append("||");
                }
                fieldPartIndex++;
                insideFieldPayload = true;
            } else if (CAMUNDA_NS.equals(uri) && "executionListener".equals(localName)) {
                insideExecutionListener = true;
                executionListenerEvent = attributes.getValue("event");
                executionListenerExpression = attributes.getValue("expression");
                executionListenerStartLine = line;
                listenerScriptBody.setLength(0);
            } else if (CAMUNDA_NS.equals(uri) && "script".equals(localName) && insideExecutionListener) {
                insideCamundaScript = true;
                listenerScriptBody.setLength(0);
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) {
            if (insideBpmnScript) {
                scriptBody.append(ch, start, length);
            } else if (insideFieldPayload) {
                fieldBody.append(ch, start, length);
            } else if (insideEntry) {
                entryText.append(ch, start, length);
            } else if (insideParam && !insideMap) {
                paramText.append(ch, start, length);
            } else if (insideConditionExpression) {
                conditionBody.append(ch, start, length);
            } else if (insideCamundaScript) {
                listenerScriptBody.append(ch, start, length);
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            int line = locator != null ? locator.getLineNumber() : -1;
            if (BPMN_NS.equals(uri) && "script".equals(localName) && insideBpmnScript) {
                insideBpmnScript = false;
            } else if (BPMN_NS.equals(uri) && "scriptTask".equals(localName)) {
                int end = line;
                String body = scriptBody.toString();
                Metrics m = metrics(body);
                if (scriptTaskId != null) {
                    if (scriptTasks.containsKey(scriptTaskId)) {
                        System.err.println("Aviso: scriptTask id duplicado: " + scriptTaskId);
                    }
                    scriptTasks.put(scriptTaskId, new ScriptTaskBlock(
                            scriptTaskId, scriptTaskName, scriptTaskFileStart, end,
                            m.lines, m.chars, body));
                }
                scriptTaskId = null;
                scriptTaskName = null;
            } else if (CAMUNDA_NS.equals(uri) && "entry".equals(localName) && insideEntry) {
                insideEntry = false;
                String pname = paramName != null ? paramName : "(sem nome)";
                String ek = entryKey != null ? entryKey : "(sem key)";
                String ioKey = paramKind + ":" + pname + "#map[" + ek + "]";
                String text = entryText.toString();
                Metrics m = metrics(text);
                if (currentParams.containsKey(ioKey)) {
                    System.err.println("Aviso: chave duplicada: " + ioKey + " task=" + (serviceTaskId != null ? serviceTaskId : userTaskId));
                }
                currentParams.put(ioKey, new IoParam(ioKey, entryFileStart, line, m.lines, m.chars, text));
                paramMapEntryCount++;
            } else if (CAMUNDA_NS.equals(uri) && "map".equals(localName) && insideMap) {
                insideMap = false;
            } else if (CAMUNDA_NS.equals(uri) && ("inputParameter".equals(localName) || "outputParameter".equals(localName)) && insideParam) {
                insideParam = false;
                if (!paramContainsMap) {
                    String key = paramKind + ":" + (paramName != null ? paramName : "(sem nome)");
                    String text = paramText.toString();
                    Metrics m = metrics(text);
                    currentParams.put(key, new IoParam(key, paramFileStart, line, m.lines, m.chars, text));
                } else if (paramMapEntryCount == 0) {
                    String key = paramKind + ":" + (paramName != null ? paramName : "(sem nome)") + "#map[]";
                    String text = "";
                    Metrics m = metrics(text);
                    currentParams.put(key, new IoParam(key, paramFileStart, line, m.lines, m.chars, text));
                }
            } else if (CAMUNDA_NS.equals(uri) && "formField".equals(localName) && userTaskId != null && insideFormField) {
                insideFormField = false;
                String fid = formFieldId != null ? formFieldId : "(sem id)";
                String key = "FORM:" + fid;
                String text = formFieldAttrText.toString();
                Metrics m = metrics(text);
                currentParams.put(key, new IoParam(key, formFieldStartLine, line, m.lines, m.chars, text));
            } else if (CAMUNDA_NS.equals(uri) && ("expression".equals(localName) || "string".equals(localName)) && insideField) {
                insideFieldPayload = false;
            } else if (CAMUNDA_NS.equals(uri) && "field".equals(localName) && insideField) {
                insideField = false;
                String fn = fieldName != null ? fieldName : "(sem nome)";
                String key = "FIELD:" + fn;
                String text = fieldBody.toString();
                Metrics m = metrics(text);
                if (currentParams.containsKey(key)) {
                    System.err.println("Aviso: field duplicado: " + key + " task=" + (serviceTaskId != null ? serviceTaskId : userTaskId));
                }
                currentParams.put(key, new IoParam(key, fieldStartLine, line, m.lines, m.chars, text));
                fieldPartIndex = 0;
            } else if (CAMUNDA_NS.equals(uri) && "script".equals(localName) && insideCamundaScript) {
                insideCamundaScript = false;
            } else if (CAMUNDA_NS.equals(uri) && "executionListener".equals(localName)) {
                flushExecutionListener(line);
                insideExecutionListener = false;
            } else if (BPMN_NS.equals(uri) && "conditionExpression".equals(localName) && insideConditionExpression) {
                insideConditionExpression = false;
                String body = conditionBody.toString();
                Metrics m = metrics(body);
                String key = "flow:" + sequenceFlowId + ":condition";
                if (flowConditions.containsKey(key)) {
                    System.err.println("Aviso: condition duplicada: " + key);
                }
                flowConditions.put(key, new ScriptTaskBlock(key, key, conditionStartLine, line, m.lines, m.chars, body));
            } else if (BPMN_NS.equals(uri) && "sequenceFlow".equals(localName)) {
                sequenceFlowId = null;
            } else if (BPMN_NS.equals(uri) && "serviceTask".equals(localName)) {
                int end = line;
                if (serviceTaskId != null) {
                    if (serviceTasks.containsKey(serviceTaskId)) {
                        System.err.println("Aviso: serviceTask duplicado: " + serviceTaskId);
                    }
                    serviceTasks.put(serviceTaskId, new IoTaskBlock(serviceTaskId, serviceTaskName,
                            serviceTaskFileStart, end, new LinkedHashMap<>(currentParams)));
                }
                if (!scopeStack.isEmpty()) {
                    scopeStack.pop();
                }
                serviceTaskId = null;
                serviceTaskName = null;
                currentParams.clear();
            } else if (BPMN_NS.equals(uri) && "userTask".equals(localName)) {
                int end = line;
                if (userTaskId != null) {
                    if (userTasks.containsKey(userTaskId)) {
                        System.err.println("Aviso: userTask duplicado: " + userTaskId);
                    }
                    userTasks.put(userTaskId, new IoTaskBlock(userTaskId, userTaskName,
                            userTaskFileStart, end, new LinkedHashMap<>(currentParams)));
                }
                if (!scopeStack.isEmpty()) {
                    scopeStack.pop();
                }
                userTaskId = null;
                userTaskName = null;
                currentParams.clear();
            } else if (BPMN_NS.equals(uri) && "subProcess".equals(localName)) {
                if (!scopeStack.isEmpty()) {
                    scopeStack.pop();
                }
            } else if (BPMN_NS.equals(uri) && "process".equals(localName)) {
                if (!scopeStack.isEmpty()) {
                    scopeStack.pop();
                }
            }
        }

        private void flushExecutionListener(int endLine) {
            String[] parent = scopeStack.peek();
            if (parent == null) {
                return;
            }
            String pk = parent[0];
            String pid = parent[1];
            String ev = executionListenerEvent != null ? executionListenerEvent : "?";
            String base = "listener:" + pk + ":" + pid + ":exec:" + ev + ":L" + executionListenerStartLine;

            if (listenerScriptBody.length() > 0) {
                String body = listenerScriptBody.toString();
                Metrics m = metrics(body);
                String key = base + ":script";
                embeddedScripts.put(key, new ScriptTaskBlock(key, key, executionListenerStartLine, endLine, m.lines, m.chars, body));
            } else if (executionListenerExpression != null && !executionListenerExpression.isEmpty()) {
                String body = executionListenerExpression;
                Metrics m = metrics(body);
                String key = base + ":expr";
                embeddedScripts.put(key, new ScriptTaskBlock(key, key, executionListenerStartLine, endLine, m.lines, m.chars, body));
            }
            listenerScriptBody.setLength(0);
            executionListenerExpression = null;
        }

        Model buildModel() {
            return new Model(scriptTasks, serviceTasks, userTasks, embeddedScripts, flowConditions);
        }
    }

    private record Metrics(int lines, int chars) {
    }

    private static Metrics metrics(String s) {
        if (s == null || s.isEmpty()) {
            return new Metrics(0, 0);
        }
        int lines = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '\n') {
                lines++;
            }
        }
        return new Metrics(lines, s.length());
    }

    private record ScriptTaskBlock(String id, String name, int fileStartLine, int fileEndLine,
                                   int lines, int chars, String body) {
    }

    private record IoParam(String key, int fileStartLine, int fileEndLine, int lines, int chars, String text) {
    }

    private record IoTaskBlock(String id, String name, int fileStartLine, int fileEndLine,
                               Map<String, IoParam> params) {
    }
}
