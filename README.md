# Decisão / Pendência: Backoffice — quem publica o evento? (filho vs PAI)

> **Contexto:** Pendência 2 do [MAPEAMENTO_ELEMENTOS_NIVEL1.md](../Inventário%20da%20decomposição/MAPEAMENTO_ELEMENTOS_NIVEL1.md). O processo **Backoffice** (`omnichannel_backoffice.bpmn`) é disparado por **evento** (análise de fraude, PLD, etc.) a partir de qualquer etapa da jornada. A dúvida era: o evento que inicia o Backoffice deve ser publicado por **cada BPMN filho** (1, 2, 3 ou 4) ou pelo **PAI**?
> **Status:** **Decidido** — filhos publicam o evento de Backoffice diretamente (opção "filhos publicam"), preferencialmente como evento de domínio em broker (ex.: tópico Kafka) ao qual o processo de Backoffice está inscrito.

**Contexto da decisão:**

- **Data:** *(preencher)*
- **Decisor(es):** *(preencher)*

> **Nota:** Incompleto até preenchimento dos campos acima.

---

## 1. Situação no monolito

- O Backoffice não é subprocesso sequencial; é acionado em situações como wayout, análise de documentos, PLD, erro AQ5.
- No monolito, esses disparos ocorrem a partir de pontos do mesmo processo. Após a decomposição, esses pontos estarão nos BPMNs 1, 2, 3 e 4.

---

## 2. Opções consideradas

| Opção | Descrição | Prós / contras |
| ------- | ----------- | ----------------- |
| **Filhos publicam** | Cada BPMN filho que identificar condição de backoffice **publica** uma mensagem/sinal. O processo Backoffice é iniciado por subscription. | **Prós:** Filho tem o contexto; não depende do PAI. **Contras:** Cada filho conhece o contrato do evento. |
| **PAI publica** | Os filhos notificam o PAI (variável ou mensagem); o **PAI** é o único que publica o evento que inicia o Backoffice. | **Prós:** Um único ponto de publicação. **Contras:** PAI precisa tratar o sinal; pode exigir Boundary Message ou lógica extra. |
| **Híbrido / broker** | Serviço intermediário (event mesh, gateway de eventos) escuta variáveis ou eventos dos filhos e publica o evento de início do Backoffice. | **Prós:** Desacopla engine do contrato; um único produtor para o tópico. **Contras:** Mais um componente; operação e latência adicionais. |

**Por que não adotar o híbrido (reversibilidade):** Um intermediário de eventos é uma arquitetura legítima (event mesh, gateway), mas neste contexto o custo de complexidade não se justifica. Os filhos já têm o contexto da condição de Backoffice; publicar diretamente no broker mantém o caminho curto e evita um ponto único de falha e um ciclo de vida extra (deploy, monitoração, versionamento do intermediário). Se no futuro o número de produtores ou a necessidade de transformação/validação centralizada crescer, a opção híbrida pode ser reavaliada — até lá, "filhos publicam" com contrato e schema únicos é o trade-off escolhido.

---

## 3. Problema arquitetural

Após a decomposição, vários pontos da jornada podem precisar disparar Backoffice:

- Wayout / análise de fraude em Produtos ou Validação.
- Análises PLD em fluxos transversais.
- Erros de validação (AQ5, Biocatch, etc.).

Se apenas o **PAI** pudesse publicar o evento:

- Cada BPMN filho teria de **sinalizar o PAI**, que por sua vez publicaria o evento.
- O PAI passaria a concentrar lógica de eventos de domínio que não são responsabilidade direta dele.
- A coordenação entre filhos e PAI ficaria mais acoplada (mais variáveis, mais casos especiais).

Por outro lado, deixar **cada filho publicar** o evento sem padrão traria:

- Contratos de evento espalhados e difíceis de manter.
- Comportamentos heterogêneos de retry/erro.

A decisão precisa equilibrar **desacoplamento** (filhos são donos do contexto) e **governança** (contrato único de evento).

---

## 4. Solução recomendada

### 4.1 Quem publica

- **Recomendação:** cada BPMN filho que detectar condição de Backoffice **publica diretamente** o evento de domínio (ex.: `BackofficeIniciado`), em um **broker de mensagens** (Kafka, etc.).
- O processo `omnichannel_backoffice.bpmn` é iniciado por **subscription** (message start event) a esse evento.
- O PAI **não** publica nem intermedia o evento; ele continua focado em orquestrar apenas as etapas macro (1→2→3→4).

### 4.2 Contrato de evento (exemplo)

Para implementação, o contrato deve incluir **identificação do canal/evento** e o payload. Exemplo (não definitivo; definir na implementação):

**Identificação do evento (obrigatório no contrato):**

- **Tópico / canal:** nome do tópico Kafka (ou equivalente) — ex.: `omnichannel.backoffice.disparo` ou conforme convenção do projeto. Documentar no schema ou ADR de mensagens.
- **MessageName (BPMN):** nome da mensagem que dispara o Message Start Event do processo `omnichannel_backoffice.bpmn` — ex.: `Message_BackofficeIniciado` ou nome acordado. Deve ser o mesmo usado na subscription do processo Backoffice.

**Payload (campos de exemplo):**

- `idProposta`
- `idPessoa`
- `origemBpmn` ("BPMN1", "BPMN2", "BPMN3", "BPMN4")
- `motivoBackoffice` ("WAYOUT", "PLD", "ERRO_AQ5", ...)
- `timestamp`
- `dadosAdicionais` (objeto opcional para contexto específico)

Esse contrato deve ser mantido em **schema compartilhado** (libs ou registry) para evitar divergências entre filhos.

### 4.3 Dificuldades e mitigação

- **Contratos espalhados:** todos os filhos precisam usar o mesmo contrato.
  → Mitigar com schema único versionado (ex.: módulo compartilhado ou schema registry).

- **Governança de mensagens:** risco de cada squad alterar o evento de forma diferente.
  → Mitigar com owners claros do evento de domínio e revisão de mudanças (design review, ADR).

- **Observabilidade:** vários produtores diferentes para o mesmo evento.
  → Mitigar com logging/tracing padronizado (correlação por `idProposta` e `origemBpmn`).

- **Tratamento de erro:** publicar evento pode falhar.
  → Padronizar política de retry/DLQ no nível de infraestrutura ou de worker que faz a publicação.

---

## 5. O que documentar no N1

- **Quem** publica: BPMNs filhos (1–4), via evento de domínio em broker.
- **Contrato** do evento (payload, tópico/canal) — ou link para schema/ADR correspondente.
- **Onde** no N1: seção \"Message / Event (Backoffice)\", descrevendo que o PAI não intermedia esses eventos.
- **Referência** a ADR ou documento de arquitetura de mensagens com os detalhes de implementação.

---

## 6. Referências

| Documento | Uso |
| ----------- | ----- |
| [MAPEAMENTO_ELEMENTOS_NIVEL1.md](../Inventário%20da%20decomposição/MAPEAMENTO_ELEMENTOS_NIVEL1.md) | Pendência 2; seção "Message / Event (Backoffice)" |
| [MAPEAMENTO_ELEMENTOS_NIVEL2.md](../Inventário%20da%20decomposição/MAPEAMENTO_ELEMENTOS_NIVEL2.md) | Backoffice como processo transversal |
| [RELATORIO_TRACEABILITY_BPMN_DECOMPOSITION.md](../Relatórios%20da%20atividade/RELATORIO_TRACEABILITY_BPMN_DECOMPOSITION.md) | Seção 5 — item "Backoffice: quem publica o evento?" |
