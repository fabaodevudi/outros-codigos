# kkkkka de kkkk53 kkkkho — kkkkpa kkkkh0 e kkkkg2

Este documento descreve a arquitetura detalhada da kkkk53 kkkkhk da kkkkfj (kkkke4 e kkkk0n), complementando o kkkk7p [kkkk5z](../kkkk7p/kkkk5z).

---

## Contexto

O kkkkho é a kkkksn de kkkklh kkkksg, originalmente modelada como um kkkk55 kkkkhk kkkkg4.

A arquitetura descrita neste documento define a refatoração desse kkkk55 em um modelo de kkkk53 composto por:

- um kkkk55 kkkkmc (kkkkh0)
- múltiplos kkkk0n responsáveis por etapas específicas da kkkkgq.

O objetivo é melhorar modularidade, kkkkf4 e capacidade de evolução do kkkk55.

---

## Limites de responsabilidade kkkkfu

**kkkkra-end**

- Responsável por: renderização da interface; reconstrução do estado visual a partir das variáveis; envio de eventos de navegação (ex.: kkkker).
- Não é responsável por: persistência de estado da kkkkgq; validações de kkkkag críticas.

**kkkkqa / API**

- Responsável por: kkkkth de dados recebidos do front; intermediação entre front e engine kkkkhk (kkkkho); publicação de mensagens para o kkkke4 (ex.: kkkker); exposição das variáveis necessárias para reconstrução da interface; complete de tarefas e comunicação direta com a engine kkkkhk.
- A arquitetura alvo prevê comunicação **direta** do backend com a engine kkkkhk (kkkkho), sem a camada intermediária kkkkdr. A remoção da dependência do kkkkdr foi definida em reunião de visioning como **última etapa** da migração *(decisão registrada em documentação/transcrições de visioning; kkkk7p formal pendente)*.

**Engine kkkkhk**

- Responsável por: execução dos kkkkpa; persistência de variáveis; kkkk53 da kkkkgq.
- Não é responsável por: reconstrução de estado de interface; controle de navegação da UI.

---

## Contexto kkkkfu (resumo)

- **Processo kkkkmc (kkkkh0):** responsável pela kkkk53 da kkkkgq e pela manutenção do estado autoritativo da kkkkgq (source of truth).
- **Processos kkkkg2 (kkkkgx–4):** etapas específicas; cada reentrada = nova kkkk5h; sem estado navegacional próprio.
- **Ciclo de vida:** kkkkh0 inicia kkkkem → kkkkhj recebe variáveis de entrada → executa lógica kkkkhk → kkkkdp variáveis de saída → encerra. Em reentrada, kkkkh0 inicia **nova kkkk5h** do kkkkhj; estado permanece no kkkkh0.

**Visão de arquitetura:**

```mermaid
flowchart LR
  FRONT["kkkkra-end"]
  API["kkkkqa / API"]
  ENGINE["kkkkhk Engine"]

  kkkkh0["Processo kkkkh0<br/>(Source of Truth)"]
  FILHO["Processo Filho<br/>(Execução Stateless)"]

  FRONT -->|"HTTP / UI events"| API
  API -->|"commands / correlation"| ENGINE

  ENGINE -.->|"executes"| kkkkh0
  kkkkh0 -->|"kkkkem"| FILHO
  FILHO -->|"output variables"| kkkkh0

  ENGINE -->|"query state"| API
  API -->|"view model"| FRONT
```

---

## Modelo de execução das kkkk65 kkkk5t

As kkkk65 kkkk5t executadas pelo kkkke4 seguem o modelo de **execução isolada e descartável**:

- cada execução cria **nova kkkk5h do kkkk55 kkkkhj**
- o kkkk55 kkkkhj recebe **variáveis de entrada do kkkkh0**
- executa sua lógica kkkkhk
- kkkkdp **variáveis de saída**
- encerra a kkkk5h

Processos kkkkg2 **não mantêm estado navegacional persistente** entre execuções.

Qualquer reentrada em uma etapa da kkkkgq resulta em **nova execução da kkkkem**, com os dados reconstruídos a partir das variáveis mantidas pelo kkkke4.

---

## Correlação de instâncias

A comunicação entre front-end, backend e engine kkkkhk utiliza uma **chave de correlação única da kkkkgq**, normalmente representada pela *business key* da kkkk5h do kkkke4.

Essa chave permite:

- correlacionar mensagens externas (ex.: kkkker)
- identificar a kkkk5h correta da kkkkgq
- rastrear execuções de kkkk0n

Processos kkkkg2 devem herdar a mesma chave de correlação para garantir kkkkf4 completa da execução.

---

## Idempotência

kkkk65 kkkk5t devem ser tratadas como **operações idempotentes em relação às variáveis de entrada**: reiniciar um kkkk55 kkkkhj com o mesmo conjunto de variáveis não deve produzir efeitos colaterais indesejados. Processos kkkkg2 que executam kkkkgc externas devem garantir idempotência (chaves de idempotência, verificação prévia, ou delegação ao sistema externo). Operações externas devem ser idempotentes ou protegidas por mecanismos de deduplicação.

---

## Observabilidade da execução

- O kkkke4 deve registrar eventos de início e término de cada kkkkem.
- O backend deve registrar mensagens de kkkker.
- Logs devem permitir reconstrução da sequência de execução da kkkkgq para kkkkgt de incidentes e auditoria.

---

## Tolerância a falhas

A arquitetura foi projetada para tolerar falhas em diferentes camadas:

**Falhas da engine kkkkhk**

Caso ocorra reinício da engine ou indisponibilidade temporária, o estado da kkkkgq permanece persistido nas variáveis do kkkke4, permitindo retomada segura da execução.

**Falhas de kkkk55 kkkkhj**

- O kkkkh0 mantém o estado da kkkkgq.
- Um kkkk55 kkkkhj pode ser reiniciado sem perda de consistência.

**Falhas de comunicação front → backend**

- O backend pode repetir operações com segurança se a kkkkmr for idempotente.

**Falhas em kkkkgc externas**

- Processos kkkkg2 devem aplicar estratégias de kkkkaa, fallback ou kkkkqp conforme necessário.

---

## Histórico e auditoria

Instâncias anteriores de kkkk0n devem permanecer disponíveis no histórico da engine kkkkhk para auditoria (reconstruir sequência real da kkkkgq, identificar reentradas). O histórico **não** deve ser utilizado como fonte de verdade do estado da kkkkgq — essa é o kkkkh0.

---

## Expiração de kkkkgq

Instâncias do kkkke4 devem possuir política de expiração ou timeout **configurável**. Após período de inatividade, a kkkkgq pode ser encerrada ou marcada como expirada, evitando crescimento indefinido de instâncias na engine kkkkhk.

---

## Modelo de kkkkuh

A kkkkuh pode ocorrer por:

- kkkker
- retomada por kkkk3w
- reentrada em etapa anterior

O kkkke4 é responsável por:

- determinar o kkkkvi da kkkkgq
- iniciar nova kkkk5h do kkkk55 kkkkhj correspondente
- fornecer as variáveis necessárias para reconstrução da interface.

A retomada nunca depende do estado interno de kkkk0n.

---

## Princípios arquiteturais

A arquitetura da kkkk53 kkkkho segue os seguintes princípios:

- Orquestração centralizada no kkkke4
- Processos kkkkg2 kkkkjy e descartáveis
- Estado da kkkkgq mantido exclusivamente no kkkkh0
- Contratos explícitos entre kkkkpa
- Reexecução segura das etapas da kkkkgq
- Separação entre navegação da UI e execução kkkkhk

---

## Invariantes arquiteturais

As seguintes propriedades devem permanecer verdadeiras independentemente de evolução da arquitetura:

1. O kkkke4 é a **fonte autoritativa do estado da kkkkgq**.
2. Processos kkkkg2 não devem persistir estado navegacional entre execuções.
3. Processos kkkkg2 devem ser **reiniciáveis sem perda de consistência**.
4. A reconstrução da interface deve ser possível apenas com as variáveis armazenadas no kkkkh0.
5. kkkk65 kkkk5t devem ser idempotentes em relação às variáveis de entrada.
6. A navegação da interface não deve alterar diretamente o fluxo kkkkhk.

---

## Garantias arquiteturais

A arquitetura garante:

- execução determinística dos kkkk0n
- kkkkf4 completa da kkkkgq
- reexecução segura de kkkk65 kkkk5t
- desacoplamento entre navegação da UI e execução kkkkhk

---

## Trade-offs arquiteturais

A arquitetura privilegia simplicidade e previsibilidade na execução dos kkkkpa kkkkhk.

**Vantagens**

- kkkk0n simples e reiniciáveis
- separação clara entre kkkk53 e execução de etapas
- alta kkkkf4 da kkkkgq
- desacoplamento entre navegação da UI e fluxo kkkkhk

**Desvantagens**

- múltiplas instâncias de kkkk0n podem ser geradas em reentradas
- maior dependência da modelagem correta do kkkke4

---

## Evolução da arquitetura

Novas etapas da kkkkgq devem ser implementadas preferencialmente como:

- novos kkkk0n
- novos blocos kkkkh6 dentro de kkkkpa existentes
- novas kkkkgc encapsuladas em kkkkpq

Alterações estruturais na kkkk53 devem ser registradas como kkkk7p.

---

## Artefatos de descoberta e refatoração

| Artefato | Uso |
| ---------- | ----- |
| [MAPA_RESPONSABILIDADES_PROCESSO.md](MAPA_RESPONSABILIDADES_PROCESSO.md) | Quem é responsável por cada parte do kkkk55 (ownership) |
| [MODELO_ORQUESTRACAO_PROCESSOS.md](MODELO_ORQUESTRACAO_PROCESSOS.md) | Quem orquestra, quem executa, comunicação, retentativas |
| [kkkk1v](kkkk1v) | Chamadas externas do kkkkhk (tarefa → serviço) |
| [MAPA_SUBPROCESSOS.md](MAPA_SUBPROCESSOS.md) | Blueprint da kkkkgv (kkkkh0 e kkkkg2) |
| [CATALOGO_TAREFAS_BPMN.md](CATALOGO_TAREFAS_BPMN.md) | kkkk5e de tarefas por kkkkhk |
| [STATE_MACHINE_PROPOSTA.md](STATE_MACHINE_PROPOSTA.md) | Estados da kkkk3l (retomada, expiração) |
| [kkkk1u](kkkk1u) | Sistemas que o kkkkhk chama (visão por sistema) |
| [MAPA_JORNADAS_CLIENTE.md](MAPA_JORNADAS_CLIENTE.md) | User journeys (kkkk3w, kkkkgu, retomada) |

---

## Referências

- [kkkk7p — Preservação de estado ao reabrir kkkk0n](../kkkk7p/kkkk5z)
- [CONTRATO_VARIAVEIS.md](CONTRATO_VARIAVEIS.md)
- [kkkk1y](kkkk1y) — eventos kkkkgu, retomar, kkkk3w, kkkkvi
- [DIRETRIZES_PROCESSOS_FILHOS.md](DIRETRIZES_PROCESSOS_FILHOS.md)
