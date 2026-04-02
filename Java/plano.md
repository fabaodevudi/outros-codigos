import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class desnormalizar {

    public static void main(String[] args) throws Exception {
        Args a = Args.parse(args);
        if (a.help) {
            System.out.println(Args.usage());
            return;
        }

        String mapJson = readUtf8(a.mapPath);
        // Formato esperado agora: PP#### -> TEXTO ORIGINAL
        Map<String, String> ppToOriginal = JsonFlatStringMap.parseEmbeddedMapObject(mapJson);

        String input = readUtf8(a.inPath);
        String output = applySubstitutions(input, ppToOriginal);
        writeUtf8(a.outPath, output);
    }

    private static String applySubstitutions(String input, Map<String, String> map) {
        List<Map.Entry<String, String>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Comparator.comparingInt((Map.Entry<String, String> e) -> e.getKey().length()).reversed());

        String out = input;
        for (Map.Entry<String, String> e : entries) {
            String k = e.getKey();
            String v = e.getValue();
            if (k == null || k.isEmpty() || v == null) continue;
            out = replaceAllLiteral(out, k, v);
        }
        return out;
    }

    private static String replaceAllLiteral(String text, String search, String replacement) {
        int from = 0;
        int idx = text.indexOf(search, from);
        if (idx < 0) return text;

        StringBuilder sb = new StringBuilder(text.length());
        while (idx >= 0) {
            sb.append(text, from, idx).append(replacement);
            from = idx + search.length();
            idx = text.indexOf(search, from);
        }
        sb.append(text, from, text.length());
        return sb.toString();
    }

    private static String readUtf8(Path p) throws IOException {
        return Files.readString(p, StandardCharsets.UTF_8);
    }

    private static void writeUtf8(Path p, String s) throws IOException {
        Path parent = p.toAbsolutePath().getParent();
        if (parent != null) Files.createDirectories(parent);
        Files.writeString(p, s, StandardCharsets.UTF_8);
    }

    private static final class Args {
        final Path inPath;
        final Path outPath;
        final Path mapPath;
        final boolean help;

        private Args(Path inPath, Path outPath, Path mapPath, boolean help) {
            this.inPath = inPath;
            this.outPath = outPath;
            this.mapPath = mapPath;
            this.help = help;
        }

        static Args parse(String[] args) {
            Map<String, String> m = new LinkedHashMap<>();
            boolean help = false;
            for (int i = 0; i < args.length; i++) {
                String a = args[i];
                if ("--help".equals(a) || "-h".equals(a)) {
                    help = true;
                } else if (a.startsWith("--")) {
                    String k = a;
                    String v = (i + 1 < args.length) ? args[++i] : null;
                    m.put(k, v);
                }
            }
            Path in = m.containsKey("--in") ? Path.of(m.get("--in")) : null;
            Path out = m.containsKey("--out") ? Path.of(m.get("--out")) : null;
            Path map = m.containsKey("--map") ? Path.of(m.get("--map")) : null;

            if (help) return new Args(Path.of("."), Path.of("."), Path.of("."), true);
            if (in == null || out == null || map == null) {
                throw new IllegalArgumentException("Argumentos obrigatórios: --in, --out, --map\n\n" + usage());
            }
            return new Args(in, out, map, false);
        }

        static String usage() {
            return ""
                + "Uso:\n"
                + "  javac desnormalizar.java\n"
                + "  java desnormalizar --in <arquivo_cifrado.bpmn> --out <saida_original.bpmn> --map <map.json>\n";
        }
    }

    /**
     * Parser mínimo para um objeto JSON string->string.
     * Objetivo: não depender de libs externas.
     */
    private static final class JsonFlatStringMap {
        static Map<String, String> parseEmbeddedMapObject(String json) {
            int mapKey = json.indexOf("\"map\"");
            if (mapKey < 0) throw new IllegalArgumentException("Campo \"map\" não encontrado no JSON.");
            int brace = json.indexOf('{', mapKey);
            if (brace < 0) throw new IllegalArgumentException("Objeto do campo \"map\" não encontrado no JSON.");
            return parseObjectFrom(json, brace);
        }

        private static Map<String, String> parseObjectFrom(String s, int i) {
            i = skipWs(s, i);
            if (i >= s.length() || s.charAt(i) != '{') throw new IllegalArgumentException("Esperado '{' no índice " + i);
            i++; // after {

            Map<String, String> out = new LinkedHashMap<>();
            i = skipWs(s, i);
            if (i < s.length() && s.charAt(i) == '}') return out;

            while (i < s.length()) {
                i = skipWs(s, i);
                ParseResult rKey = parseJsonString(s, i);
                String key = rKey.value;
                i = skipWs(s, rKey.next);
                if (i >= s.length() || s.charAt(i) != ':') throw new IllegalArgumentException("Esperado ':' após chave em " + i);
                i++;
                i = skipWs(s, i);
                ParseResult rVal = parseJsonString(s, i);
                out.put(key, rVal.value);
                i = skipWs(s, rVal.next);
                if (i >= s.length()) throw new IllegalArgumentException("JSON truncado após valor.");
                char c = s.charAt(i);
                if (c == ',') {
                    i++;
                    continue;
                }
                if (c == '}') {
                    i++;
                    break;
                }
                throw new IllegalArgumentException("Esperado ',' ou '}' em " + i + " mas veio '" + c + "'");
            }
            return out;
        }

        private static int skipWs(String s, int i) {
            while (i < s.length()) {
                char c = s.charAt(i);
                if (c == ' ' || c == '\n' || c == '\r' || c == '\t') i++;
                else break;
            }
            return i;
        }

        private static ParseResult parseJsonString(String s, int i) {
            if (i >= s.length() || s.charAt(i) != '"') throw new IllegalArgumentException("Esperado string JSON em " + i);
            i++; // after opening quote
            StringBuilder sb = new StringBuilder();
            while (i < s.length()) {
                char c = s.charAt(i++);
                if (c == '"') {
                    return new ParseResult(sb.toString(), i);
                }
                if (c != '\\') {
                    sb.append(c);
                    continue;
                }
                if (i >= s.length()) throw new IllegalArgumentException("Escape inválido no fim do JSON.");
                char e = s.charAt(i++);
                switch (e) {
                    case '"': sb.append('"'); break;
                    case '\\': sb.append('\\'); break;
                    case '/': sb.append('/'); break;
                    case 'b': sb.append('\b'); break;
                    case 'f': sb.append('\f'); break;
                    case 'n': sb.append('\n'); break;
                    case 'r': sb.append('\r'); break;
                    case 't': sb.append('\t'); break;
                    case 'u': {
                        if (i + 4 > s.length()) throw new IllegalArgumentException("Escape \\u incompleto.");
                        int cp = Integer.parseInt(s.substring(i, i + 4), 16);
                        sb.append((char) cp);
                        i += 4;
                        break;
                    }
                    default:
                        throw new IllegalArgumentException("Escape inválido: \\" + e);
                }
            }
            throw new IllegalArgumentException("String JSON não finalizada.");
        }

        private static final class ParseResult {
            final String value;
            final int next;

            private ParseResult(String value, int next) {
                this.value = value;
                this.next = next;
            }
        }
    }
}

