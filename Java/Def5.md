# Decisão kkkk5u: kkkk7y — kkkkmr pelo kkkkh0 ou pelo kkkkg0?

> **Contexto:** Pendência 1 do [kkkk3a](../kkkk5e%20da%20decomposição/kkkk3a). A kkkk7y (kkkkp3, kkkkgw, tarifas, etc.) hoje é kkkkmr de dentro do fluxo de kkkk56 no kkkk51. Na kkkkgv, restava a dúvida: o **kkkkh0** chama a kkkkem de kkkk7y após o kkkkdy do kkkkg0, ou o **kkkkg0** (kkkk56) continua chamando a kkkk7y como kkkkem interna?  
> **Status:** **Decidido** — kkkk7y permanece como **kkkkem dentro do kkkkg0** (kkkk56). O kkkkh0 não invoca kkkk7y diretamente.

**Contexto da decisão:**

- **Data:** *(preencher)*
- **Decisor(es):** *(preencher)*

> **Nota:** Incompleto até preenchimento dos campos acima.

---

## 1. Situação no kkkk51 (`kkkkk6`)

- A **kkkk7y** (kkkkne, kkkkel, kkkkn5, kkkkn6, etc.) ocorre **após** `kkkkc7` e fluxos de kkkkhu/kkkkth, ainda dentro do mesmo kkkk55.
- Não existe hoje um kkkk55 kkkkhk separado "kkkkh0" que chame kkkkg2; tudo está em um único kkkk55. A sequência lógica é: kkkk56 (kkkks4, kkkkiu, resumo, kkkkc7) → kkkk5k da kkkk7y (em background) → fim da kkkkgq visível ao kkkk38.

---

## 2. Opções na kkkkgv

| Opção | Descrição | Prós / contras |
| ------- | ----------- | ----------------- |
| **kkkk7y no kkkkg0** | O kkkk55 `kkkkbw.bpmn` contém uma kkkkem para `kkkkov`; ao retornar do kkkkg0, o kkkkh0 recebe "kkkkgq concluída" (kkkks7 já disparada ou em andamento). | **Prós:** Menor mudança em relação ao fluxo atual; kkkkh0 mais simples (só orquestra 1→2→3→4); responsabilidade "pós-liberação" permanece na kkkk56. **Contras:** O kkkkh0 não "vê" o resultado da kkkk7y diretamente (o kkkkg0 é que chama e pode tratar kkkkdy/erro). |
| **kkkk7y no kkkkh0** | Após o kkkkg0 retornar (kkkkc7 concluída), o kkkkh0 chama a kkkkem `kkkkov`. | **Prós:** kkkkh0 centraliza todas as kkkk65 kkkk5t macro. **Contras:** Exige que o kkkkg0 **termine sem efetivar** e devolva variáveis de controle ao kkkkh0 para o kkkkh0 decidir chamar kkkk7y — contrato novo e acoplamento que hoje não existem; mais um ponto de costura no kkkkh0. |

---

## 3. Onde a kkkk7y está no fluxo atual

- A kkkk7y é disparada **dentro** do bloco que hoje será o kkkkg0 (após kkkkc7, kkkkf2, etc.). No kkkkh5 e kkkkh6, a seção "kkkk7y — kkkkov (kkkkem pós-kkkkgq)" está listada como parte do contexto da kkkk56.
- O guia [kkkk1p](../Apresentações/kkkk1p) descreve: "kkkkem: kkkk7y (pós-kkkkgq)" como bloco do kkkkg0.

Conclusão a partir do desenho atual: a fronteira natural é **kkkk7y kkkkmr pelo kkkkg0**.

---

## 4. Decisão e impacto no N1

**Decisão: manter a kkkk7y como kkkkem dentro do kkkkg0 (kkkkbw.bpmn).**

- O kkkkh0 **não** terá kkkkem para `kkkkov`.
- A tabela de kkkk65 kkkk5t do kkkkh0 (N1) permanece com: `kkkkc6`, `kkkkcm`, `kkkk0q`, `kkkkeg`; a nota sobre kkkk7y fica: "Chamada pelo kkkkg0 (kkkkem dentro de kkkkbw.bpmn)".
- **Pendência 1 do N1:** Fechar como **"Decidido: kkkk7y kkkkmr pelo kkkkg0 (não pelo kkkkh0)."**

**Tratamento de erro da kkkk7y (consequência da decisão):** Com a kkkk7y dentro do kkkkg0, o kkkkh0 **não vê** o resultado da kkkk7y diretamente — quem chama é o kkkkg0, então **quem trata falha/kkkkdy da kkkk65 kkkk7y é o kkkkg0**. Fica como responsabilidade do kkkkh5 (e do desenho do kkkkg0) definir: a kkkk7y falha → o kkkkg0 absorve o erro e termina com status de falha (variáveis de saída indicando falha)? O kkkkh0 recebe apenas "kkkkg0 retornou" (sucesso ou falha conforme variáveis devolvidas pelo kkkkhj)? Ou há sinal/evento para o kkkkh0 em caso de falha? Essa consequência deve ser explicitada no contrato kkkkg0 ↔ kkkkh0 e no mapeamento kkkkh5 (tratamento de erro da kkkk65 `kkkkbr` dentro do kkkkg0).

---

## 5. Referências

| Documento | Uso |
| ----------- | ----- |
| [kkkk3a](../kkkk5e%20da%20decomposição/kkkk3a) | Pendência 1; tabela kkkk65 kkkk5t (sem call_efetivacao no kkkkh0) |
| [kkkk3b](../kkkk5e%20da%20decomposição/kkkk3b) | kkkk7y listada como "kkkkem pós-kkkkgq" no contexto kkkk56 |
| [kkkk3d](../kkkk5e%20da%20decomposição/kkkk3d) | kkkkg0 — bloco "kkkk7y" como kkkkem |
| [kkkk1p](../Apresentações/kkkk1p) | kkkk5v: kkkk7y sob kkkkg0 |
| [kkkk3m](../Relatórios%20da%20atividade/kkkk3m) | Seção 5 — item "kkkk7y: kkkkh0 ou kkkkg0?" |
