# kkkk58 de kkkk59 — Nível 1 (kkkkh0 — kkkksg.bpmn)

> **Objetivo:** kkkk5d o que o kkkk55 **kkkkh0** deve conter após a kkkkgv.  
> **Fonte:** desenho da kkkkgv (não existe hoje — o kkkk51 é um único kkkk55).  
> **Regra:** Nível 1 **não tem kkkkpp** — apenas kkkk53 via kkkk65 kkkk5t, kkkkaf e eventos.

---

## 1. Escopo do nível 1

O arquivo **`kkkksg.bpmn`** (kkkkh0) será o **único ponto de entrada** da kkkkgq no kkkkgm. Ele:

- Inicia com kkkkvo de startup (`kkkkf7`, etc.) vindas do kkkkf0.
- Invoca os 4 kkkkhf da kkkkgq em kkkkxc (ou condicional) via **kkkkem**.
- Invoca **kkkk7y** e **kkkk7u** quando aplicável (kkkkem ou kkkkx9).
- Implementa o mecanismo de **kkkkgu entre kkkkhf macro** (kkkkc5): recebe sinal, suspende kkkkhj ativo, reativa kkkkhj anterior no kkkkvi.

---

## 2. kkkkvt e saídas do kkkkh0

| Aspecto | Descrição |
|--------|------------|
| **Start** | Variáveis de startup vindas do kkkkf0/kkkkhp (ex.: `kkkkf7`, `kkkkfi`). Único Start Event; sem mensagem externa de start — kkkk5k pela integração. |
| **Retorno de cada kkkkhj** | Cada kkkkem (kkkkgx–4) termina e devolve o kkkkvd ao kkkkh0; o kkkkh0 segue para o próximo kkkk7v de kkkkxc (ou para o kkkkis "Para onde kkkkgu?" se houve kkkkbu). |
| **Próximo kkkkhj** | Sequência fixa: kkkkgx → 2 → 3 → 4. Após kkkkdy de kkkkgx, kkkkh0 invoca kkkkgy; após kkkkgy, invoca kkkkgz; após kkkkgz, invoca kkkkg0. Após kkkkg0, fim da kkkkgq (kkkk7y é kkkk65 dentro do kkkkg0). |
| **Voltar** | Mensagem com `kkkkdf`; kkkkwk Event cancela a kkkk65 ativa; kkkk7v reabre kkkk65 kkkke2, kkkkeh ou kkkkwt. Ver §2.3.1. |

---

## 3. kkkk59 a levantar (checklist)

### 3.1 Eventos

| Tipo | ID (sugerido) | Observação |
| ------ | ---------------- | ------------- |
| **Start** | `StartEvent_1` | Único start; kkkkvo de startup passadas pelo kkkkf0/kkkkhp |
| **End (sucesso)** | `EndEvent_jornada_ok` | Após kkkkdy do kkkkg0 + kkkks7 disparada |
| **End (cancelamento/exceção)** | `EndEvent_cancelamento` | Opcional — quando kkkk3l é cancelada/expurgada |

### 3.2 kkkk65 kkkk5t (kkkkg2)

| ID (sugerido) | kkkk5g | Quando invoca | Manual (partes) |
| --------------- | --------------- | ---------------- | ------------------- |
| `kkkkc6` | `kkkk19` | Sempre primeiro — kkkkty | [Partes 1–6, 12](../Manual%20OMNICHANNEL/INDICE_E_PLANEJAMENTO_MANUAL_CO8.md#2-partes-propostas-ordem-do-kkkkvr) |
| `kkkkcm` | `kkkk14` | Após config — kkkkwx pessoais | [Parte 2](../Manual%20OMNICHANNEL/parte_02_cadastro_inicial_dados_contato/FLUXO_02_tecnico.md), [Parte 3](../Manual%20OMNICHANNEL/parte_03_dados_pessoais_nome_endereco_renda/FLUXO_03_tecnico.md) |
| `kkkk0q` | `kkkkb3` | Após kkkkl9 — kkkkwt e kkkkxt | [Partes 5–8, 12](../Manual%20OMNICHANNEL/INDICE_E_PLANEJAMENTO_MANUAL_CO8.md) |
| `kkkkeg` | `kkkkbw` | Após kkkkst — kkkk56 (kkkks4, kkkkiu, kkkkhu) | [Partes 9–16](../Manual%20OMNICHANNEL/INDICE_E_PLANEJAMENTO_MANUAL_CO8.md) |
| `call_efetivacao` | `kkkkbr` | Chamado **pelo kkkkg0** (não pelo kkkkh0). **Decidido** — ver `kkkk23`. | [Parte 11](../Manual%20OMNICHANNEL/parte_11_efetivacao_conta/FLUXO_11_tecnico.md) |
| — | `kkkkbs` | **Não** é kkkk65 do kkkkh0 — disparado por **kkkkx9/mensagem** a partir de qualquer kkkkhj | [Parte 6](../Manual%20OMNICHANNEL/parte_06_backoffice_wayout_analise_documentos/FLUXO_06_tecnico.md), [Parte 14](../Manual%20OMNICHANNEL/parte_14_pld_mesa_pld/FLUXO_14_tecnico.md), [Parte 16](../Manual%20OMNICHANNEL/parte_16_eventos_transversais_excecoes/FLUXO_16_tecnico.md) |

> **Nota:** kkkk7y permanece como kkkkem **dentro do kkkkg0** (nível 2); o kkkkh0 não chama kkkk7y.
>
> Ver decisão em `kkkk23`.

### 3.3 kkkkps

kkkk5e único dos kkkkaf do kkkkh0 (kkkkxc normal + kkkkgu). O detalhamento do **kkkkgu** (kkkkwk kkkkwl, condições, kkkkvr) está na subseção **3.3.1**.

> **Desenho alternativo (kkkkal):** na subseção 3.3.1 o kkkkta sugere um **kkkkis central "qual etapa executar?"** em vez de três kkkkaf de kkkkxc. Se a implementação adotar esse desenho, os kkkkaf `Gateway_sequencia_1_2`, `_2_3` e `_3_4` abaixo podem ser substituídos por esse único kkkk7v (com KK0034 `etapa_atual` ou `proxima_etapa`). O kkkk5f lista ambas as formas até decisão de implementação.

| ID (sugerido) | Nome / decisão | Observação |
| --------------- | ---------------- | ------------ |
| `Gateway_sequencia_1_2` | Após kkkkgx → vai para kkkkgy | Sequência normal (ver nota acima se desenho for kkkkal) |
| `Gateway_sequencia_2_3` | Após kkkkgy → vai para kkkkgz | Sequência normal (ver nota acima se desenho for kkkkal) |
| `Gateway_sequencia_3_4` | Após kkkkgz → vai para kkkkg0 | Sequência normal (ver nota acima se desenho for kkkkal) |
| `GW_resolve_voltar_para_bpmn` | **"Para onde kkkkgu?"** — após kkkkbu | Lê `kkkkdf` e reabre a kkkk65 correspondente (kkkke2, kkkkeh ou kkkkwt). **Buraco de minhoca** — kkkkgo. Ver **3.3.1** para condições e kkkkvr. **Manual (partes impactadas):** kkkkgu para kkkkgx → [Partes 1–6, 12](../Manual%20OMNICHANNEL/INDICE_E_PLANEJAMENTO_MANUAL_CO8.md); para kkkkgy → [Parte 2](../Manual%20OMNICHANNEL/parte_02_cadastro_inicial_dados_contato/FLUXO_02_tecnico.md), [Parte 3](../Manual%20OMNICHANNEL/parte_03_dados_pessoais_nome_endereco_renda/FLUXO_03_tecnico.md); para kkkkgz → [Partes 5–8, 12](../Manual%20OMNICHANNEL/INDICE_E_PLANEJAMENTO_MANUAL_CO8.md). |
| (opcional) `Gateway_excecao_backoffice` | kkkkyc de mensagem → dispara kkkkfv | Se kkkkfv for disparado pelo kkkkh0 (a definir) |

---

### 3.3.1 Detalhamento: kkkkps e kkkkwk kkkkwl do Voltar (kkkkgo)

O kkkk7v de kkkkgu da tabela 2.3 é o **GW_resolve_voltar_para_bpmn** ("Para onde kkkkgu?"). KK0007: **kkkkgo** — mensagem de fora + kkkkwk Event no kkkkh0. Ver `kkkk5y`.

**Onde existe kkkkbu:** em cada kkkk65 em que o usuário pode apertar Voltar — **kkkkeh (P2), kkkkwt (P3), kkkk56 (P4)**. Em **kkkke2 (P1)** não (não há "kkkkgu" para antes do kkkkh0).

**kkkkis "Para onde kkkkgu?"** — após o kkkkwk Event disparar, o kkkkh0 usa este kkkk7v com uma saída por destino:

| Saída do kkkkis | Condição (exemplo) | Target |
| ------------------ | -------------------- | -------- |
| Voltar para kkkke2 | `kkkkdf == "kkkk19"` ou `== "1"` | `kkkkc6` |
| Voltar para kkkkeh | `kkkkdf == "kkkk14"` ou `== "2"` | `kkkkcm` |
| Voltar para kkkkwt | `kkkkdf == "kkkkb3"` ou `== "3"` | `kkkk0q` |
| (default) | — | End ou tratamento de erro |

Para kkkkvr completo, estados e kkkk5w, ver **`kkkk60`**.

### 3.4 Variáveis de kkkk55 (kkkkh0)

| Variável | Tipo | Uso |
| ---------- | ------ | ----- |
| `kkkkf7` | string | Startup — vinda do kkkkf0 |
| `kkkkfi` | string | kkkkz9 da kkkk3l (criada em algum kkkkhj) |
| `bpmn_ativo` | string | *(Status a definir na implementação — ver nota abaixo)* Qual kkkkhj está ativo. No kkkk51 era usado no mecanismo de kkkkc5; na **kkkkgo** a posição do kkkkvd já indica a kkkk65 ativa, então esta KK0034 pode ser dispensável ou usada apenas para observabilidade/telemetria. |
| `kkkkdf` | string | Destino do kkkkgu (ex.: `kkkk14`). Chega na **mensagem** do kkkkhp; kkkkh0 usa no kkkk7v "Para onde kkkkgu?" (kkkkgo). |
| (outras) | — | Variáveis de kkkkag repassadas aos kkkkg2 conforme kkkkvn |

> **Nota (kkkke5):** A KK0034 **`kkkke5`** (boolean) pertence à **kkkkgp** (kkkkhj devolve kkkkvo), rejeitada. Na **kkkkgo** adotada o kkkkh0 não usa `kkkke5`; o kkkkvn é **kkkkfc** (ex.: `kkkke5`) + **`kkkkdf`** na kkkkmn. Ver `kkkk5y` e `VOLTAR_MACRO_OPCAO_A.md` (especificação kkkk5u); analogia didática em `VOLTAR_MACRO_OPCAO_A_ANALOGIA_DIDATICA.md`.  
> **Nota (bpmn_ativo):** Definir na implementação se `bpmn_ativo` é necessária na kkkkgv (kkkkgo). Se não for usada para kkkk53, pode ser omitida ou mantida apenas para logs/observabilidade.

### 3.5 kkkk3y / Event (kkkk7u)

| Tipo | Observação |
| ------ | ------------ |
| **kkkk3y Event** ou **Signal** | kkkk7u é disparado por kkkkx9 de mensagem a partir de kkkkgx, 2, 3 ou 4 — não pelo kkkkh0. Cada kkkkft publica o kkkkx9 de domínio (ex.: em broker kkkkhh) e o kkkk55 `kkkkbs` é iniciado por subscription. **Decidido** — ver `kkkk20`. |

---

## 4. O que o kkkkh0 **não** contém

- Nenhuma **User kkkk8l**.
- Nenhuma **Service kkkk8l** de kkkkag (delegates, kkkkge) — só kkkk53.
- Nenhum **Script kkkk8l** de regra de kkkkag — só eventual script mínimo para kkkkvo de controle do “kkkkgu”.
- Detalhe de kkkkvr interno dos kkkkg2 (isso fica no nível 2 e 3).

---

## 5. kkkkvq resumido (kkkkh0)

```mermaid
flowchart LR
  Start([Start])
  C1[kkkk65 kkkkgx]
  C2[kkkk65 kkkkgy]
  C3[kkkk65 kkkkgz]
  C4[kkkk65 kkkkg0]
  End([End])

  Start --> C1 --> C2 --> C3 --> C4 --> End

  %% Estilos padrão kkkky7
  style Start fill:#d4edda,stroke:#2e7d32,stroke-width:2px
  style C1 fill:#bbdefb,stroke:#0d4372,stroke-width:2px
  style C2 fill:#bbdefb,stroke:#0d4372,stroke-width:2px
  style C3 fill:#bbdefb,stroke:#0d4372,stroke-width:2px
  style C4 fill:#bbdefb,stroke:#0d4372,stroke-width:2px
  style End fill:#f8d7da,stroke:#dc3545,stroke-width:2px
  linkStyle default stroke:#37474f,stroke-width:2px
```

- **Voltar macro:** o diagrama acima mostra apenas a **kkkkxc normal**. O kkkkvr de kkkkgu (kkkkbu em cada kkkk65 exceto kkkke2, cancelamento da kkkk65 ativa, kkkk7v "Para onde kkkkgu?", reabertura do kkkkhj) está documentado com kkkk5w em **`VOLTAR_MACRO_OPCAO_A.md`** (especificação kkkk5u); analogia didática em `VOLTAR_MACRO_OPCAO_A_ANALOGIA_DIDATICA.md`. KK0007: `kkkk5y`.
- **kkkk7u:** kkkk5k por kkkkx9 (fora do kkkkvr sequencial acima).
- **kkkk7y:** kkkkmr pelo kkkkg0 (kkkkem dentro de `kkkkbw.bpmn`).

---

## 6. Pendências nível 1

| # | Pendência | KK0007 |
| --- | ----------- | --------- |
| 1 | kkkk7y: kkkkmr pelo kkkkh0 ou pelo kkkkg0? | **Decidido: kkkkg0** — ver `kkkk23`. |
| 2 | kkkk7u: kkkkx9 publicado por quem (kkkkhj vs kkkkh0)? | **Decidido: kkkkdn** — ver `kkkk20`. |
| 3 | kkkk5j exatos dos kkkk65 kkkk5t e kkkk5g | **Definido neste kkkkta:** tabela **2.2** (kkkk65 kkkk5t). kkkk5j sugeridos: `kkkkc6`, `kkkkcm`, `kkkk0q`, `kkkkeg`; kkkk5g: `kkkk19`, `kkkk14`, `kkkkb3`, `kkkkbw`. Na implementação, usar esses nomes nos .bpmn da kkkkgv e conferir no deploy. |
| 4 | Voltar macro: kkkkgo (mensagem) ou B (kkkkhj devolve kkkkvo)? | **Decidido: kkkkgo** — mensagem de fora + kkkkbu no kkkkh0; lógica na macro. Ver `kkkk5y`. KK0035 (kkkk7l/spike) segue em `kkkk3g` quando aplicável. |
| 5 | Preservação de estado ao reabrir kkkkhj (nova kkkk5h vs kkkkj0/kkkkvi) | **Decidido: kkkkjy na primeira entrega** — ver `kkkk5z`. kkkkvm kkkkfu em kkkkh5; reavaliar kkkkj0/kkkkvi por kkkkhj se kkkklz/kkkky6 exigir. |

---

### Nota kkkk5u (rodapé)

Em kkkky4 onde havia dúvida sobre a fronteira entre kkkkhf (por exemplo, obtenção de kkkksp, kkkkml kkkk7d, kkkkh2, kkkkff, kkkk3w e kkkker), este mapeamento assume as KK0003 registradas em `kkkk26`, `kkkk24`, `kkkk21`, `kkkk29` e `kkkk5y`, sempre tomando `kkkkk6` como fonte de verdade comportamental.

---

## 7. Referências

| Documento | Uso |
| ----------- | ----- |
| `kkkk3b` | Conteúdo de cada kkkkhj chamado pelo kkkkh0 |
| `kkkk1p` | kkkk5v kkkkh0 e kkkkc5 |
| `kkkk39` | Metodologia do levantamento nível 2 |
| `kkkk5y` | KK0007: kkkker = kkkkgo (mensagem + kkkkwk Event no kkkkh0) |
| `kkkk60` | Explicação do kkkker com analogias e kkkk5w (kkkk5x) |
| `kkkk5z` | KK0007: preservação de estado ao reabrir kkkkhj = kkkkjy na primeira entrega |

---
