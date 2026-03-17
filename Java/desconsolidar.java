import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Desconsolida um arquivo CONSOLIDADO_GENERICOS.md em vários *_GENERICO.md.
 *
 * Formato esperado no consolidado:
 *
 * [CAMINHO/ARQUIVO_GENERICO.md]
 * XXXXX
 * (conteúdo do arquivo)
 * $$$$$
 *
 * Cada bloco gera um arquivo em GENERICOS_CONSOLIDADOS, preservando o caminho relativo.
 *
 * Uso:
 *   javac -encoding UTF-8 DesconsolidarGenericosMd.java
 *   java DesconsolidarGenericosMd /caminho/CONSOLIDADO_GENERICOS.md
 *   java DesconsolidarGenericosMd /caminho/CONSOLIDADO_GENERICOS.md /caminho/saida
 */
public class DesconsolidarGenericosMd {

    private static final String SEP_HEADER = "XXXXX";
    private static final String SEP_FOOTER = "$$$$$";
    private static final String DEFAULT_OUTPUT_DIR_NAME = "GENERICOS_CONSOLIDADOS";

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("Uso: java DesconsolidarGenericosMd <CONSOLIDADO_GENERICOS.md> [pasta_saida]");
            System.exit(1);
        }

        Path input = Paths.get(args[0]).toAbsolutePath().normalize();
        if (!Files.isRegularFile(input)) {
            System.err.println("Arquivo não encontrado: " + input);
            System.exit(1);
        }

        Path outRoot;
        if (args.length >= 2) {
            outRoot = Paths.get(args[1]).toAbsolutePath().normalize();
        } else {
            outRoot = input.getParent().resolve(DEFAULT_OUTPUT_DIR_NAME).normalize();
        }
        Files.createDirectories(outRoot);

        int count = 0;

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(input.toFile()), StandardCharsets.UTF_8))) {

            String line;
            String currentName = null;
            StringBuilder currentContent = null;
            boolean inBlock = false;

            while ((line = reader.readLine()) != null) {
                // Início de bloco: [NOME]
                if (!inBlock && line.startsWith("[") && line.endsWith("]")) {
                    currentName = line.substring(1, line.length() - 1).trim();
                    if (currentName.isEmpty()) {
                        currentName = null;
                        continue;
                    }
                    // Espera próxima linha ser XXXXX
                    String next = reader.readLine();
                    if (next == null || !SEP_HEADER.equals(next.trim())) {
                        // Formato inesperado; ignora este bloco
                        currentName = null;
                        continue;
                    }
                    currentContent = new StringBuilder();
                    inBlock = true;
                    continue;
                }

                if (inBlock) {
                    if (SEP_FOOTER.equals(line.trim())) {
                        // Finaliza bloco atual
                        writeBlock(outRoot, currentName, currentContent.toString());
                        count++;
                        inBlock = false;
                        currentName = null;
                        currentContent = null;
                    } else {
                        currentContent.append(line).append(System.lineSeparator());
                    }
                }
            }

            // Se arquivo terminar sem $$$$$, ainda grava último bloco
            if (inBlock && currentName != null && currentContent != null) {
                writeBlock(outRoot, currentName, currentContent.toString());
                count++;
            }
        }

        System.out.println("--- Resumo ---");
        System.out.println("Arquivo consolidado: " + input);
        System.out.println("Pasta de saída:      " + outRoot);
        System.out.println("Arquivos gerados:    " + count);
    }

    private static void writeBlock(Path outRoot, String name, String content) throws IOException {
        // Normaliza separadores de diretório para o sistema atual
        String safe = name.replace("\\", File.separator).replace("/", File.separator);

        // Remove o sufixo _GENERICO dos arquivos de saída
        int sepIdx = safe.lastIndexOf(File.separatorChar);
        String dirPart = sepIdx >= 0 ? safe.substring(0, sepIdx) : "";
        String filePart = sepIdx >= 0 ? safe.substring(sepIdx + 1) : safe;

        if (filePart.endsWith("_GENERICO.md")) {
            filePart = filePart.substring(0, filePart.length() - "_GENERICO.md".length()) + ".md";
        }

        String normalizedPath = dirPart.isEmpty()
                ? filePart
                : dirPart + File.separator + filePart;

        Path outFile = outRoot.resolve(normalizedPath).normalize();
        Files.createDirectories(outFile.getParent());
        Files.write(outFile, content.getBytes(StandardCharsets.UTF_8));
        System.out.println(outRoot.getParent().relativize(outFile));
    }
}
