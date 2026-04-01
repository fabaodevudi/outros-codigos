# Plano de migração NPC — bloco Multiplo (manual para produção)

Documento DD8026

Fonte de verdade: `ddd_registros.bpmn_linhas_wrapped_env` (`ambiente=dev`, KK1017).

## Objetivo
Migrar manualmente para produção **todos os blocos do multiplo NPC**, mantendo IDs, ordem de XML e vizinho imediato anterior para facilitar colagem no XML de produção.

## Blocos novos — XML e vizinho anterior (ordem do banco)

### 1. Modificação em `mapeia_campos_ge` — script de preparação de oferta
- **ID principal:** `mapeia_campos_ge` (**elemento existente em prod — alterar apenas as linhas indicadas no diff**)
- **Linha(s) no DB dev:** 493-527
- **Localização em prod:** buscar `id="mapeia_campos_ge"` no XML e aplicar o diff abaixo

#### Resumo das mudanças

| # | Tipo | O que mudou |
|---|---|---|
| 1 | **Alteração** | `valor_limite_maximo_cartao`: de valor simples → lógica com `limite_cartao_direcionador` |
| 2 | **Inserção** | `id_intencao`: inicializa com null se não existir na execução |
| 3 | **Inserção** | `oferta_npc`: inicializa a partir de `is_npc` se não existir |
| 4 | **Inserção** | Bloco `if(oferta_multiplo_npc != null)`: sobrescreve `id_intencao` e `oferta_npc` com dados do multiplo NPC |

#### ANTES (prod)

```javascript
execution.setVariable("valor_limite_maximo_cartao", valor_maximo_cartao_credito);
execution.setVariable("indicador_overlimit", ofertaProdutos.get('indicador_overlimit')); //ok
```

#### DEPOIS (dev)

```javascript
execution.setVariable("valor_limite_maximo_cartao", (execution.hasVariable("limite_cartao_direcionador") && limite_cartao_direcionador != null && limite_cartao_direcionador != "" ? limite_cartao_direcionador : valor_maximo_cartao_credito));
execution.setVariable("id_intencao", execution.hasVariable("id_intencao") ? id_intencao : null);
execution.setVariable("oferta_npc", execution.hasVariable("oferta_npc") ? oferta_npc : (execution.hasVariable("is_npc") ? is_npc : false));
if(execution.hasVariable("oferta_multiplo_npc") && oferta_multiplo_npc != null){ def om=oferta_multiplo_npc; if(om.get("id_intencao")!=null) execution.setVariable("id_intencao", om.get("id_intencao")); if(om.get("contratar_multiplo_npc")!=null) execution.setVariable("oferta_npc", om.get("contratar_multiplo_npc")); }
execution.setVariable("indicador_overlimit", ofertaProdutos.get('indicador_overlimit')); //ok
```

> **Nota:** o restante do script (acima e abaixo das linhas alteradas) permanece igual ao prod.

### 2. Modificação em `Gateway_11349uj` — conversão de parallelGateway para exclusiveGateway
- **ID principal:** `Gateway_11349uj` (**elemento existente em prod — substituir a tag**)
- **Linha(s) no DB dev:** 4558-4563
- **Vizinho anterior imediato (XML):** não se aplica — elemento existente; localizar por `id="Gateway_11349uj"` e substituir
- **Explicação:**
  - Em prod é `<bpmn:parallelGateway>` com 2 saídas (`Flow_02tfitj`, `Flow_019bzq6`). No dev foi convertido para `<bpmn:exclusiveGateway>` com `default="Flow_02tfitj"` e acrescido do terceiro ramo NPC (`Flow_1npcvld`) e do incoming `Flow_1tl6o2i`. **Substituir a tag inteira.**

```xml
    <bpmn:exclusiveGateway id="Gateway_11349uj" default="Flow_02tfitj">
      <bpmn:incoming>Flow_1tl6o2i</bpmn:incoming>
      <bpmn:outgoing>Flow_02tfitj</bpmn:outgoing>
      <bpmn:outgoing>Flow_019bzq6</bpmn:outgoing>
      <bpmn:outgoing>Flow_1npcvld</bpmn:outgoing>
    </bpmn:exclusiveGateway>
```

### 3. Flow default (setup) — sem alteração funcional
- **ID principal:** `Flow_02tfitj` (**elemento existente em prod — sem mudança de conteúdo**)
- **Linha(s) no DB dev:** 4635-4645
- **Vizinho anterior imediato (XML):** não se aplica — elemento existente
- **Explicação:**
  - Já existe em prod com o mesmo corpo (executionListener com `date_update`). A única mudança foi a remoção da `conditionExpression` (que era inválida em default flow no Camunda 7). **Não precisa de ação em prod** — a remoção da condition em default flow é obrigatória pelo Camunda e pode ser feita no Modeler ao editar o gateway.

```xml
    <bpmn:sequenceFlow id="Flow_02tfitj" sourceRef="Gateway_11349uj" targetRef="producer_atualiza_setup_contas">
      <bpmn:extensionElements>
        <camunda:executionListener event="take">
          <camunda:script scriptFormat="javascript">var dateUpdate = new Date();
 dateUpdate.setTime(dateUpdate.getTime() + dateUpdate.getTimezoneOffset() * 60 * 1000 /* convert to UTC */ - (/* UTC-6 */ 6) * 60 *
 60 * 1000);

 execution.setVariable("date_update", dateUpdate.toISOString().split('.')[0])</camunda:script>
        </camunda:executionListener>
      </bpmn:extensionElements>
    </bpmn:sequenceFlow>
```

### 4. Modificação em `Flow_019bzq6` — branch não-NPC com condição explícita
- **ID principal:** `Flow_019bzq6` (**elemento existente em prod — adicionar `conditionExpression`**)
- **Linha(s) no DB dev:** 4651-4653
- **Vizinho anterior imediato (XML):** não se aplica — elemento existente; localizar por `id="Flow_019bzq6"` e substituir
- **Explicação:**
  - Em prod é self-closing `/>` (sem condition). No dev recebeu `conditionExpression` explícita para rotear apenas quando `oferta_npc == false`, complementando a lógica do gateway exclusivo.

```xml
    <bpmn:sequenceFlow id="Flow_019bzq6" sourceRef="Gateway_11349uj" targetRef="Activity_0bj2jjf">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${execution.hasVariable("oferta_npc") &amp;&amp; oferta_npc == false}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
```

### 5. Flow NPC
- **ID principal:** `Flow_1npcvld`
- **Linha(s) no DB:** 4654-4656
- **Vizinho anterior imediato (XML):** `Flow_019bzq6` (linha 4651)
- **Explicação:**
  - Branch quando `oferta_npc == true`, ativando o `valida_proxy_npc`.

```xml
    <bpmn:sequenceFlow id="Flow_1npcvld" sourceRef="Gateway_11349uj" targetRef="valida_proxy_npc">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${execution.hasVariable("oferta_npc") &amp;&amp; oferta_npc == true}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
```

### 6. Flows de conexão NPC
- **IDs:** `Flow_1npcfrm`, `Flow_1npcjoin`, `Flow_1npcerr`, `Flow_1npcok_evt`, `Flow_1npcerr_evt`
- **Linha(s) no DB:** 4657-4661
- **Vizinho anterior imediato (XML):** `Flow_1npcvld` (linha 4654)
- **Explicação:**
  - Cinco sequence flows que conectam `valida_proxy_npc` → `Event_1npcok`, `formaliza_npc` → `Gateway_00yrdx0` (join), `Event_1npcerrb` → `Event_1npcerr`, `Event_1npcok` → `formaliza_npc`, e `Event_1npcerr` → `formaliza_npc`. Precisam ser inseridos antes dos eventos e tasks que referenciam.

```xml
    <bpmn:sequenceFlow id="Flow_1npcfrm" sourceRef="valida_proxy_npc" targetRef="Event_1npcok" />
    <bpmn:sequenceFlow id="Flow_1npcjoin" sourceRef="formaliza_npc" targetRef="Gateway_00yrdx0" />
    <bpmn:sequenceFlow id="Flow_1npcerr" sourceRef="Event_1npcerrb" targetRef="Event_1npcerr" />
    <bpmn:sequenceFlow id="Flow_1npcok_evt" sourceRef="Event_1npcok" targetRef="formaliza_npc" />
    <bpmn:sequenceFlow id="Flow_1npcerr_evt" sourceRef="Event_1npcerr" targetRef="formaliza_npc" />
```

### 7. Evento intermediário — sucesso na validação proxy NPC
- **ID principal:** `Event_1npcok`
- **Linha(s) no DB:** 4662-4670
- **Vizinho anterior imediato (XML):** `Flow_1npcerr_evt` (linha 4661)
- **Explicação:**
  - Evento intermediário throw que registra `status_validacao_proxy_npc = "Sucesso"` e direciona para `formaliza_npc`.

```xml
    <bpmn:intermediateThrowEvent id="Event_1npcok" name="Validação proxy NPC com sucesso">
      <bpmn:extensionElements>
        <camunda:inputOutput>
          <camunda:outputParameter name="status_validacao_proxy_npc">Sucesso</camunda:outputParameter>
        </camunda:inputOutput>
      </bpmn:extensionElements>
      <bpmn:incoming>Flow_1npcfrm</bpmn:incoming>
      <bpmn:outgoing>Flow_1npcok_evt</bpmn:outgoing>
    </bpmn:intermediateThrowEvent>
```

### 8. Evento intermediário — erro na validação proxy NPC
- **ID principal:** `Event_1npcerr`
- **Linha(s) no DB:** 4671-4679
- **Vizinho anterior imediato (XML):** `Event_1npcok` fechando em linha 4670
- **Explicação:**
  - Evento intermediário throw que registra `status_validacao_proxy_npc = "Erro"` (fallback) e também direciona para `formaliza_npc`. Implementa o comportamento de seguir sem proxy em caso de erro.

```xml
    <bpmn:intermediateThrowEvent id="Event_1npcerr" name="Validação proxy NPC com erro">
      <bpmn:extensionElements>
        <camunda:inputOutput>
          <camunda:outputParameter name="status_validacao_proxy_npc">Erro</camunda:outputParameter>
        </camunda:inputOutput>
      </bpmn:extensionElements>
      <bpmn:incoming>Flow_1npcerr</bpmn:incoming>
      <bpmn:outgoing>Flow_1npcerr_evt</bpmn:outgoing>
    </bpmn:intermediateThrowEvent>
```

### 9. Service task valida_proxy_npc
- **ID principal:** `valida_proxy_npc`
- **Linha(s) no DB:** 4680-4716
- **Vizinho anterior imediato (XML):** `Event_1npcerr` fechando em linha 4679
- **Explicação:**
  - External task de validação do proxy NPC com parâmetros de retry/fallback.

```xml
    <bpmn:serviceTask id="valida_proxy_npc" name="Validar Proxy NPC" camunda:modelerTemplate="operacao-get-assync" camunda:modelerTemplateVersion="1" camunda:asyncBefore="true" camunda:delegateExpression="${operacaoGetDelegate}">
      <bpmn:extensionElements>
        <camunda:inputOutput>
          <camunda:inputParameter name="dados_proposta">
            <camunda:map>
              <camunda:entry key="id_intencao">${execution.hasVariable("id_intencao") ? id_intencao : null}</camunda:entry>
              <camunda:entry key="proxy_npc">${execution.hasVariable("proxy_npc") ? proxy_npc : null}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="urlDev">https://proxy-v1-multiple-noname.api-sp.dev.aws.cloud.ihf/proxy-multiple-noname/v1/proxies/${execution.hasVariable("proxy_npc") ? proxy_npc : ""}/cards-details</camunda:inputParameter>
          <camunda:inputParameter name="urlHomolog">https://proxy-v1-multiple-noname.api-sp.hom.aws.cloud.ihf/proxy-multiple-noname/v1/proxies/${execution.hasVariable("proxy_npc") ? proxy_npc : ""}/cards-details</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">https://proxy-v1-multiple-noname.api-sp.prod.aws.cloud.ihf/proxy-multiple-noname/v1/proxies/${execution.hasVariable("proxy_npc") ? proxy_npc : ""}/cards-details</camunda:inputParameter>
          <camunda:inputParameter name="headersDev">{"x-itau-correlationID":"${execution.getVariable('x-itau-correlationID')}"}</camunda:inputParameter>
          <camunda:inputParameter name="headersHomolog">{"x-itau-correlationID":"${execution.getVariable('x-itau-correlationID')}"}</camunda:inputParameter>
          <camunda:inputParameter name="headersProd">{"x-itau-correlationID":"${execution.getVariable('x-itau-correlationID')}"}</camunda:inputParameter>
          <camunda:inputParameter name="valida-proxy-npc_retry_max_tentativas">${3}</camunda:inputParameter>
          <camunda:inputParameter name="valida-proxy-npc_retry_intervalo_segundos">${5}</camunda:inputParameter>
          <camunda:inputParameter name="valida-proxy-npc_4xx_sem_retry_fallback_sem_proxy">${true}</camunda:inputParameter>
          <camunda:inputParameter name="valida-proxy-npc_5xx_retry3_fallback_sem_proxy">${true}</camunda:inputParameter>
          <camunda:outputParameter name="proxy_valido">${execution.hasVariable("valida-proxy-npc_resposta") ? execution.getVariable("valida-proxy-npc_resposta")["proxy_valido"] : null}</camunda:outputParameter>
          <camunda:outputParameter name="codigo_retorno">${execution.hasVariable("valida-proxy-npc_resposta") ? execution.getVariable("valida-proxy-npc_resposta")["codigo_retorno"] : null}</camunda:outputParameter>
          <camunda:outputParameter name="mensagem_retorno">${execution.hasVariable("valida-proxy-npc_resposta") ? execution.getVariable("valida-proxy-npc_resposta")["mensagem_retorno"] : null}</camunda:outputParameter>
        </camunda:inputOutput>
        <camunda:failedJobRetryTimeCycle>R3/PT5S</camunda:failedJobRetryTimeCycle>
        <camunda:field name="withError">
          <camunda:expression>true</camunda:expression>
        </camunda:field>
        <camunda:field name="errorRefExpression">
          <camunda:string>CO8_PROXY_NPC</camunda:string>
        </camunda:field>
        <camunda:field name="throwExpression">
          <camunda:expression>${statusCode != 200}</camunda:expression>
        </camunda:field>
      </bpmn:extensionElements>
      <bpmn:incoming>Flow_1npcvld</bpmn:incoming>
      <bpmn:outgoing>Flow_1npcfrm</bpmn:outgoing>
    </bpmn:serviceTask>
```

### 10. Boundary event — erro no valida_proxy_npc
- **ID principal:** `Event_1npcerrb`
- **Linha(s) no DB:** 4717-4720
- **Vizinho anterior imediato (XML):** `valida_proxy_npc` fechando em linha 4716
- **Explicação:**
  - Boundary event de erro acoplado ao `valida_proxy_npc`. Captura erros (`CO8_PROXY_NPC`) e redireciona para o evento de fallback `Event_1npcerr`.

```xml
    <bpmn:boundaryEvent id="Event_1npcerrb" attachedToRef="valida_proxy_npc">
      <bpmn:outgoing>Flow_1npcerr</bpmn:outgoing>
      <bpmn:errorEventDefinition id="ErrorEventDefinition_1npcerr" />
    </bpmn:boundaryEvent>
```

### 11. Service task formaliza_npc
- **ID principal:** `formaliza_npc`
- **Linha(s) no DB:** 4721-4738
- **Vizinho anterior imediato (XML):** `Event_1npcerrb` fechando em linha 4720
- **Explicação:**
  - Chamada de formalização com headers/urls/body por ambiente.

```xml
    <bpmn:serviceTask id="formaliza_npc" name="Formalizar NPC" camunda:modelerTemplate="operacao-post-assync" camunda:modelerTemplateVersion="1" camunda:asyncBefore="true" camunda:delegateExpression="${operacaoPostDelegate}">
      <bpmn:extensionElements>
        <camunda:inputOutput>
          <camunda:inputParameter name="urlDev">${execution.hasVariable("formaliza_npc_url_dev") ? formaliza_npc_url_dev : ""}</camunda:inputParameter>
          <camunda:inputParameter name="urlHomolog">${execution.hasVariable("formaliza_npc_url_homolog") ? formaliza_npc_url_homolog : ""}</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">${execution.hasVariable("formaliza_npc_url_prod") ? formaliza_npc_url_prod : ""}</camunda:inputParameter>
          <camunda:inputParameter name="headersDev">{"Content-Type":"application/json","x-itau-correlationID":"${execution.getVariable('x-itau-correlationID')}"}</camunda:inputParameter>
          <camunda:inputParameter name="headersHomolog">{"Content-Type":"application/json","x-itau-correlationID":"${execution.getVariable('x-itau-correlationID')}"}</camunda:inputParameter>
          <camunda:inputParameter name="headersProd">{"Content-Type":"application/json","x-itau-correlationID":"${execution.getVariable('x-itau-correlationID')}"}</camunda:inputParameter>
          <camunda:inputParameter name="bodyDev">{"id_intencao":"${execution.hasVariable('id_intencao') ? id_intencao : ""}","oferta_npc":"${execution.hasVariable('oferta_npc') ? oferta_npc : false}","dados_proposta":${execution.hasVariable('dados_proposta') ? dados_proposta : "{}"}}</camunda:inputParameter>
          <camunda:inputParameter name="bodyHomolog">{"id_intencao":"${execution.hasVariable('id_intencao') ? id_intencao : ""}","oferta_npc":"${execution.hasVariable('oferta_npc') ? oferta_npc : false}","dados_proposta":${execution.hasVariable('dados_proposta') ? dados_proposta : "{}"}}</camunda:inputParameter>
          <camunda:inputParameter name="bodyProd">{"id_intencao":"${execution.hasVariable('id_intencao') ? id_intencao : ""}","oferta_npc":"${execution.hasVariable('oferta_npc') ? oferta_npc : false}","dados_proposta":${execution.hasVariable('dados_proposta') ? dados_proposta : "{}"}}</camunda:inputParameter>
        </camunda:inputOutput>
      </bpmn:extensionElements>
      <bpmn:incoming>Flow_1npcok_evt</bpmn:incoming>
      <bpmn:incoming>Flow_1npcerr_evt</bpmn:incoming>
      <bpmn:outgoing>Flow_1npcjoin</bpmn:outgoing>
    </bpmn:serviceTask>
```

## Observações de migração
1. Preserve **IDs e ordem**: qualquer renomeação precisa ser aplicada em todas as referências (flows, DI e shapes).
2. Use o vizinho anterior imediato para localizar o ponto de colagem no XML de produção.
3. Caso o XML de produção tenha divergências de indentação, mantenha apenas o conteúdo funcional (tags e atributos).

Documento DD8026 | Lote KK1021 [2026-03-31 23:17:21] | DD8001: MySQL ddd_registros (lotes, lote_arquivos) · [DD0001 Catálogo de documentos](../registros/REGISTRO_DOCUMENTOS.md)
