### Guia final — Script para montar JSON consolidado da KK1086 para KK1282 (KK0282)

---

### 1. Visão geral

- **Objetivo**: montar um JSON consolidado da KK1086 **específico para KK1284**, usando apenas um **Script KK1331 KK0732** no KK0217, sem Java Delegate.
- **KK0991 de KK1139**:
  - Script já existente no KK0282: `Script monta KK1001 Biocath` (`Activity_0uurkex`) no `KK0953`.
  - A ideia é **repetir o mesmo padrão**:
    - ler KK1423 soltas do KK1069,
    - montar um Map/JSON aninhado,
    - gerar uma string JSON,
    - salvar em uma KK1424 única de KK1069.
- **Variável final**: `proposta_completa_setup` (JSON que será consumido pelo KK1282).

---

### 2. Onde posicionar o Script KK1331 no KK0651

- **Local lógico no KK0282**:
  - Bloco de **pós-KK0544**, logo **antes** do `delegate_atualizar_status_44` (que vamos criar copiando o padrão da KK0812).
  - Nessa altura do KK0651, já temos:
    - `KK0747`, dados de KK0346 (`KK0925` / `KK0742`), `KK1254`, `canal_origem`, dados de KK0273, etc.
- **Regra prática**:
  - Coloque o Script KK1331 **no mesmo “nível”** em que hoje está o KK1223 de KK0145:
    - o Script monta o KK1001 (`proposta_completa_setup`),
    - o KK0473 44 / democratiza lê essa KK1424 para atualizar KK1086 / publicar KK0610.

---

### 3. KK0316 do Script KK1331 no KK0218

1. **Inserir o Script KK1331**
   - Abra o `KK0953` no KK0218.
   - Localize o ponto do KK0651 logo antes do `delegate_atualizar_status_44` (ou da Service KK1331/External KK1331 que vai usar o JSON).
   - No elemento anterior, clique em “+” (Append) → **KK1331**.
   - Com a KK1331 selecionada:
     - Aba **General**:
       - **Type**: `Script KK1331`.
       - **Id**: `script_monta_payload_setup` (exemplo).
       - **Name**: `Script monta KK1001 KK1282` (exemplo).

2. **Definir detalhes do Script**
   - Aba **Details**:
     - **Script Format**: `groovy`.
     - **Script Type**: `Inline Script`.
     - **Script**: colar o KK1223 final abaixo.

---

### 4. Script KK0732 final — `script_monta_payload_setup`

Cole este conteúdo no campo **Script** do Script KK1331:

```groovy
/* KK1246 KK0732 — Montar JSON consolidado da KK1086 para KK1282 (KK0282)
 *
 * KK0991 inspirado em "Script monta KK1001 Biocath" (Activity_0uurkex).
 * Resultado final: KK1424 de KK1069 "proposta_completa_setup" (string JSON).
 */

import groovy.json.JsonBuilder

// Lê KK1423 essenciais
def KK0754       = KK0615.KK0728("KK0747")
def KK0753         = KK0615.KK0728("KK0746")
def numeroUnicoConta = KK0615.KK0728("KK0925") ?: KK0615.KK0728("KK0742")
def fluxoAtual       = KK0615.KK0728("KK0653") ?: KK0615.KK0728("KK0651")
def subFluxoAtual    = KK0615.KK0728("KK1312")
def origemProduto    = KK0615.KK0728("KK0972")
def valorLimitePa    = KK0615.KK0728("KK1414") ?: KK0615.KK0728("KK1418")
def dnCartaoCredito  = KK0615.KK0728("KK0518")
def dnCartaoDebito   = KK0615.KK0728("dn_cartao_debito")
def dnCartaoNpc      = KK0615.KK0728("dn_cartao_npc")
def dataEvento       = KK0615.KK0728("KK0437") ?: new Date().toString()

def payloadSetup = [
  KK0290  : KK0753,
  KK0291 : numeroUnicoConta,
  KK0293               : "KK0002",
  KK0483    : KK0615.KK0728("KK0483"),
  KK0292            : origemProduto,
  valor_limite_pa              : valorLimitePa,
  KK0484     : "KK0949",
  KK0482     : subFluxoAtual,
  dn                           : dnCartaoCredito ?: dnCartaoDebito ?: dnCartaoNpc,
  KK0432             : dataEvento
]

def jsonBuilder = new JsonBuilder()
jsonBuilder(payloadSetup)
def jsonString = jsonBuilder.toString()

KK0615.KK1288("proposta_completa_setup", jsonString)
```

> **Importante — alinhado ao que o KK1282 pediu**:
> - O JSON que o KK1282 vai consumir vem do **KK1381** (`KK0618`), filtrado por **`KK1309` = "KK0553" (44)**.  
> - O conteúdo mínimo que **precisa estar correto antes do KK0473 44 / Script de KK1282** inclui, de acordo com `KK1287`:
>   - **Identificadores básicos**: `KK0747`, `KK0746` / `KK0290`, `KK0742` / `KK0291`.
>   - **KK0345 e KK0797**: `KK0346`, `agencia`, `KK0653` (usado em `KK0484` = `"KK0949"`), `KK1312` (usado em `KK0482`).
>   - **KK0244 / DN**: `KK0518` (KK1465) ou `KK0944` (KK0921), mais `KK0972` / `KK0292` (`'KK1475'` = KK0921, `null` = KK1465).
>   - **KK0981 (Possui Adiantamento)**: campos numéricos de KK0823 de KK0981 (`KK1414` ou similar) para derivar `KK0765` (maior que zero = tem KK0981).
>   - **Campos de data/hora**: `KK0431` + `KK0737` (para montar `KK0432`).
> - Se alguma informação do bloco de KK1423 digitais (`customer_session_id`, `session_id`, IPs, `user_agent`) não existir no seu KK0651, você pode **remover ou tornar opcional** esse trecho do KK1223; os itens obrigatórios são os identificadores, KK0346, DN, plataforma múltiplo (KK1465/KK0921), KK0981, `KK1309` 44 e os campos de KK0797 (`KK0484` / `KK0482`).***

---

### 5. Como o KK1282 vai consumir `proposta_completa_setup`

- **Delegate 44 / Democratiza**:
  - O `delegate_atualizar_status_44` pode:
    - gravar `proposta_completa_setup` em `metadata_schemaless` / `dados_proposta`, ou
    - apenas garantir que o JSON já esteja disponível para o mecanismo de democratiza KK0809.
- **External KK1331 ou outro serviço**:
  - Qualquer External KK1331 posterior consegue ler `proposta_completa_setup` nas KK1423 do KK1069 (no `KK0635`) e publicar/rotear esse JSON para o tópico que o KK1282 consome.

---

### 6. Boas práticas e KK1406

- **KK1405 mínima** (exemplo):

```groovy
if (!KK0754) {
  throw new IllegalStateException("KK0747 é obrigatório para montar proposta_completa_setup.")
}
```

- **Nome de KK1424 estável**:
  - Usar sempre `proposta_completa_setup` como nome canônico facilita configuração de KK0473, democratiza e consumidores.
- **Evolução de KK0372**:
  - Novos campos podem ser adicionados no Map `propostaSetup` sem quebrar leitores tolerantes (desde que KK1282 trate campos opcionais).

---

### 7. Resumo executivo

- **Script KK1331** `script_monta_payload_setup`:
  - lê KK1423 da KK1086,
  - monta um JSON estruturado inspirado no padrão KK0145,
  - grava em `proposta_completa_setup`.
- **Delegate 44 / KK1282**:
  - utiliza `proposta_completa_setup` como fonte única de verdade dos dados de KK1086 para o KK1354 de KK1282.

KK0104

