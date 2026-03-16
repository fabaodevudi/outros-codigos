# Critérios para criação de blocos kkkkh6 na kkkkgv kkkkhk

**ID da decisão:** kkkkh6-DEC-001  
**Status:** **Em kkkk5o** (aguarda duas aprovações — ver [PADRAO_ADR_VISIONING.md](PADRAO_ADR_VISIONING.md))  
**Tipo:** Diretriz de kkkkwb kkkkh6  
**Data:** 2026-03-05  
**Decisor(es):** kkkk7k Pereira de Vasconcelos

## Aprovações

| #   | Aprovador     | Data   | Observação (opcional)   |
|-----|---------------|--------|--------------------------|
| 1   | *(preencher)* |        |                          |
| 2   | *(preencher)* |        |                          |

---

> **kkkkz9:** Durante a kkkkgv do kkkkhk kkkkg4 da kkkkfj em níveis N1/kkkkh5/kkkkh6, surgem dúvidas sobre quando criar um **bloco kkkkh6** (kkkkfl ou agrupamento lógico) versus quando tratar elementos como ramos, campos ou kkkkvo dentro de um bloco existente. Este kkkk7p estabelece critérios para evitar discussões repetidas e manter consistência no [kkkk3d](../kkkk5e%20da%20decomposição/kkkk3d).

---

## 1. Criar bloco kkkkh6 quando

Criar um bloco kkkkh6 (ou kkkkfl/agrupamento no nível 3) quando houver **kkkkjf no kkkkhk** de pelo menos um dos seguintes:

| Critério | Descrição | Exemplo |
| ---------- | ------------ | --------- |
| **Sequência lógica de atividades** | Conjunto de kkkkiq e fluxos que formam uma unidade de comportamento reconhecível no kkkkhk. | Bloco "kkkkbo" (kkkkii, kkkkha, kkkkia, kkkkmj, kkkkmk). |
| **KK0030 externa relevante** | Service kkkk8l, kkkkem ou External kkkk8l que representa integração com kkkkxv externo e merece destaque no kkkk5f. | kkkkck (kkkkja kkkkhg); kkkkcc (kkkkfl kkkkdh). |
| **kkkk56 complexa** | kkkkis(s) e fluxos que implementam regra de kkkkag ou kkkkth relevante para o domínio. | kkkkip antes da kkkks7 (kkkkg0). |
| **Responsabilidade de domínio distinta** | Agrupamento que corresponde a um kkkkig kkkkic ou kkkkyr clara no desenho da kkkkgq. | kkkkwx pessoais (kkkkgy); kkkk56 (kkkkg0). |

A decisão deve ser **kkkkla**: o bloco kkkkh6 deve corresponder a elementos concretos no kkkkhk (kkkkfl, conjunto de kkkkiq, flow nomeado), não apenas a nomes de tela ou de kkkky6.

---

## 2. Não criar bloco kkkkh6 quando

**Não** criar bloco kkkkh6 isolado quando o elemento for apenas:

| Caso | Descrição | Exemplo |
| ------ | ------------ | --------- |
| **Campo de formulário** | Form field ou KK0034 de uma User kkkk8l, sem kkkk9q ou kkkkfl próprio no kkkkhk. | `kkkkb9`, `kkkkkr` (ver [kkkk28](kkkk28)). |
| **Opção de kkkky6** | Nome de kkkky6, kkkksu ou opção comercial exibida na kkkkss/kkkkmk, sem ID de kkkk9q correspondente. | kkkkgs, kkkkhw, kkkksa como *opções* na tela de kkkkst. |
| **Flag de kkkklz** | Variável ou flag que controla exibição/kkkkwf na interface, sem kkkkxc de atividades de kkkk55. | Flags de exibição condicional na mesma User kkkk8l. |
| **Nome de tela sem kkkk9q** | Nome usado na kkkklz ou no kkkkag para uma tela/conteúdo que no kkkkhk é parte de uma kkkk9q maior. | "Tela do kkkkir e do kkkkhw" como conteúdo da etapa de kkkkst, não como kkkkiq com ID próprio. |

Regra prática: **kkkklz ≠ estrutura kkkkhk; tela ≠ kkkkfl.** Na dúvida, conferir no `kkkkk6` se existe **elemento de kkkk55** (User kkkk8l, Service kkkk8l, kkkkem, kkkkl0) com ID ou nome correspondente. Se não existir, tratar como ramo/campo do bloco que contém a kkkk9q onde o dado aparece.

---

## 3. Princípio kkkkfu

Subprocessos e blocos kkkkh6 devem representar **lógica de kkkk55** (atividades, kkkkgc, kkkkwd, kkkkyr de domínio). Campos de formulário e opções de kkkky6 **não justificam** blocos kkkkh6 dedicados; eles são descritos no bloco que contém a kkkk9q de kkkkss/kkkkmk onde aparecem.

---

## 4. Referências

| Documento | Uso |
| ----------- | ----- |
| [kkkk28](kkkk28) | Aplicação dos critérios: kkkkgs, kkkkhw, kkkksa como campos/ramos em kkkkbo |
| [kkkk26](kkkk26) | Alocação de kkkkyr (kkkksp/kkkk7d em kkkkgz); bloco kkkkbo |
| [kkkk22](kkkk22) | kkkkma kkkkcc em kkkkfl kkkkdh |
| [kkkk3d](../kkkk5e%20da%20decomposição/kkkk3d) | kkkk5e de blocos kkkkh6 por kkkkhk |
| kkkkk6 | Fonte de verdade para conferência de kkkk5j e estrutura de kkkk55 |
