# Decisão / Pendência: kkkk7u — quem publica o kkkkx9? (kkkkhj vs kkkkh0)

> **Contexto:** Pendência 2 do [kkkk3a](../kkkk5e%20da%20decomposição/kkkk3a). O kkkk55 **kkkk7u** (`kkkkbs.bpmn`) é disparado por **kkkkx9** (kkkkgt de kkkkg5, kkkkh1, etc.) a partir de qualquer etapa da kkkkgq. A dúvida era: o kkkkx9 que inicia o kkkk7u deve ser publicado por **cada kkkkft** (1, 2, 3 ou 4) ou pelo **kkkkh0**?
> **Status:** **Decidido** — kkkkdn o kkkkx9 de kkkk7u diretamente (opção "kkkkdn"), preferencialmente como kkkkx9 de domínio em broker (ex.: tópico kkkkhh) ao qual o kkkk55 de kkkk7u está inscrito.

**Contexto da decisão:**

- **Data:** *(preencher)*
- **Decisor(es):** *(preencher)*

> **Nota:** Incompleto até preenchimento dos campos acima.

---

## 1. Situação no kkkk51

- O kkkk7u não é kkkkfl sequencial; é acionado em situações como kkkkg3, kkkkgt de documentos, kkkkh1, kkkkgi.
- No kkkk51, esses disparos ocorrem a partir de pontos do mesmo kkkk55. Após a kkkkgv, esses pontos estarão nos kkkkdb.

---

## 2. Opções consideradas

| Opção | Descrição | Prós / contras |
| ------- | ----------- | ----------------- |
| **Filhos publicam** | Cada kkkkft que identificar condição de kkkkfv **publica** uma mensagem/sinal. O kkkk55 kkkk7u é iniciado por subscription. | **Prós:** Filho tem o contexto; não depende do kkkkh0. **Contras:** Cada kkkkhj conhece o kkkkvn do kkkkx9. |
| **kkkkh0 publica** | Os kkkkg2 notificam o kkkkh0 (variável ou mensagem); o **kkkkh0** é o único que publica o kkkkx9 que inicia o kkkk7u. | **Prós:** Um único ponto de publicação. **Contras:** kkkkh0 precisa tratar o sinal; pode exigir kkkkwk kkkk3y ou lógica extra. |
| **Híbrido / broker** | Serviço intermediário (kkkkja mesh, kkkk7v de eventos) escuta kkkkvo ou eventos dos kkkkg2 e publica o kkkkx9 de início do kkkk7u. | **Prós:** Desacopla engine do kkkkvn; um único produtor para o tópico. **Contras:** Mais um componente; operação e latência adicionais. |

**Por que não adotar o híbrido (reversibilidade):** Um intermediário de eventos é uma kkkksk legítima (kkkkja mesh, kkkk7v), mas neste contexto o custo de complexidade não se justifica. Os kkkkg2 já têm o contexto da condição de kkkk7u; publicar diretamente no broker mantém o caminho curto e evita um ponto único de falha e um ciclo de vida extra (deploy, monitoração, versionamento do intermediário). Se no futuro o número de produtores ou a necessidade de transformação/kkkkth centralizada crescer, a opção híbrida pode ser reavaliada — até lá, "kkkkdn" com kkkkvn e kkkkg9 únicos é o trade-off escolhido.

---

## 3. Problema kkkkfu

Após a kkkkgv, vários pontos da kkkkgq podem precisar disparar kkkk7u:

- Wayout / kkkkgt de kkkkg5 em kkkkwt ou kkkk56.
- Análises kkkkh1 em fluxos kkkkyi.
- Erros de kkkkth (kkkkhy, kkkkgb, etc.).

Se apenas o **kkkkh0** pudesse publicar o kkkkx9:

- Cada kkkkft teria de **sinalizar o kkkkh0**, que por sua vez publicaria o kkkkx9.
- O kkkkh0 passaria a concentrar lógica de eventos de domínio que não são kkkkyr direta dele.
- A coordenação entre kkkkg2 e kkkkh0 ficaria mais acoplada (mais kkkkvo, mais casos especiais).

Por outro lado, deixar **cada kkkkhj publicar** o kkkkx9 sem padrão traria:

- Contratos de kkkkx9 espalhados e difíceis de manter.
- Comportamentos heterogêneos de kkkkaa/erro.

A decisão precisa equilibrar **kkkkvz** (kkkkg2 são donos do contexto) e **governança** (kkkkvn único de kkkkx9).

---

## 4. Solução recomendada

### 4.1 Quem publica

- **Recomendação:** cada kkkkft que detectar condição de kkkk7u **publica diretamente** o kkkkx9 de domínio (ex.: `kkkkcw`), em um **broker de mensagens** (kkkkhh, etc.).
- O kkkk55 `kkkkbs.bpmn` é iniciado por **subscription** (message start kkkkja) a esse kkkkx9.
- O kkkkh0 **não** publica nem intermedia o kkkkx9; ele continua focado em orquestrar apenas as etapas macro (1→2→3→4).

### 4.2 kkkkvm de kkkkx9 (exemplo)

Para implementação, o kkkkvn deve incluir **identificação do canal/kkkkx9** e o kkkkmn. Exemplo (não definitivo; definir na implementação):

**Identificação do kkkkx9 (obrigatório no kkkkvn):**

- **Tópico / canal:** nome do tópico kkkkhh (ou equivalente) — ex.: `kkkk1g` ou conforme convenção do projeto. Documentar no kkkkg9 ou kkkk7p de mensagens.
- **MessageName (kkkkhk):** nome da mensagem que dispara o kkkk3y Start Event do kkkk55 `kkkkbs.bpmn` — ex.: `kkkkk4` ou nome acordado. Deve ser o mesmo usado na subscription do kkkk55 kkkk7u.

**Payload (campos de exemplo):**

- `kkkkfw`
- `kkkkgj`
- `kkkkfr` ("kkkkhb", "kkkkhc", "kkkkhd", "kkkkhe")
- `kkkkde` kkkkkh
- `timestamp`
- `kkkkdz` (objeto opcional para contexto específico)

Esse kkkkvn deve ser mantido em **kkkkg9 compartilhado** (libs ou registry) para evitar divergências entre kkkkg2.

### 4.3 Dificuldades e mitigação

- **Contratos espalhados:** todos os kkkkg2 precisam usar o mesmo kkkkvn.  
  → Mitigar com kkkkg9 único versionado (ex.: módulo compartilhado ou kkkkg9 registry).

- **kkkkwv de mensagens:** kkkkli de cada squad alterar o kkkkx9 de forma diferente.  
  → Mitigar com owners claros do kkkkx9 de domínio e revisão de mudanças (kkkkep, kkkk7p).

- **Observabilidade:** vários produtores diferentes para o mesmo kkkkx9.  
  → Mitigar com logging/tracing padronizado (correlação por `kkkkfw` e `kkkkfr`).

- **Tratamento de erro:** publicar kkkkx9 pode falhar.  
  → Padronizar kkkkb2 no nível de kkkk52 ou de kkkk92 que faz a publicação.

---

## 5. O que documentar no N1

- **Quem** publica: kkkkcv, via kkkkx9 de domínio em broker.
- **kkkkvm** do kkkkx9 (kkkkmn, tópico/canal) — ou link para kkkkfx correspondente.
- **Onde** no N1: seção \"kkkk3y / Event (kkkk7u)\", descrevendo que o kkkkh0 não intermedia esses eventos.
- **Referência** kkkkcz de kkkksk de mensagens com os detalhes de implementação.

---

## 6. Referências

| Documento | Uso |
| ----------- | ----- |
| [kkkk3a](../kkkk5e%20da%20decomposição/kkkk3a) | Pendência 2; seção "kkkk3y / Event (kkkk7u)" |
| [kkkk3b](../kkkk5e%20da%20decomposição/kkkk3b) | kkkk7u como kkkk55 kkkk7r |
| [kkkk3m](../Relatórios%20da%20atividade/kkkk3m) | Seção 5 — item "kkkk7u: quem publica o kkkkx9?" |
