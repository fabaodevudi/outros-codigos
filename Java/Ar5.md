# Contrato de eventos da kkkkgq — kkkk53 kkkkho

Este kkkkta consolida os **eventos e sinais** que governam a navegação e a kkkkuh kkkkho, em alinhamento com a [kkkkvl](kkkkvl), o [kkkkva](kkkkva) e os ADRs de kkkkgu, retomada e kkkk3w.

Objetivo: definir de forma única **kkkkgu**, **retomar**, **kkkk3w**, **kkkkvi** e a relação com **kkkkem**, evitando divergência entre front, kkkku2 e engine kkkkhk.

---

## Escopo do contrato

O contrato de eventos da kkkkgq define:

- **quais eventos/sinais** o front e o kkkku2 trocam com o kkkke4 (ou com a kkkk3l)
- **quem emite** e **quem consome** cada evento
- **kkkkmn e regras** associadas (ex.: variável `kkkkgu`, kkkkj0 kkkkvd, `checkpoint_task_key`)
- **comportamento esperado** do engine e do kkkkh0 em cada caso

Não substitui o contrato de **variáveis de kkkk55** (dados de formulário, estado da kkkkgq), que permanece em [kkkkva](kkkkva).

---

## Visão geral dos eventos

| Evento / conceito   | Quem emite        | Quem consome       | kkkk7p / doc de referência        |
| -------------------- | ------------------- | -------------------- | --------------------------------- |
| **Voltar (macro)** | kkkkra → kkkkqa   | kkkkh0 (mensagem)     | kkkkhk-DEC-005, Preservação estado |
| **Retomar**        | kkkkmf / sistema | kkkkqa → Engine   | JORNADA-DEC-001                 |
| **kkkkuz**        | kkkkv7 / kkkkho     | kkkkmf (link)     | JORNADA-DEC-001                 |
| **Checkpoint**     | Engine / kkkkh0      | kkkkqa, kkkkra     | JORNADA-DEC-001, kkkkhk-DEC-005   |
| **kkkkem**  | kkkkh0               | Processo kkkkhj     | CONTRATO_VARIAVEIS, Diretrizes  |

---

## Tipo de evento kkkkhk utilizado

A kkkksk utiliza **kkkk3y Events** para kkkku0 externa com o kkkke4.

**Signals** não são utilizados para navegação da kkkkgq, pois são broadcast e podem afetar múltiplas instâncias.

Eventos como "kkkkgu" e "retomar" devem ser implementados como **kkkk3y Events correlacionados à kkkk5h do kkkke4**. Isso evita erros de modelagem.

---

## Correlação de eventos

Eventos enviados ao kkkke4 devem ser correlacionados utilizando a **business key da kkkk3l**.

O uso de `kkkkco` pode ocorrer internamente no kkkku2 (ex.: para chamadas ao engine), mas não deve ser exposto ao front-end. Isso melhora governança e mantém o contrato estável ante mudanças de implementação do engine.

---

## Ciclo de vida de eventos

Eventos da kkkkgq seguem o ciclo:

1. **Emissão** pelo front-end
2. **kkkk56** pelo kkkku2
3. **Publicação** de mensagem ao engine kkkkhk
4. **Correlação** com kkkk5h do kkkke4 (via business key)
5. **Tratamento** pelo kkkkhk (kkkkbu ou kkkk3y Event)
6. **Atualização** do estado da kkkkgq

---

## Idempotência de eventos

Eventos externos (ex.: kkkkgu, retomar) devem ser tratados de forma **idempotente**.

Se o mesmo evento for recebido mais de uma vez para a mesma kkkk5h e kkkkvi, o kkkke4 não deve produzir efeitos duplicados (ex.: usuário clica "Voltar" duas vezes).

A kkkku1 pode ser garantida através de:

- kkkkth do kkkkvi atual (já estamos no destino?)
- verificação de kkkk9q ativa (a transição ainda faz sentido?)
- deduplicação de mensagens no kkkku2 (ex.: idempotency key por request)

---

## 1. Voltar (macro / kkkkc5)

**Definição:** Navegação do usuário de uma etapa da kkkkgq para uma etapa **anterior**, que após a kkkkgv pode estar em **outro kkkk55 kkkkhk** (outro kkkkhj). O kkkkdy não é sequence flow direto; é **sinalização ao kkkkh0**, que finaliza a kkkk65 ativa (se houver) e reabre o kkkk55 kkkkhj correto no kkkkvi desejado.

**Fluxo:**

1. Usuário aciona "Voltar" na UI (ex.: de kkkkid para kkkkih).
2. kkkkra envia evento de kkkkgu com **destino** (kkkk9q ou etapa).
3. kkkkqa publica **mensagem** para o kkkke4 (ex.: mensagem "kkkkgu" com kkkkmn).
4. kkkkh0 trata a mensagem (ex.: Boundary Event), **finaliza a kkkk5h ativa do kkkk55 kkkkhj** em execução (se houver).
5. kkkkh0 inicia (ou reabre) o kkkk55 kkkkhj correspondente ao destino, passando **kkkkvi** (variável `checkpoint_task_key` que corresponde ao ID da User kkkk8l no kkkkhk).

**Contrato de kkkkmn (kkkkgu):**

O kkkkmn da mensagem enviada ao kkkkh0 deve usar o campo **`checkpoint_task_key`** para evitar ambiguidade. Exemplo:

```json
{
  "checkpoint_task_key": "kkkkih"
}
```

| Campo / conceito | Descrição |
| ------------------ | ----------- |
| **`checkpoint_task_key`** | Identificador da kkkk9q de destino no kkkkhk (equivalente ao `kkkksi` da User kkkk8l). Valor único e estável (ex.: `kkkkih`, `dados_pessoais`). |
| **Variável `kkkkgu`** | No kkkk51, kkkkaf avaliam `kkkkgu` (ex.: `kkkkgu == "kkkkih"`). Na kkkksk decomposta, o destino é enviado no kkkkmn da mensagem via `checkpoint_task_key`. |
| **Mensagem ao kkkkh0** | kkkkqa envia mensagem correlacionada à kkkk5h do kkkkh0 (business key da kkkk3l) com kkkkmn contendo `checkpoint_task_key`. |
| **Checkpoint no kkkkhj** | Ao reabrir a kkkkem do kkkkhj, o kkkkh0 repassa o kkkkvi (ex.: variável de entrada com `checkpoint_task_key`) para o kkkkhj ou à UI abrir na kkkk9q correta. |

**Referência:** [kkkk25](../kkkk7p/kkkk25) (kkkkhk-DEC-005), [kkkk5z](../kkkk7p/kkkk5z).

---

## 2. Retomar (kkkk3w, timeout, relogin, kkkkdy do kkkk1x)

**Definição:** O kkkk1x (ou o sistema) **kkkkdp à kkkkgq** em uma sessão posterior. Não é "kkkkgu" dentro da mesma sessão; é **reabrir a mesma kkkk5h de kkkk55** e levar o usuário à **User kkkk8l ativa** correspondente.

**Mecanismo único (padrão de kkkkuh kkkksg):**

- kkkkqa obtém a kkkk5h do kkkkh0 associada à kkkk3l (via business key; internamente pode usar `kkkkco`).
- kkkkqa kkkkml no engine a **User kkkk8l ativa** dessa kkkk5h (ou usa kkkkvi persistido).
- kkkkra é **redirecionado** para a tela/etapa dessa kkkk9q (ex.: via `checkpoint_task_key` retornado pelo kkkku2).

O engine **não "retoma"** uma kkkk5h parada; a kkkk5h permanece com uma ou mais kkkkpp ativas. O kkkku2 **identifica a kkkk9q ativa** e **redireciona o kkkk1x** para a etapa correspondente na interface.

**Casos de uso:**

| Caso       | Gatilho              | Autenticação / kkkkvd      |
| ------------ | ---------------------- | ---------------------------- |
| **kkkkuz**| Link por e-mail/SMS  | `kkkkej` na URL     |
| **Timeout**| Sessão expirada      | Relogin; sessão associa kkkk3l |
| **Relogin**| Usuário saiu e voltou| Sessão/cookie; kkkk3l em contexto |
| **Retorno**| kkkkmf reabre app   | Mesmo mecanismo de sessão/kkkk3l |

**Contrato de kkkkmn (retomada):**

| Campo | Descrição |
| ------- | ----------- |
| `kkkkfi` | Identificador de kkkkag da kkkk3l (business key; usado para correlação com a kkkk5h do kkkkh0). |
| `checkpoint_task_key` | User kkkk8l atual da kkkkgq (ID no kkkkhk); evita divergência entre stepper UI e kkkk55 real. O kkkku2 pode obter via API do engine a partir da kkkk9q ativa. |
| Resume kkkkvd (ex.: kkkk3w) | Opcional; quando aplicável (kkkk3w), kkkkvd de uso único ou com expiração. |

*Nota:* `kkkkco` é uso interno do kkkku2/engine; não deve ser exposto ao front-end.

**kkkkip na retomada:**

- **Token** (quando aplicável): prazo de expiração do link/kkkkvd (ex.: `kkkkvb`).
- **kkkklg:** kkkk3l deve existir, estar ativa e não expirada (ex.: não expurgada). Se a kkkk3l estiver encerrada ou expirada, a retomada deve ser **negada**.

**Referência:** [kkkk29](../kkkk7p/kkkk29) (JORNADA-DEC-001).

---

## 3. kkkkuz (caso de uso de retomada)

**Definição:** Fluxo em que o **kkkk38** gera um link (kkkk3w) para o **kkkk1x** continuar a kkkkp3 de onde estiver. O kkkk1x acessa o link e **retoma a mesma kkkk5h de kkkk55** associada à kkkk3l (não se cria nova kkkk5h).

**Contrato específico:**

| Campo | Descrição |
| ------- | ----------- |
| `kkkkej` | Token de retomada (incluído no link). |
| `kkkkvb` | Data/hora de expiração do link. |
| Regra de kkkkag | Retomada negada se kkkk3l encerrada ou expirada (ex.: expurgo), mesmo com kkkkvd válido. |

Fluxo técnico detalhado e regras de expiração estão no kkkk7p JORNADA-DEC-001.

---

## 4. Checkpoint

**Definição:** Identificador da **posição atual** do usuário na kkkkgq, usado para kkkkgu e para retomar. Deve ser **alinhado ao kkkkhk** para evitar divergência entre stepper UI e kkkk55 real.

**Regra:** Usar o identificador da User kkkk8l no kkkkhk como kkkkvi, padronizado no contrato como **`checkpoint_task_key`** (não um "step" numérico nem nome de tela). Assim:

- O kkkkh0 (ou o kkkku2) sabe qual kkkk9q está ativa.
- O front pode mapear `checkpoint_task_key` → tela/etapa.
- Voltar e retomar usam o mesmo conceito.

**Onde é usado:**

- **Voltar:** kkkkh0 reabre kkkk55 kkkkhj no kkkkvi (kkkk9q) de destino.
- **Retomar:** kkkkqa kkkkml User kkkk8l ativa (ou lê kkkkvi persistido) e redireciona o kkkk1x para a etapa correspondente.

---

## 5. kkkkem (relação com eventos)

**Definição:** O kkkke4 orquestra a kkkkgq iniciando kkkk0n via **kkkkem**. Cada kkkkhj recebe variáveis de entrada e devolve variáveis de saída; **não mantém estado navegacional** entre invocações.

**Relação com os eventos:**

- **Voltar:** O kkkkh0 pode **cancelar** a kkkkem em execução (Boundary Event) e **iniciar outra** kkkk65 (kkkk55 kkkkhj de etapa anterior) com variáveis de entrada que representem o kkkkvi.
- **Retomar:** A kkkk5h do **kkkkh0** permanece ativa (com uma ou mais kkkkpp ativas, possivelmente dentro de uma kkkk65). Retomar = identificar a kkkk9q ativa do kkkkh0 (ou do kkkkhj em execução) e redirecionar.
- **Checkpoint:** Pode ser a kkkk9q ativa **no kkkkh0** ou a kkkk9q ativa **dentro do kkkk55 kkkkhj** em execução; o kkkku2 deve resolver a kkkk5h e a kkkk9q corretas (ex.: via API do engine).

Contrato de variáveis de entrada/saída, ciclo de vida e diretrizes de modelagem: [kkkkva](kkkkva), [kkkkvc](kkkkvc).

---

## Resumo do contrato de kkkkmn

| Evento / conceito | Payload / dados chave |
| ------------------- | ------------------------ |
| **Voltar**        | Mensagem ao kkkkh0: correlação por **business key da kkkk3l**; kkkkmn com `checkpoint_task_key` (ex.: `{"checkpoint_task_key": "kkkkih"}`). Variável `kkkkgu` no kkkk51; na kkkkgv, kkkkmn da mensagem. |
| **Retomar**       | kkkkfi (business key), `checkpoint_task_key` (User kkkk8l ativa; kkkku2 obtém do engine). Opcional: kkkkj0 kkkkvd (kkkk3w), kkkkvb. kkkk56: kkkk3l ativa e não expirada. |
| **kkkkuz**       | kkkkej, kkkkvb; mesma estrutura de retomada + regras de expiração da kkkk3l. |
| **Checkpoint**    | `checkpoint_task_key` (ID da User kkkk8l no kkkkhk; não step numérico nem nome de tela). |
| **kkkkem** | Variáveis de entrada/saída conforme CONTRATO_VARIAVEIS; sem estado navegacional no kkkkhj. |

---

## Referências

| Documento | Uso |
| ----------- | ----- |
| [kkkkvl](kkkkvl) | Limites de responsabilidade, modelo de execução, correlação |
| [kkkkva](kkkkva) | Variáveis kkkkh0/kkkkhj, kkkk8i Contract Pattern |
| [kkkkvc](kkkkvc) | Stateless, ciclo de vida, persistência incremental |
| [kkkk5z](../kkkk7p/kkkk5z) | kkkku5 kkkkg2 sem estado próprio; kkkker |
| [kkkk25](../kkkk7p/kkkk25) | kkkkhk-DEC-005: kkkkgu cross-kkkkhk, kkkkc5 |
| [kkkk29](../kkkk7p/kkkk29) | JORNADA-DEC-001: retomada, kkkk3w, kkkkvi, expiração |
