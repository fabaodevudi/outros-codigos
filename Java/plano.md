# KK1025 de KK0880 KK0921 — bloco múltiplo (manual para produção)

**Documento DD8026** — KK1026 de **implantação** e **KK0880 manual** do múltiplo KK0921 (KK0911 + colagem XML em produção).

- **Fonte de verdade KK0172:** `ddd_registros.bpmn_linhas_wrapped_env` (`ambiente='dev'`). Os números de **linha** abaixo referem-se a esse fatiamento; **revalidar** com `SELECT` antes de cada KK0880 (inserções acima deslocam linhas).
- **Regra KK0967 (repositório DDD):** `PLANO_IMPLANTACAO_MULTIPLO_NPC_MIGRACAO.mdc` (**DD8030**) — checklist DB-first e anti-perda de linhas.
- **Espelho de KK0911/KK1134 (repositório DDD):** `KK1473/KK0084/notas/SINTESE_VALIDAR_PROXY_NPC_FLUXO_VARIAVEIS_POS_FORMALIZACAO.md` (mesmo DD8026, texto de alinhamento e tabelas de âncoras).

**Fontes da demanda:** `documentos_markdown` (**DD8024**, **DD8022**, **DD8021**), `transcricoes_inteligencia` (ids **99**, **105**, apoio **106**/**111**), esteira `KK1399` (`KK1399.test.yml` no DDD).

---

## Trilha de KK0911 (múltiplo KK0921) — o que a KK0880 deve respeitar

1. **KK1085 segmentada** → **KK0399 Oferta** (`KK0418`) — formulário com objetos de KK0936; entrada relevante: **`oferta_multiplo_npc_object`** (e outros objetos de KK0936/KK1259). Garantir que KK1423 usadas mais à frente (**`KK0745`**, **`KK0945`**, **`oferta_multiplo_npc`**, **`dados_proposta`**) ficam coerentes com o que esta etapa e os KK1245 de mapeamento produzem.
2. Após **KK0399 Oferta**, o modelo ramifica (ex.: **Valida KK1123 ISC** vs **KK1404 KK1123 KK0921**).
3. **KK0668** `KK0690` (exclusivo) + ramo **`Flow_1npcvld`** quando `KK0945 == true` → **`KK1399`** (**DD8022**: 4xx sem KK1190, 5xx até 3 tentativas, fallback sem KK1124).
4. **Sucesso** / **erro (KK0166)** → **`formaliza_npc`** (convergência).
5. **`Gateway_00yrdx0`** (“Possui Débito?”) — sem ramo por tipo HTTP da KK1406.
6. Mais à frente: **`KK0856`** (KK1223 de preparação GE/KK0245) — diffs deste KK1026 para `KK0745` / `KK0945` / `oferta_multiplo_npc`.

**Scripts próximos a KK0399 Oferta:** ver **§12** (diff KK0732 para incluir `oferta_multiplo_npc` em `dados_proposta`). Complementam os blocos §1–§11.

---

## KK0839 de âncoras KK0172 dev (KK1139 — revalidar)

| Elemento (id) | linha_bpmn (ref. 2026-04-01) | Nota |
|---------------|------------------------------|------|
| `KK0856` | 493–527 | Script JS (§1 deste KK1026) |
| `KK0690` | 4558–4563 | §2 |
| `Flow_02tfitj` / `KK0647` / `Flow_1npcvld` | 4635–4656 | §§3–5 |
| `Flow_1npcfrm` … `Flow_1npcerr_evt` | 4657–4661 | §6 |
| `Event_1npcok` / `Event_1npcerr` | 4662–4679 | §§7–8 |
| `KK1399` / `Event_1npcerrb` | 4680–4720 | §§9–10 |
| `formaliza_npc` | 4721–4738 | §11 |
| `Gateway_00yrdx0` | 5104 | Pós-KK0657 |
| `KK0418` | 7043–7645 | User KK1332 — KK0936 / KK0921 |
| `script_mapeia_dados_oferta_fluxo_alternativo` | 7751–7787 | KK0732 |
| `KK1240` | 7788–7821 | KK0732 |

**Anti-perda de linha:** registo `COUNT(*)` em `bpmn_linhas_wrapped_env` (`dev`) antes e depois; localizar por `id`; gravar intervalo no lote **DD8001**; só depois espelhar `.bpmn` e promover a prod (ver **DD8030**).

---

## Objetivo
Migrar manualmente para produção **todos os blocos do multiplo KK0921**, mantendo KK0755, ordem de XML e vizinho imediato anterior para facilitar colagem no XML de produção.

## Blocos novos — XML e vizinho anterior (ordem do banco)

### 1. Modificação em `KK0856` — KK1223 de preparação de KK0936
- **ID principal:** `KK0856` (**elemento existente em prod — alterar apenas as linhas indicadas no diff**)
- **Linha(s) no DB dev:** 493-527
- **Localização em prod:** buscar `id="KK0856"` no XML e aplicar o diff abaixo

#### Resumo das mudanças

| # | Tipo | O que mudou |
|---|---|---|
| 1 | **Alteração** | `KK1415`: de valor simples → lógica com `limite_cartao_direcionador` |
| 2 | **Inserção** | `KK0745`: inicializa com null se não existir na execução |
| 3 | **Inserção** | `KK0945`: inicializa a partir de `KK0792` se não existir |
| 4 | **Inserção** | Bloco `if(oferta_multiplo_npc != null)`: sobrescreve `KK0745` e `KK0945` com dados do multiplo KK0921 |

#### ANTES (prod)

```javascript
KK0615.KK1288("KK1415", valor_maximo_cartao_credito);
KK0615.KK1288("indicador_overlimit", ofertaProdutos.get('indicador_overlimit')); //ok
```

#### DEPOIS (dev)

```javascript
KK0615.KK1288("KK1415", (KK0615.hasVariable("limite_cartao_direcionador") && limite_cartao_direcionador != null && limite_cartao_direcionador != "" ? limite_cartao_direcionador : valor_maximo_cartao_credito));
KK0615.KK1288("KK0745", KK0615.hasVariable("KK0745") ? KK0745 : null);
KK0615.KK1288("KK0945", KK0615.hasVariable("KK0945") ? KK0945 : (KK0615.hasVariable("KK0792") ? KK0792 : false));
if(KK0615.hasVariable("oferta_multiplo_npc") && oferta_multiplo_npc != null){ def om=oferta_multiplo_npc; if(om.get("KK0745")!=null) KK0615.KK1288("KK0745", om.get("KK0745")); if(om.get("contratar_multiplo_npc")!=null) KK0615.KK1288("KK0945", om.get("contratar_multiplo_npc")); }
KK0615.KK1288("indicador_overlimit", ofertaProdutos.get('indicador_overlimit')); //ok
```

> **Nota:** o restante do KK1223 (acima e abaixo das linhas alteradas) permanece igual ao prod.

### 2. Modificação em `KK0690` — conversão de parallelGateway para exclusiveGateway
- **ID principal:** `KK0690` (**elemento existente em prod — substituir a tag**)
- **Linha(s) no DB dev:** 4558-4563
- **Vizinho anterior imediato (XML):** não se aplica — elemento existente; localizar por `id="KK0690"` e substituir
- **Explicação:**
  - Em prod é `<bpmn:parallelGateway>` com 2 saídas (`Flow_02tfitj`, `KK0647`). No dev foi convertido para `<bpmn:exclusiveGateway>` com `KK0472="Flow_02tfitj"` e acrescido do terceiro ramo KK0921 (`Flow_1npcvld`) e do incoming `Flow_1tl6o2i`. **Substituir a tag inteira.**

```xml
    <bpmn:exclusiveGateway id="KK0690" KK0472="Flow_02tfitj">
      <bpmn:incoming>Flow_1tl6o2i</bpmn:incoming>
      <bpmn:outgoing>Flow_02tfitj</bpmn:outgoing>
      <bpmn:outgoing>KK0647</bpmn:outgoing>
      <bpmn:outgoing>Flow_1npcvld</bpmn:outgoing>
    </bpmn:exclusiveGateway>
```

### 3. Flow KK0472 (KK1283) — sem alteração funcional
- **ID principal:** `Flow_02tfitj` (**elemento existente em prod — sem mudança de conteúdo**)
- **Linha(s) no DB dev:** 4635-4645
- **Vizinho anterior imediato (XML):** não se aplica — elemento existente
- **Explicação:**
  - Já existe em prod com o mesmo corpo (executionListener com `KK0437`). A única mudança foi a remoção da `conditionExpression` (que era inválida em KK0472 flow no KK0217 7). **Não precisa de ação em prod** — a remoção da condition em KK0472 flow é obrigatória pelo KK0217 e pode ser feita no Modeler ao editar o KK0669.

```xml
    <bpmn:sequenceFlow id="Flow_02tfitj" sourceRef="KK0690" targetRef="KK1076">
      <bpmn:extensionElements>
        <KK0223 KK0604="take">
          <camunda:KK1223 scriptFormat="javascript">var dateUpdate = new Date();
 dateUpdate.setTime(dateUpdate.getTime() + dateUpdate.getTimezoneOffset() * 60 * 1000 /* convert to UTC */ - (/* UTC-6 */ 6) * 60 *
 60 * 1000);

 KK0615.KK1288("KK0437", dateUpdate.toISOString().split('.')[0])</camunda:KK1223>
        </KK0223>
      </bpmn:extensionElements>
    </bpmn:sequenceFlow>
```

### 4. Modificação em `KK0647` — branch não-KK0921 com condição explícita
- **ID principal:** `KK0647` (**elemento existente em prod — adicionar `conditionExpression`**)
- **Linha(s) no DB dev:** 4651-4653
- **Vizinho anterior imediato (XML):** não se aplica — elemento existente; localizar por `id="KK0647"` e substituir
- **Explicação:**
  - Em prod é self-closing `/>` (sem condition). No dev recebeu `conditionExpression` explícita para rotear apenas quando `KK0945 == false`, complementando a lógica do KK0669 exclusivo.

```xml
    <bpmn:sequenceFlow id="KK0647" sourceRef="KK0690" targetRef="KK0020">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${KK0615.hasVariable("KK0945") &amp;&amp; KK0945 == false}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
```

### 5. Flow KK0921
- **ID principal:** `Flow_1npcvld`
- **Linha(s) no DB:** 4654-4656
- **Vizinho anterior imediato (XML):** `KK0647` (linha 4651)
- **Explicação:**
  - Branch quando `KK0945 == true`, ativando o `KK1399`.

```xml
    <bpmn:sequenceFlow id="Flow_1npcvld" sourceRef="KK0690" targetRef="KK1399">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${KK0615.hasVariable("KK0945") &amp;&amp; KK0945 == true}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
```

### 6. Flows de conexão KK0921
- **KK0755:** `Flow_1npcfrm`, `Flow_1npcjoin`, `Flow_1npcerr`, `Flow_1npcok_evt`, `Flow_1npcerr_evt`
- **Linha(s) no DB:** 4657-4661
- **Vizinho anterior imediato (XML):** `Flow_1npcvld` (linha 4654)
- **Explicação:**
  - Cinco sequence KK0649 que conectam `KK1399` → `Event_1npcok`, `formaliza_npc` → `Gateway_00yrdx0` (join), `Event_1npcerrb` → `Event_1npcerr`, `Event_1npcok` → `formaliza_npc`, e `Event_1npcerr` → `formaliza_npc`. Precisam ser inseridos antes dos eventos e KK1335 que referenciam.

```xml
    <bpmn:sequenceFlow id="Flow_1npcfrm" sourceRef="KK1399" targetRef="Event_1npcok" />
    <bpmn:sequenceFlow id="Flow_1npcjoin" sourceRef="formaliza_npc" targetRef="Gateway_00yrdx0" />
    <bpmn:sequenceFlow id="Flow_1npcerr" sourceRef="Event_1npcerrb" targetRef="Event_1npcerr" />
    <bpmn:sequenceFlow id="Flow_1npcok_evt" sourceRef="Event_1npcok" targetRef="formaliza_npc" />
    <bpmn:sequenceFlow id="Flow_1npcerr_evt" sourceRef="Event_1npcerr" targetRef="formaliza_npc" />
```

### 7. KK0609 intermediário — sucesso na KK1406 KK1124 KK0921
- **ID principal:** `Event_1npcok`
- **Linha(s) no DB:** 4662-4670
- **Vizinho anterior imediato (XML):** `Flow_1npcerr_evt` (linha 4661)
- **Explicação:**
  - KK0609 intermediário throw que registra `status_validacao_proxy_npc = "Sucesso"` e direciona para `formaliza_npc`.

```xml
    <bpmn:intermediateThrowEvent id="Event_1npcok" name="KK1405 KK1124 KK0921 com sucesso">
      <bpmn:extensionElements>
        <camunda:KK0775>
          <camunda:outputParameter name="status_validacao_proxy_npc">Sucesso</camunda:outputParameter>
        </camunda:KK0775>
      </bpmn:extensionElements>
      <bpmn:incoming>Flow_1npcfrm</bpmn:incoming>
      <bpmn:outgoing>Flow_1npcok_evt</bpmn:outgoing>
    </bpmn:intermediateThrowEvent>
```

### 8. KK0609 intermediário — erro na KK1406 KK1124 KK0921
- **ID principal:** `Event_1npcerr`
- **Linha(s) no DB:** 4671-4679
- **Vizinho anterior imediato (XML):** `Event_1npcok` fechando em linha 4670
- **Explicação:**
  - KK0609 intermediário throw que registra `status_validacao_proxy_npc = "Erro"` (fallback) e também direciona para `formaliza_npc`. Implementa o comportamento de seguir sem KK1124 em caso de erro.

```xml
    <bpmn:intermediateThrowEvent id="Event_1npcerr" name="KK1405 KK1124 KK0921 com erro">
      <bpmn:extensionElements>
        <camunda:KK0775>
          <camunda:outputParameter name="status_validacao_proxy_npc">Erro</camunda:outputParameter>
        </camunda:KK0775>
      </bpmn:extensionElements>
      <bpmn:incoming>Flow_1npcerr</bpmn:incoming>
      <bpmn:outgoing>Flow_1npcerr_evt</bpmn:outgoing>
    </bpmn:intermediateThrowEvent>
```

### 9. Service KK1332 KK1399
- **ID principal:** `KK1399`
- **Linha(s) no DB:** 4680-4716
- **Vizinho anterior imediato (XML):** `Event_1npcerr` fechando em linha 4679
- **Explicação:**
  - External KK1332 de KK1406 do KK1124 KK0921 com parâmetros de KK1190/fallback.

```xml
    <bpmn:serviceTask id="KK1399" name="KK1404 KK1123 KK0921" camunda:modelerTemplate="operacao-get-assync" camunda:modelerTemplateVersion="1" KK0220="true" KK0222="${KK0966}">
      <bpmn:extensionElements>
        <camunda:KK0775>
          <camunda:inputParameter name="dados_proposta">
            <camunda:map>
              <camunda:entry key="KK0745">${KK0615.hasVariable("KK0745") ? KK0745 : null}</camunda:entry>
              <camunda:entry key="KK1127">${KK0615.hasVariable("KK1127") ? KK1127 : null}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="urlDev">https://KK1124-v1-multiple-noname.api-sp.dev.aws.cloud.ihf/KK1124-multiple-noname/v1/proxies/${KK0615.hasVariable("KK1127") ? KK1127 : ""}/cards-details</camunda:inputParameter>
          <camunda:inputParameter name="urlHomolog">https://KK1124-v1-multiple-noname.api-sp.hom.aws.cloud.ihf/KK1124-multiple-noname/v1/proxies/${KK0615.hasVariable("KK1127") ? KK1127 : ""}/cards-details</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">https://KK1124-v1-multiple-noname.api-sp.prod.aws.cloud.ihf/KK1124-multiple-noname/v1/proxies/${KK0615.hasVariable("KK1127") ? KK1127 : ""}/cards-details</camunda:inputParameter>
          <camunda:inputParameter name="headersDev">{"x-itau-correlationID":"${KK0615.KK0728('x-itau-correlationID')}"}</camunda:inputParameter>
          <camunda:inputParameter name="headersHomolog">{"x-itau-correlationID":"${KK0615.KK0728('x-itau-correlationID')}"}</camunda:inputParameter>
          <camunda:inputParameter name="headersProd">{"x-itau-correlationID":"${KK0615.KK0728('x-itau-correlationID')}"}</camunda:inputParameter>
          <camunda:inputParameter name="valida-KK1124-npc_retry_max_tentativas">${3}</camunda:inputParameter>
          <camunda:inputParameter name="valida-KK1124-npc_retry_intervalo_segundos">${5}</camunda:inputParameter>
          <camunda:inputParameter name="valida-KK1124-npc_4xx_sem_retry_fallback_sem_proxy">${true}</camunda:inputParameter>
          <camunda:inputParameter name="valida-KK1124-npc_5xx_retry3_fallback_sem_proxy">${true}</camunda:inputParameter>
          <camunda:outputParameter name="proxy_valido">${KK0615.hasVariable("valida-KK1124-npc_resposta") ? KK0615.KK0728("valida-KK1124-npc_resposta")["proxy_valido"] : null}</camunda:outputParameter>
          <camunda:outputParameter name="codigo_retorno">${KK0615.hasVariable("valida-KK1124-npc_resposta") ? KK0615.KK0728("valida-KK1124-npc_resposta")["codigo_retorno"] : null}</camunda:outputParameter>
          <camunda:outputParameter name="mensagem_retorno">${KK0615.hasVariable("valida-KK1124-npc_resposta") ? KK0615.KK0728("valida-KK1124-npc_resposta")["mensagem_retorno"] : null}</camunda:outputParameter>
        </camunda:KK0775>
        <camunda:failedJobRetryTimeCycle>R3/PT5S</camunda:failedJobRetryTimeCycle>
        <camunda:field name="withError">
          <KK0224>true</KK0224>
        </camunda:field>
        <camunda:field name="errorRefExpression">
          <camunda:string>CO8_PROXY_NPC</camunda:string>
        </camunda:field>
        <camunda:field name="throwExpression">
          <KK0224>${statusCode != 200}</KK0224>
        </camunda:field>
      </bpmn:extensionElements>
      <bpmn:incoming>Flow_1npcvld</bpmn:incoming>
      <bpmn:outgoing>Flow_1npcfrm</bpmn:outgoing>
    </bpmn:serviceTask>
```

### 10. KK0165 KK0604 — erro no KK1399
- **ID principal:** `Event_1npcerrb`
- **Linha(s) no DB:** 4717-4720
- **Vizinho anterior imediato (XML):** `KK1399` fechando em linha 4716
- **Explicação:**
  - KK0165 KK0604 de erro acoplado ao `KK1399`. Captura erros (`CO8_PROXY_NPC`) e redireciona para o KK0610 de fallback `Event_1npcerr`.

```xml
    <bpmn:KK0169 id="Event_1npcerrb" attachedToRef="KK1399">
      <bpmn:outgoing>Flow_1npcerr</bpmn:outgoing>
      <bpmn:errorEventDefinition id="ErrorEventDefinition_1npcerr" />
    </bpmn:KK0169>
```

### 11. Service KK1332 formaliza_npc
- **ID principal:** `formaliza_npc`
- **Linha(s) no DB:** 4721-4738
- **Vizinho anterior imediato (XML):** `Event_1npcerrb` fechando em linha 4720
- **Explicação:**
  - KK0258 de KK0657 com headers/urls/body por ambiente.

```xml
    <bpmn:serviceTask id="formaliza_npc" name="Formalizar KK0921" camunda:modelerTemplate="operacao-post-assync" camunda:modelerTemplateVersion="1" KK0220="true" KK0222="${operacaoPostDelegate}">
      <bpmn:extensionElements>
        <camunda:KK0775>
          <camunda:inputParameter name="urlDev">${KK0615.hasVariable("formaliza_npc_url_dev") ? formaliza_npc_url_dev : ""}</camunda:inputParameter>
          <camunda:inputParameter name="urlHomolog">${KK0615.hasVariable("formaliza_npc_url_homolog") ? formaliza_npc_url_homolog : ""}</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">${KK0615.hasVariable("formaliza_npc_url_prod") ? formaliza_npc_url_prod : ""}</camunda:inputParameter>
          <camunda:inputParameter name="headersDev">{"Content-Type":"application/json","x-itau-correlationID":"${KK0615.KK0728('x-itau-correlationID')}"}</camunda:inputParameter>
          <camunda:inputParameter name="headersHomolog">{"Content-Type":"application/json","x-itau-correlationID":"${KK0615.KK0728('x-itau-correlationID')}"}</camunda:inputParameter>
          <camunda:inputParameter name="headersProd">{"Content-Type":"application/json","x-itau-correlationID":"${KK0615.KK0728('x-itau-correlationID')}"}</camunda:inputParameter>
          <camunda:inputParameter name="bodyDev">{"KK0745":"${KK0615.hasVariable('KK0745') ? KK0745 : ""}","KK0945":"${KK0615.hasVariable('KK0945') ? KK0945 : false}","dados_proposta":${KK0615.hasVariable('dados_proposta') ? dados_proposta : "{}"}}</camunda:inputParameter>
          <camunda:inputParameter name="bodyHomolog">{"KK0745":"${KK0615.hasVariable('KK0745') ? KK0745 : ""}","KK0945":"${KK0615.hasVariable('KK0945') ? KK0945 : false}","dados_proposta":${KK0615.hasVariable('dados_proposta') ? dados_proposta : "{}"}}</camunda:inputParameter>
          <camunda:inputParameter name="bodyProd">{"KK0745":"${KK0615.hasVariable('KK0745') ? KK0745 : ""}","KK0945":"${KK0615.hasVariable('KK0945') ? KK0945 : false}","dados_proposta":${KK0615.hasVariable('dados_proposta') ? dados_proposta : "{}"}}</camunda:inputParameter>
        </camunda:KK0775>
      </bpmn:extensionElements>
      <bpmn:incoming>Flow_1npcok_evt</bpmn:incoming>
      <bpmn:incoming>Flow_1npcerr_evt</bpmn:incoming>
      <bpmn:outgoing>Flow_1npcjoin</bpmn:outgoing>
    </bpmn:serviceTask>
```

---

## 12. KK0789 — **tudo** o que é novo para o **múltiplo KK0921** (além dos §1–§11)

Os §1–§11 cobrem **KK0669**, **KK0654**, **eventos**, **`KK1399`**, **`formaliza_npc`** e o **KK1223 `KK0856`**. A lista abaixo fecha o que falta para a esteira **multiplo** em **KK0399 Oferta** e no **mapeamento de `dados_proposta`**.

| # | Onde | ID / elemento | Linha(s) DB dev (ref.) | Ação em prod |
|---|------|---------------|------------------------|--------------|
| 12.1 | User KK1332 | `KK0418` | 7500–7511 | Inserir **campos de formulário** do multiplo (XML abaixo) dentro de `<camunda:formData>`, antes de `id_oferta_contratada_ad` se em dev vier nessa ordem — ou na posição equivalente do formulário em prod. |
| 12.2 | User KK1332 | `KK0418` | 7627–7637 | Inserir **`inputParameter` `oferta_multiplo_npc_object`** (lista de 7 chaves) dentro de `<camunda:KK0775>`, **antes** de `<camunda:outputParameter name="KK0602">`. |
| 12.3 | Script KK1332 | `script_mapeia_dados_oferta_fluxo_alternativo` | 7781 | No KK0840 KK0732 `dados_proposta`, garantir a entrada **`'oferta_multiplo_npc' : KK0615.KK0728('oferta_multiplo_npc')`** junto de `'KK0939'` (mesma linha ou equivalente). |
| 12.4 | Script KK1332 | `KK1240` | 7815 | Idem **12.3** no KK1223 principal de mapeamento. |

### 12.1 — `KK0418` — **formData** (campos novos multiplo KK0921)

```xml
          <KK0225 id="oferta_multiplo_npc" label="oferta_multiplo_npc" type="string">
            <camunda:properties>
              <camunda:property id="property" value="oferta_multiplo_npc" />
            </camunda:properties>
          </KK0225>
          <KK0225 id="contratar_multiplo_npc" type="string" />
          <KK0225 id="id_produto" type="string" />
          <KK0225 id="mensalidade" type="string" />
          <KK0225 id="limite_pre_aprovado" type="string" />
          <KK0225 id="bandeira" type="string" />
          <KK0225 id="KK0745" type="string" />
          <KK0225 id="dt_vencimento" type="string" />
```

### 12.2 — `KK0418` — **KK0775** — `oferta_multiplo_npc_object`

```xml
          <camunda:inputParameter name="oferta_multiplo_npc_object">
            <camunda:list>
              <camunda:value>contratar_multiplo_npc</camunda:value>
              <camunda:value>id_produto</camunda:value>
              <camunda:value>mensalidade</camunda:value>
              <camunda:value>limite_pre_aprovado</camunda:value>
              <camunda:value>bandeira</camunda:value>
              <camunda:value>KK0745</camunda:value>
              <camunda:value>dt_vencimento</camunda:value>
            </camunda:list>
          </camunda:inputParameter>
```

### 12.3 — `script_mapeia_dados_oferta_fluxo_alternativo` — linha do KK0840 `dados_proposta`

**Trecho a garantir** (em dev está consolidado numa linha):

```groovy
'KK0939' : KK0615.KK0728('KK0939'),'oferta_multiplo_npc' : KK0615.KK0728('oferta_multiplo_npc')
```

Ou, legível:

```groovy
'KK0939' : KK0615.KK0728('KK0939'),
'oferta_multiplo_npc' : KK0615.KK0728('oferta_multiplo_npc')
```

### 12.4 — `KK1240` — idem

```groovy
'KK0939' : KK0615.KK0728('KK0939'),'oferta_multiplo_npc' : KK0615.KK0728('oferta_multiplo_npc')
```

### 12.5 — Resumo: o que já está nos §1–§11 (não repetir como “falta”)

| Conteúdo | § |
|----------|---|
| Script `KK0856` (`KK0745`, `KK0945`, `oferta_multiplo_npc`) | §1 |
| `KK0690` exclusivo + `KK0647` / `Flow_1npcvld` / `Flow_02tfitj` | §§2–5 |
| Flows `Flow_1npcfrm` … `Flow_1npcerr_evt` | §6 |
| `Event_1npcok` / `Event_1npcerr` | §§7–8 |
| `KK1399` + KK0166 `Event_1npcerrb` | §§9–10 |
| `formaliza_npc` | §11 |

**Consulta única ao bloco completo `KK0418` no banco (dev):**

```sql
SELECT linha_bpmn, conteudo
FROM bpmn_linhas_wrapped_env
WHERE ambiente = 'dev'
  AND linha_bpmn BETWEEN 7043 AND 7645
ORDER BY linha_bpmn;
```

---

## Observações de KK0880

1. Preserve **KK0755 e ordem**: qualquer renomeação precisa ser aplicada em todas as referências (KK0649, DI e shapes).
2. Use o **vizinho anterior imediato** no XML para localizar o ponto de colagem no ficheiro de produção.
3. Caso o XML de produção tenha divergências de indentação, mantenha apenas o conteúdo funcional (tags e atributos).
4. **Não** confundir **linha no KK0492** com **`linha_bpmn`** no MySQL: a segunda é índice do XML fatiado.
5. **`formaliza_npc`** não expõe no JSON do modelo campos explícitos para `proxy_valido` / `codigo_retorno` / `status_validacao_proxy_npc`; se a KK0657 precisar do resultado da KK1406, tratar via **`dados_proposta`** (ou KK0473), em linha com **KK0399 Oferta** e KK1245 de mapeamento.

Documento DD8026 | Lote KK1084 [2026-04-01 14:30:36] | DD8001: MySQL ddd_registros (lotes, lote_arquivos) · [DD0001 KK0253 de documentos](../registros/REGISTRO_DOCUMENTOS.md) · relacionados: **DD8024**, **DD8022**, **DD8030**
