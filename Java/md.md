import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Analisa quantos pedacos cada linha produziria em BpmnHardWrap.
 *
 * <p>Identifica linhas que geram 3+ pedacos (causa do erro no unwrap ingênuo)
 * e computa a contra-prova:
 * <pre>
 *   total_linhas_original + Σ(pedacos - 1) == total_linhas_wrapped
 * </pre>
 *
 * <h3>IntelliJ — configuracao "WrapStats"</h3>
 * <pre>
 *   Main class : BpmnWrapStats
 *   Args       : "C:\projetos\...\novo.bpmn" 130
 * </pre>
 *
 * Lote KK9590
 */
public final class BpmnWrapStats {

    private static final int DEFAULT_WIDTH = 130;

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.err.println("Uso: java BpmnWrapStats <arquivo> [largura]");
            System.exit(1);
        }
        Path in = Paths.get(args[0]).toAbsolutePath().normalize();
        int width = args.length >= 2 ? Integer.parseInt(args[1].trim()) : DEFAULT_WIDTH;

        if (!Files.isRegularFile(in)) {
            System.err.println("Arquivo nao encontrado: " + in);
            System.exit(2);
        }

        long totalOriginal = 0;
        long totalExtra    = 0;
        long linhas2       = 0; // linhas que geram exatamente 2 pecas
        long linhas3mais   = 0; // linhas que geram 3+ pecas

        // Guarda detalhes de linhas com 3+ pecas: [numero, len, pecas]
        List<long[]> detalhes3mais = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(in, StandardCharsets.UTF_8)) {
            String line;
            long lineNum = 0;
            while ((line = reader.readLine()) != null) {
                lineNum++;
                totalOriginal++;
                int pieces = countPieces(line, width);
                int extra  = pieces - 1;
                totalExtra += extra;
                if (pieces == 2) linhas2++;
                if (pieces >= 3) {
                    linhas3mais++;
                    detalhes3mais.add(new long[]{lineNum, line.length(), pieces});
                }
            }
        }

        long totalWrapped = totalOriginal + totalExtra;

        System.out.println("=== BpmnWrapStats ===");
        System.out.println("Arquivo : " + in.getFileName());
        System.out.println("Largura : " + width);
        System.out.println();
        System.out.println("Linhas originais           : " + totalOriginal);
        System.out.println("Linhas sem wrap (1 peca)   : " + (totalOriginal - linhas2 - linhas3mais));
        System.out.println("Linhas com 2 pecas         : " + linhas2);
        System.out.println("Linhas com 3+ pecas        : " + linhas3mais);
        System.out.println();
        System.out.println("Extra total (Σ pecas-1)    : " + totalExtra);
        System.out.println("Linhas wrapped (orig+extra): " + totalWrapped);
        System.out.println();
        System.out.println("--- Contra-prova ---");
        System.out.println("Se este arquivo eh o original e voce sabe quantas linhas");
        System.out.println("o wrapped tem, verifique: wrapped_real == " + totalWrapped + "?");
        System.out.println();

        if (!detalhes3mais.isEmpty()) {
            System.out.println("--- Linhas com 3+ pecas (" + linhas3mais + " entradas) ---");
            System.out.println("Formato: [LinhaNum]LL[Len]PP[Pecas]");
            // Saida compacta: tokens separados por HH, max 130 chars por linha de saida
            final int ROW_WIDTH = 130;
            StringBuilder row = new StringBuilder();
            for (long[] d : detalhes3mais) {
                String token = d[0] + "LL" + d[1] + "PP" + d[2];
                String sep   = (row.length() == 0) ? "" : "HH";
                String candidate = sep + token;
                if (row.length() + candidate.length() > ROW_WIDTH && row.length() > 0) {
                    System.out.println(row);
                    row = new StringBuilder(token);
                } else {
                    row.append(candidate);
                }
            }
            if (row.length() > 0) System.out.println(row);
        }
    }

    /**
     * Conta quantos pedacos wrapLine produziria — mesma logica de BpmnHardWrap.wrapLine.
     */
    static int countPieces(String line, int width) {
        if (line == null || line.isEmpty()) return 1;
        int pieces = 0;
        String rest = line;
        while (rest.length() > width) {
            int cut = rest.lastIndexOf(' ', width);
            if (cut <= 0) cut = width;
            rest = rest.substring(cut).trim();
            pieces++;
        }
        return pieces + 1;
    }
}
// Lote KK9590
