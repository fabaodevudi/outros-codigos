import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// java MapJsonTransform --in src/fluxo/mapa.transito.json --out src/fluxo/mapa.claro.json
// java MapJsonTransform --obfuscate --in src/fluxo/mapa.claro.json --out src/fluxo/mapa.transito.json
public final class MapJsonTransform {

    private static final String K0 = "w2";
    private static final String K1 = "f4";
    private static final String K2 = "n9";

    private static final Pattern P0 = Pattern.compile("^CC(\\d+)$");
    private static final Pattern P1 = Pattern.compile("^t(\\d+)$");

    private enum SlotKind {
        CC,
        TAG
    }

    public static void main(String[] raw) throws IOException {
        Path in = null;
        Path out = null;
        // Por omissão: trânsito → legível. --obfuscate: legível → layout de trânsito (origem).
        boolean rev = true;
        SlotKind sk = SlotKind.CC;
        for (int i = 0; i < raw.length; i++) {
            switch (raw[i]) {
                case "--in" -> {
                    if (i + 1 >= raw.length) {
                        exitError("\"--in\" requer caminho");
                    }
                    in = Path.of(raw[++i]);
                }
                case "--out" -> {
                    if (i + 1 >= raw.length) {
                        exitError("\"--out\" requer caminho");
                    }
                    out = Path.of(raw[++i]);
                }
                case "--obfuscate" -> rev = false;
                case "--reverse" -> rev = true;
                case "--slot-kind" -> {
                    if (i + 1 >= raw.length) {
                        exitError("\"--slot-kind\" requer cc ou t");
                    }
                    String s = raw[++i].trim().toLowerCase(Locale.ROOT);
                    if ("cc".equals(s)) {
                        sk = SlotKind.CC;
                    } else if ("t".equals(s)) {
                        sk = SlotKind.TAG;
                    } else {
                        exitError("\"--slot-kind\" deve ser cc ou t");
                    }
                }
                default -> exitError("Opção desconhecida");
            }
        }
        if (in == null) {
            exitError("Uso: java MapJsonTransform [--obfuscate] [--slot-kind cc|t] [--reverse] --in <ficheiro.json> [--out <saida.json>]");
        }
        String json = Files.readString(in, StandardCharsets.UTF_8);
        String transformed = rev ? reverseW2Json(json, sk) : transformObfuscate(json);
        if (out != null) {
            Path parent = out.getParent();
            if (parent != null) {
                Files.createDirectories(parent);
            }
            Files.writeString(out, transformed, StandardCharsets.UTF_8);
            System.err.println("Gravado: " + out.toAbsolutePath().normalize());
        } else {
            System.out.print(transformed);
        }
    }

    static String transformObfuscate(String json) {
        int pW = json.indexOf("\"" + K0 + "\"");
        int pE = json.indexOf("\"entries\"");
        int pM = json.indexOf("\"mappings\"");
        boolean useW = pW >= 0 && (pE < 0 || pW <= pE);
        if (useW || pE >= 0) {
            int pos = useW ? pW : pE;
            String slotQ = useW ? ("\"" + K1 + "\"") : "\"token\"";
            String bodyQ = useW ? ("\"" + K2 + "\"") : "\"original\"";
            return transformEntriesBlock(json, pos, slotQ, bodyQ);
        }
        if (pM >= 0) {
            return convertMappingsBlockToW2(json, pM);
        }
        exitError("JSON sem bloco w2/entries nem mappings");
        return "";
    }

    static String reverseW2Json(String json, SlotKind sk) {
        int pW = json.indexOf("\"" + K0 + "\"");
        if (pW < 0) {
            exitError("reverse: JSON sem \"w2\"");
        }
        return rebuildW2DecodedPairs(json, pW, sk);
    }

    private static String rebuildW2DecodedPairs(String json, int arrayNamePos, SlotKind sk) {
        int arrStart = json.indexOf('[', arrayNamePos);
        if (arrStart < 0) {
            exitError("reverse: array sem [");
        }
        final String prefix = "{\n  \"" + K0 + "\": [";
        List<String[]> pairs = new ArrayList<>();
        int pos = arrStart + 1;
        int len = json.length();
        String slotQ = "\"" + K1 + "\"";
        String bodyQ = "\"" + K2 + "\"";
        while (true) {
            pos = skipWhitespace(json, pos);
            if (pos >= len) {
                exitError("reverse: JSON truncado antes de ]");
            }
            if (json.charAt(pos) == ']') {
                break;
            }
            if (json.charAt(pos) != '{') {
                exitError("reverse: esperava { na posição do array w2");
            }
            pos++;
            pos = skipWhitespace(json, pos);
            pos = expectJsonKey(json, pos, slotQ);
            pos = skipWhitespace(json, pos);
            if (pos >= len || json.charAt(pos) != ':') {
                exitError("reverse: esperava : após slot");
            }
            pos++;
            pos = skipWhitespace(json, pos);
            var tr = readJsonStringContent(json, pos);
            String tokEnc = tr.content();
            pos = tr.nextIndex();
            pos = skipWhitespace(json, pos);
            if (pos < len && json.charAt(pos) == ',') {
                pos++;
            }
            pos = skipWhitespace(json, pos);
            pos = expectJsonKey(json, pos, bodyQ);
            pos = skipWhitespace(json, pos);
            if (pos >= len || json.charAt(pos) != ':') {
                exitError("reverse: esperava : após corpo");
            }
            pos++;
            pos = skipWhitespace(json, pos);
            var or = readJsonStringContent(json, pos);
            String bodyEnc = or.content();
            pos = or.nextIndex();
            pos = skipWhitespace(json, pos);
            if (pos >= len || json.charAt(pos) != '}') {
                exitError("reverse: esperava } após par");
            }
            pos++;
            pairs.add(new String[] {tokEnc, bodyEnc});
            pos = skipWhitespace(json, pos);
            if (pos < len && json.charAt(pos) == ',') {
                pos++;
            }
        }
        int tailStart = skipWhitespace(json, pos);
        if (tailStart >= len || json.charAt(tailStart) != ']') {
            exitError("reverse: esperava ]");
        }
        String tailAfter = extractJsonTailAfterW2Array(json, tailStart);

        StringBuilder sb = new StringBuilder(prefix.length() + pairs.size() * 64 + tailAfter.length() + 8);
        sb.append(prefix);
        for (int i = 0; i < pairs.size(); i++) {
            if (i > 0) {
                sb.append(",\n");
            } else {
                sb.append('\n');
            }
            String revTok = decodeTokenFromBase3(pairs.get(i)[0], sk);
            String revBody = ChavePosicaoDesnormalizar.desnormalizar(pairs.get(i)[1], ChavePosicaoDesnormalizar.CHAVE_PADRAO);
            sb.append("    {\"").append(K1).append("\": ");
            sb.append(jsonEscape(revTok));
            sb.append(", \"").append(K2).append("\": ");
            sb.append(jsonEscape(revBody));
            sb.append('}');
        }
        appendW2ArrayCloseAndTail(sb, tailAfter);
        return sb.toString();
    }

    private static String transformEntriesBlock(String json, int arrayNamePos, String slotKeyQuoted, String bodyKeyQuoted) {
        int arrStart = json.indexOf('[', arrayNamePos);
        if (arrStart < 0) {
            exitError("JSON malformado: array sem [");
        }
        final String prefix = "{\n  \"" + K0 + "\": [";
        List<String[]> pairs = new ArrayList<>();
        int pos = arrStart + 1;
        int len = json.length();
        while (true) {
            pos = skipWhitespace(json, pos);
            if (pos >= len) {
                exitError("JSON truncado (entries)");
            }
            if (json.charAt(pos) == ']') {
                break;
            }
            if (json.charAt(pos) != '{') {
                exitError("Esperava { (entries)");
            }
            pos++;
            pos = skipWhitespace(json, pos);
            pos = expectJsonKey(json, pos, slotKeyQuoted);
            pos = skipWhitespace(json, pos);
            if (pos >= len || json.charAt(pos) != ':') {
                exitError("Esperava : após chave slot");
            }
            pos++;
            pos = skipWhitespace(json, pos);
            var tr = readJsonStringContent(json, pos);
            String tok = tr.content();
            pos = tr.nextIndex();
            pos = skipWhitespace(json, pos);
            if (pos < len && json.charAt(pos) == ',') {
                pos++;
            }
            pos = skipWhitespace(json, pos);
            pos = expectJsonKey(json, pos, bodyKeyQuoted);
            pos = skipWhitespace(json, pos);
            if (pos >= len || json.charAt(pos) != ':') {
                exitError("Esperava : após chave body");
            }
            pos++;
            pos = skipWhitespace(json, pos);
            var or = readJsonStringContent(json, pos);
            String orig = or.content();
            pos = or.nextIndex();
            pos = skipWhitespace(json, pos);
            if (pos >= len || json.charAt(pos) != '}') {
                exitError("Esperava } (entries)");
            }
            pos++;
            pairs.add(new String[] {tok, orig});
            pos = skipWhitespace(json, pos);
            if (pos < len && json.charAt(pos) == ',') {
                pos++;
            }
        }
        int tailStart = skipWhitespace(json, pos);
        if (tailStart >= len || json.charAt(tailStart) != ']') {
            exitError("Esperava ] (entries)");
        }
        String tailAfter = extractJsonTailAfterW2Array(json, tailStart);

        StringBuilder sb = new StringBuilder(prefix.length() + pairs.size() * 64 + tailAfter.length() + 8);
        sb.append(prefix);
        for (int i = 0; i < pairs.size(); i++) {
            if (i > 0) {
                sb.append(",\n");
            } else {
                sb.append('\n');
            }
            String newTok = encodeTokenToBase3(pairs.get(i)[0]);
            String newOrig = ChavePosicaoNormalizar.normalizar(pairs.get(i)[1], ChavePosicaoNormalizar.CHAVE_PADRAO);
            sb.append("    {\"").append(K1).append("\": ");
            sb.append(jsonEscape(newTok));
            sb.append(", \"").append(K2).append("\": ");
            sb.append(jsonEscape(newOrig));
            sb.append('}');
        }
        appendW2ArrayCloseAndTail(sb, tailAfter);
        return sb.toString();
    }

    private static String convertMappingsBlockToW2(String json, int arrayNamePos) {
        int arrStart = json.indexOf('[', arrayNamePos);
        if (arrStart < 0) {
            exitError("JSON malformado: mappings sem [");
        }
        final String prefix = "{\n  \"" + K0 + "\": [";
        List<String[]> pairs = new ArrayList<>();
        int pos = arrStart + 1;
        int len = json.length();
        while (true) {
            pos = skipWhitespace(json, pos);
            if (pos >= len) {
                exitError("JSON truncado (mappings)");
            }
            if (json.charAt(pos) == ']') {
                break;
            }
            if (json.charAt(pos) != '{') {
                exitError("Esperava { (mappings)");
            }
            pos++;
            pos = skipWhitespace(json, pos);
            pos = expectJsonKey(json, pos, "\"qname\"");
            pos = skipWhitespace(json, pos);
            if (pos >= len || json.charAt(pos) != ':') {
                exitError("Esperava : após qname");
            }
            pos++;
            pos = skipWhitespace(json, pos);
            var qr = readJsonStringContent(json, pos);
            String qname = qr.content();
            pos = qr.nextIndex();
            pos = skipWhitespace(json, pos);
            if (pos < len && json.charAt(pos) == ',') {
                pos++;
            }
            pos = skipWhitespace(json, pos);
            pos = expectJsonKey(json, pos, "\"token\"");
            pos = skipWhitespace(json, pos);
            if (pos >= len || json.charAt(pos) != ':') {
                exitError("Esperava : após token");
            }
            pos++;
            pos = skipWhitespace(json, pos);
            var tr = readJsonStringContent(json, pos);
            String tok = tr.content();
            pos = tr.nextIndex();
            pos = skipWhitespace(json, pos);
            if (pos >= len || json.charAt(pos) != '}') {
                exitError("Esperava } (mappings)");
            }
            pos++;
            pairs.add(new String[] {tok, qname});
            pos = skipWhitespace(json, pos);
            if (pos < len && json.charAt(pos) == ',') {
                pos++;
            }
        }
        int tailStart = skipWhitespace(json, pos);
        if (tailStart >= len || json.charAt(tailStart) != ']') {
            exitError("Esperava ] (mappings)");
        }
        String tailAfter = extractJsonTailAfterW2Array(json, tailStart);

        StringBuilder sb = new StringBuilder(prefix.length() + pairs.size() * 64 + tailAfter.length() + 8);
        sb.append(prefix);
        for (int i = 0; i < pairs.size(); i++) {
            if (i > 0) {
                sb.append(",\n");
            } else {
                sb.append('\n');
            }
            String newTok = encodeTokenToBase3(pairs.get(i)[0]);
            String newQ = ChavePosicaoNormalizar.normalizar(pairs.get(i)[1], ChavePosicaoNormalizar.CHAVE_PADRAO);
            sb.append("    {\"").append(K1).append("\": ");
            sb.append(jsonEscape(newTok));
            sb.append(", \"").append(K2).append("\": ");
            sb.append(jsonEscape(newQ));
            sb.append('}');
        }
        appendW2ArrayCloseAndTail(sb, tailAfter);
        return sb.toString();
    }

    static String encodeTokenToBase3(String token) {
        if (token == null) {
            return "";
        }
        Matcher cc = P0.matcher(token);
        if (cc.matches()) {
            int n = Integer.parseInt(cc.group(1), 10);
            if (n < 0) {
                return token;
            }
            return Integer.toString(n, 3);
        }
        Matcher tt = P1.matcher(token);
        if (tt.matches()) {
            int n = Integer.parseInt(tt.group(1), 10);
            if (n < 0) {
                return token;
            }
            return Integer.toString(n, 3);
        }
        return token;
    }

    static String decodeTokenFromBase3(String encoded, SlotKind sk) {
        if (encoded == null) {
            return "";
        }
        String s = encoded.trim();
        if (s.isEmpty()) {
            return s;
        }
        if (P0.matcher(s).matches() || P1.matcher(s).matches()) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '2') {
                return s;
            }
        }
        try {
            int n = Integer.parseInt(s, 3);
            if (n < 0) {
                return s;
            }
            if (sk == SlotKind.TAG) {
                return "t" + n;
            }
            if (n <= 9999) {
                return String.format(Locale.ROOT, "CC%04d", n);
            }
            return "CC" + n;
        } catch (NumberFormatException e) {
            return s;
        }
    }

    private static int skipWhitespace(String s, int i) {
        while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
            i++;
        }
        return i;
    }

    private static String extractJsonTailAfterW2Array(String json, int arrayClosingBracketIndex) {
        int p = skipWhitespace(json, arrayClosingBracketIndex + 1);
        if (p >= json.length()) {
            return "";
        }
        if (json.charAt(p) == '}') {
            return "";
        }
        int end = json.lastIndexOf('}');
        if (end <= p) {
            return "";
        }
        return json.substring(p, end);
    }

    private static void appendW2ArrayCloseAndTail(StringBuilder sb, String tail) {
        sb.append("\n  ]");
        if (tail.isEmpty()) {
            sb.append("\n}");
        } else {
            sb.append(tail);
            sb.append("}");
        }
    }

    private static int expectJsonKey(String json, int pos, String key) {
        if (!json.regionMatches(pos, key, 0, key.length())) {
            exitError("Chave JSON inesperada");
        }
        return pos + key.length();
    }

    private record JsonStringRead(String content, int nextIndex) {
    }

    private static JsonStringRead readJsonStringContent(String json, int startQuote) {
        if (startQuote >= json.length() || json.charAt(startQuote) != '"') {
            exitError("Esperava abertura de string JSON");
        }
        StringBuilder sb = new StringBuilder();
        int i = startQuote + 1;
        while (i < json.length()) {
            char c = json.charAt(i);
            if (c == '"') {
                return new JsonStringRead(sb.toString(), i + 1);
            }
            if (c == '\\' && i + 1 < json.length()) {
                char e = json.charAt(i + 1);
                switch (e) {
                    case '"', '\\', '/' -> sb.append(e);
                    case 'b' -> sb.append('\b');
                    case 'f' -> sb.append('\f');
                    case 'n' -> sb.append('\n');
                    case 'r' -> sb.append('\r');
                    case 't' -> sb.append('\t');
                    case 'u' -> {
                        if (i + 6 > json.length()) {
                            exitError("Sequência \\u incompleta");
                        }
                        String hex = json.substring(i + 2, i + 6);
                        sb.append((char) Integer.parseInt(hex, 16));
                        i += 6;
                        continue;
                    }
                    default -> sb.append(e);
                }
                i += 2;
                continue;
            }
            sb.append(c);
            i++;
        }
        exitError("String JSON sem fecho");
        return new JsonStringRead("", i);
    }

    private static String jsonEscape(String s) {
        StringBuilder sb = new StringBuilder(s.length() + 8);
        sb.append('"');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '\\' -> sb.append("\\\\");
                case '"' -> sb.append("\\\"");
                case '\n' -> sb.append("\\n");
                case '\r' -> sb.append("\\r");
                case '\t' -> sb.append("\\t");
                case '\b' -> sb.append("\\b");
                case '\f' -> sb.append("\\f");
                default -> {
                    if (c < 0x20) {
                        sb.append(String.format(Locale.ROOT, "\\u%04x", (int) c));
                    } else {
                        sb.append(c);
                    }
                }
            }
        }
        sb.append('"');
        return sb.toString();
    }

    private static void exitError(String message) {
        System.err.println(message);
        System.exit(2);
    }

    public static String pipelineReverseUnifiedMap(String json, String slotKindCcOrT) {
        SlotKind sk = "t".equalsIgnoreCase(slotKindCcOrT) ? SlotKind.TAG : SlotKind.CC;
        return reverseW2Json(json, sk);
    }

    public static String pipelineObfuscateUnifiedMap(String json) {
        return transformObfuscate(json);
    }

    /*
     * Documento DD8035 | Lote KK1128 [2026-04-02 20:00:00] | DD8001: MySQL ddd_registros (lotes, lote_arquivos) ·
     * DD0001 Catálogo: workflow/arquitetura/registros/REGISTRO_DOCUMENTOS.md
     */
}

/**
 * Deslocamento variável por posição: shift(i) = (chave[i % chave.length] + i) % 26.
 * Co-localizado com {@link MapJsonTransform} para embalagem mínima no PC de destino.
 */
final class ChavePosicaoNormalizar {

    /** Chave padrão pedida: 85641206454369454556. */
    public static final int[] CHAVE_PADRAO = parseDigitKey("85641206454369454556");

    private ChavePosicaoNormalizar() {
    }

    public static int[] parseDigitKey(String digitos) {
        Objects.requireNonNull(digitos, "digitos");
        if (digitos.isEmpty()) {
            throw new IllegalArgumentException("chave vazia");
        }
        int[] k = new int[digitos.length()];
        for (int i = 0; i < digitos.length(); i++) {
            char c = digitos.charAt(i);
            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("apenas dígitos 0-9: pos " + i);
            }
            k[i] = c - '0';
        }
        return k;
    }

    static int shiftForIndex(int index, int[] chave) {
        return (chave[index % chave.length] + index) % 26;
    }

    public static String normalizar(String texto, int[] chave) {
        Objects.requireNonNull(texto, "texto");
        Objects.requireNonNull(chave, "chave");
        if (chave.length == 0) {
            throw new IllegalArgumentException("chave.length == 0");
        }
        StringBuilder sb = new StringBuilder(texto.length());
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            int sh = shiftForIndex(i, chave);
            if (c >= 'A' && c <= 'Z') {
                sb.append((char) ('A' + (c - 'A' + sh) % 26));
            } else if (c >= 'a' && c <= 'z') {
                sb.append((char) ('a' + (c - 'a' + sh) % 26));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

/**
 * Reverte a normalização de deslocamento por posição.
 */
final class ChavePosicaoDesnormalizar {

    /** Chave padrão pedida: 85641206454369454556. */
    public static final int[] CHAVE_PADRAO = ChavePosicaoNormalizar.CHAVE_PADRAO;

    private ChavePosicaoDesnormalizar() {
    }

    public static String desnormalizar(String texto, int[] chave) {
        Objects.requireNonNull(texto, "texto");
        Objects.requireNonNull(chave, "chave");
        if (chave.length == 0) {
            throw new IllegalArgumentException("chave.length == 0");
        }
        StringBuilder sb = new StringBuilder(texto.length());
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            int sh = ChavePosicaoNormalizar.shiftForIndex(i, chave);
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
}

/*
 * Documento DD8035 | Lote KK1128 [2026-04-02 20:00:00] | DD8001: MySQL ddd_registros (lotes, lote_arquivos) ·
 * DD0001 Catálogo: workflow/arquitetura/registros/REGISTRO_DOCUMENTOS.md
 * — ChavePosicao* co-localizados neste ficheiro (pacote mínimo PC destino, DD8036).
 */
