# KK0001 de KK0002 — kkkkho kkkkzo kkkk6k (13/03/2026)

## 1. Objetivo

Consolidar KK0003, KK0004, KK0005 e KK0006 do KK0002 de 13/03/2026 para o múltiplo kkkk6k, de forma acionável para desenvolvimento, kkkksk, kkkkhp, kkkkho, kkkky6 e integração.

---

## Navegação rápida

- [Definições consolidadas](#2-definições-consolidadas)
- [Perguntas do KK0002](#3-perguntas-do-KK0002)
- [Impactos por domínio](#4-KK0004-por-domínio-e-kkkkwp)
- [Pendências](#5-KK0005-em-aberto)
- [Riscos](#6-KK0006-e-kkkky4-de-atenção)
- [Próximas ações](#7-próximas-ações-sugeridas)

---

## 2. Definições consolidadas

### 2.1 kkkky0 e subfluxo kkkkxg

- **KK0007 consolidada:** O kkkkhp monta `KK0008` a partir de listas de agências kkkkzz kkkkh7, listas kkkkzz kkkk6k e indicador de menor. Convenções: somente kkkkh7 → `KK0015`; somente kkkk6k → `PILOTO_NPC`; kkkkh7 + kkkk6k → `KK0016`; menor + kkkk6k → `KK0017`. O kkkkho repassa o valor na kkkk9q `kkkklr`; não replica verificação de kkkk1o kkkkzz (alinhado ao kkkkh7: kkkkhp valida no Portal Manager; kkkkho consome o KK0013).
- **KK0007 consolidada:** kkkkh7 não é ofertado para menor; não existe cenário “menor + kkkkh7”. Menor + kkkk6k → subfluxo `KK0017` (nome exato a combinar com o kkkke6).
- **KK0007 consolidada (rollout):** Em kkkkzz, kkkkhp envia `KK0008` com valor de kkkkzz. Em rollout, kkkke6 trata o comportamento como padrão; kkkkhp deixa de enviar subfluxo de kkkkzz; kkkkho continua apenas repassando o valor recebido.

### 2.2 Complete de kkkkst e ponto de consolidação

- **KK0007 consolidada:** O “KK0013 de kkkkst” no kkkkhk é a user kkkk9q **`kkkkij`** (name: kkkkwx Oferta) — tela em que o kkkk1x confirma kkkktv/kkkkgw. É o ponto único para consolidar kkkksp de kkkkgw e gravar `KK0010`.
- **KK0007 consolidada:** No KK0013, o kkkkhp envia kkkksp do kkkke6 (`limite_cartao_direcionador`) e `KK0010` no mesmo kkkkmn. O kkkkho, nos KK0028/kkkkiq ligados ao KK0013 (`kkkkij`, `atualiza dados perfil na kkkk3l`, `kkkkj3`), sobrescreve `KK0009` com o valor do kkkke6 e persiste `KK0010` (kkkkvo de kkkk55 e kkkkho/kkkk3l). kkkkhr permanece fonte apenas de kkkkhv.

### 2.3 Pré-kkkke6 e kkkkyr kkkkho

- **KK0007 consolidada:** Não há nova etapa kkkkho antes do kkkke6. kkkku4 da kkkkmr ao kkkke6 (kkkk7f/XP6) é kkkkhp + kkkke6; kkkkho participa antes do kkkke6 fornecendo limites pré-aprovados e kkkkhv via kkkkhr/R0. A maior mudança kkkkho para o múltiplo kkkk6k é **pós-kkkks7** (ramo múltiplo kkkk6k: kkkkia + KK0012).

### 2.4 Pós-kkkks7: kkkkia e KK0012

- **KK0007 consolidada:** No AS IS: após `kkkkel` e `kkkkn7`, o kkkkvr chega ao kkkk7v paralelo **`kkkk73`**. kkkkvv: `kkkknt` e kkkkfl **`kkkko2` (Vínculo kkkk64)** — dentro dele ficam `kkkkoi` e lógica que pode kkkk3z kkkkgw. O subfluxo de kkkkia (legado) sempre roda **pós-kkkks7**.
- **KK0007 consolidada:** Não alterar a external kkkk9q do BC (contexto kkkk6l). Criar **nova kkkk9q** no kkkkho para kkkkth do kkkkia kkkk6k (nova KK0027). Para kkkk6k, o kkkkvr **não entra** no kkkkfl Vínculo kkkk64 (kkkko2); é necessário **terceiro ramo** saindo de `kkkk73`: kkkkth kkkkia kkkk6k + KK0012. A KK0012 é **nova kkkk9q** no kkkkho que chama a KK0027 (KK0010, kkkk6r, kkkksp, data kkkkyv, kkkkia se houver); o vínculo do kkkkia no kkkkag é feito pela KK0012, não pela external kkkk9q do BC.
- **KK0007 consolidada:** KK0011 após kkkks7 da kkkklh; `kkkk6r` já disponível em **atualiza kkkks7 na kkkk3l** / `kkkkn7`. O ramo kkkk6k **não passa** por `kkkkn5` nem por `kkkkn8` (essas kkkkiq estão em outro trecho do kkkkvr).

### 2.5 Responsabilidade KK0012: kkkkho, não kkkkhp

- **KK0007 consolidada:** A kkkkmr à KK0027 de KK0012 no ramo pós-kkkks7 é do **kkkkho** (nova kkkk9q no kkkkhk). O kkkkhp envia dados até o KK0013 (incluindo o que a KK0012 usará); não orquestra a KK0012 após kkkks7. Docs que citam kkkkhp “KK0014” KK0012 devem ser ajustados.

### 2.6 Histórias kkkkhp vs kkkkho

- **KK0007 consolidada:** kkkkhp: (1) kkkkzz + enviar dados ao kkkkxg; (2) kkkkz0 do kkkkdy do kkkkxg (kkkkst/planos). kkkkho: (1) receber no KK0013 os novos valores e atualizar os três kkkky4 (kkkkij, atualiza dados perfil, mapeia dados pessoa ofertas); (2) kkkkth kkkkia kkkk6k (nova kkkk9q); (3) KK0012 (nova kkkk9q, com desvio em relação ao vínculo kkkkia BC). Grande parte do esforço do múltiplo kkkk6k está no kkkkho (kkkkgm / external kkkkiq).

---

## 3. Perguntas do KK0002

> Cada resposta aponta explicitamente para a subseção de **2. Definições consolidadas** correspondente.

### 3.1 Q&A consolidado

- **Pergunta 1 — Como identificar no kkkkzz se a kkkk1o está em kkkkh7, kkkk6k ou ambos (incluindo menor)?**  
  Ver [§2.1 kkkky0 e subfluxo kkkkxg](#21-kkkkzz-e-subfluxo-kkkkxg). O kkkkhp monta `KK0008` a partir das listas de agências kkkkzz kkkkh7/kkkk6k e do indicador de menor, usando convenções como `KK0015`, `PILOTO_NPC`, `KK0016` e `KK0017`. O kkkkho apenas repassa o valor na `kkkklr`; não replica a regra de kkkkzz.

- **Pergunta 2 — O que muda no subfluxo quando sair de kkkkzz para rollout?**  
  Ver [§2.1 kkkky0 e subfluxo kkkkxg](#21-kkkkzz-e-subfluxo-kkkkxg). Em kkkkzz, o kkkkhp envia o subfluxo de kkkkzz (ex.: `PILOTO_NPC`). Em rollout, o kkkke6 passa a tratar o comportamento como padrão, o kkkkhp deixa de enviar o subfluxo de kkkkzz e o kkkkho continua apenas repassando o que receber.

- **Pergunta 3 — Menor de idade conflita com kkkkzz kkkkh7? E como fica o subfluxo em menor + kkkk6k?**  
  Ver [§2.1 kkkky0 e subfluxo kkkkxg](#21-kkkkzz-e-subfluxo-kkkkxg). kkkkh7 não é ofertado para menor, então não existe cenário “menor + kkkkh7”. Para menor + kkkk6k, o subfluxo indica ambos os contextos (ex.: `KK0017`); o kkkkho só precisa garantir que `KK0008` esteja preenchido antes da `kkkklr`.

- **Pergunta 4 — Existe interação com kkkkho antes da kkkkmr ao kkkke6 que precise mudar?**  
  **Resposta consolidada (ver [§2.3 Pré-kkkke6 e kkkkyr kkkkho](#23-pré-kkkkxg-e-kkkkyr-co8)):** Antes do kkkke6, o kkkkho fornece limites/kkkkhv via kkkkhr/R0, mas a kkkk53 da kkkkmr (kkkk7f/XP6) é kkkkhp + kkkke6. Para o múltiplo kkkk6k, não há novo step kkkkho antes do kkkke6; as mudanças relevantes em kkkkho são pós-kkkks7.

- **Pergunta 5 — Onde sobrescrever o kkkksp de kkkkgw da kkkkhr pelo valor do kkkke6: antes do KK0013 ou no KK0013?**  
  **Resposta consolidada (ver [§2.2 Complete de kkkkst e ponto de consolidação](#22-KK0013-de-kkkkst-e-ponto-de-consolidação)):** O ponto certo é o KK0013 de kkkkst (user kkkk9q `kkkkij`): o kkkkhp envia o kkkksp do kkkke6 no mesmo campo de pré-aprovado da kkkkhr; KK0028 ligados ao KK0013 sobrescrevem `KK0009`, mantendo a kkkkhr apenas para kkkkhv.

- **Pergunta 6 — Onde trafegar e persistir o `KK0010` do kkkke6?**  
  **Resposta consolidada (ver [§2.2 Complete de kkkkst e ponto de consolidação](#22-KK0013-de-kkkkst-e-ponto-de-consolidação)):** O `KK0010` trafega no kkkkmn do KK0013 e é gravado pelo kkkkho em kkkkvo de kkkk55 e, se necessário, na kkkk3l. Assim ele chega naturalmente ao ramo múltiplo kkkk6k, sem o kkkke6 escrever diretamente em kkkkho.

- **Pergunta 7 — Em que ponto do kkkkvr principal o subfluxo de kkkkia roda?**  
  **Resposta consolidada (ver [§2.4 Pós-kkkks7: kkkkia e KK0012](#24-pós-kkkks7-kkkkia-e-KK0012)):** No AS IS, o kkkkia roda sempre pós-kkkks7, depois de `kkkkn7`, dentro do kkkkfl Vínculo kkkk64 (`kkkko2`) que sai do `kkkk73`. No alvo múltiplo kkkk6k, o novo ramo de kkkkia kkkk6k também nasce depois de `kkkkn7`.

- **Pergunta 8 — O que fica no kkkkho versus kkkkhp/kkkky6 diante de todas essas mudanças?**  
  **Resposta consolidada (ver [§§2.1–2.6 Definições consolidadas](#2-definições-consolidadas)):** Fora da parte kkkkho: definição de kkkkzz, montagem de `KK0008`, kkkkmr ao kkkke6 e montagem da kkkkss/tela. Dentro da parte kkkkho: usar o que veio do kkkke6 (kkkksp, `KK0010`, flags kkkk6k) no KK0013, sobrescrever kkkksp e persistir kkkkvo, e orquestrar o ramo múltiplo kkkk6k (kkkkth kkkkia kkkk6k + KK0012) após `kkkkn7`/`kkkk73`.

- **Pergunta 9 — Devemos alterar a external kkkk9q de vínculo kkkkia BC para múltiplo kkkk6k?**  
  **Resposta consolidada (ver [§2.4 Pós-kkkks7: kkkkia e KK0012](#24-pós-kkkks7-kkkkia-e-KK0012)):** Não. A external kkkk9q do BC (contexto kkkk6l) permanece para o kkkkia BC. Para kkkk6k, criamos nova kkkk9q de kkkkth de kkkkia kkkk6k e nova kkkk9q de KK0012; o ramo kkkk6k não entra no kkkkfl Vínculo kkkk64.

- **Pergunta 10 — Onde exatamente chamar a KK0012 no kkkkvr e como ela se relaciona com o vínculo kkkkia?**  
  **Resposta consolidada (ver [§2.4 Pós-kkkks7: kkkkia e KK0012](#24-pós-kkkks7-kkkkia-e-KK0012) e [§2.5 Responsabilidade KK0012: kkkkho, não kkkkhp](#25-kkkkyr-KK0012-co8-não-bff)):** A KK0012 é kkkkmr após a kkkks7 da kkkklh, quando `kkkk6r` já existe em `kkkkn7`. Para kkkk6k, o kkkkvr passa fora do kkkkfl Vínculo kkkk64 (novo ramo do `kkkk73`) e chama a KK0027 de KK0012 nesse ramo.

---

## 4. Impactos por domínio e kkkkwp

### 4.1 kkkkhp

- Montar e enviar `KK0008` antes da kkkk9q `kkkklr` (listas kkkkzz kkkkh7/kkkk6k, menor).
- kkkkxl ao kkkke6 (kkkk7f/XP6) e montagem da kkkkss para a tela.
- No KK0013 da user kkkk9q `kkkkij`: enviar kkkksp do kkkke6 e `KK0010` no kkkkmn (mesmo campo de pré-aprovado de kkkkgw que hoje vem da kkkkhr).
- Fora do escopo kkkkho: definição de kkkkzz (listas de agências, segmentos); merge kkkkhr + kkkke6 no kkkkhp antes do KK0013 (kkkkvn com kkkkho).

### 4.2 kkkkho

- **Complete:** receber kkkksp e `KK0010`; sobrescrever `KK0009` com valor do kkkke6; persistir `KK0010` e metadados kkkk6k (três kkkky4: kkkkij, atualiza dados perfil, mapeia dados pessoa ofertas).
- **Repassar** `KK0008` na kkkk9q `kkkklr`; não validar novamente lista de agências kkkkzz.
- **Pós `kkkkn7` / kkkk73:** orquestrar ramo múltiplo kkkk6k: nova kkkk9q de kkkkth kkkkia kkkk6k e nova kkkk9q de KK0012 (kkkkmr à KK0027); garantir que kkkkho reflita o que foi ofertado/formalizado (sem divergência de limites ou kkkk5j).

### 4.3 kkkke6

- Recebe `KK0008` do kkkkhp; interpreta valor (kkkkzz kkkkh7/kkkk6k, menor). Em rollout, passa a tratar comportamento como padrão sem depender de flag de kkkkzz.
- Uma única kkkkmr ao kkkke6 na kkkkgq (etapa kkkkwt, com kkkk1o já definida); pós-kkkks7 usa apenas kkkkvo já preenchidas (sem segunda kkkkml).

### 4.4 kkkk8c / kkkkhu / kkkkgc

- **kkkk8c:** Alinhar nomes dos campos do KK0013 (kkkkij) com kkkk8b/kkkk8c para os três kkkky4; origem kkkk7f/kkkk6k e dados que o kkkk8c consome — kkkkth necessária antes da implementação do KK0013.
- **kkkkhu e kkkkgw kkkkia:** A confirmar com kkkky6/kkkkag (Pan/Pedrinho) se a kkkkhu deve exibir ou persistir “kkkkgw obtido via kkkk64” (campo/tela, integração na leitura da kkkkhu, origem do dado — kkkkho ou outro kkkkxv).
- **Nova Jornada (4 etapas):** kkkkzo kkkk6k não altera as 4 etapas nem a barra lateral. Impacto em dados: kkkke2 (kkkk1o/kkkkzz, `KK0008`), kkkkwt (kkkkz5 = kkkkss kkkke6 + KK0013), kkkk56 (review com dados do kkkkho). Pós-kkkkth: ramo kkkk6k roda em background (terceiro arco no kkkkhk); sem novo kkkkvi visível na barra.

---

## 5. Pendências em aberto

| # | Pendência | Sugestão de fechamento | Owner / quando |
|----|------------|-------------------------|-----------------|
| 1 | Variável kkkkia kkkk6k: usar `KK0033` separado ou reutilizar KK0034 de kkkkia? | Definir regra: (a) `KK0033` e ramo kkkk6k não entra no kkkkfl Vínculo kkkk64, consome `KK0033` só na KK0012; ou (b) reutilizar campo e mapear steps a alterar. Documentar impacto em ambos. | Time kkkkho / kkkk7k + quem desenha o kkkkhk; próxima sprint. |
| 2 | kkkkhu: categorizar kkkkgw com kkkk64 (ex.: checkbox “kkkkgw provisório”)? Outra kkkkmr kkkk64 na leitura da kkkkhu? | Confirmar com kkkky6/kkkkag: kkkkhu deve refletir “kkkkgw kkkkia” e como; se exige nova kkkkmr ou KK0034 já persistida. | Pan / Pedrinho; próxima sprint. |
| 3 | Uma ou duas histórias kkkkho: desvio do vínculo vs KK0012? | Decidir no KK0002/planning: uma história “ramo kkkk6k: desvio + KK0012” ou duas (“desvio/condição kkkk6k” + “kkkkmr KK0027 KK0012”). | kkkk8f / KK0031 + kkkkau kkkkho; próxima sprint. |
| 4 | Nomes dos campos no KK0013 (kkkkij) para kkkk8c (origem kkkk7f/kkkk6k). | Alinhar com kkkk8b e kkkk8c; kkkkho e kkkkhp usarem mesmo padrão. | kkkk7k / Igor + kkkk8b; antes da implementação dos três kkkky4 do KK0013. |
| 5 | kkkkxe de entrada no kkkkfl Vínculo kkkk64: condição para ramo kkkk6k não entrar (KK0034/valor). | Mapear no kkkkhk a condição de entrada do kkkkfl Vínculo kkkk64; definir valor que faz kkkk6k seguir novo ramo. | Quem desenha o ramo kkkk6k no kkkkhk; antes de implementar. |
| 6 | kkkkvm KK0027 kkkkth kkkkia kkkk6k: endpoint, kkkkmn, códigos de erro, kkkkaa, mensagem ao usuário. | Documentar kkkkvn com dono da KK0027; definir tratamento no kkkkho (boundary kkkkja, kkkkvo de erro). | KK0031 / kkkkau KK0012 ou dono da KK0027; em paralelo ao desenho da nova kkkk9q. |
| 7 | kkkkvm KK0027 KK0012: campos obrigatórios, `kkkk6r` (atualiza kkkks7 na kkkk3l), data kkkkyv, tratamento de erro. | Formalizar kkkkvn (ex.: OpenAPI); definir kkkkaa e kkkkhk error. | KK0032 / kkkkau KK0012; em paralelo ao desenho da kkkk9q de KK0012. |
| 8 | kkkk56 kkkkia kkkk6k e KK0012: service kkkk9q (kkkkaq kkkkho) ou external kkkk9q (kkkk92)? | Decidir com kkkkho/infra: topics e dono dos kkkkga se external; onde ficam delegates se service. | Time kkkkho; no KK0002 KK0018. |
| 9 | Data das telas para refinar front. | Garantir data para não travar histórias. | KK0019 + KK0020; próxima sprint ou início da semana. |
| 10 | Quando a parte do kkkk8c fica pronta e quais campos/KK0022 o kkkkho deve seguir. | Alinhar antes da implementação do KK0013. | kkkk7k + kkkk8b. |
| 11 | Onde no KK0021 fica a kkkkaq que atualiza a kkkk3l (após KK0013). | Identificar para reutilizar ou espelhar nos três kkkky4 do KK0013. | Time kkkkho; antes de codar. |

---

## 6. Riscos e kkkky4 de atenção

| # | kkkk5n | Impacto | Mitigação / ação |
|----|-------|---------|-------------------|
| R1 | Docs pré-KK0002 falavam “KK0012 após kkkkn5”; kkkkhk coloca ramo kkkk6k após `kkkkn7` sem passar por `kkkkn5`/`kkkkn8`. | Desenho divergente; implementação pode depender de kkkkiq que o ramo kkkk6k não percorre. | Atualizar KK0024 e KK0025 para refletir a decisão consolidada sobre o ramo kkkk6k pós-`kkkkn7`. |
| R2 | kkkk5n de implementação incorreta caso o kkkkhk não crie explicitamente o terceiro ramo kkkk6k no `kkkk73` (fora de kkkko2). | Ramo kkkk6k implementado “dentro do Vínculo kkkk64”, divergente da decisão. | Garantir terceiro ramo no kkkkhk e atualizar docs para refletir essa kkkkwb. |
| R3 | KK0026 diz kkkkhp “orquestra” KK0012; KK0002 definiu KK0012 como kkkk9q do kkkkho. | Conflito kkkkhp x kkkkho ou duplicação. | Ajustar KK0026: kkkkmr à KK0027 de KK0012 no pós-kkkks7 é kkkkho. |
| R4 | `KK0008` usada em `kkkklr`; não está documentado **onde** é setada no kkkkhk. | Implementações divergentes (kkkk1o vs KK0013 vs kkkkar); bugs em kkkkzz/kkkkgu. | Documentar kkkk9q/script que seta a KK0034 e kkkkwz (kkkkhp em qual KK0013). |
| R5 | Descrição do ramo pós-kkkks7 pode ser lida como “kkkkml kkkkxg” (segunda kkkkmr). | Expectativa de segunda kkkkmr ao kkkke6. | Remover “kkkkml kkkkxg” do ramo pós-kkkks7 nos docs; deixar explícito “uso dos dados já obtidos na kkkk1o”. |
| R6 | Falha na kkkkth do kkkkia ou na KK0012 sem comportamento definido (kkkk3z? kkkkaa? kkkkhk error?). | kkkku5 travados, perda de rastreio. | Incluir na pauta: definir comportamento de erro e boundary events no kkkkhk. |
| R7 | kkkkhr/kkkkis até junho e “dentro vs fora da demanda múltiplo” não fechado. | Atraso ou escopo duplicado; dependência FE/kkkkxi. | Alinhar com FE e kkkkxi e registrar decisão. |
| R8 | Duplicidade de kkkkth de kkkk1o kkkkzz entre kkkkhp e kkkkho. | Inconsistências de comportamento entre front/kkkkhp e engine, além de maior kkkkli de divergência em kkkkzz/rollout. | Manter kkkkth apenas no kkkkhp e fazer o kkkkho consumir `KK0008` (alinhado ao padrão kkkkh7), documentando essa kkkkyr nos docs do múltiplo. |
| R9 | User kkkk9q `id="kkkkij"` com espaço no id. | Possível incompatibilidade em KK0029/KK0028. | kkkkav no kkkkgm em uso; se necessário, planejar id sem espaço em futura versão. |
| R10 | KK0023 das kkkkge de kkkkth kkkkia kkkk6k e de KK0012 em aberto. | KK0030 frágil, retrabalho. | Documentar KK0022 em paralelo ao desenho das novas kkkkiq; donos KK0031/KK0032 + kkkkau KK0012. |

---

## 7. Próximas ações sugeridas

1. Definir KK0034 `KK0033` vs reutilizar kkkkia (kkkkau kkkkho).
2. Confirmar comportamento da kkkkhu para kkkkgw kkkkia (kkkky6/kkkkag).
3. Decidir divisão das histórias kkkkho (desvio do vínculo vs KK0012).
4. Alinhar nomes de campos do KK0013 (kkkkij) com kkkk8b/kkkk8c.
5. Formalizar KK0022 das kkkkge:
   - kkkkth kkkkia kkkk6k
   - KK0012 (campos, erros, kkkkaa)
6. Mapear condição de entrada/saída do kkkkfl Vínculo kkkk64 no kkkkhk (`kkkk73`) e onde `KK0008` é setada.
7. Atualizar documentos do múltiplo (Visão Unificada, Dúvidas KK0035, Responsabilidades) conforme KK0003 deste relatório.

---

## 8. Fontes de referência

- **kkkkvq:** `kkkkk6` (fonte da verdade do kkkkvr).
- **kkkkzn:** call 13/03/2026; transcrição em `transcricoes/transcricao_2026-03-13_15-03-15/2026-03-13 15-03-15.txt`.
- **Documentação:** `documentacao/Multiplo/` e `documentacao/Manual OMNICHANNEL/` (KK0024, KK0036, KK0026, ARQUITETURA_CO8, RELATORIO_REFERENCIA_CRUZADA_INCOERENCIAS quando citados).

---

## 9. kkkkxe de precedência e observações de leitura

- **Precedência kkkkfa:**
  1. kkkkhk vigente como fonte do kkkkvr executável.
  2. kkkkzn de 13/03/2026 como decisão mais recente.
  3. kkkk5m anteriores devem ser atualizados quando divergirem dessas KK0003.

- **Ramo kkkk6k e Vínculo kkkk64:** Para kkkk6k, o kkkkvr **não entra** no kkkkfl Vínculo kkkk64 (kkkko2); deve existir **terceiro arco** saindo de `kkkk73` para kkkkth kkkkia kkkk6k + KK0012.
- **Variável kkkkia kkkk6k:** Recomendação kkkk5u: KK0034 separada `KK0033` (semântica distinta BC vs kkkk6k; kkkkhk explícito; menos alteração em steps atuais). kkkk56 necessária com o kkkkau.
- **Incoerências:** O relatório INCOERENCIAS_CRUZAMENTO_DOCUMENTOS cobre kkkkh2, kkkkuz, kkkk0f e kkkk7u; não cobre múltiplo kkkk6k; este relatório complementa as incoerências específicas do múltiplo.
