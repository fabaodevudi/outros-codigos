import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Verifica quais IDs de pares ambiguos existem em um arquivo BPMN de producao.
 * Saida: numero | PROC_ID [SIM/NAO] | DIAG_ID [SIM/NAO]
 *
 * <h3>IntelliJ — configuracao "BpmnCheckIds"</h3>
 * <pre>
 *   Main class : BpmnCheckIds
 *   Args       : "C:\...\arquitetura\novo.bpmn"
 * </pre>
 *
 * Linha de comando Windows:
 *   javac BpmnCheckIds.java && java BpmnCheckIds "C:\...\arquitetura\novo.bpmn"
 */
public class BpmnCheckIds {

    // Pares: { PROC_ID, DIAG_ID, descricao }
    // Buscar PROC_ID no arquivo de producao → se SIM, PROC e o correto
    private static final String[][] PAIRS = {
        // Grupo 1 — Confirmacao manual (15 pares)
        { "Flow_0uxkc2u",              "Flow_00xkc2u",              "u<->0" },
        { "Flow_0d1qp2b",              "Flow_0diqp2b",              "1<->i" },
        { "Flow_Qouewjp",              "Flow_0ouewjp",              "Q<->0" },
        { "Flow_0vquw9g",              "Flow_0vqvw9g",              "u<->v" },
        { "Flow_1eqyqyc",              "Flow_1eqyqvc",              "y<->v" },
        { "Flow_1kayhsy",              "Flow_1kayshy",              "swap s/h" },
        { "Flow_1kh091d",              "Flow_1khe91d",              "0<->e" },
        { "Flow_1t7jlde",              "Flow_1t7jld0",              "e<->0" },
        { "Flow_1yqhhi2",              "Flow_1yghhi2",              "q<->g" },
        { "Gateway_0j49uqe",           "Gateway_0j49uge",           "q<->g" },
        { "Gateway_0wh3h2v",           "Gateway_0vhh3h2v",          "varios" },
        { "Gateway_11wr3zw",           "Gateway_liwr3zw",           "1<->l,1<->i" },
        { "TextAnnotation_04ybeux",    "TextAnnotation_04yb0ux",    "e<->0" },
        { "proposta_falha_analise",    "proposta_failha_analise",   "extra i" },
        { "Proposta_recusada_docm",    "proposta_recusada_docm",    "P<->p" },
        // Grupo 2 — Automaticos l<->1 / o<->0 (52 pares)
        { "Association_0hy30zh",       "Association_0hy3ozh",       "0<->o" },
        { "Event_0c2faz1",             "Event_0c2fazl",             "1<->l" },
        { "Event_0flshpq",             "Event_0f1shpq",             "l<->1" },
        { "Event_1lpavqn",             "Event_11pavqn",             "l<->1" },
        { "Event_15i51zi",             "Event_15i5lzi",             "1<->l" },
        { "Event_1eol5j4",             "Event_1eo15j4",             "l<->1" },
        { "Flow_0lbbesj",              "Flow_01bbesj",              "l<->1" },
        { "Flow_03bh218",              "Flow_03bh2l8",              "1<->l" },
        { "Flow_0890d1r",              "Flow_0890dlr",              "1<->l" },
        { "Flow_080rx9c",              "Flow_08orx9c",              "0<->o" },
        { "Flow_08ybh17",              "Flow_08ybhl7",              "1<->l" },
        { "Flow_0d113xk",              "Flow_0d1l3xk",              "1<->l" },
        { "Flow_0dd7bl8",              "Flow_0dd7b18",              "l<->1" },
        { "Flow_0dzj97o",              "Flow_0dzj970",              "o<->0" },
        { "Flow_0f1u82o",              "Flow_0flu82o",              "1<->l" },
        { "Flow_0kl8vnv",              "Flow_0k18vnv",              "l<->1" },
        { "Flow_0174pgb",              "Flow_0l74pgb",              "1<->l" },
        { "Flow_0mf4o1dk",             "Flow_0mf4old",              "0<->o,1<->l" },
        { "Flow_0nhnyj1",              "Flow_0nhnyjl",              "1<->l" },
        { "Flow_0np5p1s",              "Flow_0np5pls",              "1<->l" },
        { "Flow_00j6r1h",              "Flow_0oj6r1h",              "0<->o" },
        { "Flow_0qb109c",              "Flow_0qbl09c",              "1<->l" },
        { "Flow_0rz11hi",              "Flow_0rzl1hi",              "1<->l" },
        { "Flow_0vx7ml5",              "Flow_0vx7m15",              "l<->1" },
        { "Flow_0ya9wv1",              "Flow_0ya9wvl",              "1<->l" },
        { "Flow_12211be",              "Flow_1221lbe",              "1<->l" },
        { "Flow_12n3el8",              "Flow_12n3e18",              "l<->1" },
        { "Flow_132csl6",              "Flow_132cs16",              "l<->1" },
        { "Flow_170pd19",              "Flow_17opd19",              "1<->o" },
        { "Flow_18zcm7l",              "Flow_18zcm71",              "l<->1" },
        { "Flow_19ql1n1",              "Flow_19q11n1",              "l<->1" },
        { "Flow_1al3cwi",              "Flow_1a13cwi",              "l<->1" },
        { "Flow_1du1pfn",              "Flow_1dulpfn",              "1<->l" },
        { "Flow_1eeralu",              "Flow_1eera1u",              "l<->1" },
        { "Flow_1g9aer1",              "Flow_1g9aerl",              "1<->l" },
        { "Flow_1grdbl0",              "Flow_1grdb10",              "l<->1" },
        { "Flow_1hr21w1",              "Flow_1hr2lw1",              "1<->l" },
        { "Flow_1j23ly5",              "Flow_1j231y5",              "l<->1" },
        { "Flow_11sqeit",              "Flow_1lsqeit",              "1<->l" },
        { "Flow_1tv28bl",              "Flow_1tv28b1",              "l<->1" },
        { "Gateway_0s01lvk",           "Gateway_0s0llvk",           "1<->l" },
        { "Gateway_1lr1d27",           "Gateway_11r1d27",           "l<->1" },
        { "Gateway_14101g5",           "Gateway_1410lg5",           "1<->l" },
        { "Gateway_190xsab",           "Gateway_19oxsab",           "1<->o" },
        { "Gateway_11hgagc",           "Gateway_1lhgagc",           "1<->l" },
        { "Gateway_11xlzrj",           "Gateway_1lxlzrj",           "1<->l" },
        { "Gateway_1pjn1lx",           "Gateway_1pjnllx",           "1<->l" },
        { "Gateway_1u7l0fk",           "Gateway_1u710fk",           "l<->1" },
        { "Gateway_1x2j9o3",           "Gateway_1x2j903",           "o<->0" },
        { "Gateway_1ianigi",           "Gateway_lianigi",           "1<->l" },
        { "Gateway_1loyjyt",           "Gateway_lloyjyt",           "1<->l" },
        { "Group_0usq370",             "Group_0usq37o",             "1<->o" },
    };

    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.out.println("Uso: java BpmnCheckIds <caminho_bpmn>");
            System.exit(1);
        }

        String content = new String(Files.readAllBytes(Paths.get(args[0])), StandardCharsets.UTF_8);

        System.out.printf("%-4s  %-42s %-5s  %-42s %-5s  %s%n",
                "#", "PROC_ID", "PROC?", "DIAG_ID", "DIAG?", "DIFF");
        System.out.println("-".repeat(130));

        for (int i = 0; i < PAIRS.length; i++) {
            String proc   = PAIRS[i][0];
            String diag   = PAIRS[i][1];
            String diff   = PAIRS[i][2];
            String hasProc = content.contains(proc) ? "SIM" : "NAO";
            String hasDiag = content.contains(diag) ? "SIM" : "NAO";
            String mark = "";
            if ("SIM".equals(hasProc) && "NAO".equals(hasDiag)) mark = "<- PROC correto";
            else if ("NAO".equals(hasProc) && "SIM".equals(hasDiag)) mark = "<- DIAG correto";
            else if ("SIM".equals(hasProc) && "SIM".equals(hasDiag)) mark = "!!! AMBOS existem";
            else mark = "!!! NENHUM";
            System.out.printf("%-4d  %-42s %-5s  %-42s %-5s  [%s] %s%n",
                    i + 1, proc, hasProc, diag, hasDiag, diff, mark);
        }
    }
}
