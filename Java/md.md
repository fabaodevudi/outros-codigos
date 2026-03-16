# kkkkka de kkkk53 kkkkho — kkkkpa kkkkh0 e kkkkg2

Este kkkkta descreve a kkkksk detalhada da kkkk53 kkkkhk da kkkkfj (kkkke4 e kkkk0n), complementando o kkkk7p [kkkk5z](../kkkk7p/kkkk5z).

---

## kkkkz9

O kkkkho é a kkkksn de kkkklh kkkksg, originalmente modelada como um kkkk55 kkkkhk kkkkg4.

A kkkksk descrita neste kkkkta define a kkkkx2 desse kkkk55 em um modelo de kkkk53 composto por:

- um kkkk55 kkkkmc (kkkkh0)
- múltiplos kkkk0n responsáveis por etapas específicas da kkkkgq.

O objetivo é melhorar modularidade, kkkkf4 e capacidade de evolução do kkkk55.

---

## Limites de kkkkyr kkkkfu

**kkkkra-end**

- kkkkwy por: renderização da interface; reconstrução do estado visual a partir das kkkkvo; envio de eventos de kkkkwf (ex.: kkkker).
- Não é kkkkwz por: kkkkvx de estado da kkkkgq; kkkkwd de kkkkag críticas.

**kkkkqa / KK0027**

- kkkkwy por: kkkkth de dados recebidos do front; intermediação entre front e engine kkkkhk (kkkkho); publicação de mensagens para o kkkke4 (ex.: kkkker); exposição das kkkkvo necessárias para reconstrução da interface; KK0013 de tarefas e kkkku0 direta com a engine kkkkhk.
- A kkkksk alvo prevê kkkku0 **direta** do kkkku2 com a engine kkkkhk (kkkkho), sem a camada intermediária kkkkdr. A remoção da dependência do kkkkdr foi definida em kkkky8 de kkkkyy como **última etapa** da kkkkzw *(decisão registrada em documentação/transcrições de kkkkyy; kkkk7p formal pendente)*.

**Engine kkkkhk**

- kkkkwy por: execução dos kkkkpa; kkkkvx de kkkkvo; kkkk53 da kkkkgq.
- Não é kkkkwz por: reconstrução de estado de interface; controle de kkkkwf da UI.

---

## kkkkz9 kkkkfu (resumo)

- **kkkkvs kkkkmc (kkkkh0):** kkkkwz pela kkkk53 da kkkkgq e pela manutenção do estado autoritativo da kkkkgq (source of truth).
- **kkkku5 kkkkg2 (kkkkgx–4):** etapas específicas; cada reentrada = nova kkkk5h; sem estado navegacional próprio.
- **kkkkwh de vida:** kkkkh0 inicia kkkkem → kkkkhj recebe kkkkvo de entrada → executa lógica kkkkhk → kkkkdp kkkkvo de saída → encerra. Em reentrada, kkkkh0 inicia **nova kkkk5h** do kkkkhj; estado permanece no kkkkh0.

**Visão de kkkksk:**

```mermaid
flowchart LR
  FRONT["kkkkra-end"]
  KK0027["kkkkqa / KK0027"]
  ENGINE["kkkkhk Engine"]

  kkkkh0["kkkkvs kkkkh0<br/>(Source of Truth)"]
  FILHO["kkkkvs Filho<br/>(Execução Stateless)"]

  FRONT -->|"HTTP / UI events"| KK0027
  KK0027 -->|"commands / correlation"| ENGINE

  ENGINE -.->|"executes"| kkkkh0
  kkkkh0 -->|"kkkkem"| FILHO
  FILHO -->|"output variables"| kkkkh0

  ENGINE -->|"query state"| KK0027
  KK0027 -->|"view model"| FRONT

  %% Estilos padrão kkkky7
  style FRONT fill:#e2e3e5,stroke:#383d41,stroke-width:2px
  style KK0027 fill:#e2e3e5,stroke:#383d41,stroke-width:2px
  style ENGINE fill:#e2e3e5,stroke:#383d41,stroke-width:2px
  style kkkkh0 fill:#bbdefb,stroke:#0d4372,stroke-width:2px
  style FILHO fill:#bbdefb,stroke:#0d4372,stroke-width:2px
  linkStyle default stroke:#37474f,stroke-width:2px
```

---

## Modelo de execução das kkkk65 kkkk5t

As kkkk65 kkkk5t executadas pelo kkkke4 seguem o modelo de **execução isolada e descartável**:

- cada execução cria **nova kkkk5h do kkkk55 kkkkhj**
- o kkkk55 kkkkhj recebe **kkkkvo de entrada do kkkkh0**
- executa sua lógica kkkkhk
- kkkkdp **kkkkvo de saída**
- encerra a kkkk5h

kkkku5 kkkkg2 **não mantêm estado navegacional persistente** entre execuções.

Qualquer reentrada em uma etapa da kkkkgq resulta em **nova execução da kkkkem**, com os dados reconstruídos a partir das kkkkvo mantidas pelo kkkke4.

---

## Correlação de instâncias

A kkkku0 entre front-end, kkkku2 e engine kkkkhk utiliza uma **chave de correlação única da kkkkgq**, normalmente representada pela *business key* da kkkk5h do kkkke4.

Essa chave permite:

- correlacionar mensagens externas (ex.: kkkker)
- identificar a kkkk5h correta da kkkkgq
- rastrear execuções de kkkk0n

kkkku5 kkkkg2 devem herdar a mesma chave de correlação para garantir kkkkf4 completa da execução.

---

## Idempotência

kkkk65 kkkk5t devem ser tratadas como **operações idempotentes em relação às kkkkvo de entrada**: reiniciar um kkkk55 kkkkhj com o mesmo conjunto de kkkkvo não deve produzir efeitos colaterais indesejados. kkkku5 kkkkg2 que executam kkkkgc externas devem garantir kkkku1 (chaves de kkkku1, verificação prévia, ou delegação ao kkkkxv externo). Operações externas devem ser idempotentes ou protegidas por mecanismos de deduplicação.

---

## Observabilidade da execução

- O kkkke4 deve registrar eventos de início e término de cada kkkkem.
- O kkkku2 deve registrar mensagens de kkkker.
- Logs devem permitir reconstrução da kkkkxc de execução da kkkkgq para kkkkgt de incidentes e kkkku3.

---

## Tolerância a falhas

A kkkksk foi projetada para tolerar falhas em diferentes camadas:

**Falhas da engine kkkkhk**

Caso ocorra reinício da engine ou indisponibilidade temporária, o estado da kkkkgq permanece persistido nas kkkkvo do kkkke4, permitindo retomada segura da execução.

**Falhas de kkkk55 kkkkhj**

- O kkkkh0 mantém o estado da kkkkgq.
- Um kkkk55 kkkkhj pode ser reiniciado sem perda de consistência.

**Falhas de kkkku0 front → kkkku2**

- O kkkku2 pode repetir operações com segurança se a kkkkmr for idempotente.

**Falhas em kkkkgc externas**

- kkkku5 kkkkg2 devem aplicar estratégias de kkkkaa, fallback ou kkkkqp conforme necessário.

---

## Histórico e kkkku3

Instâncias anteriores de kkkk0n devem permanecer disponíveis no histórico da engine kkkkhk para kkkku3 (reconstruir kkkkxc real da kkkkgq, identificar reentradas). O histórico **não** deve ser utilizado como fonte de verdade do estado da kkkkgq — essa é o kkkkh0.

---

## Expiração de kkkkgq

Instâncias do kkkke4 devem possuir política de expiração ou timeout **configurável**. Após período de inatividade, a kkkkgq pode ser encerrada ou marcada como expirada, evitando crescimento indefinido de instâncias na engine kkkkhk.

---

## Modelo de kkkkuh

A kkkkuh pode ocorrer por:

- kkkker
- retomada por kkkk3w
- reentrada em etapa anterior

O kkkke4 é kkkkwz por:

- determinar o kkkkvi da kkkkgq
- iniciar nova kkkk5h do kkkk55 kkkkhj correspondente
- fornecer as kkkkvo necessárias para reconstrução da interface.

A retomada nunca depende do estado interno de kkkk0n.

---

## Princípios kkkkwm

A kkkksk da kkkk53 kkkkho segue os seguintes princípios:

- kkkku4 centralizada no kkkke4
- kkkku5 kkkkg2 kkkkjy e descartáveis
- Estado da kkkkgq mantido exclusivamente no kkkkh0
- KK0023 explícitos entre kkkkpa
- Reexecução segura das etapas da kkkkgq
- Separação entre kkkkwf da UI e execução kkkkhk

---

## Invariantes kkkkwm

As seguintes propriedades devem permanecer verdadeiras independentemente de evolução da kkkksk:

1. O kkkke4 é a **fonte autoritativa do estado da kkkkgq**.
2. kkkku5 kkkkg2 não devem persistir estado navegacional entre execuções.
3. kkkku5 kkkkg2 devem ser **reiniciáveis sem perda de consistência**.
4. A reconstrução da interface deve ser possível apenas com as kkkkvo armazenadas no kkkkh0.
5. kkkk65 kkkk5t devem ser idempotentes em relação às kkkkvo de entrada.
6. A kkkkwf da interface não deve alterar diretamente o kkkkvr kkkkhk.

---

## Garantias kkkkwm

A kkkksk garante:

- execução determinística dos kkkk0n
- kkkkf4 completa da kkkkgq
- reexecução segura de kkkk65 kkkk5t
- kkkkvz entre kkkkwf da UI e execução kkkkhk

---

## Trade-offs kkkkwm

A kkkksk privilegia simplicidade e previsibilidade na execução dos kkkkpa kkkkhk.

**kkkkyu**

- kkkk0n simples e reiniciáveis
- separação clara entre kkkk53 e execução de etapas
- alta kkkkf4 da kkkkgq
- kkkkvz entre kkkkwf da UI e kkkkvr kkkkhk

**Desvantagens**

- múltiplas instâncias de kkkk0n podem ser geradas em reentradas
- maior dependência da kkkkwb correta do kkkke4

---

## Evolução da kkkksk

Novas etapas da kkkkgq devem ser implementadas preferencialmente como:

- novos kkkk0n
- novos blocos kkkkh6 dentro de kkkkpa existentes
- novas kkkkgc encapsuladas em kkkkpq

Alterações estruturais na kkkk53 devem ser registradas como kkkk7p.

---

## Artefatos de descoberta e kkkkx2

| Artefato | Uso |
| ---------- | ----- |
| [kkkku6](kkkku6) | Quem é kkkkwz por cada parte do kkkk55 (kkkkxb) |
| [kkkku7](kkkku7) | Quem orquestra, quem executa, kkkku0, retentativas |
| [kkkk1v](kkkk1v) | Chamadas externas do kkkkhk (tarefa → serviço) |
| [kkkku8](kkkku8) | kkkkya da kkkkgv (kkkkh0 e kkkkg2) |
| [kkkku9](kkkku9) | kkkk5e de tarefas por kkkkhk |
| [kkkkua](kkkkua) | Estados da kkkk3l (retomada, expiração) |
| [kkkk1u](kkkk1u) | Sistemas que o kkkkhk chama (visão por kkkkxv) |
| [kkkkuw](kkkkuw) | User journeys (kkkk3w, kkkkgu, retomada) |

---

## Referências

- [kkkk7p — Preservação de estado ao reabrir kkkk0n](../kkkk7p/kkkk5z)
- [kkkkva](kkkkva)
- [kkkk1y](kkkk1y) — eventos kkkkgu, retomar, kkkk3w, kkkkvi
- [kkkkvc](kkkkvc)
