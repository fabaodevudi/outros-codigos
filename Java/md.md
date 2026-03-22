import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Quebra linhas longas em arquivo de texto (UTF-8) para largura máxima fixa.
 * Útil para BPMN/XML em uma linha só ou linhas gigantes quando "Format Document"
 * não funciona ou o XML está inválido (ex.: script fora de CDATA).
 *
 * <h3>Argumentos (linha de comando)</h3>
 * <ol>
 *   <li>{@code args[0]} — caminho do arquivo de <strong>entrada</strong> (leitura UTF-8).</li>
 *   <li>{@code args[1]} — caminho do arquivo de <strong>saída</strong> (escrita UTF-8; pastas criadas se preciso).</li>
 *   <li>{@code args[2]} — opcional: <strong>largura máxima</strong> em caracteres por linha (inteiro ≥ 8).
 *       Se omitido, usa largura padrão 100.</li>
 * </ol>
 *
 * <h3>Uso</h3>
 * <pre>
 *   javac -encoding UTF-8 BpmnHardWrap.java
 *   java BpmnHardWrap &lt;entrada&gt; &lt;saida&gt; [largura]
 * </pre>
 *
 * <h3>Exemplos</h3>
 * 
 *
 * <h3>IntelliJ — Program arguments (copiar uma linha inteira)</h3>

 * <p><strong>Projeto Documentação no Windows</strong> ({@code novo.bpmn} em {@code src\visioning\}; raiz do print {@code C:\projetos\Documentação\Documentacao}):</p>
 * <pre>
 * "C:\projetos\Documentação\Documentacao\src\visioning\novo.bpmn" "C:\projetos\Documentação\Documentacao\src\visioning\novo.wrapped.bpmn" 100
 * </pre>
 * Run → Edit Configurations → Application → Main class: {@code BpmnHardWrap} → Program arguments: colar a linha desejada.
 * Aspas recomendadas no Windows por causa de acentos no caminho ({@code Documentação}).
 *
 * Lote KK9037
 */
public final class BpmnHardWrap {

    private static final int DEFAULT_WIDTH = 100;

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Uso: java BpmnHardWrap <entrada> <saida> [largura]");
            System.err.println("  largura padrão: " + DEFAULT_WIDTH);
            System.exit(1);
        }
        Path in = Paths.get(args[0]).toAbsolutePath().normalize();
        Path out = Paths.get(args[1]).toAbsolutePath().normalize();
        int width = args.length >= 3 ? parsePositive(args[2], "largura") : DEFAULT_WIDTH;

        if (!Files.isRegularFile(in)) {
            System.err.println("Arquivo não encontrado: " + in);
            System.exit(2);
        }

        Files.createDirectories(out.getParent() != null ? out.getParent() : Paths.get("."));

        long linesIn = 0;
        long linesOut = 0;
        try (BufferedReader reader = Files.newBufferedReader(in, StandardCharsets.UTF_8);
             BufferedWriter writer = Files.newBufferedWriter(out, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                linesIn++;
                List<String> chunks = wrapLine(line, width);
                for (String chunk : chunks) {
                    writer.write(chunk);
                    writer.newLine();
                    linesOut++;
                }
            }
        }
        System.out.println("Entrada: " + in);
        System.out.println("Saída:   " + out);
        System.out.println("Largura: " + width);
        System.out.println("Linhas (lidas / escritas): " + linesIn + " / " + linesOut);
    }

    private static int parsePositive(String s, String name) {
        try {
            int v = Integer.parseInt(s.trim());
            if (v < 8) {
                System.err.println(name + " muito pequena (mínimo sugerido 8).");
                System.exit(1);
            }
            return v;
        } catch (NumberFormatException e) {
            System.err.println(name + " inválida: " + s);
            System.exit(1);
            return 0;
        }
    }

    /**
     * Quebra uma linha em várias, preferindo espaço como ponto de corte.
     * Se não houver espaço antes do limite, corta em {@code width}.
     */
    static List<String> wrapLine(String line, int width) {
        List<String> out = new ArrayList<>();
        if (line == null || line.isEmpty()) {
            out.add("");
            return out;
        }
        String rest = line;
        while (rest.length() > width) {
            int cut = rest.lastIndexOf(' ', width);
            if (cut <= 0) {
                cut = width;
            }
            String part = rest.substring(0, cut);
            out.add(part);
            rest = rest.substring(cut).trim();
        }
        out.add(rest);
        return out;
    }
}
// Lote KK9037
