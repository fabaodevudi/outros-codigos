import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Lista linhas com comprimento maior que WIDTH em formato compacto de tokens.
 *
 * Formato de saida: [Linha]TT[Len]HH[Linha]TT[Len]HH...
 * Quebra de linha quando a linha de saida ultrapassaria ROW_WIDTH (130) chars.
 *
 * <h3>IntelliJ — configuracao "Linhas Longas"</h3>
 * <pre>
 *   Main class : BpmnLongLines
 *   Args       : "C:\...\novo.bpmn" 130
 *   Args+saida : "C:\...\novo.bpmn" 130 "C:\...\linhas_longas.txt"
 * </pre>
 *
 * Lote KK9590
 */
public final class BpmnLongLines {

    private static final int DEFAULT_WIDTH = 130;
    /** Limite de caracteres por linha de saida. */
    private static final int ROW_WIDTH = 130;

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Uso: java BpmnLongLines <arquivo> [largura] [saida.txt]");
            System.exit(1);
        }

        Path file  = Paths.get(args[0]).toAbsolutePath().normalize();
        int  width = args.length >= 2 ? Integer.parseInt(args[1].trim()) : DEFAULT_WIDTH;
        Path out   = args.length >= 3 ? Paths.get(args[2]).toAbsolutePath().normalize() : null;

        if (!Files.isRegularFile(file)) {
            System.err.println("Arquivo nao encontrado: " + file);
            System.exit(2);
        }

        // Coleta todos os tokens: "568TT173", "601TT154", ...
        java.util.List<String> tokens = new java.util.ArrayList<>();
        int count   = 0;
        int lineNum = 0;

        try (BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineNum++;
                if (line.length() > width) {
                    tokens.add(lineNum + "TT" + line.length());
                    count++;
                }
            }
        }

        // Monta linhas respeitando ROW_WIDTH chars
        // separador entre tokens na mesma linha: "HH"
        StringBuilder body = new StringBuilder();
        StringBuilder row  = new StringBuilder();
        for (int i = 0; i < tokens.size(); i++) {
            String token = tokens.get(i);
            String sep   = (row.length() == 0) ? "" : "HH";
            String candidate = sep + token;
            if (row.length() + candidate.length() > ROW_WIDTH && row.length() > 0) {
                // fecha linha atual e abre nova
                body.append(row).append("\n");
                row = new StringBuilder(token);
            } else {
                row.append(candidate);
            }
        }
        if (row.length() > 0) body.append(row).append("\n");

        String header = String.format("Arquivo: %s  Largura: %d  Total: %d linhas > %d chars%n",
                file.getFileName(), width, count, width);
        String footer = String.format("--- fim (%d entradas) ---%n", count);

        System.out.print(header);
        System.out.print(body);
        System.out.print(footer);

        if (out != null) {
            Files.createDirectories(out.getParent() != null ? out.getParent() : Paths.get("."));
            try (BufferedWriter writer = Files.newBufferedWriter(out, StandardCharsets.UTF_8)) {
                writer.write(header);
                writer.write(body.toString());
                writer.write(footer);
            }
            System.out.println("Salvo em: " + out);
        }
    }
}
// Lote KK9590
