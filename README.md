# Decisão / Pendência: Processo de Apoio — quem publica o evento? (filho vs Orquestrador)

> **Contexto:** Pendência 2 do [DOC_INVENTARIO_NIVEL_1](pasta_inventarios/DOC_INVENTARIO_NIVEL_1.md). O processo **Processo de Apoio** (`processo_apoio_transversal.bpmn`) é disparado por **evento** (análise de fraude, análise regulatória, etc.) a partir de qualquer etapa da jornada. A dúvida era: o evento que inicia o Processo de Apoio deve ser publicado por **cada processo de etapa** (1, 2, 3 ou 4) ou pelo **Orquestrador**?
> **Status:** **Decidido** — filhos publicam o evento de Processo de Apoio diretamente (opção "filhos publicam"), preferencialmente como evento de domínio em broker (ex.: plataforma de mensageria) ao qual o processo de Processo de Apoio está inscrito.

**Contexto da decisão:**

- **Data:** *(preencher)*
- **Decisor(es):** *(preencher)*

> **Nota:** Incompleto até preenchimento dos campos acima.

---

## 1. Situação no monolito

- O Processo de Apoio não é subprocesso sequencial; é acionado em situações como fluxo de exceção, análise de documentos, análise regulatória, erro em sistema externo de validação.
- No monolito, esses disparos ocorrem a partir de pontos do mesmo processo. Após a decomposição, esses pontos estarão nos processos de etapa 1, 2, 3 e 4.

---

## 2. Opções consideradas

| Opção | Descrição | Prós / contras |
| ------- | ----------- | ----------------- |
| **Filhos publicam** | Cada processo de etapa que identificar condição de processo de apoio **publica** uma mensagem/sinal. O processo Processo de Apoio é iniciado por subscription. | **Prós:** Filho tem o contexto; não depende do Orquestrador. **Contras:** Cada filho conhece o contrato do evento. |
| **Orquestrador publica** | Os filhos notificam o Orquestrador (variável ou mensagem); o **Orquestrador** é o único que publica o evento que inicia o Processo de Apoio. | **Prós:** Um único ponto de publicação. **Contras:** Orquestrador precisa tratar o sinal; pode exigir evento de mensagem na borda ou lógica extra. |
| **Híbrido / broker** | Serviço intermediário (event mesh, gateway de eventos) escuta variáveis ou eventos dos filhos e publica o evento de início do Processo de Apoio. | **Prós:** Desacopla engine do contrato; um único produtor para o tópico. **Contras:** Mais um componente; operação e latência adicionais. |

**Por que não adotar o híbrido (reversibilidade):** Um intermediário de eventos é uma arquitetura legítima (event mesh, gateway), mas neste contexto o custo de complexidade não se justifica. Os filhos já têm o contexto da condição de Processo de Apoio; publicar diretamente no broker mantém o caminho curto e evita um ponto único de falha e um ciclo de vida extra (deploy, monitoração, versionamento do intermediário). Se no futuro o número de produtores ou a necessidade de transformação/validação centralizada crescer, a opção híbrida pode ser reavaliada — até lá, "filhos publicam" com contrato e schema únicos é o trade-off escolhido.

---

## 3. Problema arquitetural

Após a decomposição, vários pontos da jornada podem precisar disparar Processo de Apoio:

- Fluxo de exceção / análise de fraude em Produtos ou Validação.
- Análises regulatórias em fluxos transversais.
- Erros de validação (sistema externo, serviço de validação, etc.).

Se apenas o **Orquestrador** pudesse publicar o evento:

- Cada processo de etapa teria de **sinalizar o Orquestrador**, que por sua vez publicaria o evento.
- O Orquestrador passaria a concentrar lógica de eventos de domínio que não são responsabilidade direta dele.
- A coordenação entre filhos e Orquestrador ficaria mais acoplada (mais variáveis, mais casos especiais).

Por outro lado, deixar **cada filho publicar** o evento sem padrão traria:

- Contratos de evento espalhados e difíceis de manter.
- Comportamentos heterogêneos de retry/erro.

A decisão precisa equilibrar **desacoplamento** (filhos são donos do contexto) e **governança** (contrato único de evento).

---

## 4. Solução recomendada

### 4.1 Quem publica

- **Recomendação:** cada processo de etapa que detectar condição de Processo de Apoio **publica diretamente** o evento de domínio (ex.: `EventoApoioIniciado`), em um **broker de mensagens** (plataforma de mensageria, etc.).
- O processo `processo_apoio_transversal.bpmn` é iniciado por **subscription** (evento de início por mensagem) a esse evento.
- O Orquestrador **não** publica nem intermedia o evento; ele continua focado em orquestrar apenas as etapas macro (1→2→3→4).

### 4.2 Contrato de evento (exemplo)

Para implementação, o contrato deve incluir **identificação do canal/evento** e o payload. Exemplo (não definitivo; definir na implementação):

**Identificação do evento (obrigatório no contrato):**

- **Tópico / canal:** nome do tópico (ou equivalente) — ex.: `canal.apoio.disparo` ou conforme convenção do projeto. Documentar no schema ou documento de decisão de mensagens.
- **MessageName (processo):** nome da mensagem que dispara o evento de início por mensagem do processo `processo_apoio_transversal.bpmn` — ex.: `Message_ApoioIniciado` ou nome acordado. Deve ser o mesmo usado na subscription do processo Processo de Apoio.

**Payload (campos de exemplo):**

- `idSolicitacao`
- `idCliente`
- `origemEtapa` ("Etapa1", "Etapa2", "Etapa3", "Etapa4")
- `motivoApoio` ("MOTIVO_EXCECAO", "MOTIVO_ANALISE", "MOTIVO_ERRO_VALIDACAO", ...)
- `timestamp`
- `dadosContexto` (objeto opcional para contexto específico)

Esse contrato deve ser mantido em **schema compartilhado** (libs ou registry) para evitar divergências entre filhos.

### 4.3 Dificuldades e mitigação

- **Contratos espalhados:** todos os filhos precisam usar o mesmo contrato.
  → Mitigar com schema único versionado (ex.: módulo compartilhado ou schema registry).

- **Governança de mensagens:** risco de cada equipe alterar o evento de forma diferente.
  → Mitigar com owners claros do evento de domínio e revisão de mudanças (design review, documento de decisão).

- **Observabilidade:** vários produtores diferentes para o mesmo evento.
  → Mitigar com logging/tracing padronizado (correlação por `idSolicitacao` e `origemEtapa`).

- **Tratamento de erro:** publicar evento pode falhar.
  → Padronizar política de retry e fila de erros no nível de infraestrutura ou de worker que faz a publicação.

---

## 5. O que documentar no Nível 1

- **Quem** publica: processos de etapa (1–4), via evento de domínio em broker.
- **Contrato** do evento (payload, tópico/canal) — ou link para schema/documento correspondente.
- **Onde** no Nível 1: seção "Message / Event (Processo de Apoio)", descrevendo que o Orquestrador não intermedia esses eventos.
- **Referência** a documento de decisão ou documento de arquitetura de mensagens com os detalhes de implementação.

---

## 6. Referências

| Documento | Uso |
| ----------- | ----- |
| [DOC_INVENTARIO_NIVEL_1](pasta_inventarios/DOC_INVENTARIO_NIVEL_1.md) | Pendência 2; seção "Message / Event (Processo de Apoio)" |
| [DOC_INVENTARIO_NIVEL_2](pasta_inventarios/DOC_INVENTARIO_NIVEL_2.md) | Processo de Apoio como processo transversal |
| [DOC_RASTREABILIDADE](pasta_relatorios/DOC_RASTREABILIDADE.md) | Seção 5 — item "Processo de Apoio: quem publica o evento?" |
