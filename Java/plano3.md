import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// java JsonParesArquivoRecompor --json src/fluxo/mapa.claro.json --part1 src/fluxo/fluxo.part0001.txt --out src/fluxo/diagrama.bpmn
public final class JsonParesArquivoRecompor {

    private static final String SEP = "---";
    private static final String K0 = "m2";
    private static final String K1 = "cp";
    private static final String E1 = "DDD_MAP_JSON_RAW";
    private static final String P0 = "jpr.mapRawEnv";
    private static final String W2 = "w2";
    private static final String F4 = "f4";
    private static final String N9 = "n9";

    private record MapBundle(String tagMapRef, String javaSoftenRef, Boolean sourceEndsWithNewline) {
    }

    private record TagPair(String qname, String token) {
    }

    private record FromTo(String from, String to) {
    }

    private JsonParesArquivoRecompor() {
    }

    private static Path prefixFromPart1Arg(Path arg) {
        String name = arg.getFileName().toString();
        if (name.matches("^.+\\.part\\d{4}\\.txt$")) {
            String stem = name.replaceFirst("\\.part\\d{4}\\.txt$", "");
            Path parent = arg.getParent();
            if (parent == null) {
                return Paths.get(stem);
            }
            return parent.resolve(stem);
        }
        return arg;
    }

    public static void main(String[] args) throws IOException {
        String envNameFromText = null;
        int argLen = args.length;
        if (argLen > 0) {
            String last = args[argLen - 1];
            if (last.startsWith("TEXT_")) {
                if (last.length() <= 5) {
                    die("Último argumento: complete TEXT_ com o nome da variável (ex.: TEXT_FOO → getenv(\"FOO\")).");
                }
                envNameFromText = last.substring(5);
                argLen--;
            }
        }
        String[] argv = argLen < args.length ? Arrays.copyOfRange(args, 0, argLen) : args;

        Path mapPath = null;
        Path singleIn = null;
        Path partsPrefix = null;
        Path out = null;
        Path tagMapOverride = null;

        for (int i = 0; i < argv.length; i++) {
            switch (argv[i]) {
                case "--map", "--json" -> {
                    if (i + 1 >= argv.length) {
                        die("--json / --map precisam de caminho");
                    }
                    mapPath = Paths.get(argv[++i]);
                }
                case "--in" -> {
                    if (i + 1 >= argv.length) {
                        die("--in precisa de caminho");
                    }
                    if (singleIn != null || partsPrefix != null) {
                        die("Use só um entre --in, --parts-prefix/--prefix e --part1");
                    }
                    singleIn = Paths.get(argv[++i]);
                }
                case "--parts-prefix", "--prefix" -> {
                    if (i + 1 >= argv.length) {
                        die("--prefix / --parts-prefix precisam de valor");
                    }
                    if (singleIn != null || partsPrefix != null) {
                        die("Use só um entre --in, --parts-prefix/--prefix e --part1");
                    }
                    partsPrefix = Paths.get(argv[++i]);
                }
                case "--part1" -> {
                    if (i + 1 >= argv.length) {
                        die("--part1 precisa de caminho");
                    }
                    if (singleIn != null || partsPrefix != null) {
                        die("Use só um entre --in, --parts-prefix/--prefix e --part1");
                    }
                    partsPrefix = prefixFromPart1Arg(Paths.get(argv[++i]).normalize());
                }
                case "--out" -> {
                    if (i + 1 >= argv.length) {
                        die("--out precisa de caminho");
                    }
                    out = Paths.get(argv[++i]);
                }
                case "--tag-map" -> {
                    if (i + 1 >= argv.length) {
                        die("--tag-map precisa de caminho");
                    }
                    tagMapOverride = Paths.get(argv[++i]);
                }
                default -> die("Opção desconhecida: " + argv[i]);
            }
        }
        if (mapPath == null || out == null) {
            die("Requer --json ou --map, e --out");
        }
        if ((singleIn == null) == (partsPrefix == null)) {
            die("Indique exactamente um de --in, ou --parts-prefix/--prefix, ou --part1");
        }

        Map<String, String> tokenToOriginal = readMapJson(mapPath, envNameFromText);
        MapBundle bundle = readMapBundle(mapPath);
        Path mapDir = mapPath.toAbsolutePath().getParent();
        Path tagFile = tagMapOverride;
        if (tagFile == null && bundle.tagMapRef != null && !bundle.tagMapRef.isBlank() && !"—".equals(bundle.tagMapRef)) {
            tagFile = mapDir.resolve(bundle.tagMapRef).normalize();
        }
        Path softenFile = null;
        if (bundle.javaSoftenRef != null && !bundle.javaSoftenRef.isBlank() && !"—".equals(bundle.javaSoftenRef)) {
            softenFile = mapDir.resolve(bundle.javaSoftenRef).normalize();
        }

        String body;
        if (singleIn != null) {
            body = stripPartHeader(Files.readString(singleIn, StandardCharsets.UTF_8));
        } else {
            body = readAndConcatParts(partsPrefix);
        }
        String restored = applyTokenReplacements(body, tokenToOriginal);
        if (softenFile != null && Files.isRegularFile(softenFile)) {
            restored = applyJavaSoften(restored, loadJavaSoftenPairs(softenFile), false);
        }
        if (tagFile != null && Files.isRegularFile(tagFile)) {
            restored = applyTagPairs(restored, loadTagPairs(tagFile), false);
        }
        Path parent = out.getParent();
        if (parent != null) {
            Files.createDirectories(parent);
        }
        if (Boolean.FALSE.equals(bundle.sourceEndsWithNewline) && restored.endsWith("\n")) {
            restored = restored.substring(0, restored.length() - 1);
        }
        Files.writeString(out, restored, StandardCharsets.UTF_8);
        System.err.println("Saída: " + out.toAbsolutePath().normalize());
    }

    private static MapBundle readMapBundle(Path path) throws IOException {
        String json = Files.readString(path, StandardCharsets.UTF_8);
        String tag = extractJsonOptionalStringOrNull(json, "tag_map");
        String soften = extractJsonOptionalStringOrNull(json, "java_soften");
        Boolean snl = extractJsonOptionalBoolean(json, "source_ends_with_newline");
        return new MapBundle(tag, soften, snl);
    }

    private static Boolean extractJsonOptionalBoolean(String json, String field) {
        String key = "\"" + field + "\"";
        int idx = json.indexOf(key);
        if (idx < 0) {
            return null;
        }
        int colon = json.indexOf(':', idx + key.length());
        if (colon < 0) {
            return null;
        }
        int start = colon + 1;
        while (start < json.length() && Character.isWhitespace(json.charAt(start))) {
            start++;
        }
        if (start >= json.length()) {
            return null;
        }
        if (json.regionMatches(start, "true", 0, 4)
                && (start + 4 >= json.length() || !Character.isLetterOrDigit(json.charAt(start + 4)))) {
            return Boolean.TRUE;
        }
        if (json.regionMatches(start, "false", 0, 5)
                && (start + 5 >= json.length() || !Character.isLetterOrDigit(json.charAt(start + 5)))) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static String extractJsonOptionalStringOrNull(String json, String field) {
        String key = "\"" + field + "\"";
        int idx = json.indexOf(key);
        if (idx < 0) {
            return null;
        }
        int colon = json.indexOf(':', idx + key.length());
        if (colon < 0) {
            return null;
        }
        int start = colon + 1;
        while (start < json.length() && Character.isWhitespace(json.charAt(start))) {
            start++;
        }
        if (start >= json.length()) {
            return null;
        }
        if (json.regionMatches(start, "null", 0, 4)) {
            return null;
        }
        if (json.charAt(start) != '"') {
            return null;
        }
        int end = findClosingQuote(json, start + 1);
        if (end < 0) {
            return null;
        }
        return unescape(json.substring(start + 1, end));
    }

    private static List<TagPair> loadTagPairs(Path path) throws IOException {
        String json = Files.readString(path, StandardCharsets.UTF_8);
        int mi = json.indexOf("\"mappings\"");
        if (mi < 0) {
            die("Ficheiro de etiquetas sem \"mappings\": " + path);
        }
        int lb = json.indexOf('[', mi);
        if (lb < 0) {
            die("Etiquetas malformadas (sem [): " + path);
        }
        int rb = endOfJsonArray(json, lb);
        if (rb < 0) {
            die("Etiquetas malformadas (sem ]): " + path);
        }
        String slice = json.substring(lb, rb + 1);
        List<TagPair> list = new ArrayList<>();
        int pos = 0;
        while (true) {
            int qk = slice.indexOf("\"qname\"", pos);
            if (qk < 0) {
                break;
            }
            int cq = slice.indexOf(':', qk) + 1;
            while (cq < slice.length() && Character.isWhitespace(slice.charAt(cq))) {
                cq++;
            }
            if (cq >= slice.length() || slice.charAt(cq) != '"') {
                die("qname inválido em " + path);
            }
            int qe = findClosingQuote(slice, cq + 1);
            if (qe < 0) {
                die("qname sem fecho em " + path);
            }
            String qname = unescape(slice.substring(cq + 1, qe));
            int tk = slice.indexOf("\"token\"", qe);
            if (tk < 0) {
                die("token ausente após qname em " + path);
            }
            int ct = slice.indexOf(':', tk) + 1;
            while (ct < slice.length() && Character.isWhitespace(slice.charAt(ct))) {
                ct++;
            }
            if (ct >= slice.length() || slice.charAt(ct) != '"') {
                die("token inválido em " + path);
            }
            int te = findClosingQuote(slice, ct + 1);
            if (te < 0) {
                die("token sem fecho em " + path);
            }
            String token = unescape(slice.substring(ct + 1, te));
            list.add(new TagPair(qname, token));
            pos = te + 1;
        }
        return list;
    }

    private static int endOfJsonArray(String json, int openBracket) {
        int depth = 0;
        for (int i = openBracket; i < json.length(); i++) {
            char c = json.charAt(i);
            if (c == '[') {
                depth++;
            } else if (c == ']') {
                depth--;
                if (depth == 0) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static String replaceOpeningTagPrefix(String text, String fromLocal, String toLocal) {
        Pattern p = Pattern.compile(Pattern.quote("<" + fromLocal) + "(?=\\s|/|>)");
        return p.matcher(text).replaceAll(Matcher.quoteReplacement("<" + toLocal));
    }

    private static String applyTagPairs(String content, List<TagPair> mappings, boolean forward) {
        List<TagPair> ordered = new ArrayList<>(mappings);
        String result = content;
        if (forward) {
            ordered.sort(Comparator.comparingInt((TagPair m) -> m.qname().length()).reversed()
                    .thenComparing(TagPair::qname));
            for (TagPair m : ordered) {
                result = result.replace("</" + m.qname() + ">", "</" + m.token() + ">");
                result = replaceOpeningTagPrefix(result, m.qname(), m.token());
            }
        } else {
            ordered.sort(Comparator.comparingInt((TagPair m) -> m.token().length()).reversed()
                    .thenComparing(TagPair::token));
            for (TagPair m : ordered) {
                result = result.replace("</" + m.token() + ">", "</" + m.qname() + ">");
                result = replaceOpeningTagPrefix(result, m.token(), m.qname());
            }
        }
        return result;
    }

    private static List<FromTo> loadJavaSoftenPairs(Path path) throws IOException {
        String json = Files.readString(path, StandardCharsets.UTF_8);
        int pi = json.indexOf("\"pairs\"");
        if (pi < 0) {
            die("Auxiliar sem \"pairs\": " + path);
        }
        int lb = json.indexOf('[', pi);
        if (lb < 0) {
            die("pairs sem [: " + path);
        }
        int rb = endOfJsonArray(json, lb);
        if (rb < 0) {
            die("pairs sem ]: " + path);
        }
        String slice = json.substring(lb, rb + 1);
        List<FromTo> list = new ArrayList<>();
        int pos = 0;
        while (true) {
            int fk = slice.indexOf("\"from\"", pos);
            if (fk < 0) {
                break;
            }
            int cf = slice.indexOf(':', fk) + 1;
            while (cf < slice.length() && Character.isWhitespace(slice.charAt(cf))) {
                cf++;
            }
            if (cf >= slice.length() || slice.charAt(cf) != '"') {
                die("from inválido em " + path);
            }
            int fe = findClosingQuote(slice, cf + 1);
            if (fe < 0) {
                die("from sem fecho em " + path);
            }
            String from = unescape(slice.substring(cf + 1, fe));
            int tk = slice.indexOf("\"to\"", fe);
            if (tk < 0) {
                die("to ausente após from em " + path);
            }
            int ct = slice.indexOf(':', tk) + 1;
            while (ct < slice.length() && Character.isWhitespace(slice.charAt(ct))) {
                ct++;
            }
            if (ct >= slice.length() || slice.charAt(ct) != '"') {
                die("to inválido em " + path);
            }
            int te = findClosingQuote(slice, ct + 1);
            if (te < 0) {
                die("to sem fecho em " + path);
            }
            String to = unescape(slice.substring(ct + 1, te));
            list.add(new FromTo(from, to));
            pos = te + 1;
        }
        return list;
    }

    private static String applyJavaSoften(String content, List<FromTo> pairs, boolean forward) {
        List<FromTo> ordered = new ArrayList<>(pairs);
        String r = content;
        if (forward) {
            ordered.sort(Comparator.comparingInt((FromTo p) -> p.from.length()).reversed()
                    .thenComparing(FromTo::from));
            for (FromTo p : ordered) {
                r = r.replace(p.from, p.to);
            }
        } else {
            ordered.sort(Comparator.comparingInt((FromTo p) -> p.to.length()).reversed()
                    .thenComparing(FromTo::to));
            for (FromTo p : ordered) {
                r = r.replace(p.to, p.from);
            }
        }
        return r;
    }

    private static String applyTokenReplacements(String s, Map<String, String> tokenToOriginal) {
        List<Map.Entry<String, String>> pairs = new ArrayList<>(tokenToOriginal.entrySet());
        pairs.sort(Comparator.comparingInt((Map.Entry<String, String> e) -> e.getKey().length()).reversed()
                .thenComparing(Map.Entry::getKey));
        String result = s;
        for (Map.Entry<String, String> e : pairs) {
            result = result.replace(e.getKey(), e.getValue());
        }
        return result;
    }

    private static String envLegacyName() {
        return new String(new char[]{
                'C', 'C', 'T', 'E', 'X', 'T', '_', 'M', 'A', 'S', 'K', 'E', 'R', '_', 'M', 'A', 'P', '_', 'S', 'E',
                'C', 'R', 'E', 'T'
        });
    }

    private static String trimOrNull(String s) {
        if (s == null) {
            return null;
        }
        s = s.trim();
        return s.isEmpty() ? null : s;
    }

    private static String rawFromEnv(String envNameFromTextArg) {
        if (envNameFromTextArg != null) {
            String v = trimOrNull(System.getenv(envNameFromTextArg.trim()));
            if (v != null) {
                return v;
            }
        }
        String name = trimOrNull(System.getProperty(P0));
        if (name != null) {
            String v = trimOrNull(System.getenv(name));
            if (v != null) {
                return v;
            }
        }
        String s = trimOrNull(System.getenv(E1));
        if (s == null) {
            s = trimOrNull(System.getenv(envLegacyName()));
        }
        return s;
    }

    private static int[] vecFromRaw(String raw) {
        String t = raw.trim();
        if (t.isEmpty()) {
            die("Entrada vazia.");
        }
        boolean allDigits = true;
        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            if (c < '0' || c > '9') {
                allDigits = false;
                break;
            }
        }
        if (allDigits) {
            return digitsToInts(t);
        }
        byte[] u = t.getBytes(StandardCharsets.UTF_8);
        int need = 20;
        StringBuilder sb = new StringBuilder(need);
        for (int i = 0; i < need; i++) {
            int mix = (u[i % u.length] & 0xff) + i * 131;
            sb.append(mix % 10);
        }
        return digitsToInts(sb.toString());
    }

    private static int[] digitsToInts(String digitos) {
        if (digitos.isEmpty()) {
            throw new IllegalArgumentException("vazio");
        }
        int[] k = new int[digitos.length()];
        for (int i = 0; i < digitos.length(); i++) {
            char c = digitos.charAt(i);
            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("pos " + i);
            }
            k[i] = c - '0';
        }
        return k;
    }

    private static int shiftAt(int index, int[] tab) {
        return (tab[index % tab.length] + index) % 26;
    }

    private static String invert(String texto, int[] tab) {
        StringBuilder sb = new StringBuilder(texto.length());
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            int sh = shiftAt(i, tab);
            if (c >= 'A' && c <= 'Z') {
                sb.append((char) ('A' + (c - 'A' - sh + 26) % 26));
            } else if (c >= 'a' && c <= 'z') {
                sb.append((char) ('a' + (c - 'a' - sh + 26) % 26));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static Map<String, String> readMapJson(Path path, String envNameFromTextArg) throws IOException {
        String json = Files.readString(path, StandardCharsets.UTF_8);
        Map<String, String> map = new LinkedHashMap<>();
        String slotKey = "\"" + F4 + "\"";
        String bodyKey = "\"" + N9 + "\"";
        int idx = json.indexOf("\"" + W2 + "\"");
        if (idx < 0) {
            idx = json.indexOf("\"entries\"");
            slotKey = "\"token\"";
            bodyKey = "\"original\"";
        }
        if (idx < 0) {
            die("JSON sem bloco de pares (w2 ou entries legado)");
        }
        int i = json.indexOf('[', idx);
        if (i < 0) {
            die("JSON malformado");
        }
        String m2val = extractJsonOptionalStringOrNull(json, K0);
        boolean cp = K1.equals(m2val);
        int[] v0 = null;
        if (cp) {
            String sec = rawFromEnv(envNameFromTextArg);
            if (sec == null) {
                die("Variável de ambiente ausente para este mapa.");
            }
            v0 = vecFromRaw(sec);
        }
        while (true) {
            int tokKey = json.indexOf(slotKey, i);
            if (tokKey < 0) {
                break;
            }
            int tq = json.indexOf('"', json.indexOf(':', tokKey) + 1);
            if (tq < 0) {
                break;
            }
            int te = findClosingQuote(json, tq + 1);
            if (te < 0) {
                break;
            }
            String token = unescape(json.substring(tq + 1, te));
            int origKey = json.indexOf(bodyKey, te);
            if (origKey < 0) {
                break;
            }
            int oq = json.indexOf('"', json.indexOf(':', origKey) + 1);
            int oe = findClosingQuote(json, oq + 1);
            if (oe < 0) {
                break;
            }
            String original = unescape(json.substring(oq + 1, oe));
            if (cp) {
                original = invert(original, v0);
            }
            map.put(token, original);
            i = oe + 1;
        }
        return map;
    }

    private static int findClosingQuote(String s, int from) {
        for (int j = from; j < s.length(); j++) {
            if (s.charAt(j) == '"' && (j == 0 || s.charAt(j - 1) != '\\')) {
                return j;
            }
        }
        return -1;
    }

    private static String unescape(String s) {
        return s.replace("\\\"", "\"").replace("\\\\", "\\");
    }

    private static String stripPartHeader(String fileContent) {
        int idx = fileContent.indexOf("\n" + SEP + "\n");
        if (idx >= 0) {
            return fileContent.substring(idx + SEP.length() + 2);
        }
        idx = fileContent.indexOf("\n" + SEP + "\r\n");
        if (idx >= 0) {
            return fileContent.substring(idx + SEP.length() + 3);
        }
        return fileContent;
    }

    private static String readAndConcatParts(Path partsPrefix) throws IOException {
        if (Files.isRegularFile(partsPrefix)) {
            String fn = partsPrefix.getFileName().toString();
            if (fn.matches("^part\\d{4}\\.txt$")) {
                return readBarePartFiles(partsPrefix);
            }
        }
        Path parent = partsPrefix.getParent();
        String stem = partsPrefix.getFileName().toString();
        if (parent == null) {
            parent = Paths.get(".").toAbsolutePath();
        }
        List<Path> parts = new ArrayList<>();
        for (int n = 1; n < 100_000; n++) {
            Path p = parent.resolve(String.format(Locale.ROOT, "%s.part%04d.txt", stem, n));
            if (!Files.isRegularFile(p)) {
                break;
            }
            parts.add(p);
        }
        if (parts.isEmpty()) {
            die("Nenhuma parte encontrada para prefixo: " + partsPrefix);
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < parts.size(); j++) {
            String chunk = stripPartHeader(Files.readString(parts.get(j), StandardCharsets.UTF_8));
            sb.append(chunk);
            if (j < parts.size() - 1 && !chunk.endsWith("\n")) {
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    private static String readBarePartFiles(Path firstPart) throws IOException {
        Path parent = firstPart.getParent();
        if (parent == null) {
            parent = Paths.get(".").toAbsolutePath();
        }
        List<Path> parts = new ArrayList<>();
        for (int n = 1; n < 100_000; n++) {
            Path p = parent.resolve(String.format(Locale.ROOT, "part%04d.txt", n));
            if (!Files.isRegularFile(p)) {
                break;
            }
            parts.add(p);
        }
        if (parts.isEmpty()) {
            die("Nenhuma parte encontrada (part0001.txt…): " + firstPart);
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < parts.size(); j++) {
            String chunk = stripPartHeader(Files.readString(parts.get(j), StandardCharsets.UTF_8));
            sb.append(chunk);
            if (j < parts.size() - 1 && !chunk.endsWith("\n")) {
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    private static void die(String msg) {
        System.err.println("Erro: " + msg);
        System.exit(2);
    }

    /*
     * Documento DD8034 | Lote KK1128 [2026-04-02 20:00:00] | DD8001: MySQL ddd_registros (lotes, lote_arquivos) ·
     * DD0001 Catálogo: workflow/arquitetura/registros/REGISTRO_DOCUMENTOS.md
     */
}
