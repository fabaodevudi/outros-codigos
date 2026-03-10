import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Cifrador/decifrador de documentação baseado em glossario.json.
 *
 * Os ARQUIVOS ORIGINAIS são SOMENTE LEITURA — nunca são modificados.
 * Saídas vão sempre para subpastas isoladas:
 *   --forward → <pasta>/genericos/   (original → genérico)
 *   --reverse → <pasta>/out/         (genérico → original)
 *   --check   → ambos, depois compara e reporta diff
 *
 * Uso:
 *   java Cifrar --forward [--json glossario.json] [pasta ...]
 *   java Cifrar --reverse [--json glossario.json] [pasta ...]
 *   java Cifrar --check   [--json glossario.json] [pasta ...]
 *
 * Se nenhuma <pasta> for passada, varre toda a árvore a partir do diretório atual,
 * ignorando: node_modules, genericos, out, glosario, .git, replace
 */
public class Cifrar {

    // ── Constantes ────────────────────────────────────────────────────────────
    private static final String SUFIXO_GENERICO  = "_GENERICO.md";
    private static final String SUFIXO_LISTA     = "_LISTA_TERMOS.md";
    private static final String DIR_GENERICOS    = "genericos";
    private static final String DIR_OUT          = "out";
    private static final String JSON_FILE        = "glossario.json";
    private static final String SEP              = "─".repeat(65);

    /** Pastas ignoradas na varredura automática */
    private static final Set<String> SKIP_DIRS = new HashSet<>(Arrays.asList(
        "node_modules", "genericos", "out", "glosario", ".git", "replace"
    ));

    /** Arquivos que contêm os próprios termos como dados — nunca cifrar */
    private static final Set<String> ALWAYS_EXCLUDE = new HashSet<>(Arrays.asList(
        "GLOSSARIO_TERMOS_NORMALIZADOS.md"
    ));

    // ── main ─────────────────────────────────────────────────────────────────
    public static void main(String[] args) throws IOException {

        String       mode    = null;
        String       jsonArg = null;
        List<String> targets = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "--forward": case "-f": mode = "forward"; break;
                case "--reverse": case "-r": mode = "reverse"; break;
                case "--check":   case "-c": mode = "check";   break;
                case "--json":
                    if (i + 1 < args.length) jsonArg = args[++i];
                    break;
                default:
                    targets.add(args[i]);
            }
        }

        if (mode == null) {
            System.err.println("Uso: java Cifrar --forward|--reverse|--check [--json glossario.json] [pasta ...]");
            System.err.println("  --forward  Gera genéricos em <pasta>/genericos/  (lê originais)");
            System.err.println("  --reverse  Restaura originais em <pasta>/out/    (lê genericos/)");
            System.err.println("  --check    forward + reverse + compara diff");
            System.exit(1);
        }

        // ── Localiza glossario.json ──────────────────────────────────────────
        Path cwd      = Paths.get("").toAbsolutePath();
        Path jsonPath = (jsonArg != null)
            ? Paths.get(jsonArg).toAbsolutePath()
            : findJson(cwd);

        if (jsonPath == null || !Files.isRegularFile(jsonPath)) {
            System.err.println("glossario.json não encontrado. Passe --json <caminho>.");
            System.exit(1);
        }

        Map<String, String> glossario = parseJson(jsonPath);
        System.out.println("Glossário : " + jsonPath);
        System.out.printf ("Termos    : %d%n", glossario.size());
        System.out.printf ("Modo      : --%s%n%n", mode);

        // ── Resolve pastas alvo ──────────────────────────────────────────────
        List<Path> sourceDirs;
        if (targets.isEmpty()) {
            System.out.println("Varredura automática a partir de: " + cwd);
            // reverse: varre por pastas que têm genericos/ (não precisa de originais)
            sourceDirs = "reverse".equals(mode)
                ? findDirsWithGenericos(cwd)
                : findSourceDirs(cwd);
        } else {
            sourceDirs = new ArrayList<>();
            for (String t : targets)
                sourceDirs.add(Paths.get(t).toAbsolutePath().normalize());
        }

        System.out.println(SEP);

        int totalOk = 0, totalDiff = 0, totalDirs = 0;

        for (Path src : sourceDirs) {
            if (!Files.isDirectory(src)) continue;

            List<Path> originals = getOriginals(src);
            if (originals.isEmpty()) continue;

            Path   genDir = src.resolve(DIR_GENERICOS);
            Path   outDir = src.resolve(DIR_OUT);
            String rel    = cwd.relativize(src).toString();
            if (rel.isEmpty()) rel = ".";

            switch (mode) {

                case "forward":
                    Files.createDirectories(genDir);
                    cifrar(originals, genDir, glossario);
                    System.out.printf("  ✓ %-58s → genericos/ (%d arquivo(s))%n",
                        truncate(rel, 58), originals.size());
                    totalDirs++;
                    break;

                case "reverse":
                    if (!Files.isDirectory(genDir) || isDirEmpty(genDir)) {
                        System.out.printf("  — %-58s (genericos/ vazia — rode --forward primeiro)%n",
                            truncate(rel, 58));
                        continue;
                    }
                    Files.createDirectories(outDir);
                    decifrar(genDir, outDir, glossario);
                    long nGen = Files.list(genDir)
                        .filter(p -> p.getFileName().toString().endsWith(SUFIXO_GENERICO))
                        .count();
                    System.out.printf("  ✓ %-58s → out/ (%d arquivo(s))%n",
                        truncate(rel, 58), nGen);
                    totalDirs++;
                    break;

                case "check":
                    Files.createDirectories(genDir);
                    Files.createDirectories(outDir);
                    cifrar(originals, genDir, glossario);
                    decifrar(genDir, outDir, glossario);
                    int[] res = checkDiff(originals, outDir);
                    totalOk   += res[0];
                    totalDiff += res[1];
                    totalDirs++;
                    if (res[1] == 0) {
                        System.out.printf("  ✓ %-58s OK=%d  DIFF=0%n",
                            truncate(rel, 58), res[0]);
                    } else {
                        System.out.printf("  ✗ %-58s OK=%d  DIFF=%d%n",
                            truncate(rel, 58), res[0], res[1]);
                        for (Path orig : originals) {
                            Path restored = outDir.resolve(orig.getFileName());
                            if (Files.exists(restored) && !filesEqual(orig, restored))
                                System.out.println("      ↳ DIFF: " + orig.getFileName());
                        }
                    }
                    break;
            }
        }

        System.out.println(SEP);
        switch (mode) {
            case "forward":
                System.out.printf("Cifrado   : %d pasta(s) processada(s)%n", totalDirs);
                break;
            case "reverse":
                System.out.printf("Decifrado : %d pasta(s) processada(s)%n", totalDirs);
                break;
            case "check":
                System.out.printf("Total     : %d pasta(s) | OK=%d  DIFF=%d%n",
                    totalDirs, totalOk, totalDiff);
                System.out.println(totalDiff == 0
                    ? "✓ Round-trip perfeito — nenhum arquivo original foi modificado."
                    : "✗ Diffs detectados — verifique acima.");
                break;
        }
    }

    // ── Cifrar: lê originais, escreve em genDir ───────────────────────────────
    private static void cifrar(List<Path> originals, Path genDir,
                                Map<String, String> glossario) throws IOException {
        List<Map.Entry<String, String>> pares = sortedByKeyLengthDesc(glossario);
        for (Path orig : originals) {
            String nome    = orig.getFileName().toString();
            String base    = nome.substring(0, nome.length() - ".md".length());
            Path   destino = genDir.resolve(base + SUFIXO_GENERICO);
            // LEITURA do original (nunca gravamos nele)
            String conteudo = Files.readString(orig, StandardCharsets.UTF_8);
            conteudo = applyTwoPhase(conteudo, pares);
            Files.writeString(destino, conteudo, StandardCharsets.UTF_8);
        }
    }

    // ── Decifrar: lê de genDir, escreve em outDir ────────────────────────────
    private static void decifrar(Path genDir, Path outDir,
                                  Map<String, String> glossario) throws IOException {
        Map<String, String> invertido = new LinkedHashMap<>();
        for (Map.Entry<String, String> e : glossario.entrySet())
            invertido.put(e.getValue(), e.getKey());

        List<Map.Entry<String, String>> pares = sortedByKeyLengthDesc(invertido);

        List<Path> genericos = Files.list(genDir)
            .filter(p -> p.getFileName().toString().endsWith(SUFIXO_GENERICO))
            .sorted()
            .collect(Collectors.toList());

        for (Path gen : genericos) {
            String nome    = gen.getFileName().toString();
            String base    = nome.substring(0, nome.length() - SUFIXO_GENERICO.length());
            Path   destino = outDir.resolve(base + ".md");
            String conteudo = Files.readString(gen, StandardCharsets.UTF_8);
            conteudo = applyTwoPhase(conteudo, pares);
            Files.writeString(destino, conteudo, StandardCharsets.UTF_8);
        }
    }

    // ── Compara originais com restaurados ─────────────────────────────────────
    private static int[] checkDiff(List<Path> originals, Path outDir) throws IOException {
        int ok = 0, fail = 0;
        for (Path orig : originals) {
            Path restored = outDir.resolve(orig.getFileName());
            if (!Files.exists(restored)) continue;
            if (filesEqual(orig, restored)) ok++;
            else fail++;
        }
        return new int[]{ok, fail};
    }

    private static boolean filesEqual(Path a, Path b) throws IOException {
        if (Files.size(a) != Files.size(b)) return false;
        byte[] ba = Files.readAllBytes(a);
        byte[] bb = Files.readAllBytes(b);
        return Arrays.equals(ba, bb);
    }

    // ── Listar arquivos originais elegíveis em uma pasta ─────────────────────
    private static List<Path> getOriginals(Path dir) throws IOException {
        return Files.list(dir)
            .filter(p -> {
                String n = p.getFileName().toString();
                return n.endsWith(".md")
                    && !n.endsWith(SUFIXO_GENERICO)
                    && !n.endsWith(SUFIXO_LISTA)
                    && !ALWAYS_EXCLUDE.contains(n)
                    && Files.isRegularFile(p);
            })
            .sorted()
            .collect(Collectors.toList());
    }

    // ── Varredura de pastas que têm genericos/ (para --reverse sem originais) ──
    private static List<Path> findDirsWithGenericos(Path root) throws IOException {
        List<Path> result = new ArrayList<>();
        Files.walkFileTree(root, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes a) {
                String name = dir.getFileName() == null ? "" : dir.getFileName().toString();
                if (SKIP_DIRS.contains(name)) return FileVisitResult.SKIP_SUBTREE;
                Path gen = dir.resolve(DIR_GENERICOS);
                if (Files.isDirectory(gen)) {
                    try (DirectoryStream<Path> ds = Files.newDirectoryStream(gen, "*" + SUFIXO_GENERICO)) {
                        if (ds.iterator().hasNext()) result.add(dir);
                    } catch (IOException e) { /* ignora */ }
                }
                return FileVisitResult.CONTINUE;
            }
        });
        result.sort(Comparator.naturalOrder());
        return result;
    }

    // ── Varredura automática de pastas com .md ────────────────────────────────
    private static List<Path> findSourceDirs(Path root) throws IOException {
        Set<Path> dirs = new TreeSet<>();
        Files.walkFileTree(root, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                String name = dir.getFileName() != null ? dir.getFileName().toString() : "";
                if (SKIP_DIRS.contains(name))
                    return FileVisitResult.SKIP_SUBTREE;
                return FileVisitResult.CONTINUE;
            }
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                String n = file.getFileName().toString();
                if (n.endsWith(".md")
                    && !n.endsWith(SUFIXO_GENERICO)
                    && !n.endsWith(SUFIXO_LISTA)
                    && !ALWAYS_EXCLUDE.contains(n)) {
                    dirs.add(file.getParent());
                }
                return FileVisitResult.CONTINUE;
            }
        });
        return new ArrayList<>(dirs);
    }

    // ── Localiza glossario.json subindo na árvore ─────────────────────────────
    private static Path findJson(Path start) {
        List<String> candidates = Arrays.asList(
            "documentacao/visioning/arquitetura/glosario/" + JSON_FILE, // estrutura DDD completa
            "arquitetura/glosario/" + JSON_FILE,                         // estrutura Itaú (Projetos/)
            "glosario/" + JSON_FILE,                                     // raiz com glosario/
            JSON_FILE                                                     // raiz direta
        );
        for (String c : candidates) {
            Path p = start.resolve(c);
            if (Files.isRegularFile(p)) return p;
        }
        return null;
    }

    private static boolean isDirEmpty(Path dir) throws IOException {
        try (var s = Files.list(dir)) { return s.findFirst().isEmpty(); }
    }

    private static String truncate(String s, int max) {
        return s.length() <= max ? s : "..." + s.substring(s.length() - (max - 3));
    }

    // ── Substituição em duas fases com fronteira de palavra ───────────────────
    private static String applyTwoPhase(String content,
                                         List<Map.Entry<String, String>> pairs) {
        String[] placeholders = new String[pairs.size()];
        for (int i = 0; i < pairs.size(); i++) {
            String key = pairs.get(i).getKey();
            if (!key.isEmpty() && content.contains(key)) {
                placeholders[i] = "__RP_" + i + "__";
                content = replaceWordBounded(content, key, placeholders[i]);
            }
        }
        for (int i = 0; i < pairs.size(); i++) {
            if (placeholders[i] != null)
                content = content.replace(placeholders[i], pairs.get(i).getValue());
        }
        return content;
    }

    /**
     * Substitui {@code key} por {@code repl} respeitando fronteira de palavra:
     * se a chave começa/termina com letra/dígito/_, não casa dentro de outra palavra.
     * Exemplo: "AD" não casa dentro de "ADR".
     */
    private static String replaceWordBounded(String text, String key, String repl) {
        if (key.isEmpty()) return text;
        boolean checkLeft  = isWordChar(key.charAt(0));
        boolean checkRight = isWordChar(key.charAt(key.length() - 1));
        if (!checkLeft && !checkRight) return text.replace(key, repl);

        StringBuilder sb   = new StringBuilder(text.length());
        int           from = 0, idx;
        while ((idx = text.indexOf(key, from)) >= 0) {
            int     end      = idx + key.length();
            boolean leftOk   = !checkLeft  || idx == 0             || !isWordChar(text.charAt(idx - 1));
            boolean rightOk  = !checkRight || end == text.length() || !isWordChar(text.charAt(end));
            if (leftOk && rightOk) {
                sb.append(text, from, idx).append(repl);
                from = end;
            } else {
                sb.append(text, from, idx + 1);
                from = idx + 1;
            }
        }
        return sb.append(text, from, text.length()).toString();
    }

    private static boolean isWordChar(char c) {
        return Character.isLetterOrDigit(c) || c == '_';
    }

    private static List<Map.Entry<String, String>> sortedByKeyLengthDesc(Map<String, String> map) {
        List<Map.Entry<String, String>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> Integer.compare(b.getKey().length(), a.getKey().length()));
        return list;
    }

    // ── Parser JSON minimalista ────────────────────────────────────────────────
    static Map<String, String> parseJson(Path path) throws IOException {
        String            json = Files.readString(path, StandardCharsets.UTF_8);
        Map<String, String> map = new LinkedHashMap<>();
        int i = 0;
        while (i < json.length()) {
            int ks = json.indexOf('"', i);       if (ks < 0) break; ks++;
            int ke = findClosingQuote(json, ks); if (ke < 0) break;
            String key = unescape(json.substring(ks, ke));
            int colon = json.indexOf(':', ke + 1); if (colon < 0) break;
            int vs = json.indexOf('"', colon + 1); if (vs < 0) break; vs++;
            int ve = findClosingQuote(json, vs);   if (ve < 0) break;
            String val = unescape(json.substring(vs, ve));
            if (!key.isEmpty()) map.put(key, val);
            i = ve + 1;
        }
        return map;
    }

    private static int findClosingQuote(String s, int from) {
        for (int i = from; i < s.length(); i++)
            if (s.charAt(i) == '"' && (i == 0 || s.charAt(i - 1) != '\\')) return i;
        return -1;
    }

    private static String unescape(String s) {
        return s.replace("\\\"", "\"").replace("\\\\", "\\")
                .replace("\\/", "/").replace("\\n", "\n")
                .replace("\\r", "\r").replace("\\t", "\t");
    }
}
