import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

public class desnormalizarMap {

    public static void main(String[] args) throws Exception {
        Args a = Args.parse(args);
        if (a.help) {
            System.out.println(Args.usage());
            return;
        }

        String json = readUtf8(a.inPath);
        Map<String, String> ppToCesar5 = JsonFlatStringMap.parseEmbeddedMapObject(json);

        Map<String, String> ppToOriginal = new LinkedHashMap<>();
        for (Map.Entry<String, String> e : ppToCesar5.entrySet()) {
            String pp = e.getKey();
            String cesar5 = e.getValue();
            if (pp == null || pp.isEmpty() || cesar5 == null) continue;
            ppToOriginal.put(pp, caesarShiftLetters(cesar5, -5));
        }

        String outJson = JsonWriter.writeMapFile("KK1131", "pp_substituicao_valor_original", ppToOriginal);
        writeUtf8(a.outPath, outJson);
    }

    private static String caesarShiftLetters(String s, int shift) {
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                int o = ch - 'A';
                sb.append((char) ('A' + Math.floorMod(o + shift, 26)));
            } else if (ch >= 'a' && ch <= 'z') {
                int o = ch - 'a';
                sb.append((char) ('a' + Math.floorMod(o + shift, 26)));
            } else {
                sb.append(ch);
            }
        }
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
        final boolean help;

        private Args(Path inPath, Path outPath, boolean help) {
            this.inPath = inPath;
            this.outPath = outPath;
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

            if (help) return new Args(Path.of("."), Path.of("."), true);
            if (in == null || out == null) {
                throw new IllegalArgumentException("Argumentos obrigatórios: --in, --out\n\n" + usage());
            }
            return new Args(in, out, false);
        }

        static String usage() {
            return ""
                + "Uso:\n"
                + "  javac desnormalizarMap.java\n"
                + "  java desnormalizarMap --in <map.json> --out <map_cesar5.json>\n";
        }
    }

    /**
     * Parser mínimo para um objeto JSON string->string em "map".
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

    private static final class JsonWriter {
        static String writeMapFile(String kk, String regra, Map<String, String> map) {
            StringBuilder sb = new StringBuilder(map.size() * 32);
            sb.append("{\n");
            sb.append("  \"kk\": ").append(q(kk)).append(",\n");
            sb.append("  \"regra\": ").append(q(regra)).append(",\n");
            sb.append("  \"map\": {\n");

            int i = 0;
            for (Map.Entry<String, String> e : map.entrySet()) {
                sb.append("    ").append(q(e.getKey())).append(": ").append(q(e.getValue()));
                i++;
                sb.append(i < map.size() ? ",\n" : "\n");
            }
            sb.append("  }\n");
            sb.append("}\n");
            return sb.toString();
        }

        private static String q(String s) {
            StringBuilder sb = new StringBuilder(s.length() + 16);
            sb.append('"');
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                switch (c) {
                    case '"': sb.append("\\\""); break;
                    case '\\': sb.append("\\\\"); break;
                    case '\b': sb.append("\\b"); break;
                    case '\f': sb.append("\\f"); break;
                    case '\n': sb.append("\\n"); break;
                    case '\r': sb.append("\\r"); break;
                    case '\t': sb.append("\\t"); break;
                    default:
                        if (c < 0x20) {
                            sb.append(String.format("\\u%04x", (int) c));
                        } else {
                            sb.append(c);
                        }
                }
            }
            sb.append('"');
            return sb.toString();
        }
    }
}

