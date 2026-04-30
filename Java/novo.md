# Diff Manual Itaú

Arquivo base:
- `aplicar/omnichannel_v2.txt`
- `aplicar/recorte_dados_oferta_formalizacao_ate_ge.txt`

Objetivo:
- parar de regravar `dados_proposta` no `executionListener end` da `dados_oferta`
- normalizar apenas `oferta_multiplo_npc`
- trocar condições e `valida_proxy_npc` para ler `oferta_multiplo_npc` direto

## 1. `dados_oferta` listener end

### Substituir por este bloco
```groovy
if (execution.getVariable('oferta_multiplo_npc') != null) {
  execution.setVariable('oferta_multiplo_npc', [
    contratar_multiplo_npc       : execution.getVariable('contratar_multiplo_npc'),
    id_produto                   : execution.getVariable('id_produto_npc'),
    id_oferta                    : execution.getVariable('id_oferta_npc'),
    id_plano                     : execution.getVariable('id_plano_npc'),
    id_intencao                  : execution.getVariable('id_intencao_npc'),
    descricao_cartao             : execution.getVariable('descricao_cartao_npc'),
    descricao_plano              : execution.getVariable('descricao_plano_npc'),
    anuidade                     : execution.getVariable('anuidade_npc'),
    limite_minimo_disponivel     : execution.getVariable('limite_minimo_disponivel_npc'),
    limite_pre_aprovado          : execution.getVariable('limite_pre_aprovado_npc'),
    bandeira                     : execution.getVariable('bandeira_npc'),
    dn                           : execution.getVariable('dn_npc'),
    proxy_npc                    : execution.getVariable('proxy_npc'),
    dt_vencimento                : execution.getVariable('dt_vencimento_npc'),
    canal_origem_npc             : execution.getVariable('canal_origem_npc'),
    subcanal_origem_npc          : execution.getVariable('subcanal_origem_npc'),
    id_jornada_npc               : execution.getVariable('id_jornada_npc')
  ])
}
```

### Remover deste ponto
- `import groovy.json.JsonBuilder`
- `import groovy.json.JsonSlurperClassic`
- `parseText(execution.getVariable('dados_proposta').toString())`
- `execution.setVariable('dados_proposta', ...)`

## 2. Condição do fluxo sem NPC para Proxy BC

### `v2`
Substituir a expressão de `Flow_0dd7bl8` por:
```juel
${!(execution.hasVariable('oferta_multiplo_npc') && oferta_multiplo_npc != null && oferta_multiplo_npc.contratar_multiplo_npc == true) && codigo_proxy_plastico_cartao != null && codigo_proxy_plastico_cartao != 'null' && codigo_proxy_plastico_cartao != ''}
```

### Recorte
Substituir a expressão de `Flow_00gz1dc` por:
```juel
${!(execution.hasVariable('oferta_multiplo_npc') && oferta_multiplo_npc != null && oferta_multiplo_npc.contratar_multiplo_npc == true) && codigo_proxy_plastico_cartao != null && codigo_proxy_plastico_cartao != 'null' && codigo_proxy_plastico_cartao != ''}
```

## 3. Condição do fluxo com NPC e proxy para `valida_proxy_npc`

### `v2`
Substituir a expressão de `Flow_1qkibhx` por:
```juel
${execution.hasVariable('oferta_multiplo_npc') && oferta_multiplo_npc != null && oferta_multiplo_npc.contratar_multiplo_npc == true && oferta_multiplo_npc.proxy_npc != null && oferta_multiplo_npc.proxy_npc != 'null' && oferta_multiplo_npc.proxy_npc.trim() != ''}
```

### Recorte
Substituir a expressão de `Flow_03hrob5` por:
```juel
${execution.hasVariable('oferta_multiplo_npc') && oferta_multiplo_npc != null && oferta_multiplo_npc.contratar_multiplo_npc == true && oferta_multiplo_npc.proxy_npc != null && oferta_multiplo_npc.proxy_npc != 'null' && oferta_multiplo_npc.proxy_npc.trim() != ''}
```

## 4. `valida_proxy_npc` usar `oferta_multiplo_npc` direto

### Trocar este `inputParameter`
```xml
<camunda:inputParameter name="dados_proposta">
  <camunda:map>
    <camunda:entry key="id_intencao">${oferta_multiplo_npc.id_intencao}</camunda:entry>
    <camunda:entry key="proxy_npc">${oferta_multiplo_npc.proxy_npc}</camunda:entry>
  </camunda:map>
</camunda:inputParameter>
```

### Trocar as URLs
```xml
<camunda:inputParameter name="urlDev">https://proxy-multiple-noname.api-sp.dev.aws.cloud.ihf/proxy-multiple-noname/v1/proxies/${oferta_multiplo_npc.proxy_npc}/card-details</camunda:inputParameter>
<camunda:inputParameter name="urlHomolog">https://proxy-multiple-noname.api-sp.hom.aws.cloud.ihf/proxy-multiple-noname/v1/proxies/${oferta_multiplo_npc.proxy_npc}/card-details</camunda:inputParameter>
<camunda:inputParameter name="urlProd">https://proxy-multiple-noname.api-sp.prod.aws.cloud.ihf/proxy-multiple-noname/v1/proxies/${oferta_multiplo_npc.proxy_npc}/card-details</camunda:inputParameter>
```

## 5. Diff resumido

```diff
- parseText(execution.getVariable('dados_proposta').toString())
- execution.setVariable('dados_proposta', new JsonBuilder(dadosProposta).toString())
+ execution.setVariable('oferta_multiplo_npc', [ ... ])

- ${S(dados_proposta).prop('oferta_multiplo_npc').prop('id_intencao').stringValue()}
+ ${oferta_multiplo_npc.id_intencao}

- ${S(dados_proposta).prop('oferta_multiplo_npc').prop('proxy_npc').stringValue()}
+ ${oferta_multiplo_npc.proxy_npc}

- .../proxies/${S(dados_proposta).prop('oferta_multiplo_npc').prop('proxy_npc').stringValue()}/card-details
+ .../proxies/${oferta_multiplo_npc.proxy_npc}/card-details

- ${S(dados_proposta).hasProp('oferta_multiplo_npc') ...}
+ ${execution.hasVariable('oferta_multiplo_npc') && oferta_multiplo_npc != null ...}
```

## 6. Observação

Essa mudança desloca a montagem canônica de `dados_proposta` para `script_mapeia_dados_oferta` e `script_mapeia_dados_oferta_fluxo_alternativo`, que já são o ponto posterior do fluxo onde o JSON é reconstruído.
