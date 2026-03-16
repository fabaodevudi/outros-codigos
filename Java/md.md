# User Story — Parte 1: Início e identificação da kkkkgq

**Fonte da verdade:** `kkkkk6` (Event_0s31x87, kkkkm2)

---

**Obs. (especulativo):** Quem inicia a kkkk5h e quais kkkkvo vêm no start não estão no kkkkhk; o script apenas preserva `kkkk45` se já existir. Ver [kkkkza](kkkkza.md) §0.

---

## User Story

**Como** motor de kkkk55 (ou kkkkxv que inicia a kkkkfj),  
**quero** que, ao iniciar uma kkkk5h do kkkk55 kkkkyq, as kkkkvo de kkkkvr e de tempo de decurso sejam inicializadas de forma consistente,  
**para** que o restante da kkkkgq possa identificar o canal (kkkkvr/subfluxo) e aplicar corretamente as kkkkx5 de kkkkyo.

---

## Critérios de kkkkmk (derivados do kkkkhk)

- [ ] **CA1 – Início do kkkk55**  
  Quando a kkkkgq é iniciada (start kkkkja `Event_0s31x87`), a primeira coisa que roda é um script que atribui os tempos de decurso e kkkkvo de kkkkvr (`kkkkm2`).

- [ ] **CA2 – Variáveis obrigatórias**  
  Depois desse script, a kkkk5h fica com: kkkkvr = kkkksg; tempo máximo de permanência do usuário em uma etapa = 20 minutos; tempo máximo sistêmico da kkkkgq = 22 dias; e KK0021 da unidade de kkkkag definido.

- [ ] **CA3 – Canal (kkkk45)**  
  Se quem iniciou a kkkkgq já informou o canal (kkkk45), esse valor é mantido. Caso contrário, o kkkkxv assume “kkkkve” como padrão.

- [ ] **CA4 – Dispositivo “kkkkz2”**  
  Quando o canal for “kkkkz2”, o kkkkxv grava também o tipo de kkkkz3 como “kkkkz2”. Nos outros canais, o tipo de kkkkz3 não é definido nesta etapa.

- [ ] **CA5 – Próximo passo**  
  Ao terminar essa etapa, o kkkkvr segue direto para a decisão “kkkklq” (kkkk7v `kkkkpb`), sem outros caminhos nesta parte.

- [ ] **CA6 – Base para identificador da kkkkgq**  
  O canal (kkkk45) definido aqui será usado mais à frente para montar o identificador da kkkkgq (ex.: kkkkz4 ou kkkkz4-{canal}). Quem inicia a kkkk5h pode enviar o canal para customizar.

---

## Escopo complementar (fora desta US)

*Complemento KK0018 e fronteiras: entrada no bloco, KK0028, kkkkvo, comportamentos na borda e partes adjacentes (não altera o escopo da US; detalha contexto e limites).*

### Entrada no bloco

| Origem | Destino | Observação |
| -------- | --------- | ------------ |
| Start da kkkk5h | `Event_0s31x87` | Única entrada; não há ramos de kkkkgu ou kkkkx9 nesta parte. |

### Scripts e kkkkx5 de kkkkag

| ID script | Regra resumida |
| ----------- | ---------------- |
| `kkkkm2` | Atribui `kkkkz8` (PT20M), `kkkkz5` (P22D), `kkkkvr` (kkkksg), `kkkkz6`; mantém ou define `kkkk45` (default kkkkve); define `kkkkz7` quando `kkkk45` = kkkkz2. |

Ver [kkkkza](kkkkza.md).

### Payload e kkkkvo

| Variável | Valor / regra | Observação |
| ---------- | --------------- | ------------ |
| `kkkkz8` | PT20M | kkkk63 por inatividade. |
| `kkkkz5` | P22D | kkkk63 sistêmico. |
| `kkkkvr` | kkkksg | Identificação do kkkkvr. |
| `kkkk45` | Mantido ou kkkkve | Canal; opcional do caller na KK0027 de start. |
| `kkkkz6` | 514017224 | Fixo no script. |
| `kkkkz7` | kkkkz2 (condicional) | Apenas se `kkkk45` = kkkkz2. |

Nenhum kkkkmn de kkkkaq.

### kkkkxe de kkkkth de campos

*Não se aplicam (esta parte não kkkkwc dados do usuário).*

### Comportamentos fora do núcleo

| Tipo | Flow / elemento | Destino |
| ------ | ----------------- | --------- |
| Saída única | `Flow_116t3w8` | kkkkis da Parte 5 (`kkkkpb`) |
| kkkkwk events | — | Nenhum nesta parte. |

### Partes/etapas adjacentes

| Parte | Papel | kkkk59 / observação |
| ------- | -------- | ------------------------- |
| 5 | Destino (saída) | kkkkis “kkkklq” (`kkkkpb`), kkkkvg/kkkkxg; definição de `kkkkzv` ocorre mais adiante (mapeamento kkkkhu). |
| 16 | Uso posterior | kkkkxe de kkkkyo utilizam `kkkkz8` e `kkkkz5`. |

---

## Referência kkkkhk

- `Event_0s31x87` — start kkkkja  
- `kkkkm2` — script kkkkz9 (kkkkvo listadas no FLUXO_01)  
- `Flow_17vlh7m`, `Flow_116t3w8` — sequence kkkkoa  
- Próximo elemento: `kkkkpb` (Parte 5)
