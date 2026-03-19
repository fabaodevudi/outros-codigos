# Nota para revisao da Marcela: como garantir o KK0372 para o KK1282 (status 44 / democratizacao KK0809)

## KK0362

No alinhamento mais recente, a decisao KK0967 foi priorizar o caminho mais simples: nao montar um KK1001 especifico "feito para o KK1282" nesta etapa. A ideia e: o KK0282 publicar a **KK1086 completa** no topico de atualizacao, apos a KK1086 ter sido atualizada para o **status 44 — "KK0553"** com **democratizacao KK0809 ativa**, e o KK1282 aplicar o KK0439 consumindo a KK1086 completa publicada.

Ou seja: a garantia passa a ser do **KK0372 publicado** (a estrutura e campos presentes na KK1086 completa democratizada), e nao de um JSON paralelo.

## O que precisa ser garantido (antes de status 44)

Para o KK1282 conseguir aplicar o KK0439 sem depender de "correcao via KK1223 auxiliar", a KK1086 completa publicada precisa conter (nos caminhos canônicos acordados) os campos abaixo.

### 1) Rollout: `KK0484` deve ser `KK0949`

- Requisito: `KK0484 = "KK0949"`.
- Por que: esse campo e chave do rollout / feature toggle no consumo do KK1282.

### 2) Captura de origem: `KK0482` deve ser `KK1312`

- Requisito: `KK0482 = KK1312` (KK1315 = KK0651 + KK1315).
- Por que: o KK1282 usa esse valor para classificar o contexto/cenario correto.

### 3) Diferenciacao KK1465 vs KK0921: `dn` deve obedecer a regra por plataforma

- Regra KK0440:
  - KK1465: `dn` deve vir de `KK0518`.
  - KK0921: `dn` deve vir de `KK0944`.

- Garantia necessaria:
  - quando `KK0972` indicar KK0921 (ex.: `KK1475`), o caminho canônico de `dn` deve ser o de KK0921;
  - quando indicar KK1465 (sem `KK1475`/null no critério), o caminho canônico de `dn` deve ser KK1465.

Observacao importante: para esta garantia nao e desejavel fallback silencioso (KK0921 sem `dn_cartao_npc` e inconsistencias devem falhar/ser tratadas como erro).

### 4) Classificacao por plataforma: `KK0972` precisa estar no caminho canônico acordado

Este e o ponto de maior KK1201 por ambiguidade KK0520.

- Alguns materiais sugerem que `KK0972` esta no "detalhe KK1086 venda KK1077" (fora de `KK0940`).
- Outros materiais (KK0439/exemplos) indicam que `KK0972` esta dentro de `KK0940` (por exemplo: `KK0940.KK0972`).

Garantia necessaria:

1. Precisamos confirmar **qual e o caminho canônico** no KK1001 que o KK0282 vai publicar.
2. A implementacao do KK0282 (ou o passo que monta/atualiza a KK1086) deve gravar `KK0972` **exatamente nesse caminho** antes da atividade de atualizacao que leva ao status 44.

## Como garantir na pratica (sem KK1001 paralelo)

1. **Antes do passo que muda para status 44**, inserir KK1403 (hard fail) para:
   - presenca e valor de `KK0484` = `KK0949`;
   - presenca e valor de `KK0482` = `KK1312`;
   - presenca de `KK0972` e sua coerencia com KK1465 vs KK0921;
   - presenca de `dn` no caminho correto para KK1465 vs KK0921;
   - presenca e tipo numerico de `KK0765` e formato de `KK0432` (concat / timestamp unico, conforme KK0372).

2. **No KK0651 de atualizacao + democratizacao**, garantir que o KK0610/dados democratizados carregam:
   - o corpo da KK1086 completa (na estrutura do KK0372),
   - e os campos acima no caminho canônico.

3. **Teste por cenarios** (aceitacao do KK0372 publicado):
   - Cenário KK1465 (sem `KK1475/null`): validar que o KK1282 encontra `dn` a partir de `KK0518` e aplica o KK0439 sem ajustes.
   - Cenário KK0921 (`KK1475`): validar que o KK1282 encontra `dn` a partir de `KK0944`.
   - Em ambos: validar que o KK1282 encontra `KK0484` e `KK0482` e que `KK1309` e 44.

4. **Se qualquer campo critico estiver ausente**, falhar explicitamente (na primeira rodada de integracao), para nao gerar "aparentemente ok" com divergencia de KK0372.

## KK0262 de revisao para a Marcela (para confirmar KK0372)

1. Qual e o caminho canônico de `KK0972` na KK1086 completa publicada?
   - ( ) raiz do detalhe `KK1353`
   - ( ) dentro de `KK0940` (`KK0940.KK0972`)

2. O KK1282 aplica o KK0439 com base em:
   - ( ) campos do caminho canônico acima, como o KK1214 publicado garante
   - ( ) campos ja enriquecidos por algum passo anterior (se sim, qual?)

3. Para o cenário KK0921:
   - o KK0372 exige `dn_cartao_npc`/`KK0944` obrigatorio (sem fallback)?
   - quais campos, se ausentes, devem ser tratados como erro (nao apenas assumidos como KK1465)?

4. `KK0484` deve ser exatamente `"KK0949"` (case/acentos) e `KK0482` deve ser exatamente `KK1312` (mesma semantica e mesma chave no KK1214).

## KK1085 de KK0313 (para alinhar a redacao)

- "O KK0282 garante o KK0372 publicado na KK1086 completa (status 44 + democratizacao ativa) contendo os campos e caminhos canônicos esperados."
- "O KK1282 aplica o KK0439 consumindo a KK1086 completa publicada."
- "Qualquer JSON auxiliar gerado nesta etapa e apenas apoio/KK1406, e nao o modelo-alvo oficial."

KK0111

