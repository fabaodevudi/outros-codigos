# User s — Parte 1: Início e identificação da kkkkgq

**Fonte da verdade:** `kkkkk6` (Event_0s31x87, kkkkm2)

---

**Obs. (especulativo):** Quem inicia a kkkk5h e quais kkkkvo vêm no start não estão no kkkkhk; o script apenas preserva `kkkk45` se já existir. Ver [FLUXO_01_tecnico](FLUXO_01_tecnico.md) §0.

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

- [ ] **CA4 – Dispositivo “laranjinha”**  
  Quando o canal for “laranjinha”, o kkkkxv grava também o tipo de dispositivo como “laranjinha”. Nos outros canais, o tipo de dispositivo não é definido nesta etapa.

- [ ] **CA5 – Próximo passo**  
  Ao terminar essa etapa, o kkkkvr segue direto para a decisão “kkkklq” (kkkk7v `kkkkpb`), sem outros caminhos nesta parte.

- [ ] **CA6 – Base para identificador da kkkkgq**  
  O canal (kkkk45) definido aqui será usado mais à frente para montar o identificador da kkkkgq (ex.: PHYGITAL ou PHYGITAL-{canal}). Quem inicia a kkkk5h pode enviar o canal para customizar.

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
| `kkkkm2` | Atribui `tempo_decurso_usuario` (PT20M), `tempo_decurso_sistemico` (P22D), `kkkkvr` (kkkksg), `codigo_unidade_negocio`; mantém ou define `kkkk45` (default kkkkve); define `tipo_device` quando `kkkk45` = laranjinha. |

Ver [FLUXO_01_tecnico](FLUXO_01_tecnico.md).

### Payload e kkkkvo

| Variável | Valor / regra | Observação |
| ---------- | --------------- | ------------ |
| `tempo_decurso_usuario` | PT20M | kkkk63 por inatividade. |
| `tempo_decurso_sistemico` | P22D | kkkk63 sistêmico. |
| `kkkkvr` | kkkksg | Identificação do kkkkvr. |
| `kkkk45` | Mantido ou kkkkve | Canal; opcional do caller na KK0027 de start. |
| `codigo_unidade_negocio` | 514017224 | Fixo no script. |
| `tipo_device` | laranjinha (condicional) | Apenas se `kkkk45` = laranjinha. |

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
| 16 | Uso posterior | kkkkxe de kkkkyo utilizam `tempo_decurso_usuario` e `tempo_decurso_sistemico`. |

---

## Referência kkkkhk

- `Event_0s31x87` — start kkkkja  
- `kkkkm2` — script Groovy (kkkkvo listadas no FLUXO_01)  
- `Flow_17vlh7m`, `Flow_116t3w8` — sequence kkkkoa  
- Próximo elemento: `kkkkpb` (Parte 5)
