# Passos e objetivo — KK0282 KK1282 (tópico unificado)

Resumo do que foi KK0302 nos materiais e do que precisa ser feito no KK0282.

---

## 1. Objetivo final (a partir do que foi falado)

- **Publicar a KK1086 completa** no **tópico unificado de atualização de propostas**  
  (`KK0618`), com:
  - **`KK1309 = 44`** – "KK0553",
  - **flags de KK0476 / KK0809 ligadas**,
  - para o **KK1282 consumir esse tópico** e “pegar o que interessar”.
- **Manter o KK0651 antigo** (`KK1076`) **convivendo por um KK1342**, e **tombar depois**.

---

## 2. O que temos que fazer no KK0282 (passos práticos)

### (A) Preparar o JSON completo dentro do KK0172 (Script KK1331 que já desenhamos)

- Garantir que o Script KK1331:
  - Monte o **JSON mínimo KK0302 com KK1282** (nos campos do KK0439).
  - Faça `KK0615.KK1288("proposta_completa_setup", jsonString)`.
- KK1196 se todos os **campos críticos** (KK0747, KK0746, KK0346, DN, KK0981, KK0651/KK1315, origem, data_evento etc.) estão chegando **antes** do Script.

---

### (B) Inserir/ajustar a atividade de “KK0119” com padrão KK0812

- KK0835 **`KK1104`** (KK0350), criar o **novo step** copiando o padrão do Tapete KK0812:
  - Service KK1331 **`delegate_atualizar_status_44`** (ou nome equivalente que você já está usando).
- **Configurar no KK0473:** na mesma Service KK1331 "Atualizar status: KK1085 efetivada", na seção **Inputs** do painel de propriedades (onde já estão `KK1309`, `KK0475`, etc.):
  - **`KK1309`** = `44`.
  - **`KK0484`** = `"KK0949"` — adicionar como **input** (nome: `KK0484`, valor: `KK0949` ou expressão que resulte nesse valor).
  - **flags de KK0476 / KK0809 ativadas** (mesmo combo que o KK0812 usou): `novo_democratiza_proposta`, `democratiza_sync`, `democratiza_sqs`, `KK0475`.
  - (Opcional, mas recomendado) **Persistir `proposta_completa_setup`** em `dados_proposta` para ir no KK0610 democratizado:
    - No input **`dados_proposta`** (map) da mesma KK1332, **adicione uma entrada** com chave `proposta_completa_setup` e valor `${proposta_completa_setup}` (expressão que lê a KK1424 definida pelo Script KK1331). O KK0473 grava o KK0840 na KK1086; a KK0476 inclui esse dado no KK0610 do tópico.
- Garantir que essa caixa esteja no **ramo pós-KK0544**, **sem quebrar** o `KK1076` atual.

---

### (C) Garantir convivência com o KK0651 antigo de KK1282

- **Não mexer agora em:**
  - `KK1076` (external KK1332 `KK0098`).
  - `KK0106` e seus eventos de erro/sucesso.
- Deixar os **dois ramos convivendo**:
  - **Ramo antigo:** continua mandando o KK1001 enxuto para o tópico atual do KK1282 (KK1394).
  - **Ramo novo:** publica a KK1086 completa (via democratiza + status 44) no tópico unificado.

---

### (D) Alinhar teste e KK1362 com KK1282

- **Em KK0736:**
  - KK1404 com KK1282 que eles **enxergam o KK0610 com status 44** no tópico unificado.
  - Bater **campo a campo** o KK1001 que chega lá.
- **Depois, em outra história:**
  - Planejar e executar a **remoção do ramo antigo** (`KK1076` + `KK0106`), quando KK1282 estiver só no tópico 44.

---

## Referências

- `TODO_IMPLEMENTACAO_SETUP.md` — planejamento detalhado no KK0172.
- `GUIA_SCRIPT_JSON_PROPOSTA_SETUP.md` — KK1223 KK0732 e KK1424 `proposta_completa_setup`.
- `transcricoes/alinhamento KK1283 KK0282 Rafael.txt` e `transcricao_alinhamento_co8.md` — fonte do que foi falado.

Documento: KK0047
