<?xml version="1.0" encoding="UTF-8"?>
<bpmn:definitions xmlns:bioc="PP3676" xmlns:bpmn="PP3679" xmlns:bpmndi="PP3678" xmlns:camunda="PP3677" xmlns:color="PP3680" xmlns:dc="PP3681" xmlns:di="PP3682" xmlns:xsi="PP3683" id="PP0736" targetNamespace="http://bpmn.io/PP4192/bpmn" exporter="PP0564" exporterVersion="5.44.0">
  <bpmn:process id="PP3951" name="PP2645" isExecutable="true" camunda:versionTag="20250219" camunda:historyTimeToLive="15">
    <bpmn:userPP2865 id="PP3419" name="PP0728" PP3476="PP1721">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3922" label="Número PP4304" type="string" />
          <PP3196 id="PP3438" label="DDD " type="string" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP4460" type="string" PP3476Value="continuar" />
          <PP3196 id="PP3923" label="Número PP4304 representante" type="string" />
          <PP3196 id="PP3439" label="DDD representante" type="string" />
        </camunda:formData>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3600">PP3419</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2123</bpmn:incoming>
      <bpmn:incoming>PP1396</bpmn:incoming>
      <bpmn:outgoing>PP1721</bpmn:outgoing>
      <bpmn:outgoing>PP1513</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:userPP2865 id="PP3411" name="PP0725" PP3476="PP2123">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3550" label="PP0752" type="string" />
          <PP3196 id="PP3636" label="PP2237 atual" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP4460" type="string" PP3476Value="continuar" />
          <PP3196 id="PP3552" label="PP0752 Representante" type="string" />
        </camunda:formData>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3600">PP3411</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1513</bpmn:incoming>
      <bpmn:incoming>PP1452</bpmn:incoming>
      <bpmn:outgoing>PP2123</bpmn:outgoing>
      <bpmn:outgoing>PP1472</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:userPP2865 id="PP3408" name="PP0724" PP3476="PP1474">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3435" label="Data nascimento" type="string" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP4460" type="string" PP3476Value="continuar" />
          <PP3196 id="PP3436" label="Data nascimento representante" type="string" />
        </camunda:formData>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3600">PP3408</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1721</bpmn:incoming>
      <bpmn:incoming>PP1667</bpmn:incoming>
      <bpmn:outgoing>PP1474</bpmn:outgoing>
      <bpmn:outgoing>PP1396</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:userPP2865 id="PP3414" name="PP0722 PP2624" PP3476="PP2127">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3892" type="string" />
          <PP3196 id="PP3996" type="string" />
          <PP3196 id="PP3997" type="string" />
          <PP3196 id="PP3919" type="string" />
          <PP3196 id="PP4460" type="string" PP3476Value="continuar" />
          <PP3196 id="PP3893" type="string" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP3998" type="string" />
          <PP3196 id="PP3920" type="string" />
        </camunda:formData>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3600">PP3414</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2024</bpmn:incoming>
      <bpmn:outgoing>PP2127</bpmn:outgoing>
      <bpmn:outgoing>PP1735</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:userPP2865 id="PP4235" name="PP2833" PP3476="PP1464">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3916" type="string" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP4460" type="string" PP3476Value="continuar" />
          <PP3196 id="PP3292" type="string" />
          <PP3196 id="PP3559" type="boolean" />
        </camunda:formData>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3600">PP4235</camunda:outputParameter>
        </camunda:PP3789>
        <PP3194 PP3601="start">
          <camunda:PP4199 PP4199Format="groovy">PP3606.removeVariable('PP4172') PP3606.removeVariable('situacao_PP3340') PP3606.removeVariable('PP3581')</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1848</bpmn:incoming>
      <bpmn:incoming>PP1526</bpmn:incoming>
      <bpmn:incoming>PP1987</bpmn:incoming>
      <bpmn:outgoing>PP1440</bpmn:outgoing>
      <bpmn:outgoing>PP1464</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:servicePP2865 id="PP4080" name="PP4055" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">1</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3053_selecionada">$</camunda:entry>
              <camunda:entry key="PP3465">$</camunda:entry>
              <camunda:entry key="PP3276">$</camunda:entry>
              <camunda:entry key="PP4016">$</camunda:entry>
              <camunda:entry key="PP3648">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3053_selecionada">${PP3916}</camunda:entry>
              <camunda:entry key="PP3465">${PP3606.hasVariable("PP3465") ? PP3465 : false}</camunda:entry>
              <camunda:entry key="PP3276">${PP3606.hasVariable("PP3276") ? PP3276 : false}</camunda:entry>
              <camunda:entry key="PP4016">${PP3606.hasVariable("PP4016") ? PP4016 : false}</camunda:entry>
              <camunda:entry key="PP3648">${PP3606.hasVariable("PP3648") ? PP3648 : false}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1361</bpmn:incoming>
      <bpmn:outgoing>PP1626</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:exclusivePP2253 id="PP2290" PP3476="PP1965">
      <bpmn:incoming>PP2127</bpmn:incoming>
      <bpmn:incoming>PP2111</bpmn:incoming>
      <bpmn:outgoing>PP1965</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:userPP2865 id="PP3412" name="Endereço" PP3476="PP1719">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP0530" type="string" />
          <PP3196 id="PP4185" type="string">
            <camunda:properties />
          </PP3196>
          <PP3196 id="PP3913" type="string" />
          <PP3196 id="PP3305" type="string" />
          <PP3196 id="PP3127" type="string" />
          <PP3196 id="PP3593" type="string" />
          <PP3196 id="PP3242" type="string" />
          <PP3196 id="PP3465" type="boolean" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP4460" type="string" PP3476Value="continuar" />
          <PP3196 id="PP3470" type="string" />
          <PP3196 id="PP3471" type="string" />
          <PP3196 id="PP3892" type="string" />
          <PP3196 id="PP3996" type="string" />
          <PP3196 id="PP3997" type="string" />
          <PP3196 id="PP0531" type="string" />
          <PP3196 id="PP4186" type="string" />
          <PP3196 id="PP3921" type="string" />
          <PP3196 id="PP3307" type="string" />
          <PP3196 id="PP3128" type="string" />
          <PP3196 id="PP3596" type="string" />
          <PP3196 id="PP3244" type="string" />
        </camunda:formData>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3600">PP3412</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1735</bpmn:incoming>
      <bpmn:incoming>PP1440</bpmn:incoming>
      <bpmn:incoming>PP1605</bpmn:incoming>
      <bpmn:outgoing>PP1719</bpmn:outgoing>
      <bpmn:outgoing>PP1542</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:userPP2865 id="PP3418" name="PP4127" PP3476="PP1605">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP4413" label="Valor Renda" type="string" />
          <PP3196 id="PP3888" type="string" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP4460" type="string" PP3476Value="continuar" />
          <PP3196 id="PP4414" label="Valor Renda representante" type="string" />
        </camunda:formData>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3600">PP3418</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1542</bpmn:incoming>
      <bpmn:incoming>PP1417</bpmn:incoming>
      <bpmn:incoming>PP1427</bpmn:incoming>
      <bpmn:outgoing>PP1667</bpmn:outgoing>
      <bpmn:outgoing>PP1605</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:exclusivePP2253 id="PP2341" name="PP2706" PP3476="PP2024">
      <bpmn:incoming>PP2010</bpmn:incoming>
      <bpmn:incoming>PP1979</bpmn:incoming>
      <bpmn:outgoing>PP2024</bpmn:outgoing>
      <bpmn:outgoing>PP2111</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:exclusivePP2253 id="PP2339" PP3476="PP1848">
      <bpmn:incoming>PP2115</bpmn:incoming>
      <bpmn:incoming>PP1328</bpmn:incoming>
      <bpmn:incoming>PP1601</bpmn:incoming>
      <bpmn:incoming>PP1458</bpmn:incoming>
      <bpmn:outgoing>PP1848</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:servicePP2865 id="PP3537" name="PP0770" camunda:type="external" PP3199="PP2525">
      <bpmn:documentation>PP2489</bpmn:documentation>
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3309">false</camunda:inputParameter>
          <camunda:inputParameter name="PP3586">true</camunda:inputParameter>
          <camunda:inputParameter name="PP4175">30000</camunda:inputParameter>
          <camunda:inputParameter name="PP3864">1</camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1981</bpmn:incoming>
      <bpmn:outgoing>PP1622</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP4199PP2865 id="PP4208" name="PP2812" PP4199Format="groovy">
      <bpmn:incoming>PP1860</bpmn:incoming>
      <bpmn:outgoing>PP2222</bpmn:outgoing>
      <bpmn:PP4199>def dataHoraCriacao = new Date().toLocalDate()
def data_inicio_relacionamento = dataHoraCriacao.format("yyyy-MM-dd")
def PP3329PP2827 = PP3606.PP3665("PP3329PP2827") PP3606.PP4250("codigo_tipo_atuacao_titularidade_PP3350","0");
    PP3606.PP4250("PP3913_unico_organizacao","004341");
    PP3606.PP4250("codigo_empresa","004");
    PP3606.PP4250("codigo_banco","341");
    def codigo_PP3366o_PP3819 = "";
    def identificacao_PP3819 = ["codigo_sigla_PP4256": "PP0538","codigo_PP3366o_PP3819": "24","codigo_abertura_PP3350_online": "N"];
    PP3606.PP4250("identificacao_PP3819", identificacao_PP3819);
    //titularesdef listaTitulares = []def client_id = PP3606.PP3665("PP3753")
def PP3761 = PP3606.PP3665("PP3761")
def mapTitulares = [:]mapTitulares.put("PP3925", client_id)mapTitulares.put("ordem_titularidade", 1)mapTitulares.put("PP3925_PP4305rario", PP3761)mapTitulares.put("codigo_PP4364_autenticacao", PP3606.PP3665("PP3735"))listaTitulares.add(mapTitulares)
PP3606.PP4250("titulares", listaTitulares)
PP3606.PP4250("PP4326", "C");
    PP3606.PP4250("PP3737", "301");
    PP3606.PP4250("origem_PP3350", "I");
    PP3606.PP4250("codigo_PP3053", PP3606.PP3665("PP3053"));
    PP3606.PP4250("codigo_PP3350", PP3606.PP3665("PP3350"));
    PP3606.PP4250("PP3394", PP3606.PP3665("PP3394"));
    def codigo_PP4229 = PP3606.PP3665("PP4229")
switch (codigo_PP4229) {
      case "3":codigo_PP4229 = "3111"break
case "L":codigo_PP4229 = "L111"break;
    case "4":codigo_PP4229 = "4111"break}
def PP3637 = PP3606.PP3665("PP3637");
    def codigo_PP3350_salario = "";
    if (PP3637 == "PP4355" || PP3637=="massificado") {
      codigo_PP3350_salario = "F";
    }
else {
      codigo_PP3350_salario = " ";
    }
    PP3606.PP4250("codigo_PP4229", codigo_PP4229)
def PP3559 = PP3606.PP3665("PP3559");
    if (PP3559 == true) {
      PP3606.PP4250("codigo_tipo_PP3221_PP3662_PP3350",PP3276);
    PP3606.PP4250("PP3287_PP3053",PP4016);
    }
else {
      PP3606.PP4250("codigo_tipo_PP3221_PP3662_PP3350", PP3329PP2827.get("cod_PP3221"));
    PP3606.PP4250("PP3287_PP3053", PP3329PP2827.get("cod_PP4016"));
    }
    PP3606.PP4250("codigo_PP3350_salario",codigo_PP3350_salario);
    def http_gq_PP3329_PP3557_PP3350 = PP3606.PP3665("http_gq_PP3329_PP3557_PP3350");
    if (PP4278 == "central") {
      PP3606.PP4250("PP3913_PP3648_colaborador_responsavel", http_gq_PP3329_PP3557_PP3350["PP3648"]);
    }
else {
      PP3606.PP4250("PP3913_PP3648_colaborador_responsavel", PP3606.PP3665("PP3653"));
    }
    PP3606.PP4250("data_inicio_relacionamento", data_inicio_relacionamento);
    PP3606.PP4250("indicador_carta_remessa", "N");
    def PP3934Produto = PP3606.PP3665('PP3947');
    PP3606.PP4250("PP3984_PP4289s", PP3934Produto['PP3286']);
    def vinculo_selecionado = PP3606.PP3665("vinculo_selecionado")if(vinculo_selecionado != null) {
      def PP3365_pagadoras = [:] as HashMapPP3365_pagadoras.put("cnpj_pagador", vinculo_selecionado.get("PP3254_pagadora"));
    PP3365_pagadoras.put("PP3909", vinculo_selecionado.get("PP3907_empresa_pagadora"));
    PP3365_pagadoras.put("PP3055", vinculo_selecionado.get("PP3053_empresa_pagadora"));
    PP3365_pagadoras.put("PP3364", vinculo_selecionado.get("PP3350_empresa_pagadora"));
    PP3365_pagadoras.put("PP3394_pagador", vinculo_selecionado.get("PP3394_empresa_pagadora"));
    PP3365_pagadoras.put("situacao_funcionario", "F");
    PP3365_pagadoras.put("atuacao", "06");
    PP3365_pagadoras.put("lotacao", "0004");
    PP3606.PP4250("dados_spi", PP3365_pagadoras)}
else {
      PP3606.PP4250("dados_spi", null)}
def PP4048 = ["PP4048_lis": PP3934Produto.get('PP3972') == true ? "S" : "N","PP4048_cartao": "S",//VALIDAR"PP4048_debito": "S",//VALIDAR"PP4048_entrega_cheques": "N",//FIXO"PP4048_cartao_provisorio": "N",//FIXO"PP4048_aplic_aut": PP3934Produto.get('PP3970') == true ? "S" : "N","PP4048_pic": "N",//FIXO"PP4048_collecte": "N",//FIXO"PP4081": PP3934Produto.get('PP3778') == "S" ? "S" : "N","PP4048_aplic_ci": "N",//FIXO"PP4082": "N",//VALIDAR"PP4083": PP3934Produto.get('PP3371') == true ? "S" : "N","PP4048_ad": PP3934Produto.get('PP3368') == true ? "S" : "N","PP4048_overPP3833": PP3934Produto.get('PP3779') == "S" ? "S" : "N","PP4048_option": "N"//FIXO];
    PP3606.PP4250("PP4045_contratados", PP4048);</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:servicePP2865 id="PP4063" name="PP0192" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">1</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP4144">$</camunda:entry>
              <camunda:entry key="PP3360">$</camunda:entry>
              <camunda:entry key="PP3361">$</camunda:entry>
              <camunda:entry key="PP3739">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP4144">${PP4144}</camunda:entry>
              <camunda:entry key="PP3360">${PP3360}</camunda:entry>
              <camunda:entry key="PP3361">true</camunda:entry>
              <camunda:entry key="PP3739">${(PP3606.hasVariable("PP3926") &amp;&amp; PP3926 != null &amp;&amp; PP3926 != 'null' &amp;&amp; PP3926 != '') ? PP3606.PP3665("PP3926") : PP4143}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1294</bpmn:incoming>
      <bpmn:outgoing>PP1746</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP4199PP2865 id="PP3656" name="PP2453" PP4199Format="groovy">
      <bpmn:incoming>PP1507</bpmn:incoming>
      <bpmn:outgoing>PP1915</bpmn:outgoing>
      <bpmn:PP4199>def PP3183 = "S" PP3606.PP4250("PP4330", "004") PP3606.PP4250("codigo_compensacao_banco", "341") def PP3053 = PP3606.PP3665("PP3916") def PP3350 = PP3606.PP3665('PP3350') def PP3394 = PP3606.PP3665('PP3394') def PP3277 = PP4330 + codigo_compensacao_banco + PP3053 + PP3350 + PP3394 + "000001" + "000000001" PP3606.PP4250("PP3183", PP3183) PP3606.PP4250("PP3277", PP3277) def dados = ["PP3183":PP3183,"PP3277":PP3277,]PP3606.PP4250("dados_pessoa_temp", dados)</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:servicePP2865 id="PP3109" name="PP0210" PP3193="#{atualizarPP2694}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3407">
            <camunda:map>
              <camunda:entry key="PP3183">${dados_pessoa_temp["PP3183"]}</camunda:entry>
              <camunda:entry key="PP3277">${dados_pessoa_temp["PP3277"]}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1915</bpmn:incoming>
      <bpmn:outgoing>PP1387</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:intermediateCatchEvent id="PP4321" name="PP2955">
      <bpmn:incoming>PP1387</bpmn:incoming>
      <bpmn:outgoing>PP1860</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2921">
        <bpmn:PP4318Cycle xsi:type="bpmn:tFormalExpression">* * 3-23 ? * * *</bpmn:PP4318Cycle>
      </bpmn:PP4318rEventDefinition>
    </bpmn:intermediateCatchEvent>
    <bpmn:PP4199PP2865 id="PP3860" name="PP3863" PP4199Format="javaPP4199">
      <bpmn:incoming>PP1946</bpmn:incoming>
      <bpmn:outgoing>PP1590</bpmn:outgoing>
      <bpmn:PP4199>var PP4421PP0664 = PP3606.PP3665('PP4144');
var PP3934PP2722 = PP3606.PP3665('PP3947');
var PP3522 = PP3934PP2722.get('PP3522');
var PP3521 = PP3934PP2722.get('PP3521');

function cartao_credito() {
  var cartaoCredito = null;
  var limRot = PP3606.PP3665('PP3833rotativo_credito_v3_aberturaPP3365_resposta');

  if (limRot != null &amp;&amp; limRot !== "") {
    cartaoCredito = limRot['PP4393'];
  } else {
    cartaoCredito = PP3606.PP3665('PP4155')['PP4409_credito'].split('.')[0];
  }

  return cartaoCredito.toString();
}

var PP4409_credito = cartao_credito();
var PP3520 = aplicaRegraPersonDnPP0573(PP4409_credito, PP3521, PP3522);

function aplicaRegraPersonDnPP0573(valorPreAprovado, dnPP0573Credito, dnPP0573Debito) {
  var PP4229 = PP3606.PP3665('PP4229');

  if (PP4229 == "4") {
    var valorPa = Number(valorPreAprovado);

    if (valorPa &gt;= 10000) {
      return dnPP0573Credito;
    }

    PP3606.PP4250('regra_aplicada_person', true);
    return dnPP0573Debito;
  }

  return dnPP0573Credito;
}

PP3606.PP4250('PP3282', PP4421PP0664.get('PP3753'));
PP3606.PP4250('PP3288_cartao_credito', PP3520);
PP3606.PP4250('codigo_PP3200_origem', PP4421PP0664.get('codigo_PP3200'));
PP3606.PP4250('dia_PP4437_PP3625_cartao', PP3934PP2722.get('PP3504'));

// Indicadores e PP3984 (legado; independentes do bloco múltiplo PP2627 abaixo)
PP3606.PP4250('PP3779', PP3934PP2722.get('PP3779'));
PP3606.PP4250('PP3781', PP3934PP2722.get('PP3781'));
PP3606.PP4250('PP3280', PP3934PP2722.get('PP3280'));
PP3606.PP4250('indicador_PP3934_na_PP3625', PP3934PP2722.get('PP3777'));
PP3606.PP4250('PP3774', PP3934PP2722.get('PP3774'));
PP3606.PP4250('PP3778', PP3934PP2722.get('PP3778'));
PP3606.PP4250('PP3916', PP4421PP0664.get('codigo_PP3053'));
PP3606.PP4250('PP3913_PP3350_corrente', PP4421PP0664.get('codigo_PP3350'));
PP3606.PP4250('PP3913_PP3394_PP3350_corrente', PP4421PP0664.get('PP3394'));
PP3606.PP4250('PP3291', PP3606.PP3665('PP4229'));
PP3606.PP4250('codigo_PP4326', PP4421PP0664.get('PP4326'));
PP3606.PP4250('PP3286', PP3934PP2722.get('PP3286'));

// --- múltiplo PP2627 / PP3417: helpers (domínio — chaves de PP4039 inalteradas) ---

function isValorPreenchido(valor) {
  return valor !== null &amp;&amp; valor !== undefined &amp;&amp; !(typeof valor === 'string' &amp;&amp; valor.trim() === '');
}

function getCampoOuNull(objeto, chave) {
  if (!objeto) return null;
  if (typeof objeto.get === 'function') return objeto.get(chave);
  return (objeto[chave] !== undefined) ? objeto[chave] : null;
}

function parseJsonSeNecessario(raw) {
  if (!raw) return null;
  if (typeof raw === 'string') {
    try {
      return JSON.parse(raw);
    } catch (e) {
      return null;
    }
  }
  return raw;
}

function toBooleanOuFalse(valor) {
  if (valor === true) return true;
  if (valor === false) return false;
  if (typeof valor === 'string') return valor.trim().toLowerCase() === 'true';
  return false;
}

function getOfertaPP2617Npc(PP4048) {
  var PP3934PP2617Npc = getCampoOuNull(PP4048, 'PP3944');
  return parseJsonSeNecessario(PP3934PP2617Npc);
}

function isPP2687ValidoParaValiPP3394aoPP2751Npc(PP4048) {
  var PP3934PP2617Npc = getOfertaPP2617Npc(PP4048);
  if (!PP3934PP2617Npc) return false;

  var PP4087NpcOferta = getCampoOuNull(PP3934PP2617Npc, 'PP4091');
  var idIntencaoOferta = getCampoOuNull(PP3934PP2617Npc, 'PP3747');

  return isValorPreenchido(PP4087NpcOferta) &amp;&amp; isValorPreenchido(idIntencaoOferta);
}

function extrairPP0722PP2617Npc(PP4048) {
  var PP3934PP2617Npc = getOfertaPP2617Npc(PP4048);

  if (!PP3934PP2617Npc) {
    return {
      PP3946: null,
      PP3840: null
    };
  }

  return {
    PP3946: getCampoOuNull(PP3934PP2617Npc, 'PP3370'),
    PP3840: getCampoOuNull(PP3934PP2617Npc, 'PP3840')
  };
}

// --- múltiplo PP2627: aplicar somente o novo ---

var PP4048Raw = parseJsonSeNecessario(PP3606.PP3665('PP3417'));
var dadosPP2617Npc = extrairPP0722PP2617Npc(PP4048Raw);
var PP3833PP0742 = PP3606.PP3665('PP3833_cartao_PP3508');

// flag para o PP3654 decidir se chama PP4378
PP3606.PP4250('pode_validar_PP4091', isPP2687ValidoParaValiPP3394aoPP2751Npc(PP4048Raw));

// Variáveis derivadas para PP4378 (somente PP3944)
var PP3934PP2617NpcValiPP3394ao = getOfertaPP2617Npc(PP4048Raw);
var idIntencaoParaValiPP3394ao = PP3934PP2617NpcValiPP3394ao
  ? getCampoOuNull(PP3934PP2617NpcValiPP3394ao, 'PP3747')
  : null;
var PP4087NpcParaValiPP3394ao = PP3934PP2617NpcValiPP3394ao
  ? getCampoOuNull(PP3934PP2617NpcValiPP3394ao, 'PP4091')
  : null;

if (isValorPreenchido(idIntencaoParaValiPP3394ao)) {
  PP3606.PP4250('PP3747', idIntencaoParaValiPP3394ao);
} else {
  PP3606.removeVariable('PP3747');
}

if (isValorPreenchido(PP4087NpcParaValiPP3394ao)) {
  PP3606.PP4250('PP4091_para_valiPP3394ao', PP4087NpcParaValiPP3394ao);
} else {
  PP3606.removeVariable('PP4091_para_valiPP3394ao');
}

// Limite máximo PP3222 (PP2627): ordem de precedência —
// (1) PP3840 em PP3944;
// (2) se ausente ou vazio, PP3833_cartao_PP3508;
// (3) se ausente ou vazio, PP3833 legado já calculado neste PP4199.
var PP3833PP0573Final = isValorPreenchido(dadosPP2617Npc.PP3840)
  ? dadosPP2617Npc.PP3840
  : (isValorPreenchido(PP3833PP0742) ? PP3833PP0742 : PP4409_credito);

PP3606.PP4250('PP4408', PP3833PP0573Final);

// PP3946 só é atualizada se vier no PP4000 novo
if (dadosPP2617Npc.PP3946 !== null &amp;&amp; dadosPP2617Npc.PP3946 !== undefined) {
  PP3606.PP4250('PP3946', toBooleanOuFalse(dadosPP2617Npc.PP3946));
}
</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:servicePP2865 id="PP3536" name="PP0769" PP3190="true" camunda:exclusive="false" camunda:type="external" PP3199="PP3823">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3410">
            <camunda:map>
              <camunda:entry key="PP3759">${PP3759}</camunda:entry>
              <camunda:entry key="PP3282">${PP3753}</camunda:entry>
              <camunda:entry key="PP3288_cartao_credito">${PP3288_cartao_credito}</camunda:entry>
              <camunda:entry key="codigo_PP3200_origem">${codigo_PP3200_origem}</camunda:entry>
              <camunda:entry key="dia_PP4437_PP3625_cartao">${dia_PP4437_PP3625_cartao}</camunda:entry>
              <camunda:entry key="PP4408">${PP4408}</camunda:entry>
              <camunda:entry key="PP3779">${PP3779}</camunda:entry>
              <camunda:entry key="PP3781">${PP3781}</camunda:entry>
              <camunda:entry key="PP3280">${PP3280}</camunda:entry>
              <camunda:entry key="indicador_PP3934_na_PP3625">${indicador_PP3934_na_PP3625}</camunda:entry>
              <camunda:entry key="PP3774">${PP3774}</camunda:entry>
              <camunda:entry key="PP3778">${PP3778}</camunda:entry>
              <camunda:entry key="PP3916">${PP3916}</camunda:entry>
              <camunda:entry key="PP3913_PP3350_corrente">${PP3913_PP3350_corrente}</camunda:entry>
              <camunda:entry key="PP3913_PP3394_PP3350_corrente">${PP3913_PP3394_PP3350_corrente}</camunda:entry>
              <camunda:entry key="PP3291">${PP3291}</camunda:entry>
              <camunda:entry key="codigo_PP4326">${codigo_PP4326}</camunda:entry>
              <camunda:entry key="PP3286">${PP3286}</camunda:entry>
              <camunda:entry key="nome_subPP3200_origem_PP4048_cartao_PP3382">${PP3203}</camunda:entry>
              <camunda:entry key="PP3289">${PP3289}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2008</bpmn:incoming>
      <bpmn:outgoing>PP2209</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:servicePP2865 id="PP3373" name="PP0674" PP3191="true" camunda:type="external" PP3199="PP3367">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3586">true</camunda:inputParameter>
          <camunda:inputParameter name="PP3379">
            <camunda:map>
              <camunda:entry key="id_parceiro">004341</camunda:entry>
              <camunda:entry key="id_PP3984">${PP3947['PP3286']}</camunda:entry>
              <camunda:entry key="PP3756">${PP3947['PP3756']}</camunda:entry>
              <camunda:entry key="PP3639">${PP3947['PP3639']}</camunda:entry>
              <camunda:entry key="id_PP3248">${PP3053}${PP3350}${PP3394}</camunda:entry>
              <camunda:entry key="PP3200">${PP3947['PP3200']}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3309">false</camunda:inputParameter>
          <camunda:inputParameter name="PP4175">30000</camunda:inputParameter>
          <camunda:inputParameter name="PP3864">2</camunda:inputParameter>
        </camunda:PP3789>
        <camunda:PP3621RetryTimeCycle>R1/PT10S</camunda:PP3621RetryTimeCycle>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1419</bpmn:incoming>
      <bpmn:outgoing>PP1267</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:parallelPP2253 id="PP2396">
      <bpmn:incoming>PP1711</bpmn:incoming>
      <bpmn:outgoing>PP1419</bpmn:outgoing>
      <bpmn:outgoing>PP1701</bpmn:outgoing>
    </bpmn:parallelPP2253>
    <bpmn:parallelPP2253 id="PP2415" PP3191="true">
      <bpmn:incoming>PP1267</bpmn:incoming>
      <bpmn:incoming>PP1304</bpmn:incoming>
      <bpmn:outgoing>PP1946</bpmn:outgoing>
    </bpmn:parallelPP2253>
    <bpmn:intermediateCatchEvent id="PP1225" name="PP2786">
      <bpmn:incoming>PP2065</bpmn:incoming>
      <bpmn:outgoing>PP1825</bpmn:outgoing>
      <bpmn:messageEventDefinition id="PP2591" messageRef="PP2602" />
    </bpmn:intermediateCatchEvent>
    <bpmn:intermediateCatchEvent id="PP3816" name="PP2521">
      <bpmn:incoming>PP2051</bpmn:incoming>
      <bpmn:outgoing>PP1511</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2940">
        <bpmn:PP4318Cycle xsi:type="bpmn:tFormalExpression">* * 7-19 ? * * *</bpmn:PP4318Cycle>
      </bpmn:PP4318rEventDefinition>
    </bpmn:intermediateCatchEvent>
    <bpmn:servicePP2865 id="PP3092" name="PP0190" PP3193="#{atualizarPP2694}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3407">
            <camunda:map>
              <camunda:entry key="PP4304s">${dados_pessoa_temp["PP4304s"]}</camunda:entry>
              <camunda:entry key="PP3550s">${dados_pessoa_temp["PP3550s"]}</camunda:entry>
              <camunda:entry key="PP3435_funPP3394ao">${dados_pessoa_temp["PP3435_funPP3394ao"]}</camunda:entry>
              <camunda:entry key="PP3907">${dados_pessoa_temp["PP3907"]}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1695</bpmn:incoming>
      <bpmn:outgoing>PP1658</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP3601BasedPP2253 id="PP2443">
      <bpmn:incoming>PP1776</bpmn:incoming>
      <bpmn:outgoing>PP2220</bpmn:outgoing>
      <bpmn:outgoing>PP1841</bpmn:outgoing>
    </bpmn:PP3601BasedPP2253>
    <bpmn:intermediateCatchEvent id="PP3872" name="PP3015">
      <bpmn:documentation>PP2488</bpmn:documentation>
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3926">${PP3606.PP3665("PP4169_consumer_abertura_PP3350")["PP3926"]}</camunda:outputParameter>
          <camunda:outputParameter name="PP3428">${PP3606.PP3665("PP4169_consumer_abertura_PP3350")["PP3428"]}</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2220</bpmn:incoming>
      <bpmn:outgoing>PP2132</bpmn:outgoing>
      <bpmn:messageEventDefinition id="PP2592" messageRef="PP2603" />
    </bpmn:intermediateCatchEvent>
    <bpmn:servicePP2865 id="PP4064" name="PP0195" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">1</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3379">$</camunda:entry>
              <camunda:entry key="response_PP3930">$</camunda:entry>
              <camunda:entry key="PP3290_PP4048_cartao_credito">$</camunda:entry>
              <camunda:entry key="PP3913_PP4048_cartao_credito">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3379">${response_PP3379}</camunda:entry>
              <camunda:entry key="response_PP3930">${(PP3606.hasVariable('PP3833rotativo_credito_v3_aberturaPP3365_resposta') &amp;&amp;PP3606.PP3665('PP3833rotativo_credito_v3_aberturaPP3365_resposta') != null &amp;&amp; PP3606.PP3665("PP3833rotativo_credito_v3_aberturaPP3365_resposta") != '') ? PP3606.PP3665('PP3833rotativo_credito_v3_aberturaPP3365_resposta') : PP3606.PP3665('response_PP3930R0')}</camunda:entry>
              <camunda:entry key="PP3290_PP4048_cartao_credito">${PP3290_PP4048_cartao_credito}</camunda:entry>
              <camunda:entry key="PP3913_PP4048_cartao_credito">${PP3913_PP4048_cartao_credito}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2173</bpmn:incoming>
      <bpmn:outgoing>PP1544</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:userPP2865 id="PP3415" name="nome" PP3476="PP1729">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3907" type="string" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP4460" type="string" PP3476Value="continuar" />
          <PP3196 id="PP3908" type="string" />
        </camunda:formData>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3600">PP3415</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1472</bpmn:incoming>
      <bpmn:incoming>PP1653</bpmn:incoming>
      <bpmn:outgoing>PP1729</bpmn:outgoing>
      <bpmn:outgoing>PP1292</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:sequenceFlow id="PP1721" sourceRef="PP3419" targetRef="PP3408" />
    <bpmn:sequenceFlow id="PP1729" sourceRef="PP3415" targetRef="PP3788" />
    <bpmn:sequenceFlow id="PP2123" sourceRef="PP3411" targetRef="PP3419" />
    <bpmn:sequenceFlow id="PP1474" sourceRef="PP3408" targetRef="PP4205" />
    <bpmn:sequenceFlow id="PP2024" name="SIM" sourceRef="PP2341" targetRef="PP3414" />
    <bpmn:sequenceFlow id="PP1848" sourceRef="PP2339" targetRef="PP4235" />
    <bpmn:sequenceFlow id="PP1965" sourceRef="PP2290" targetRef="PP4221" />
    <bpmn:sequenceFlow id="PP1719" sourceRef="PP3412" targetRef="PP2307" />
    <bpmn:sequenceFlow id="PP1915" sourceRef="PP3656" targetRef="PP3109" />
    <bpmn:sequenceFlow id="PP1387" sourceRef="PP3109" targetRef="PP4321" />
    <bpmn:sequenceFlow id="PP1946" sourceRef="PP2415" targetRef="PP3860" />
    <bpmn:sequenceFlow id="PP1590" sourceRef="PP3860" targetRef="PP2270" />
    <bpmn:sequenceFlow id="PP2209" sourceRef="PP3536" targetRef="PP2296" />
    <bpmn:sequenceFlow id="PP1419" sourceRef="PP2396" targetRef="PP3373" />
    <bpmn:sequenceFlow id="PP1267" sourceRef="PP3373" targetRef="PP2415" />
    <bpmn:sequenceFlow id="PP2220" sourceRef="PP2443" targetRef="PP3872" />
    <bpmn:sequenceFlow id="PP1544" sourceRef="PP4064" targetRef="PP2392" />
    <bpmn:servicePP2865 id="PP4071" name="PP0207" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3888_cancelamento">${PP3888_cancelamento}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3888_cancelamento">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP4274">3</camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1394</bpmn:incoming>
      <bpmn:incoming>PP2213</bpmn:incoming>
      <bpmn:outgoing>PP1536</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:endEvent id="PP0964">
      <bpmn:incoming>PP1536</bpmn:incoming>
      <bpmn:terminateEventDefinition id="PP2889" />
    </bpmn:endEvent>
    <bpmn:exclusivePP2253 id="PP2274" name="PP2875" PP3476="PP1891">
      <bpmn:incoming>PP1280</bpmn:incoming>
      <bpmn:outgoing>PP2089</bpmn:outgoing>
      <bpmn:outgoing>PP1891</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:userPP2865 id="PP3064" name="PP0169">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
        </camunda:formData>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1996</bpmn:incoming>
      <bpmn:outgoing>PP1921</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:servicePP2865 id="PP4086" name="PP2745" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">86</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map />
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map />
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1797</bpmn:incoming>
      <bpmn:outgoing>PP2227</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:subPP2714 id="PP0037">
      <bpmn:incoming>PP2227</bpmn:incoming>
      <bpmn:outgoing>PP1645</bpmn:outgoing>
      <bpmn:startEvent id="PP0991">
        <bpmn:outgoing>PP1911</bpmn:outgoing>
      </bpmn:startEvent>
      <bpmn:servicePP2865 id="PP3065" name="PP0168" camunda:type="external" PP3199="PP3822">
        <bpmn:extensionElements>
          <camunda:PP3789>
            <camunda:inputParameter name="PP3748">24</camunda:inputParameter>
            <camunda:inputParameter name="PP3528">${PP3528}</camunda:inputParameter>
            <camunda:inputParameter name="PP3135">${PP3606.hasVariable("PP3135") &amp;&amp; PP3135}</camunda:inputParameter>
            <camunda:inputParameter name="PP3773">${PP3606.hasVariable("PP3574") &amp;&amp; PP3574 &amp;&amp; PP3606.hasVariable("PP3740_cr_di4")}</camunda:inputParameter>
            <camunda:inputParameter name="PP3776">${PP3606.hasVariable("PP3740_formulario_nao_alfabetizacao_di4") ? true : false}</camunda:inputParameter>
            <camunda:inputParameter name="PP3754">${PP3606.hasVariable("PP3754") &amp;&amp; PP3606.PP3665("PP3754") != null ? PP3606.PP3665("PP3754") : ""}</camunda:inputParameter>
            <camunda:inputParameter name="PP3755">${PP3606.hasVariable("adicionais") &amp;&amp; PP3606.PP3665("adicionais") != null ? PP3606.PP3665("adicionais")[0]["PP3761"] : ""}</camunda:inputParameter>
            <camunda:inputParameter name="PP4266">${PP3606.hasVariable("PP4266_PP3126") ? PP3606.PP3665("PP4266_PP3126") : ""}</camunda:inputParameter>
          </camunda:PP3789>
        </bpmn:extensionElements>
        <bpmn:incoming>PP1497</bpmn:incoming>
        <bpmn:incoming>PP1487</bpmn:incoming>
        <bpmn:outgoing>PP2019</bpmn:outgoing>
      </bpmn:servicePP2865>
      <bpmn:intermediateCatchEvent id="PP1036" name="PP2782">
        <bpmn:incoming>PP2019</bpmn:incoming>
        <bpmn:outgoing>PP1357</bpmn:outgoing>
        <bpmn:messageEventDefinition id="PP2593" messageRef="PP2600" />
      </bpmn:intermediateCatchEvent>
      <bpmn:sequenceFlow id="PP2019" sourceRef="PP3065" targetRef="PP1036" />
      <bpmn:exclusivePP2253 id="PP2310" PP3476="PP1379">
        <bpmn:incoming>PP1879</bpmn:incoming>
        <bpmn:outgoing>PP1456</bpmn:outgoing>
        <bpmn:outgoing>PP1379</bpmn:outgoing>
      </bpmn:exclusivePP2253>
      <bpmn:intermediateThrowEvent id="PP0932" name="PP2768">
        <bpmn:incoming>PP1863</bpmn:incoming>
        <bpmn:escalationEventDefinition id="PP0894" escalationRef="PP0901" />
      </bpmn:intermediateThrowEvent>
      <bpmn:endEvent id="PP1146">
        <bpmn:incoming>PP1875</bpmn:incoming>
      </bpmn:endEvent>
      <bpmn:sequenceFlow id="PP1456" sourceRef="PP2310" targetRef="PP4281">
        <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('resultado_analise_PP3126') &amp;&amp; resultado_analise_PP3126 == "EFETIVPP0014O"}</bpmn:conditionExpression>
      </bpmn:sequenceFlow>
      <bpmn:servicePP2865 id="PP4057" name="PP2729" PP3193="${PP3106}">
        <bpmn:extensionElements>
          <camunda:PP3789>
            <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
            <camunda:inputParameter name="PP4274">84</camunda:inputParameter>
            <camunda:inputParameter name="PP3875">
              <camunda:map>
                <camunda:entry key="resultado_analise_PP3126">$</camunda:entry>
                <camunda:entry key="id_formalizacao">$</camunda:entry>
                <camunda:entry key="PP3888s_devolucao">$</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
            <camunda:inputParameter name="PP3417">
              <camunda:map>
                <camunda:entry key="resultado_analise_PP3126">${resultado_analise_PP3126}</camunda:entry>
                <camunda:entry key="id_formalizacao">${id_formalizacao}</camunda:entry>
                <camunda:entry key="PP3888s_devolucao">${PP3888s_devolucao}</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
          </camunda:PP3789>
        </bpmn:extensionElements>
        <bpmn:incoming>PP1839</bpmn:incoming>
        <bpmn:outgoing>PP1879</bpmn:outgoing>
      </bpmn:servicePP2865>
      <bpmn:sequenceFlow id="PP1357" sourceRef="PP1036" targetRef="PP2400" />
      <bpmn:sequenceFlow id="PP1879" sourceRef="PP4057" targetRef="PP2310" />
      <bpmn:callActivity id="PP4281" name="PP3060" PP3189="PP4471">
        <bpmn:extensionElements>
          <camunda:in source="tipo_de_operacao" target="tipo_de_operacao" />
          <camunda:in source="PP3437" target="PP3437" />
          <camunda:in source="PP3759" target="PP3759" />
          <camunda:in source="PP3753" target="PP3753" />
          <camunda:in source="id_enquilino" target="id_enquilino" />
          <camunda:in source="PP3761" target="PP3761" />
          <camunda:in source="PP3200_origem" target="PP3200_origem" />
          <camunda:in source="PP4229" target="PP4229_PP3248" />
          <camunda:in source="PP3740_conferencia_PP3524" target="PP3740_conferencia_PP3524" />
          <camunda:in source="PP3740_conferencia_foto" target="PP3740_conferencia_foto" />
          <camunda:in source="PP3947[&#39;PP3972&#39;]" target="pre_PP3079do" />
          <camunda:in source="PP3947[&#39;PP3839&#39;]" target="PP3840" />
          <camunda:in source="PP4481" target="PP4481" />
          <camunda:out PP4420s="all" />
          <camunda:in PP4420s="all" />
          <camunda:in PP3167="#{PP3759}" />
        </bpmn:extensionElements>
        <bpmn:incoming>PP1456</bpmn:incoming>
        <bpmn:outgoing>PP1875</bpmn:outgoing>
      </bpmn:callActivity>
      <bpmn:sequenceFlow id="PP1875" sourceRef="PP4281" targetRef="PP1146" />
      <bpmn:PP3162 id="PP1030" attachedToRef="PP4281">
        <bpmn:outgoing>PP1752</bpmn:outgoing>
        <bpmn:errorEventDefinition id="PP0825" />
      </bpmn:PP3162>
      <bpmn:intermediateThrowEvent id="PP0940" name="Erro">
        <bpmn:incoming>PP2002</bpmn:incoming>
        <bpmn:escalationEventDefinition id="PP0887" escalationRef="PP0903" />
      </bpmn:intermediateThrowEvent>
      <bpmn:servicePP2865 id="PP4067" name="PP2738" PP3193="#{PP3106}">
        <bpmn:extensionElements>
          <camunda:PP3789>
            <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
            <camunda:inputParameter name="PP4274">4</camunda:inputParameter>
            <camunda:inputParameter name="PP3875">
              <camunda:map>
                <camunda:entry key="PP3888_PP4133">$</camunda:entry>
                <camunda:entry key="resultado_analise">$</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
            <camunda:inputParameter name="PP3417">
              <camunda:map>
                <camunda:entry key="PP3888_PP4133">PP0805</camunda:entry>
                <camunda:entry key="resultado_analise">${PP3313_analise_PP3643}</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
          </camunda:PP3789>
        </bpmn:extensionElements>
        <bpmn:incoming>PP1752</bpmn:incoming>
        <bpmn:outgoing>PP2002</bpmn:outgoing>
      </bpmn:servicePP2865>
      <bpmn:sequenceFlow id="PP2002" sourceRef="PP4067" targetRef="PP0940" />
      <bpmn:sequenceFlow id="PP1911" sourceRef="PP0991" targetRef="PP3886" />
      <bpmn:sequenceFlow id="PP1497" sourceRef="PP3886" targetRef="PP3065" />
      <bpmn:PP4199PP2865 id="PP3886" name="PP2612" PP4199Format="groovy">
        <bpmn:incoming>PP1911</bpmn:incoming>
        <bpmn:outgoing>PP1497</bpmn:outgoing>
        <bpmn:PP4199>import groovy.json.JsonSlurper;
    def PP3524sPP0501 = PP3606.PP3665("PP3528")
def novoPP0750PP0501 = []
for (PP3524 in PP3524sPP0501) {
      if (PP3524.get("PP4328") == "selfie") {
      novoPP0750PP0501.add(["PP3741": PP3524.get("PP3741"),"PP4328": PP3524.get("PP4328")])
PP3606.PP4250("PP3740_selfie_di4",PP3524.get("PP3741"))}
if (PP3524.get("PP4328") == "di frente") {
      novoPP0750PP0501.add(["PP3741": PP3524.get("PP3741"),"PP4328": "di"]) PP3606.PP4250("PP3740_di_di4",PP3524.get("PP3741"))}}
if (PP3606.PP3665("PP3574") == true &amp;
    &amp;
    PP3606.hasVariable("PP4266") &amp;
    &amp;
    PP3606.PP3665("PP4266") != null &amp;
    &amp;
    PP3606.PP3665("PP4266").toString().equalsIgnoreCase("nenhuma")) {
      novoPP0750PP0501.add([ "PP3741": PP3606.PP3665("PP3740"), "PP3574": PP3606.PP3665("PP3574"), "PP4328": "cr" ])
PP3606.PP4250("PP3740_cr_di4",PP3606.PP3665("PP3740")) }
if (PP3606.hasVariable("PP4266") &amp;
    &amp;
    PP3606.PP3665("PP4266") != null &amp;
    &amp;
    PP3606.PP3665("PP4266").toString().equalsIgnoreCase("nao alfabetizado")) {
      novoPP0750PP0501.add(["PP3741": PP3606.PP3665("PP3740"),"PP4328": "formulario_nao_alfabetizacao"])
PP3606.PP4250("PP3740_formulario_nao_alfabetizacao_di4",PP3606.PP3665("PP3740"))}
if (PP3606.hasVariable("PP4266") &amp;
    &amp;
    PP3606.PP3665("PP4266") != null &amp;
    &amp;
    PP3606.PP3665("PP4266").toString().equalsIgnoreCase("menor emancipado")) {
      PP3606.PP4250('PP4266_PP3126', 'menor_emancipado')novoPP0750PP0501.add(["PP3741": PP3606.PP3665("PP3740"),"PP4328": "form_menor_emancipado"])}
def isPP2237Alternativo = PP3606.hasVariable("tipo_doc_comprovante") &amp;
    &amp;
    PP3606.PP3665("tipo_doc_comprovante") != null &amp;
    &amp;
    PP3606.hasVariable("PP3574") &amp;
    &amp;
    PP3606.PP3665("PP3574") == true &amp;
    &amp;
    PP3606.hasVariable("PP3740") &amp;
    &amp;
    PP3606.PP3665("PP3740") != null &amp;
    &amp;
    PP3606.hasVariable("ids_di4") &amp;
    &amp;
    PP3606.PP3665("ids_di4") != null &amp;
    &amp;
    PP3606.hasVariable("PP4266") &amp;
    &amp;
    PP3606.PP3665("PP4266") != null &amp;
    &amp;
    !PP3606.PP3665("PP4266").toString().equalsIgnoreCase("nenhuma" )
if (isPP2237Alternativo&amp;
    &amp;
    !PP3606.PP3665("PP4266").toString().equalsIgnoreCase("menor emancipado")&amp;
    &amp;
    !PP3606.PP3665("PP4266").toString().equalsIgnoreCase("nao alfabetizado")) {
      def idsDi4string = PP3606.PP3665("ids_di4")
def jsonSlurper = new JsonSlurper()
def idsDi4 = jsonSlurper.parseText(idsDi4string)
for (idDi4 in idsDi4) {
      novoPP0750PP0501.add(["PP3741": idDi4.get("PP3740"),"PP4328": idDi4.get("tipo_doc_comprovante")])}}
if (isPP2237Alternativo &amp;
    &amp;
    !PP3606.PP3665("PP4266").toString().equalsIgnoreCase("nao alfabetizado")) {
      def situacoesEspeciais = PP3606.PP3665("PP4266")
switch (situacoesEspeciais)
case 'procuracao dependente economico': PP3606.PP4250('PP4266_PP3126', 'dependente_economico' ) break
case 'procuracao maior sob curaPP4303': PP3606.PP4250('PP4266_PP3126', 'maior_sob_curaPP4303') break
case 'procuracao representacao outras situacoes': PP3606.PP4250('PP4266_PP3126', 'representado_por_procurador') break
case 'menor representado pelos PP3993': PP3606.PP4250('PP4266_PP3126', 'menor_representado_PP3993') break
case 'menor emancipado': PP3606.PP4250('PP4266_PP3126', 'menor_emancipado') break
case 'menor sob curaPP4303': PP3606.PP4250('PP4266_PP3126', 'menor_sob_curaPP4303') break
case 'menor sob guarda': PP3606.PP4250('PP4266_PP3126', 'menor_sob_guarda') break
case 'menor sob tuPP4303': PP3606.PP4250('PP4266_PP3126', 'menor_sob_tuPP4303') break PP3476: PP3606.PP4250('PP4266_PP3126', '') }
    }
    PP3606.PP4250("PP3528", novoPP0750PP0501)</bpmn:PP4199>
      </bpmn:PP4199PP2865>
      <bpmn:exclusivePP2253 id="PP2400" name="PP2861" PP3476="PP1839">
        <bpmn:incoming>PP1357</bpmn:incoming>
        <bpmn:outgoing>PP1839</bpmn:outgoing>
        <bpmn:outgoing>PP1867</bpmn:outgoing>
      </bpmn:exclusivePP2253>
      <bpmn:intermediateThrowEvent id="PP1023" name="PP2841">
        <bpmn:extensionElements>
          <PP3194 PP3601="start">
            <camunda:PP4199 PP4199Format="groovy">if(!PP3606.hasVariable("PP3126_PP4173") ){ PP3606.PP4250("PP3126_PP4173",1); yelse{ def PP4173s = PP3606.PP3665("PP3126_PP4173") ; PP4173s+=1; PP3606.PP4250("PP3126_PP4173",PP4173s) ; }</camunda:PP4199>
          </PP3194>
        </bpmn:extensionElements>
        <bpmn:incoming>PP1867</bpmn:incoming>
        <bpmn:outgoing>PP1523</bpmn:outgoing>
      </bpmn:intermediateThrowEvent>
      <bpmn:exclusivePP2253 id="PP2432" name="PP2878" PP3476="PP1487">
        <bpmn:incoming>PP1523</bpmn:incoming>
        <bpmn:outgoing>PP1969</bpmn:outgoing>
        <bpmn:outgoing>PP1487</bpmn:outgoing>
      </bpmn:exclusivePP2253>
      <bpmn:intermediateThrowEvent id="PP1201" name="PP2877">
        <bpmn:incoming>PP1969</bpmn:incoming>
        <bpmn:escalationEventDefinition id="PP0892" escalationRef="PP0902" />
      </bpmn:intermediateThrowEvent>
      <bpmn:sequenceFlow id="PP1839" name="Sim" sourceRef="PP2400" targetRef="PP4057" />
      <bpmn:sequenceFlow id="PP1867" name="Não" sourceRef="PP2400" targetRef="PP1023">
        <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('resultado_analise_PP3126') &amp;&amp; (resultado_analise_PP3126 == "ERRO_INTERNO" || resultado_analise_PP3126 == "ERRO_PP2652YLOPP0014")}</bpmn:conditionExpression>
      </bpmn:sequenceFlow>
      <bpmn:sequenceFlow id="PP1523" sourceRef="PP1023" targetRef="PP2432" />
      <bpmn:sequenceFlow id="PP1969" name="Sim" sourceRef="PP2432" targetRef="PP1201">
        <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP3126_PP4173') &amp;&amp; PP3126_PP4173&gt;3}</bpmn:conditionExpression>
      </bpmn:sequenceFlow>
      <bpmn:sequenceFlow id="PP1487" name="Não" sourceRef="PP2432" targetRef="PP3065" />
      <bpmn:sequenceFlow id="PP1752" sourceRef="PP1030" targetRef="PP4067" />
      <bpmn:PP4199PP2865 id="PP4211" name="PP2814" PP4199Format="groovy">
        <bpmn:incoming>PP1379</bpmn:incoming>
        <bpmn:outgoing>PP1863</bpmn:outgoing>
        <bpmn:PP4199>def PP3888s_devolucao = PP3606.PP3665('PP3888s_devolucao') def PP4421PP0780 = [:] as HashMapPP4421PP0780.put("nome", PP3606.PP3665('PP3907'));
    def PP3888Di = PP3888s_devolucao.find {
      it.tipo == 'di' }if(PP3888Di != null) {
      PP4421PP0780.put("PP3888DI", PP3888Di.descricao[0]);
    }
    else {
      PP4421PP0780.put("PP3888DI", "");
    }
    def PP3888Selfie = PP3888s_devolucao.find {
      it.tipo == 'selfie' }if(PP3888Selfie != null) {
      PP4421PP0780.put("PP3888Selfie", PP3888Selfie.descricao[0]);
    }
    else {
      PP4421PP0780.put("PP3888Selfie", "");
    }
    PP3606.PP4250("PP3087", PP4421PP0780);</bpmn:PP4199>
      </bpmn:PP4199PP2865>
      <bpmn:sequenceFlow id="PP1379" sourceRef="PP2310" targetRef="PP4211" />
      <bpmn:sequenceFlow id="PP1863" sourceRef="PP4211" targetRef="PP0932" />
    </bpmn:subPP2714>
    <bpmn:parallelPP2253 id="PP2288">
      <bpmn:incoming>PP2089</bpmn:incoming>
      <bpmn:outgoing>PP1996</bpmn:outgoing>
      <bpmn:outgoing>PP1797</bpmn:outgoing>
    </bpmn:parallelPP2253>
    <bpmn:exclusivePP2253 id="PP2325" PP3476="PP1507">
      <bpmn:incoming>PP1905</bpmn:incoming>
      <bpmn:incoming>PP1574</bpmn:incoming>
      <bpmn:outgoing>PP1507</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP2089" name="sim" sourceRef="PP2274" targetRef="PP2288">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${(PP4231 == "3" &amp;&amp; PP3272 == "L" || PP4231 == "3" &amp;&amp; PP3272 == "4") ||(PP4231 == "L" &amp;&amp; PP3272 == "4") ||PP4231 == "I" &amp;&amp; (PP3272 == "L" || PP3272 == "4") || PP4161 == 'PP4469' || (PP4266 != "Nenhuma" &amp;&amp; PP4266 != "nenhuma")}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1891" name="Não" sourceRef="PP2274" targetRef="PP0062" />
    <bpmn:sequenceFlow id="PP1996" sourceRef="PP2288" targetRef="PP3064" />
    <bpmn:sequenceFlow id="PP1797" sourceRef="PP2288" targetRef="PP4086" />
    <bpmn:sequenceFlow id="PP2227" sourceRef="PP4086" targetRef="PP0037" />
    <bpmn:endEvent id="PP0993">
      <bpmn:incoming>PP1921</bpmn:incoming>
      <bpmn:incoming>PP1913</bpmn:incoming>
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP1921" sourceRef="PP3064" targetRef="PP0993" />
    <bpmn:sequenceFlow id="PP1899" sourceRef="PP1197" targetRef="PP4079" />
    <bpmn:intermediateThrowEvent id="PP1113" name="PP0567">
      <bpmn:incoming>PP1538</bpmn:incoming>
      <bpmn:linkEventDefinition id="PP2552" name="PP3207" />
    </bpmn:intermediateThrowEvent>
    <bpmn:PP3162 id="PP1197" name="PP2767" attachedToRef="PP0037">
      <bpmn:outgoing>PP1899</bpmn:outgoing>
      <bpmn:escalationEventDefinition id="PP0888" escalationRef="PP0901" />
    </bpmn:PP3162>
    <bpmn:subPP2714 id="PP0062">
      <bpmn:incoming>PP1891</bpmn:incoming>
      <bpmn:outgoing>PP1624</bpmn:outgoing>
      <bpmn:startEvent id="PP1115">
        <bpmn:outgoing>PP1717</bpmn:outgoing>
      </bpmn:startEvent>
      <bpmn:callActivity id="PP4282" name="PP3060" PP3189="PP4471">
        <bpmn:extensionElements>
          <camunda:out PP4420s="all" />
          <camunda:in PP4420s="all" />
          <camunda:in PP3167="#{PP3759}" />
        </bpmn:extensionElements>
        <bpmn:incoming>PP1717</bpmn:incoming>
        <bpmn:outgoing>PP1612</bpmn:outgoing>
      </bpmn:callActivity>
      <bpmn:endEvent id="PP1129">
        <bpmn:incoming>PP1612</bpmn:incoming>
      </bpmn:endEvent>
      <bpmn:userPP2865 id="PP3583" name="Erro PP0028">
        <bpmn:extensionElements>
          <camunda:formData>
            <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          </camunda:formData>
        </bpmn:extensionElements>
        <bpmn:incoming>PP1675</bpmn:incoming>
        <bpmn:outgoing>PP1637</bpmn:outgoing>
      </bpmn:userPP2865>
      <bpmn:servicePP2865 id="PP4066" name="PP2740" PP3193="#{PP3106}">
        <bpmn:extensionElements>
          <camunda:PP3789>
            <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
            <camunda:inputParameter name="PP4274">8</camunda:inputParameter>
            <camunda:inputParameter name="PP3875">
              <camunda:map>
                <camunda:entry key="PP3888_PP4133">$</camunda:entry>
                <camunda:entry key="resultado_analise">$</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
            <camunda:inputParameter name="PP3417">
              <camunda:map>
                <camunda:entry key="PP3888_PP4133">PP0805</camunda:entry>
                <camunda:entry key="resultado_analise">${PP3313_analise_PP3643}</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
          </camunda:PP3789>
        </bpmn:extensionElements>
        <bpmn:incoming>PP1889</bpmn:incoming>
        <bpmn:outgoing>PP1556</bpmn:outgoing>
      </bpmn:servicePP2865>
      <bpmn:intermediateThrowEvent id="PP1196" name="Erro">
        <bpmn:incoming>PP1631</bpmn:incoming>
        <bpmn:incoming>PP1637</bpmn:incoming>
        <bpmn:escalationEventDefinition id="PP0898" escalationRef="PP0903" />
      </bpmn:intermediateThrowEvent>
      <bpmn:sequenceFlow id="PP1612" sourceRef="PP4282" targetRef="PP1129" />
      <bpmn:sequenceFlow id="PP1717" sourceRef="PP1115" targetRef="PP4282" />
      <bpmn:PP3162 id="PP1010" attachedToRef="PP3583">
        <bpmn:outgoing>PP1631</bpmn:outgoing>
        <bpmn:PP4318rEventDefinition id="PP2931">
          <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">PT10M</bpmn:PP4318Duration>
        </bpmn:PP4318rEventDefinition>
      </bpmn:PP3162>
      <bpmn:servicePP2865 id="PP4069" name="PP2731" PP3193="${PP3106}">
        <bpmn:extensionElements>
          <camunda:PP3789>
            <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
            <camunda:inputParameter name="PP4274">4</camunda:inputParameter>
            <camunda:inputParameter name="PP3875">
              <camunda:map>
                <camunda:entry key="PP3888_PP4133">$</camunda:entry>
                <camunda:entry key="resultado_analise">$</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
            <camunda:inputParameter name="PP3417">
              <camunda:map>
                <camunda:entry key="PP3888_PP4133">PP3644</camunda:entry>
                <camunda:entry key="resultado_analise">${PP3313_analise_PP3643}</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
          </camunda:PP3789>
        </bpmn:extensionElements>
        <bpmn:incoming>PP1566</bpmn:incoming>
        <bpmn:outgoing>PP1948</bpmn:outgoing>
      </bpmn:servicePP2865>
      <bpmn:sequenceFlow id="PP1631" sourceRef="PP1010" targetRef="PP1196" />
      <bpmn:exclusivePP2253 id="PP2343" PP3476="PP1675">
        <bpmn:incoming>PP1556</bpmn:incoming>
        <bpmn:incoming>PP1948</bpmn:incoming>
        <bpmn:outgoing>PP1675</bpmn:outgoing>
      </bpmn:exclusivePP2253>
      <bpmn:sequenceFlow id="PP1556" sourceRef="PP4066" targetRef="PP2343" />
      <bpmn:sequenceFlow id="PP1948" sourceRef="PP4069" targetRef="PP2343" />
      <bpmn:sequenceFlow id="PP1675" sourceRef="PP2343" targetRef="PP3583" />
      <bpmn:PP3162 id="PP1000" attachedToRef="PP4282">
        <bpmn:outgoing>PP1566</bpmn:outgoing>
        <bpmn:escalationEventDefinition id="PP0886" escalationRef="PP0907" />
      </bpmn:PP3162>
      <bpmn:sequenceFlow id="PP1566" sourceRef="PP1000" targetRef="PP4069" />
      <bpmn:PP3162 id="PP1086" attachedToRef="PP4282">
        <bpmn:outgoing>PP1889</bpmn:outgoing>
        <bpmn:errorEventDefinition id="PP0838" />
      </bpmn:PP3162>
      <bpmn:sequenceFlow id="PP1889" sourceRef="PP1086" targetRef="PP4066" />
      <bpmn:sequenceFlow id="PP1637" sourceRef="PP3583" targetRef="PP1196" />
    </bpmn:subPP2714>
    <bpmn:parallelPP2253 id="PP2410">
      <bpmn:incoming>PP1624</bpmn:incoming>
      <bpmn:outgoing>PP2185</bpmn:outgoing>
      <bpmn:outgoing>PP1905</bpmn:outgoing>
    </bpmn:parallelPP2253>
    <bpmn:endEvent id="PP1051">
      <bpmn:incoming>PP1815</bpmn:incoming>
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP2185" sourceRef="PP2410" targetRef="PP4166" />
    <bpmn:sequenceFlow id="PP1624" sourceRef="PP0062" targetRef="PP2410" />
    <bpmn:sequenceFlow id="PP1905" sourceRef="PP2410" targetRef="PP2325" />
    <bpmn:userPP2865 id="PP4166" name="PP2785">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3053" label="PP0161" type="domain" />
          <PP3196 id="PP3350" label="PP0664" type="domain" />
          <PP3196 id="PP3394" label="Dac" type="domain" />
          <PP3196 id="PP3907" label="Nome Completo" type="domain" PP3476Value="${PP3907}" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP4229" label="PP2827" type="domain" />
          <PP3196 id="PP3474" label="Declarou receber Salário" type="domain" PP3476Value="${PP3606.hasVariable(&#34;PP4113&#34;) ? PP4113 : false }" />
        </camunda:formData>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2185</bpmn:incoming>
      <bpmn:outgoing>PP1815</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:sequenceFlow id="PP1815" sourceRef="PP4166" targetRef="PP1051" />
    <bpmn:PP3162 id="PP1124" name="PP2247" attachedToRef="PP0037">
      <bpmn:outgoing>PP2138</bpmn:outgoing>
      <bpmn:escalationEventDefinition id="PP0896" escalationRef="PP0907" />
    </bpmn:PP3162>
    <bpmn:intermediateThrowEvent id="PP1007" name="PP0567">
      <bpmn:incoming>PP1359</bpmn:incoming>
      <bpmn:linkEventDefinition id="PP2545" name="PP3207" />
    </bpmn:intermediateThrowEvent>
    <bpmn:sequenceFlow id="PP2138" sourceRef="PP1124" targetRef="PP4068" />
    <bpmn:sequenceFlow id="PP1645" sourceRef="PP0037" targetRef="PP4056" />
    <bpmn:sequenceFlow id="PP1507" sourceRef="PP2325" targetRef="PP3656" />
    <bpmn:servicePP2865 id="PP4068" name="PP2731" PP3193="${PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">13</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3888_cancelamento">$</camunda:entry>
              <camunda:entry key="resultado_analise">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3888_cancelamento">PP2777</camunda:entry>
              <camunda:entry key="resultado_analise">${PP3313_analise_PP3643}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2138</bpmn:incoming>
      <bpmn:outgoing>PP1359</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1359" sourceRef="PP4068" targetRef="PP1007" />
    <bpmn:servicePP2865 id="PP4079" name="PP2734" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">87</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3888_cancelamento">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3888_cancelamento">PP2776</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1899</bpmn:incoming>
      <bpmn:outgoing>PP1538</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1538" sourceRef="PP4079" targetRef="PP1113" />
    <bpmn:PP3162 id="PP0920" attachedToRef="PP0062">
      <bpmn:outgoing>PP2109</bpmn:outgoing>
      <bpmn:escalationEventDefinition id="PP0893" escalationRef="PP0903" />
    </bpmn:PP3162>
    <bpmn:intermediateThrowEvent id="PP1209" name="PP0567">
      <bpmn:incoming>PP2109</bpmn:incoming>
      <bpmn:linkEventDefinition id="PP2554" name="PP3207" />
    </bpmn:intermediateThrowEvent>
    <bpmn:sequenceFlow id="PP2109" sourceRef="PP0920" targetRef="PP1209" />
    <bpmn:PP3162 id="PP1206" attachedToRef="PP0037">
      <bpmn:outgoing>PP1699</bpmn:outgoing>
      <bpmn:escalationEventDefinition id="PP0890" escalationRef="PP0903" />
    </bpmn:PP3162>
    <bpmn:intermediateThrowEvent id="PP0997" name="PP0567">
      <bpmn:incoming>PP1699</bpmn:incoming>
      <bpmn:linkEventDefinition id="PP2548" name="PP3207" />
    </bpmn:intermediateThrowEvent>
    <bpmn:sequenceFlow id="PP1699" sourceRef="PP1206" targetRef="PP0997" />
    <bpmn:servicePP2865 id="PP4056" name="PP2730" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">1</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map />
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map />
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1645</bpmn:incoming>
      <bpmn:outgoing>PP1574</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1574" sourceRef="PP4056" targetRef="PP2325" />
    <bpmn:sequenceFlow id="PP2008" sourceRef="PP2270" targetRef="PP3536" />
    <bpmn:parallelPP2253 id="PP2270">
      <bpmn:incoming>PP1590</bpmn:incoming>
      <bpmn:outgoing>PP2008</bpmn:outgoing>
      <bpmn:outgoing>PP2065</bpmn:outgoing>
    </bpmn:parallelPP2253>
    <bpmn:parallelPP2253 id="PP2296" PP3191="true">
      <bpmn:incoming>PP2209</bpmn:incoming>
      <bpmn:incoming>PP1825</bpmn:incoming>
      <bpmn:outgoing>PP1628</bpmn:outgoing>
    </bpmn:parallelPP2253>
    <bpmn:sequenceFlow id="PP2065" sourceRef="PP2270" targetRef="PP1225" />
    <bpmn:sequenceFlow id="PP1825" sourceRef="PP1225" targetRef="PP2296" />
    <bpmn:PP3162 id="PP1199" name="PP0749" attachedToRef="PP0037">
      <bpmn:outgoing>PP1298</bpmn:outgoing>
      <bpmn:escalationEventDefinition id="PP0895" escalationRef="PP0905" />
    </bpmn:PP3162>
    <bpmn:servicePP2865 id="PP4078" name="PP2735" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">87</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3888_PP4133">$</camunda:entry>
              <camunda:entry key="resultado_analise">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3888_PP4133">PP3525</camunda:entry>
              <camunda:entry key="resultado_analise">${PP3313_analise_PP3643}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1298</bpmn:incoming>
      <bpmn:outgoing>PP1725</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1298" sourceRef="PP1199" targetRef="PP4078" />
    <bpmn:intermediateThrowEvent id="PP1216" name="PP0567">
      <bpmn:incoming>PP1725</bpmn:incoming>
      <bpmn:linkEventDefinition id="PP2549" name="PP3207" />
    </bpmn:intermediateThrowEvent>
    <bpmn:sequenceFlow id="PP1725" sourceRef="PP4078" targetRef="PP1216" />
    <bpmn:PP3162 id="PP1151" name="PP0748" attachedToRef="PP0062">
      <bpmn:outgoing>PP1302</bpmn:outgoing>
      <bpmn:escalationEventDefinition id="PP0891" escalationRef="PP0905" />
    </bpmn:PP3162>
    <bpmn:servicePP2865 id="PP2749" name="PP2735" PP3193="${PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">87</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3888_PP4133">$</camunda:entry>
              <camunda:entry key="resultado_analise">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3888_PP4133">PP3525</camunda:entry>
              <camunda:entry key="resultado_analise">${PP3313_analise_PP3643}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1302</bpmn:incoming>
      <bpmn:outgoing>PP1434</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:intermediateThrowEvent id="PP1158" name="PP0567">
      <bpmn:incoming>PP1434</bpmn:incoming>
      <bpmn:linkEventDefinition id="PP2544" name="PP3207" />
    </bpmn:intermediateThrowEvent>
    <bpmn:sequenceFlow id="PP1302" sourceRef="PP1151" targetRef="PP2749" />
    <bpmn:sequenceFlow id="PP1434" sourceRef="PP2749" targetRef="PP1158" />
    <bpmn:servicePP2865 id="PP3932" name="PP2642" camunda:type="external" PP3199="creditos-v1-calculo_PP3833_abertura_PP3365">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3406">
            <camunda:map>
              <camunda:entry key="PP4330">004</camunda:entry>
              <camunda:entry key="codigo_compensacao_banco">341</camunda:entry>
              <camunda:entry key="codigo_PP4229">${PP4229}</camunda:entry>
              <camunda:entry key="PP4334">F</camunda:entry>
              <camunda:entry key="PP3053">${PP3053}</camunda:entry>
              <camunda:entry key="PP3350">${PP3350}</camunda:entry>
              <camunda:entry key="PP3394">${PP3394}</camunda:entry>
              <camunda:entry key="PP3383">${PP3383.substring(0,9)}</camunda:entry>
              <camunda:entry key="PP3648">${(PP3606.hasVariable("PP3559") &amp;&amp; PP3559 == "true") ? PP3648 : http_gq_PP3329_PP3557_PP3350["PP3648"]}</camunda:entry>
              <camunda:entry key="regiao">${PP3292}</camunda:entry>
              <camunda:entry key="indicador_beneficiario_inss">N</camunda:entry>
              <camunda:entry key="identificador_origem">PP0019</camunda:entry>
              <camunda:entry key="indicador_menor_emancipado">N</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:outputParameter name="PP4155">
            <camunda:map>
              <camunda:entry key="PP4409_credito">${PP4409_credito}</camunda:entry>
              <camunda:entry key="valor_lis_pre_PP3079do">${valor_lis_pre_PP3079do}</camunda:entry>
              <camunda:entry key="valor_maximo_crediario">${valor_maximo_crediario}</camunda:entry>
              <camunda:entry key="valor_consorcio">${valor_consorcio}</camunda:entry>
              <camunda:entry key="valor_crediario_consignacao">${valor_crediario_consignacao}</camunda:entry>
              <camunda:entry key="valor_credito_imobiliario">${valor_credito_imobiliario}</camunda:entry>
              <camunda:entry key="classificacao_filtro_PP3248">${classificacao_filtro_PP3248}</camunda:entry>
              <camunda:entry key="codigo_estrela_PP3350_corrente">${codigo_estrela_PP3350_corrente}</camunda:entry>
              <camunda:entry key="data_abertura">${data_abertura}</camunda:entry>
              <camunda:entry key="filtro_retencao_PP3248">${filtro_retencao_PP3248}</camunda:entry>
              <camunda:entry key="indicador_funcionario_publico">${indicador_funcionario_publico}</camunda:entry>
              <camunda:entry key="valor_upa">${valor_upa}</camunda:entry>
              <camunda:entry key="codigo_metodologia">${codigo_metodologia}</camunda:entry>
              <camunda:entry key="identificador_spi_qualificado">${identificador_spi_qualificado}</camunda:entry>
              <camunda:entry key="identificador_spi">${identificador_spi}</camunda:entry>
              <camunda:entry key="identificador_publico_diferenciado">${identificador_publico_diferenciado}</camunda:entry>
              <camunda:entry key="indicador_PP4229_empresa">${indicador_PP4229_empresa}</camunda:entry>
              <camunda:entry key="classificacao_folha_empresa">${classificacao_folha_empresa}</camunda:entry>
              <camunda:entry key="codigo_origem">${codigo_origem}</camunda:entry>
              <camunda:entry key="codigo_origem">${codigo_origem}</camunda:entry>
              <camunda:entry key="PP3635_puc">false</camunda:entry>
            </camunda:map>
          </camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1511</bpmn:incoming>
      <bpmn:incoming>PP2012</bpmn:incoming>
      <bpmn:outgoing>PP2187</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1701" sourceRef="PP2396" targetRef="PP3887" />
    <bpmn:exclusivePP2253 id="PP2345" PP3476="PP1304">
      <bpmn:incoming>PP1454</bpmn:incoming>
      <bpmn:incoming>PP2187</bpmn:incoming>
      <bpmn:outgoing>PP1304</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1304" sourceRef="PP2345" targetRef="PP2415" />
    <bpmn:sequenceFlow id="PP2187" sourceRef="PP3932" targetRef="PP2345" />
    <bpmn:sequenceFlow id="PP2051" sourceRef="PP2440" targetRef="PP3816" />
    <bpmn:sequenceFlow id="PP1806" sourceRef="PP2440" targetRef="PP4352" />
    <bpmn:intermediateCatchEvent id="PP4352" name="Trava R0">
      <bpmn:incoming>PP1806</bpmn:incoming>
      <bpmn:outgoing>PP1959</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2922">
        <bpmn:PP4318Cycle xsi:type="bpmn:tFormalExpression">* * 19-7 ? * * *</bpmn:PP4318Cycle>
      </bpmn:PP4318rEventDefinition>
    </bpmn:intermediateCatchEvent>
    <bpmn:PP3601BasedPP2253 id="PP2440">
      <bpmn:incoming>PP2159</bpmn:incoming>
      <bpmn:outgoing>PP2051</bpmn:outgoing>
      <bpmn:outgoing>PP1806</bpmn:outgoing>
    </bpmn:PP3601BasedPP2253>
    <bpmn:intermediateCatchEvent id="PP4320" name="11h">
      <bpmn:incoming>PP1959</bpmn:incoming>
      <bpmn:outgoing>PP2012</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2948">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">PT11H</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:intermediateCatchEvent>
    <bpmn:sequenceFlow id="PP1959" sourceRef="PP4352" targetRef="PP4320" />
    <bpmn:sequenceFlow id="PP2012" sourceRef="PP4320" targetRef="PP3932" />
    <bpmn:sequenceFlow id="PP1511" sourceRef="PP3816" targetRef="PP3932" />
    <bpmn:subPP2714 id="PP0064" name="PP0794" PP4353>
      <bpmn:exclusivePP2253 id="PP2268" name="PP0665" PP3476="PP1603">
        <bpmn:incoming>PP1344</bpmn:incoming>
        <bpmn:outgoing>PP1594</bpmn:outgoing>
        <bpmn:outgoing>PP1603</bpmn:outgoing>
      </bpmn:exclusivePP2253>
      <bpmn:endEvent id="PP1148">
        <bpmn:incoming>PP1594</bpmn:incoming>
      </bpmn:endEvent>
      <bpmn:sequenceFlow id="PP1594" name="Sim" sourceRef="PP2268" targetRef="PP1148">
        <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP3360') &amp;&amp; PP3360 == true}</bpmn:conditionExpression>
      </bpmn:sequenceFlow>
      <bpmn:sequenceFlow id="PP1603" name="Não" sourceRef="PP2268" targetRef="PP3572" />
      <bpmn:startEvent id="PP0936" PP3191="true" isInterrupting="false">
        <bpmn:outgoing>PP1344</bpmn:outgoing>
        <bpmn:messageEventDefinition id="PP2594" messageRef="PP2599" />
      </bpmn:startEvent>
      <bpmn:sequenceFlow id="PP1344" sourceRef="PP0936" targetRef="PP2268" />
      <bpmn:endEvent id="PP1253">
        <bpmn:incoming>PP1843</bpmn:incoming>
        <bpmn:errorEventDefinition id="PP0810" errorRef="PP0870" />
      </bpmn:endEvent>
      <bpmn:servicePP2865 id="PP3572" name="PP3021" camunda:type="external" PP3199="PP3824">
        <bpmn:documentation>PP3810Link Git --&gt; PP3721</bpmn:documentation>
        <bpmn:extensionElements>
          <camunda:PP3789>
            <camunda:inputParameter name="PP3087">
              <camunda:map>
                <camunda:entry key="nome">${PP3907}</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
            <camunda:inputParameter name="PP4254">PP0538</camunda:inputParameter>
            <camunda:inputParameter name="PP4335">Nenhum</camunda:inputParameter>
            <camunda:inputParameter name="PP3551">${PP3550}</camunda:inputParameter>
            <camunda:inputParameter name="PP3234">""</camunda:inputParameter>
            <camunda:inputParameter name="PP3750">34</camunda:inputParameter>
            <camunda:inputParameter name="PP3233">${PP4229 == "4" ? "PP0764" : "PP0763"}</camunda:inputParameter>
            <camunda:inputParameter name="PP3738">PP0012</camunda:inputParameter>
            <camunda:inputParameter name="remetente">
              <camunda:map>
                <camunda:entry key="nome">PP2498</camunda:entry>
                <camunda:entry key="PP3550">PP3802mail@PP3802.com.br</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
          </camunda:PP3789>
        </bpmn:extensionElements>
        <bpmn:incoming>PP1603</bpmn:incoming>
        <bpmn:outgoing>PP1843</bpmn:outgoing>
      </bpmn:servicePP2865>
      <bpmn:sequenceFlow id="PP1843" sourceRef="PP3572" targetRef="PP1253" />
    </bpmn:subPP2714>
    <bpmn:intermediateCatchEvent id="PP3363" name="PP0666">
      <bpmn:outgoing>PP1505</bpmn:outgoing>
      <bpmn:linkEventDefinition id="PP2555" name="PP3362" />
    </bpmn:intermediateCatchEvent>
    <bpmn:endEvent id="PP1168">
      <bpmn:incoming>PP2055</bpmn:incoming>
      <bpmn:terminateEventDefinition id="PP2882" />
    </bpmn:endEvent>
    <bpmn:servicePP2865 id="PP3110" name="PP0196" PP3193="${PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">3</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3888_cancelamento">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3888_cancelamento">PP0668</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1505</bpmn:incoming>
      <bpmn:outgoing>PP2055</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1505" sourceRef="PP3363" targetRef="PP3110" />
    <bpmn:sequenceFlow id="PP2055" sourceRef="PP3110" targetRef="PP1168" />
    <bpmn:businessRulePP2865 id="PP3068" name="PP0165" camunda:resultVariable="PP4161" camunda:decisionRef="PP3519" camunda:mapDecisionResult="singleEntry">
      <bpmn:incoming>PP2194</bpmn:incoming>
      <bpmn:outgoing>PP1831</bpmn:outgoing>
    </bpmn:businessRulePP2865>
    <bpmn:exclusivePP2253 id="PP2294" name="PP0511" PP3476="PP1681">
      <bpmn:incoming>PP1831</bpmn:incoming>
      <bpmn:outgoing>PP1681</bpmn:outgoing>
      <bpmn:outgoing>PP1917</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:endEvent id="PP1072">
      <bpmn:incoming>PP2224</bpmn:incoming>
      <bpmn:terminateEventDefinition id="PP2886" />
    </bpmn:endEvent>
    <bpmn:userPP2865 id="PP3145" name="PP0510">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
        </camunda:formData>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1402</bpmn:incoming>
      <bpmn:outgoing>PP2232</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:servicePP2865 id="PP4059" name="PP2748" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">13</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP4161">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP4161">${PP3606.hasVariable('PP4161') ? PP4161 :"PP0509 não PP3079da"}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2232</bpmn:incoming>
      <bpmn:incoming>PP1808</bpmn:incoming>
      <bpmn:outgoing>PP2224</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP3162 id="PP0975" cancelActivity="false" attachedToRef="PP3145">
      <bpmn:outgoing>PP1808</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2928">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">PT3M</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1831" sourceRef="PP3068" targetRef="PP2294" />
    <bpmn:sequenceFlow id="PP1681" name="Aprovado" sourceRef="PP2294" targetRef="PP2334" />
    <bpmn:sequenceFlow id="PP1472" name="PP4460" sourceRef="PP3411" targetRef="PP3415">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4460') &amp;&amp; PP4460=="PP3415"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1513" name="PP4460" sourceRef="PP3419" targetRef="PP3411">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4460') &amp;&amp; PP4460=="PP3411"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1396" name="PP4460" sourceRef="PP3408" targetRef="PP3419">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4460') &amp;&amp; PP4460=="PP3419"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:PP3162 id="PP1123" attachedToRef="PP3415">
      <bpmn:outgoing>PP2207</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2936">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP2207" sourceRef="PP1123" targetRef="PP1098" />
    <bpmn:endEvent id="PP1098" name="PP3612">
      <bpmn:incoming>PP2207</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0857" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:PP3162 id="PP1205" attachedToRef="PP3411">
      <bpmn:outgoing>PP1733</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2913">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1733" sourceRef="PP1205" targetRef="PP1212" />
    <bpmn:endEvent id="PP1212" name="PP3612">
      <bpmn:incoming>PP1733</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0809" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:PP3162 id="PP0990" attachedToRef="PP3419">
      <bpmn:outgoing>PP1429</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2934">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1429" sourceRef="PP0990" targetRef="PP1190" />
    <bpmn:endEvent id="PP1190" name="PP3612">
      <bpmn:incoming>PP1429</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0831" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:PP3162 id="PP1043" attachedToRef="PP3408">
      <bpmn:outgoing>PP2042</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2911">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP2042" sourceRef="PP1043" targetRef="PP1157" />
    <bpmn:endEvent id="PP1157" name="PP3612">
      <bpmn:incoming>PP2042</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0862" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP1542" name="PP4460" sourceRef="PP3412" targetRef="PP3418">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4460') &amp;&amp; PP4460=="PP3418"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP2127" sourceRef="PP3414" targetRef="PP2290" />
    <bpmn:sequenceFlow id="PP2111" name="não" sourceRef="PP2341" targetRef="PP2290">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3465 == false}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1667" name="PP4460" sourceRef="PP3418" targetRef="PP3408">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4460') &amp;&amp; PP4460=="PP3408"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:PP3162 id="PP1198" attachedToRef="PP3418">
      <bpmn:outgoing>PP1468</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2905">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1468" sourceRef="PP1198" targetRef="PP1067" />
    <bpmn:endEvent id="PP1067" name="PP3612">
      <bpmn:incoming>PP1468</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0865" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP1735" sourceRef="PP3414" targetRef="PP3412">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4460') &amp;&amp; PP4460=="PP3412"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1774" sourceRef="PP1054" targetRef="PP0977" />
    <bpmn:endEvent id="PP0977" name="PP3612">
      <bpmn:incoming>PP1774</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0830" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:PP3162 id="PP1054" attachedToRef="PP3412">
      <bpmn:outgoing>PP1774</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2939">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1440" name="PP4460" sourceRef="PP4235" targetRef="PP3412">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4460') &amp;&amp; PP4460=="PP3412"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:PP3162 id="PP0982" attachedToRef="PP4235">
      <bpmn:outgoing>PP1827</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2906">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1827" sourceRef="PP0982" targetRef="PP1175" />
    <bpmn:endEvent id="PP1175" name="PP3612">
      <bpmn:incoming>PP1827</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0860" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:PP3162 id="PP1042" attachedToRef="PP3414">
      <bpmn:outgoing>PP1760</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2912">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1760" sourceRef="PP1042" targetRef="PP1081" />
    <bpmn:endEvent id="PP1081">
      <bpmn:incoming>PP1760</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0861" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP2194" sourceRef="PP3405" targetRef="PP3068" />
    <bpmn:userPP2865 id="PP3405" name="PP0723" PP3476="PP2194">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP4273" type="string" />
          <PP3196 id="PP3924" type="string" />
          <PP3196 id="PP4197" type="string" />
          <PP3196 id="PP4342" type="string" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP3797" type="boolean" />
          <PP3196 id="PP3284" type="string" />
          <PP3196 id="PP3285" type="string" />
          <PP3196 id="PP3429" type="string" />
          <PP3196 id="PP3137" type="string" />
        </camunda:formData>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3600">PP3405</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1521</bpmn:incoming>
      <bpmn:incoming>PP1919</bpmn:incoming>
      <bpmn:incoming>PP1598</bpmn:incoming>
      <bpmn:outgoing>PP2194</bpmn:outgoing>
      <bpmn:outgoing>PP1521</bpmn:outgoing>
      <bpmn:outgoing>PP1754</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:intermediateCatchEvent id="PP4323" name="PP0158">
      <bpmn:incoming>PP1841</bpmn:incoming>
      <bpmn:outgoing>PP2044</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2942">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">P1D</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:intermediateCatchEvent>
    <bpmn:sequenceFlow id="PP1841" sourceRef="PP2443" targetRef="PP4323" />
    <bpmn:exclusivePP2253 id="PP2429">
      <bpmn:incoming>PP2132</bpmn:incoming>
      <bpmn:incoming>PP2234</bpmn:incoming>
      <bpmn:outgoing>PP2040</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP2044" sourceRef="PP4323" targetRef="PP3333" />
    <bpmn:sequenceFlow id="PP2132" sourceRef="PP3872" targetRef="PP2429" />
    <bpmn:userPP2865 id="PP3298" name="PP0638" PP3476="PP1570">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3735" type="domain" />
          <PP3196 id="PP4238" type="boolean" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP4460" type="string" PP3476Value="continuar" />
          <PP3196 id="PP3842" type="domain" PP3476Value="${PP3606.hasVariable(&#39;PP3833rotativo_credito_v3_aberturaPP3365_resposta&#39;) ?&#10;PP3833rotativo_credito_v3_aberturaPP3365_resposta[&#39;valor_lis_pre_PP3079do&#39;] : null}" />
          <PP3196 id="PP3841" type="domain" PP3476Value="${PP3606.hasVariable(&#39;PP3833rotativo_credito_v3_aberturaPP3365_resposta&#39;) ?&#10;PP3833rotativo_credito_v3_aberturaPP3365_resposta[&#39;PP4393&#39;] : null}" />
        </camunda:formData>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3600">PP3298</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1560</bpmn:incoming>
      <bpmn:incoming>PP2153</bpmn:incoming>
      <bpmn:outgoing>PP1570</bpmn:outgoing>
      <bpmn:outgoing>PP1919</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:sequenceFlow id="PP1570" sourceRef="PP3298" targetRef="PP2280" />
    <bpmn:PP3162 id="PP1027" attachedToRef="PP3298">
      <bpmn:outgoing>PP1332</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2951">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:endEvent id="PP1034" name="PP3612">
      <bpmn:incoming>PP1332</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0869" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP1332" sourceRef="PP1027" targetRef="PP1034" />
    <bpmn:sequenceFlow id="PP1521" sourceRef="PP3405" targetRef="PP3405">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.PP3665('PP4273') != "PROCESSPP0014O"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:userPP2865 id="PP3144" name="PP3140">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
        </camunda:formData>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1754</bpmn:incoming>
      <bpmn:outgoing>PP2106</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:sequenceFlow id="PP1754" sourceRef="PP3405" targetRef="PP3144">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP4273 == "PROCESSPP0014O" &amp;&amp; PP4342 == "tentativas_excedidas"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP2106" sourceRef="PP3144" targetRef="PP4058" />
    <bpmn:sequenceFlow id="PP2091" sourceRef="PP1105" targetRef="PP4058" />
    <bpmn:servicePP2865 id="PP4058" name="PP2737" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">13</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP4342">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP4342">${PP3606.hasVariable('PP4342') ? PP4342 : "Tentativas Excedidas"}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2106</bpmn:incoming>
      <bpmn:incoming>PP2091</bpmn:incoming>
      <bpmn:outgoing>PP1795</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:endEvent id="PP1095">
      <bpmn:incoming>PP1795</bpmn:incoming>
      <bpmn:terminateEventDefinition id="PP2885" />
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP1795" sourceRef="PP4058" targetRef="PP1095" />
    <bpmn:PP3162 id="PP1105" cancelActivity="false" attachedToRef="PP3144">
      <bpmn:outgoing>PP2091</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2925">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">PT3M</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:PP3162 id="PP0967" attachedToRef="PP3405">
      <bpmn:outgoing>PP1431</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2945">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:endEvent id="PP0913" name="PP3612">
      <bpmn:incoming>PP1431</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0845" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP1431" sourceRef="PP0967" targetRef="PP0913" />
    <bpmn:servicePP2865 id="PP3333" name="PP0662" camunda:type="external" PP3199="PP3331">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3739">004341${PP3053}${PP3350}${PP3394}</camunda:inputParameter>
        </camunda:PP3789>
        <PP3194 PP3601="start">
          <camunda:PP4199 PP4199Format="groovy">def tentativa = PP3606.hasVariable("tentativas_PP3333") ? PP3606.PP3665("tentativas_PP3333") : 0tentativa = tentativa + 1PP3606.PP4250("tentativas_PP3333", tentativa)</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2095</bpmn:incoming>
      <bpmn:incoming>PP2044</bpmn:incoming>
      <bpmn:outgoing>PP2175</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:exclusivePP2253 id="PP2329" name="PP0013">
      <bpmn:incoming>PP1381</bpmn:incoming>
      <bpmn:outgoing>PP2234</bpmn:outgoing>
      <bpmn:outgoing>PP1940</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:endEvent id="PP1221" name="PP0570">
      <bpmn:incoming>PP2017</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0856" errorRef="PP0874" />
    </bpmn:endEvent>
    <bpmn:intermediateCatchEvent id="PP1226" name="PP0157">
      <bpmn:incoming>PP1558</bpmn:incoming>
      <bpmn:outgoing>PP2095</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2941">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">P1D</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:intermediateCatchEvent>
    <bpmn:exclusivePP2253 id="PP2278" name="PP0669" PP3476="PP1381">
      <bpmn:incoming>PP2175</bpmn:incoming>
      <bpmn:outgoing>PP1381</bpmn:outgoing>
      <bpmn:outgoing>PP1558</bpmn:outgoing>
      <bpmn:outgoing>PP1375</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:servicePP2865 id="PP4072" name="PP2747" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">3</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3888_cancelamento">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3888_cancelamento">${PP3888_cancelamento}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2130</bpmn:incoming>
      <bpmn:incoming>PP1750</bpmn:incoming>
      <bpmn:outgoing>PP2017</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP2095" sourceRef="PP1226" targetRef="PP3333" />
    <bpmn:sequenceFlow id="PP2175" sourceRef="PP3333" targetRef="PP2278" />
    <bpmn:sequenceFlow id="PP1381" name="Sim" sourceRef="PP2278" targetRef="PP2329" />
    <bpmn:sequenceFlow id="PP2234" name="Sim" sourceRef="PP2329" targetRef="PP2429">
      <bpmn:extensionElements>
        <PP3194 expression="${PP3606.PP4250(&#39;PP3360&#39;,&#39;true&#39;)}" PP3601="take" />
        <PP3194 expression="${PP3606.PP4250(&#39;PP4144&#39;,PP4142[0])}" PP3601="take" />
      </bpmn:extensionElements>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1940" name="Não" sourceRef="PP2329" targetRef="PP3477">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP4142[0].PP3925 != PP3753 }</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP2017" sourceRef="PP4072" targetRef="PP1221" />
    <bpmn:sequenceFlow id="PP1558" name="Não" sourceRef="PP2278" targetRef="PP1226">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP4142 == null &amp;&amp; tentativas_PP3333 &lt; 3 }</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1375" name="PP2537" sourceRef="PP2278" targetRef="PP1224">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP4142 == null &amp;&amp; tentativas_PP3333 &gt;= 3}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:intermediateThrowEvent id="PP1224" name="PP0735">
      <bpmn:extensionElements>
        <PP3194 PP3601="start">
          <camunda:PP4199 PP4199Format="groovy">PP3606.PP4250("PP3888_cancelamento", "PP0664 não efetivada no prazo de 48h")</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1375</bpmn:incoming>
      <bpmn:outgoing>PP2130</bpmn:outgoing>
    </bpmn:intermediateThrowEvent>
    <bpmn:sequenceFlow id="PP2130" sourceRef="PP1224" targetRef="PP4072" />
    <bpmn:intermediateThrowEvent id="PP3477" name="PP0735">
      <bpmn:extensionElements>
        <PP3194 PP3601="start">
          <camunda:PP4199 PP4199Format="groovy">PP3606.PP4250("PP3888_cancelamento", "PP0664 efetivada por PP3753 diferente da PP3819")</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1940</bpmn:incoming>
      <bpmn:outgoing>PP1750</bpmn:outgoing>
    </bpmn:intermediateThrowEvent>
    <bpmn:sequenceFlow id="PP1750" sourceRef="PP3477" targetRef="PP4072" />
    <bpmn:subPP2714 id="PP0136" name="PP2953" PP4353>
      <bpmn:endEvent id="PP0915">
        <bpmn:incoming>PP1588</bpmn:incoming>
        <bpmn:terminateEventDefinition id="PP2890" />
      </bpmn:endEvent>
      <bpmn:startEvent id="PP1223" name="PP0795">
        <bpmn:outgoing>PP1588</bpmn:outgoing>
        <bpmn:errorEventDefinition id="PP0851" errorRef="PP0883" camunda:errorCodeVariable="codigo_erro" camunda:errorPP2588Variable="PP3865" />
      </bpmn:startEvent>
      <bpmn:sequenceFlow id="PP1588" sourceRef="PP1223" targetRef="PP0915" />
    </bpmn:subPP2714>
    <bpmn:PP3162 id="PP1132" name="PP2876" attachedToRef="PP0037">
      <bpmn:outgoing>PP2004</bpmn:outgoing>
      <bpmn:escalationEventDefinition id="PP0889" escalationRef="PP0900" />
    </bpmn:PP3162>
    <bpmn:servicePP2865 id="PP4084" name="PP0569" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">3</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3888_cancelamento">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3888_cancelamento">PP1249</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2004</bpmn:incoming>
      <bpmn:outgoing>PP1509</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:intermediateThrowEvent id="PP1213" name="PP0738">
      <bpmn:incoming>PP1509</bpmn:incoming>
      <bpmn:messageEventDefinition id="PP2595" messageRef="PP2597" PP3195="${runPP4318Service.createPP2588Correlation(&#34;PP3496&#34;).PP4035VariableEquals(&#34;PP3759&#34;, PP3759).correlate()}" />
    </bpmn:intermediateThrowEvent>
    <bpmn:sequenceFlow id="PP2004" sourceRef="PP1132" targetRef="PP4084" />
    <bpmn:sequenceFlow id="PP1509" sourceRef="PP4084" targetRef="PP1213" />
    <bpmn:exclusivePP2253 id="PP2334" PP3476="PP2198">
      <bpmn:incoming>PP1681</bpmn:incoming>
      <bpmn:incoming>PP1610</bpmn:incoming>
      <bpmn:outgoing>PP2198</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP2198" sourceRef="PP2334" targetRef="PP2427" />
    <bpmn:userPP2865 id="PP3527" name="PP0751">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3528" type="string">
            <camunda:validation>
              <camunda:constraint name="required" />
            </camunda:validation>
          </PP3196>
          <PP3196 id="PP3744" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" />
            </camunda:properties>
            <camunda:validation>
              <camunda:constraint name="required" />
            </camunda:validation>
          </PP3196>
          <PP3196 id="PP4328" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" />
            </camunda:properties>
            <camunda:validation>
              <camunda:constraint name="required" />
            </camunda:validation>
          </PP3196>
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP4460" type="string" PP3476Value="continuar" />
          <PP3196 id="PP3741" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" />
            </camunda:properties>
            <camunda:validation>
              <camunda:constraint name="required" />
            </camunda:validation>
          </PP3196>
        </camunda:formData>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3529">
            <camunda:list>
              <camunda:value>PP4328</camunda:value>
              <camunda:value>PP3744</camunda:value>
              <camunda:value>PP3741</camunda:value>
            </camunda:list>
          </camunda:inputParameter>
          <camunda:outputParameter name="PP3600">PP3527</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1821</bpmn:incoming>
      <bpmn:outgoing>PP1610</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:PP3162 id="PP0961" cancelActivity="false" attachedToRef="PP3527">
      <bpmn:outgoing>PP1780</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2909">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1610" sourceRef="PP3527" targetRef="PP2334" />
    <bpmn:endEvent id="PP0986" name="PP3612">
      <bpmn:incoming>PP1780</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0834" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP1780" sourceRef="PP0961" targetRef="PP0986" />
    <bpmn:exclusivePP2253 id="PP2406" PP3476="PP1402">
      <bpmn:incoming>PP1917</bpmn:incoming>
      <bpmn:outgoing>PP1402</bpmn:outgoing>
      <bpmn:outgoing>PP1821</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1402" name="Recusada" sourceRef="PP2406" targetRef="PP3145" />
    <bpmn:sequenceFlow id="PP2224" sourceRef="PP4059" targetRef="PP1072" />
    <bpmn:sequenceFlow id="PP2232" sourceRef="PP3145" targetRef="PP4059" />
    <bpmn:sequenceFlow id="PP1808" sourceRef="PP0975" targetRef="PP4059" />
    <bpmn:sequenceFlow id="PP1917" sourceRef="PP2294" targetRef="PP2406">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${(PP4161 !='PP3143' )}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1821" name="Wayout" sourceRef="PP2406" targetRef="PP3527">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${(PP4161 == 'PP4469') &amp;&amp; PP3606.hasVariable('PP3797') &amp;&amp; PP3797 == true}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:intermediateThrowEvent id="PP3788" name="PP2505">
      <bpmn:extensionElements>
        <PP3194 PP3601="start">
          <camunda:PP4199 PP4199Format="groovy">PP3606.PP4250('PP3784',true)</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1729</bpmn:incoming>
      <bpmn:outgoing>PP1452</bpmn:outgoing>
    </bpmn:intermediateThrowEvent>
    <bpmn:sequenceFlow id="PP1452" sourceRef="PP3788" targetRef="PP3411" />
    <bpmn:subPP2714 id="PP0134" name="PP0167" PP4353>
      <bpmn:endEvent id="PP1222">
        <bpmn:incoming>PP1316</bpmn:incoming>
      </bpmn:endEvent>
      <bpmn:callActivity id="PP3184" name="AQ4" PP3189="PP4473">
        <bpmn:extensionElements>
          <camunda:in PP4420s="all" />
          <camunda:out PP4420s="all" />
          <PP3194 PP3601="start">
            <camunda:PP4199 PP4199Format="groovy">PP3606.removeVariable('PP3784')</camunda:PP4199>
          </PP3194>
          <camunda:in PP3167="#{PP3759}" />
        </bpmn:extensionElements>
        <bpmn:incoming>PP1983</bpmn:incoming>
        <bpmn:outgoing>PP1316</bpmn:outgoing>
      </bpmn:callActivity>
      <bpmn:sequenceFlow id="PP1983" sourceRef="PP3784" targetRef="PP3184" />
      <bpmn:sequenceFlow id="PP1316" sourceRef="PP3184" targetRef="PP1222" />
      <bpmn:startEvent id="PP3784" name="PP0176" isInterrupting="false">
        <bpmn:extensionElements>
          <PP3194 PP3601="start">
            <camunda:PP4199 PP4199Format="groovy">PP3606.removeVariable('PP3784')</camunda:PP4199>
          </PP3194>
        </bpmn:extensionElements>
        <bpmn:outgoing>PP1983</bpmn:outgoing>
        <bpmn:conditionalEventDefinition id="PP0648" camunda:PP4420Name="PP3784">
          <bpmn:condition xsi:type="bpmn:tFormalExpression">${PP3784}</bpmn:condition>
        </bpmn:conditionalEventDefinition>
      </bpmn:startEvent>
    </bpmn:subPP2714>
    <bpmn:exclusivePP2253 id="PP2387" name="PP2639" PP3476="PP1707">
      <bpmn:incoming>PP2036</bpmn:incoming>
      <bpmn:outgoing>PP1707</bpmn:outgoing>
      <bpmn:outgoing>PP1837</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:exclusivePP2253 id="PP2373" name="PP2794" PP3476="PP2200">
      <bpmn:incoming>PP1421</bpmn:incoming>
      <bpmn:outgoing>PP1499</bpmn:outgoing>
      <bpmn:outgoing>PP2200</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:servicePP2865 id="PP4243" name="PP2742" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">1</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="analise_de_pld">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="analise_de_pld">${analise_de_pld}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1499</bpmn:incoming>
      <bpmn:outgoing>PP1804</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:servicePP2865 id="PP4242" name="PP2743" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">4</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3888_PP4133">$</camunda:entry>
              <camunda:entry key="analise_de_pld">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3888_PP4133">PP2792</camunda:entry>
              <camunda:entry key="analise_de_pld">${analise_de_pld}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1466</bpmn:incoming>
      <bpmn:incoming>PP1438</bpmn:incoming>
      <bpmn:outgoing>PP1470</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:userPP2865 id="PP3066" name="PP2793">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
        </camunda:formData>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1953</bpmn:incoming>
      <bpmn:outgoing>PP1466</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:servicePP2865 id="PP4244" name="PP3020" camunda:type="external" PP3199="PP3824">
      <bpmn:documentation>PP3810Link Git --&gt; PP3721</bpmn:documentation>
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3087">
            <camunda:map>
              <camunda:entry key="nome">${PP3907}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP4254">PP0538</camunda:inputParameter>
          <camunda:inputParameter name="PP4335">Nenhum</camunda:inputParameter>
          <camunda:inputParameter name="PP3551">${PP3550}</camunda:inputParameter>
          <camunda:inputParameter name="PP3234">""</camunda:inputParameter>
          <camunda:inputParameter name="PP3750">34</camunda:inputParameter>
          <camunda:inputParameter name="PP3233">${PP4229 == "4" ? "PP0762" : "PP0761"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3738">PP0012</camunda:inputParameter>
          <camunda:inputParameter name="remetente">
            <camunda:map>
              <camunda:entry key="nome">PP2498</camunda:entry>
              <camunda:entry key="PP3550">PP3802mail@PP3802.com.br</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1470</bpmn:incoming>
      <bpmn:incoming>PP1489</bpmn:incoming>
      <bpmn:outgoing>PP1955</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP3162 id="PP1079" attachedToRef="PP3066">
      <bpmn:outgoing>PP1438</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2918">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">PT10M</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1499" name="Sim" sourceRef="PP2373" targetRef="PP4243">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${situacao_analise_pld == 'BAIXO'}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1804" sourceRef="PP4243" targetRef="PP2422" />
    <bpmn:exclusivePP2253 id="PP2375" name="PP2704" PP3476="PP2121">
      <bpmn:incoming>PP1349</bpmn:incoming>
      <bpmn:outgoing>PP2121</bpmn:outgoing>
      <bpmn:outgoing>PP1552</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP2121" name="Não" sourceRef="PP2375" targetRef="PP2370" />
    <bpmn:exclusivePP2253 id="PP2370" PP3476="PP1835">
      <bpmn:incoming>PP2121</bpmn:incoming>
      <bpmn:incoming>PP1739</bpmn:incoming>
      <bpmn:outgoing>PP1835</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:userPP2865 id="PP4311" name="PP2891">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP4311" type="boolean" />
          <PP3196 id="PP4312" type="string" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP4460" type="string" PP3476Value="continuar" />
          <PP3196 id="PP3842" type="domain" PP3476Value="${PP3606.hasVariable(&#39;PP3833rotativo_credito_v3_aberturaPP3365_resposta&#39;) ?&#10;PP3833rotativo_credito_v3_aberturaPP3365_resposta[&#39;valor_lis_pre_PP3079do&#39;] : null}" />
          <PP3196 id="PP3841" type="domain" PP3476Value="${PP3606.hasVariable(&#39;PP3833rotativo_credito_v3_aberturaPP3365_resposta&#39;) ?&#10;PP3833rotativo_credito_v3_aberturaPP3365_resposta[&#39;PP4393&#39;] : null}" />
        </camunda:formData>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3600">PP4311</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1552</bpmn:incoming>
      <bpmn:outgoing>PP1739</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:PP3162 id="PP1099" attachedToRef="PP4311">
      <bpmn:outgoing>PP2165</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2920">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1552" name="Sim" sourceRef="PP2375" targetRef="PP4311">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable("PP3135") &amp;&amp; PP3135}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1739" sourceRef="PP4311" targetRef="PP2370" />
    <bpmn:endEvent id="PP0995" name="PP3612">
      <bpmn:incoming>PP2165</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0840" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP2165" sourceRef="PP1099" targetRef="PP0995" />
    <bpmn:exclusivePP2253 id="PP2392" name="PP2637" PP3476="PP2205">
      <bpmn:incoming>PP1544</bpmn:incoming>
      <bpmn:outgoing>PP2205</bpmn:outgoing>
      <bpmn:outgoing>PP1942</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP2205" name="Não" sourceRef="PP2392" targetRef="PP3056" />
    <bpmn:servicePP2865 id="PP4379" name="PP2992" camunda:type="external" PP3199="PP4375">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="id_PP3200">${codigo_PP3200}</camunda:inputParameter>
          <camunda:inputParameter name="PP3736">${PP3917}</camunda:inputParameter>
          <camunda:inputParameter name="PP3640">PP0529</camunda:inputParameter>
          <camunda:inputParameter name="PP4336">V</camunda:inputParameter>
          <camunda:inputParameter name="PP3739">${PP3606.hasVariable("PP3926") ? PP3606.PP3665("PP3926") : PP4143}</camunda:inputParameter>
          <camunda:inputParameter name="PP4376">${!PP3606.hasVariable('PP3865_valida_PP3135')}</camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1942</bpmn:incoming>
      <bpmn:incoming>PP1782</bpmn:incoming>
      <bpmn:outgoing>PP1671</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1942" name="Sim" sourceRef="PP2392" targetRef="PP4379">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4311') &amp;&amp; PP4311}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:exclusivePP2253 id="PP2364" name="PP2636" PP3476="PP1365">
      <bpmn:incoming>PP1671</bpmn:incoming>
      <bpmn:incoming>PP1425</bpmn:incoming>
      <bpmn:outgoing>PP1446</bpmn:outgoing>
      <bpmn:outgoing>PP1365</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1671" sourceRef="PP4379" targetRef="PP2364" />
    <bpmn:servicePP2865 id="PP3541" name="PP0774" camunda:type="external" PP3199="efetivaBeneficioInss">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3736">${PP3917}</camunda:inputParameter>
          <camunda:inputParameter name="id_PP3200">${codigo_PP3200}</camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1446</bpmn:incoming>
      <bpmn:outgoing>PP2157</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1446" name="Sim" sourceRef="PP2364" targetRef="PP3541">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('correlation_valiPP3394ao_inss')}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:servicePP2865 id="PP3099" name="PP0189" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">93</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="efetivacao_inss">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="efetivacao_inss">${efetivacao_inss}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3912">true</camunda:inputParameter>
          <camunda:inputParameter name="PP3483">true</camunda:inputParameter>
          <camunda:inputParameter name="PP3482">true</camunda:inputParameter>
          <camunda:inputParameter name="PP3481">true</camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1854</bpmn:incoming>
      <bpmn:outgoing>PP2057</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP2057" sourceRef="PP3099" targetRef="PP2367" />
    <bpmn:sequenceFlow id="PP1919" name="PP4460" sourceRef="PP3298" targetRef="PP3405">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4460') &amp;&amp; PP4460=="PP3405"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1536" sourceRef="PP4071" targetRef="PP0964" />
    <bpmn:sequenceFlow id="PP1394" sourceRef="PP3613" targetRef="PP4071" />
    <bpmn:userPP2865 id="PP3613" name="PP1231">
      <bpmn:extensionElements />
      <bpmn:outgoing>PP1394</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:PP3162 id="PP4319" name="PP3610" attachedToRef="PP3613">
      <bpmn:outgoing>PP2213</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2937">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">PT30S</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:startEvent id="PP1040">
      <bpmn:outgoing>PP1852</bpmn:outgoing>
    </bpmn:startEvent>
    <bpmn:PP4199PP2865 id="PP4204" name="PP0187" PP3476="PP1748" PP4199Format="groovy">
      <bpmn:incoming>PP1852</bpmn:incoming>
      <bpmn:outgoing>PP1748</bpmn:outgoing>
      <bpmn:PP4199>PP3606.PP4250("PP4307", 'PT20M') PP3606.PP4250("PP4306", 'P22D') PP3606.PP4250("PP3635", 'PP3951') PP3606.PP4250("PP3295", '514017224')if(!PP3606.hasVariable("PP4278") || PP3606.PP3665("PP4278")==null || PP3606.PP3665("PP4278")==""){
      PP3606.PP4250("PP4278", 'PP2695');
    };
    if (PP3606.PP3665("PP4278") == 'PP3826') {
      PP3606.PP4250("PP4327", 'PP3826');
    }</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:userPP2865 id="PP3413" name="PP0505" PP3476="PP2144">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3135" type="domain" PP3476Value="${PP3135}" />
          <PP3196 id="PP3917" type="domain" PP3476Value="${PP3917}" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP4460" type="string" PP3476Value="continuar" />
          <PP3196 id="PP4229" type="domain" PP3476Value="${PP4229}" />
          <PP3196 id="PP4231" type="domain" PP3476Value="${PP4229}" />
        </camunda:formData>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3600">PP3413</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1404</bpmn:incoming>
      <bpmn:incoming>PP1833</bpmn:incoming>
      <bpmn:incoming>PP2029</bpmn:incoming>
      <bpmn:outgoing>PP2144</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:endEvent id="PP0984" name="PP3612">
      <bpmn:incoming>PP1788</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0866" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:userPP2865 id="PP3782" name="PP2504" PP3476="PP2119">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3254" type="string" />
          <PP3196 id="PP3555" type="string" PP3476Value="${PP3606.hasVariable(&#34;PP3555&#34;)&#10;? PP3555 : &#34;&#34;}" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP4355" type="boolean">
            <camunda:validation>
              <camunda:constraint name="required" />
            </camunda:validation>
          </PP3196>
          <PP3196 id="PP4460" type="string" PP3476Value="continuar" />
        </camunda:formData>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2144</bpmn:incoming>
      <bpmn:incoming>PP1330</bpmn:incoming>
      <bpmn:incoming>PP1292</bpmn:incoming>
      <bpmn:incoming>PP1762</bpmn:incoming>
      <bpmn:incoming>PP1665</bpmn:incoming>
      <bpmn:outgoing>PP1404</bpmn:outgoing>
      <bpmn:outgoing>PP2119</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:userPP2865 id="PP3319" name="PP0652" PP3476="PP1829">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3909" type="string" PP3476Value="${PP3606.hasVariable(&#39;PP3909_pagadora&#39;) ?PP3909_pagadora: &#34;&#34;}" />
          <PP3196 id="PP3555" type="string" PP3476Value="${PP3555}" />
          <PP3196 id="PP4460" type="string" PP3476Value="continuar" />
          <PP3196 id="PP4113" type="boolean">
            <camunda:validation>
              <camunda:constraint name="required" />
            </camunda:validation>
          </PP3196>
          <PP3196 id="PP3055" type="string" PP3476Value="${PP3055}" />
          <PP3196 id="PP3364" type="string" PP3476Value="${PP3364}" />
          <PP3196 id="PP3254" type="string" PP3476Value="${PP3254}" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP4229" type="domain" PP3476Value="${PP4229}" />
        </camunda:formData>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1582</bpmn:incoming>
      <bpmn:incoming>PP2102</bpmn:incoming>
      <bpmn:outgoing>PP1829</bpmn:outgoing>
      <bpmn:outgoing>PP1762</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:intermediateThrowEvent id="PP1219" name="PP2744">
      <bpmn:extensionElements>
        <PP3194 PP3601="start">
          <camunda:PP4199 PP4199Format="groovy">PP3606.PP4250("PP3637","PP4355");def PP3365_pagadoras = PP3606.PP3665("PP3365_pagadoras")def vinculo_selecionado = [:] as HashMapvinculo_selecionado.put("PP3254_pagadora", PP3254)vinculo_selecionado.put("PP3053_empresa_pagadora", PP3365_pagadoras[0]["PP3055"]) vinculo_selecionado.put("PP3350_empresa_pagadora", PP3365_pagadoras[0]["PP3364"].substring(0,7)) vinculo_selecionado.put("PP3394_empresa_pagadora", PP3365_pagadoras[0]["PP3364"].substring(7)) vinculo_selecionado.put("PP3053_recebera_salario", "") vinculo_selecionado.put("PP3350_recebera_salario", "") vinculo_selecionado.put("PP3394_recebera_salario", "") vinculo_selecionado.put("PP4330", "004") vinculo_selecionado.put("PP4330_PP3053_empresa_pagadora", "004") vinculo_selecionado.put("codigo_banco_PP3053_empresa_pagadora", "341") vinculo_selecionado.put("codigo_banco_origem", "341")PP3606.PP4250("vinculo_selecionado", vinculo_selecionado)</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1829</bpmn:incoming>
      <bpmn:outgoing>PP1677</bpmn:outgoing>
    </bpmn:intermediateThrowEvent>
    <bpmn:exclusivePP2253 id="PP2257" name="PP0783" PP3476="PP1306">
      <bpmn:incoming>PP1756</bpmn:incoming>
      <bpmn:outgoing>PP1306</bpmn:outgoing>
      <bpmn:outgoing>PP2069</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:intermediateThrowEvent id="PP1018" name="PP3553">
      <bpmn:extensionElements>
        <PP3194 PP3601="start">
          <camunda:PP4199 PP4199Format="groovy">PP3606.PP4250("PP3555",false);return PP3555;</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2069</bpmn:incoming>
      <bpmn:incoming>PP1289</bpmn:incoming>
      <bpmn:incoming>PP1392</bpmn:incoming>
      <bpmn:incoming>PP2161</bpmn:incoming>
      <bpmn:incoming>PP1971</bpmn:incoming>
      <bpmn:incoming>PP1819</bpmn:incoming>
      <bpmn:outgoing>PP1330</bpmn:outgoing>
    </bpmn:intermediateThrowEvent>
    <bpmn:endEvent id="PP1161" name="PP3612">
      <bpmn:incoming>PP1263</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0858" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:endEvent id="PP0942" name="PP3612">
      <bpmn:incoming>PP1436</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0867" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:PP3162 id="PP1135" attachedToRef="PP3413">
      <bpmn:outgoing>PP1961</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2949">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:PP3162 id="PP1057" cancelActivity="false" attachedToRef="PP3782">
      <bpmn:outgoing>PP1436</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2903">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:PP3162 id="PP1089" cancelActivity="false" attachedToRef="PP3319">
      <bpmn:outgoing>PP1263</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2908">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1852" sourceRef="PP1040" targetRef="PP4204" />
    <bpmn:sequenceFlow id="PP2144" sourceRef="PP3413" targetRef="PP3782" />
    <bpmn:sequenceFlow id="PP1961" sourceRef="PP1135" targetRef="PP2333" />
    <bpmn:sequenceFlow id="PP1762" sourceRef="PP3319" targetRef="PP3782">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${(PP3606.hasVariable("PP4113")&amp;&amp;PP4113==false) || PP4460 !='continuar' }</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1330" sourceRef="PP1018" targetRef="PP3782" />
    <bpmn:sequenceFlow id="PP1829" sourceRef="PP3319" targetRef="PP1219" />
    <bpmn:sequenceFlow id="PP1306" name="Sim" sourceRef="PP2257" targetRef="PP2350" />
    <bpmn:sequenceFlow id="PP1263" sourceRef="PP1089" targetRef="PP1161" />
    <bpmn:sequenceFlow id="PP1436" sourceRef="PP1057" targetRef="PP0942" />
    <bpmn:sequenceFlow id="PP1292" name="PP3004" sourceRef="PP3415" targetRef="PP3782">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4460') &amp;&amp; PP4460=="PP3782"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1605" sourceRef="PP3418" targetRef="PP3412" />
    <bpmn:exclusivePP2253 id="PP2327" name="PP0632">
      <bpmn:incoming>PP2189</bpmn:incoming>
      <bpmn:outgoing>PP2151</bpmn:outgoing>
      <bpmn:outgoing>PP1893</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:callActivity id="PP4283" name="PP3031" PP3189="PP4357">
      <bpmn:extensionElements>
        <camunda:out PP4420s="all" />
        <camunda:in source="PP4170" target="PP4170" />
        <camunda:in source="PP3365_pagadoras" target="PP3365_pagadoras" />
        <camunda:in source="PP3053" target="PP3053" />
        <camunda:in source="PP3350" target="PP3350" />
        <camunda:in source="PP3394" target="PP3394" />
        <camunda:in source="vinculo_selecionado" target="vinculo_selecionado" />
        <camunda:in source="PP3383" target="PP3383" />
        <camunda:in source="PP3350_reservada" target="PP3350_reservada" />
        <camunda:in source="PP3934_product" target="PP3934_product" />
        <camunda:in source="PP4229" target="PP4229" />
        <camunda:in source="PP3759" target="PP3759" />
        <camunda:in source="PP3550" target="PP3550" />
        <camunda:in source="PP3467" target="PP3467" />
        <camunda:in source="PP3242" target="PP3242" />
        <camunda:in source="PP3407" target="PP3407" />
        <camunda:in source="PP3913_PP3524" target="PP3913_PP3524" />
        <camunda:in source="PP4328" target="PP4328" />
        <camunda:in source="vinculoSelecionado" target="vinculoSelecionado" />
        <camunda:in source="PP4481" target="PP4481" />
        <camunda:in PP3167="#{PP3759}" />
        <camunda:in source="PP3637" target="PP3637" />
        <camunda:in source="PP3753" target="PP3753" />
        <camunda:in source="PP3761" target="PP3761" />
        <camunda:in source="PP3757" target="PP3757" />
        <camunda:in source="intencao" target="intencao" />
        <camunda:in source="PP3254" target="PP3254" />
        <camunda:in source="PP3909" target="PP3909" />
        <camunda:in source="PP3295" target="PP3295" />
        <camunda:in source="PP3559" target="PP3559" />
        <camunda:in source="PP3648" target="PP3648" />
        <camunda:PP3789>
          <camunda:inputParameter name="PP4170">
            <camunda:PP4199 PP4199Format="groovy">Optional.ofNullable(PP3606.PP3665("http_gq_PP3329_PP3557_PP3350")).map {["PP3913Funcional": it["PP3648"]] }.orElse([:])</camunda:PP4199>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2151</bpmn:incoming>
      <bpmn:outgoing>PP1355</bpmn:outgoing>
    </bpmn:callActivity>
    <bpmn:exclusivePP2253 id="PP2285" PP3476="PP2173">
      <bpmn:incoming>PP1355</bpmn:incoming>
      <bpmn:incoming>PP1770</bpmn:incoming>
      <bpmn:outgoing>PP2173</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:PP4199PP2865 id="PP3885" name="PP2616" PP4199Format="groovy">
      <bpmn:incoming>PP1635</bpmn:incoming>
      <bpmn:outgoing>PP2104</bpmn:outgoing>
      <bpmn:PP4199>import java.text.DecimalFormatSymbolsimport java.text.DecimalFormat// Recuperar PP4421 do PP3635def PP3350_reservada = PP3606.PP3665('PP3350_reservada');
def PP3947 = PP3606.PP3665('PP3947');
    def tem_lis = PP3947['PP3972'];
    // Definir PP4421 em comumdef PP4421PP0780 = adicionarVariaveisEmComum();
    // Definir PP4421 para cada PP4229def PP4229 = PP3606.PP3665('PP4229');
    switch (PP4229.toUpperCase()) {
      case '3': // PP4419adicionarVariaveisVarejo(PP4421PP0780, PP3947)if(tem_lis) {
      PP3606.PP4250("PP3233", "PP0756");
    adicionarVariaveisLisVarejo(PP4421PP0780, PP3947)}
else {
      PP3606.PP4250("PP3233", "PP0755");
    }break;
    case 'L': //uniclassadicionarVariaveisPP2963(PP4421PP0780, PP3947)if(tem_lis) {
      PP3606.PP4250("PP3233", "PP0760");
    adicionarVariaveisLisPP2963(PP4421PP0780, PP3947)}
else {
      PP3606.PP4250("PP3233", "PP0759");
    }break;
    case '4': // personadicionarVariaveisPersonnalite(PP4421PP0780, PP3947)if(tem_lis) {
      PP3606.PP4250("PP3233", "PP0758");
    adicionarVariaveisLisPersonnalite(PP4421PP0780, PP3947)}
else {
      PP3606.PP4250("PP3233", "PP0757");
    }break;
    }
    PP3606.PP4250("PP3087", PP4421PP0780);
    // Inicio de declaracao das funcoesdef defineTipoPP0573(PP3947) {
      def tipoPP0573 = PP3947['PP3293'] == "M" ? "PP2617" : " ";
    tipoPP0573 = PP3947['PP3293'] == "D" ? "Débito" : tipoPP0573;
    tipoPP0573 = PP3947['PP3293'] == "C" ? "Master Black" : tipoPP0573;
    return tipoPP0573;
    }
def defineBandeiraPP0573(PP3947) {
      def PP3129 = PP3947['PP3131'] == "04" ? "VISA" : " ";
    PP3129 = PP3947['PP3131'] == "01" ? "MASTER" : PP3129;
    return PP3129;
    }
def formataNumero(PP3913) {
      if(PP3913 instanceof CharSequence) {
      PP3913 = Double.parseDouble(PP3913)}
def simbolos_usados = new DecimalFormatSymbols(Locale.GERMAN);
    // Como nao tem os simbolos do Brasil foram utilizados os da Alemanha que são os mais parecido def formatacao = "#,#0.00";
    // Formatacao que identifica quantas casas decimais serao PP4168das - Exemplo de PP4169: 1.234,56 def df = new DecimalFormat(formatacao, simbolos_usados);
    def PP3913_formatado = df.format(PP3913)return PP3913_formatado}
def adicionarVariaveisEmComum() {
      def PP4421PP0780 = [:] as HashMapPP4421PP0780.put("PP0155", PP3350_reservada['PP3053']);
    PP4421PP0780.put("PP0664", PP3350_reservada['PP3350']);
    PP4421PP0780.put("Dac", PP3350_reservada['PP3394']);
    return PP4421PP0780;
    }// PP2800M PP2533def adicionarVariaveisVarejo(PP4421PP0780, PP3947) {
      PP4421PP0780.put("VencimentoFaturas", PP3947["PP3504"] != null ?PP3947["PP3504"] : "");
    PP4421PP0780.put("TipoPP0573", defineTipoPP0573(PP3947) );
    PP4421PP0780.put("Bandeira", defineBandeiraPP0573(PP3947) );
    PP4421PP0780.put("PP0573Credito", PP3947['PP4325']);
    PP4421PP0780.put("Pacote", PP3947["PP3911"]);
    PP4421PP0780.put("MensalidadePacote", formataNumero(PP3947['PP4412']));
    }
def adicionarVariaveisPP2963(PP4421PP0780, PP3947) {
      PP4421PP0780.put("VencimentoFaturas", PP3947["PP3504"] != null ?PP3947["PP3504"] : "");
    PP4421PP0780.put("TipoPP0573", defineTipoPP0573(PP3947));
    PP4421PP0780.put("Bandeira", defineBandeiraPP0573(PP3947) );
    PP4421PP0780.put("MensalidadePacote", formataNumero(PP3947['PP4412']))}
def adicionarVariaveisPersonnalite(PP4421PP0780, PP3947) {
      PP4421PP0780.put("PP2726", PP3606.PP3665("PP3759"));
    PP4421PP0780.put("TipoPP0573", PP3947['PP4325']);
    PP4421PP0780.put("tipoPP0573", defineTipoPP0573(PP3947) );
    PP4421PP0780.put("PP3129PP0573", defineBandeiraPP0573(PP3947) );
    PP4421PP0780.put("nomePacoteTarifa", PP3947["PP3911"]);
    PP4421PP0780.put("valorPacoteTarifa", formataNumero(PP3947['PP4412']));
    PP4421PP0780.put("diaVencimentoPP0573", PP3947["PP3504"] != null ? PP3947["PP3504"] : " ");
    }// COM PP2533def adicionarVariaveisLisVarejo(PP4421PP0780, PP3947) {
      PP4421PP0780.put("PagamentoEncargos", PP3947['PP3503']);
    PP4421PP0780.put("LimitePP2533", formataNumero(PP3947["PP3839"]));
    }
def adicionarVariaveisLisPP2963(PP4421PP0780, PP3947) {
      adicionarVariaveisLisVarejo(PP4421PP0780, PP3947);
    PP4421PP0780.put("JurosLis", formataNumero(PP3947["PP4407"]))PP4421PP0780.put("valorIofLimPercentIofLis", formataNumero(PP3947["PP4406"]))PP4421PP0780.put("OperacaolOF", formataNumero(PP3947['PP4418'])) PP4421PP0780.put("valorCetMesLimite", formataNumero(PP3947["PP4395"])) PP4421PP0780.put("valorCetAnoLimite", formataNumero(PP3947["PP4394"])) PP4421PP0780.put("valorTotalOperaLimContratadolIofJurosLis", formataNumero(PP3947[ 'PP4418'])) PP4421PP0780.put("PP3913DeParcela", PP3947["PP3918"]) PP4421PP0780.put("valorDaParcela", PP3947["PP4404"]) PP4421PP0780.put("Pacote", PP3947["PP3911"]) }
def adicionarVariaveisLisPersonnalite(PP4421PP0780, PP3947) {
      PP4421PP0780.put("valorTaxaJurosLisMes", formataNumero(PP3947["PP4416"]));
    PP4421PP0780.put("valorTaxaJurosLisAno", formataNumero(PP3947["PP4415"]));
    PP4421PP0780.put("valorIofLis", formataNumero(PP3947["PP4406"]) +" ");
    PP4421PP0780.put("percentIofLis", formataNumero(PP3947["PP4004"]));
    PP4421PP0780.put("valorCetMesLimite", formataNumero(PP3947["PP4395"]));
    PP4421PP0780.put("valorCetAnoLimite", formataNumero(PP3947["PP4394"]));
    PP4421PP0780.put("valorTotalOperaLimContratadoIofJurosLis", formataNumero(PP3947["PP4418"]));
    PP4421PP0780.put("somaTotalLis", formataNumero(PP3947["PP4267"]));
    PP4421PP0780.put("valorJurosLis", formataNumero(PP3947["PP4407"]));
    PP4421PP0780.put("diaDebitoEncargoLis", PP3947['PP3503']);
    PP4421PP0780.put("PP3833Maximo", formataNumero(PP3947["PP3839"]));
    }</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:servicePP2865 id="PP3570" name="PP0004" camunda:type="external" PP3199="PP3824">
      <bpmn:documentation>PP3810Link Git --&gt; PP3721</bpmn:documentation>
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP4254">PP0538</camunda:inputParameter>
          <camunda:inputParameter name="PP4335">Nenhum</camunda:inputParameter>
          <camunda:inputParameter name="PP3551">${PP3550}</camunda:inputParameter>
          <camunda:inputParameter name="PP3234">""</camunda:inputParameter>
          <camunda:inputParameter name="PP3750">34</camunda:inputParameter>
          <camunda:inputParameter name="PP3233">${PP3233}</camunda:inputParameter>
          <camunda:inputParameter name="PP3738">PP0012</camunda:inputParameter>
          <camunda:inputParameter name="remetente">
            <camunda:map>
              <camunda:entry key="nome">PP2518</camunda:entry>
              <camunda:entry key="PP3550">comunicacaodigital@PP3802-unibanco.com.br</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2104</bpmn:incoming>
      <bpmn:outgoing>PP2155</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP2151" name="Sim" sourceRef="PP2327" targetRef="PP4283">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP3637') &amp;&amp; (PP3637=='PP4355' || PP3637=='massificado') &amp;&amp; PP3606.hasVariable("PP4113") &amp;&amp; PP4113 == true}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1355" sourceRef="PP4283" targetRef="PP2285" />
    <bpmn:sequenceFlow id="PP2104" sourceRef="PP3885" targetRef="PP3570" />
    <bpmn:sequenceFlow id="PP2173" sourceRef="PP2285" targetRef="PP4064" />
    <bpmn:endEvent id="PP1145" name="PP3612">
      <bpmn:incoming>PP1895</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0864" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:userPP2865 id="PP3067" name="PP0170">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
        </camunda:formData>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2215</bpmn:incoming>
      <bpmn:incoming>PP1707</bpmn:incoming>
      <bpmn:outgoing>PP2215</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:sequenceFlow id="PP2215" sourceRef="PP3067" targetRef="PP3067" />
    <bpmn:sequenceFlow id="PP1707" name="Não" sourceRef="PP2387" targetRef="PP3067" />
    <bpmn:exclusivePP2253 id="PP2316" PP3476="PP1421">
      <bpmn:incoming>PP1528</bpmn:incoming>
      <bpmn:incoming>PP1837</bpmn:incoming>
      <bpmn:outgoing>PP1421</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1528" sourceRef="PP1087" targetRef="PP2316" />
    <bpmn:sequenceFlow id="PP1421" sourceRef="PP2316" targetRef="PP2373" />
    <bpmn:exclusivePP2253 id="PP2318" name="PP2795" PP3476="PP1953">
      <bpmn:incoming>PP2200</bpmn:incoming>
      <bpmn:outgoing>PP1351</bpmn:outgoing>
      <bpmn:outgoing>PP1953</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP2200" name="Não" sourceRef="PP2373" targetRef="PP2318" />
    <bpmn:exclusivePP2253 id="PP2422" PP3476="PP1280">
      <bpmn:incoming>PP1804</bpmn:incoming>
      <bpmn:incoming>PP1492</bpmn:incoming>
      <bpmn:outgoing>PP1280</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:callActivity id="PP3870" name="Mesa PP2663" PP3189="PP4472">
      <bpmn:extensionElements>
        <camunda:out source="response_PP3329_PP3870" target="response_PP3329_PP3870" />
        <camunda:out source="callPP3123_PP3870" target="callPP3123_PP3870" />
        <camunda:in source="intencao" target="intencao" />
        <camunda:in source="PP3753" target="PP3753" />
        <camunda:in source="PP3761" target="PP3761" />
        <camunda:in source="id_inquilino" target="id_inquilino" />
        <camunda:in source="analise_de_pld" target="analise_de_pld" />
        <camunda:in source="PP3468" target="pep_autodeclarado" />
        <camunda:in source="PP4481" target="PP4481" />
        <camunda:in source="PP3759" target="PP3759" />
        <camunda:in PP3167="#{PP3759}" />
        <camunda:in source="id_analise_pld" target="id_analise" />
        <camunda:in source="PP3288" target="PP3288" />
        <camunda:in source="PP3635" target="PP3635" />
      </bpmn:extensionElements>
      <bpmn:incoming>PP1351</bpmn:incoming>
      <bpmn:outgoing>PP1492</bpmn:outgoing>
    </bpmn:callActivity>
    <bpmn:PP3162 id="PP1176" attachedToRef="PP3870">
      <bpmn:outgoing>PP1489</bpmn:outgoing>
      <bpmn:escalationEventDefinition id="PP0897" escalationRef="PP0899" />
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1351" name="Sim" sourceRef="PP2318" targetRef="PP3870">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${situacao_analise_pld == 'MEDIO'}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1492" name="PP2728" sourceRef="PP3870" targetRef="PP2422" />
    <bpmn:sequenceFlow id="PP1953" name="Não" sourceRef="PP2318" targetRef="PP3066" />
    <bpmn:sequenceFlow id="PP1466" sourceRef="PP3066" targetRef="PP4242" />
    <bpmn:sequenceFlow id="PP1438" sourceRef="PP1079" targetRef="PP4242" />
    <bpmn:sequenceFlow id="PP1470" sourceRef="PP4242" targetRef="PP4244" />
    <bpmn:sequenceFlow id="PP1489" name="PP2733" sourceRef="PP1176" targetRef="PP4244" />
    <bpmn:endEvent id="PP1141" name="PP0568">
      <bpmn:incoming>PP1955</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0820" errorRef="PP0870" />
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP1955" sourceRef="PP4244" targetRef="PP1141" />
    <bpmn:sequenceFlow id="PP1837" name="Sim" sourceRef="PP2387" targetRef="PP2316">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('analise_de_pld') &amp;&amp; analise_de_pld.situacao_processamento == 'SUCESSO'}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP2213" sourceRef="PP4319" targetRef="PP4071" />
    <bpmn:subPP2714 id="PP0122" name="PP1254" PP4353>
      <bpmn:startEvent id="PP1174">
        <bpmn:outgoing>PP2026</bpmn:outgoing>
        <bpmn:errorEventDefinition id="PP0812" errorRef="PP0870" />
      </bpmn:startEvent>
      <bpmn:endEvent id="PP0983">
        <bpmn:incoming>PP1494</bpmn:incoming>
        <bpmn:terminateEventDefinition id="PP2884" />
      </bpmn:endEvent>
      <bpmn:exclusivePP2253 id="PP3654" name="PP2240" PP3476="PP1494">
        <bpmn:incoming>PP2026</bpmn:incoming>
        <bpmn:outgoing>PP1494</bpmn:outgoing>
        <bpmn:outgoing>PP1991</bpmn:outgoing>
      </bpmn:exclusivePP2253>
      <bpmn:endEvent id="PP1026">
        <bpmn:incoming>PP1501</bpmn:incoming>
        <bpmn:compensateEventDefinition id="PP0642" />
      </bpmn:endEvent>
      <bpmn:parallelPP2253 id="PP2449">
        <bpmn:incoming>PP1991</bpmn:incoming>
        <bpmn:outgoing>PP1501</bpmn:outgoing>
        <bpmn:outgoing>PP2142</bpmn:outgoing>
      </bpmn:parallelPP2253>
      <bpmn:endEvent id="PP1178" name="PP0514">
        <bpmn:incoming>PP2142</bpmn:incoming>
        <bpmn:errorEventDefinition id="PP0816" errorRef="PP0884" />
      </bpmn:endEvent>
      <bpmn:sequenceFlow id="PP2026" sourceRef="PP1174" targetRef="PP3654" />
      <bpmn:sequenceFlow id="PP1494" name="Não" sourceRef="PP3654" targetRef="PP0983" />
      <bpmn:sequenceFlow id="PP1991" name="Sim" sourceRef="PP3654" targetRef="PP2449">
        <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP3350_reservada') &amp;&amp; PP3350_reservada != null}</bpmn:conditionExpression>
      </bpmn:sequenceFlow>
      <bpmn:sequenceFlow id="PP1501" sourceRef="PP2449" targetRef="PP1026" />
      <bpmn:sequenceFlow id="PP2142" sourceRef="PP2449" targetRef="PP1178" />
    </bpmn:subPP2714>
    <bpmn:subPP2714 id="PP0073" name="PP1232" PP4353>
      <bpmn:servicePP2865 id="PP3614" name="PP2736" PP3193="#{PP3106}">
        <bpmn:extensionElements>
          <camunda:PP3789>
            <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
            <camunda:inputParameter name="PP3417">
              <camunda:map>
                <camunda:entry key="PP3611_PP3819">true</camunda:entry>
                <camunda:entry key="tipo_PP3611">${PP3606.hasVariable('tipo_PP3611') ? tipo_PP3611 :'ABANDONO' }</camunda:entry>
                <camunda:entry key="PP3600">${PP3606.hasVariable('PP3600') ? PP3600 : 'etapa_sistemica'}</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
            <camunda:inputParameter name="PP3875">
              <camunda:map>
                <camunda:entry key="PP3611_PP3819">$</camunda:entry>
                <camunda:entry key="tipo_PP3611">$</camunda:entry>
                <camunda:entry key="PP3600">$</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
            <camunda:inputParameter name="PP4274">15</camunda:inputParameter>
          </camunda:PP3789>
        </bpmn:extensionElements>
        <bpmn:incoming>PP2014</bpmn:incoming>
        <bpmn:outgoing>PP1278</bpmn:outgoing>
      </bpmn:servicePP2865>
      <bpmn:startEvent id="PP0923">
        <bpmn:outgoing>PP2014</bpmn:outgoing>
        <bpmn:errorEventDefinition id="PP0850" errorRef="PP0879" />
      </bpmn:startEvent>
      <bpmn:endEvent id="PP1092">
        <bpmn:incoming>PP1278</bpmn:incoming>
        <bpmn:errorEventDefinition id="PP0842" errorRef="PP0870" />
      </bpmn:endEvent>
      <bpmn:sequenceFlow id="PP2014" sourceRef="PP0923" targetRef="PP3614" />
      <bpmn:sequenceFlow id="PP1278" sourceRef="PP3614" targetRef="PP1092" />
    </bpmn:subPP2714>
    <bpmn:subPP2714 id="PP0101" name="PP0513" PP4353>
      <bpmn:servicePP2865 id="PP3154" name="PP0513" camunda:type="external" PP3199="PP3150">
        <bpmn:extensionElements>
          <camunda:PP3789>
            <camunda:inputParameter name="PP3152">${true}</camunda:inputParameter>
            <camunda:inputParameter name="PP3153">
              <camunda:map>
                <camunda:entry key="codigo_PP3888_bloqueio">PP0219</camunda:entry>
                <camunda:entry key="codigo_PP4087">${PP3289}</camunda:entry>
                <camunda:entry key="codigo_PP4364">PP0220</camunda:entry>
                <camunda:entry key="codigo_PP3200">${codigo_PP3200}</camunda:entry>
                <camunda:entry key="codigo_PP4256_chamador">PP0538</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
            <camunda:outputParameter name="PP3156">${true}</camunda:outputParameter>
            <camunda:outputParameter name="PP3151">${PP3606.PP3665( "PP3151")}</camunda:outputParameter>
          </camunda:PP3789>
          <PP3194 PP3601="start">
            <camunda:PP4199 PP4199Format="groovy">def tentativa = PP3606.hasVariable("tentativa_bloqueio") ? PP3606.PP3665("tentativa_bloqueio") : 0tentativa = tentativa + 1PP3606.PP4250("tentativa_bloqueio", tentativa)</camunda:PP4199>
          </PP3194>
        </bpmn:extensionElements>
        <bpmn:incoming>PP3315</bpmn:incoming>
        <bpmn:incoming>PP1270</bpmn:incoming>
        <bpmn:outgoing>PP1998</bpmn:outgoing>
      </bpmn:servicePP2865>
      <bpmn:exclusivePP2253 id="PP2442" name="PP2867" PP3476="PP2236">
        <bpmn:incoming>PP1737</bpmn:incoming>
        <bpmn:outgoing>PP3315</bpmn:outgoing>
        <bpmn:outgoing>PP2236</bpmn:outgoing>
      </bpmn:exclusivePP2253>
      <bpmn:startEvent id="PP3602" name="PP0514">
        <bpmn:outgoing>PP1737</bpmn:outgoing>
        <bpmn:errorEventDefinition id="PP0826" errorRef="PP0884" />
      </bpmn:startEvent>
      <bpmn:servicePP2865 id="PP4060" name="PP0215" PP3193="#{PP3106}">
        <bpmn:extensionElements>
          <camunda:PP3789>
            <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
            <camunda:inputParameter name="PP3417">
              <camunda:map>
                <camunda:entry key="PP3156">${PP3156}</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
            <camunda:inputParameter name="PP3875">
              <camunda:map>
                <camunda:entry key="PP3156">$</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
          </camunda:PP3789>
        </bpmn:extensionElements>
        <bpmn:incoming>PP1998</bpmn:incoming>
        <bpmn:incoming>PP1322</bpmn:incoming>
        <bpmn:outgoing>PP1929</bpmn:outgoing>
      </bpmn:servicePP2865>
      <bpmn:exclusivePP2253 id="PP2314" PP3476="PP1944">
        <bpmn:incoming>PP1703</bpmn:incoming>
        <bpmn:outgoing>PP1944</bpmn:outgoing>
        <bpmn:outgoing>PP1649</bpmn:outgoing>
      </bpmn:exclusivePP2253>
      <bpmn:endEvent id="PP1065">
        <bpmn:incoming>PP2236</bpmn:incoming>
      </bpmn:endEvent>
      <bpmn:endEvent id="PP1031">
        <bpmn:incoming>PP1929</bpmn:incoming>
      </bpmn:endEvent>
      <bpmn:intermediateThrowEvent id="PP0927" name="PP0515">
        <bpmn:extensionElements>
          <camunda:PP3789>
            <camunda:outputParameter name="PP3156">${false}</camunda:outputParameter>
          </camunda:PP3789>
        </bpmn:extensionElements>
        <bpmn:incoming>PP1944</bpmn:incoming>
        <bpmn:outgoing>PP1322</bpmn:outgoing>
      </bpmn:intermediateThrowEvent>
      <bpmn:PP3162 id="PP3587" attachedToRef="PP3154">
        <bpmn:outgoing>PP1703</bpmn:outgoing>
        <bpmn:errorEventDefinition id="PP0823" errorRef="PP0873" />
      </bpmn:PP3162>
      <bpmn:sequenceFlow id="PP3315" name="sim" sourceRef="PP2442" targetRef="PP3154">
        <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP3289') &amp;&amp; PP3289 != null &amp;&amp; PP3289 != 'null' &amp;&amp; PP3289 != ''}</bpmn:conditionExpression>
      </bpmn:sequenceFlow>
      <bpmn:sequenceFlow id="PP1998" sourceRef="PP3154" targetRef="PP4060" />
      <bpmn:sequenceFlow id="PP1737" sourceRef="PP3602" targetRef="PP2442" />
      <bpmn:sequenceFlow id="PP2236" name="não" sourceRef="PP2442" targetRef="PP1065" />
      <bpmn:sequenceFlow id="PP1322" sourceRef="PP0927" targetRef="PP4060" />
      <bpmn:sequenceFlow id="PP1929" sourceRef="PP4060" targetRef="PP1031" />
      <bpmn:sequenceFlow id="PP1703" sourceRef="PP3587" targetRef="PP2314" />
      <bpmn:sequenceFlow id="PP1944" sourceRef="PP2314" targetRef="PP0927" />
      <bpmn:intermediateCatchEvent id="PP1084">
        <bpmn:incoming>PP1649</bpmn:incoming>
        <bpmn:outgoing>PP1270</bpmn:outgoing>
        <bpmn:PP4318rEventDefinition id="PP2916">
          <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">PT30S</bpmn:PP4318Duration>
        </bpmn:PP4318rEventDefinition>
      </bpmn:intermediateCatchEvent>
      <bpmn:sequenceFlow id="PP1649" sourceRef="PP2314" targetRef="PP1084">
        <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${tentativa_bloqueio &lt; 3}</bpmn:conditionExpression>
      </bpmn:sequenceFlow>
      <bpmn:sequenceFlow id="PP1270" sourceRef="PP1084" targetRef="PP3154" />
    </bpmn:subPP2714>
    <bpmn:intermediateCatchEvent id="PP1076" name="PP0567">
      <bpmn:extensionElements>
        <PP3194 PP3601="end">
          <camunda:PP4199 PP4199Format="groovy">import static net.logstash.logPP3123.argument.StructuredArguments.valueimport org.slf4j.Loggerimport org.slf4j.LoggerFactoryimport java.PP4318.Instantimport java.PP4318.Durationfinal Logger logger = LoggerFactory.getLogger("PP3164")Instant inicio = Instant.now()logger.info("PP2237 de recusa de PP4048 por analise de PP3643 PP0028",value("PP3759" , PP3606.PP3665("PP3759")),value("PP3753" , PP3606.PP3665("PP3753")),value("intencao" , PP3606.PP3665("intencao")),value("correlationId" , PP3606.PP3665("PP4481")),value("PP4305_total_espera" , Duration.between(inicio, Instant.now())))</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:outgoing>PP2211</bpmn:outgoing>
      <bpmn:linkEventDefinition id="PP2551" name="PP3207" />
    </bpmn:intermediateCatchEvent>
    <bpmn:exclusivePP2253 id="PP2305" name="PP2759" PP3476="PP1690">
      <bpmn:incoming>PP1694</bpmn:incoming>
      <bpmn:outgoing>PP1690</bpmn:outgoing>
      <bpmn:outgoing>PP1444</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:servicePP2865 id="PP3498" name="PP0739" camunda:type="external" PP3199="PP3495">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP4334">F</camunda:inputParameter>
          <camunda:inputParameter name="PP4333">02</camunda:inputParameter>
          <camunda:inputParameter name="PP4330">004</camunda:inputParameter>
          <camunda:inputParameter name="PP3753">${PP3753}</camunda:inputParameter>
          <camunda:inputParameter name="PP3053">${PP3053}</camunda:inputParameter>
          <camunda:inputParameter name="PP3350">${PP3350}</camunda:inputParameter>
          <camunda:inputParameter name="PP3394">${PP3394}</camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1931</bpmn:incoming>
      <bpmn:outgoing>PP1694</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:endEvent id="PP1194">
      <bpmn:incoming>PP1690</bpmn:incoming>
    </bpmn:endEvent>
    <bpmn:endEvent id="PP0939">
      <bpmn:incoming>PP1923</bpmn:incoming>
    </bpmn:endEvent>
    <bpmn:endEvent id="PP0948" name="PP0514">
      <bpmn:incoming>PP2063</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0832" errorRef="PP0884" />
    </bpmn:endEvent>
    <bpmn:parallelPP2253 id="PP2394">
      <bpmn:incoming>PP2211</bpmn:incoming>
      <bpmn:outgoing>PP1931</bpmn:outgoing>
      <bpmn:outgoing>PP2063</bpmn:outgoing>
    </bpmn:parallelPP2253>
    <bpmn:sequenceFlow id="PP2211" sourceRef="PP1076" targetRef="PP2394" />
    <bpmn:sequenceFlow id="PP1694" sourceRef="PP3498" targetRef="PP2305" />
    <bpmn:sequenceFlow id="PP1690" sourceRef="PP2305" targetRef="PP1194" />
    <bpmn:sequenceFlow id="PP1444" name="PP2248" sourceRef="PP2305" targetRef="PP3571">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP3313_analise_PP3643') &amp;&amp; PP3313_analise_PP3643 == "Confirmação de PP2246"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1923" sourceRef="PP3571" targetRef="PP0939" />
    <bpmn:sequenceFlow id="PP1931" sourceRef="PP2394" targetRef="PP3498" />
    <bpmn:sequenceFlow id="PP2063" sourceRef="PP2394" targetRef="PP0948" />
    <bpmn:servicePP2865 id="PP3571" name="PP0792" camunda:type="external" PP3199="PP3824">
      <bpmn:documentation>PP3810Link Git --&gt; PP3721</bpmn:documentation>
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3087">
            <camunda:map>
              <camunda:entry key="nome">${PP3907}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP4254">PP0538</camunda:inputParameter>
          <camunda:inputParameter name="PP4335">Nenhum</camunda:inputParameter>
          <camunda:inputParameter name="PP3551">${PP3550}</camunda:inputParameter>
          <camunda:inputParameter name="PP3234">""</camunda:inputParameter>
          <camunda:inputParameter name="PP3750">34</camunda:inputParameter>
          <camunda:inputParameter name="PP3233">${PP4229 == "4" ? "PP0762" : "PP0761"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3738">PP0012</camunda:inputParameter>
          <camunda:inputParameter name="remetente">
            <camunda:map>
              <camunda:entry key="nome">PP2498</camunda:entry>
              <camunda:entry key="PP3550">PP3802mail@PP3802.com.br</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1444</bpmn:incoming>
      <bpmn:outgoing>PP1923</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP3162 id="PP1006" attachedToRef="PP3064">
      <bpmn:outgoing>PP1913</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2930">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">PT15M</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1913" sourceRef="PP1006" targetRef="PP0993" />
    <bpmn:endEvent id="PP1109" name="PP3612">
      <bpmn:incoming>PP1257</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0814" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:exclusivePP2253 id="PP2413" PP3476="PP1334">
      <bpmn:incoming>PP2203</bpmn:incoming>
      <bpmn:outgoing>PP1334</bpmn:outgoing>
      <bpmn:outgoing>PP1462</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:exclusivePP2253 id="PP2303">
      <bpmn:incoming>PP1334</bpmn:incoming>
      <bpmn:incoming>PP1909</bpmn:incoming>
      <bpmn:outgoing>PP1607</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:servicePP2865 id="PP4377" name="PP2987" camunda:type="external" PP3199="PP4368">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP4369">${true}</camunda:inputParameter>
          <camunda:inputParameter name="PP4370">
            <camunda:map>
              <camunda:entry key="PP3913FuncionalColaborador">${PP3653}</camunda:entry>
              <camunda:entry key="codigoPP2751PP0573">${PP3289}</camunda:entry>
              <camunda:entry key="PP3053">${PP3350_reservada['PP3053']}</camunda:entry>
              <camunda:entry key="PP4229">${PP4229}</camunda:entry>
              <camunda:entry key="codigoDn">${PP3947['PP3521']}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:outputParameter name="PP4089">${PP3606.PP3665('PP4368_resposta')['codigoRetorno']}</camunda:outputParameter>
          <camunda:outputParameter name="mensagem">${PP3606.PP3665('PP4368_resposta')['mensagem']}</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1462</bpmn:incoming>
      <bpmn:outgoing>PP1647</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:exclusivePP2253 id="PP2379" PP3476="PP1326">
      <bpmn:incoming>PP1647</bpmn:incoming>
      <bpmn:outgoing>PP1909</bpmn:outgoing>
      <bpmn:outgoing>PP1326</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:intermediateThrowEvent id="PP1191">
      <bpmn:extensionElements>
        <PP3194 PP3601="start">
          <camunda:PP4199 PP4199Format="groovy">PP3606.PP4250("PP4090", true); PP3606.PP4250("PP3865", "Número PP2751 PP0576 Inválido"+" "+mensagem);</camunda:PP4199>
        </PP3194>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3865">
            <camunda:map>
              <camunda:entry key="PP3865">${PP3865}</camunda:entry>
            </camunda:map>
          </camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1326</bpmn:incoming>
      <bpmn:incoming>PP1688</bpmn:incoming>
      <bpmn:outgoing>PP1715</bpmn:outgoing>
    </bpmn:intermediateThrowEvent>
    <bpmn:PP3162 id="PP1128" attachedToRef="PP4377">
      <bpmn:outgoing>PP1688</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0859" />
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1334" sourceRef="PP2413" targetRef="PP2303" />
    <bpmn:sequenceFlow id="PP1462" sourceRef="PP2413" targetRef="PP4377">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3289 != null &amp;&amp; PP3289 != 'null' &amp;&amp; PP3289 != ''}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1909" sourceRef="PP2379" targetRef="PP2303">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP4089 == "0"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1647" sourceRef="PP4377" targetRef="PP2379" />
    <bpmn:sequenceFlow id="PP1326" sourceRef="PP2379" targetRef="PP1191" />
    <bpmn:sequenceFlow id="PP1688" sourceRef="PP1128" targetRef="PP1191" />
    <bpmn:exclusivePP2253 id="PP2427">
      <bpmn:incoming>PP2198</bpmn:incoming>
      <bpmn:outgoing>PP2181</bpmn:outgoing>
      <bpmn:outgoing>PP2049</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:exclusivePP2253 id="PP2280" PP3476="PP2134">
      <bpmn:incoming>PP1570</bpmn:incoming>
      <bpmn:incoming>PP2015</bpmn:incoming>
      <bpmn:outgoing>PP2134</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP2134" sourceRef="PP2280" targetRef="PP4074" />
    <bpmn:intermediateThrowEvent id="PP1047" name="PP2871">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3156">${false}</camunda:outputParameter>
        </camunda:PP3789>
        <PP3194 PP3601="start">
          <camunda:PP4199 PP4199Format="groovy">PP3606.PP4250("PP3735", "");</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2181</bpmn:incoming>
      <bpmn:outgoing>PP2015</bpmn:outgoing>
    </bpmn:intermediateThrowEvent>
    <bpmn:sequenceFlow id="PP2181" sourceRef="PP2427" targetRef="PP1047">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP3289') &amp;&amp; PP3289 != null &amp;&amp; PP3289 != 'null' &amp;&amp; PP3289 != ''}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP2015" sourceRef="PP1047" targetRef="PP2280" />
    <bpmn:sequenceFlow id="PP1280" sourceRef="PP2422" targetRef="PP2274" />
    <bpmn:servicePP2865 id="PP3497" name="PP0739" isForCompensation="true" camunda:type="external" PP3199="PP3495">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3394">${PP3394}</camunda:inputParameter>
          <camunda:inputParameter name="PP3350">${PP3350}</camunda:inputParameter>
          <camunda:inputParameter name="PP3053">${PP3053}</camunda:inputParameter>
          <camunda:inputParameter name="PP3753">${PP3753}</camunda:inputParameter>
          <camunda:inputParameter name="PP4330">004</camunda:inputParameter>
          <camunda:inputParameter name="PP4333">02</camunda:inputParameter>
          <camunda:inputParameter name="PP4334">F</camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1361" sourceRef="PP4135" targetRef="PP4080" />
    <bpmn:callActivity id="PP4135" name="PP2779" PP3189="PP4134">
      <bpmn:extensionElements>
        <camunda:in PP3167="#{PP3759}" />
        <camunda:in source="PP3759" target="PP3759" />
        <camunda:in source="PP3753" target="PP3753" />
        <camunda:in source="PP3761" target="PP3761" />
        <camunda:in source="id_inquilino" target="id_inquilino" />
        <camunda:in source="intencao" target="intencao" />
        <camunda:in source="PP4481" target="PP4481" />
        <camunda:in source="PP4229" target="PP4229" />
        <camunda:in source="PP3916" target="PP3916" />
        <camunda:in source="PP3053" target="PP3053" />
        <camunda:out source="PP3350_reservada" target="PP3350_reservada" />
        <camunda:in source="PP3636" target="PP3636" />
        <camunda:in source="PP3383" target="PP3383" />
        <camunda:out source="PP3053" target="PP3053" />
        <camunda:out source="PP3350" target="PP3350" />
        <camunda:out source="PP3394" target="PP3394" />
        <camunda:out source="identificadorPP0155Extendida" target="identificadorPP0155Extendida" />
        <camunda:in source="PP3469" target="PP3469" />
        <camunda:in source="PP3471" target="PP3471" />
        <camunda:in source="PP3470" target="PP3470" />
        <camunda:in source="PP3467" target="PP3467" />
        <camunda:in source="PP3466" target="PP3466" />
        <camunda:in source="PP3468" target="PP3468" />
      </bpmn:extensionElements>
      <bpmn:incoming>PP1517</bpmn:incoming>
      <bpmn:outgoing>PP1361</bpmn:outgoing>
    </bpmn:callActivity>
    <bpmn:PP3162 id="PP1120" attachedToRef="PP4135">
      <bpmn:compensateEventDefinition id="PP0641" />
    </bpmn:PP3162>
    <bpmn:userPP2865 id="PP3046" name="PP0033">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3911" type="domain" PP3476Value="${PP3947[&#39;PP3911&#39;]}" />
          <PP3196 id="PP4412" type="domain" PP3476Value="${PP3947[&#39;PP4412&#39;]}" />
          <PP3196 id="PP3799" type="domain" PP3476Value="${PP3606.hasVariable(&#34;PP3799&#34;) ? PP3799 : false}">
            <camunda:properties />
            <camunda:validation />
          </PP3196>
          <PP3196 id="PP3045" type="boolean">
            <camunda:validation />
          </PP3196>
          <PP3196 id="PP3043" type="string">
            <camunda:validation />
          </PP3196>
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP4460" type="domain" PP3476Value="continuar" />
          <PP3196 id="PP3842" type="domain" PP3476Value="${PP3606.hasVariable(&#39;PP3833rotativo_credito_v3_aberturaPP3365_resposta&#39;) ?&#10;PP3833rotativo_credito_v3_aberturaPP3365_resposta[&#39;valor_lis_pre_PP3079do&#39;] : null}" />
          <PP3196 id="PP3841" type="domain" PP3476Value="${PP3606.hasVariable(&#39;PP3833rotativo_credito_v3_aberturaPP3365_resposta&#39;) ?&#10;PP3833rotativo_credito_v3_aberturaPP3365_resposta[&#39;PP4393&#39;] : null}" />
        </camunda:formData>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3600">PP3046</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1835</bpmn:incoming>
      <bpmn:incoming>PP1368</bpmn:incoming>
      <bpmn:incoming>PP1534</bpmn:incoming>
      <bpmn:outgoing>PP1560</bpmn:outgoing>
      <bpmn:outgoing>PP1669</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:servicePP2865 id="PP4062" name="PP2741" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">3</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3045">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3045">false</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1778</bpmn:incoming>
      <bpmn:outgoing>PP1817</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:intermediateThrowEvent id="PP1049" name="PP0567">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:outputParameter name="PP4274">3</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1817</bpmn:incoming>
      <bpmn:linkEventDefinition id="PP2553" name="PP3207" />
    </bpmn:intermediateThrowEvent>
    <bpmn:PP3162 id="PP1154" attachedToRef="PP3046">
      <bpmn:outgoing>PP1778</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2926">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1778" sourceRef="PP1154" targetRef="PP4062" />
    <bpmn:sequenceFlow id="PP1817" sourceRef="PP4062" targetRef="PP1049" />
    <bpmn:sequenceFlow id="PP1835" sourceRef="PP2370" targetRef="PP3046" />
    <bpmn:sequenceFlow id="PP1560" name="PP4460" sourceRef="PP3046" targetRef="PP3298">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4460') &amp;&amp; PP4460=="PP3298"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP2069" name="Não" sourceRef="PP2257" targetRef="PP1018">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable("PP3365_pagadoras")&amp;&amp;PP3365_pagadoras[0]==null}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:intermediateThrowEvent id="PP3745" name="PP2506">
      <bpmn:extensionElements>
        <PP3194 PP3601="start">
          <camunda:PP4199 PP4199Format="groovy">PP3606.PP4250('PP3785',true)</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1283</bpmn:incoming>
      <bpmn:outgoing>PP1653</bpmn:outgoing>
    </bpmn:intermediateThrowEvent>
    <bpmn:subPP2714 id="PP0092" name="PP0552" PP4353>
      <bpmn:endEvent id="PP1029">
        <bpmn:incoming>PP1485</bpmn:incoming>
      </bpmn:endEvent>
      <bpmn:startEvent id="PP3746" name="PP2507" isInterrupting="false">
        <bpmn:extensionElements>
          <PP3194 PP3601="start">
            <camunda:PP4199 PP4199Format="groovy">import static net.logstash.logPP3123.argument.StructuredArguments.valueimport org.slf4j.Loggerimport org.slf4j.LoggerFactoryimport java.PP4318.Instantimport java.PP4318.Durationfinal Logger logger = LoggerFactory.getLogger("etgerirPP4179bacen")logger.info("PP4169 do cadastro",value("PP3759" , PP3606.PP3665("PP3759")),value("PP3753" , PP3606.PP3665("PP3753")),value("correlationId" , PP3606.PP3665("PP4481")),)PP3606.removeVariable('PP3785')</camunda:PP4199>
          </PP3194>
        </bpmn:extensionElements>
        <bpmn:outgoing>PP1742</bpmn:outgoing>
        <bpmn:conditionalEventDefinition id="PP0645" camunda:PP4420Name="PP3785">
          <bpmn:condition xsi:type="bpmn:tFormalExpression">${PP3785}</bpmn:condition>
        </bpmn:conditionalEventDefinition>
      </bpmn:startEvent>
      <bpmn:servicePP2865 id="PP3176" name="PP0533" camunda:type="external" PP3199="PP3172">
        <bpmn:documentation>Link Git --&gt; PP3722</bpmn:documentation>
        <bpmn:extensionElements>
          <camunda:PP3789>
            <camunda:inputParameter name="PP3175">
              <camunda:map>
                <camunda:entry key="PP3524">${PP3753}</camunda:entry>
                <camunda:entry key="instituicaoFinanceira">001</camunda:entry>
                <camunda:entry key="PP3200Autorizacao">PP0538</camunda:entry>
                <camunda:entry key="tipoPP2691">F</camunda:entry>
                <camunda:entry key="autorizaConglomerado">S</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
            <camunda:inputParameter name="PP3174">${true}</camunda:inputParameter>
            <camunda:outputParameter name="PP3173">${PP3606.PP3665("PP3173")}</camunda:outputParameter>
            <camunda:outputParameter name="PP4183">${true}</camunda:outputParameter>
          </camunda:PP3789>
          <PP3194 PP3601="start">
            <camunda:PP4199 PP4199Format="groovy">def tentativa = PP3606.hasVariable("tentativa_cadastro") ? PP3606.PP3665("tentativa_cadastro") : 0tentativa = tentativa + 1PP3606.PP4250("tentativa_cadastro", tentativa)</camunda:PP4199>
          </PP3194>
        </bpmn:extensionElements>
        <bpmn:incoming>PP1742</bpmn:incoming>
        <bpmn:incoming>PP1811</bpmn:incoming>
        <bpmn:outgoing>PP1525</bpmn:outgoing>
      </bpmn:servicePP2865>
      <bpmn:servicePP2865 id="PP3090" name="PP0199" PP3193="#{PP3106}">
        <bpmn:extensionElements>
          <camunda:PP3789>
            <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
            <camunda:inputParameter name="PP3875">
              <camunda:map>
                <camunda:entry key="PP4183">$</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
            <camunda:inputParameter name="PP3417">
              <camunda:map>
                <camunda:entry key="PP4183">${PP4183}</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
          </camunda:PP3789>
        </bpmn:extensionElements>
        <bpmn:incoming>PP1525</bpmn:incoming>
        <bpmn:incoming>PP1723</bpmn:incoming>
        <bpmn:outgoing>PP1485</bpmn:outgoing>
      </bpmn:servicePP2865>
      <bpmn:exclusivePP2253 id="PP2402" PP3476="PP1992">
        <bpmn:incoming>PP2118</bpmn:incoming>
        <bpmn:outgoing>PP1811</bpmn:outgoing>
        <bpmn:outgoing>PP1992</bpmn:outgoing>
      </bpmn:exclusivePP2253>
      <bpmn:intermediateThrowEvent id="PP1069" name="PP3928">
        <bpmn:extensionElements>
          <camunda:PP3789>
            <camunda:outputParameter name="PP4183">${false}</camunda:outputParameter>
          </camunda:PP3789>
        </bpmn:extensionElements>
        <bpmn:incoming>PP1992</bpmn:incoming>
        <bpmn:outgoing>PP1723</bpmn:outgoing>
      </bpmn:intermediateThrowEvent>
      <bpmn:PP3162 id="PP0921" attachedToRef="PP3176">
        <bpmn:outgoing>PP2118</bpmn:outgoing>
        <bpmn:errorEventDefinition id="PP0837" />
      </bpmn:PP3162>
      <bpmn:sequenceFlow id="PP1485" sourceRef="PP3090" targetRef="PP1029" />
      <bpmn:sequenceFlow id="PP1742" sourceRef="PP3746" targetRef="PP3176" />
      <bpmn:sequenceFlow id="PP1811" name="PP4132" sourceRef="PP2402" targetRef="PP3176">
        <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${tentativa_cadastro&lt;=3}</bpmn:conditionExpression>
      </bpmn:sequenceFlow>
      <bpmn:sequenceFlow id="PP1525" sourceRef="PP3176" targetRef="PP3090" />
      <bpmn:sequenceFlow id="PP1723" sourceRef="PP1069" targetRef="PP3090" />
      <bpmn:sequenceFlow id="PP2118" sourceRef="PP0921" targetRef="PP2402" />
      <bpmn:sequenceFlow id="PP1992" sourceRef="PP2402" targetRef="PP1069" />
    </bpmn:subPP2714>
    <bpmn:exclusivePP2253 id="PP2261" PP3476="PP1530">
      <bpmn:incoming>PP2093</bpmn:incoming>
      <bpmn:incoming>PP1633</bpmn:incoming>
      <bpmn:outgoing>PP1530</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:servicePP2865 id="PP3544" name="PP3019" camunda:type="external" PP3199="PP2524">
      <bpmn:documentation>PP3803Link Git --&gt; PP3718</bpmn:documentation>
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3757">PP3035</camunda:inputParameter>
          <camunda:inputParameter name="banco">341</camunda:inputParameter>
          <camunda:inputParameter name="PP4405">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP3278">NUMPROP</camunda:inputParameter>
          <camunda:inputParameter name="PP3740">${PP4171['identificador_di4']}</camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2039</bpmn:incoming>
      <bpmn:incoming>PP2196</bpmn:incoming>
      <bpmn:outgoing>PP1491</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:servicePP2865 id="PP4075" name="PP0193" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">2</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP4171">$</camunda:entry>
              <camunda:entry key="identificador_di4">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP4171">${PP4171}</camunda:entry>
              <camunda:entry key="identificador_di4">${identificador_di4}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1491</bpmn:incoming>
      <bpmn:outgoing>PP1385</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:endEvent id="PP1003">
      <bpmn:incoming>PP1385</bpmn:incoming>
      <bpmn:incoming>PP1858</bpmn:incoming>
      <bpmn:terminateEventDefinition id="PP2879" />
    </bpmn:endEvent>
    <bpmn:servicePP2865 id="PP3539" name="PP3017" PP3191="true" camunda:type="external" PP3199="PP2524">
      <bpmn:documentation>PP3803Link Git --&gt; PP3718</bpmn:documentation>
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3757">PP3035</camunda:inputParameter>
          <camunda:inputParameter name="banco">341</camunda:inputParameter>
          <camunda:inputParameter name="PP4405">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP3278">NUMPROP</camunda:inputParameter>
          <camunda:inputParameter name="PP3740">${PP3740_di_di4}</camunda:inputParameter>
        </camunda:PP3789>
        <camunda:PP3621RetryTimeCycle>R5/PT15M</camunda:PP3621RetryTimeCycle>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2226</bpmn:incoming>
      <bpmn:outgoing>PP1847</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:exclusivePP2253 id="PP2417" PP3476="PP2039">
      <bpmn:incoming>PP1416</bpmn:incoming>
      <bpmn:incoming>PP1291</bpmn:incoming>
      <bpmn:outgoing>PP2039</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:parallelPP2253 id="PP2348" PP3191="true">
      <bpmn:incoming>PP2202</bpmn:incoming>
      <bpmn:outgoing>PP2226</bpmn:outgoing>
      <bpmn:outgoing>PP1390</bpmn:outgoing>
    </bpmn:parallelPP2253>
    <bpmn:servicePP2865 id="PP3540" name="PP3018" PP3191="true" camunda:type="external" PP3199="PP2524">
      <bpmn:documentation>PP3803Link Git --&gt; PP3718</bpmn:documentation>
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3757">PP3035</camunda:inputParameter>
          <camunda:inputParameter name="banco">341</camunda:inputParameter>
          <camunda:inputParameter name="PP4405">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP3278">NUMPROP</camunda:inputParameter>
          <camunda:inputParameter name="PP3740">${PP3740_selfie_di4}</camunda:inputParameter>
        </camunda:PP3789>
        <camunda:PP3621RetryTimeCycle>R5/PT15M</camunda:PP3621RetryTimeCycle>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1390</bpmn:incoming>
      <bpmn:outgoing>PP1609</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:parallelPP2253 id="PP2372" PP3191="true">
      <bpmn:incoming>PP1847</bpmn:incoming>
      <bpmn:incoming>PP1609</bpmn:incoming>
      <bpmn:outgoing>PP1291</bpmn:outgoing>
    </bpmn:parallelPP2253>
    <bpmn:intermediateCatchEvent id="PP1156" name="PP0159">
      <bpmn:incoming>PP1862</bpmn:incoming>
      <bpmn:outgoing>PP2202</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2917">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">PT10S</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:intermediateCatchEvent>
    <bpmn:exclusivePP2253 id="PP2298" name="PP2709" PP3476="PP1416">
      <bpmn:incoming>PP1530</bpmn:incoming>
      <bpmn:outgoing>PP1416</bpmn:outgoing>
      <bpmn:outgoing>PP1862</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:exclusivePP2253 id="PP2434" name="PP2758" PP3476="PP1445">
      <bpmn:incoming>PP1801</bpmn:incoming>
      <bpmn:outgoing>PP1343</bpmn:outgoing>
      <bpmn:outgoing>PP1445</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:intermediateCatchEvent id="PP1074" name="15s">
      <bpmn:documentation>PP2710</bpmn:documentation>
      <bpmn:incoming>PP1887</bpmn:incoming>
      <bpmn:outgoing>PP2196</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2907">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">PT15S</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:intermediateCatchEvent>
    <bpmn:PP3162 id="PP0965" attachedToRef="PP3544">
      <bpmn:outgoing>PP1887</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0821" errorRef="PP0881" />
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1530" sourceRef="PP2261" targetRef="PP2298" />
    <bpmn:sequenceFlow id="PP2039" sourceRef="PP2417" targetRef="PP3544" />
    <bpmn:sequenceFlow id="PP2196" sourceRef="PP1074" targetRef="PP3544" />
    <bpmn:sequenceFlow id="PP1491" sourceRef="PP3544" targetRef="PP4075" />
    <bpmn:sequenceFlow id="PP1385" sourceRef="PP4075" targetRef="PP1003" />
    <bpmn:sequenceFlow id="PP2226" sourceRef="PP2348" targetRef="PP3539" />
    <bpmn:sequenceFlow id="PP1847" sourceRef="PP3539" targetRef="PP2372" />
    <bpmn:sequenceFlow id="PP1416" name="Nao" sourceRef="PP2298" targetRef="PP2417" />
    <bpmn:sequenceFlow id="PP1291" sourceRef="PP2372" targetRef="PP2417" />
    <bpmn:sequenceFlow id="PP2202" sourceRef="PP1156" targetRef="PP2348" />
    <bpmn:sequenceFlow id="PP1390" sourceRef="PP2348" targetRef="PP3540" />
    <bpmn:sequenceFlow id="PP1609" sourceRef="PP3540" targetRef="PP2372" />
    <bpmn:sequenceFlow id="PP1862" name="Sim" sourceRef="PP2298" targetRef="PP1156">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable("PP4161") &amp;&amp; PP4161 == 'PP4469'}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1343" name="IP" sourceRef="PP2434" targetRef="PP3859">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4229') &amp;&amp; PP4229 == "4"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1887" sourceRef="PP0965" targetRef="PP1074" />
    <bpmn:servicePP2865 id="PP3113" name="PP0214" camunda:type="external" PP3199="PP3825">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP4459">
            <camunda:map>
              <camunda:entry key="PP3753">${PP3753}</camunda:entry>
              <camunda:entry key="PP4229">${PP4229}</camunda:entry>
              <camunda:entry key="PP3394">${PP3394}</camunda:entry>
              <camunda:entry key="PP3350">${PP3350}</camunda:entry>
              <camunda:entry key="PP3053">${PP3053}</camunda:entry>
              <camunda:entry key="PP3739">${PP3606.hasVariable("PP3926") ? PP3606.PP3665("PP3926") : PP4143}</camunda:entry>
              <camunda:entry key="id_origem">6</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1287</bpmn:incoming>
      <bpmn:outgoing>PP1854</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1854" sourceRef="PP3113" targetRef="PP3099" />
    <bpmn:PP4199PP2865 id="PP3056" name="PP0156" PP4199Format="groovy" camunda:resultVariable="efetivacao_inss">
      <bpmn:incoming>PP2205</bpmn:incoming>
      <bpmn:incoming>PP1365</bpmn:incoming>
      <bpmn:incoming>PP2157</bpmn:incoming>
      <bpmn:outgoing>PP1287</bpmn:outgoing>
      <bpmn:PP4199>['solicitado_PP3135':PP3606.hasVariable('PP3135') ? PP3606.PP3665('PP3135') : false,
 'PP3917':PP3606.hasVariable('PP3917') ? PP3606.PP3665('PP3917') : null,
 'autorizacao_PP3135':PP3606.hasVariable('PP4311') ? PP3606.PP3665('PP4311') : false,
 'datePP4318_autorizacao_PP3135':PP3606.hasVariable('PP4312') ? PP3606.PP3665('PP4312') : null,
 'validado_PP3135':PP3606.hasVariable('correlation_valiPP3394ao_inss'),
 'correlation_valiPP3394ao_inss':PP3606.hasVariable('correlation_valiPP3394ao_inss') ? PP3606.PP3665('correlation_valiPP3394ao_inss') : null,
 'efetivado_PP3135':PP3606.hasVariable('correlation_efetivacao_inss'),
 'correlation_efetivacao_inss':PP3606.hasVariable('correlation_efetivacao_inss') ? PP3606.PP3665('correlation_efetivacao_inss') : null,
 'PP3582':PP3606.hasVariable('PP3582') ? PP3606.PP3665('PP3582') : null</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:sequenceFlow id="PP1287" sourceRef="PP3056" targetRef="PP3113" />
    <bpmn:sequenceFlow id="PP1365" name="Não" sourceRef="PP2364" targetRef="PP3056" />
    <bpmn:sequenceFlow id="PP2157" sourceRef="PP3541" targetRef="PP3056" />
    <bpmn:PP3162 id="PP1103" name="PP0798" attachedToRef="PP4379">
      <bpmn:outgoing>PP1782</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0839" errorRef="PP0872" camunda:errorCodeVariable="codigo_erro_valida_PP3135" camunda:errorPP2588Variable="PP3865_valida_PP3135" />
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1782" sourceRef="PP1103" targetRef="PP4379" />
    <bpmn:PP3162 id="PP0933" attachedToRef="PP4379">
      <bpmn:outgoing>PP1425</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0819" camunda:errorCodeVariable="codigo_erro_valida_PP3135" camunda:errorPP2588Variable="PP3865_valida_PP3135" />
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1425" name="PP0803" sourceRef="PP0933" targetRef="PP2364" />
    <bpmn:servicePP2865 id="PP3598" name="PP0673" camunda:type="external" PP3199="efetivarChequeEspecial">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3543">${true}</camunda:inputParameter>
          <camunda:inputParameter name="PP4486">${PP3636}</camunda:inputParameter>
          <camunda:outputParameter name="PP4154">
            <camunda:map>
              <camunda:entry key="PP3758_rotativo">${PP3606.PP3665('PP3758_rotativo')}</camunda:entry>
              <camunda:entry key="descricao">${PP3606.PP3665('descricao')}</camunda:entry>
              <camunda:entry key="ndias">${PP3606.PP3665('ndias')}</camunda:entry>
              <camunda:entry key="tipo_PP4044">${PP3606.PP3665('tipo_PP4044')}</camunda:entry>
              <camunda:entry key="familia_PP4044">${PP3606.PP3665('familia_PP4044')}</camunda:entry>
              <camunda:entry key="data_contratacao">${PP3606.PP3665('data_contratacao')}</camunda:entry>
              <camunda:entry key="valor_PP3833">${PP3606.PP3665('valor_PP3833')}</camunda:entry>
              <camunda:entry key="valor_PP3833_adicional">${PP3606.PP3665('valor_PP3833_adicional')}</camunda:entry>
              <camunda:entry key="valor_total_PP3833s_contratados">${PP3606.PP3665('valor_total_PP3833s_contratados')}</camunda:entry>
              <camunda:entry key="iof">${PP3606.PP3665('iof')}</camunda:entry>
              <camunda:entry key="valor_total_operacao">${PP3606.PP3665('valor_total_operacao')}</camunda:entry>
              <camunda:entry key="data_PP4437_PP3376">${PP3606.PP3665('data_PP4437_PP3376')}</camunda:entry>
              <camunda:entry key="PP4300_moratorios">${PP3606.PP3665('PP4300_moratorios')}</camunda:entry>
              <camunda:entry key="periodiPP3242">${PP3606.PP3665('periodiPP3242')}</camunda:entry>
              <camunda:entry key="custo_efetivo_total_mensal">${PP3606.PP3665('custo_efetivo_total_mensal')}</camunda:entry>
              <camunda:entry key="custo_efetivo_total_anual">${PP3606.PP3665('custo_efetivo_total_anual')}</camunda:entry>
              <camunda:entry key="PP4300_mensal">${PP3606.PP3665('PP4300_mensal')}</camunda:entry>
              <camunda:entry key="PP4300_anual">${PP3606.PP3665('PP4300_anual')}</camunda:entry>
              <camunda:entry key="horario_operacao">${PP3606.PP3665('horario_operacao')}</camunda:entry>
              <camunda:entry key="data_operacao">${PP3606.PP3665('data_operacao')}</camunda:entry>
              <camunda:entry key="autenticacao_comprovante">${PP3606.PP3665('autenticacao_comprovante')}</camunda:entry>
              <camunda:entry key="dia_PP3991_encargos">${PP3606.PP3665('dia_PP3991_encargos')}</camunda:entry>
              <camunda:entry key="PP4331">${PP3606.PP3665('PP4331')}</camunda:entry>
              <camunda:entry key="indicador_fora_horario_online">${PP3606.PP3665('indicador_fora_horario_online')}</camunda:entry>
              <camunda:entry key="quantidade_dias_sem_juros">${PP3606.PP3665('quantidade_dias_sem_juros')}</camunda:entry>
              <camunda:entry key="percentual_valor_total_operacao">${PP3606.PP3665('percentual_valor_total_operacao')}</camunda:entry>
              <camunda:entry key="percentual_valor_PP4234">${PP3606.PP3665('percentual_valor_PP4234')}</camunda:entry>
              <camunda:entry key="percentual_valor_iof">${PP3606.PP3665('percentual_valor_iof')}</camunda:entry>
              <camunda:entry key="percentual_valor_PP3833">${PP3606.PP3665('percentual_valor_PP3833')}</camunda:entry>
            </camunda:map>
          </camunda:outputParameter>
        </camunda:PP3789>
        <PP3194 PP3601="start">
          <camunda:PP4199 PP4199Format="groovy">def tentativas_efetivacao_lis = PP3606.hasVariable('tentativas_efetivacao_lis') ? PP3606.PP3665('tentativas_efetivacao_lis') : 0; PP3606.PP4250('tentativas_efetivacao_lis', tentativas_efetivacao_lis + 1);</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1367</bpmn:incoming>
      <bpmn:outgoing>PP2031</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:exclusivePP2253 id="PP2381" name="PP0634" PP3476="PP1794">
      <bpmn:incoming>PP1628</bpmn:incoming>
      <bpmn:outgoing>PP1657</bpmn:outgoing>
      <bpmn:outgoing>PP1794</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:exclusivePP2253 id="PP2438" PP3476="PP2189">
      <bpmn:incoming>PP2031</bpmn:incoming>
      <bpmn:incoming>PP1657</bpmn:incoming>
      <bpmn:incoming>PP1540</bpmn:incoming>
      <bpmn:outgoing>PP2189</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:PP4199PP2865 id="PP3861" name="PP2582" PP4199Format="groovy">
      <bpmn:incoming>PP1803</bpmn:incoming>
      <bpmn:outgoing>PP1367</bpmn:outgoing>
      <bpmn:PP4199>def PP4421PP0664 = PP3606.PP3665('PP4144')
def PP3350 = PP4421PP0664.get("codigo_PP3350")
def PP3053 = PP4421PP0664.get("codigo_PP3053")
def PP3394 = PP4421PP0664.get("PP3394")
def PP3739 = PP3053 + PP3350 + PP3394
PP3606.PP4250("PP3739", PP3739)
def valorLimiteLis(){
      def valorLimite = null
if (PP3606.hasVariable("PP3833rotativo_credito_v3_aberturaPP3365_resposta") &amp;
    &amp;
    PP3606.PP3665("PP3833rotativo_credito_v3_aberturaPP3365_resposta") != null &amp;
    &amp;
    PP3606.PP3665('PP3833rotativo_credito_v3_aberturaPP3365_resposta') != ''){
      valorLimite = PP3606.PP3665("PP3833rotativo_credito_v3_aberturaPP3365_resposta")['valor_lis_pre_PP3079do'];
    }
else {
      valorLimite = PP3606.PP3665("response_PP3930R0")['valor_lis_pre_PP3079do'] }
return valorLimite.toString() }
def valor_PP3833 = valorLimiteLis()
def PP3376_lis = [:]
PP3376_lis.put("valor_PP3833", valor_PP3833)
PP3376_lis.put("PP3758_rotativo", PP3947['PP3271'])
PP3376_lis.put("PP4331", PP3947['PP4331'])
PP3376_lis.put("dia_PP3991_encargos", PP3947['PP3503'])
PP3376_lis.put("PP3251", PP3947['PP3251'])
PP3376_lis.put("PP4255", PP3947['PP4255'])
PP3376_lis.put("PP3971", PP3947['PP3971']) PP3376_lis.put("valor_PP3840_global", PP3947['PP3839'])
PP3376_lis.put("PP4329", PP3947['PP4329'])
PP3376_lis.put("PP3775", PP3947['PP3775'])
def builderPP0675PP0529 = new groovy.json.JsonBuilder()builderPP0675PP0529(PP3376_lis)
PP3606.PP4250("PP3376_lis", builderPP0675PP0529.toString())</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:intermediateCatchEvent id="PP0971" name="6h às 20h">
      <bpmn:incoming>PP1794</bpmn:incoming>
      <bpmn:incoming>PP1398</bpmn:incoming>
      <bpmn:outgoing>PP2038</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2924">
        <bpmn:PP4318Cycle xsi:type="bpmn:tFormalExpression">* * 6-19 ? * * *</bpmn:PP4318Cycle>
      </bpmn:PP4318rEventDefinition>
    </bpmn:intermediateCatchEvent>
    <bpmn:servicePP2865 id="PP3334" name="PP0655" camunda:type="external" PP3199="PP3331">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3739">004341${PP3053}${PP3350}${PP3394}</camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2038</bpmn:incoming>
      <bpmn:outgoing>PP1448</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:exclusivePP2253 id="PP2412" name="PP0667" PP3476="PP1803">
      <bpmn:incoming>PP1448</bpmn:incoming>
      <bpmn:outgoing>PP1803</bpmn:outgoing>
      <bpmn:outgoing>PP1451</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:intermediateThrowEvent id="PP0926" name="PP0666">
      <bpmn:incoming>PP1451</bpmn:incoming>
      <bpmn:linkEventDefinition id="PP2550" name="PP3362" />
    </bpmn:intermediateThrowEvent>
    <bpmn:exclusivePP2253 id="PP2360" name="PP2721" PP3476="PP1578">
      <bpmn:incoming>PP1673</bpmn:incoming>
      <bpmn:outgoing>PP1540</bpmn:outgoing>
      <bpmn:outgoing>PP1578</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:exclusivePP2253 id="PP2312" name="PP2619" PP3476="PP1337">
      <bpmn:incoming>PP1578</bpmn:incoming>
      <bpmn:outgoing>PP1300</bpmn:outgoing>
      <bpmn:outgoing>PP1337</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:userPP2865 id="PP4177" name="PP2790">
      <bpmn:incoming>PP1337</bpmn:incoming>
      <bpmn:incoming>PP2163</bpmn:incoming>
      <bpmn:outgoing>PP2163</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:intermediateCatchEvent id="PP1192" name="PP0160">
      <bpmn:incoming>PP1300</bpmn:incoming>
      <bpmn:outgoing>PP1398</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2947">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">P1D</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:intermediateCatchEvent>
    <bpmn:PP3162 id="PP0959" attachedToRef="PP3598">
      <bpmn:outgoing>PP1673</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0833" camunda:errorCodeVariable="codigo_erro_lis" camunda:errorPP2588Variable="PP3865_lis" />
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1367" sourceRef="PP3861" targetRef="PP3598" />
    <bpmn:sequenceFlow id="PP2031" sourceRef="PP3598" targetRef="PP2438" />
    <bpmn:sequenceFlow id="PP1657" name="Não" sourceRef="PP2381" targetRef="PP2438">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3947['PP3972'] == false}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1794" name="Sim" sourceRef="PP2381" targetRef="PP0971" />
    <bpmn:sequenceFlow id="PP1540" name="Sim" sourceRef="PP2360" targetRef="PP2438">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3865_lis.PP3350ins("PP3376 foi encontrado e está ativo")}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1398" sourceRef="PP1192" targetRef="PP0971" />
    <bpmn:sequenceFlow id="PP2038" sourceRef="PP0971" targetRef="PP3334" />
    <bpmn:sequenceFlow id="PP1448" sourceRef="PP3334" targetRef="PP2412" />
    <bpmn:sequenceFlow id="PP1803" name="Não" sourceRef="PP2412" targetRef="PP3861" />
    <bpmn:sequenceFlow id="PP1451" name="Sim" sourceRef="PP2412" targetRef="PP0926">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable("PP4142") &amp;&amp; (((PP4142[0].status_PP3560 == "B" || PP4142[0].status_PP3560 == "C") &amp;&amp; PP4142[0].codigo_fase_PP3560 == "8") || PP4142[0].status_PP3560 == "E")}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1673" sourceRef="PP0959" targetRef="PP2360" />
    <bpmn:sequenceFlow id="PP1578" name="Não" sourceRef="PP2360" targetRef="PP2312" />
    <bpmn:sequenceFlow id="PP1300" name="Não" sourceRef="PP2312" targetRef="PP1192">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${tentativas_efetivacao_lis &lt; 7}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1337" name="Sim" sourceRef="PP2312" targetRef="PP4177" />
    <bpmn:sequenceFlow id="PP2163" sourceRef="PP4177" targetRef="PP4177" />
    <bpmn:sequenceFlow id="PP2189" sourceRef="PP2438" targetRef="PP2327" />
    <bpmn:sequenceFlow id="PP1628" sourceRef="PP2296" targetRef="PP2381" />
    <bpmn:sequenceFlow id="PP1404" name="PP3004" sourceRef="PP3782" targetRef="PP3413">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4460') &amp;&amp; PP4460=="PP3413"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:PP3162 id="PP1087" attachedToRef="PP3067">
      <bpmn:outgoing>PP1528</bpmn:outgoing>
      <bpmn:conditionalEventDefinition id="PP0647">
        <bpmn:condition xsi:type="bpmn:tFormalExpression">${analise_de_pld.situacao_processamento == 'SUCESSO'}</bpmn:condition>
      </bpmn:conditionalEventDefinition>
    </bpmn:PP3162>
    <bpmn:PP4199PP2865 id="PP3887" name="PP2615" PP4199Format="groovy">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3281">${(PP3606.hasVariable("PP3926") &amp;&amp; PP3926 != null &amp;&amp; PP3926 != 'null' &amp;&amp; PP3926 != '' ) ? PP3606.PP3665("PP3926") : PP4143}</camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1701</bpmn:incoming>
      <bpmn:outgoing>PP2125</bpmn:outgoing>
      <bpmn:PP4199>// Criação do id_analise que deve ser enviado para PP2682 (PP3934/PP3545) def PP3281 = PP3606.PP3665('PP3281') PP3606.PP4250("PP4421_especificas",[["PP3281": PP3281,"codigo_PP3200": PP3606.PP3665('codigo_PP3200'),"codigo_origem_PP4048": null]])</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:sequenceFlow id="PP2125" sourceRef="PP3887" targetRef="PP3933" />
    <bpmn:servicePP2865 id="PP3933" name="PP3026" camunda:type="external" PP3199="PP3843">
      <bpmn:documentation>PP3812 PP3705Link Git --&gt; PP3723</bpmn:documentation>
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3847">
            <camunda:map>
              <camunda:entry key="PP3282">${PP3753}</camunda:entry>
              <camunda:entry key="PP3282_PP4305rario">${PP3761}</camunda:entry>
              <camunda:entry key="PP3282_inquilino">${id_inquilino}</camunda:entry>
              <camunda:entry key="codigo_solicitacao_PP3819">${PP3606.PP3665('id_solicitacao_efetivacao_PP3833')}</camunda:entry>
              <camunda:entry key="codigo_familia_PP4044">28340</camunda:entry>
              <camunda:entry key="PP3288_PP3969">001</camunda:entry>
              <camunda:entry key="PP4421_especificas">${PP4421_especificas}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3845">
            <camunda:map>
              <camunda:entry key="PP4484">PP1236</camunda:entry>
              <camunda:entry key="PP4477">PP3626</camunda:entry>
              <camunda:entry key="PP4485">PP0031</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3846">${true}</camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2125</bpmn:incoming>
      <bpmn:outgoing>PP1454</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP3162 id="PP1005" attachedToRef="PP3933">
      <bpmn:outgoing>PP2159</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0822" errorRef="PP0881" />
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1454" sourceRef="PP3933" targetRef="PP2345" />
    <bpmn:sequenceFlow id="PP2159" sourceRef="PP1005" targetRef="PP2440" />
    <bpmn:servicePP2865 id="PP3510" name="PP3013" camunda:modelerTemplate="PP3966" camunda:modelerTemplateVersion="1" PP3476="PP1994" PP3191="true" PP3193="${operacaoPostDelegate}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3668">{"PP4478":"PP0005", "PP4483": "PP0007", "PP4481": "PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"PP4478":"PP0008", "PP4483": "PP0007", "PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3670">{"PP4478":"PP0009", "PP4483":"PP0007", "PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="urlDev">PP3712</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">PP3716</camunda:inputParameter>
          <camunda:inputParameter name="bodyDev">{"PP3753": "${PP3753}", "PP3635": "${PP3635}", "sub_PP3635": "${PP4279}","PP3567":[{"id":"PP3053","valor": "${PP3053_logada}"}]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3158">{"PP3753": "${PP3753}","PP3635": "${PP3635}","sub_PP3635": "${PP4279}","PP3567":[{"id":"PP3053","valor": "${PP3053_logada}"}]}</camunda:inputParameter>
          <camunda:inputParameter name="bodyProd">{"PP3753": "${PP3753}","PP3635": "${PP3635}","sub_PP3635": "${PP4279}","PP3567":[{"id":"PP3053","valor": "${PP3053_logada}"}]}</camunda:inputParameter>
          <camunda:inputParameter name="PP4363"> PP3714</camunda:inputParameter>
          <camunda:outputParameter name="PP4152">${S(response)}</camunda:outputParameter>
        </camunda:PP3789>
        <camunda:field name="withError">
          <PP3195>true</PP3195>
        </camunda:field>
        <camunda:field name="PP3585">
          <camunda:string>erro_PP3510</camunda:string>
        </camunda:field>
        <camunda:field name="PP4317">
          <PP3195>${statusCode != 200}</PP3195>
        </camunda:field>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1973</bpmn:incoming>
      <bpmn:outgoing>PP1994</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP4199PP2865 id="PP3107" name="PP0209" PP3476="PP1871" PP3191="true" PP4199Format="groovy">
      <bpmn:incoming>PP1994</bpmn:incoming>
      <bpmn:incoming>PP1324</bpmn:incoming>
      <bpmn:incoming>PP1310</bpmn:incoming>
      <bpmn:incoming>PP2053</bpmn:incoming>
      <bpmn:outgoing>PP1871</bpmn:outgoing>
      <bpmn:PP4199>def jsonSlurperClassic = new groovy.json.JsonSlurperClassic();
    PP3606.PP4250("PP4152_json", jsonSlurperClassic.parseText(PP4152.toString()))
PP3606.PP4250("PP4152_json",PP4152_json)
if (PP3606.hasVariable("PP4152") &amp;
    &amp;
    PP4152 != null &amp;
    &amp;
    PP4152?.toString() != "{
      }") {
      def PP4229= PP4152_json.PP4229.PP3272 PP3606.PP4250("PP4229", PP4229)
def PP3135 = PP4152_json.inss.beneficioPP3606.PP4250("PP3135",PP3135)
if (PP3135 == true) {
      def PP3917 = PP4152_json.inss.PP3736 PP3606.PP4250("PP3917",PP3917)
PP3606.PP4250("PP3917",null1l) }
def PP4233 = PP4152_json.PP4229.PP4233 PP3606.PP4250("PP4233", PP4233)
def PP3547 = PP4152_json.PP3547.PP3547PP3606.PP4250("PP3547", PP3547)
if (PP3547 == false)
def PP3890 = PP4152_json.PP3547.PP3890 PP3606.PP4250("PP3890", PP3890)
def PP4159 = PP4152_json.PP3547.PP4159PP3606.PP4250("PP4159", PP4159)
def PP3865 = PP4152_json.PP3865PP3606.PP4250("PP3865", PP3865)}
def PP3757_bacen = PP4152_json.bacen?.PP3757 PP3606.PP4250("PP3757_bacen",PP3757_bacen)
if (PP3757_bacen == null) {
      PP3606.PP4250("PP3890", "")
PP3606.PP4250("PP4159", "")
PP3606.PP4250("PP3865", "")}}
else {
      PP3606.PP4250("PP3135",false)
PP3606.PP4250("PP3917",null)
PP3606.PP4250("PP3547", false)}
    PP3606.PP4250("nome_receita_federal", "NAO INFORMPP0014O")</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:PP3162 id="PP0931" attachedToRef="PP3510">
      <bpmn:outgoing>PP1324</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0855" />
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1994" sourceRef="PP3510" targetRef="PP3107" />
    <bpmn:sequenceFlow id="PP1324" sourceRef="PP0931" targetRef="PP3107" />
    <bpmn:sequenceFlow id="PP1748" sourceRef="PP4204" targetRef="PP2272" />
    <bpmn:exclusivePP2253 id="PP2292" name="PP0633" PP3476="PP2059">
      <bpmn:incoming>PP1883</bpmn:incoming>
      <bpmn:incoming>PP1412</bpmn:incoming>
      <bpmn:outgoing>PP2059</bpmn:outgoing>
      <bpmn:outgoing>PP1519</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP2059" sourceRef="PP2292" targetRef="PP2352">
      <bpmn:extensionElements>
        <PP3194 PP3601="take">
          <camunda:PP4199 PP4199Format="groovy">PP3606.PP4250("PP3637","false") ;</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1519" sourceRef="PP2292" targetRef="PP3335">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4355') &amp;&amp; PP4355 == true}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:exclusivePP2253 id="PP2425" name="PP2829" PP3476="PP1641">
      <bpmn:incoming>PP1442</bpmn:incoming>
      <bpmn:incoming>PP2047</bpmn:incoming>
      <bpmn:incoming>PP1873</bpmn:incoming>
      <bpmn:outgoing>PP1641</bpmn:outgoing>
      <bpmn:outgoing>PP1850</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:userPP2865 id="PP4232" name="PP2831">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
        </camunda:formData>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1641</bpmn:incoming>
      <bpmn:outgoing>PP1799</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:endEvent id="PP1134">
      <bpmn:incoming>PP1383</bpmn:incoming>
      <bpmn:terminateEventDefinition id="PP2881" />
    </bpmn:endEvent>
    <bpmn:servicePP2865 id="PP3513" name="PP0200" PP3476="PP1283" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">1</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP4113">$</camunda:entry>
              <camunda:entry key="vinculo_selecionado">$</camunda:entry>
              <camunda:entry key="PP3329r_vinculos">$</camunda:entry>
              <camunda:entry key="PP3636">$</camunda:entry>
              <camunda:entry key="PP3383">$</camunda:entry>
              <camunda:entry key="PP3753">$</camunda:entry>
              <camunda:entry key="PP3135">$</camunda:entry>
              <camunda:entry key="PP3917">$</camunda:entry>
              <camunda:entry key="PP3637">$</camunda:entry>
              <camunda:entry key="PP4152_json">$</camunda:entry>
              <camunda:entry key="PP4229">$</camunda:entry>
              <camunda:entry key="troca_PP3350">$</camunda:entry>
              <camunda:entry key="nome_receita_federal">$</camunda:entry>
              <camunda:entry key="PP3547">$</camunda:entry>
              <camunda:entry key="PP4278">$</camunda:entry>
              <camunda:entry key="PP4231">$</camunda:entry>
              <camunda:entry key="tipo_doc_comprovante">$</camunda:entry>
              <camunda:entry key="PP3574">$</camunda:entry>
              <camunda:entry key="PP4266">$</camunda:entry>
              <camunda:entry key="PP3383_representante">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP4113">${PP3606.hasVariable('PP4113') ? PP4113 : false}</camunda:entry>
              <camunda:entry key="vinculo_selecionado">${PP3606.hasVariable('vinculo_selecionado') ? vinculo_selecionado : null}</camunda:entry>
              <camunda:entry key="PP3329r_vinculos">${PP3606.hasVariable('PP3329r_vinculos') ? PP3329r_vinculos : false}</camunda:entry>
              <camunda:entry key="PP3636">${PP3636}</camunda:entry>
              <camunda:entry key="PP3383">${PP3383}</camunda:entry>
              <camunda:entry key="PP3753">${PP3753}</camunda:entry>
              <camunda:entry key="PP3135">${PP3606.hasVariable('PP3135') ? PP3135: false}</camunda:entry>
              <camunda:entry key="PP3917">${PP3606.hasVariable('PP3917') ? PP3917: null}</camunda:entry>
              <camunda:entry key="PP3637">${PP3637}</camunda:entry>
              <camunda:entry key="PP4152_json">${PP3606.hasVariable('PP4152_json') ? PP4152_json : null}</camunda:entry>
              <camunda:entry key="PP4229">${PP4229}</camunda:entry>
              <camunda:entry key="troca_PP3350">${PP3606.hasVariable('PP4354') ? PP4354: false}</camunda:entry>
              <camunda:entry key="nome_receita_federal">${PP3606.PP3665('nome_receita_federal')}</camunda:entry>
              <camunda:entry key="PP3547">${PP3547}</camunda:entry>
              <camunda:entry key="PP4278">${PP4278}</camunda:entry>
              <camunda:entry key="PP4231">${PP4231}</camunda:entry>
              <camunda:entry key="tipo_doc_comprovante">${PP3606.hasVariable('tipo_doc_comprovante') ? tipo_doc_comprovante: false}</camunda:entry>
              <camunda:entry key="PP3574">${PP3606.hasVariable('PP3574') ? PP3574: false}</camunda:entry>
              <camunda:entry key="PP4266">${PP4266}</camunda:entry>
              <camunda:entry key="PP3383_representante">${PP3606.hasVariable('PP3383_representante') ? PP3383_representante: "null"}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1850</bpmn:incoming>
      <bpmn:outgoing>PP1283</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP3162 id="PP1022" attachedToRef="PP4232">
      <bpmn:outgoing>PP1660</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2915">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">PT3M</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1641" name="Não" sourceRef="PP2425" targetRef="PP4232" />
    <bpmn:sequenceFlow id="PP1850" sourceRef="PP2425" targetRef="PP3513">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${(PP3606.hasVariable('PP4229') &amp;&amp; (PP4229 == "3" || PP4229=="L" || PP4229=="1" || PP4229=="4"))}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1799" sourceRef="PP4232" targetRef="PP3105" />
    <bpmn:sequenceFlow id="PP1660" sourceRef="PP1022" targetRef="PP3105" />
    <bpmn:sequenceFlow id="PP1677" sourceRef="PP1219" targetRef="PP2352" />
    <bpmn:subPP2714 id="PP0058" name="PP3001">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="mapempty">
            <camunda:map />
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1550</bpmn:incoming>
      <bpmn:outgoing>PP2179</bpmn:outgoing>
      <bpmn:startEvent id="PP1012">
        <bpmn:outgoing>PP2000</bpmn:outgoing>
      </bpmn:startEvent>
      <bpmn:exclusivePP2253 id="PP2300" name="PP2753" PP3476="PP1336">
        <bpmn:incoming>PP2000</bpmn:incoming>
        <bpmn:outgoing>PP1336</bpmn:outgoing>
        <bpmn:outgoing>PP1478</bpmn:outgoing>
      </bpmn:exclusivePP2253>
      <bpmn:exclusivePP2253 id="PP2320" PP3476="PP1414">
        <bpmn:incoming>PP1336</bpmn:incoming>
        <bpmn:incoming>PP2117</bpmn:incoming>
        <bpmn:incoming>PP1793</bpmn:incoming>
        <bpmn:outgoing>PP1414</bpmn:outgoing>
      </bpmn:exclusivePP2253>
      <bpmn:servicePP2865 id="PP4451" name="PP3000" camunda:type="external" PP3199="PP4445">
        <bpmn:extensionElements>
          <camunda:PP3789>
            <camunda:inputParameter name="PP4447">${true}</camunda:inputParameter>
            <camunda:inputParameter name="PP4448">
              <camunda:map>
                <camunda:entry key="PP3913PP0155">${PP3350_reservada['PP3053']}</camunda:entry>
                <camunda:entry key="PP3913PP0664Corrente">${PP3350_reservada['PP3350']}</camunda:entry>
                <camunda:entry key="PP3913DigitoVerificadorPP0664Corrente">${PP3350_reservada['PP3394']}</camunda:entry>
                <camunda:entry key="PP3913SequenciaTitularPP0664Corrente">1</camunda:entry>
                <camunda:entry key="codigoIdentificacaoPP2691">${PP3753}</camunda:entry>
                <camunda:entry key="codigoPP0565origem">${codigo_PP3200}</camunda:entry>
                <camunda:entry key="codigoPP2751PP0573">${PP3289}</camunda:entry>
                <camunda:entry key="PP3383Cnpj">${PP3383}</camunda:entry>
                <camunda:entry key="codigoTipoFuncionalidadePP0573">M</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
            <camunda:outputParameter name="PP4446">${PP3606.PP3665("PP4446")}</camunda:outputParameter>
          </camunda:PP3789>
        </bpmn:extensionElements>
        <bpmn:incoming>PP1386</bpmn:incoming>
        <bpmn:outgoing>PP1630</bpmn:outgoing>
      </bpmn:servicePP2865>
      <bpmn:exclusivePP2253 id="PP2355" PP3476="PP1741">
        <bpmn:incoming>PP1630</bpmn:incoming>
        <bpmn:outgoing>PP2101</bpmn:outgoing>
        <bpmn:outgoing>PP1741</bpmn:outgoing>
        <bpmn:outgoing>PP1614</bpmn:outgoing>
      </bpmn:exclusivePP2253>
      <bpmn:userPP2865 id="PP3584" name="PP0799" PP3476="PP1348" PP3191="true">
        <bpmn:documentation>PP2651</bpmn:documentation>
        <bpmn:extensionElements>
          <camunda:formData>
            <PP3196 id="PP4452" label="PP0227 Error Code" type="string" PP3476Value="${PP3606.PP3665(&#34;PP4452&#34;) != null ? PP3606.PP3665(&#34;PP4452&#34;) : &#34;&#34;}">
              <camunda:validation>
                <camunda:constraint name="readonly" />
              </camunda:validation>
            </PP3196>
            <PP3196 id="PP4453" label="PP0227 Error PP2588" type="string" PP3476Value="${PP3606.PP3665(&#34;PP4453&#34;) != null ? PP3606.PP3665(&#34;PP4453&#34;) : &#34;&#34;}">
              <camunda:validation>
                <camunda:constraint name="readonly" />
              </camunda:validation>
            </PP3196>
            <PP3196 id="PP3772" label="PP3772" type="string" PP3476Value="${PP3606.hasVariable(&#34;PP4446&#34;) ?&#10;PP3606.PP3665(&#34;PP4446&#34;)[&#34;controlArea&#34;][&#34;areaStat&#34;][&#34;indStatPro&#10;&#10;&#10;c&#34;] : null}">
              <camunda:validation>
                <camunda:constraint name="readonly" />
              </camunda:validation>
            </PP3196>
            <PP3196 id="PP3771" label="PP3771" type="string" PP3476Value="${PP3606.hasVariable(&#34;PP4446&#34;) ?&#10;PP3606.PP3665(&#34;PP4446&#34;)[&#34;controlArea&#34;][&#34;areaStat&#34;][&#34;PP3771&#34;] : null}">
              <camunda:validation>
                <camunda:constraint name="readonly" />
              </camunda:validation>
            </PP3196>
            <PP3196 id="PP3270" label="PP3270" type="string" PP3476Value="${PP3606.hasVariable(&#34;PP4446&#34;) ?&#10;PP3606.PP3665(&#34;PP4446&#34;)[&#34;controlArea&#34;][&#34;areaStat&#34;][&#34;PP3270&#34;] : null}">
              <camunda:validation>
                <camunda:constraint name="readonly" />
              </camunda:validation>
            </PP3196>
            <PP3196 id="PP3269" label="PP3269" type="string" PP3476Value="${PP3606.hasVariable(&#34;PP4446&#34;) ?&#10;PP3606.PP3665(&#34;PP4446&#34;)[&#34;controlArea&#34;][&#34;areaStat&#34;][&#34;PP3269&#34;] : null}">
              <camunda:validation>
                <camunda:constraint name="readonly" />
              </camunda:validation>
            </PP3196>
            <PP3196 id="PP3488" label="PP3488" type="string" PP3476Value="${PP3606.hasVariable(&#34;PP4446&#34;) ?&#10;PP3606.PP3665(&#34;PP4446&#34;)[&#34;controlArea&#34;][&#34;areaStat&#34;][&#34;PP3488&#34;] : null}">
              <camunda:validation>
                <camunda:constraint name="readonly" />
              </camunda:validation>
            </PP3196>
            <PP3196 id="PP4455" label="Continuar PP2726 Manualmente" type="boolean">
              <camunda:validation>
                <camunda:constraint name="required" />
              </camunda:validation>
            </PP3196>
            <PP3196 id="PP4456" label="Motivo seguir manualmente" type="string">
              <camunda:validation>
                <camunda:constraint name="required" />
                <camunda:constraint name="minlength" config="10" />
              </camunda:validation>
            </PP3196>
          </camunda:formData>
          <camunda:PP3621RetryTimeCycle>R3/PT5S</camunda:PP3621RetryTimeCycle>
        </bpmn:extensionElements>
        <bpmn:incoming>PP1810</bpmn:incoming>
        <bpmn:incoming>PP1348</bpmn:incoming>
        <bpmn:outgoing>PP1348</bpmn:outgoing>
        <bpmn:outgoing>PP1282</bpmn:outgoing>
      </bpmn:userPP2865>
      <bpmn:intermediateThrowEvent id="PP1119">
        <bpmn:incoming>PP1741</bpmn:incoming>
        <bpmn:outgoing>PP1691</bpmn:outgoing>
      </bpmn:intermediateThrowEvent>
      <bpmn:intermediateCatchEvent id="PP1088" name="10m">
        <bpmn:extensionElements>
          <camunda:PP3621RetryTimeCycle>R6/PT10S</camunda:PP3621RetryTimeCycle>
        </bpmn:extensionElements>
        <bpmn:incoming>PP1614</bpmn:incoming>
        <bpmn:outgoing>PP2023</bpmn:outgoing>
        <bpmn:PP4318rEventDefinition id="PP2919">
          <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">PT10M</bpmn:PP4318Duration>
        </bpmn:PP4318rEventDefinition>
      </bpmn:intermediateCatchEvent>
      <bpmn:servicePP2865 id="PP4085" name="PP0211" PP3191="true" PP3193="#{PP3106}">
        <bpmn:extensionElements>
          <camunda:PP3789>
            <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
            <camunda:inputParameter name="PP3875">
              <camunda:PP4199 PP4199Format="groovy">["PP4087": "\$","vincular": "\$.PP4087","manual": "\$.PP4087.vincular","PP3488": "\$.PP4087.vincular","PP3269": "\$.PP4087.vincular","PP3270": "\$.PP4087.vincular","PP3771": "\$.PP4087.vincular","PP3772": "\$.PP4087.vincular","error_code": "\$.PP4087.vincular","error_message": "\$.PP4087.vincular","PP3888": "\$.PP4087.vincular.manual","continuar": "\$.PP4087.vincular.manual",] as HashMap</camunda:PP4199>
            </camunda:inputParameter>
            <camunda:inputParameter name="PP3417">
              <camunda:map>
                <camunda:entry key="PP3772">${PP3606.hasVariable("PP4446") ? PP3606.PP3665("PP4446")["controlArea"]["areaStat"]["PP3772"] : null}</camunda:entry>
                <camunda:entry key="PP3270">${PP3606.hasVariable("PP4446") ? PP3606.PP3665("PP4446")["controlArea"]["areaStat"]["PP3270"] : null}</camunda:entry>
                <camunda:entry key="PP3269">${PP3606.hasVariable("PP4446") ? PP3606.PP3665("PP4446")["controlArea"]["areaStat"]["PP3269"] : null}</camunda:entry>
                <camunda:entry key="PP3771">${PP3606.hasVariable("PP4446") ? PP3606.PP3665("PP4446")["controlArea"]["areaStat"]["PP3771"] : null}</camunda:entry>
                <camunda:entry key="error_code">${PP3606.PP3665("PP4452")}</camunda:entry>
                <camunda:entry key="error_message">${PP3606.PP3665("PP4453")}</camunda:entry>
                <camunda:entry key="continuar">${PP3606.PP3665("PP4455")}</camunda:entry>
                <camunda:entry key="PP3888">${PP3606.PP3665("PP4456")}</camunda:entry>
                <camunda:entry key="PP4087">${mapempty}</camunda:entry>
                <camunda:entry key="vincular">${mapempty}</camunda:entry>
                <camunda:entry key="manual">${mapempty}</camunda:entry>
                <camunda:entry key="PP3488">${PP3606.hasVariable("PP4446") ? PP3606.PP3665("PP4446")["controlArea"]["areaStat"]["PP3488"] : null}</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
          </camunda:PP3789>
          <camunda:PP3621RetryTimeCycle>R3/PT5S</camunda:PP3621RetryTimeCycle>
        </bpmn:extensionElements>
        <bpmn:incoming>PP2129</bpmn:incoming>
        <bpmn:incoming>PP1389</bpmn:incoming>
        <bpmn:incoming>PP2191</bpmn:incoming>
        <bpmn:outgoing>PP1933</bpmn:outgoing>
      </bpmn:servicePP2865>
      <bpmn:parallelPP2253 id="PP2439">
        <bpmn:incoming>PP2101</bpmn:incoming>
        <bpmn:outgoing>PP2117</bpmn:outgoing>
        <bpmn:outgoing>PP1389</bpmn:outgoing>
      </bpmn:parallelPP2253>
      <bpmn:parallelPP2253 id="PP2349">
        <bpmn:incoming>PP1934</bpmn:incoming>
        <bpmn:outgoing>PP1810</bpmn:outgoing>
        <bpmn:outgoing>PP2129</bpmn:outgoing>
      </bpmn:parallelPP2253>
      <bpmn:endEvent id="PP1101">
        <bpmn:incoming>PP1933</bpmn:incoming>
      </bpmn:endEvent>
      <bpmn:exclusivePP2253 id="PP2282" PP3476="PP1391">
        <bpmn:incoming>PP1374</bpmn:incoming>
        <bpmn:outgoing>PP1391</bpmn:outgoing>
        <bpmn:outgoing>PP1600</bpmn:outgoing>
      </bpmn:exclusivePP2253>
      <bpmn:intermediateCatchEvent id="PP1107" name="5m">
        <bpmn:extensionElements>
          <camunda:PP3621RetryTimeCycle>R3/PT5S</camunda:PP3621RetryTimeCycle>
        </bpmn:extensionElements>
        <bpmn:incoming>PP1600</bpmn:incoming>
        <bpmn:outgoing>PP1687</bpmn:outgoing>
        <bpmn:PP4318rEventDefinition id="PP2923">
          <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">PT5M</bpmn:PP4318Duration>
        </bpmn:PP4318rEventDefinition>
      </bpmn:intermediateCatchEvent>
      <bpmn:parallelPP2253 id="PP2284">
        <bpmn:incoming>PP1282</bpmn:incoming>
        <bpmn:outgoing>PP1793</bpmn:outgoing>
        <bpmn:outgoing>PP2191</bpmn:outgoing>
      </bpmn:parallelPP2253>
      <bpmn:intermediateCatchEvent id="PP4322" name="PP0006">
        <bpmn:extensionElements>
          <camunda:PP3621RetryTimeCycle>R3/PT5S</camunda:PP3621RetryTimeCycle>
        </bpmn:extensionElements>
        <bpmn:incoming>PP1478</bpmn:incoming>
        <bpmn:incoming>PP2023</bpmn:incoming>
        <bpmn:incoming>PP1687</bpmn:incoming>
        <bpmn:outgoing>PP1386</bpmn:outgoing>
        <bpmn:PP4318rEventDefinition id="PP2904">
          <bpmn:PP4318Cycle xsi:type="bpmn:tFormalExpression">* * 8-19 ? * * *</bpmn:PP4318Cycle>
        </bpmn:PP4318rEventDefinition>
      </bpmn:intermediateCatchEvent>
      <bpmn:exclusivePP2253 id="PP2336" PP3476="PP1934">
        <bpmn:incoming>PP1691</bpmn:incoming>
        <bpmn:incoming>PP1391</bpmn:incoming>
        <bpmn:outgoing>PP1934</bpmn:outgoing>
      </bpmn:exclusivePP2253>
      <bpmn:endEvent id="PP1164">
        <bpmn:incoming>PP1414</bpmn:incoming>
      </bpmn:endEvent>
      <bpmn:PP3162 id="PP1108" PP3191="true" attachedToRef="PP4451">
        <bpmn:outgoing>PP1374</bpmn:outgoing>
        <bpmn:errorEventDefinition id="PP0807" camunda:errorCodeVariable="PP4452" camunda:errorPP2588Variable="PP4453" />
      </bpmn:PP3162>
      <bpmn:sequenceFlow id="PP2000" sourceRef="PP1012" targetRef="PP2300" />
      <bpmn:sequenceFlow id="PP1336" sourceRef="PP2300" targetRef="PP2320" />
      <bpmn:sequenceFlow id="PP1478" sourceRef="PP2300" targetRef="PP4322">
        <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4089') &amp;&amp; PP4089 == "0"}</bpmn:conditionExpression>
      </bpmn:sequenceFlow>
      <bpmn:sequenceFlow id="PP2117" sourceRef="PP2439" targetRef="PP2320" />
      <bpmn:sequenceFlow id="PP1793" sourceRef="PP2284" targetRef="PP2320" />
      <bpmn:sequenceFlow id="PP1414" sourceRef="PP2320" targetRef="PP1164" />
      <bpmn:sequenceFlow id="PP1386" sourceRef="PP4322" targetRef="PP4451" />
      <bpmn:sequenceFlow id="PP1630" sourceRef="PP4451" targetRef="PP2355" />
      <bpmn:sequenceFlow id="PP2101" name="PP2755" sourceRef="PP2355" targetRef="PP2439">
        <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression" language="groovy">def areaStat = PP3606.PP3665("PP4446")["controlArea"]["areaStat"] ?: [:]; def PP3771 = areaStat["PP3771"]; def PP3772 = areaStat["PP3772"]; def PP3270 = areaStat["PP3270"]; def PP3269 = areaStat["PP3269"]; def iicc = "$PP3771-$PP3772-$PP3270-$PP3269";return ((PP3772 == "P") // Geral|| (iicc == "PP1248") // ORG NAO ENCONTRPP0014A PP2652RA ESTE CARTAO|| (iicc == "PP1247") // ORG NAO ENCONTRPP0014A PP2652RA ESTE CARTAO|| (iicc == "PP1246") // PROCESSAMENTO EFETUPP0014O);</bpmn:conditionExpression>
      </bpmn:sequenceFlow>
      <bpmn:sequenceFlow id="PP1741" name="PP2754" sourceRef="PP2355" targetRef="PP1119" />
      <bpmn:sequenceFlow id="PP1614" name="retentar" sourceRef="PP2355" targetRef="PP1088">
        <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression" language="groovy">def PP4451_tentativa = PP3606.PP3665("PP4451_tentativa") ?: 0 def areaStat = PP3606.PP3665("PP4446")["controlArea"]["areaStat"] ?: [:] def PP3771 = areaStat["PP3771"] def PP3772 = areaStat["PP3772"] def PP3270 = areaStat["PP3270"] def PP3269 = areaStat["PP3269"] def iicc = "$PP3771-$PP3772-$PP3270-$PP3269"def tentar = ((iicc == "PP1242") // servico indisponivel no momento.|| (iicc == "PP1243") // servico indisponivel no momento.|| (iicc == "PP1240") // servico indisponivel no momento.|| (iicc == "PP1241") // servico indisponivel no momento.|| (iicc == "PP1245") // transacao ims stopada bc0i4ax|| (iicc == "PP1244") // houve PP4318out no micro-servico bc020833 - partner cics_oz)if (PP4451_tentativa &lt; 6 &amp;&amp; tentar) {PP3606.PP4250("PP4451_tentativa", ++PP4451_tentativa)return true}return false</bpmn:conditionExpression>
      </bpmn:sequenceFlow>
      <bpmn:sequenceFlow id="PP1810" sourceRef="PP2349" targetRef="PP3584" />
      <bpmn:sequenceFlow id="PP1348" sourceRef="PP3584" targetRef="PP3584" />
      <bpmn:sequenceFlow id="PP1282" sourceRef="PP3584" targetRef="PP2284">
        <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP4455}</bpmn:conditionExpression>
      </bpmn:sequenceFlow>
      <bpmn:sequenceFlow id="PP1691" sourceRef="PP1119" targetRef="PP2336" />
      <bpmn:sequenceFlow id="PP2023" sourceRef="PP1088" targetRef="PP4322" />
      <bpmn:sequenceFlow id="PP2129" sourceRef="PP2349" targetRef="PP4085" />
      <bpmn:sequenceFlow id="PP1389" sourceRef="PP2439" targetRef="PP4085" />
      <bpmn:sequenceFlow id="PP2191" sourceRef="PP2284" targetRef="PP4085" />
      <bpmn:sequenceFlow id="PP1933" sourceRef="PP4085" targetRef="PP1101" />
      <bpmn:sequenceFlow id="PP1934" sourceRef="PP2336" targetRef="PP2349" />
      <bpmn:sequenceFlow id="PP1374" sourceRef="PP1108" targetRef="PP2282" />
      <bpmn:sequenceFlow id="PP1391" sourceRef="PP2282" targetRef="PP2336" />
      <bpmn:sequenceFlow id="PP1600" name="retentar" sourceRef="PP2282" targetRef="PP1107">
        <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression" language="groovy">def PP4451_ebe_tentativa = PP3606.PP3665("PP4451_ebe_tentativa") ?: 0if (PP4451_ebe_tentativa &lt; 3) {PP3606.PP4250("PP4451_ebe_tentativa", ++PP4451_ebe_tentativa);return true;}return false; </bpmn:conditionExpression>
      </bpmn:sequenceFlow>
      <bpmn:sequenceFlow id="PP1687" sourceRef="PP1107" targetRef="PP4322" />
    </bpmn:subPP2714>
    <bpmn:subPP2714 id="PP0066" name="PP0656" PP4353>
      <bpmn:endEvent id="PP1215">
        <bpmn:incoming>PP2034</bpmn:incoming>
        <bpmn:incoming>PP1584</bpmn:incoming>
      </bpmn:endEvent>
      <bpmn:startEvent id="PP1173" name="PP2508" isInterrupting="false">
        <bpmn:extensionElements>
          <PP3194 PP3601="start">
            <camunda:PP4199 PP4199Format="groovy">PP3606.removeVariable('PP3787')// Criação do id_analise que deve ser enviado para PP2682 (PP3934/PP3545) PP3606.PP4250("id_solicitacao_efetivacao_PP3833", PP3606.getId())// Variável para PP3329 do PP2652 em PP4305 de PP3934def PP3637 = PP3606.hasVariable('PP3637') ? PP3606.PP3665('PP3637') : falsePP3606.PP4250("PP4421_especificas",[["PP3281": "","codigo_PP3200": "11","codigo_PP3350_salario": (PP3637=="PP4355") ? "F" : " ","codigo_PP4229": PP4229,"PP4326": "C","codigo_tipo_atuacao_titularidade_PP3350": "0","cotitulares": []]])</camunda:PP4199>
          </PP3194>
        </bpmn:extensionElements>
        <bpmn:outgoing>PP1705</bpmn:outgoing>
        <bpmn:conditionalEventDefinition id="PP0646" camunda:PP4420Name="PP3787">
          <bpmn:condition xsi:type="bpmn:tFormalExpression">${PP3787}</bpmn:condition>
        </bpmn:conditionalEventDefinition>
      </bpmn:startEvent>
      <bpmn:servicePP2865 id="PP3348" name="PP3027" camunda:type="external" PP3199="PP3844">
        <bpmn:documentation>PP3812Link Git --&gt; PP3723</bpmn:documentation>
        <bpmn:extensionElements>
          <camunda:PP3789>
            <camunda:inputParameter name="PP3847">
              <camunda:map>
                <camunda:entry key="PP3282">${PP3753}</camunda:entry>
                <camunda:entry key="PP3282_PP4305rario">${PP3761}</camunda:entry>
                <camunda:entry key="PP3282_inquilino">${id_inquilino}</camunda:entry>
                <camunda:entry key="codigo_solicitacao_PP3819">${id_solicitacao_efetivacao_PP3833}</camunda:entry>
                <camunda:entry key="codigo_familia_PP4044">28340</camunda:entry>
                <camunda:entry key="PP3288_PP3969">001</camunda:entry>
                <camunda:entry key="PP4421_especificas">${PP4421_especificas}</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
            <camunda:inputParameter name="PP3845">
              <camunda:map>
                <camunda:entry key="PP4484">PP1236</camunda:entry>
                <camunda:entry key="PP4477">PP3620</camunda:entry>
                <camunda:entry key="PP4485">PP0031</camunda:entry>
              </camunda:map>
            </camunda:inputParameter>
            <camunda:inputParameter name="PP3846">${true}</camunda:inputParameter>
          </camunda:PP3789>
        </bpmn:extensionElements>
        <bpmn:incoming>PP1705</bpmn:incoming>
        <bpmn:outgoing>PP2034</bpmn:outgoing>
      </bpmn:servicePP2865>
      <bpmn:PP3162 id="PP1171" attachedToRef="PP3348">
        <bpmn:outgoing>PP1584</bpmn:outgoing>
        <bpmn:errorEventDefinition id="PP0835" camunda:errorCodeVariable="codigo_erro_PP2682" />
      </bpmn:PP3162>
      <bpmn:sequenceFlow id="PP2034" sourceRef="PP3348" targetRef="PP1215" />
      <bpmn:sequenceFlow id="PP1584" sourceRef="PP1171" targetRef="PP1215" />
      <bpmn:sequenceFlow id="PP1705" sourceRef="PP1173" targetRef="PP3348" />
    </bpmn:subPP2714>
    <bpmn:PP4199PP2865 id="PP4221" name="PP4422" PP4199Format="groovy">
      <bpmn:incoming>PP1965</bpmn:incoming>
      <bpmn:outgoing>PP1786</bpmn:outgoing>
      <bpmn:PP4199>import static net.logstash.logPP3123.argument.StructuredArguments.value
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.PP4318.Instant
import java.PP4318.Duration
final Logger logger = LoggerFactory.getLogger("PP3165")Instant inicio = Instant.now()
def datePart = PP3606.PP3665("PP3437");
    def dados_pessoa_temp = [:]
def PP3888 = PP3606.hasVariable('PP3888') ? PP3606.PP3665('PP3888') : "";
    //Renda
def valiPP3394aoRenda = ["nivel_completude" : 200,"modo_PP3317" : 2,"fonte_PP3317" : 3,"status" : 1,"data_valiPP3394ao_fonte" : datePart,"informacoes" : PP3888]//PP4127
def PP4127 = PP3606.PP3665("PP4413")
def PP4127_PP3625mento = ["valor_dado_PP3170l": PP4127, "PP4380": [valiPP3394aoRenda]]//semRenda
def sem_PP4127_PP3625mento = ["valor_dado_PP3170l":true, "PP4380": [valiPP3394aoRenda]]if (PP4127==0){
      dados_pessoa_temp.put('sem_PP4127_PP3625mento', sem_PP4127_PP3625mento)}
else {
      dados_pessoa_temp.put('PP4127_PP3625mento', PP4127_PP3625mento)}//endereccosdef valiPP3394aoEndereco = ["nivel_completude" : 300,"modo_PP3317" : 3,"fonte_PP3317" : 3,"status" : 1,"data_valiPP3394ao_fonte" : datePart,"informacoes" : "comprovado por auto declaração."]def relacionamento_PP3562 = ["codigo_agrupamento_PP4044": 2,"PP3277": "PP0631","codigo_finalidade": 12224,"codigo_classe_PP4044": 6,"codigo_nome_PP4044_PP3969": 14554]//Endereços
def PP4185 = PP3606.PP3665("PP4185")
def PP3913 = PP3606.PP3665("PP3913")
def PP3305 = PP3606.PP3665("PP3305")
def PP3127 = PP3606.PP3665("PP3127")
def PP3242 = PP3606.PP3665("PP3242")
def PP3227 = PP3606.PP3665("PP0530")
def uf = PP3606.PP3665("PP3593")
def objetoEnderecoResidencial = ["principal": true,"propositos": [1,3],"PP3855": PP4185, "PP3913": PP3913,"PP3305": PP3305, "PP3127": PP3127, "PP3242": PP3242,"PP3227": PP3227, "uf": uf, "PP3993": "BR"]def PP3562Residencial = ["valor_dado_PP3170l" :objetoEnderecoResidencial ,"PP4380" : [valiPP3394aoEndereco] ,"relacionamentos" : [relacionamento_PP3562]]
dados_pessoa_temp.put('PP3562s',[PP3562Residencial])
def valiPP3394ao = ["nivel_completude" : 200,"modo_PP3317" : 2,"fonte_PP3317" : 3,"status" : 1,"data_valiPP3394ao_fonte" : datePart,"informacoes" : "comprovado por auto declaração."]def PP3993ResidenciaFiscal = PP3606.PP3665('PP3997')
if (PP3993ResidenciaFiscal != null){
      def objPaisesResidenciaFiscal = ["valor_dado_PP3170l" : [PP3993ResidenciaFiscal],"PP4380" : [valiPP3394ao]] dados_pessoa_temp.put('PP3993es_PP4136_fiscal', objPaisesResidenciaFiscal)}
def nfiNacionalidade = PP3606.PP3665('PP3892')
if (nfiNacionalidade != null){
      def objNacionalidades = ["valor_dado_PP3170l" : [nfiNacionalidade],"PP4380" : [valiPP3394ao]] dados_pessoa_temp.put('PP3892s', objNacionalidades)}
def nfiNascimento= PP3606.PP3665('PP3996')
if (nfiNascimento != null){
      def objPaisNascimento = ["valor_dado_PP3170l" : nfiNascimento,"PP4380" : [valiPP3394ao]] dados_pessoa_temp.put('PP3996', objPaisNascimento)}if(PP3606.hasVariable('PP3919') &amp;
    &amp;
    PP3606.PP3665('PP3919').length() &gt;
    1){
      def PP3913Nfi = PP3606.PP3665('PP3919')
def PP3524Nif = ["tipo" : 12213,"PP3913" : PP3913Nfi,"identificador": 12421,"PP3993": PP3993ResidenciaFiscal];
    def objDocumentoNif = ["valor_dado_PP3170l":PP3524Nif,"PP4380" : [valiPP3394ao]];
    dados_pessoa_temp.put('PP3524s',[objDocumentoNif])}
    PP3606.PP4250('dados_pessoa_temp', dados_pessoa_temp)logger.info("Montagem de campos para atualizar pessoa dados PP3563",value("PP3759", PP3606.PP3665("PP3759")),value("PP3753", PP3606.PP3665("PP3753")),value("intencao", PP3606.PP3665("intencao")),value("correlationId", PP3606.PP3665("PP4481")),value("PP4305_total_espera", Duration.between(inicio, Instant.now())))</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:sequenceFlow id="PP1786" sourceRef="PP4221" targetRef="PP2337" />
    <bpmn:servicePP2865 id="PP3103" name="PP0190" PP3193="#{atualizarPP2694}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3407">${dados_pessoa_temp}</camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2032</bpmn:incoming>
      <bpmn:incoming>PP2021</bpmn:incoming>
      <bpmn:outgoing>PP1743</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1743" sourceRef="PP3103" targetRef="PP1094" />
    <bpmn:intermediateThrowEvent id="PP1094" name="PP2509">
      <bpmn:documentation>PP2638</bpmn:documentation>
      <bpmn:extensionElements>
        <PP3194 PP3601="start">
          <camunda:PP4199 PP4199Format="groovy">PP3606.PP4250('PP3787',true)</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1743</bpmn:incoming>
      <bpmn:outgoing>PP2115</bpmn:outgoing>
    </bpmn:intermediateThrowEvent>
    <bpmn:sequenceFlow id="PP2115" sourceRef="PP1094" targetRef="PP2339" />
    <bpmn:userPP2865 id="PP3591" name="PP0908">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3272" type="string">
            <camunda:validation>
              <camunda:constraint name="required" />
            </camunda:validation>
          </PP3196>
          <PP3196 id="PP4233" type="domain" PP3476Value="${PP4233}" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP4354" type="boolean" />
        </camunda:formData>
        <PP3194 PP3601="end">
          <camunda:PP4199 PP4199Format="groovy">if(PP3606.hasVariable('PP3272')){PP3606.PP4250("PP4229", PP3272)}</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1758</bpmn:incoming>
      <bpmn:incoming>PP2230</bpmn:incoming>
      <bpmn:outgoing>PP1665</bpmn:outgoing>
      <bpmn:outgoing>PP1460</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:endEvent id="PP1172" name="PP3612">
      <bpmn:incoming>PP1265</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0852" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:PP3162 id="PP1082" attachedToRef="PP3591">
      <bpmn:outgoing>PP1265</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2910">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1265" sourceRef="PP1082" targetRef="PP1172" />
    <bpmn:sequenceFlow id="PP1758" name="PP3004" sourceRef="PP3415" targetRef="PP3591">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4460') &amp;&amp; PP4460=="PP3591" &amp;&amp; (PP4229=="L" || PP4229=="1")}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1665" name="PP3004" sourceRef="PP3591" targetRef="PP3782">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4460') &amp;&amp; PP4460=="PP3782"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:exclusivePP2253 id="PP2408" PP3476="PP1296">
      <bpmn:incoming>PP2075</bpmn:incoming>
      <bpmn:outgoing>PP1296</bpmn:outgoing>
      <bpmn:outgoing>PP1550</bpmn:outgoing>
      <bpmn:outgoing>PP2087</bpmn:outgoing>
      <bpmn:outgoing>PP12561npcpreerr</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:servicePP2865 id="PP4043" name="PP0198" camunda:type="external" PP3199="PP3088">
      <bpmn:documentation>PP3720 Producer PP2528</bpmn:documentation>
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3112">
            <camunda:map>
              <camunda:entry key="PP3282">${PP3753}</camunda:entry>
              <camunda:entry key="PP3283">${((PP3606.hasVariable("PP3926") &amp;&amp; PP3926 != null &amp;&amp; PP3926 != 'null' &amp;&amp; PP3926 != '') ? PP3606.PP3665("PP3926") : PP4143)}</camunda:entry>
              <camunda:entry key="PP3288">000009999</camunda:entry>
              <camunda:entry key="PP3492">${PP4229}</camunda:entry>
              <camunda:entry key="PP3780">${PP3606.hasVariable('PP3841') &amp;&amp; PP3841 &gt; 0 ? "S" : "N"}</camunda:entry>
              <camunda:entry key="PP3493">${PP3635}</camunda:entry>
              <camunda:entry key="PP4253">PP0538</camunda:entry>
              <camunda:entry key="PP3491">${PP3203}</camunda:entry>
              <camunda:entry key="PP3294">PP0011</camunda:entry>
              <camunda:entry key="PP3434">${PP3437}</camunda:entry>
              <camunda:entry key="PP3520">${PP3521}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3089">${true}</camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1296</bpmn:incoming>
      <bpmn:outgoing>PP2136</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:intermediateThrowEvent id="PP3588" name="PP0801">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:outputParameter name="PP4272">Erro ao produzir a mensagem</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1772</bpmn:incoming>
      <bpmn:outgoing>PP2147</bpmn:outgoing>
    </bpmn:intermediateThrowEvent>
    <bpmn:servicePP2865 id="PP3102" name="PP0197" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">1</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP4272">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP4272">${PP4272}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2147</bpmn:incoming>
      <bpmn:incoming>PP1410</bpmn:incoming>
      <bpmn:outgoing>PP2099</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:endEvent id="PP0979">
      <bpmn:incoming>PP2099</bpmn:incoming>
    </bpmn:endEvent>
    <bpmn:intermediateThrowEvent id="PP0974" name="PP2586">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:outputParameter name="PP4272">PP2586</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2136</bpmn:incoming>
      <bpmn:outgoing>PP1410</bpmn:outgoing>
    </bpmn:intermediateThrowEvent>
    <bpmn:PP3162 id="PP0956" attachedToRef="PP4043">
      <bpmn:outgoing>PP1772</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0868" />
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1296" sourceRef="PP2408" targetRef="PP4043">
      <bpmn:extensionElements>
        <PP3194 PP3601="take">
          <camunda:PP4199 PP4199Format="javaPP4199">var dateUpdate = new Date(); dateUpdate.setTime(dateUpdate.getTime() + dateUpdate.getTimezoneOffset() * 60 * 1000 /* convert to UTC */ - (/* UTC-6 */ 6) * 60 * 60 * 1000); PP3606.PP4250("PP3437", dateUpdate.toISOString().split('.')[0])</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP2136" sourceRef="PP4043" targetRef="PP0974" />
    <bpmn:sequenceFlow id="PP1772" sourceRef="PP0956" targetRef="PP3588" />
    <bpmn:sequenceFlow id="PP2147" sourceRef="PP3588" targetRef="PP3102" />
    <bpmn:sequenceFlow id="PP1410" sourceRef="PP0974" targetRef="PP3102" />
    <bpmn:sequenceFlow id="PP2099" sourceRef="PP3102" targetRef="PP0979" />
    <bpmn:sequenceFlow id="PP1550" sourceRef="PP2408" targetRef="PP0058">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable("PP3946") &amp;&amp; PP3606.PP3665("PP3946") == false}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP2087" sourceRef="PP2408" targetRef="PP4378">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.PP3665("PP3946") == true &amp;&amp; PP3606.PP3665("pode_validar_PP4091") == true}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP12561npcpreerr" sourceRef="PP2408" targetRef="PP1181">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.PP3665("PP3946") == true &amp;&amp; PP3606.PP3665("pode_validar_PP4091") != true}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP2081" sourceRef="PP4378" targetRef="PP1185" />
    <bpmn:sequenceFlow id="PP2083" sourceRef="PP3641" targetRef="PP2259" />
    <bpmn:sequenceFlow id="PP2077" sourceRef="PP1183" targetRef="PP1181" />
    <bpmn:sequenceFlow id="PP2085" sourceRef="PP1185" targetRef="monta_body_PP3641" />
    <bpmn:sequenceFlow id="PP2079" sourceRef="PP1181" targetRef="monta_body_PP3641" />
    <bpmn:intermediateThrowEvent id="PP1185" name="PP2996">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:outputParameter name="PP4275">Sucesso</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2081</bpmn:incoming>
      <bpmn:outgoing>PP2085</bpmn:outgoing>
    </bpmn:intermediateThrowEvent>
    <bpmn:intermediateThrowEvent id="PP1181" name="PP2995">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:outputParameter name="PP4275">Erro</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2077</bpmn:incoming>
      <bpmn:outgoing>PP2079</bpmn:outgoing>
    </bpmn:intermediateThrowEvent>
    <bpmn:servicePP2865 id="PP4378" name="PP2990" camunda:modelerTemplate="PP3965" camunda:modelerTemplateVersion="1" PP3191="true" PP3193="${PP3967}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3747">${PP3606.PP3665('PP3747')}</camunda:entry>
              <camunda:entry key="PP4091">${PP3606.PP3665('PP4091_para_valiPP3394ao')}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="urlDev">https://cards-multiple-noname.api-sp.dev.aws.cloud.ihf/cards-multiple-noname/v1/proxies/${PP3606.PP3665('PP4091_para_valiPP3394ao')}/cards-details</camunda:inputParameter>
          <camunda:inputParameter name="PP4363">https://cards-multiple-noname.api-sp.hom.aws.cloud.ihf/cards-multiple-noname/v1/proxies/${PP3606.PP3665('PP4091_para_valiPP3394ao')}/cards-details</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">https://cards-multiple-noname.api-sp.prod.aws.cloud.ihf/cards-multiple-noname/v1/proxies/${PP3606.PP3665('PP4091_para_valiPP3394ao')}/cards-details</camunda:inputParameter>
          <camunda:inputParameter name="PP3668">{"PP4478":"PP0005", "PP4483": "PP0007", "PP4481": "PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"PP4478":"PP0008", "PP4483": "PP0007", "PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3670">{"PP4478":"PP0009", "PP4483":"PP0007", "PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP4374">${3}</camunda:inputParameter>
          <camunda:inputParameter name="PP4373">${5}</camunda:inputParameter>
          <camunda:inputParameter name="PP4371">${true}</camunda:inputParameter>
          <camunda:inputParameter name="PP4372">${true}</camunda:inputParameter>
          <camunda:outputParameter name="PP4092">${PP3606.hasVariable("valida-PP4087-npc_resposta") ? PP3606.PP3665("valida-PP4087-npc_resposta")["PP4092"] : null}</camunda:outputParameter>
          <camunda:outputParameter name="PP3290">${PP3606.hasVariable("valida-PP4087-npc_resposta") ? PP3606.PP3665("valida-PP4087-npc_resposta")["PP3290"] : null}</camunda:outputParameter>
          <camunda:outputParameter name="PP3866">${PP3606.hasVariable("valida-PP4087-npc_resposta") ? PP3606.PP3665("valida-PP4087-npc_resposta")["PP3866"] : null}</camunda:outputParameter>
        </camunda:PP3789>
        <camunda:PP3621RetryTimeCycle>R3/PT5S</camunda:PP3621RetryTimeCycle>
        <camunda:field name="withError">
          <PP3195>true</PP3195>
        </camunda:field>
        <camunda:field name="PP3585">
          <camunda:string>PP0538_PROXY_PP2627</camunda:string>
        </camunda:field>
        <camunda:field name="PP4317">
          <PP3195>${statusCode != 200}</PP3195>
        </camunda:field>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2087</bpmn:incoming>
      <bpmn:outgoing>PP2081</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP3162 id="PP1183" attachedToRef="PP4378">
      <bpmn:outgoing>PP2077</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0863" />
    </bpmn:PP3162>
    <bpmn:PP4199PP2865 id="monta_body_PP3641" name="Monta body formaliza PP2627" PP4199Format="javaPP4199">
      <bpmn:incoming>PP2085</bpmn:incoming>
      <bpmn:incoming>PP2079</bpmn:incoming>
      <bpmn:outgoing>PP1256monta_body_para_formaliza</bpmn:outgoing>
      <bpmn:PP4199>function toBooleanOuFalse(valor) {
  return valor === true || valor === 'true';
}

function toObjetoOuVazio(raw) {
  if (raw == null) return {};

  if (typeof raw === 'string') {
    try {
      return JSON.parse(raw);
    } catch (e) {
      return {};
    }
  }

  if (typeof raw === 'object') {
    return raw;
  }

  return {};
}

function toTextoOuVazio(valor) {
  return valor != null &amp;&amp; String(valor).length > 0 ? String(valor) : '';
}

function isPP2751NumericoValido(valor) {
  return valor != null &amp;&amp; String(valor).match(/^[0-9]+$/);
}

var idIntencaoParaFormalizacao = PP3606.hasVariable('PP3747')
  ? PP3606.PP3665('PP3747')
  : null;

var statusValiPP3394aoPP2751Npc = PP3606.hasVariable('PP4275')
  ? PP3606.PP3665('PP4275')
  : null;

var PP4087NpcValidadoParaFormalizacao = null;

if (
  statusValiPP3394aoPP2751Npc == 'Sucesso' &amp;&amp;
  PP3606.hasVariable('PP4091_para_valiPP3394ao')
) {
  var PP4087NpcParaValiPP3394ao = PP3606.PP3665('PP4091_para_valiPP3394ao');

  if (isPP2751NumericoValido(PP4087NpcParaValiPP3394ao)) {
    PP4087NpcValidadoParaFormalizacao = String(PP4087NpcParaValiPP3394ao);
  }
}

PP3606.PP4250('PP3747_para_formalizacao', idIntencaoParaFormalizacao);
PP3606.PP4250('id_PP4087_para_formalizacao', PP4087NpcValidadoParaFormalizacao);

var dadosPP2726ParaFormalizacao = toObjetoOuVazio(
  PP3606.hasVariable('PP3417') ? PP3606.PP3665('PP3417') : null
);

var PP3934NpcParaFormalizacao = toBooleanOuFalse(
  PP3606.hasVariable('PP3946') ? PP3606.PP3665('PP3946') : false
);

var bodyFormalizaNpc = {
  PP3747: toTextoOuVazio(idIntencaoParaFormalizacao),
  PP3946: PP3934NpcParaFormalizacao,
  PP3417: dadosPP2726ParaFormalizacao,
  id_PP4087: PP4087NpcValidadoParaFormalizacao
};

PP3606.PP4250('PP3641_body', JSON.stringify(bodyFormalizaNpc));</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:sequenceFlow id="PP1256monta_body_para_formaliza" sourceRef="monta_body_PP3641" targetRef="PP3641" />
    <bpmn:servicePP2865 id="PP3641" name="PP2242" camunda:modelerTemplate="PP3966" camunda:modelerTemplateVersion="1" PP3191="true" PP3193="${operacaoPostDelegate}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="urlDev">${PP3606.hasVariable("PP3641_url_dev") ? PP3641_url_dev : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4363">${PP3606.hasVariable("PP3641_url_homolog") ? PP3641_url_homolog : ""}</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">${PP3606.hasVariable("PP3641_url_prod") ? PP3641_url_prod : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3668">{"Content-Type":"application/json","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"Content-Type":"application/json","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3670">{"Content-Type":"application/json","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="bodyDev">${PP3606.PP3665('PP3641_body')}</camunda:inputParameter>
          <camunda:inputParameter name="PP3158">${PP3606.PP3665('PP3641_body')}</camunda:inputParameter>
          <camunda:inputParameter name="bodyProd">${PP3606.PP3665('PP3641_body')}</camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1256monta_body_para_formaliza</bpmn:incoming>
      <bpmn:outgoing>PP2083</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:userPP2865 id="PP3558" name="PP0785" PP3476="PP2061">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3276" type="string" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP4460" type="string" PP3476Value="continuar" />
          <PP3196 id="PP4016" type="string" />
          <PP3196 id="PP3648" type="string" />
        </camunda:formData>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3600">PP3558</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1856</bpmn:incoming>
      <bpmn:outgoing>PP1526</bpmn:outgoing>
      <bpmn:outgoing>PP2061</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:PP3162 id="PP1060" attachedToRef="PP3558">
      <bpmn:outgoing>PP1925</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2935">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:endEvent id="PP0949" name="PP3612">
      <bpmn:incoming>PP1925</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0849" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP1925" sourceRef="PP1060" targetRef="PP0949" />
    <bpmn:sequenceFlow id="PP1526" name="PP4460" sourceRef="PP3558" targetRef="PP4235">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4460') &amp;&amp; PP4460=="PP4235"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:parallelPP2253 id="PP2331">
      <bpmn:incoming>PP2222</bpmn:incoming>
      <bpmn:outgoing>PP1981</bpmn:outgoing>
      <bpmn:outgoing>PP1776</bpmn:outgoing>
    </bpmn:parallelPP2253>
    <bpmn:sequenceFlow id="PP1860" sourceRef="PP4321" targetRef="PP4208" />
    <bpmn:sequenceFlow id="PP2222" sourceRef="PP4208" targetRef="PP2331" />
    <bpmn:parallelPP2253 id="PP2347">
      <bpmn:incoming>PP1622</bpmn:incoming>
      <bpmn:incoming>PP2040</bpmn:incoming>
      <bpmn:outgoing>PP1294</bpmn:outgoing>
    </bpmn:parallelPP2253>
    <bpmn:sequenceFlow id="PP1981" sourceRef="PP2331" targetRef="PP3537" />
    <bpmn:sequenceFlow id="PP1776" sourceRef="PP2331" targetRef="PP2443" />
    <bpmn:sequenceFlow id="PP1622" sourceRef="PP3537" targetRef="PP2347" />
    <bpmn:sequenceFlow id="PP2040" sourceRef="PP2429" targetRef="PP2347" />
    <bpmn:sequenceFlow id="PP1294" sourceRef="PP2347" targetRef="PP4063" />
    <bpmn:exclusivePP2253 id="PP2276" PP3476="PP1643">
      <bpmn:incoming>PP1713</bpmn:incoming>
      <bpmn:outgoing>PP1643</bpmn:outgoing>
      <bpmn:outgoing>PP1856</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:exclusivePP2253 id="PP2321" PP3476="PP1517">
      <bpmn:incoming>PP1643</bpmn:incoming>
      <bpmn:incoming>PP2061</bpmn:incoming>
      <bpmn:outgoing>PP1517</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1643" sourceRef="PP2276" targetRef="PP2321">
      <bpmn:extensionElements>
        <PP3194 PP3601="take">
          <camunda:PP4199 PP4199Format="groovy">if (PP3559 == true){ PP3606.PP4250("PP3559", false)}</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1856" sourceRef="PP2276" targetRef="PP3558">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP3559') &amp;&amp; PP3559 == true &amp;&amp; PP4229 != '3'}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP2061" sourceRef="PP3558" targetRef="PP2321" />
    <bpmn:sequenceFlow id="PP1517" sourceRef="PP2321" targetRef="PP4135" />
    <bpmn:exclusivePP2253 id="PP2435" PP3476="PP1408">
      <bpmn:incoming>PP1285</bpmn:incoming>
      <bpmn:incoming>PP1596</bpmn:incoming>
      <bpmn:outgoing>PP1408</bpmn:outgoing>
      <bpmn:outgoing>PP2169</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1408" sourceRef="PP2435" targetRef="PP2437" />
    <bpmn:endEvent id="PP1150">
      <bpmn:incoming>PP1692</bpmn:incoming>
      <bpmn:terminateEventDefinition id="PP2883" />
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP2169" sourceRef="PP2435" targetRef="PP3896">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${(!PP3606.hasVariable('PP3547') || PP3547 == false || PP3547 == "false") || ((PP3329r_bacen == true || PP3329r_bacen == "true") &amp;&amp; (!PP3606.hasVariable('PP3757_bacen') || PP3757_bacen == null || PP3757_bacen == ""))}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:exclusivePP2253 id="PP2272" name="PP2869">
      <bpmn:incoming>PP1748</bpmn:incoming>
      <bpmn:outgoing>PP1973</bpmn:outgoing>
      <bpmn:outgoing>PP2216</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1973" name="sim" sourceRef="PP2272" targetRef="PP3510">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${(PP3606.hasVariable('PP3053_logada') &amp;&amp; PP3053_logada != null &amp;&amp; PP3053_logada != "")}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:servicePP2865 id="PP3512" name="PP3013" camunda:modelerTemplate="PP3966" camunda:modelerTemplateVersion="1" PP3191="true" PP3193="${operacaoPostDelegate}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3668">{"PP4478":"PP0005","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"PP4478":"PP0008","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3670">{"PP4478":"PP0009","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="urlDev">PP3712</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">PP3716</camunda:inputParameter>
          <camunda:inputParameter name="bodyProd">{"PP3753": "${PP3753}","PP3635": "${PP3635}","sub_PP3635": "${PP4279}"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3158">{"PP3753": "${PP3753}", "PP3635": "${PP3635}", "sub_PP3635": "${PP4279}"}</camunda:inputParameter>
          <camunda:inputParameter name="bodyDev">{"PP3753": "${PP3753}", "PP3635": "${PP3635}", "sub_PP3635": "${PP4279}"}</camunda:inputParameter>
          <camunda:inputParameter name="PP4363">PP3714</camunda:inputParameter>
          <camunda:outputParameter name="PP4152">${S(response)}</camunda:outputParameter>
        </camunda:PP3789>
        <camunda:field name="withError">
          <PP3195>true</PP3195>
        </camunda:field>
        <camunda:field name="PP3585">
          <camunda:string>erro_PP3510</camunda:string>
        </camunda:field>
        <camunda:field name="PP4317">
          <PP3195>${statusCode != 200}</PP3195>
        </camunda:field>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2216</bpmn:incoming>
      <bpmn:outgoing>PP1310</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP3162 id="PP1153" attachedToRef="PP3512">
      <bpmn:outgoing>PP2053</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0827" />
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP2216" name="Não" sourceRef="PP2272" targetRef="PP3512" />
    <bpmn:sequenceFlow id="PP1310" sourceRef="PP3512" targetRef="PP3107" />
    <bpmn:sequenceFlow id="PP2053" sourceRef="PP1153" targetRef="PP3107" />
    <bpmn:PP4199PP2865 id="PP4198" name="PP0657" PP4199Format="groovy">
      <bpmn:incoming>PP1464</bpmn:incoming>
      <bpmn:outgoing>PP1639</bpmn:outgoing>
      <bpmn:PP4199>def PP3053 = PP3606.PP3665('PP3916') def PP3383_cnpj = PP3606.PP3665('PP3383') def PP4229 = PP3606.PP3665('PP4229') def PP3376PP2827 = [:] as HashMapPP3376PP2827.put("PP3383_cnpj", PP3383_cnpj)PP3376PP2827.put("PP4334", "F")PP3376PP2827.put("PP4229", PP4229)PP3376PP2827.put("PP3053", PP3053)PP3376PP2827.put("PP4330", "004")PP3376PP2827.put("codigo_banco", "341")PP3376PP2827.put("PP3053_digital", "N") PP3606.PP4250("PP3376PP2827",PP3376PP2827)</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:sequenceFlow id="PP1464" sourceRef="PP4235" targetRef="PP4198" />
    <bpmn:servicePP2865 id="PP3340" name="PP0657" camunda:type="external" PP3199="PP3342">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3309">true</camunda:inputParameter>
          <camunda:inputParameter name="PP3586">true</camunda:inputParameter>
          <camunda:inputParameter name="PP4175">2000</camunda:inputParameter>
          <camunda:inputParameter name="PP3864">1</camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1639</bpmn:incoming>
      <bpmn:outgoing>PP1764</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1639" sourceRef="PP4198" targetRef="PP3340" />
    <bpmn:exclusivePP2253 id="PP2404" name="PP2828" PP3191="true" PP3476="PP1532">
      <bpmn:incoming>PP1764</bpmn:incoming>
      <bpmn:outgoing>PP1532</bpmn:outgoing>
      <bpmn:outgoing>PP2177</bpmn:outgoing>
      <bpmn:outgoing>PP1963</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1532" sourceRef="PP2404" targetRef="PP0150" />
    <bpmn:exclusivePP2253 id="PP2301" PP3476="PP1314">
      <bpmn:incoming>PP2177</bpmn:incoming>
      <bpmn:outgoing>PP1503</bpmn:outgoing>
      <bpmn:outgoing>PP1314</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP2177" sourceRef="PP2404" targetRef="PP2301">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${situacao_PP3340 == 'erro PP3329' || situacao_PP3340 == 'erro_PP4173'}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:userPP2865 id="PP3054" name="PP0797">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3581" label="Retorno PP2827" type="string" PP3476Value="404" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
        </camunda:formData>
        <PP3194 PP3601="end">
          <camunda:PP4199 PP4199Format="groovy">PP3606.PP4250("PP4172", "")</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1503</bpmn:incoming>
    </bpmn:userPP2865>
    <bpmn:PP3162 id="PP1170" attachedToRef="PP3054">
      <bpmn:outgoing>PP1328</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2944">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">PT1S</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1503" name="PP2634" sourceRef="PP2301" targetRef="PP3054">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP4172.PP3350ins('GQ PP4169u NOT_FOUND')}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:userPP2865 id="PP3576" name="PP0797">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3581" label="Retorno PP2827" type="string" PP3476Value="422" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
        </camunda:formData>
        <PP3194 PP3601="end">
          <camunda:PP4199 PP4199Format="groovy">PP3606.PP4250("situacao_PP3340", "")</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1314</bpmn:incoming>
    </bpmn:userPP2865>
    <bpmn:PP3162 id="PP1059" attachedToRef="PP3576">
      <bpmn:outgoing>PP1601</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2929">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">PT1S</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:userPP2865 id="PP3580" name="PP0797">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3581" type="string" PP3476Value="400" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
        </camunda:formData>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1963</bpmn:incoming>
    </bpmn:userPP2865>
    <bpmn:PP3162 id="PP1102" attachedToRef="PP3580">
      <bpmn:outgoing>PP1458</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2946">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">PT1S</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1314" name="PP0800" sourceRef="PP2301" targetRef="PP3576" />
    <bpmn:sequenceFlow id="PP1963" name="PP2251" sourceRef="PP2404" targetRef="PP3580">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4170') &amp;&amp; PP4170['PP3913Funcional'] == "000000000"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:PP4199PP2865 id="PP0150" name="PP2577" PP4199Format="groovy">
      <bpmn:incoming>PP1532</bpmn:incoming>
      <bpmn:outgoing>PP1713</bpmn:outgoing>
      <bpmn:PP4199>def PP3329PP2827 = ["id_PP3248": PP3606.PP3665("PP3753"),"PP4229": PP4170["PP4229"],"subPP4229": "","id_PP4016": "","cod_PP4016": PP4170["PP4016"],"id_PP3221": "","cod_PP3221": PP4170["PP3274"],"PP3648": PP4170["PP3913Funcional"],"cod_grupo_modelo_atendimento": "","cod_modelo_atendimento": "","perfil": "","cod_caracteristica_publico": "","tipo_atendimento": "","cod_grupo_sugestao_PP3221": ""]def http_gq_PP3329_PP3557_PP3350 = ["PP3648": PP4170["PP3913Funcional"],"cod_PP3221": PP4170["PP3274"]]PP3606.PP4250("http_gq_PP3329_PP3557_PP3350", http_gq_PP3329_PP3557_PP3350) PP3606.PP4250("PP3329PP2827", PP3329PP2827)</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:sequenceFlow id="PP1764" sourceRef="PP3340" targetRef="PP2404" />
    <bpmn:sequenceFlow id="PP1713" sourceRef="PP0150" targetRef="PP2276" />
    <bpmn:sequenceFlow id="PP1328" sourceRef="PP1170" targetRef="PP2339" />
    <bpmn:sequenceFlow id="PP1601" sourceRef="PP1059" targetRef="PP2339" />
    <bpmn:sequenceFlow id="PP1458" sourceRef="PP1102" targetRef="PP2339" />
    <bpmn:servicePP2865 id="PP3336" name="PP0659" camunda:modelerTemplate="PP3965" camunda:modelerTemplateVersion="1" PP3191="true" PP3193="${PP3967}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3668">{"PP4478":"PP0005","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"PP4478":"PP0008","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3670">{"PP4478":"PP0009","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">PP3708{PP3606.PP3665('PP3753')}/PP3380</camunda:inputParameter>
          <camunda:inputParameter name="urlDev">PP3706{PP3606.PP3665('PP3753')}/PP3380</camunda:inputParameter>
          <camunda:inputParameter name="PP4107">?indicadorPP0664Spi=${PP3606.PP3665('PP3637') == "PP4355" ? 'S': 'N'}</camunda:inputParameter>
          <camunda:inputParameter name="PP4108">?indicadorPP0664Spi=${PP3606.PP3665('PP3637') == "PP4355" ? 'S': 'N'}</camunda:inputParameter>
          <camunda:inputParameter name="PP4109">?indicadorPP0664Spi=${PP3606.PP3665('PP3637') == "PP4355" ? 'S': 'N'}</camunda:inputParameter>
          <camunda:inputParameter name="PP4363">PP3707{PP3606.PP3665('PP3753')}/PP3380</camunda:inputParameter>
          <camunda:outputParameter name="PP4148">${S(response)}</camunda:outputParameter>
        </camunda:PP3789>
        <camunda:field name="withError">
          <PP3195>true</PP3195>
        </camunda:field>
        <camunda:field name="PP3585">
          <camunda:string>ERRO_IH8</camunda:string>
        </camunda:field>
        <camunda:field name="PP4317">
          <PP3195>${statusCode != 200}</PP3195>
        </camunda:field>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1669</bpmn:incoming>
      <bpmn:outgoing>PP1727</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP3162 id="PP1077" attachedToRef="PP3336">
      <bpmn:outgoing>PP1318</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0853" />
    </bpmn:PP3162>
    <bpmn:PP4199PP2865 id="PP4225" name="PP4201" PP4199Format="groovy">
      <bpmn:incoming>PP1727</bpmn:incoming>
      <bpmn:outgoing>PP2097</bpmn:outgoing>
      <bpmn:PP4199>def jsonSlurperClassic = new groovy.json.JsonSlurperClassic();
    PP3606.PP4250("response_PP3336", jsonSlurperClassic.parseText(PP4148.toString()))</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:endEvent id="PP0954" name="PP3612">
      <bpmn:incoming>PP1318</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0854" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP1318" sourceRef="PP1077" targetRef="PP0954" />
    <bpmn:sequenceFlow id="PP1727" sourceRef="PP3336" targetRef="PP4225" />
    <bpmn:userPP2865 id="PP4313" name="PP2892">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3851" type="domain" PP3476Value="${PP3606.hasVariable(&#39;PP4148&#39;) ? PP4148: null}" />
          <PP3196 id="PP4460" type="string" PP3476Value="continuar" />
        </camunda:formData>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3600">PP4311</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1885</bpmn:incoming>
      <bpmn:incoming>PP1370</bpmn:incoming>
      <bpmn:outgoing>PP1615</bpmn:outgoing>
      <bpmn:outgoing>PP1368</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:PP3162 id="PP1104" attachedToRef="PP4313">
      <bpmn:outgoing>PP1272</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2914">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:userPP2865 id="PP3328" name="PP0653">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3328" type="boolean" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP4460" type="string" PP3476Value="continuar" />
        </camunda:formData>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3600">PP4311</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1615</bpmn:incoming>
      <bpmn:outgoing>PP1885</bpmn:outgoing>
      <bpmn:outgoing>PP1651</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:PP3162 id="PP1127" attachedToRef="PP3328">
      <bpmn:outgoing>PP1685</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2950">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:endEvent id="PP0922" name="PP3612">
      <bpmn:incoming>PP1272</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0836" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:endEvent id="PP1020" name="PP3612">
      <bpmn:incoming>PP1685</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0843" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP1272" sourceRef="PP1104" targetRef="PP0922" />
    <bpmn:sequenceFlow id="PP1685" sourceRef="PP1127" targetRef="PP1020" />
    <bpmn:sequenceFlow id="PP1615" sourceRef="PP4313" targetRef="PP3328" />
    <bpmn:sequenceFlow id="PP1885" name="PP3004" sourceRef="PP3328" targetRef="PP4313">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4460') &amp;&amp; PP4460=="PP4313"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1368" name="PP3004" sourceRef="PP4313" targetRef="PP3046">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4460') &amp;&amp; PP4460=="PP3046"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:exclusivePP2253 id="PP2259" name="PP2705" PP3191="true" PP3476="PP1617">
      <bpmn:incoming>PP2179</bpmn:incoming>
      <bpmn:outgoing>PP1617</bpmn:outgoing>
      <bpmn:outgoing>PP1562</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:exclusivePP2253 id="PP2418" PP3191="true" PP3476="PP1711">
      <bpmn:incoming>PP1568</bpmn:incoming>
      <bpmn:incoming>PP1617</bpmn:incoming>
      <bpmn:incoming>PP2083</bpmn:incoming>
      <bpmn:outgoing>PP1711</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:PP4199PP2865 id="PP4203" name="PP4200" PP4199Format="groovy">
      <bpmn:incoming>PP1562</bpmn:incoming>
      <bpmn:outgoing>PP1869</bpmn:outgoing>
      <bpmn:PP4199>def jsonSlurperClassic = new groovy.json.JsonSlurperClassic();
    PP3606.PP4250("response_PP3336", jsonSlurperClassic.parseText(PP4148.toString()))import org.camunda.spin.Spinimport org.camunda.spin.json.SpinJsonNodedef responseConsultaDebitoJson = PP3606.PP3665("PP4148") def codigoIdentificacaoSolicitacao = responseConsultaDebitoJson.prop("codigoIdentificacaoSolicitacao").stringValue() def codigoIdentificacaoPP0664 = (PP3606.hasVariable("PP3926") &amp;
    &amp;
    PP3926 != null &amp;
    &amp;
    PP3926 != 'null' &amp;
    &amp;
    PP3926 != '') ? PP3606.PP3665("PP3926") : PP4143 PP3606.PP4250("codigo_identificacao_solicitacao", codigoIdentificacaoSolicitacao) PP3606.PP4250("PP3281", codigoIdentificacaoPP0664)</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:servicePP2865 id="PP3044" name="PP0034" camunda:modelerTemplate="PP3966" camunda:modelerTemplateVersion="1" PP3191="true" PP3193="${operacaoPostDelegate}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="urlDev">PP3707{PP3606.PP3665('PP3753')}/PP3323s</camunda:inputParameter>
          <camunda:inputParameter name="PP4363">PP3707{PP3606.PP3665('PP3753')}/PP3323s</camunda:inputParameter>
          <camunda:inputParameter name="bodyDev">{ "codigoIdentificacaoSolicitacao": "${PP3606.PP3665('codigo_identificacao_solicitacao')}", "codigoIdentificacaoPP0664": "${PP3606.PP3665('PP3281')}"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3158">{ "codigoIdentificacaoSolicitacao": "${PP3606.PP3665('codigo_identificacao_solicitacao')}", "codigoIdentificacaoPP0664": "${PP3606.PP3665('PP3281')}"}</camunda:inputParameter>
          <camunda:inputParameter name="bodyProd">{ "codigoIdentificacaoSolicitacao": "${PP3606.PP3665('codigo_identificacao_solicitacao')}", "codigoIdentificacaoPP0664": "${PP3606.PP3665('PP3281')}"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3668">{"PP4478": "PP0008", "PP4483": "PP0007",PP4481": "PP0001", "Content-Type": "application/json"}</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">PP3708{PP3606.PP3665('PP3753')}/PP3323s</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"PP4478": "PP0008", "PP4483": "PP0007"1","PP4481": "PP0001", "Content-Type": "application/json"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3670">{"PP4478": "PP0009", "PP4483": "PP0007",PP4481": "PP0001", "Content-Type": "application/json"}</camunda:inputParameter>
          <camunda:outputParameter name="PP4145">${S(response)}</camunda:outputParameter>
        </camunda:PP3789>
        <camunda:field name="withError">
          <PP3195>true</PP3195>
        </camunda:field>
        <camunda:field name="PP3585">
          <camunda:string>error_PP3038_debito</camunda:string>
        </camunda:field>
        <camunda:field name="PP4317">
          <PP3195>${statusCode != 200}</PP3195>
        </camunda:field>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1869</bpmn:incoming>
      <bpmn:outgoing>PP1568</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1869" sourceRef="PP4203" targetRef="PP3044" />
    <bpmn:sequenceFlow id="PP1568" sourceRef="PP3044" targetRef="PP2418" />
    <bpmn:sequenceFlow id="PP1711" sourceRef="PP2418" targetRef="PP2396" />
    <bpmn:sequenceFlow id="PP1617" name="Não" sourceRef="PP2259" targetRef="PP2418" />
    <bpmn:sequenceFlow id="PP2179" sourceRef="PP0058" targetRef="PP2259" />
    <bpmn:userPP2865 id="PP3409" name="PP0734" PP3476="PP1406">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3466" type="string" />
          <PP3196 id="PP3468" type="boolean" />
          <PP3196 id="PP3417" type="string" PP3476Value="${PP3417}" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP3467" type="string" />
          <PP3196 id="PP3469" type="string" />
          <PP3196 id="PP4460" type="string" PP3476Value="continuar" />
          <PP3196 id="PP3474" label="Declarou receber Salário" type="domain" PP3476Value="${PP3606.hasVariable(&#34;PP4113&#34;) ? PP4113 : false }" />
          <PP3196 id="PP3392" label="Customer Session ID" type="string" />
          <PP3196 id="PP3637" label="PP2237 SPI" type="domain" PP3476Value="${PP3606.hasVariable(&#39;PP3637&#39;) ? PP3637 : false }" />
          <PP3196 id="PP3851" type="domain" PP3476Value="${PP3606.hasVariable(&#39;PP4148&#39;) ? PP4148: null}" />
        </camunda:formData>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3600">PP3409</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1951</bpmn:incoming>
      <bpmn:incoming>PP1276</bpmn:incoming>
      <bpmn:outgoing>PP1534</bpmn:outgoing>
      <bpmn:outgoing>PP1406</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:PP3162 id="PP0973" attachedToRef="PP3409">
      <bpmn:outgoing>PP1655</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2933">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:endEvent id="PP1001" name="PP3612">
      <bpmn:incoming>PP1655</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0828" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP1655" sourceRef="PP0973" targetRef="PP1001" />
    <bpmn:servicePP2865 id="PP3097" name="PP0204" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">1</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3043">$</camunda:entry>
              <camunda:entry key="PP3045">$</camunda:entry>
              <camunda:entry key="PP4311">$</camunda:entry>
              <camunda:entry key="PP4312">$</camunda:entry>
              <camunda:entry key="response_PP3336">$</camunda:entry>
              <camunda:entry key="PP3328">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3043">${PP3043}</camunda:entry>
              <camunda:entry key="PP3045">${PP3045}</camunda:entry>
              <camunda:entry key="PP4311">${PP3606.hasVariable('PP4311') ? PP4311 : false}</camunda:entry>
              <camunda:entry key="PP4312">${PP3606.hasVariable('PP4312') ?PP4312 : null}</camunda:entry>
              <camunda:entry key="response_PP3336">${PP3606.hasVariable('response_PP3336') ? response_PP3336 : null}</camunda:entry>
              <camunda:entry key="PP3328">${PP3606.PP3665('PP3328')}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1308</bpmn:incoming>
      <bpmn:outgoing>PP1975</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1975" sourceRef="PP3097" targetRef="PP4217" />
    <bpmn:sequenceFlow id="PP1534" name="PP3004" sourceRef="PP3409" targetRef="PP3046">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4460') &amp;&amp; PP4460=="PP3046"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:exclusivePP2253 id="PP2362">
      <bpmn:incoming>PP1651</bpmn:incoming>
      <bpmn:incoming>PP1580</bpmn:incoming>
      <bpmn:outgoing>PP1308</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1651" sourceRef="PP3328" targetRef="PP2362" />
    <bpmn:exclusivePP2253 id="PP2297" name="PP2707" PP3476="PP1580">
      <bpmn:incoming>PP2097</bpmn:incoming>
      <bpmn:outgoing>PP1370</bpmn:outgoing>
      <bpmn:outgoing>PP1580</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1370" name="Sim" sourceRef="PP2297" targetRef="PP4313">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${(PP3606.hasVariable('PP4148') &amp;&amp; PP4148 != null &amp;&amp; PP4148 != "{}" &amp;&amp; PP3606.hasVariable('PP3637') &amp;&amp; PP3637 != "PP4355")}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1580" name="Não" sourceRef="PP2297" targetRef="PP2362" />
    <bpmn:sequenceFlow id="PP2097" sourceRef="PP4225" targetRef="PP2297" />
    <bpmn:userPP2865 id="PP4070" name="PP2732" PP3476="PP2006">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP4070" type="boolean" />
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP3417" type="string" PP3476Value="${PP3417}" />
          <PP3196 id="PP3653" label="Funcional PP2454" type="string">
            <camunda:validation>
              <camunda:constraint name="required" />
            </camunda:validation>
          </PP3196>
          <PP3196 id="PP3851" type="domain" PP3476Value="${PP3606.hasVariable(&#39;PP4148&#39;) ? PP4148: null}" />
        </camunda:formData>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3600">PP4070</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2146</bpmn:incoming>
      <bpmn:incoming>PP1406</bpmn:incoming>
      <bpmn:outgoing>PP2146</bpmn:outgoing>
      <bpmn:outgoing>PP2006</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:PP3162 id="PP0999" attachedToRef="PP4070">
      <bpmn:outgoing>PP1895</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2932">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">P1D</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP2146" name="PP4052" sourceRef="PP4070" targetRef="PP4070">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4070') &amp;&amp; PP4070 != true}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1895" sourceRef="PP0999" targetRef="PP1145" />
    <bpmn:servicePP2865 id="PP3100" name="PP0206" PP3193="${PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">1</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3468">$</camunda:entry>
              <camunda:entry key="PP3466">$</camunda:entry>
              <camunda:entry key="PP3467">$</camunda:entry>
              <camunda:entry key="PP3470">$</camunda:entry>
              <camunda:entry key="PP3471">$</camunda:entry>
              <camunda:entry key="PP3469">$</camunda:entry>
              <camunda:entry key="PP3653">$</camunda:entry>
              <camunda:entry key="possui_restricao">$</camunda:entry>
              <camunda:entry key="possui_restricao_representante">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3468">${PP3468}</camunda:entry>
              <camunda:entry key="PP3466">${PP3466}</camunda:entry>
              <camunda:entry key="PP3467">${PP3467}</camunda:entry>
              <camunda:entry key="PP3470">${PP3470}</camunda:entry>
              <camunda:entry key="PP3471">${PP3471}</camunda:entry>
              <camunda:entry key="PP3469">${PP3469}</camunda:entry>
              <camunda:entry key="PP3653">${PP3653}</camunda:entry>
              <camunda:entry key="possui_restricao">${PP3606.hasVariable('response_PP3329_bacen') &amp;&amp; response_PP3329_bacen != null &amp;&amp; response_PP3329_bacen.possui_restricao != null ? response_PP3329_bacen.possui_restricao : 'null'}</camunda:entry>
              <camunda:entry key="possui_restricao_representante">${PP3606.hasVariable('response_PP3329_bacen_representante') &amp;&amp; response_PP3329_bacen != null &amp;&amp; response_PP3329_bacen.possui_restricao != null ? response_PP3329_bacen.possui_restricao : 'null'}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1620</bpmn:incoming>
      <bpmn:incoming>PP1683</bpmn:incoming>
      <bpmn:incoming>PP2149</bpmn:incoming>
      <bpmn:outgoing>PP1977</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP2006" sourceRef="PP4070" targetRef="PP2384" />
    <bpmn:sequenceFlow id="PP1308" sourceRef="PP2362" targetRef="PP3097" />
    <bpmn:exclusivePP2253 id="PP2352" name="PP2701" PP3476="PP1442">
      <bpmn:incoming>PP2059</bpmn:incoming>
      <bpmn:incoming>PP1677</bpmn:incoming>
      <bpmn:outgoing>PP2230</bpmn:outgoing>
      <bpmn:outgoing>PP1442</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP2230" name="Sim" sourceRef="PP2352" targetRef="PP3591">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP4229.toUpperCase() == 'L' || PP4229 == '4' || PP4229 == '3'}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1442" name="Não" sourceRef="PP2352" targetRef="PP2425" />
    <bpmn:userPP2865 id="PP3592" name="PP0793" PP3476="PP2047">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3574" type="boolean">
            <camunda:properties />
            <camunda:validation>
              <camunda:constraint name="required" />
            </camunda:validation>
          </PP3196>
          <PP3196 id="PP3740" type="domain" PP3476Value="${PP3740}" />
          <PP3196 id="PP3636" type="domain" />
        </camunda:formData>
        <PP3194 PP3601="end">
          <camunda:PP4199 PP4199Format="groovy">if(PP3606.hasVariable('PP3272')){PP3606.PP4250("PP4229", PP3272)}</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1363</bpmn:incoming>
      <bpmn:outgoing>PP2047</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:PP3162 id="PP0951" attachedToRef="PP3592">
      <bpmn:outgoing>PP1449</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2902">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP2047" sourceRef="PP3592" targetRef="PP2425" />
    <bpmn:endEvent id="PP1075" name="PP3612">
      <bpmn:incoming>PP1449</bpmn:incoming>
      <bpmn:errorEventDefinition id="PP0815" errorRef="PP0879" />
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP1449" sourceRef="PP0951" targetRef="PP1075" />
    <bpmn:exclusivePP2253 id="PP2389" name="PP2874" PP3476="PP1873">
      <bpmn:incoming>PP1495</bpmn:incoming>
      <bpmn:outgoing>PP1363</bpmn:outgoing>
      <bpmn:outgoing>PP1873</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1460" sourceRef="PP3591" targetRef="PP2264" />
    <bpmn:sequenceFlow id="PP1363" name="Sim" sourceRef="PP2389" targetRef="PP3592">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${((PP3272 == 'L' &amp;&amp; (PP4231 == '3' || PP4231 == 'I')) || (PP3272 == '4' &amp;&amp; (PP4231 == '3' || PP4231 == 'L' || PP4231 == 'I'))) || PP4266 != "Nenhuma" &amp;&amp; PP4266 != "nenhuma" }</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1873" name="Não" sourceRef="PP2389" targetRef="PP2425" />
    <bpmn:sequenceFlow id="PP1669" sourceRef="PP3046" targetRef="PP3336" />
    <bpmn:sequenceFlow id="PP1562" sourceRef="PP2259" targetRef="PP4203">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${(PP3606.hasVariable('PP4148') &amp;&amp; PP4148 != null &amp;&amp; PP4148 != "{}" &amp;&amp; PP3606.hasVariable('PP3637') &amp;&amp; PP3637 != "PP4355")}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:exclusivePP2253 id="PP2358" PP3476="PP1635">
      <bpmn:incoming>PP1893</bpmn:incoming>
      <bpmn:outgoing>PP1635</bpmn:outgoing>
      <bpmn:outgoing>PP1731</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:exclusivePP2253 id="PP2382">
      <bpmn:incoming>PP2155</bpmn:incoming>
      <bpmn:incoming>PP1731</bpmn:incoming>
      <bpmn:outgoing>PP1770</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1893" sourceRef="PP2327" targetRef="PP2358" />
    <bpmn:sequenceFlow id="PP1635" sourceRef="PP2358" targetRef="PP3885" />
    <bpmn:sequenceFlow id="PP2155" sourceRef="PP3570" targetRef="PP2382" />
    <bpmn:sequenceFlow id="PP1770" sourceRef="PP2382" targetRef="PP2285" />
    <bpmn:sequenceFlow id="PP1731" name="PP2756" sourceRef="PP2358" targetRef="PP2382">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${(PP3606.hasVariable('PP4148') &amp;&amp; PP4148 != null &amp;&amp; PP4148 != "{}" &amp;&amp; PP3606.hasVariable('PP3637') &amp;&amp; PP3637 != "PP4355")}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1406" sourceRef="PP3409" targetRef="PP4070" />
    <bpmn:sequenceFlow id="PP1283" sourceRef="PP3513" targetRef="PP3745" />
    <bpmn:sequenceFlow id="PP1653" sourceRef="PP3745" targetRef="PP3415" />
    <bpmn:servicePP2865 id="PP3569" name="PP2845" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">1</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3753">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3753">${PP3753}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3912">true</camunda:inputParameter>
          <camunda:inputParameter name="PP3483">true</camunda:inputParameter>
          <camunda:inputParameter name="PP3481">true</camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1658</bpmn:incoming>
      <bpmn:outgoing>PP1312</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1658" sourceRef="PP3092" targetRef="PP3569" />
    <bpmn:sequenceFlow id="PP1312" sourceRef="PP3569" targetRef="PP2419" />
    <bpmn:exclusivePP2253 id="PP2271" name="PP2873" PP3476="PP1412">
      <bpmn:incoming>PP2119</bpmn:incoming>
      <bpmn:outgoing>PP1412</bpmn:outgoing>
      <bpmn:outgoing>PP1479</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:servicePP2865 id="PP3511" name="PP3013" camunda:modelerTemplate="PP3966" camunda:modelerTemplateVersion="1" PP3476="PP1791" PP3191="true" PP3193="${operacaoPostDelegate}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3668">{"PP4478":"PP0005","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"PP4478":"PP0008","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3670">{"PP4478":"PP0009","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="urlDev">PP3712</camunda:inputParameter>
          <camunda:inputParameter name="PP4363">PP3714</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">PP3716</camunda:inputParameter>
          <camunda:inputParameter name="bodyDev">{"PP3753": "${PP3753}","PP3635": "${PP3635}","sub_PP3635": "spi-turnover","PP3567":[{"id": "PP3053","valor": "${PP3053_logada}"}]}</camunda:inputParameter>
          <camunda:inputParameter name="bodyProd">{"PP3753": "${PP3753}","PP3635": "${PP3635}","sub_PP3635": "spi-turnover","PP3567":[{"id": "PP3053","valor": "${PP3053_logada}"}]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3158">{"PP3753": "${PP3753}","PP3635": "${PP3635}","sub_PP3635": "spi-turnover","PP3567":[{"id": "PP3053","valor": "${PP3053_logada}"}]}</camunda:inputParameter>
          <camunda:outputParameter name="PP4152">${S(response)}</camunda:outputParameter>
        </camunda:PP3789>
        <camunda:field name="withError">
          <PP3195>true</PP3195>
        </camunda:field>
        <camunda:field name="PP3585">
          <camunda:string>erro_PP3510</camunda:string>
        </camunda:field>
        <camunda:field name="PP4317">
          <PP3195>${statusCode != 200}</PP3195>
        </camunda:field>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1479</bpmn:incoming>
      <bpmn:outgoing>PP1791</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP3162 id="PP1078" attachedToRef="PP3511">
      <bpmn:outgoing>PP1423</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0841" />
    </bpmn:PP3162>
    <bpmn:PP4199PP2865 id="PP3108" name="PP0209" PP3476="PP1883" PP3191="true" PP4199Format="groovy">
      <bpmn:incoming>PP1423</bpmn:incoming>
      <bpmn:incoming>PP1791</bpmn:incoming>
      <bpmn:outgoing>PP1883</bpmn:outgoing>
      <bpmn:PP4199>def jsonSlurperClassic = new groovy.json.JsonSlurperClassic();
    PP3606.PP4250("PP4152_json", jsonSlurperClassic.parseText(PP4152.toString()))
PP3606.PP4250("PP4152_json",PP4152_json)
if (PP3606.hasVariable("PP4152") &amp;
    &amp;
    PP4152 != null &amp;
    &amp;
    PP4152?.toString() != "{
      }") {
      def PP4229 = PP4152_json?.PP4229?.PP3272 PP3606.PP4250("PP4229",PP4229)
def PP3135 = PP3606.PP3665("PP3135") ?: falsePP3606.PP4250("PP3135", PP3135)
if (PP3135 == true) {
      def PP3917 = PP3606.PP3665("PP3917")
PP3606.PP4250("PP3917", PP3917)}
else {
      def PP3917 = PP3606.PP3665("PP3917")
if (PP3917 == null &amp;
    &amp;
    PP4152_json?.inss?.beneficio == false) {
      PP3917 = null}
    else if (PP3917 == null) {
      PP3917 = PP4152_json?.inss?.PP3736}
    PP3606.PP4250("PP3917", PP3917)}
def PP4233 = PP4152_json?.PP4229?.PP4233 PP3606.PP4250("PP4233", PP4233)
def PP3547 = PP4152_json?.PP3547?.PP3547PP3606.PP4250("PP3547", PP3547)
if (PP3547 == false) {
      def PP3890 = PP4152_json?.PP3547?.PP3890 PP3606.PP4250("PP3890", PP3890)
def PP4159 = PP4152_json?.PP3547?.PP4159PP3606.PP4250("PP4159", PP4159)}
def PP3865 = PP4152_json?.PP3865PP3606.PP4250("PP3865", PP3865)}}
else {
      PP3606.PP4250("PP3135", false)
PP3606.PP4250("PP3917",null)
PP3606.PP4250("PP3547", false)}
    PP3606.PP4250("nome_receita_federal", "NAO INFORMPP0014O")</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:sequenceFlow id="PP2119" sourceRef="PP3782" targetRef="PP2271" />
    <bpmn:sequenceFlow id="PP1423" sourceRef="PP1078" targetRef="PP3108" />
    <bpmn:sequenceFlow id="PP1791" sourceRef="PP3511" targetRef="PP3108" />
    <bpmn:sequenceFlow id="PP1883" sourceRef="PP3108" targetRef="PP2292" />
    <bpmn:sequenceFlow id="PP1412" name="PP2635" sourceRef="PP2271" targetRef="PP2292" />
    <bpmn:sequenceFlow id="PP1479" sourceRef="PP2271" targetRef="PP3511">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4355') &amp;&amp; PP4355 == true}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:servicePP2865 id="PP3332" name="PP3030" camunda:modelerTemplate="PP3966" camunda:modelerTemplateVersion="1" PP3191="true" PP3193="${operacaoPostDelegate}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="bodyDev">{"id_origem": 13,"credencial": {"id_tipo": 2,"valor": "${PP3753}"}}</camunda:inputParameter>
          <camunda:inputParameter name="PP3158">{"id_origem": 13,"credencial": {"id_tipo": 2,"valor": "${PP3753}"}}</camunda:inputParameter>
          <camunda:inputParameter name="bodyProd">{"id_origem": 13,"credencial": {"id_tipo": 2,"valor": "${PP3753}"}}</camunda:inputParameter>
          <camunda:inputParameter name="urlDev">PP3709</camunda:inputParameter>
          <camunda:inputParameter name="PP4363">PP3724</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">PP3702</camunda:inputParameter>
          <camunda:inputParameter name="PP3668">{"PP4478":"PP0005","PP4484": "PW2","PP4481": "PP0001" }</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"PP4478":"PP0008","PP4484": "PW2","PP4481": "PP0001" }</camunda:inputParameter>
          <camunda:inputParameter name="PP3670">{"PP4478":"PP0009","PP4484": "PW2","PP4481": "PP0001" }</camunda:inputParameter>
          <camunda:outputParameter name="PP4093">${S(response)}</camunda:outputParameter>
        </camunda:PP3789>
        <camunda:field name="withError">
          <PP3195>true</PP3195>
        </camunda:field>
        <camunda:field name="PP3585">
          <camunda:string>ERROR_PW2_PP2800ARCH</camunda:string>
        </camunda:field>
        <camunda:field name="PP4317">
          <PP3195>${statusCode == 404}</PP3195>
        </camunda:field>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2049</bpmn:incoming>
      <bpmn:outgoing>PP2071</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:servicePP2865 id="PP3177" name="PP3029" camunda:modelerTemplate="operacao-post" camunda:modelerTemplateVersion="1" PP3193="${operacaoPostDelegate}">
      <bpmn:extensionElements>
        <camunda:field name="withError">
          <PP3195>false</PP3195>
        </camunda:field>
        <camunda:PP3789>
          <camunda:inputParameter name="urlDev">PP3711</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">PP3704</camunda:inputParameter>
          <camunda:inputParameter name="PP4363">PP3726</camunda:inputParameter>
          <camunda:inputParameter name="bodyDev">{"credencial1": {"id_tipo": 1,"valor": "${PP3383}"},"credencial2": {"id_tipo": 2,"valor": "${PP3753}"}}</camunda:inputParameter>
          <camunda:inputParameter name="PP3158">{"credencial1": {"id_tipo": 1,"valor": "${PP3383}"},"credencial2": {"id_tipo": 2,"valor": "${PP3753}"}}</camunda:inputParameter>
          <camunda:inputParameter name="bodyProd">{"credencial1": {"id_tipo": 1,"valor": "${PP3383}"},"credencial2": {"id_tipo": 2,"valor": "${PP3753}"}}</camunda:inputParameter>
          <camunda:inputParameter name="PP3668">{"PP4478":"PP0005","PP4484":"PW2","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"PP4478":"PP0008","PP4484":"PW2","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3670">{"PP4478":"PP0009","PP4484":"PW2","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:outputParameter name="PP4095">${S(response)}</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1515</bpmn:incoming>
      <bpmn:outgoing>PP1877</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:servicePP2865 id="PP3059" name="PP3028" camunda:modelerTemplate="operacao-post" camunda:modelerTemplateVersion="1" PP3193="${operacaoPostDelegate}">
      <bpmn:extensionElements>
        <camunda:field name="withError">
          <PP3195>false</PP3195>
        </camunda:field>
        <camunda:PP3789>
          <camunda:inputParameter name="urlDev">PP3710</camunda:inputParameter>
          <camunda:inputParameter name="PP4363">PP3725</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">PP3703</camunda:inputParameter>
          <camunda:inputParameter name="bodyDev">{"id_origem": 13,"id_situacao": 3,"credencial": {"id_tipo": 2,"valor": "${PP3753}"}}</camunda:inputParameter>
          <camunda:inputParameter name="PP3158">{"id_origem": 13,"id_situacao": 3,"credencial": {"id_tipo": 2,"valor": "${PP3753}"}}</camunda:inputParameter>
          <camunda:inputParameter name="bodyProd">{"id_origem": 13,"id_situacao": 3,"credencial": {"id_tipo": 2,"valor": "${PP3753}"}}</camunda:inputParameter>
          <camunda:inputParameter name="PP3668">{"PP4478":"PP0005","PP4484":"PW2","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"PP4478":"PP0008","PP4484":"PW2","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3670">{"PP4478":"PP0009","PP4484":"PW2","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:outputParameter name="PP4094">${S(response)}</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2071</bpmn:incoming>
      <bpmn:outgoing>PP2192</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:exclusivePP2253 id="PP2266">
      <bpmn:incoming>PP1877</bpmn:incoming>
      <bpmn:incoming>PP2192</bpmn:incoming>
      <bpmn:outgoing>PP1784</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:intermediateThrowEvent id="PP0944" name="PP0571">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:outputParameter name="PP3735">${PP3606.hasVariable("PP4095") ?PP3606.PP3665('PP4095').prop('id_PP4364_autenticacao').value():PP3606.PP3665('pw2_PP3329_clien te').prop('data').prop('id_PP4364_autenticacao').value()}</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1784</bpmn:incoming>
      <bpmn:outgoing>PP2153</bpmn:outgoing>
    </bpmn:intermediateThrowEvent>
    <bpmn:PP3162 id="PP0930" attachedToRef="PP3332">
      <bpmn:outgoing>PP1515</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0844" />
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP2071" sourceRef="PP3332" targetRef="PP3059" />
    <bpmn:sequenceFlow id="PP1515" sourceRef="PP0930" targetRef="PP3177" />
    <bpmn:sequenceFlow id="PP1877" sourceRef="PP3177" targetRef="PP2266" />
    <bpmn:sequenceFlow id="PP2192" sourceRef="PP3059" targetRef="PP2266" />
    <bpmn:sequenceFlow id="PP1784" sourceRef="PP2266" targetRef="PP0944" />
    <bpmn:sequenceFlow id="PP2049" sourceRef="PP2427" targetRef="PP3332" />
    <bpmn:sequenceFlow id="PP2153" sourceRef="PP0944" targetRef="PP3298" />
    <bpmn:PP4199PP2865 id="PP0110" name="PP2954" PP4199Format="groovy">
      <bpmn:incoming>PP1823</bpmn:incoming>
      <bpmn:outgoing>PP1936</bpmn:outgoing>
      <bpmn:PP4199>PP3606.PP4250('PP3313_pedido_analise_PP3643',PP4162.toString())if(S(PP3606.PP3665('PP4162')).hasProp('PP3313')) {
      PP3606.PP4250('PP3313_analise_PP3643',S(PP3606.PP3665('PP4162')).prop('PP3313').value()) }else{
      PP3606.PP4250('PP3313_analise_PP3643',null) }if(S(PP3606.PP3665('PP4162')).hasProp('PP3819_id')) {
      PP3606.PP4250('PP3819_id',S(PP3606.PP3665('PP4162')).prop('PP3819_id').value()) }else{
      PP3606.PP4250('PP3819_id',null) }if(S(PP3606.PP3665('PP4162')).hasProp('sla_PP4169_PP3643')) {
      PP3606.PP4250('sla_PP4169_PP3643',S(PP3606.PP3665('PP4162')).prop('sla_calculado').value()) }else{
      PP3606.PP4250('sla_PP4169_PP3643',null) }</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:exclusivePP2253 id="PP2377" PP3476="PP2036">
      <bpmn:incoming>PP1936</bpmn:incoming>
      <bpmn:incoming>PP2027</bpmn:incoming>
      <bpmn:outgoing>PP2036</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP2036" sourceRef="PP2377" targetRef="PP2387" />
    <bpmn:sequenceFlow id="PP1936" sourceRef="PP0110" targetRef="PP2377" />
    <bpmn:PP4199PP2865 id="PP0088" name="PP2821" PP4199Format="groovy" camunda:resultVariable="analise_biocatch">
      <bpmn:extensionElements>
        <PP3194 PP3601="start">
          <camunda:PP4199 PP4199Format="javaPP4199">var dateUpdate = new Date();dateUpdate.setTime(dateUpdate.getTime() + dateUpdate.getTimezoneOffset() * 60 * 1000 /* convert to UTC */ - (/* UTC-6 */ 6) * 60 * 60 * 1000); PP3606.PP4250("PP3437", dateUpdate.toISOString())</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1977</bpmn:incoming>
      <bpmn:outgoing>PP1813</bpmn:outgoing>
      <bpmn:PP4199>import groovy.json.JsonBuilder
PP3606.PP4250("id_operacao_biocatch",UUID.randomUUID().toString())
def PP3759 = PP3606.PP3665("PP3759") ;
def id_inquilino = PP3606.PP3665("id_inquilino");
def id_cadastro_PP4305rario = PP3606.PP3665("PP3761");
def id_PP3248 = PP3606.PP3665("PP3753");
def PP3200_origem = PP3606.PP3665("codigo_PP3200");
def PP3392 = PP3606.PP3665("PP3392");
def session_id = PP3606.PP3665("session_id");
def PP3284 = PP3606.PP3665("PP3284");
def PP3285 = PP3606.PP3665("PP3285");
def user_agent = PP3606.PP3665("user_agent");
def PP4421_digitais = ["PP3392": PP3392,"session_id": session_id,"ipv4": PP3284,"ipv6": PP3285,"user_agent": user_agent]
def analise = ["pedido_de_analise": ["id": PP3606.PP3665("id_operacao_biocatch"),"tipo_de_operacao": "BIOCATCH APP0529OUNT OPEN ENRIQUECIMENTO","solicitada_em": PP3606.PP3665("PP3437"),"operacao": ["PP3417": ["PP3759": PP3759,"PP3200_origem": codigo_PP3200,"PP4326": "C"],"dados_PP3170is": ["PP3248": ["id_PP3248": PP3753,"id_inquilino": id_inquilino,"id_cadastro_PP4305rario": id_cadastro_PP4305rario]],"PP4421_digitais": ["PP3392": PP3392,"session_id": session_id,"ipv4": PP3284,"ipv6": PP3285,"user_agent": user_agent]]]]
def jsonString = new JsonBuilder()jsonString(analise)
return jsonString.toString();</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:sequenceFlow id="PP1977" sourceRef="PP3100" targetRef="PP0088" />
    <bpmn:servicePP2865 id="PP0099" name="PP3012" camunda:modelerTemplate="PP3966" camunda:modelerTemplateVersion="1" PP3191="true" PP3193="${operacaoPostDelegate}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3670">{"PP4476": "79y19artg0","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"PP4476": "pw5sqe8xlh","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3668">{"PP4476": "4hith7ep8c","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="urlDev">PP3688</camunda:inputParameter>
          <camunda:inputParameter name="PP4363">PP3694</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">PP3700</camunda:inputParameter>
          <camunda:inputParameter name="bodyProd">${analise_biocatch}</camunda:inputParameter>
          <camunda:inputParameter name="PP3158">${analise_biocatch}</camunda:inputParameter>
          <camunda:inputParameter name="bodyDev">${analise_biocatch}</camunda:inputParameter>
          <camunda:outputParameter name="PP4162">${S(response)}</camunda:outputParameter>
        </camunda:PP3789>
        <camunda:field name="withError">
          <PP3195>true</PP3195>
        </camunda:field>
        <camunda:field name="PP3585">
          <camunda:string>ERROR_BIOCATCH</camunda:string>
        </camunda:field>
        <camunda:field name="PP4317">
          <PP3195>${statusCode != 200}</PP3195>
        </camunda:field>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1813</bpmn:incoming>
      <bpmn:outgoing>PP1823</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP3162 id="PP0963" attachedToRef="PP0099">
      <bpmn:outgoing>PP2027</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0808" />
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1813" sourceRef="PP0088" targetRef="PP0099" />
    <bpmn:sequenceFlow id="PP1823" sourceRef="PP0099" targetRef="PP0110" />
    <bpmn:sequenceFlow id="PP2027" sourceRef="PP0963" targetRef="PP2377" />
    <bpmn:servicePP2865 id="PP3338" name="PP0660" camunda:modelerTemplate="PP3965" camunda:modelerTemplateVersion="1" PP3191="true" PP3193="${PP3967}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3668">{"PP4478":"PP0005","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"PP4478":"PP0008","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3670">{"PP4478":"PP0009","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP4107">?id_PP3248=${PP3606.PP3665('PP3753')}</camunda:inputParameter>
          <camunda:inputParameter name="PP4108">?id_PP3248=${PP3606.PP3665('PP3753')}</camunda:inputParameter>
          <camunda:inputParameter name="PP4109">?id_PP3248=${PP3606.PP3665('PP3753')}</camunda:inputParameter>
          <camunda:inputParameter name="urlDev">PP3713{PP3606.PP3665('PP3757_bacen')}</camunda:inputParameter>
          <camunda:inputParameter name="PP4363">PP3713{PP3606.PP3665('PP3757_bacen')}</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">PP3715{PP3606.PP3665('PP3757_bacen')}</camunda:inputParameter>
          <camunda:outputParameter name="PP4146">${S(response)}</camunda:outputParameter>
        </camunda:PP3789>
        <camunda:field name="withError">
          <PP3195>true</PP3195>
        </camunda:field>
        <camunda:field name="PP3585">
          <camunda:string>PP0538_BCN</camunda:string>
        </camunda:field>
        <camunda:field name="PP4317">
          <PP3195>${statusCode != 200}</PP3195>
        </camunda:field>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1938</bpmn:incoming>
      <bpmn:outgoing>PP1346</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:exclusivePP2253 id="PP2323" name="PP2708" PP3476="PP1865">
      <bpmn:incoming>PP1576</bpmn:incoming>
      <bpmn:outgoing>PP1865</bpmn:outgoing>
      <bpmn:outgoing>PP1903</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:exclusivePP2253 id="PP2384" name="PP0654" PP3476="PP1938">
      <bpmn:incoming>PP2006</bpmn:incoming>
      <bpmn:outgoing>PP1620</bpmn:outgoing>
      <bpmn:outgoing>PP1938</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:servicePP2865 id="PP3101" name="PP0203" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">4</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3468">$</camunda:entry>
              <camunda:entry key="PP3466">$</camunda:entry>
              <camunda:entry key="PP3467">$</camunda:entry>
              <camunda:entry key="PP3470">$</camunda:entry>
              <camunda:entry key="PP3471">$</camunda:entry>
              <camunda:entry key="PP3469">$</camunda:entry>
              <camunda:entry key="PP3653">$</camunda:entry>
              <camunda:entry key="possui_restricao">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3468">${PP3468}</camunda:entry>
              <camunda:entry key="PP3466">${PP3466}</camunda:entry>
              <camunda:entry key="PP3467">${PP3467}</camunda:entry>
              <camunda:entry key="PP3470">${PP3470}</camunda:entry>
              <camunda:entry key="PP3471">${PP3471}</camunda:entry>
              <camunda:entry key="PP3469">${PP3469}</camunda:entry>
              <camunda:entry key="PP3653">${PP3653}</camunda:entry>
              <camunda:entry key="possui_restricao">${PP3606.hasVariable('response_PP3329_bacen') &amp;&amp; response_PP3329_bacen != null &amp;&amp; response_PP3329_bacen.possui_restricao != null ? response_PP3329_bacen.possui_restricao : 'null'}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1903</bpmn:incoming>
      <bpmn:incoming>PP1845</bpmn:incoming>
      <bpmn:outgoing>PP1679</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1865" name="Não" sourceRef="PP2323" targetRef="PP2306" />
    <bpmn:sequenceFlow id="PP1620" name="Não" sourceRef="PP2384" targetRef="PP3100">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable("PP3329r_bacen") &amp;&amp; PP3329r_bacen == false}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1938" name="Sim" sourceRef="PP2384" targetRef="PP3338" />
    <bpmn:sequenceFlow id="PP1903" name="Sim" sourceRef="PP2323" targetRef="PP3101">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('response_PP3329_bacen') &amp;&amp; (response_PP3329_bacen.status_PP4039 != "SUCESSO" || (response_PP3329_bacen.possui_restricao != null &amp;&amp; response_PP3329_bacen.possui_restricao == true) )}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:PP4199PP2865 id="PP4219" name="PP2819" PP3191="true" PP4199Format="groovy">
      <bpmn:incoming>PP1346</bpmn:incoming>
      <bpmn:outgoing>PP1576</bpmn:outgoing>
      <bpmn:PP4199>def jsonSlurperClassic = new groovy.json.JsonSlurperClassic();
    PP3606.PP4250("response_PP3329_bacen", jsonSlurperClassic.parseText(PP4146.toString())) PP3606.PP4250("response_PP3329_bacen",response_PP3329_bacen)</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:sequenceFlow id="PP1346" sourceRef="PP3338" targetRef="PP4219" />
    <bpmn:sequenceFlow id="PP1576" sourceRef="PP4219" targetRef="PP2323" />
    <bpmn:PP3162 id="PP1143" attachedToRef="PP3338">
      <bpmn:outgoing>PP1845</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0829" />
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1845" sourceRef="PP1143" targetRef="PP3101" />
    <bpmn:businessRulePP2865 id="PP3316" name="PP0649" camunda:resultVariable="PP3329r_bacen" camunda:decisionRef="PP3463" camunda:mapDecisionResult="singleEntry">
      <bpmn:incoming>PP1592</bpmn:incoming>
      <bpmn:incoming>PP1697</bpmn:incoming>
      <bpmn:outgoing>PP1285</bpmn:outgoing>
    </bpmn:businessRulePP2865>
    <bpmn:sequenceFlow id="PP1285" sourceRef="PP3316" targetRef="PP2435" />
    <bpmn:sequenceFlow id="PP1679" sourceRef="PP3101" targetRef="PP2332" />
    <bpmn:intermediateThrowEvent id="PP1180" name="PP0796">
      <bpmn:incoming>PP1768</bpmn:incoming>
      <bpmn:incoming>PP1320</bpmn:incoming>
      <bpmn:linkEventDefinition id="PP2546" name="PP3205" />
    </bpmn:intermediateThrowEvent>
    <bpmn:intermediateCatchEvent id="PP1044" name="PP0802">
      <bpmn:outgoing>PP1483</bpmn:outgoing>
      <bpmn:linkEventDefinition id="PP2547" name="PP3205" />
    </bpmn:intermediateCatchEvent>
    <bpmn:sequenceFlow id="PP1483" sourceRef="PP1044" targetRef="PP3896" />
    <bpmn:exclusivePP2253 id="PP2409" name="PP2872" PP3476="PP1592">
      <bpmn:incoming>PP1433</bpmn:incoming>
      <bpmn:outgoing>PP1619</bpmn:outgoing>
      <bpmn:outgoing>PP1592</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:exclusivePP2253 id="PP2338" name="PP2869">
      <bpmn:incoming>PP1619</bpmn:incoming>
      <bpmn:outgoing>PP2046</bpmn:outgoing>
      <bpmn:outgoing>PP1662</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:exclusivePP2253 id="PP2431" name="PP4488" PP3476="PP1433">
      <bpmn:incoming>PP1871</bpmn:incoming>
      <bpmn:outgoing>PP1433</bpmn:outgoing>
      <bpmn:outgoing>PP1596</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:servicePP2865 id="PP3514" name="PP3014" camunda:modelerTemplate="PP3966" camunda:modelerTemplateVersion="1" PP3191="true" PP3193="${operacaoPostDelegate}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3668">{"PP4478":"PP0005","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"PP4478":"PP0008","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3670">{"PP4478":"PP0009","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="urlDev">PP3712</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">PP3716</camunda:inputParameter>
          <camunda:inputParameter name="PP4363">PP3714</camunda:inputParameter>
          <camunda:inputParameter name="bodyDev">{"PP3753": "${PP3754}","PP3635": "${PP3635}","sub_PP3635": "","PP3567":[{"id":"PP3053","valor":"${PP3053_logada}"}]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3158">{"PP3753": "${PP3754}","PP3635": "${PP3635}","sub_PP3635": "","PP3567":[{"id":"PP3053","valor":"${PP3053_logada}"}]}</camunda:inputParameter>
          <camunda:inputParameter name="bodyProd">{"PP3753": "${PP3754}","PP3635": "${PP3635}","sub_PP3635": "","PP3567":[{"id":"PP3053","valor":"${PP3053_logada}"}]}</camunda:inputParameter>
          <camunda:outputParameter name="PP4153">${S(response)}</camunda:outputParameter>
        </camunda:PP3789>
        <camunda:field name="withError">
          <PP3195>true</PP3195>
        </camunda:field>
        <camunda:field name="PP3585">
          <camunda:string>erro_PP3510_representante</camunda:string>
        </camunda:field>
        <camunda:field name="PP4317">
          <PP3195>${statusCode != 200}</PP3195>
        </camunda:field>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2046</bpmn:incoming>
      <bpmn:outgoing>PP1950</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:servicePP2865 id="PP3515" name="PP3014" camunda:modelerTemplate="PP3966" camunda:modelerTemplateVersion="1" PP3191="true" PP3193="${operacaoPostDelegate}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3668">{"PP4478":"PP0005","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"PP4478":"PP0008","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3670">{"PP4478":"PP0009","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="urlDev">PP3712</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">PP3716</camunda:inputParameter>
          <camunda:inputParameter name="PP4363">PP3714</camunda:inputParameter>
          <camunda:inputParameter name="bodyDev">{"PP3753": "${PP3754}","PP3635": "${PP3635}","sub_PP3635": ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3158">{"PP3753": "${PP3754}","PP3635": "${PP3635}","sub_PP3635": ""}</camunda:inputParameter>
          <camunda:inputParameter name="bodyProd">{"PP3753": "${PP3754}","PP3635": "${PP3635}","sub_PP3635": ""}</camunda:inputParameter>
          <camunda:outputParameter name="PP4153">${S(response)}</camunda:outputParameter>
        </camunda:PP3789>
        <camunda:field name="withError">
          <PP3195>true</PP3195>
        </camunda:field>
        <camunda:field name="PP3585">
          <camunda:string>erro_PP3510</camunda:string>
        </camunda:field>
        <camunda:field name="PP4317">
          <PP3195>${statusCode != 200}</PP3195>
        </camunda:field>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1662</bpmn:incoming>
      <bpmn:outgoing>PP1935</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP4199PP2865 id="PP3111" name="PP0212" PP3191="true" PP4199Format="groovy">
      <bpmn:incoming>PP1745</bpmn:incoming>
      <bpmn:incoming>PP2229</bpmn:incoming>
      <bpmn:incoming>PP1950</bpmn:incoming>
      <bpmn:incoming>PP1935</bpmn:incoming>
      <bpmn:outgoing>PP1697</bpmn:outgoing>
      <bpmn:PP4199>import groovy.json.JsonSlurperClassic
def jsonSlurperClassic = new JsonSlurperClassic()
PP3606.PP4250("PP4153_json", jsonSlurperClassic.parseText(PP4153.toString()))
PP3606.PP4250("PP4153_json",PP4153_json)
if (PP3606.hasVariable("PP4153") &amp;
    &amp;
    PP4153 != null &amp;
    &amp;
    PP4153?.toString() != "{
      }") {
      def PP3547 = PP4153_json.PP3547.PP3547 PP3606.PP4250("PP3547", PP3547)
if (PP3547 == false) {
      def PP3890 = PP4153_json.PP3547.PP3890 PP3606.PP4250("PP3890", PP3890)
def PP4159 = PP4153_json.PP3547.PP4159PP3606.PP4250("PP4159", PP4159) def PP3865 = PP4153_json.PP3865PP3606.PP4250("PP3865", PP3865)}
def PP3757_bacen_representante = PP4153_json.bacen?.PP3757 PP3606.PP4250("PP3757_bacen_representante",PP3757_bacen_representante)
if (PP3757_bacen_representante == null) {
      PP3606.PP4250("PP3890", "")
PP3606.PP4250("PP4159", "")
PP3606.PP4250("PP3865", "")}}
else {
      PP3606.PP4250("PP3547", false)}
PP3606.PP4250("nome_receita_federal", "NAO INFORMPP0014O")</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:PP3162 id="PP1097" attachedToRef="PP3515">
      <bpmn:outgoing>PP1745</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0846" />
    </bpmn:PP3162>
    <bpmn:PP3162 id="PP0981" attachedToRef="PP3514">
      <bpmn:outgoing>PP2229</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0811" />
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1433" name="Sim" sourceRef="PP2431" targetRef="PP2409" />
    <bpmn:sequenceFlow id="PP1619" name="Sim" sourceRef="PP2409" targetRef="PP2338">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP3383_representante') &amp;&amp; PP3383_representante != "" &amp;&amp; PP3383_representante != null} </bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP2046" name="Sim" sourceRef="PP2338" targetRef="PP3514">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${(PP3606.hasVariable('PP3053_logada') &amp;&amp; PP3053_logada != null &amp;&amp; PP3053_logada != "")}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1662" name="Não" sourceRef="PP2338" targetRef="PP3515" />
    <bpmn:sequenceFlow id="PP1745" sourceRef="PP1097" targetRef="PP3111" />
    <bpmn:sequenceFlow id="PP2229" sourceRef="PP0981" targetRef="PP3111" />
    <bpmn:sequenceFlow id="PP1950" sourceRef="PP3514" targetRef="PP3111" />
    <bpmn:sequenceFlow id="PP1935" sourceRef="PP3515" targetRef="PP3111" />
    <bpmn:sequenceFlow id="PP1871" sourceRef="PP3107" targetRef="PP2431" />
    <bpmn:sequenceFlow id="PP1596" name="Não" sourceRef="PP2431" targetRef="PP2435">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP3547') ? (PP3547 == false || PP3547 == "false") : true}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1592" name="Não" sourceRef="PP2409" targetRef="PP3316" />
    <bpmn:sequenceFlow id="PP1697" sourceRef="PP3111" targetRef="PP3316" />
    <bpmn:exclusivePP2253 id="PP2419" name="PP2868" PP3476="PP1427">
      <bpmn:incoming>PP1312</bpmn:incoming>
      <bpmn:outgoing>PP1427</bpmn:outgoing>
      <bpmn:outgoing>PP1985</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1427" name="Não" sourceRef="PP2419" targetRef="PP3418" />
    <bpmn:sequenceFlow id="PP1985" name="Sim" sourceRef="PP2419" targetRef="PP4207">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP3383_representante') &amp;&amp; PP3383_representante != "" &amp;&amp; PP3383_representante != null}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:PP4199PP2865 id="PP4205" name="PP2810" PP4199Format="groovy">
      <bpmn:extensionElements>
        <PP3194 PP3601="start">
          <camunda:PP4199 PP4199Format="javaPP4199">var dateUpdate = new Date();dateUpdate.setTime(dateUpdate.getTime() + dateUpdate.getTimezoneOffset() * 60 * 1000 /* convert to UTC */ - (/* UTC-6 */ 6) * 60 * 60 * 1000);PP3606.PP4250("PP3437", dateUpdate.toISOString())</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1474</bpmn:incoming>
      <bpmn:outgoing>PP1695</bpmn:outgoing>
      <bpmn:PP4199>import static net.logstash.logPP3123.argument.StructuredArguments.value
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.PP4318.Instant
import java.PP4318.Duration
final Logger logger = LoggerFactory.getLogger("PP3165")Instant inicio = Instant.now()
def datePart = PP3606.PP3665("PP3437");
    def valiPP3394aoPP2866 = ["nivel_completude" : 200,"modo_PP3317" : 2,"fonte_PP3317" : 3,"status" : 1,"data_valiPP3394ao_fonte" : datePart,"informacoes" : "PP4304 compovado por sms."]def relacionamento_PP4304 = ["codigo_agrupamento_PP4044": 2,"PP3277": "PP0631","codigo_finalidade": 12227,"codigo_classe_PP4044": 6,"codigo_nome_PP4044_PP3969": 14554]def valiPP3394aoPP0780 = ["nivel_completude" : 200,"modo_PP3317" : 2,"fonte_PP3317" : 3,"status" : 1,"data_valiPP3394ao_fonte" : datePart,"informacoes" : "comprovado por auto declaração."]def relacionamento_PP3550= ["codigo_agrupamento_PP4044": 2,"PP3277": "PP0631","codigo_finalidade": 12225,"codigo_classe_PP4044": 6,"codigo_nome_PP4044_PP3969": 14554]def valiPP3394aoNascimento = ["nivel_completude" : 400,"modo_PP3317" : 6,"fonte_PP3317" : 3,"status" : 1,"data_valiPP3394ao_fonte" : datePart,"informacoes" : "comprovado por auto declaração."]def valiPP3394aoNome = ["nivel_completude" : 400,"modo_PP3317" : 6,"fonte_PP3317" : 3,"status" : 1,"data_valiPP3394ao_fonte" : datePart,"informacoes" : "comprovado por auto declaração."]//nomedef nome = PP3606.PP3665("PP3907")
def PP3903 = ["valor_dado_PP3170l": nome, "PP4380": [valiPP3394aoNome]]//PP2866sdef PP3922 = PP3606.PP3665("PP3922")
def ddd = PP3606.PP3665("PP3438")
def objetoPP2866Principal = ["principal": true, "tipo": 12240,"propositos": [1,4], "ddi": 55, "ddd": ddd, "PP3913": PP3922, "ramal": 0, "data_atualizacao": datePart] def PP4304Principal = ["valor_dado_PP3170l" : objetoPP2866Principal , "PP4380" : [valiPP3394aoPP2866] ] def PP4304sCadastral = [PP4304Principal]//PP0780def PP3550 = PP3606.PP3665("PP3550")
def objetoPP0780 = ["principal": true,"propositos": [1,2], "PP3550": PP3550, "data_atualizacao": datePart]def PP3550Principal = [ "valor_dado_PP3170l": objetoPP0780, "PP4380": [valiPP3394aoPP0780] ]def PP3550Cadastral = [PP3550Principal]//Nascimentodef PP3435 = PP3606.PP3665("PP3435")
def dados_nascimento = ["valor_dado_PP3170l": PP3435, "PP4380":[valiPP3394aoNascimento]]def dados = ["PP4304s": PP4304sCadastral,"PP3435_funPP3394ao": dados_nascimento,"PP3550s": PP3550Cadastral,"PP3907": PP3903];
    PP3606.PP4250("dados_pessoa_temp" ,dados )logger.info("Montagem de campos para atualizar pessoa dados Perfil",value("PP3759" , PP3606.PP3665("PP3759")),value("PP3753" , PP3606.PP3665("PP3753")),value("intencao" , PP3606.PP3665("intencao")),value("correlationId" , PP3606.PP3665("PP4481")),value("PP4305_total_espera" , Duration.between(inicio, Instant.now())))</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:sequenceFlow id="PP1695" sourceRef="PP4205" targetRef="PP3092" />
    <bpmn:sequenceFlow id="PP1881" name="Sim" sourceRef="PP2356" targetRef="PP3098">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP3383_representante') &amp;&amp; PP3383_representante != "" &amp;&amp; PP3383_representante != null} </bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:exclusivePP2253 id="PP2356" name="PP2238" PP3476="PP1598">
      <bpmn:incoming>PP1607</bpmn:incoming>
      <bpmn:outgoing>PP1598</bpmn:outgoing>
      <bpmn:outgoing>PP1881</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1598" name="Não" sourceRef="PP2356" targetRef="PP3405" />
    <bpmn:sequenceFlow id="PP1607" sourceRef="PP2303" targetRef="PP2356" />
    <bpmn:exclusivePP2253 id="PP2337" name="PP2868" PP3476="PP2032">
      <bpmn:incoming>PP1786</bpmn:incoming>
      <bpmn:outgoing>PP2032</bpmn:outgoing>
      <bpmn:outgoing>PP1967</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP2032" sourceRef="PP2337" targetRef="PP3103" />
    <bpmn:PP4199PP2865 id="PP4222" name="PP4423" PP4199Format="groovy">
      <bpmn:incoming>PP1967</bpmn:incoming>
      <bpmn:outgoing>PP1766</bpmn:outgoing>
      <bpmn:PP4199>import static net.logstash.logPP3123.argument.StructuredArguments.value
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.PP4318.Instant
import java.PP4318.Duration
final Logger logger = LoggerFactory.getLogger("PP3165")Instant inicio = Instant.now()
def datePart = PP3606.PP3665("PP3437");
    def dados_pessoa_temp = [:]
def PP3888 = PP3606.hasVariable('PP3888') ? PP3606.PP3665('PP3888') : "";
    //Renda
def valiPP3394aoRenda = ["nivel_completude" : 200,"modo_PP3317" : 2,"fonte_PP3317" : 3,"status" : 1,"data_valiPP3394ao_fonte" : datePart,"informacoes" : PP3888]//PP4127
def PP4127 = PP3606.PP3665("PP4414")
def PP4127_PP3625mento = ["valor_dado_PP3170l": PP4127, "PP4380": [valiPP3394aoRenda]]//semRenda
def sem_PP4127_PP3625mento = ["valor_dado_PP3170l":true, "PP4380": [valiPP3394aoRenda]]if (PP4127==0){
      dados_pessoa_temp.put('sem_PP4127_PP3625mento', sem_PP4127_PP3625mento)}
else {
      dados_pessoa_temp.put('PP4127_PP3625mento', PP4127_PP3625mento)}//PP3562s
def valiPP3394aoEndereco = ["nivel_completude" : 300,"modo_PP3317" : 3,"fonte_PP3317" : 3,"status" : 1,"data_valiPP3394ao_fonte" : datePart,"informacoes" : "comprovado por auto declaração."]def relacionamento_PP3562 = ["codigo_agrupamento_PP4044": 2,"PP3277": "PP0631","codigo_finalidade": 12224,"codigo_classe_PP4044": 6,"codigo_nome_PP4044_PP3969": 14554]//Endereços
def PP4185 = PP3606.PP3665("PP4186")
def PP3913 = PP3606.PP3665("PP3921")
def PP3305 = PP3606.PP3665("PP3307")
def PP3127 = PP3606.PP3665("PP3128")
def PP3242 = PP3606.PP3665("PP3244")
def PP3227 = PP3606.PP3665("PP0531")
def uf = PP3606.PP3665("PP3596")
def objetoEnderecoResidencial = ["principal": true,"propositos": [1,3],"PP3855": PP4185, "PP3913": PP3913,"PP3305": PP3305,"PP3127": PP3127,"PP3242": PP3242,"PP3227": PP3227, "uf": uf, "PP3993": "BR"]def PP3562Residencial = ["valor_dado_PP3170l":objetoEnderecoResidencial,"PP4380": [valiPP3394aoEndereco],"relacionamentos": [relacionamento_PP3562]]
dados_pessoa_temp.put('PP3562s', [PP3562Residencial])
def valiPP3394ao = ["nivel_completude" : 200,"modo_PP3317" : 2,"fonte_PP3317" : 3,"status" : 1,"data_valiPP3394ao_fonte" : datePart,"informacoes" : "comprovado por auto declaração."]def PP3993ResidenciaFiscal = PP3606.PP3665('PP3998')
if (PP3993ResidenciaFiscal != null){
      def objPaisesResidenciaFiscal = ["valor_dado_PP3170l" : [PP3993ResidenciaFiscal],"PP4380" : [valiPP3394ao]] dados_pessoa_temp.put('PP3993es_PP4136_fiscal',objPaisesResidenciaFiscal)}
def nfiNacionalidade = PP3606.PP3665('PP3893' )
if (nfiNacionalidade != null){
      def objNacionalidades = ["valor_dado_PP3170l" : [nfiNacionalidade],"PP4380" : [valiPP3394ao]] dados_pessoa_temp.put('PP3892s',objNacionalidades)}
def nfiNascimento = PP3606.PP3665('PP3996_representante')
if (nfiNascimento != null){
      def objPaisNascimento = ["valor_dado_PP3170l" : nfiNascimento,"PP4380" : [valiPP3394ao]] dados_pessoa_temp.put('PP3996',objPaisNascimento)}if(PP3606.hasVariable('PP3920') &amp;
    &amp;
    PP3606.PP3665('PP3920').length() &gt;
    1){
      def PP3913Nfi = PP3606.PP3665('PP3920')
def PP3524Nif = ["tipo" : 12213,"PP3913" : PP3913Nfi,"identificador": 12421,"PP3993": PP3993ResidenciaFiscal];
    def objDocumentoNif = ["valor_dado_PP3170l":PP3524Nif,"PP4380" : [valiPP3394ao]];
    dados_pessoa_temp.put('PP3524s', [objDocumentoNif])}
    PP3606.PP4250('dados_pessoa_temp_representante', dados_pessoa_temp)logger.info("Montagem de campos para atualizar pessoa dados PP3563",value("PP3759" , PP3606.PP3665("PP3759")),value("PP3753" , PP3606.PP3665("PP3753")),value("intencao" , PP3606.PP3665("intencao")),value("correlation_id", PP3606.PP3665("PP4480")),value("PP4305_total_espera" , Duration.between(inicio, Instant.now())))</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:sequenceFlow id="PP1967" sourceRef="PP2337" targetRef="PP4222">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP3383_representante') &amp;&amp; PP3383_representante != "" &amp;&amp; PP3383_representante != null}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:servicePP2865 id="PP3104" name="PP0191" PP3193="#{atualizarPP2694}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3407">${dados_pessoa_temp_representante}</camunda:inputParameter>
          <camunda:inputParameter name="PP3753">${adicionais[0].PP3753}</camunda:inputParameter>
          <camunda:inputParameter name="PP3761">${adicionais[0].PP3761}</camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1766</bpmn:incoming>
      <bpmn:outgoing>PP2021</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1766" sourceRef="PP4222" targetRef="PP3104" />
    <bpmn:sequenceFlow id="PP2021" sourceRef="PP3104" targetRef="PP3103" />
    <bpmn:exclusivePP2253 id="PP2367" name="PP2238">
      <bpmn:incoming>PP2057</bpmn:incoming>
      <bpmn:outgoing>PP1901</bpmn:outgoing>
      <bpmn:outgoing>PP1801</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1901" name="Sim" sourceRef="PP2367" targetRef="PP4077">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP3383_representante') &amp;&amp; PP3383_representante != "" &amp;&amp; PP3383_representante != null}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1801" name="Não" sourceRef="PP2367" targetRef="PP2434" />
    <bpmn:servicePP2865 id="PP3094" name="PP0191" PP3193="#{atualizarPP2694}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3407">
            <camunda:map>
              <camunda:entry key="PP4304s">${dados_pessoa_temp["PP4304s"]}</camunda:entry>
              <camunda:entry key="PP3550s">${dados_pessoa_temp["PP3550s"]}</camunda:entry>
              <camunda:entry key="PP3435_funPP3394ao">${dados_pessoa_temp["PP3435_funPP3394ao"]}</camunda:entry>
              <camunda:entry key="PP3907">${dados_pessoa_temp["PP3907"]}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1897</bpmn:incoming>
      <bpmn:outgoing>PP1417</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP4199PP2865 id="PP4207" name="PP2811" PP4199Format="groovy">
      <bpmn:extensionElements>
        <PP3194 PP3601="start">
          <camunda:PP4199 PP4199Format="javaPP4199">var dateUpdate = new Date();dateUpdate.setTime(dateUpdate.getTime() + dateUpdate.getTimezoneOffset() * 60 * 1000 /* convert to UTC */ - (/* UTC-6 */ 6) * 60 * 60 * 1000);PP3606.PP4250("PP3437", dateUpdate.toISOString())</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1985</bpmn:incoming>
      <bpmn:outgoing>PP1897</bpmn:outgoing>
      <bpmn:PP4199>import static net.logstash.logPP3123.argument.StructuredArguments.value
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.PP4318.Instant
import java.PP4318.Duration
final Logger logger = LoggerFactory.getLogger("PP3165")Instant inicio = Instant.now()
def datePart = PP3606.PP3665("PP3437");
    "nivel_completude" : 200,"modo_PP3317" : 2,"fonte_PP3317" : 3,"status" : 1,"data_valiPP3394ao_fonte" : datePart,"informacoes" : "PP4304 comprovado por sms."]def relacionamento_PP4304 = ["codigo_agrupamento_PP4044": 2,"PP3277": "PP0631","codigo_finalidade": 12227,"codigo_classe_PP4044": 6,"codigo_nome_PP4044_PP3969": 14554]def valiPP3394aoPP0780 = ["nivel_completude" : 200,"modo_PP3317" : 2,"fonte_PP3317" : 3,"status" : 1,"data_valiPP3394ao_fonte" : datePart,"informacoes" : "comprovado por auto declaração."]def relacionamento_PP3550 = ["codigo_agrupamento_PP4044": 2,"PP3277": "PP0631","codigo_finalidade": 12225,"codigo_classe_PP4044": 6,"codigo_nome_PP4044_PP3969": 14554]def valiPP3394aoNascimento = ["nivel_completude" : 400,"modo_PP3317" : 6,"fonte_PP3317" : 3,"status" : 1,"data_valiPP3394ao_fonte" : datePart,"informacoes" : "comprovado por auto declaração."]def valiPP3394aoNome = ["nivel_completude" : 400,"modo_PP3317" : 6,"fonte_PP3317" : 3,"status" : 1,"data_valiPP3394ao_fonte" : datePart,"informacoes" : "comprovado por auto declaração."]//nomedef nome = PP3606.PP3665("PP3907")
def PP3903 = ["valor_dado_PP3170l": nome, "PP4380": [valiPP3394aoNome]]def nome_representante = PP3606.PP3665("PP3908")
def PP3903_representante = ["valor_dado_PP3170l": nome_representante, "PP4380": [valiPP3394aoNome]]//PP2866sdef PP3922 = PP3606.PP3665("PP3922")
def ddd = PP3606.PP3665("PP3438")
def objetoPP2866Principal = ["principal": true, "tipo": 12240,"propositos": [1,4], "ddi": 55, "ddd": ddd, "PP3913": PP3922, "ramal": 0, "data_atualizacao": datePart] def PP4304Principal = ["valor_dado_PP3170l" : objetoPP2866Principal , "PP4380" : [valiPP3394aoPP2866] ] def PP4304sCadastral = [PP4304Principal]//PP0780def PP3550 = PP3606.PP3665("PP3550")
def objetoPP0780 = ["principal": true,"propositos": [1,2], "PP3550": PP3550, "data_atualizacao": datePart]def PP3550Principal = [ "valor_dado_PP3170l": objetoPP0780, "PP4380": [valiPP3394aoPP0780] ]def PP3550Cadastral = [PP3550Principal]//Nascimentodef PP3435 = PP3606.PP3665("PP3435")
def dados_nascimento = ["valor_dado_PP3170l": PP3435, "PP4380":[valiPP3394aoNascimento]]def PP3436 = PP3606.PP3665("PP3436")
def dados_nascimento_representante = ["valor_dado_PP3170l": PP3436, "PP4380":[valiPP3394aoNascimento]] def dados = [ "PP3383_adicional": PP3606.PP3665("PP3383_representante"), "PP3435_adicional": PP3436, "PP3907_adicional": nome_representante ];
    PP3606.PP4250("dados_pessoa_rep_temp" ,dados )
PP3606.PP4250("dados_pessoa_temp" ,dados )logger.info("Montagem de campos para atualizar pessoa dados Perfil",value("PP3759" , PP3606.PP3665("PP3759")),value("PP3753" , PP3606.PP3665("PP3753")),value("intencao" , PP3606.PP3665("intencao")),value("correlationId" , PP3606.PP3665("PP4481")),value("PP4305_total_espera" , Duration.between(inicio, Instant.now())))</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:sequenceFlow id="PP1417" sourceRef="PP3094" targetRef="PP3418" />
    <bpmn:sequenceFlow id="PP1897" sourceRef="PP4207" targetRef="PP3094" />
    <bpmn:exclusivePP2253 id="PP2307" name="PP2868" PP3476="PP2010">
      <bpmn:incoming>PP1719</bpmn:incoming>
      <bpmn:outgoing>PP2010</bpmn:outgoing>
      <bpmn:outgoing>PP2167</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP2010" sourceRef="PP2307" targetRef="PP2341" />
    <bpmn:PP4199PP2865 id="PP4206" name="PP2811" PP4199Format="groovy">
      <bpmn:extensionElements>
        <PP3194 PP3601="start">
          <camunda:PP4199 PP4199Format="javaPP4199">var dateUpdate = new Date();dateUpdate.setTime(dateUpdate.getTime() + dateUpdate.getTimezoneOffset() * 60 * 1000 /* convert to UTC */ - (/* UTC-6 */ 6) * 60 * 60 * 1000);PP3606.PP4250("PP3437", dateUpdate.toISOString())</camunda:PP4199>
        </PP3194>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2167</bpmn:incoming>
      <bpmn:outgoing>PP2067</bpmn:outgoing>
      <bpmn:PP4199>import static net.logstash.logPP3123.argument.StructuredArguments.value
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.PP4318.Instant
import java.PP4318.Duration
final Logger logger = LoggerFactory.getLogger("PP3165")Instant inicio = Instant.now()
def datePart = PP3606.PP3665("PP3437");
    def valiPP3394aoPP2866 = ["nivel_completude" : 200,"modo_PP3317" : 2,"fonte_PP3317" : 3,"status" : 1,"data_valiPP3394ao_fonte" : datePart,"informacoes" : "PP4304 compovado por sms."]def relacionamento_PP4304 = ["codigo_agrupamento_PP4044": 2,"PP3277": "PP0631","codigo_finalidade": 12227,"codigo_classe_PP4044": 6,"codigo_nome_PP4044_PP3969": 14554]def valiPP3394aoPP0780 = ["nivel_completude" : 200,"modo_PP3317" : 2,"fonte_PP3317" : 3,"status" : 1,"data_valiPP3394ao_fonte" : datePart,"informacoes" : "comprovado por auto declaração."]def relacionamento_PP3550= ["codigo_agrupamento_PP4044": 2,"PP3277": "PP0631","codigo_finalidade": 12225,"codigo_classe_PP4044": 6,"codigo_nome_PP4044_PP3969": 14554]def valiPP3394aoNascimento = ["nivel_completude" : 400,"modo_PP3317" : 6,"fonte_PP3317" : 3,"status" : 1,"data_valiPP3394ao_fonte" : datePart,"informacoes" : "comprovado por auto declaração."]def valiPP3394aoNome = ["nivel_completude" : 400,"modo_PP3317" : 6,"fonte_PP3317" : 3,"status" : 1,"data_valiPP3394ao_fonte" : datePart,"informacoes" : "comprovado por auto declaração."]//nomedef nome = PP3606.PP3665("PP3908")
def PP3903 = ["valor_dado_PP3170l": nome, "PP4380": [valiPP3394aoNome]]//PP2866sdef PP3922 = PP3606.PP3665("PP3923")
def ddd = PP3606.PP3665("PP3438")
def objetoPP2866Principal = ["principal": true, "tipo": 12240,"propositos": [1,4], "ddi": 55, "ddd": ddd,"PP3913": PP3922, "ramal": 0, "data_atualizacao": datePart] def PP4304Principal = ["valor_dado_PP3170l" : objetoPP2866Principal , "PP4380" : [valiPP3394aoPP2866] ] def PP4304sCadastral = [PP4304Principal]//PP0780def PP3550 = PP3606.PP3665("PP3552")
def objetoPP0780 = ["principal": true,"propositos": [1,2], "PP3550": PP3550, "data_atualizacao": datePart]def PP3550Principal = [ "valor_dado_PP3170l": objetoPP0780, "PP4380": [valiPP3394aoPP0780] ]def PP3550Cadastral = [PP3550Principal]//Nascimentodef PP3435 = PP3606.PP3665("PP3436")
def dados_nascimento = ["valor_dado_PP3170l": PP3435, "PP4380":[valiPP3394aoNascimento]]def dados = ["PP4304s": PP4304sCadastral,"PP3435_funPP3394ao": dados_nascimento,"PP3550s": PP3550Cadastral,"PP3907": PP3903];
    PP3606.PP4250("dados_pessoa_temp" ,dados )logger.info("Montagem de campos para atualizar pessoa dados Perfil",value("PP3759" , PP3606.PP3665("PP3759")),value("PP3753" , PP3606.PP3665("PP3753")),value("intencao" , PP3606.PP3665("intencao")),value("correlationId" , PP3606.PP3665("PP4481")),value("PP4305_total_espera" , Duration.between(inicio, Instant.now())))</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:sequenceFlow id="PP2167" sourceRef="PP2307" targetRef="PP4206">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP3383_representante') &amp;&amp; PP3383_representante != "" &amp;&amp; PP3383_representante != null}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP2067" sourceRef="PP4206" targetRef="PP3093" />
    <bpmn:sequenceFlow id="PP1979" sourceRef="PP3093" targetRef="PP2341" />
    <bpmn:servicePP2865 id="PP3093" name="PP0191" PP3193="#{atualizarPP2694}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3407">
            <camunda:map>
              <camunda:entry key="PP4304s">${dados_pessoa_temp["PP4304s"]}</camunda:entry>
              <camunda:entry key="PP3550s">${dados_pessoa_temp["PP3550s"]}</camunda:entry>
              <camunda:entry key="PP3435_funPP3394ao">${dados_pessoa_temp["PP3435_funPP3394ao"]}</camunda:entry>
              <camunda:entry key="PP3907">${dados_pessoa_temp["PP3907"]}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3753">${adicionais.get(0).PP3753}</camunda:inputParameter>
          <camunda:inputParameter name="PP3761">${adicionais.get(0).PP3761}</camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2067</bpmn:incoming>
      <bpmn:outgoing>PP1979</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:servicePP2865 id="PP4077" name="PP0194" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">2</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map />
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map />
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1901</bpmn:incoming>
      <bpmn:outgoing>PP1858</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1858" sourceRef="PP4077" targetRef="PP1003" />
    <bpmn:exclusivePP2253 id="PP2332" name="PP0804" PP3476="PP1989">
      <bpmn:incoming>PP1679</bpmn:incoming>
      <bpmn:outgoing>PP1768</bpmn:outgoing>
      <bpmn:outgoing>PP1989</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1768" name="Sim" sourceRef="PP2332" targetRef="PP1180">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('response_PP3329_bacen') &amp;&amp; (response_PP3329_bacen.status_PP4039 != "SUCESSO")}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:userPP2865 id="PP4157" name="PP2783">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
        </camunda:formData>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1989</bpmn:incoming>
      <bpmn:incoming>PP1586</bpmn:incoming>
      <bpmn:outgoing>PP2073</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:PP3162 id="PP1053" attachedToRef="PP4157">
      <bpmn:outgoing>PP1259</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2927">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">PT3M</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1989" name="Não" sourceRef="PP2332" targetRef="PP4157" />
    <bpmn:endEvent id="PP1056">
      <bpmn:incoming>PP1259</bpmn:incoming>
      <bpmn:incoming>PP2073</bpmn:incoming>
      <bpmn:terminateEventDefinition id="PP2887" />
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP1259" sourceRef="PP1053" targetRef="PP1056" />
    <bpmn:sequenceFlow id="PP2073" sourceRef="PP4157" targetRef="PP1056" />
    <bpmn:exclusivePP2253 id="PP2306" name="PP2239" PP3476="PP1683">
      <bpmn:incoming>PP1865</bpmn:incoming>
      <bpmn:outgoing>PP1683</bpmn:outgoing>
      <bpmn:outgoing>PP1546</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1683" name="Não" sourceRef="PP2306" targetRef="PP3100" />
    <bpmn:servicePP2865 id="PP3339" name="PP0661" camunda:modelerTemplate="PP3965" camunda:modelerTemplateVersion="1" PP3191="true" PP3193="${PP3967}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3668">{"PP4478":"PP0005","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"PP4478":"PP0008","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3670">{"PP4478":"PP0009","PP4483":"PP0007","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP4107">?id_PP3248=${PP3606.PP3665('PP3754')}</camunda:inputParameter>
          <camunda:inputParameter name="PP4108">?id_PP3248=${PP3606.PP3665('PP3754')}</camunda:inputParameter>
          <camunda:inputParameter name="PP4109">?id_PP3248=${PP3606.PP3665('PP3754')}</camunda:inputParameter>
          <camunda:inputParameter name="urlDev">PP3713{PP3606.PP3665('PP3757_bacen_representante')}</camunda:inputParameter>
          <camunda:inputParameter name="PP4363">PP3713{PP3606.PP3665('PP3757_bacen_representante')}</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">PP3715{PP3606.PP3665('PP3757_bacen_representante')}</camunda:inputParameter>
          <camunda:outputParameter name="PP4147">${S(response)}</camunda:outputParameter>
        </camunda:PP3789>
        <camunda:field name="withError">
          <PP3195>true</PP3195>
        </camunda:field>
        <camunda:field name="PP3585">
          <camunda:string>C08_BCN</camunda:string>
        </camunda:field>
        <camunda:field name="PP4317">
          <PP3195>${statusCode != 200}</PP3195>
        </camunda:field>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1546</bpmn:incoming>
      <bpmn:outgoing>PP1353</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP3162 id="PP1083" attachedToRef="PP3339">
      <bpmn:outgoing>PP1554</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0817" />
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1546" name="Sim" sourceRef="PP2306" targetRef="PP3339">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP3383_representante') &amp;&amp; PP3383_representante != "" &amp;&amp; PP3383_representante != null}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1554" sourceRef="PP1083" targetRef="PP0078" />
    <bpmn:PP4199PP2865 id="PP4220" name="PP2820" PP3191="true" PP4199Format="groovy">
      <bpmn:incoming>PP1353</bpmn:incoming>
      <bpmn:outgoing>PP1400</bpmn:outgoing>
      <bpmn:PP4199>def jsonSlurperClassic = new groovy.json.JsonSlurperClassic();
    PP3606.PP4250("response_PP3329_bacen_representante", jsonSlurperClassic.parseText(PP4147.toString())) PP3606.PP4250("response_PP3329_bacen_representante", response_PP3329_bacen_representante)</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:sequenceFlow id="PP1353" sourceRef="PP3339" targetRef="PP4220" />
    <bpmn:exclusivePP2253 id="PP2283" name="PP2708" PP3476="PP2149">
      <bpmn:incoming>PP1400</bpmn:incoming>
      <bpmn:outgoing>PP2149</bpmn:outgoing>
      <bpmn:outgoing>PP1372</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1400" sourceRef="PP4220" targetRef="PP2283" />
    <bpmn:sequenceFlow id="PP2149" name="Não" sourceRef="PP2283" targetRef="PP3100" />
    <bpmn:servicePP2865 id="PP0078" name="PP0203" PP3193="${PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">4</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3468">$</camunda:entry>
              <camunda:entry key="PP3466">$</camunda:entry>
              <camunda:entry key="PP3467">$</camunda:entry>
              <camunda:entry key="PP3470">$</camunda:entry>
              <camunda:entry key="PP3471">$</camunda:entry>
              <camunda:entry key="PP3469">$</camunda:entry>
              <camunda:entry key="PP3653">$</camunda:entry>
              <camunda:entry key="possui_restricao_representante">$</camunda:entry>
              <camunda:entry key="possui_restricao">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3468">${PP3468}</camunda:entry>
              <camunda:entry key="PP3466">${PP3466}</camunda:entry>
              <camunda:entry key="PP3467">${PP3467}</camunda:entry>
              <camunda:entry key="PP3470">${PP3470}</camunda:entry>
              <camunda:entry key="PP3471">${PP3471}</camunda:entry>
              <camunda:entry key="PP3469">${PP3469}</camunda:entry>
              <camunda:entry key="PP3653">${PP3653}</camunda:entry>
              <camunda:entry key="possui_restricao_representante">${PP3606.hasVariable('response_PP3329_bacen_representante') &amp;&amp;response_PP3329_bacen != null &amp;&amp; response_PP3329_bacen_representante.possui_restricao != null ? response_PP3329_bacen_representante.possui_restricao : 'null'}</camunda:entry>
              <camunda:entry key="possui_restricao">${PP3606.hasVariable('response_PP3329_bacen') &amp;&amp; response_PP3329_bacen != null &amp;&amp; response_PP3329_bacen.possui_restricao != null ? response_PP3329_bacen.possui_restricao : 'null'}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1554</bpmn:incoming>
      <bpmn:incoming>PP1372</bpmn:incoming>
      <bpmn:outgoing>PP1957</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:exclusivePP2253 id="PP2363" name="PP0804" PP3476="PP1586">
      <bpmn:incoming>PP1957</bpmn:incoming>
      <bpmn:outgoing>PP1320</bpmn:outgoing>
      <bpmn:outgoing>PP1586</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1957" sourceRef="PP0078" targetRef="PP2363" />
    <bpmn:sequenceFlow id="PP1320" name="Sim" sourceRef="PP2363" targetRef="PP1180">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('response_PP3329_bacen_representante') &amp;&amp;(response_PP3329_bacen_representante.status_PP4039 != "SUCESSO")}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1586" name="Não" sourceRef="PP2363" targetRef="PP4157" />
    <bpmn:sequenceFlow id="PP1372" name="Sim" sourceRef="PP2283" targetRef="PP0078">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('response_PP3329_bacen_representante') &amp;&amp;(response_PP3329_bacen_representante.status_PP4039 != "SUCESSO" ||(response_PP3329_bacen_representante.possui_restricao != null &amp;&amp; response_PP3329_bacen_representante.possui_restricao == true))}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:servicePP2865 id="PP3095" name="PP0205" PP3193="${PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">98</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP4465">$</camunda:entry>
              <camunda:entry key="PP4231">$</camunda:entry>
              <camunda:entry key="PP4229">$</camunda:entry>
              <camunda:entry key="PP3383">$</camunda:entry>
              <camunda:entry key="PP3753">$</camunda:entry>
              <camunda:entry key="PP3053">$</camunda:entry>
              <camunda:entry key="PP3653">$</camunda:entry>
              <camunda:entry key="data_envio_PP4465">$</camunda:entry>
              <camunda:entry key="hora_envio_PP4465">$</camunda:entry>
              <camunda:entry key="origem_PP4048">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP4465">"true"</camunda:entry>
              <camunda:entry key="PP4231">${PP4231}</camunda:entry>
              <camunda:entry key="PP4229">${PP4229}</camunda:entry>
              <camunda:entry key="PP3383">${PP3383}</camunda:entry>
              <camunda:entry key="PP3753">${PP3753}</camunda:entry>
              <camunda:entry key="PP3053">${PP3053_logada}</camunda:entry>
              <camunda:entry key="PP3653">${PP3653}</camunda:entry>
              <camunda:entry key="data_envio_PP4465">${dateTime().toString("yyyy-MM-dd")}</camunda:entry>
              <camunda:entry key="hora_envio_PP4465">${dateTime().toString("HH:mm")}</camunda:entry>
              <camunda:entry key="origem_PP4048">${PP3606.hasVariable('origem_PP4048') ? origem_PP4048 : phygital}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1341</bpmn:incoming>
      <bpmn:outgoing>PP2140</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:exclusivePP2253 id="PP2264" name="PP2985" PP3476="PP1495">
      <bpmn:incoming>PP1460</bpmn:incoming>
      <bpmn:outgoing>PP1495</bpmn:outgoing>
      <bpmn:outgoing>PP1341</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1495" name="Não" sourceRef="PP2264" targetRef="PP2389" />
    <bpmn:sequenceFlow id="PP1341" name="Sim" sourceRef="PP2264" targetRef="PP3095">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('derivou_PP4465_phygital') &amp;&amp; PP3606.PP3665('derivou_PP4465_phygital') == "true"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:endEvent id="PP1166">
      <bpmn:incoming>PP2140</bpmn:incoming>
      <bpmn:terminateEventDefinition id="PP2888" />
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP2140" sourceRef="PP3095" targetRef="PP1166" />
    <bpmn:exclusivePP2253 id="PP2350" name="PP2692" PP3476="PP1339">
      <bpmn:incoming>PP1306</bpmn:incoming>
      <bpmn:outgoing>PP1339</bpmn:outgoing>
      <bpmn:outgoing>PP2218</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:servicePP2865 id="PP3345" name="PP3024" camunda:modelerTemplate="PP3965" camunda:modelerTemplateVersion="1" PP3191="true" PP3193="${PP3967}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP4107" />
          <camunda:inputParameter name="PP4108" />
          <camunda:inputParameter name="PP4109" />
          <camunda:inputParameter name="PP3668">{"PP4478":"PP0005","PP4483":"PP0007","PP4476":"a2hnz62xw8","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"PP4478":"PP0008", "PP4483": "PP0007","PP4476":"paotv172b9","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3670">{"PP4478":"PP0009", "PP4483":"PP0007","PP4476":"wl76sins6i","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">PP3698{PP3606.PP3665('PP3254')}</camunda:inputParameter>
          <camunda:inputParameter name="PP4363">PP3692{PP3606.PP3665('PP3254')}</camunda:inputParameter>
          <camunda:inputParameter name="urlDev">PP3686{PP3606.PP3665('PP3254')}</camunda:inputParameter>
          <camunda:outputParameter name="PP4150">${S(response)}</camunda:outputParameter>
        </camunda:PP3789>
        <camunda:field name="withError">
          <PP3195>true</PP3195>
        </camunda:field>
        <camunda:field name="PP3585">
          <camunda:string>erro_PP3329r_PP3753</camunda:string>
        </camunda:field>
        <camunda:field name="PP4317">
          <PP3195>${statusCode != 200}</PP3195>
        </camunda:field>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1339</bpmn:incoming>
      <bpmn:outgoing>PP2183</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP3162 id="PP1039" attachedToRef="PP3345">
      <bpmn:outgoing>PP1289</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0813" />
    </bpmn:PP3162>
    <bpmn:PP4199PP2865 id="PP4215" name="PP2818" PP4199Format="groovy">
      <bpmn:incoming>PP1709</bpmn:incoming>
      <bpmn:outgoing>PP1582</bpmn:outgoing>
      <bpmn:PP4199>if(PP3606.hasVariable("PP4151")){
      def jsonSlurper = new groovy.json.JsonSlurper() def PP4151 = PP3606.PP3665("PP4151") def jsonString = (PP4151 instanceof String) ? PP4151 : PP4151.toString() Object object = jsonSlurper.parseText(jsonString) object = (object instanceof Map &amp;
    &amp;
    object.PP3350insKey("data")) ? object.data : objectif (object.PP3350insKey("PP3907") &amp;
    &amp;
    object.PP3907 != null){
      PP3606.PP4250("PP3909_pagadora", object.PP3907["valor_dado_PP3170l"]) PP3606.PP4250("PP3909", object.PP3907["valor_dado_PP3170l"])}
    else if (object.PP3350insKey("nome_fantasia_apelido") &amp;
    &amp;
    object.nome_fantasia_apelido != null){
      PP3606.PP4250("PP3909_pagadora", object.nome_fantasia_apelido["valor_dado_PP3170l"]) PP3606.PP4250("PP3909", object.nome_fantasia_apelido["valor_dado_PP3170l"])}}
    PP3606.PP4250("PP3555",true);</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:servicePP2865 id="PP3344" name="PP3023" camunda:modelerTemplate="PP3965" camunda:modelerTemplateVersion="1" PP3191="true" PP3193="${PP3967}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP4107" />
          <camunda:inputParameter name="PP4108" />
          <camunda:inputParameter name="PP4109" />
          <camunda:inputParameter name="urlProd">PP3696{id_PP3248_oig}?codigo_agrupamento_PP4044=0&amp;PP3277=0</camunda:inputParameter>
          <camunda:inputParameter name="PP4363">PP3690{id_PP3248_oig}?codigo_agrupamento_PP4044=0&amp;PP3277=0</camunda:inputParameter>
          <camunda:inputParameter name="urlDev">PP3684{id_PP3248_oig}?codigo_agrupamento_PP4044=0&amp;PP3277=0</camunda:inputParameter>
          <camunda:inputParameter name="PP3668">{"PP4478":"PP0005","PP4483":"PP0007","PP4476":"7p5sw5axbd","PP4479":"PP0538","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"PP4478":"PP0008","PP4483":"PP0007","PP4476":"mo2yk5j192","PP4479":"PP0538","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3670">{"PP4478":"PP0009","PP4483":"PP0007","PP4476":"qtbssnq60m","PP4479":"PP0538","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:outputParameter name="PP4151">${S(response)}</camunda:outputParameter>
        </camunda:PP3789>
        <camunda:field name="withError">
          <PP3195>true</PP3195>
        </camunda:field>
        <camunda:field name="PP3585">
          <camunda:string>erro_PP3329r_dados_pf</camunda:string>
        </camunda:field>
        <camunda:field name="PP4317">
          <PP3195>${statusCode != 200}</PP3195>
        </camunda:field>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1476</bpmn:incoming>
      <bpmn:outgoing>PP1709</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP4199PP2865 id="PP4212" name="PP2815" PP4199Format="groovy">
      <bpmn:incoming>PP2183</bpmn:incoming>
      <bpmn:incoming>PP1476</bpmn:incoming>
      <bpmn:PP4199>import groovy.json.JsonSlurper;
    if(PP3606.hasVariable("PP4150")){
      def jsonSlurper = new JsonSlurper();
    def PP4150 = PP3606.PP3665("PP4150")Object object = jsonSlurper.parseText(PP4150.toString())if (object.PP3350insKey("data") &amp;
    &amp;
    object.data != null &amp;
    &amp;
    object.data[0]["id_PP3248"] != null){
      PP3606.PP4250("id_PP3248_oig", object.data[0]["id_PP3248"]) }
    else {
      PP3606.PP4250("id_PP3248_oig", "") }
    }</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:PP3162 id="PP0972" attachedToRef="PP3344">
      <bpmn:outgoing>PP1392</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0824" />
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1709" sourceRef="PP3344" targetRef="PP4215" />
    <bpmn:sequenceFlow id="PP1476" sourceRef="PP4212" targetRef="PP3344" />
    <bpmn:sequenceFlow id="PP1339" name="Sim" sourceRef="PP2350" targetRef="PP3345" />
    <bpmn:sequenceFlow id="PP2183" sourceRef="PP3345" targetRef="PP4212" />
    <bpmn:sequenceFlow id="PP1289" sourceRef="PP1039" targetRef="PP1018" />
    <bpmn:sequenceFlow id="PP1392" sourceRef="PP0972" targetRef="PP1018" />
    <bpmn:PP4199PP2865 id="PP4214" name="PP2817" PP4199Format="groovy">
      <bpmn:incoming>PP1927</bpmn:incoming>
      <bpmn:outgoing>PP2102</bpmn:outgoing>
      <bpmn:PP4199>import groovy.json.JsonSlurperif(PP3606.hasVariable("PP4151")){
      def jsonSlurper = new JsonSlurper() def PP4151 = PP3606.PP3665("PP4151")// Converte SpinJsonNode para Stringdef jsonString = PP4151 instanceof String ?PP4151 :org.camunda.spin.Spin.JSON(PP4151).toString() def parsedObject = jsonSlurper.parseText(jsonString) def data = parsedObject.PP3350insKey("data") ? parsedObject.data : parsedObjectif (data.PP3350insKey("nome_fantasia") &amp;
    &amp;
    data.nome_fantasia != null){
      PP3606.PP4250("PP3909_pagadora", data.nome_fantasia["valor_dado_PP3170l"]) PP3606.PP4250("PP3909", data.nome_fantasia["valor_dado_PP3170l"])}
    else if (data.PP3350insKey("PP3907") &amp;
    &amp;
    data.PP3907 != null){
      PP3606.PP4250("PP3909_pagadora", data.PP3907["valor_dado_PP3170l"]) PP3606.PP4250("PP3909", data.PP3907["valor_dado_PP3170l"]) }
    }
    PP3606.PP4250("PP3555",true);</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:servicePP2865 id="PP3343" name="PP3022" camunda:modelerTemplate="PP3965" camunda:modelerTemplateVersion="1" PP3191="true" PP3193="${PP3967}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP4107" />
          <camunda:inputParameter name="PP4108" />
          <camunda:inputParameter name="PP4109" />
          <camunda:inputParameter name="urlDev">PP3685{id_PP3248_oig}?PP3748=PP0010&amp;PP3277=0</camunda:inputParameter>
          <camunda:inputParameter name="PP4363">PP3691{id_PP3248_oig}?PP3748=PP0010&amp;PP3277=0</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">PP3697{id_PP3248_oig}?PP3748=PP0010&amp;PP3277=0</camunda:inputParameter>
          <camunda:inputParameter name="PP3668">{"PP4478":"PP0005","PP4483":"PP0007","PP4476":"p9wusrqep1","PP4482":"PP0538","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"PP4478":"PP0008","PP4483":"PP0007","PP4476":"o8mzrcjq97","PP4482":"PP0538","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3670">{"PP4478":"PP0009","PP4483":"PP0007","PP4476":"spqcvol6hl","PP4482":"PP0538","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:outputParameter name="PP4151">${S(response)}</camunda:outputParameter>
        </camunda:PP3789>
        <camunda:field name="withError">
          <PP3195>true</PP3195>
        </camunda:field>
        <camunda:field name="PP3585">
          <camunda:string>erro_PP3329r_dados_pj</camunda:string>
        </camunda:field>
        <camunda:field name="PP4317">
          <PP3195>${statusCode != 200}</PP3195>
        </camunda:field>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1548</bpmn:incoming>
      <bpmn:outgoing>PP1927</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:servicePP2865 id="PP3346" name="PP3025" camunda:modelerTemplate="PP3965" camunda:modelerTemplateVersion="1" PP3191="true" PP3193="${PP3967}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP4107" />
          <camunda:inputParameter name="PP4108" />
          <camunda:inputParameter name="PP4109" />
          <camunda:inputParameter name="PP3668">{"PP4478":"PP0005","PP4483":"PP0007","PP4476":"a2hnz62xw8","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"PP4478":"PP0008", "PP4483": "PP0007","PP4476":"paotv172b9","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3670">{"PP4478":"PP0009", "PP4483":"PP0007","PP4476":"wl76sins6i","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">PP3699{PP3606.PP3665('PP3254')}</camunda:inputParameter>
          <camunda:inputParameter name="PP4363">PP3693{PP3606.PP3665('PP3254')}</camunda:inputParameter>
          <camunda:inputParameter name="urlDev">PP3687{PP3606.PP3665('PP3254')}</camunda:inputParameter>
          <camunda:outputParameter name="PP4150">${S(response)}</camunda:outputParameter>
        </camunda:PP3789>
        <camunda:field name="withError">
          <PP3195>true</PP3195>
        </camunda:field>
        <camunda:field name="PP3585">
          <camunda:string>erro_PP3329r_PP3753</camunda:string>
        </camunda:field>
        <camunda:field name="PP4317">
          <PP3195>${statusCode != 200}</PP3195>
        </camunda:field>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2218</bpmn:incoming>
      <bpmn:outgoing>PP1274</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP4199PP2865 id="PP4213" name="PP2816" PP4199Format="groovy">
      <bpmn:incoming>PP1274</bpmn:incoming>
      <bpmn:outgoing>PP1548</bpmn:outgoing>
      <bpmn:PP4199>import groovy.json.JsonSlurper;
    if(PP3606.hasVariable("PP4150")){
      def jsonSlurper = new JsonSlurper();
    def PP4150 = PP3606.PP3665("PP4150")Object object = jsonSlurper.parseText(PP4150.toString())if (object.PP3350insKey("data") &amp;
    &amp;
    object.data != null &amp;
    &amp;
    object.data[0]["id_PP3248"] != null){
      PP3606.PP4250("id_PP3248_oig", object.data[0]["id_PP3248"]) }
    else {
      PP3606.PP4250("id_PP3248_oig", "") }
    }</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:PP3162 id="PP1118" attachedToRef="PP3343">
      <bpmn:outgoing>PP1971</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0847" />
    </bpmn:PP3162>
    <bpmn:PP3162 id="PP1188" attachedToRef="PP3346">
      <bpmn:outgoing>PP2161</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0848" />
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP1927" sourceRef="PP3343" targetRef="PP4214" />
    <bpmn:sequenceFlow id="PP1548" sourceRef="PP4213" targetRef="PP3343" />
    <bpmn:sequenceFlow id="PP1274" sourceRef="PP3346" targetRef="PP4213" />
    <bpmn:sequenceFlow id="PP2218" name="Não" sourceRef="PP2350" targetRef="PP3346">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4334') &amp;&amp; PP3606.PP3665('PP4334') != null &amp;&amp; PP3606.PP3665('PP4334') != "F"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1582" sourceRef="PP4215" targetRef="PP3319" />
    <bpmn:sequenceFlow id="PP2102" sourceRef="PP4214" targetRef="PP3319" />
    <bpmn:sequenceFlow id="PP2161" sourceRef="PP1188" targetRef="PP1018" />
    <bpmn:sequenceFlow id="PP1971" sourceRef="PP1118" targetRef="PP1018" />
    <bpmn:userPP2865 id="PP3416" name="PP0726" PP3476="PP2203">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3947" type="object" />
          <PP3196 id="PP3293" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3504" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4409" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3779" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3781" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3280" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3777" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3774" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3778" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3291" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3271" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3775" type="boolean">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3971" type="boolean">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4255" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4329" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4331" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3251" type="boolean">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3503" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3839" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4005" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4008" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4406" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4004" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4299" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4415" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4418" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3972" type="boolean">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4395" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4394" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4407" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4416" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4267" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3286" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3756" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3200" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3639" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4100" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4099" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4098" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4096" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3911" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4412" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4410" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3522" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3521" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4325" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3131" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4417" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3918" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4404" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4298" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP4460" type="string" PP3476Value="continuar" />
          <PP3196 id="PP3970" type="boolean" />
          <PP3196 id="PP3431" label="PP3431" type="string" />
          <PP3196 id="PP3798" label="PP3798" type="string" />
          <PP3196 id="PP3432" label="PP3432" type="string" />
          <PP3196 id="PP3799" label="PP3799" type="string" />
          <PP3196 id="PP3800" label="PP3800" type="string" />
          <PP3196 id="PP3289" type="string" PP3476Value="${null}" />
          <PP3196 id="PP4090" label="PP4090" type="boolean" PP3476Value="false" />
          <PP3196 id="PP3865" label="PP3865" type="string" />
          <PP3196 id="PP3653" label="Funcional PP2454" type="string" />
          <PP3196 id="PP3368" type="boolean">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3371" type="boolean">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3262" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4396" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3264" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4398" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3266" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4400" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3265" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4399" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3263" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4397" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3267" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4401" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3268" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4402" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3430" type="string" PP3476Value="${&#34;&#34;}">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4027" type="string" PP3476Value="${&#34;&#34;}">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3369" type="boolean">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3910" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4411" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3947" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3842" type="domain" PP3476Value="${PP3606.hasVariable(&#39;PP3833rotativo_credito_v3_aberturaPP3365_resposta&#39;) ?&#10;PP3833rotativo_credito_v3_aberturaPP3365_resposta[&#39;valor_lis_pre_PP3079do&#39;] : null}" />
          <PP3196 id="PP3841" type="domain" PP3476Value="${PP3606.hasVariable(&#39;PP3833rotativo_credito_v3_aberturaPP3365_resposta&#39;) ?&#10;PP3833rotativo_credito_v3_aberturaPP3365_resposta[&#39;PP4393&#39;] : null}" />
          <PP3196 id="PP3279" type="domain" PP3476Value="${PP3606.hasVariable(&#39;PP3279&#39;) ?&#10;PP3279 : null}" />
          <PP3196 id="PP3372" type="boolean">
            <camunda:properties>
              <camunda:PP4047 id="PP3494" value="PP3949" />
              <camunda:PP4047 id="PP4047" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3752" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP3494" value="PP3949" />
              <camunda:PP4047 id="PP4047" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4403" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP3494" value="PP3949" />
              <camunda:PP4047 id="PP4047" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3749" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP3494" value="PP3949" />
              <camunda:PP4047 id="PP4047" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3742" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP3494" value="PP3949" />
              <camunda:PP4047 id="PP4047" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4246" label="PP4246" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP3494" value="PP3949" />
              <camunda:PP4047 id="PP4047" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3906" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP3494" value="PP4246" />
              <camunda:PP4047 id="PP4047" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3768" label="PP3768" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP3494" value="PP4246" />
              <camunda:PP4047 id="PP4047" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4097" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP3494" value="PP3947" />
              <camunda:PP4047 id="PP4047" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4101" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP3494" value="PP3947" />
              <camunda:PP4047 id="PP4047" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4102" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP3494" value="PP3947" />
              <camunda:PP4047 id="PP4047" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP4103" type="string">
            <camunda:properties>
              <camunda:PP4047 id="PP3494" value="PP3947" />
              <camunda:PP4047 id="PP4047" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3949" label="PP3949" type="object" />
          <PP3196 id="PP3937" label="PP3937" type="object">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3937" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3944" label="PP3944" type="object">
            <camunda:properties>
              <camunda:PP4047 id="PP4047" value="PP3944" />
            </camunda:properties>
          </PP3196>
          <PP3196 id="PP3370" type="string" />
          <PP3196 id="PP3758" type="string" />
          <PP3196 id="PP3868" type="string" />
          <PP3196 id="PP3840" type="string" />
          <PP3196 id="PP3129" type="string" />
          <PP3196 id="PP3530" type="string" />
          <PP3196 id="PP3751" type="string" />
          <PP3196 id="PP3737" type="string" />
          <PP3196 id="PP4300" type="string" />
          <PP3196 id="PP4289" type="string" />
          <PP3196 id="PP4291" type="string" />
        </camunda:formData>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3950">
            <camunda:list>
              <camunda:value>PP3372</camunda:value>
              <camunda:value>PP3752</camunda:value>
              <camunda:value>PP4403</camunda:value>
              <camunda:value>PP3749</camunda:value>
              <camunda:value>PP3742</camunda:value>
              <camunda:value>PP4246</camunda:value>
            </camunda:list>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP4247">
            <camunda:list>
              <camunda:value>PP3906</camunda:value>
              <camunda:value>PP3768</camunda:value>
            </camunda:list>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3948">
            <camunda:list>
              <camunda:value>PP3293</camunda:value>
              <camunda:value>PP3504</camunda:value>
              <camunda:value>PP4409</camunda:value>
              <camunda:value>PP3779</camunda:value>
              <camunda:value>PP3781</camunda:value>
              <camunda:value>PP3280</camunda:value>
              <camunda:value>PP3777</camunda:value>
              <camunda:value>PP3774</camunda:value>
              <camunda:value>PP3778</camunda:value>
              <camunda:value>PP3291</camunda:value>
              <camunda:value>PP3271</camunda:value>
              <camunda:value>PP3775</camunda:value>
              <camunda:value>PP3971</camunda:value>
              <camunda:value>PP4255</camunda:value>
              <camunda:value>PP4329</camunda:value>
              <camunda:value>PP4331</camunda:value>
              <camunda:value>PP3251</camunda:value>
              <camunda:value>PP3503</camunda:value>
              <camunda:value>PP3839</camunda:value>
              <camunda:value>PP4005</camunda:value>
              <camunda:value>PP4008</camunda:value>
              <camunda:value>PP4406</camunda:value>
              <camunda:value>PP4004</camunda:value>
              <camunda:value>PP4299</camunda:value>
              <camunda:value>PP4415</camunda:value>
              <camunda:value>PP4418</camunda:value>
              <camunda:value>PP3972</camunda:value>
              <camunda:value>PP4395</camunda:value>
              <camunda:value>PP4394</camunda:value>
              <camunda:value>PP4407</camunda:value>
              <camunda:value>PP4416</camunda:value>
              <camunda:value>PP4267</camunda:value>
              <camunda:value>PP3286</camunda:value>
              <camunda:value>PP3756</camunda:value>
              <camunda:value>PP3200</camunda:value>
              <camunda:value>PP3639</camunda:value>
              <camunda:value>PP4100</camunda:value>
              <camunda:value>PP4099</camunda:value>
              <camunda:value>PP4098</camunda:value>
              <camunda:value>PP4096</camunda:value>
              <camunda:value>PP3911</camunda:value>
              <camunda:value>PP4410</camunda:value>
              <camunda:value>PP3521</camunda:value>
              <camunda:value>PP3522</camunda:value>
              <camunda:value>PP4325</camunda:value>
              <camunda:value>PP3131</camunda:value>
              <camunda:value>PP4417</camunda:value>
              <camunda:value>PP3918</camunda:value>
              <camunda:value>PP4404</camunda:value>
              <camunda:value>PP4298</camunda:value>
              <camunda:value>PP4299</camunda:value>
              <camunda:value>PP3970</camunda:value>
              <camunda:value>PP4412</camunda:value>
              <camunda:value>PP3368</camunda:value>
              <camunda:value>PP3371</camunda:value>
              <camunda:value>PP3262</camunda:value>
              <camunda:value>PP4396</camunda:value>
              <camunda:value>PP3264</camunda:value>
              <camunda:value>PP4398</camunda:value>
              <camunda:value>PP3266</camunda:value>
              <camunda:value>PP4400</camunda:value>
              <camunda:value>PP3265</camunda:value>
              <camunda:value>PP4399</camunda:value>
              <camunda:value>PP3263</camunda:value>
              <camunda:value>PP4397</camunda:value>
              <camunda:value>PP3267</camunda:value>
              <camunda:value>PP4401</camunda:value>
              <camunda:value>PP3268</camunda:value>
              <camunda:value>PP4402</camunda:value>
              <camunda:value>PP3430</camunda:value>
              <camunda:value>PP4027</camunda:value>
              <camunda:value>PP3369</camunda:value>
              <camunda:value>PP3910</camunda:value>
              <camunda:value>PP4411</camunda:value>
              <camunda:value>PP4097</camunda:value>
              <camunda:value>PP4101</camunda:value>
              <camunda:value>PP4102</camunda:value>
              <camunda:value>PP4103</camunda:value>
            </camunda:list>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3938">
            <camunda:list>
              <camunda:value>PP3751</camunda:value>
              <camunda:value>PP3737</camunda:value>
              <camunda:value>PP4300</camunda:value>
              <camunda:value>PP3368</camunda:value>
              <camunda:value>PP4289</camunda:value>
              <camunda:value>PP4291</camunda:value>
            </camunda:list>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3945">
            <camunda:list>
              <camunda:value>PP3370</camunda:value>
              <camunda:value>PP3758</camunda:value>
              <camunda:value>PP3868</camunda:value>
              <camunda:value>PP3840</camunda:value>
              <camunda:value>PP3129</camunda:value>
              <camunda:value>PP3747</camunda:value>
              <camunda:value>PP4091</camunda:value>
              <camunda:value>PP3530</camunda:value>
            </camunda:list>
          </camunda:inputParameter>
          <camunda:outputParameter name="PP3600">PP3416</camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1715</bpmn:incoming>
      <bpmn:incoming>PP1626</bpmn:incoming>
      <bpmn:outgoing>PP2203</bpmn:outgoing>
      <bpmn:outgoing>PP1987</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:PP3162 id="PP0970" attachedToRef="PP3416">
      <bpmn:outgoing>PP1257</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2938">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">${PP4307}</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP2203" sourceRef="PP3416" targetRef="PP2413" />
    <bpmn:sequenceFlow id="PP1257" sourceRef="PP0970" targetRef="PP1109" />
    <bpmn:sequenceFlow id="PP1715" sourceRef="PP1191" targetRef="PP3416" />
    <bpmn:sequenceFlow id="PP1626" sourceRef="PP4080" targetRef="PP3416" />
    <bpmn:sequenceFlow id="PP1987" sourceRef="PP3416" targetRef="PP4235">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP3606.hasVariable('PP4460') &amp;&amp; PP4460=="PP4235"}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:servicePP2865 id="PP4074" name="PP0201" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">1</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3528">$</camunda:entry>
              <camunda:entry key="PP4161">$</camunda:entry>
              <camunda:entry key="PP4113">$</camunda:entry>
              <camunda:entry key="vinculo_selecionado">$</camunda:entry>
              <camunda:entry key="PP3329r_vinculos">$</camunda:entry>
              <camunda:entry key="PP3636">$</camunda:entry>
              <camunda:entry key="PP3383">$</camunda:entry>
              <camunda:entry key="PP3753">$</camunda:entry>
              <camunda:entry key="PP3416">$</camunda:entry>
              <camunda:entry key="PP3735">$</camunda:entry>
              <camunda:entry key="PP3947">$</camunda:entry>
              <camunda:entry key="PP3949">$</camunda:entry>
              <camunda:entry key="PP3937">$</camunda:entry>
              <camunda:entry key="PP3944">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3528">${PP3606.hasVariable('PP3528') ? PP3528 : null}</camunda:entry>
              <camunda:entry key="PP4161">${PP3606.hasVariable('PP4161') ? PP4161 : "Resultado desconhecido ou sem resultado"}</camunda:entry>
              <camunda:entry key="PP4113">${PP3606.hasVariable('PP4113') ? PP4113 : false}</camunda:entry>
              <camunda:entry key="vinculo_selecionado">${PP3606.hasVariable('vinculo_selecionado') ? vinculo_selecionado : null}</camunda:entry>
              <camunda:entry key="PP3329r_vinculos">${PP3606.hasVariable('PP3329r_vinculos') ? PP3329r_vinculos : false}</camunda:entry>
              <camunda:entry key="PP3636">${PP3636}</camunda:entry>
              <camunda:entry key="PP3383">${PP3383}</camunda:entry>
              <camunda:entry key="PP3753">${PP3753}</camunda:entry>
              <camunda:entry key="PP3416">true</camunda:entry>
              <camunda:entry key="PP3735">${PP3735}</camunda:entry>
              <camunda:entry key="PP3947">${PP3606.hasVariable('PP3947') ? PP3947 : "Sem PP4044"}</camunda:entry>
              <camunda:entry key="PP3949">${PP3606.hasVariable('PP3949') ? PP3949: "Sem PP4234"}</camunda:entry>
              <camunda:entry key="PP3937">${PP3606.hasVariable('PP3937') ? PP3937 : "PP0014 antigo"}</camunda:entry>
              <camunda:entry key="PP3944">${PP3606.hasVariable('PP3944') ? PP3944 : null}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2134</bpmn:incoming>
      <bpmn:outgoing>PP1349</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1349" sourceRef="PP4074" targetRef="PP2375" />
    <bpmn:servicePP2865 id="PP3098" name="PP0201" PP3193="${PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">1</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3528">$</camunda:entry>
              <camunda:entry key="PP4113">$</camunda:entry>
              <camunda:entry key="vinculo_selecionado">$</camunda:entry>
              <camunda:entry key="PP3329r_vinculos">$</camunda:entry>
              <camunda:entry key="PP3636">$</camunda:entry>
              <camunda:entry key="PP3383">$</camunda:entry>
              <camunda:entry key="PP3753">$</camunda:entry>
              <camunda:entry key="PP3416">$</camunda:entry>
              <camunda:entry key="PP3946">${PP3606.hasVariable("PP3946") ? PP3946 : false}</camunda:entry>
              <camunda:entry key="PP3747">${PP3606.hasVariable('PP3417') &amp;&amp; S(PP3417).hasProp('PP3944') &amp;&amp; !S(PP3417).prop('PP3944').isNull() &amp;&amp; S(PP3417).prop('PP3944').hasProp('PP3747') &amp;&amp; !S(PP3417).prop('PP3944').prop('PP3747').isNull() ? S(PP3417).prop('PP3944').prop('PP3747').stringValue() : null}</camunda:entry>
              <camunda:entry key="PP3833_cartao_PP3508">${PP3606.hasVariable("PP3833_cartao_PP3508") ? PP3833_cartao_PP3508 : null}</camunda:entry>
              <camunda:entry key="PP3947">$</camunda:entry>
              <camunda:entry key="PP3949">$</camunda:entry>
              <camunda:entry key="PP3937">$</camunda:entry>
              <camunda:entry key="PP3944">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3528">${PP3606.hasVariable('PP3528') ? PP3528 : null}</camunda:entry>
              <camunda:entry key="PP4113">${PP3606.hasVariable('PP4113') ? PP4113 : false}</camunda:entry>
              <camunda:entry key="vinculo_selecionado">${PP3606.hasVariable('vinculo_selecionado') ? vinculo_selecionado : null}</camunda:entry>
              <camunda:entry key="PP3329r_vinculos">${PP3606.hasVariable('PP3329r_vinculos') ? PP3329r_vinculos : false}</camunda:entry>
              <camunda:entry key="PP3636">${PP3636}</camunda:entry>
              <camunda:entry key="PP3383">${PP3383}</camunda:entry>
              <camunda:entry key="PP3753">${PP3753}</camunda:entry>
              <camunda:entry key="PP3416">true</camunda:entry>
              <camunda:entry key="PP3947">${PP3606.hasVariable('PP3947') ? PP3947 : "Sem PP4044"}</camunda:entry>
              <camunda:entry key="PP3949">${PP3606.hasVariable('PP3949') ? PP3949: "Sem PP4234"}</camunda:entry>
              <camunda:entry key="PP3937">${PP3606.hasVariable('PP3937') ? PP3937 : "PP0014 antigo"}</camunda:entry>
              <camunda:entry key="PP3944">${PP3606.hasVariable('PP3944') ? PP3944 : null}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1881</bpmn:incoming>
      <bpmn:outgoing>PP2171</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP4199PP2865 id="PP4218" name="PP2581" PP4199Format="groovy">
      <bpmn:incoming>PP2171</bpmn:incoming>
      <bpmn:outgoing>PP1276</bpmn:outgoing>
      <bpmn:PP4199>// Base: PP4045 e PP4194 de PP3139
def PP3947 = PP3606.PP3665('PP3947')
def PP3949 = PP3606.PP3665('PP3949')
def PP4161 = 'PP4469'
PP3606.PP4250('PP4161', PP4161)

def PP4304_completo = PP3606.PP3665('PP3438') + PP3606.PP3665('PP3922')
// Demanda PP2627/PP4087: PP4091 só dentro de PP3944 no JSON (sem chave na raiz)

def PP3417 = [
  'PP3759' : PP3606.PP3665('PP3759'),
  'PP4229' : PP3606.PP3665('PP4229'),
  'PP3934s' : PP3947,
  'PP3949' : PP3949,
  'PP3383' : PP3606.PP3665('PP3383'),
  'PP3907' : PP3606.PP3665('PP3907'),
  'PP3435' : PP3606.PP3665('PP3435'),
  'PP3550' : PP3606.PP3665('PP3550'),
  'PP4304_completo' : PP4304_completo,
  'PP4127' : PP3606.PP3665('PP4413'),
  'PP0530' : PP3606.PP3665('PP0530'),
  'UF' : PP3606.PP3665('PP3593'),
  'PP3913' : PP3606.PP3665('PP3913'),
  'PP4185' : PP3606.PP3665('PP4185'),
  'PP3305' : PP3606.PP3665('PP3305'),
  'PP3127' : PP3606.PP3665('PP3127'),
  'PP3242' : PP3606.PP3665('PP3242'),
  'PP2624' : PP3606.PP3665('PP3465'),
  'PP3937' : PP3606.PP3665('PP3937'),
  'PP3944' : PP3606.PP3665('PP3944')
]

def builderJson = new groovy.json.JsonBuilder()
builderJson(PP3417)
PP3606.PP4250('PP3417', builderJson.toString())</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:PP4199PP2865 id="PP4217" name="PP2581" PP4199Format="groovy">
      <bpmn:incoming>PP1975</bpmn:incoming>
      <bpmn:outgoing>PP1951</bpmn:outgoing>
      <bpmn:PP4199>// Base: PP4045 e PP4304
def PP3947 = PP3606.PP3665('PP3947')
def PP3949 = PP3606.PP3665('PP3949')
def PP4304_completo = PP3606.PP3665('PP3438') + PP3606.PP3665('PP3922')

// Demanda PP2627/PP4087: PP4091 só dentro de PP3944 no JSON (sem chave na raiz)

def PP3417 = [
  'PP3759': PP3606.PP3665('PP3759'),
  'PP4229' : PP3606.PP3665('PP4229'),
  'PP3934s' : PP3947,
  'PP3949' : PP3949,
  'PP3383' : PP3606.PP3665('PP3383'),
  'PP3907' : PP3606.PP3665('PP3907'),
  'PP3435' : PP3606.PP3665('PP3435'),
  'PP3550' : PP3606.PP3665('PP3550'),
  'PP4304_completo' : PP4304_completo,
  'PP4127' : PP3606.PP3665('PP4413'),
  'PP0530' : PP3606.PP3665('PP0530'),
  'UF' : PP3606.PP3665('PP3593'),
  'PP3913' : PP3606.PP3665('PP3913'),
  'PP4185' : PP3606.PP3665('PP4185'),
  'PP3305' : PP3606.PP3665('PP3305'),
  'PP3127' : PP3606.PP3665('PP3127'),
  'PP3242' : PP3606.PP3665('PP3242'),
  'PP2624' : PP3606.PP3665('PP3465'),
  'PP3937' : PP3606.PP3665('PP3937'),
  'PP3944' : PP3606.PP3665('PP3944')
]

def builderJson = new groovy.json.JsonBuilder()
builderJson(PP3417)
PP3606.PP4250('PP3417', builderJson.toString())</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:sequenceFlow id="PP1951" sourceRef="PP4217" targetRef="PP3409" />
    <bpmn:sequenceFlow id="PP2171" sourceRef="PP3098" targetRef="PP4218" />
    <bpmn:sequenceFlow id="PP1276" sourceRef="PP4218" targetRef="PP3409" />
    <bpmn:sequenceFlow id="PP1445" name="PP2487" sourceRef="PP2434" targetRef="PP3858" />
    <bpmn:servicePP2865 id="PP3659" name="PP2452" camunda:type="external" PP3199="PP2527">
      <bpmn:documentation>PP3805Link Git --&gt; PP3719</bpmn:documentation>
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3303">${PP3947['PP3369'] ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3302">${PP3947['PP3369'] ? "" : "X"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3905">${PP3947['PP3910']}</camunda:inputParameter>
          <camunda:inputParameter name="PP4391">${PP3947['PP4411'] }</camunda:inputParameter>
          <camunda:inputParameter name="PP3255">${PP3947 != null &amp;&amp; PP3947.PP3262 != null ? PP3947.PP3262 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="valor1">${PP3947 != null &amp;&amp; PP3947.PP4396 != null ? PP3947.PP4396 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="PP3256">${PP3947 != null &amp;&amp; PP3947.PP3264 != null ? PP3947.PP3264 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="valor2">${PP3947 != null &amp;&amp; PP3947.PP4398 != null ? PP3947.PP4398 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="PP3257">${PP3947 != null &amp;&amp; PP3947.PP3266 != null ? PP3947.PP3266 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="valor3">${PP3947 != null &amp;&amp; PP3947.PP4400 != null ? PP3947.PP4400 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="PP3258">${PP3947 != null &amp;&amp; PP3947.PP3265 != null ? PP3947.PP3265 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="valor4">${PP3947 != null &amp;&amp; PP3947.PP4399 != null ? PP3947.PP4399 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="PP3259">${PP3947 != null &amp;&amp; PP3947.PP3263 != null ? PP3947.PP3263 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="valor5">${PP3947 != null &amp;&amp; PP3947.PP4397 != null ? PP3947.PP4397 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="PP3260">${PP3947 != null &amp;&amp; PP3947.PP3267 != null ? PP3947.PP3267 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="valor6">${PP3947 != null &amp;&amp; PP3947.PP4401 != null ? PP3947.PP4401 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="PP3261">${PP3947 != null &amp;&amp; PP3947.PP3268 != null ? PP3947.PP3268 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="valor7">${PP3947 != null &amp;&amp; PP3947.PP4402 != null ? PP3947.PP4402 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="PP3422">${PP3606.hasVariable('PP3947') &amp;&amp; PP3947['PP3430'] != null ? PP3947['PP3430'] : ''}</camunda:inputParameter>
          <camunda:inputParameter name="PP4026">${PP3606.hasVariable('PP3947') &amp;&amp; PP3947['PP4027'] != null ?PP3947['PP4027'] : ''}</camunda:inputParameter>
          <camunda:inputParameter name="PP3217">${PP3947['PP3371'] ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3216">${PP3947['PP3371'] ? "" : "X"}</camunda:inputParameter>
          <camunda:inputParameter name="adiDepS">${flagAd ? "S" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="adiDepN">${flagAd ? "" : "N"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3078">${PP3947['PP3970'] ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3077">${PP3947['PP3970'] ? "" : "X"}</camunda:inputParameter>
          <camunda:inputParameter name="PP4137">${PP3606.hasVariable('PP3997') ? PP3606.PP3665('PP3997') : ''}</camunda:inputParameter>
          <camunda:inputParameter name="nif">${PP3606.hasVariable('PP3919') ? PP3919 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="PP3084">PDF</camunda:inputParameter>
          <camunda:inputParameter name="PP3225">D</camunda:inputParameter>
          <camunda:inputParameter name="PP3273">55943-5</camunda:inputParameter>
          <camunda:inputParameter name="PP3275">1228</camunda:inputParameter>
          <camunda:inputParameter name="PP3667">true</camunda:inputParameter>
          <camunda:inputParameter name="PP3734">1225</camunda:inputParameter>
          <camunda:inputParameter name="PP4106">1</camunda:inputParameter>
          <camunda:inputParameter name="PP4264">CONF</camunda:inputParameter>
          <camunda:inputParameter name="PP4441">${""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3053">${PP3350_reservada["PP3053"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3350">${PP3350_reservada["PP3350"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3394">${PP3350_reservada["PP3394"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3902">${PP3407["data"]["PP3907"]["valor_dado_PP3170l"] }</camunda:inputParameter>
          <camunda:inputParameter name="PP3383">${PP3383Dac}</camunda:inputParameter>
          <camunda:inputParameter name="PP3383Dac">${PP3383Dac}</camunda:inputParameter>
          <camunda:inputParameter name="PP3590">${""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4265">${""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4129">${PP3407["data"]["PP4127_PP3625mento"]["valor_dado_PP3170l"]}</camunda:inputParameter>
          <camunda:inputParameter name="cnpj">${PP3606.hasVariable("vinculo_selecionado") ? vinculo_selecionado['PP3254_pagadora'] : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3554">${PP3606.hasVariable("PP3909") ? PP3909 : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP2611">${""}</camunda:inputParameter>
          <camunda:inputParameter name="tipoDI">${PP4328}</camunda:inputParameter>
          <camunda:inputParameter name="PP3913DI">${PP3913_PP3524}</camunda:inputParameter>
          <camunda:inputParameter name="PP3425">${PP3425}</camunda:inputParameter>
          <camunda:inputParameter name="PP3426">${PP3426}</camunda:inputParameter>
          <camunda:inputParameter name="PP3424">${PP3424}</camunda:inputParameter>
          <camunda:inputParameter name="PP3995">${""}</camunda:inputParameter>
          <camunda:inputParameter name="nomeMae">${nome_mae}</camunda:inputParameter>
          <camunda:inputParameter name="PP3227">${PP3407["data"]["PP3562s"][0]["valor_dado_PP3170l"]["PP3227"] }</camunda:inputParameter>
          <camunda:inputParameter name="PP4185">${PP3407["data"]["PP3562s"][0]["valor_dado_PP3170l"]["PP3855"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3913">${PP3407["data"]["PP3562s"][0]["valor_dado_PP3170l"]["PP3913"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3305">${PP3407["data"]["PP3562s"][0]["valor_dado_PP3170l"]["PP3305"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3127">${PP3407["data"]["PP3562s"][0]["valor_dado_PP3170l"]["PP3127"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3243">${PP3407["data"]["PP3562s"][0]["valor_dado_PP3170l"]["PP3242"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP4362">${PP3407["data"]["PP3562s"][0]["valor_dado_PP3170l"]["uf"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3550">${PP3407["data"]["PP3550s"][0]["valor_dado_PP3170l"]["PP3550"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP4302">${PP3438.concat(' ').concat(PP3922)}</camunda:inputParameter>
          <camunda:inputParameter name="profissao">${tipo_profissao}</camunda:inputParameter>
          <camunda:inputParameter name="PP3227Lec">${PP3407["data"]["PP3562s"][0]["valor_dado_PP3170l"]["PP3227"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP4185Lec">${PP3407["data"]["PP3562s"][0]["valor_dado_PP3170l"]["PP3855"]}</camunda:inputParameter>
          <camunda:inputParameter name="numLec">${PP3407["data"]["PP3562s"][0]["valor_dado_PP3170l"]["PP3913"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3306">${PP3407["data"]["PP3562s"][0]["valor_dado_PP3170l"]["PP3305"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3127Lec">${PP3407["data"]["PP3562s"][0]["valor_dado_PP3170l"]["PP3127"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3242Lec">${PP3407["data"]["PP3562s"][0]["valor_dado_PP3170l"]["PP3242"]}</camunda:inputParameter>
          <camunda:inputParameter name="ufLec">${PP3407["data"]["PP3562s"][0]["valor_dado_PP3170l"]["uf"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3228">${PP3503}</camunda:inputParameter>
          <camunda:inputParameter name="chqSegVal">${PP3947['PP4299']}</camunda:inputParameter>
          <camunda:inputParameter name="PP3231">${PP3947['PP4298']}</camunda:inputParameter>
          <camunda:inputParameter name="PP3229">${PP3947['PP4406']}</camunda:inputParameter>
          <camunda:inputParameter name="PP3230">${PP3947['PP4004']}</camunda:inputParameter>
          <camunda:inputParameter name="PP3241">${PP3947['PP4418']}</camunda:inputParameter>
          <camunda:inputParameter name="PP3227PlusS">${PP3947['PP3972'] ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3227PlusN">${PP3947['PP3972'] ? "" : "X"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3211">${PP3606.hasVariable("PP3211") ? PP3211 : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3212">${PP3606.hasVariable("PP3212") ? PP3212 : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3213">${PP3606.hasVariable("PP3213") ? PP3213 : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3208">${PP3606.hasVariable("PP3208") ? PP3208 : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3209">${PP3606.hasVariable("PP3209") ? PP3209 : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3210">${PP3606.hasVariable("PP3210") ? PP3210 : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4426">${PP3504 == "01" || PP3504 == "1" ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4427">${PP3504 == "02" || PP3504 == "2" ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4428">${PP3504 == "03" || PP3504 == "3" ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4429">${PP3504 == "06" || PP3504 == "6" ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4430">${PP3504 == "17" ? "x" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4431">${PP3504 == "18" ? "x" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4432">${PP3504 == "21" ? "x" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4433">${PP3504 == "23" ? "x" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4434">${PP3504 == "25" ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4435">${PP3504 == "26" ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4436">${PP3504 == "28" ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3453">${PP3453}</camunda:inputParameter>
          <camunda:inputParameter name="PP3443">${PP3443}</camunda:inputParameter>
          <camunda:inputParameter name="PP3455">${PP3455}</camunda:inputParameter>
          <camunda:inputParameter name="PP3445">${PP3445}</camunda:inputParameter>
          <camunda:inputParameter name="PP3456">${PP3456}</camunda:inputParameter>
          <camunda:inputParameter name="PP3446">${PP3446}</camunda:inputParameter>
          <camunda:inputParameter name="PP3457">${PP3457}</camunda:inputParameter>
          <camunda:inputParameter name="PP3447">${PP3447}</camunda:inputParameter>
          <camunda:inputParameter name="PP3458">${PP3458}</camunda:inputParameter>
          <camunda:inputParameter name="PP3448">${PP3448}</camunda:inputParameter>
          <camunda:inputParameter name="PP3459">${PP3459}</camunda:inputParameter>
          <camunda:inputParameter name="PP3449">${PP3449}</camunda:inputParameter>
          <camunda:inputParameter name="PP3460">${PP3460}</camunda:inputParameter>
          <camunda:inputParameter name="PP3450">${PP3450}</camunda:inputParameter>
          <camunda:inputParameter name="PP3461">${PP3461}</camunda:inputParameter>
          <camunda:inputParameter name="PP3451">${PP3451}</camunda:inputParameter>
          <camunda:inputParameter name="PP3462">${PP3462}</camunda:inputParameter>
          <camunda:inputParameter name="PP3452">${PP3452}</camunda:inputParameter>
          <camunda:inputParameter name="PP3454">${PP3454}</camunda:inputParameter>
          <camunda:inputParameter name="PP3444">${PP3444}</camunda:inputParameter>
          <camunda:inputParameter name="PP4277">${stiContratarSeguroTransacao ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4276">${stiContratarSeguroTransacao ? "" : "X"}</camunda:inputParameter>
          <camunda:inputParameter name="PP4386">${PP3947['PP4417']}</camunda:inputParameter>
          <camunda:inputParameter name="PP4388">${PP3947['PP3918'] == "1" ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4389">${PP3947['PP3918'] == "3" ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4387">${PP3947['PP3918'] == "12" ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="fatDigS">${PP3947['PP3280'] == "S" ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="fatDigN">${PP3947['PP3280'] == "N" ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3215">${PP3947['PP3774'] == "S" ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3214">${PP3947['PP3774'] == "N" ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3240">${PP3606.hasVariable("PP3240") ? PP3240 : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3239">${PP3606.hasVariable("PP3239") ? PP3239 : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4031">${PP3606.hasVariable("PP4031") ? PP4031 : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3649">${(PP3606.hasVariable("PP3559") &amp;&amp; PP3559 == "true") ? PP3648 : http_gq_PP3329_PP3557_PP3350["PP3648"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3274">${(PP3606.hasVariable("PP3559") &amp;&amp; PP3559 == "true") ? PP3276 : http_gq_PP3329_PP3557_PP3350["cod_PP3221"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3650">${PP3653}</camunda:inputParameter>
          <camunda:inputParameter name="PP3651">${PP3653}</camunda:inputParameter>
          <camunda:inputParameter name="PP3853">${PP3242}</camunda:inputParameter>
          <camunda:inputParameter name="PP3427">${PP3467.substring(0, 10)}</camunda:inputParameter>
          <camunda:inputParameter name="pepS">${(PP3468 == true || PP3468 == "true") ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="pepN">${(PP3468 == false || PP3468 == "false") ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3914">${vinculoBeneficio ? PP3606.PP3665("PP3917") : ""}</camunda:inputParameter>
          <camunda:inputParameter name="benInssS">${vinculoBeneficio ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="benInssN">${vinculoBeneficio ? "" : "X"}</camunda:inputParameter>
          <camunda:inputParameter name="vinBenS">${vinculoBeneficio ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="vinBenN">${vinculoBeneficio ? "" : "X"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3589">${PP3606.hasVariable("PP3589") ? PP3589 : ""}</camunda:inputParameter>
          <camunda:inputParameter name="seNenhuma">${PP3606.hasVariable("seNenhuma") ? seNenhuma : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4226">${PP3606.hasVariable("PP4226") ? PP4226 : ""}</camunda:inputParameter>
          <camunda:outputParameter name="PP4171">
            <camunda:map>
              <camunda:entry key="codigo_formulario">${codigo_formulario}</camunda:entry>
              <camunda:entry key="versao_formulario">${versao_formulario}</camunda:entry>
              <camunda:entry key="arquivo_gerado">${arquivo_gerado}</camunda:entry>
              <camunda:entry key="guarda_de_PP3524">${guarda_de_PP3524}</camunda:entry>
              <camunda:entry key="codigo_guarda">${guarda_de_PP3524}</camunda:entry>
              <camunda:entry key="identificador_di4">${identificador_di4}</camunda:entry>
            </camunda:map>
          </camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1261</bpmn:incoming>
      <bpmn:outgoing>PP2093</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP2093" sourceRef="PP3659" targetRef="PP2261" />
    <bpmn:PP4199PP2865 id="PP3859" name="PP2580" PP4199Format="groovy">
      <bpmn:incoming>PP1343</bpmn:incoming>
      <bpmn:outgoing>PP1261</bpmn:outgoing>
      <bpmn:PP4199>PP3606.PP4250("modPerson", "X")
def PP3383 = PP3606.PP3665("PP3383")
def PP3394PP3383 = PP3383.substring(PP3383.length()-2,PP3383.length())
def PP3383SDac = PP3383.substring(0,PP3383.length()-2)
PP3606.PP4250("PP3383Dac", PP3394PP3383)
PP3606.PP4250("PP3383SDac", PP3383SDac)
def dadosPP0635 = PP3606.PP3665("PP3407")
if (dadosPP0635["data"]["PP3435_funPP3394ao"]["valor_dado_PP3170l"] != null) {
      def vetorData = dadosPP0635["data"]["PP3435_funPP3394ao"]["valor_dado_PP3170l"].split('-') PP3606.PP4250("PP3425", vetorData[2])
PP3606.PP4250("PP3426", vetorData[1])
PP3606.PP4250("PP3424", vetorData[0]) }
if (dadosPP0635["data"]["sexo"] != null) {
      def sexo = dadosPP0635["data"]["sexo"]["valor_dado_PP3170l"]
if (sexo == "M") {
      PP3606.PP4250("sexoM", "X")}
    else {
      PP3606.PP4250("sexoF", "X")}}
if (dadosPP0635["data"]["PP3593_civil"] != null) {
      def PP3593_civil = dadosPP0635["data"]["PP3593_civil"]["valor_dado_PP3170l"].toString() PP3606.PP4250("ecCasado", "")
PP3606.PP4250("ecDivorciado", "")
PP3606.PP4250("ecSeparado", "")
PP3606.PP4250("ecSolteiro", "")
PP3606.PP4250("ecUniaoEst", "")
PP3606.PP4250("ecViuvo", "")
switch (PP3593_civil) {
      case "608":
PP3606.PP4250("ecCasado", "X")break
case "611":
PP3606.PP4250("ecDivorciado", "X")break
case "616":
PP3606.PP4250("ecSeparado", "X")break
case "617":
PP3606.PP4250("ecSolteiro", "X")break
case "612":
PP3606.PP4250("ecUniaoEst", "X")break
case "618":
PP3606.PP4250("ecViuvo", "X")breakPP3476:
PP3606.PP4250("ecSolteiro", "X")break}}
if (dadosPP0635["data"]["PP3524s"] != null) {
      def tipoDocumento = [:]
    tipoDocumento.put("551", "RG")
    tipoDocumento.put("552", "RNE")
    tipoDocumento.put("558", "CNH")
def tipo = tipoDocumento.get(dadosPP0635["data"]["PP3524s"][0]["valor_dado_PP3170l"]["tipo"].toString()) PP3606.PP4250("PP4328", tipo)
def PP3913_PP3524 = dadosPP0635["data"]["PP3524s"][0]["valor_dado_PP3170l"]["PP3913"] PP3606.PP4250("PP3913_PP3524", PP3913_PP3524) }
    else {
      PP3606.PP4250("PP4328", "")
PP3606.PP4250("PP3913_PP3524", "") }
if (dadosPP0635["data"]["parentescos"] != null ) {
      def nomeMae = dadosPP0635["data"]["parentescos"][0]["valor_dado_PP3170l"]["nome"]PP3606.PP4250("nome_mae", nomeMae)}
    else {
      PP3606.PP4250("nome_mae", "")}
if (dadosPP0635["data"]["grau_PP3590"] != null) {
      def grau_PP3590 = dadosPP0635["data"]["grau_PP3590"]["valor_dado_PP3170l"] PP3606.PP4250("grau_PP3590", grau_PP3590) }
    else {
      PP3606.PP4250("grau_PP3590", "") }

    def PP3390 = PP3606.PP3665("PP4395") + "/" + PP3606.PP3665("PP4394")
PP3606.PP4250("PP3390", PP3390)
def PP3947 = PP3606.PP3665("PP3947")
// Listagem de Debitos
import groovy.json.JsonSlurper
import org.camunda.spin.Spin
def responseConsultaDebito = PP3606.PP3665("PP4148")
(1..10).each {
      i -&gt;
    PP3606.PP4250("debitoPP4044${
      i}", "")
PP3606.PP4250("debitoPP3376${
      i}", "")
if (responseConsultaDebito != null) {
      def responseString = Spin.JSON(responseConsultaDebito).toString()
def slurper = new JsonSlurper()
def json = slurper.parseText(responseString)
def PP3380 = json?.PP3380 ?: []
PP3380.eachWithIndex {
      PP3376, index -&gt;

    def PP4044 = PP3376?.nomeProduto ?: ""
def PP3913PP0675 = PP3376?.PP3913 ?: "" PP3606.PP4250("debitoPP4044${
      index + 1}", PP4044.toString())
PP3606.PP4250("debitoPP3376${
      index + 1}", PP3913PP0675.toString())}}
// Seguro Transacao
PP3606.PP4250("stiContratarSeguroTransacao", false)
def PP3934_PP4234_transacao = PP3606.PP3665("PP3949")
if (PP3934_PP4234_transacao != null &amp;
    &amp;
    PP3934_PP4234_transacao != "" &amp;
    &amp;
    PP3934_PP4234_transacao != "Sem PP4234"){
      PP3606.PP4250("stiContratarSeguroTransacao", PP3934_PP4234_transacao['PP3372']) }
// CARTAOdef regra_cartao_person_aplicada = PP3606.hasVariable("regra_aplicada_person") &amp;
    &amp;
    PP3606.PP3665("regra_aplicada_person")
def PP3293 = PP3947['PP3293'] def PP3129PP0573 = [:] PP3129PP0573.put("04", "VISA") PP3129PP0573.put("01", "MASTER")
PP3606.PP4250("PP3131", PP3129PP0573.get(PP3947['PP3131']))
def tipoPP0573 = [:] tipoPP0573.put("M", "multiplo") tipoPP0573.put("D", "debito")
PP3606.PP4250("PP4325", tipoPP0573.get(PP3947['PP3293']))
switch (PP3293) {
      case "M":
PP3606.PP4250("PP3239", "X")
PP3606.PP4250("PP3211", "X")
PP3606.PP4250("PP3212", PP3947['PP3131'] == "01" ? "X" : "")
PP3606.PP4250("PP3213", PP3947['PP3131'] == "04" ? "X" : "") break case "C": PP3606.PP4250("PP3239", "X")
PP3606.PP4250("PP3208", "X")
PP3606.PP4250("PP3209", PP3947['PP3131'] == "01" ? "X" : "")
PP3606.PP4250("PP3210", PP3947['PP3131'] == "04" ? "X" : "") break case "D": PP3606.PP4250("PP3240", "X")
PP3606.PP4250("PP4031", "X") PP3476: break }
if (PP3947['PP3779'] == "S") {
      PP3606.PP4250("carCredLimS", "X")
PP3606.PP4250("carCredLimN", "")}
    else {
      PP3606.PP4250("carCredLimS", "")
PP3606.PP4250("carCredLimN", "X")}
if (PP3947['PP3286'] == "PM") {
      PP3606.PP4250("pacPlus", "")
PP3606.PP4250("pacMaxi", "X")}
    else {
      PP3606.PP4250("pacMaxi", "")
PP3606.PP4250("pacPlus", "X")}
if (dadosPP0635["data"]['profissao'] == null) {
      PP3606.PP4250("tipo_profissao", "")}
    else {
      def tipoProfissao = [:]
    tipoProfissao.put("959", "ACOUGUEIRO")
    tipoProfissao.put("960", "PP0014MINISTRPP0014OR")
    tipoProfissao.put("961", "PP0014VOGPP0014O")
    tipoProfissao.put("962", "AEROVIARIOS")
    tipoProfissao.put("963", "AFIPP0014OR")
    tipoProfissao.put("964", "AGENCIPP0014OR DE PROPP2652GANDA")
    tipoProfissao.put("965", "AGENCIPP0014OR PP2800RVICOS (TRANSP.)")
    tipoProfissao.put("966", "AGENTE PP0014MISTRATIVO")
    tipoProfissao.put("967", "AGENTE VIAGEM/GUIA/AFINS")
    tipoProfissao.put("968", "AGRONOMO")
    tipoProfissao.put("969", "AJUDANTE GERAL/PP2800RVENTE")
    tipoProfissao.put("970", "AJUDANTE PRODUCAO/MEIO OFICIAL")
    tipoProfissao.put("971", "AJUSTPP0014OR/RETIFICPP0014OR")
    tipoProfissao.put("972", "ALFAIATE")
    tipoProfissao.put("973", "ALMOXARIFE")
    tipoProfissao.put("974", "ANAPP2533TA CRED/COBRANCA/CPP0014/GAR")
    tipoProfissao.put("975", "ANAPP2533TA CUSTOS/PROJ/PP2800RV/ECON")
    tipoProfissao.put("976", "ANAPP2533TA DE CARGOS/RH")
    tipoProfissao.put("12401", "ANAPP2533TA DE NEGOCIOS")
    tipoProfissao.put("977", "ANAPP2533TA PRODUCAO/CRONOANAPP2533")
    tipoProfissao.put("978", "ANAPP2533TA SISTEMAS")
    tipoProfissao.put("979", "ANAPP2533TA/METODO/HARD/SOFT")
    tipoProfissao.put("980", "APP2665PP2800NTPP0014O")
    tipoProfissao.put("981", "ARMARDOR DE FERRAGENS")
    tipoProfissao.put("982", "ARQUITETO")
    tipoProfissao.put("983", "ARRENDATARIO/MEEIRO/PP2652RCELEIRO")
    tipoProfissao.put("984", "ARTISTA PLAPP2807C/PINTOR/ESCULT")
    tipoProfissao.put("985", "ASPP2800SSOR/SUPERINTENDENTE/CHEFE")
    tipoProfissao.put("986", "ASSISTENTE/AGENTES SOCIAIS")
    tipoProfissao.put("12405", "ASTROLOGOS E AFINS")
    tipoProfissao.put("987", "ATEN ENFERM/CUIDPP0014OR/AG SAUDE")
    tipoProfissao.put("988", "ATLETA PROF/TECNICO/ARBITROS")
    tipoProfissao.put("989", "ATOR/DIR ESPETACULOS PUBLICOS")
    tipoProfissao.put("990", "ATUARIO/MATEMATICO")
    tipoProfissao.put("5369", "AUTONOMO")
    tipoProfissao.put("991", "APP2962 EPP2796/FATUR/BILH/CONF/EXPED")
    tipoProfissao.put("992", "APP2962 EPP2796ITORIO")
    tipoProfissao.put("993", "APP2962. COZINHA/COSTURA/LIMPEZA")
    tipoProfissao.put("994", "APP2962ILIAR LABORATORIO")
    tipoProfissao.put("995", "BAILARINO/COREOGRAFO")
    tipoProfissao.put("996", "BANCARIO/ECONOMIARIO")
    tipoProfissao.put("997", "BENEFICIARIO")
    tipoProfissao.put("998", "BIBLIOT/ARQUIV/MUPP2800OL/ARQUEOL")
    tipoProfissao.put("999", "BIOLOGO/BIOMEDICO")
    tipoProfissao.put("1001", "BOMBEIRO INSTAL GAS/AGUA/ESG")
    tipoProfissao.put("1002", "BORRACHEIRO, DEDETIZPP0014OR")
    tipoProfissao.put("1003", "CALCETEIRO/CANTEIRO/MARM/VIDRA")
    tipoProfissao.put("1004", "CALHISTA/TELHPP0014ISTA/ANTENISTA")
    tipoProfissao.put("1005", "CANTOR/COMPP2665SITOR")
    tipoProfissao.put("1006", "CPP0020TAPP2533TA")
    tipoProfissao.put("1007", "CARPINTEIRO/MARCENEIRO")
    tipoProfissao.put("12402", "CARTAZEIRO")
    tipoProfissao.put("1008", "CARTORARIO")
    tipoProfissao.put("1009", "CAPP2800IRO/JARDINEIRO")
    tipoProfissao.put("1010", "CAVALARICOS/FERRPP0014OR/TRATPP0014OR")
    tipoProfissao.put("1011", "CHEFE COZINHA/MAITRE/BARMAN")
    tipoProfissao.put("1012", "CHEFE INTERMEDIARIO")
    tipoProfissao.put("1013", "COBRPP0014OR/BILHET TRANSP COLET")
    tipoProfissao.put("9715", "COMANDANTE DE EMBARCACOES")
    tipoProfissao.put("1015", "COMENT/RPP0014IAL/LOCUT RPP0014IO/TV")
    tipoProfissao.put("1014", "COMERC EXTERIOR/OUTROS COMERC")
    tipoProfissao.put("1016", "COMERCIARIOS")
    tipoProfissao.put("1017", "COMISSARIO DE BORDO")
    tipoProfissao.put("1018", "COMUNICOLOGO/APREPP2800NTPP0014ORES")
    tipoProfissao.put("1020", "CONTPP0014OR/PERITOS CONTABEIS")
    tipoProfissao.put("1019", "CONTINUO/ENTREGPP0014OR/MOTOQUEIRO")
    tipoProfissao.put("1021", "CONTRAMESTRE DE EMBARCACOES")
    tipoProfissao.put("1022", "CORRETOR IMOV/PP2800G/TITULO VLR")
    tipoProfissao.put("1023", "CORTPP0014OR")
    tipoProfissao.put("1024", "COSTUREIRA/BORDPP0014/OVERL/CAPP2800A")
    tipoProfissao.put("1025", "DECORPP0014OR")
    tipoProfissao.put("1026", "DELEGPP0014O DE PP2665LICIA")
    tipoProfissao.put("1027", "DEMONSTRPP0014OR")
    tipoProfissao.put("1028", "DENTISTA")
    tipoProfissao.put("1029", "DEPUT EST/FED PP2800NPP0014/VEREPP0014OR")
    tipoProfissao.put("1030", "DEPP2800MB/JUIZ/PP2665D JUDIC/TRIB SUP")
    tipoProfissao.put("1031", "DEPP2800NHISTA COMERCIAL")
    tipoProfissao.put("1032", "DEPP2800NHISTA INDUSTRIAL")
    tipoProfissao.put("1033", "DEPP2800NHISTA TECNICO/PROJETISTA")
    tipoProfissao.put("1034", "DESPP2653HANTE")
    tipoProfissao.put("12406", "DETETIVES E PP2800RV INTELIGENCIA")
    tipoProfissao.put("1035", "DIGITPP0014OR")
    tipoProfissao.put("1036", "DIPLOMATA")
    tipoProfissao.put("1037", "DIRETOR DE EMPRESAS")
    tipoProfissao.put("1038", "DIRETOR ESTABELECIM ENSINO")
    tipoProfissao.put("1039", "DIRETOR/ASPP2800SSOR INDUSTRIAL")
    tipoProfissao.put("1040", "DIRETOR/ASPP2800SSOR SUPERIOR")
    tipoProfissao.put("12404", "DIRIG PEQUENAS COMUNIDPP0014ES")
    tipoProfissao.put("1238", "DOMINIO INVALIDO")
    tipoProfissao.put("1041", "DONA DE CASA")
    tipoProfissao.put("1042", "ECONOMISTA")
    tipoProfissao.put("1043", "ELETR VEIC/MAQ/ELETRON/TELECOM")
    tipoProfissao.put("1044", "ELETRICISTA DE INSTALACOES")
    tipoProfissao.put("1045", "ELETRICISTA DE PRODUCAO INDUST...")
    tipoProfissao.put("1046", "ELETRICISTA INDUSTRIAL")
    tipoProfissao.put("1047", "EMPREG RESTAUR, BUFE, LANCH")
    tipoProfissao.put("1049", "EMPREGPP0014O DOMEPP2807CO")
    tipoProfissao.put("1048", "EMPREGPP0014OS DOMEPP2807COS EM GERAL")
    tipoProfissao.put("1050", "EMPRESARIO/PRODUTOR ESPETAC")
    tipoProfissao.put("1051", "ENFERMEIRO/NUTRICIONISTA")
    tipoProfissao.put("1052", "ENGENHEIRO")
    tipoProfissao.put("1053", "ESPP2665LIO")
    tipoProfissao.put("1054", "ESTATIPP2807CO")
    tipoProfissao.put("1055", "EPP2807VPP0014OR/CARREGPP0014OR/EMBALPP0014")
    tipoProfissao.put("1000", "ESTUDANTE/BOLSISTA/ESTAGIARIO")
    tipoProfissao.put("12407", "EXTRACAO/ BENEF DE MINERIOS")
    tipoProfissao.put("1056", "FARMACEUTICO")
    tipoProfissao.put("1057", "FEIRANTE")
    tipoProfissao.put("1058", "FERRAMENTEIRO")
    tipoProfissao.put("1059", "FISCAL")
    tipoProfissao.put("1060", "FISICO")
    tipoProfissao.put("1061", "FISIOTERAPEUTA/TO/PREP FISICO")
    tipoProfissao.put("1062", "FONOAUDIOLOGO")
    tipoProfissao.put("1063", "FRENTISTA/MANOB/LAV CARRO/LUBR")
    tipoProfissao.put("1064", "FRESPP0014OR")
    tipoProfissao.put("1065", "FUNCIONARIO EMPRESA PUBLICA")
    tipoProfissao.put("1066", "FUNCIONARIO PUB CIVIL APP2665PP2800NT")
    tipoProfissao.put("1067", "FUNDIDOR")
    tipoProfissao.put("1068", "GARIMPEIRO")
    tipoProfissao.put("1069", "GEOGRAFO")
    tipoProfissao.put("1070", "GEOLOGO")
    tipoProfissao.put("1071", "GERENTE")
    tipoProfissao.put("1073", "GUARDPP0014OR DE CARRO/ENGRAXATE")
    tipoProfissao.put("1074", "IMPRESSOR/LINOTIPIST/BLOQ/OPER")
    tipoProfissao.put("1075", "INSPETOR CONTROLE QUALIDPP0014E")
    tipoProfissao.put("1076", "INSTRUMENTISTA")
    tipoProfissao.put("1077", "JOALHEIRO/OURIVES")
    tipoProfissao.put("1078", "JORNALEIRO")
    tipoProfissao.put("1079", "JORNAPP2533TA E AFINS")
    tipoProfissao.put("1080", "LANTERN/PINTOR VEICULO METALIC")
    tipoProfissao.put("1081", "LEILOEIRO/AVALIPP0014OR")
    tipoProfissao.put("1082", "LEITURISTA")
    tipoProfissao.put("1083", "LIXEIRO/GARI/VARREDOR/LIMPEZA")
    tipoProfissao.put("1084", "MANUTENCAO")
    tipoProfissao.put("1085", "MAQ/FOGUISTA EMBARC/LOCOMOTIV")
    tipoProfissao.put("1086", "MARCENEIRO")
    tipoProfissao.put("1087", "MARINHEIRO")
    tipoProfissao.put("1089", "MECANICO MANUT VEICULO/MAQ")
    tipoProfissao.put("1088", "MECANICO MAQ/REFRIGERACAO")
    tipoProfissao.put("1090", "MEDICO")
    tipoProfissao.put("1091", "MEMBROS MINIST PUBLICO UNIAO")
    tipoProfissao.put("12403", "MERGULHPP0014OR PROFISSIONAL")
    tipoProfissao.put("1092", "MESTRE/ENCARREG PROD INDUSTR")
    tipoProfissao.put("1093", "METALURGICO/SIDERURGICO")
    tipoProfissao.put("1094", "METEOROLOGISTA")
    tipoProfissao.put("1095", "MILITAR")
    tipoProfissao.put("1096", "MILITAR REFORMPP0014O")
    tipoProfissao.put("1097", "MINISTRO/GOV/PREFEITO/PP2800CR")
    tipoProfissao.put("1098", "MODELO DE MODAS")
    tipoProfissao.put("1099", "MOTORISTA AUTONOMO/TAXISTA")
    tipoProfissao.put("1100", "MOTORISTA VEIC TRANSP CARGA")
    tipoProfissao.put("1101", "MOTORISTA VEIC TRANSP PP2652SSAG")
    tipoProfissao.put("1102", "MUSICO")
    tipoProfissao.put("1103", "OFICIAL DA PP2665LICIA MILITAR")
    tipoProfissao.put("1104", "OFICIAL FORCAS ARMPP0014AS/APP2962IL")
    tipoProfissao.put("1106", "OPER CAMERA/AUDIO/DJ/SONOPL")
    tipoProfissao.put("1107", "OPER COMPUTPP0014OR/SUP TECNICO")
    tipoProfissao.put("1105", "OPER GUIND/EMPILH/TRATOR/CALD")
    tipoProfissao.put("1108", "OPERPP0014OR DE CALDEIRAS")
    tipoProfissao.put("1109", "OPERPP0014OR EM GERAL/SOLDPP0014OR")
    tipoProfissao.put("1110", "OPERPP0014OR MAQUINAS PRODUCAO")
    tipoProfissao.put("1113", "OUTROS DEPP2800NHISTAS")
    tipoProfissao.put("1114", "OUTROS TECNICOS")
    tipoProfissao.put("1115", "OUTROS TRAB ENSINO NIVEL SUP")
    tipoProfissao.put("1116", "OUTROS TRABALHPP0014ORES INDUST")
    tipoProfissao.put("1117", "OUTROS TRABALHPP0014ORES RURAIS")
    tipoProfissao.put("5370", "PPP0015E/PP2652STOR/RABINO")
    tipoProfissao.put("1118", "PEDREIRO/ENCAN/AZULEJ/IMPERM")
    tipoProfissao.put("1119", "PENSIONISTA")
    tipoProfissao.put("1120", "PESCPP0014OR")
    tipoProfissao.put("12410", "PESQ DE MERCPP0014O/ RECENPP2800PP0014ORES")
    tipoProfissao.put("1121", "PILOTO DE AERONAVES")
    tipoProfissao.put("1122", "PINTOR DE PP2652REDES/GESSISTA")
    tipoProfissao.put("1123", "PP2665RT EDIF/ASCENSS/GARAG/FAXIN")
    tipoProfissao.put("1124", "PRENSISTA/ESTAMPPP0014OR")
    tipoProfissao.put("1125", "PREPP2652RPP0014OR DE MAQUINAS")
    tipoProfissao.put("1126", "PROCURPP0014OR E ASPP2800MELHPP0014OS")
    tipoProfissao.put("1127", "PROF ENSINO FUNDAMENTAL/MEDIO")
    tipoProfissao.put("1129", "PROF HOTEL/PP2665RT/COZIN/GARCOM")
    tipoProfissao.put("1130", "PROF MANUT/OPER EQUIP INDUST")
    tipoProfissao.put("1128", "PROFESSOR/PESQ ENSINO SUP")
    tipoProfissao.put("1131", "PROFISS PP2800RVICOS FUNERARIOS")
    tipoProfissao.put("1132", "PROFISSIONAL ESTETICA")
    tipoProfissao.put("1133", "PROFISSIONAL LETRAS E ARTES")
    tipoProfissao.put("1134", "PROGRAMPP0014OR DE COMPUTPP0014OR")
    tipoProfissao.put("1135", "PROGRAMPP0014OR DE PRODUCAO")
    tipoProfissao.put("1136", "PROMOTOR VENDA")
    tipoProfissao.put("1137", "PROPR ESTAB AGRI/PECU/FLOREST")
    tipoProfissao.put("1138", "PROPR ESTAB COMERCIAL")
    tipoProfissao.put("1139", "PROPR ESTAB INDUSTRIAL")
    tipoProfissao.put("1140", "PROPR ESTAB PRESTACAO PP2800RVIC")
    tipoProfissao.put("1141", "PROPRIETARIO IMOVEIS")
    tipoProfissao.put("1142", "PROPRIETARIO MICROEMPRESA")
    tipoProfissao.put("1143", "PROTETICO")
    tipoProfissao.put("1144", "PSICOLOGO")
    tipoProfissao.put("1145", "PUBLICITARIO")
    tipoProfissao.put("1146", "QUIMICO")
    tipoProfissao.put("1147", "RELACOES PUBLICAS")
    tipoProfissao.put("1148", "REPR COMERC/CAIX VIAJ/VENDED")
    tipoProfissao.put("1149", "SACERDOTE")
    tipoProfissao.put("1150", "PP2800CRET/DATILOG/REPP0530/TELFONIS")
    tipoProfissao.put("1151", "PP2800CURITARIO")
    tipoProfissao.put("1237", "PP2800M VALOR")
    tipoProfissao.put("1152", "PP2800RRALHEIRO")
    tipoProfissao.put("1153", "PP2800RV PUBLICO ESTPP0014UAL")
    tipoProfissao.put("1154", "PP2800RV PUBLICO FEDERERAL")
    tipoProfissao.put("1155", "PP2800RV PUBLICO MUNICIPP2652L")
    tipoProfissao.put("1156", "PP2800RVENTUARIO DA JUPP2807CA")
    tipoProfissao.put("1157", "SOCIOLOGO")
    tipoProfissao.put("1158", "SUPERV/INSP/AGENT COMP/VEND")
    tipoProfissao.put("1159", "TABELIAO")
    tipoProfissao.put("1160", "TECN ELETRIC/ELETRON/TELECOM")
    tipoProfissao.put("1161", "TECNICO AGRIMENSURA/ AGRONOMIA")
    tipoProfissao.put("1162", "TECNICO BIOLOGIA")
    tipoProfissao.put("1163", "TECNICO CONTABIL/ESTATIPP2807CA")
    tipoProfissao.put("1164", "TECNICO LABOR/ENFERM/ODONTO")
    tipoProfissao.put("1165", "TECNICO MECANICA")
    tipoProfissao.put("1166", "TECNICO QUIMICA")
    tipoProfissao.put("1167", "TECNOLOGO")
    tipoProfissao.put("1168", "TORNEIRO")
    tipoProfissao.put("1169", "TRAB ARTES GRAFICAS")
    tipoProfissao.put("1170", "TRAB CONTABIL/CAIXA")
    tipoProfissao.put("1173", "TRAB FABRIC CALCPP0014OS/COURO")
    tipoProfissao.put("1171", "TRAB FABRICACAO ALIM/BEBIDAS")
    tipoProfissao.put("1172", "TRAB FABRICACAO BORRACHA")
    tipoProfissao.put("1174", "TRAB FABRICACAO PP2652PEL")
    tipoProfissao.put("1175", "TRAB FABRICACAO ROUPP2652S")
    tipoProfissao.put("1176", "TRAB FABRICACAO TEXTEIS")
    tipoProfissao.put("1184", "TRAB FLOREST/EXTRAT/MEIO AMB")
    tipoProfissao.put("12408", "TRAB LOGIPP2807CA E TRANSPP2665RTE")
    tipoProfissao.put("1177", "TRAB PROCESSMTO QUIMICOS")
    tipoProfissao.put("12409", "TRAB PRODUCAO DE VIDRO E AFINS")
    tipoProfissao.put("1178", "TRAB USINAGEM DE METAIS")
    tipoProfissao.put("1179", "TRABALHPP0014OR AGRICOLA/PECUARIA")
    tipoProfissao.put("1180", "TRABALHPP0014OR CONSTRUCAO CIVIL")
    tipoProfissao.put("1181", "TRABALHPP0014OR DA PECUARIA")
    tipoProfissao.put("1182", "TRABALHPP0014OR DE CASA NOTURNA")
    tipoProfissao.put("1183", "TRABALHPP0014OR DE GRANJA")
    tipoProfissao.put("1185", "TRABALHPP0014OR FUMO/CIG/CHARU")
    tipoProfissao.put("1186", "VENDED VAREJISTA/ATACPP0014ISTA")
    tipoProfissao.put("1187", "VENDEDORES AUT/AMBUL/CAMELO")
    tipoProfissao.put("1188", "VETERINARIO/ZOOTECNISTA")
    tipoProfissao.put("1189", "VIGIA/PP2800GURANCA/BOMBEIRO")
    tipoProfissao.put("1190", "ZELPP0014OR")
def tipo_profissao = tipoProfissao.get(PP3407["data"]["profissao"]["valor_dado_PP3170l"].toString());
    PP3606.PP4250("tipo_profissao", tipo_profissao ? tipo_profissao : "") }
    
// Beneficio PP2493 if(PP3606.hasVariable( 'PP4311') &amp;
    &amp;
    PP4311) {
      PP3606.PP4250('vinculoBeneficio', true) }
    else {
      PP3606.PP4250('vinculoBeneficio', false) }
// Situacoes especiaisif(PP3606.hasVariable('PP4266') &amp;
    &amp;
    PP3606.PP3665('PP4266') != null &amp;
    &amp;
    PP3606.PP3665('PP4266') != '') {
      def situacoesEspeciaisPP2653 = PP3606.PP3665("PP4266") switch (situacoesEspeciaisPP2653) case 'nao alfabetizado': 
PP3606.PP4250('PP3589', 'X') break case 'menor emancipado': 
PP3606.PP4250('PP4226', 'X') break PP3476: PP3606.PP4250('seNenhuma', 'X') PP3606.PP4250('PP3589', '')
PP3606.PP4250('PP4226', '') }
    }
    else {
      PP3606.PP4250('seNenhuma', 'X')
PP3606.PP4250('PP3589', '')
PP3606.PP4250('PP4226', '') }
// Ad Novodef PP3937 = PP3606.PP3665("PP3937")
def flagAdAntigo = PP3947['PP3368']def flagAdNovo = ""if(PP3937 != null &amp;
    &amp;
    PP3937 != "" &amp;
    &amp;
    !PP3937.toString().equalsIgnoreCase("PP0014 antigo")){
      flagAdNovo = PP3937['PP3368']}
    PP3606.PP4250("flagAd", false)
if (flagAdNovo == true || flagAdAntigo.toString().equalsIgnoreCase("true")){
      PP3606.PP4250("flagAd", true)}</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:sequenceFlow id="PP1261" sourceRef="PP3859" targetRef="PP3659" />
    <bpmn:PP4199PP2865 id="PP3858" name="PP2579" PP4199Format="groovy">
      <bpmn:incoming>PP1445</bpmn:incoming>
      <bpmn:outgoing>PP1907</bpmn:outgoing>
      <bpmn:PP4199>def PP4229 = PP3606.PP3665('PP4229')
switch (PP4229) {
      case '3':
PP3606.PP4250("codigo_formulario", "24259-4")
PP3606.PP4250("PP3275", "1222")
break;
    case 'L':
PP3606.PP4250("codigo_formulario", "24262-8")
PP3606.PP4250("PP3275", "1225")
break;
    PP3476:break;
    }
// Listagem de Debitos
import groovy.json.JsonSlurper
import org.camunda.spin.Spin
def responseConsultaDebito = PP3606.PP3665("PP4148")
(1..10).each {
      i -&gt;
    PP3606.PP4250("debitoPP4044${
      i}", "")
PP3606.PP4250("debitoPP3376${
      i}", "")}
if (responseConsultaDebito != null)
def responseString = Spin.JSON(responseConsultaDebito).toString()
def slurper = new JsonSlurper()
def json = slurper.parseText(responseString)
def PP3380 = json?.PP3380 ?: []
PP3380.eachWithIndex {
      PP3376, index -&gt;

    def PP4044 = PP3376?.nomeProduto ?: ""
def PP3913PP0675 = PP3376?.PP3913 ?: "" PP3606.PP4250("debitoPP4044${
      index + 1}", PP4044.toString())
PP3606.PP4250("debitoPP3376${
      index + 1}", PP3913PP0675.toString())}}
// Seguro Transacao
PP3606.PP4250("stiContratarSeguroTransacao", false)
def PP3934_PP4234_transacao = PP3606.PP3665("PP3949")
if (PP3934_PP4234_transacao != null &amp;
    &amp;
    PP3934_PP4234_transacao != "" &amp;
    &amp;
    PP3934_PP4234_transacao != "Sem PP4234"){
      PP3606.PP4250("stiContratarSeguroTransacao", PP3934_PP4234_transacao['PP3372']) }

    def PP3383 = PP3606.PP3665("PP3383")
def PP3394PP3383 = PP3383.substring(PP3383.length()-2,PP3383.length())
def PP3383SDac = PP3383.substring(0,PP3383.length()-2)
PP3606.PP4250("PP3383Dac", PP3394PP3383)
PP3606.PP4250("PP3383SDac", PP3383SDac)
// €stado Civildef dadosPP0635 = PP3606.PP3665("PP3407")
// Nao @ obrigatorioif(dadosPP0635["data"]["PP3593_civil"] != null) {
      def PP3593_civil = [:]
    PP3593_civil.put("608", "Casado")
    PP3593_civil.put("611", "Divorciado")
    PP3593_civil.put("616", "Separado")
    PP3593_civil.put("617", "Solteiro")
    PP3593_civil.put("612", "Uniao Estavel")
    PP3593_civil.put("618", "Viuvo")
def PP3595 = PP3593_civil.get(dadosPP0635["data"]["PP3593_civil"]["valor_dado_PP3170l"].toString()) PP3606.PP4250("PP3593_civil", PP3595)}
    else {
      PP3606.PP4250("PP3593_civil", "")}
// Não é obrigatorioif(dadosPP0635["data"]["PP3524s"] != null){
      def tipoDocumento = [:]
    tipoDocumento.put("551", "RG")
    tipoDocumento.put("552", "RNE")
    tipoDocumento.put("558", "CNH")
def tipo = tipoDocumento.get(dadosPP0635["data"]["PP3524s"][0]["valor_dado_PP3170l"]["tipo"].toString()) PP3606.PP4250("PP4328", tipo)
def PP3913_PP3524 = dadosPP0635["data"]["PP3524s"][0]["valor_dado_PP3170l"]["PP3913"] PP3606.PP4250("PP3913_PP3524", PP3913_PP3524) }
    else {
      PP3606.PP4250("PP4328", "")
PP3606.PP4250("PP3913_PP3524", "") }
if (dadosPP0635["data"]["parentescos"] != null ){
      def nomeMae = dadosPP0635["data"]["parentescos"][0]["valor_dado_PP3170l"]["nome"]PP3606.PP4250("nome_mae", nomeMae)}
    else {
      PP3606.PP4250("nome_mae", "")}
// Campos retirados do bpmn(grau_PP3590, sexo)
if (dadosPP0635["data"]["grau_PP3590"] != null){
      def grau_PP3590 = dadosPP0635["data"]["grau_PP3590"]["valor_dado_PP3170l"] PP3606.PP4250("grau_PP3590", grau_PP3590) }
    else {
      PP3606.PP4250("grau_PP3590", "") }
if (dadosPP0635["data"]["sexo"] != null){
      def sexo = dadosPP0635["data"]["sexo"]["valor_dado_PP3170l"]PP3606.PP4250("sexo", sexo)}
    else {
      PP3606.PP4250("sexo", "")}
if (dadosPP0635["data"]['profissao'] == null){
      PP3606.PP4250("tipo_profissao", "")}
    else {
      def tipoProfissao = [:]
    tipoProfissao.put("959", "ACOUGUEIRO")
    tipoProfissao.put("960", "PP0014MINISTRPP0014OR")
    tipoProfissao.put("961", "PP0014VOGPP0014O")
    tipoProfissao.put("962", "AEROVIARIOS")
    tipoProfissao.put("963", "AFIPP0014OR")
    tipoProfissao.put("964", "AGENCIPP0014OR DE PROPP2652GANDA")
    tipoProfissao.put("965", "AGENCIPP0014OR PP2800RVICOS (TRANSP.)")
    tipoProfissao.put("966", "AGENTE PP0014MISTRATIVO")
    tipoProfissao.put("967", "AGENTE VIAGEM/GUIA/AFINS")
    tipoProfissao.put("968", "AGRONOMO")
    tipoProfissao.put("969", "AJUDANTE GERAL/PP2800RVENTE")
    tipoProfissao.put("970", "AJUDANTE PRODUCAO/MEIO OFICIAL")
    tipoProfissao.put("971", "AJUSTPP0014OR/RETIFICPP0014OR")
    tipoProfissao.put("972", "ALFAIATE")
    tipoProfissao.put("973", "ALMOXARIFE")
    tipoProfissao.put("974", "ANAPP2533TA CRED/COBRANCA/CPP0014/GAR")
    tipoProfissao.put("975", "ANAPP2533TA CUSTOS/PROJ/PP2800RV/ECON")
    tipoProfissao.put("976", "ANAPP2533TA DE CARGOS/RH")
    tipoProfissao.put("12401", "ANAPP2533TA DE NEGOCIOS")
    tipoProfissao.put("977", "ANAPP2533TA PRODUCAO/CRONOANAPP2533")
    tipoProfissao.put("978", "ANAPP2533TA SISTEMAS")
    tipoProfissao.put("979", "ANAPP2533TA/METODO/HARD/SOFT")
    tipoProfissao.put("980", "APP2665PP2800NTPP0014O")
    tipoProfissao.put("981", "ARMARDOR DE FERRAGENS")
    tipoProfissao.put("982", "ARQUITETO")
    tipoProfissao.put("983", "ARRENDATARIO/MEEIRO/PP2652RCELEIRO")
    tipoProfissao.put("984", "ARTISTA PLAPP2807C/PINTOR/ESCULT")
    tipoProfissao.put("985", "ASPP2800SSOR/SUPERINTENDENTE/CHEFE")
    tipoProfissao.put("986", "ASSISTENTE/AGENTES SOCIAIS")
    tipoProfissao.put("12405", "ASTROLOGOS E AFINS")
    tipoProfissao.put("987", "ATEN ENFERM/CUIDPP0014OR/AG SAUDE")
    tipoProfissao.put("988", "ATLETA PROF/TECNICO/ARBITROS")
    tipoProfissao.put("989", "ATOR/DIR ESPETACULOS PUBLICOS")
    tipoProfissao.put("990", "ATUARIO/MATEMATICO")
    tipoProfissao.put("5369", "AUTONOMO")
    tipoProfissao.put("991", "APP2962 EPP2796/FATUR/BILH/CONF/EXPED")
    tipoProfissao.put("992", "APP2962 EPP2796ITORIO")
    tipoProfissao.put("993", "APP2962. COZINHA/COSTURA/LIMPEZA")
    tipoProfissao.put("994", "APP2962ILIAR LABORATORIO")
    tipoProfissao.put("995", "BAILARINO/COREOGRAFO")
    tipoProfissao.put("996", "BANCARIO/ECONOMIARIO")
    tipoProfissao.put("997", "BENEFICIARIO")
    tipoProfissao.put("998", "BIBLIOT/ARQUIV/MUPP2800OL/ARQUEOL")
    tipoProfissao.put("999", "BIOLOGO/BIOMEDICO")
    tipoProfissao.put("1001", "BOMBEIRO INSTAL GAS/AGUA/ESG")
    tipoProfissao.put("1002", "BORRACHEIRO, DEDETIZPP0014OR")
    tipoProfissao.put("1003", "CALCETEIRO/CANTEIRO/MARM/VIDRA")
    tipoProfissao.put("1004", "CALHISTA/TELHPP0014ISTA/ANTENISTA")
    tipoProfissao.put("1005", "CANTOR/COMPP2665SITOR")
    tipoProfissao.put("1006", "CPP0020TAPP2533TA")
    tipoProfissao.put("1007", "CARPINTEIRO/MARCENEIRO")
    tipoProfissao.put("12402", "CARTAZEIRO")
    tipoProfissao.put("1008", "CARTORARIO")
    tipoProfissao.put("1009", "CAPP2800IRO/JARDINEIRO")
    tipoProfissao.put("1010", "CAVALARICOS/FERRPP0014OR/TRATPP0014OR")
    tipoProfissao.put("1011", "CHEFE COZINHA/MAITRE/BARMAN")
    tipoProfissao.put("1012", "CHEFE INTERMEDIARIO")
    tipoProfissao.put("1013", "COBRPP0014OR/BILHET TRANSP COLET")
    tipoProfissao.put("9715", "COMANDANTE DE EMBARCACOES")
    tipoProfissao.put("1015", "COMENT/RPP0014IAL/LOCUT RPP0014IO/TV")
    tipoProfissao.put("1014", "COMERC EXTERIOR/OUTROS COMERC")
    tipoProfissao.put("1016", "COMERCIARIOS")
    tipoProfissao.put("1017", "COMISSARIO DE BORDO")
    tipoProfissao.put("1018", "COMUNICOLOGO/APREPP2800NTPP0014ORES")
    tipoProfissao.put("1020", "CONTPP0014OR/PERITOS CONTABEIS")
    tipoProfissao.put("1019", "CONTINUO/ENTREGPP0014OR/MOTOQUEIRO")
    tipoProfissao.put("1021", "CONTRAMESTRE DE EMBARCACOES")
    tipoProfissao.put("1022", "CORRETOR IMOV/PP2800G/TITULO VLR")
    tipoProfissao.put("1023", "CORTPP0014OR")
    tipoProfissao.put("1024", "COSTUREIRA/BORDPP0014/OVERL/CAPP2800A")
    tipoProfissao.put("1025", "DECORPP0014OR")
    tipoProfissao.put("1026", "DELEGPP0014O DE PP2665LICIA")
    tipoProfissao.put("1027", "DEMONSTRPP0014OR")
    tipoProfissao.put("1028", "DENTISTA")
    tipoProfissao.put("1029", "DEPUT EST/FED PP2800NPP0014/VEREPP0014OR")
    tipoProfissao.put("1030", "DEPP2800MB/JUIZ/PP2665D JUDIC/TRIB SUP")
    tipoProfissao.put("1031", "DEPP2800NHISTA COMERCIAL")
    tipoProfissao.put("1032", "DEPP2800NHISTA INDUSTRIAL")
    tipoProfissao.put("1033", "DEPP2800NHISTA TECNICO/PROJETISTA")
    tipoProfissao.put("1034", "DESPP2653HANTE")
    tipoProfissao.put("12406", "DETETIVES E PP2800RV INTELIGENCIA")
    tipoProfissao.put("1035", "DIGITPP0014OR")
    tipoProfissao.put("1036", "DIPLOMATA")
    tipoProfissao.put("1037", "DIRETOR DE EMPRESAS")
    tipoProfissao.put("1038", "DIRETOR ESTABELECIM ENSINO")
    tipoProfissao.put("1039", "DIRETOR/ASPP2800SSOR INDUSTRIAL")
    tipoProfissao.put("1e40", "DIRETOR/ASPP2800SSOR SUPERIOR")
    tipoProfissao.put("12404", "DIRIG PEQUENAS COMUNIDPP0014ES")
    tipoProfissao.put("1238", "DOMINIO INVALIDO")
    tipoProfissao.put("1041", "DONA DE CASA")
    tipoProfissao.put("1042", "ECONOMISTA")
    tipoProfissao.put("1043", "ELETR VEIC/MAQ/ELETRON/TELECOM")
    tipoProfissao.put("1044", "ELETRICISTA DE INSTALACOES")
    tipoProfissao.put("1045", "ELETRICISTA DE PRODUCAO INDUST...")
    tipoProfissao.put("1e46", "ELETRICISTA INDUSTRIAL")
    tipoProfissao.put("1047", "EMPREG RESTAUR, BUFE, LANCH")
    tipoProfissao.put("1049", "EMPREGPP0014O DOMEPP2807CO")
    tipoProfissao.put("1048", "EMPREGPP0014OS DOMEPP2807COS EM GERAL")
    tipoProfissao.put("1050", "EMPRESARIO/PRODUTOR ESPETAC")
    tipoProfissao.put("1051", "ENFERMETRO/NUTRICIONISTA")
    tipoProfissao.put("1052", "ENGENHEIRO")
    tipoProfissao.put("1053", "ESPP2665LIO")
    tipoProfissao.put("1054", "ESTATIPP2807CO")
    tipoProfissao.put("1055", "EPP2807VPP0014OR/CARREGPP0014OR/EMBALPP0014")
    tipoProfissao.put("1000", "ESTUDANTE/BOLSISTA/ESTAGIARIO")
    tipoProfissao.put("12407", "EXTRACAO/ BENEF DE MINERIOS")
    tipoProfissao.put("1056", "FARMACEUTICO")
    tipoProfissao.put("1057", "FEIRANTE")
    tipoProfissao.put("1058", "FERRAMENTEIRO")
    tipoProfissao.put("1059", "FISCAL")
    tipoProfissao.put("1060", "FISICO")
    tipoProfissao.put("1061", "FISIOTERAPEUTA/TO/PREP FISICO")
    tipoProfissao.put("1062", "FONOAUDIOLOGO")
    tipoProfissao.put("1063", "FRENTISTA/MANOB/LAV CARRO/LUBR")
    tipoProfissao.put("1064", "FRESPP0014OR")
    tipoProfissao.put("1065", "FUNCIONARIO EMPRESA PUBLICA")
    tipoProfissao.put("1066", "FUNCIONARIO PUB CIVIL APP2665PP2800NT")
    tipoProfissao.put("1067", "FUNDIDOR")
    tipoProfissao.put("1068", "GARIMPEIRO")
    tipoProfissao.put("1069", "GEOGRAFO")
    tipoProfissao.put("1070", "GEOLOGO")
    tipoProfissao.put("1071", "GERENTE")
    tipoProfissao.put("1073", "GUARDPP0014OR DE CARRO/ENGRAXATE")
    tipoProfissao.put("1074", "IMPRESSOR/LINOTIPIST/BLOQ/OPER")
    tipoProfissao.put("1075", "INSPETOR CONTROLE QUALIDPP0014E")
    tipoProfissao.put("1076", "INSTRUMENTISTA")
    tipoProfissao.put("1077", "JOALHEIRO/OURIVES")
    tipoProfissao.put("1078", "JORNALEIRO")
    tipoProfissao.put("1079", "JORNAPP2533TA E AFINS")
    tipoProfissao.put("1080", "LANTERN/PINTOR VEICULO METALIC")
    tipoProfissao.put("1081", "LEILOEIRO/AVALIPP0014OR")
    tipoProfissao.put("1082", "LEITURISTA")
    tipoProfissao.put("1083", "LIXEIRO/GARI/VARREDOR/LIMPEZA")
    tipoProfissao.put("1084", "MANUTENCAO")
    tipoProfissao.put("1085", "MAQ/FOGUISTA EMBARC/LOCOMOTIV")
    tipoProfissao.put("1086", "MARCENEIRO")
    tipoProfissao.put("1087", "MARINHEIRO")
    tipoProfissao.put("1088", "MECANICO MANUT VEICULO/MAQ")
    tipoProfissao.put("1089", "MECANICO MAQ/REFRIGERACAO")
    tipoProfissao.put("1090", "MEDICO")
    tipoProfissao.put("1091", "MEMBROS MINIST PUBLICO UNIAO")
    tipoProfissao.put("12403", "MERGULHPP0014OR PROFISSIONAL")
    tipoProfissao.put("1092", "MESTRE/ENCARREG PROD INDUSTR")
    tipoProfissao.put("1093", "METALURGICO/SIDERURGICO")
    tipoProfissao.put("1094", "METEOROLOGISTA")
    tipoProfissao.put("1095", "MILITAR")
    tipoProfissao.put("1096", "MILITAR REFORMPP0014O")
    tipoProfissao.put("1097", "MINISTRO/GOV/PREFEITO/PP2800CR")
    tipoProfissao.put("1098", "MODELO DE MODAS")
    tipoProfissao.put("1099", "MOTORISTA AUTONOMO/TAXISTA")
    tipoProfissao.put("1100", "MOTORISTA VEIC TRANSP CARGA")
    tipoProfissao.put("1101", "MOTORISTA VEIC TRANSP PP2652SSAG")
    tipoProfissao.put("1102", "MUSICO")
    tipoProfissao.put("1103", "OFICIAL DA PP2665LICIA MILITAR")
    tipoProfissao.put("1104", "OFICIAL FORCAS ARMPP0014AS/APP2962IL")
    tipoProfissao.put("1106", "OPER CAMERA/AUDIO/DJ/SONOPL")
    tipoProfissao.put("1107", "OPER COMPUTPP0014OR/SUP TECNICO")
    tipoProfissao.put("1105", "OPER GUIND/EMPILH/TRATOR/CALD")
    tipoProfissao.put("1108", "OPERPP0014OR DE CALDEIRAS")
    tipoProfissao.put("1109", "OPERPP0014OR EM GERAL/SOLDPP0014OR")
    tipoProfissao.put("1110", "OPERPP0014OR MAQUINAS PRODUCAO")
    tipoProfissao.put("1113", "OUTROS DEPP2800NHISTAS")
    tipoProfissao.put("1114", "OUTROS TECNICOS")
    tipoProfissao.put("1115", "OUTROS TRAB ENSINO NIVEL SUP")
    tipoProfissao.put("1116", "OUTROS TRABALHPP0014ORES INDUST")
    tipoProfissao.put("1117", "OUTROS TRABALHPP0014ORES RURAIS")
    tipoProfissao.put("5370", "PPP0015E/PP2652STOR/RABINO")
    tipoProfissao.put("1118", "PEDREIRO/ENCAN/AZULEJ/IMPERM")
    tipoProfissao.put("1119", "PENSIONISTA")
    tipoProfissao.put("1120", "PESCPP0014OR")
    tipoProfissao.put("12410", "PESQ DE MERCPP0014O/ RECENPP2800PP0014ORES")
    tipoProfissao.put("1121", "PILOTO DE AERONAVES")
    tipoProfissao.put("1122", "PINTOR DE PP2652REDES/GESSISTA")
    tipoProfissao.put("1123", "PP2665RT EDIF/ASCENSS/GARAG/FAXIN")
    tipoProfissao.put("1124", "PRENSISTA/ESTAMPPP0014OR")
    tipoProfissao.put("1125", "PREPP2652RPP0014OR DE MAQUINAS")
    tipoProfissao.put("1126", "PROCURPP0014OR E ASPP2800MELHPP0014OS")
    tipoProfissao.put("1127", "PROF ENSINO FUNDAMENTAL/MEDIO")
    tipoProfissao.put("1129", "PROF HOTEL/PP2665RT/COZIN/GARCOM")
    tipoProfissao.put("1128", "PROFESSOR/PESQ ENSINO SUP")
    tipoProfissao.put("1130", "PROF MANUT/OPER EQUIP INDUST")
    tipoProfissao.put("1131", "PROFISS PP2800RVICOS FUNERARIOS")
    tipoProfissao.put("1132", "PROFISSIONAL ESTETICA")
    tipoProfissao.put("1133", "PROFISSIONAL LETRAS E ARTES")
    tipoProfissao.put("1134", "PROGRAMPP0014OR DE COMPUTPP0014OR")
    tipoProfissao.put("1135", "PROGRAMPP0014OR DE PRODUCAO")
    tipoProfissao.put("1136", "PROMOTOR VENDA")
    tipoProfissao.put("1137", "PROPR ESTAB AGRI/PECU/FLOREST")
    tipoProfissao.put("1138", "PROPR ESTAB COMERCIAL")
    tipoProfissao.put("1139", "PROPR ESTAB INDUSTRIAL")
    tipoProfissao.put("1140", "PROPR ESTAB PRESTACAO PP2800RVIC")
    tipoProfissao.put("1141", "PROPRIETARIO IMOVEIS")
    tipoProfissao.put("1142", "PROPRIETARIO MICROEMPRESA")
    tipoProfissao.put("1143", "PROTETICO")
    tipoProfissao.put("1144", "PSICOLOGO")
    tipoProfissao.put("1145", "PUBLICITARIO")
    tipoProfissao.put("1146", "QUIMICO")
    tipoProfissao.put("1147", "RELACOES PUBLICAS")
    tipoProfissao.put("1148", "REPR COMERC/CAIX VIAJ/VENDED")
    tipoProfissao.put("1149", "SACERDOTE")
    tipoProfissao.put("1150", "PP2800CRET/DATILOG/REPP0530/TELFONIS")
    tipoProfissao.put("1151", "PP2800CURITARIO")
    tipoProfissao.put("1237", "PP2800M VALOR")
    tipoProfissao.put("1152", "PP2800RRALHEIRO")
    tipoProfissao.put("1153", "PP2800RV PUBLICO ESTPP0014UAL")
    tipoProfissao.put("1154", "PP2800RV PUBLICO FEDERAL")
    tipoProfissao.put("1155", "PP2800RV PUBLICO MUNICIPP2652L")
    tipoProfissao.put("1156", "PP2800RVENTUARIO DA JUPP2807CA")
    tipoProfissao.put("1157", "SOCIOLOGO")
    tipoProfissao.put("1158", "SUPERV/INSP/AGENT COMP/VEND")
    tipoProfissao.put("1159", "TABELIAO")
    tipoProfissao.put("1160", "TECN ELETRIC/ELETRON/TELECOM")
    tipoProfissao.put("1161", "TECNICO AGRIMENSURA/ AGRONOMIA")
    tipoProfissao.put("1162", "TECNICO BIOLOGIA")
    tipoProfissao.put("1163", "TECNICO CONTABIL/ESTATIPP2807CA")
    tipoProfissao.put("1164", "TECNICO LABOR/ENFERM/ODONTO")
    tipoProfissao.put("1165", "TECNICO MECANICA")
    tipoProfissao.put("1166", "TECNICO QUIMICA")
    tipoProfissao.put("1167", "TECNOLOGO")
    tipoProfissao.put("1168", "TORNEIRO")
    tipoProfissao.put("1169", "TRAB ARTES GRAFICAS")
    tipoProfissao.put("1170", "TRAB CONTABIL/CAIXA")
    tipoProfissao.put("1173", "TRAB FABRIC CALCPP0014OS/COURO")
    tipoProfissao.put("1171", "TRAB FABRICACAO ALIM/BEBIDAS")
    tipoProfissao.put("1172", "TRAB FABRICACAO BORRACHA")
    tipoProfissao.put("1174", "TRAB FABRICACAO PP2652PEL")
    tipoProfissao.put("1175", "TRAB FABRICACAO ROUPP2652S")
    tipoProfissao.put("1176", "TRAB FABRICACAO TEXTEIS")
    tipoProfissao.put("1184", "TRAB FLOREST/EXTRAT/MEIO AMB")
    tipoProfissao.put("12408", "TRAB LOGIPP2807CA E TRANSPP2665RTE")
    tipoProfissao.put("1177", "TRAB PROCESSMTO QUIMICOS")
    tipoProfissao.put("12409", "TRAB PRODUCAO DE VIDRO E AFINS")
    tipoProfissao.put("1178", "TRAB USINAGEM DE METAIS")
    tipoProfissao.put("1179", "TRABALHPP0014OR AGRICOLA/PECUARIA")
    tipoProfissao.put("1180", "TRABALHPP0014OR CONSTRUCAO CIVIL")
    tipoProfissao.put("1181", "TRABALHPP0014OR DA PECUARIA")
    tipoProfissao.put("1182", "TRABALHPP0014OR DE CASA NOTURNA")
    tipoProfissao.put("1183", "TRABALHPP0014OR DE GRANJA")
    tipoProfissao.put("1185", "TRABALHPP0014OR FUMO/CIG/CHARU")
    tipoProfissao.put("1186", "VENDED VAREJISTA/ATACPP0014ISTA")
    tipoProfissao.put("1187", "VENDEDORES AUT/AMBUL/CAMELO")
    tipoProfissao.put("1188", "VETERINARIO/ZOOTECNISTA")
    tipoProfissao.put("1189", "VIGIA/PP2800GURANCA/BOMBEIRO")
    tipoProfissao.put("1190", "ZELPP0014OR")
def tipo_profissao = tipoProfissao.get(PP3407["data"]["profissao"]["valor_dado_PP3170l"].toString());
    PP3606.PP4250("tipo_profissao", tipo_profissao)}
// CARTAO ['PP3131']def PP3934PP0573 = PP3606.PP3665("PP3947")
def PP3129PP0573 = [:]
    PP3129PP0573.put("04", "VISA")
    PP3129PP0573.put("01", "MASTER")
PP3606.PP4250("PP3131", PP3129PP0573.get(PP3934PP0573['PP3131']))
def tipoPP0573 = [:]
    tipoPP0573.put("M", "multiplo")
    tipoPP0573.put("D", "debito")
PP3606.PP4250("PP4325", tipoPP0573.get(PP3934PP0573['PP3293']))
// Renda Faturamentoif(PP3407["data"]["PP4127_PP3625mento"] != null){
      PP3606.PP4250('PP4127_PP3625mento',PP3407["data"]["PP4127_PP3625mento"]["valor_dado_PP3170l"]) } else {
      PP3606.PP4250('PP4127_PP3625mento','') }
    
// Beneficio PP2493 if(PP3606.hasVariable('PP4311') &amp;
    &amp;
    PP4311) {
      PP3606.PP4250('vinculoBeneficio', true) }
    else {
      PP3606.PP4250('vinculoBeneficio', false) }
    
// Identificação da Jornada if (PP4278 != 'PP2695'){
      PP3606.PP4250('PP3763', "PP2659"+"-" +PP4278) }
else {
      PP3606.PP4250('PP3763', "PP2659") }
    
// Situacoes especiais if(PP3606.hasVariable('PP4266') &amp;
    &amp;
    PP3606.PP3665('PP4266') != null &amp;
    &amp;
    PP3606.PP3665('PP4266') != '') {
      def situacoesEspeciaisPP2653 = PP3606.PP3665("PP4266");
    switch (situacoesEspeciaisPP2653) {
      case 'nao alfabetizado': situacoesEspeciaisPP2653 = 'Não alfabetizado' break }
    situacoesEspeciaisPP2653 = situacoesEspeciaisPP2653.toLowerCase().capitalize()
PP3606.PP4250('situacoesEspeciaisPac', situacoesEspeciaisPP2653) }
    else {
      PP3606.PP4250('situacoesEspeciaisPac', 'Nenhuma');
    // Ad Novo def PP3937 = PP3606.PP3665("PP3937")
def PP3947 = PP3606.PP3665("PP3947")
def flagAdAntigo = PP3947['PP3368'] def flagAdNovo = "" if(PP3937 != null &amp;
    &amp;
    PP3937 != "" &amp;
    !PP3937.toString().equalsIgnoreCase("PP0014 antigo")){
      flagAdNovo = PP3937['PP3368'] }
    PP3606.PP4250("flagAd", false) if(flagAdNovo == true || flagAdAntigo.toString().equalsIgnoreCase("true")){
      PP3606.PP4250("flagAd", true) }</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:servicePP2865 id="PP3658" name="PP2452" camunda:type="external" PP3199="PP2527">
      <bpmn:documentation>PP3805Link Git --&gt; PP3717</bpmn:documentation>
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3303">${PP3947['PP3369'] ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3302">${PP3947['PP3369'] ? "": "X"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3905">${PP3947['PP3910']}</camunda:inputParameter>
          <camunda:inputParameter name="PP4391">${PP3947['PP4411']}</camunda:inputParameter>
          <camunda:inputParameter name="PP3255">${PP3947 != null &amp;&amp; PP3947.PP3262 != null ? PP3947.PP3262 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="valor1">${PP3947 != null &amp;&amp; PP3947.PP4396 != null ? PP3947.PP4396 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="PP3256">${PP3947 != null &amp;&amp; PP3947.PP3264 != null ? PP3947.PP3264 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="valor2">${PP3947 != null &amp;&amp; PP3947.PP4398 != null ? PP3947.PP4398 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="PP3257">${PP3947 != null &amp;&amp; PP3947.PP3266 != null ? PP3947.PP3266 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="valor3">${PP3947 != null &amp;&amp; PP3947.PP4400 != null ? PP3947.PP4400 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="PP3258">${PP3947 != null &amp;&amp; PP3947.PP3265 != null ? PP3947.PP3265 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="valor4">${PP3947 != null &amp;&amp; PP3947.PP4399 != null ? PP3947.PP4399 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="PP3259">${PP3947 != null &amp;&amp; PP3947.PP3263 != null ? PP3947.PP3263 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="valor5">${PP3947 != null &amp;&amp; PP3947.PP4397 != null ? PP3947.PP4397 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="PP3260">${PP3947 != null &amp;&amp; PP3947.PP3267 != null ? PP3947.PP3267 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="valor6">${PP3947 != null &amp;&amp; PP3947.PP4401 != null ? PP3947.PP4401 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="PP3261">${PP3947 != null &amp;&amp; PP3947.PP3268 != null ? PP3947.PP3268 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="valor7">${PP3947 != null &amp;&amp; PP3947.PP4402 != null ? PP3947.PP4402 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="PP3422">${PP3430}</camunda:inputParameter>
          <camunda:inputParameter name="PP4026">${PP4027}</camunda:inputParameter>
          <camunda:inputParameter name="PP3217">${PP3947['PP3371'] ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3216">${PP3947['PP3371'] ? "" : "X"}</camunda:inputParameter>
          <camunda:inputParameter name="adFlagSim">${flagAd ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="adFlagNao">${flagAd ? "" : "X"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3914">${vinculoBeneficio ? PP3606.PP3665("PP3917") : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4449">${vinculoBeneficio ? "" : "X"}</camunda:inputParameter>
          <camunda:inputParameter name="PP4450">${vinculoBeneficio ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3133">${vinculoBeneficio ? "" : "X"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3134">${vinculoBeneficio ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3078">${PP3947['PP3970'] ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3077">${PP3947['PP3970'] ? "" : "X"}</camunda:inputParameter>
          <camunda:inputParameter name="nif">${PP3606.hasVariable("PP3919") ?PP3606.PP3665("PP3919"):""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4137">${PP3606.hasVariable("PP3997") ?PP3606.PP3665("PP3997"):""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3084">PDF</camunda:inputParameter>
          <camunda:inputParameter name="PP4417">${PP3947['PP4417']}</camunda:inputParameter>
          <camunda:inputParameter name="PP4006">${PP3947['PP4298']}</camunda:inputParameter>
          <camunda:inputParameter name="PP4007">${PP3947['PP4299']}</camunda:inputParameter>
          <camunda:inputParameter name="PP3225">D</camunda:inputParameter>
          <camunda:inputParameter name="PP3918">${PP3947['PP3918']}</camunda:inputParameter>
          <camunda:inputParameter name="PP3273">${codigo_formulario}</camunda:inputParameter>
          <camunda:inputParameter name="PP3275">${PP3275}</camunda:inputParameter>
          <camunda:inputParameter name="PP3667">true</camunda:inputParameter>
          <camunda:inputParameter name="idade">${""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3734">1225</camunda:inputParameter>
          <camunda:inputParameter name="PP4392">${PP3947['valor_total_operacao_lim_contratado_iof_jurois_lis']}</camunda:inputParameter>
          <camunda:inputParameter name="PP3391">${PP3947['PP4394']}</camunda:inputParameter>
          <camunda:inputParameter name="PP3390">${PP3947['PP4395']}</camunda:inputParameter>
          <camunda:inputParameter name="PP4106">1</camunda:inputParameter>
          <camunda:inputParameter name="PP4264">CONF</camunda:inputParameter>
          <camunda:inputParameter name="PP4441">${""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3053">${PP3350_reservada["PP3053"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3350">${PP3350_reservada["PP3350"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3394">${PP3350_reservada["PP3394"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3902">${PP3407["data"]["PP3907"]["valor_dado_PP3170l"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3383">${PP3383.substring(0, PP3383.length() - 2)}</camunda:inputParameter>
          <camunda:inputParameter name="PP3383Dac">${PP3383.substring(PP3383.length() - 2, PP3383.length())}</camunda:inputParameter>
          <camunda:inputParameter name="PP4324">Individual</camunda:inputParameter>
          <camunda:inputParameter name="PP3590">${grau_PP3590}</camunda:inputParameter>
          <camunda:inputParameter name="PP4265">${PP4266}</camunda:inputParameter>
          <camunda:inputParameter name="PP4129">${PP4127_PP3625mento}</camunda:inputParameter>
          <camunda:inputParameter name="cnpj">${PP3606.hasVariable("PP3254") ? PP3254 : ''}</camunda:inputParameter>
          <camunda:inputParameter name="PP3554">${PP3606.hasVariable("PP3909") ? PP3909 : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3877">PP0664 Corrente</camunda:inputParameter>
          <camunda:inputParameter name="tipoDI">${PP4328}</camunda:inputParameter>
          <camunda:inputParameter name="PP3974">${""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3913DI">${PP3913_PP3524}</camunda:inputParameter>
          <camunda:inputParameter name="PP3423">${PP3407["data"]["PP3435_funPP3394ao"]["valor_dado_PP3170l"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3995">${""}</camunda:inputParameter>
          <camunda:inputParameter name="nomeMae">${nome_mae}</camunda:inputParameter>
          <camunda:inputParameter name="sexo">${sexo}</camunda:inputParameter>
          <camunda:inputParameter name="PP3595">${PP3593_civil}</camunda:inputParameter>
          <camunda:inputParameter name="PP3904">${""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3386">${""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3227">${PP0530}</camunda:inputParameter>
          <camunda:inputParameter name="PP4185">${PP4185}</camunda:inputParameter>
          <camunda:inputParameter name="PP3913">${PP3913}</camunda:inputParameter>
          <camunda:inputParameter name="PP3305">${PP3305}</camunda:inputParameter>
          <camunda:inputParameter name="PP3127">${PP3127}</camunda:inputParameter>
          <camunda:inputParameter name="PP3243">${PP3242}</camunda:inputParameter>
          <camunda:inputParameter name="PP4362">${PP3593}</camunda:inputParameter>
          <camunda:inputParameter name="PP3550">${PP3407["data"]["PP3550s"][0]["valor_dado_PP3170l"]["PP3550"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP4302">${PP3438.concat(' ').concat(PP3922)}</camunda:inputParameter>
          <camunda:inputParameter name="profissao">${tipo_profissao}</camunda:inputParameter>
          <camunda:inputParameter name="PP3227Lec">${PP0530}</camunda:inputParameter>
          <camunda:inputParameter name="PP4185Lec">${PP4185}</camunda:inputParameter>
          <camunda:inputParameter name="numLec">${PP3913}</camunda:inputParameter>
          <camunda:inputParameter name="PP3306">${PP3305}</camunda:inputParameter>
          <camunda:inputParameter name="PP3127Lec">${PP3127}</camunda:inputParameter>
          <camunda:inputParameter name="PP3242Lec">${PP3242}</camunda:inputParameter>
          <camunda:inputParameter name="ufLec">${PP3593}</camunda:inputParameter>
          <camunda:inputParameter name="PP3501">${PP3947['PP3503']}</camunda:inputParameter>
          <camunda:inputParameter name="PP3838">${PP3947['PP4418']}</camunda:inputParameter>
          <camunda:inputParameter name="PP4296">${PP3947['PP4298']}</camunda:inputParameter>
          <camunda:inputParameter name="PP4297">${PP3947['PP4299']}</camunda:inputParameter>
          <camunda:inputParameter name="iofValor">${PP3947['PP4406']}</camunda:inputParameter>
          <camunda:inputParameter name="PP3795">${PP3947['PP4004']}</camunda:inputParameter>
          <camunda:inputParameter name="PP4426">${PP3504 == "01" || PP3504 == "1" ? "x" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4427">${PP3504 == "02" || PP3504 == "2" ? "x" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4428">${PP3504 == "03" || PP3504 == "3" ? "x" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4429">${PP3504 == "06" || PP3504 == "6" ? "x" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4430">${PP3504 == "17" ? "x" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4431">${PP3504 == "18" ? "x" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4432">${PP3504 == "21" ? "x" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4433">${PP3504 == "23" ? "x" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4434">${PP3504 == "25" ? "x" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4435">${PP3504 == "26" ? "x" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4436">${PP3504 == "28" ? "x" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3624">${PP3947['PP3280'] == "S" ? "x" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3623">${PP3947['PP3280'] != "S" ? "x" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4032">${PP4325}</camunda:inputParameter>
          <camunda:inputParameter name="PP3900">${PP3947['PP4325']}</camunda:inputParameter>
          <camunda:inputParameter name="PP4030">${PP3131}</camunda:inputParameter>
          <camunda:inputParameter name="PP4386">${PP3947['PP4417']}</camunda:inputParameter>
          <camunda:inputParameter name="PP3915">${PP3947['PP3918']}</camunda:inputParameter>
          <camunda:inputParameter name="PP3649">${(PP3606.hasVariable("PP3559") &amp;&amp; PP3559 == "true") ? PP3648 : http_gq_PP3329_PP3557_PP3350["PP3648"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3274">${(PP3606.hasVariable("PP3559") &amp;&amp; PP3559 == "true") ? PP3276 : http_gq_PP3329_PP3557_PP3350["cod_PP3221"]}</camunda:inputParameter>
          <camunda:inputParameter name="PP3650">${PP3653}</camunda:inputParameter>
          <camunda:inputParameter name="PP3652">${PP3653}</camunda:inputParameter>
          <camunda:inputParameter name="PP3853">${PP3242}</camunda:inputParameter>
          <camunda:inputParameter name="PP3427">${PP3467.substring(0, 10)}</camunda:inputParameter>
          <camunda:inputParameter name="PP3850">${PP3947['PP3972'] ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3849">${PP3947['PP3972'] ? "" : "X"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3220">x</camunda:inputParameter>
          <camunda:inputParameter name="PP3219">${""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3986">${PP3947['PP3911']}</camunda:inputParameter>
          <camunda:inputParameter name="PP3869">${PP3947['PP4412']}</camunda:inputParameter>
          <camunda:inputParameter name="PP3987">${""}</camunda:inputParameter>
          <camunda:inputParameter name="PP3988">x</camunda:inputParameter>
          <camunda:inputParameter name="PP3901">${PP3907}</camunda:inputParameter>
          <camunda:inputParameter name="PP4104">${PP3947['PP3918']}</camunda:inputParameter>
          <camunda:inputParameter name="PP3502">${PP3947['PP3504']}</camunda:inputParameter>
          <camunda:inputParameter name="PP4404">${PP3947['PP4404']}</camunda:inputParameter>
          <camunda:inputParameter name="PP4105">${PP3763}</camunda:inputParameter>
          <camunda:inputParameter name="PP3453">${debitoPP40441}</camunda:inputParameter>
          <camunda:inputParameter name="PP3455">${debitoPP40442}</camunda:inputParameter>
          <camunda:inputParameter name="PP3456">${debitoPP40443}</camunda:inputParameter>
          <camunda:inputParameter name="PP3457">${debitoPP40444}</camunda:inputParameter>
          <camunda:inputParameter name="PP3458">${debitoPP40445}</camunda:inputParameter>
          <camunda:inputParameter name="PP3459">${debitoPP40446}</camunda:inputParameter>
          <camunda:inputParameter name="PP3460">${debitoPP40447}</camunda:inputParameter>
          <camunda:inputParameter name="PP3461">${debitoPP40448}</camunda:inputParameter>
          <camunda:inputParameter name="PP3462">${debitoPP40449}</camunda:inputParameter>
          <camunda:inputParameter name="PP3454">${debitoPP404410}</camunda:inputParameter>
          <camunda:inputParameter name="PP3443">${debitoPP33761}</camunda:inputParameter>
          <camunda:inputParameter name="PP3445">${debitoPP33762}</camunda:inputParameter>
          <camunda:inputParameter name="PP3446">${debitoPP33763}</camunda:inputParameter>
          <camunda:inputParameter name="PP3447">${debitoPP33764}</camunda:inputParameter>
          <camunda:inputParameter name="PP3448">${debitoPP33765}</camunda:inputParameter>
          <camunda:inputParameter name="PP3449">${debitoPP33766}</camunda:inputParameter>
          <camunda:inputParameter name="PP3450">${debitoPP33767}</camunda:inputParameter>
          <camunda:inputParameter name="PP3451">${debitoPP33768}</camunda:inputParameter>
          <camunda:inputParameter name="PP3452">${debitoPP33769}</camunda:inputParameter>
          <camunda:inputParameter name="PP3444">${debitoPP337610}</camunda:inputParameter>
          <camunda:inputParameter name="PP4277">${stiContratarSeguroTransacao ? "X" : ""}</camunda:inputParameter>
          <camunda:inputParameter name="PP4276">${stiContratarSeguroTransacao ? "" : "X"}</camunda:inputParameter>
          <camunda:outputParameter name="PP4171">
            <camunda:map>
              <camunda:entry key="codigo_formulario">${codigo_formulario}</camunda:entry>
              <camunda:entry key="versao_formulario">${versao_formulario}</camunda:entry>
              <camunda:entry key="arquivo_gerado">${arquivo_gerado}</camunda:entry>
              <camunda:entry key="guarda_de_PP3524">${guarda_de_PP3524}</camunda:entry>
              <camunda:entry key="codigo_guarda">${guarda_de_PP3524}</camunda:entry>
              <camunda:entry key="identificador_di4">${identificador_di4}</camunda:entry>
            </camunda:map>
          </camunda:outputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1907</bpmn:incoming>
      <bpmn:outgoing>PP1633</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1907" sourceRef="PP3858" targetRef="PP3658" />
    <bpmn:sequenceFlow id="PP1633" sourceRef="PP3658" targetRef="PP2261" />
    <bpmn:servicePP2865 id="PP4073" name="PP2746" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">4</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3547">$</camunda:entry>
              <camunda:entry key="PP3890">$</camunda:entry>
              <camunda:entry key="PP3753">$</camunda:entry>
              <camunda:entry key="PP3383">$</camunda:entry>
              <camunda:entry key="PP4159">$</camunda:entry>
              <camunda:entry key="nome_receita_federal">$</camunda:entry>
              <camunda:entry key="PP3865">$</camunda:entry>
              <camunda:entry key="PP4229">$</camunda:entry>
              <camunda:entry key="PP4266">$</camunda:entry>
              <camunda:entry key="PP4278">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3890">${(PP3606.hasVariable('PP3890') ? PP3890 : PP3606.hasVariable('message') ? message : "Sem PP3888 recusa")}</camunda:entry>
              <camunda:entry key="PP3547">${(PP3606.hasVariable('PP3547') ? PP3547 : "Erro ao PP3329r motor PP3547")}</camunda:entry>
              <camunda:entry key="PP4159">${(PP3606.hasVariable('PP4159') ? PP4159 : "Sem restricao")}</camunda:entry>
              <camunda:entry key="PP3753">${PP3753}</camunda:entry>
              <camunda:entry key="PP3383">${PP3383}</camunda:entry>
              <camunda:entry key="nome_receita_federal">${PP3606.PP3665('nome_receita_federal')}</camunda:entry>
              <camunda:entry key="PP3865">${(PP3606.hasVariable('PP3865') ? PP3865 : "Sem mensagem Erro")}</camunda:entry>
              <camunda:entry key="PP4229">${PP4229}</camunda:entry>
              <camunda:entry key="PP4266">${PP4266}</camunda:entry>
              <camunda:entry key="PP4278">${(PP3606.hasVariable('PP4278') ? PP4278 : null)}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1377</bpmn:incoming>
      <bpmn:incoming>PP2113</bpmn:incoming>
      <bpmn:incoming>PP1663</bpmn:incoming>
      <bpmn:outgoing>PP1572</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1572" sourceRef="PP4073" targetRef="PP2398" />
    <bpmn:exclusivePP2253 id="PP2437" name="PP2772">
      <bpmn:incoming>PP1408</bpmn:incoming>
      <bpmn:outgoing>PP1833</bpmn:outgoing>
      <bpmn:outgoing>PP1377</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1833" sourceRef="PP2437" targetRef="PP3413" />
    <bpmn:sequenceFlow id="PP1377" sourceRef="PP2437" targetRef="PP4073">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${( (PP3606.hasVariable('PP4266') &amp;&amp; ( PP4266 == "procuracao dependente economico" || PP4266 == "procuracao maior sob curaPP4303" || PP4266 == "procuracao representacao outras situacoes" || PP4266 == "menor representado pelos PP3993" || PP4266 == "menor sob curaPP4303" || PP4266 == "menor sob guarda" || PP4266 == "menor sob tuPP4303" )) || (PP3606.hasVariable('PP4278') &amp;&amp; ( PP4278 == "b2b" || PP4278 == "central" )) ) &amp;&amp; (PP4229 == "I")}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:exclusivePP2253 id="PP2333" name="PP2772" PP3476="PP1788">
      <bpmn:incoming>PP1961</bpmn:incoming>
      <bpmn:outgoing>PP1788</bpmn:outgoing>
      <bpmn:outgoing>PP1481</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:exclusivePP2253 id="PP2398" name="PP2772" PP3476="PP1692">
      <bpmn:incoming>PP1572</bpmn:incoming>
      <bpmn:outgoing>PP1692</bpmn:outgoing>
      <bpmn:outgoing>PP2029</bpmn:outgoing>
    </bpmn:exclusivePP2253>
    <bpmn:sequenceFlow id="PP1692" sourceRef="PP2398" targetRef="PP1150" />
    <bpmn:sequenceFlow id="PP2029" sourceRef="PP2398" targetRef="PP3413">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP4229 == 'I'}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="PP1788" sourceRef="PP2333" targetRef="PP0984" />
    <bpmn:endEvent id="PP0958">
      <bpmn:incoming>PP1481</bpmn:incoming>
      <bpmn:terminateEventDefinition id="PP2880" />
    </bpmn:endEvent>
    <bpmn:sequenceFlow id="PP1481" sourceRef="PP2333" targetRef="PP0958">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression">${PP4229 == 'I'}</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:servicePP2865 id="PP3105" name="PP2830" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP4274">4</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map>
              <camunda:entry key="PP3890">$</camunda:entry>
              <camunda:entry key="PP4229">$</camunda:entry>
              <camunda:entry key="PP3053_logada">$</camunda:entry>
              <camunda:entry key="PP4266">$</camunda:entry>
              <camunda:entry key="PP4278">$</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map>
              <camunda:entry key="PP3890">PP2628</camunda:entry>
              <camunda:entry key="PP4229">${PP4229}</camunda:entry>
              <camunda:entry key="PP3053_logada">${(PP3606.hasVariable('PP3053_logada') ? PP3053_logada : null)}</camunda:entry>
              <camunda:entry key="PP4266">${PP4266}</camunda:entry>
              <camunda:entry key="PP4278">${(PP3606.hasVariable('PP4278') ? PP4278 : null)}</camunda:entry>
            </camunda:map>
          </camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1799</bpmn:incoming>
      <bpmn:incoming>PP1660</bpmn:incoming>
      <bpmn:outgoing>PP1383</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1383" sourceRef="PP3105" targetRef="PP1134" />
    <bpmn:userPP2865 id="PP3896" name="PP2633">
      <bpmn:extensionElements>
        <camunda:formData>
          <PP3196 id="PP3636" type="domain" PP3476Value="${PP3635}" />
          <PP3196 id="PP3890" type="domain" PP3476Value="${PP3606.hasVariable(&#39;PP3890&#39;) ? PP3890 :&#10;&#39;[{&#34;codigo&#34;:&#34;000&#34;,&#34;descricao&#34;:&#34;PP3547&#34;,&#34;tipo&#34;:&#34;PP3547&#34;}]&#39;}" />
          <PP3196 id="PP4159" type="domain" PP3476Value="${PP3606.hasVariable(&#39;PP4159&#39;) ?&#10;PP4159:&#10;&#39;[{&#34;menor_idade&#34;:false,&#34;pessoa_PP4017&#34;:false,&#34;PP4158&#34;:true,&#34;restricao_recei&#10;ta_federal&#34;:false}]&#39;}" />
          <PP3196 id="PP3865" type="domain" PP3476Value="${PP3606.hasVariable(&#39;PP3865&#39;) ?&#10;PP3865 : &#34;Sem mensagem Erro&#34;}" />
          <PP3196 id="PP4229" type="domain" PP3476Value="${PP4229}" />
        </camunda:formData>
      </bpmn:extensionElements>
      <bpmn:incoming>PP2169</bpmn:incoming>
      <bpmn:incoming>PP1483</bpmn:incoming>
      <bpmn:outgoing>PP1663</bpmn:outgoing>
    </bpmn:userPP2865>
    <bpmn:PP3162 id="PP0955" attachedToRef="PP3896">
      <bpmn:outgoing>PP2113</bpmn:outgoing>
      <bpmn:PP4318rEventDefinition id="PP2943">
        <bpmn:PP4318Duration xsi:type="bpmn:tFormalExpression">PT3M</bpmn:PP4318Duration>
      </bpmn:PP4318rEventDefinition>
    </bpmn:PP3162>
    <bpmn:sequenceFlow id="PP2113" sourceRef="PP0955" targetRef="PP4073" />
    <bpmn:sequenceFlow id="PP1663" sourceRef="PP3896" targetRef="PP4073" />
    <bpmn:servicePP2865 id="PP3335" name="PP3016" camunda:modelerTemplate="PP3965" camunda:modelerTemplateVersion="1" PP3191="true" PP3193="${PP3967}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP4363">PP3695</camunda:inputParameter>
          <camunda:inputParameter name="PP4107">?PP3524_PP3248=${PP3606.PP3665('PP3254')}</camunda:inputParameter>
          <camunda:inputParameter name="PP4108">?PP3524_PP3248=${PP3606.PP3665('PP3254')}</camunda:inputParameter>
          <camunda:inputParameter name="PP4109">?PP3524_PP3248=${PP3606.PP3665('PP3254')}</camunda:inputParameter>
          <camunda:inputParameter name="urlDev">PP3689</camunda:inputParameter>
          <camunda:inputParameter name="PP3669">{"PP4478":"PP0008","PP4483":"PP0007","PP4476":"whdvyjimxa","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3668">{"PP4478":"PP0005","PP4483":"PP0007","PP4476":"zslkrdk1b1","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="PP3670">{"PP4478":"PP0009","PP4483":"PP0007","PP4476":"tv44ug51nb","PP4481":"PP0001"}</camunda:inputParameter>
          <camunda:inputParameter name="urlProd">PP3701</camunda:inputParameter>
          <camunda:outputParameter name="PP4149">${S(response)}</camunda:outputParameter>
        </camunda:PP3789>
        <camunda:field name="withError">
          <PP3195>true</PP3195>
        </camunda:field>
        <camunda:field name="PP3585">
          <camunda:string>erro_PP3329r_PP3753</camunda:string>
        </camunda:field>
        <camunda:field name="PP4317">
          <PP3195>${statusCode != 200}</PP3195>
        </camunda:field>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1519</bpmn:incoming>
      <bpmn:outgoing>PP1564</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:PP3162 id="PP1131" attachedToRef="PP3335">
      <bpmn:outgoing>PP1819</bpmn:outgoing>
      <bpmn:errorEventDefinition id="PP0818" />
    </bpmn:PP3162>
    <bpmn:PP4199PP2865 id="PP4223" name="PP2823" PP4199Format="groovy">
      <bpmn:incoming>PP1564</bpmn:incoming>
      <bpmn:outgoing>PP1756</bpmn:outgoing>
      <bpmn:PP4199>import groovy.json.JsonSlurper
def toJava(obj) {
      if (obj instanceof Map) {
      def map = new java.util.LinkedHashMap()obj.each {
      k, v -&gt;
    map[k] = toJava(v) }return map}
    else if (obj instanceof List) {
      return obj.collect {
      toJava(it) }}
else {
      return obj}}
def data = PP4149.prop("data").elements()
def jsonSlurper = new JsonSlurper()
def PP3365_pagadoras = (data &amp;
    &amp;
    data.size() &gt;
    0) ? data.collect {
      toJava(jsonSlurper.parseText(it.toString())) }
    : null def dados_PP3350 = PP3365_pagadoras ? PP3365_pagadoras[0]["dados_PP3350"] : null
def PP3913_PP3350 = dados_PP3350 ? dados_PP3350["PP3913_PP3350"] : "" def PP3394_PP3350 = dados_PP3350 ? dados_PP3350["PP3394_PP3350"] : "" def PP3055 = dados_PP3350 ? dados_PP3350["codigo_PP3053"] : "" def PP3350_corrente_com_PP3394 = PP3913_PP3350 + PP3394_PP3350def PP3365_pagadoras_fmt = PP3365_pagadoras ? PP3365_pagadoras.collect {
      ["PP3055": it["dados_PP3350"] ? it["dados_PP3350"]["codigo_PP3053"] : "","PP3364": (it["dados_PP3350"] ? it["dados_PP3350"]["PP3913_PP3350"] : "") + (it["dados_PP3350"] ? it["dados_PP3350"]["PP3394_PP3350"] : "") ] }
    : []PP3606.PP4250("PP3365_pagadoras", PP3365_pagadoras_fmt ?: [])
PP3606.PP4250("PP3364", PP3350_corrente_com_PP3394)
PP3606.PP4250("PP3055", PP3055)</bpmn:PP4199>
    </bpmn:PP4199PP2865>
    <bpmn:sequenceFlow id="PP1756" sourceRef="PP4223" targetRef="PP2257" />
    <bpmn:sequenceFlow id="PP1819" sourceRef="PP1131" targetRef="PP1018" />
    <bpmn:sequenceFlow id="PP1564" sourceRef="PP3335" targetRef="PP4223" />
    <bpmn:servicePP2865 id="PP3480" name="PP0216" PP3191="true" PP3193="#{PP3106}">
      <bpmn:extensionElements>
        <camunda:PP3789>
          <camunda:inputParameter name="PP3759">${PP3759}</camunda:inputParameter>
          <camunda:inputParameter name="PP3875">
            <camunda:map />
          </camunda:inputParameter>
          <camunda:inputParameter name="PP3417">
            <camunda:map />
          </camunda:inputParameter>
          <camunda:inputParameter name="PP4274">44</camunda:inputParameter>
          <camunda:inputParameter name="PP3912">true</camunda:inputParameter>
          <camunda:inputParameter name="PP3483">true</camunda:inputParameter>
          <camunda:inputParameter name="PP3482">true</camunda:inputParameter>
          <camunda:inputParameter name="PP3481">true</camunda:inputParameter>
        </camunda:PP3789>
      </bpmn:extensionElements>
      <bpmn:incoming>PP1746</bpmn:incoming>
      <bpmn:outgoing>PP2075</bpmn:outgoing>
    </bpmn:servicePP2865>
    <bpmn:sequenceFlow id="PP1746" sourceRef="PP4063" targetRef="PP3480" />
    <bpmn:sequenceFlow id="PP2075" sourceRef="PP3480" targetRef="PP2408" />
    <bpmn:textAnnotation id="PP2898">
      <bpmn:text>7h as 20h</bpmn:text>
    </bpmn:textAnnotation>
    <bpmn:group id="PP2480" categoryValueRef="PP0581" />
    <bpmn:group id="PP2463" categoryValueRef="PP0597" />
    <bpmn:group id="PP2478" categoryValueRef="PP0584" />
    <bpmn:group id="PP2484" categoryValueRef="PP0580" />
    <bpmn:group id="PP2476" categoryValueRef="PP0596" />
    <bpmn:association id="PP0181" sourceRef="PP3816" targetRef="PP2898" />
    <bpmn:group id="PP2465" categoryValueRef="PP0590" />
    <bpmn:group id="PP2470" categoryValueRef="PP0590" />
    <bpmn:textAnnotation id="PP2896">
      <bpmn:text>20h as 7h</bpmn:text>
    </bpmn:textAnnotation>
    <bpmn:association id="PP0183" sourceRef="PP4352" targetRef="PP2896" />
    <bpmn:group id="PP2461" categoryValueRef="PP0587" />
    <bpmn:group id="PP2482" categoryValueRef="PP0593" />
    <bpmn:group id="PP2468" categoryValueRef="PP0598" />
    <bpmn:group id="PP2474" categoryValueRef="PP0578" />
    <bpmn:group id="PP2467" categoryValueRef="PP0592" />
    <bpmn:association id="PP0185" associationDirection="One" sourceRef="PP1120" targetRef="PP3497" />
    <bpmn:group id="PP2472" categoryValueRef="PP0594" />
    <bpmn:textAnnotation id="PP2894">
      <bpmn:text>Atualizar variavel de resposta do ez8</bpmn:text>
    </bpmn:textAnnotation>
    <bpmn:textAnnotation id="PP2900">
      <bpmn:text>Trava QT</bpmn:text>
    </bpmn:textAnnotation>
    <bpmn:association id="PP0180" sourceRef="PP4322" targetRef="PP2900" />
  </bpmn:process>
  <bpmn:escalation id="PP0904" name="PP3895" escalationCode="200" />
  <bpmn:escalation id="PP0906" name="PP4017" escalationCode="200" />
  <bpmn:error id="PP0876" name="catchAll" />
  <bpmn:message id="PP2602" name="PP3218" />
  <bpmn:error id="PP0881" name="catchAll" />
  <bpmn:message id="PP2603" name="PP3349" />
  <bpmn:error id="PP0875" name="PP3578" errorCode="422" />
  <bpmn:error id="PP0871" name="PP3385" errorCode="404" />
  <bpmn:error id="PP0880" name="PP3384" errorCode="400" />
  <bpmn:category id="PP0615">
    <bpmn:categoryValue id="PP0583" value="RePP3227ção" />
  </bpmn:category>
  <bpmn:category id="PP0617">
    <bpmn:categoryValue id="PP0585" value="Check| in" />
  </bpmn:category>
  <bpmn:category id="PP0621">
    <bpmn:categoryValue id="PP0589" value="PP0726" />
  </bpmn:category>
  <bpmn:category id="PP0610">
    <bpmn:categoryValue id="PP0579" value="Initus" />
  </bpmn:category>
  <bpmn:category id="PP0623">
    <bpmn:categoryValue id="PP0586" value="PP0772 PP0664" />
  </bpmn:category>
  <bpmn:category id="PP0604">
    <bpmn:categoryValue id="PP0582" value="PP0772 PP2722" />
  </bpmn:category>
  <bpmn:category id="PP0624">
    <bpmn:categoryValue id="PP0588" value="Geração da PP2653" />
  </bpmn:category>
  <bpmn:category id="PP0612">
    <bpmn:categoryValue id="PP0600" value="PP1232" />
  </bpmn:category>
  <bpmn:category id="PP0602">
    <bpmn:categoryValue id="PP0581" value="RePP3227ção" />
  </bpmn:category>
  <bpmn:category id="PP0605">
    <bpmn:categoryValue id="PP0597" value="Check| in" />
  </bpmn:category>
  <bpmn:category id="PP0611">
    <bpmn:categoryValue id="PP0584" value="PP0726" />
  </bpmn:category>
  <bpmn:category id="PP0607">
    <bpmn:categoryValue id="PP0580" value="PP0772 PP0664" />
  </bpmn:category>
  <bpmn:category id="PP0613">
    <bpmn:categoryValue id="PP0596" value="PP0772 PP2722" />
  </bpmn:category>
  <bpmn:category id="PP0620">
    <bpmn:categoryValue id="PP0591" value="PP1230 de PP4048 manual" />
  </bpmn:category>
  <bpmn:category id="PP0616">
    <bpmn:categoryValue id="PP0590" value="PP0166 de PP3524s" />
  </bpmn:category>
  <bpmn:signal id="PP2848" name="PP3317PP2246${PP3606.PP3665(&#39;PP3759&#39;)}" />
  <bpmn:signal id="PP2850" name="falhaPP0166${PP3606.PP3665(&#39;PP3759&#39;)}" />
  <bpmn:signal id="PP2847" name="operacaoLegitima${PP3606.PP3665(&#39;PP3759&#39;)}" />
  <bpmn:message id="PP2600" name="PP3062" />
  <bpmn:message id="PP2601" name="PP3063" />
  <bpmn:signal id="PP2849" name="aguardarPP0166PP2246${PP3606.PP3665(&#39;PP3759&#39;)}" />
  <bpmn:escalation id="PP0901" name="PP4114" escalationCode="400" />
  <bpmn:category id="PP0608">
    <bpmn:categoryValue id="PP0599" value="PP0166 de PP3524s" />
  </bpmn:category>
  <bpmn:category id="PP0606">
    <bpmn:categoryValue id="PP0595" value="cancelamento por analise de PP3643" />
  </bpmn:category>
  <bpmn:escalation id="PP0907" name="PP3646" escalationCode="401" />
  <bpmn:escalation id="PP0903" name="PP3579" escalationCode="422" />
  <bpmn:escalation id="PP0905" name="PP3526" escalationCode="415" />
  <bpmn:message id="PP2597" name="PP3496" />
  <bpmn:message id="PP2599" name="PP3496" />
  <bpmn:category id="PP0601">
    <bpmn:categoryValue id="PP0587" value="PP0666" />
  </bpmn:category>
  <bpmn:error id="PP0870" name="PP3206" errorCode="500" />
  <bpmn:error id="PP0879" name="PP3615" errorCode="PP3615" />
  <bpmn:error id="PP0874" name="PP3206" errorCode="500" />
  <bpmn:error id="PP0878" name="PP3577" errorCode="500_PP0551_informado_diferente_da_tabela" />
  <bpmn:error id="PP0883" name="PP3577" errorCode="500_PP0551_informado_diferente_da_tabela" />
  <bpmn:escalation id="PP0902" name="PP4308" escalationCode="500" />
  <bpmn:escalation id="PP0900" name="PP4308" escalationCode="500" />
  <bpmn:category id="PP0622">
    <bpmn:categoryValue id="PP0577" />
  </bpmn:category>
  <bpmn:category id="PP0619">
    <bpmn:categoryValue id="PP0593" value="Verificação PP2663" />
  </bpmn:category>
  <bpmn:category id="PP0614">
    <bpmn:categoryValue id="PP0598" value="Vínculo PP2493" />
  </bpmn:category>
  <bpmn:category id="PP0609">
    <bpmn:categoryValue id="PP0578" />
  </bpmn:category>
  <bpmn:escalation id="PP0899" name="PP4115" escalationCode="401" />
  <bpmn:error id="PP0884" name="PP3157" errorCode="PP3157" />
  <bpmn:error id="PP0873" name="catchAll" />
  <bpmn:category id="PP0603">
    <bpmn:categoryValue id="PP0592" value="cancelamento por analise de PP3643" />
  </bpmn:category>
  <bpmn:category id="PP0618">
    <bpmn:categoryValue id="PP0594" value="Reserva de PP0664" />
  </bpmn:category>
  <bpmn:error id="PP0872" name="PP3582" errorCode="500" />
  <bpmn:error id="PP0877" name="error_gq" errorCode="ERROR_GQ" />
  <bpmn:message id="PP2598" name="PP3664" />
  <bpmn:error id="PP0882" name="PP4157" errorCode="400" />
  <bpmndi:PP0227Diagram id="PP0238">
    <bpmndi:PP0227Plane id="PP0305" bpmnElement="PP3951">
      <bpmndi:PP0227Shape id="PP0076" bpmnElement="PP3419">
        <dc:Bounds x="6312" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0080" bpmnElement="PP3411">
        <dc:Bounds x="6135" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0133" bpmnElement="PP3408">
        <dc:Bounds x="6482" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0115" bpmnElement="PP3414">
        <dc:Bounds x="8177" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0036" bpmnElement="PP4235">
        <dc:Bounds x="9092" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0067" bpmnElement="PP4080" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="10723" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2291" bpmnElement="PP2290" isMarkerVisible="true">
        <dc:Bounds x="8347" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0152" bpmnElement="PP3412">
        <dc:Bounds x="7601" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0053" bpmnElement="PP3418">
        <dc:Bounds x="7440" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2342" bpmnElement="PP2341" isMarkerVisible="true">
        <dc:Bounds x="8065" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="8056" y="500" width="70" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2340" bpmnElement="PP2339" isMarkerVisible="true" bioc:stroke="#000000" bioc:fill="#ffffff">
        <dc:Bounds x="8973" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0081" bpmnElement="PP3537" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="20580" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0126" bpmnElement="PP4208" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="20258" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0056" bpmnElement="PP4063" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="21228" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0045" bpmnElement="PP3656" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="19788" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0097" bpmnElement="PP3109" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="19958" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1064" bpmnElement="PP4321">
        <dc:Bounds x="20130" y="552" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="20117" y="595" width="65" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0142" bpmnElement="PP3860" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="24968" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0050" bpmnElement="PP3536" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="25208" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0112" bpmnElement="PP3373" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="24546" y="860" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2397" bpmnElement="PP2396">
        <dc:Bounds x="23963" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2416" bpmnElement="PP2415">
        <dc:Bounds x="24873" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0960" bpmnElement="PP1225">
        <dc:Bounds x="25240" y="672" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="25229" y="715" width="76" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1025" bpmnElement="PP3816">
        <dc:Bounds x="24328" y="690" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="24316" y="726" width="72" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0130" bpmnElement="PP3092" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="6780" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2424" bpmnElement="PP2443">
        <dc:Bounds x="20433" y="683" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="8974" y="515" width="37" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0953" bpmnElement="PP3872">
        <dc:Bounds x="20612" y="690" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="20593" y="733" width="79" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0143" bpmnElement="PP4064" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="26948" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0084" bpmnElement="PP3415">
        <dc:Bounds x="5844" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0087" bpmnElement="PP4071" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="2272" y="1231" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1004" bpmnElement="PP0964">
        <dc:Bounds x="2461" y="1253" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2275" bpmnElement="PP2274" isMarkerVisible="true">
        <dc:Bounds x="17613" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="17669" y="550" width="88" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0060" bpmnElement="PP3064">
        <dc:Bounds x="17588" y="850" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0074" bpmnElement="PP4086" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="17708" y="740" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0138" bpmnElement="PP3641" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="22430" y="211" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="Activity_monta_body_PP3641_di" bpmnElement="monta_body_PP3641" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="22200" y="211" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1186" bpmnElement="PP1185">
        <dc:Bounds x="22132" y="163" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="22111" y="199" width="78" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1182" bpmnElement="PP1181">
        <dc:Bounds x="22132" y="303" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="22111" y="339" width="78" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0038" bpmnElement="PP0037" isExpanded="true" bioc:stroke="#000000" bioc:fill="#ffffff" color:border-color="#000000">
        <dc:Bounds x="17858" y="600" width="1470" height="390" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0992" bpmnElement="PP0991">
        <dc:Bounds x="17898" y="676" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0085" bpmnElement="PP3065" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="18147" y="654" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1037" bpmnElement="PP1036" bioc:stroke="#000000" bioc:fill="#ffffff" color:PP3123ground-color="#ffffff" color:border-color="#000000">
        <dc:Bounds x="18306" y="676" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18305" y="716" width="62" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2311" bpmnElement="PP2310" isMarkerVisible="true" bioc:stroke="#000000" bioc:fill="#ffffff" color:PP3123ground-color="#ffffff" color:border-color="#000000">
        <dc:Bounds x="18790" y="669" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1204" bpmnElement="PP0932">
        <dc:Bounds x="18972" y="855" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18946" y="903" width="90" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1147" bpmnElement="PP1146">
        <dc:Bounds x="19220" y="676" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0105" bpmnElement="PP4057" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="18628" y="654" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0107" bpmnElement="PP4281" bioc:stroke="#000000" bioc:fill="#ffffff" color:PP3123ground-color="#ffffff" color:border-color="#000000">
        <dc:Bounds x="18948" y="654" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0941" bpmnElement="PP0940">
        <dc:Bounds x="19220" y="767" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="19235" y="810" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0049" bpmnElement="PP4067" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="19068" y="745" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0055" bpmnElement="PP3886" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="18000" y="654" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2401" bpmnElement="PP2400" isMarkerVisible="true">
        <dc:Bounds x="18453" y="669" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18437" y="619" width="81" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1024" bpmnElement="PP1023">
        <dc:Bounds x="18460" y="767" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18379" y="771" width="78" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2433" bpmnElement="PP2432" isMarkerVisible="true">
        <dc:Bounds x="18453" y="848" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18446" y="899" width="65" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1202" bpmnElement="PP1201">
        <dc:Bounds x="18587" y="855" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18583" y="898" width="45" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0129" bpmnElement="PP4211" bioc:stroke="#1e88e5" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#1e88e5">
        <dc:Bounds x="18765" y="833" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1208" bpmnElement="PP1030">
        <dc:Bounds x="19010" y="716" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Edge id="PP2020" bpmnElement="PP2019">
        <di:waypoint x="18247" y="694" />
        <di:waypoint x="18306" y="694" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1457" bpmnElement="PP1456">
        <di:waypoint x="18840" y="694" />
        <di:waypoint x="18948" y="694" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1358" bpmnElement="PP1357">
        <di:waypoint x="18342" y="694" />
        <di:waypoint x="18453" y="694" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1880" bpmnElement="PP1879">
        <di:waypoint x="18728" y="694" />
        <di:waypoint x="18790" y="694" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1876" bpmnElement="PP1875">
        <di:waypoint x="19048" y="694" />
        <di:waypoint x="19220" y="694" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2003" bpmnElement="PP2002">
        <di:waypoint x="19168" y="785" />
        <di:waypoint x="19220" y="785" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1912" bpmnElement="PP1911">
        <di:waypoint x="17934" y="694" />
        <di:waypoint x="18000" y="694" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1498" bpmnElement="PP1497">
        <di:waypoint x="18100" y="694" />
        <di:waypoint x="18147" y="694" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1840" bpmnElement="PP1839">
        <di:waypoint x="18503" y="694" />
        <di:waypoint x="18628" y="694" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18564" y="676" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1868" bpmnElement="PP1867">
        <di:waypoint x="18478" y="719" />
        <di:waypoint x="18478" y="767" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18487" y="727" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1524" bpmnElement="PP1523">
        <di:waypoint x="18478" y="803" />
        <di:waypoint x="18478" y="848" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1970" bpmnElement="PP1969">
        <di:waypoint x="18503" y="873" />
        <di:waypoint x="18587" y="873" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18541" y="855" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1488" bpmnElement="PP1487">
        <di:waypoint x="18453" y="873" />
        <di:waypoint x="18197" y="873" />
        <di:waypoint x="18197" y="734" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18315" y="855" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1753" bpmnElement="PP1752">
        <di:waypoint x="19028" y="752" />
        <di:waypoint x="19028" y="785" />
        <di:waypoint x="19068" y="785" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1380" bpmnElement="PP1379">
        <di:waypoint x="18815" y="719" />
        <di:waypoint x="18815" y="833" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1864" bpmnElement="PP1863">
        <di:waypoint x="18865" y="873" />
        <di:waypoint x="18972" y="873" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Shape id="PP2289" bpmnElement="PP2288">
        <dc:Bounds x="17613" y="755" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2326" bpmnElement="PP2325" isMarkerVisible="true">
        <dc:Bounds x="19553" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0994" bpmnElement="PP0993">
        <dc:Bounds x="17620" y="1022" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1114" bpmnElement="PP1113">
        <dc:Bounds x="17970" y="1162" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18019" y="1166" width="71" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0063" bpmnElement="PP0062" isExpanded="true">
        <dc:Bounds x="17988" y="158" width="960" height="412" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1116" bpmnElement="PP1115">
        <dc:Bounds x="18060" y="250" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0041" bpmnElement="PP4282" bioc:stroke="#000000" bioc:fill="#ffffff" color:PP3123ground-color="#ffffff" color:border-color="#000000">
        <dc:Bounds x="18178" y="228" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1130" bpmnElement="PP1129">
        <dc:Bounds x="18840" y="222" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0114" bpmnElement="PP3583">
        <dc:Bounds x="18748" y="378" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0102" bpmnElement="PP4066" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="18368" y="308" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1160" bpmnElement="PP1196">
        <dc:Bounds x="18890" y="380" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18904" y="357" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0146" bpmnElement="PP4069" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="18368" y="448" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2344" bpmnElement="PP2343" isMarkerVisible="true">
        <dc:Bounds x="18673" y="393" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1091" bpmnElement="PP1086">
        <dc:Bounds x="18260" y="290" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1014" bpmnElement="PP1000">
        <dc:Bounds x="18210" y="290" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1011" bpmnElement="PP1010">
        <dc:Bounds x="18830" y="420" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Edge id="PP1613" bpmnElement="PP1612">
        <di:waypoint x="18278" y="240" />
        <di:waypoint x="18840" y="240" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1718" bpmnElement="PP1717">
        <di:waypoint x="18096" y="268" />
        <di:waypoint x="18178" y="268" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1632" bpmnElement="PP1631">
        <di:waypoint x="18866" y="438" />
        <di:waypoint x="18908" y="438" />
        <di:waypoint x="18908" y="416" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1557" bpmnElement="PP1556">
        <di:waypoint x="18468" y="348" />
        <di:waypoint x="18698" y="348" />
        <di:waypoint x="18698" y="393" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1949" bpmnElement="PP1948">
        <di:waypoint x="18468" y="488" />
        <di:waypoint x="18698" y="488" />
        <di:waypoint x="18698" y="443" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1676" bpmnElement="PP1675">
        <di:waypoint x="18723" y="418" />
        <di:waypoint x="18748" y="418" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1567" bpmnElement="PP1566">
        <di:waypoint x="18228" y="326" />
        <di:waypoint x="18228" y="488" />
        <di:waypoint x="18368" y="488" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1890" bpmnElement="PP1889">
        <di:waypoint x="18278" y="326" />
        <di:waypoint x="18278" y="348" />
        <di:waypoint x="18368" y="348" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1638" bpmnElement="PP1637">
        <di:waypoint x="18848" y="398" />
        <di:waypoint x="18890" y="398" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Shape id="PP2411" bpmnElement="PP2410">
        <dc:Bounds x="19433" y="245" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1052" bpmnElement="PP1051">
        <dc:Bounds x="19560" y="152" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0047" bpmnElement="PP4166">
        <dc:Bounds x="19408" y="130" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1008" bpmnElement="PP1007">
        <dc:Bounds x="18840" y="1162" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18889" y="1166" width="71" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0131" bpmnElement="PP4068" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="18808" y="1040" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0070" bpmnElement="PP4079" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="17938" y="1040" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1210" bpmnElement="PP1209">
        <dc:Bounds x="19130" y="450" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="19119" y="494" width="71" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0998" bpmnElement="PP0997">
        <dc:Bounds x="19140" y="1162" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="19189" y="1166" width="71" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0083" bpmnElement="PP4056" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="19438" y="785" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2366" bpmnElement="PP2270">
        <dc:Bounds x="25121" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2383" bpmnElement="PP2296">
        <dc:Bounds x="25351" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0061" bpmnElement="PP4078" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="18248" y="1040" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1217" bpmnElement="PP1216">
        <dc:Bounds x="18280" y="1162" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18324" y="1166" width="71" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0042" bpmnElement="PP2749" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="18998" y="298" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1159" bpmnElement="PP1158">
        <dc:Bounds x="19130" y="320" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="19119" y="364" width="71" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0127" bpmnElement="PP3932" bioc:stroke="#5b176d" bioc:fill="#e1bee7" color:PP3123ground-color="#e1bee7" color:border-color="#5b176d">
        <dc:Bounds x="24546" y="668" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2346" bpmnElement="PP2345" isMarkerVisible="true">
        <dc:Bounds x="24761" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0929" bpmnElement="PP4352">
        <dc:Bounds x="24328" y="796" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="24330" y="839" width="44" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2386" bpmnElement="PP2440">
        <dc:Bounds x="24211" y="683" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1111" bpmnElement="PP4320">
        <dc:Bounds x="24428" y="796" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="24437" y="773" width="18" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0065" bpmnElement="PP0064" isExpanded="true">
        <dc:Bounds x="160" y="1121" width="590" height="300" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2269" bpmnElement="PP2268" isMarkerVisible="true">
        <dc:Bounds x="285" y="1246" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="274" y="1224" width="71" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1149" bpmnElement="PP1148">
        <dc:Bounds x="542" y="1343" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0937" bpmnElement="PP0936">
        <dc:Bounds x="192" y="1253" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1122" bpmnElement="PP1253">
        <dc:Bounds x="692" y="1253" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0140" bpmnElement="PP3572" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="460" y="1231" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Edge id="PP1595" bpmnElement="PP1594">
        <di:waypoint x="310" y="1296" />
        <di:waypoint x="310" y="1361" />
        <di:waypoint x="542" y="1361" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="318" y="1308" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1604" bpmnElement="PP1603">
        <di:waypoint x="335" y="1271" />
        <di:waypoint x="460" y="1271" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="374" y="1253" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1345" bpmnElement="PP1344">
        <di:waypoint x="228" y="1271" />
        <di:waypoint x="285" y="1271" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1844" bpmnElement="PP1843">
        <di:waypoint x="560" y="1271" />
        <di:waypoint x="692" y="1271" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Shape id="PP1218" bpmnElement="PP3363" bioc:stroke="#000" bioc:fill="#fff">
        <dc:Bounds x="25780" y="1286" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="25756" y="1262" width="84" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1169" bpmnElement="PP1168">
        <dc:Bounds x="26130" y="1286" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0098" bpmnElement="PP3110" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="25936" y="1264" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0089" bpmnElement="PP3068" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="11608" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2295" bpmnElement="PP2294" isMarkerVisible="true">
        <dc:Bounds x="11773" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="11773" y="516" width="52" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1073" bpmnElement="PP1072">
        <dc:Bounds x="12120" y="934" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0111" bpmnElement="PP3145">
        <dc:Bounds x="11748" y="912" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0086" bpmnElement="PP4059" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="11938" y="912" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1063" bpmnElement="PP1098">
        <dc:Bounds x="5966" y="672" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="5960" y="715" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1045" bpmnElement="PP1212">
        <dc:Bounds x="6254" y="672" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="6248" y="715" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1112" bpmnElement="PP1190">
        <dc:Bounds x="6434" y="672" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="6428" y="715" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1046" bpmnElement="PP1157">
        <dc:Bounds x="6604" y="672" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="6598" y="718" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1211" bpmnElement="PP1067">
        <dc:Bounds x="7562" y="672" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="7556" y="715" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1071" bpmnElement="PP0977">
        <dc:Bounds x="7720" y="672" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="7714" y="715" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0938" bpmnElement="PP1175">
        <dc:Bounds x="9190" y="622" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="9184" y="665" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1055" bpmnElement="PP1081">
        <dc:Bounds x="8259" y="642" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0093" bpmnElement="PP3405">
        <dc:Bounds x="11418" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1140" bpmnElement="PP4323">
        <dc:Bounds x="20612" y="828" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="20602" y="871" width="68" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2430" bpmnElement="PP2429" isMarkerVisible="true">
        <dc:Bounds x="20773" y="683" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0117" bpmnElement="PP3298">
        <dc:Bounds x="12758" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1035" bpmnElement="PP1034">
        <dc:Bounds x="12844" y="625" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="12838" y="668" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0125" bpmnElement="PP3144">
        <dc:Bounds x="11508" y="696" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0072" bpmnElement="PP4058" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="11508" y="870" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1096" bpmnElement="PP1095">
        <dc:Bounds x="11540" y="1002" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0914" bpmnElement="PP0913">
        <dc:Bounds x="11537" y="626" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="11531" y="669" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0153" bpmnElement="PP3333" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="20748" y="806" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2330" bpmnElement="PP2329" isMarkerVisible="true">
        <dc:Bounds x="20953" y="683" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="20933" y="619" width="90" height="53" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0947" bpmnElement="PP1221">
        <dc:Bounds x="21406" y="691" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="21379" y="734" width="90" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1085" bpmnElement="PP1226">
        <dc:Bounds x="20780" y="949" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="20768" y="995" width="70" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2279" bpmnElement="PP2278" isMarkerVisible="true">
        <dc:Bounds x="20953" y="821" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="20911" y="805" width="51" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0118" bpmnElement="PP4072" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="21228" y="669" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0918" bpmnElement="PP1224">
        <dc:Bounds x="21100" y="828" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="21073" y="874" width="90" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1126" bpmnElement="PP3477">
        <dc:Bounds x="21100" y="690" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="21073" y="640" width="90" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0137" bpmnElement="PP0136" isExpanded="true">
        <dc:Bounds x="2560" y="1122" width="257" height="300" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0916" bpmnElement="PP0915">
        <dc:Bounds x="2732" y="1254" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0950" bpmnElement="PP1223">
        <dc:Bounds x="2612" y="1254" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="2599" y="1297" width="68" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Edge id="PP1589" bpmnElement="PP1588">
        <di:waypoint x="2648" y="1272" />
        <di:waypoint x="2732" y="1272" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Shape id="PP0096" bpmnElement="PP4084" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="18518" y="1040" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1214" bpmnElement="PP1213">
        <dc:Bounds x="18550" y="1162" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18601" y="1167" width="68" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2335" bpmnElement="PP2334" isMarkerVisible="true">
        <dc:Bounds x="11963" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0109" bpmnElement="PP3527" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="11938" y="696" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0987" bpmnElement="PP0986">
        <dc:Bounds x="12120" y="722" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="12114" y="765" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2407" bpmnElement="PP2406" isMarkerVisible="true">
        <dc:Bounds x="11773" y="711" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1193" bpmnElement="PP3788">
        <dc:Bounds x="6024" y="552" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="6005" y="595" width="77" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0135" bpmnElement="PP0134" isExpanded="true">
        <dc:Bounds x="2830" y="1123" width="405" height="300" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1068" bpmnElement="PP1222">
        <dc:Bounds x="3142" y="1255" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0069" bpmnElement="PP3184" bioc:stroke="black" bioc:fill="white">
        <dc:Bounds x="2990" y="1233" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0957" bpmnElement="PP3784">
        <dc:Bounds x="2872" y="1255" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="2861" y="1298" width="60" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Edge id="PP1984" bpmnElement="PP1983">
        <di:waypoint x="2908" y="1273" />
        <di:waypoint x="2990" y="1273" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1317" bpmnElement="PP1316">
        <di:waypoint x="3090" y="1273" />
        <di:waypoint x="3142" y="1273" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Shape id="PP2388" bpmnElement="PP2387" isMarkerVisible="true">
        <dc:Bounds x="16563" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="16554" y="515" width="85" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2374" bpmnElement="PP2373" isMarkerVisible="true">
        <dc:Bounds x="17003" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="16997" y="519" width="63" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0048" bpmnElement="PP4243" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="17137" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0054" bpmnElement="PP4242" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="17137" y="787" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0044" bpmnElement="PP3066" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="16978" y="787" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0082" bpmnElement="PP4244" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="17298" y="787" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2376" bpmnElement="PP2375" isMarkerVisible="true">
        <dc:Bounds x="13293" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="13281" y="516" width="82" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2371" bpmnElement="PP2370" isMarkerVisible="true">
        <dc:Bounds x="13493" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0095" bpmnElement="PP4311" bioc:stroke="#000000" bioc:fill="#ffffff" color:PP3123ground-color="#ffffff" color:border-color="#000000">
        <dc:Bounds x="13378" y="690" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0996" bpmnElement="PP0995">
        <dc:Bounds x="13450" y="811" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="13444" y="854" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2393" bpmnElement="PP2392" isMarkerVisible="true">
        <dc:Bounds x="27271" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="27258" y="500" width="82" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0144" bpmnElement="PP4379" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="27246" y="662" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2365" bpmnElement="PP2364" isMarkerVisible="true">
        <dc:Bounds x="27431" y="677" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="27373" y="657" width="86" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0077" bpmnElement="PP3541" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="27566" y="662" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0149" bpmnElement="PP3099" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="27928" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0104" bpmnElement="PP3613">
        <dc:Bounds x="2092" y="1231" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1041" bpmnElement="PP1040">
        <dc:Bounds x="212" y="552" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0071" bpmnElement="PP4204" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="382" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0090" bpmnElement="PP3413" bioc:stroke="#000000" bioc:fill="#ffffff" color:PP3123ground-color="#ffffff" color:border-color="#000000">
        <dc:Bounds x="2102" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0985" bpmnElement="PP0984">
        <dc:Bounds x="2224" y="672" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="2218" y="715" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0043" bpmnElement="PP3782">
        <dc:Bounds x="2352" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0141" bpmnElement="PP3319">
        <dc:Bounds x="3990" y="620" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0924" bpmnElement="PP1219">
        <dc:Bounds x="4142" y="642" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="4127" y="688" width="72" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2258" bpmnElement="PP2257" isMarkerVisible="true">
        <dc:Bounds x="3145" y="635" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="3131" y="605" width="87" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1019" bpmnElement="PP1018">
        <dc:Bounds x="2900" y="796" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="2847" y="772" width="65" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1162" bpmnElement="PP1161">
        <dc:Bounds x="4022" y="796" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="4016" y="839" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0943" bpmnElement="PP0942">
        <dc:Bounds x="2384" y="672" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="2378" y="715" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2328" bpmnElement="PP2327" isMarkerVisible="true">
        <dc:Bounds x="26461" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="26449" y="495" width="74" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0046" bpmnElement="PP4283">
        <dc:Bounds x="26616" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2286" bpmnElement="PP2285" isMarkerVisible="true">
        <dc:Bounds x="26821" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0075" bpmnElement="PP3885" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="26556" y="662" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0103" bpmnElement="PP3570" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="26696" y="662" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0425" bpmnElement="PP1145">
        <dc:Bounds x="15265" y="672" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="15258" y="715" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0495" bpmnElement="PP3067">
        <dc:Bounds x="16676" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2317" bpmnElement="PP2316" isMarkerVisible="true">
        <dc:Bounds x="16863" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2319" bpmnElement="PP2318" isMarkerVisible="true">
        <dc:Bounds x="17003" y="665" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="16926" y="683" width="67" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2423" bpmnElement="PP2422" isMarkerVisible="true">
        <dc:Bounds x="17323" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0079" bpmnElement="PP3870" bioc:stroke="#000000" bioc:fill="#ffffff" color:PP3123ground-color="#ffffff" color:border-color="#000000">
        <dc:Bounds x="17137" y="650" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1142" bpmnElement="PP1141">
        <dc:Bounds x="17480" y="809" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="17460" y="852" width="77" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0123" bpmnElement="PP0122" isExpanded="true">
        <dc:Bounds x="796" y="1119" width="454" height="300" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0410" bpmnElement="PP1174">
        <dc:Bounds x="823" y="1251" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0320" bpmnElement="PP0983">
        <dc:Bounds x="923" y="1351" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0455" bpmnElement="PP3654" isMarkerVisible="true">
        <dc:Bounds x="916" y="1244" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="902" y="1199" width="82" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0307" bpmnElement="PP1026">
        <dc:Bounds x="1162" y="1251" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2351" bpmnElement="PP2449">
        <dc:Bounds x="1065" y="1244" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0946" bpmnElement="PP1178">
        <dc:Bounds x="1112" y="1331" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="1093" y="1374" width="75" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Edge id="PP0246" bpmnElement="PP2026">
        <di:waypoint x="859" y="1269" />
        <di:waypoint x="916" y="1269" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0293" bpmnElement="PP1494">
        <di:waypoint x="941" y="1294" />
        <di:waypoint x="941" y="1351" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="946" y="1319" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0272" bpmnElement="PP1991">
        <di:waypoint x="966" y="1269" />
        <di:waypoint x="1065" y="1269" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="975" y="1247" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1502" bpmnElement="PP1501">
        <di:waypoint x="1115" y="1269" />
        <di:waypoint x="1162" y="1269" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2143" bpmnElement="PP2142">
        <di:waypoint x="1090" y="1294" />
        <di:waypoint x="1090" y="1349" />
        <di:waypoint x="1112" y="1349" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Shape id="PP0391" bpmnElement="PP0073" isExpanded="true">
        <dc:Bounds x="1260" y="1121" width="540" height="300" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0474" bpmnElement="PP3614" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="1490" y="1231" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0472" bpmnElement="PP0923">
        <dc:Bounds x="1342" y="1253" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1093" bpmnElement="PP1092">
        <dc:Bounds x="1662" y="1253" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Edge id="PP0252" bpmnElement="PP2014">
        <di:waypoint x="1378" y="1271" />
        <di:waypoint x="1490" y="1271" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1279" bpmnElement="PP1278">
        <di:waypoint x="1590" y="1271" />
        <di:waypoint x="1662" y="1271" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Shape id="PP0119" bpmnElement="PP0101" isExpanded="true">
        <dc:Bounds x="3250" y="1117" width="880" height="308" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0456" bpmnElement="PP3154" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="3660" y="1177" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2391" bpmnElement="PP2442" isMarkerVisible="true">
        <dc:Bounds x="3438" y="1192" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="3437" y="1170" width="58" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1009" bpmnElement="PP3602">
        <dc:Bounds x="3335" y="1199" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="3316" y="1242" width="75" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0370" bpmnElement="PP4060" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="3900" y="1177" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2315" bpmnElement="PP2314" isMarkerVisible="true">
        <dc:Bounds x="3675" y="1302" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1167" bpmnElement="PP1065">
        <dc:Bounds x="4068" y="1362" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1002" bpmnElement="PP1031">
        <dc:Bounds x="4068" y="1199" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0928" bpmnElement="PP0927">
        <dc:Bounds x="3781" y="1309" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="3769" y="1352" width="65" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1179" bpmnElement="PP1084">
        <dc:Bounds x="3597" y="1309" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1017" bpmnElement="PP3587">
        <dc:Bounds x="3682" y="1239" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Edge id="PP1790" bpmnElement="PP3315">
        <di:waypoint x="3488" y="1217" />
        <di:waypoint x="3660" y="1217" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="3568" y="1199" width="18" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1999" bpmnElement="PP1998">
        <di:waypoint x="3760" y="1217" />
        <di:waypoint x="3900" y="1217" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1738" bpmnElement="PP1737">
        <di:waypoint x="3371" y="1217" />
        <di:waypoint x="3438" y="1217" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2108" bpmnElement="PP2236">
        <di:waypoint x="3463" y="1242" />
        <di:waypoint x="3463" y="1380" />
        <di:waypoint x="4068" y="1380" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="3469" y="1308" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1323" bpmnElement="PP1322">
        <di:waypoint x="3817" y="1327" />
        <di:waypoint x="3849" y="1327" />
        <di:waypoint x="3849" y="1237" />
        <di:waypoint x="3900" y="1237" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1930" bpmnElement="PP1929">
        <di:waypoint x="4000" y="1217" />
        <di:waypoint x="4068" y="1217" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1704" bpmnElement="PP1703">
        <di:waypoint x="3700" y="1275" />
        <di:waypoint x="3700" y="1302" />
        <di:waypoint x="3700" y="1327" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1945" bpmnElement="PP1944">
        <di:waypoint x="3725" y="1327" />
        <di:waypoint x="3781" y="1327" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1650" bpmnElement="PP1649">
        <di:waypoint x="3675" y="1327" />
        <di:waypoint x="3633" y="1327" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1271" bpmnElement="PP1270">
        <di:waypoint x="3615" y="1309" />
        <di:waypoint x="3615" y="1247" />
        <di:waypoint x="3660" y="1247" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Shape id="PP0408" bpmnElement="PP1076">
        <dc:Bounds x="17610" y="1412" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="17600" y="1455" width="71" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0477" bpmnElement="PP2305" isMarkerVisible="true">
        <dc:Bounds x="18023" y="1405" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18014" y="1375" width="81" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0451" bpmnElement="PP3498" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="17838" y="1390" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1144" bpmnElement="PP1194">
        <dc:Bounds x="18250" y="1412" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1163" bpmnElement="PP0939">
        <dc:Bounds x="18250" y="1552" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1066" bpmnElement="PP0948">
        <dc:Bounds x="18250" y="1632" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18234" y="1675" width="75" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2369" bpmnElement="PP2394">
        <dc:Bounds x="17713" y="1405" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0434" bpmnElement="PP3571" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="17998" y="1530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1110" bpmnElement="PP1109">
        <dc:Bounds x="11010" y="672" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="11004" y="715" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2414" bpmnElement="PP2413" isMarkerVisible="true">
        <dc:Bounds x="11105" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2304" bpmnElement="PP2303" isMarkerVisible="true">
        <dc:Bounds x="11235" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0346" bpmnElement="PP4377" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="11080" y="668" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2380" bpmnElement="PP2379" isMarkerVisible="true">
        <dc:Bounds x="11235" y="683" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0387" bpmnElement="PP1191">
        <dc:Bounds x="11108" y="856" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2428" bpmnElement="PP2427" isMarkerVisible="true">
        <dc:Bounds x="12153" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2281" bpmnElement="PP2280" isMarkerVisible="true">
        <dc:Bounds x="12963" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1048" bpmnElement="PP1047">
        <dc:Bounds x="12360" y="744" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="12351" y="787" width="56" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0327" bpmnElement="PP3497" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="10548" y="650" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0121" bpmnElement="PP4135">
        <dc:Bounds x="10428" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0040" bpmnElement="PP3046">
        <dc:Bounds x="13648" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0476" bpmnElement="PP4062" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="13610" y="690" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1050" bpmnElement="PP1049">
        <dc:Bounds x="13642" y="822" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="13629" y="858" width="71" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0358" bpmnElement="PP3745">
        <dc:Bounds x="5722" y="552" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="5709" y="595" width="75" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0459" bpmnElement="PP0092" isExpanded="true">
        <dc:Bounds x="4151" y="1119" width="578" height="300" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0361" bpmnElement="PP1029">
        <dc:Bounds x="4643" y="1251" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0438" bpmnElement="PP3746">
        <dc:Bounds x="4173" y="1251" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="4158" y="1294" width="75" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0325" bpmnElement="PP3176" bioc:stroke="#43a047" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#43a047">
        <dc:Bounds x="4341" y="1229" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0443" bpmnElement="PP3090" bioc:stroke="#43a047" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#43a047">
        <dc:Bounds x="4501" y="1229" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2403" bpmnElement="PP2402" isMarkerVisible="true">
        <dc:Bounds x="4366" y="1354" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1070" bpmnElement="PP1069">
        <dc:Bounds x="4473" y="1361" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="4457" y="1404" width="76" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0412" bpmnElement="PP0921">
        <dc:Bounds x="4373" y="1291" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Edge id="PP1486" bpmnElement="PP1485">
        <di:waypoint x="4601" y="1269" />
        <di:waypoint x="4643" y="1269" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0265" bpmnElement="PP1742">
        <di:waypoint x="4209" y="1269" />
        <di:waypoint x="4341" y="1269" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1812" bpmnElement="PP1811">
        <di:waypoint x="4366" y="1379" />
        <di:waypoint x="4301" y="1379" />
        <di:waypoint x="4301" y="1299" />
        <di:waypoint x="4341" y="1299" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="4305" y="1333" width="55" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0239" bpmnElement="PP1525">
        <di:waypoint x="4441" y="1269" />
        <di:waypoint x="4501" y="1269" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1724" bpmnElement="PP1723">
        <di:waypoint x="4509" y="1379" />
        <di:waypoint x="4551" y="1379" />
        <di:waypoint x="4551" y="1309" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0269" bpmnElement="PP2118">
        <di:waypoint x="4391" y="1327" />
        <di:waypoint x="4391" y="1354" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1993" bpmnElement="PP1992">
        <di:waypoint x="4416" y="1379" />
        <di:waypoint x="4473" y="1379" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Shape id="PP2262" bpmnElement="PP2261" isMarkerVisible="true">
        <dc:Bounds x="28660" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0318" bpmnElement="PP3544" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="29238" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0326" bpmnElement="PP4075" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="29439" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0331" bpmnElement="PP1003">
        <dc:Bounds x="29600" y="552" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0491" bpmnElement="PP3539" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="28908" y="875" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0342" bpmnElement="PP2417" isMarkerVisible="true">
        <dc:Bounds x="29069" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0478" bpmnElement="PP2348">
        <dc:Bounds x="28797" y="755" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0384" bpmnElement="PP3540" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="28908" y="740" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0392" bpmnElement="PP2372">
        <dc:Bounds x="29069" y="755" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0352" bpmnElement="PP1156" bioc:stroke="#000" bioc:fill="#fff">
        <dc:Bounds x="28804" y="667" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="28726" y="678" width="68" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0419" bpmnElement="PP2298" isMarkerVisible="true" bioc:stroke="#000" bioc:fill="#fff">
        <dc:Bounds x="28797" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="28834" y="523" width="72" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0469" bpmnElement="PP2434" isMarkerVisible="true" bioc:stroke="#000" bioc:fill="#fff">
        <dc:Bounds x="28227" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="28218" y="523" width="83" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1015" bpmnElement="PP1074" bioc:stroke="#000" bioc:fill="#fff">
        <dc:Bounds x="29190" y="647" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="29202" y="690" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0145" bpmnElement="PP3113" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="27758" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0148" bpmnElement="PP3056" bioc:stroke="#1e88e5" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#1e88e5">
        <dc:Bounds x="27566" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0363" bpmnElement="PP3598" bioc:stroke="rgb(67, 160, 71)" bioc:fill="rgb(200, 230, 201)">
        <dc:Bounds x="26145" y="660" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0316" bpmnElement="PP2381" isMarkerVisible="true" bioc:stroke="#000" bioc:fill="#fff">
        <dc:Bounds x="25463" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="25447" y="495" width="82" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0458" bpmnElement="PP2438" isMarkerVisible="true">
        <dc:Bounds x="26361" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0473" bpmnElement="PP3861" bioc:stroke="#1e88e5" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#1e88e5">
        <dc:Bounds x="25971" y="660" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0323" bpmnElement="PP0971" bioc:stroke="#000" bioc:fill="#fff">
        <dc:Bounds x="25563" y="682" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="25556" y="658" width="49" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0486" bpmnElement="PP3334" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="25673" y="660" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0416" bpmnElement="PP2412" isMarkerVisible="true" bioc:stroke="#000" bioc:fill="#fff">
        <dc:Bounds x="25847" y="675" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="25827" y="653" width="90" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0449" bpmnElement="PP0926" bioc:stroke="#000" bioc:fill="#fff">
        <dc:Bounds x="25854" y="804" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="25830" y="847" width="84" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2361" bpmnElement="PP2360" isMarkerVisible="true">
        <dc:Bounds x="26170" y="797" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="26101" y="808" width="59" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2313" bpmnElement="PP2312" isMarkerVisible="true">
        <dc:Bounds x="26170" y="923" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="26176" y="983" width="54" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0344" bpmnElement="PP4177">
        <dc:Bounds x="26336" y="908" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0394" bpmnElement="PP1192">
        <dc:Bounds x="25563" y="930" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="25550" y="976" width="72" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0120" bpmnElement="PP3887" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="24048" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0409" bpmnElement="PP3933" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="24186" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0399" bpmnElement="PP3510" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="670" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0433" bpmnElement="PP3107" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="860" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2293" bpmnElement="PP2292" isMarkerVisible="true">
        <dc:Bounds x="2893" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="2929" y="543" width="90" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2426" bpmnElement="PP2425" isMarkerVisible="true">
        <dc:Bounds x="5325" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="5363" y="510" width="58" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0113" bpmnElement="PP4232">
        <dc:Bounds x="5300" y="682" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0348" bpmnElement="PP1134">
        <dc:Bounds x="5332" y="958" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0397" bpmnElement="PP3513" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="5540" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0059" bpmnElement="PP0058" isExpanded="true">
        <dc:Bounds x="21918" y="390" width="1370" height="720" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1013" bpmnElement="PP1012">
        <dc:Bounds x="21958" y="479" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0396" bpmnElement="PP2300" isMarkerVisible="true">
        <dc:Bounds x="22033" y="472" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="22026" y="450" width="68" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0373" bpmnElement="PP2320" isMarkerVisible="true">
        <dc:Bounds x="23093" y="472" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0463" bpmnElement="PP4451" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="22238" y="667" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0330" bpmnElement="PP2355" isMarkerVisible="true">
        <dc:Bounds x="22493" y="682" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0407" bpmnElement="PP3584">
        <dc:Bounds x="22858" y="897" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0432" bpmnElement="PP1119">
        <dc:Bounds x="22500" y="809" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0414" bpmnElement="PP1088">
        <dc:Bounds x="22270" y="549" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="22277" y="535" width="22" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0324" bpmnElement="PP4085" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="22858" y="667" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0381" bpmnElement="PP2439">
        <dc:Bounds x="22653" y="682" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0364" bpmnElement="PP2349">
        <dc:Bounds x="22653" y="912" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0379" bpmnElement="PP1101">
        <dc:Bounds x="23020" y="689" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0404" bpmnElement="PP2282" isMarkerVisible="true">
        <dc:Bounds x="22263" y="913" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0428" bpmnElement="PP1107">
        <dc:Bounds x="22040" y="809" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="22070" y="797" width="16" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0446" bpmnElement="PP2284">
        <dc:Bounds x="22883" y="802" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0347" bpmnElement="PP4322">
        <dc:Bounds x="22140" y="689" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="22127" y="728" width="65" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0393" bpmnElement="PP2336" isMarkerVisible="true">
        <dc:Bounds x="22493" y="912" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1165" bpmnElement="PP1164">
        <dc:Bounds x="23190" y="479" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0417" bpmnElement="PP1108">
        <dc:Bounds x="22270" y="729" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Edge id="PP2001" bpmnElement="PP2000">
        <di:waypoint x="21994" y="497" />
        <di:waypoint x="22033" y="497" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0296" bpmnElement="PP1336">
        <di:waypoint x="22083" y="497" />
        <di:waypoint x="23093" y="497" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0295" bpmnElement="PP1478">
        <di:waypoint x="22058" y="522" />
        <di:waypoint x="22058" y="707" />
        <di:waypoint x="22140" y="707" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0292" bpmnElement="PP2117">
        <di:waypoint x="22678" y="682" />
        <di:waypoint x="22678" y="497" />
        <di:waypoint x="23093" y="497" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0275" bpmnElement="PP1793">
        <di:waypoint x="22933" y="827" />
        <di:waypoint x="23118" y="827" />
        <di:waypoint x="23118" y="522" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1415" bpmnElement="PP1414">
        <di:waypoint x="23143" y="497" />
        <di:waypoint x="23190" y="497" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0280" bpmnElement="PP1386">
        <di:waypoint x="22176" y="707" />
        <di:waypoint x="22238" y="707" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0290" bpmnElement="PP1630">
        <di:waypoint x="22338" y="707" />
        <di:waypoint x="22493" y="707" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0244" bpmnElement="PP2101">
        <di:waypoint x="22543" y="707" />
        <di:waypoint x="22653" y="707" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="22553" y="693" width="78" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0284" bpmnElement="PP1741">
        <di:waypoint x="22518" y="732" />
        <di:waypoint x="22518" y="809" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="22528" y="742" width="50" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0270" bpmnElement="PP1614">
        <di:waypoint x="22518" y="682" />
        <di:waypoint x="22518" y="567" />
        <di:waypoint x="22306" y="567" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="22399" y="552" width="40" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0247" bpmnElement="PP1810">
        <di:waypoint x="22703" y="937" />
        <di:waypoint x="22858" y="937" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0276" bpmnElement="PP1348">
        <di:waypoint x="22958" y="937" />
        <di:waypoint x="22988" y="937" />
        <di:waypoint x="22988" y="957" />
        <di:waypoint x="22958" y="957" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0256" bpmnElement="PP1282">
        <di:waypoint x="22908" y="897" />
        <di:waypoint x="22908" y="852" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0302" bpmnElement="PP1691">
        <di:waypoint x="22518" y="845" />
        <di:waypoint x="22518" y="912" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0301" bpmnElement="PP2023">
        <di:waypoint x="22270" y="567" />
        <di:waypoint x="22058" y="567" />
        <di:waypoint x="22058" y="707" />
        <di:waypoint x="22140" y="707" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0279" bpmnElement="PP2129">
        <di:waypoint x="22703" y="937" />
        <di:waypoint x="22768" y="937" />
        <di:waypoint x="22768" y="707" />
        <di:waypoint x="22858" y="707" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0259" bpmnElement="PP1389">
        <di:waypoint x="22703" y="707" />
        <di:waypoint x="22858" y="707" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0281" bpmnElement="PP2191">
        <di:waypoint x="22908" y="802" />
        <di:waypoint x="22908" y="747" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0251" bpmnElement="PP1933">
        <di:waypoint x="22958" y="707" />
        <di:waypoint x="23020" y="707" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0250" bpmnElement="PP1934">
        <di:waypoint x="22543" y="937" />
        <di:waypoint x="22653" y="937" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0285" bpmnElement="PP1374">
        <di:waypoint x="22288" y="765" />
        <di:waypoint x="22288" y="913" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="15459" y="807" width="20" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0286" bpmnElement="PP1391">
        <di:waypoint x="22312" y="937" />
        <di:waypoint x="22493" y="937" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0255" bpmnElement="PP1600">
        <di:waypoint x="22263" y="938" />
        <di:waypoint x="22058" y="938" />
        <di:waypoint x="22058" y="845" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="22223" y="919" width="40" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0291" bpmnElement="PP1687">
        <di:waypoint x="22058" y="809" />
        <di:waypoint x="22058" y="707" />
        <di:waypoint x="22140" y="707" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Shape id="PP0377" bpmnElement="PP0066" isExpanded="true">
        <dc:Bounds x="4750" y="1119" width="365" height="252" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0415" bpmnElement="PP1215">
        <dc:Bounds x="5048" y="1202" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0471" bpmnElement="PP1173">
        <dc:Bounds x="4794" y="1202" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="4776" y="1245" width="74" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0406" bpmnElement="PP3348" bioc:stroke="#43a047" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#43a047">
        <dc:Bounds x="4880" y="1180" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0989" bpmnElement="PP1171">
        <dc:Bounds x="4912" y="1242" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Edge id="PP2035" bpmnElement="PP2034">
        <di:waypoint x="4980" y="1220" />
        <di:waypoint x="5048" y="1220" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1585" bpmnElement="PP1584">
        <di:waypoint x="4930" y="1278" />
        <di:waypoint x="4930" y="1298" />
        <di:waypoint x="5003" y="1298" />
        <di:waypoint x="5003" y="1220" />
        <di:waypoint x="5048" y="1220" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1706" bpmnElement="PP1705">
        <di:waypoint x="4830" y="1220" />
        <di:waypoint x="4880" y="1220" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Shape id="PP0402" bpmnElement="PP4221" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="8468" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0337" bpmnElement="PP3103" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="8727" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0439" bpmnElement="PP1094">
        <dc:Bounds x="8883" y="552" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="8864" y="515" width="74" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0108" bpmnElement="PP3591">
        <dc:Bounds x="4364" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0349" bpmnElement="PP1172">
        <dc:Bounds x="4480" y="619" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="4474" y="662" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2309" bpmnElement="PP2408" isMarkerVisible="true">
        <dc:Bounds x="21743" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0052" bpmnElement="PP4043" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="21718" y="660" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0442" bpmnElement="PP3588">
        <dc:Bounds x="21770" y="792" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="21813" y="797" width="81" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0470" bpmnElement="PP3102" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="21718" y="878" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0980" bpmnElement="PP0979">
        <dc:Bounds x="21750" y="1002" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0359" bpmnElement="PP0974">
        <dc:Bounds x="21720" y="792" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="21645" y="791" width="73" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0139" bpmnElement="PP4378" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="21718" y="211" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0338" bpmnElement="PP3558">
        <dc:Bounds x="10127" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0389" bpmnElement="PP0949">
        <dc:Bounds x="10230" y="630" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="10224" y="673" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2421" bpmnElement="PP2331">
        <dc:Bounds x="20433" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2420" bpmnElement="PP2347">
        <dc:Bounds x="20773" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2277" bpmnElement="PP2276" isMarkerVisible="true">
        <dc:Bounds x="10023" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2322" bpmnElement="PP2321" isMarkerVisible="true">
        <dc:Bounds x="10287" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2436" bpmnElement="PP2435" isMarkerVisible="true">
        <dc:Bounds x="1768" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0372" bpmnElement="PP1150">
        <dc:Bounds x="1775" y="1002" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2273" bpmnElement="PP2272" isMarkerVisible="true">
        <dc:Bounds x="545" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="536" y="523" width="71" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0332" bpmnElement="PP3512" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="670" y="746" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0051" bpmnElement="PP4198" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="9260" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0128" bpmnElement="PP3340" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="9400" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2405" bpmnElement="PP2404" isMarkerVisible="true" bioc:stroke="#000000" bioc:fill="#ffffff">
        <dc:Bounds x="9655" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="9635" y="516" width="90" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2302" bpmnElement="PP2301" isMarkerVisible="true" bioc:stroke="#000000" bioc:fill="#ffffff">
        <dc:Bounds x="9655" y="737" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0100" bpmnElement="PP3054">
        <dc:Bounds x="9260" y="722" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0057" bpmnElement="PP3576">
        <dc:Bounds x="9260" y="834" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0116" bpmnElement="PP3580">
        <dc:Bounds x="9260" y="936" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0464" bpmnElement="PP0150" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="9830" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0094" bpmnElement="PP3336" bioc:stroke="#43a047" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#43a047">
        <dc:Bounds x="13820" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0124" bpmnElement="PP4225" bioc:stroke="#1e88e5" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#1e88e5">
        <dc:Bounds x="13990" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1016" bpmnElement="PP0954">
        <dc:Bounds x="13892" y="652" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="13886" y="695" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0328" bpmnElement="PP4313" bioc:stroke="#000000" bioc:fill="#ffffff" color:PP3123ground-color="#ffffff" color:border-color="#000000">
        <dc:Bounds x="14250" y="668" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0395" bpmnElement="PP3328" bioc:stroke="#000000" bioc:fill="#ffffff" color:PP3123ground-color="#ffffff" color:border-color="#000000">
        <dc:Bounds x="14400" y="668" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0447" bpmnElement="PP0922">
        <dc:Bounds x="14282" y="822" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="14276" y="865" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0366" bpmnElement="PP1020">
        <dc:Bounds x="14432" y="828" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="14426" y="871" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2260" bpmnElement="PP2259" isMarkerVisible="true">
        <dc:Bounds x="23455" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="23441" y="521" width="78" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0336" bpmnElement="PP2418" isMarkerVisible="true">
        <dc:Bounds x="23855" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0390" bpmnElement="PP4203" bioc:stroke="#1e88e5" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#1e88e5">
        <dc:Bounds x="23560" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0488" bpmnElement="PP3044" bioc:stroke="#43a047" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#43a047">
        <dc:Bounds x="23710" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0333" bpmnElement="PP3409">
        <dc:Bounds x="14970" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0424" bpmnElement="PP1001">
        <dc:Bounds x="15004" y="662" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="14997" y="705" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0353" bpmnElement="PP3097" bioc:stroke="rgb(67, 160, 71)" bioc:fill="rgb(200, 230, 201)">
        <dc:Bounds x="14630" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0423" bpmnElement="PP2362" isMarkerVisible="true">
        <dc:Bounds x="14525" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0310" bpmnElement="PP2297" isMarkerVisible="true">
        <dc:Bounds x="14175" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="14162" y="521" width="76" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0400" bpmnElement="PP4070">
        <dc:Bounds x="15160" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0315" bpmnElement="PP3100" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="15770" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2353" bpmnElement="PP2352" isMarkerVisible="true">
        <dc:Bounds x="4215" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="4211" y="515" width="62" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0345" bpmnElement="PP3592">
        <dc:Bounds x="4870" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0430" bpmnElement="PP1075">
        <dc:Bounds x="4952" y="622" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="4945" y="665" width="49" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2390" bpmnElement="PP2389" isMarkerVisible="true">
        <dc:Bounds x="4767" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="4761" y="602" width="73" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2359" bpmnElement="PP2358" isMarkerVisible="true">
        <dc:Bounds x="26461" y="677" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0465" bpmnElement="PP2382" isMarkerVisible="true">
        <dc:Bounds x="26821" y="677" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0468" bpmnElement="PP3569" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="6930" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0440" bpmnElement="PP2271" isMarkerVisible="true">
        <dc:Bounds x="2495" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="2497" y="602" width="47" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0383" bpmnElement="PP3511" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="2590" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0312" bpmnElement="PP3108" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="2750" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0147" bpmnElement="PP3332" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="12260" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0132" bpmnElement="PP3177" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="12429" y="650" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0106" bpmnElement="PP3059" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="12420" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2267" bpmnElement="PP2266" isMarkerVisible="true">
        <dc:Bounds x="12603" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0945" bpmnElement="PP0944">
        <dc:Bounds x="12684" y="552" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="12663" y="595" width="78" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0091" bpmnElement="PP0110" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="16280" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2378" bpmnElement="PP2377" isMarkerVisible="true">
        <dc:Bounds x="16443" y="545" width="50" height="50" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0493" bpmnElement="PP0088" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="15940" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0445" bpmnElement="PP0099" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="16110" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0068" bpmnElement="PP3338" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="15470" y="708" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2324" bpmnElement="PP2323" isMarkerVisible="true">
        <dc:Bounds x="15795" y="723" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="15850" y="738" width="79" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2385" bpmnElement="PP2384" isMarkerVisible="true">
        <dc:Bounds x="15495" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="15478" y="515" width="84" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0355" bpmnElement="PP3101" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="15770" y="811" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0151" bpmnElement="PP4219" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="15630" y="708" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0309" bpmnElement="PP3316">
        <dc:Bounds x="1613" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1032" bpmnElement="PP1180">
        <dc:Bounds x="16032" y="940" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="16022" y="983" width="68" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1138" bpmnElement="PP1044" isMarkerVisible="true">
        <dc:Bounds x="1645" y="672" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="1638" y="715" width="65" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0357" bpmnElement="PP2409" isMarkerVisible="true">
        <dc:Bounds x="1120" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="1106" y="516" width="78" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0343" bpmnElement="PP2338" isMarkerVisible="true">
        <dc:Bounds x="1120" y="635" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="1048" y="653" width="71" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0462" bpmnElement="PP2431" isMarkerVisible="true">
        <dc:Bounds x="1020" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="1017" y="605" width="57" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0369" bpmnElement="PP3514" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="1210" y="620" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0401" bpmnElement="PP3515" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="1185" y="787" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0422" bpmnElement="PP3111" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="1341" y="620" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2447" bpmnElement="PP2419" isMarkerVisible="true">
        <dc:Bounds x="7115" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="7099" y="508" width="82" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0461" bpmnElement="PP4205" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="6640" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2357" bpmnElement="PP2356" isMarkerVisible="true">
        <dc:Bounds x="11325" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="11309" y="601" width="82" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0341" bpmnElement="PP2337" isMarkerVisible="true">
        <dc:Bounds x="8615" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="8599" y="507" width="82" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0480" bpmnElement="PP4222" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="8590" y="668" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0444" bpmnElement="PP3104" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="8727" y="668" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2368" bpmnElement="PP2367" isMarkerVisible="true">
        <dc:Bounds x="28115" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="28100" y="602" width="82" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0371" bpmnElement="PP3094" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="7260" y="668" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0367" bpmnElement="PP4207" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="7090" y="668" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2308" bpmnElement="PP2307" isMarkerVisible="true">
        <dc:Bounds x="7805" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="7789" y="508" width="82" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0454" bpmnElement="PP4206" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="7780" y="650" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0467" bpmnElement="PP3093" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="7950" y="650" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0427" bpmnElement="PP4077" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="29439" y="428" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0335" bpmnElement="PP2332" isMarkerVisible="true">
        <dc:Bounds x="15795" y="933" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="15700" y="951" width="81" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0435" bpmnElement="PP4157">
        <dc:Bounds x="16000" y="1030" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0329" bpmnElement="PP1056">
        <dc:Bounds x="16032" y="1157" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0308" bpmnElement="PP2306" isMarkerVisible="true">
        <dc:Bounds x="15795" y="645" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="15697" y="663" width="88" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0386" bpmnElement="PP3339" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="15980" y="708" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0398" bpmnElement="PP4220" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="16128" y="708" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0374" bpmnElement="PP2283" isMarkerVisible="true">
        <dc:Bounds x="16275" y="723" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="16335" y="735" width="79" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0382" bpmnElement="PP0078" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="16250" y="812" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0405" bpmnElement="PP2363" isMarkerVisible="true">
        <dc:Bounds x="16275" y="933" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="16333" y="944" width="81" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0453" bpmnElement="PP3095" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="4612" y="600" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2265" bpmnElement="PP2264" isMarkerVisible="true">
        <dc:Bounds x="4535" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="4519" y="521" width="87" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0420" bpmnElement="PP1166">
        <dc:Bounds x="4742" y="622" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0490" bpmnElement="PP2350" isMarkerVisible="true">
        <dc:Bounds x="3250" y="635" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="3247" y="605" width="72" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0039" bpmnElement="PP3345" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="3360" y="620" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0385" bpmnElement="PP4215" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="3810" y="620" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0351" bpmnElement="PP3344" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="3660" y="620" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0483" bpmnElement="PP4212" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="3510" y="620" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0321" bpmnElement="PP4214" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="3810" y="834" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0431" bpmnElement="PP3343" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="3660" y="834" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0356" bpmnElement="PP3346" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="3360" y="834" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0475" bpmnElement="PP4213" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="3510" y="834" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0479" bpmnElement="PP3416">
        <dc:Bounds x="10930" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0365" bpmnElement="PP4074" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="13110" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0494" bpmnElement="PP3098" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="14630" y="350" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0340" bpmnElement="PP4218" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="14796" y="350" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0448" bpmnElement="PP4217" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="14798" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0334" bpmnElement="PP3659" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="28520" y="658" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0339" bpmnElement="PP3859" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="28340" y="658" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0306" bpmnElement="PP3858" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="28340" y="530" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0484" bpmnElement="PP3658" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="28520" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0485" bpmnElement="PP4073" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="1743" y="806" width="100" height="80" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0436" bpmnElement="PP2437" isMarkerVisible="true">
        <dc:Bounds x="1945" y="545" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="1929" y="495" width="83" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0375" bpmnElement="PP2333" isMarkerVisible="true">
        <dc:Bounds x="2127" y="665" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="2048" y="670" width="83" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2399" bpmnElement="PP2398" isMarkerVisible="true">
        <dc:Bounds x="1768" y="919" width="50" height="50" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="1673" y="934" width="83" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0354" bpmnElement="PP0958">
        <dc:Bounds x="2134" y="777" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0319" bpmnElement="PP3105" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="5300" y="827" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0450" bpmnElement="PP3896">
        <dc:Bounds x="1743" y="650" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0322" bpmnElement="PP3335" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="2868" y="620" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0460" bpmnElement="PP4223" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:PP3123ground-color="#bbdefb" color:border-color="#0d4372">
        <dc:Bounds x="3000" y="620" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0311" bpmnElement="PP3480" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:PP3123ground-color="#c8e6c9" color:border-color="#205022">
        <dc:Bounds x="21500" y="530" width="100" height="80" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2899" bpmnElement="PP2898">
        <dc:Bounds x="24316" y="647" width="100" height="26" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2481" bpmnElement="PP2480">
        <dc:Bounds x="160" y="257" width="7218" height="813" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="6036" y="264" width="50" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2464" bpmnElement="PP2463" bioc:stroke="black" bioc:fill="white">
        <dc:Bounds x="7408" y="257" width="3450" height="905" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="7702" y="264" width="46" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2479" bpmnElement="PP2478">
        <dc:Bounds x="10868" y="257" width="5632" height="941" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="13411" y="290" width="66" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2485" bpmnElement="PP2484">
        <dc:Bounds x="19708" y="390" width="2192" height="720" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="20941" y="397" width="84" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2477" bpmnElement="PP2476">
        <dc:Bounds x="23378" y="390" width="3715" height="720" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="25245" y="416" width="52" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2466" bpmnElement="PP2465">
        <dc:Bounds x="1812" y="1121" width="737" height="300" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="2143" y="1128" width="83" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2471" bpmnElement="PP2470">
        <dc:Bounds x="17568" y="80" width="2130" height="1190" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="19252" y="87" width="61" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2897" bpmnElement="PP2896">
        <dc:Bounds x="24316" y="771" width="100" height="30" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2462" bpmnElement="PP2461" bioc:stroke="#000" bioc:fill="#fff">
        <dc:Bounds x="25738" y="1169" width="460" height="265" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="26066" y="1176" width="84" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2483" bpmnElement="PP2482">
        <dc:Bounds x="16518" y="257" width="1030" height="813" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="16996" y="264" width="78" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2469" bpmnElement="PP2468">
        <dc:Bounds x="27116" y="390" width="950" height="720" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="27567" y="397" width="66" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2475" bpmnElement="PP2474">
        <dc:Bounds x="28076" y="390" width="1612" height="720" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0388" bpmnElement="PP2467">
        <dc:Bounds x="17561" y="1285" width="777" height="440" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="17963" y="1292" width="89" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2473" bpmnElement="PP2472">
        <dc:Bounds x="10383" y="516" width="295" height="255" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="10561" y="527" width="89" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP2895" bpmnElement="PP2894">
        <dc:Bounds x="18628" y="737" width="100" height="53" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0482" bpmnElement="PP2900">
        <dc:Bounds x="22128" y="648" width="70" height="30" />
        <bpmndi:PP0227Label />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0378" bpmnElement="PP1131">
        <dc:Bounds x="2900" y="682" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0481" bpmnElement="PP0955">
        <dc:Bounds x="1775" y="712" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0403" bpmnElement="PP0970">
        <dc:Bounds x="10972" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0360" bpmnElement="PP1188">
        <dc:Bounds x="3392" y="896" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0313" bpmnElement="PP1118">
        <dc:Bounds x="3692" y="896" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0421" bpmnElement="PP0972">
        <dc:Bounds x="3692" y="682" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0418" bpmnElement="PP1039">
        <dc:Bounds x="3392" y="682" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0380" bpmnElement="PP1083">
        <dc:Bounds x="16012" y="770" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0452" bpmnElement="PP1053">
        <dc:Bounds x="16032" y="1092" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0429" bpmnElement="PP0981">
        <dc:Bounds x="1242" y="682" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0411" bpmnElement="PP1097">
        <dc:Bounds x="1217" y="849" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0413" bpmnElement="PP1143">
        <dc:Bounds x="15502" y="770" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0457" bpmnElement="PP0963">
        <dc:Bounds x="16150" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1220" bpmnElement="PP0930">
        <dc:Bounds x="12292" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0441" bpmnElement="PP1078">
        <dc:Bounds x="2622" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0426" bpmnElement="PP0951">
        <dc:Bounds x="4902" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0376" bpmnElement="PP0999">
        <dc:Bounds x="15192" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0314" bpmnElement="PP0973">
        <dc:Bounds x="15004" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0362" bpmnElement="PP1127">
        <dc:Bounds x="14432" y="730" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0489" bpmnElement="PP1104">
        <dc:Bounds x="14282" y="730" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1062" bpmnElement="PP1077">
        <dc:Bounds x="13852" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1106" bpmnElement="PP1102">
        <dc:Bounds x="9242" y="958" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0935" bpmnElement="PP1059">
        <dc:Bounds x="9242" y="856" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1203" bpmnElement="PP1170">
        <dc:Bounds x="9242" y="744" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0466" bpmnElement="PP1153">
        <dc:Bounds x="702" y="808" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0368" bpmnElement="PP1060">
        <dc:Bounds x="10165" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1184" bpmnElement="PP1183">
        <dc:Bounds x="21800" y="253" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0934" bpmnElement="PP0956">
        <dc:Bounds x="21770" y="722" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1187" bpmnElement="PP1082">
        <dc:Bounds x="4396" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1139" bpmnElement="PP1022">
        <dc:Bounds x="5352" y="744" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0437" bpmnElement="PP0931">
        <dc:Bounds x="702" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0487" bpmnElement="PP1005">
        <dc:Bounds x="24218" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1195" bpmnElement="PP1087">
        <dc:Bounds x="16758" y="552" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0350" bpmnElement="PP0959">
        <dc:Bounds x="26177" y="722" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0925" bpmnElement="PP0933">
        <dc:Bounds x="27300" y="724" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1021" bpmnElement="PP1103">
        <dc:Bounds x="27250" y="724" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="27198" y="763" width="69" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0966" bpmnElement="PP0965">
        <dc:Bounds x="29270" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0917" bpmnElement="PP1154">
        <dc:Bounds x="13680" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1121" bpmnElement="PP1120">
        <dc:Bounds x="10490" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0317" bpmnElement="PP1128">
        <dc:Bounds x="11108" y="730" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0492" bpmnElement="PP1006">
        <dc:Bounds x="17620" y="912" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1177" bpmnElement="PP1176">
        <dc:Bounds x="17219" y="685" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="17257" y="690" width="46" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1090" bpmnElement="PP1089">
        <dc:Bounds x="4022" y="682" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1058" bpmnElement="PP1057">
        <dc:Bounds x="2384" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1136" bpmnElement="PP1135">
        <dc:Bounds x="2134" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0952" bpmnElement="PP4319">
        <dc:Bounds x="2154" y="1213" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="2198" y="1196" width="76" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1100" bpmnElement="PP1099">
        <dc:Bounds x="13410" y="752" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1080" bpmnElement="PP1079">
        <dc:Bounds x="17060" y="809" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0962" bpmnElement="PP0961">
        <dc:Bounds x="12020" y="722" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1133" bpmnElement="PP1132">
        <dc:Bounds x="18550" y="972" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18590" y="958" width="69" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0968" bpmnElement="PP0967">
        <dc:Bounds x="11450" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1155" bpmnElement="PP1105">
        <dc:Bounds x="11540" y="758" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1028" bpmnElement="PP1027">
        <dc:Bounds x="12790" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0988" bpmnElement="PP1042">
        <dc:Bounds x="8209" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1061" bpmnElement="PP0982">
        <dc:Bounds x="9130" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0978" bpmnElement="PP1054">
        <dc:Bounds x="7632" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1137" bpmnElement="PP1198">
        <dc:Bounds x="7472" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1117" bpmnElement="PP1043">
        <dc:Bounds x="6514" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0919" bpmnElement="PP0990">
        <dc:Bounds x="6344" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0969" bpmnElement="PP1205">
        <dc:Bounds x="6164" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1033" bpmnElement="PP1123">
        <dc:Bounds x="5876" y="592" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP0976" bpmnElement="PP0975">
        <dc:Bounds x="11830" y="962" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1152" bpmnElement="PP1151">
        <dc:Bounds x="18930" y="320" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18911" y="291" width="73" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1200" bpmnElement="PP1199">
        <dc:Bounds x="18280" y="972" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18320" y="956" width="70" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1207" bpmnElement="PP1206">
        <dc:Bounds x="19140" y="972" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1189" bpmnElement="PP0920">
        <dc:Bounds x="18930" y="450" width="36" height="36" />
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1125" bpmnElement="PP1124">
        <dc:Bounds x="18840" y="972" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18878" y="963" width="60" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Shape id="PP1038" bpmnElement="PP1197">
        <dc:Bounds x="17970" y="972" width="36" height="36" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18007" y="963" width="61" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Shape>
      <bpmndi:PP0227Edge id="PP1722" bpmnElement="PP1721">
        <di:waypoint x="6412" y="570" />
        <di:waypoint x="6482" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1730" bpmnElement="PP1729">
        <di:waypoint x="5944" y="570" />
        <di:waypoint x="6024" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2124" bpmnElement="PP2123">
        <di:waypoint x="6235" y="570" />
        <di:waypoint x="6312" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1475" bpmnElement="PP1474">
        <di:waypoint x="6582" y="570" />
        <di:waypoint x="6640" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2025" bpmnElement="PP2024">
        <di:waypoint x="8115" y="570" />
        <di:waypoint x="8177" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="8120" y="548" width="20" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1849" bpmnElement="PP1848">
        <di:waypoint x="9023" y="570" />
        <di:waypoint x="9092" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1966" bpmnElement="PP1965">
        <di:waypoint x="8397" y="570" />
        <di:waypoint x="8468" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1720" bpmnElement="PP1719">
        <di:waypoint x="7701" y="570" />
        <di:waypoint x="7805" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1916" bpmnElement="PP1915">
        <di:waypoint x="19888" y="570" />
        <di:waypoint x="19958" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1388" bpmnElement="PP1387">
        <di:waypoint x="20058" y="570" />
        <di:waypoint x="20130" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1947" bpmnElement="PP1946">
        <di:waypoint x="24923" y="570" />
        <di:waypoint x="24968" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1591" bpmnElement="PP1590">
        <di:waypoint x="25068" y="570" />
        <di:waypoint x="25121" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2210" bpmnElement="PP2209">
        <di:waypoint x="25308" y="570" />
        <di:waypoint x="25351" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1420" bpmnElement="PP1419">
        <di:waypoint x="23988" y="595" />
        <di:waypoint x="23988" y="900" />
        <di:waypoint x="24546" y="900" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1268" bpmnElement="PP1267">
        <di:waypoint x="24646" y="900" />
        <di:waypoint x="24898" y="900" />
        <di:waypoint x="24898" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2221" bpmnElement="PP2220">
        <di:waypoint x="20483" y="708" />
        <di:waypoint x="20612" y="708" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1545" bpmnElement="PP1544">
        <di:waypoint x="27048" y="570" />
        <di:waypoint x="27271" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2090" bpmnElement="PP2089">
        <di:waypoint x="17638" y="595" />
        <di:waypoint x="17638" y="755" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="17651" y="665" width="18" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1892" bpmnElement="PP1891">
        <di:waypoint x="17638" y="545" />
        <di:waypoint x="17638" y="350" />
        <di:waypoint x="17988" y="352" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="17649" y="450" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1997" bpmnElement="PP1996">
        <di:waypoint x="17638" y="805" />
        <di:waypoint x="17638" y="850" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1798" bpmnElement="PP1797">
        <di:waypoint x="17663" y="780" />
        <di:waypoint x="17708" y="780" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2228" bpmnElement="PP2227">
        <di:waypoint x="17808" y="780" />
        <di:waypoint x="17858" y="780" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1922" bpmnElement="PP1921">
        <di:waypoint x="17608" y="930" />
        <di:waypoint x="17608" y="976" />
        <di:waypoint x="17638" y="976" />
        <di:waypoint x="17638" y="1022" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1900" bpmnElement="PP1899">
        <di:waypoint x="17988" y="1008" />
        <di:waypoint x="17988" y="1040" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2186" bpmnElement="PP2185">
        <di:waypoint x="19458" y="245" />
        <di:waypoint x="19458" y="210" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1625" bpmnElement="PP1624">
        <di:waypoint x="18948" y="270" />
        <di:waypoint x="19433" y="270" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1906" bpmnElement="PP1905">
        <di:waypoint x="19483" y="270" />
        <di:waypoint x="19578" y="270" />
        <di:waypoint x="19578" y="545" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1816" bpmnElement="PP1815">
        <di:waypoint x="19508" y="170" />
        <di:waypoint x="19560" y="170" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2139" bpmnElement="PP2138">
        <di:waypoint x="18858" y="1008" />
        <di:waypoint x="18858" y="1040" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1646" bpmnElement="PP1645">
        <di:waypoint x="19328" y="825" />
        <di:waypoint x="19438" y="825" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1508" bpmnElement="PP1507">
        <di:waypoint x="19603" y="570" />
        <di:waypoint x="19788" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1360" bpmnElement="PP1359">
        <di:waypoint x="18858" y="1120" />
        <di:waypoint x="18858" y="1162" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1539" bpmnElement="PP1538">
        <di:waypoint x="17988" y="1120" />
        <di:waypoint x="17988" y="1162" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2110" bpmnElement="PP2109">
        <di:waypoint x="18966" y="468" />
        <di:waypoint x="19130" y="468" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1700" bpmnElement="PP1699">
        <di:waypoint x="19158" y="1008" />
        <di:waypoint x="19158" y="1162" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1575" bpmnElement="PP1574">
        <di:waypoint x="19538" y="825" />
        <di:waypoint x="19578" y="825" />
        <di:waypoint x="19578" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2009" bpmnElement="PP2008">
        <di:waypoint x="25171" y="570" />
        <di:waypoint x="25208" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2066" bpmnElement="PP2065">
        <di:waypoint x="25146" y="595" />
        <di:waypoint x="25146" y="690" />
        <di:waypoint x="25240" y="690" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1826" bpmnElement="PP1825">
        <di:waypoint x="25276" y="690" />
        <di:waypoint x="25376" y="690" />
        <di:waypoint x="25376" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1299" bpmnElement="PP1298">
        <di:waypoint x="18298" y="1008" />
        <di:waypoint x="18298" y="1040" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1726" bpmnElement="PP1725">
        <di:waypoint x="18298" y="1120" />
        <di:waypoint x="18298" y="1162" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1303" bpmnElement="PP1302">
        <di:waypoint x="18966" y="338" />
        <di:waypoint x="18998" y="338" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1435" bpmnElement="PP1434">
        <di:waypoint x="19098" y="338" />
        <di:waypoint x="19130" y="338" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1702" bpmnElement="PP1701">
        <di:waypoint x="24013" y="570" />
        <di:waypoint x="24048" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1305" bpmnElement="PP1304">
        <di:waypoint x="24811" y="570" />
        <di:waypoint x="24873" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2188" bpmnElement="PP2187">
        <di:waypoint x="24646" y="708" />
        <di:waypoint x="24786" y="708" />
        <di:waypoint x="24786" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2052" bpmnElement="PP2051">
        <di:waypoint x="24261" y="708" />
        <di:waypoint x="24328" y="708" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1807" bpmnElement="PP1806">
        <di:waypoint x="24236" y="733" />
        <di:waypoint x="24236" y="814" />
        <di:waypoint x="24328" y="814" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1960" bpmnElement="PP1959">
        <di:waypoint x="24364" y="814" />
        <di:waypoint x="24428" y="814" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2013" bpmnElement="PP2012">
        <di:waypoint x="24464" y="814" />
        <di:waypoint x="24488" y="814" />
        <di:waypoint x="24488" y="708" />
        <di:waypoint x="24546" y="708" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1512" bpmnElement="PP1511">
        <di:waypoint x="24364" y="708" />
        <di:waypoint x="24546" y="708" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1506" bpmnElement="PP1505">
        <di:waypoint x="25816" y="1304" />
        <di:waypoint x="25936" y="1304" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2056" bpmnElement="PP2055">
        <di:waypoint x="26036" y="1304" />
        <di:waypoint x="26130" y="1304" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1832" bpmnElement="PP1831">
        <di:waypoint x="11708" y="570" />
        <di:waypoint x="11773" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1682" bpmnElement="PP1681">
        <di:waypoint x="11823" y="570" />
        <di:waypoint x="11963" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="11837" y="548" width="47" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1473" bpmnElement="PP1472">
        <di:waypoint x="6172" y="530" />
        <di:waypoint x="6172" y="490" />
        <di:waypoint x="5920" y="490" />
        <di:waypoint x="5920" y="530" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="6022" y="473" width="28" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1514" bpmnElement="PP1513">
        <di:waypoint x="6342" y="530" />
        <di:waypoint x="6342" y="490" />
        <di:waypoint x="6202" y="490" />
        <di:waypoint x="6202" y="530" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="6258" y="472" width="28" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1397" bpmnElement="PP1396">
        <di:waypoint x="6512" y="530" />
        <di:waypoint x="6512" y="490" />
        <di:waypoint x="6382" y="490" />
        <di:waypoint x="6382" y="530" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="6433" y="472" width="28" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2208" bpmnElement="PP2207">
        <di:waypoint x="5894" y="628" />
        <di:waypoint x="5894" y="690" />
        <di:waypoint x="5966" y="690" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1734" bpmnElement="PP1733">
        <di:waypoint x="6182" y="628" />
        <di:waypoint x="6182" y="690" />
        <di:waypoint x="6254" y="690" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1430" bpmnElement="PP1429">
        <di:waypoint x="6362" y="628" />
        <di:waypoint x="6362" y="690" />
        <di:waypoint x="6434" y="690" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2043" bpmnElement="PP2042">
        <di:waypoint x="6532" y="628" />
        <di:waypoint x="6532" y="690" />
        <di:waypoint x="6604" y="690" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1543" bpmnElement="PP1542">
        <di:waypoint x="7618" y="530" />
        <di:waypoint x="7618" y="490" />
        <di:waypoint x="7510" y="490" />
        <di:waypoint x="7510" y="530" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="7554" y="475" width="28" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2128" bpmnElement="PP2127">
        <di:waypoint x="8277" y="570" />
        <di:waypoint x="8347" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2112" bpmnElement="PP2111">
        <di:waypoint x="8090" y="595" />
        <di:waypoint x="8090" y="690" />
        <di:waypoint x="8372" y="690" />
        <di:waypoint x="8372" y="595" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="8222" y="672" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1668" bpmnElement="PP1667">
        <di:waypoint x="7470" y="530" />
        <di:waypoint x="7470" y="490" />
        <di:waypoint x="6552" y="490" />
        <di:waypoint x="6552" y="530" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="6945" y="472" width="28" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1469" bpmnElement="PP1468">
        <di:waypoint x="7490" y="628" />
        <di:waypoint x="7490" y="690" />
        <di:waypoint x="7562" y="690" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1736" bpmnElement="PP1735">
        <di:waypoint x="8227" y="530" />
        <di:waypoint x="8227" y="490" />
        <di:waypoint x="7688" y="490" />
        <di:waypoint x="7688" y="530" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1775" bpmnElement="PP1774">
        <di:waypoint x="7650" y="628" />
        <di:waypoint x="7650" y="690" />
        <di:waypoint x="7720" y="690" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1441" bpmnElement="PP1440">
        <di:waypoint x="9118" y="530" />
        <di:waypoint x="9118" y="470" />
        <di:waypoint x="7651" y="470" />
        <di:waypoint x="7651" y="530" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="7808" y="452" width="28" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1828" bpmnElement="PP1827">
        <di:waypoint x="9148" y="628" />
        <di:waypoint x="9148" y="640" />
        <di:waypoint x="9190" y="640" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1761" bpmnElement="PP1760">
        <di:waypoint x="8227" y="628" />
        <di:waypoint x="8227" y="660" />
        <di:waypoint x="8259" y="660" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2195" bpmnElement="PP2194">
        <di:waypoint x="11518" y="570" />
        <di:waypoint x="11608" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1842" bpmnElement="PP1841">
        <di:waypoint x="20458" y="733" />
        <di:waypoint x="20458" y="846" />
        <di:waypoint x="20612" y="846" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2045" bpmnElement="PP2044">
        <di:waypoint x="20648" y="846" />
        <di:waypoint x="20748" y="846" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2133" bpmnElement="PP2132">
        <di:waypoint x="20648" y="708" />
        <di:waypoint x="20773" y="708" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1571" bpmnElement="PP1570">
        <di:waypoint x="12858" y="570" />
        <di:waypoint x="12963" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1333" bpmnElement="PP1332">
        <di:waypoint x="12808" y="628" />
        <di:waypoint x="12808" y="643" />
        <di:waypoint x="12844" y="643" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1522" bpmnElement="PP1521">
        <di:waypoint x="11488" y="530" />
        <di:waypoint x="11488" y="490" />
        <di:waypoint x="11448" y="490" />
        <di:waypoint x="11448" y="530" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1755" bpmnElement="PP1754">
        <di:waypoint x="11438" y="610" />
        <di:waypoint x="11438" y="736" />
        <di:waypoint x="11508" y="736" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2107" bpmnElement="PP2106">
        <di:waypoint x="11528" y="776" />
        <di:waypoint x="11528" y="870" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2092" bpmnElement="PP2091">
        <di:waypoint x="11558" y="794" />
        <di:waypoint x="11558" y="870" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1796" bpmnElement="PP1795">
        <di:waypoint x="11558" y="950" />
        <di:waypoint x="11558" y="1002" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1432" bpmnElement="PP1431">
        <di:waypoint x="11468" y="628" />
        <di:waypoint x="11468" y="644" />
        <di:waypoint x="11537" y="644" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2096" bpmnElement="PP2095">
        <di:waypoint x="20798" y="949" />
        <di:waypoint x="20798" y="886" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2176" bpmnElement="PP2175">
        <di:waypoint x="20848" y="846" />
        <di:waypoint x="20953" y="846" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1382" bpmnElement="PP1381">
        <di:waypoint x="20978" y="821" />
        <di:waypoint x="20978" y="733" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="20994" y="798" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2235" bpmnElement="PP2234">
        <di:waypoint x="20953" y="708" />
        <di:waypoint x="20823" y="708" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="20936" y="691" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1941" bpmnElement="PP1940">
        <di:waypoint x="21003" y="708" />
        <di:waypoint x="21100" y="708" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="21006" y="691" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2018" bpmnElement="PP2017">
        <di:waypoint x="21328" y="709" />
        <di:waypoint x="21406" y="709" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1559" bpmnElement="PP1558">
        <di:waypoint x="20978" y="871" />
        <di:waypoint x="20978" y="967" />
        <di:waypoint x="20816" y="967" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="20987" y="872" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1376" bpmnElement="PP1375">
        <di:waypoint x="21003" y="846" />
        <di:waypoint x="21100" y="846" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="21026" y="794" width="63" height="40" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2131" bpmnElement="PP2130">
        <di:waypoint x="21136" y="846" />
        <di:waypoint x="21278" y="846" />
        <di:waypoint x="21278" y="749" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1751" bpmnElement="PP1750">
        <di:waypoint x="21136" y="708" />
        <di:waypoint x="21228" y="708" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2005" bpmnElement="PP2004">
        <di:waypoint x="18568" y="1008" />
        <di:waypoint x="18568" y="1040" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1510" bpmnElement="PP1509">
        <di:waypoint x="18568" y="1120" />
        <di:waypoint x="18568" y="1162" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2199" bpmnElement="PP2198">
        <di:waypoint x="12013" y="570" />
        <di:waypoint x="12153" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1611" bpmnElement="PP1610">
        <di:waypoint x="11988" y="696" />
        <di:waypoint x="11988" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1781" bpmnElement="PP1780">
        <di:waypoint x="12056" y="740" />
        <di:waypoint x="12120" y="740" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1403" bpmnElement="PP1402">
        <di:waypoint x="11798" y="761" />
        <di:waypoint x="11798" y="912" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="11745" y="833" width="50" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2225" bpmnElement="PP2224">
        <di:waypoint x="12038" y="952" />
        <di:waypoint x="12120" y="952" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2233" bpmnElement="PP2232">
        <di:waypoint x="11848" y="940" />
        <di:waypoint x="11938" y="940" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1809" bpmnElement="PP1808">
        <di:waypoint x="11866" y="980" />
        <di:waypoint x="11938" y="980" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1918" bpmnElement="PP1917">
        <di:waypoint x="11798" y="595" />
        <di:waypoint x="11798" y="711" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1822" bpmnElement="PP1821">
        <di:waypoint x="11823" y="736" />
        <di:waypoint x="11938" y="736" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="11864" y="718" width="37" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1453" bpmnElement="PP1452">
        <di:waypoint x="6060" y="570" />
        <di:waypoint x="6135" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1500" bpmnElement="PP1499">
        <di:waypoint x="17053" y="570" />
        <di:waypoint x="17137" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="17083" y="552" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1805" bpmnElement="PP1804">
        <di:waypoint x="17237" y="570" />
        <di:waypoint x="17323" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2122" bpmnElement="PP2121">
        <di:waypoint x="13343" y="570" />
        <di:waypoint x="13493" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="13402" y="552" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1553" bpmnElement="PP1552">
        <di:waypoint x="13318" y="595" />
        <di:waypoint x="13318" y="730" />
        <di:waypoint x="13378" y="730" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="13334" y="709" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1740" bpmnElement="PP1739">
        <di:waypoint x="13478" y="730" />
        <di:waypoint x="13518" y="730" />
        <di:waypoint x="13518" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2166" bpmnElement="PP2165">
        <di:waypoint x="13428" y="788" />
        <di:waypoint x="13428" y="829" />
        <di:waypoint x="13450" y="829" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2206" bpmnElement="PP2205">
        <di:waypoint x="27321" y="570" />
        <di:waypoint x="27566" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="27437" y="548" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1943" bpmnElement="PP1942">
        <di:waypoint x="27296" y="595" />
        <di:waypoint x="27296" y="662" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="27311" y="626" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1672" bpmnElement="PP1671">
        <di:waypoint x="27346" y="702" />
        <di:waypoint x="27431" y="702" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1447" bpmnElement="PP1446">
        <di:waypoint x="27481" y="702" />
        <di:waypoint x="27566" y="702" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="27523" y="684" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2058" bpmnElement="PP2057">
        <di:waypoint x="28028" y="570" />
        <di:waypoint x="28115" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1920" bpmnElement="PP1919">
        <di:waypoint x="12788" y="530" />
        <di:waypoint x="12788" y="490" />
        <di:waypoint x="11508" y="490" />
        <di:waypoint x="11508" y="530" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="12032" y="472" width="28" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1537" bpmnElement="PP1536">
        <di:waypoint x="2372" y="1271" />
        <di:waypoint x="2461" y="1271" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1395" bpmnElement="PP1394">
        <di:waypoint x="2192" y="1271" />
        <di:waypoint x="2272" y="1271" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1853" bpmnElement="PP1852">
        <di:waypoint x="248" y="570" />
        <di:waypoint x="382" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2145" bpmnElement="PP2144">
        <di:waypoint x="2202" y="570" />
        <di:waypoint x="2352" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1962" bpmnElement="PP1961">
        <di:waypoint x="2152" y="628" />
        <di:waypoint x="2152" y="665" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1763" bpmnElement="PP1762">
        <di:waypoint x="4008" y="700" />
        <di:waypoint x="4008" y="980" />
        <di:waypoint x="2440" y="980" />
        <di:waypoint x="2440" y="610" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1331" bpmnElement="PP1330">
        <di:waypoint x="2900" y="814" />
        <di:waypoint x="2440" y="814" />
        <di:waypoint x="2440" y="610" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1830" bpmnElement="PP1829">
        <di:waypoint x="4090" y="660" />
        <di:waypoint x="4142" y="660" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1307" bpmnElement="PP1306">
        <di:waypoint x="3195" y="660" />
        <di:waypoint x="3250" y="660" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="3212" y="644" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1264" bpmnElement="PP1263">
        <di:waypoint x="4040" y="718" />
        <di:waypoint x="4040" y="796" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1437" bpmnElement="PP1436">
        <di:waypoint x="2402" y="628" />
        <di:waypoint x="2402" y="672" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1293" bpmnElement="PP1292">
        <di:waypoint x="5894" y="530" />
        <di:waypoint x="5894" y="440" />
        <di:waypoint x="2402" y="440" />
        <di:waypoint x="2402" y="530" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="4135" y="422" width="29" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1606" bpmnElement="PP1605">
        <di:waypoint x="7540" y="570" />
        <di:waypoint x="7601" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2152" bpmnElement="PP2151">
        <di:waypoint x="26511" y="570" />
        <di:waypoint x="26616" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="26533" y="552" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1356" bpmnElement="PP1355">
        <di:waypoint x="26716" y="570" />
        <di:waypoint x="26821" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2105" bpmnElement="PP2104">
        <di:waypoint x="26656" y="702" />
        <di:waypoint x="26696" y="702" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2174" bpmnElement="PP2173">
        <di:waypoint x="26871" y="570" />
        <di:waypoint x="26948" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0249" bpmnElement="PP2215">
        <di:waypoint x="16756" y="530" />
        <di:waypoint x="16756" y="490" />
        <di:waypoint x="16696" y="490" />
        <di:waypoint x="16696" y="530" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1708" bpmnElement="PP1707">
        <di:waypoint x="16613" y="570" />
        <di:waypoint x="16676" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="16634" y="552" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1529" bpmnElement="PP1528">
        <di:waypoint x="16794" y="570" />
        <di:waypoint x="16863" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1422" bpmnElement="PP1421">
        <di:waypoint x="16913" y="570" />
        <di:waypoint x="17003" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2201" bpmnElement="PP2200">
        <di:waypoint x="17028" y="595" />
        <di:waypoint x="17028" y="665" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="17033" y="620" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1352" bpmnElement="PP1351">
        <di:waypoint x="17053" y="690" />
        <di:waypoint x="17137" y="690" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="17084" y="672" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1493" bpmnElement="PP1492">
        <di:waypoint x="17237" y="670" />
        <di:waypoint x="17348" y="670" />
        <di:waypoint x="17348" y="595" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="17270" y="641" width="47" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1954" bpmnElement="PP1953">
        <di:waypoint x="17028" y="715" />
        <di:waypoint x="17028" y="787" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="17033" y="741" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1467" bpmnElement="PP1466">
        <di:waypoint x="17078" y="800" />
        <di:waypoint x="17137" y="800" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1439" bpmnElement="PP1438">
        <di:waypoint x="17096" y="827" />
        <di:waypoint x="17137" y="827" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1471" bpmnElement="PP1470">
        <di:waypoint x="17237" y="827" />
        <di:waypoint x="17298" y="827" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1490" bpmnElement="PP1489">
        <di:waypoint x="17255" y="703" />
        <di:waypoint x="17348" y="703" />
        <di:waypoint x="17348" y="787" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="17280" y="708" width="50" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1956" bpmnElement="PP1955">
        <di:waypoint x="17398" y="827" />
        <di:waypoint x="17480" y="827" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1838" bpmnElement="PP1837">
        <di:waypoint x="16588" y="595" />
        <di:waypoint x="16588" y="690" />
        <di:waypoint x="16888" y="690" />
        <di:waypoint x="16888" y="595" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="16718" y="577" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2214" bpmnElement="PP2213">
        <di:waypoint x="2172" y="1213" />
        <di:waypoint x="2172" y="1193" />
        <di:waypoint x="2302" y="1193" />
        <di:waypoint x="2302" y="1231" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2212" bpmnElement="PP2211">
        <di:waypoint x="17646" y="1430" />
        <di:waypoint x="17713" y="1430" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0282" bpmnElement="PP1694">
        <di:waypoint x="17938" y="1430" />
        <di:waypoint x="18023" y="1430" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0248" bpmnElement="PP1690">
        <di:waypoint x="18073" y="1430" />
        <di:waypoint x="18250" y="1430" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0257" bpmnElement="PP1444">
        <di:waypoint x="18048" y="1455" />
        <di:waypoint x="18048" y="1530" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="18066" y="1491" width="57" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1924" bpmnElement="PP1923">
        <di:waypoint x="18098" y="1570" />
        <di:waypoint x="18250" y="1570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1932" bpmnElement="PP1931">
        <di:waypoint x="17763" y="1430" />
        <di:waypoint x="17838" y="1430" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2064" bpmnElement="PP2063">
        <di:waypoint x="17738" y="1455" />
        <di:waypoint x="17738" y="1650" />
        <di:waypoint x="18250" y="1650" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1914" bpmnElement="PP1913">
        <di:waypoint x="17638" y="948" />
        <di:waypoint x="17638" y="1022" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1335" bpmnElement="PP1334">
        <di:waypoint x="11155" y="570" />
        <di:waypoint x="11235" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1463" bpmnElement="PP1462">
        <di:waypoint x="11130" y="595" />
        <di:waypoint x="11130" y="668" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1910" bpmnElement="PP1909">
        <di:waypoint x="11260" y="683" />
        <di:waypoint x="11260" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1648" bpmnElement="PP1647">
        <di:waypoint x="11180" y="708" />
        <di:waypoint x="11235" y="708" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1327" bpmnElement="PP1326">
        <di:waypoint x="11260" y="733" />
        <di:waypoint x="11260" y="874" />
        <di:waypoint x="11144" y="874" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1689" bpmnElement="PP1688">
        <di:waypoint x="11126" y="766" />
        <di:waypoint x="11126" y="856" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2135" bpmnElement="PP2134">
        <di:waypoint x="13013" y="570" />
        <di:waypoint x="13110" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2182" bpmnElement="PP2181">
        <di:waypoint x="12178" y="595" />
        <di:waypoint x="12178" y="762" />
        <di:waypoint x="12360" y="762" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2016" bpmnElement="PP2015">
        <di:waypoint x="12396" y="762" />
        <di:waypoint x="12988" y="762" />
        <di:waypoint x="12988" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1281" bpmnElement="PP1280">
        <di:waypoint x="17373" y="570" />
        <di:waypoint x="17613" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1362" bpmnElement="PP1361">
        <di:waypoint x="10528" y="570" />
        <di:waypoint x="10723" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1779" bpmnElement="PP1778">
        <di:waypoint x="13698" y="628" />
        <di:waypoint x="13698" y="690" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1818" bpmnElement="PP1817">
        <di:waypoint x="13660" y="770" />
        <di:waypoint x="13660" y="822" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1836" bpmnElement="PP1835">
        <di:waypoint x="13543" y="570" />
        <di:waypoint x="13648" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1561" bpmnElement="PP1560">
        <di:waypoint x="13678" y="530" />
        <di:waypoint x="13678" y="490" />
        <di:waypoint x="12828" y="490" />
        <di:waypoint x="12828" y="530" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="13239" y="472" width="28" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2070" bpmnElement="PP2069">
        <di:waypoint x="3170" y="685" />
        <di:waypoint x="3170" y="814" />
        <di:waypoint x="2936" y="814" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="3175" y="757" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1531" bpmnElement="PP1530">
        <di:waypoint x="28710" y="570" />
        <di:waypoint x="28797" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0277" bpmnElement="PP2039">
        <di:waypoint x="29119" y="570" />
        <di:waypoint x="29238" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2197" bpmnElement="PP2196">
        <di:waypoint x="29208" y="647" />
        <di:waypoint x="29208" y="600" />
        <di:waypoint x="29238" y="600" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0262" bpmnElement="PP1491">
        <di:waypoint x="29338" y="570" />
        <di:waypoint x="29439" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0263" bpmnElement="PP1385">
        <di:waypoint x="29539" y="570" />
        <di:waypoint x="29600" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0253" bpmnElement="PP2226">
        <di:waypoint x="28822" y="805" />
        <di:waypoint x="28822" y="915" />
        <di:waypoint x="28908" y="915" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0258" bpmnElement="PP1847">
        <di:waypoint x="29008" y="915" />
        <di:waypoint x="29094" y="915" />
        <di:waypoint x="29094" y="805" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0242" bpmnElement="PP1416" bioc:stroke="#000" bioc:fill="#fff">
        <di:waypoint x="28847" y="570" />
        <di:waypoint x="29069" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="28922" y="552" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0266" bpmnElement="PP1291">
        <di:waypoint x="29094" y="755" />
        <di:waypoint x="29094" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0273" bpmnElement="PP2202">
        <di:waypoint x="28822" y="703" />
        <di:waypoint x="28822" y="755" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0283" bpmnElement="PP1390">
        <di:waypoint x="28847" y="780" />
        <di:waypoint x="28908" y="780" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0298" bpmnElement="PP1609">
        <di:waypoint x="29008" y="780" />
        <di:waypoint x="29069" y="780" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0303" bpmnElement="PP1862" bioc:stroke="#000" bioc:fill="#fff">
        <di:waypoint x="28822" y="595" />
        <di:waypoint x="28822" y="667" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="28840" y="608" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0304" bpmnElement="PP1343" bioc:stroke="#000" bioc:fill="#fff">
        <di:waypoint x="28252" y="595" />
        <di:waypoint x="28252" y="698" />
        <di:waypoint x="28340" y="698" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="28274" y="683" width="12" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1888" bpmnElement="PP1887">
        <di:waypoint x="29288" y="628" />
        <di:waypoint x="29288" y="665" />
        <di:waypoint x="29226" y="665" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1855" bpmnElement="PP1854">
        <di:waypoint x="27858" y="570" />
        <di:waypoint x="27928" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1288" bpmnElement="PP1287">
        <di:waypoint x="27666" y="570" />
        <di:waypoint x="27758" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1366" bpmnElement="PP1365">
        <di:waypoint x="27456" y="677" />
        <di:waypoint x="27456" y="590" />
        <di:waypoint x="27566" y="590" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="27461" y="631" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2158" bpmnElement="PP2157">
        <di:waypoint x="27616" y="662" />
        <di:waypoint x="27616" y="610" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1783" bpmnElement="PP1782">
        <di:waypoint x="27268" y="760" />
        <di:waypoint x="27268" y="800" />
        <di:waypoint x="27138" y="800" />
        <di:waypoint x="27138" y="702" />
        <di:waypoint x="27246" y="702" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1426" bpmnElement="PP1425">
        <di:waypoint x="27318" y="760" />
        <di:waypoint x="27318" y="800" />
        <di:waypoint x="27456" y="800" />
        <di:waypoint x="27456" y="727" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="27329" y="763" width="57" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0289" bpmnElement="PP1367">
        <di:waypoint x="26071" y="700" />
        <di:waypoint x="26145" y="700" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0299" bpmnElement="PP2031">
        <di:waypoint x="26245" y="700" />
        <di:waypoint x="26386" y="700" />
        <di:waypoint x="26386" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0287" bpmnElement="PP1657" bioc:stroke="#000" bioc:fill="#fff">
        <di:waypoint x="25513" y="570" />
        <di:waypoint x="26361" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="25557" y="552" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0300" bpmnElement="PP1794">
        <di:waypoint x="25488" y="595" />
        <di:waypoint x="25488" y="700" />
        <di:waypoint x="25563" y="700" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="25506" y="610" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1541" bpmnElement="PP1540">
        <di:waypoint x="26220" y="822" />
        <di:waypoint x="26386" y="822" />
        <di:waypoint x="26386" y="595" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="26259" y="833" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1399" bpmnElement="PP1398">
        <di:waypoint x="25581" y="930" />
        <di:waypoint x="25581" y="718" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0243" bpmnElement="PP2038">
        <di:waypoint x="25599" y="700" />
        <di:waypoint x="25673" y="700" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0288" bpmnElement="PP1448">
        <di:waypoint x="25773" y="700" />
        <di:waypoint x="25847" y="700" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0260" bpmnElement="PP1803" bioc:stroke="#000" bioc:fill="#fff">
        <di:waypoint x="25897" y="700" />
        <di:waypoint x="25971" y="700" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="25918" y="680" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0264" bpmnElement="PP1451" bioc:stroke="#000" bioc:fill="#fff">
        <di:waypoint x="25872" y="725" />
        <di:waypoint x="25872" y="804" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="25890" y="740" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1674" bpmnElement="PP1673">
        <di:waypoint x="26195" y="758" />
        <di:waypoint x="26195" y="797" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1579" bpmnElement="PP1578">
        <di:waypoint x="26195" y="847" />
        <di:waypoint x="26195" y="923" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="26200" y="863" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1301" bpmnElement="PP1300">
        <di:waypoint x="26170" y="948" />
        <di:waypoint x="25599" y="948" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="26120" y="955" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1338" bpmnElement="PP1337">
        <di:waypoint x="26220" y="948" />
        <di:waypoint x="26336" y="948" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="26259" y="955" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2164" bpmnElement="PP2163">
        <di:waypoint x="26411" y="908" />
        <di:waypoint x="26411" y="883" />
        <di:waypoint x="26361" y="883" />
        <di:waypoint x="26361" y="908" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2190" bpmnElement="PP2189">
        <di:waypoint x="26411" y="570" />
        <di:waypoint x="26461" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1629" bpmnElement="PP1628">
        <di:waypoint x="25401" y="570" />
        <di:waypoint x="25463" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1405" bpmnElement="PP1404">
        <di:waypoint x="2380" y="530" />
        <di:waypoint x="2380" y="490" />
        <di:waypoint x="2150" y="490" />
        <di:waypoint x="2150" y="530" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="2251" y="472" width="29" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2126" bpmnElement="PP2125">
        <di:waypoint x="24148" y="570" />
        <di:waypoint x="24186" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1455" bpmnElement="PP1454">
        <di:waypoint x="24286" y="570" />
        <di:waypoint x="24761" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2160" bpmnElement="PP2159">
        <di:waypoint x="24236" y="628" />
        <di:waypoint x="24236" y="683" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1995" bpmnElement="PP1994">
        <di:waypoint x="770" y="570" />
        <di:waypoint x="860" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1325" bpmnElement="PP1324">
        <di:waypoint x="720" y="628" />
        <di:waypoint x="720" y="680" />
        <di:waypoint x="910" y="680" />
        <di:waypoint x="910" y="610" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1749" bpmnElement="PP1748">
        <di:waypoint x="482" y="570" />
        <di:waypoint x="545" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2060" bpmnElement="PP2059">
        <di:waypoint x="2943" y="570" />
        <di:waypoint x="4215" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1520" bpmnElement="PP1519">
        <di:waypoint x="2918" y="595" />
        <di:waypoint x="2918" y="620" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1642" bpmnElement="PP1641">
        <di:waypoint x="5350" y="595" />
        <di:waypoint x="5350" y="682" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="5359" y="633" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1851" bpmnElement="PP1850">
        <di:waypoint x="5375" y="570" />
        <di:waypoint x="5540" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1800" bpmnElement="PP1799">
        <di:waypoint x="5330" y="762" />
        <di:waypoint x="5330" y="827" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1661" bpmnElement="PP1660">
        <di:waypoint x="5370" y="780" />
        <di:waypoint x="5370" y="827" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1678" bpmnElement="PP1677">
        <di:waypoint x="4160" y="642" />
        <di:waypoint x="4160" y="570" />
        <di:waypoint x="4215" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1787" bpmnElement="PP1786">
        <di:waypoint x="8568" y="570" />
        <di:waypoint x="8615" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1744" bpmnElement="PP1743">
        <di:waypoint x="8827" y="570" />
        <di:waypoint x="8883" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2116" bpmnElement="PP2115">
        <di:waypoint x="8919" y="570" />
        <di:waypoint x="8973" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1266" bpmnElement="PP1265">
        <di:waypoint x="4414" y="628" />
        <di:waypoint x="4414" y="637" />
        <di:waypoint x="4480" y="637" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1759" bpmnElement="PP1758">
        <di:waypoint x="5880" y="530" />
        <di:waypoint x="5880" y="470" />
        <di:waypoint x="4440" y="470" />
        <di:waypoint x="4440" y="530" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="5146" y="452" width="29" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1666" bpmnElement="PP1665">
        <di:waypoint x="4390" y="530" />
        <di:waypoint x="4390" y="490" />
        <di:waypoint x="2430" y="490" />
        <di:waypoint x="2430" y="530" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="3396" y="472" width="29" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1297" bpmnElement="PP1296">
        <di:waypoint x="21768" y="595" />
        <di:waypoint x="21768" y="660" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2137" bpmnElement="PP2136">
        <di:waypoint x="21738" y="740" />
        <di:waypoint x="21738" y="792" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1773" bpmnElement="PP1772">
        <di:waypoint x="21788" y="758" />
        <di:waypoint x="21788" y="792" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2148" bpmnElement="PP2147">
        <di:waypoint x="21788" y="828" />
        <di:waypoint x="21788" y="878" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1411" bpmnElement="PP1410">
        <di:waypoint x="21738" y="828" />
        <di:waypoint x="21738" y="878" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2100" bpmnElement="PP2099">
        <di:waypoint x="21768" y="958" />
        <di:waypoint x="21768" y="1002" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1551" bpmnElement="PP1550">
        <di:waypoint x="21793" y="570" />
        <di:waypoint x="21918" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2088" bpmnElement="PP2087">
        <di:waypoint x="21768" y="545" />
        <di:waypoint x="21768" y="291" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2082" bpmnElement="PP2081">
        <di:waypoint x="21818" y="221" />
        <di:waypoint x="21818" y="181" />
        <di:waypoint x="22132" y="181" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2084" bpmnElement="PP2083">
        <di:waypoint x="22530" y="251" />
        <di:waypoint x="23480" y="251" />
        <di:waypoint x="23480" y="545" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2078" bpmnElement="PP2077">
        <di:waypoint x="21818" y="289" />
        <di:waypoint x="21818" y="321" />
        <di:waypoint x="22132" y="321" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2086" bpmnElement="PP2085">
        <di:waypoint x="22168" y="181" />
        <di:waypoint x="22250" y="181" />
        <di:waypoint x="22250" y="211" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2080" bpmnElement="PP2079">
        <di:waypoint x="22168" y="321" />
        <di:waypoint x="22250" y="321" />
        <di:waypoint x="22250" y="291" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1256monta_body_para_formaliza_di" bpmnElement="PP1256monta_body_para_formaliza">
        <di:waypoint x="22300" y="251" />
        <di:waypoint x="22430" y="251" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1926" bpmnElement="PP1925">
        <di:waypoint x="10183" y="628" />
        <di:waypoint x="10183" y="648" />
        <di:waypoint x="10230" y="648" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1527" bpmnElement="PP1526">
        <di:waypoint x="10177" y="530" />
        <di:waypoint x="10177" y="500" />
        <di:waypoint x="9168" y="500" />
        <di:waypoint x="9168" y="530" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="9659" y="482" width="28" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1861" bpmnElement="PP1860">
        <di:waypoint x="20166" y="570" />
        <di:waypoint x="20258" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2223" bpmnElement="PP2222">
        <di:waypoint x="20358" y="570" />
        <di:waypoint x="20433" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1982" bpmnElement="PP1981">
        <di:waypoint x="20483" y="570" />
        <di:waypoint x="20580" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1777" bpmnElement="PP1776">
        <di:waypoint x="20458" y="595" />
        <di:waypoint x="20458" y="683" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1623" bpmnElement="PP1622">
        <di:waypoint x="20680" y="570" />
        <di:waypoint x="20773" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2041" bpmnElement="PP2040">
        <di:waypoint x="20798" y="683" />
        <di:waypoint x="20798" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1295" bpmnElement="PP1294">
        <di:waypoint x="20823" y="570" />
        <di:waypoint x="21228" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1644" bpmnElement="PP1643">
        <di:waypoint x="10048" y="595" />
        <di:waypoint x="10048" y="730" />
        <di:waypoint x="10312" y="730" />
        <di:waypoint x="10312" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1857" bpmnElement="PP1856">
        <di:waypoint x="10073" y="570" />
        <di:waypoint x="10127" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2062" bpmnElement="PP2061">
        <di:waypoint x="10227" y="570" />
        <di:waypoint x="10287" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1518" bpmnElement="PP1517">
        <di:waypoint x="10337" y="570" />
        <di:waypoint x="10428" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1409" bpmnElement="PP1408">
        <di:waypoint x="1818" y="570" />
        <di:waypoint x="1945" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2170" bpmnElement="PP2169">
        <di:waypoint x="1793" y="595" />
        <di:waypoint x="1793" y="650" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1974" bpmnElement="PP1973">
        <di:waypoint x="595" y="570" />
        <di:waypoint x="670" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="615" y="552" width="18" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2217" bpmnElement="PP2216">
        <di:waypoint x="570" y="595" />
        <di:waypoint x="570" y="786" />
        <di:waypoint x="670" y="786" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="575" y="687" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1311" bpmnElement="PP1310">
        <di:waypoint x="770" y="786" />
        <di:waypoint x="910" y="786" />
        <di:waypoint x="910" y="610" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2054" bpmnElement="PP2053">
        <di:waypoint x="720" y="844" />
        <di:waypoint x="720" y="873" />
        <di:waypoint x="910" y="873" />
        <di:waypoint x="910" y="610" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1465" bpmnElement="PP1464">
        <di:waypoint x="9192" y="570" />
        <di:waypoint x="9260" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1640" bpmnElement="PP1639">
        <di:waypoint x="9360" y="570" />
        <di:waypoint x="9400" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1533" bpmnElement="PP1532">
        <di:waypoint x="9705" y="570" />
        <di:waypoint x="9830" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2178" bpmnElement="PP2177">
        <di:waypoint x="9680" y="595" />
        <di:waypoint x="9680" y="737" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1504" bpmnElement="PP1503">
        <di:waypoint x="9655" y="762" />
        <di:waypoint x="9360" y="762" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="9494" y="740" width="79" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1315" bpmnElement="PP1314">
        <di:waypoint x="9680" y="787" />
        <di:waypoint x="9680" y="874" />
        <di:waypoint x="9360" y="874" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="9494" y="853" width="63" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1964" bpmnElement="PP1963">
        <di:waypoint x="9705" y="570" />
        <di:waypoint x="9740" y="570" />
        <di:waypoint x="9740" y="976" />
        <di:waypoint x="9360" y="976" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="9518" y="955" width="85" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1765" bpmnElement="PP1764">
        <di:waypoint x="9500" y="570" />
        <di:waypoint x="9655" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1714" bpmnElement="PP1713">
        <di:waypoint x="9930" y="570" />
        <di:waypoint x="10023" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1329" bpmnElement="PP1328">
        <di:waypoint x="9242" y="762" />
        <di:waypoint x="8998" y="762" />
        <di:waypoint x="8998" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1602" bpmnElement="PP1601">
        <di:waypoint x="9242" y="874" />
        <di:waypoint x="8998" y="874" />
        <di:waypoint x="8998" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1459" bpmnElement="PP1458">
        <di:waypoint x="9242" y="976" />
        <di:waypoint x="8998" y="976" />
        <di:waypoint x="8998" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1319" bpmnElement="PP1318">
        <di:waypoint x="13870" y="628" />
        <di:waypoint x="13870" y="670" />
        <di:waypoint x="13892" y="670" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1728" bpmnElement="PP1727">
        <di:waypoint x="13920" y="570" />
        <di:waypoint x="13990" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1273" bpmnElement="PP1272">
        <di:waypoint x="14300" y="766" />
        <di:waypoint x="14300" y="822" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1686" bpmnElement="PP1685">
        <di:waypoint x="14450" y="766" />
        <di:waypoint x="14450" y="828" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1616" bpmnElement="PP1615">
        <di:waypoint x="14350" y="708" />
        <di:waypoint x="14400" y="708" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1886" bpmnElement="PP1885">
        <di:waypoint x="14450" y="668" />
        <di:waypoint x="14450" y="630" />
        <di:waypoint x="14300" y="630" />
        <di:waypoint x="14300" y="668" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="14361" y="612" width="29" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1369" bpmnElement="PP1368">
        <di:waypoint x="14250" y="730" />
        <di:waypoint x="13730" y="730" />
        <di:waypoint x="13730" y="610" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="13977" y="712" width="29" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1870" bpmnElement="PP1869">
        <di:waypoint x="23660" y="570" />
        <di:waypoint x="23710" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1569" bpmnElement="PP1568">
        <di:waypoint x="23810" y="570" />
        <di:waypoint x="23855" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1712" bpmnElement="PP1711">
        <di:waypoint x="23905" y="570" />
        <di:waypoint x="23963" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1618" bpmnElement="PP1617">
        <di:waypoint x="23480" y="595" />
        <di:waypoint x="23480" y="690" />
        <di:waypoint x="23880" y="690" />
        <di:waypoint x="23880" y="595" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="23671" y="672" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2180" bpmnElement="PP2179">
        <di:waypoint x="23288" y="570" />
        <di:waypoint x="23455" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1656" bpmnElement="PP1655">
        <di:waypoint x="15022" y="628" />
        <di:waypoint x="15022" y="662" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1976" bpmnElement="PP1975">
        <di:waypoint x="14730" y="570" />
        <di:waypoint x="14798" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1535" bpmnElement="PP1534">
        <di:waypoint x="15020" y="530" />
        <di:waypoint x="15020" y="490" />
        <di:waypoint x="13710" y="490" />
        <di:waypoint x="13710" y="530" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="14351" y="472" width="29" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1652" bpmnElement="PP1651">
        <di:waypoint x="14500" y="708" />
        <di:waypoint x="14550" y="708" />
        <di:waypoint x="14550" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1371" bpmnElement="PP1370">
        <di:waypoint x="14200" y="595" />
        <di:waypoint x="14200" y="690" />
        <di:waypoint x="14250" y="690" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="14209" y="640" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1581" bpmnElement="PP1580">
        <di:waypoint x="14225" y="570" />
        <di:waypoint x="14525" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="14365" y="552" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2098" bpmnElement="PP2097">
        <di:waypoint x="14090" y="570" />
        <di:waypoint x="14175" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0278" bpmnElement="PP2146">
        <di:waypoint x="15240" y="530" />
        <di:waypoint x="15240" y="490" />
        <di:waypoint x="15180" y="490" />
        <di:waypoint x="15180" y="530" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="15197" y="473" width="86" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1896" bpmnElement="PP1895">
        <di:waypoint x="15210" y="628" />
        <di:waypoint x="15210" y="690" />
        <di:waypoint x="15265" y="690" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2007" bpmnElement="PP2006">
        <di:waypoint x="15260" y="570" />
        <di:waypoint x="15495" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1309" bpmnElement="PP1308">
        <di:waypoint x="14575" y="570" />
        <di:waypoint x="14630" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2231" bpmnElement="PP2230">
        <di:waypoint x="4265" y="570" />
        <di:waypoint x="4364" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="4308" y="552" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1443" bpmnElement="PP1442">
        <di:waypoint x="4240" y="595" />
        <di:waypoint x="4240" y="730" />
        <di:waypoint x="5020" y="730" />
        <di:waypoint x="5020" y="570" />
        <di:waypoint x="5325" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="4259" y="639" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2048" bpmnElement="PP2047">
        <di:waypoint x="4970" y="570" />
        <di:waypoint x="5325" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1450" bpmnElement="PP1449">
        <di:waypoint x="4920" y="628" />
        <di:waypoint x="4920" y="640" />
        <di:waypoint x="4952" y="640" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1461" bpmnElement="PP1460">
        <di:waypoint x="4464" y="570" />
        <di:waypoint x="4535" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1364" bpmnElement="PP1363">
        <di:waypoint x="4817" y="570" />
        <di:waypoint x="4870" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="4836" y="552" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1874" bpmnElement="PP1873">
        <di:waypoint x="4792" y="545" />
        <di:waypoint x="4792" y="500" />
        <di:waypoint x="5350" y="500" />
        <di:waypoint x="5350" y="545" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="5061" y="482" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1670" bpmnElement="PP1669">
        <di:waypoint x="13748" y="570" />
        <di:waypoint x="13820" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1563" bpmnElement="PP1562">
        <di:waypoint x="23505" y="570" />
        <di:waypoint x="23560" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1894" bpmnElement="PP1893">
        <di:waypoint x="26486" y="595" />
        <di:waypoint x="26486" y="677" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1636" bpmnElement="PP1635">
        <di:waypoint x="26511" y="702" />
        <di:waypoint x="26556" y="702" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2156" bpmnElement="PP2155">
        <di:waypoint x="26796" y="702" />
        <di:waypoint x="26821" y="702" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1771" bpmnElement="PP1770">
        <di:waypoint x="26846" y="677" />
        <di:waypoint x="26846" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1732" bpmnElement="PP1731">
        <di:waypoint x="26486" y="727" />
        <di:waypoint x="26486" y="790" />
        <di:waypoint x="26846" y="790" />
        <di:waypoint x="26846" y="727" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="26632" y="756" width="76" height="27" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1407" bpmnElement="PP1406">
        <di:waypoint x="15070" y="570" />
        <di:waypoint x="15160" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1284" bpmnElement="PP1283">
        <di:waypoint x="5640" y="570" />
        <di:waypoint x="5722" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1654" bpmnElement="PP1653">
        <di:waypoint x="5758" y="570" />
        <di:waypoint x="5844" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1659" bpmnElement="PP1658">
        <di:waypoint x="6880" y="570" />
        <di:waypoint x="6930" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1313" bpmnElement="PP1312">
        <di:waypoint x="7030" y="570" />
        <di:waypoint x="7115" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2120" bpmnElement="PP2119">
        <di:waypoint x="2452" y="570" />
        <di:waypoint x="2495" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1424" bpmnElement="PP1423">
        <di:waypoint x="2640" y="628" />
        <di:waypoint x="2640" y="640" />
        <di:waypoint x="2800" y="640" />
        <di:waypoint x="2800" y="610" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1792" bpmnElement="PP1791">
        <di:waypoint x="2690" y="570" />
        <di:waypoint x="2750" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1884" bpmnElement="PP1883">
        <di:waypoint x="2850" y="570" />
        <di:waypoint x="2893" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1413" bpmnElement="PP1412">
        <di:waypoint x="2520" y="545" />
        <di:waypoint x="2520" y="520" />
        <di:waypoint x="2918" y="520" />
        <di:waypoint x="2918" y="545" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="2688" y="502" width="63" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1480" bpmnElement="PP1479">
        <di:waypoint x="2545" y="570" />
        <di:waypoint x="2590" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2072" bpmnElement="PP2071">
        <di:waypoint x="12360" y="570" />
        <di:waypoint x="12420" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1516" bpmnElement="PP1515">
        <di:waypoint x="12310" y="628" />
        <di:waypoint x="12310" y="690" />
        <di:waypoint x="12420" y="690" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1878" bpmnElement="PP1877">
        <di:waypoint x="12520" y="690" />
        <di:waypoint x="12628" y="690" />
        <di:waypoint x="12628" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2193" bpmnElement="PP2192">
        <di:waypoint x="12520" y="570" />
        <di:waypoint x="12603" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1785" bpmnElement="PP1784">
        <di:waypoint x="12653" y="570" />
        <di:waypoint x="12684" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2050" bpmnElement="PP2049">
        <di:waypoint x="12203" y="570" />
        <di:waypoint x="12260" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2154" bpmnElement="PP2153">
        <di:waypoint x="12720" y="570" />
        <di:waypoint x="12758" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2037" bpmnElement="PP2036">
        <di:waypoint x="16493" y="570" />
        <di:waypoint x="16563" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1937" bpmnElement="PP1936">
        <di:waypoint x="16380" y="570" />
        <di:waypoint x="16443" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1978" bpmnElement="PP1977">
        <di:waypoint x="15870" y="570" />
        <di:waypoint x="15940" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1814" bpmnElement="PP1813">
        <di:waypoint x="16040" y="570" />
        <di:waypoint x="16110" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1824" bpmnElement="PP1823">
        <di:waypoint x="16210" y="570" />
        <di:waypoint x="16280" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2028" bpmnElement="PP2027">
        <di:waypoint x="16168" y="628" />
        <di:waypoint x="16168" y="648" />
        <di:waypoint x="16468" y="648" />
        <di:waypoint x="16468" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1866" bpmnElement="PP1865">
        <di:waypoint x="15820" y="723" />
        <di:waypoint x="15820" y="695" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="15839" y="706" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1621" bpmnElement="PP1620">
        <di:waypoint x="15545" y="570" />
        <di:waypoint x="15770" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="15650" y="552" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1939" bpmnElement="PP1938">
        <di:waypoint x="15520" y="595" />
        <di:waypoint x="15520" y="708" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="15532" y="633" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1904" bpmnElement="PP1903">
        <di:waypoint x="15820" y="773" />
        <di:waypoint x="15820" y="811" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="15830" y="785" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1347" bpmnElement="PP1346">
        <di:waypoint x="15570" y="748" />
        <di:waypoint x="15630" y="748" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1577" bpmnElement="PP1576">
        <di:waypoint x="15730" y="748" />
        <di:waypoint x="15795" y="748" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1846" bpmnElement="PP1845">
        <di:waypoint x="15520" y="806" />
        <di:waypoint x="15520" y="851" />
        <di:waypoint x="15770" y="851" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1286" bpmnElement="PP1285">
        <di:waypoint x="1713" y="570" />
        <di:waypoint x="1768" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1680" bpmnElement="PP1679">
        <di:waypoint x="15820" y="891" />
        <di:waypoint x="15820" y="933" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1484" bpmnElement="PP1483">
        <di:waypoint x="1681" y="690" />
        <di:waypoint x="1743" y="690" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0245" bpmnElement="PP1433">
        <di:waypoint x="1070" y="570" />
        <di:waypoint x="1120" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="1087" y="552" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0254" bpmnElement="PP1619">
        <di:waypoint x="1145" y="595" />
        <di:waypoint x="1145" y="635" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="1152" y="604" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0267" bpmnElement="PP2046">
        <di:waypoint x="1170" y="660" />
        <di:waypoint x="1210" y="660" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="1175" y="633" width="20" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0274" bpmnElement="PP1662">
        <di:waypoint x="1145" y="685" />
        <di:waypoint x="1145" y="827" />
        <di:waypoint x="1185" y="827" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="1150" y="744" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0294" bpmnElement="PP1745">
        <di:waypoint x="1250" y="877" />
        <di:waypoint x="1391" y="877" />
        <di:waypoint x="1391" y="700" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0240" bpmnElement="PP2229">
        <di:waypoint x="1260" y="718" />
        <di:waypoint x="1260" y="770" />
        <di:waypoint x="1391" y="770" />
        <di:waypoint x="1391" y="700" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0271" bpmnElement="PP1950">
        <di:waypoint x="1310" y="660" />
        <di:waypoint x="1341" y="660" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0241" bpmnElement="PP1935">
        <di:waypoint x="1285" y="827" />
        <di:waypoint x="1391" y="827" />
        <di:waypoint x="1391" y="700" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1872" bpmnElement="PP1871">
        <di:waypoint x="960" y="570" />
        <di:waypoint x="1020" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1597" bpmnElement="PP1596">
        <di:waypoint x="1045" y="545" />
        <di:waypoint x="1045" y="500" />
        <di:waypoint x="1793" y="500" />
        <di:waypoint x="1793" y="545" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="1409" y="482" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1593" bpmnElement="PP1592">
        <di:waypoint x="1170" y="570" />
        <di:waypoint x="1613" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="1382" y="552" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1698" bpmnElement="PP1697">
        <di:waypoint x="1441" y="660" />
        <di:waypoint x="1527" y="660" />
        <di:waypoint x="1527" y="570" />
        <di:waypoint x="1613" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1428" bpmnElement="PP1427">
        <di:waypoint x="7165" y="570" />
        <di:waypoint x="7440" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="7295" y="552" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1986" bpmnElement="PP1985">
        <di:waypoint x="7140" y="595" />
        <di:waypoint x="7140" y="668" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="7111" y="623" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1696" bpmnElement="PP1695">
        <di:waypoint x="6740" y="570" />
        <di:waypoint x="6780" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1882" bpmnElement="PP1881">
        <di:waypoint x="11350" y="545" />
        <di:waypoint x="11350" y="390" />
        <di:waypoint x="14630" y="390" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="11175" y="536" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1599" bpmnElement="PP1598">
        <di:waypoint x="11375" y="570" />
        <di:waypoint x="11418" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="11386" y="552" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1608" bpmnElement="PP1607">
        <di:waypoint x="11285" y="570" />
        <di:waypoint x="11325" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2033" bpmnElement="PP2032">
        <di:waypoint x="8665" y="570" />
        <di:waypoint x="8727" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1968" bpmnElement="PP1967">
        <di:waypoint x="8640" y="595" />
        <di:waypoint x="8640" y="668" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1767" bpmnElement="PP1766">
        <di:waypoint x="8690" y="708" />
        <di:waypoint x="8727" y="708" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2022" bpmnElement="PP2021">
        <di:waypoint x="8777" y="668" />
        <di:waypoint x="8777" y="610" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1902" bpmnElement="PP1901">
        <di:waypoint x="28140" y="545" />
        <di:waypoint x="28140" y="468" />
        <di:waypoint x="29439" y="468" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="28121" y="499" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1802" bpmnElement="PP1801">
        <di:waypoint x="28165" y="570" />
        <di:waypoint x="28227" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="28186" y="552" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1418" bpmnElement="PP1417">
        <di:waypoint x="7360" y="708" />
        <di:waypoint x="7450" y="708" />
        <di:waypoint x="7450" y="610" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1898" bpmnElement="PP1897">
        <di:waypoint x="7190" y="708" />
        <di:waypoint x="7260" y="708" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2011" bpmnElement="PP2010">
        <di:waypoint x="7855" y="570" />
        <di:waypoint x="8065" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2168" bpmnElement="PP2167">
        <di:waypoint x="7830" y="595" />
        <di:waypoint x="7830" y="650" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2068" bpmnElement="PP2067">
        <di:waypoint x="7880" y="690" />
        <di:waypoint x="7950" y="690" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1980" bpmnElement="PP1979">
        <di:waypoint x="8000" y="650" />
        <di:waypoint x="8000" y="570" />
        <di:waypoint x="8065" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1859" bpmnElement="PP1858">
        <di:waypoint x="29539" y="468" />
        <di:waypoint x="29618" y="468" />
        <di:waypoint x="29618" y="552" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1769" bpmnElement="PP1768">
        <di:waypoint x="15845" y="958" />
        <di:waypoint x="16032" y="958" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="15911" y="929" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1990" bpmnElement="PP1989">
        <di:waypoint x="15820" y="983" />
        <di:waypoint x="15820" y="1070" />
        <di:waypoint x="16000" y="1070" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="15874" y="1046" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1260" bpmnElement="PP1259">
        <di:waypoint x="16050" y="1128" />
        <di:waypoint x="16050" y="1157" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2074" bpmnElement="PP2073">
        <di:waypoint x="16010" y="1110" />
        <di:waypoint x="16010" y="1175" />
        <di:waypoint x="16032" y="1175" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1684" bpmnElement="PP1683">
        <di:waypoint x="15820" y="645" />
        <di:waypoint x="15820" y="610" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="15792" y="626" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1547" bpmnElement="PP1546">
        <di:waypoint x="15845" y="670" />
        <di:waypoint x="16030" y="670" />
        <di:waypoint x="16030" y="708" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="15912" y="656" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1555" bpmnElement="PP1554">
        <di:waypoint x="16030" y="806" />
        <di:waypoint x="16030" y="852" />
        <di:waypoint x="16250" y="852" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1354" bpmnElement="PP1353">
        <di:waypoint x="16080" y="748" />
        <di:waypoint x="16128" y="748" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1401" bpmnElement="PP1400">
        <di:waypoint x="16228" y="748" />
        <di:waypoint x="16275" y="748" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2150" bpmnElement="PP2149">
        <di:waypoint x="16300" y="723" />
        <di:waypoint x="16300" y="670" />
        <di:waypoint x="16060" y="670" />
        <di:waypoint x="16060" y="630" />
        <di:waypoint x="15850" y="630" />
        <di:waypoint x="15850" y="610" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="16305" y="697" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1958" bpmnElement="PP1957">
        <di:waypoint x="16300" y="892" />
        <di:waypoint x="16300" y="933" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1321" bpmnElement="PP1320">
        <di:waypoint x="16275" y="958" />
        <di:waypoint x="16068" y="958" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="16165" y="929" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1587" bpmnElement="PP1586">
        <di:waypoint x="16300" y="983" />
        <di:waypoint x="16300" y="1070" />
        <di:waypoint x="16100" y="1070" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="16189" y="1046" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1373" bpmnElement="PP1372">
        <di:waypoint x="16300" y="773" />
        <di:waypoint x="16300" y="812" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="16307" y="779" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1496" bpmnElement="PP1495">
        <di:waypoint x="4585" y="570" />
        <di:waypoint x="4767" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="4668" y="552" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1342" bpmnElement="PP1341">
        <di:waypoint x="4560" y="595" />
        <di:waypoint x="4560" y="640" />
        <di:waypoint x="4612" y="640" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="4567" y="615" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2141" bpmnElement="PP2140">
        <di:waypoint x="4712" y="640" />
        <di:waypoint x="4742" y="640" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1710" bpmnElement="PP1709">
        <di:waypoint x="3760" y="660" />
        <di:waypoint x="3810" y="660" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1477" bpmnElement="PP1476">
        <di:waypoint x="3610" y="660" />
        <di:waypoint x="3660" y="660" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1340" bpmnElement="PP1339">
        <di:waypoint x="3300" y="660" />
        <di:waypoint x="3360" y="660" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="3321" y="642" width="19" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2184" bpmnElement="PP2183">
        <di:waypoint x="3460" y="660" />
        <di:waypoint x="3510" y="660" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1290" bpmnElement="PP1289">
        <di:waypoint x="3410" y="718" />
        <di:waypoint x="3410" y="814" />
        <di:waypoint x="2936" y="814" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1393" bpmnElement="PP1392">
        <di:waypoint x="3710" y="718" />
        <di:waypoint x="3710" y="814" />
        <di:waypoint x="2936" y="814" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1928" bpmnElement="PP1927">
        <di:waypoint x="3760" y="874" />
        <di:waypoint x="3810" y="874" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1549" bpmnElement="PP1548">
        <di:waypoint x="3610" y="874" />
        <di:waypoint x="3660" y="874" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1275" bpmnElement="PP1274">
        <di:waypoint x="3460" y="874" />
        <di:waypoint x="3510" y="874" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2219" bpmnElement="PP2218">
        <di:waypoint x="3275" y="685" />
        <di:waypoint x="3275" y="874" />
        <di:waypoint x="3360" y="874" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="3280" y="757" width="21" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1583" bpmnElement="PP1582">
        <di:waypoint x="3910" y="660" />
        <di:waypoint x="3990" y="660" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2103" bpmnElement="PP2102">
        <di:waypoint x="3910" y="874" />
        <di:waypoint x="3950" y="874" />
        <di:waypoint x="3950" y="660" />
        <di:waypoint x="3990" y="660" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2162" bpmnElement="PP2161">
        <di:waypoint x="3410" y="932" />
        <di:waypoint x="3410" y="968" />
        <di:waypoint x="2918" y="968" />
        <di:waypoint x="2918" y="832" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1972" bpmnElement="PP1971">
        <di:waypoint x="3710" y="932" />
        <di:waypoint x="3710" y="968" />
        <di:waypoint x="2918" y="968" />
        <di:waypoint x="2918" y="832" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2204" bpmnElement="PP2203">
        <di:waypoint x="11030" y="570" />
        <di:waypoint x="11105" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1258" bpmnElement="PP1257">
        <di:waypoint x="10990" y="628" />
        <di:waypoint x="10990" y="690" />
        <di:waypoint x="11010" y="690" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1716" bpmnElement="PP1715">
        <di:waypoint x="11108" y="874" />
        <di:waypoint x="10960" y="874" />
        <di:waypoint x="10960" y="610" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1627" bpmnElement="PP1626">
        <di:waypoint x="10823" y="570" />
        <di:waypoint x="10930" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1988" bpmnElement="PP1987">
        <di:waypoint x="10960" y="530" />
        <di:waypoint x="10960" y="470" />
        <di:waypoint x="9142" y="470" />
        <di:waypoint x="9142" y="530" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1350" bpmnElement="PP1349">
        <di:waypoint x="13210" y="570" />
        <di:waypoint x="13293" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1952" bpmnElement="PP1951">
        <di:waypoint x="14898" y="570" />
        <di:waypoint x="14970" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2172" bpmnElement="PP2171">
        <di:waypoint x="14730" y="390" />
        <di:waypoint x="14796" y="390" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1277" bpmnElement="PP1276">
        <di:waypoint x="14896" y="390" />
        <di:waypoint x="15040" y="390" />
        <di:waypoint x="15040" y="530" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0268" bpmnElement="PP1445" bioc:stroke="#000" bioc:fill="#fff">
        <di:waypoint x="28277" y="570" />
        <di:waypoint x="28340" y="570" />
        <bpmndi:PP0227Label>
          <dc:Bounds x="28287" y="583" width="25" height="14" />
        </bpmndi:PP0227Label>
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2094" bpmnElement="PP2093">
        <di:waypoint x="28620" y="698" />
        <di:waypoint x="28685" y="698" />
        <di:waypoint x="28685" y="595" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1262" bpmnElement="PP1261">
        <di:waypoint x="28440" y="698" />
        <di:waypoint x="28520" y="698" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1908" bpmnElement="PP1907">
        <di:waypoint x="28440" y="570" />
        <di:waypoint x="28520" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1634" bpmnElement="PP1633">
        <di:waypoint x="28620" y="570" />
        <di:waypoint x="28660" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1573" bpmnElement="PP1572">
        <di:waypoint x="1793" y="886" />
        <di:waypoint x="1793" y="919" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1834" bpmnElement="PP1833">
        <di:waypoint x="1995" y="570" />
        <di:waypoint x="2102" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1378" bpmnElement="PP1377">
        <di:waypoint x="1970" y="595" />
        <di:waypoint x="1970" y="846" />
        <di:waypoint x="1843" y="846" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1693" bpmnElement="PP1692">
        <di:waypoint x="1793" y="969" />
        <di:waypoint x="1793" y="1002" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2030" bpmnElement="PP2029">
        <di:waypoint x="1818" y="944" />
        <di:waypoint x="2040" y="944" />
        <di:waypoint x="2040" y="570" />
        <di:waypoint x="2102" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1789" bpmnElement="PP1788">
        <di:waypoint x="2177" y="690" />
        <di:waypoint x="2224" y="690" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1482" bpmnElement="PP1481">
        <di:waypoint x="2152" y="715" />
        <di:waypoint x="2152" y="777" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1384" bpmnElement="PP1383">
        <di:waypoint x="5350" y="907" />
        <di:waypoint x="5350" y="958" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2114" bpmnElement="PP2113">
        <di:waypoint x="1793" y="748" />
        <di:waypoint x="1793" y="806" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1664" bpmnElement="PP1663">
        <di:waypoint x="1760" y="730" />
        <di:waypoint x="1760" y="806" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1757" bpmnElement="PP1756">
        <di:waypoint x="3100" y="660" />
        <di:waypoint x="3145" y="660" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1820" bpmnElement="PP1819">
        <di:waypoint x="2918" y="718" />
        <di:waypoint x="2918" y="796" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1565" bpmnElement="PP1564">
        <di:waypoint x="2968" y="660" />
        <di:waypoint x="3000" y="660" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP1747" bpmnElement="PP1746">
        <di:waypoint x="21328" y="570" />
        <di:waypoint x="21500" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP2076" bpmnElement="PP2075">
        <di:waypoint x="21600" y="570" />
        <di:waypoint x="21743" y="570" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0182" bpmnElement="PP0181">
        <di:waypoint x="24353" y="692" />
        <di:waypoint x="24361" y="673" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0184" bpmnElement="PP0183">
        <di:waypoint x="24357" y="800" />
        <di:waypoint x="24356" y="801" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0261" bpmnElement="PP0185">
        <di:waypoint x="10508" y="628" />
        <di:waypoint x="10508" y="690" />
        <di:waypoint x="10548" y="690" />
      </bpmndi:PP0227Edge>
      <bpmndi:PP0227Edge id="PP0297" bpmnElement="PP0180">
        <di:waypoint x="22146" y="694" />
        <di:waypoint x="22132" y="678" />
      </bpmndi:PP0227Edge>
    </bpmndi:PP0227Plane>
  </bpmndi:PP0227Diagram>
</bpmn:definitions>
