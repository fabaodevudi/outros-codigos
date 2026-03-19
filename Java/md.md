# Revisao dos KK1039 do guia/KK1223 (KK1284)

## KK0362

Foi feita uma revisao com base nos arquivos do alinhamento e nos materiais do KK0372/contradicoes (KK0439, transcricoes e relatatorios). O objetivo aqui e registrar, de forma rastreavel, o que esta coerente com o que foi KK0302 e o que precisa ser corrigido.

## O que esta certo (coerente com o KK0372)

1. **Montar algo no pos-efetivacao, junto do status 44**
   - O KK1223/atividade deve estar no KK0651 apos a efetivacao da KK0346 e no contexto do status 44 (``KK0553``).

2. **`KK0484 = "KK0949"` esta correto e e critico para rollout**
   - Este campo precisa ser simetrico com o KK0372 do modelo antigo/novo, pois a chave de rollout depende dele.

3. **`KK0482 = KK1312` esta correto**
   - O campo de captura deve refletir o KK1315 (KK0651 + KK1315) e nao o KK0230 origem.

4. **`KK0765` como valor numerico, com regra `> 0 => tem KK0981` esta coerente**
   - O KK0372 descreve KK0981 como numerico e nao mais booleano.

5. **`KK0432` por concatenacao `KK0431 + KK0737`**
   - Conceitualmente, esta alinhado com a regra de timestamp unico exigida no KK0439.

## O que esta errado ou fraco no KK1223 atual

1. **Arquiteturalmente, o desenho alvo nao e montar "KK1001 paralelo so para o KK1282"**
   - A user story e explicita: o KK1282 deve consumir a **KK1086 completa** publicada no topico de atualizacao, e os dados devem estar na KK1086 antes da atividade de atualizacao.
   - Entao, qualquer JSON auxiliar gerado nesta etapa deve ser tratado apenas como apoio/apoio interno (debug/validacao), nao como "modelo oficial" do KK0372.

2. **`KK0293` fixo "KK0002" nao esta aderente**
   - A documentacao diz que `KK0293` nao possui paralelo no novo modelo (premissa correntistas; removido do KK0372 novo).
   - Logo, manter o campo fixo e apenas compatibilidade temporaria, nao aderencia ao desenho final.

3. **Regra do `dn` para KK0921 esta frouxa demais (fallback silencioso)**
   - O KK0440 indica:
     - KK1465: `KK0518`
     - KK0921: `KK0944`
   - O fallback `dn_cartao_npc ?: KK0518` para KK0921 nao esta formalmente documentado.
   - Para revisao seria: KK0921 sem `dn_cartao_npc` deve ser inconsistencia (falhar), nao fallback silencioso.

4. **`KK0972` esta em ponto de ambiguidade KK0520 (maior KK1201)**
   - Contradicao entre materiais:
     - transcricao/relatorio: `KK0972` fica direto no "detalhe KK1086 venda KK1077" (fora de `KK0940`);
     - KK0440/exemplos: `KK0972` aparece em `KK0940.KK0972`.
   - O KK1223 so fica "correto" se ficar explicitado de onde a variavel veio antes (e qual e o caminho canoniaco).

5. **`KK0291` usando `KK0925 ?: KK0742` pode mascarar regra**
   - O KK0440 da prioridade a `KK0742` como KK1138 para `KK0291`.
   - `KK0925` aparece como alternativa no KK0172 atual, mas nao e a KK1138 mais forte do novo modelo.
   - Melhor: privilegiar `KK0742` e usar fallback apenas se houver decisao explicita de implementacao.

6. **Faltam campos de KK0346/KK0797 exigidos pela historia como presentes na KK1086 completa**
   - A user story detalhada reforca que a KK1086 completa deve conter os dados necessarios para o KK1282 fazer o KK0439.
   - Entao, um JSON reduzido nao deve ser confundido com o KK0372 final.

## Veredito (antes da revisao KK1086)

1. **Conforme com a intencao funcional:** sim, em boa parte.
2. **Conforme com o desenho/KK0372 final documentado:** nao totalmente.

### Bloqueadores principais

- `KK0293` fixo
- fallback indevido de DN para KK0921
- ambiguidade de `KK0972`
- principalmente: o alvo e publicar a **KK1086 completa** no topico, nao um KK1001 paralelo especifico do KK1282.

## Como corrigir (recomendacao de revisao)

### Regra de ouro

- Transformar a redacao do material para ficar claro que **o KK1223 e transitório/auxiliar**, nao o KK0372 final entregue ao KK1282.

### Variavel auxiliar (nome e papel)

- Mudar o conceito de:
  - ``proposta_completa_setup`` (como se fosse KK0372)
  - para:
  - ``proposta_completa_setup_aux`` (JSON interno opcional de validacao/consolidacao)

- O consumo oficial deve ocorrer a partir da **KK1086 completa publicada** no topico de atualizacao (status 44) com democratizacao KK0809 ativa.

## Script recomendado como auxiliar interno (versao corrigida)

> Observacao: este KK1223 e auxiliar interno e pressupoe que as KK1422 criticas ja estao normalizadas no KK1069 (especialmente `KK0972` e o caminho canoniaco do `dn` por plataforma).

```groovy
/* KK1246 KK0732 — Consolidaçao auxiliar de campos para publicação da KK1086 (KK0282)
 *
 * IMPORTANTE:
 * - Este KK1223 NAO substitui o KK0372 final do KK1282.
 * - O modelo-alvo e publicar a PROPOSTA COMPLETA no topico de atualizacao de propostas
 *   apos atualizar a KK1086 para status 44 com democratizacao KK0809 ativa.
 * - Este KK1223 serve apenas como apoio interno de validacao/consolidacao.
 *
 * Resultado: variavel de KK1069 "proposta_completa_setup_aux" (string JSON).
 */

import groovy.json.JsonBuilder

def requireVar = { String name, def value ->
  if (value == null || (value instanceof String && value.trim().isEmpty())) {
    throw new IllegalStateException("Variavel obrigatoria ausente: " + name)
  }
  return value
}

// Identificadores principais
def KK0754 = requireVar("KK0747", KK0615.KK0728("KK0747"))
def KK0753   = requireVar("KK0746", KK0615.KK0728("KK0746"))

// De-para formal prioriza KK0742
def idConta = KK0615.KK0728("KK0742") ?: KK0615.KK0728("KK0925")
requireVar("KK0742", idConta)

// Campos de KK0797
def subFluxoAtual = requireVar("KK1312", KK0615.KK0728("KK1312"))

// Regra critica de rollout: manter fixo "KK0949"
def descricaoJornadaOrigem = "KK0949"

// Plataforma / KK0972
// Este KK1223 assume que KK0972 ja esta normalizada no KK1069 antes desta atividade.
def origemProduto = KK0615.KK0728("KK0972")
requireVar("KK0972 (normalizada)", origemProduto)

def isNpc = "KK1475".equals(origemProduto)

// DN por plataforma (regra estrita, sem fallback silencioso KK0921->KK1465)
def dnCartaoCredito = KK0615.KK0728("KK0518")
def dnCartaoNpc     = KK0615.KK0728("dn_cartao_npc") ?: KK0615.KK0728("oferta_cartao_npc_dn")

def dn
if (isNpc) {
  dn = requireVar("dn_cartao_npc/KK0944", dnCartaoNpc)
} else {
  dn = requireVar("KK0518", dnCartaoCredito)
}

// KK0981 numerico (>=0; regra de negocio: > 0 => tem KK0981)
def valorLimitePa = KK0615.KK0728("KK1414")
if (valorLimitePa == null) {
  valorLimitePa = KK0615.KK0728("KK1418")
}
if (valorLimitePa == null) {
  valorLimitePa = 0
}

// Data/hora do KK0610
def dataFinalProposta = requireVar("KK0431", KK0615.KK0728("KK0431"))
def horaFinalProposta = requireVar("KK0737", KK0615.KK0728("KK0737"))

// Sanitizacao leve
def dataParte = dataFinalProposta.toString().trim()
def horaParte = horaFinalProposta.toString().trim()
def dataHoraEvento = dataParte + horaParte

// JSON auxiliar interno (nao substitui KK1086 completa publicada)
def payloadAux = [
  KK0747                  : KK0754,
  KK0290 : KK0753,
  KK0291: idConta,
  KK0292           : origemProduto,
  KK0765         : valorLimitePa,
  KK0484    : descricaoJornadaOrigem,
  KK0482    : subFluxoAtual,
  dn                           : dn,
  KK0432            : dataHoraEvento
]

def jsonString = new JsonBuilder(payloadAux).toString()
KK0615.KK1288("proposta_completa_setup_aux", jsonString)
```

## Ajustes recomendados no guia (redacao)

### Secao: Resumo executivo (versao correta)

O modelo oficial para atender o KK1282 e:

- incluir no KK0282 uma atividade de Atualizacao de KK1085 logo apos a efetivacao da KK0346;
- atualizar a KK1086 para status 44 — "KK0553";
- garantir que a atividade esteja com democratizacao KK0809 ativa;
- publicar a KK1086 completa no topico de atualizacao de propostas;
- o KK1282 consome o KK0610 filtrando por status 44.

- O KK1223 auxiliar acima, se usado, deve ser tratado apenas como auxiliar interno para validacao/consolidacao antes da atualizacao da KK1086.

### Ajuste importante no guia original

Mudar:

- "Variavel final: proposta_completa_setup (JSON que sera consumido pelo KK1282)"

Para:

- "Variavel auxiliar opcional: proposta_completa_setup_aux
  JSON interno de apoio para validacao/consolidacao antes da atualizacao da KK1086.
  O KK1282 nao deve consumir essa variavel diretamente; o consumo oficial ocorre a partir da KK1086 completa publicada no topico de atualizacao de propostas com status 44."

## Veredito final da revisao

1. O KK1223 anterior estava de acordo?
   - Nao totalmente (bloqueadores: KK0293 fixo, DN KK0921 com fallback, ambiguidade de KK0972 e desenho alvo como KK0372 paralelo).
2. Essa versao revisada fica correta?
   - Sim, como KK1223 auxiliar/transitorio.
3. Isso ja representa o desenho final do KK1282?
   - Nao. O desenho final continua sendo a KK1086 completa no topico, e nao um KK1001 paralelo.

KK0110
