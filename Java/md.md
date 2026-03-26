import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Lista linhas com comprimento maior que WIDTH (padrão 130).
 *
 * <h3>Compilar</h3>
 * <pre>
 *   javac -encoding UTF-8 BpmnLongLines.java
 * </pre>
 *
 * <h3>Usar no terminal</h3>
 * <pre>
 *   java BpmnLongLines &lt;arquivo&gt; [largura] [saida.txt]
 * </pre>
 *
 * <h3>IntelliJ — nova configuração "Linhas Longas"</h3>
 * <ol>
 *   <li>Run → Edit Configurations → + → Application</li>
 *   <li>Name: {@code Linhas Longas}</li>
 *   <li>Main class: {@code BpmnLongLines}</li>
 *   <li>Program arguments (exemplo Windows):
 *   <pre>
 * "C:\projetos\Documentação\Documentacao\src\visioning\novo.bpmn" 130
 *   </pre>
 *   Ou com arquivo de saída:
 *   <pre>
 * "C:\projetos\Documentação\Documentacao\src\visioning\novo.bpmn" 130 "C:\projetos\Documentação\Documentacao\linhas_longas.txt"
 *   </pre>
 *   </li>
 *   <li>Working directory: igual aos demais (ex.: {@code C:\projetos\Documentação\Documentacao})</li>
 * </ol>
 *
 * <h3>Saída</h3>
 * <pre>
 *   L   568 (len= 173): &lt;bpmn:serviceTask id="efetiva_cartao"...
 *   ...
 *   Total: 86 linhas com mais de 130 caracteres
 * </pre>
 *
 * Lote KK9590
 */
public final class BpmnLongLines {

    private static final int DEFAULT_WIDTH = 130;

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Uso: java BpmnLongLines <arquivo> [largura] [saida.txt]");
            System.err.println("  largura padrão: " + DEFAULT_WIDTH);
            System.exit(1);
        }

        Path file  = Paths.get(args[0]).toAbsolutePath().normalize();
        int  width = args.length >= 2 ? Integer.parseInt(args[1].trim()) : DEFAULT_WIDTH;
        Path out   = args.length >= 3 ? Paths.get(args[2]).toAbsolutePath().normalize() : null;

        if (!Files.isRegularFile(file)) {
            System.err.println("Arquivo não encontrado: " + file);
            System.exit(2);
        }

        StringBuilder sb = new StringBuilder();
        int count   = 0;
        int lineNum = 0;

        try (BufferedReader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineNum++;
                if (line.length() > width) {
                    count++;
                    String preview = line.length() > 120 ? line.substring(0, 120) + "..." : line;
                    String entry   = String.format("L%6d (len=%4d): %s%n", lineNum, line.length(), preview);
                    System.out.print(entry);
                    sb.append(entry);
                }
            }
        }

        String summary = String.format("%nArquivo : %s%nLargura : %d%nTotal   : %d linhas com mais de %d caracteres%n",
                file, width, count, width);
        System.out.print(summary);
        sb.append(summary);

        if (out != null) {
            Files.createDirectories(out.getParent() != null ? out.getParent() : Paths.get("."));
            try (BufferedWriter writer = Files.newBufferedWriter(out, StandardCharsets.UTF_8)) {
                writer.write(sb.toString());
            }
            System.out.println("Relatório salvo em: " + out);
        }
    }
}
// Lote KK9590
