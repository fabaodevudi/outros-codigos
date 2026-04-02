<?xml version="1.0" encoding="UTF-8"?>
<t010 xmlns:bioc="«U000051»" xmlns:bpmn="«U000048»" xmlns:bpmndi="«U000050»" xmlns:camunda="«U000054»" xmlns:color="«U000047»" xmlns:dc="«U000052»" xmlns:di="«U000053»" xmlns:xsi="«U000049»" id="CC1167" targetNamespace="«URL»" exporter="CC2038" exporterVersion="5.44.0">
  <t029 id="CC3838" name="CC3774" isExecutable="true" camunda:versionTag="20250219" camunda:historyTimeToLive="15">
    <t043 id="CC2803" name="CC2857" default="CC3405">
      <t019>
        <t055>
          <t056 id="CC2700" label="Número CC4135" type="string" />
          <t056 id="CC3708" label="DDD " type="string" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC4290" type="string" defaultValue="continuar" />
          <t056 id="CC0391" label="Número CC4135 representante" type="string" />
          <t056 id="CC0635" label="DDD representante" type="string" />
        </t055>
        <t058>
          <t063 name="CC3108">CC2803</t063>
        </t058>
      </t019>
      <t021>CC3613</t021>
      <t021>CC3232</t021>
      <t027>CC3405</t027>
      <t027>CC3295</t027>
    </t043>
    <t043 id="CC3806" name="CC3149" default="CC3613">
      <t019>
        <t055>
          <t056 id="CC4331" label="CC4233" type="string" />
          <t056 id="CC3817" label="CC4310 atual" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC4290" type="string" defaultValue="continuar" />
          <t056 id="CC1202" label="CC4233 Representante" type="string" />
        </t055>
        <t058>
          <t063 name="CC3108">CC3806</t063>
        </t058>
      </t019>
      <t021>CC3295</t021>
      <t021>CC3263</t021>
      <t027>CC3613</t027>
      <t027>CC3273</t027>
    </t043>
    <t043 id="CC0945" name="CC0924" default="CC3274">
      <t019>
        <t055>
          <t056 id="CC2673" label="Data nascimento" type="string" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC4290" type="string" defaultValue="continuar" />
          <t056 id="CC0385" label="Data nascimento representante" type="string" />
        </t055>
        <t058>
          <t063 name="CC3108">CC0945</t063>
        </t058>
      </t019>
      <t021>CC3405</t021>
      <t021>CC3376</t021>
      <t027>CC3274</t027>
      <t027>CC3232</t027>
    </t043>
    <t043 id="CC4003" name="CC4305 CC4403" default="CC3615">
      <t019>
        <t055>
          <t056 id="CC3119" type="string" />
          <t056 id="CC2703" type="string" />
          <t056 id="CC0876" type="string" />
          <t056 id="CC3938" type="string" />
          <t056 id="CC4290" type="string" defaultValue="continuar" />
          <t056 id="CC0598" type="string" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC0171" type="string" />
          <t056 id="CC0749" type="string" />
        </t055>
        <t058>
          <t063 name="CC3108">CC4003</t063>
        </t058>
      </t019>
      <t021>CC3563</t021>
      <t027>CC3615</t027>
      <t027>CC3412</t027>
    </t043>
    <t043 id="CC1401" name="CC1349" default="CC3269">
      <t019>
        <t055>
          <t056 id="CC2827" type="string" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC4290" type="string" defaultValue="continuar" />
          <t056 id="CC0243" type="string" />
          <t056 id="CC0690" type="boolean" />
        </t055>
        <t058>
          <t063 name="CC3108">CC1401</t063>
        </t058>
        <t051 event="start">
          <t066 scriptFormat="groovy">CC4009.removeVariable('CC0970') CC4009.removeVariable('situacao_consulta_segmento') CC4009.removeVariable('CC3107')</t066>
        </t051>
      </t019>
      <t021>CC3471</t021>
      <t021>CC3302</t021>
      <t021>CC3543</t021>
      <t027>CC3255</t027>
      <t027>CC3269</t027>
    </t043>
    <t033 id="CC1228" name="CC1225" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">1</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="agencia_selecionada">$</t050>
              <t050 key="CC2815">$</t050>
              <t050 key="CC2659">$</t050>
              <t050 key="CC3942">$</t050>
              <t050 key="CC4013">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="agencia_selecionada">${CC2827}</t050>
              <t050 key="CC2815">${execution.hasVariable("declaracao_nif") ? declaracao_nif : false}</t050>
              <t050 key="CC2659">${execution.hasVariable("codigo_carteira") ? codigo_carteira : false}</t050>
              <t050 key="CC3942">${execution.hasVariable("plataforma") ? plataforma : false}</t050>
              <t050 key="CC4013">${execution.hasVariable("funcional") ? funcional : false}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3211</t021>
      <t027>CC3354</t027>
    </t033>
    <t018 id="CC2530" default="CC3532">
      <t021>CC3615</t021>
      <t021>CC3606</t021>
      <t027>CC3532</t027>
    </t018>
    <t043 id="CC2801" name="Endereço" default="CC3404">
      <t019>
        <t055>
          <t056 id="CC4385" type="string" />
          <t056 id="CC4424" type="string">
            <t064 />
          </t056>
          <t056 id="CC4275" type="string" />
          <t056 id="CC3800" type="string" />
          <t056 id="CC4257" type="string" />
          <t056 id="CC4266" type="string" />
          <t056 id="CC4260" type="string" />
          <t056 id="CC2815" type="boolean" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC4290" type="string" defaultValue="continuar" />
          <t056 id="CC0864" type="string" />
          <t056 id="CC0588" type="string" />
          <t056 id="CC3119" type="string" />
          <t056 id="CC2703" type="string" />
          <t056 id="CC0876" type="string" />
          <t056 id="CC1602" type="string" />
          <t056 id="CC1688" type="string" />
          <t056 id="CC1037" type="string" />
          <t056 id="CC0683" type="string" />
          <t056 id="CC1006" type="string" />
          <t056 id="CC1027" type="string" />
          <t056 id="CC1010" type="string" />
        </t055>
        <t058>
          <t063 name="CC3108">CC2801</t063>
        </t058>
      </t019>
      <t021>CC3412</t021>
      <t021>CC3255</t021>
      <t021>CC3342</t021>
      <t027>CC3404</t027>
      <t027>CC3310</t027>
    </t043>
    <t043 id="CC3807" name="CC4338" default="CC3342">
      <t019>
        <t055>
          <t056 id="CC3858" label="Valor Renda" type="string" />
          <t056 id="CC4274" type="string" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC4290" type="string" defaultValue="continuar" />
          <t056 id="CC0707" label="Valor Renda representante" type="string" />
        </t055>
        <t058>
          <t063 name="CC3108">CC3807</t063>
        </t058>
      </t019>
      <t021>CC3310</t021>
      <t021>CC3243</t021>
      <t021>CC3248</t021>
      <t027>CC3376</t027>
      <t027>CC3342</t027>
    </t043>
    <t018 id="CC2562" name="CC0344" default="CC3563">
      <t021>CC3555</t021>
      <t021>CC3539</t021>
      <t027>CC3563</t027>
      <t027>CC3606</t027>
    </t018>
    <t018 id="CC2561" default="CC3471">
      <t021>CC3608</t021>
      <t021>CC3193</t021>
      <t021>CC3340</t021>
      <t021>CC3266</t021>
      <t027>CC3471</t027>
    </t018>
    <t033 id="CC3105" name="CC2859" camunda:type="external" CC3089="CC0177">
      <t011>CC0011</t011>
      <t019>
        <t058>
          <t059 name="CC2661">false</t059>
          <t059 name="CC2000">true</t059>
          <t059 name="CC3127">30000</t059>
          <t059 name="CC1389">1</t059>
        </t058>
      </t019>
      <t021>CC3540</t021>
      <t027>CC3352</t027>
    </t033>
    <t031 id="CC0810" name="CC1000" scriptFormat="groovy">
      <t021>CC3477</t021>
      <t027>CC3665</t027>
      <t030>def dataHoraCriacao = new Date().toLocalDate()

def data_inicio_relacionamento = dataHoraCriacao.format("yyyy-MM-dd")
def consultaSegmento = CC4009.CC3819("consultaSegmento")


CC4009.CC3850("codigo_tipo_atuacao_titularidade_conta","0");

CC4009.CC3850("numero_unico_organizacao","004341");

CC4009.CC3850("codigo_empresa","004");

CC4009.CC3850("codigo_banco","341");

def codigo_contexto_jornada = "";

def identificacao_jornada = [

"codigo_sigla_sistema": "CC4389",

"codigo_contexto_jornada": "24",

"codigo_abertura_conta_online": "N"

];

CC4009.CC3850("identificacao_jornada", identificacao_jornada);

//titulares

def listaTitulares = []

def client_id = CC4009.CC3819("CC4016")

def CC3112 = CC4009.CC3819("CC3112")

def mapTitulares = [:]

mapTitulares.put("CC1038", client_id)

mapTitulares.put("ordem_titularidade", 1)

mapTitulares.put("numero_unico_cliente_temporario", CC3112)

mapTitulares.put("codigo_usuario_autenticacao", CC4009.CC3819("CC2694"))

listaTitulares.add(mapTitulares)

CC4009.CC3850("titulares", listaTitulares)

CC4009.CC3850("CC3957", "C");

CC4009.CC3850("CC3723", "301");

CC4009.CC3850("origem_conta", "I");

CC4009.CC3850("codigo_agencia", CC4009.CC3819("CC4178"));

CC4009.CC3850("codigo_conta", CC4009.CC3819("CC4330"));

CC4009.CC3850("CC4422", CC4009.CC3819("CC4422"));

def codigo_segmento = CC4009.CC3819("CC4129")

switch(codigo_segmento) {

case "3":

codigo_segmento = "3111"

break

case "L":

codigo_segmento = "L111"

break;

case "4":

codigo_segmento = "4111"

break

}

def CC4012 = CC4009.CC3819("CC4012");

def codigo_conta_salario = "";

if (CC4012 == "CC4036" || fluxo_spi=="massificado") {

codigo_conta_salario = "F";

}else{

codigo_conta_salario = " ";

}

CC4009.CC3850("codigo_segmento", codigo_segmento)

def CC0690 = CC4009.CC3819("CC0690");

if (CC0690 == true) {

CC4009.CC3850("codigo_tipo_carteira_gerente_conta",CC2659);

CC4009.CC3850("codigo_plataforma_agencia",CC3942);

}else{

CC4009.CC3850("codigo_tipo_carteira_gerente_conta", consultaSegmento.get("cod_carteira"));

CC4009.CC3850("codigo_plataforma_agencia", consultaSegmento.get("cod_plataforma"));

}

CC4009.CC3850("codigo_conta_salario",codigo_conta_salario);

def http_gq_consulta_encarteiramento_conta = CC4009.CC3819("http_gq_consulta_encarteiramento_conta");

if (CC2721 == "central") {
CC4009.CC3850("numero_funcional_colaborador_responsavel", http_gq_consulta_encarteiramento_conta["CC4013"]);
} else {
CC4009.CC3850("numero_funcional_colaborador_responsavel", CC4009.CC3819("CC0745"));
}

CC4009.CC3850("data_inicio_relacionamento", data_inicio_relacionamento);

CC4009.CC3850("indicador_carta_remessa", "N");

def ofertaProduto = CC4009.CC3819('CC2830');

CC4009.CC3850("pacote_tarifas", ofertaProduto['CC1013']);


def vinculo_selecionado = CC4009.CC3819("vinculo_selecionado")

if(vinculo_selecionado != null) {

def contas_pagadoras = [:] as HashMap

contas_pagadoras.put("cnpj_pagador", vinculo_selecionado.get("cnpj_empresa_pagadora"));

contas_pagadoras.put("CC3730", vinculo_selecionado.get("nome_completo_empresa_pagadora"));

contas_pagadoras.put("CC2647", vinculo_selecionado.get("agencia_empresa_pagadora"));

contas_pagadoras.put("CC3099", vinculo_selecionado.get("conta_empresa_pagadora"));

contas_pagadoras.put("dac_pagador", vinculo_selecionado.get("dac_empresa_pagadora"));

contas_pagadoras.put("situacao_funcionario", "F");

contas_pagadoras.put("atuacao", "06");

contas_pagadoras.put("lotacao", "0004");

CC4009.CC3850("dados_spi", contas_pagadoras)

} else {

CC4009.CC3850("dados_spi", null)

}



def CC4127 = [

"proposta_lis": ofertaProduto.get('CC2702') == true ? "S" : "N",

"proposta_cartao": "S",//VALIDAR

"proposta_debito": "S",//VALIDAR

"proposta_entrega_cheques": "N",//FIXO

"proposta_cartao_provisorio": "N",//FIXO

"proposta_aplic_aut": ofertaProduto.get('CC2012') == true ? "S" : "N",

"proposta_pic": "N",//FIXO

"proposta_collecte": "N",//FIXO

"CC0396": ofertaProduto.get('CC0389') == "S" ? "S" : "N",

"proposta_aplic_ci": "N",//FIXO

"CC1229": "N",//VALIDAR

"CC0753": ofertaProduto.get('CC0244') == true ? "S" : "N",

"proposta_ad": ofertaProduto.get('CC0206') == true ? "S" : "N",

"proposta_overlimite": ofertaProduto.get('CC1205') == "S" ? "S" : "N",

"proposta_option": "N"//FIXO

];

CC4009.CC3850("produtos_contratados", CC4127);</t030>
    </t031>
    <t033 id="CC0877" name="CC0293" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">1</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="CC0806">$</t050>
              <t050 key="CC3702">$</t050>
              <t050 key="CC2667">$</t050>
              <t050 key="CC4115">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="CC0806">${CC0806}</t050>
              <t050 key="CC3702">${CC3702}</t050>
              <t050 key="CC2667">true</t050>
              <t050 key="CC4115">${(execution.hasVariable("numero_unico_conta") &amp;&amp; numero_unico_conta != null &amp;&amp; numero_unico_conta != 'null' &amp;&amp; numero_unico_conta != '') ? execution.getVariable("numero_unico_conta") : CC0246}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3176</t021>
      <t027>CC3419</t027>
    </t033>
    <t031 id="CC0538" name="CC0197" scriptFormat="groovy">
      <t021>CC3292</t021>
      <t027>CC3505</t027>
      <t030>def CC1635 = "S"
CC4009.CC3850("CC3749", "004")
CC4009.CC3850("codigo_compensacao_banco", "341")
def CC4178 = CC4009.CC3819("CC2827")
def CC4330 = CC4009.CC3819('CC4330')
def CC4422 = CC4009.CC3819('CC4422')

def CC1011 = CC3749 + codigo_compensacao_banco + CC4178 + CC4330 + CC4422 + "000001" + "000000001"

CC4009.CC3850("CC1635", CC1635)
CC4009.CC3850("CC1011", CC1011)

def dados = [
"CC1635":CC1635,
"CC1011":CC1011,
]

CC4009.CC3850("dados_pessoa_temp", dados)</t030>
    </t031>
    <t033 id="CC1981" name="CC1711" CC0630="#{atualizarPessoaV2Delegate}">
      <t019>
        <t058>
          <t059 name="CC0685">
            <t061>
              <t050 key="CC1635">${dados_pessoa_temp["cadastro_validado"]}</t050>
              <t050 key="CC1011">${dados_pessoa_temp["codigo_chave_produto"]}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3505</t021>
      <t027>CC3226</t027>
    </t033>
    <t022 id="CC2844" name="CC0624">
      <t021>CC3226</t021>
      <t027>CC3477</t027>
      <t042 id="CC0497">
        <t040 xsi:type="bpmn:tFormalExpression">* * 3-23 ? * * *</t040>
      </t042>
    </t022>
    <t031 id="CC2007" name="CC2008" scriptFormat="javascript">
      <t021>CC3522</t021>
      <t027>CC3334</t027>
      <t030>var variaveisConta = CC4009.CC3819('CC0806')
var ofertaProdutos = CC4009.CC3819('CC2830')
var CC1998 = ofertaProdutos.get('CC1998')
var CC1655 = ofertaProdutos.get('CC1655') //codigo 0000 debito

function cartao_credito(){
var cartaoCredito = null
if(CC4009.hasVariable("limiterotativo_credito_v3_aberturacontas_resposta") &amp;&amp; CC4009.CC3819("limiterotativo_credito_v3_aberturacontas_resposta") != null &amp;&amp; CC4009.CC3819("limiterotativo_credito_v3_aberturacontas_resposta") != ""){ cartaoCredito = CC4009.CC3819("limiterotativo_credito_v3_aberturacontas_resposta")['CC0705']; } else{ cartaoCredito = CC4009.CC3819("CC0807")['valor_maximo_cartao_credito'].split('.')[0]; //ge não aceita ponto } return cartaoCredito.toString() }

var valor_maximo_cartao_credito = cartao_credito()

var CC4005 = aplicaRegraPersonDnCartao(valor_maximo_cartao_credito, CC1655, CC1998) //codigo 0000 debito

function aplicaRegraPersonDnCartao(valorPreAprovado,
dnCartaoCredito,
dnCartaoDebito){

var CC4129 = CC4009.CC3819('CC4129')
if(CC4129 == '4'){
var valorPa = Number(valorPreAprovado);
if(valorPa &gt;= 10000) {
return dnCartaoCredito
}else{
CC4009.CC3850('regra_aplicada_person', true)
return dnCartaoDebito
}
}
}

CC4009.CC3850("CC0586", variaveisConta.get('CC4016')); //tenho CC4009.CC3850("codigo_produto_cartao_credito", CC4005); //CC4005 CC4009.CC3850("codigo_canal_origem", variaveisConta.get('codigo_canal')); //ok CC4009.CC3850("dia_vencimento_fatura_cartao", ofertaProdutos.get("CC0947")); //ok CC4009.CC3850("CC0650", (CC4009.hasVariable("limite_cartao_direcionador") &amp;&amp; limite_cartao_direcionador != null &amp;&amp; limite_cartao_direcionador != "" ? limite_cartao_direcionador : valor_maximo_cartao_credito)); CC4009.CC3850("CC3824", CC4009.hasVariable("CC3824") ? CC3824 : null); CC4009.CC3850("CC3939", CC4009.hasVariable("CC3939") ? CC3939 : (CC4009.hasVariable("CC4272") ? CC4272 : false)); if(CC4009.hasVariable("CC1217") &amp;&amp; CC1217 != null){ def om=CC1217; if(om.get("CC3824")!=null) CC4009.CC3850("CC3824", om.get("CC3824")); if(om.get("CC0862")!=null) CC4009.CC3850("CC3939", om.get("CC0862")); } CC4009.CC3850("CC1205", ofertaProdutos.get('CC1205')); //ok CC4009.CC3850("CC0390", ofertaProdutos.get("CC0390")); //ok CC4009.CC3850("CC0529", ofertaProdutos.get("CC0529")); //ok CC4009.CC3850("indicador_oferta_na_fatura", ofertaProdutos.get("CC0797")); //ok CC4009.CC3850("CC0594", ofertaProdutos.get("CC0594")); //ok CC4009.CC3850("CC0389", ofertaProdutos.get("CC0389")); CC4009.CC3850("CC2827", variaveisConta.get('codigo_agencia')); CC4009.CC3850("numero_conta_corrente", variaveisConta.get('codigo_conta')); CC4009.CC3850("numero_dac_conta_corrente", variaveisConta.get('CC4422')); CC4009.CC3850("CC0787", CC4009.CC3819("CC4129")); CC4009.CC3850("codigo_tipo_conta", variaveisConta.get('CC3957')); CC4009.CC3850("CC1013", ofertaProdutos.get("CC1013"));
</t030>
    </t031>
    <t033 id="CC2820" name="CC2755" CC1365="true" camunda:exclusive="false" camunda:type="external" CC3089="CC1031">
      <t019>
        <t058>
          <t059 name="CC1021">
            <t061>
              <t050 key="CC3826">${CC3826}</t050>
              <t050 key="CC0586">${CC4016}</t050>
              <t050 key="codigo_produto_cartao_credito">${codigo_produto_cartao_credito}</t050>
              <t050 key="codigo_canal_origem">${codigo_canal_origem}</t050>
              <t050 key="dia_vencimento_fatura_cartao">${dia_vencimento_fatura_cartao}</t050>
              <t050 key="CC0650">${CC0650}</t050>
              <t050 key="CC1205">${CC1205}</t050>
              <t050 key="CC0390">${CC0390}</t050>
              <t050 key="CC0529">${CC0529}</t050>
              <t050 key="indicador_oferta_na_fatura">${indicador_oferta_na_fatura}</t050>
              <t050 key="CC0594">${CC0594}</t050>
              <t050 key="CC0389">${CC0389}</t050>
              <t050 key="CC2827">${CC2827}</t050>
              <t050 key="numero_conta_corrente">${numero_conta_corrente}</t050>
              <t050 key="numero_dac_conta_corrente">${numero_dac_conta_corrente}</t050>
              <t050 key="CC0787">${CC0787}</t050>
              <t050 key="codigo_tipo_conta">${codigo_tipo_conta}</t050>
              <t050 key="CC1013">${CC1013}</t050>
              <t050 key="nome_subcanal_origem_proposta_cartao_correntista">${CC2783}</t050>
              <t050 key="CC0531">${CC0531}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3554</t021>
      <t027>CC3658</t027>
    </t033>
    <t033 id="CC1196" name="CC1165" CC1191="true" camunda:type="external" CC3089="CC1988">
      <t019>
        <t058>
          <t059 name="CC2000">true</t059>
          <t059 name="CC1989">
            <t061>
              <t050 key="id_parceiro">004341</t050>
              <t050 key="id_pacote">${oferta_produto['codigo_pacote_tarifa']}</t050>
              <t050 key="CC4116">${oferta_produto['id_plano']}</t050>
              <t050 key="CC1383">${oferta_produto['forma_autenticacao']}</t050>
              <t050 key="id_cliente">${CC4178}${CC4330}${CC4422}</t050>
              <t050 key="CC4328">${oferta_produto['canal']}</t050>
            </t061>
          </t059>
          <t059 name="CC2661">false</t059>
          <t059 name="CC3127">30000</t059>
          <t059 name="CC1389">2</t059>
        </t058>
        <t053>R1/PT10S</t053>
      </t019>
      <t021>CC3244</t021>
      <t027>CC3161</t027>
    </t033>
    <t028 id="CC2593">
      <t021>CC3400</t021>
      <t027>CC3244</t027>
      <t027>CC3395</t027>
    </t028>
    <t028 id="CC2604" CC1191="true">
      <t021>CC3161</t021>
      <t021>CC3181</t021>
      <t027>CC3522</t027>
    </t028>
    <t022 id="CC0370" name="CC0844">
      <t021>CC3586</t021>
      <t027>CC3460</t027>
      <t026 id="CC0336" messageRef="CC2630" />
    </t022>
    <t022 id="CC0798" name="CC0770">
      <t021>CC3579</t021>
      <t027>CC3294</t027>
      <t042 id="CC0516">
        <t040 xsi:type="bpmn:tFormalExpression">* * 7-19 ? * * *</t040>
      </t042>
    </t022>
    <t033 id="CC1358" name="CC1249" CC0630="#{atualizarPessoaV2Delegate}">
      <t019>
        <t058>
          <t059 name="CC0685">
            <t061>
              <t050 key="telefones">${dados_pessoa_temp["telefones"]}</t050>
              <t050 key="emails">${dados_pessoa_temp["emails"]}</t050>
              <t050 key="data_nascimento_fundacao">${dados_pessoa_temp["data_nascimento_fundacao"]}</t050>
              <t050 key="CC3120">${dados_pessoa_temp["nome_completo"]}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3392</t021>
      <t027>CC3371</t027>
    </t033>
    <t017 id="CC0927">
      <t021>CC3434</t021>
      <t027>CC3664</t027>
      <t027>CC3467</t027>
    </t017>
    <t022 id="CC0800" name="CC0675">
      <t011>CC0013</t011>
      <t019>
        <t058>
          <t063 name="CC1392">${execution.getVariable("retorno_consumer_abertura_conta")["numero_unico_conta"]}</t063>
          <t063 name="CC1198">${execution.getVariable("retorno_consumer_abertura_conta")["data_abertura_conta"]}</t063>
        </t058>
      </t019>
      <t021>CC3664</t021>
      <t027>CC3618</t027>
      <t026 id="CC0337" messageRef="CC2631" />
    </t022>
    <t033 id="CC0542" name="CC0360" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">1</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="CC1989">$</t050>
              <t050 key="response_obter_limite">$</t050>
              <t050 key="codigo_retorno_proposta_cartao_credito">$</t050>
              <t050 key="numero_proposta_cartao_credito">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="CC1989">${response_contrato_tarifas}</t050>
              <t050 key="response_obter_limite">${(execution.hasVariable('limiterotativo_credito_v3_aberturacontas_resposta') &amp;&amp;
execution.getVariable('limiterotativo_credito_v3_aberturacontas_resposta') != null &amp;&amp; execution.getVariable("limiterotativo_credito_v3_aberturacontas_resposta") != '') ? execution.getVariable('limiterotativo_credito_v3_aberturacontas_resposta') : execution.getVariable('response_obter_limiteR0')}</t050>
              <t050 key="codigo_retorno_proposta_cartao_credito">${codigo_retorno_proposta_cartao_credito}</t050>
              <t050 key="numero_proposta_cartao_credito">${numero_proposta_cartao_credito}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3639</t021>
      <t027>CC3311</t027>
    </t033>
    <t043 id="CC3918" name="nome" default="CC3409">
      <t019>
        <t055>
          <t056 id="CC3120" type="string" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC4290" type="string" defaultValue="continuar" />
          <t056 id="CC0599" type="string" />
        </t055>
        <t058>
          <t063 name="CC3108">CC3918</t063>
        </t058>
      </t019>
      <t021>CC3273</t021>
      <t021>CC3368</t021>
      <t027>CC3409</t027>
      <t027>CC3175</t027>
    </t043>
    <t032 id="CC3405" sourceRef="CC2803" targetRef="CC0945" />
    <t032 id="CC3409" sourceRef="CC3918" targetRef="CC3929" />
    <t032 id="CC3613" sourceRef="CC3806" targetRef="CC2803" />
    <t032 id="CC3274" sourceRef="CC0945" targetRef="CC1234" />
    <t032 id="CC3563" name="SIM" sourceRef="CC2562" targetRef="CC4003" />
    <t032 id="CC3471" sourceRef="CC2561" targetRef="CC1401" />
    <t032 id="CC3532" sourceRef="CC2530" targetRef="CC0701" />
    <t032 id="CC3404" sourceRef="CC2801" targetRef="CC2542" />
    <t032 id="CC3505" sourceRef="CC0538" targetRef="CC1981" />
    <t032 id="CC3226" sourceRef="CC1981" targetRef="CC2844" />
    <t032 id="CC3522" sourceRef="CC2604" targetRef="CC2007" />
    <t032 id="CC3334" sourceRef="CC2007" targetRef="CC2517" />
    <t032 id="CC3658" sourceRef="CC2820" targetRef="CC2533" />
    <t032 id="CC3244" sourceRef="CC2593" targetRef="CC1196" />
    <t032 id="CC3161" sourceRef="CC1196" targetRef="CC2604" />
    <t032 id="CC3664" sourceRef="CC0927" targetRef="CC0800" />
    <t032 id="CC3311" sourceRef="CC0542" targetRef="CC2590" />
    <t033 id="CC0604" name="CC0714" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="motivo_cancelamento">${motivo_cancelamento}</t050>
            </t061>
          </t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="motivo_cancelamento">$</t050>
            </t061>
          </t059>
          <t059 name="CC2720">3</t059>
        </t058>
      </t019>
      <t021>CC3231</t021>
      <t021>CC3660</t021>
      <t027>CC3307</t027>
    </t033>
    <t012 id="CC2903">
      <t021>CC3307</t021>
      <t037 id="CC0270" />
    </t012>
    <t018 id="CC2520" name="CC0105" default="CC3493">
      <t021>CC3168</t021>
      <t027>CC3595</t027>
      <t027>CC3493</t027>
    </t018>
    <t043 id="CC0382" name="CC0325">
      <t019>
        <t055>
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
        </t055>
      </t019>
      <t021>CC3548</t021>
      <t027>CC3508</t027>
    </t043>
    <t033 id="CC2709" name="CC0258" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">86</t059>
          <t059 name="CC1214">
            <t061 />
          </t059>
          <t059 name="CC2802">
            <t061 />
          </t059>
        </t058>
      </t019>
      <t021>CC3445</t021>
      <t027>CC3668</t027>
    </t033>
    <t036 id="CC1694">
      <t021>CC3668</t021>
      <t027>CC3364</t027>
      <t035 id="CC2920">
        <t027>CC3503</t027>
      </t035>
      <t033 id="CC0855" name="CC0711" camunda:type="external" CC3089="CC0799">
        <t019>
          <t058>
            <t059 name="CC3927">24</t059>
            <t059 name="CC0950">${CC0950}</t059>
            <t059 name="CC2776">${execution.hasVariable("beneficio_inss") &amp;&amp; beneficio_inss}</t059>
            <t059 name="CC0593">${execution.hasVariable("envio_comprovante") &amp;&amp; envio_comprovante &amp;&amp; execution.hasVariable("id_conteudo_cr_di4")}</t059>
            <t059 name="CC0134">${execution.hasVariable("id_conteudo_formulario_nao_alfabetizacao_di4") ? true : false}</t059>
            <t059 name="CC0796">${execution.hasVariable("id_pessoa_representante") &amp;&amp; execution.getVariable("id_pessoa_representante") != null ? execution.getVariable("id_pessoa_representante") : ""}</t059>
            <t059 name="CC0207">${execution.hasVariable("adicionais") &amp;&amp; execution.getVariable("adicionais") != null ? execution.getVariable("adicionais")[0]["id_temporario"] : ""}</t059>
            <t059 name="CC1689">${execution.hasVariable("situacao_especial_backoffice") ? execution.getVariable("situacao_especial_backoffice") : ""}</t059>
          </t058>
        </t019>
        <t021>CC3287</t021>
        <t021>CC3281</t021>
        <t027>CC3560</t027>
      </t033>
      <t022 id="CC2943" name="CC0843">
        <t021>CC3560</t021>
        <t027>CC3209</t027>
        <t026 id="CC0338" messageRef="CC2628" />
      </t022>
      <t032 id="CC3560" sourceRef="CC0855" targetRef="CC2943" />
      <t018 id="CC2543" default="CC3221">
        <t021>CC3487</t021>
        <t027>CC3265</t027>
        <t027>CC3221</t027>
      </t018>
      <t023 id="CC2886" name="CC1621">
        <t021>CC3479</t021>
        <t016 id="CC0228" escalationRef="CC1263" />
      </t023>
      <t012 id="CC3007">
        <t021>CC3485</t021>
      </t012>
      <t032 id="CC3265" sourceRef="CC2543" targetRef="CC0548">
        <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('resultado_analise_backoffice') &amp;&amp; resultado_analise_backoffice == "EFETIVADO"}</t008>
      </t032>
      <t033 id="CC0541" name="CC0474" CC0630="${CC0676}">
        <t019>
          <t058>
            <t059 name="CC3826">${CC3826}</t059>
            <t059 name="CC2720">84</t059>
            <t059 name="CC1214">
              <t061>
                <t050 key="resultado_analise_backoffice">$</t050>
                <t050 key="id_formalizacao">$</t050>
                <t050 key="motivos_devolucao">$</t050>
              </t061>
            </t059>
            <t059 name="CC2802">
              <t061>
                <t050 key="resultado_analise_backoffice">${resultado_analise_backoffice}</t050>
                <t050 key="id_formalizacao">${id_formalizacao}</t050>
                <t050 key="motivos_devolucao">${motivos_devolucao}</t050>
              </t061>
            </t059>
          </t058>
        </t019>
        <t021>CC3466</t021>
        <t027>CC3487</t027>
      </t033>
      <t032 id="CC3209" sourceRef="CC2943" targetRef="CC2595" />
      <t032 id="CC3487" sourceRef="CC0541" targetRef="CC2543" />
      <t003 id="CC0548" name="CC0854" calledElement="CC0819">
        <t019>
          <t057 source="tipo_de_operacao" target="tipo_de_operacao" />
          <t057 source="CC3808" target="CC3808" />
          <t057 source="CC3826" target="CC3826" />
          <t057 source="CC4016" target="CC4016" />
          <t057 source="id_enquilino" target="id_enquilino" />
          <t057 source="CC3112" target="CC3112" />
          <t057 source="canal_origem" target="canal_origem" />
          <t057 source="CC4129" target="segmento_cliente" />
          <t057 source="id_conteudo_conferencia_documento" target="id_conteudo_conferencia_documento" />
          <t057 source="id_conteudo_conferencia_foto" target="id_conteudo_conferencia_foto" />
          <t057 source="CC2830['CC2702']" target="pre_aprovado" />
          <t057 source="CC2830['CC3115']" target="CC1211" />
          <t057 source="CC1058" target="CC1058" />
          <t062 variables="all" />
          <t057 variables="all" />
          <t057 businessKey="#{CC3826}" />
        </t019>
        <t021>CC3265</t021>
        <t027>CC3485</t027>
      </t003>
      <t032 id="CC3485" sourceRef="CC0548" targetRef="CC3007" />
      <t001 id="CC2940" attachedToRef="CC0548">
        <t027>CC3422</t027>
        <t014 id="CC0425" />
      </t001>
      <t023 id="CC2890" name="Erro">
        <t021>CC3551</t021>
        <t016 id="CC0222" escalationRef="CC1265" />
      </t023>
      <t033 id="CC0645" name="CC0375" CC0630="#{CC0676}">
        <t019>
          <t058>
            <t059 name="CC3826">${CC3826}</t059>
            <t059 name="CC2720">4</t059>
            <t059 name="CC1214">
              <t061>
                <t050 key="motivo_reprova">$</t050>
                <t050 key="resultado_analise">$</t050>
              </t061>
            </t059>
            <t059 name="CC2802">
              <t061>
                <t050 key="motivo_reprova">CC1260</t050>
                <t050 key="resultado_analise">${conclusao_analise_fraude}</t050>
              </t061>
            </t059>
          </t058>
        </t019>
        <t021>CC3422</t021>
        <t027>CC3551</t027>
      </t033>
      <t032 id="CC3551" sourceRef="CC0645" targetRef="CC2890" />
      <t032 id="CC3503" sourceRef="CC2920" targetRef="CC1035" />
      <t032 id="CC3287" sourceRef="CC1035" targetRef="CC0855" />
      <t031 id="CC1035" name="CC0725" scriptFormat="groovy">
        <t021>CC3503</t021>
        <t027>CC3287</t027>
        <t030>import groovy.json.JsonSlurper;

def documentosBackoffice = CC4009.CC3819("CC0950")
def novoDocumentosBackoffice = []

for (CC4006 in documentosBackoffice) {
if (CC4006.get("CC2846") == "selfie") {
novoDocumentosBackoffice.add([
"CC2695": CC4006.get("CC2695"),
"CC2846": CC4006.get("CC2846")
])
CC4009.CC3850("id_conteudo_selfie_di4",CC4006.get("CC2695"))
}

if (CC4006.get("CC2846") == "di frente") {
novoDocumentosBackoffice.add([
"CC2695": CC4006.get("CC2695"),
"CC2846": "di"
])
CC4009.CC3850("id_conteudo_di_di4",CC4006.get("CC2695"))
}
}

if (CC4009.CC3819("CC1658") == true &amp;&amp; CC4009.hasVariable("CC1689") &amp;&amp; CC4009.CC3819("CC1689") != null &amp;&amp; CC4009.CC3819("CC1689").toString().equalsIgnoreCase("nenhuma")) { novoDocumentosBackoffice.add([ "CC2695": CC4009.CC3819("CC3823"), "CC1658": CC4009.CC3819("CC1658"), "CC2846": "cr" ]) CC4009.CC3850("id_conteudo_cr_di4",CC4009.CC3819("CC3823")) }

if (CC4009.hasVariable("CC1689") &amp;&amp; CC4009.CC3819("CC1689") != null &amp;&amp; CC4009.CC3819("CC1689").toString().equalsIgnoreCase("nao alfabetizado")) {

novoDocumentosBackoffice.add([
"CC2695": CC4009.CC3819("CC3823"),
"CC2846": "formulario_nao_alfabetizacao"
])
CC4009.CC3850("id_conteudo_formulario_nao_alfabetizacao_di4",CC4009.CC3819("CC3823"))
}

if (CC4009.hasVariable("CC1689") &amp;&amp; CC4009.CC3819("CC1689") != null &amp;&amp; CC4009.CC3819("CC1689").toString().equalsIgnoreCase("menor emancipado")) {

CC4009.CC3850('situacao_especial_backoffice', 'menor_emancipado')

novoDocumentosBackoffice.add([
"CC2695": CC4009.CC3819("CC3823"),
"CC2846": "form_menor_emancipado"
])
}

def isFluxoAlternativo = CC4009.hasVariable("tipo_doc_comprovante") &amp;&amp; CC4009.CC3819("tipo_doc_comprovante") != null &amp;&amp; CC4009.hasVariable("CC1658") &amp;&amp; CC4009.CC3819("CC1658") == true &amp;&amp; CC4009.hasVariable("CC3823") &amp;&amp; CC4009.CC3819("CC3823") != null &amp;&amp; CC4009.hasVariable("ids_di4") &amp;&amp; CC4009.CC3819("ids_di4") != null &amp;&amp; CC4009.hasVariable("CC1689") &amp;&amp; CC4009.CC3819("CC1689") != null &amp;&amp; !CC4009.CC3819("CC1689").toString().equalsIgnoreCase("nenhuma" )

if (isFluxoAlternativo
&amp;&amp; !CC4009.CC3819("CC1689").toString().equalsIgnoreCase("menor emancipado")
&amp;&amp; !CC4009.CC3819("CC1689").toString().equalsIgnoreCase("nao alfabetizado")) {
def idsDi4string = CC4009.CC3819("ids_di4")
def jsonSlurper = new JsonSlurper()
def idsDi4 = jsonSlurper.parseText(idsDi4string)
for(idDi4 in idsDi4) {
novoDocumentosBackoffice.add([
"CC2695": idDi4.get("CC3823"),
"CC2846": idDi4.get("tipo_doc_comprovante")
])
}
}

if (isFluxoAlternativo &amp;&amp; !CC4009.CC3819("CC1689").toString().equalsIgnoreCase("nao alfabetizado")) { def situacoesEspeciais = CC4009.CC3819("CC1689") switch (situacoesEspeciais) case 'procuracao dependente economico': CC4009.CC3850('situacao_especial_backoffice', 'dependente_economico' ) break case 'procuracao maior sob curatela': CC4009.CC3850('situacao_especial_backoffice', 'maior_sob_curatela') break case 'procuracao representacao outras situacoes': CC4009.CC3850('situacao_especial_backoffice', 'representado_por_procurador') break case 'menor representado pelos CC4373': CC4009.CC3850('situacao_especial_backoffice', 'menor_representado_pais') break case 'menor emancipado': CC4009.CC3850('situacao_especial_backoffice', 'menor_emancipado') break case 'menor sob curatela': CC4009.CC3850('situacao_especial_backoffice', 'menor_sob_curatela') break case 'menor sob guarda': CC4009.CC3850('situacao_especial_backoffice', 'menor_sob_guarda') break case 'menor sob tutela': CC4009.CC3850('situacao_especial_backoffice', 'menor_sob_tutela') break CC4189: CC4009.CC3850('situacao_especial_backoffice', '') } }

CC4009.CC3850("CC0950", novoDocumentosBackoffice)</t030>
      </t031>
      <t018 id="CC2595" name="CC0259" default="CC3466">
        <t021>CC3209</t021>
        <t027>CC3466</t027>
        <t027>CC3481</t027>
      </t018>
      <t023 id="CC2936" name="CC0345">
        <t019>
          <t051 event="start">
            <t066 scriptFormat="groovy">if(!CC4009.hasVariable("backoffice_retry") ){ CC4009.CC3850("backoffice_retry",1); yelse{ def retrys = CC4009.CC3819("backoffice_retry") ; retrys+=1; CC4009.CC3850("backoffice_retry",retrys) ; }</t066>
          </t051>
        </t019>
        <t021>CC3481</t021>
        <t027>CC3300</t027>
      </t023>
      <t018 id="CC2613" name="CC0577" default="CC3281">
        <t021>CC3300</t021>
        <t027>CC3534</t027>
        <t027>CC3281</t027>
      </t018>
      <t023 id="CC3039" name="CC1350">
        <t021>CC3534</t021>
        <t016 id="CC0194" escalationRef="CC1264" />
      </t023>
      <t032 id="CC3466" name="Sim" sourceRef="CC2595" targetRef="CC0541" />
      <t032 id="CC3481" name="Não" sourceRef="CC2595" targetRef="CC2936">
        <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('resultado_analise_backoffice') &amp;&amp; (resultado_analise_backoffice == "ERRO_INTERNO" || resultado_analise_backoffice == "ERRO_PAYLOAD")}</t008>
      </t032>
      <t032 id="CC3300" sourceRef="CC2936" targetRef="CC2613" />
      <t032 id="CC3534" name="Sim" sourceRef="CC2613" targetRef="CC3039">
        <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('backoffice_retry') &amp;&amp; backoffice_retry&gt;3}</t008>
      </t032>
      <t032 id="CC3281" name="Não" sourceRef="CC2613" targetRef="CC0855" />
      <t032 id="CC3422" sourceRef="CC2940" targetRef="CC0645" />
      <t031 id="CC0145" name="CC0163" scriptFormat="groovy">
        <t021>CC3221</t021>
        <t027>CC3479</t027>
        <t030>def motivos_devolucao = CC4009.CC3819('motivos_devolucao')

def variaveisEmail = [:] as HashMap

variaveisEmail.put("nome", CC4009.CC3819('CC3120'));

def motivoDi = motivos_devolucao.find { it.tipo == 'di' }
if(motivoDi != null) {
variaveisEmail.put("motivoDI", motivoDi.descricao[0]);
} else {
variaveisEmail.put("motivoDI", "");
}

def motivoSelfie = motivos_devolucao.find { it.tipo == 'selfie' }
if(motivoSelfie != null) {
variaveisEmail.put("motivoSelfie", motivoSelfie.descricao[0]);
} else {
variaveisEmail.put("motivoSelfie", "");
}

CC4009.CC3850("CC0736", variaveisEmail);</t030>
      </t031>
      <t032 id="CC3221" sourceRef="CC2543" targetRef="CC0145" />
      <t032 id="CC3479" sourceRef="CC0145" targetRef="CC2886" />
    </t036>
    <t028 id="CC2529">
      <t021>CC3595</t021>
      <t027>CC3548</t027>
      <t027>CC3445</t027>
    </t028>
    <t018 id="CC2551" default="CC3292">
      <t021>CC3500</t021>
      <t021>CC3326</t021>
      <t027>CC3292</t027>
    </t018>
    <t032 id="CC3595" name="sim" sourceRef="CC2520" targetRef="CC2529">
      <t008 xsi:type="bpmn:tFormalExpression">${(segmento_inicial == "3" &amp;&amp; cod_segmento == "L" || segmento_inicial == "3" &amp;&amp; cod_segmento == "4") ||
(segmento_inicial == "L" &amp;&amp; cod_segmento == "4") ||
segmento_inicial == "I" &amp;&amp; (cod_segmento == "L" || cod_segmento == "4") || resultado_analise_score_biometria == 'wayout' || (situacao_especial != "Nenhuma" &amp;&amp; situacao_especial != "nenhuma")}</t008>
    </t032>
    <t032 id="CC3493" name="Não" sourceRef="CC2520" targetRef="CC1696" />
    <t032 id="CC3548" sourceRef="CC2529" targetRef="CC0382" />
    <t032 id="CC3445" sourceRef="CC2529" targetRef="CC2709" />
    <t032 id="CC3668" sourceRef="CC2709" targetRef="CC1694" />
    <t012 id="CC2921">
      <t021>CC3508</t021>
      <t021>CC3504</t021>
    </t012>
    <t032 id="CC3508" sourceRef="CC0382" targetRef="CC2921" />
    <t032 id="CC3497" sourceRef="CC3036" targetRef="CC1227" />
    <t023 id="CC2990" name="CC1164">
      <t021>CC3308</t021>
      <t024 id="CC0567" name="CC1192" />
    </t023>
    <t001 id="CC3036" name="CC3891" attachedToRef="CC1694">
      <t027>CC3497</t027>
      <t016 id="CC0223" escalationRef="CC1263" />
    </t001>
    <t036 id="CC1696">
      <t021>CC3493</t021>
      <t027>CC3353</t027>
      <t035 id="CC2991">
        <t027>CC3403</t027>
      </t035>
      <t003 id="CC0607" name="CC0854" calledElement="CC0819">
        <t019>
          <t062 variables="all" />
          <t057 variables="all" />
          <t057 businessKey="#{CC3826}" />
        </t019>
        <t021>CC3403</t021>
        <t027>CC3346</t027>
      </t003>
      <t012 id="CC2999">
        <t021>CC3346</t021>
      </t012>
      <t043 id="CC0952" name="Erro CC4382">
        <t019>
          <t055>
            <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          </t055>
        </t019>
        <t021>CC3380</t021>
        <t027>CC3360</t027>
      </t043>
      <t033 id="CC0878" name="CC0377" CC0630="#{CC0676}">
        <t019>
          <t058>
            <t059 name="CC3826">${CC3826}</t059>
            <t059 name="CC2720">8</t059>
            <t059 name="CC1214">
              <t061>
                <t050 key="motivo_reprova">$</t050>
                <t050 key="resultado_analise">$</t050>
              </t061>
            </t059>
            <t059 name="CC2802">
              <t061>
                <t050 key="motivo_reprova">CC1260</t050>
                <t050 key="resultado_analise">${conclusao_analise_fraude}</t050>
              </t061>
            </t059>
          </t058>
        </t019>
        <t021>CC3492</t021>
        <t027>CC3317</t027>
      </t033>
      <t023 id="CC3035" name="Erro">
        <t021>CC3357</t021>
        <t021>CC3360</t021>
        <t016 id="CC0232" escalationRef="CC1265" />
      </t023>
      <t032 id="CC3346" sourceRef="CC0607" targetRef="CC2999" />
      <t032 id="CC3403" sourceRef="CC2991" targetRef="CC0607" />
      <t001 id="CC2931" attachedToRef="CC0952">
        <t027>CC3357</t027>
        <t042 id="CC0507">
          <t041 xsi:type="bpmn:tFormalExpression">PT10M</t041>
        </t042>
      </t001>
      <t033 id="CC1045" name="CC0999" CC0630="${CC0676}">
        <t019>
          <t058>
            <t059 name="CC3826">${CC3826}</t059>
            <t059 name="CC2720">4</t059>
            <t059 name="CC1214">
              <t061>
                <t050 key="motivo_reprova">$</t050>
                <t050 key="resultado_analise">$</t050>
              </t061>
            </t059>
            <t059 name="CC2802">
              <t061>
                <t050 key="motivo_reprova">CC1662</t050>
                <t050 key="resultado_analise">${conclusao_analise_fraude}</t050>
              </t061>
            </t059>
          </t058>
        </t019>
        <t021>CC3322</t021>
        <t027>CC3523</t027>
      </t033>
      <t032 id="CC3357" sourceRef="CC2931" targetRef="CC3035" />
      <t018 id="CC2563" default="CC3380">
        <t021>CC3317</t021>
        <t021>CC3523</t021>
        <t027>CC3380</t027>
      </t018>
      <t032 id="CC3317" sourceRef="CC0878" targetRef="CC2563" />
      <t032 id="CC3523" sourceRef="CC1045" targetRef="CC2563" />
      <t032 id="CC3380" sourceRef="CC2563" targetRef="CC0952" />
      <t001 id="CC2925" attachedToRef="CC0607">
        <t027>CC3322</t027>
        <t016 id="CC0221" escalationRef="CC1269" />
      </t001>
      <t032 id="CC3322" sourceRef="CC2925" targetRef="CC1045" />
      <t001 id="CC2972" attachedToRef="CC0607">
        <t027>CC3492</t027>
        <t014 id="CC0438" />
      </t001>
      <t032 id="CC3492" sourceRef="CC2972" targetRef="CC0878" />
      <t032 id="CC3360" sourceRef="CC0952" targetRef="CC3035" />
    </t036>
    <t028 id="CC2601">
      <t021>CC3353</t021>
      <t027>CC3645</t027>
      <t027>CC3500</t027>
    </t028>
    <t012 id="CC2951">
      <t021>CC3455</t021>
    </t012>
    <t032 id="CC3645" sourceRef="CC2601" targetRef="CC3747" />
    <t032 id="CC3353" sourceRef="CC1696" targetRef="CC2601" />
    <t032 id="CC3500" sourceRef="CC2601" targetRef="CC2551" />
    <t043 id="CC3747" name="CC3684">
      <t019>
        <t055>
          <t056 id="CC4178" label="CC4143" type="domain" />
          <t056 id="CC4330" label="CC4304" type="domain" />
          <t056 id="CC4422" label="Dac" type="domain" />
          <t056 id="CC3120" label="Nome Completo" type="domain" defaultValue="${CC3120}" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC4129" label="CC4080" type="domain" />
          <t056 id="CC0741" label="Declarou receber Salário" type="domain" defaultValue="${execution.hasVariable(&quot;receber_salario&quot;) ? receber_salario : false }" />
        </t055>
      </t019>
      <t021>CC3645</t021>
      <t027>CC3455</t027>
    </t043>
    <t032 id="CC3455" sourceRef="CC3747" targetRef="CC2951" />
    <t001 id="CC2996" name="CC3878" attachedToRef="CC1694">
      <t027>CC3621</t027>
      <t016 id="CC0230" escalationRef="CC1269" />
    </t001>
    <t023 id="CC2930" name="CC1164">
      <t021>CC3210</t021>
      <t024 id="CC0560" name="CC1192" />
    </t023>
    <t032 id="CC3621" sourceRef="CC2996" targetRef="CC0967" />
    <t032 id="CC3364" sourceRef="CC1694" targetRef="CC0699" />
    <t032 id="CC3292" sourceRef="CC2551" targetRef="CC0538" />
    <t033 id="CC0967" name="CC0999" CC0630="${CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">13</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="motivo_cancelamento">$</t050>
              <t050 key="resultado_analise">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="motivo_cancelamento">CC0476</t050>
              <t050 key="resultado_analise">${conclusao_analise_fraude}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3621</t021>
      <t027>CC3210</t027>
    </t033>
    <t032 id="CC3210" sourceRef="CC0967" targetRef="CC2930" />
    <t033 id="CC1227" name="CC0728" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">87</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="motivo_cancelamento">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="motivo_cancelamento">CC0842</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3497</t021>
      <t027>CC3308</t027>
    </t033>
    <t032 id="CC3308" sourceRef="CC1227" targetRef="CC2990" />
    <t001 id="CC2878" attachedToRef="CC1696">
      <t027>CC3605</t027>
      <t016 id="CC0227" escalationRef="CC1265" />
    </t001>
    <t023 id="CC3042" name="CC1164">
      <t021>CC3605</t021>
      <t024 id="CC0569" name="CC1192" />
    </t023>
    <t032 id="CC3605" sourceRef="CC2878" targetRef="CC3042" />
    <t001 id="CC3041" attachedToRef="CC1694">
      <t027>CC3394</t027>
      <t016 id="CC0225" escalationRef="CC1265" />
    </t001>
    <t023 id="CC2923" name="CC1164">
      <t021>CC3394</t021>
      <t024 id="CC0563" name="CC1192" />
    </t023>
    <t032 id="CC3394" sourceRef="CC3041" targetRef="CC2923" />
    <t033 id="CC0699" name="CC0576" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">1</t059>
          <t059 name="CC1214">
            <t061 />
          </t059>
          <t059 name="CC2802">
            <t061 />
          </t059>
        </t058>
      </t019>
      <t021>CC3364</t021>
      <t027>CC3326</t027>
    </t033>
    <t032 id="CC3326" sourceRef="CC0699" targetRef="CC2551" />
    <t032 id="CC3554" sourceRef="CC2517" targetRef="CC2820" />
    <t028 id="CC2517">
      <t021>CC3334</t021>
      <t027>CC3554</t027>
      <t027>CC3586</t027>
    </t028>
    <t028 id="CC2533" CC1191="true">
      <t021>CC3658</t021>
      <t021>CC3460</t021>
      <t027>CC3355</t027>
    </t028>
    <t032 id="CC3586" sourceRef="CC2517" targetRef="CC0370" />
    <t032 id="CC3460" sourceRef="CC0370" targetRef="CC2533" />
    <t001 id="CC3038" name="CC0826" attachedToRef="CC1694">
      <t027>CC3178</t027>
      <t016 id="CC0229" escalationRef="CC1267" />
    </t001>
    <t033 id="CC1226" name="CC0300" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">87</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="motivo_reprova">$</t050>
              <t050 key="resultado_analise">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="motivo_reprova">CC1375</t050>
              <t050 key="resultado_analise">${conclusao_analise_fraude}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3178</t021>
      <t027>CC3407</t027>
    </t033>
    <t032 id="CC3178" sourceRef="CC3038" targetRef="CC1226" />
    <t023 id="CC3046" name="CC1164">
      <t021>CC3407</t021>
      <t024 id="CC0564" name="CC1192" />
    </t023>
    <t032 id="CC3407" sourceRef="CC1226" targetRef="CC3046" />
    <t001 id="CC3010" name="CC2858" attachedToRef="CC1696">
      <t027>CC3180</t027>
      <t016 id="CC0226" escalationRef="CC1267" />
    </t001>
    <t033 id="CC0841" name="CC0300" CC0630="${CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">87</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="motivo_reprova">$</t050>
              <t050 key="resultado_analise">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="motivo_reprova">CC1375</t050>
              <t050 key="resultado_analise">${conclusao_analise_fraude}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3180</t021>
      <t027>CC3252</t027>
    </t033>
    <t023 id="CC3015" name="CC1164">
      <t021>CC3252</t021>
      <t024 id="CC0559" name="CC1192" />
    </t023>
    <t032 id="CC3180" sourceRef="CC3010" targetRef="CC0841" />
    <t032 id="CC3252" sourceRef="CC0841" targetRef="CC3015" />
    <t033 id="CC1216" name="CC2632" camunda:type="external" CC3089="creditos-v1-calculo_limite_abertura_contas">
      <t019>
        <t058>
          <t059 name="CC3102">
            <t061>
              <t050 key="CC3749">004</t050>
              <t050 key="codigo_compensacao_banco">341</t050>
              <t050 key="codigo_segmento">${CC4129}</t050>
              <t050 key="CC3856">F</t050>
              <t050 key="CC4178">${CC4178}</t050>
              <t050 key="CC4330">${CC4330}</t050>
              <t050 key="CC4422">${CC4422}</t050>
              <t050 key="CC4421">${cpf.substring(0,9)}</t050>
              <t050 key="CC4013">${(execution.hasVariable("encarteiramento_manual_gq") &amp;&amp; encarteiramento_manual_gq == "true") ? funcional : http_gq_consulta_encarteiramento_conta["funcional"]}</t050>
              <t050 key="regiao">${CC0243}</t050>
              <t050 key="indicador_beneficiario_inss">N</t050>
              <t050 key="identificador_origem">CC4380</t050>
              <t050 key="indicador_menor_emancipado">N</t050>
            </t061>
          </t059>
          <t063 name="CC0807">
            <t061>
              <t050 key="valor_maximo_cartao_credito">${valor_maximo_cartao_credito}</t050>
              <t050 key="valor_lis_pre_aprovado">${valor_lis_pre_aprovado}</t050>
              <t050 key="valor_maximo_crediario">${valor_maximo_crediario}</t050>
              <t050 key="valor_consorcio">${valor_consorcio}</t050>
              <t050 key="valor_crediario_consignacao">${valor_crediario_consignacao}</t050>
              <t050 key="valor_credito_imobiliario">${valor_credito_imobiliario}</t050>
              <t050 key="classificacao_filtro_cliente">${classificacao_filtro_cliente}</t050>
              <t050 key="codigo_estrela_conta_corrente">${codigo_estrela_conta_corrente}</t050>
              <t050 key="data_abertura">${data_abertura}</t050>
              <t050 key="filtro_retencao_cliente">${filtro_retencao_cliente}</t050>
              <t050 key="indicador_funcionario_publico">${indicador_funcionario_publico}</t050>
              <t050 key="valor_upa">${valor_upa}</t050>
              <t050 key="codigo_metodologia">${codigo_metodologia}</t050>
              <t050 key="identificador_spi_qualificado">${identificador_spi_qualificado}</t050>
              <t050 key="identificador_spi">${identificador_spi}</t050>
              <t050 key="identificador_publico_diferenciado">${identificador_publico_diferenciado}</t050>
              <t050 key="indicador_segmento_empresa">${indicador_segmento_empresa}</t050>
              <t050 key="classificacao_folha_empresa">${classificacao_folha_empresa}</t050>
              <t050 key="codigo_origem">${codigo_origem}</t050>
              <t050 key="codigo_origem">${codigo_origem}</t050>
              <t050 key="fluxo_puc">false</t050>
            </t061>
          </t063>
        </t058>
      </t019>
      <t021>CC3294</t021>
      <t021>CC3556</t021>
      <t027>CC3646</t027>
    </t033>
    <t032 id="CC3395" sourceRef="CC2593" targetRef="CC0540" />
    <t018 id="CC2564" default="CC3181">
      <t021>CC3264</t021>
      <t021>CC3646</t021>
      <t027>CC3181</t027>
    </t018>
    <t032 id="CC3181" sourceRef="CC2564" targetRef="CC2604" />
    <t032 id="CC3646" sourceRef="CC1216" targetRef="CC2564" />
    <t032 id="CC3579" sourceRef="CC2619" targetRef="CC0798" />
    <t032 id="CC3450" sourceRef="CC2619" targetRef="CC4136" />
    <t022 id="CC4136" name="Trava R0">
      <t021>CC3450</t021>
      <t027>CC3529</t027>
      <t042 id="CC0498">
        <t040 xsi:type="bpmn:tFormalExpression">* * 19-7 ? * * *</t040>
      </t042>
    </t022>
    <t017 id="CC2619">
      <t021>CC3632</t021>
      <t027>CC3579</t027>
      <t027>CC3450</t027>
    </t017>
    <t022 id="CC2726" name="11h">
      <t021>CC3529</t021>
      <t027>CC3556</t027>
      <t042 id="CC0524">
        <t041 xsi:type="bpmn:tFormalExpression">PT11H</t041>
      </t042>
    </t022>
    <t032 id="CC3529" sourceRef="CC4136" targetRef="CC2726" />
    <t032 id="CC3556" sourceRef="CC2726" targetRef="CC1216" />
    <t032 id="CC3294" sourceRef="CC0798" targetRef="CC1216" />
    <t036 id="CC1697" name="CC0330" CC0816>
      <t018 id="CC2516" name="CC2856" default="CC3341">
        <t021>CC3202</t021>
        <t027>CC3336</t027>
        <t027>CC3341</t027>
      </t018>
      <t012 id="CC3008">
        <t021>CC3336</t021>
      </t012>
      <t032 id="CC3336" name="Sim" sourceRef="CC2516" targetRef="CC3008">
        <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('conta_aberta') &amp;&amp; conta_aberta == true}</t008>
      </t032>
      <t032 id="CC3341" name="Não" sourceRef="CC2516" targetRef="CC0590" />
      <t035 id="CC2888" CC1191="true" isInterrupting="false">
        <t027>CC3202</t027>
        <t026 id="CC0339" messageRef="CC2627" />
      </t035>
      <t032 id="CC3202" sourceRef="CC2888" targetRef="CC2516" />
      <t012 id="CC1270">
        <t021>CC3468</t021>
        <t014 id="CC0410" errorRef="CC2861" />
      </t012>
      <t033 id="CC0590" name="CC0238" camunda:type="external" CC3089="CC1209">
        <t011>CC0036


Link Git --&gt; «U000036»</t011>
        <t019>
          <t058>
            <t059 name="CC0736">
              <t061>
                <t050 key="nome">${CC3120}</t050>
              </t061>
            </t059>
            <t059 name="CC2842">CC4389</t059>
            <t059 name="CC3750">Nenhum</t059>
            <t059 name="CC1377">${CC4331}</t059>
            <t059 name="CC3092">""</t059>
            <t059 name="CC1030">34</t059>
            <t059 name="CC2656">${segmento == "4" ? "CC0766" : "CC0925"}</t059>
            <t059 name="CC3822">CC0155</t059>
            <t059 name="remetente">
              <t061>
                <t050 key="nome">CC1613</t050>
                <t050 key="CC4331">«EMAIL»</t050>
              </t061>
            </t059>
          </t058>
        </t019>
        <t021>CC3341</t021>
        <t027>CC3468</t027>
      </t033>
      <t032 id="CC3468" sourceRef="CC0590" targetRef="CC1270" />
    </t036>
    <t022 id="CC0349" name="CC2046">
      <t027>CC3291</t027>
      <t024 id="CC0570" name="CC2668" />
    </t022>
    <t012 id="CC3019">
      <t021>CC3581</t021>
      <t037 id="CC0263" />
    </t012>
    <t033 id="CC1359" name="CC1410" CC0630="${CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">3</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="motivo_cancelamento">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="motivo_cancelamento">CC2047</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3291</t021>
      <t027>CC3581</t027>
    </t033>
    <t032 id="CC3291" sourceRef="CC0349" targetRef="CC1359" />
    <t032 id="CC3581" sourceRef="CC1359" targetRef="CC3019" />
    <t002 id="CC0779" name="CC0359" camunda:resultVariable="CC0247" camunda:decisionRef="CC0309" camunda:mapDecisionResult="singleEntry">
      <t021>CC3650</t021>
      <t027>CC3462</t027>
    </t002>
    <t018 id="CC2532" name="CC0763" default="CC3383">
      <t021>CC3462</t021>
      <t027>CC3383</t027>
      <t027>CC3506</t027>
    </t018>
    <t012 id="CC2961">
      <t021>CC3666</t021>
      <t037 id="CC0267" />
    </t012>
    <t043 id="CC1363" name="CC1254">
      <t019>
        <t055>
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
        </t055>
      </t019>
      <t021>CC3235</t021>
      <t027>CC3671</t027>
    </t043>
    <t033 id="CC0603" name="CC0302" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">13</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="CC0247">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="CC0247">${execution.hasVariable('resultado_analise_score_biometria') ? resultado_analise_score_biometria :
"Biometria não aprovada"}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3671</t021>
      <t021>CC3451</t021>
      <t027>CC3666</t027>
    </t033>
    <t001 id="CC2911" cancelActivity="false" attachedToRef="CC1363">
      <t027>CC3451</t027>
      <t042 id="CC0504">
        <t041 xsi:type="bpmn:tFormalExpression">PT3M</t041>
      </t042>
    </t001>
    <t032 id="CC3462" sourceRef="CC0779" targetRef="CC2532" />
    <t032 id="CC3383" name="Aprovado" sourceRef="CC2532" targetRef="CC2557" />
    <t032 id="CC3273" name="CC4290" sourceRef="CC3806" targetRef="CC3918">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('voltar') &amp;&amp; voltar=="dados_nome"}</t008>
    </t032>
    <t032 id="CC3295" name="CC4290" sourceRef="CC2803" targetRef="CC3806">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('voltar') &amp;&amp; voltar=="dados_email"}</t008>
    </t032>
    <t032 id="CC3232" name="CC4290" sourceRef="CC0945" targetRef="CC2803">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('voltar') &amp;&amp; voltar=="dados_telefone"}</t008>
    </t032>
    <t001 id="CC2995" attachedToRef="CC3918">
      <t027>CC3657</t027>
      <t042 id="CC0512">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t032 id="CC3657" sourceRef="CC2995" targetRef="CC2980" />
    <t012 id="CC2980" name="CC1660">
      <t021>CC3657</t021>
      <t014 id="CC0457" errorRef="CC2870" />
    </t012>
    <t001 id="CC3040" attachedToRef="CC3806">
      <t027>CC3411</t027>
      <t042 id="CC0489">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t032 id="CC3411" sourceRef="CC3040" targetRef="CC3043" />
    <t012 id="CC3043" name="CC1660">
      <t021>CC3411</t021>
      <t014 id="CC0409" errorRef="CC2870" />
    </t012>
    <t001 id="CC2919" attachedToRef="CC2803">
      <t027>CC3249</t027>
      <t042 id="CC0510">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t032 id="CC3249" sourceRef="CC2919" targetRef="CC3031" />
    <t012 id="CC3031" name="CC1660">
      <t021>CC3249</t021>
      <t014 id="CC0431" errorRef="CC2870" />
    </t012>
    <t001 id="CC2947" attachedToRef="CC0945">
      <t027>CC3574</t027>
      <t042 id="CC0487">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t032 id="CC3574" sourceRef="CC2947" targetRef="CC3014" />
    <t012 id="CC3014" name="CC1660">
      <t021>CC3574</t021>
      <t014 id="CC0369" errorRef="CC2870" />
    </t012>
    <t032 id="CC3310" name="CC4290" sourceRef="CC2801" targetRef="CC3807">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('voltar') &amp;&amp; voltar=="dados_renda"}</t008>
    </t032>
    <t032 id="CC3615" sourceRef="CC4003" targetRef="CC2530" />
    <t032 id="CC3606" name="não" sourceRef="CC2562" targetRef="CC2530">
      <t008 xsi:type="bpmn:tFormalExpression">${declaracao_nif == false}</t008>
    </t032>
    <t032 id="CC3376" name="CC4290" sourceRef="CC3807" targetRef="CC0945">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('voltar') &amp;&amp; voltar=="dados_data_nascimento"}</t008>
    </t032>
    <t001 id="CC3037" attachedToRef="CC3807">
      <t027>CC3271</t027>
      <t042 id="CC0481">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t032 id="CC3271" sourceRef="CC3037" targetRef="CC2959" />
    <t012 id="CC2959" name="CC1660">
      <t021>CC3271</t021>
      <t014 id="CC0464" errorRef="CC2870" />
    </t012>
    <t032 id="CC3412" sourceRef="CC4003" targetRef="CC2801">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('voltar') &amp;&amp; voltar=="dados_endereco"}</t008>
    </t032>
    <t032 id="CC3433" sourceRef="CC2953" targetRef="CC2912" />
    <t012 id="CC2912" name="CC1660">
      <t021>CC3433</t021>
      <t014 id="CC0430" errorRef="CC2870" />
    </t012>
    <t001 id="CC2953" attachedToRef="CC2801">
      <t027>CC3433</t027>
      <t042 id="CC0515">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t032 id="CC3255" name="CC4290" sourceRef="CC1401" targetRef="CC2801">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('voltar') &amp;&amp; voltar=="dados_endereco"}</t008>
    </t032>
    <t001 id="CC2915" attachedToRef="CC1401">
      <t027>CC3461</t027>
      <t042 id="CC0482">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t032 id="CC3461" sourceRef="CC2915" targetRef="CC3025" />
    <t012 id="CC3025" name="CC1660">
      <t021>CC3461</t021>
      <t014 id="CC0460" errorRef="CC2870" />
    </t012>
    <t001 id="CC2946" attachedToRef="CC4003">
      <t027>CC3426</t027>
      <t042 id="CC0488">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t032 id="CC3426" sourceRef="CC2946" targetRef="CC2968" />
    <t012 id="CC2968">
      <t021>CC3426</t021>
      <t014 id="CC0461" errorRef="CC2870" />
    </t012>
    <t032 id="CC3650" sourceRef="CC2671" targetRef="CC0779" />
    <t043 id="CC2671" name="CC2050" default="CC3650">
      <t019>
        <t055>
          <t056 id="CC2024" type="string" />
          <t056 id="CC1669" type="string" />
          <t056 id="CC2719" type="string" />
          <t056 id="CC1405" type="string" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC4018" type="boolean" />
          <t056 id="CC3797" type="string" />
          <t056 id="CC3798" type="string" />
          <t056 id="CC1373" type="string" />
          <t056 id="CC0678" type="string" />
        </t055>
        <t058>
          <t063 name="CC3108">CC2671</t063>
        </t058>
      </t019>
      <t021>CC3299</t021>
      <t021>CC3507</t021>
      <t021>CC3338</t021>
      <t027>CC3650</t027>
      <t027>CC3299</t027>
      <t027>CC3423</t027>
    </t043>
    <t022 id="CC0815" name="CC2852">
      <t021>CC3467</t021>
      <t027>CC3575</t027>
      <t042 id="CC0518">
        <t041 xsi:type="bpmn:tFormalExpression">P1D</t041>
      </t042>
    </t022>
    <t032 id="CC3467" sourceRef="CC0927" targetRef="CC0815" />
    <t018 id="CC2611">
      <t021>CC3618</t021>
      <t021>CC3672</t021>
      <t027>CC3573</t027>
    </t018>
    <t032 id="CC3575" sourceRef="CC0815" targetRef="CC2796" />
    <t032 id="CC3618" sourceRef="CC0800" targetRef="CC2611" />
    <t043 id="CC3095" name="CC2041" default="CC3324">
      <t019>
        <t055>
          <t056 id="CC2694" type="domain" />
          <t056 id="CC2021" type="boolean" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC4290" type="string" defaultValue="continuar" />
          <t056 id="CC0284" type="domain" defaultValue="${execution.hasVariable('limiterotativo_credito_v3_aberturacontas_resposta') ?&#10;limiterotativo_credito_v3_aberturacontas_resposta['valor_lis_pre_aprovado'] : null}" />
          <t056 id="CC0182" type="domain" defaultValue="${execution.hasVariable('limiterotativo_credito_v3_aberturacontas_resposta') ?&#10;limiterotativo_credito_v3_aberturacontas_resposta['valor_cartao_pre_aprovado'] : null}" />
        </t055>
        <t058>
          <t063 name="CC3108">CC3095</t063>
        </t058>
      </t019>
      <t021>CC3319</t021>
      <t021>CC3629</t021>
      <t027>CC3324</t027>
      <t027>CC3507</t027>
    </t043>
    <t032 id="CC3324" sourceRef="CC3095" targetRef="CC2523" />
    <t001 id="CC2938" attachedToRef="CC3095">
      <t027>CC3195</t027>
      <t042 id="CC0527">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t012 id="CC2942" name="CC1660">
      <t021>CC3195</t021>
      <t014 id="CC0468" errorRef="CC2870" />
    </t012>
    <t032 id="CC3195" sourceRef="CC2938" targetRef="CC2942" />
    <t032 id="CC3299" sourceRef="CC2671" targetRef="CC2671">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.getVariable('status_biometria') != "PROCESSADO"}</t008>
    </t032>
    <t043 id="CC0859" name="CC0857">
      <t019>
        <t055>
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
        </t055>
      </t019>
      <t021>CC3423</t021>
      <t027>CC3604</t027>
    </t043>
    <t032 id="CC3423" sourceRef="CC2671" targetRef="CC0859">
      <t008 xsi:type="bpmn:tFormalExpression">${status_biometria == "PROCESSADO" &amp;&amp; tracking_biometria == "tentativas_excedidas"}</t008>
    </t032>
    <t032 id="CC3604" sourceRef="CC0859" targetRef="CC0314" />
    <t032 id="CC3596" sourceRef="CC2986" targetRef="CC0314" />
    <t033 id="CC0314" name="CC0301" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">13</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="CC1405">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="CC1405">${execution.hasVariable('tracking_biometria') ? tracking_biometria : "Tentativas Excedidas"}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3604</t021>
      <t021>CC3596</t021>
      <t027>CC3444</t027>
    </t033>
    <t012 id="CC2978">
      <t021>CC3444</t021>
      <t037 id="CC0266" />
    </t012>
    <t032 id="CC3444" sourceRef="CC0314" targetRef="CC2978" />
    <t001 id="CC2986" cancelActivity="false" attachedToRef="CC0859">
      <t027>CC3596</t027>
      <t042 id="CC0501">
        <t041 xsi:type="bpmn:tFormalExpression">PT3M</t041>
      </t042>
    </t001>
    <t001 id="CC2905" attachedToRef="CC2671">
      <t027>CC3250</t027>
      <t042 id="CC0521">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t012 id="CC2876" name="CC1660">
      <t021>CC3250</t021>
      <t014 id="CC0445" errorRef="CC2870" />
    </t012>
    <t032 id="CC3250" sourceRef="CC2905" targetRef="CC2876" />
    <t033 id="CC2796" name="CC2045" camunda:type="external" CC3089="CC0205">
      <t019>
        <t058>
          <t059 name="CC4115">004341${CC4178}${CC4330}${CC4422}</t059>
        </t058>
        <t051 event="start">
          <t066 scriptFormat="groovy">def tentativa = CC4009.hasVariable("tentativas_consulta_conta") ? CC4009.CC3819("tentativas_consulta_conta") : 0

tentativa = tentativa + 1

CC4009.CC3850("tentativas_consulta_conta", tentativa)</t066>
        </t051>
      </t019>
      <t021>CC3598</t021>
      <t021>CC3575</t021>
      <t027>CC3640</t027>
    </t033>
    <t018 id="CC2553" name="CC0041">
      <t021>CC3222</t021>
      <t027>CC3672</t027>
      <t027>CC3519</t027>
    </t018>
    <t012 id="CC0768" name="CC1606">
      <t021>CC3559</t021>
      <t014 id="CC0456" errorRef="CC2865" />
    </t012>
    <t022 id="CC0469" name="CC2851">
      <t021>CC3318</t021>
      <t027>CC3598</t027>
      <t042 id="CC0517">
        <t041 xsi:type="bpmn:tFormalExpression">P1D</t041>
      </t042>
    </t022>
    <t018 id="CC2522" name="CC0990" default="CC3222">
      <t021>CC3640</t021>
      <t027>CC3222</t027>
      <t027>CC3318</t027>
      <t027>CC3219</t027>
    </t018>
    <t033 id="CC0879" name="CC0840" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">3</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="motivo_cancelamento">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="motivo_cancelamento">${motivo_cancelamento}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3617</t021>
      <t021>CC3421</t021>
      <t027>CC3559</t027>
    </t033>
    <t032 id="CC3598" sourceRef="CC0469" targetRef="CC2796" />
    <t032 id="CC3640" sourceRef="CC2796" targetRef="CC2522" />
    <t032 id="CC3222" name="Sim" sourceRef="CC2522" targetRef="CC2553" />
    <t032 id="CC3672" name="Sim" sourceRef="CC2553" targetRef="CC2611">
      <t019>
        <t051 expression="${execution.setVariable('conta_aberta','true')}" event="take" />
        <t051 expression="${execution.setVariable('response_abertura_conta',responseConsultaConta[0])}" event="take" />
      </t019>
    </t032>
    <t032 id="CC3519" name="Não" sourceRef="CC2553" targetRef="CC0589">
      <t008 xsi:type="bpmn:tFormalExpression">${responseConsultaConta[0].numero_unico_cliente != id_pessoa }</t008>
    </t032>
    <t032 id="CC3559" sourceRef="CC0879" targetRef="CC0768" />
    <t032 id="CC3318" name="Não" sourceRef="CC2522" targetRef="CC0469">
      <t008 xsi:type="bpmn:tFormalExpression">${responseConsultaConta == null &amp;&amp; tentativas_consulta_conta &lt; 3 }</t008>
    </t032>
    <t032 id="CC3219" name="CC0138" sourceRef="CC2522" targetRef="CC0195">
      <t008 xsi:type="bpmn:tFormalExpression">${responseConsultaConta == null &amp;&amp; tentativas_consulta_conta &gt;= 3}</t008>
    </t032>
    <t023 id="CC0195" name="CC0117">
      <t019>
        <t051 event="start">
          <t066 scriptFormat="groovy">CC4009.CC3850("motivo_cancelamento", "CC4304 não efetivada no prazo de 48h")</t066>
        </t051>
      </t019>
      <t021>CC3219</t021>
      <t027>CC3617</t027>
    </t023>
    <t032 id="CC3617" sourceRef="CC0195" targetRef="CC0879" />
    <t023 id="CC0589" name="CC0117">
      <t019>
        <t051 event="start">
          <t066 scriptFormat="groovy">CC4009.CC3850("motivo_cancelamento", "CC4304 efetivada por CC4016 diferente da CC4199")</t066>
        </t051>
      </t019>
      <t021>CC3519</t021>
      <t027>CC3421</t027>
    </t023>
    <t032 id="CC3421" sourceRef="CC0589" targetRef="CC0879" />
    <t036 id="CC1708" name="CC0021" CC0816>
      <t012 id="CC2877">
        <t021>CC3333</t021>
        <t037 id="CC0271" />
      </t012>
      <t035 id="CC0769" name="CC0368">
        <t027>CC3333</t027>
        <t014 id="CC0451" errorRef="CC2874" camunda:errorCodeVariable="codigo_erro" camunda:errorMessageVariable="CC3117" />
      </t035>
      <t032 id="CC3333" sourceRef="CC0769" targetRef="CC2877" />
    </t036>
    <t001 id="CC3001" name="CC0846" attachedToRef="CC1694">
      <t027>CC3552</t027>
      <t016 id="CC0224" escalationRef="CC1262" />
    </t001>
    <t033 id="CC0315" name="CC1605" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">3</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="motivo_cancelamento">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="motivo_cancelamento">CC0470</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3552</t021>
      <t027>CC3293</t027>
    </t033>
    <t023 id="CC3044" name="CC0651">
      <t021>CC3293</t021>
      <t026 id="CC0340" messageRef="CC2625" CC1366="${runtimeService.createMessageCorrelation(&quot;CC0789&quot;).processInstanceVariableEquals(&quot;id_proposta&quot;, id_proposta).correlate()}" />
    </t023>
    <t032 id="CC3552" sourceRef="CC3001" targetRef="CC0315" />
    <t032 id="CC3293" sourceRef="CC0315" targetRef="CC3044" />
    <t018 id="CC2557" default="CC3652">
      <t021>CC3383</t021>
      <t021>CC3345</t021>
      <t027>CC3652</t027>
    </t018>
    <t032 id="CC3652" sourceRef="CC2557" targetRef="CC2610" />
    <t043 id="CC0386" name="CC0367">
      <t019>
        <t055>
          <t056 id="CC0950" type="string">
            <t068>
              <t049 name="required" />
            </t068>
          </t056>
          <t056 id="CC2004" type="string">
            <t064>
              <t065 id="CC4126" />
            </t064>
            <t068>
              <t049 name="required" />
            </t068>
          </t056>
          <t056 id="CC2846" type="string">
            <t064>
              <t065 id="CC4126" />
            </t064>
            <t068>
              <t049 name="required" />
            </t068>
          </t056>
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC4290" type="string" defaultValue="continuar" />
          <t056 id="CC2695" type="string">
            <t064>
              <t065 id="CC4126" />
            </t064>
            <t068>
              <t049 name="required" />
            </t068>
          </t056>
        </t055>
        <t058>
          <t059 name="CC0535">
            <t060>
              <t069>CC2846</t069>
              <t069>CC2004</t069>
              <t069>CC2695</t069>
            </t060>
          </t059>
          <t063 name="CC3108">CC0386</t063>
        </t058>
      </t019>
      <t021>CC3458</t021>
      <t027>CC3345</t027>
    </t043>
    <t001 id="CC2901" cancelActivity="false" attachedToRef="CC0386">
      <t027>CC3436</t027>
      <t042 id="CC0485">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t032 id="CC3345" sourceRef="CC0386" targetRef="CC2557" />
    <t012 id="CC2918" name="CC1660">
      <t021>CC3436</t021>
      <t014 id="CC0434" errorRef="CC2870" />
    </t012>
    <t032 id="CC3436" sourceRef="CC2901" targetRef="CC2918" />
    <t018 id="CC2598" default="CC3235">
      <t021>CC3506</t021>
      <t027>CC3235</t027>
      <t027>CC3458</t027>
    </t018>
    <t032 id="CC3235" name="Recusada" sourceRef="CC2598" targetRef="CC1363" />
    <t032 id="CC3666" sourceRef="CC0603" targetRef="CC2961" />
    <t032 id="CC3671" sourceRef="CC1363" targetRef="CC0603" />
    <t032 id="CC3451" sourceRef="CC2911" targetRef="CC0603" />
    <t032 id="CC3506" sourceRef="CC2532" targetRef="CC2598">
      <t008 xsi:type="bpmn:tFormalExpression">${(resultado_analise_score_biometria !=
'biometria_aprovada' )}</t008>
    </t032>
    <t032 id="CC3458" name="Wayout" sourceRef="CC2598" targetRef="CC0386">
      <t008 xsi:type="bpmn:tFormalExpression">${(resultado_analise_score_biometria == 'wayout') &amp;&amp; execution.hasVariable('is_wayout') &amp;&amp; is_wayout == true}</t008>
    </t032>
    <t023 id="CC3929" name="CC0658">
      <t019>
        <t051 event="start">
          <t066 scriptFormat="groovy">CC4009.CC3850('CC2005',true)</t066>
        </t051>
      </t019>
      <t021>CC3409</t021>
      <t027>CC3263</t027>
    </t023>
    <t032 id="CC3263" sourceRef="CC3929" targetRef="CC3806" />
    <t036 id="CC1707" name="CC3757" CC0816>
      <t012 id="CC3047">
        <t021>CC3187</t021>
      </t012>
      <t003 id="CC0679" name="AQ4" calledElement="CC1692">
        <t019>
          <t057 variables="all" />
          <t062 variables="all" />
          <t051 event="start">
            <t066 scriptFormat="groovy">CC4009.removeVariable('CC2005')</t066>
          </t051>
          <t057 businessKey="#{CC3826}" />
        </t019>
        <t021>CC3541</t021>
        <t027>CC3187</t027>
      </t003>
      <t032 id="CC3541" sourceRef="CC2005" targetRef="CC0679" />
      <t032 id="CC3187" sourceRef="CC0679" targetRef="CC3047" />
      <t035 id="CC2005" name="CC3758" isInterrupting="false">
        <t019>
          <t051 event="start">
            <t066 scriptFormat="groovy">CC4009.removeVariable('CC2005')</t066>
          </t051>
        </t019>
        <t027>CC3541</t027>
        <t009 id="CC0191" camunda:variableName="CC2005">
          <t007 xsi:type="bpmn:tFormalExpression">${CC2005}</t007>
        </t009>
      </t035>
    </t036>
    <t018 id="CC2588" name="CC0371" default="CC3398">
      <t021>CC3570</t021>
      <t027>CC3398</t027>
      <t027>CC3465</t027>
    </t018>
    <t018 id="CC2581" name="CC3685" default="CC3653">
      <t021>CC3245</t021>
      <t027>CC3288</t027>
      <t027>CC3653</t027>
    </t018>
    <t033 id="CC0146" name="CC0729" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">1</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="analise_de_pld">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="analise_de_pld">${analise_de_pld}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3288</t021>
      <t027>CC3449</t027>
    </t033>
    <t033 id="CC0173" name="CC0619" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">4</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="motivo_reprova">$</t050>
              <t050 key="analise_de_pld">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="motivo_reprova">CC3986</t050>
              <t050 key="analise_de_pld">${analise_de_pld}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3270</t021>
      <t021>CC3254</t021>
      <t027>CC3272</t027>
    </t033>
    <t043 id="CC1977" name="CC1972">
      <t019>
        <t055>
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
        </t055>
      </t019>
      <t021>CC3526</t021>
      <t027>CC3270</t027>
    </t043>
    <t033 id="CC0606" name="CC0203" camunda:type="external" CC3089="CC1209">
      <t011>CC0036


Link Git --&gt; «U000036»</t011>
      <t019>
        <t058>
          <t059 name="CC0736">
            <t061>
              <t050 key="nome">${CC3120}</t050>
            </t061>
          </t059>
          <t059 name="CC2842">CC4389</t059>
          <t059 name="CC3750">Nenhum</t059>
          <t059 name="CC1377">${CC4331}</t059>
          <t059 name="CC3092">""</t059>
          <t059 name="CC1030">34</t059>
          <t059 name="CC2656">${segmento == "4" ? "CC0830" : "CC0993"}</t059>
          <t059 name="CC3822">CC0155</t059>
          <t059 name="remetente">
            <t061>
              <t050 key="nome">CC1613</t050>
              <t050 key="CC4331">«EMAIL»</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3272</t021>
      <t021>CC3282</t021>
      <t027>CC3527</t027>
    </t033>
    <t001 id="CC2967" attachedToRef="CC1977">
      <t027>CC3254</t027>
      <t042 id="CC0494">
        <t041 xsi:type="bpmn:tFormalExpression">PT10M</t041>
      </t042>
    </t001>
    <t032 id="CC3288" name="Sim" sourceRef="CC2581" targetRef="CC0146">
      <t008 xsi:type="bpmn:tFormalExpression">${situacao_analise_pld == 'BAIXO'}</t008>
    </t032>
    <t032 id="CC3449" sourceRef="CC0146" targetRef="CC2608" />
    <t018 id="CC2582" name="CC0839" default="CC3612">
      <t021>CC3205</t021>
      <t027>CC3612</t027>
      <t027>CC3315</t027>
    </t018>
    <t032 id="CC3612" name="Não" sourceRef="CC2582" targetRef="CC2579" />
    <t018 id="CC2579" default="CC3464">
      <t021>CC3612</t021>
      <t021>CC3414</t021>
      <t027>CC3464</t027>
    </t018>
    <t043 id="CC0290" name="CC0272">
      <t019>
        <t055>
          <t056 id="CC0290" type="boolean" />
          <t056 id="CC0098" type="string" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC4290" type="string" defaultValue="continuar" />
          <t056 id="CC0284" type="domain" defaultValue="${execution.hasVariable('limiterotativo_credito_v3_aberturacontas_resposta') ?&#10;limiterotativo_credito_v3_aberturacontas_resposta['valor_lis_pre_aprovado'] : null}" />
          <t056 id="CC0182" type="domain" defaultValue="${execution.hasVariable('limiterotativo_credito_v3_aberturacontas_resposta') ?&#10;limiterotativo_credito_v3_aberturacontas_resposta['valor_cartao_pre_aprovado'] : null}" />
        </t055>
        <t058>
          <t063 name="CC3108">CC0290</t063>
        </t058>
      </t019>
      <t021>CC3315</t021>
      <t027>CC3414</t027>
    </t043>
    <t001 id="CC2981" attachedToRef="CC0290">
      <t027>CC3635</t027>
      <t042 id="CC0496">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t032 id="CC3315" name="Sim" sourceRef="CC2582" targetRef="CC0290">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable("beneficio_inss") &amp;&amp; beneficio_inss}</t008>
    </t032>
    <t032 id="CC3414" sourceRef="CC0290" targetRef="CC2579" />
    <t012 id="CC2922" name="CC1660">
      <t021>CC3635</t021>
      <t014 id="CC0440" errorRef="CC2870" />
    </t012>
    <t032 id="CC3635" sourceRef="CC2981" targetRef="CC2922" />
    <t018 id="CC2590" name="CC0118" default="CC3656">
      <t021>CC3311</t021>
      <t027>CC3656</t027>
      <t027>CC3520</t027>
    </t018>
    <t032 id="CC3656" name="Não" sourceRef="CC2590" targetRef="CC1630" />
    <t033 id="CC0756" name="CC0732" camunda:type="external" CC3089="CC1241">
      <t019>
        <t058>
          <t059 name="id_canal">${codigo_canal}</t059>
          <t059 name="CC3722">${CC0957}</t059>
          <t059 name="CC1661">CC4426</t059>
          <t059 name="CC2026">V</t059>
          <t059 name="CC4115">${execution.hasVariable("numero_unico_conta") ? execution.getVariable("numero_unico_conta") : CC0246}</t059>
          <t059 name="CC0074">${!execution.hasVariable('mensagem_erro_valida_beneficio_inss')}</t059>
        </t058>
      </t019>
      <t021>CC3520</t021>
      <t021>CC3437</t021>
      <t027>CC3378</t027>
    </t033>
    <t032 id="CC3520" name="Sim" sourceRef="CC2590" targetRef="CC0756">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('termo_autorizacao_beneficio_inss') &amp;&amp; termo_autorizacao_beneficio_inss}</t008>
    </t032>
    <t018 id="CC2577" name="CC0342" default="CC3213">
      <t021>CC3378</t021>
      <t021>CC3247</t021>
      <t027>CC3259</t027>
      <t027>CC3213</t027>
    </t018>
    <t032 id="CC3378" sourceRef="CC0756" targetRef="CC2577" />
    <t033 id="CC0689" name="CC0653" camunda:type="external" CC3089="efetivaBeneficioInss">
      <t019>
        <t058>
          <t059 name="CC3722">${CC0957}</t059>
          <t059 name="id_canal">${codigo_canal}</t059>
        </t058>
      </t019>
      <t021>CC3259</t021>
      <t027>CC3631</t027>
    </t033>
    <t032 id="CC3259" name="Sim" sourceRef="CC2577" targetRef="CC0689">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('correlation_validacao_inss')}</t008>
    </t032>
    <t033 id="CC0240" name="CC0187" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">93</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="efetivacao_inss">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="efetivacao_inss">${efetivacao_inss}</t050>
            </t061>
          </t059>
          <t059 name="CC0696">true</t059>
          <t059 name="CC1997">true</t059>
          <t059 name="CC2684">true</t059>
          <t059 name="CC1654">true</t059>
        </t058>
      </t019>
      <t021>CC3474</t021>
      <t027>CC3582</t027>
    </t033>
    <t032 id="CC3582" sourceRef="CC0240" targetRef="CC2578" />
    <t032 id="CC3507" name="CC4290" sourceRef="CC3095" targetRef="CC2671">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('voltar') &amp;&amp; voltar=="dados_biometria"}</t008>
    </t032>
    <t032 id="CC3307" sourceRef="CC0604" targetRef="CC2903" />
    <t032 id="CC3231" sourceRef="CC2821" targetRef="CC0604" />
    <t043 id="CC2821" name="CC2757">
      <t019 />
      <t027>CC3231</t027>
    </t043>
    <t001 id="CC1239" name="CC3109" attachedToRef="CC2821">
      <t027>CC3660</t027>
      <t042 id="CC0513">
        <t041 xsi:type="bpmn:tFormalExpression">PT30S</t041>
      </t042>
    </t001>
    <t035 id="CC2945">
      <t027>CC3473</t027>
    </t035>
    <t031 id="CC0546" name="CC0891" default="CC3420" scriptFormat="groovy">
      <t021>CC3473</t021>
      <t027>CC3420</t027>
      <t030>CC4009.CC3850("CC0976", 'PT20M')
CC4009.CC3850("CC0814", 'P22D')
CC4009.CC3850("CC4335", 'CC3838')
CC4009.CC3850("CC0861", '514017224')
CC4009.hasVariable("CC2721") &amp;&amp; CC2721 != '' ? CC2721 : CC4009.CC3850("CC2721", 'CC4073') if (CC4009.CC3819("CC2721") == 'CC3931') { CC4009.CC3850("CC3854", 'CC3931') }</t030>
    </t031>
    <t043 id="CC3917" name="CC2747" default="CC3624">
      <t019>
        <t055>
          <t056 id="CC2776" type="domain" defaultValue="${CC2776}" />
          <t056 id="CC0957" type="domain" defaultValue="${CC0957}" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC4290" type="string" defaultValue="continuar" />
          <t056 id="CC4129" type="domain" defaultValue="${CC4129}" />
          <t056 id="CC2020" type="domain" defaultValue="${CC4129}" />
        </t055>
        <t058>
          <t063 name="CC3108">CC3917</t063>
        </t058>
      </t019>
      <t021>CC3236</t021>
      <t021>CC3463</t021>
      <t021>CC3566</t021>
      <t027>CC3624</t027>
    </t043>
    <t012 id="CC2917" name="CC1660">
      <t021>CC3440</t021>
      <t014 id="CC0465" errorRef="CC2870" />
    </t012>
    <t043 id="CC3114" name="CC3071" default="CC3611">
      <t019>
        <t055>
          <t056 id="CC3696" type="string" />
          <t056 id="CC1999" type="string" defaultValue="${execution.hasVariable(&quot;empresa_parceira&quot;)&#10;? empresa_parceira : &quot;&quot;}" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC4036" type="boolean">
            <t068>
              <t049 name="required" />
            </t068>
          </t056>
          <t056 id="CC4290" type="string" defaultValue="continuar" />
        </t055>
      </t019>
      <t021>CC3624</t021>
      <t021>CC3194</t021>
      <t021>CC3175</t021>
      <t021>CC3427</t021>
      <t021>CC3375</t021>
      <t027>CC3236</t027>
      <t027>CC3611</t027>
    </t043>
    <t043 id="CC0684" name="CC0405" default="CC3055">
      <t019>
        <t055>
          <t056 id="CC3730" type="string" defaultValue="${execution.hasVariable('nome_empresa_pagadora') ?nome_empresa_pagadora: &quot;&quot;}" />
          <t056 id="CC1999" type="string" defaultValue="${CC1999}" />
          <t056 id="CC4290" type="string" defaultValue="continuar" />
          <t056 id="CC2712" type="boolean">
            <t068>
              <t049 name="required" />
            </t068>
          </t056>
          <t056 id="CC2647" type="string" defaultValue="${CC2647}" />
          <t056 id="CC3099" type="string" defaultValue="${CC3099}" />
          <t056 id="CC3696" type="string" defaultValue="${CC3696}" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC4129" type="domain" defaultValue="${CC4129}" />
        </t055>
      </t019>
      <t021>CC3330</t021>
      <t021>CC3602</t021>
      <t027>CC3055</t027>
      <t027>CC3427</t027>
    </t043>
    <t023 id="CC0331" name="CC0200">
      <t019>
        <t051 event="start">
          <t066 scriptFormat="groovy">CC4009.CC3850("CC4012","CC4036");

def contas_pagadoras = CC4009.CC3819("contas_pagadoras")

def vinculo_selecionado = [:] as HashMap
vinculo_selecionado.put("cnpj_empresa_pagadora", CC3696)
vinculo_selecionado.put("agencia_empresa_pagadora", contas_pagadoras[0]["CC2647"]) vinculo_selecionado.put("conta_empresa_pagadora", contas_pagadoras[0]["CC3099"].substring(0,7)) vinculo_selecionado.put("dac_empresa_pagadora", contas_pagadoras[0]["CC3099"].substring(7)) vinculo_selecionado.put("agencia_recebera_salario", "") vinculo_selecionado.put("conta_recebera_salario", "") vinculo_selecionado.put("dac_recebera_salario", "") vinculo_selecionado.put("CC3749", "004") vinculo_selecionado.put("tipo_empresa_agencia_empresa_pagadora", "004") vinculo_selecionado.put("codigo_banco_agencia_empresa_pagadora", "341") vinculo_selecionado.put("codigo_banco_origem", "341")

CC4009.CC3850("vinculo_selecionado", vinculo_selecionado)</t066>
        </t051>
      </t019>
      <t021>CC3055</t021>
      <t027>CC3381</t027>
    </t023>
    <t018 id="CC2510" name="CC1259" default="CC3182">
      <t021>CC3424</t021>
      <t027>CC3182</t027>
      <t027>CC3588</t027>
    </t018>
    <t023 id="CC2933" name="CC1025">
      <t019>
        <t051 event="start">
          <t066 scriptFormat="groovy">CC4009.CC3850("CC1999",false);
return CC1999;</t066>
        </t051>
      </t019>
      <t021>CC3588</t021>
      <t021>CC3173</t021>
      <t021>CC3230</t021>
      <t021>CC3633</t021>
      <t021>CC3535</t021>
      <t021>CC3457</t021>
      <t027>CC3194</t027>
    </t023>
    <t012 id="CC3016" name="CC1660">
      <t021>CC3159</t021>
      <t014 id="CC0458" errorRef="CC2870" />
    </t012>
    <t012 id="CC2891" name="CC1660">
      <t021>CC3253</t021>
      <t014 id="CC0466" errorRef="CC2870" />
    </t012>
    <t001 id="CC3003" attachedToRef="CC3917">
      <t027>CC3530</t027>
      <t042 id="CC0525">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t001 id="CC2955" cancelActivity="false" attachedToRef="CC3114">
      <t027>CC3253</t027>
      <t042 id="CC0479">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t001 id="CC2975" cancelActivity="false" attachedToRef="CC0684">
      <t027>CC3159</t027>
      <t042 id="CC0484">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t032 id="CC3473" sourceRef="CC2945" targetRef="CC0546" />
    <t032 id="CC3624" sourceRef="CC3917" targetRef="CC3114" />
    <t032 id="CC3530" sourceRef="CC3003" targetRef="CC2556" />
    <t032 id="CC3427" sourceRef="CC0684" targetRef="CC3114">
      <t008 xsi:type="bpmn:tFormalExpression">${(execution.hasVariable("receber_salario")&amp;&amp;receber_salario==false) || voltar !=
'continuar' }</t008>
    </t032>
    <t032 id="CC3194" sourceRef="CC2933" targetRef="CC3114" />
    <t032 id="CC3055" sourceRef="CC0684" targetRef="CC0331" />
    <t032 id="CC3182" name="Sim" sourceRef="CC2510" targetRef="CC2568" />
    <t032 id="CC3159" sourceRef="CC2975" targetRef="CC3016" />
    <t032 id="CC3253" sourceRef="CC2955" targetRef="CC2891" />
    <t032 id="CC3175" name="CC4253" sourceRef="CC3918" targetRef="CC3114">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('voltar') &amp;&amp; voltar=="informar_cnpj"}</t008>
    </t032>
    <t032 id="CC3342" sourceRef="CC3807" targetRef="CC2801" />
    <t018 id="CC2552" name="CC0218">
      <t021>CC3647</t021>
      <t027>CC3628</t027>
      <t027>CC3494</t027>
    </t018>
    <t003 id="CC0320" name="CC0057" calledElement="CC0703">
      <t019>
        <t062 variables="all" />
        <t057 source="CC0700" target="CC0700" />
        <t057 source="contas_pagadoras" target="contas_pagadoras" />
        <t057 source="CC4178" target="CC4178" />
        <t057 source="CC4330" target="CC4330" />
        <t057 source="CC4422" target="CC4422" />
        <t057 source="vinculo_selecionado" target="vinculo_selecionado" />
        <t057 source="CC4421" target="CC4421" />
        <t057 source="conta_reservada" target="conta_reservada" />
        <t057 source="oferta_product" target="oferta_product" />
        <t057 source="CC4129" target="CC4129" />
        <t057 source="CC3826" target="CC3826" />
        <t057 source="CC4331" target="CC4331" />
        <t057 source="CC1199" target="CC1199" />
        <t057 source="CC4260" target="CC4260" />
        <t057 source="CC0685" target="CC0685" />
        <t057 source="numero_documento" target="numero_documento" />
        <t057 source="CC2846" target="CC2846" />
        <t057 source="vinculoSelecionado" target="vinculoSelecionado" />
        <t057 source="CC1058" target="CC1058" />
        <t057 businessKey="#{CC3826}" />
        <t057 source="CC4012" target="CC4012" />
        <t057 source="CC4016" target="CC4016" />
        <t057 source="CC3112" target="CC3112" />
        <t057 source="CC3825" target="CC3825" />
        <t057 source="intencao" target="intencao" />
        <t057 source="CC3696" target="CC3696" />
        <t057 source="CC3730" target="CC3730" />
        <t057 source="CC0861" target="CC0861" />
        <t057 source="CC0690" target="CC0690" />
        <t057 source="CC4013" target="CC4013" />
        <t058>
          <t059 name="CC0700">
            <t066 scriptFormat="groovy">Optional.ofNullable(CC4009.CC3819("http_gq_consulta_encarteiramento_conta")).map {
["numeroFuncional": it["CC4013"]] }.orElse([:])</t066>
          </t059>
        </t058>
      </t019>
      <t021>CC3628</t021>
      <t027>CC3208</t027>
    </t003>
    <t018 id="CC2527" default="CC3639">
      <t021>CC3208</t021>
      <t021>CC3431</t021>
      <t027>CC3639</t027>
    </t018>
    <t031 id="CC1034" name="CC0102" scriptFormat="groovy">
      <t021>CC3359</t021>
      <t027>CC3603</t027>
      <t030>import java.text.DecimalFormatSymbols
import java.text.DecimalFormat

// Recuperar CC4038 do CC4335
def conta_reservada = CC4009.CC3819('conta_reservada');
def CC2830 = CC4009.CC3819('CC2830');
def tem_lis = CC2830['CC2702'];

// Definir CC4038 em comum
def variaveisEmail = adicionarVariaveisEmComum();

// Definir CC4038 para cada CC4129
def CC4129 = CC4009.CC3819('CC4129');
switch (CC4129.toUpperCase()) {
case '3': // CC4289
adicionarVariaveisVarejo(variaveisEmail, CC2830)

if(tem_lis) {
CC4009.CC3850("CC2656", "CC0827");
adicionarVariaveisLisVarejo(variaveisEmail, CC2830)
} else {
CC4009.CC3850("CC2656", "CC1168");
}
break;

case 'L': //uniclass
adicionarVariaveisUniclass(variaveisEmail, CC2830)

if(tem_lis) {
CC4009.CC3850("CC2656", "CC0829");
adicionarVariaveisLisUniclass(variaveisEmail, CC2830)
} else {
CC4009.CC3850("CC2656", "CC1170");
}
break;

case '4': // person
adicionarVariaveisPersonnalite(variaveisEmail, CC2830)

if(tem_lis) {
CC4009.CC3850("CC2656", "CC0828");
adicionarVariaveisLisPersonnalite(variaveisEmail, CC2830)
} else {
CC4009.CC3850("CC2656", "CC1169");
}
break;
}

CC4009.CC3850("CC0736", variaveisEmail);

// Inicio de declaracao das funcoes
def defineTipoCartao(CC2830) {
def tipoCartao = CC2830['CC1369'] == "M" ? "CC4067" : " ";
tipoCartao = CC2830['CC1369'] == "D" ? "Débito" : tipoCartao;
tipoCartao = CC2830['CC1369'] == "C" ? "Master Black" : tipoCartao;

return tipoCartao;
}

def defineBandeiraCartao(CC2830) {
def CC4087 = CC2830['CC2651'] == "04" ? "VISA" : " ";
CC4087 = CC2830['CC2651'] == "01" ? "MASTER" : CC4087;

return CC4087;
}

def formataNumero(CC4275) {
if(CC4275 instanceof CharSequence) {
CC4275 = Double.parseDouble(CC4275)
}
def simbolos_usados = new DecimalFormatSymbols(Locale.GERMAN); // Como nao tem os simbolos do Brasil foram utilizados os da Alemanha que são os mais parecido def formatacao = "#,#0.00"; // Formatacao que identifica quantas casas decimais serao retornadas - Exemplo de CC4211: 1.234,56 def df = new DecimalFormat(formatacao, simbolos_usados);

def numero_formatado = df.format(CC4275)

return numero_formatado
}

def adicionarVariaveisEmComum() {
def variaveisEmail = [:] as HashMap

variaveisEmail.put("CC4142", conta_reservada['CC4178']);
variaveisEmail.put("CC4304", conta_reservada['CC4330']);
variaveisEmail.put("Dac", conta_reservada['CC4422']);

return variaveisEmail;
}

// SEM CC4400
def adicionarVariaveisVarejo(variaveisEmail, CC2830) {
variaveisEmail.put("VencimentoFaturas", CC2830["CC0947"] != null ?
CC2830["CC0947"] : "");
variaveisEmail.put("TipoCartao", defineTipoCartao(CC2830) );
variaveisEmail.put("Bandeira", defineBandeiraCartao(CC2830) );
variaveisEmail.put("CartaoCredito", CC2830['CC3853']);
variaveisEmail.put("Pacote", CC2830["CC1391"]);
variaveisEmail.put("MensalidadePacote", formataNumero(CC2830['CC1245']));
}

def adicionarVariaveisUniclass(variaveisEmail, CC2830) {
variaveisEmail.put("VencimentoFaturas", CC2830["CC0947"] != null ?
CC2830["CC0947"] : "");
variaveisEmail.put("TipoCartao", defineTipoCartao(CC2830));
variaveisEmail.put("Bandeira", defineBandeiraCartao(CC2830) );
variaveisEmail.put("MensalidadePacote", formataNumero(CC2830['CC1245']))
}

def adicionarVariaveisPersonnalite(variaveisEmail, CC2830) {
variaveisEmail.put("CC4078", CC4009.CC3819("CC3826"));
variaveisEmail.put("TipoCartao", CC2830['CC3853']);
variaveisEmail.put("tipoCartao", defineTipoCartao(CC2830) );
variaveisEmail.put("bandeiraCartao", defineBandeiraCartao(CC2830) );
variaveisEmail.put("nomePacoteTarifa", CC2830["CC1391"]);
variaveisEmail.put("valorPacoteTarifa", formataNumero(CC2830['CC1245'])); variaveisEmail.put("diaVencimentoCartao", CC2830["CC0947"] != null ? CC2830["CC0947"] : " "); }

// COM CC4400
def adicionarVariaveisLisVarejo(variaveisEmail, CC2830) {
variaveisEmail.put("PagamentoEncargos", CC2830['CC0866']);
variaveisEmail.put("LimiteLIS", formataNumero(CC2830["CC3115"]));
}

def adicionarVariaveisLisUniclass(variaveisEmail, CC2830) {
adicionarVariaveisLisVarejo(variaveisEmail, CC2830);

variaveisEmail.put("JurosLis", formataNumero(CC2830["CC2732"]))
variaveisEmail.put("valorIofLimPercentIofLis", formataNumero(CC2830["CC3133"]))
variaveisEmail.put("OperacaolOF", formataNumero(CC2830['CC0048'])) variaveisEmail.put("valorCetMesLimite", formataNumero(CC2830["CC1055"])) variaveisEmail.put("valorCetAnoLimite", formataNumero(CC2830["CC1054"])) variaveisEmail.put("valorTotalOperaLimContratadolIofJurosLis", formataNumero(CC2830[ 'CC0048'])) variaveisEmail.put("numeroDeParcela", CC2830["CC1668"]) variaveisEmail.put("valorDaParcela", CC2830["CC2030"]) variaveisEmail.put("Pacote", CC2830["CC1391"]) }

def adicionarVariaveisLisPersonnalite(variaveisEmail, CC2830) {
variaveisEmail.put("valorTaxaJurosLisMes", formataNumero(CC2830["CC0758"])); variaveisEmail.put("valorTaxaJurosLisAno", formataNumero(CC2830["CC0757"])); variaveisEmail.put("valorIofLis", formataNumero(CC2830["CC3133"]) +" "); variaveisEmail.put("percentIofLis", formataNumero(CC2830["CC2704"])); variaveisEmail.put("valorCetMesLimite", formataNumero(CC2830["CC1055"])); variaveisEmail.put("valorCetAnoLimite", formataNumero(CC2830["CC1054"])); variaveisEmail.put("valorTotalOperaLimContratadoIofJurosLis", formataNumero(CC2830["CC0048"])); variaveisEmail.put("somaTotalLis", formataNumero(CC2830["CC2843"])); variaveisEmail.put("valorJurosLis", formataNumero(CC2830["CC2732"])); variaveisEmail.put("diaDebitoEncargoLis", CC2830['CC0866']); variaveisEmail.put("limiteMaximo", formataNumero(CC2830["CC3115"])); }</t030>
    </t031>
    <t033 id="CC2687" name="CC0710" camunda:type="external" CC3089="CC1209">
      <t011>CC0036


Link Git --&gt; «U000036»</t011>
      <t019>
        <t058>
          <t059 name="CC2842">CC4389</t059>
          <t059 name="CC3750">Nenhum</t059>
          <t059 name="CC1377">${CC4331}</t059>
          <t059 name="CC3092">""</t059>
          <t059 name="CC1030">34</t059>
          <t059 name="CC2656">${CC2656}</t059>
          <t059 name="CC3822">CC0155</t059>
          <t059 name="remetente">
            <t061>
              <t050 key="nome">CC1963</t050>
              <t050 key="CC4331">«EMAIL»</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3603</t021>
      <t027>CC3630</t027>
    </t033>
    <t032 id="CC3628" name="Sim" sourceRef="CC2552" targetRef="CC0320">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('fluxo_spi') &amp;&amp; (fluxo_spi=='turn_over' || fluxo_spi=='massificado') &amp;&amp; execution.hasVariable("receber_salario") &amp;&amp; receber_salario == true}</t008>
    </t032>
    <t032 id="CC3208" sourceRef="CC0320" targetRef="CC2527" />
    <t032 id="CC3603" sourceRef="CC1034" targetRef="CC2687" />
    <t032 id="CC3639" sourceRef="CC2527" targetRef="CC0542" />
    <t012 id="CC3006" name="CC1660">
      <t021>CC3495</t021>
      <t014 id="CC0463" errorRef="CC2870" />
    </t012>
    <t043 id="CC0934" name="CC0551">
      <t019>
        <t055>
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
        </t055>
      </t019>
      <t021>CC3661</t021>
      <t021>CC3398</t021>
      <t027>CC3661</t027>
    </t043>
    <t032 id="CC3661" sourceRef="CC0934" targetRef="CC0934" />
    <t032 id="CC3398" name="Não" sourceRef="CC2588" targetRef="CC0934" />
    <t018 id="CC2546" default="CC3245">
      <t021>CC3303</t021>
      <t021>CC3465</t021>
      <t027>CC3245</t027>
    </t018>
    <t032 id="CC3303" sourceRef="CC2973" targetRef="CC2546" />
    <t032 id="CC3245" sourceRef="CC2546" targetRef="CC2581" />
    <t018 id="CC2547" name="CC3686" default="CC3526">
      <t021>CC3653</t021>
      <t027>CC3206</t027>
      <t027>CC3526</t027>
    </t018>
    <t032 id="CC3653" name="Não" sourceRef="CC2581" targetRef="CC2547" />
    <t018 id="CC2608" default="CC3168">
      <t021>CC3449</t021>
      <t021>CC3284</t021>
      <t027>CC3168</t027>
    </t018>
    <t003 id="CC4121" name="Mesa CC4408" calledElement="CC0890">
      <t019>
        <t062 source="response_consulta_mesa_pld" target="response_consulta_mesa_pld" />
        <t062 source="callback_mesa_pld" target="callback_mesa_pld" />
        <t057 source="intencao" target="intencao" />
        <t057 source="CC4016" target="CC4016" />
        <t057 source="CC3112" target="CC3112" />
        <t057 source="id_inquilino" target="id_inquilino" />
        <t057 source="analise_de_pld" target="analise_de_pld" />
        <t057 source="CC2817" target="pep_autodeclarado" />
        <t057 source="CC1058" target="CC1058" />
        <t057 source="CC3826" target="CC3826" />
        <t057 businessKey="#{CC3826}" />
        <t057 source="id_analise_pld" target="id_analise" />
        <t057 source="CC2793" target="CC2793" />
        <t057 source="CC4335" target="CC4335" />
      </t019>
      <t021>CC3206</t021>
      <t027>CC3284</t027>
    </t003>
    <t001 id="CC3026" attachedToRef="CC4121">
      <t027>CC3282</t027>
      <t016 id="CC0231" escalationRef="CC1261" />
    </t001>
    <t032 id="CC3206" name="Sim" sourceRef="CC2547" targetRef="CC4121">
      <t008 xsi:type="bpmn:tFormalExpression">${situacao_analise_pld == 'MEDIO'}</t008>
    </t032>
    <t032 id="CC3284" name="CC1617" sourceRef="CC4121" targetRef="CC2608" />
    <t032 id="CC3526" name="Não" sourceRef="CC2547" targetRef="CC1977" />
    <t032 id="CC3270" sourceRef="CC1977" targetRef="CC0173" />
    <t032 id="CC3254" sourceRef="CC2967" targetRef="CC0173" />
    <t032 id="CC3272" sourceRef="CC0173" targetRef="CC0606" />
    <t032 id="CC3282" name="CC1619" sourceRef="CC3026" targetRef="CC0606" />
    <t012 id="CC3004" name="CC2751">
      <t021>CC3527</t021>
      <t014 id="CC0420" errorRef="CC2861" />
    </t012>
    <t032 id="CC3527" sourceRef="CC0606" targetRef="CC3004" />
    <t032 id="CC3465" name="Sim" sourceRef="CC2588" targetRef="CC2546">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('analise_de_pld') &amp;&amp; analise_de_pld.situacao_processamento == 'SUCESSO'}</t008>
    </t032>
    <t032 id="CC3660" sourceRef="CC1239" targetRef="CC0604" />
    <t036 id="CC1706" name="CC0070" CC0816>
      <t035 id="CC3024">
        <t027>CC3564</t027>
        <t014 id="CC0412" errorRef="CC2861" />
      </t035>
      <t012 id="CC2916">
        <t021>CC3285</t021>
        <t037 id="CC0265" />
      </t012>
      <t018 id="CC4196" name="CC0196" default="CC3285">
        <t021>CC3564</t021>
        <t027>CC3285</t027>
        <t027>CC3545</t027>
      </t018>
      <t012 id="CC2937">
        <t021>CC3289</t021>
        <t006 id="CC0220" />
      </t012>
      <t028 id="CC0655">
        <t021>CC3545</t021>
        <t027>CC3289</t027>
        <t027>CC3623</t027>
      </t028>
      <t012 id="CC3027" name="CC0895">
        <t021>CC3623</t021>
        <t014 id="CC0416" errorRef="CC2875" />
      </t012>
      <t032 id="CC3564" sourceRef="CC3024" targetRef="CC4196" />
      <t032 id="CC3285" name="Não" sourceRef="CC4196" targetRef="CC2916" />
      <t032 id="CC3545" name="Sim" sourceRef="CC4196" targetRef="CC0655">
        <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('conta_reservada') &amp;&amp; conta_reservada != null}</t008>
      </t032>
      <t032 id="CC3289" sourceRef="CC0655" targetRef="CC2937" />
      <t032 id="CC3623" sourceRef="CC0655" targetRef="CC3027" />
    </t036>
    <t036 id="CC1699" name="CC0994" CC0816>
      <t033 id="CC0592" name="CC1186" CC0630="#{CC0676}">
        <t019>
          <t058>
            <t059 name="CC3826">${CC3826}</t059>
            <t059 name="CC2802">
              <t061>
                <t050 key="expurgo_jornada">true</t050>
                <t050 key="tipo_expurgo">${execution.hasVariable('tipo_expurgo') ? tipo_expurgo :
'ABANDONO' }</t050>
                <t050 key="CC3108">${execution.hasVariable('etapa_expurgo') ? etapa_expurgo : 'etapa_sistemica'}</t050>
              </t061>
            </t059>
            <t059 name="CC1214">
              <t061>
                <t050 key="expurgo_jornada">$</t050>
                <t050 key="tipo_expurgo">$</t050>
                <t050 key="CC3108">$</t050>
              </t061>
            </t059>
            <t059 name="CC2720">15</t059>
          </t058>
        </t019>
        <t021>CC3557</t021>
        <t027>CC3167</t027>
      </t033>
      <t035 id="CC2881">
        <t027>CC3557</t027>
        <t014 id="CC0450" errorRef="CC2870" />
      </t035>
      <t012 id="CC2976">
        <t021>CC3167</t021>
        <t014 id="CC0442" errorRef="CC2861" />
      </t012>
      <t032 id="CC3557" sourceRef="CC2881" targetRef="CC0592" />
      <t032 id="CC3167" sourceRef="CC0592" targetRef="CC2976" />
    </t036>
    <t036 id="CC1704" name="CC0894" CC0816>
      <t033 id="CC2779" name="CC0894" camunda:type="external" CC3089="CC0348">
        <t019>
          <t058>
            <t059 name="CC0030">${true}</t059>
            <t059 name="CC0086">
              <t061>
                <t050 key="codigo_motivo_bloqueio">CC4383</t050>
                <t050 key="codigo_proxy">${CC0531}</t050>
                <t050 key="codigo_usuario">CC4294</t050>
                <t050 key="codigo_canal">${codigo_canal}</t050>
                <t050 key="codigo_sistema_chamador">CC4389</t050>
              </t061>
            </t059>
            <t063 name="CC0143">${true}</t063>
            <t063 name="CC0121">${execution.getVariable( "CC0121")}</t063>
          </t058>
          <t051 event="start">
            <t066 scriptFormat="groovy">def tentativa = CC4009.hasVariable("tentativa_bloqueio") ? CC4009.CC3819("tentativa_bloqueio") : 0

tentativa = tentativa + 1

CC4009.CC3850("tentativa_bloqueio", tentativa)</t066>
          </t051>
        </t019>
        <t021>CC2662</t021>
        <t021>CC3163</t021>
        <t027>CC3549</t027>
      </t033>
      <t018 id="CC0833" name="CC3896" default="CC4059">
        <t021>CC3413</t021>
        <t027>CC2662</t027>
        <t027>CC4059</t027>
      </t018>
      <t035 id="CC0744" name="CC0895">
        <t027>CC3413</t027>
        <t014 id="CC0426" errorRef="CC2875" />
      </t035>
      <t033 id="CC0356" name="CC0076" CC0630="#{CC0676}">
        <t019>
          <t058>
            <t059 name="CC3826">${CC3826}</t059>
            <t059 name="CC2802">
              <t061>
                <t050 key="CC0143">${CC0143}</t050>
              </t061>
            </t059>
            <t059 name="CC1214">
              <t061>
                <t050 key="CC0143">$</t050>
              </t061>
            </t059>
          </t058>
        </t019>
        <t021>CC3549</t021>
        <t021>CC3190</t021>
        <t027>CC3512</t027>
      </t033>
      <t018 id="CC2545" default="CC3521">
        <t021>CC3396</t021>
        <t027>CC3521</t027>
        <t027>CC3366</t027>
      </t018>
      <t012 id="CC2958">
        <t021>CC4059</t021>
      </t012>
      <t012 id="CC2941">
        <t021>CC3512</t021>
      </t012>
      <t023 id="CC2883" name="CC0896">
        <t019>
          <t058>
            <t063 name="CC0143">${false}</t063>
          </t058>
        </t019>
        <t021>CC3521</t021>
        <t027>CC3190</t027>
      </t023>
      <t001 id="CC1026" attachedToRef="CC2779">
        <t027>CC3396</t027>
        <t014 id="CC0423" errorRef="CC2864" />
      </t001>
      <t032 id="CC2662" name="sim" sourceRef="CC0833" targetRef="CC2779">
        <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('codigo_proxy_plastico_cartao') &amp;&amp; codigo_proxy_plastico_cartao != null &amp;&amp; codigo_proxy_plastico_cartao != 'null' &amp;&amp; codigo_proxy_plastico_cartao != ''}</t008>
      </t032>
      <t032 id="CC3549" sourceRef="CC2779" targetRef="CC0356" />
      <t032 id="CC3413" sourceRef="CC0744" targetRef="CC0833" />
      <t032 id="CC4059" name="não" sourceRef="CC0833" targetRef="CC2958" />
      <t032 id="CC3190" sourceRef="CC2883" targetRef="CC0356" />
      <t032 id="CC3512" sourceRef="CC0356" targetRef="CC2941" />
      <t032 id="CC3396" sourceRef="CC1026" targetRef="CC2545" />
      <t032 id="CC3521" sourceRef="CC2545" targetRef="CC2883" />
      <t022 id="CC2971">
        <t021>CC3366</t021>
        <t027>CC3163</t027>
        <t042 id="CC0492">
          <t041 xsi:type="bpmn:tFormalExpression">PT30S</t041>
        </t042>
      </t022>
      <t032 id="CC3366" sourceRef="CC2545" targetRef="CC2971">
        <t008 xsi:type="bpmn:tFormalExpression">${tentativa_bloqueio &lt; 3}</t008>
      </t032>
      <t032 id="CC3163" sourceRef="CC2971" targetRef="CC2779" />
    </t036>
    <t022 id="CC2964" name="CC1164">
      <t019>
        <t051 event="end">
          <t066 scriptFormat="groovy">import static net.logstash.logback.argument.StructuredArguments.value
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.CC4378.Instant
import java.CC4378.Duration

final Logger logger = LoggerFactory.getLogger("CC0022")
Instant inicio = Instant.now()
logger.info(
"CC4310 de recusa de CC4127 por analise de CC4271 CC4382",

value("CC3826" , CC4009.CC3819("CC3826")),
value("CC4016" , CC4009.CC3819("CC4016")),
value("intencao" , CC4009.CC3819("intencao")),
value("correlationId" , CC4009.CC3819("CC1058")),
value("tempo_total_espera" , Duration.between(inicio, Instant.now()))
)</t066>
        </t051>
      </t019>
      <t027>CC3659</t027>
      <t024 id="CC0566" name="CC1192" />
    </t022>
    <t018 id="CC2540" name="CC0475" default="CC3388">
      <t021>CC3391</t021>
      <t027>CC3388</t027>
      <t027>CC3257</t027>
    </t018>
    <t033 id="CC0122" name="CC0253" camunda:type="external" CC3089="CC0636">
      <t019>
        <t058>
          <t059 name="CC3856">F</t059>
          <t059 name="CC3130">02</t059>
          <t059 name="CC3749">004</t059>
          <t059 name="CC4016">${CC4016}</t059>
          <t059 name="CC4178">${CC4178}</t059>
          <t059 name="CC4330">${CC4330}</t059>
          <t059 name="CC4422">${CC4422}</t059>
        </t058>
      </t019>
      <t021>CC3513</t021>
      <t027>CC3391</t027>
    </t033>
    <t012 id="CC3034">
      <t021>CC3388</t021>
    </t012>
    <t012 id="CC2889">
      <t021>CC3509</t021>
    </t012>
    <t012 id="CC2893" name="CC0895">
      <t021>CC3585</t021>
      <t014 id="CC0432" errorRef="CC2875" />
    </t012>
    <t028 id="CC2591">
      <t021>CC3659</t021>
      <t027>CC3513</t027>
      <t027>CC3585</t027>
    </t028>
    <t032 id="CC3659" sourceRef="CC2964" targetRef="CC2591" />
    <t032 id="CC3391" sourceRef="CC0122" targetRef="CC2540" />
    <t032 id="CC3388" sourceRef="CC2540" targetRef="CC3034" />
    <t032 id="CC3257" name="CC1612" sourceRef="CC2540" targetRef="CC0639">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('conclusao_analise_fraude') &amp;&amp; conclusao_analise_fraude == "Confirmação de Fraude"}</t008>
    </t032>
    <t032 id="CC3509" sourceRef="CC0639" targetRef="CC2889" />
    <t032 id="CC3513" sourceRef="CC2591" targetRef="CC0122" />
    <t032 id="CC3585" sourceRef="CC2591" targetRef="CC2893" />
    <t033 id="CC0639" name="CC0406" camunda:type="external" CC3089="CC1209">
      <t011>CC0036


Link Git --&gt; «U000036»</t011>
      <t019>
        <t058>
          <t059 name="CC0736">
            <t061>
              <t050 key="nome">${CC3120}</t050>
            </t061>
          </t059>
          <t059 name="CC2842">CC4389</t059>
          <t059 name="CC3750">Nenhum</t059>
          <t059 name="CC1377">${CC4331}</t059>
          <t059 name="CC3092">""</t059>
          <t059 name="CC1030">34</t059>
          <t059 name="CC2656">${segmento == "4" ? "CC0830" : "CC0993"}</t059>
          <t059 name="CC3822">CC0155</t059>
          <t059 name="remetente">
            <t061>
              <t050 key="nome">CC1613</t050>
              <t050 key="CC4331">«EMAIL»</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3257</t021>
      <t027>CC3509</t027>
    </t033>
    <t001 id="CC2929" attachedToRef="CC0382">
      <t027>CC3504</t027>
      <t042 id="CC0506">
        <t041 xsi:type="bpmn:tFormalExpression">PT15M</t041>
      </t042>
    </t001>
    <t032 id="CC3504" sourceRef="CC2929" targetRef="CC2921" />
    <t012 id="CC2989" name="CC1660">
      <t021>CC3156</t021>
      <t014 id="CC0414" errorRef="CC2870" />
    </t012>
    <t018 id="CC2603" default="CC3196">
      <t021>CC3655</t021>
      <t027>CC3196</t027>
      <t027>CC3268</t027>
    </t018>
    <t018 id="CC2539">
      <t021>CC3196</t021>
      <t021>CC3502</t021>
      <t027>CC3343</t027>
    </t018>
    <t033 id="CC2729" name="CC2644" camunda:type="external" CC3089="CC0549">
      <t019>
        <t058>
          <t059 name="CC0038">${true}</t059>
          <t059 name="CC0109">
            <t061>
              <t050 key="numeroFuncionalColaborador">${CC0745}</t050>
              <t050 key="codigoProxyCartao">${CC0531}</t050>
              <t050 key="CC4178">${conta_reservada['agencia']}</t050>
              <t050 key="CC4129">${CC4129}</t050>
              <t050 key="codigoDn">${oferta_produto['dn_cartao_credito']}</t050>
            </t061>
          </t059>
          <t063 name="CC3744">${execution.getVariable('CC0549_resposta')['codigoRetorno']}</t063>
          <t063 name="mensagem">${execution.getVariable('CC0549_resposta')['mensagem']}</t063>
        </t058>
      </t019>
      <t021>CC3268</t021>
      <t027>CC3365</t027>
    </t033>
    <t018 id="CC2584" default="CC3192">
      <t021>CC3365</t021>
      <t027>CC3502</t027>
      <t027>CC3192</t027>
    </t018>
    <t023 id="CC3032">
      <t019>
        <t051 event="start">
          <t066 scriptFormat="groovy">CC4009.CC3850("CC2837", true); CC4009.CC3850("CC3117", "Número CC4319 CC4230 Inválido"+" "+mensagem);</t066>
        </t051>
        <t058>
          <t063 name="CC3117">
            <t061>
              <t050 key="CC3117">${CC3117}</t050>
            </t061>
          </t063>
        </t058>
      </t019>
      <t021>CC3192</t021>
      <t021>CC3387</t021>
      <t027>CC3402</t027>
    </t023>
    <t001 id="CC2998" attachedToRef="CC2729">
      <t027>CC3387</t027>
      <t014 id="CC0459" />
    </t001>
    <t032 id="CC3196" sourceRef="CC2603" targetRef="CC2539" />
    <t032 id="CC3268" sourceRef="CC2603" targetRef="CC2729">
      <t008 xsi:type="bpmn:tFormalExpression">${codigo_proxy_plastico_cartao != null &amp;&amp; codigo_proxy_plastico_cartao != 'null' &amp;&amp; codigo_proxy_plastico_cartao != ''}</t008>
    </t032>
    <t032 id="CC3502" sourceRef="CC2584" targetRef="CC2539">
      <t008 xsi:type="bpmn:tFormalExpression">${proxyIsValid == "0"}</t008>
    </t032>
    <t032 id="CC3365" sourceRef="CC2729" targetRef="CC2584" />
    <t032 id="CC3192" sourceRef="CC2584" targetRef="CC3032" />
    <t032 id="CC3387" sourceRef="CC2998" targetRef="CC3032" />
    <t018 id="CC2610">
      <t021>CC3652</t021>
      <t027>CC3643</t027>
      <t027>CC3578</t027>
    </t018>
    <t018 id="CC2523" default="CC3619">
      <t021>CC3324</t021>
      <t021>CC3558</t021>
      <t027>CC3619</t027>
    </t018>
    <t032 id="CC3619" sourceRef="CC2523" targetRef="CC2708" />
    <t023 id="CC2949" name="CC3897">
      <t019>
        <t058>
          <t063 name="CC0143">${false}</t063>
        </t058>
        <t051 event="start">
          <t066 scriptFormat="groovy">CC4009.CC3850("CC2694", "");</t066>
        </t051>
      </t019>
      <t021>CC3643</t021>
      <t027>CC3558</t027>
    </t023>
    <t032 id="CC3643" sourceRef="CC2610" targetRef="CC2949">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('codigo_proxy_plastico_cartao') &amp;&amp; codigo_proxy_plastico_cartao != null &amp;&amp; codigo_proxy_plastico_cartao != 'null' &amp;&amp; codigo_proxy_plastico_cartao != ''}</t008>
    </t032>
    <t032 id="CC3558" sourceRef="CC2949" targetRef="CC2523" />
    <t032 id="CC3168" sourceRef="CC2608" targetRef="CC2520" />
    <t033 id="CC0637" name="CC0253" isForCompensation="true" camunda:type="external" CC3089="CC0636">
      <t019>
        <t058>
          <t059 name="CC4422">${CC4422}</t059>
          <t059 name="CC4330">${CC4330}</t059>
          <t059 name="CC4178">${CC4178}</t059>
          <t059 name="CC4016">${CC4016}</t059>
          <t059 name="CC3749">004</t059>
          <t059 name="CC3130">02</t059>
          <t059 name="CC3856">F</t059>
        </t058>
      </t019>
    </t033>
    <t032 id="CC3211" sourceRef="CC2015" targetRef="CC1228" />
    <t003 id="CC2015" name="CC1971" calledElement="CC3126">
      <t019>
        <t057 businessKey="#{CC3826}" />
        <t057 source="CC3826" target="CC3826" />
        <t057 source="CC4016" target="CC4016" />
        <t057 source="CC3112" target="CC3112" />
        <t057 source="id_inquilino" target="id_inquilino" />
        <t057 source="intencao" target="intencao" />
        <t057 source="CC1058" target="CC1058" />
        <t057 source="CC4129" target="CC4129" />
        <t057 source="CC2827" target="CC2827" />
        <t057 source="CC4178" target="CC4178" />
        <t062 source="conta_reservada" target="conta_reservada" />
        <t057 source="CC3817" target="CC3817" />
        <t057 source="CC4421" target="CC4421" />
        <t062 source="CC4178" target="CC4178" />
        <t062 source="CC4330" target="CC4330" />
        <t062 source="CC4422" target="CC4422" />
        <t062 source="identificadorAgenciaExtendida" target="identificadorAgenciaExtendida" />
        <t057 source="CC1200" target="CC1200" />
        <t057 source="CC0588" target="CC0588" />
        <t057 source="CC0864" target="CC0864" />
        <t057 source="CC1199" target="CC1199" />
        <t057 source="CC2816" target="CC2816" />
        <t057 source="CC2817" target="CC2817" />
      </t019>
      <t021>CC3297</t021>
      <t027>CC3211</t027>
    </t003>
    <t001 id="CC2994" attachedToRef="CC2015">
      <t006 id="CC0219" />
    </t001>
    <t043 id="CC2646" name="CC2036">
      <t019>
        <t055>
          <t056 id="CC1391" type="domain" defaultValue="${oferta_produto['nome_pacote_tarifa']}" />
          <t056 id="CC1245" type="domain" defaultValue="${oferta_produto['valor_pacote_tarifa']}" />
          <t056 id="CC1386" type="domain" defaultValue="${execution.hasVariable(&quot;isencao_spi_pacote&quot;) ? isencao_spi_pacote : false}">
            <t064 />
            <t068 />
          </t056>
          <t056 id="CC1005" type="boolean">
            <t068 />
          </t056>
          <t056 id="CC0239" type="string">
            <t068 />
          </t056>
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC4290" type="domain" defaultValue="continuar" />
          <t056 id="CC0284" type="domain" defaultValue="${execution.hasVariable('limiterotativo_credito_v3_aberturacontas_resposta') ?&#10;limiterotativo_credito_v3_aberturacontas_resposta['valor_lis_pre_aprovado'] : null}" />
          <t056 id="CC0182" type="domain" defaultValue="${execution.hasVariable('limiterotativo_credito_v3_aberturacontas_resposta') ?&#10;limiterotativo_credito_v3_aberturacontas_resposta['valor_cartao_pre_aprovado'] : null}" />
        </t055>
        <t058>
          <t063 name="CC3108">CC2646</t063>
        </t058>
      </t019>
      <t021>CC3464</t021>
      <t021>CC3215</t021>
      <t021>CC3306</t021>
      <t027>CC3319</t027>
      <t027>CC3377</t027>
    </t043>
    <t033 id="CC0286" name="CC0257" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">3</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="CC1005">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="CC1005">false</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3435</t021>
      <t027>CC3456</t027>
    </t033>
    <t023 id="CC2950" name="CC1164">
      <t019>
        <t058>
          <t063 name="CC2720">3</t063>
        </t058>
      </t019>
      <t021>CC3456</t021>
      <t024 id="CC0568" name="CC1192" />
    </t023>
    <t001 id="CC3012" attachedToRef="CC2646">
      <t027>CC3435</t027>
      <t042 id="CC0502">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t032 id="CC3435" sourceRef="CC3012" targetRef="CC0286" />
    <t032 id="CC3456" sourceRef="CC0286" targetRef="CC2950" />
    <t032 id="CC3464" sourceRef="CC2579" targetRef="CC2646" />
    <t032 id="CC3319" name="CC4290" sourceRef="CC2646" targetRef="CC3095">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('voltar') &amp;&amp; voltar=="coletar_senha"}</t008>
    </t032>
    <t032 id="CC3588" name="Não" sourceRef="CC2510" targetRef="CC2933">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable("contas_pagadoras")&amp;&amp;contas_pagadoras[0]==null}</t008>
    </t032>
    <t023 id="CC0170" name="CC0471">
      <t019>
        <t051 event="start">
          <t066 scriptFormat="groovy">CC4009.CC3850('CC0748',true)</t066>
        </t051>
      </t019>
      <t021>CC3170</t021>
      <t027>CC3368</t027>
    </t023>
    <t036 id="CC1702" name="CC0251" CC0816>
      <t012 id="CC2939">
        <t021>CC3280</t021>
      </t012>
      <t035 id="CC0181" name="CC0472" isInterrupting="false">
        <t019>
          <t051 event="start">
            <t066 scriptFormat="groovy">import static net.logstash.logback.argument.StructuredArguments.value
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.CC4378.Instant
import java.CC4378.Duration



final Logger logger = LoggerFactory.getLogger("etgerirriscobacen")



logger.info(
"CC4211 do cadastro",
value("CC3826" , CC4009.CC3819("CC3826")),
value("CC4016" , CC4009.CC3819("CC4016")),
value("correlationId" , CC4009.CC3819("CC1058")),
)
CC4009.removeVariable('CC0748')</t066>
          </t051>
        </t019>
        <t027>CC3416</t027>
        <t009 id="CC0188" camunda:variableName="CC0748">
          <t007 xsi:type="bpmn:tFormalExpression">${CC0748}</t007>
        </t009>
      </t035>
      <t033 id="CC1007" name="CC0612" camunda:type="external" CC3089="CC0276">
        <t011>Link Git --&gt; «U000029»</t011>
        <t019>
          <t058>
            <t059 name="CC0068">
              <t061>
                <t050 key="CC4006">${CC4016}</t050>
                <t050 key="instituicaoFinanceira">001</t050>
                <t050 key="canalAutorizacao">CC4389</t050>
                <t050 key="tipoPessoa">F</t050>
                <t050 key="autorizaConglomerado">S</t050>
              </t061>
            </t059>
            <t059 name="CC0026">${true}</t059>
            <t063 name="CC0095">${execution.getVariable("CC0095")}</t063>
            <t063 name="CC0884">${true}</t063>
          </t058>
          <t051 event="start">
            <t066 scriptFormat="groovy">def tentativa = CC4009.hasVariable("tentativa_cadastro") ? CC4009.CC3819("tentativa_cadastro") : 0

tentativa = tentativa + 1

CC4009.CC3850("tentativa_cadastro", tentativa)</t066>
          </t051>
        </t019>
        <t021>CC3416</t021>
        <t021>CC3453</t021>
        <t027>CC3301</t027>
      </t033>
      <t033 id="CC0383" name="CC0361" CC0630="#{CC0676}">
        <t019>
          <t058>
            <t059 name="CC3826">${CC3826}</t059>
            <t059 name="CC1214">
              <t061>
                <t050 key="CC0884">$</t050>
              </t061>
            </t059>
            <t059 name="CC2802">
              <t061>
                <t050 key="CC0884">${CC0884}</t050>
              </t061>
            </t059>
          </t058>
        </t019>
        <t021>CC3301</t021>
        <t021>CC3406</t021>
        <t027>CC3280</t027>
      </t033>
      <t018 id="CC2596" default="CC3546">
        <t021>CC3610</t021>
        <t027>CC3453</t027>
        <t027>CC3546</t027>
      </t018>
      <t023 id="CC2960" name="CC2828">
        <t019>
          <t058>
            <t063 name="CC0884">${false}</t063>
          </t058>
        </t019>
        <t021>CC3546</t021>
        <t027>CC3406</t027>
      </t023>
      <t001 id="CC2879" attachedToRef="CC1007">
        <t027>CC3610</t027>
        <t014 id="CC0437" />
      </t001>
      <t032 id="CC3280" sourceRef="CC0383" targetRef="CC2939" />
      <t032 id="CC3416" sourceRef="CC0181" targetRef="CC1007" />
      <t032 id="CC3453" name="CC3945" sourceRef="CC2596" targetRef="CC1007">
        <t008 xsi:type="bpmn:tFormalExpression">${tentativa_cadastro&lt;=3}</t008>
      </t032>
      <t032 id="CC3301" sourceRef="CC1007" targetRef="CC0383" />
      <t032 id="CC3406" sourceRef="CC2960" targetRef="CC0383" />
      <t032 id="CC3610" sourceRef="CC2879" targetRef="CC2596" />
      <t032 id="CC3546" sourceRef="CC2596" targetRef="CC2960" />
    </t036>
    <t018 id="CC2512" default="CC3304">
      <t021>CC3597</t021>
      <t021>CC3358</t021>
      <t027>CC3304</t027>
    </t018>
    <t033 id="CC3714" name="CC1352" camunda:type="external" CC3089="CC0298">
      <t011>CC0087




Link Git --&gt; «U000035»</t011>
      <t019>
        <t058>
          <t059 name="CC3825">CC0165</t059>
          <t059 name="banco">341</t059>
          <t059 name="CC1242">${CC3826}</t059>
          <t059 name="CC1012">NUMPROP</t059>
          <t059 name="CC3823">${retorno_dados_gerar_pac['identificador_di4']}</t059>
        </t058>
      </t019>
      <t021>CC3572</t021>
      <t021>CC3651</t021>
      <t027>CC3283</t027>
    </t033>
    <t033 id="CC3742" name="CC0713" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">2</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="CC0808">$</t050>
              <t050 key="identificador_di4">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="CC0808">${CC0808}</t050>
              <t050 key="identificador_di4">${identificador_di4}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3283</t021>
      <t027>CC3224</t027>
    </t033>
    <t012 id="CC2927">
      <t021>CC3224</t021>
      <t021>CC3476</t021>
      <t037 id="CC0260" />
    </t012>
    <t033 id="CC1024" name="CC0627" CC1191="true" camunda:type="external" CC3089="CC0298">
      <t011>CC0087




Link Git --&gt; «U000035»</t011>
      <t019>
        <t058>
          <t059 name="CC3825">CC0165</t059>
          <t059 name="banco">341</t059>
          <t059 name="CC1242">${CC3826}</t059>
          <t059 name="CC1012">NUMPROP</t059>
          <t059 name="CC3823">${id_conteudo_di_di4}</t059>
        </t058>
        <t053>R5/PT15M</t053>
      </t019>
      <t021>CC3667</t021>
      <t027>CC3470</t027>
    </t033>
    <t018 id="CC2605" default="CC3572">
      <t021>CC3242</t021>
      <t021>CC3174</t021>
      <t027>CC3572</t027>
    </t018>
    <t028 id="CC2566" CC1191="true">
      <t021>CC3654</t021>
      <t027>CC3667</t027>
      <t027>CC3228</t027>
    </t028>
    <t033 id="CC0791" name="CC0380" CC1191="true" camunda:type="external" CC3089="CC0298">
      <t011>CC0087




Link Git --&gt; «U000035»</t011>
      <t019>
        <t058>
          <t059 name="CC3825">CC0165</t059>
          <t059 name="banco">341</t059>
          <t059 name="CC1242">${CC3826}</t059>
          <t059 name="CC1012">NUMPROP</t059>
          <t059 name="CC3823">${id_conteudo_selfie_di4}</t059>
        </t058>
        <t053>R5/PT15M</t053>
      </t019>
      <t021>CC3228</t021>
      <t027>CC3344</t027>
    </t033>
    <t028 id="CC2580" CC1191="true">
      <t021>CC3470</t021>
      <t021>CC3344</t021>
      <t027>CC3174</t027>
    </t028>
    <t022 id="CC3013" name="CC3139">
      <t021>CC3478</t021>
      <t027>CC3654</t027>
      <t042 id="CC0493">
        <t041 xsi:type="bpmn:tFormalExpression">PT10S</t041>
      </t042>
    </t022>
    <t018 id="CC2535" name="CC3076" default="CC3242">
      <t021>CC3304</t021>
      <t027>CC3242</t027>
      <t027>CC3478</t027>
    </t018>
    <t018 id="CC2614" name="CC2765" default="CC3258">
      <t021>CC3447</t021>
      <t027>CC3201</t027>
      <t027>CC3258</t027>
    </t018>
    <t022 id="CC2962" name="15s">
      <t011>CC0103</t011>
      <t021>CC3491</t021>
      <t027>CC3651</t027>
      <t042 id="CC0483">
        <t041 xsi:type="bpmn:tFormalExpression">PT15S</t041>
      </t042>
    </t022>
    <t001 id="CC2904" attachedToRef="CC3714">
      <t027>CC3491</t027>
      <t014 id="CC0421" errorRef="CC2872" />
    </t001>
    <t032 id="CC3304" sourceRef="CC2512" targetRef="CC2535" />
    <t032 id="CC3572" sourceRef="CC2605" targetRef="CC3714" />
    <t032 id="CC3651" sourceRef="CC2962" targetRef="CC3714" />
    <t032 id="CC3283" sourceRef="CC3714" targetRef="CC3742" />
    <t032 id="CC3224" sourceRef="CC3742" targetRef="CC2927" />
    <t032 id="CC3667" sourceRef="CC2566" targetRef="CC1024" />
    <t032 id="CC3470" sourceRef="CC1024" targetRef="CC2580" />
    <t032 id="CC3242" name="Nao" sourceRef="CC2535" targetRef="CC2605" />
    <t032 id="CC3174" sourceRef="CC2580" targetRef="CC2605" />
    <t032 id="CC3654" sourceRef="CC3013" targetRef="CC2566" />
    <t032 id="CC3228" sourceRef="CC2566" targetRef="CC0791" />
    <t032 id="CC3344" sourceRef="CC0791" targetRef="CC2580" />
    <t032 id="CC3478" name="Sim" sourceRef="CC2535" targetRef="CC3013">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable("resultado_analise_score_biometria") &amp;&amp; resultado_analise_score_biometria == 'wayout'}</t008>
    </t032>
    <t032 id="CC3201" name="IP" sourceRef="CC2614" targetRef="CC0870">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('segmento') &amp;&amp; segmento == "4"}</t008>
    </t032>
    <t032 id="CC3491" sourceRef="CC2904" targetRef="CC2962" />
    <t033 id="CC0242" name="CC0137" camunda:type="external" CC3089="CC0032">
      <t019>
        <t058>
          <t059 name="CC0052">
            <t061>
              <t050 key="CC4016">${CC4016}</t050>
              <t050 key="CC4129">${CC4129}</t050>
              <t050 key="CC4422">${CC4422}</t050>
              <t050 key="CC4330">${CC4330}</t050>
              <t050 key="CC4178">${CC4178}</t050>
              <t050 key="CC4115">${execution.hasVariable("numero_unico_conta") ? execution.getVariable("numero_unico_conta") : CC0246}</t050>
              <t050 key="id_origem">6</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3172</t021>
      <t027>CC3474</t027>
    </t033>
    <t032 id="CC3474" sourceRef="CC0242" targetRef="CC0240" />
    <t031 id="CC1630" name="CC1248" scriptFormat="groovy" camunda:resultVariable="efetivacao_inss">
      <t021>CC3656</t021>
      <t021>CC3213</t021>
      <t021>CC3631</t021>
      <t027>CC3172</t027>
      <t030>[
'solicitado_beneficio_inss':CC4009.hasVariable('CC2776') ? CC4009.CC3819('CC2776') : false, 'CC0957':CC4009.hasVariable('CC0957') ? CC4009.CC3819('CC0957') : null, 'autorizacao_beneficio_inss':CC4009.hasVariable('CC0290') ? CC4009.CC3819('CC0290') : false, 'datetime_autorizacao_beneficio_inss':CC4009.hasVariable('CC0098') ? CC4009.CC3819('CC0098') : null, 'validado_beneficio_inss':CC4009.hasVariable('correlation_validacao_inss'), 'correlation_validacao_inss':CC4009.hasVariable('correlation_validacao_inss') ? CC4009.CC3819('correlation_validacao_inss') : null, 'efetivado_beneficio_inss':CC4009.hasVariable('correlation_efetivacao_inss'), 'correlation_efetivacao_inss':CC4009.hasVariable('correlation_efetivacao_inss') ? CC4009.CC3819('correlation_efetivacao_inss') : null, 'CC0387':CC4009.hasVariable('CC0387') ? CC4009.CC3819('CC0387') : null
</t030>
    </t031>
    <t032 id="CC3172" sourceRef="CC1630" targetRef="CC0242" />
    <t032 id="CC3213" name="Não" sourceRef="CC2577" targetRef="CC1630" />
    <t032 id="CC3631" sourceRef="CC0689" targetRef="CC1630" />
    <t001 id="CC2984" name="CC2860" attachedToRef="CC0756">
      <t027>CC3437</t027>
      <t014 id="CC0439" errorRef="CC2863" camunda:errorCodeVariable="codigo_erro_valida_beneficio_inss" camunda:errorMessageVariable="mensagem_erro_valida_beneficio_inss" />
    </t001>
    <t032 id="CC3437" sourceRef="CC2984" targetRef="CC0756" />
    <t001 id="CC2887" attachedToRef="CC0756">
      <t027>CC3247</t027>
      <t014 id="CC0419" camunda:errorCodeVariable="codigo_erro_valida_beneficio_inss" camunda:errorMessageVariable="mensagem_erro_valida_beneficio_inss" />
    </t001>
    <t032 id="CC3247" name="CC3766" sourceRef="CC2887" targetRef="CC2577" />
    <t033 id="CC0640" name="CC0364" camunda:type="external" CC3089="efetivarChequeEspecial">
      <t019>
        <t058>
          <t059 name="CC0058">${true}</t059>
          <t059 name="CC1059">${CC3817}</t059>
          <t063 name="CC0108">
            <t061>
              <t050 key="id_produto_rotativo">${execution.getVariable('id_produto_rotativo')}</t050>
              <t050 key="descricao">${execution.getVariable('descricao')}</t050>
              <t050 key="ndias">${execution.getVariable('ndias')}</t050>
              <t050 key="tipo_produto">${execution.getVariable('tipo_produto')}</t050>
              <t050 key="familia_produto">${execution.getVariable('familia_produto')}</t050>
              <t050 key="data_contratacao">${execution.getVariable('data_contratacao')}</t050>
              <t050 key="valor_limite">${execution.getVariable('valor_limite')}</t050>
              <t050 key="valor_limite_adicional">${execution.getVariable('valor_limite_adicional')}</t050>
              <t050 key="valor_total_limites_contratados">${execution.getVariable('valor_total_limites_contratados')}</t050>
              <t050 key="iof">${execution.getVariable('iof')}</t050>
              <t050 key="valor_total_operacao">${execution.getVariable('valor_total_operacao')}</t050>
              <t050 key="data_vencimento_contrato">${execution.getVariable('data_vencimento_contrato')}</t050>
              <t050 key="taxa_juros_moratorios">${execution.getVariable('taxa_juros_moratorios')}</t050>
              <t050 key="periodicidade">${execution.getVariable('periodicidade')}</t050>
              <t050 key="custo_efetivo_total_mensal">${execution.getVariable('custo_efetivo_total_mensal')}</t050>
              <t050 key="custo_efetivo_total_anual">${execution.getVariable('custo_efetivo_total_anual')}</t050>
              <t050 key="taxa_juros_mensal">${execution.getVariable('taxa_juros_mensal')}</t050>
              <t050 key="taxa_juros_anual">${execution.getVariable('taxa_juros_anual')}</t050>
              <t050 key="horario_operacao">${execution.getVariable('horario_operacao')}</t050>
              <t050 key="data_operacao">${execution.getVariable('data_operacao')}</t050>
              <t050 key="autenticacao_comprovante">${execution.getVariable('autenticacao_comprovante')}</t050>
              <t050 key="dia_pagamento_encargos">${execution.getVariable('dia_pagamento_encargos')}</t050>
              <t050 key="CC1690">${execution.getVariable('tipo_formalizacao')}</t050>
              <t050 key="indicador_fora_horario_online">${execution.getVariable('indicador_fora_horario_online')}</t050>
              <t050 key="quantidade_dias_sem_juros">${execution.getVariable('quantidade_dias_sem_juros')}</t050>
              <t050 key="percentual_valor_total_operacao">${execution.getVariable('percentual_valor_total_operacao')}</t050>
              <t050 key="percentual_valor_seguro">${execution.getVariable('percentual_valor_seguro')}</t050>
              <t050 key="percentual_valor_iof">${execution.getVariable('percentual_valor_iof')}</t050>
              <t050 key="percentual_valor_limite">${execution.getVariable('percentual_valor_limite')}</t050>
            </t061>
          </t063>
        </t058>
        <t051 event="start">
          <t066 scriptFormat="groovy">def tentativas_efetivacao_lis = CC4009.hasVariable('tentativas_efetivacao_lis') ? CC4009.CC3819('tentativas_efetivacao_lis') : 0; CC4009.CC3850('tentativas_efetivacao_lis', tentativas_efetivacao_lis + 1);</t066>
        </t051>
      </t019>
      <t021>CC3214</t021>
      <t027>CC3567</t027>
    </t033>
    <t018 id="CC2585" name="CC0125" default="CC3443">
      <t021>CC3355</t021>
      <t027>CC3370</t027>
      <t027>CC3443</t027>
    </t018>
    <t018 id="CC2617" default="CC3647">
      <t021>CC3567</t021>
      <t021>CC3370</t021>
      <t021>CC3309</t021>
      <t027>CC3647</t027>
    </t018>
    <t031 id="CC1212" name="CC0071" scriptFormat="groovy">
      <t021>CC3448</t021>
      <t027>CC3214</t027>
      <t030>def variaveisConta = CC4009.CC3819('CC0806')
def CC4330 = variaveisConta.get("codigo_conta")
def CC4178 = variaveisConta.get("codigo_agencia")
def CC4422 = variaveisConta.get("CC4422")
def CC4115 = CC4178 + CC4330 + CC4422
CC4009.CC3850("CC4115", CC4115)

def valorLimiteLis(){
def valorLimite = null
if(CC4009.hasVariable("limiterotativo_credito_v3_aberturacontas_resposta") &amp;&amp; CC4009.CC3819("limiterotativo_credito_v3_aberturacontas_resposta") != null &amp;&amp; CC4009.CC3819('limiterotativo_credito_v3_aberturacontas_resposta') != ''){ valorLimite = CC4009.CC3819("limiterotativo_credito_v3_aberturacontas_resposta")['valor_lis_pre_aprovado']; } else{ valorLimite = CC4009.CC3819("response_obter_limiteR0")['valor_lis_pre_aprovado'] } return valorLimite.toString() }

def valor_limite = valorLimiteLis()

def contrato_lis = [:]
contrato_lis.put("valor_limite", valor_limite)
contrato_lis.put("id_produto_rotativo", CC2830['CC1986'])
contrato_lis.put("CC1690", CC2830['CC1690'])
contrato_lis.put("dia_pagamento_encargos", CC2830['CC0866'])
contrato_lis.put("CC2658", CC2830['CC2658'])
contrato_lis.put("CC0887", CC2830['CC0887'])
contrato_lis.put("CC1042", CC2830['CC1042']) contrato_lis.put("valor_limite_pre_aprovado_global", CC2830['CC3115']) contrato_lis.put("CC2727", CC2830['CC2727']) contrato_lis.put("CC0693", CC2830['CC0693'])

def builderContratoCC = new groovy.json.JsonBuilder()
builderContratoCC(contrato_lis)

CC4009.CC3850("contrato_lis", builderContratoCC.toString())</t030>
    </t031>
    <t022 id="CC2907" name="6h às 20h">
      <t021>CC3443</t021>
      <t021>CC3233</t021>
      <t027>CC3571</t027>
      <t042 id="CC0500">
        <t040 xsi:type="bpmn:tFormalExpression">* * 6-19 ? * * *</t040>
      </t042>
    </t022>
    <t033 id="CC0632" name="CC2752" camunda:type="external" CC3089="CC0205">
      <t019>
        <t058>
          <t059 name="CC4115">004341${CC4178}${CC4330}${CC4422}</t059>
        </t058>
      </t019>
      <t021>CC3571</t021>
      <t027>CC3260</t027>
    </t033>
    <t018 id="CC2602" name="CC1805" default="CC3448">
      <t021>CC3260</t021>
      <t027>CC3448</t027>
      <t027>CC3262</t027>
    </t018>
    <t023 id="CC2882" name="CC2046">
      <t021>CC3262</t021>
      <t024 id="CC0565" name="CC2668" />
    </t023>
    <t018 id="CC2574" name="CC1185" default="CC3328">
      <t021>CC3379</t021>
      <t027>CC3309</t027>
      <t027>CC3328</t027>
    </t018>
    <t018 id="CC2544" name="CC0341" default="CC3198">
      <t021>CC3328</t021>
      <t027>CC3179</t027>
      <t027>CC3198</t027>
    </t018>
    <t043 id="CC0809" name="CC0621">
      <t021>CC3198</t021>
      <t021>CC3634</t021>
      <t027>CC3634</t027>
    </t043>
    <t022 id="CC3033" name="CC0760">
      <t021>CC3179</t021>
      <t027>CC3233</t027>
      <t042 id="CC0523">
        <t041 xsi:type="bpmn:tFormalExpression">P1D</t041>
      </t042>
    </t022>
    <t001 id="CC2900" attachedToRef="CC0640">
      <t027>CC3379</t027>
      <t014 id="CC0433" camunda:errorCodeVariable="codigo_erro_lis" camunda:errorMessageVariable="mensagem_erro_lis" />
    </t001>
    <t032 id="CC3214" sourceRef="CC1212" targetRef="CC0640" />
    <t032 id="CC3567" sourceRef="CC0640" targetRef="CC2617" />
    <t032 id="CC3370" name="Não" sourceRef="CC2585" targetRef="CC2617">
      <t008 xsi:type="bpmn:tFormalExpression">${oferta_produto['optante_produto'] == false}</t008>
    </t032>
    <t032 id="CC3443" name="Sim" sourceRef="CC2585" targetRef="CC2907" />
    <t032 id="CC3309" name="Sim" sourceRef="CC2574" targetRef="CC2617">
      <t008 xsi:type="bpmn:tFormalExpression">${mensagem_erro_lis.contains("contrato foi encontrado e está ativo")}</t008>
    </t032>
    <t032 id="CC3233" sourceRef="CC3033" targetRef="CC2907" />
    <t032 id="CC3571" sourceRef="CC2907" targetRef="CC0632" />
    <t032 id="CC3260" sourceRef="CC0632" targetRef="CC2602" />
    <t032 id="CC3448" name="Não" sourceRef="CC2602" targetRef="CC1212" />
    <t032 id="CC3262" name="Sim" sourceRef="CC2602" targetRef="CC2882">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable("responseConsultaConta") &amp;&amp; (((responseConsultaConta[0].status_encerramento == "B" || responseConsultaConta[0].status_encerramento == "C") &amp;&amp; responseConsultaConta[0].codigo_fase_encerramento == "8") || responseConsultaConta[0].status_encerramento == "E")}</t008>
    </t032>
    <t032 id="CC3379" sourceRef="CC2900" targetRef="CC2574" />
    <t032 id="CC3328" name="Não" sourceRef="CC2574" targetRef="CC2544" />
    <t032 id="CC3179" name="Não" sourceRef="CC2544" targetRef="CC3033">
      <t008 xsi:type="bpmn:tFormalExpression">${tentativas_efetivacao_lis &lt; 7}</t008>
    </t032>
    <t032 id="CC3198" name="Sim" sourceRef="CC2544" targetRef="CC0809" />
    <t032 id="CC3634" sourceRef="CC0809" targetRef="CC0809" />
    <t032 id="CC3647" sourceRef="CC2617" targetRef="CC2552" />
    <t032 id="CC3355" sourceRef="CC2533" targetRef="CC2585" />
    <t032 id="CC3236" name="CC4253" sourceRef="CC3114" targetRef="CC3917">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('voltar') &amp;&amp; voltar=="dados_inss"}</t008>
    </t032>
    <t001 id="CC2973" attachedToRef="CC0934">
      <t027>CC3303</t027>
      <t009 id="CC0190">
        <t007 xsi:type="bpmn:tFormalExpression">${analise_de_pld.situacao_processamento == 'SUCESSO'}</t007>
      </t009>
    </t001>
    <t031 id="CC0540" name="CC0575" scriptFormat="groovy">
      <t019>
        <t058>
          <t059 name="CC0631">${(execution.hasVariable("numero_unico_conta") &amp;&amp; numero_unico_conta != null &amp;&amp; numero_unico_conta != 'null' &amp;&amp; numero_unico_conta != '' ) ? execution.getVariable("numero_unico_conta") : CC0246}</t059>
        </t058>
      </t019>
      <t021>CC3395</t021>
      <t027>CC3614</t027>
      <t030>// Criação do id_analise que deve ser enviado para CC4410 (CC4276/CC3921)

def CC0631 = CC4009.CC3819('CC0631')

CC4009.CC3850(
"variaveis_especificas",
[
[
"CC0631": CC0631,
"codigo_canal": CC4009.CC3819('codigo_canal'),
"codigo_origem_proposta": null
]
]
)</t030>
    </t031>
    <t032 id="CC3614" sourceRef="CC0540" targetRef="CC2701" />
    <t033 id="CC2701" name="CC0932" camunda:type="external" CC3089="CC0107">
      <t011>CC0031 «U000017»

Link Git --&gt; «U000028»</t011>
      <t019>
        <t058>
          <t059 name="CC0037">
            <t061>
              <t050 key="CC0586">${CC4016}</t050>
              <t050 key="codigo_identificacao_pessoa_temporario">${CC3112}</t050>
              <t050 key="codigo_identificacao_pessoa_inquilino">${id_inquilino}</t050>
              <t050 key="codigo_solicitacao_jornada">${execution.getVariable('id_solicitacao_efetivacao_limite')}</t050>
              <t050 key="codigo_familia_produto">28340</t050>
              <t050 key="codigo_produto_operacional">001</t050>
              <t050 key="variaveis_especificas">${variaveis_especificas}</t050>
            </t061>
          </t059>
          <t059 name="CC0043">
            <t061>
              <t050 key="CC3755">CC4397</t050>
              <t050 key="CC1057">CC0283</t050>
              <t050 key="CC1693">CC0402</t050>
            </t061>
          </t059>
          <t059 name="CC0015">${true}</t059>
        </t058>
      </t019>
      <t021>CC3614</t021>
      <t027>CC3264</t027>
    </t033>
    <t001 id="CC2928" attachedToRef="CC2701">
      <t027>CC3632</t027>
      <t014 id="CC0422" errorRef="CC2872" />
    </t001>
    <t032 id="CC3264" sourceRef="CC2701" targetRef="CC2564" />
    <t032 id="CC3632" sourceRef="CC2928" targetRef="CC2619" />
    <t033 id="CC1022" name="CC0674" camunda:modelerTemplate="CC1041" camunda:modelerTemplateVersion="1" default="CC3547" CC1191="true" CC0630="${operacaoPostDelegate}">
      <t019>
        <t058>
          <t059 name="CC3925">{"CC3136":"CC0149", "CC3137": "CC0150", "CC1058": "CC0049"}</t059>
          <t059 name="CC2823">{"CC3136":"CC0151", "CC3137": "CC0150", "CC1058":"CC0049"}</t059>
          <t059 name="CC3820">{"CC3136":"CC0152", "CC3137":"CC0150", "CC1058":"CC0049"}</t059>
          <t059 name="urlDev">«U000019»</t059>
          <t059 name="urlProd">«U000018»</t059>
          <t059 name="bodyDev">{"CC4016": "${CC4016}", "CC4335": "${CC4335}", "sub_fluxo": "${CC0888}","CC4106":[{"id":"CC4178","valor": "${agencia_logada}"}]}</t059>
          <t059 name="CC3788">{"CC4016": "${CC4016}","CC4335": "${CC4335}","sub_fluxo": "${CC0888}","CC4106":[{"id":"CC4178","valor": "${agencia_logada}"}]}</t059>
          <t059 name="bodyProd">{"CC4016": "${CC4016}","CC4335": "${CC4335}","sub_fluxo": "${CC0888}","CC4106":[{"id":"CC4178","valor": "${agencia_logada}"}]}</t059>
          <t059 name="CC3960"> «U000020»</t059>
          <t063 name="CC0399">${S(response)}</t063>
        </t058>
        <t054 name="withError">
          <t052>true</t052>
        </t054>
        <t054 name="CC1381">
          <t067>erro_direcionador_cliente</t067>
        </t054>
        <t054 name="CC2725">
          <t052>${statusCode != 200}</t052>
        </t054>
      </t019>
      <t021>CC3536</t021>
      <t027>CC3547</t027>
    </t033>
    <t031 id="CC1631" name="CC1411" default="CC3483" CC1191="true" scriptFormat="groovy">
      <t021>CC3547</t021>
      <t021>CC3191</t021>
      <t021>CC3184</t021>
      <t021>CC3580</t021>
      <t027>CC3483</t027>
      <t030>def jsonSlurperClassic = new groovy.json.JsonSlurperClassic(); CC4009.CC3850("response_direcionador_cliente_json", jsonSlurperClassic.parseText(CC0399.toString()))

CC4009.CC3850("response_direcionador_cliente_json",response_direcionador_cliente_json)

if (CC4009.hasVariable("CC0399") &amp;&amp; CC0399 != null &amp;&amp; CC0399?.toString() != "{}") { def segmento= response_direcionador_cliente_json.CC4129.CC3697 CC4009.CC3850("CC4129", CC4129)

def CC2776 = response_direcionador_cliente_json.inss.beneficio
CC4009.CC3850("CC2776",CC2776)

if (CC2776 == true) {
def CC0957 = response_direcionador_cliente_json.inss.CC3722 CC4009.CC3850("CC0957",CC0957) CC4009.CC3850("CC0957",null1l) } def CC1049 = response_direcionador_cliente_json.CC4129.CC1049 CC4009.CC3850("CC1049", CC1049)

def CC3106 = response_direcionador_cliente_json.CC3106.CC3106
CC4009.CC3850("CC3106", CC3106)

if (CC3106 == false)
def CC0597 = response_direcionador_cliente_json.CC3106.CC0597 CC4009.CC3850("CC0597", CC0597)

def CC3948 = response_direcionador_cliente_json.CC3106.CC3948
CC4009.CC3850("CC3948", CC3948)

def CC3117 = response_direcionador_cliente_json.CC3117
CC4009.CC3850("CC3117", CC3117)

}

def id_processo_bacen = response_direcionador_cliente_json.bacen?.CC3825 CC4009.CC3850("id_processo_bacen",id_processo_bacen)

if (id_processo_bacen == null) {
CC4009.CC3850("CC0597", "")
CC4009.CC3850("CC3948", "")
CC4009.CC3850("CC3117", "")
}

}else{
CC4009.CC3850("CC2776",false)
CC4009.CC3850("CC0957",null)
CC4009.CC3850("CC3106", false)
}
CC4009.CC3850("nome_receita_federal", "NAO INFORMADO")</t030>
    </t031>
    <t001 id="CC2885" attachedToRef="CC1022">
      <t027>CC3191</t027>
      <t014 id="CC0455" />
    </t001>
    <t032 id="CC3547" sourceRef="CC1022" targetRef="CC1631" />
    <t032 id="CC3191" sourceRef="CC2885" targetRef="CC1631" />
    <t032 id="CC3420" sourceRef="CC0546" targetRef="CC2519" />
    <t018 id="CC2531" name="CC1607" default="CC3583">
      <t021>CC3489</t021>
      <t021>CC3240</t021>
      <t027>CC3583</t027>
      <t027>CC3298</t027>
    </t018>
    <t032 id="CC3583" sourceRef="CC2531" targetRef="CC2569">
      <t019>
        <t051 event="take">
          <t066 scriptFormat="groovy">CC4009.CC3850("CC4012","false") ;</t066>
        </t051>
      </t019>
    </t032>
    <t032 id="CC3298" sourceRef="CC2531" targetRef="CC0096">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('turn_over') &amp;&amp; turn_over == true}</t008>
    </t032>
    <t018 id="CC2609" name="CC0378" default="CC3362">
      <t021>CC3256</t021>
      <t021>CC3577</t021>
      <t021>CC3484</t021>
      <t027>CC3362</t027>
      <t027>CC3472</t027>
    </t018>
    <t043 id="CC0972" name="CC0931">
      <t019>
        <t055>
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
        </t055>
      </t019>
      <t021>CC3362</t021>
      <t027>CC3446</t027>
    </t043>
    <t012 id="CC3002">
      <t021>CC3223</t021>
      <t037 id="CC0262" />
    </t012>
    <t033 id="CC0949" name="CC0113" default="CC3170" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">1</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="CC2712">$</t050>
              <t050 key="vinculo_selecionado">$</t050>
              <t050 key="consultar_vinculos">$</t050>
              <t050 key="CC3817">$</t050>
              <t050 key="CC4421">$</t050>
              <t050 key="CC4016">$</t050>
              <t050 key="CC2776">$</t050>
              <t050 key="CC0957">$</t050>
              <t050 key="CC4012">$</t050>
              <t050 key="response_direcionador_cliente_json">$</t050>
              <t050 key="CC4129">$</t050>
              <t050 key="troca_conta">$</t050>
              <t050 key="nome_receita_federal">$</t050>
              <t050 key="CC3106">$</t050>
              <t050 key="CC2721">$</t050>
              <t050 key="CC2020">$</t050>
              <t050 key="tipo_doc_comprovante">$</t050>
              <t050 key="CC1658">$</t050>
              <t050 key="CC1689">$</t050>
              <t050 key="cpf_representante">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="CC2712">${execution.hasVariable('receber_salario') ? receber_salario : false}</t050>
              <t050 key="vinculo_selecionado">${execution.hasVariable('vinculo_selecionado') ? vinculo_selecionado : null}</t050>
              <t050 key="consultar_vinculos">${execution.hasVariable('consultar_vinculos') ? consultar_vinculos : false}</t050>
              <t050 key="CC3817">${CC3817}</t050>
              <t050 key="CC4421">${CC4421}</t050>
              <t050 key="CC4016">${CC4016}</t050>
              <t050 key="CC2776">${execution.hasVariable('beneficio_inss') ? beneficio_inss: false}</t050>
              <t050 key="CC0957">${execution.hasVariable('numero_beneficio_inss') ? numero_beneficio_inss: null}</t050>
              <t050 key="CC4012">${CC4012}</t050>
              <t050 key="response_direcionador_cliente_json">${execution.hasVariable('response_direcionador_cliente_json') ? response_direcionador_cliente_json : null}</t050>
              <t050 key="CC4129">${CC4129}</t050>
              <t050 key="troca_conta">${execution.hasVariable('trocar_conta') ? trocar_conta: false}</t050>
              <t050 key="nome_receita_federal">${execution.getVariable('nome_receita_federal')}</t050>
              <t050 key="CC3106">${CC3106}</t050>
              <t050 key="CC2721">${CC2721}</t050>
              <t050 key="CC2020">${CC2020}</t050>
              <t050 key="tipo_doc_comprovante">${execution.hasVariable('tipo_doc_comprovante') ? tipo_doc_comprovante: false}</t050>
              <t050 key="CC1658">${execution.hasVariable('envio_comprovante') ? envio_comprovante: false}</t050>
              <t050 key="CC1689">${CC1689}</t050>
              <t050 key="cpf_representante">${execution.hasVariable('cpf_representante') ? cpf_representante: "null"}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3472</t021>
      <t027>CC3170</t027>
    </t033>
    <t001 id="CC2935" attachedToRef="CC0972">
      <t027>CC3372</t027>
      <t042 id="CC0491">
        <t041 xsi:type="bpmn:tFormalExpression">PT3M</t041>
      </t042>
    </t001>
    <t032 id="CC3362" name="Não" sourceRef="CC2609" targetRef="CC0972" />
    <t032 id="CC3472" sourceRef="CC2609" targetRef="CC0949">
      <t008 xsi:type="bpmn:tFormalExpression">${(execution.hasVariable('segmento') &amp;&amp; (segmento == "3" || segmento=="L" || segmento=="1" || segmento=="4"))}</t008>
    </t032>
    <t032 id="CC3446" sourceRef="CC0972" targetRef="CC0347" />
    <t032 id="CC3372" sourceRef="CC2935" targetRef="CC0347" />
    <t032 id="CC3381" sourceRef="CC0331" targetRef="CC2569" />
    <t036 id="CC1695" name="CC3082">
      <t019>
        <t058>
          <t059 name="mapempty">
            <t061 />
          </t059>
        </t058>
      </t019>
      <t021>CC3314</t021>
      <t027>CC3642</t027>
      <t035 id="CC2932">
        <t027>CC3550</t027>
      </t035>
      <t018 id="CC2537" name="CC3078" default="CC3197">
        <t021>CC3550</t021>
        <t027>CC3197</t027>
        <t027>CC3276</t027>
      </t018>
      <t018 id="CC2548" default="CC3241">
        <t021>CC3197</t021>
        <t021>CC3609</t021>
        <t021>CC3442</t021>
        <t027>CC3241</t027>
      </t018>
      <t033 id="CC2033" name="CC1627" camunda:type="external" CC3089="CC0401">
        <t019>
          <t058>
            <t059 name="CC0033">${true}</t059>
            <t059 name="CC0100">
              <t061>
                <t050 key="numeroAgencia">${conta_reservada['agencia']}</t050>
                <t050 key="numeroContaCorrente">${conta_reservada['conta']}</t050>
                <t050 key="numeroDigitoVerificadorContaCorrente">${conta_reservada['dac']}</t050>
                <t050 key="numeroSequenciaTitularContaCorrente">1</t050>
                <t050 key="codigoIdentificacaoPessoa">${CC4016}</t050>
                <t050 key="codigoCanalorigem">${codigo_canal}</t050>
                <t050 key="codigoProxyCartao">${CC0531}</t050>
                <t050 key="cpfCnpj">${CC4421}</t050>
                <t050 key="codigoTipoFuncionalidadeCartao">M</t050>
              </t061>
            </t059>
            <t063 name="CC0135">${execution.getVariable("CC0135")}</t063>
          </t058>
        </t019>
        <t021>CC3225</t021>
        <t027>CC3356</t027>
      </t033>
      <t018 id="CC2571" default="CC3415">
        <t021>CC3356</t021>
        <t027>CC3601</t027>
        <t027>CC3415</t027>
        <t027>CC3347</t027>
      </t018>
      <t043 id="CC0868" name="CC0832" default="CC3204" CC1191="true">
        <t011>CC0009</t011>
        <t019>
          <t055>
            <t056 id="CC0709" label="CC4352 Error Code" type="string" defaultValue="${execution.getVariable(&quot;vincula_proxy_bc_ebe_code&quot;) != null ? execution.getVariable(&quot;vincula_proxy_bc_ebe_code&quot;) : &quot;&quot;}">
              <t068>
                <t049 name="readonly" />
              </t068>
            </t056>
            <t056 id="CC0550" label="CC4352 Error CC4164" type="string" defaultValue="${execution.getVariable(&quot;vincula_proxy_bc_ebe_message&quot;) != null ? execution.getVariable(&quot;vincula_proxy_bc_ebe_message&quot;) : &quot;&quot;}">
              <t068>
                <t049 name="readonly" />
              </t068>
            </t056>
            <t056 id="CC3828" label="CC3828" type="string" defaultValue="${execution.hasVariable(&quot;CC0135&quot;) ?&#10;execution.getVariable(&quot;CC0135&quot;)[&quot;controlArea&quot;][&quot;areaStat&quot;][&quot;indStatPro&#10;&#10;&#10;c&quot;] : null}">
              <t068>
                <t049 name="readonly" />
              </t068>
            </t056>
            <t056 id="CC4198" label="CC4198" type="string" defaultValue="${execution.hasVariable(&quot;CC0135&quot;) ?&#10;execution.getVariable(&quot;CC0135&quot;)[&quot;controlArea&quot;][&quot;areaStat&quot;][&quot;indCtna&quot;] : null}">
              <t068>
                <t049 name="readonly" />
              </t068>
            </t056>
            <t056 id="CC3796" label="CC3796" type="string" defaultValue="${execution.hasVariable(&quot;CC0135&quot;) ?&#10;execution.getVariable(&quot;CC0135&quot;)[&quot;controlArea&quot;][&quot;areaStat&quot;][&quot;codSistMens&quot;] : null}">
              <t068>
                <t049 name="readonly" />
              </t068>
            </t056>
            <t056 id="CC4185" label="CC4185" type="string" defaultValue="${execution.hasVariable(&quot;CC0135&quot;) ?&#10;execution.getVariable(&quot;CC0135&quot;)[&quot;controlArea&quot;][&quot;areaStat&quot;][&quot;codMens&quot;] : null}">
              <t068>
                <t049 name="readonly" />
              </t068>
            </t056>
            <t056 id="CC4190" label="CC4190" type="string" defaultValue="${execution.hasVariable(&quot;CC0135&quot;) ?&#10;execution.getVariable(&quot;CC0135&quot;)[&quot;controlArea&quot;][&quot;areaStat&quot;][&quot;desMens&quot;] : null}">
              <t068>
                <t049 name="readonly" />
              </t068>
            </t056>
            <t056 id="CC0211" label="Continuar CC4078 Manualmente" type="boolean">
              <t068>
                <t049 name="required" />
              </t068>
            </t056>
            <t056 id="CC0323" label="Motivo seguir manualmente" type="string">
              <t068>
                <t049 name="required" />
                <t049 name="minlength" config="10" />
              </t068>
            </t056>
          </t055>
          <t053>R3/PT5S</t053>
        </t019>
        <t021>CC3452</t021>
        <t021>CC3204</t021>
        <t027>CC3204</t027>
        <t027>CC3169</t027>
      </t043>
      <t023 id="CC2993">
        <t021>CC3415</t021>
        <t027>CC3389</t027>
      </t023>
      <t022 id="CC2974" name="10m">
        <t019>
          <t053>R6/PT10S</t053>
        </t019>
        <t021>CC3347</t021>
        <t027>CC3562</t027>
        <t042 id="CC0495">
          <t041 xsi:type="bpmn:tFormalExpression">PT10M</t041>
        </t042>
      </t022>
      <t033 id="CC0803" name="CC0217" CC1191="true" CC0630="#{CC0676}">
        <t019>
          <t058>
            <t059 name="CC3826">${CC3826}</t059>
            <t059 name="CC1214">
              <t066 scriptFormat="groovy">[
"CC4337": "\$",
"vincular": "\$.CC4337",
"manual": "\$.CC4337.vincular",
"CC4190": "\$.CC4337.vincular",
"CC4185": "\$.CC4337.vincular",
"CC3796": "\$.CC4337.vincular",
"CC4198": "\$.CC4337.vincular",
"CC3828": "\$.CC4337.vincular",
"error_code": "\$.CC4337.vincular",
"error_message": "\$.CC4337.vincular",
"CC4274": "\$.CC4337.vincular.manual",
"continuar": "\$.CC4337.vincular.manual",
] as HashMap</t066>
            </t059>
            <t059 name="CC2802">
              <t061>
                <t050 key="CC3828">${execution.hasVariable("CC0135") ? execution.getVariable("CC0135")["controlArea"]["areaStat"]["indStatProc"] : null}</t050>
                <t050 key="CC3796">${execution.hasVariable("CC0135") ? execution.getVariable("CC0135")["controlArea"]["areaStat"]["codSistMens"] : null}</t050>
                <t050 key="CC4185">${execution.hasVariable("CC0135") ? execution.getVariable("CC0135")["controlArea"]["areaStat"]["codMens"] : null}</t050>
                <t050 key="CC4198">${execution.hasVariable("CC0135") ? execution.getVariable("CC0135")["controlArea"]["areaStat"]["indCtna"] : null}</t050>
                <t050 key="error_code">${execution.getVariable("vincula_proxy_bc_ebe_code")}</t050>
                <t050 key="error_message">${execution.getVariable("vincula_proxy_bc_ebe_message")}</t050>
                <t050 key="continuar">${execution.getVariable("vincular_proxy_bc_manual_continuar")}</t050>
                <t050 key="CC4274">${execution.getVariable("vincular_proxy_bc_manual_motivo")}</t050>
                <t050 key="CC4337">${mapempty}</t050>
                <t050 key="vincular">${mapempty}</t050>
                <t050 key="manual">${mapempty}</t050>
                <t050 key="CC4190">${execution.hasVariable("CC0135") ? execution.getVariable("CC0135")["controlArea"]["areaStat"]["desMens"] : null}</t050>
              </t061>
            </t059>
          </t058>
          <t053>R3/PT5S</t053>
        </t019>
        <t021>CC3616</t021>
        <t021>CC3227</t021>
        <t021>CC3648</t021>
        <t027>CC3514</t027>
      </t033>
      <t028 id="CC2618">
        <t021>CC3601</t021>
        <t027>CC3609</t027>
        <t027>CC3227</t027>
      </t028>
      <t028 id="CC2567">
        <t021>CC3515</t021>
        <t027>CC3452</t027>
        <t027>CC3616</t027>
      </t028>
      <t012 id="CC2982">
        <t021>CC3514</t021>
      </t012>
      <t018 id="CC2524" default="CC3229">
        <t021>CC3218</t021>
        <t027>CC3229</t027>
        <t027>CC3339</t027>
      </t018>
      <t022 id="CC2987" name="5m">
        <t019>
          <t053>R3/PT5S</t053>
        </t019>
        <t021>CC3339</t021>
        <t027>CC3386</t027>
        <t042 id="CC0499">
          <t041 xsi:type="bpmn:tFormalExpression">PT5M</t041>
        </t042>
      </t022>
      <t028 id="CC2526">
        <t021>CC3169</t021>
        <t027>CC3442</t027>
        <t027>CC3648</t027>
      </t028>
      <t022 id="CC2845" name="CC2850">
        <t019>
          <t053>R3/PT5S</t053>
        </t019>
        <t021>CC3276</t021>
        <t021>CC3562</t021>
        <t021>CC3386</t021>
        <t027>CC3225</t027>
        <t042 id="CC0480">
          <t040 xsi:type="bpmn:tFormalExpression">* * 8-19 ? * * *</t040>
        </t042>
      </t022>
      <t018 id="CC2558" default="CC3515">
        <t021>CC3389</t021>
        <t021>CC3229</t021>
        <t027>CC3515</t027>
      </t018>
      <t012 id="CC3017">
        <t021>CC3241</t021>
      </t012>
      <t001 id="CC2988" CC1191="true" attachedToRef="CC2033">
        <t027>CC3218</t027>
        <t014 id="CC0407" camunda:errorCodeVariable="CC0709" camunda:errorMessageVariable="CC0550" />
      </t001>
      <t032 id="CC3550" sourceRef="CC2932" targetRef="CC2537" />
      <t032 id="CC3197" sourceRef="CC2537" targetRef="CC2548" />
      <t032 id="CC3276" sourceRef="CC2537" targetRef="CC2845">
        <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('proxyIsValid') &amp;&amp; proxyIsValid == "0"}</t008>
      </t032>
      <t032 id="CC3609" sourceRef="CC2618" targetRef="CC2548" />
      <t032 id="CC3442" sourceRef="CC2526" targetRef="CC2548" />
      <t032 id="CC3241" sourceRef="CC2548" targetRef="CC3017" />
      <t032 id="CC3225" sourceRef="CC2845" targetRef="CC2033" />
      <t032 id="CC3356" sourceRef="CC2033" targetRef="CC2571" />
      <t032 id="CC3601" name="CC2638" sourceRef="CC2571" targetRef="CC2618">
        <t008 xsi:type="bpmn:tFormalExpression" language="groovy">def areaStat = CC4009.CC3819("CC0135")["controlArea"]["areaStat"] ?: [:]; def CC4198 = areaStat["CC4198"]; def CC3828 = areaStat["CC3828"]; def CC3796 = areaStat["CC3796"]; def CC4185 = areaStat["CC4185"]; def iicc = "$CC4198-$CC3828-$CC3796-$CC4185";

return (
(CC3828 == "P") // Geral
|| (iicc == "CC2759") // ORG NAO ENCONTRADA PARA ESTE CARTAO
|| (iicc == "CC2758") // ORG NAO ENCONTRADA PARA ESTE CARTAO
|| (iicc == "CC3054") // PROCESSAMENTO EFETUADO
);</t008>
      </t032>
      <t032 id="CC3415" name="CC1187" sourceRef="CC2571" targetRef="CC2993" />
      <t032 id="CC3347" name="retentar" sourceRef="CC2571" targetRef="CC2974">
        <t008 xsi:type="bpmn:tFormalExpression" language="groovy">def vincula_proxy_bc_tentativa = CC4009.CC3819("vincula_proxy_bc_tentativa") ?: 0 def areaStat = CC4009.CC3819("CC0135")["controlArea"]["areaStat"] ?: [:] def CC4198 = areaStat["CC4198"] def CC3828 = areaStat["CC3828"] def CC3796 = areaStat["CC3796"] def CC4185 = areaStat["CC4185"] def iicc = "$CC4198-$CC3828-$CC3796-$CC4185"

def tentar = (
(iicc == "CC3050") // servico indisponivel no momento.
|| (iicc == "CC3051") // servico indisponivel no momento.
|| (iicc == "CC3048") // servico indisponivel no momento.
|| (iicc == "CC3049") // servico indisponivel no momento.
|| (iicc == "CC3053") // transacao ims stopada bc0i4ax
|| (iicc == "CC3052") // houve timeout no micro-servico bc020833 - partner cics_oz
)

if (vincula_proxy_bc_tentativa &lt; 6 &amp;&amp; tentar) {
CC4009.CC3850("vincula_proxy_bc_tentativa", ++vincula_proxy_bc_tentativa)
return true
}
return false</t008>
      </t032>
      <t032 id="CC3452" sourceRef="CC2567" targetRef="CC0868" />
      <t032 id="CC3204" sourceRef="CC0868" targetRef="CC0868" />
      <t032 id="CC3169" sourceRef="CC0868" targetRef="CC2526">
        <t008 xsi:type="bpmn:tFormalExpression">${CC0211}</t008>
      </t032>
      <t032 id="CC3389" sourceRef="CC2993" targetRef="CC2558" />
      <t032 id="CC3562" sourceRef="CC2974" targetRef="CC2845" />
      <t032 id="CC3616" sourceRef="CC2567" targetRef="CC0803" />
      <t032 id="CC3227" sourceRef="CC2618" targetRef="CC0803" />
      <t032 id="CC3648" sourceRef="CC2526" targetRef="CC0803" />
      <t032 id="CC3514" sourceRef="CC0803" targetRef="CC2982" />
      <t032 id="CC3515" sourceRef="CC2558" targetRef="CC2567" />
      <t032 id="CC3218" sourceRef="CC2988" targetRef="CC2524" />
      <t032 id="CC3229" sourceRef="CC2524" targetRef="CC2558" />
      <t032 id="CC3339" name="retentar" sourceRef="CC2524" targetRef="CC2987">
        <t008 xsi:type="bpmn:tFormalExpression" language="groovy">def vincula_proxy_bc_ebe_tentativa = CC4009.CC3819("vincula_proxy_bc_ebe_tentativa") ?: 0

if (vincula_proxy_bc_ebe_tentativa &lt; 3) {
CC4009.CC3850("vincula_proxy_bc_ebe_tentativa", ++vincula_proxy_bc_ebe_tentativa);
return true;
}
return false; </t008>
      </t032>
      <t032 id="CC3386" sourceRef="CC2987" targetRef="CC2845" />
    </t036>
    <t036 id="CC1698" name="CC0720" CC0816>
      <t012 id="CC3045">
        <t021>CC3569</t021>
        <t021>CC3331</t021>
      </t012>
      <t035 id="CC3023" name="CC1962" isInterrupting="false">
        <t019>
          <t051 event="start">
            <t066 scriptFormat="groovy">CC4009.removeVariable('CC0539')

// Criação do id_analise que deve ser enviado para CC4410 (CC4276/CC3921) CC4009.CC3850("id_solicitacao_efetivacao_limite", CC4009.getId())

// Variável para CC4096 do CC4429 em CC4347 de CC4276
def CC4012 = CC4009.hasVariable('CC4012') ? CC4009.CC3819('CC4012') : false

CC4009.CC3850(
"variaveis_especificas",
[
[
"CC0631": "",
"codigo_canal": "11",
"codigo_conta_salario": (fluxo_spi=="CC4036") ? "F" : " ",
"codigo_segmento": CC4129,
"CC3957": "C",
"codigo_tipo_atuacao_titularidade_conta": "0",
"cotitulares": []
]
]
)</t066>
          </t051>
        </t019>
        <t027>CC3397</t027>
        <t009 id="CC0189" camunda:variableName="CC0539">
          <t007 xsi:type="bpmn:tFormalExpression">${CC0539}</t007>
        </t009>
      </t035>
      <t033 id="CC1019" name="CC0628" camunda:type="external" CC3089="CC0285">
        <t011>CC0031

Link Git --&gt; «U000028»</t011>
        <t019>
          <t058>
            <t059 name="CC0037">
              <t061>
                <t050 key="CC0586">${CC4016}</t050>
                <t050 key="codigo_identificacao_pessoa_temporario">${CC3112}</t050>
                <t050 key="codigo_identificacao_pessoa_inquilino">${id_inquilino}</t050>
                <t050 key="codigo_solicitacao_jornada">${id_solicitacao_efetivacao_limite}</t050>
                <t050 key="codigo_familia_produto">28340</t050>
                <t050 key="codigo_produto_operacional">001</t050>
                <t050 key="variaveis_especificas">${variaveis_especificas}</t050>
              </t061>
            </t059>
            <t059 name="CC0043">
              <t061>
                <t050 key="CC3755">CC4397</t050>
                <t050 key="CC1057">CC0169</t050>
                <t050 key="CC1693">CC0402</t050>
              </t061>
            </t059>
            <t059 name="CC0015">${true}</t059>
          </t058>
        </t019>
        <t021>CC3397</t021>
        <t027>CC3569</t027>
      </t033>
      <t001 id="CC3021" attachedToRef="CC1019">
        <t027>CC3331</t027>
        <t014 id="CC0435" camunda:errorCodeVariable="codigo_erro_PUC" />
      </t001>
      <t032 id="CC3569" sourceRef="CC1019" targetRef="CC3045" />
      <t032 id="CC3331" sourceRef="CC3021" targetRef="CC3045" />
      <t032 id="CC3397" sourceRef="CC3023" targetRef="CC1019" />
    </t036>
    <t031 id="CC0701" name="CC0889" scriptFormat="groovy">
      <t021>CC3532</t021>
      <t027>CC3439</t027>
      <t030>import static net.logstash.logback.argument.StructuredArguments.value
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.CC4378.Instant
import java.CC4378.Duration

final Logger logger = LoggerFactory.getLogger("CC0025")

Instant inicio = Instant.now()
def datePart = CC4009.CC3819("CC3808");

def dados_pessoa_temp = [:]
def CC4274 = CC4009.hasVariable('CC4274') ? CC4009.CC3819('CC4274') : "";

//Renda
def validacaoRenda = [
"nivel_completude" : 200,
"modo_confirmacao" : 2,
"fonte_confirmacao" : 3,
"status" : 1,
"data_validacao_fonte" : datePart,
"informacoes" : CC4274
]

//CC4338
def CC4338 = CC4009.CC3819("CC3858")
def renda_faturamento = ["valor_dado_cadastral": CC4338, "CC3961": [validacaoRenda]]

//semRenda
def sem_renda_faturamento = ["valor_dado_cadastral":true, "CC3961": [validacaoRenda]]

if (renda==0){
dados_pessoa_temp.put('sem_renda_faturamento', sem_renda_faturamento)

} else{
dados_pessoa_temp.put('renda_faturamento', renda_faturamento)
}


//endereccos
def validacaoEndereco = [
"nivel_completude" : 300,
"modo_confirmacao" : 3,
"fonte_confirmacao" : 3,
"status" : 1,
"data_validacao_fonte" : datePart,
"informacoes" : "comprovado por auto declaração."
]

def relacionamento_endereco = [
"codigo_agrupamento_produto": 2,
"CC1011": "CC4150",
"codigo_finalidade": 12224,
"codigo_classe_produto": 6,
"codigo_nome_produto_operacional": 14554
]

//Endereços
def CC4424 = CC4009.CC3819("CC4424")
def CC4275 = CC4009.CC3819("CC4275")
def CC3800 = CC4009.CC3819("CC3800")
def CC4257 = CC4009.CC3819("CC4257")
def CC4260 = CC4009.CC3819("CC4260")
def CC4420 = CC4009.CC3819("CC4385")
def uf = CC4009.CC3819("CC4266")

def objetoEnderecoResidencial = ["principal": true,
"propositos": [1,3],"CC3935": CC4424, "CC4275": CC4275,
"CC3800": CC3800, "CC4257": CC4257, "CC4260": CC4260,
"CC4420": CC4420, "uf": uf, "CC4373": "BR"]

def enderecoResidencial = ["valor_dado_cadastral" :
objetoEnderecoResidencial ,
"CC3961" : [validacaoEndereco] ,
"relacionamentos" : [relacionamento_endereco]]
dados_pessoa_temp.put('enderecos',[enderecoResidencial])

def validacao = [
"nivel_completude" : 200,
"modo_confirmacao" : 2,
"fonte_confirmacao" : 3,
"status" : 1,
"data_validacao_fonte" : datePart,
"informacoes" : "comprovado por auto declaração."
]

def paisResidenciaFiscal = CC4009.CC3819('CC0876')
if(paisResidenciaFiscal != null){
def objPaisesResidenciaFiscal = ["valor_dado_cadastral" : [paisResidenciaFiscal],
"CC3961" : [validacao]
]
dados_pessoa_temp.put('paises_residencia_fiscal', objPaisesResidenciaFiscal)
}

def nfiNacionalidade = CC4009.CC3819('CC3119')
if(nfiNacionalidade != null){
def objNacionalidades = [
"valor_dado_cadastral" : [nfiNacionalidade],
"CC3961" : [validacao]
]
dados_pessoa_temp.put('nacionalidades', objNacionalidades)
}

def nfiNascimento= CC4009.CC3819('CC2703')
if(nfiNascimento != null){
def objPaisNascimento = [
"valor_dado_cadastral" : nfiNascimento,
"CC3961" : [validacao]
]
dados_pessoa_temp.put('CC2703', objPaisNascimento)
}

if(CC4009.hasVariable('CC3938') &amp;&amp; CC4009.CC3819('CC3938').length() &gt; 1){
def numeroNfi = CC4009.CC3819('CC3938')
def documentoNif = [
"tipo" : 12213,
"CC4275" : numeroNfi,
"identificador": 12421,
"CC4373": paisResidenciaFiscal
];

def objDocumentoNif = [
"valor_dado_cadastral":documentoNif,
"CC3961" : [validacao]
];
dados_pessoa_temp.put('documentos',[objDocumentoNif])
}

CC4009.CC3850('dados_pessoa_temp', dados_pessoa_temp)

logger.info(
"Montagem de campos para atualizar pessoa dados CC4105",
value("CC3826", CC4009.CC3819("CC3826")),
value("CC4016", CC4009.CC3819("CC4016")),
value("intencao", CC4009.CC3819("intencao")),
value("correlationId", CC4009.CC3819("CC1058")),
value("tempo_total_espera", Duration.between(inicio, Instant.now()))
)


</t030>
    </t031>
    <t032 id="CC3439" sourceRef="CC0701" targetRef="CC2559" />
    <t033 id="CC0583" name="CC1249" CC0630="#{atualizarPessoaV2Delegate}">
      <t019>
        <t058>
          <t059 name="CC0685">${dados_pessoa_temp}</t059>
        </t058>
      </t019>
      <t021>CC3568</t021>
      <t021>CC3561</t021>
      <t027>CC3417</t027>
    </t033>
    <t032 id="CC3417" sourceRef="CC0583" targetRef="CC2977" />
    <t023 id="CC2977" name="CC0254">
      <t011>CC0003</t011>
      <t019>
        <t051 event="start">
          <t066 scriptFormat="groovy">CC4009.CC3850('CC0539',true)</t066>
        </t051>
      </t019>
      <t021>CC3417</t021>
      <t027>CC3608</t027>
    </t023>
    <t032 id="CC3608" sourceRef="CC2977" targetRef="CC2561" />
    <t043 id="CC2001" name="CC1808">
      <t019>
        <t055>
          <t056 id="CC3697" type="string">
            <t068>
              <t049 name="required" />
            </t068>
          </t056>
          <t056 id="CC1049" type="domain" defaultValue="${CC1049}" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC3752" type="boolean" />
        </t055>
        <t051 event="end">
          <t066 scriptFormat="groovy">if(CC4009.hasVariable('CC3697')){
CC4009.CC3850("CC4129", CC3697)
}</t066>
        </t051>
      </t019>
      <t021>CC3425</t021>
      <t021>CC3670</t021>
      <t027>CC3375</t027>
      <t027>CC3267</t027>
    </t043>
    <t012 id="CC3022" name="CC1660">
      <t021>CC3160</t021>
      <t014 id="CC0452" errorRef="CC2870" />
    </t012>
    <t001 id="CC2969" attachedToRef="CC2001">
      <t027>CC3160</t027>
      <t042 id="CC0486">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t032 id="CC3160" sourceRef="CC2969" targetRef="CC3022" />
    <t032 id="CC3425" name="CC4253" sourceRef="CC3918" targetRef="CC2001">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('voltar') &amp;&amp; voltar=="escolha_segmento" &amp;&amp; (segmento=="L" || segmento=="1")}</t008>
    </t032>
    <t032 id="CC3375" name="CC4253" sourceRef="CC2001" targetRef="CC3114">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('voltar') &amp;&amp; voltar=="informar_cnpj"}</t008>
    </t032>
    <t018 id="CC2599" default="CC3177">
      <t021>CC3591</t021>
      <t027>CC3177</t027>
      <t027>CC3314</t027>
      <t027>CC3594</t027>
    </t018>
    <t033 id="CC0355" name="CC0893" camunda:type="external" CC3089="CC0936">
      <t011>«U000016» Producer CC4314</t011>
      <t019>
        <t058>
          <t059 name="CC2650">
            <t061>
              <t050 key="CC0586">${CC4016}</t050>
              <t050 key="CC0530">${((execution.hasVariable("numero_unico_conta") &amp;&amp; numero_unico_conta != null &amp;&amp; numero_unico_conta != 'null' &amp;&amp; numero_unico_conta != '') ? execution.getVariable("numero_unico_conta") : CC0246)}</t050>
              <t050 key="CC2793">000009999</t050>
              <t050 key="CC0688">${CC4129}</t050>
              <t050 key="CC1206">${execution.hasVariable('limite_rotativo_cartao_pre_aprovado') &amp;&amp; limite_rotativo_cartao_pre_aprovado &gt; 0 ? "S" : "N"}</t050>
              <t050 key="CC0743">${CC4335}</t050>
              <t050 key="CC1403">CC4389</t050>
              <t050 key="CC0742">${CC2783}</t050>
              <t050 key="CC0587">CC0154</t050>
              <t050 key="CC1995">${CC3808}</t050>
              <t050 key="CC4005">${CC1655}</t050>
            </t061>
          </t059>
          <t059 name="CC0065">${true}</t059>
        </t058>
      </t019>
      <t021>CC3177</t021>
      <t027>CC3620</t027>
    </t033>
    <t023 id="CC0591" name="CC0654">
      <t019>
        <t058>
          <t063 name="CC0547">Erro ao produzir a mensagem</t063>
        </t058>
      </t019>
      <t021>CC3432</t021>
      <t027>CC3626</t027>
    </t023>
    <t033 id="CC0241" name="CC0214" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">1</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="CC0547">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="CC0547">${CC0547}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3626</t021>
      <t021>CC3239</t021>
      <t027>CC3600</t027>
    </t033>
    <t012 id="CC2913">
      <t021>CC3600</t021>
    </t012>
    <t023 id="CC2910" name="CC0335">
      <t019>
        <t058>
          <t063 name="CC0547">CC0335</t063>
        </t058>
      </t019>
      <t021>CC3620</t021>
      <t027>CC3239</t027>
    </t023>
    <t001 id="CC2898" attachedToRef="CC0355">
      <t027>CC3432</t027>
      <t014 id="CC0467" />
    </t001>
    <t032 id="CC3177" sourceRef="CC2599" targetRef="CC0355">
      <t019>
        <t051 event="take">
          <t066 scriptFormat="javascript">var dateUpdate = new Date();
 dateUpdate.setTime(dateUpdate.getTime() + dateUpdate.getTimezoneOffset() * 60 * 1000 /* convert to UTC */ - (/* UTC-6 */ 6) * 60 *
 60 * 1000);

 CC4009.CC3850("CC3808", dateUpdate.toISOString().split('.')[0])</t066>
        </t051>
      </t019>
    </t032>
    <t032 id="CC3620" sourceRef="CC0355" targetRef="CC2910" />
    <t032 id="CC3432" sourceRef="CC2898" targetRef="CC0591" />
    <t032 id="CC3626" sourceRef="CC0591" targetRef="CC0241" />
    <t032 id="CC3239" sourceRef="CC2910" targetRef="CC0241" />
    <t032 id="CC3600" sourceRef="CC0241" targetRef="CC2913" />
    <t032 id="CC3314" sourceRef="CC2599" targetRef="CC1695">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable("oferta_npc") &amp;&amp; oferta_npc == false}</t008>
    </t032>
    <t032 id="CC3594" sourceRef="CC2599" targetRef="CC2028">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable("oferta_npc") &amp;&amp; oferta_npc == true}</t008>
    </t032>
    <t032 id="CC3593" sourceRef="CC2028" targetRef="CC3154" />
    <t032 id="CC3056" sourceRef="CC3111" targetRef="CC2511" />
    <t032 id="CC3592" sourceRef="CC2756" targetRef="CC3029" />
    <t032 id="CC2439" sourceRef="CC3154" targetRef="CC3111" />
    <t032 id="CC1945" sourceRef="CC3029" targetRef="CC3111" />
    <t023 id="CC3154" name="CC0305">
      <t019>
        <t058>
          <t063 name="CC0648">Sucesso</t063>
        </t058>
      </t019>
      <t021>CC3593</t021>
      <t027>CC2439</t027>
    </t023>
    <t023 id="CC3029" name="CC0528">
      <t019>
        <t058>
          <t063 name="CC0648">Erro</t063>
        </t058>
      </t019>
      <t021>CC3592</t021>
      <t027>CC1945</t027>
    </t023>
    <t033 id="CC2028" name="CC1626" camunda:modelerTemplate="CC1219" camunda:modelerTemplateVersion="1" CC1191="true" CC0630="${CC1220}">
      <t019>
        <t058>
          <t059 name="CC2802">
            <t061>
              <t050 key="CC3824">${execution.hasVariable("id_intencao") ? id_intencao : null}</t050>
              <t050 key="CC4029">${execution.hasVariable("proxy_npc") ? proxy_npc : null}</t050>
            </t061>
          </t059>
          <t059 name="urlDev">«U000024»{CC4009.hasVariable("CC4029") ? CC4029 : ""}/cards-details</t059>
          <t059 name="CC3960">«U000025»{CC4009.hasVariable("CC4029") ? CC4029 : ""}/cards-details</t059>
          <t059 name="urlProd">«U000023»{CC4009.hasVariable("CC4029") ? CC4029 : ""}/cards-details</t059>
          <t059 name="CC3925">{"CC1058":"CC0049"}</t059>
          <t059 name="CC2823">{"CC1058":"CC0049"}</t059>
          <t059 name="CC3820">{"CC1058":"CC0049"}</t059>
          <t059 name="CC0147">${3}</t059>
          <t059 name="CC0099">${5}</t059>
          <t059 name="CC0047">${true}</t059>
          <t059 name="CC0061">${true}</t059>
          <t063 name="CC3745">${execution.hasVariable("valida-proxy-npc_resposta") ? execution.getVariable("valida-proxy-npc_resposta")["proxy_valido"] : null}</t063>
          <t063 name="CC2794">${execution.hasVariable("valida-proxy-npc_resposta") ? execution.getVariable("valida-proxy-npc_resposta")["codigo_retorno"] : null}</t063>
          <t063 name="CC2009">${execution.hasVariable("valida-proxy-npc_resposta") ? execution.getVariable("valida-proxy-npc_resposta")["mensagem_retorno"] : null}</t063>
        </t058>
        <t053>R3/PT5S</t053>
        <t054 name="withError">
          <t052>true</t052>
        </t054>
        <t054 name="CC1381">
          <t067>CO8_PROXY_NPC</t067>
        </t054>
        <t054 name="CC2725">
          <t052>${statusCode != 200}</t052>
        </t054>
      </t019>
      <t021>CC3594</t021>
      <t027>CC3593</t027>
    </t033>
    <t001 id="CC2756" attachedToRef="CC2028">
      <t027>CC3592</t027>
      <t014 id="CC0462" />
    </t001>
    <t033 id="CC3111" name="CC2760" camunda:modelerTemplate="CC1041" camunda:modelerTemplateVersion="1" CC1191="true" CC0630="${operacaoPostDelegate}">
      <t019>
        <t058>
          <t059 name="urlDev">${execution.hasVariable("formaliza_npc_url_dev") ? formaliza_npc_url_dev : ""}</t059>
          <t059 name="CC3960">${execution.hasVariable("formaliza_npc_url_homolog") ? formaliza_npc_url_homolog : ""}</t059>
          <t059 name="urlProd">${execution.hasVariable("formaliza_npc_url_prod") ? formaliza_npc_url_prod : ""}</t059>
          <t059 name="CC3925">{"Content-Type":"application/json","CC1058":"CC0049"}</t059>
          <t059 name="CC2823">{"Content-Type":"application/json","CC1058":"CC0049"}</t059>
          <t059 name="CC3820">{"Content-Type":"application/json","CC1058":"CC0049"}</t059>
          <t059 name="bodyDev">{"CC3824":"${execution.hasVariable('id_intencao') ? id_intencao : ""}","CC3939":"${execution.hasVariable('oferta_npc') ? oferta_npc : false}","CC2802":${execution.hasVariable('dados_proposta') ? dados_proposta : "{}"}}</t059>
          <t059 name="CC3788">{"CC3824":"${execution.hasVariable('id_intencao') ? id_intencao : ""}","CC3939":"${execution.hasVariable('oferta_npc') ? oferta_npc : false}","CC2802":${execution.hasVariable('dados_proposta') ? dados_proposta : "{}"}}</t059>
          <t059 name="bodyProd">{"CC3824":"${execution.hasVariable('id_intencao') ? id_intencao : ""}","CC3939":"${execution.hasVariable('oferta_npc') ? oferta_npc : false}","CC2802":${execution.hasVariable('dados_proposta') ? dados_proposta : "{}"}}</t059>
        </t058>
      </t019>
      <t021>CC2439</t021>
      <t021>CC1945</t021>
      <t027>CC3056</t027>
    </t033>
    <t043 id="CC0867" name="CC0831" default="CC3584">
      <t019>
        <t055>
          <t056 id="CC2659" type="string" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC4290" type="string" defaultValue="continuar" />
          <t056 id="CC3942" type="string" />
          <t056 id="CC4013" type="string" />
        </t055>
        <t058>
          <t063 name="CC3108">CC0867</t063>
        </t058>
      </t019>
      <t021>CC3475</t021>
      <t027>CC3302</t027>
      <t027>CC3584</t027>
    </t043>
    <t001 id="CC2957" attachedToRef="CC0867">
      <t027>CC3510</t027>
      <t042 id="CC0511">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t012 id="CC2894" name="CC1660">
      <t021>CC3510</t021>
      <t014 id="CC0449" errorRef="CC2870" />
    </t012>
    <t032 id="CC3510" sourceRef="CC2957" targetRef="CC2894" />
    <t032 id="CC3302" name="CC4290" sourceRef="CC0867" targetRef="CC1401">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('voltar') &amp;&amp; voltar=="selecionar_agencia"}</t008>
    </t032>
    <t028 id="CC2554">
      <t021>CC3665</t021>
      <t027>CC3540</t027>
      <t027>CC3434</t027>
    </t028>
    <t032 id="CC3477" sourceRef="CC2844" targetRef="CC0810" />
    <t032 id="CC3665" sourceRef="CC0810" targetRef="CC2554" />
    <t028 id="CC2565">
      <t021>CC3352</t021>
      <t021>CC3573</t021>
      <t027>CC3176</t027>
    </t028>
    <t032 id="CC3540" sourceRef="CC2554" targetRef="CC3105" />
    <t032 id="CC3434" sourceRef="CC2554" targetRef="CC0927" />
    <t032 id="CC3352" sourceRef="CC3105" targetRef="CC2565" />
    <t032 id="CC3573" sourceRef="CC2611" targetRef="CC2565" />
    <t032 id="CC3176" sourceRef="CC2565" targetRef="CC0877" />
    <t018 id="CC2521" default="CC3363">
      <t021>CC3401</t021>
      <t027>CC3363</t027>
      <t027>CC3475</t027>
    </t018>
    <t018 id="CC2549" default="CC3297">
      <t021>CC3363</t021>
      <t021>CC3584</t021>
      <t027>CC3297</t027>
    </t018>
    <t032 id="CC3363" sourceRef="CC2521" targetRef="CC2549">
      <t019>
        <t051 event="take">
          <t066 scriptFormat="groovy">if (CC0690 == true){ CC4009.CC3850("CC0690", false)}</t066>
        </t051>
      </t019>
    </t032>
    <t032 id="CC3475" sourceRef="CC2521" targetRef="CC0867">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('encarteiramento_manual_gq') &amp;&amp; encarteiramento_manual_gq == true &amp;&amp; segmento != '3'}</t008>
    </t032>
    <t032 id="CC3584" sourceRef="CC0867" targetRef="CC2549" />
    <t032 id="CC3297" sourceRef="CC2549" targetRef="CC2015" />
    <t018 id="CC2615" default="CC3238">
      <t021>CC3171</t021>
      <t021>CC3337</t021>
      <t027>CC3238</t027>
      <t027>CC3637</t027>
    </t018>
    <t032 id="CC3238" sourceRef="CC2615" targetRef="CC2616" />
    <t012 id="CC3009">
      <t021>CC3390</t021>
      <t037 id="CC0264" />
    </t012>
    <t032 id="CC3637" sourceRef="CC2615" targetRef="CC3728">
      <t008 xsi:type="bpmn:tFormalExpression">${(!execution.hasVariable('elegibilidade') || elegibilidade == false || elegibilidade == "false") || ((consultar_bacen == true || consultar_bacen == "true") &amp;&amp; (!execution.hasVariable('id_processo_bacen') || id_processo_bacen == null || id_processo_bacen == ""))}</t008>
    </t032>
    <t018 id="CC2519" name="CC3081">
      <t021>CC3420</t021>
      <t027>CC3536</t027>
      <t027>CC3662</t027>
    </t018>
    <t032 id="CC3536" name="sim" sourceRef="CC2519" targetRef="CC1022">
      <t008 xsi:type="bpmn:tFormalExpression">${(execution.hasVariable('agencia_logada') &amp;&amp; agencia_logada != null &amp;&amp; agencia_logada != "")}</t008>
    </t032>
    <t033 id="CC0282" name="CC0674" camunda:modelerTemplate="CC1041" camunda:modelerTemplateVersion="1" CC1191="true" CC0630="${operacaoPostDelegate}">
      <t019>
        <t058>
          <t059 name="CC3925">{"CC3136":"CC0149","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="CC2823">{"CC3136":"CC0151","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="CC3820">{"CC3136":"CC0152","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="urlDev">«U000019»</t059>
          <t059 name="urlProd">«U000018»</t059>
          <t059 name="bodyProd">{"CC4016": "${CC4016}","CC4335": "${CC4335}","sub_fluxo": "${CC0888}"}</t059>
          <t059 name="CC3788">{"CC4016": "${CC4016}", "CC4335": "${CC4335}", "sub_fluxo": "${CC0888}"}</t059>
          <t059 name="bodyDev">{"CC4016": "${CC4016}", "CC4335": "${CC4335}", "sub_fluxo": "${CC0888}"}</t059>
          <t059 name="CC3960">«U000020»</t059>
          <t063 name="CC0399">${S(response)}</t063>
        </t058>
        <t054 name="withError">
          <t052>true</t052>
        </t054>
        <t054 name="CC1381">
          <t067>erro_direcionador_cliente</t067>
        </t054>
        <t054 name="CC2725">
          <t052>${statusCode != 200}</t052>
        </t054>
      </t019>
      <t021>CC3662</t021>
      <t027>CC3184</t027>
    </t033>
    <t001 id="CC3011" attachedToRef="CC0282">
      <t027>CC3580</t027>
      <t014 id="CC0427" />
    </t001>
    <t032 id="CC3662" name="Não" sourceRef="CC2519" targetRef="CC0282" />
    <t032 id="CC3184" sourceRef="CC0282" targetRef="CC1631" />
    <t032 id="CC3580" sourceRef="CC3011" targetRef="CC1631" />
    <t031 id="CC0755" name="CC1608" scriptFormat="groovy">
      <t021>CC3269</t021>
      <t027>CC3361</t027>
      <t030>def CC4178 = CC4009.CC3819('CC2827')
def cpf_cnpj = CC4009.CC3819('CC4421')
def CC4129 = CC4009.CC3819('CC4129')
def contratoSegmento = [:] as HashMap

contratoSegmento.put("cpf_cnpj", cpf_cnpj)
contratoSegmento.put("CC3856", "F")
contratoSegmento.put("CC4129", CC4129)
contratoSegmento.put("CC4178", CC4178)
contratoSegmento.put("CC3749", "004")
contratoSegmento.put("codigo_banco", "341")
contratoSegmento.put("agencia_digital", "N")

CC4009.CC3850("contratoSegmento",contratoSegmento)</t030>
    </t031>
    <t032 id="CC3269" sourceRef="CC1401" targetRef="CC0755" />
    <t033 id="CC1646" name="CC1608" camunda:type="external" CC3089="CC1647">
      <t019>
        <t058>
          <t059 name="CC2661">true</t059>
          <t059 name="CC2000">true</t059>
          <t059 name="CC3127">2000</t059>
          <t059 name="CC1389">1</t059>
        </t058>
      </t019>
      <t021>CC3361</t021>
      <t027>CC3428</t027>
    </t033>
    <t032 id="CC3361" sourceRef="CC0755" targetRef="CC1646" />
    <t018 id="CC2597" name="CC1973" CC1191="true" default="CC3305">
      <t021>CC3428</t021>
      <t027>CC3305</t027>
      <t027>CC3641</t027>
      <t027>CC3531</t027>
    </t018>
    <t032 id="CC3305" sourceRef="CC2597" targetRef="CC1709" />
    <t018 id="CC2538" default="CC3186">
      <t021>CC3641</t021>
      <t027>CC3290</t027>
      <t027>CC3186</t027>
    </t018>
    <t032 id="CC3641" sourceRef="CC2597" targetRef="CC2538">
      <t008 xsi:type="bpmn:tFormalExpression">${situacao_consulta_segmento == 'erro consulta' || situacao_consulta_segmento == 'erro_retry'}</t008>
    </t032>
    <t043 id="CC0853" name="CC4154">
      <t019>
        <t055>
          <t056 id="CC3107" label="Retorno CC4080" type="string" defaultValue="404" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
        </t055>
        <t051 event="end">
          <t066 scriptFormat="groovy">CC4009.CC3850("CC0970", "")</t066>
        </t051>
      </t019>
      <t021>CC3290</t021>
    </t043>
    <t001 id="CC3020" attachedToRef="CC0853">
      <t027>CC3193</t027>
      <t042 id="CC0520">
        <t041 xsi:type="bpmn:tFormalExpression">PT1S</t041>
      </t042>
    </t001>
    <t032 id="CC3290" name="CC2763" sourceRef="CC2538" targetRef="CC0853">
      <t008 xsi:type="bpmn:tFormalExpression">${retorno_erro_segmento.contains('GQ retornou NOT_FOUND')}</t008>
    </t032>
    <t043 id="CC3716" name="CC4154">
      <t019>
        <t055>
          <t056 id="CC3107" label="Retorno CC4080" type="string" defaultValue="422" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
        </t055>
        <t051 event="end">
          <t066 scriptFormat="groovy">CC4009.CC3850("situacao_consulta_segmento", "")</t066>
        </t051>
      </t019>
      <t021>CC3186</t021>
    </t043>
    <t001 id="CC2956" attachedToRef="CC3716">
      <t027>CC3340</t027>
      <t042 id="CC0505">
        <t041 xsi:type="bpmn:tFormalExpression">PT1S</t041>
      </t042>
    </t001>
    <t043 id="CC1659" name="CC4154">
      <t019>
        <t055>
          <t056 id="CC3107" type="string" defaultValue="400" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
        </t055>
      </t019>
      <t021>CC3531</t021>
    </t043>
    <t001 id="CC2983" attachedToRef="CC1659">
      <t027>CC3266</t027>
      <t042 id="CC0522">
        <t041 xsi:type="bpmn:tFormalExpression">PT1S</t041>
      </t042>
    </t001>
    <t032 id="CC3186" name="CC3153" sourceRef="CC2538" targetRef="CC3716" />
    <t032 id="CC3531" name="CC1948" sourceRef="CC2597" targetRef="CC1659">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('retorno_consulta_segmento') &amp;&amp; retorno_consulta_segmento['numeroFuncional'] == "000000000"}</t008>
    </t032>
    <t031 id="CC1709" name="CC0614" scriptFormat="groovy">
      <t021>CC3305</t021>
      <t027>CC3401</t027>
      <t030>def consultaSegmento = [
"id_cliente": CC4009.CC3819("CC4016"),
"CC4129": CC0700["CC4129"],
"subsegmento": "",
"id_plataforma": "",
"cod_plataforma": CC0700["CC3942"],
"id_carteira": "",
"cod_carteira": CC0700["CC3093"],
"CC4013": CC0700["numeroFuncional"],
"cod_grupo_modelo_atendimento": "",
"cod_modelo_atendimento": "",
"perfil": "",
"cod_caracteristica_publico": "",
"tipo_atendimento": "",
"cod_grupo_sugestao_carteira": ""
]

def http_gq_consulta_encarteiramento_conta = [
"CC4013": CC0700["numeroFuncional"],
"cod_carteira": CC0700["CC3093"]

]

CC4009.CC3850("http_gq_consulta_encarteiramento_conta", http_gq_consulta_encarteiramento_conta) CC4009.CC3850("consultaSegmento", consultaSegmento)</t030>
    </t031>
    <t032 id="CC3428" sourceRef="CC1646" targetRef="CC2597" />
    <t032 id="CC3401" sourceRef="CC1709" targetRef="CC2521" />
    <t032 id="CC3193" sourceRef="CC3020" targetRef="CC2561" />
    <t032 id="CC3340" sourceRef="CC2956" targetRef="CC2561" />
    <t032 id="CC3266" sourceRef="CC2983" targetRef="CC2561" />
    <t033 id="CC2664" name="CC2044" camunda:modelerTemplate="CC1219" camunda:modelerTemplateVersion="1" CC1191="true" CC0630="${CC1220}">
      <t019>
        <t058>
          <t059 name="CC3925">{"CC3136":"CC0149","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="CC2823">{"CC3136":"CC0151","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="CC3820">{"CC3136":"CC0152","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="urlProd">«U000013»{CC4009.CC3819('CC4016')}/CC4002</t059>
          <t059 name="urlDev">«U000014»{CC4009.CC3819('CC4016')}/CC4002</t059>
          <t059 name="CC2838">?indicadorContaSpi=${execution.getVariable('fluxo_spi') == "turn_over" ? 'S': 'N'}</t059>
          <t059 name="CC1399">?indicadorContaSpi=${execution.getVariable('fluxo_spi') == "turn_over" ? 'S': 'N'}</t059>
          <t059 name="CC2710">?indicadorContaSpi=${execution.getVariable('fluxo_spi') == "turn_over" ? 'S': 'N'}</t059>
          <t059 name="CC3960">«U000015»{CC4009.CC3819('CC4016')}/CC4002</t059>
          <t063 name="CC0398">${S(response)}</t063>
        </t058>
        <t054 name="withError">
          <t052>true</t052>
        </t054>
        <t054 name="CC1381">
          <t067>ERRO_IH8</t067>
        </t054>
        <t054 name="CC2725">
          <t052>${statusCode != 200}</t052>
        </t054>
      </t019>
      <t021>CC3377</t021>
      <t027>CC3408</t027>
    </t033>
    <t001 id="CC2965" attachedToRef="CC2664">
      <t027>CC3188</t027>
      <t014 id="CC0453" />
    </t001>
    <t031 id="CC0886" name="CC0885" scriptFormat="groovy">
      <t021>CC3408</t021>
      <t027>CC3599</t027>
      <t030>def jsonSlurperClassic = new groovy.json.JsonSlurperClassic(); CC4009.CC3850("response_consulta_debito", jsonSlurperClassic.parseText(CC0398.toString()))</t030>
    </t031>
    <t012 id="CC2896" name="CC1660">
      <t021>CC3188</t021>
      <t014 id="CC0454" errorRef="CC2870" />
    </t012>
    <t032 id="CC3188" sourceRef="CC2965" targetRef="CC2896" />
    <t032 id="CC3408" sourceRef="CC2664" targetRef="CC0886" />
    <t043 id="CC2724" name="CC0236">
      <t019>
        <t055>
          <t056 id="CC0955" type="domain" defaultValue="${execution.hasVariable('response_consulta_debito_json') ? response_consulta_debito_json: null}" />
          <t056 id="CC4290" type="string" defaultValue="continuar" />
        </t055>
        <t058>
          <t063 name="CC3108">CC0290</t063>
        </t058>
      </t019>
      <t021>CC3490</t021>
      <t021>CC3216</t021>
      <t027>CC3348</t027>
      <t027>CC3215</t027>
    </t043>
    <t001 id="CC2985" attachedToRef="CC2724">
      <t027>CC3164</t027>
      <t042 id="CC0490">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t043 id="CC1017" name="CC0989">
      <t019>
        <t055>
          <t056 id="CC1017" type="boolean" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC4290" type="string" defaultValue="continuar" />
        </t055>
        <t058>
          <t063 name="CC3108">CC0290</t063>
        </t058>
      </t019>
      <t021>CC3348</t021>
      <t027>CC3490</t027>
      <t027>CC3367</t027>
    </t043>
    <t001 id="CC2997" attachedToRef="CC1017">
      <t027>CC3385</t027>
      <t042 id="CC0526">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t012 id="CC2880" name="CC1660">
      <t021>CC3164</t021>
      <t014 id="CC0436" errorRef="CC2870" />
    </t012>
    <t012 id="CC2934" name="CC1660">
      <t021>CC3385</t021>
      <t014 id="CC0443" errorRef="CC2870" />
    </t012>
    <t032 id="CC3164" sourceRef="CC2985" targetRef="CC2880" />
    <t032 id="CC3385" sourceRef="CC2997" targetRef="CC2934" />
    <t032 id="CC3348" sourceRef="CC2724" targetRef="CC1017" />
    <t032 id="CC3490" name="CC4253" sourceRef="CC1017" targetRef="CC2724">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('voltar') &amp;&amp; voltar=="termo_contratos"}</t008>
    </t032>
    <t032 id="CC3215" name="CC4253" sourceRef="CC2724" targetRef="CC2646">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('voltar') &amp;&amp; voltar=="aceite_produtos"}</t008>
    </t032>
    <t018 id="CC2511" name="CC1967" CC1191="true" default="CC3349">
      <t021>CC3642</t021>
      <t027>CC3349</t027>
      <t027>CC3320</t027>
    </t018>
    <t018 id="CC2606" CC1191="true" default="CC3400">
      <t021>CC3323</t021>
      <t021>CC3349</t021>
      <t021>CC3056</t021>
      <t027>CC3400</t027>
    </t018>
    <t031 id="CC0072" name="CC0060" scriptFormat="groovy">
      <t021>CC3320</t021>
      <t027>CC3482</t027>
      <t030>def jsonSlurperClassic = new groovy.json.JsonSlurperClassic(); CC4009.CC3850("response_consulta_debito", jsonSlurperClassic.parseText(CC0398.toString()))

import org.camunda.spin.Spin
import org.camunda.spin.json.SpinJsonNode

def responseConsultaDebitoJson = CC4009.CC3819("CC0398")

def codigoIdentificacaoSolicitacao = responseConsultaDebitoJson.prop("codigoIdentificacaoSolicitacao").stringValue()
def codigoIdentificacaoConta = (CC4009.hasVariable("CC1392") &amp;&amp; CC1392 != null &amp;&amp; CC1392 != 'null' &amp;&amp; CC1392 != '') ? CC4009.CC3819("CC1392") : CC0246 CC4009.CC3850("codigo_identificacao_solicitacao", codigoIdentificacaoSolicitacao) CC4009.CC3850("CC0631", codigoIdentificacaoConta)</t030>
    </t031>
    <t033 id="CC0582" name="CC0112" camunda:modelerTemplate="CC1041" camunda:modelerTemplateVersion="1" CC1191="true" CC0630="${operacaoPostDelegate}">
      <t019>
        <t058>
          <t059 name="urlDev">«U000015»{CC4009.CC3819('CC4016')}/consentimentos</t059>
          <t059 name="CC3960">«U000015»{CC4009.CC3819('CC4016')}/consentimentos</t059>
          <t059 name="bodyDev">{ "codigoIdentificacaoSolicitacao": "${execution.getVariable('codigo_identificacao_solicitacao')}", "codigoIdentificacaoConta": "${execution.getVariable('codigo_identificacao_conta')}"}</t059>
          <t059 name="CC3788">{ "codigoIdentificacaoSolicitacao": "${execution.getVariable('codigo_identificacao_solicitacao')}", "codigoIdentificacaoConta": "${execution.getVariable('codigo_identificacao_conta')}"}</t059>
          <t059 name="bodyProd">{ "codigoIdentificacaoSolicitacao": "${execution.getVariable('codigo_identificacao_solicitacao')}", "codigoIdentificacaoConta": "${execution.getVariable('codigo_identificacao_conta')}"}</t059>
          <t059 name="CC3925">{"CC3136": "CC0151", "CC3137": "CC0150",CC1058": "CC0049", "Content-Type": "application/json"}</t059>
          <t059 name="urlProd">«U000013»{CC4009.CC3819('CC4016')}/consentimentos</t059>
          <t059 name="CC2823">{"CC3136": "CC0151", "CC3137": "CC0150"1","CC1058": "CC0049", "Content-Type": "application/json"}</t059>
          <t059 name="CC3820">{"CC3136": "CC0152", "CC3137": "CC0150",CC1058": "CC0049", "Content-Type": "application/json"}</t059>
          <t063 name="CC0882">${S(response)}</t063>
        </t058>
        <t054 name="withError">
          <t052>true</t052>
        </t054>
        <t054 name="CC1381">
          <t067>error_aceite_debito</t067>
        </t054>
        <t054 name="CC2725">
          <t052>${statusCode != 200}</t052>
        </t054>
      </t019>
      <t021>CC3482</t021>
      <t027>CC3323</t027>
    </t033>
    <t032 id="CC3482" sourceRef="CC0072" targetRef="CC0582" />
    <t032 id="CC3323" sourceRef="CC0582" targetRef="CC2606" />
    <t032 id="CC3400" sourceRef="CC2606" targetRef="CC2593" />
    <t032 id="CC3349" name="Não" sourceRef="CC2511" targetRef="CC2606" />
    <t032 id="CC3642" sourceRef="CC1695" targetRef="CC2511" />
    <t043 id="CC1994" name="CC3764" default="CC3237">
      <t019>
        <t055>
          <t056 id="CC2816" type="string" />
          <t056 id="CC2817" type="boolean" />
          <t056 id="CC2802" type="string" defaultValue="${CC2802}" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC1199" type="string" />
          <t056 id="CC1200" type="string" />
          <t056 id="CC4290" type="string" defaultValue="continuar" />
          <t056 id="CC0741" label="Declarou receber Salário" type="domain" defaultValue="${execution.hasVariable(&quot;receber_salario&quot;) ? receber_salario : false }" />
          <t056 id="CC1197" label="Customer Session ID" type="string" />
          <t056 id="CC4012" label="CC4310 SPI" type="domain" defaultValue="${execution.hasVariable('fluxo_spi') ? fluxo_spi : false }" />
          <t056 id="CC0955" type="domain" defaultValue="${execution.hasVariable('response_consulta_debito_json') ? response_consulta_debito_json: null}" />
        </t055>
        <t058>
          <t063 name="CC3108">CC1994</t063>
        </t058>
      </t019>
      <t021>CC3525</t021>
      <t021>CC3166</t021>
      <t027>CC3306</t027>
      <t027>CC3237</t027>
    </t043>
    <t001 id="CC2909" attachedToRef="CC1994">
      <t027>CC3369</t027>
      <t042 id="CC0509">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t012 id="CC2926" name="CC1660">
      <t021>CC3369</t021>
      <t014 id="CC0428" errorRef="CC2870" />
    </t012>
    <t032 id="CC3369" sourceRef="CC2909" targetRef="CC2926" />
    <t033 id="CC0142" name="CC0136" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">1</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="CC0239">$</t050>
              <t050 key="CC1005">$</t050>
              <t050 key="CC0290">$</t050>
              <t050 key="CC0098">$</t050>
              <t050 key="response_consulta_debito">$</t050>
              <t050 key="CC1017">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="CC0239">${CC0239}</t050>
              <t050 key="CC1005">${CC1005}</t050>
              <t050 key="CC0290">${execution.hasVariable('termo_autorizacao_beneficio_inss') ? termo_autorizacao_beneficio_inss : false}</t050>
              <t050 key="CC0098">${execution.hasVariable('termo_autorizacao_beneficio_inss_datetime') ?
termo_autorizacao_beneficio_inss_datetime : null}</t050>
              <t050 key="response_consulta_debito">${execution.hasVariable('response_consulta_debito') ? response_consulta_debito : null}</t050>
              <t050 key="CC1017">${execution.getVariable('consentimento_debito')}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3183</t021>
      <t027>CC3537</t027>
    </t033>
    <t032 id="CC3537" sourceRef="CC0142" targetRef="CC0647" />
    <t032 id="CC3306" name="CC4253" sourceRef="CC1994" targetRef="CC2646">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('voltar') &amp;&amp; voltar=="aceite_produtos"}</t008>
    </t032>
    <t018 id="CC2575">
      <t021>CC3367</t021>
      <t021>CC3329</t021>
      <t027>CC3183</t027>
    </t018>
    <t032 id="CC3367" sourceRef="CC1017" targetRef="CC2575" />
    <t018 id="CC2534" name="CC1968" default="CC3329">
      <t021>CC3599</t021>
      <t027>CC3216</t027>
      <t027>CC3329</t027>
    </t018>
    <t032 id="CC3216" name="Sim" sourceRef="CC2534" targetRef="CC2724">
      <t008 xsi:type="bpmn:tFormalExpression">${(execution.hasVariable('response_consulta_debito_json') &amp;&amp; response_consulta_debito_json != null &amp;&amp; response_consulta_debito_json != "{}" &amp;&amp; CC4009.hasVariable('CC4012') &amp;&amp; CC4012 != "CC4036")}</t008>
    </t032>
    <t032 id="CC3329" name="Não" sourceRef="CC2534" targetRef="CC2575" />
    <t032 id="CC3599" sourceRef="CC0886" targetRef="CC2534" />
    <t043 id="CC1679" name="CC1618" default="CC3553">
      <t019>
        <t055>
          <t056 id="CC1679" type="boolean" />
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC2802" type="string" defaultValue="${CC2802}" />
          <t056 id="CC0745" label="Funcional CC4159" type="string">
            <t068>
              <t049 name="required" />
            </t068>
          </t056>
          <t056 id="CC0955" type="domain" defaultValue="${execution.hasVariable('response_consulta_debito_json') ? response_consulta_debito_json: null}" />
        </t055>
        <t058>
          <t063 name="CC3108">CC1679</t063>
        </t058>
      </t019>
      <t021>CC3625</t021>
      <t021>CC3237</t021>
      <t027>CC3625</t027>
      <t027>CC3553</t027>
    </t043>
    <t001 id="CC2924" attachedToRef="CC1679">
      <t027>CC3495</t027>
      <t042 id="CC0508">
        <t041 xsi:type="bpmn:tFormalExpression">P1D</t041>
      </t042>
    </t001>
    <t032 id="CC3625" name="CC1678" sourceRef="CC1679" targetRef="CC1679">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('proposta_liberada') &amp;&amp; proposta_liberada != true}</t008>
    </t032>
    <t032 id="CC3495" sourceRef="CC2924" targetRef="CC3006" />
    <t033 id="CC0131" name="CC0101" CC0630="${CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">1</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="CC2817">$</t050>
              <t050 key="CC2816">$</t050>
              <t050 key="CC1199">$</t050>
              <t050 key="CC0864">$</t050>
              <t050 key="CC0588">$</t050>
              <t050 key="CC1200">$</t050>
              <t050 key="CC0745">$</t050>
              <t050 key="possui_restricao">$</t050>
              <t050 key="possui_restricao_representante">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="CC2817">${CC2817}</t050>
              <t050 key="CC2816">${CC2816}</t050>
              <t050 key="CC1199">${CC1199}</t050>
              <t050 key="CC0864">${CC0864}</t050>
              <t050 key="CC0588">${CC0588}</t050>
              <t050 key="CC1200">${CC1200}</t050>
              <t050 key="CC0745">${CC0745}</t050>
              <t050 key="possui_restricao">${execution.hasVariable('response_consulta_bacen') &amp;&amp; response_consulta_bacen != null &amp;&amp; response_consulta_bacen.possui_restricao != null ? response_consulta_bacen.possui_restricao : 'null'}</t050>
              <t050 key="possui_restricao_representante">${execution.hasVariable('response_consulta_bacen_representante') &amp;&amp; response_consulta_bacen != null &amp;&amp; response_consulta_bacen.possui_restricao != null ? response_consulta_bacen.possui_restricao : 'null'}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3351</t021>
      <t021>CC3384</t021>
      <t021>CC3627</t021>
      <t027>CC3538</t027>
    </t033>
    <t032 id="CC3553" sourceRef="CC1679" targetRef="CC2587" />
    <t032 id="CC3183" sourceRef="CC2575" targetRef="CC0142" />
    <t018 id="CC2569" name="CC0998" default="CC3256">
      <t021>CC3583</t021>
      <t021>CC3381</t021>
      <t027>CC3670</t027>
      <t027>CC3256</t027>
    </t018>
    <t032 id="CC3670" name="Sim" sourceRef="CC2569" targetRef="CC2001">
      <t008 xsi:type="bpmn:tFormalExpression">${segmento.toUpperCase() == 'L' || segmento == '4' || segmento == '3'}</t008>
    </t032>
    <t032 id="CC3256" name="Não" sourceRef="CC2569" targetRef="CC2609" />
    <t043 id="CC2688" name="CC1807" default="CC3577">
      <t019>
        <t055>
          <t056 id="CC1658" type="boolean">
            <t064 />
            <t068>
              <t049 name="required" />
            </t068>
          </t056>
          <t056 id="CC3823" type="domain" defaultValue="${CC3823}" />
          <t056 id="CC3817" type="domain" />
        </t055>
        <t051 event="end">
          <t066 scriptFormat="groovy">if(CC4009.hasVariable('CC3697')){
CC4009.CC3850("CC4129", CC3697)
}</t066>
        </t051>
      </t019>
      <t021>CC3212</t021>
      <t027>CC3577</t027>
    </t043>
    <t001 id="CC2895" attachedToRef="CC2688">
      <t027>CC3261</t027>
      <t042 id="CC0478">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t032 id="CC3577" sourceRef="CC2688" targetRef="CC2609" />
    <t012 id="CC2963" name="CC1660">
      <t021>CC3261</t021>
      <t014 id="CC0415" errorRef="CC2870" />
    </t012>
    <t032 id="CC3261" sourceRef="CC2895" targetRef="CC2963" />
    <t018 id="CC2589" name="CC2771" default="CC3484">
      <t021>CC3286</t021>
      <t027>CC3212</t027>
      <t027>CC3484</t027>
    </t018>
    <t032 id="CC3267" sourceRef="CC2001" targetRef="CC2514" />
    <t032 id="CC3212" name="Sim" sourceRef="CC2589" targetRef="CC2688">
      <t008 xsi:type="bpmn:tFormalExpression">${((cod_segmento == 'L' &amp;&amp; (segmento_inicial == '3' || segmento_inicial == 'I')) || (cod_segmento == '4' &amp;&amp; (segmento_inicial == '3' || segmento_inicial == 'L' || segmento_inicial == 'I'))) || situacao_especial != "Nenhuma" &amp;&amp; situacao_especial != "nenhuma" }</t008>
    </t032>
    <t032 id="CC3484" name="Não" sourceRef="CC2589" targetRef="CC2609" />
    <t032 id="CC3377" sourceRef="CC2646" targetRef="CC2664" />
    <t032 id="CC3320" sourceRef="CC2511" targetRef="CC0072">
      <t008 xsi:type="bpmn:tFormalExpression">${(execution.hasVariable('response_consulta_debito_json') &amp;&amp; response_consulta_debito_json != null &amp;&amp; response_consulta_debito_json != "{}" &amp;&amp; CC4009.hasVariable('CC4012') &amp;&amp; CC4012 != "CC4036")}</t008>
    </t032>
    <t018 id="CC2573" default="CC3359">
      <t021>CC3494</t021>
      <t027>CC3359</t027>
      <t027>CC3410</t027>
    </t018>
    <t018 id="CC2586">
      <t021>CC3630</t021>
      <t021>CC3410</t021>
      <t027>CC3431</t027>
    </t018>
    <t032 id="CC3494" sourceRef="CC2552" targetRef="CC2573" />
    <t032 id="CC3359" sourceRef="CC2573" targetRef="CC1034" />
    <t032 id="CC3630" sourceRef="CC2687" targetRef="CC2586" />
    <t032 id="CC3431" sourceRef="CC2586" targetRef="CC2527" />
    <t032 id="CC3410" name="CC0773" sourceRef="CC2573" targetRef="CC2586">
      <t008 xsi:type="bpmn:tFormalExpression">${(execution.hasVariable('response_consulta_debito_json') &amp;&amp; response_consulta_debito_json != null &amp;&amp; response_consulta_debito_json != "{}" &amp;&amp; CC4009.hasVariable('CC4012') &amp;&amp; CC4012 != "CC4036")}</t008>
    </t032>
    <t032 id="CC3237" sourceRef="CC1994" targetRef="CC1679" />
    <t032 id="CC3170" sourceRef="CC0949" targetRef="CC0170" />
    <t032 id="CC3368" sourceRef="CC0170" targetRef="CC3918" />
    <t033 id="CC0793" name="CC0140" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">1</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="CC4016">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="CC4016">${CC4016}</t050>
            </t061>
          </t059>
          <t059 name="CC0696">true</t059>
          <t059 name="CC1997">true</t059>
          <t059 name="CC1654">true</t059>
        </t058>
      </t019>
      <t021>CC3371</t021>
      <t027>CC3185</t027>
    </t033>
    <t032 id="CC3371" sourceRef="CC1358" targetRef="CC0793" />
    <t032 id="CC3185" sourceRef="CC0793" targetRef="CC2607" />
    <t018 id="CC2518" name="CC2770" default="CC3240">
      <t021>CC3611</t021>
      <t027>CC3240</t027>
      <t027>CC3277</t027>
    </t018>
    <t033 id="CC0534" name="CC0674" camunda:modelerTemplate="CC1041" camunda:modelerTemplateVersion="1" default="CC3441" CC1191="true" CC0630="${operacaoPostDelegate}">
      <t019>
        <t058>
          <t059 name="CC3925">{"CC3136":"CC0149","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="CC2823">{"CC3136":"CC0151","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="CC3820">{"CC3136":"CC0152","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="urlDev">«U000019»</t059>
          <t059 name="CC3960">«U000020»</t059>
          <t059 name="urlProd">«U000018»</t059>
          <t059 name="bodyDev">{"CC4016": "${CC4016}","CC4335": "${CC4335}","sub_fluxo": "spi-turnover","CC4106":[{"id": "CC4178","valor": "${agencia_logada}"}]}</t059>
          <t059 name="bodyProd">{"CC4016": "${CC4016}","CC4335": "${CC4335}","sub_fluxo": "spi-turnover","CC4106":[{"id": "CC4178","valor": "${agencia_logada}"}]}</t059>
          <t059 name="CC3788">{"CC4016": "${CC4016}","CC4335": "${CC4335}","sub_fluxo": "spi-turnover","CC4106":[{"id": "CC4178","valor": "${agencia_logada}"}]}</t059>
          <t063 name="CC0399">${S(response)}</t063>
        </t058>
        <t054 name="withError">
          <t052>true</t052>
        </t054>
        <t054 name="CC1381">
          <t067>erro_direcionador_cliente</t067>
        </t054>
        <t054 name="CC2725">
          <t052>${statusCode != 200}</t052>
        </t054>
      </t019>
      <t021>CC3277</t021>
      <t027>CC3441</t027>
    </t033>
    <t001 id="CC2966" attachedToRef="CC0534">
      <t027>CC3246</t027>
      <t014 id="CC0441" />
    </t001>
    <t031 id="CC0677" name="CC1411" default="CC3489" CC1191="true" scriptFormat="groovy">
      <t021>CC3246</t021>
      <t021>CC3441</t021>
      <t027>CC3489</t027>
      <t030>def jsonSlurperClassic = new groovy.json.JsonSlurperClassic(); CC4009.CC3850("response_direcionador_cliente_json", jsonSlurperClassic.parseText(CC0399.toString()))

CC4009.CC3850("response_direcionador_cliente_json",response_direcionador_cliente_json)

if (CC4009.hasVariable("CC0399") &amp;&amp; CC0399 != null &amp;&amp; CC0399?.toString() != "{}") { def CC4129 = response_direcionador_cliente_json?.CC4129?.CC3697 CC4009.CC3850("CC4129",CC4129)

def CC2776 = CC4009.CC3819("CC2776") ?: false
CC4009.CC3850("CC2776", CC2776)

if (CC2776 == true) {
def CC0957 = CC4009.CC3819("CC0957")
CC4009.CC3850("CC0957", CC0957)
} else {
def CC0957 = CC4009.CC3819("CC0957")

if (CC0957 == null &amp;&amp; response_direcionador_cliente_json?.inss?.beneficio == false) {
CC0957 = null
} else if (CC0957 == null) {

CC0957 = response_direcionador_cliente_json?.inss?.CC3722
}

CC4009.CC3850("CC0957", CC0957)
}

def CC1049 = response_direcionador_cliente_json?.CC4129?.CC1049 CC4009.CC3850("CC1049", CC1049)

def CC3106 = response_direcionador_cliente_json?.CC3106?.CC3106
CC4009.CC3850("CC3106", CC3106)

if (CC3106 == false) {
def CC0597 = response_direcionador_cliente_json?.CC3106?.CC0597 CC4009.CC3850("CC0597", CC0597)

def CC3948 = response_direcionador_cliente_json?.CC3106?.CC3948
CC4009.CC3850("CC3948", CC3948)
}
def CC3117 = response_direcionador_cliente_json?.CC3117
CC4009.CC3850("CC3117", CC3117)
}

}else{
CC4009.CC3850("CC2776", false)
CC4009.CC3850("CC0957",null)
CC4009.CC3850("CC3106", false)
}
CC4009.CC3850("nome_receita_federal", "NAO INFORMADO")</t030>
    </t031>
    <t032 id="CC3611" sourceRef="CC3114" targetRef="CC2518" />
    <t032 id="CC3246" sourceRef="CC2966" targetRef="CC0677" />
    <t032 id="CC3441" sourceRef="CC0534" targetRef="CC0677" />
    <t032 id="CC3489" sourceRef="CC0677" targetRef="CC2531" />
    <t032 id="CC3240" name="CC3772" sourceRef="CC2518" targetRef="CC2531" />
    <t032 id="CC3277" sourceRef="CC2518" targetRef="CC0534">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('turn_over') &amp;&amp; turn_over == true}</t008>
    </t032>
    <t033 id="CC0942" name="CC0580" camunda:modelerTemplate="CC1041" camunda:modelerTemplateVersion="1" CC1191="true" CC0630="${operacaoPostDelegate}">
      <t019>
        <t058>
          <t059 name="bodyDev">{
"id_origem": 13,
"credencial": {
"id_tipo": 2,
"valor": "${CC4016}"
}
}</t059>
          <t059 name="CC3788">{
"id_origem": 13,
"credencial": {
"id_tipo": 2,
"valor": "${CC4016}"
}
}</t059>
          <t059 name="bodyProd">{
"id_origem": 13,
"credencial": {
"id_tipo": 2,
"valor": "${CC4016}"
}
}</t059>
          <t059 name="urlDev">«U000032»</t059>
          <t059 name="CC3960">«U000030»</t059>
          <t059 name="urlProd">«U000037»</t059>
          <t059 name="CC3925">{"CC3136":"CC0149","CC3755": "PW2","CC1058": "CC0049" }</t059>
          <t059 name="CC2823">{"CC3136":"CC0151","CC3755": "PW2","CC1058": "CC0049" }</t059>
          <t059 name="CC3820">{"CC3136":"CC0152","CC3755": "PW2","CC1058": "CC0049" }</t059>
          <t063 name="CC1046">${S(response)}</t063>
        </t058>
        <t054 name="withError">
          <t052>true</t052>
        </t054>
        <t054 name="CC1381">
          <t067>ERROR_PW2_SEARCH</t067>
        </t054>
        <t054 name="CC2725">
          <t052>${statusCode == 404}</t052>
        </t054>
      </t019>
      <t021>CC3578</t021>
      <t027>CC3589</t027>
    </t033>
    <t033 id="CC2780" name="CC1004" camunda:modelerTemplate="operacao-post" camunda:modelerTemplateVersion="1" CC0630="${operacaoPostDelegate}">
      <t019>
        <t054 name="withError">
          <t052>false</t052>
        </t054>
        <t058>
          <t059 name="urlDev">«U000040»</t059>
          <t059 name="urlProd">«U000042»</t059>
          <t059 name="CC3960">«U000038»</t059>
          <t059 name="bodyDev">{
"credencial1": {
"id_tipo": 1,
"valor": "${CC4421}"
},
"credencial2": {
"id_tipo": 2,
"valor": "${CC4016}"
}
}</t059>
          <t059 name="CC3788">{
"credencial1": {
"id_tipo": 1,
"valor": "${CC4421}"
},
"credencial2": {
"id_tipo": 2,
"valor": "${CC4016}"
}
}</t059>
          <t059 name="bodyProd">{
"credencial1": {
"id_tipo": 1,
"valor": "${CC4421}"
},
"credencial2": {
"id_tipo": 2,
"valor": "${CC4016}"
}
}</t059>
          <t059 name="CC3925">{"CC3136":"CC0149","CC3755":"PW2","CC1058":"CC0049"}</t059>
          <t059 name="CC2823">{"CC3136":"CC0151","CC3755":"PW2","CC1058":"CC0049"}</t059>
          <t059 name="CC3820">{"CC3136":"CC0152","CC3755":"PW2","CC1058":"CC0049"}</t059>
          <t063 name="CC0880">${S(response)}</t063>
        </t058>
      </t019>
      <t021>CC3296</t021>
      <t027>CC3486</t027>
    </t033>
    <t033 id="CC0735" name="CC0346" camunda:modelerTemplate="operacao-post" camunda:modelerTemplateVersion="1" CC0630="${operacaoPostDelegate}">
      <t019>
        <t054 name="withError">
          <t052>false</t052>
        </t054>
        <t058>
          <t059 name="urlDev">«U000041»</t059>
          <t059 name="CC3960">«U000039»</t059>
          <t059 name="urlProd">«U000043»</t059>
          <t059 name="bodyDev">{
"id_origem": 13,
"id_situacao": 3,
"credencial": {
"id_tipo": 2,
"valor": "${CC4016}"
}
}</t059>
          <t059 name="CC3788">{
"id_origem": 13,
"id_situacao": 3,
"credencial": {
"id_tipo": 2,
"valor": "${CC4016}"
}
}</t059>
          <t059 name="bodyProd">{
"id_origem": 13,
"id_situacao": 3,
"credencial": {
"id_tipo": 2,
"valor": "${CC4016}"
}
}</t059>
          <t059 name="CC3925">{"CC3136":"CC0149","CC3755":"PW2","CC1058":"CC0049"}</t059>
          <t059 name="CC2823">{"CC3136":"CC0151","CC3755":"PW2","CC1058":"CC0049"}</t059>
          <t059 name="CC3820">{"CC3136":"CC0152","CC3755":"PW2","CC1058":"CC0049"}</t059>
          <t063 name="CC0804">${S(response)}</t063>
        </t058>
      </t019>
      <t021>CC3589</t021>
      <t027>CC3649</t027>
    </t033>
    <t018 id="CC2515">
      <t021>CC3486</t021>
      <t021>CC3649</t021>
      <t027>CC3438</t027>
    </t018>
    <t023 id="CC2892" name="CC0327">
      <t019>
        <t058>
          <t063 name="CC2694">${execution.hasVariable("pw2_resultado_cadastro") ?execution.getVariable('pw2_resultado_cadastro').prop('id_usuario_autenticacao').value():execution.getVariable('pw2_consulta_clien te').prop('data').prop('id_usuario_autenticacao').value()}</t063>
        </t058>
      </t019>
      <t021>CC3438</t021>
      <t027>CC3629</t027>
    </t023>
    <t001 id="CC2884" attachedToRef="CC0942">
      <t027>CC3296</t027>
      <t014 id="CC0444" />
    </t001>
    <t032 id="CC3589" sourceRef="CC0942" targetRef="CC0735" />
    <t032 id="CC3296" sourceRef="CC2884" targetRef="CC2780" />
    <t032 id="CC3486" sourceRef="CC2780" targetRef="CC2515" />
    <t032 id="CC3649" sourceRef="CC0735" targetRef="CC2515" />
    <t032 id="CC3438" sourceRef="CC2515" targetRef="CC2892" />
    <t032 id="CC3578" sourceRef="CC2610" targetRef="CC0942" />
    <t032 id="CC3629" sourceRef="CC2892" targetRef="CC3095" />
    <t031 id="CC1705" name="CC0578" scriptFormat="groovy">
      <t021>CC3459</t021>
      <t027>CC3517</t027>
      <t030>CC4009.CC3850('conclusao_pedido_analise_fraude',CC0883.toString())

if(S(CC4009.CC3819('CC0883')).hasProp('CC4000')) { CC4009.CC3850('conclusao_analise_fraude',S(CC4009.CC3819('CC0883')).prop('CC4000').value()) }else{ CC4009.CC3850('conclusao_analise_fraude',null) }

if(S(CC4009.CC3819('CC0883')).hasProp('jornada_id')) { CC4009.CC3850('jornada_id',S(CC4009.CC3819('CC0883')).prop('jornada_id').value()) }else{ CC4009.CC3850('jornada_id',null) }

if(S(CC4009.CC3819('CC0883')).hasProp('sla_retorno_fraude')) { CC4009.CC3850('sla_retorno_fraude',S(CC4009.CC3819('CC0883')).prop('sla_calculado').value()) }else{ CC4009.CC3850('sla_retorno_fraude',null) }</t030>
    </t031>
    <t018 id="CC2583" default="CC3570">
      <t021>CC3517</t021>
      <t021>CC3565</t021>
      <t027>CC3570</t027>
    </t018>
    <t032 id="CC3570" sourceRef="CC2583" targetRef="CC2588" />
    <t032 id="CC3517" sourceRef="CC1705" targetRef="CC2583" />
    <t031 id="CC1701" name="CC0477" scriptFormat="groovy" camunda:resultVariable="analise_biocatch">
      <t019>
        <t051 event="start">
          <t066 scriptFormat="javascript">var dateUpdate = new Date();
dateUpdate.setTime(dateUpdate.getTime() + dateUpdate.getTimezoneOffset() * 60 * 1000 /* convert to UTC */ - (/* UTC-6 */ 6) * 60 * 60 * 1000); CC4009.CC3850("CC3808", dateUpdate.toISOString())</t066>
        </t051>
      </t019>
      <t021>CC3538</t021>
      <t027>CC3454</t027>
      <t030>import groovy.json.JsonBuilder
CC4009.CC3850("id_operacao_biocatch",UUID.randomUUID().toString())

def CC3826 = CC4009.CC3819("CC3826") ;
def id_inquilino = CC4009.CC3819("id_inquilino");
def id_cadastro_temporario = CC4009.CC3819("CC3112");
def id_cliente = CC4009.CC3819("CC4016");
def canal_origem = CC4009.CC3819("codigo_canal");
def CC1197 = CC4009.CC3819("CC1197");
def session_id = CC4009.CC3819("session_id");
def CC3797 = CC4009.CC3819("CC3797");
def CC3798 = CC4009.CC3819("CC3798");
def user_agent = CC4009.CC3819("user_agent");

def variaveis_digitais = [
"CC1197": CC1197,
"session_id": session_id,
"ipv4": CC3797,
"ipv6": CC3798,
"user_agent": user_agent
]
def analise = [
"pedido_de_analise": [
"id": CC4009.CC3819("id_operacao_biocatch"),
"tipo_de_operacao": "BIOCATCH ACCOUNT OPEN ENRIQUECIMENTO",
"solicitada_em": CC4009.CC3819("CC3808"),
"operacao": [
"CC2802": [
"CC3826": CC3826,
"canal_origem": codigo_canal,
"CC3957": "C"
],
"dados_cadastrais": [
"CC4184": [
"id_cliente": CC4016,
"id_inquilino": id_inquilino,
"id_cadastro_temporario": id_cadastro_temporario
]
],
"variaveis_digitais": [
"CC1197": CC1197,
"session_id": session_id,
"ipv4": CC3797,
"ipv6": CC3798,
"user_agent": user_agent
]
]
]
]

I
def jsonString = new JsonBuilder()
jsonString(analise)
return jsonString.toString();</t030>
    </t031>
    <t032 id="CC3538" sourceRef="CC0131" targetRef="CC1701" />
    <t033 id="CC1703" name="CC2773" camunda:modelerTemplate="CC1041" camunda:modelerTemplateVersion="1" CC1191="true" CC0630="${operacaoPostDelegate}">
      <t019>
        <t058>
          <t059 name="CC3820">{"CC2849": "79y19artg0","CC1058":"CC0049"}</t059>
          <t059 name="CC2823">{"CC2849": "pw5sqe8xlh","CC1058":"CC0049"}</t059>
          <t059 name="CC3925">{"CC2849": "4hith7ep8c","CC1058":"CC0049"}</t059>
          <t059 name="urlDev">«U000033»</t059>
          <t059 name="CC3960">«U000034»</t059>
          <t059 name="urlProd">«U000031»</t059>
          <t059 name="bodyProd">${analise_biocatch}</t059>
          <t059 name="CC3788">${analise_biocatch}</t059>
          <t059 name="bodyDev">${analise_biocatch}</t059>
          <t063 name="CC0883">${S(response)}</t063>
        </t058>
        <t054 name="withError">
          <t052>true</t052>
        </t054>
        <t054 name="CC1381">
          <t067>ERROR_BIOCATCH</t067>
        </t054>
        <t054 name="CC2725">
          <t052>${statusCode != 200}</t052>
        </t054>
      </t019>
      <t021>CC3454</t021>
      <t027>CC3459</t027>
    </t033>
    <t001 id="CC2902" attachedToRef="CC1703">
      <t027>CC3565</t027>
      <t014 id="CC0408" />
    </t001>
    <t032 id="CC3454" sourceRef="CC1701" targetRef="CC1703" />
    <t032 id="CC3459" sourceRef="CC1703" targetRef="CC1705" />
    <t032 id="CC3565" sourceRef="CC2902" targetRef="CC2583" />
    <t033 id="CC0740" name="CC0721" camunda:modelerTemplate="CC1219" camunda:modelerTemplateVersion="1" CC1191="true" CC0630="${CC1220}">
      <t019>
        <t058>
          <t059 name="CC3925">{"CC3136":"CC0149","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="CC2823">{"CC3136":"CC0151","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="CC3820">{"CC3136":"CC0152","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="CC2838">?id_cliente=${execution.getVariable('id_pessoa')}</t059>
          <t059 name="CC1399">?id_cliente=${execution.getVariable('id_pessoa')}</t059>
          <t059 name="CC2710">?id_cliente=${execution.getVariable('id_pessoa')}</t059>
          <t059 name="urlDev">«U000022»{CC4009.CC3819('id_processo_bacen')}</t059>
          <t059 name="CC3960">«U000022»{CC4009.CC3819('id_processo_bacen')}</t059>
          <t059 name="urlProd">«U000021»{CC4009.CC3819('id_processo_bacen')}</t059>
          <t063 name="CC0544">${S(response)}</t063>
        </t058>
        <t054 name="withError">
          <t052>true</t052>
        </t054>
        <t054 name="CC1381">
          <t067>CO8_BCN</t067>
        </t054>
        <t054 name="CC2725">
          <t052>${statusCode != 200}</t052>
        </t054>
      </t019>
      <t021>CC3518</t021>
      <t027>CC3203</t027>
    </t033>
    <t018 id="CC2550" name="CC0726" default="CC3480">
      <t021>CC3327</t021>
      <t027>CC3480</t027>
      <t027>CC3499</t027>
    </t018>
    <t018 id="CC2587" name="CC2042" default="CC3518">
      <t021>CC3553</t021>
      <t027>CC3351</t027>
      <t027>CC3518</t027>
    </t018>
    <t033 id="CC0166" name="CC0552" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">4</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="CC2817">$</t050>
              <t050 key="CC2816">$</t050>
              <t050 key="CC1199">$</t050>
              <t050 key="CC0864">$</t050>
              <t050 key="CC0588">$</t050>
              <t050 key="CC1200">$</t050>
              <t050 key="CC0745">$</t050>
              <t050 key="possui_restricao">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="CC2817">${CC2817}</t050>
              <t050 key="CC2816">${CC2816}</t050>
              <t050 key="CC1199">${CC1199}</t050>
              <t050 key="CC0864">${CC0864}</t050>
              <t050 key="CC0588">${CC0588}</t050>
              <t050 key="CC1200">${CC1200}</t050>
              <t050 key="CC0745">${CC0745}</t050>
              <t050 key="possui_restricao">${execution.hasVariable('response_consulta_bacen') &amp;&amp; response_consulta_bacen != null &amp;&amp; response_consulta_bacen.possui_restricao != null ? response_consulta_bacen.possui_restricao : 'null'}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3499</t021>
      <t021>CC3469</t021>
      <t027>CC3382</t027>
    </t033>
    <t032 id="CC3480" name="Não" sourceRef="CC2550" targetRef="CC2541" />
    <t032 id="CC3351" name="Não" sourceRef="CC2587" targetRef="CC0131">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable("consultar_bacen") &amp;&amp; consultar_bacen == false}</t008>
    </t032>
    <t032 id="CC3518" name="Sim" sourceRef="CC2587" targetRef="CC0740" />
    <t032 id="CC3499" name="Sim" sourceRef="CC2550" targetRef="CC0166">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('response_consulta_bacen') &amp;&amp; (response_consulta_bacen.status_processo != "SUCESSO" || (response_consulta_bacen.possui_restricao != null &amp;&amp; response_consulta_bacen.possui_restricao == true) )}</t008>
    </t032>
    <t031 id="CC1400" name="CC0623" CC1191="true" scriptFormat="groovy">
      <t021>CC3203</t021>
      <t027>CC3327</t027>
      <t030>def jsonSlurperClassic = new groovy.json.JsonSlurperClassic();
CC4009.CC3850("response_consulta_bacen", jsonSlurperClassic.parseText(CC0544.toString())) CC4009.CC3850("response_consulta_bacen",response_consulta_bacen)</t030>
    </t031>
    <t032 id="CC3203" sourceRef="CC0740" targetRef="CC1400" />
    <t032 id="CC3327" sourceRef="CC1400" targetRef="CC2550" />
    <t001 id="CC3005" attachedToRef="CC0740">
      <t027>CC3469</t027>
      <t014 id="CC0429" />
    </t001>
    <t032 id="CC3469" sourceRef="CC3005" targetRef="CC0166" />
    <t002 id="CC0738" name="CC0719" camunda:resultVariable="consultar_bacen" camunda:decisionRef="CC0788" camunda:mapDecisionResult="singleEntry">
      <t021>CC3335</t021>
      <t021>CC3393</t021>
      <t027>CC3171</t027>
    </t002>
    <t032 id="CC3171" sourceRef="CC0738" targetRef="CC2615" />
    <t032 id="CC3382" sourceRef="CC0166" targetRef="CC2555" />
    <t023 id="CC3028" name="CC1172">
      <t021>CC3430</t021>
      <t021>CC3189</t021>
      <t024 id="CC0561" name="CC1367" />
    </t023>
    <t022 id="CC2948" name="CC1173">
      <t027>CC3279</t027>
      <t024 id="CC0562" name="CC1367" />
    </t022>
    <t032 id="CC3279" sourceRef="CC2948" targetRef="CC3728" />
    <t018 id="CC2600" name="CC1002" default="CC3335">
      <t021>CC3251</t021>
      <t027>CC3350</t027>
      <t027>CC3335</t027>
    </t018>
    <t018 id="CC2560" name="CC3081">
      <t021>CC3350</t021>
      <t027>CC3576</t027>
      <t027>CC3373</t027>
    </t018>
    <t018 id="CC2612" name="CC3138" default="CC3251">
      <t021>CC3483</t021>
      <t027>CC3251</t027>
      <t027>CC3337</t027>
    </t018>
    <t033 id="CC0638" name="CC0306" camunda:modelerTemplate="CC1041" camunda:modelerTemplateVersion="1" CC1191="true" CC0630="${operacaoPostDelegate}">
      <t019>
        <t058>
          <t059 name="CC3925">{"CC3136":"CC0149","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="CC2823">{"CC3136":"CC0151","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="CC3820">{"CC3136":"CC0152","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="urlDev">«U000019»</t059>
          <t059 name="urlProd">«U000018»</t059>
          <t059 name="CC3960">«U000020»</t059>
          <t059 name="bodyDev">{"CC4016": "${CC0796}","CC4335": "${CC4335}","sub_fluxo": "","CC4106":[{"id":"CC4178","valor":"${agencia_logada}"}]}</t059>
          <t059 name="CC3788">{"CC4016": "${CC0796}","CC4335": "${CC4335}","sub_fluxo": "","CC4106":[{"id":"CC4178","valor":"${agencia_logada}"}]}</t059>
          <t059 name="bodyProd">{"CC4016": "${CC0796}","CC4335": "${CC4335}","sub_fluxo": "","CC4106":[{"id":"CC4178","valor":"${agencia_logada}"}]}</t059>
          <t063 name="CC0183">${S(response)}</t063>
        </t058>
        <t054 name="withError">
          <t052>true</t052>
        </t054>
        <t054 name="CC1381">
          <t067>erro_direcionador_cliente_representante</t067>
        </t054>
        <t054 name="CC2725">
          <t052>${statusCode != 200}</t052>
        </t054>
      </t019>
      <t021>CC3576</t021>
      <t027>CC3524</t027>
    </t033>
    <t033 id="CC0133" name="CC0306" camunda:modelerTemplate="CC1041" camunda:modelerTemplateVersion="1" CC1191="true" CC0630="${operacaoPostDelegate}">
      <t019>
        <t058>
          <t059 name="CC3925">{"CC3136":"CC0149","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="CC2823">{"CC3136":"CC0151","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="CC3820">{"CC3136":"CC0152","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="urlDev">«U000019»</t059>
          <t059 name="urlProd">«U000018»</t059>
          <t059 name="CC3960">«U000020»</t059>
          <t059 name="bodyDev">{"CC4016": "${CC0796}","CC4335": "${CC4335}","sub_fluxo": ""}</t059>
          <t059 name="CC3788">{"CC4016": "${CC0796}","CC4335": "${CC4335}","sub_fluxo": ""}</t059>
          <t059 name="bodyProd">{"CC4016": "${CC0796}","CC4335": "${CC4335}","sub_fluxo": ""}</t059>
          <t063 name="CC0183">${S(response)}</t063>
        </t058>
        <t054 name="withError">
          <t052>true</t052>
        </t054>
        <t054 name="CC1381">
          <t067>erro_direcionador_cliente</t067>
        </t054>
        <t054 name="CC2725">
          <t052>${statusCode != 200}</t052>
        </t054>
      </t019>
      <t021>CC3373</t021>
      <t027>CC3516</t027>
    </t033>
    <t031 id="CC0782" name="CC0761" CC1191="true" scriptFormat="groovy">
      <t021>CC3418</t021>
      <t021>CC3669</t021>
      <t021>CC3524</t021>
      <t021>CC3516</t021>
      <t027>CC3393</t027>
      <t030>import groovy.json.JsonSlurperClassic

def jsonSlurperClassic = new JsonSlurperClassic()

CC4009.CC3850("response_direcionador_representante_json", jsonSlurperClassic.parseText(CC0183.toString()))

CC4009.CC3850("response_direcionador_representante_json",response_direcionador_representante_json)

if (CC4009.hasVariable("CC0183") &amp;&amp; CC0183 != null &amp;&amp; CC0183?.toString() != "{}") { def CC3106 = response_direcionador_representante_json.CC3106.CC3106 CC4009.CC3850("CC3106", CC3106)

if (CC3106 == false) {
def CC0597 = response_direcionador_representante_json.CC3106.CC0597 CC4009.CC3850("CC0597", CC0597)

def CC3948 = response_direcionador_representante_json.CC3106.CC3948
CC4009.CC3850("CC3948", CC3948)

def CC3117 = response_direcionador_representante_json.CC3117
CC4009.CC3850("CC3117", CC3117)
}

def id_processo_bacen_representante = response_direcionador_representante_json.bacen?.CC3825 CC4009.CC3850("id_processo_bacen_representante",id_processo_bacen_representante)

if (id_processo_bacen_representante == null) {
CC4009.CC3850("CC0597", "")
CC4009.CC3850("CC3948", "")
CC4009.CC3850("CC3117", "")
}

} else {
CC4009.CC3850("CC3106", false)
}
CC4009.CC3850("nome_receita_federal", "NAO INFORMADO")</t030>
    </t031>
    <t001 id="CC2979" attachedToRef="CC0133">
      <t027>CC3418</t027>
      <t014 id="CC0446" />
    </t001>
    <t001 id="CC2914" attachedToRef="CC0638">
      <t027>CC3669</t027>
      <t014 id="CC0411" />
    </t001>
    <t032 id="CC3251" name="Sim" sourceRef="CC2612" targetRef="CC2600" />
    <t032 id="CC3350" name="Sim" sourceRef="CC2600" targetRef="CC2560">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('cpf_representante') &amp;&amp; cpf_representante != "" &amp;&amp; cpf_representante != null} </t008>
    </t032>
    <t032 id="CC3576" name="Sim" sourceRef="CC2560" targetRef="CC0638">
      <t008 xsi:type="bpmn:tFormalExpression">${(execution.hasVariable('agencia_logada') &amp;&amp; agencia_logada != null &amp;&amp; agencia_logada != "")}</t008>
    </t032>
    <t032 id="CC3373" name="Não" sourceRef="CC2560" targetRef="CC0133" />
    <t032 id="CC3418" sourceRef="CC2979" targetRef="CC0782" />
    <t032 id="CC3669" sourceRef="CC2914" targetRef="CC0782" />
    <t032 id="CC3524" sourceRef="CC0638" targetRef="CC0782" />
    <t032 id="CC3516" sourceRef="CC0133" targetRef="CC0782" />
    <t032 id="CC3483" sourceRef="CC1631" targetRef="CC2612" />
    <t032 id="CC3337" name="Não" sourceRef="CC2612" targetRef="CC2615">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('elegibilidade') ? (elegibilidade == false || elegibilidade == "false") : true}</t008>
    </t032>
    <t032 id="CC3335" name="Não" sourceRef="CC2600" targetRef="CC0738" />
    <t032 id="CC3393" sourceRef="CC0782" targetRef="CC0738" />
    <t018 id="CC2607" name="CC1001" default="CC3248">
      <t021>CC3185</t021>
      <t027>CC3248</t027>
      <t027>CC3542</t027>
    </t018>
    <t032 id="CC3248" name="Não" sourceRef="CC2607" targetRef="CC3807" />
    <t032 id="CC3542" name="Sim" sourceRef="CC2607" targetRef="CC0097">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('cpf_representante') &amp;&amp; cpf_representante != "" &amp;&amp; cpf_representante != null}</t008>
    </t032>
    <t031 id="CC1234" name="CC1188" scriptFormat="groovy">
      <t019>
        <t051 event="start">
          <t066 scriptFormat="javascript">var dateUpdate = new Date();
dateUpdate.setTime(dateUpdate.getTime() + dateUpdate.getTimezoneOffset() * 60 * 1000 /* convert to UTC */ - (/* UTC-6 */ 6) * 60 * 60 * 1000);



CC4009.CC3850("CC3808", dateUpdate.toISOString())</t066>
        </t051>
      </t019>
      <t021>CC3274</t021>
      <t027>CC3392</t027>
      <t030>import static net.logstash.logback.argument.StructuredArguments.value
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.CC4378.Instant
import java.CC4378.Duration

final Logger logger = LoggerFactory.getLogger("CC0025")

Instant inicio = Instant.now()

def datePart = CC4009.CC3819("CC3808");

def validacaoTelefone = [
"nivel_completude" : 200,
"modo_confirmacao" : 2,
"fonte_confirmacao" : 3,
"status" : 1,
"data_validacao_fonte" : datePart,
"informacoes" : "CC4135 compovado por sms."
]

def relacionamento_telefone = [
"codigo_agrupamento_produto": 2,
"CC1011": "CC4150",
"codigo_finalidade": 12227,
"codigo_classe_produto": 6,
"codigo_nome_produto_operacional": 14554
]

def validacaoEmail = [
"nivel_completude" : 200,
"modo_confirmacao" : 2,
"fonte_confirmacao" : 3,
"status" : 1,
"data_validacao_fonte" : datePart,
"informacoes" : "comprovado por auto declaração."
]

def relacionamento_email= [
"codigo_agrupamento_produto": 2,
"CC1011": "CC4150",
"codigo_finalidade": 12225,
"codigo_classe_produto": 6,
"codigo_nome_produto_operacional": 14554
]

def validacaoNascimento = [
"nivel_completude" : 400,
"modo_confirmacao" : 6,
"fonte_confirmacao" : 3,
"status" : 1,
"data_validacao_fonte" : datePart,
"informacoes" : "comprovado por auto declaração."
]


def validacaoNome = [
"nivel_completude" : 400,
"modo_confirmacao" : 6,
"fonte_confirmacao" : 3,
"status" : 1,
"data_validacao_fonte" : datePart,
"informacoes" : "comprovado por auto declaração."
]

//nome
def nome = CC4009.CC3819("CC3120")
def CC3729 = ["valor_dado_cadastral": nome, "CC3961": [validacaoNome]]

//Telefones
def CC2700 = CC4009.CC3819("CC2700")
def ddd = CC4009.CC3819("CC3708")
def objetoTelefonePrincipal = ["principal": true, "tipo": 12240,"propositos": [1,4], "ddi": 55, "ddd": ddd, "CC4275": CC2700, "ramal": 0, "data_atualizacao": datePart] def telefonePrincipal = ["valor_dado_cadastral" : objetoTelefonePrincipal , "CC3961" : [validacaoTelefone] ] def telefonesCadastral = [telefonePrincipal]

//CC4308
def CC4331 = CC4009.CC3819("CC4331")
def objetoEmail = ["principal": true,"propositos": [1,2], "CC4331": CC4331, "data_atualizacao": datePart]
def emailPrincipal = [ "valor_dado_cadastral": objetoEmail, "CC3961": [validacaoEmail] ]
def emailCadastral = [emailPrincipal]

//Nascimento
def CC2673 = CC4009.CC3819("CC2673")
def dados_nascimento = ["valor_dado_cadastral": CC2673, "CC3961":[validacaoNascimento]]
def dados = [
"telefones": telefonesCadastral,
"data_nascimento_fundacao": dados_nascimento,
"emails": emailCadastral,
"CC3120": CC3729
];

CC4009.CC3850("dados_pessoa_temp" ,dados )

logger.info(
"Montagem de campos para atualizar pessoa dados Perfil",

value("CC3826" , CC4009.CC3819("CC3826")),
value("CC4016" , CC4009.CC3819("CC4016")),
value("intencao" , CC4009.CC3819("intencao")),
value("correlationId" , CC4009.CC3819("CC1058")),
value("tempo_total_espera" , Duration.between(inicio, Instant.now()))
)</t030>
    </t031>
    <t032 id="CC3392" sourceRef="CC1234" targetRef="CC1358" />
    <t032 id="CC3488" name="Sim" sourceRef="CC2572" targetRef="CC0028">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('cpf_representante') &amp;&amp; cpf_representante != "" &amp;&amp; cpf_representante != null} </t008>
    </t032>
    <t018 id="CC2572" name="CC1175" default="CC3338">
      <t021>CC3343</t021>
      <t027>CC3338</t027>
      <t027>CC3488</t027>
    </t018>
    <t032 id="CC3338" name="Não" sourceRef="CC2572" targetRef="CC2671" />
    <t032 id="CC3343" sourceRef="CC2539" targetRef="CC2572" />
    <t018 id="CC2559" name="CC1001" default="CC3568">
      <t021>CC3439</t021>
      <t027>CC3568</t027>
      <t027>CC3533</t027>
    </t018>
    <t032 id="CC3568" sourceRef="CC2559" targetRef="CC0583" />
    <t031 id="CC0124" name="CC0111" scriptFormat="groovy">
      <t021>CC3533</t021>
      <t027>CC3429</t027>
      <t030>import static net.logstash.logback.argument.StructuredArguments.value
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.CC4378.Instant
import java.CC4378.Duration

final Logger logger = LoggerFactory.getLogger("CC0025")

Instant inicio = Instant.now()
def datePart = CC4009.CC3819("CC3808");

def dados_pessoa_temp = [:]
def CC4274 = CC4009.hasVariable('CC4274') ? CC4009.CC3819('CC4274') : "";

//Renda
def validacaoRenda = [
"nivel_completude" : 200,
"modo_confirmacao" : 2,
"fonte_confirmacao" : 3,
"status" : 1,
"data_validacao_fonte" : datePart,
"informacoes" : CC4274
]

//CC4338
def CC4338 = CC4009.CC3819("CC0707")
def renda_faturamento = ["valor_dado_cadastral": CC4338, "CC3961": [validacaoRenda]]

//semRenda
def sem_renda_faturamento = ["valor_dado_cadastral":true, "CC3961": [validacaoRenda]]


if (renda==0){
dados_pessoa_temp.put('sem_renda_faturamento', sem_renda_faturamento)

} else{
dados_pessoa_temp.put('renda_faturamento', renda_faturamento)
}

//enderecos
def validacaoEndereco = [
"nivel_completude" : 300,
"modo_confirmacao" : 3,
"fonte_confirmacao" : 3,
"status" : 1,
"data_validacao_fonte" : datePart,
"informacoes" : "comprovado por auto declaração."
]

def relacionamento_endereco = [
"codigo_agrupamento_produto": 2,
"CC1011": "CC4150",
"codigo_finalidade": 12224,
"codigo_classe_produto": 6,
"codigo_nome_produto_operacional": 14554
]

//Endereços
def CC4424 = CC4009.CC3819("CC1688")
def CC4275 = CC4009.CC3819("CC1037")
def CC3800 = CC4009.CC3819("CC0683")
def CC4257 = CC4009.CC3819("CC1006")
def CC4260 = CC4009.CC3819("CC1010")
def CC4420 = CC4009.CC3819("CC1602")
def uf = CC4009.CC3819("CC1027")

def objetoEnderecoResidencial = ["principal": true,
"propositos": [1,3],"CC3935": CC4424, "CC4275": CC4275,
"CC3800": CC3800,"CC4257": CC4257,"CC4260": CC4260,
"CC4420": CC4420, "uf": uf, "CC4373": "BR"]

def enderecoResidencial = ["valor_dado_cadastral":
objetoEnderecoResidencial,
"CC3961": [validacaoEndereco],
"relacionamentos": [relacionamento_endereco]]
dados_pessoa_temp.put('enderecos', [enderecoResidencial])

def validacao = [
"nivel_completude" : 200,
"modo_confirmacao" : 2,
"fonte_confirmacao" : 3,
"status" : 1,
"data_validacao_fonte" : datePart,
"informacoes" : "comprovado por auto declaração."
]

def paisResidenciaFiscal = CC4009.CC3819('CC0171')
if(paisResidenciaFiscal != null){
def objPaisesResidenciaFiscal = ["valor_dado_cadastral" : [paisResidenciaFiscal],
"CC3961" : [validacao]
]
dados_pessoa_temp.put('paises_residencia_fiscal',objPaisesResidenciaFiscal)
}

def nfiNacionalidade = CC4009.CC3819('CC0598' )
if(nfiNacionalidade != null){
def objNacionalidades = [
"valor_dado_cadastral" : [nfiNacionalidade],
"CC3961" : [validacao]
]
dados_pessoa_temp.put('nacionalidades',objNacionalidades)
}

def nfiNascimento = CC4009.CC3819('pais_nascimento_representante')
if(nfiNascimento != null){
def objPaisNascimento = [
"valor_dado_cadastral" : nfiNascimento,
"CC3961" : [validacao]
]
dados_pessoa_temp.put('CC2703',objPaisNascimento)
}

if(CC4009.hasVariable('CC0749') &amp;&amp; CC4009.CC3819('CC0749').length() &gt; 1){

def numeroNfi = CC4009.CC3819('CC0749')
def documentoNif = [
"tipo" : 12213,
"CC4275" : numeroNfi,
"identificador": 12421,
"CC4373": paisResidenciaFiscal
];

def objDocumentoNif = [
"valor_dado_cadastral":documentoNif,
"CC3961" : [validacao]
];
dados_pessoa_temp.put('documentos', [objDocumentoNif])

}

CC4009.CC3850('dados_pessoa_temp_representante', dados_pessoa_temp)

logger.info(
"Montagem de campos para atualizar pessoa dados CC4105",

value("CC3826" , CC4009.CC3819("CC3826")
),
value("CC4016" , CC4009.CC3819("CC4016")),
value("intencao" , CC4009.CC3819("intencao")),
value("correlation_id", CC4009.CC3819("CC0982")),
value("tempo_total_espera" , Duration.between(inicio, Instant.now()))
)</t030>
    </t031>
    <t032 id="CC3533" sourceRef="CC2559" targetRef="CC0124">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('cpf_representante') &amp;&amp; cpf_representante != "" &amp;&amp; cpf_representante != null}</t008>
    </t032>
    <t033 id="CC0094" name="CC0157" CC0630="#{atualizarPessoaV2Delegate}">
      <t019>
        <t058>
          <t059 name="CC0685">${dados_pessoa_temp_representante}</t059>
          <t059 name="CC4016">${adicionais[0].id_pessoa}</t059>
          <t059 name="CC3112">${adicionais[0].id_temporario}</t059>
        </t058>
      </t019>
      <t021>CC3429</t021>
      <t027>CC3561</t027>
    </t033>
    <t032 id="CC3429" sourceRef="CC0124" targetRef="CC0094" />
    <t032 id="CC3561" sourceRef="CC0094" targetRef="CC0583" />
    <t018 id="CC2578" name="CC1175">
      <t021>CC3582</t021>
      <t027>CC3498</t027>
      <t027>CC3447</t027>
    </t018>
    <t032 id="CC3498" name="Sim" sourceRef="CC2578" targetRef="CC0357">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('cpf_representante') &amp;&amp; cpf_representante != "" &amp;&amp; cpf_representante != null}</t008>
    </t032>
    <t032 id="CC3447" name="Não" sourceRef="CC2578" targetRef="CC2614" />
    <t033 id="CC0106" name="CC0157" CC0630="#{atualizarPessoaV2Delegate}">
      <t019>
        <t058>
          <t059 name="CC0685">
            <t061>
              <t050 key="telefones">${dados_pessoa_temp["telefones"]}</t050>
              <t050 key="emails">${dados_pessoa_temp["emails"]}</t050>
              <t050 key="data_nascimento_fundacao">${dados_pessoa_temp["data_nascimento_fundacao"]}</t050>
              <t050 key="CC3120">${dados_pessoa_temp["nome_completo"]}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3496</t021>
      <t027>CC3243</t027>
    </t033>
    <t031 id="CC0097" name="CC0139" scriptFormat="groovy">
      <t019>
        <t051 event="start">
          <t066 scriptFormat="javascript">var dateUpdate = new Date();
dateUpdate.setTime(dateUpdate.getTime() + dateUpdate.getTimezoneOffset() * 60 * 1000 /* convert to UTC */ - (/* UTC-6 */ 6) * 60 * 60 * 1000);
CC4009.CC3850("CC3808", dateUpdate.toISOString())</t066>
        </t051>
      </t019>
      <t021>CC3542</t021>
      <t027>CC3496</t027>
      <t030>import static net.logstash.logback.argument.StructuredArguments.value
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.CC4378.Instant
import java.CC4378.Duration

final Logger logger = LoggerFactory.getLogger("CC0025")

Instant inicio = Instant.now()

def datePart = CC4009.CC3819("CC3808");


"nivel_completude" : 200,
"modo_confirmacao" : 2,
"fonte_confirmacao" : 3,
"status" : 1,
"data_validacao_fonte" : datePart,
"informacoes" : "CC4135 comprovado por sms."
]

def relacionamento_telefone = [
"codigo_agrupamento_produto": 2,
"CC1011": "CC4150",
"codigo_finalidade": 12227,
"codigo_classe_produto": 6,
"codigo_nome_produto_operacional": 14554
]

def validacaoEmail = [
"nivel_completude" : 200,
"modo_confirmacao" : 2,
"fonte_confirmacao" : 3,
"status" : 1,
"data_validacao_fonte" : datePart,
"informacoes" : "comprovado por auto declaração."
]

def relacionamento_email = [
"codigo_agrupamento_produto": 2,
"CC1011": "CC4150",
"codigo_finalidade": 12225,
"codigo_classe_produto": 6,
"codigo_nome_produto_operacional": 14554
]

def validacaoNascimento = [
"nivel_completude" : 400,
"modo_confirmacao" : 6,
"fonte_confirmacao" : 3,
"status" : 1,
"data_validacao_fonte" : datePart,
"informacoes" : "comprovado por auto declaração."
]


def validacaoNome = [
"nivel_completude" : 400,
"modo_confirmacao" : 6,
"fonte_confirmacao" : 3,
"status" : 1,
"data_validacao_fonte" : datePart,
"informacoes" : "comprovado por auto declaração."
]

//nome
def nome = CC4009.CC3819("CC3120")
def CC3729 = ["valor_dado_cadastral": nome, "CC3961": [validacaoNome]]
def nome_representante = CC4009.CC3819("CC0599")
def nomeCompleto_representante = ["valor_dado_cadastral": nome_representante, "CC3961": [validacaoNome]]

//Telefones
def CC2700 = CC4009.CC3819("CC2700")
def ddd = CC4009.CC3819("CC3708")
def objetoTelefonePrincipal = ["principal": true, "tipo": 12240,"propositos": [1,4], "ddi": 55, "ddd": ddd, "CC4275": CC2700, "ramal": 0, "data_atualizacao": datePart] def telefonePrincipal = ["valor_dado_cadastral" : objetoTelefonePrincipal , "CC3961" : [validacaoTelefone] ] def telefonesCadastral = [telefonePrincipal]

//CC4308
def CC4331 = CC4009.CC3819("CC4331")
def objetoEmail = ["principal": true,"propositos": [1,2], "CC4331": CC4331, "data_atualizacao": datePart]
def emailPrincipal = [ "valor_dado_cadastral": objetoEmail, "CC3961": [validacaoEmail] ]
def emailCadastral = [emailPrincipal]

//Nascimento
def CC2673 = CC4009.CC3819("CC2673")
def dados_nascimento = ["valor_dado_cadastral": CC2673, "CC3961":[validacaoNascimento]]
def CC0385 = CC4009.CC3819("CC0385")
def dados_nascimento_representante = ["valor_dado_cadastral": CC0385, "CC3961":[validacaoNascimento]] def dados = [ "cpf_adicional": CC4009.CC3819("cpf_representante"), "data_nascimento_adicional": CC0385, "nome_completo_adicional": nome_representante ];

CC4009.CC3850("dados_pessoa_rep_temp" ,dados )

CC4009.CC3850("dados_pessoa_temp" ,dados )

logger.info(
"Montagem de campos para atualizar pessoa dados Perfil",

value("CC3826" , CC4009.CC3819("CC3826")),
value("CC4016" , CC4009.CC3819("CC4016")),
value("intencao" , CC4009.CC3819("intencao")),
value("correlationId" , CC4009.CC3819("CC1058")),
value("tempo_total_espera" , Duration.between(inicio, Instant.now()))
)</t030>
    </t031>
    <t032 id="CC3243" sourceRef="CC0106" targetRef="CC3807" />
    <t032 id="CC3496" sourceRef="CC0097" targetRef="CC0106" />
    <t018 id="CC2542" name="CC1001" default="CC3555">
      <t021>CC3404</t021>
      <t027>CC3555</t027>
      <t027>CC3636</t027>
    </t018>
    <t032 id="CC3555" sourceRef="CC2542" targetRef="CC2562" />
    <t031 id="CC0248" name="CC0139" scriptFormat="groovy">
      <t019>
        <t051 event="start">
          <t066 scriptFormat="javascript">var dateUpdate = new Date();
dateUpdate.setTime(dateUpdate.getTime() + dateUpdate.getTimezoneOffset() * 60 * 1000 /* convert to UTC */ - (/* UTC-6 */ 6) * 60 * 60 * 1000);



CC4009.CC3850("CC3808", dateUpdate.toISOString())</t066>
        </t051>
      </t019>
      <t021>CC3636</t021>
      <t027>CC3587</t027>
      <t030>import static net.logstash.logback.argument.StructuredArguments.value
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.CC4378.Instant
import java.CC4378.Duration

final Logger logger = LoggerFactory.getLogger("CC0025")

Instant inicio = Instant.now()

def datePart = CC4009.CC3819("CC3808");

def validacaoTelefone = [
"nivel_completude" : 200,
"modo_confirmacao" : 2,
"fonte_confirmacao" : 3,
"status" : 1,
"data_validacao_fonte" : datePart,
"informacoes" : "CC4135 compovado por sms."
]

def relacionamento_telefone = [
"codigo_agrupamento_produto": 2,
"CC1011": "CC4150",
"codigo_finalidade": 12227,
"codigo_classe_produto": 6,
"codigo_nome_produto_operacional": 14554
]

def validacaoEmail = [
"nivel_completude" : 200,
"modo_confirmacao" : 2,
"fonte_confirmacao" : 3,
"status" : 1,
"data_validacao_fonte" : datePart,
"informacoes" : "comprovado por auto declaração."
]

def relacionamento_email= [
"codigo_agrupamento_produto": 2,
"CC1011": "CC4150",
"codigo_finalidade": 12225,
"codigo_classe_produto": 6,
"codigo_nome_produto_operacional": 14554
]

def validacaoNascimento = [
"nivel_completude" : 400,
"modo_confirmacao" : 6,
"fonte_confirmacao" : 3,
"status" : 1,
"data_validacao_fonte" : datePart,
"informacoes" : "comprovado por auto declaração."
]


def validacaoNome = [
"nivel_completude" : 400,
"modo_confirmacao" : 6,
"fonte_confirmacao" : 3,
"status" : 1,
"data_validacao_fonte" : datePart,
"informacoes" : "comprovado por auto declaração."
]

//nome
def nome = CC4009.CC3819("CC0599")
def CC3729 = ["valor_dado_cadastral": nome, "CC3961": [validacaoNome]]

//Telefones
def CC2700 = CC4009.CC3819("CC0391")
def ddd = CC4009.CC3819("CC3708")
def objetoTelefonePrincipal = ["principal": true, "tipo": 12240,"propositos": [1,4], "ddi": 55, "ddd": ddd,"CC4275": CC2700, "ramal": 0, "data_atualizacao": datePart] def telefonePrincipal = ["valor_dado_cadastral" : objetoTelefonePrincipal , "CC3961" : [validacaoTelefone] ] def telefonesCadastral = [telefonePrincipal]

//CC4308
def CC4331 = CC4009.CC3819("CC1202")
def objetoEmail = ["principal": true,"propositos": [1,2], "CC4331": CC4331, "data_atualizacao": datePart]
def emailPrincipal = [ "valor_dado_cadastral": objetoEmail, "CC3961": [validacaoEmail] ]
def emailCadastral = [emailPrincipal]

//Nascimento
def CC2673 = CC4009.CC3819("CC0385")
def dados_nascimento = ["valor_dado_cadastral": CC2673, "CC3961":[validacaoNascimento]]
def dados = [
"telefones": telefonesCadastral,
"data_nascimento_fundacao": dados_nascimento,
"emails": emailCadastral,
"CC3120": CC3729
];

CC4009.CC3850("dados_pessoa_temp" ,dados )

logger.info(
"Montagem de campos para atualizar pessoa dados Perfil",

value("CC3826" , CC4009.CC3819("CC3826")),
value("CC4016" , CC4009.CC3819("CC4016")),
value("intencao" , CC4009.CC3819("intencao")),
value("correlationId" , CC4009.CC3819("CC1058")),
value("tempo_total_espera" , Duration.between(inicio, Instant.now()))
)</t030>
    </t031>
    <t032 id="CC3636" sourceRef="CC2542" targetRef="CC0248">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('cpf_representante') &amp;&amp; cpf_representante != "" &amp;&amp; cpf_representante != null}</t008>
    </t032>
    <t032 id="CC3587" sourceRef="CC0248" targetRef="CC0274" />
    <t032 id="CC3539" sourceRef="CC0274" targetRef="CC2562" />
    <t033 id="CC0274" name="CC0157" CC0630="#{atualizarPessoaV2Delegate}">
      <t019>
        <t058>
          <t059 name="CC0685">
            <t061>
              <t050 key="telefones">${dados_pessoa_temp["telefones"]}</t050>
              <t050 key="emails">${dados_pessoa_temp["emails"]}</t050>
              <t050 key="data_nascimento_fundacao">${dados_pessoa_temp["data_nascimento_fundacao"]}</t050>
              <t050 key="CC3120">${dados_pessoa_temp["nome_completo"]}</t050>
            </t061>
          </t059>
          <t059 name="CC4016">${adicionais.get(0).id_pessoa}</t059>
          <t059 name="CC3112">${adicionais.get(0).id_temporario}</t059>
        </t058>
      </t019>
      <t021>CC3587</t021>
      <t027>CC3539</t027>
    </t033>
    <t033 id="CC0357" name="CC0075" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">2</t059>
          <t059 name="CC1214">
            <t061 />
          </t059>
          <t059 name="CC2802">
            <t061 />
          </t059>
        </t058>
      </t019>
      <t021>CC3498</t021>
      <t027>CC3476</t027>
    </t033>
    <t032 id="CC3476" sourceRef="CC0357" targetRef="CC2927" />
    <t018 id="CC2555" name="CC0558" default="CC3544">
      <t021>CC3382</t021>
      <t027>CC3430</t027>
      <t027>CC3544</t027>
    </t018>
    <t032 id="CC3430" name="Sim" sourceRef="CC2555" targetRef="CC3028">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('response_consulta_bacen') &amp;&amp; (response_consulta_bacen.status_processo != "SUCESSO")}</t008>
    </t032>
    <t043 id="CC2715" name="CC2641">
      <t019>
        <t055>
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
        </t055>
      </t019>
      <t021>CC3544</t021>
      <t021>CC3332</t021>
      <t027>CC3590</t027>
    </t043>
    <t001 id="CC2952" attachedToRef="CC2715">
      <t027>CC3157</t027>
      <t042 id="CC0503">
        <t041 xsi:type="bpmn:tFormalExpression">PT3M</t041>
      </t042>
    </t001>
    <t032 id="CC3544" name="Não" sourceRef="CC2555" targetRef="CC2715" />
    <t012 id="CC2954">
      <t021>CC3157</t021>
      <t021>CC3590</t021>
      <t037 id="CC0268" />
    </t012>
    <t032 id="CC3157" sourceRef="CC2952" targetRef="CC2954" />
    <t032 id="CC3590" sourceRef="CC2715" targetRef="CC2954" />
    <t018 id="CC2541" name="CC1272" default="CC3384">
      <t021>CC3480</t021>
      <t027>CC3384</t027>
      <t027>CC3312</t027>
    </t018>
    <t032 id="CC3384" name="Não" sourceRef="CC2541" targetRef="CC0131" />
    <t033 id="CC0132" name="CC0126" camunda:modelerTemplate="CC1219" camunda:modelerTemplateVersion="1" CC1191="true" CC0630="${CC1220}">
      <t019>
        <t058>
          <t059 name="CC3925">{"CC3136":"CC0149","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="CC2823">{"CC3136":"CC0151","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="CC3820">{"CC3136":"CC0152","CC3137":"CC0150","CC1058":"CC0049"}</t059>
          <t059 name="CC2838">?id_cliente=${execution.getVariable('id_pessoa_representante')}</t059>
          <t059 name="CC1399">?id_cliente=${execution.getVariable('id_pessoa_representante')}</t059>
          <t059 name="CC2710">?id_cliente=${execution.getVariable('id_pessoa_representante')}</t059>
          <t059 name="urlDev">«U000022»{CC4009.CC3819('id_processo_bacen_representante')}</t059>
          <t059 name="CC3960">«U000022»{CC4009.CC3819('id_processo_bacen_representante')}</t059>
          <t059 name="urlProd">«U000021»{CC4009.CC3819('id_processo_bacen_representante')}</t059>
          <t063 name="CC0088">${S(response)}</t063>
        </t058>
        <t054 name="withError">
          <t052>true</t052>
        </t054>
        <t054 name="CC1381">
          <t067>C08_BCN</t067>
        </t054>
        <t054 name="CC2725">
          <t052>${statusCode != 200}</t052>
        </t054>
      </t019>
      <t021>CC3312</t021>
      <t027>CC3207</t027>
    </t033>
    <t001 id="CC2970" attachedToRef="CC0132">
      <t027>CC3316</t027>
      <t014 id="CC0417" />
    </t001>
    <t032 id="CC3312" name="Sim" sourceRef="CC2541" targetRef="CC0132">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('cpf_representante') &amp;&amp; cpf_representante != "" &amp;&amp; cpf_representante != null}</t008>
    </t032>
    <t032 id="CC3316" sourceRef="CC2970" targetRef="CC1700" />
    <t031 id="CC0287" name="CC0104" CC1191="true" scriptFormat="groovy">
      <t021>CC3207</t021>
      <t027>CC3234</t027>
      <t030>def jsonSlurperClassic = new groovy.json.JsonSlurperClassic(); CC4009.CC3850("response_consulta_bacen_representante", jsonSlurperClassic.parseText(CC0088.toString())) CC4009.CC3850("response_consulta_bacen_representante", response_consulta_bacen_representante)</t030>
    </t031>
    <t032 id="CC3207" sourceRef="CC0132" targetRef="CC0287" />
    <t018 id="CC2525" name="CC0726" default="CC3627">
      <t021>CC3234</t021>
      <t027>CC3627</t027>
      <t027>CC3217</t027>
    </t018>
    <t032 id="CC3234" sourceRef="CC0287" targetRef="CC2525" />
    <t032 id="CC3627" name="Não" sourceRef="CC2525" targetRef="CC0131" />
    <t033 id="CC1700" name="CC0552" CC0630="${CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">4</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="CC2817">$</t050>
              <t050 key="CC2816">$</t050>
              <t050 key="CC1199">$</t050>
              <t050 key="CC0864">$</t050>
              <t050 key="CC0588">$</t050>
              <t050 key="CC1200">$</t050>
              <t050 key="CC0745">$</t050>
              <t050 key="possui_restricao_representante">$</t050>
              <t050 key="possui_restricao">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="CC2817">${CC2817}</t050>
              <t050 key="CC2816">${CC2816}</t050>
              <t050 key="CC1199">${CC1199}</t050>
              <t050 key="CC0864">${CC0864}</t050>
              <t050 key="CC0588">${CC0588}</t050>
              <t050 key="CC1200">${CC1200}</t050>
              <t050 key="CC0745">${CC0745}</t050>
              <t050 key="possui_restricao_representante">${execution.hasVariable('response_consulta_bacen_representante') &amp;&amp;
response_consulta_bacen != null &amp;&amp; response_consulta_bacen_representante.possui_restricao != null ? response_consulta_bacen_representante.possui_restricao : 'null'}</t050>
              <t050 key="possui_restricao">${execution.hasVariable('response_consulta_bacen') &amp;&amp; response_consulta_bacen != null &amp;&amp; response_consulta_bacen.possui_restricao != null ? response_consulta_bacen.possui_restricao : 'null'}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3316</t021>
      <t021>CC3217</t021>
      <t027>CC3528</t027>
    </t033>
    <t018 id="CC2576" name="CC0558" default="CC3332">
      <t021>CC3528</t021>
      <t027>CC3189</t027>
      <t027>CC3332</t027>
    </t018>
    <t032 id="CC3528" sourceRef="CC1700" targetRef="CC2576" />
    <t032 id="CC3189" name="Sim" sourceRef="CC2576" targetRef="CC3028">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('response_consulta_bacen_representante') &amp;&amp;
(response_consulta_bacen_representante.status_processo != "SUCESSO")}</t008>
    </t032>
    <t032 id="CC3332" name="Não" sourceRef="CC2576" targetRef="CC2715" />
    <t032 id="CC3217" name="Sim" sourceRef="CC2525" targetRef="CC1700">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('response_consulta_bacen_representante') &amp;&amp;
(response_consulta_bacen_representante.status_processo != "SUCESSO" ||
(response_consulta_bacen_representante.possui_restricao != null &amp;&amp; response_consulta_bacen_representante.possui_restricao == true))}</t008>
    </t032>
    <t033 id="CC0856" name="CC0294" CC0630="${CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">98</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="CC4222">$</t050>
              <t050 key="CC2020">$</t050>
              <t050 key="CC4129">$</t050>
              <t050 key="CC4421">$</t050>
              <t050 key="CC4016">$</t050>
              <t050 key="CC4178">$</t050>
              <t050 key="CC0745">$</t050>
              <t050 key="data_envio_voucher">$</t050>
              <t050 key="hora_envio_voucher">$</t050>
              <t050 key="origem_proposta">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="CC4222">"true"</t050>
              <t050 key="CC2020">${CC2020}</t050>
              <t050 key="CC4129">${CC4129}</t050>
              <t050 key="CC4421">${CC4421}</t050>
              <t050 key="CC4016">${CC4016}</t050>
              <t050 key="CC4178">${agencia_logada}</t050>
              <t050 key="CC0745">${CC0745}</t050>
              <t050 key="data_envio_voucher">${dateTime().toString("yyyy-MM-dd")}</t050>
              <t050 key="hora_envio_voucher">${dateTime().toString("HH:mm")}</t050>
              <t050 key="origem_proposta">${execution.hasVariable('origem_proposta') ? origem_proposta : phygital}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3200</t021>
      <t027>CC3622</t027>
    </t033>
    <t018 id="CC2514" name="CC1625" default="CC3286">
      <t021>CC3267</t021>
      <t027>CC3286</t027>
      <t027>CC3200</t027>
    </t018>
    <t032 id="CC3286" name="Não" sourceRef="CC2514" targetRef="CC2589" />
    <t032 id="CC3200" name="Sim" sourceRef="CC2514" targetRef="CC0856">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('derivou_voucher_phygital') &amp;&amp; execution.getVariable('derivou_voucher_phygital') == "true"}</t008>
    </t032>
    <t012 id="CC3018">
      <t021>CC3622</t021>
      <t037 id="CC0269" />
    </t012>
    <t032 id="CC3622" sourceRef="CC0856" targetRef="CC3018" />
    <t018 id="CC2568" name="CC2764" default="CC3199">
      <t021>CC3182</t021>
      <t027>CC3199</t027>
      <t027>CC3663</t027>
    </t018>
    <t033 id="CC0167" name="CC0084" camunda:modelerTemplate="CC1219" camunda:modelerTemplateVersion="1" CC1191="true" CC0630="${CC1220}">
      <t019>
        <t058>
          <t059 name="CC2838" />
          <t059 name="CC1399" />
          <t059 name="CC2710" />
          <t059 name="CC3925">{"CC3136":"CC0149","CC3137":"CC0150","CC2849":"a2hnz62xw8","CC1058":"CC0049"}</t059>
          <t059 name="CC2823">{"CC3136":"CC0151", "CC3137": "CC0150","CC2849":"paotv172b9","CC1058":"CC0049"}</t059>
          <t059 name="CC3820">{"CC3136":"CC0152", "CC3137":"CC0150","CC2849":"wl76sins6i","CC1058":"CC0049"}</t059>
          <t059 name="urlProd">«U000007»{CC4009.CC3819('CC3696')}</t059>
          <t059 name="CC3960">«U000011»{CC4009.CC3819('CC3696')}</t059>
          <t059 name="urlDev">«U000009»{CC4009.CC3819('CC3696')}</t059>
          <t063 name="CC0545">${S(response)}</t063>
        </t058>
        <t054 name="withError">
          <t052>true</t052>
        </t054>
        <t054 name="CC1381">
          <t067>erro_consultar_id_pessoa</t067>
        </t054>
        <t054 name="CC2725">
          <t052>${statusCode != 200}</t052>
        </t054>
      </t019>
      <t021>CC3199</t021>
      <t027>CC3644</t027>
    </t033>
    <t001 id="CC2944" attachedToRef="CC0167">
      <t027>CC3173</t027>
      <t014 id="CC0413" />
    </t001>
    <t031 id="CC0209" name="CC0201" scriptFormat="groovy">
      <t021>CC3399</t021>
      <t027>CC3330</t027>
      <t030>if(CC4009.hasVariable("CC0316")){
def jsonSlurper = new groovy.json.JsonSlurper()
def CC0316 = CC4009.CC3819("CC0316")
def jsonString = (CC0316 instanceof String) ? CC0316 : CC0316.toString() Object object = jsonSlurper.parseText(jsonString) object = (object instanceof Map &amp;&amp; object.containsKey("data")) ? object.data : object

if (object.containsKey("CC3120") &amp;&amp; object.CC3120 != null){

CC4009.CC3850("nome_empresa_pagadora", object.CC3120["valor_dado_cadastral"])
CC4009.CC3850("CC3730", object.CC3120["valor_dado_cadastral"])

} else if (object.containsKey("nome_fantasia_apelido") &amp;&amp; object.nome_fantasia_apelido != null){

CC4009.CC3850("nome_empresa_pagadora", object.nome_fantasia_apelido["valor_dado_cadastral"]) CC4009.CC3850("CC3730", object.nome_fantasia_apelido["valor_dado_cadastral"])

}
}
CC4009.CC3850("CC1999",true);</t030>
    </t031>
    <t033 id="CC0308" name="CC0141" camunda:modelerTemplate="CC1219" camunda:modelerTemplateVersion="1" CC1191="true" CC0630="${CC1220}">
      <t019>
        <t058>
          <t059 name="CC2838" />
          <t059 name="CC1399" />
          <t059 name="CC2710" />
          <t059 name="urlProd">«U000001»{id_cliente_oig}?codigo_agrupamento_produto=0&amp;codigo_chave_produto=0</t059>
          <t059 name="CC3960">«U000005»{id_cliente_oig}?codigo_agrupamento_produto=0&amp;codigo_chave_produto=0</t059>
          <t059 name="urlDev">«U000003»{id_cliente_oig}?codigo_agrupamento_produto=0&amp;codigo_chave_produto=0</t059>
          <t059 name="CC3925">{"CC3136":"CC0149","CC3137":"CC0150","CC2849":"7p5sw5axbd","CC1408":"CC4389","CC1058":"CC0049"}</t059>
          <t059 name="CC2823">{"CC3136":"CC0151","CC3137":"CC0150","CC2849":"mo2yk5j192","CC1408":"CC4389","CC1058":"CC0049"}</t059>
          <t059 name="CC3820">{"CC3136":"CC0152","CC3137":"CC0150","CC2849":"qtbssnq60m","CC1408":"CC4389","CC1058":"CC0049"}</t059>
          <t063 name="CC0316">${S(response)}</t063>
        </t058>
        <t054 name="withError">
          <t052>true</t052>
        </t054>
        <t054 name="CC1381">
          <t067>erro_consultar_dados_pf</t067>
        </t054>
        <t054 name="CC2725">
          <t052>${statusCode != 200}</t052>
        </t054>
      </t019>
      <t021>CC3275</t021>
      <t027>CC3399</t027>
    </t033>
    <t031 id="CC0317" name="CC0303" scriptFormat="groovy">
      <t021>CC3644</t021>
      <t021>CC3275</t021>
      <t030>import groovy.json.JsonSlurper;

if(CC4009.hasVariable("CC0545")){
def jsonSlurper = new JsonSlurper();
def CC0545 = CC4009.CC3819("CC0545")
Object object = jsonSlurper.parseText(CC0545.toString())
if (object.containsKey("data") &amp;&amp; object.data != null &amp;&amp; object.data[0]["id_cliente"] != null){ CC4009.CC3850("id_cliente_oig", object.data[0]["id_cliente"]) } else { CC4009.CC3850("id_cliente_oig", "") } }
</t030>
    </t031>
    <t001 id="CC2908" attachedToRef="CC0308">
      <t027>CC3230</t027>
      <t014 id="CC0424" />
    </t001>
    <t032 id="CC3399" sourceRef="CC0308" targetRef="CC0209" />
    <t032 id="CC3275" sourceRef="CC0317" targetRef="CC0308" />
    <t032 id="CC3199" name="Sim" sourceRef="CC2568" targetRef="CC0167" />
    <t032 id="CC3644" sourceRef="CC0167" targetRef="CC0317" />
    <t032 id="CC3173" sourceRef="CC2944" targetRef="CC2933" />
    <t032 id="CC3230" sourceRef="CC2908" targetRef="CC2933" />
    <t031 id="CC0184" name="CC0179" scriptFormat="groovy">
      <t021>CC3511</t021>
      <t027>CC3602</t027>
      <t030>import groovy.json.JsonSlurper

if(CC4009.hasVariable("CC0316")){
def jsonSlurper = new JsonSlurper()
def CC0316 = CC4009.CC3819("CC0316")

// Converte SpinJsonNode para String
def jsonString = CC0316 instanceof String ?
CC0316 :
org.camunda.spin.Spin.JSON(CC0316).toString()

def parsedObject = jsonSlurper.parseText(jsonString)
def data = parsedObject.containsKey("data") ? parsedObject.data : parsedObject

if (data.containsKey("nome_fantasia") &amp;&amp; data.nome_fantasia != null){
CC4009.CC3850("nome_empresa_pagadora", data.nome_fantasia["valor_dado_cadastral"])
CC4009.CC3850("CC3730", data.nome_fantasia["valor_dado_cadastral"])
} else if (data.containsKey("CC3120") &amp;&amp; data.CC3120 != null){ CC4009.CC3850("nome_empresa_pagadora", data.CC3120["valor_dado_cadastral"]) CC4009.CC3850("CC3730", data.CC3120["valor_dado_cadastral"]) } } CC4009.CC3850("CC1999",true);</t030>
    </t031>
    <t033 id="CC0278" name="CC0130" camunda:modelerTemplate="CC1219" camunda:modelerTemplateVersion="1" CC1191="true" CC0630="${CC1220}">
      <t019>
        <t058>
          <t059 name="CC2838" />
          <t059 name="CC1399" />
          <t059 name="CC2710" />
          <t059 name="urlDev">«U000004»{id_cliente_oig}?id_jornada=CC0153&amp;codigo_chave_produto=0</t059>
          <t059 name="CC3960">«U000006»{id_cliente_oig}?id_jornada=CC0153&amp;codigo_chave_produto=0</t059>
          <t059 name="urlProd">«U000002»{id_cliente_oig}?id_jornada=CC0153&amp;codigo_chave_produto=0</t059>
          <t059 name="CC3925">{"CC3136":"CC0149","CC3137":"CC0150","CC2849":"p9wusrqep1","CC0820":"CC4389","CC1058":"CC0049"}</t059>
          <t059 name="CC2823">{"CC3136":"CC0151","CC3137":"CC0150","CC2849":"o8mzrcjq97","CC0820":"CC4389","CC1058":"CC0049"}</t059>
          <t059 name="CC3820">{"CC3136":"CC0152","CC3137":"CC0150","CC2849":"spqcvol6hl","CC0820":"CC4389","CC1058":"CC0049"}</t059>
          <t063 name="CC0316">${S(response)}</t063>
        </t058>
        <t054 name="withError">
          <t052>true</t052>
        </t054>
        <t054 name="CC1381">
          <t067>erro_consultar_dados_pj</t067>
        </t054>
        <t054 name="CC2725">
          <t052>${statusCode != 200}</t052>
        </t054>
      </t019>
      <t021>CC3313</t021>
      <t027>CC3511</t027>
    </t033>
    <t033 id="CC0168" name="CC0085" camunda:modelerTemplate="CC1219" camunda:modelerTemplateVersion="1" CC1191="true" CC0630="${CC1220}">
      <t019>
        <t058>
          <t059 name="CC2838" />
          <t059 name="CC1399" />
          <t059 name="CC2710" />
          <t059 name="CC3925">{"CC3136":"CC0149","CC3137":"CC0150","CC2849":"a2hnz62xw8","CC1058":"CC0049"}</t059>
          <t059 name="CC2823">{"CC3136":"CC0151", "CC3137": "CC0150","CC2849":"paotv172b9","CC1058":"CC0049"}</t059>
          <t059 name="CC3820">{"CC3136":"CC0152", "CC3137":"CC0150","CC2849":"wl76sins6i","CC1058":"CC0049"}</t059>
          <t059 name="urlProd">«U000008»{CC4009.CC3819('CC3696')}</t059>
          <t059 name="CC3960">«U000012»{CC4009.CC3819('CC3696')}</t059>
          <t059 name="urlDev">«U000010»{CC4009.CC3819('CC3696')}</t059>
          <t063 name="CC0545">${S(response)}</t063>
        </t058>
        <t054 name="withError">
          <t052>true</t052>
        </t054>
        <t054 name="CC1381">
          <t067>erro_consultar_id_pessoa</t067>
        </t054>
        <t054 name="CC2725">
          <t052>${statusCode != 200}</t052>
        </t054>
      </t019>
      <t021>CC3663</t021>
      <t027>CC3165</t027>
    </t033>
    <t031 id="CC0318" name="CC0304" scriptFormat="groovy">
      <t021>CC3165</t021>
      <t027>CC3313</t027>
      <t030>import groovy.json.JsonSlurper;

if(CC4009.hasVariable("CC0545")){
def jsonSlurper = new JsonSlurper();
def CC0545 = CC4009.CC3819("CC0545")
Object object = jsonSlurper.parseText(CC0545.toString())
if (object.containsKey("data") &amp;&amp; object.data != null &amp;&amp; object.data[0]["id_cliente"] != null){ CC4009.CC3850("id_cliente_oig", object.data[0]["id_cliente"]) } else { CC4009.CC3850("id_cliente_oig", "") } }
</t030>
    </t031>
    <t001 id="CC2992" attachedToRef="CC0278">
      <t027>CC3535</t027>
      <t014 id="CC0447" />
    </t001>
    <t001 id="CC3030" attachedToRef="CC0168">
      <t027>CC3633</t027>
      <t014 id="CC0448" />
    </t001>
    <t032 id="CC3511" sourceRef="CC0278" targetRef="CC0184" />
    <t032 id="CC3313" sourceRef="CC0318" targetRef="CC0278" />
    <t032 id="CC3165" sourceRef="CC0168" targetRef="CC0318" />
    <t032 id="CC3663" name="Não" sourceRef="CC2568" targetRef="CC0168">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('tipo_pessoa') &amp;&amp; execution.getVariable('tipo_pessoa') != null &amp;&amp; execution.getVariable('tipo_pessoa') != "F"}</t008>
    </t032>
    <t032 id="CC3330" sourceRef="CC0209" targetRef="CC0684" />
    <t032 id="CC3602" sourceRef="CC0184" targetRef="CC0684" />
    <t032 id="CC3633" sourceRef="CC3030" targetRef="CC2933" />
    <t032 id="CC3535" sourceRef="CC2992" targetRef="CC2933" />
    <t043 id="CC3706" name="CC3150" default="CC3655">
      <t019>
        <t055>
          <t056 id="CC2830" type="string" />
          <t056 id="CC1369" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0947" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC1243" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC1205" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0390" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0529" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0797" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0594" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0389" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0787" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC1986" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0693" type="boolean">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC1042" type="boolean">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0887" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC2727" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC1690" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC2658" type="boolean">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0866" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC3115" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC2835" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0393" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC3133" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC2704" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0608" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0757" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0048" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC2702" type="boolean">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC1055" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC1054" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC2732" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0758" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC2843" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC1013" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC4116" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC4328" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC1383" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC1680" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0754" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0358" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC1230" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC1391" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC1245" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC1244" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC1998" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC1655" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC3853" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC2651" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0610" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC1668" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC2030" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0813" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC4290" type="string" defaultValue="continuar" />
          <t056 id="CC2012" type="boolean" />
          <t056 id="CC0280" label="CC0280" type="string" />
          <t056 id="CC1385" label="CC1385" type="string" />
          <t056 id="CC0281" label="CC0281" type="string" />
          <t056 id="CC1386" label="CC1386" type="string" />
          <t056 id="CC1387" label="CC1387" type="string" />
          <t056 id="CC0531" type="string" defaultValue="${null}" />
          <t056 id="CC2837" label="CC2837" type="boolean" defaultValue="false" />
          <t056 id="CC3117" label="CC3117" type="string" />
          <t056 id="CC0745" label="Funcional CC4159" type="string" />
          <t056 id="CC0206" type="boolean">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0244" type="boolean">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0681" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0321" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0307" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0148" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0682" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0322" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC1194" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0706" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0585" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0249" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0941" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0609" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0204" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0110" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0532" type="string" defaultValue="${&quot;&quot;}">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC3125" type="string" defaultValue="${&quot;&quot;}">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC1020" type="boolean">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0872" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0818" type="string">
            <t064>
              <t065 id="CC4126" value="CC2830" />
            </t064>
          </t056>
          <t056 id="CC0284" type="domain" defaultValue="${execution.hasVariable('limiterotativo_credito_v3_aberturacontas_resposta') ?&#10;limiterotativo_credito_v3_aberturacontas_resposta['valor_lis_pre_aprovado'] : null}" />
          <t056 id="CC0182" type="domain" defaultValue="${execution.hasVariable('limiterotativo_credito_v3_aberturacontas_resposta') ?&#10;limiterotativo_credito_v3_aberturacontas_resposta['valor_cartao_pre_aprovado'] : null}" />
          <t056 id="CC2660" type="domain" defaultValue="${execution.hasVariable('codigo_erro_puc') ?&#10;codigo_erro_puc : null}" />
          <t056 id="CC0633" type="boolean">
            <t064>
              <t065 id="CC3811" value="CC0750" />
              <t065 id="CC4126" />
            </t064>
          </t056>
          <t056 id="CC0144" type="string">
            <t064>
              <t065 id="CC3811" value="CC0750" />
              <t065 id="CC4126" />
            </t064>
          </t056>
          <t056 id="CC0817" type="string">
            <t064>
              <t065 id="CC3811" value="CC0750" />
              <t065 id="CC4126" />
            </t064>
          </t056>
          <t056 id="CC1029" type="string">
            <t064>
              <t065 id="CC3811" value="CC0750" />
              <t065 id="CC4126" />
            </t064>
          </t056>
          <t056 id="CC0746" type="string">
            <t064>
              <t065 id="CC3811" value="CC0750" />
              <t065 id="CC4126" />
            </t064>
          </t056>
          <t056 id="CC0702" label="CC0702" type="string">
            <t064>
              <t065 id="CC3811" value="CC0750" />
              <t065 id="CC4126" />
            </t064>
          </t056>
          <t056 id="CC0871" type="string">
            <t064>
              <t065 id="CC3811" value="CC0702" />
              <t065 id="CC4126" />
            </t064>
          </t056>
          <t056 id="CC0351" label="CC0351" type="string">
            <t064>
              <t065 id="CC3811" value="CC0702" />
              <t065 id="CC4126" />
            </t064>
          </t056>
          <t056 id="CC0397" type="string">
            <t064>
              <t065 id="CC3811" value="CC2830" />
              <t065 id="CC4126" />
            </t064>
          </t056>
          <t056 id="CC0245" type="string">
            <t064>
              <t065 id="CC3811" value="CC2830" />
              <t065 id="CC4126" />
            </t064>
          </t056>
          <t056 id="CC0543" type="string">
            <t064>
              <t065 id="CC3811" value="CC2830" />
              <t065 id="CC4126" />
            </t064>
          </t056>
          <t056 id="CC1398" type="string">
            <t064>
              <t065 id="CC3811" value="CC2830" />
              <t065 id="CC4126" />
            </t064>
          </t056>
          <t056 id="CC0750" label="CC0750" type="string" />
          <t056 id="CC4024" label="CC4024" type="string">
            <t064>
              <t065 id="CC4126" value="CC4024" />
            </t064>
          </t056>
          <t056 id="CC1217" label="CC1217" type="string">
            <t064>
              <t065 id="CC4126" value="CC1217" />
            </t064>
          </t056>
          <t056 id="CC0862" type="string" />
          <t056 id="CC3928" type="string" />
          <t056 id="CC3834" type="string" />
          <t056 id="CC1211" type="string" />
          <t056 id="CC4087" type="string" />
          <t056 id="CC3824" type="string" />
          <t056 id="CC3104" type="string" />
          <t056 id="CC0795" type="string" />
          <t056 id="CC3723" type="string" />
          <t056 id="CC3955" type="string" />
          <t056 id="CC4287" type="string" />
          <t056 id="CC3852" type="string" />
        </t055>
        <t058>
          <t059 name="CC0311">
            <t060>
              <t069>CC0633</t069>
              <t069>CC0144</t069>
              <t069>CC0817</t069>
              <t069>CC1029</t069>
              <t069>CC0746</t069>
              <t069>CC0702</t069>
            </t060>
          </t059>
          <t059 name="CC0288">
            <t060>
              <t069>CC0871</t069>
              <t069>CC0351</t069>
            </t060>
          </t059>
          <t059 name="CC0958">
            <t060>
              <t069>CC1369</t069>
              <t069>CC0947</t069>
              <t069>CC1243</t069>
              <t069>CC1205</t069>
              <t069>CC0390</t069>
              <t069>CC0529</t069>
              <t069>CC0797</t069>
              <t069>CC0594</t069>
              <t069>CC0389</t069>
              <t069>CC0787</t069>
              <t069>CC1986</t069>
              <t069>CC0693</t069>
              <t069>CC1042</t069>
              <t069>CC0887</t069>
              <t069>CC2727</t069>
              <t069>CC1690</t069>
              <t069>CC2658</t069>
              <t069>CC0866</t069>
              <t069>CC3115</t069>
              <t069>CC2835</t069>
              <t069>CC0393</t069>
              <t069>CC3133</t069>
              <t069>CC2704</t069>
              <t069>CC0608</t069>
              <t069>CC0757</t069>
              <t069>CC0048</t069>
              <t069>CC2702</t069>
              <t069>CC1055</t069>
              <t069>CC1054</t069>
              <t069>CC2732</t069>
              <t069>CC0758</t069>
              <t069>CC2843</t069>
              <t069>CC1013</t069>
              <t069>CC4116</t069>
              <t069>CC4328</t069>
              <t069>CC1383</t069>
              <t069>CC1680</t069>
              <t069>CC0754</t069>
              <t069>CC0358</t069>
              <t069>CC1230</t069>
              <t069>CC1391</t069>
              <t069>CC1244</t069>
              <t069>CC1655</t069>
              <t069>CC1998</t069>
              <t069>CC3853</t069>
              <t069>CC2651</t069>
              <t069>CC0610</t069>
              <t069>CC1668</t069>
              <t069>CC2030</t069>
              <t069>CC0813</t069>
              <t069>CC0608</t069>
              <t069>CC2012</t069>
              <t069>CC1245</t069>
              <t069>CC0206</t069>
              <t069>CC0244</t069>
              <t069>CC0681</t069>
              <t069>CC0321</t069>
              <t069>CC0307</t069>
              <t069>CC0148</t069>
              <t069>CC0682</t069>
              <t069>CC0322</t069>
              <t069>CC1194</t069>
              <t069>CC0706</t069>
              <t069>CC0585</t069>
              <t069>CC0249</t069>
              <t069>CC0941</t069>
              <t069>CC0609</t069>
              <t069>CC0204</t069>
              <t069>CC0110</t069>
              <t069>CC0532</t069>
              <t069>CC3125</t069>
              <t069>CC1020</t069>
              <t069>CC0872</t069>
              <t069>CC0818</t069>
              <t069>CC0397</t069>
              <t069>CC0245</t069>
              <t069>CC0543</t069>
              <t069>CC1398</t069>
            </t060>
          </t059>
          <t059 name="CC2011">
            <t060>
              <t069>CC0795</t069>
              <t069>CC3723</t069>
              <t069>CC3955</t069>
              <t069>CC0206</t069>
              <t069>CC4287</t069>
              <t069>CC3852</t069>
            </t060>
          </t059>
          <t059 name="CC0643">
            <t060>
              <t069>CC0862</t069>
              <t069>CC3928</t069>
              <t069>CC3834</t069>
              <t069>CC1211</t069>
              <t069>CC4087</t069>
              <t069>CC3824</t069>
              <t069>CC3104</t069>
            </t060>
          </t059>
          <t063 name="CC3108">CC3706</t063>
        </t058>
      </t019>
      <t021>CC3402</t021>
      <t021>CC3354</t021>
      <t027>CC3655</t027>
      <t027>CC3543</t027>
    </t043>
    <t001 id="CC2906" attachedToRef="CC3706">
      <t027>CC3156</t027>
      <t042 id="CC0514">
        <t041 xsi:type="bpmn:tFormalExpression">${CC0976}</t041>
      </t042>
    </t001>
    <t032 id="CC3655" sourceRef="CC3706" targetRef="CC2603" />
    <t032 id="CC3156" sourceRef="CC2906" targetRef="CC2989" />
    <t032 id="CC3402" sourceRef="CC3032" targetRef="CC3706" />
    <t032 id="CC3354" sourceRef="CC1228" targetRef="CC3706" />
    <t032 id="CC3543" sourceRef="CC3706" targetRef="CC1401">
      <t008 xsi:type="bpmn:tFormalExpression">${execution.hasVariable('voltar') &amp;&amp; voltar=="selecionar_agencia"}</t008>
    </t032>
    <t033 id="CC2708" name="CC0215" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">1</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="CC0950">$</t050>
              <t050 key="CC0247">$</t050>
              <t050 key="CC2712">$</t050>
              <t050 key="vinculo_selecionado">$</t050>
              <t050 key="consultar_vinculos">$</t050>
              <t050 key="CC3817">$</t050>
              <t050 key="CC4421">$</t050>
              <t050 key="CC4016">$</t050>
              <t050 key="CC3706">$</t050>
              <t050 key="CC2694">$</t050>
              <t050 key="CC2830">$</t050>
              <t050 key="CC0750">$</t050>
              <t050 key="CC4024">$</t050>
              <t050 key="CC1217">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="CC0950">${execution.hasVariable('documentos_backoffice') ? documentos_backoffice : null}</t050>
              <t050 key="CC0247">${execution.hasVariable('resultado_analise_score_biometria') ? resultado_analise_score_biometria : "Resultado desconhecido ou sem resultado"}</t050>
              <t050 key="CC2712">${execution.hasVariable('receber_salario') ? receber_salario : false}</t050>
              <t050 key="vinculo_selecionado">${execution.hasVariable('vinculo_selecionado') ? vinculo_selecionado : null}</t050>
              <t050 key="consultar_vinculos">${execution.hasVariable('consultar_vinculos') ? consultar_vinculos : false}</t050>
              <t050 key="CC3817">${CC3817}</t050>
              <t050 key="CC4421">${CC4421}</t050>
              <t050 key="CC4016">${CC4016}</t050>
              <t050 key="CC3706">true</t050>
              <t050 key="CC2694">${CC2694}</t050>
              <t050 key="CC2830">${execution.hasVariable('oferta_produto') ? oferta_produto : "Sem produto"}</t050>
              <t050 key="CC0750">${execution.hasVariable('oferta_seguro_transacoes') ? oferta_seguro_transacoes: "Sem seguro"}</t050>
              <t050 key="CC4024">${execution.hasVariable('oferta_ad') ? oferta_ad : "AD antigo"}</t050>
              <t050 key="CC1217">${execution.hasVariable('oferta_multiplo_npc') ? oferta_multiplo_npc : null}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3619</t021>
      <t027>CC3205</t027>
    </t033>
    <t032 id="CC3205" sourceRef="CC2708" targetRef="CC2582" />
    <t033 id="CC0028" name="CC0215" CC0630="${CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">1</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="CC0950">$</t050>
              <t050 key="CC2712">$</t050>
              <t050 key="vinculo_selecionado">$</t050>
              <t050 key="consultar_vinculos">$</t050>
              <t050 key="CC3817">$</t050>
              <t050 key="CC4421">$</t050>
              <t050 key="CC4016">$</t050>
              <t050 key="CC3706">$</t050>
              <t050 key="CC3939">${execution.hasVariable("oferta_npc") ? oferta_npc : false}</t050>
              <t050 key="CC3824">${execution.hasVariable("id_intencao") ? id_intencao : null}</t050>
              <t050 key="limite_cartao_direcionador">${execution.hasVariable("limite_cartao_direcionador") ? limite_cartao_direcionador : null}</t050>
              <t050 key="CC2830">$</t050>
              <t050 key="CC0750">$</t050>
              <t050 key="CC4024">$</t050>
              <t050 key="CC1217">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="CC0950">${execution.hasVariable('documentos_backoffice') ? documentos_backoffice : null}</t050>
              <t050 key="CC2712">${execution.hasVariable('receber_salario') ? receber_salario : false}</t050>
              <t050 key="vinculo_selecionado">${execution.hasVariable('vinculo_selecionado') ? vinculo_selecionado : null}</t050>
              <t050 key="consultar_vinculos">${execution.hasVariable('consultar_vinculos') ? consultar_vinculos : false}</t050>
              <t050 key="CC3817">${CC3817}</t050>
              <t050 key="CC4421">${CC4421}</t050>
              <t050 key="CC4016">${CC4016}</t050>
              <t050 key="CC3706">true</t050>
              <t050 key="CC2830">${execution.hasVariable('oferta_produto') ? oferta_produto : "Sem produto"}</t050>
              <t050 key="CC0750">${execution.hasVariable('oferta_seguro_transacoes') ? oferta_seguro_transacoes: "Sem seguro"}</t050>
              <t050 key="CC4024">${execution.hasVariable('oferta_ad') ? oferta_ad : "AD antigo"}</t050>
              <t050 key="CC1217">${execution.hasVariable('oferta_multiplo_npc') ? oferta_multiplo_npc : null}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3488</t021>
      <t027>CC3638</t027>
    </t033>
    <t031 id="CC0069" name="CC0574" scriptFormat="groovy">
      <t021>CC3638</t021>
      <t027>CC3166</t027>
      <t030>def CC2830 = CC4009.CC3819('CC2830')
def CC0750 = CC4009.CC3819('CC0750')

def CC0247 = 'CC4291'
CC4009.CC3850('CC0247', CC0247)

def telefone_completo = CC4009.CC3819('CC3708')+CC4009.CC3819('CC2700')

def CC2802 = [
'CC3826' : CC4009.CC3819('CC3826'),
'CC4129' : CC4009.CC3819('CC4129'),
'ofertas' : CC2830,
'CC0750' : CC0750,
'CC4421' : CC4009.CC3819('CC4421'),
'CC3120' : CC4009.CC3819('CC3120'),
'CC2673' : CC4009.CC3819('CC2673'),
'CC4331' : CC4009.CC3819('CC4331'),
'telefone_completo' : telefone_completo,
'CC4338' : CC4009.CC3819('CC3858'),
'CC4385' : CC4009.CC3819('CC4385'),
'UF' : CC4009.CC3819('CC4266'),
'CC4275' : CC4009.CC3819('CC4275'),
'CC4424' : CC4009.CC3819('CC4424'),
'CC3800' : CC4009.CC3819('CC3800'),
'CC4257' : CC4009.CC3819('CC4257'),
'CC4260' : CC4009.CC3819('CC4260'),
'CC4403' : CC4009.CC3819('CC2815'),
'CC4024' : CC4009.CC3819('CC4024'),'CC1217' : CC4009.CC3819('CC1217')
]
def builderJson = new groovy.json.JsonBuilder()
builderJson(CC2802)

CC4009.CC3850('CC2802', builderJson.toString())</t030>
    </t031>
    <t031 id="CC0647" name="CC0574" scriptFormat="groovy">
      <t021>CC3537</t021>
      <t027>CC3525</t027>
      <t030>def CC2830 = CC4009.CC3819('CC2830')
def CC0750 = CC4009.CC3819('CC0750')

def telefone_completo = CC4009.CC3819('CC3708')+CC4009.CC3819('CC2700')

def CC2802 = [
'CC3826': CC4009.CC3819('CC3826'),
'CC4129' : CC4009.CC3819('CC4129'),
'ofertas' : CC2830,
'CC0750' : CC0750,
'CC4421' : CC4009.CC3819('CC4421'),
'CC3120' : CC4009.CC3819('CC3120'),
'CC2673' : CC4009.CC3819('CC2673'),
'CC4331' : CC4009.CC3819('CC4331'),
'telefone_completo' : telefone_completo,
'CC4338' : CC4009.CC3819('CC3858'),
'CC4385' : CC4009.CC3819('CC4385'),
'UF' : CC4009.CC3819('CC4266'),
'CC4275' : CC4009.CC3819('CC4275'),
'CC4424' : CC4009.CC3819('CC4424'),
'CC3800' : CC4009.CC3819('CC3800'),
'CC4257' : CC4009.CC3819('CC4257'),
'CC4260' : CC4009.CC3819('CC4260'),
'CC4403' : CC4009.CC3819('CC2815'),
'CC4024' : CC4009.CC3819('CC4024'),'CC1217' : CC4009.CC3819('CC1217')
]
def builderJson = new groovy.json.JsonBuilder()
builderJson(CC2802)

CC4009.CC3850('CC2802', builderJson.toString())</t030>
    </t031>
    <t032 id="CC3525" sourceRef="CC0647" targetRef="CC1994" />
    <t032 id="CC3638" sourceRef="CC0028" targetRef="CC0069" />
    <t032 id="CC3166" sourceRef="CC0069" targetRef="CC1994" />
    <t032 id="CC3258" name="CC4313" sourceRef="CC2614" targetRef="CC0694" />
    <t033 id="CC3721" name="CC3979" camunda:type="external" CC3089="CC0659">
      <t011>CC0042




Link Git --&gt; «U000027»</t011>
      <t019>
        <t058>
          <t059 name="CC1644">${oferta_produto['contratar_combinaqui'] ? "X" : ""}</t059>
          <t059 name="CC1643">${oferta_produto['contratar_combinaqui'] ? "" : "X"}</t059>
          <t059 name="CC1036">${oferta_produto['nome_pacote_combinaqui']}</t059>
          <t059 name="CC0981">${oferta_produto['valor_pacote_combinaqui'] }</t059>
          <t059 name="CC3908">${oferta_produto != null &amp;&amp; oferta_produto.cobertura_bolsa_protegida != null ? oferta_produto.cobertura_bolsa_protegida : ''}</t059>
          <t059 name="valor1">${oferta_produto != null &amp;&amp; oferta_produto.valor_cobertura_bolsa_protegida != null ? oferta_produto.valor_cobertura_bolsa_protegida : ''}</t059>
          <t059 name="CC3909">${oferta_produto != null &amp;&amp; oferta_produto.cobertura_internacao_hospitalar != null ? oferta_produto.cobertura_internacao_hospitalar : ''}</t059>
          <t059 name="valor2">${oferta_produto != null &amp;&amp; oferta_produto.valor_cobertura_internacao_hospitalar != null ? oferta_produto.valor_cobertura_internacao_hospitalar : ''}</t059>
          <t059 name="CC3910">${oferta_produto != null &amp;&amp; oferta_produto.cobertura_morte_acidental != null ? oferta_produto.cobertura_morte_acidental : ''}</t059>
          <t059 name="valor3">${oferta_produto != null &amp;&amp; oferta_produto.valor_cobertura_morte_acidental != null ? oferta_produto.valor_cobertura_morte_acidental : ''}</t059>
          <t059 name="CC3911">${oferta_produto != null &amp;&amp; oferta_produto.cobertura_invalidez != null ? oferta_produto.cobertura_invalidez : ''}</t059>
          <t059 name="valor4">${oferta_produto != null &amp;&amp; oferta_produto.valor_cobertura_invalidez != null ? oferta_produto.valor_cobertura_invalidez : ''}</t059>
          <t059 name="CC3912">${oferta_produto != null &amp;&amp; oferta_produto.cobertura_compra_com_cartao != null ? oferta_produto.cobertura_compra_com_cartao : ''}</t059>
          <t059 name="valor5">${oferta_produto != null &amp;&amp; oferta_produto.valor_cobertura_compra_com_cartao != null ? oferta_produto.valor_cobertura_compra_com_cartao : ''}</t059>
          <t059 name="CC3913">${oferta_produto != null &amp;&amp; oferta_produto.cobertura_roubo_furto != null ? oferta_produto.cobertura_roubo_furto : ''}</t059>
          <t059 name="valor6">${oferta_produto != null &amp;&amp; oferta_produto.valor_cobertura_roubo_furto != null ? oferta_produto.valor_cobertura_roubo_furto : ''}</t059>
          <t059 name="CC3914">${oferta_produto != null &amp;&amp; oferta_produto.cobertura_saque_transacoes_compras != null ? oferta_produto.cobertura_saque_transacoes_compras : ''}</t059>
          <t059 name="valor7">${oferta_produto != null &amp;&amp; oferta_produto.valor_cobertura_saque_transacoes_compras != null ? oferta_produto.valor_cobertura_saque_transacoes_compras : ''}</t059>
          <t059 name="CC0686">${execution.hasVariable('oferta_produto') &amp;&amp; oferta_produto['data_debito_primeira_parcela'] != null ? oferta_produto['data_debito_primeira_parcela'] : ''}</t059>
          <t059 name="CC1221">${execution.hasVariable('oferta_produto') &amp;&amp; oferta_produto['premio_mensal'] != null ?
oferta_produto['premio_mensal'] : ''}</t059>
          <t059 name="CC2655">${oferta_produto['contratar_seguro_cartao_protegido'] ? "X" : ""}</t059>
          <t059 name="CC2654">${oferta_produto['contratar_seguro_cartao_protegido'] ? "" : "X"}</t059>
          <t059 name="adiDepS">${flagAd ? "S" : ""}</t059>
          <t059 name="adiDepN">${flagAd ? "" : "N"}</t059>
          <t059 name="CC1980">${oferta_produto['optante_aplicaut'] ? "X" : ""}</t059>
          <t059 name="CC1979">${oferta_produto['optante_aplicaut'] ? "" : "X"}</t059>
          <t059 name="CC1684">${execution.hasVariable('pais_residencia_fiscal') ? execution.getVariable('pais_residencia_fiscal') : ''}</t059>
          <t059 name="nif">${execution.hasVariable('numero_nif') ? numero_nif : ''}</t059>
          <t059 name="CC3084">PDF</t059>
          <t059 name="CC1641">D</t059>
          <t059 name="CC1987">55943-5</t059>
          <t059 name="CC3698">1228</t059>
          <t059 name="CC2693">true</t059>
          <t059 name="CC2825">1225</t059>
          <t059 name="CC1682">1</t059>
          <t059 name="CC2022">CONF</t059>
          <t059 name="CC2031">${""}</t059>
          <t059 name="CC4178">${conta_reservada["agencia"]}</t059>
          <t059 name="CC4330">${conta_reservada["conta"]}</t059>
          <t059 name="CC4422">${conta_reservada["dac"]}</t059>
          <t059 name="CC3836">${dados_cliente_atualizados["data"]["nome_completo"]["valor_dado_cadastral"] }</t059>
          <t059 name="CC4421">${cpfDac}</t059>
          <t059 name="cpfDac">${cpfDac}</t059>
          <t059 name="CC3717">${""}</t059>
          <t059 name="CC2023">${""}</t059>
          <t059 name="CC3845">${dados_cliente_atualizados["data"]["renda_faturamento"]["valor_dado_cadastral"]
}</t059>
          <t059 name="cnpj">${execution.hasVariable("vinculo_selecionado") ? vinculo_selecionado['cnpj_empresa_pagadora'] : ""}</t059>
          <t059 name="CC2685">${execution.hasVariable("nome_empresa") ? nome_empresa : ""}</t059>
          <t059 name="CC3887">${""}</t059>
          <t059 name="tipoDI">${CC2846}</t059>
          <t059 name="numeroDI">${numero_documento}</t059>
          <t059 name="CC1651">${CC1651}</t059>
          <t059 name="CC1652">${CC1652}</t059>
          <t059 name="CC1650">${CC1650}</t059>
          <t059 name="CC2834">${""}</t059>
          <t059 name="nomeMae">${nome_mae}</t059>
          <t059 name="CC4420">${dados_cliente_atualizados["data"]["enderecos"][0]["valor_dado_cadastral"]["cep"] }</t059>
          <t059 name="CC4424">${dados_cliente_atualizados["data"]["enderecos"][0]["valor_dado_cadastral"]["logradouro"]}</t059>
          <t059 name="CC4275">${dados_cliente_atualizados["data"]["enderecos"][0]["valor_dado_cadastral"]["numero"]}</t059>
          <t059 name="CC3800">${dados_cliente_atualizados["data"]["enderecos"][0]["valor_dado_cadastral"]["complemento"]
}</t059>
          <t059 name="CC4257">${dados_cliente_atualizados["data"]["enderecos"][0]["valor_dado_cadastral"]["bairro"]}</t059>
          <t059 name="CC2792">${dados_cliente_atualizados["data"]["enderecos"][0]["valor_dado_cadastral"]["cidade"]
}</t059>
          <t059 name="CC3959">${dados_cliente_atualizados["data"]["enderecos"][0]["valor_dado_cadastral"]["uf"]}</t059>
          <t059 name="CC4331">${dados_cliente_atualizados["data"]["emails"][0]["valor_dado_cadastral"]["email"]}</t059>
          <t059 name="CC3956">${ddd_telefone.concat(' ').concat(numero_telefone)}</t059>
          <t059 name="profissao">${tipo_profissao}</t059>
          <t059 name="cepLec">${dados_cliente_atualizados["data"]["enderecos"][0]["valor_dado_cadastral"]["cep"]}</t059>
          <t059 name="ruaLec">${dados_cliente_atualizados["data"]["enderecos"][0]["valor_dado_cadastral"]["logradouro"]}</t059>
          <t059 name="numLec">${dados_cliente_atualizados["data"]["enderecos"][0]["valor_dado_cadastral"]["numero"]}</t059>
          <t059 name="CC2795">${dados_cliente_atualizados["data"]["enderecos"][0]["valor_dado_cadastral"]["complemento"]
}</t059>
          <t059 name="bairroLec">${dados_cliente_atualizados["data"]["enderecos"][0]["valor_dado_cadastral"]["bairro"]}</t059>
          <t059 name="cidadeLec">${dados_cliente_atualizados["data"]["enderecos"][0]["valor_dado_cadastral"]["cidade"]}</t059>
          <t059 name="ufLec">${dados_cliente_atualizados["data"]["enderecos"][0]["valor_dado_cadastral"]["uf"]}</t059>
          <t059 name="CC3904">${CC0866}</t059>
          <t059 name="chqSegVal">${oferta_produto['taxa_juro_remuneratorio_lis']}</t059>
          <t059 name="CC3091">${oferta_produto['taxa_juro_moratorio_lis']}</t059>
          <t059 name="CC3905">${oferta_produto['valor_iof_lis']}</t059>
          <t059 name="CC2790">${oferta_produto['percent_iof_lis']}</t059>
          <t059 name="CC3795">${oferta_produto['valor_total_operacao_lim_contratado_iof_juros_lis']}</t059>
          <t059 name="cepPlusS">${oferta_produto['optante_produto'] ? "X" : ""}</t059>
          <t059 name="cepPlusN">${oferta_produto['optante_produto'] ? "" : "X"}</t059>
          <t059 name="CC3791">${execution.hasVariable("carCred1TMt") ? carCred1TMt : ""}</t059>
          <t059 name="CC2786">${execution.hasVariable("carCred1TMtMst") ? carCred1TMtMst : ""}</t059>
          <t059 name="CC2787">${execution.hasVariable("carCred1TMtVis") ? carCred1TMtVis : ""}</t059>
          <t059 name="CC3790">${execution.hasVariable("carCred1TCr") ? carCred1TCr : ""}</t059>
          <t059 name="CC2784">${execution.hasVariable("carCred1TCrMst") ? carCred1TCrMst : ""}</t059>
          <t059 name="CC2785">${execution.hasVariable("carCred1TCrVis") ? carCred1TCrVis : ""}</t059>
          <t059 name="CC2733">${dia_vencimento_cartao == "01" || dia_vencimento_cartao == "1" ? "X" : ""}</t059>
          <t059 name="CC2734">${dia_vencimento_cartao == "02" || dia_vencimento_cartao == "2" ? "X" : ""}</t059>
          <t059 name="CC2735">${dia_vencimento_cartao == "03" || dia_vencimento_cartao == "3" ? "X" : ""}</t059>
          <t059 name="CC2736">${dia_vencimento_cartao == "06" || dia_vencimento_cartao == "6" ? "X" : ""}</t059>
          <t059 name="CC2737">${dia_vencimento_cartao == "17" ? "x" : ""}</t059>
          <t059 name="CC2738">${dia_vencimento_cartao == "18" ? "x" : ""}</t059>
          <t059 name="CC2739">${dia_vencimento_cartao == "21" ? "x" : ""}</t059>
          <t059 name="CC2740">${dia_vencimento_cartao == "23" ? "x" : ""}</t059>
          <t059 name="CC2741">${dia_vencimento_cartao == "25" ? "X" : ""}</t059>
          <t059 name="CC2742">${dia_vencimento_cartao == "26" ? "X" : ""}</t059>
          <t059 name="CC2743">${dia_vencimento_cartao == "28" ? "X" : ""}</t059>
          <t059 name="CC2806">${CC2806}</t059>
          <t059 name="CC2674">${CC2674}</t059>
          <t059 name="CC2807">${CC2807}</t059>
          <t059 name="CC2675">${CC2675}</t059>
          <t059 name="CC2808">${CC2808}</t059>
          <t059 name="CC2676">${CC2676}</t059>
          <t059 name="CC2809">${CC2809}</t059>
          <t059 name="CC2677">${CC2677}</t059>
          <t059 name="CC2810">${CC2810}</t059>
          <t059 name="CC2678">${CC2678}</t059>
          <t059 name="CC2811">${CC2811}</t059>
          <t059 name="CC2679">${CC2679}</t059>
          <t059 name="CC2812">${CC2812}</t059>
          <t059 name="CC2680">${CC2680}</t059>
          <t059 name="CC2813">${CC2813}</t059>
          <t059 name="CC2681">${CC2681}</t059>
          <t059 name="CC2814">${CC2814}</t059>
          <t059 name="CC2682">${CC2682}</t059>
          <t059 name="CC2683">${CC2683}</t059>
          <t059 name="CC1996">${CC1996}</t059>
          <t059 name="CC3952">${stiContratarSeguroTransacao ? "X" : ""}</t059>
          <t059 name="CC3951">${stiContratarSeguroTransacao ? "" : "X"}</t059>
          <t059 name="CC3132">${oferta_produto['valor_total_anuidade_cartao']}</t059>
          <t059 name="CC2730">${oferta_produto['numero_de_parcela'] == "1" ? "X" : ""}</t059>
          <t059 name="CC2731">${oferta_produto['numero_de_parcela'] == "3" ? "X" : ""}</t059>
          <t059 name="CC2029">${oferta_produto['numero_de_parcela'] == "12" ? "X" : ""}</t059>
          <t059 name="fatDigS">${oferta_produto['codigo_fatura_digital_cartao'] == "S" ? "X" : ""}</t059>
          <t059 name="fatDigN">${oferta_produto['codigo_fatura_digital_cartao'] == "N" ? "X" : ""}</t059>
          <t059 name="CC2789">${oferta_produto['indicador_debito_automatico'] == "S" ? "X" : ""}</t059>
          <t059 name="CC2788">${oferta_produto['indicador_debito_automatico'] == "N" ? "X" : ""}</t059>
          <t059 name="CC3794">${execution.hasVariable("chkCartDebS") ? chkCartDebS : ""}</t059>
          <t059 name="CC3793">${execution.hasVariable("chkCartDebN") ? chkCartDebN : ""}</t059>
          <t059 name="CC0964">${execution.hasVariable("primeiroTitularDebito") ? primeiroTitularDebito : ""}</t059>
          <t059 name="CC2003">${(execution.hasVariable("encarteiramento_manual_gq") &amp;&amp; encarteiramento_manual_gq == "true") ? funcional : http_gq_consulta_encarteiramento_conta["funcional"]}</t059>
          <t059 name="CC3093">${(execution.hasVariable("encarteiramento_manual_gq") &amp;&amp; encarteiramento_manual_gq == "true") ? codigo_carteira : http_gq_consulta_encarteiramento_conta["cod_carteira"]}</t059>
          <t059 name="CC0350">${CC0745}</t059>
          <t059 name="CC0641">${CC0745}</t059>
          <t059 name="CC3116">${CC4260}</t059>
          <t059 name="CC3707">${declaracao_pac_time.substring(0, 10)}</t059>
          <t059 name="pepS">${(declaracao_pep == true || declaracao_pep == "true") ? "X" : ""}</t059>
          <t059 name="pepN">${(declaracao_pep == false || declaracao_pep == "false") ? "X" : ""}</t059>
          <t059 name="CC2699">${vinculoBeneficio ? execution.getVariable("numero_beneficio_inss") : ""}</t059>
          <t059 name="benInssS">${vinculoBeneficio ? "X" : ""}</t059>
          <t059 name="benInssN">${vinculoBeneficio ? "" : "X"}</t059>
          <t059 name="vinBenS">${vinculoBeneficio ? "X" : ""}</t059>
          <t059 name="vinBenN">${vinculoBeneficio ? "" : "X"}</t059>
          <t059 name="CC1382">${execution.hasVariable("escNaoAlfabetizado") ? escNaoAlfabetizado : ""}</t059>
          <t059 name="seNenhuma">${execution.hasVariable("seNenhuma") ? seNenhuma : ""}</t059>
          <t059 name="CC3848">${execution.hasVariable("seMenorEman") ? seMenorEman : ""}</t059>
          <t063 name="CC0808">
            <t061>
              <t050 key="codigo_formulario">${codigo_formulario}</t050>
              <t050 key="versao_formulario">${versao_formulario}</t050>
              <t050 key="arquivo_gerado">${arquivo_gerado}</t050>
              <t050 key="guarda_de_documento">${guarda_de_documento}</t050>
              <t050 key="codigo_guarda">${guarda_de_documento}</t050>
              <t050 key="identificador_di4">${identificador_di4}</t050>
            </t061>
          </t063>
        </t058>
      </t019>
      <t021>CC3158</t021>
      <t027>CC3597</t027>
    </t033>
    <t032 id="CC3597" sourceRef="CC3721" targetRef="CC2512" />
    <t031 id="CC0870" name="CC0256" scriptFormat="groovy">
      <t021>CC3201</t021>
      <t027>CC3158</t027>
      <t030>CC4009.CC3850("modPerson", "X")

def CC4421 = CC4009.CC3819("CC4421")
def daccpf = CC4421.substring(CC4421.length()-2,CC4421.length())
def cpfSDac = CC4421.substring(0,CC4421.length()-2)
CC4009.CC3850("cpfDac", daccpf)
CC4009.CC3850("cpfSDac", cpfSDac)

def dadosClientes = CC4009.CC3819("CC0685")

if (dadosClientes["data"]["data_nascimento_fundacao"]["valor_dado_cadastral"] != null) {
def vetorData = dadosClientes["data"]["data_nascimento_fundacao"]["valor_dado_cadastral"].split('-') CC4009.CC3850("CC1651", vetorData[2]) CC4009.CC3850("CC1652", vetorData[1]) CC4009.CC3850("CC1650", vetorData[0]) }

if (dadosClientes["data"]["sexo"] != null) {
def sexo = dadosClientes["data"]["sexo"]["valor_dado_cadastral"]
if (sexo == "M") {
CC4009.CC3850("sexoM", "X")
} else {
CC4009.CC3850("sexoF", "X")
}
}

if (dadosClientes["data"]["estado_civil"] != null) {
def estado_civil = dadosClientes["data"]["estado_civil"]["valor_dado_cadastral"].toString()

CC4009.CC3850("ecCasado", "")
CC4009.CC3850("ecDivorciado", "")
CC4009.CC3850("ecSeparado", "")
CC4009.CC3850("ecSolteiro", "")
CC4009.CC3850("ecUniaoEst", "")
CC4009.CC3850("ecViuvo", "")

switch(estado_civil) {
case "608":
CC4009.CC3850("ecCasado", "X")
break
case "611":
CC4009.CC3850("ecDivorciado", "X")
break
case "616":
CC4009.CC3850("ecSeparado", "X")
break
case "617":
CC4009.CC3850("ecSolteiro", "X")
break
case "612":
CC4009.CC3850("ecUniaoEst", "X")
break
case "618":
CC4009.CC3850("ecViuvo", "X")
break
CC4189:
CC4009.CC3850("ecSolteiro", "X")
break
}
}

if (dadosClientes["data"]["documentos"] != null) {
def tipoDocumento = [:]
tipoDocumento.put("551", "RG")
tipoDocumento.put("552", "RNE")
tipoDocumento.put("558", "CNH")
def tipo = tipoDocumento.get(dadosClientes["data"]["documentos"][0]["valor_dado_cadastral"]["tipo"].toString()) CC4009.CC3850("CC2846", tipo) def numero_documento = dadosClientes["data"]["documentos"][0]["valor_dado_cadastral"]["CC4275"] CC4009.CC3850("numero_documento", numero_documento) } else { CC4009.CC3850("CC2846", "") CC4009.CC3850("numero_documento", "") }

if (dadosClientes["data"]["parentescos"] != null ) {
def nomeMae = dadosClientes["data"]["parentescos"][0]["valor_dado_cadastral"]["nome"]
CC4009.CC3850("nome_mae", nomeMae)
} else {
CC4009.CC3850("nome_mae", "")
}

if (dadosClientes["data"]["grau_escolaridade"] != null) {
def grau_escolaridade = dadosClientes["data"]["grau_escolaridade"]["valor_dado_cadastral"] CC4009.CC3850("grau_escolaridade", grau_escolaridade) } else { CC4009.CC3850("grau_escolaridade", "") }

def CC0944 = CC4009.CC3819("CC1055") + "/" + CC4009.CC3819("CC1054") CC4009.CC3850("CC0944", CC0944)

def CC2830 = CC4009.CC3819("CC2830")

// Listagem de Debitos
import groovy.json.JsonSlurper
import org.camunda.spin.Spin

def responseConsultaDebito = CC4009.CC3819("CC0398")

(1..10).each { i -&gt;
CC4009.CC3850("debitoproduto${i}", "")
CC4009.CC3850("debitocontrato${i}", "")

if (responseConsultaDebito != null) {

def responseString = Spin.JSON(responseConsultaDebito).toString()
def slurper = new JsonSlurper()
def json = slurper.parseText(responseString)


def CC4002 = json?.CC4002 ?: []
CC4002.eachWithIndex { CC4097, index -&gt;
def CC4207 = CC4097?.nomeProduto ?: ""
def numeroContrato = CC4097?.CC4275 ?: ""

CC4009.CC3850("debitoproduto${index + 1}", CC4207.toString())
CC4009.CC3850("debitocontrato${index + 1}", numeroContrato.toString())
}
}

// Seguro Transacao
CC4009.CC3850("stiContratarSeguroTransacao", false)

def oferta_seguro_transacao = CC4009.CC3819("CC0750")

if(oferta_seguro_transacao != null &amp;&amp; oferta_seguro_transacao != "" &amp;&amp; oferta_seguro_transacao != "Sem CC4285"){ CC4009.CC3850("stiContratarSeguroTransacao", oferta_seguro_transacao['CC0633']) }

//CARTAO
def regra_cartao_person_aplicada = CC4009.hasVariable("regra_aplicada_person") &amp;&amp; CC4009.CC3819("regra_aplicada_person") def CC1369 = CC2830['CC1369'] def bandeiraCartao = [:] bandeiraCartao.put("04", "VISA") bandeiraCartao.put("01", "MASTER") CC4009.CC3850("CC2651", bandeiraCartao.get(CC2830['CC2651'])) def tipoCartao = [:] tipoCartao.put("M", "multiplo") tipoCartao.put("D", "debito") CC4009.CC3850("CC3853", tipoCartao.get(CC2830['CC1369']))

switch (CC1369) {
case "M":
CC4009.CC3850("CC3793", "X")
CC4009.CC3850("CC3791", "X")
CC4009.CC3850("CC2786", CC2830['CC2651'] == "01" ? "X" : "") CC4009.CC3850("CC2787", CC2830['CC2651'] == "04" ? "X" : "") break case "C": CC4009.CC3850("CC3793", "X") CC4009.CC3850("CC3790", "X") CC4009.CC3850("CC2784", CC2830['CC2651'] == "01" ? "X" : "") CC4009.CC3850("CC2785", CC2830['CC2651'] == "04" ? "X" : "") break case "D": CC4009.CC3850("CC3794", "X") CC4009.CC3850("CC0964", "X") CC4189: break }

if (CC2830['CC1205'] == "S") {
CC4009.CC3850("carCredLimS", "X")
CC4009.CC3850("carCredLimN", "")
} else {
CC4009.CC3850("carCredLimS", "")
CC4009.CC3850("carCredLimN", "X")
}

if (CC2830['CC1013'] == "PM") {
CC4009.CC3850("pacPlus", "")
CC4009.CC3850("pacMaxi", "X")
} else {
CC4009.CC3850("pacMaxi", "")
CC4009.CC3850("pacPlus", "X")
}

if (dadosClientes["data"]['profissao'] == null) {
CC4009.CC3850("tipo_profissao", "")
} else {
def tipoProfissao = [:]

tipoProfissao.put("959", "ACOUGUEIRO")
tipoProfissao.put("960", "ADMINISTRADOR")
tipoProfissao.put("961", "ADVOGADO")
tipoProfissao.put("962", "AEROVIARIOS")
tipoProfissao.put("963", "AFIADOR")
tipoProfissao.put("964", "AGENCIADOR DE PROPAGANDA")
tipoProfissao.put("965", "AGENCIADOR SERVICOS (TRANSP.)")
tipoProfissao.put("966", "AGENTE ADMISTRATIVO")
tipoProfissao.put("967", "AGENTE VIAGEM/GUIA/AFINS")
tipoProfissao.put("968", "AGRONOMO")
tipoProfissao.put("969", "AJUDANTE GERAL/SERVENTE")
tipoProfissao.put("970", "AJUDANTE PRODUCAO/MEIO OFICIAL")
tipoProfissao.put("971", "AJUSTADOR/RETIFICADOR")
tipoProfissao.put("972", "ALFAIATE")
tipoProfissao.put("973", "ALMOXARIFE")
tipoProfissao.put("974", "ANALISTA CRED/COBRANCA/CAD/GAR")
tipoProfissao.put("975", "ANALISTA CUSTOS/PROJ/SERV/ECON")
tipoProfissao.put("976", "ANALISTA DE CARGOS/RH")
tipoProfissao.put("12401", "ANALISTA DE NEGOCIOS")
tipoProfissao.put("977", "ANALISTA PRODUCAO/CRONOANALIS")
tipoProfissao.put("978", "ANALISTA SISTEMAS")
tipoProfissao.put("979", "ANALISTA/METODO/HARD/SOFT")
tipoProfissao.put("980", "APOSENTADO")
tipoProfissao.put("981", "ARMARDOR DE FERRAGENS")
tipoProfissao.put("982", "ARQUITETO")
tipoProfissao.put("983", "ARRENDATARIO/MEEIRO/PARCELEIRO")
tipoProfissao.put("984", "ARTISTA PLASTIC/PINTOR/ESCULT")
tipoProfissao.put("985", "ASSESSOR/SUPERINTENDENTE/CHEFE")
tipoProfissao.put("986", "ASSISTENTE/AGENTES SOCIAIS")
tipoProfissao.put("12405", "ASTROLOGOS E AFINS")
tipoProfissao.put("987", "ATEN ENFERM/CUIDADOR/AG SAUDE")
tipoProfissao.put("988", "ATLETA PROF/TECNICO/ARBITROS")
tipoProfissao.put("989", "ATOR/DIR ESPETACULOS PUBLICOS")
tipoProfissao.put("990", "ATUARIO/MATEMATICO")
tipoProfissao.put("5369", "AUTONOMO")
tipoProfissao.put("991", "AUX ESCR/FATUR/BILH/CONF/EXPED")
tipoProfissao.put("992", "AUX ESCRITORIO")
tipoProfissao.put("993", "AUX. COZINHA/COSTURA/LIMPEZA")
tipoProfissao.put("994", "AUXILIAR LABORATORIO")
tipoProfissao.put("995", "BAILARINO/COREOGRAFO")
tipoProfissao.put("996", "BANCARIO/ECONOMIARIO")
tipoProfissao.put("997", "BENEFICIARIO")
tipoProfissao.put("998", "BIBLIOT/ARQUIV/MUSEOL/ARQUEOL")
tipoProfissao.put("999", "BIOLOGO/BIOMEDICO")
tipoProfissao.put("1001", "BOMBEIRO INSTAL GAS/AGUA/ESG")
tipoProfissao.put("1002", "BORRACHEIRO, DEDETIZADOR")
tipoProfissao.put("1003", "CALCETEIRO/CANTEIRO/MARM/VIDRA")
tipoProfissao.put("1004", "CALHISTA/TELHADISTA/ANTENISTA")
tipoProfissao.put("1005", "CANTOR/COMPOSITOR")
tipoProfissao.put("1006", "CAPITALISTA")
tipoProfissao.put("1007", "CARPINTEIRO/MARCENEIRO")
tipoProfissao.put("12402", "CARTAZEIRO")
tipoProfissao.put("1008", "CARTORARIO")
tipoProfissao.put("1009", "CASEIRO/JARDINEIRO")
tipoProfissao.put("1010", "CAVALARICOS/FERRADOR/TRATADOR")
tipoProfissao.put("1011", "CHEFE COZINHA/MAITRE/BARMAN")
tipoProfissao.put("1012", "CHEFE INTERMEDIARIO")
tipoProfissao.put("1013", "COBRADOR/BILHET TRANSP COLET")
tipoProfissao.put("9715", "COMANDANTE DE EMBARCACOES")
tipoProfissao.put("1015", "COMENT/RADIAL/LOCUT RADIO/TV")
tipoProfissao.put("1014", "COMERC EXTERIOR/OUTROS COMERC")
tipoProfissao.put("1016", "COMERCIARIOS")
tipoProfissao.put("1017", "COMISSARIO DE BORDO")
tipoProfissao.put("1018", "COMUNICOLOGO/APRESENTADORES")
tipoProfissao.put("1020", "CONTADOR/PERITOS CONTABEIS")
tipoProfissao.put("1019", "CONTINUO/ENTREGADOR/MOTOQUEIRO")
tipoProfissao.put("1021", "CONTRAMESTRE DE EMBARCACOES")
tipoProfissao.put("1022", "CORRETOR IMOV/SEG/TITULO VLR")
tipoProfissao.put("1023", "CORTADOR")
tipoProfissao.put("1024", "COSTUREIRA/BORDAD/OVERL/CASEA")
tipoProfissao.put("1025", "DECORADOR")
tipoProfissao.put("1026", "DELEGADO DE POLICIA")
tipoProfissao.put("1027", "DEMONSTRADOR")
tipoProfissao.put("1028", "DENTISTA")
tipoProfissao.put("1029", "DEPUT EST/FED SENAD/VEREADOR")
tipoProfissao.put("1030", "DESEMB/JUIZ/POD JUDIC/TRIB SUP")
tipoProfissao.put("1031", "DESENHISTA COMERCIAL")
tipoProfissao.put("1032", "DESENHISTA INDUSTRIAL")
tipoProfissao.put("1033", "DESENHISTA TECNICO/PROJETISTA")
tipoProfissao.put("1034", "DESPACHANTE")
tipoProfissao.put("12406", "DETETIVES E SERV INTELIGENCIA")
tipoProfissao.put("1035", "DIGITADOR")
tipoProfissao.put("1036", "DIPLOMATA")
tipoProfissao.put("1037", "DIRETOR DE EMPRESAS")
tipoProfissao.put("1038", "DIRETOR ESTABELECIM ENSINO")
tipoProfissao.put("1039", "DIRETOR/ASSESSOR INDUSTRIAL")
tipoProfissao.put("1040", "DIRETOR/ASSESSOR SUPERIOR")
tipoProfissao.put("12404", "DIRIG PEQUENAS COMUNIDADES")
tipoProfissao.put("1238", "DOMINIO INVALIDO")
tipoProfissao.put("1041", "DONA DE CASA")
tipoProfissao.put("1042", "ECONOMISTA")
tipoProfissao.put("1043", "ELETR VEIC/MAQ/ELETRON/TELECOM")
tipoProfissao.put("1044", "ELETRICISTA DE INSTALACOES")
tipoProfissao.put("1045", "ELETRICISTA DE PRODUCAO INDUST...")
tipoProfissao.put("1046", "ELETRICISTA INDUSTRIAL")
tipoProfissao.put("1047", "EMPREG RESTAUR, BUFE, LANCH")
tipoProfissao.put("1049", "EMPREGADO DOMESTICO")
tipoProfissao.put("1048", "EMPREGADOS DOMESTICOS EM GERAL")
tipoProfissao.put("1050", "EMPRESARIO/PRODUTOR ESPETAC")
tipoProfissao.put("1051", "ENFERMEIRO/NUTRICIONISTA")
tipoProfissao.put("1052", "ENGENHEIRO")
tipoProfissao.put("1053", "ESPOLIO")
tipoProfissao.put("1054", "ESTATISTICO")
tipoProfissao.put("1055", "ESTIVADOR/CARREGADOR/EMBALAD")
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
tipoProfissao.put("1064", "FRESADOR")
tipoProfissao.put("1065", "FUNCIONARIO EMPRESA PUBLICA")
tipoProfissao.put("1066", "FUNCIONARIO PUB CIVIL APOSENT")
tipoProfissao.put("1067", "FUNDIDOR")
tipoProfissao.put("1068", "GARIMPEIRO")
tipoProfissao.put("1069", "GEOGRAFO")
tipoProfissao.put("1070", "GEOLOGO")
tipoProfissao.put("1071", "GERENTE")
tipoProfissao.put("1073", "GUARDADOR DE CARRO/ENGRAXATE")
tipoProfissao.put("1074", "IMPRESSOR/LINOTIPIST/BLOQ/OPER")
tipoProfissao.put("1075", "INSPETOR CONTROLE QUALIDADE")
tipoProfissao.put("1076", "INSTRUMENTISTA")
tipoProfissao.put("1077", "JOALHEIRO/OURIVES")
tipoProfissao.put("1078", "JORNALEIRO")
tipoProfissao.put("1079", "JORNALISTA E AFINS")
tipoProfissao.put("1080", "LANTERN/PINTOR VEICULO METALIC")
tipoProfissao.put("1081", "LEILOEIRO/AVALIADOR")
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
tipoProfissao.put("12403", "MERGULHADOR PROFISSIONAL")
tipoProfissao.put("1092", "MESTRE/ENCARREG PROD INDUSTR")
tipoProfissao.put("1093", "METALURGICO/SIDERURGICO")
tipoProfissao.put("1094", "METEOROLOGISTA")
tipoProfissao.put("1095", "MILITAR")
tipoProfissao.put("1096", "MILITAR REFORMADO")
tipoProfissao.put("1097", "MINISTRO/GOV/PREFEITO/SECR")
tipoProfissao.put("1098", "MODELO DE MODAS")
tipoProfissao.put("1099", "MOTORISTA AUTONOMO/TAXISTA")
tipoProfissao.put("1100", "MOTORISTA VEIC TRANSP CARGA")
tipoProfissao.put("1101", "MOTORISTA VEIC TRANSP PASSAG")
tipoProfissao.put("1102", "MUSICO")
tipoProfissao.put("1103", "OFICIAL DA POLICIA MILITAR")
tipoProfissao.put("1104", "OFICIAL FORCAS ARMADAS/AUXIL")
tipoProfissao.put("1106", "OPER CAMERA/AUDIO/DJ/SONOPL")
tipoProfissao.put("1107", "OPER COMPUTADOR/SUP TECNICO")
tipoProfissao.put("1105", "OPER GUIND/EMPILH/TRATOR/CALD")
tipoProfissao.put("1108", "OPERADOR DE CALDEIRAS")
tipoProfissao.put("1109", "OPERADOR EM GERAL/SOLDADOR")
tipoProfissao.put("1110", "OPERADOR MAQUINAS PRODUCAO")
tipoProfissao.put("1113", "OUTROS DESENHISTAS")
tipoProfissao.put("1114", "OUTROS TECNICOS")
tipoProfissao.put("1115", "OUTROS TRAB ENSINO NIVEL SUP")
tipoProfissao.put("1116", "OUTROS TRABALHADORES INDUST")
tipoProfissao.put("1117", "OUTROS TRABALHADORES RURAIS")
tipoProfissao.put("5370", "PADRE/PASTOR/RABINO")
tipoProfissao.put("1118", "PEDREIRO/ENCAN/AZULEJ/IMPERM")
tipoProfissao.put("1119", "PENSIONISTA")
tipoProfissao.put("1120", "PESCADOR")
tipoProfissao.put("12410", "PESQ DE MERCADO/ RECENSEADORES")
tipoProfissao.put("1121", "PILOTO DE AERONAVES")
tipoProfissao.put("1122", "PINTOR DE PAREDES/GESSISTA")
tipoProfissao.put("1123", "PORT EDIF/ASCENSS/GARAG/FAXIN")
tipoProfissao.put("1124", "PRENSISTA/ESTAMPADOR")
tipoProfissao.put("1125", "PREPARADOR DE MAQUINAS")
tipoProfissao.put("1126", "PROCURADOR E ASSEMELHADOS")
tipoProfissao.put("1127", "PROF ENSINO FUNDAMENTAL/MEDIO")
tipoProfissao.put("1129", "PROF HOTEL/PORT/COZIN/GARCOM")
tipoProfissao.put("1130", "PROF MANUT/OPER EQUIP INDUST")
tipoProfissao.put("1128", "PROFESSOR/PESQ ENSINO SUP")
tipoProfissao.put("1131", "PROFISS SERVICOS FUNERARIOS")
tipoProfissao.put("1132", "PROFISSIONAL ESTETICA")
tipoProfissao.put("1133", "PROFISSIONAL LETRAS E ARTES")
tipoProfissao.put("1134", "PROGRAMADOR DE COMPUTADOR")
tipoProfissao.put("1135", "PROGRAMADOR DE PRODUCAO")
tipoProfissao.put("1136", "PROMOTOR VENDA")
tipoProfissao.put("1137", "PROPR ESTAB AGRI/PECU/FLOREST")
tipoProfissao.put("1138", "PROPR ESTAB COMERCIAL")
tipoProfissao.put("1139", "PROPR ESTAB INDUSTRIAL")
tipoProfissao.put("1140", "PROPR ESTAB PRESTACAO SERVIC")
tipoProfissao.put("1141", "PROPRIETARIO IMOVEIS")
tipoProfissao.put("1142", "PROPRIETARIO MICROEMPRESA")
tipoProfissao.put("1143", "PROTETICO")
tipoProfissao.put("1144", "PSICOLOGO")
tipoProfissao.put("1145", "PUBLICITARIO")
tipoProfissao.put("1146", "QUIMICO")
tipoProfissao.put("1147", "RELACOES PUBLICAS")
tipoProfissao.put("1148", "REPR COMERC/CAIX VIAJ/VENDED")
tipoProfissao.put("1149", "SACERDOTE")
tipoProfissao.put("1150", "SECRET/DATILOG/RECEP/TELFONIS")
tipoProfissao.put("1151", "SECURITARIO")
tipoProfissao.put("1237", "SEM VALOR")
tipoProfissao.put("1152", "SERRALHEIRO")
tipoProfissao.put("1153", "SERV PUBLICO ESTADUAL")
tipoProfissao.put("1154", "SERV PUBLICO FEDERERAL")
tipoProfissao.put("1155", "SERV PUBLICO MUNICIPAL")
tipoProfissao.put("1156", "SERVENTUARIO DA JUSTICA")
tipoProfissao.put("1157", "SOCIOLOGO")
tipoProfissao.put("1158", "SUPERV/INSP/AGENT COMP/VEND")
tipoProfissao.put("1159", "TABELIAO")
tipoProfissao.put("1160", "TECN ELETRIC/ELETRON/TELECOM")
tipoProfissao.put("1161", "TECNICO AGRIMENSURA/ AGRONOMIA")
tipoProfissao.put("1162", "TECNICO BIOLOGIA")
tipoProfissao.put("1163", "TECNICO CONTABIL/ESTATISTICA")
tipoProfissao.put("1164", "TECNICO LABOR/ENFERM/ODONTO")
tipoProfissao.put("1165", "TECNICO MECANICA")
tipoProfissao.put("1166", "TECNICO QUIMICA")
tipoProfissao.put("1167", "TECNOLOGO")
tipoProfissao.put("1168", "TORNEIRO")
tipoProfissao.put("1169", "TRAB ARTES GRAFICAS")
tipoProfissao.put("1170", "TRAB CONTABIL/CAIXA")
tipoProfissao.put("1173", "TRAB FABRIC CALCADOS/COURO")
tipoProfissao.put("1171", "TRAB FABRICACAO ALIM/BEBIDAS")
tipoProfissao.put("1172", "TRAB FABRICACAO BORRACHA")
tipoProfissao.put("1174", "TRAB FABRICACAO PAPEL")
tipoProfissao.put("1175", "TRAB FABRICACAO ROUPAS")
tipoProfissao.put("1176", "TRAB FABRICACAO TEXTEIS")
tipoProfissao.put("1184", "TRAB FLOREST/EXTRAT/MEIO AMB")
tipoProfissao.put("12408", "TRAB LOGISTICA E TRANSPORTE")
tipoProfissao.put("1177", "TRAB PROCESSMTO QUIMICOS")
tipoProfissao.put("12409", "TRAB PRODUCAO DE VIDRO E AFINS")
tipoProfissao.put("1178", "TRAB USINAGEM DE METAIS")
tipoProfissao.put("1179", "TRABALHADOR AGRICOLA/PECUARIA")
tipoProfissao.put("1180", "TRABALHADOR CONSTRUCAO CIVIL")
tipoProfissao.put("1181", "TRABALHADOR DA PECUARIA")
tipoProfissao.put("1182", "TRABALHADOR DE CASA NOTURNA")
tipoProfissao.put("1183", "TRABALHADOR DE GRANJA")
tipoProfissao.put("1185", "TRABALHADOR FUMO/CIG/CHARU")
tipoProfissao.put("1186", "VENDED VAREJISTA/ATACADISTA")
tipoProfissao.put("1187", "VENDEDORES AUT/AMBUL/CAMELO")
tipoProfissao.put("1188", "VETERINARIO/ZOOTECNISTA")
tipoProfissao.put("1189", "VIGIA/SEGURANCA/BOMBEIRO")
tipoProfissao.put("1190", "ZELADOR")

def tipo_profissao = tipoProfissao.get(CC0685["data"]["profissao"]["valor_dado_cadastral"].toString()); CC4009.CC3850("tipo_profissao", tipo_profissao ? tipo_profissao : "") } //Beneficio CC4357 if(CC4009.hasVariable( 'CC0290') &amp;&amp; CC0290) { CC4009.CC3850('vinculoBeneficio', true) } else { CC4009.CC3850('vinculoBeneficio', false) }

//Situacoes especiais
if(CC4009.hasVariable('CC1689') &amp;&amp; CC4009.CC3819('CC1689') != null &amp;&amp; CC4009.CC3819('CC1689') != '') { def situacoesEspeciaisPAC = CC4009.CC3819("CC1689") switch (situacoesEspeciaisPAC) case 'nao alfabetizado': CC4009.CC3850('CC1382', 'X') break case 'menor emancipado': CC4009.CC3850('CC3848', 'X') break CC4189: CC4009.CC3850('seNenhuma', 'X') CC4009.CC3850('CC1382', '') CC4009.CC3850('CC3848', '') } } else { CC4009.CC3850('seNenhuma', 'X') CC4009.CC3850('CC1382', '') CC4009.CC3850('CC3848', '') }

// Ad Novo
def CC4024 = CC4009.CC3819("CC4024")

def flagAdAntigo = CC2830['CC0206']
def flagAdNovo = ""

if(CC4024 != null &amp;&amp; CC4024 != "" &amp;&amp; !CC4024.toString().equalsIgnoreCase("CC4425 antigo")){
flagAdNovo = CC4024['CC0206']
}

CC4009.CC3850("flagAd", false)

if(flagAdNovo == true || flagAdAntigo.toString().equalsIgnoreCase("true")){
CC4009.CC3850("flagAd", true)
}


</t030>
    </t031>
    <t032 id="CC3158" sourceRef="CC0870" targetRef="CC3721" />
    <t031 id="CC0694" name="CC0666" scriptFormat="groovy">
      <t021>CC3258</t021>
      <t027>CC3501</t027>
      <t030>def CC4129 = CC4009.CC3819('CC4129')
switch (CC4129) {
case '3':
CC4009.CC3850("codigo_formulario", "24259-4")
CC4009.CC3850("CC3698", "1222")
break;
case 'L':
CC4009.CC3850("codigo_formulario", "24262-8")
CC4009.CC3850("CC3698", "1225")
break;
CC4189:
break;
}

// Listagem de Debitos
import groovy.json.JsonSlurper
import org.camunda.spin.Spin
def responseConsultaDebito = CC4009.CC3819("CC0398")


(1..10).each { i -&gt;
CC4009.CC3850("debitoproduto${i}", "")
CC4009.CC3850("debitocontrato${i}", "")
}

if (responseConsultaDebito != null)

def responseString = Spin.JSON(responseConsultaDebito).toString()
def slurper = new JsonSlurper()
def json = slurper.parseText(responseString)


def CC4002 = json?.CC4002 ?: []
CC4002.eachWithIndex { CC4097, index -&gt;
def CC4207 = CC4097?.nomeProduto ?: ""
def numeroContrato = CC4097?.CC4275 ?: ""

CC4009.CC3850("debitoproduto${index + 1}", CC4207.toString())
CC4009.CC3850("debitocontrato${index + 1}", numeroContrato.toString())
}
}

// Seguro Transacao
CC4009.CC3850("stiContratarSeguroTransacao", false)

def oferta_seguro_transacao = CC4009.CC3819("CC0750")

if(oferta_seguro_transacao != null &amp;&amp; oferta_seguro_transacao != "" &amp;&amp; oferta_seguro_transacao != "Sem CC4285"){ CC4009.CC3850("stiContratarSeguroTransacao", oferta_seguro_transacao['CC0633']) }

def CC4421 = CC4009.CC3819("CC4421")
def daccpf = CC4421.substring(CC4421.length()-2,CC4421.length())
def cpfSDac = CC4421.substring(0,CC4421.length()-2)

CC4009.CC3850("cpfDac", daccpf)
CC4009.CC3850("cpfSDac", cpfSDac)

//€stado Civil
def dadosClientes = CC4009.CC3819("CC0685")

//Nao @ obrigatorio
if(dadosClientes["data"]["estado_civil"] != null) {
def estado_civil = [:]

estado_civil.put("608", "Casado")
estado_civil.put("611", "Divorciado")
estado_civil.put("616", "Separado")
estado_civil.put("617", "Solteiro")
estado_civil.put("612", "Uniao Estavel")
estado_civil.put("618", "Viuvo")

def CC3815 = estado_civil.get(dadosClientes["data"]["estado_civil"]["valor_dado_cadastral"].toString())

CC4009.CC3850("estado_civil", CC3815)
} else {
CC4009.CC3850("estado_civil", "")
}

//Não é obrigatorio
if(dadosClientes["data"]["documentos"] != null){
def tipoDocumento = [:]

tipoDocumento.put("551", "RG")
tipoDocumento.put("552", "RNE")
tipoDocumento.put("558", "CNH")

def tipo = tipoDocumento.get(dadosClientes["data"]["documentos"][0]["valor_dado_cadastral"]["tipo"].toString()) CC4009.CC3850("CC2846", tipo)

def numero_documento = dadosClientes["data"]["documentos"][0]["valor_dado_cadastral"]["CC4275"] CC4009.CC3850("numero_documento", numero_documento) } else { CC4009.CC3850("CC2846", "") CC4009.CC3850("numero_documento", "") }

if(dadosClientes["data"]["parentescos"] != null ){
def nomeMae = dadosClientes["data"]["parentescos"][0]["valor_dado_cadastral"]["nome"]
CC4009.CC3850("nome_mae", nomeMae)
} else {
CC4009.CC3850("nome_mae", "")
}

//Campos retirados do bpmn(grau_escolaridade, sexo)
if(dadosClientes["data"]["grau_escolaridade"] != null){
def grau_escolaridade = dadosClientes["data"]["grau_escolaridade"]["valor_dado_cadastral"] CC4009.CC3850("grau_escolaridade", grau_escolaridade) } else { CC4009.CC3850("grau_escolaridade", "") }

if(dadosClientes["data"]["sexo"] != null){
def sexo = dadosClientes["data"]["sexo"]["valor_dado_cadastral"]
CC4009.CC3850("sexo", sexo)
} else {
CC4009.CC3850("sexo", "")
}

if(dadosClientes["data"]['profissao'] == null){
CC4009.CC3850("tipo_profissao", "")
} else {
def tipoProfissao = [:]

tipoProfissao.put("959", "ACOUGUEIRO")
tipoProfissao.put("960", "ADMINISTRADOR")
tipoProfissao.put("961", "ADVOGADO")
tipoProfissao.put("962", "AEROVIARIOS")
tipoProfissao.put("963", "AFIADOR")
tipoProfissao.put("964", "AGENCIADOR DE PROPAGANDA")
tipoProfissao.put("965", "AGENCIADOR SERVICOS (TRANSP.)")
tipoProfissao.put("966", "AGENTE ADMISTRATIVO")
tipoProfissao.put("967", "AGENTE VIAGEM/GUIA/AFINS")
tipoProfissao.put("968", "AGRONOMO")
tipoProfissao.put("969", "AJUDANTE GERAL/SERVENTE")
tipoProfissao.put("970", "AJUDANTE PRODUCAO/MEIO OFICIAL")
tipoProfissao.put("971", "AJUSTADOR/RETIFICADOR")
tipoProfissao.put("972", "ALFAIATE")
tipoProfissao.put("973", "ALMOXARIFE")
tipoProfissao.put("974", "ANALISTA CRED/COBRANCA/CAD/GAR")
tipoProfissao.put("975", "ANALISTA CUSTOS/PROJ/SERV/ECON")
tipoProfissao.put("976", "ANALISTA DE CARGOS/RH")
tipoProfissao.put("12401", "ANALISTA DE NEGOCIOS")
tipoProfissao.put("977", "ANALISTA PRODUCAO/CRONOANALIS")
tipoProfissao.put("978", "ANALISTA SISTEMAS")
tipoProfissao.put("979", "ANALISTA/METODO/HARD/SOFT")
tipoProfissao.put("980", "APOSENTADO")
tipoProfissao.put("981", "ARMARDOR DE FERRAGENS")
tipoProfissao.put("982", "ARQUITETO")
tipoProfissao.put("983", "ARRENDATARIO/MEEIRO/PARCELEIRO")
tipoProfissao.put("984", "ARTISTA PLASTIC/PINTOR/ESCULT")
tipoProfissao.put("985", "ASSESSOR/SUPERINTENDENTE/CHEFE")
tipoProfissao.put("986", "ASSISTENTE/AGENTES SOCIAIS")
tipoProfissao.put("12405", "ASTROLOGOS E AFINS")
tipoProfissao.put("987", "ATEN ENFERM/CUIDADOR/AG SAUDE")
tipoProfissao.put("988", "ATLETA PROF/TECNICO/ARBITROS")
tipoProfissao.put("989", "ATOR/DIR ESPETACULOS PUBLICOS")
tipoProfissao.put("990", "ATUARIO/MATEMATICO")
tipoProfissao.put("5369", "AUTONOMO")
tipoProfissao.put("991", "AUX ESCR/FATUR/BILH/CONF/EXPED")
tipoProfissao.put("992", "AUX ESCRITORIO")
tipoProfissao.put("993", "AUX. COZINHA/COSTURA/LIMPEZA")
tipoProfissao.put("994", "AUXILIAR LABORATORIO")
tipoProfissao.put("995", "BAILARINO/COREOGRAFO")
tipoProfissao.put("996", "BANCARIO/ECONOMIARIO")
tipoProfissao.put("997", "BENEFICIARIO")
tipoProfissao.put("998", "BIBLIOT/ARQUIV/MUSEOL/ARQUEOL")
tipoProfissao.put("999", "BIOLOGO/BIOMEDICO")
tipoProfissao.put("1001", "BOMBEIRO INSTAL GAS/AGUA/ESG")
tipoProfissao.put("1002", "BORRACHEIRO, DEDETIZADOR")
tipoProfissao.put("1003", "CALCETEIRO/CANTEIRO/MARM/VIDRA")
tipoProfissao.put("1004", "CALHISTA/TELHADISTA/ANTENISTA")
tipoProfissao.put("1005", "CANTOR/COMPOSITOR")
tipoProfissao.put("1006", "CAPITALISTA")
tipoProfissao.put("1007", "CARPINTEIRO/MARCENEIRO")
tipoProfissao.put("12402", "CARTAZEIRO")
tipoProfissao.put("1008", "CARTORARIO")
tipoProfissao.put("1009", "CASEIRO/JARDINEIRO")
tipoProfissao.put("1010", "CAVALARICOS/FERRADOR/TRATADOR")
tipoProfissao.put("1011", "CHEFE COZINHA/MAITRE/BARMAN")
tipoProfissao.put("1012", "CHEFE INTERMEDIARIO")
tipoProfissao.put("1013", "COBRADOR/BILHET TRANSP COLET")
tipoProfissao.put("9715", "COMANDANTE DE EMBARCACOES")
tipoProfissao.put("1015", "COMENT/RADIAL/LOCUT RADIO/TV")
tipoProfissao.put("1014", "COMERC EXTERIOR/OUTROS COMERC")
tipoProfissao.put("1016", "COMERCIARIOS")
tipoProfissao.put("1017", "COMISSARIO DE BORDO")
tipoProfissao.put("1018", "COMUNICOLOGO/APRESENTADORES")
tipoProfissao.put("1020", "CONTADOR/PERITOS CONTABEIS")
tipoProfissao.put("1019", "CONTINUO/ENTREGADOR/MOTOQUEIRO")
tipoProfissao.put("1021", "CONTRAMESTRE DE EMBARCACOES")
tipoProfissao.put("1022", "CORRETOR IMOV/SEG/TITULO VLR")
tipoProfissao.put("1023", "CORTADOR")
tipoProfissao.put("1024", "COSTUREIRA/BORDAD/OVERL/CASEA")
tipoProfissao.put("1025", "DECORADOR")
tipoProfissao.put("1026", "DELEGADO DE POLICIA")
tipoProfissao.put("1027", "DEMONSTRADOR")
tipoProfissao.put("1028", "DENTISTA")
tipoProfissao.put("1029", "DEPUT EST/FED SENAD/VEREADOR")
tipoProfissao.put("1030", "DESEMB/JUIZ/POD JUDIC/TRIB SUP")
tipoProfissao.put("1031", "DESENHISTA COMERCIAL")
tipoProfissao.put("1032", "DESENHISTA INDUSTRIAL")
tipoProfissao.put("1033", "DESENHISTA TECNICO/PROJETISTA")
tipoProfissao.put("1034", "DESPACHANTE")
tipoProfissao.put("12406", "DETETIVES E SERV INTELIGENCIA")
tipoProfissao.put("1035", "DIGITADOR")
tipoProfissao.put("1036", "DIPLOMATA")
tipoProfissao.put("1037", "DIRETOR DE EMPRESAS")
tipoProfissao.put("1038", "DIRETOR ESTABELECIM ENSINO")
tipoProfissao.put("1039", "DIRETOR/ASSESSOR INDUSTRIAL")
tipoProfissao.put("1e40", "DIRETOR/ASSESSOR SUPERIOR")
tipoProfissao.put("12404", "DIRIG PEQUENAS COMUNIDADES")
tipoProfissao.put("1238", "DOMINIO INVALIDO")
tipoProfissao.put("1041", "DONA DE CASA")
tipoProfissao.put("1042", "ECONOMISTA")
tipoProfissao.put("1043", "ELETR VEIC/MAQ/ELETRON/TELECOM")
tipoProfissao.put("1044", "ELETRICISTA DE INSTALACOES")
tipoProfissao.put("1045", "ELETRICISTA DE PRODUCAO INDUST...")
tipoProfissao.put("1e46", "ELETRICISTA INDUSTRIAL")
tipoProfissao.put("1047", "EMPREG RESTAUR, BUFE, LANCH")
tipoProfissao.put("1049", "EMPREGADO DOMESTICO")
tipoProfissao.put("1048", "EMPREGADOS DOMESTICOS EM GERAL")
tipoProfissao.put("1050", "EMPRESARIO/PRODUTOR ESPETAC")
tipoProfissao.put("1051", "ENFERMETRO/NUTRICIONISTA")
tipoProfissao.put("1052", "ENGENHEIRO")
tipoProfissao.put("1053", "ESPOLIO")
tipoProfissao.put("1054", "ESTATISTICO")
tipoProfissao.put("1055", "ESTIVADOR/CARREGADOR/EMBALAD")
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
tipoProfissao.put("1064", "FRESADOR")
tipoProfissao.put("1065", "FUNCIONARIO EMPRESA PUBLICA")
tipoProfissao.put("1066", "FUNCIONARIO PUB CIVIL APOSENT")
tipoProfissao.put("1067", "FUNDIDOR")
tipoProfissao.put("1068", "GARIMPEIRO")
tipoProfissao.put("1069", "GEOGRAFO")
tipoProfissao.put("1070", "GEOLOGO")
tipoProfissao.put("1071", "GERENTE")
tipoProfissao.put("1073", "GUARDADOR DE CARRO/ENGRAXATE")
tipoProfissao.put("1074", "IMPRESSOR/LINOTIPIST/BLOQ/OPER")
tipoProfissao.put("1075", "INSPETOR CONTROLE QUALIDADE")
tipoProfissao.put("1076", "INSTRUMENTISTA")
tipoProfissao.put("1077", "JOALHEIRO/OURIVES")
tipoProfissao.put("1078", "JORNALEIRO")
tipoProfissao.put("1079", "JORNALISTA E AFINS")
tipoProfissao.put("1080", "LANTERN/PINTOR VEICULO METALIC")
tipoProfissao.put("1081", "LEILOEIRO/AVALIADOR")
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
tipoProfissao.put("12403", "MERGULHADOR PROFISSIONAL")
tipoProfissao.put("1092", "MESTRE/ENCARREG PROD INDUSTR")
tipoProfissao.put("1093", "METALURGICO/SIDERURGICO")
tipoProfissao.put("1094", "METEOROLOGISTA")
tipoProfissao.put("1095", "MILITAR")
tipoProfissao.put("1096", "MILITAR REFORMADO")
tipoProfissao.put("1097", "MINISTRO/GOV/PREFEITO/SECR")
tipoProfissao.put("1098", "MODELO DE MODAS")
tipoProfissao.put("1099", "MOTORISTA AUTONOMO/TAXISTA")
tipoProfissao.put("1100", "MOTORISTA VEIC TRANSP CARGA")
tipoProfissao.put("1101", "MOTORISTA VEIC TRANSP PASSAG")
tipoProfissao.put("1102", "MUSICO")
tipoProfissao.put("1103", "OFICIAL DA POLICIA MILITAR")
tipoProfissao.put("1104", "OFICIAL FORCAS ARMADAS/AUXIL")
tipoProfissao.put("1106", "OPER CAMERA/AUDIO/DJ/SONOPL")
tipoProfissao.put("1107", "OPER COMPUTADOR/SUP TECNICO")
tipoProfissao.put("1105", "OPER GUIND/EMPILH/TRATOR/CALD")
tipoProfissao.put("1108", "OPERADOR DE CALDEIRAS")
tipoProfissao.put("1109", "OPERADOR EM GERAL/SOLDADOR")
tipoProfissao.put("1110", "OPERADOR MAQUINAS PRODUCAO")
tipoProfissao.put("1113", "OUTROS DESENHISTAS")
tipoProfissao.put("1114", "OUTROS TECNICOS")
tipoProfissao.put("1115", "OUTROS TRAB ENSINO NIVEL SUP")
tipoProfissao.put("1116", "OUTROS TRABALHADORES INDUST")
tipoProfissao.put("1117", "OUTROS TRABALHADORES RURAIS")
tipoProfissao.put("5370", "PADRE/PASTOR/RABINO")
tipoProfissao.put("1118", "PEDREIRO/ENCAN/AZULEJ/IMPERM")
tipoProfissao.put("1119", "PENSIONISTA")
tipoProfissao.put("1120", "PESCADOR")
tipoProfissao.put("12410", "PESQ DE MERCADO/ RECENSEADORES")
tipoProfissao.put("1121", "PILOTO DE AERONAVES")
tipoProfissao.put("1122", "PINTOR DE PAREDES/GESSISTA")
tipoProfissao.put("1123", "PORT EDIF/ASCENSS/GARAG/FAXIN")
tipoProfissao.put("1124", "PRENSISTA/ESTAMPADOR")
tipoProfissao.put("1125", "PREPARADOR DE MAQUINAS")
tipoProfissao.put("1126", "PROCURADOR E ASSEMELHADOS")
tipoProfissao.put("1127", "PROF ENSINO FUNDAMENTAL/MEDIO")
tipoProfissao.put("1129", "PROF HOTEL/PORT/COZIN/GARCOM")
tipoProfissao.put("1128", "PROFESSOR/PESQ ENSINO SUP")
tipoProfissao.put("1130", "PROF MANUT/OPER EQUIP INDUST")
tipoProfissao.put("1131", "PROFISS SERVICOS FUNERARIOS")
tipoProfissao.put("1132", "PROFISSIONAL ESTETICA")
tipoProfissao.put("1133", "PROFISSIONAL LETRAS E ARTES")
tipoProfissao.put("1134", "PROGRAMADOR DE COMPUTADOR")
tipoProfissao.put("1135", "PROGRAMADOR DE PRODUCAO")
tipoProfissao.put("1136", "PROMOTOR VENDA")
tipoProfissao.put("1137", "PROPR ESTAB AGRI/PECU/FLOREST")
tipoProfissao.put("1138", "PROPR ESTAB COMERCIAL")
tipoProfissao.put("1139", "PROPR ESTAB INDUSTRIAL")
tipoProfissao.put("1140", "PROPR ESTAB PRESTACAO SERVIC")
tipoProfissao.put("1141", "PROPRIETARIO IMOVEIS")
tipoProfissao.put("1142", "PROPRIETARIO MICROEMPRESA")
tipoProfissao.put("1143", "PROTETICO")
tipoProfissao.put("1144", "PSICOLOGO")
tipoProfissao.put("1145", "PUBLICITARIO")
tipoProfissao.put("1146", "QUIMICO")
tipoProfissao.put("1147", "RELACOES PUBLICAS")
tipoProfissao.put("1148", "REPR COMERC/CAIX VIAJ/VENDED")
tipoProfissao.put("1149", "SACERDOTE")
tipoProfissao.put("1150", "SECRET/DATILOG/RECEP/TELFONIS")
tipoProfissao.put("1151", "SECURITARIO")
tipoProfissao.put("1237", "SEM VALOR")
tipoProfissao.put("1152", "SERRALHEIRO")
tipoProfissao.put("1153", "SERV PUBLICO ESTADUAL")
tipoProfissao.put("1154", "SERV PUBLICO FEDERAL")
tipoProfissao.put("1155", "SERV PUBLICO MUNICIPAL")
tipoProfissao.put("1156", "SERVENTUARIO DA JUSTICA")
tipoProfissao.put("1157", "SOCIOLOGO")
tipoProfissao.put("1158", "SUPERV/INSP/AGENT COMP/VEND")
tipoProfissao.put("1159", "TABELIAO")
tipoProfissao.put("1160", "TECN ELETRIC/ELETRON/TELECOM")
tipoProfissao.put("1161", "TECNICO AGRIMENSURA/ AGRONOMIA")
tipoProfissao.put("1162", "TECNICO BIOLOGIA")
tipoProfissao.put("1163", "TECNICO CONTABIL/ESTATISTICA")
tipoProfissao.put("1164", "TECNICO LABOR/ENFERM/ODONTO")
tipoProfissao.put("1165", "TECNICO MECANICA")
tipoProfissao.put("1166", "TECNICO QUIMICA")
tipoProfissao.put("1167", "TECNOLOGO")
tipoProfissao.put("1168", "TORNEIRO")
tipoProfissao.put("1169", "TRAB ARTES GRAFICAS")
tipoProfissao.put("1170", "TRAB CONTABIL/CAIXA")
tipoProfissao.put("1173", "TRAB FABRIC CALCADOS/COURO")
tipoProfissao.put("1171", "TRAB FABRICACAO ALIM/BEBIDAS")
tipoProfissao.put("1172", "TRAB FABRICACAO BORRACHA")
tipoProfissao.put("1174", "TRAB FABRICACAO PAPEL")
tipoProfissao.put("1175", "TRAB FABRICACAO ROUPAS")
tipoProfissao.put("1176", "TRAB FABRICACAO TEXTEIS")
tipoProfissao.put("1184", "TRAB FLOREST/EXTRAT/MEIO AMB")
tipoProfissao.put("12408", "TRAB LOGISTICA E TRANSPORTE")
tipoProfissao.put("1177", "TRAB PROCESSMTO QUIMICOS")
tipoProfissao.put("12409", "TRAB PRODUCAO DE VIDRO E AFINS")
tipoProfissao.put("1178", "TRAB USINAGEM DE METAIS")
tipoProfissao.put("1179", "TRABALHADOR AGRICOLA/PECUARIA")
tipoProfissao.put("1180", "TRABALHADOR CONSTRUCAO CIVIL")
tipoProfissao.put("1181", "TRABALHADOR DA PECUARIA")
tipoProfissao.put("1182", "TRABALHADOR DE CASA NOTURNA")
tipoProfissao.put("1183", "TRABALHADOR DE GRANJA")
tipoProfissao.put("1185", "TRABALHADOR FUMO/CIG/CHARU")
tipoProfissao.put("1186", "VENDED VAREJISTA/ATACADISTA")
tipoProfissao.put("1187", "VENDEDORES AUT/AMBUL/CAMELO")
tipoProfissao.put("1188", "VETERINARIO/ZOOTECNISTA")
tipoProfissao.put("1189", "VIGIA/SEGURANCA/BOMBEIRO")
tipoProfissao.put("1190", "ZELADOR")

def tipo_profissao = tipoProfissao.get(CC0685["data"]["profissao"]["valor_dado_cadastral"].toString()); CC4009.CC3850("tipo_profissao", tipo_profissao)

}
//CARTAO ['CC2651']
def ofertaCartao = CC4009.CC3819("CC2830")
def bandeiraCartao = [:]
bandeiraCartao.put("04", "VISA")
bandeiraCartao.put("01", "MASTER")
CC4009.CC3850("CC2651", bandeiraCartao.get(ofertaCartao['CC2651']))
def tipoCartao = [:]
tipoCartao.put("M", "multiplo")
tipoCartao.put("D", "debito")
CC4009.CC3850("CC3853", tipoCartao.get(ofertaCartao['CC1369']))
//Renda Faturamento
if(CC0685["data"]["renda_faturamento"] != null){ CC4009.CC3850('renda_faturamento',CC0685["data"]["renda_faturamento"]["valor_dado_cadastral"]) }else{ CC4009.CC3850('renda_faturamento','') } //Beneficio CC4357 if(CC4009.hasVariable('CC0290') &amp;&amp; CC0290) { CC4009.CC3850('vinculoBeneficio', true) } else { CC4009.CC3850('vinculoBeneficio', false) } //Identificação da Jornada if (CC2721 != 'CC4073'){ CC4009.CC3850('CC0954', "CC4070"+"-" +CC2721) }else{ CC4009.CC3850('CC0954', "CC4070") } //Situacoes especiais if(CC4009.hasVariable('CC1689') &amp;&amp; CC4009.CC3819('CC1689') != null &amp;&amp; CC4009.CC3819('CC1689') != '') { def situacoesEspeciaisPAC = CC4009.CC3819("CC1689"); switch (situacoesEspeciaisPAC) { case 'nao alfabetizado': situacoesEspeciaisPAC = 'Não alfabetizado' break } situacoesEspeciaisPAC = situacoesEspeciaisPAC.toLowerCase().capitalize() CC4009.CC3850('situacoesEspeciaisPac', situacoesEspeciaisPAC) } else { CC4009.CC3850('situacoesEspeciaisPac', 'Nenhuma'); // Ad Novo def CC4024 = CC4009.CC3819("CC4024") def CC2830 = CC4009.CC3819("CC2830") def flagAdAntigo = CC2830['CC0206'] def flagAdNovo = "" if(CC4024 != null &amp;&amp; CC4024 != "" &amp; !CC4024.toString().equalsIgnoreCase("CC4425 antigo")){ flagAdNovo = CC4024['CC0206'] } CC4009.CC3850("flagAd", false) if(flagAdNovo == true || flagAdAntigo.toString().equalsIgnoreCase("true")){ CC4009.CC3850("flagAd", true) }</t030>
    </t031>
    <t033 id="CC2692" name="CC3979" camunda:type="external" CC3089="CC0659">
      <t011>CC0042
Link Git --&gt; «U000026»</t011>
      <t019>
        <t058>
          <t059 name="CC1644">${oferta_produto['contratar_combinaqui'] ? "X" : ""}</t059>
          <t059 name="CC1643">${oferta_produto['contratar_combinaqui'] ? "": "X"}</t059>
          <t059 name="CC1036">${oferta_produto['nome_pacote_combinaqui']}</t059>
          <t059 name="CC0981">${oferta_produto['valor_pacote_combinaqui']}</t059>
          <t059 name="CC3908">${oferta_produto != null &amp;&amp; oferta_produto.cobertura_bolsa_protegida != null ? oferta_produto.cobertura_bolsa_protegida : ''}</t059>
          <t059 name="valor1">${oferta_produto != null &amp;&amp; oferta_produto.valor_cobertura_bolsa_protegida != null ? oferta_produto.valor_cobertura_bolsa_protegida : ''}</t059>
          <t059 name="CC3909">${oferta_produto != null &amp;&amp; oferta_produto.cobertura_internacao_hospitalar != null ? oferta_produto.cobertura_internacao_hospitalar : ''}</t059>
          <t059 name="valor2">${oferta_produto != null &amp;&amp; oferta_produto.valor_cobertura_internacao_hospitalar != null ? oferta_produto.valor_cobertura_internacao_hospitalar : ''}</t059>
          <t059 name="CC3910">${oferta_produto != null &amp;&amp; oferta_produto.cobertura_morte_acidental != null ? oferta_produto.cobertura_morte_acidental : ''}</t059>
          <t059 name="valor3">${oferta_produto != null &amp;&amp; oferta_produto.valor_cobertura_morte_acidental != null ? oferta_produto.valor_cobertura_morte_acidental : ''}</t059>
          <t059 name="CC3911">${oferta_produto != null &amp;&amp; oferta_produto.cobertura_invalidez != null ? oferta_produto.cobertura_invalidez : ''}</t059>
          <t059 name="valor4">${oferta_produto != null &amp;&amp; oferta_produto.valor_cobertura_invalidez != null ? oferta_produto.valor_cobertura_invalidez : ''}</t059>
          <t059 name="CC3912">${oferta_produto != null &amp;&amp; oferta_produto.cobertura_compra_com_cartao != null ? oferta_produto.cobertura_compra_com_cartao : ''}</t059>
          <t059 name="valor5">${oferta_produto != null &amp;&amp; oferta_produto.valor_cobertura_compra_com_cartao != null ? oferta_produto.valor_cobertura_compra_com_cartao : ''}</t059>
          <t059 name="CC3913">${oferta_produto != null &amp;&amp; oferta_produto.cobertura_roubo_furto != null ? oferta_produto.cobertura_roubo_furto : ''}</t059>
          <t059 name="valor6">${oferta_produto != null &amp;&amp; oferta_produto.valor_cobertura_roubo_furto != null ? oferta_produto.valor_cobertura_roubo_furto : ''}</t059>
          <t059 name="CC3914">${oferta_produto != null &amp;&amp; oferta_produto.cobertura_saque_transacoes_compras != null ? oferta_produto.cobertura_saque_transacoes_compras : ''}</t059>
          <t059 name="valor7">${oferta_produto != null &amp;&amp; oferta_produto.valor_cobertura_saque_transacoes_compras != null ? oferta_produto.valor_cobertura_saque_transacoes_compras : ''}</t059>
          <t059 name="CC0686">${CC0532}</t059>
          <t059 name="CC1221">${CC3125}</t059>
          <t059 name="CC2655">${oferta_produto['contratar_seguro_cartao_protegido'] ? "X" : ""}</t059>
          <t059 name="CC2654">${oferta_produto['contratar_seguro_cartao_protegido'] ? "" : "X"}</t059>
          <t059 name="adFlagSim">${flagAd ? "X" : ""}</t059>
          <t059 name="adFlagNao">${flagAd ? "" : "X"}</t059>
          <t059 name="CC2699">${vinculoBeneficio ? execution.getVariable("numero_beneficio_inss") : ""}</t059>
          <t059 name="CC3964">${vinculoBeneficio ? "" : "X"}</t059>
          <t059 name="CC3965">${vinculoBeneficio ? "X" : ""}</t059>
          <t059 name="CC1982">${vinculoBeneficio ? "" : "X"}</t059>
          <t059 name="CC1983">${vinculoBeneficio ? "X" : ""}</t059>
          <t059 name="CC1980">${oferta_produto['optante_aplicaut'] ? "X" : ""}</t059>
          <t059 name="CC1979">${oferta_produto['optante_aplicaut'] ? "" : "X"}</t059>
          <t059 name="nif">${execution.hasVariable("numero_nif") ?execution.getVariable("numero_nif"):""}</t059>
          <t059 name="CC1684">${execution.hasVariable("pais_residencia_fiscal") ?execution.getVariable("pais_residencia_fiscal"):""}</t059>
          <t059 name="CC3084">PDF</t059>
          <t059 name="CC0610">${oferta_produto['valor_total_anuidade_cartao']}</t059>
          <t059 name="CC0059">${oferta_produto['taxa_juro_moratorio_lis']}</t059>
          <t059 name="CC0044">${oferta_produto['taxa_juro_remuneratorio_lis']}</t059>
          <t059 name="CC1641">D</t059>
          <t059 name="CC1668">${oferta_produto['numero_de_parcela']}</t059>
          <t059 name="CC1987">${codigo_formulario}</t059>
          <t059 name="CC3698">${CC3698}</t059>
          <t059 name="CC2693">true</t059>
          <t059 name="idade">${""}</t059>
          <t059 name="CC2825">1225</t059>
          <t059 name="CC1407">${oferta_produto['valor_total_operacao_lim_contratado_iof_jurois_lis']}</t059>
          <t059 name="CC0279">${oferta_produto['valor_cet_ano_limite']}</t059>
          <t059 name="CC0944">${oferta_produto['valor_cet_mes_limite']}</t059>
          <t059 name="CC1682">1</t059>
          <t059 name="CC2022">CONF</t059>
          <t059 name="CC2031">${""}</t059>
          <t059 name="CC4178">${conta_reservada["agencia"]}</t059>
          <t059 name="CC4330">${conta_reservada["conta"]}</t059>
          <t059 name="CC4422">${conta_reservada["dac"]}</t059>
          <t059 name="CC3836">${dados_cliente_atualizados["data"]["nome_completo"]["valor_dado_cadastral"]}</t059>
          <t059 name="CC4421">${cpf.substring(0, cpf.length() - 2)}</t059>
          <t059 name="cpfDac">${cpf.substring(cpf.length() - 2, cpf.length())}</t059>
          <t059 name="CC2025">Individual</t059>
          <t059 name="CC3717">${grau_escolaridade}</t059>
          <t059 name="CC2023">${CC1689}</t059>
          <t059 name="CC3845">${renda_faturamento}</t059>
          <t059 name="cnpj">${execution.hasVariable("cnpj_empresa") ? cnpj_empresa : ''}</t059>
          <t059 name="CC2685">${execution.hasVariable("nome_empresa") ? nome_empresa : ""}</t059>
          <t059 name="CC3936">CC4304 Corrente</t059>
          <t059 name="tipoDI">${CC2846}</t059>
          <t059 name="CC2831">${""}</t059>
          <t059 name="numeroDI">${numero_documento}</t059>
          <t059 name="CC2804">${dados_cliente_atualizados["data"]["data_nascimento_fundacao"]["valor_dado_cadastral"]}</t059>
          <t059 name="CC2834">${""}</t059>
          <t059 name="nomeMae">${nome_mae}</t059>
          <t059 name="sexo">${sexo}</t059>
          <t059 name="CC3815">${estado_civil}</t059>
          <t059 name="CC3837">${""}</t059>
          <t059 name="CC3916">${""}</t059>
          <t059 name="CC4420">${CC4385}</t059>
          <t059 name="CC4424">${CC4424}</t059>
          <t059 name="CC4275">${CC4275}</t059>
          <t059 name="CC3800">${CC3800}</t059>
          <t059 name="CC4257">${CC4257}</t059>
          <t059 name="CC2792">${CC4260}</t059>
          <t059 name="CC3959">${CC4266}</t059>
          <t059 name="CC4331">${dados_cliente_atualizados["data"]["emails"][0]["valor_dado_cadastral"]["email"]}</t059>
          <t059 name="CC3956">${ddd_telefone.concat(' ').concat(numero_telefone)}</t059>
          <t059 name="profissao">${tipo_profissao}</t059>
          <t059 name="cepLec">${CC4385}</t059>
          <t059 name="ruaLec">${CC4424}</t059>
          <t059 name="numLec">${CC4275}</t059>
          <t059 name="CC2795">${CC3800}</t059>
          <t059 name="bairroLec">${CC4257}</t059>
          <t059 name="cidadeLec">${CC4260}</t059>
          <t059 name="ufLec">${CC4266}</t059>
          <t059 name="CC3812">${oferta_produto['dia_debito_encargo_lis']}</t059>
          <t059 name="CC1210">${oferta_produto['valor_total_operacao_lim_contratado_iof_juros_lis']}</t059>
          <t059 name="CC1238">${oferta_produto['taxa_juro_moratorio_lis']}</t059>
          <t059 name="CC0812">${oferta_produto['taxa_juro_remuneratorio_lis']}</t059>
          <t059 name="iofValor">${oferta_produto['valor_iof_lis']}</t059>
          <t059 name="CC1207">${oferta_produto['percent_iof_lis']}</t059>
          <t059 name="CC2733">${dia_vencimento_cartao == "01" || dia_vencimento_cartao == "1" ? "x" : ""}</t059>
          <t059 name="CC2734">${dia_vencimento_cartao == "02" || dia_vencimento_cartao == "2" ? "x" : ""}</t059>
          <t059 name="CC2735">${dia_vencimento_cartao == "03" || dia_vencimento_cartao == "3" ? "x" : ""}</t059>
          <t059 name="CC2736">${dia_vencimento_cartao == "06" || dia_vencimento_cartao == "6" ? "x" : ""}</t059>
          <t059 name="CC2737">${dia_vencimento_cartao == "17" ? "x" : ""}</t059>
          <t059 name="CC2738">${dia_vencimento_cartao == "18" ? "x" : ""}</t059>
          <t059 name="CC2739">${dia_vencimento_cartao == "21" ? "x" : ""}</t059>
          <t059 name="CC2740">${dia_vencimento_cartao == "23" ? "x" : ""}</t059>
          <t059 name="CC2741">${dia_vencimento_cartao == "25" ? "x" : ""}</t059>
          <t059 name="CC2742">${dia_vencimento_cartao == "26" ? "x" : ""}</t059>
          <t059 name="CC2743">${dia_vencimento_cartao == "28" ? "x" : ""}</t059>
          <t059 name="CC2690">${oferta_produto['codigo_fatura_digital_cartao'] == "S" ? "x" : ""}</t059>
          <t059 name="CC2689">${oferta_produto['codigo_fatura_digital_cartao'] != "S" ? "x" : ""}</t059>
          <t059 name="CC1223">${CC3853}</t059>
          <t059 name="CC1390">${oferta_produto['tipo_cartao']}</t059>
          <t059 name="CC0802">${CC2651}</t059>
          <t059 name="CC3132">${oferta_produto['valor_total_anuidade_cartao']}</t059>
          <t059 name="CC0873">${oferta_produto['numero_de_parcela']}</t059>
          <t059 name="CC2003">${(execution.hasVariable("encarteiramento_manual_gq") &amp;&amp; encarteiramento_manual_gq == "true") ? funcional : http_gq_consulta_encarteiramento_conta["funcional"]}</t059>
          <t059 name="CC3093">${(execution.hasVariable("encarteiramento_manual_gq") &amp;&amp; encarteiramento_manual_gq == "true") ? codigo_carteira : http_gq_consulta_encarteiramento_conta["cod_carteira"]}</t059>
          <t059 name="CC0350">${CC0745}</t059>
          <t059 name="CC0642">${CC0745}</t059>
          <t059 name="CC3116">${CC4260}</t059>
          <t059 name="CC3707">${declaracao_pac_time.substring(0, 10)}</t059>
          <t059 name="CC3934">${oferta_produto['optante_produto'] ? "X" : ""}</t059>
          <t059 name="CC3933">${oferta_produto['optante_produto'] ? "" : "X"}</t059>
          <t059 name="CC1639">x</t059>
          <t059 name="CC1638">${""}</t059>
          <t059 name="CC2833">${oferta_produto['nome_pacote_tarifa']}</t059>
          <t059 name="CC1213">${oferta_produto['valor_pacote_tarifa']}</t059>
          <t059 name="CC0960">${""}</t059>
          <t059 name="CC0961">x</t059>
          <t059 name="CC1215">${CC3120}</t059>
          <t059 name="CC0646">${oferta_produto['numero_de_parcela']}</t059>
          <t059 name="CC0865">${oferta_produto['dia_vencimento_cartao']}</t059>
          <t059 name="CC2030">${oferta_produto['valor_da_parcela']}</t059>
          <t059 name="CC1681">${CC0954}</t059>
          <t059 name="CC2806">${debitoproduto1}</t059>
          <t059 name="CC2807">${debitoproduto2}</t059>
          <t059 name="CC2808">${debitoproduto3}</t059>
          <t059 name="CC2809">${debitoproduto4}</t059>
          <t059 name="CC2810">${debitoproduto5}</t059>
          <t059 name="CC2811">${debitoproduto6}</t059>
          <t059 name="CC2812">${debitoproduto7}</t059>
          <t059 name="CC2813">${debitoproduto8}</t059>
          <t059 name="CC2814">${debitoproduto9}</t059>
          <t059 name="CC2683">${debitoproduto10}</t059>
          <t059 name="CC2674">${debitocontrato1}</t059>
          <t059 name="CC2675">${debitocontrato2}</t059>
          <t059 name="CC2676">${debitocontrato3}</t059>
          <t059 name="CC2677">${debitocontrato4}</t059>
          <t059 name="CC2678">${debitocontrato5}</t059>
          <t059 name="CC2679">${debitocontrato6}</t059>
          <t059 name="CC2680">${debitocontrato7}</t059>
          <t059 name="CC2681">${debitocontrato8}</t059>
          <t059 name="CC2682">${debitocontrato9}</t059>
          <t059 name="CC1996">${debitocontrato10}</t059>
          <t059 name="CC3952">${stiContratarSeguroTransacao ? "X" : ""}</t059>
          <t059 name="CC3951">${stiContratarSeguroTransacao ? "" : "X"}</t059>
          <t063 name="CC0808">
            <t061>
              <t050 key="codigo_formulario">${codigo_formulario}</t050>
              <t050 key="versao_formulario">${versao_formulario}</t050>
              <t050 key="arquivo_gerado">${arquivo_gerado}</t050>
              <t050 key="guarda_de_documento">${guarda_de_documento}</t050>
              <t050 key="codigo_guarda">${guarda_de_documento}</t050>
              <t050 key="identificador_di4">${identificador_di4}</t050>
            </t061>
          </t063>
        </t058>
      </t019>
      <t021>CC3501</t021>
      <t027>CC3358</t027>
    </t033>
    <t032 id="CC3501" sourceRef="CC0694" targetRef="CC2692" />
    <t032 id="CC3358" sourceRef="CC2692" targetRef="CC2512" />
    <t033 id="CC0968" name="CC0928" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">4</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="CC3106">$</t050>
              <t050 key="CC0597">$</t050>
              <t050 key="CC4016">$</t050>
              <t050 key="CC4421">$</t050>
              <t050 key="CC3948">$</t050>
              <t050 key="nome_receita_federal">$</t050>
              <t050 key="CC3117">$</t050>
              <t050 key="CC4129">$</t050>
              <t050 key="CC1689">$</t050>
              <t050 key="CC2721">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="CC0597">${(execution.hasVariable('motivo_recusa_elegibilidade') ? motivo_recusa_elegibilidade : execution.hasVariable('message') ? message : "Sem motivo recusa")}</t050>
              <t050 key="CC3106">${(execution.hasVariable('elegibilidade') ? elegibilidade : "Erro ao consultar motor elegibilidade")}</t050>
              <t050 key="CC3948">${(execution.hasVariable('restricoes') ? restricoes : "Sem restricao")}</t050>
              <t050 key="CC4016">${CC4016}</t050>
              <t050 key="CC4421">${CC4421}</t050>
              <t050 key="nome_receita_federal">${execution.getVariable('nome_receita_federal')}</t050>
              <t050 key="CC3117">${(execution.hasVariable('mensagem_erro') ? mensagem_erro : "Sem mensagem Erro")}</t050>
              <t050 key="CC4129">${CC4129}</t050>
              <t050 key="CC1689">${CC1689}</t050>
              <t050 key="CC2721">${(execution.hasVariable('sub_fluxo_atual') ? sub_fluxo_atual : null)}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3220</t021>
      <t021>CC3607</t021>
      <t021>CC3374</t021>
      <t027>CC3325</t027>
    </t033>
    <t032 id="CC3325" sourceRef="CC0968" targetRef="CC2594" />
    <t018 id="CC2616" name="CC0082">
      <t021>CC3238</t021>
      <t027>CC3463</t027>
      <t027>CC3220</t027>
    </t018>
    <t032 id="CC3463" sourceRef="CC2616" targetRef="CC3917" />
    <t032 id="CC3220" sourceRef="CC2616" targetRef="CC0968">
      <t008 xsi:type="bpmn:tFormalExpression">${( (execution.hasVariable('situacao_especial') &amp;&amp; ( situacao_especial == "procuracao dependente economico" || situacao_especial == "procuracao maior sob curatela" || situacao_especial == "procuracao representacao outras situacoes" || situacao_especial == "menor representado pelos pais" || situacao_especial == "menor sob curatela" || situacao_especial == "menor sob guarda" || situacao_especial == "menor sob tutela" )) || (execution.hasVariable('sub_fluxo_atual') &amp;&amp; ( sub_fluxo_atual == "b2b" || sub_fluxo_atual == "central" )) ) &amp;&amp; (segmento == "I")}</t008>
    </t032>
    <t018 id="CC2556" name="CC0082" default="CC3440">
      <t021>CC3530</t021>
      <t027>CC3440</t027>
      <t027>CC3278</t027>
    </t018>
    <t018 id="CC2594" name="CC0082" default="CC3390">
      <t021>CC3325</t021>
      <t027>CC3390</t027>
      <t027>CC3566</t027>
    </t018>
    <t032 id="CC3390" sourceRef="CC2594" targetRef="CC3009" />
    <t032 id="CC3566" sourceRef="CC2594" targetRef="CC3917">
      <t008 xsi:type="bpmn:tFormalExpression">${segmento == 'I'}</t008>
    </t032>
    <t032 id="CC3440" sourceRef="CC2556" targetRef="CC2917" />
    <t012 id="CC2899">
      <t021>CC3278</t021>
      <t037 id="CC0261" />
    </t012>
    <t032 id="CC3278" sourceRef="CC2556" targetRef="CC2899">
      <t008 xsi:type="bpmn:tFormalExpression">${segmento == 'I'}</t008>
    </t032>
    <t033 id="CC0347" name="CC0930" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC2720">4</t059>
          <t059 name="CC1214">
            <t061>
              <t050 key="CC0597">$</t050>
              <t050 key="CC4129">$</t050>
              <t050 key="agencia_logada">$</t050>
              <t050 key="CC1689">$</t050>
              <t050 key="CC2721">$</t050>
            </t061>
          </t059>
          <t059 name="CC2802">
            <t061>
              <t050 key="CC0597">CC3678</t050>
              <t050 key="CC4129">${CC4129}</t050>
              <t050 key="agencia_logada">${(execution.hasVariable('agencia_logada') ? agencia_logada : null)}</t050>
              <t050 key="CC1689">${CC1689}</t050>
              <t050 key="CC2721">${(execution.hasVariable('sub_fluxo_atual') ? sub_fluxo_atual : null)}</t050>
            </t061>
          </t059>
        </t058>
      </t019>
      <t021>CC3446</t021>
      <t021>CC3372</t021>
      <t027>CC3223</t027>
    </t033>
    <t032 id="CC3223" sourceRef="CC0347" targetRef="CC3002" />
    <t043 id="CC3728" name="CC3680">
      <t019>
        <t055>
          <t056 id="CC3817" type="domain" defaultValue="${CC4335}" />
          <t056 id="CC0597" type="domain" defaultValue="${execution.hasVariable('motivo_recusa_elegibilidade') ? motivo_recusa_elegibilidade :&#10;'[{&quot;codigo&quot;:&quot;000&quot;,&quot;descricao&quot;:&quot;elegibilidade&quot;,&quot;tipo&quot;:&quot;elegibilidade&quot;}]'}" />
          <t056 id="CC3948" type="domain" defaultValue="CC0001" />
          <t056 id="CC3117" type="domain" defaultValue="${execution.hasVariable('mensagem_erro') ?&#10;mensagem_erro : &quot;Sem mensagem Erro&quot;}" />
          <t056 id="CC4129" type="domain" defaultValue="${CC4129}" />
        </t055>
      </t019>
      <t021>CC3637</t021>
      <t021>CC3279</t021>
      <t027>CC3374</t027>
    </t043>
    <t001 id="CC2897" attachedToRef="CC3728">
      <t027>CC3607</t027>
      <t042 id="CC0519">
        <t041 xsi:type="bpmn:tFormalExpression">PT3M</t041>
      </t042>
    </t001>
    <t032 id="CC3607" sourceRef="CC2897" targetRef="CC0968" />
    <t032 id="CC3374" sourceRef="CC3728" targetRef="CC0968" />
    <t033 id="CC0096" name="CC0054" camunda:modelerTemplate="CC1219" camunda:modelerTemplateVersion="1" CC1191="true" CC0630="${CC1220}">
      <t019>
        <t058>
          <t059 name="CC3960">«U000046»</t059>
          <t059 name="CC2838">?documento_cliente=${execution.getVariable('cnpj_empresa')}</t059>
          <t059 name="CC1399">?documento_cliente=${execution.getVariable('cnpj_empresa')}</t059>
          <t059 name="CC2710">?documento_cliente=${execution.getVariable('cnpj_empresa')}</t059>
          <t059 name="urlDev">«U000045»</t059>
          <t059 name="CC2823">{"CC3136":"CC0151","CC3137":"CC0150","CC2849":"whdvyjimxa","CC1058":"CC0049"}</t059>
          <t059 name="CC3925">{"CC3136":"CC0149","CC3137":"CC0150","CC2849":"zslkrdk1b1","CC1058":"CC0049"}</t059>
          <t059 name="CC3820">{"CC3136":"CC0152","CC3137":"CC0150","CC2849":"tv44ug51nb","CC1058":"CC0049"}</t059>
          <t059 name="urlProd">«U000044»</t059>
          <t063 name="CC0055">${S(response)}</t063>
        </t058>
        <t054 name="withError">
          <t052>true</t052>
        </t054>
        <t054 name="CC1381">
          <t067>erro_consultar_id_pessoa</t067>
        </t054>
        <t054 name="CC2725">
          <t052>${statusCode != 200}</t052>
        </t054>
      </t019>
      <t021>CC3298</t021>
      <t027>CC3321</t027>
    </t033>
    <t001 id="CC3000" attachedToRef="CC0096">
      <t027>CC3457</t027>
      <t014 id="CC0418" />
    </t001>
    <t031 id="CC0172" name="CC0164" scriptFormat="groovy">
      <t021>CC3321</t021>
      <t027>CC3424</t027>
      <t030>import groovy.json.JsonSlurper

def toJava(obj) {
if (obj instanceof Map) {
def map = new java.util.LinkedHashMap()
obj.each { k, v -&gt; map[k] = toJava(v) }
return map
} else if (obj instanceof List) {
return obj.collect { toJava(it) }
} else {
return obj
}
}

def data = CC0055.prop("data").elements()
def jsonSlurper = new JsonSlurper()
def contas_pagadoras = (data &amp;&amp; data.size() &gt; 0) ? data.collect { toJava(jsonSlurper.parseText(it.toString())) } : null def dados_conta = contas_pagadoras ? contas_pagadoras[0]["dados_conta"] : null

def numero_conta = dados_conta ? dados_conta["numero_conta"] : ""
def dac_conta = dados_conta ? dados_conta["dac_conta"] : ""
def CC2647 = dados_conta ? dados_conta["codigo_agencia"] : ""
def conta_corrente_com_dac = numero_conta + dac_conta
def contas_pagadoras_fmt = contas_pagadoras ? contas_pagadoras.collect {
[
"CC2647": it["dados_conta"] ? it["dados_conta"]["codigo_agencia"] : "",
"CC3099": (it["dados_conta"] ? it["dados_conta"]["numero_conta"] : "") + (it["dados_conta"] ? it["dados_conta"]["dac_conta"] : "") ] } : []

CC4009.CC3850("contas_pagadoras", contas_pagadoras_fmt ?: [])
CC4009.CC3850("CC3099", conta_corrente_com_dac)
CC4009.CC3850("CC2647", CC2647)</t030>
    </t031>
    <t032 id="CC3424" sourceRef="CC0172" targetRef="CC2510" />
    <t032 id="CC3457" sourceRef="CC3000" targetRef="CC2933" />
    <t032 id="CC3321" sourceRef="CC0096" targetRef="CC0172" />
    <t033 id="CC0533" name="CC0159" CC1191="true" CC0630="#{CC0676}">
      <t019>
        <t058>
          <t059 name="CC3826">${CC3826}</t059>
          <t059 name="CC1214">
            <t061 />
          </t059>
          <t059 name="CC2802">
            <t061 />
          </t059>
          <t059 name="CC2720">44</t059>
          <t059 name="CC0696">true</t059>
          <t059 name="CC1997">true</t059>
          <t059 name="CC2684">true</t059>
          <t059 name="CC1654">true</t059>
        </t058>
      </t019>
      <t021>CC3419</t021>
      <t027>CC3591</t027>
    </t033>
    <t032 id="CC3419" sourceRef="CC0877" targetRef="CC0533" />
    <t032 id="CC3591" sourceRef="CC0533" targetRef="CC2599" />
    <t039 id="CC0849">
      <t038>7h as 20h</t038>
    </t039>
    <t020 id="CC3067" categoryValueRef="CC0902" />
    <t020 id="CC3058" categoryValueRef="CC0917" />
    <t020 id="CC3066" categoryValueRef="CC0905" />
    <t020 id="CC3069" categoryValueRef="CC0901" />
    <t020 id="CC3065" categoryValueRef="CC0916" />
    <t000 id="CC1161" sourceRef="CC0798" targetRef="CC0849" />
    <t020 id="CC3059" categoryValueRef="CC0910" />
    <t020 id="CC3062" categoryValueRef="CC0910" />
    <t039 id="CC0848">
      <t038>20h as 7h</t038>
    </t039>
    <t000 id="CC1162" sourceRef="CC4136" targetRef="CC0848" />
    <t020 id="CC3057" categoryValueRef="CC0907" />
    <t020 id="CC3068" categoryValueRef="CC0913" />
    <t020 id="CC3061" categoryValueRef="CC0918" />
    <t020 id="CC3064" categoryValueRef="CC0899" />
    <t020 id="CC3060" categoryValueRef="CC0912" />
    <t000 id="CC1163" associationDirection="One" sourceRef="CC2994" targetRef="CC0637" />
    <t020 id="CC3063" categoryValueRef="CC0914" />
    <t039 id="CC0847">
      <t038>Atualizar variavel de resposta do ez8</t038>
    </t039>
    <t039 id="CC0850">
      <t038>Trava QT</t038>
    </t039>
    <t000 id="CC1160" sourceRef="CC2845" targetRef="CC0850" />
  </t029>
  <t015 id="CC1266" name="CC3727" escalationCode="200" />
  <t015 id="CC1268" name="CC0962" escalationCode="200" />
  <t013 id="CC2867" name="catchAll" />
  <t025 id="CC2630" name="CC1984" />
  <t013 id="CC2872" name="catchAll" />
  <t025 id="CC2631" name="CC0051" />
  <t013 id="CC2866" name="CC1380" errorCode="422" />
  <t013 id="CC2862" name="CC1370" errorCode="404" />
  <t013 id="CC2871" name="CC3703" errorCode="400" />
  <t004 id="CC1794">
    <t005 id="CC0904" value="Recepção" />
  </t004>
  <t004 id="CC1796">
    <t005 id="CC0825" value="Check| in" />
  </t004>
  <t004 id="CC1800">
    <t005 id="CC0909" value="CC3150" />
  </t004>
  <t004 id="CC1789">
    <t005 id="CC0900" value="Initus" />
  </t004>
  <t004 id="CC1802">
    <t005 id="CC0906" value="CC3873 CC4304" />
  </t004>
  <t004 id="CC1783">
    <t005 id="CC0903" value="CC3873 CC4077" />
  </t004>
  <t004 id="CC1803">
    <t005 id="CC0908" value="Geração da CC4405" />
  </t004>
  <t004 id="CC1791">
    <t005 id="CC0920" value="CC0994" />
  </t004>
  <t004 id="CC1781">
    <t005 id="CC0902" value="Recepção" />
  </t004>
  <t004 id="CC1784">
    <t005 id="CC0917" value="Check| in" />
  </t004>
  <t004 id="CC1790">
    <t005 id="CC0905" value="CC3150" />
  </t004>
  <t004 id="CC1786">
    <t005 id="CC0901" value="CC3873 CC4304" />
  </t004>
  <t004 id="CC1792">
    <t005 id="CC0916" value="CC3873 CC4077" />
  </t004>
  <t004 id="CC1799">
    <t005 id="CC0911" value="CC4155 de CC4127 manual" />
  </t004>
  <t004 id="CC1795">
    <t005 id="CC0910" value="CC4144 de documentos" />
  </t004>
  <t034 id="CC2767" name="CC0027" />
  <t034 id="CC2769" name="CC0040" />
  <t034 id="CC2766" name="CC0029" />
  <t025 id="CC2628" name="CC0381" />
  <t025 id="CC2629" name="CC0933" />
  <t034 id="CC2768" name="CC0019" />
  <t015 id="CC1263" name="CC1683" escalationCode="400" />
  <t004 id="CC1787">
    <t005 id="CC0919" value="CC4144 de documentos" />
  </t004>
  <t004 id="CC1785">
    <t005 id="CC0915" value="cancelamento por analise de CC4271" />
  </t004>
  <t015 id="CC1269" name="CC1663" escalationCode="401" />
  <t015 id="CC1265" name="CC3814" escalationCode="422" />
  <t015 id="CC1267" name="CC1376" escalationCode="415" />
  <t025 id="CC2625" name="CC0789" />
  <t025 id="CC2627" name="CC0789" />
  <t004 id="CC1780">
    <t005 id="CC0907" value="CC2046" />
  </t004>
  <t013 id="CC2861" name="CC1368" errorCode="500" />
  <t013 id="CC2870" name="CC0953" errorCode="CC0953" />
  <t013 id="CC2865" name="CC1368" errorCode="500" />
  <t013 id="CC2869" name="CC0691" errorCode="500_CPF_informado_diferente_da_tabela" />
  <t013 id="CC2874" name="CC0691" errorCode="500_CPF_informado_diferente_da_tabela" />
  <t015 id="CC1264" name="CC0400" escalationCode="500" />
  <t015 id="CC1262" name="CC0400" escalationCode="500" />
  <t004 id="CC1801">
    <t005 id="CC0898" />
  </t004>
  <t004 id="CC1798">
    <t005 id="CC0913" value="Verificação CC4408" />
  </t004>
  <t004 id="CC1793">
    <t005 id="CC0918" value="Vínculo CC4357" />
  </t004>
  <t004 id="CC1788">
    <t005 id="CC0899" />
  </t004>
  <t015 id="CC1261" name="CC2713" escalationCode="401" />
  <t013 id="CC2875" name="CC0939" errorCode="CC0939" />
  <t013 id="CC2864" name="catchAll" />
  <t004 id="CC1782">
    <t005 id="CC0912" value="cancelamento por analise de CC4271" />
  </t004>
  <t004 id="CC1797">
    <t005 id="CC0914" value="Reserva de CC4304" />
  </t004>
  <t013 id="CC2863" name="CC0387" errorCode="500" />
  <t013 id="CC2868" name="error_gq" errorCode="ERROR_GQ" />
  <t025 id="CC2626" name="CC0388" />
  <t013 id="CC2873" name="CC2715" errorCode="400" />
  <t044 id="CC2853">
    <t047 id="CC3761" bpmnElement="CC3838">
      <t048 id="CC1093" bpmnElement="CC2803">
        <t070 x="6312" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1096" bpmnElement="CC3806">
        <t070 x="6135" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1141" bpmnElement="CC0945">
        <t070 x="6482" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1125" bpmnElement="CC4003">
        <t070 x="8177" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1060" bpmnElement="CC1401">
        <t070 x="9092" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1085" bpmnElement="CC1228" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="10723" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1286" bpmnElement="CC2530" isMarkerVisible="true">
        <t070 x="8347" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1157" bpmnElement="CC2801">
        <t070 x="7601" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1075" bpmnElement="CC3807">
        <t070 x="7440" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1305" bpmnElement="CC2562" isMarkerVisible="true">
        <t070 x="8065" y="545" width="50" height="50" />
        <t046>
          <t070 x="8056" y="500" width="70" height="40" />
        </t046>
      </t048>
      <t048 id="CC1304" bpmnElement="CC2561" isMarkerVisible="true" bioc:stroke="#000000" bioc:fill="#ffffff">
        <t070 x="8973" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1097" bpmnElement="CC3105" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="20580" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1135" bpmnElement="CC0810" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="20258" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1078" bpmnElement="CC0877" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="21228" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1068" bpmnElement="CC0538" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="19788" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1110" bpmnElement="CC1981" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="19958" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1879" bpmnElement="CC2844">
        <t070 x="20130" y="552" width="36" height="36" />
        <t046>
          <t070 x="20117" y="595" width="65" height="27" />
        </t046>
      </t048>
      <t048 id="CC1148" bpmnElement="CC2007" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="24968" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1072" bpmnElement="CC2820" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="25208" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1122" bpmnElement="CC1196" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="24546" y="860" width="100" height="80" />
      </t048>
      <t048 id="CC1329" bpmnElement="CC2593">
        <t070 x="23963" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1337" bpmnElement="CC2604">
        <t070 x="24873" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1832" bpmnElement="CC0370">
        <t070 x="25240" y="672" width="36" height="36" />
        <t046>
          <t070 x="25229" y="715" width="76" height="27" />
        </t046>
      </t048>
      <t048 id="CC1861" bpmnElement="CC0798">
        <t070 x="24328" y="690" width="36" height="36" />
        <t046>
          <t070 x="24316" y="726" width="72" height="27" />
        </t046>
      </t048>
      <t048 id="CC1139" bpmnElement="CC1358" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="6780" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1341" bpmnElement="CC0927">
        <t070 x="20433" y="683" width="50" height="50" />
        <t046>
          <t070 x="8974" y="515" width="37" height="14" />
        </t046>
      </t048>
      <t048 id="CC1830" bpmnElement="CC0800">
        <t070 x="20612" y="690" width="36" height="36" />
        <t046>
          <t070 x="20593" y="733" width="79" height="27" />
        </t046>
      </t048>
      <t048 id="CC1149" bpmnElement="CC0542" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="26948" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1099" bpmnElement="CC3918">
        <t070 x="5844" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1102" bpmnElement="CC0604" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="2272" y="1231" width="100" height="80" />
      </t048>
      <t048 id="CC1849" bpmnElement="CC2903">
        <t070 x="2461" y="1253" width="36" height="36" />
      </t048>
      <t048 id="CC1280" bpmnElement="CC2520" isMarkerVisible="true">
        <t070 x="17613" y="545" width="50" height="50" />
        <t046>
          <t070 x="17669" y="550" width="88" height="40" />
        </t046>
      </t048>
      <t048 id="CC1081" bpmnElement="CC0382">
        <t070 x="17588" y="850" width="100" height="80" />
      </t048>
      <t048 id="CC1091" bpmnElement="CC2709" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="17708" y="740" width="100" height="80" />
      </t048>
      <t048 id="CC2054" bpmnElement="CC3154">
        <t070 x="21982" y="163" width="36" height="36" />
        <t046>
          <t070 x="21961" y="199" width="78" height="40" />
        </t046>
      </t048>
      <t048 id="CC1925" bpmnElement="CC3029">
        <t070 x="21982" y="303" width="36" height="36" />
        <t046>
          <t070 x="21961" y="339" width="78" height="27" />
        </t046>
      </t048>
      <t048 id="CC1145" bpmnElement="CC2028" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="21718" y="211" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1144" bpmnElement="CC3111" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="22180" y="211" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1061" bpmnElement="CC1694" isExpanded="true" bioc:stroke="#000000" bioc:fill="#ffffff" color:border-color="#000000">
        <t070 x="17858" y="600" width="1470" height="390" />
      </t048>
      <t048 id="CC1844" bpmnElement="CC2920">
        <t070 x="17898" y="676" width="36" height="36" />
      </t048>
      <t048 id="CC1100" bpmnElement="CC0855" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="18147" y="654" width="100" height="80" />
      </t048>
      <t048 id="CC1866" bpmnElement="CC2943" bioc:stroke="#000000" bioc:fill="#ffffff" color:background-color="#ffffff" color:border-color="#000000">
        <t070 x="18306" y="676" width="36" height="36" />
        <t046>
          <t070 x="18305" y="716" width="62" height="27" />
        </t046>
      </t048>
      <t048 id="CC1293" bpmnElement="CC2543" isMarkerVisible="true" bioc:stroke="#000000" bioc:fill="#ffffff" color:background-color="#ffffff" color:border-color="#000000">
        <t070 x="18790" y="669" width="50" height="50" />
      </t048>
      <t048 id="CC1933" bpmnElement="CC2886">
        <t070 x="18972" y="855" width="36" height="36" />
        <t046>
          <t070 x="18946" y="903" width="90" height="14" />
        </t046>
      </t048>
      <t048 id="CC1912" bpmnElement="CC3007">
        <t070 x="19220" y="676" width="36" height="36" />
      </t048>
      <t048 id="CC1116" bpmnElement="CC0541" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="18628" y="654" width="100" height="80" />
      </t048>
      <t048 id="CC1118" bpmnElement="CC0548" bioc:stroke="#000000" bioc:fill="#ffffff" color:background-color="#ffffff" color:border-color="#000000">
        <t070 x="18948" y="654" width="100" height="80" />
      </t048>
      <t048 id="CC1823" bpmnElement="CC2890">
        <t070 x="19220" y="767" width="36" height="36" />
        <t046>
          <t070 x="19235" y="810" width="21" height="14" />
        </t046>
      </t048>
      <t048 id="CC1071" bpmnElement="CC0645" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="19068" y="745" width="100" height="80" />
      </t048>
      <t048 id="CC1077" bpmnElement="CC1035" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="18000" y="654" width="100" height="80" />
      </t048>
      <t048 id="CC1331" bpmnElement="CC2595" isMarkerVisible="true">
        <t070 x="18453" y="669" width="50" height="50" />
        <t046>
          <t070 x="18437" y="619" width="81" height="40" />
        </t046>
      </t048>
      <t048 id="CC1860" bpmnElement="CC2936">
        <t070 x="18460" y="767" width="36" height="36" />
        <t046>
          <t070 x="18379" y="771" width="78" height="27" />
        </t046>
      </t048>
      <t048 id="CC1345" bpmnElement="CC2613" isMarkerVisible="true">
        <t070 x="18453" y="848" width="50" height="50" />
        <t046>
          <t070 x="18446" y="899" width="65" height="27" />
        </t046>
      </t048>
      <t048 id="CC1931" bpmnElement="CC3039">
        <t070 x="18587" y="855" width="36" height="36" />
        <t046>
          <t070 x="18583" y="898" width="45" height="27" />
        </t046>
      </t048>
      <t048 id="CC1138" bpmnElement="CC0145" bioc:stroke="#1e88e5" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#1e88e5">
        <t070 x="18765" y="833" width="100" height="80" />
      </t048>
      <t048 id="CC1935" bpmnElement="CC2940">
        <t070 x="19010" y="716" width="36" height="36" />
      </t048>
      <t045 id="CC2411" bpmnElement="CC3560">
        <t071 x="18247" y="694" />
        <t071 x="18306" y="694" />
      </t045>
      <t045 id="CC2145" bpmnElement="CC3265">
        <t071 x="18840" y="694" />
        <t071 x="18948" y="694" />
      </t045>
      <t045 id="CC2102" bpmnElement="CC3209">
        <t071 x="18342" y="694" />
        <t071 x="18453" y="694" />
      </t045>
      <t045 id="CC2344" bpmnElement="CC3487">
        <t071 x="18728" y="694" />
        <t071 x="18790" y="694" />
      </t045>
      <t045 id="CC2342" bpmnElement="CC3485">
        <t071 x="19048" y="694" />
        <t071 x="19220" y="694" />
      </t045>
      <t045 id="CC2403" bpmnElement="CC3551">
        <t071 x="19168" y="785" />
        <t071 x="19220" y="785" />
      </t045>
      <t045 id="CC2360" bpmnElement="CC3503">
        <t071 x="17934" y="694" />
        <t071 x="18000" y="694" />
      </t045>
      <t045 id="CC2164" bpmnElement="CC3287">
        <t071 x="18100" y="694" />
        <t071 x="18147" y="694" />
      </t045>
      <t045 id="CC2325" bpmnElement="CC3466">
        <t071 x="18503" y="694" />
        <t071 x="18628" y="694" />
        <t046>
          <t070 x="18564" y="676" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2338" bpmnElement="CC3481">
        <t071 x="18478" y="719" />
        <t071 x="18478" y="767" />
        <t046>
          <t070 x="18487" y="727" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2177" bpmnElement="CC3300">
        <t071 x="18478" y="803" />
        <t071 x="18478" y="848" />
      </t045>
      <t045 id="CC2387" bpmnElement="CC3534">
        <t071 x="18503" y="873" />
        <t071 x="18587" y="873" />
        <t046>
          <t070 x="18541" y="855" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2160" bpmnElement="CC3281">
        <t071 x="18453" y="873" />
        <t071 x="18197" y="873" />
        <t071 x="18197" y="734" />
        <t046>
          <t070 x="18315" y="855" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2284" bpmnElement="CC3422">
        <t071 x="19028" y="752" />
        <t071 x="19028" y="785" />
        <t071 x="19068" y="785" />
      </t045>
      <t045 id="CC2112" bpmnElement="CC3221">
        <t071 x="18815" y="719" />
        <t071 x="18815" y="833" />
      </t045>
      <t045 id="CC2336" bpmnElement="CC3479">
        <t071 x="18865" y="873" />
        <t071 x="18972" y="873" />
      </t045>
      <t048 id="CC1285" bpmnElement="CC2529">
        <t070 x="17613" y="755" width="50" height="50" />
      </t048>
      <t048 id="CC1300" bpmnElement="CC2551" isMarkerVisible="true">
        <t070 x="19553" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1845" bpmnElement="CC2921">
        <t070 x="17620" y="1022" width="36" height="36" />
      </t048>
      <t048 id="CC1896" bpmnElement="CC2990">
        <t070 x="17970" y="1162" width="36" height="36" />
        <t046>
          <t070 x="18019" y="1166" width="71" height="27" />
        </t046>
      </t048>
      <t048 id="CC1083" bpmnElement="CC1696" isExpanded="true">
        <t070 x="17988" y="158" width="960" height="412" />
      </t048>
      <t048 id="CC1897" bpmnElement="CC2991">
        <t070 x="18060" y="250" width="36" height="36" />
      </t048>
      <t048 id="CC1064" bpmnElement="CC0607" bioc:stroke="#000000" bioc:fill="#ffffff" color:background-color="#ffffff" color:border-color="#000000">
        <t070 x="18178" y="228" width="100" height="80" />
      </t048>
      <t048 id="CC1903" bpmnElement="CC2999">
        <t070 x="18840" y="222" width="36" height="36" />
      </t048>
      <t048 id="CC1124" bpmnElement="CC0952">
        <t070 x="18748" y="378" width="100" height="80" />
      </t048>
      <t048 id="CC1113" bpmnElement="CC0878" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="18368" y="308" width="100" height="80" />
      </t048>
      <t048 id="CC1917" bpmnElement="CC3035">
        <t070 x="18890" y="380" width="36" height="36" />
        <t046>
          <t070 x="18904" y="357" width="21" height="14" />
        </t046>
      </t048>
      <t048 id="CC1152" bpmnElement="CC1045" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="18368" y="448" width="100" height="80" />
      </t048>
      <t048 id="CC1306" bpmnElement="CC2563" isMarkerVisible="true">
        <t070 x="18673" y="393" width="50" height="50" />
      </t048>
      <t048 id="CC1888" bpmnElement="CC2972">
        <t070 x="18260" y="290" width="36" height="36" />
      </t048>
      <t048 id="CC1854" bpmnElement="CC2925">
        <t070 x="18210" y="290" width="36" height="36" />
      </t048>
      <t048 id="CC1852" bpmnElement="CC2931">
        <t070 x="18830" y="420" width="36" height="36" />
      </t048>
      <t045 id="CC2220" bpmnElement="CC3346">
        <t071 x="18278" y="240" />
        <t071 x="18840" y="240" />
      </t045>
      <t045 id="CC2268" bpmnElement="CC3403">
        <t071 x="18096" y="268" />
        <t071 x="18178" y="268" />
      </t045>
      <t045 id="CC2228" bpmnElement="CC3357">
        <t071 x="18866" y="438" />
        <t071 x="18908" y="438" />
        <t071 x="18908" y="416" />
      </t045>
      <t045 id="CC2193" bpmnElement="CC3317">
        <t071 x="18468" y="348" />
        <t071 x="18698" y="348" />
        <t071 x="18698" y="393" />
      </t045>
      <t045 id="CC2377" bpmnElement="CC3523">
        <t071 x="18468" y="488" />
        <t071 x="18698" y="488" />
        <t071 x="18698" y="443" />
      </t045>
      <t045 id="CC2249" bpmnElement="CC3380">
        <t071 x="18723" y="418" />
        <t071 x="18748" y="418" />
      </t045>
      <t045 id="CC2198" bpmnElement="CC3322">
        <t071 x="18228" y="326" />
        <t071 x="18228" y="488" />
        <t071 x="18368" y="488" />
      </t045>
      <t045 id="CC2349" bpmnElement="CC3492">
        <t071 x="18278" y="326" />
        <t071 x="18278" y="348" />
        <t071 x="18368" y="348" />
      </t045>
      <t045 id="CC2231" bpmnElement="CC3360">
        <t071 x="18848" y="398" />
        <t071 x="18890" y="398" />
      </t045>
      <t048 id="CC1335" bpmnElement="CC2601">
        <t070 x="19433" y="245" width="50" height="50" />
      </t048>
      <t048 id="CC1873" bpmnElement="CC2951">
        <t070 x="19560" y="152" width="36" height="36" />
      </t048>
      <t048 id="CC1069" bpmnElement="CC3747">
        <t070 x="19408" y="130" width="100" height="80" />
      </t048>
      <t048 id="CC1850" bpmnElement="CC2930">
        <t070 x="18840" y="1162" width="36" height="36" />
        <t046>
          <t070 x="18889" y="1166" width="71" height="27" />
        </t046>
      </t048>
      <t048 id="CC1140" bpmnElement="CC0967" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="18808" y="1040" width="100" height="80" />
      </t048>
      <t048 id="CC1088" bpmnElement="CC1227" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="17938" y="1040" width="100" height="80" />
      </t048>
      <t048 id="CC1936" bpmnElement="CC3042">
        <t070 x="19130" y="450" width="36" height="36" />
        <t046>
          <t070 x="19119" y="494" width="71" height="27" />
        </t046>
      </t048>
      <t048 id="CC1847" bpmnElement="CC2923">
        <t070 x="19140" y="1162" width="36" height="36" />
        <t046>
          <t070 x="19189" y="1166" width="71" height="27" />
        </t046>
      </t048>
      <t048 id="CC1098" bpmnElement="CC0699" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="19438" y="785" width="100" height="80" />
      </t048>
      <t048 id="CC1314" bpmnElement="CC2517">
        <t070 x="25121" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1322" bpmnElement="CC2533">
        <t070 x="25351" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1082" bpmnElement="CC1226" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="18248" y="1040" width="100" height="80" />
      </t048>
      <t048 id="CC1939" bpmnElement="CC3046">
        <t070 x="18280" y="1162" width="36" height="36" />
        <t046>
          <t070 x="18324" y="1166" width="71" height="27" />
        </t046>
      </t048>
      <t048 id="CC1065" bpmnElement="CC0841" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="18998" y="298" width="100" height="80" />
      </t048>
      <t048 id="CC1916" bpmnElement="CC3015">
        <t070 x="19130" y="320" width="36" height="36" />
        <t046>
          <t070 x="19119" y="364" width="71" height="27" />
        </t046>
      </t048>
      <t048 id="CC1136" bpmnElement="CC1216" bioc:stroke="#5b176d" bioc:fill="#e1bee7" color:background-color="#e1bee7" color:border-color="#5b176d">
        <t070 x="24546" y="668" width="100" height="80" />
      </t048>
      <t048 id="CC1307" bpmnElement="CC2564" isMarkerVisible="true">
        <t070 x="24761" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1818" bpmnElement="CC4136">
        <t070 x="24328" y="796" width="36" height="36" />
        <t046>
          <t070 x="24330" y="839" width="44" height="14" />
        </t046>
      </t048>
      <t048 id="CC1324" bpmnElement="CC2619">
        <t070 x="24211" y="683" width="50" height="50" />
      </t048>
      <t048 id="CC1894" bpmnElement="CC2726">
        <t070 x="24428" y="796" width="36" height="36" />
        <t046>
          <t070 x="24437" y="773" width="18" height="14" />
        </t046>
      </t048>
      <t048 id="CC1084" bpmnElement="CC1697" isExpanded="true">
        <t070 x="160" y="1121" width="590" height="300" />
      </t048>
      <t048 id="CC1278" bpmnElement="CC2516" isMarkerVisible="true">
        <t070 x="285" y="1246" width="50" height="50" />
        <t046>
          <t070 x="274" y="1224" width="71" height="14" />
        </t046>
      </t048>
      <t048 id="CC1913" bpmnElement="CC3008">
        <t070 x="542" y="1343" width="36" height="36" />
      </t048>
      <t048 id="CC1821" bpmnElement="CC2888">
        <t070 x="192" y="1253" width="36" height="36" />
      </t048>
      <t048 id="CC1900" bpmnElement="CC1270">
        <t070 x="692" y="1253" width="36" height="36" />
      </t048>
      <t048 id="CC1146" bpmnElement="CC0590" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="460" y="1231" width="100" height="80" />
        <t046 />
      </t048>
      <t045 id="CC2212" bpmnElement="CC3336">
        <t071 x="310" y="1296" />
        <t071 x="310" y="1361" />
        <t071 x="542" y="1361" />
        <t046>
          <t070 x="318" y="1308" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2216" bpmnElement="CC3341">
        <t071 x="335" y="1271" />
        <t071 x="460" y="1271" />
        <t046>
          <t070 x="374" y="1253" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2096" bpmnElement="CC3202">
        <t071 x="228" y="1271" />
        <t071 x="285" y="1271" />
      </t045>
      <t045 id="CC2327" bpmnElement="CC3468">
        <t071 x="560" y="1271" />
        <t071 x="692" y="1271" />
      </t045>
      <t048 id="CC1940" bpmnElement="CC0349" bioc:stroke="#000" bioc:fill="#fff">
        <t070 x="25780" y="1286" width="36" height="36" />
        <t046>
          <t070 x="25756" y="1262" width="84" height="14" />
        </t046>
      </t048>
      <t048 id="CC1922" bpmnElement="CC3019">
        <t070 x="26130" y="1286" width="36" height="36" />
      </t048>
      <t048 id="CC1111" bpmnElement="CC1359" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="25936" y="1264" width="100" height="80" />
      </t048>
      <t048 id="CC1103" bpmnElement="CC0779" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="11608" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1288" bpmnElement="CC2532" isMarkerVisible="true">
        <t070 x="11773" y="545" width="50" height="50" />
        <t046>
          <t070 x="11773" y="516" width="52" height="27" />
        </t046>
      </t048>
      <t048 id="CC1884" bpmnElement="CC2961">
        <t070 x="12120" y="934" width="36" height="36" />
      </t048>
      <t048 id="CC1121" bpmnElement="CC1363">
        <t070 x="11748" y="912" width="100" height="80" />
      </t048>
      <t048 id="CC1101" bpmnElement="CC0603" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="11938" y="912" width="100" height="80" />
      </t048>
      <t048 id="CC1878" bpmnElement="CC2980">
        <t070 x="5966" y="672" width="36" height="36" />
        <t046>
          <t070 x="5960" y="715" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1869" bpmnElement="CC3043">
        <t070 x="6254" y="672" width="36" height="36" />
        <t046>
          <t070 x="6248" y="715" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1895" bpmnElement="CC3031">
        <t070 x="6434" y="672" width="36" height="36" />
        <t046>
          <t070 x="6428" y="715" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1870" bpmnElement="CC3014">
        <t070 x="6604" y="672" width="36" height="36" />
        <t046>
          <t070 x="6598" y="718" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1937" bpmnElement="CC2959">
        <t070 x="7562" y="672" width="36" height="36" />
        <t046>
          <t070 x="7556" y="715" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1883" bpmnElement="CC2912">
        <t070 x="7720" y="672" width="36" height="36" />
        <t046>
          <t070 x="7714" y="715" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1822" bpmnElement="CC3025">
        <t070 x="9190" y="622" width="36" height="36" />
        <t046>
          <t070 x="9184" y="665" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1874" bpmnElement="CC2968">
        <t070 x="8259" y="642" width="36" height="36" />
      </t048>
      <t048 id="CC1106" bpmnElement="CC2671">
        <t070 x="11418" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1909" bpmnElement="CC0815">
        <t070 x="20612" y="828" width="36" height="36" />
        <t046>
          <t070 x="20602" y="871" width="68" height="14" />
        </t046>
      </t048>
      <t048 id="CC1344" bpmnElement="CC2611" isMarkerVisible="true">
        <t070 x="20773" y="683" width="50" height="50" />
      </t048>
      <t048 id="CC1127" bpmnElement="CC3095">
        <t070 x="12758" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1865" bpmnElement="CC2942">
        <t070 x="12844" y="625" width="36" height="36" />
        <t046>
          <t070 x="12838" y="668" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1134" bpmnElement="CC0859">
        <t070 x="11508" y="696" width="100" height="80" />
      </t048>
      <t048 id="CC1090" bpmnElement="CC0314" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="11508" y="870" width="100" height="80" />
      </t048>
      <t048 id="CC1890" bpmnElement="CC2978">
        <t070 x="11540" y="1002" width="36" height="36" />
      </t048>
      <t048 id="CC1810" bpmnElement="CC2876">
        <t070 x="11537" y="626" width="36" height="36" />
        <t046>
          <t070 x="11531" y="669" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1158" bpmnElement="CC2796" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="20748" y="806" width="100" height="80" />
      </t048>
      <t048 id="CC1302" bpmnElement="CC2553" isMarkerVisible="true">
        <t070 x="20953" y="683" width="50" height="50" />
        <t046>
          <t070 x="20933" y="619" width="90" height="53" />
        </t046>
      </t048>
      <t048 id="CC1827" bpmnElement="CC0768">
        <t070 x="21406" y="691" width="36" height="36" />
        <t046>
          <t070 x="21379" y="734" width="90" height="14" />
        </t046>
      </t048>
      <t048 id="CC1886" bpmnElement="CC0469">
        <t070 x="20780" y="949" width="36" height="36" />
        <t046>
          <t070 x="20768" y="995" width="70" height="14" />
        </t046>
      </t048>
      <t048 id="CC1282" bpmnElement="CC2522" isMarkerVisible="true">
        <t070 x="20953" y="821" width="50" height="50" />
        <t046>
          <t070 x="20911" y="805" width="51" height="27" />
        </t046>
      </t048>
      <t048 id="CC1128" bpmnElement="CC0879" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="21228" y="669" width="100" height="80" />
      </t048>
      <t048 id="CC1813" bpmnElement="CC0195">
        <t070 x="21100" y="828" width="36" height="36" />
        <t046>
          <t070 x="21073" y="874" width="90" height="40" />
        </t046>
      </t048>
      <t048 id="CC1902" bpmnElement="CC0589">
        <t070 x="21100" y="690" width="36" height="36" />
        <t046>
          <t070 x="21073" y="640" width="90" height="40" />
        </t046>
      </t048>
      <t048 id="CC1143" bpmnElement="CC1708" isExpanded="true">
        <t070 x="2560" y="1122" width="257" height="300" />
      </t048>
      <t048 id="CC1811" bpmnElement="CC2877">
        <t070 x="2732" y="1254" width="36" height="36" />
      </t048>
      <t048 id="CC1828" bpmnElement="CC0769">
        <t070 x="2612" y="1254" width="36" height="36" />
        <t046>
          <t070 x="2599" y="1297" width="68" height="40" />
        </t046>
      </t048>
      <t045 id="CC2209" bpmnElement="CC3333">
        <t071 x="2648" y="1272" />
        <t071 x="2732" y="1272" />
      </t045>
      <t048 id="CC1109" bpmnElement="CC0315" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="18518" y="1040" width="100" height="80" />
      </t048>
      <t048 id="CC1938" bpmnElement="CC3044">
        <t070 x="18550" y="1162" width="36" height="36" />
        <t046>
          <t070 x="18601" y="1167" width="68" height="27" />
        </t046>
      </t048>
      <t048 id="CC1303" bpmnElement="CC2557" isMarkerVisible="true">
        <t070 x="11963" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1120" bpmnElement="CC0386" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="11938" y="696" width="100" height="80" />
      </t048>
      <t048 id="CC1841" bpmnElement="CC2918">
        <t070 x="12120" y="722" width="36" height="36" />
        <t046>
          <t070 x="12114" y="765" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1334" bpmnElement="CC2598" isMarkerVisible="true">
        <t070 x="11773" y="711" width="50" height="50" />
      </t048>
      <t048 id="CC1928" bpmnElement="CC3929">
        <t070 x="6024" y="552" width="36" height="36" />
        <t046>
          <t070 x="6005" y="595" width="77" height="40" />
        </t046>
      </t048>
      <t048 id="CC1142" bpmnElement="CC1707" isExpanded="true">
        <t070 x="2830" y="1123" width="405" height="300" />
      </t048>
      <t048 id="CC1881" bpmnElement="CC3047">
        <t070 x="3142" y="1255" width="36" height="36" />
      </t048>
      <t048 id="CC1087" bpmnElement="CC0679" bioc:stroke="black" bioc:fill="white">
        <t070 x="2990" y="1233" width="100" height="80" />
      </t048>
      <t048 id="CC1831" bpmnElement="CC2005">
        <t070 x="2872" y="1255" width="36" height="36" />
        <t046>
          <t070 x="2861" y="1298" width="60" height="14" />
        </t046>
      </t048>
      <t045 id="CC2394" bpmnElement="CC3541">
        <t071 x="2908" y="1273" />
        <t071 x="2990" y="1273" />
      </t045>
      <t045 id="CC2083" bpmnElement="CC3187">
        <t071 x="3090" y="1273" />
        <t071 x="3142" y="1273" />
      </t045>
      <t048 id="CC1325" bpmnElement="CC2588" isMarkerVisible="true">
        <t070 x="16563" y="545" width="50" height="50" />
        <t046>
          <t070 x="16554" y="515" width="85" height="27" />
        </t046>
      </t048>
      <t048 id="CC1318" bpmnElement="CC2581" isMarkerVisible="true">
        <t070 x="17003" y="545" width="50" height="50" />
        <t046>
          <t070 x="16997" y="519" width="63" height="14" />
        </t046>
      </t048>
      <t048 id="CC1070" bpmnElement="CC0146" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="17137" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1076" bpmnElement="CC0173" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="17137" y="787" width="100" height="80" />
      </t048>
      <t048 id="CC1067" bpmnElement="CC1977" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="16978" y="787" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1247" bpmnElement="CC0606" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="17298" y="787" width="100" height="80" />
      </t048>
      <t048 id="CC1319" bpmnElement="CC2582" isMarkerVisible="true">
        <t070 x="13293" y="545" width="50" height="50" />
        <t046>
          <t070 x="13281" y="516" width="82" height="27" />
        </t046>
      </t048>
      <t048 id="CC1317" bpmnElement="CC2579" isMarkerVisible="true">
        <t070 x="13493" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1108" bpmnElement="CC0290" bioc:stroke="#000000" bioc:fill="#ffffff" color:background-color="#ffffff" color:border-color="#000000">
        <t070 x="13378" y="690" width="100" height="80" />
      </t048>
      <t048 id="CC1846" bpmnElement="CC2922">
        <t070 x="13450" y="811" width="36" height="36" />
        <t046>
          <t070 x="13444" y="854" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1328" bpmnElement="CC2590" isMarkerVisible="true">
        <t070 x="27271" y="545" width="50" height="50" />
        <t046>
          <t070 x="27258" y="500" width="82" height="40" />
        </t046>
      </t048>
      <t048 id="CC1150" bpmnElement="CC0756" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="27246" y="662" width="100" height="80" />
      </t048>
      <t048 id="CC1313" bpmnElement="CC2577" isMarkerVisible="true">
        <t070 x="27431" y="677" width="50" height="50" />
        <t046>
          <t070 x="27373" y="657" width="86" height="27" />
        </t046>
      </t048>
      <t048 id="CC1094" bpmnElement="CC0689" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="27566" y="662" width="100" height="80" />
      </t048>
      <t048 id="CC1155" bpmnElement="CC0240" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="27928" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1115" bpmnElement="CC2821">
        <t070 x="2092" y="1231" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1868" bpmnElement="CC2945">
        <t070 x="212" y="552" width="36" height="36" />
      </t048>
      <t048 id="CC1089" bpmnElement="CC0546" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="382" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1104" bpmnElement="CC3917" bioc:stroke="#000000" bioc:fill="#ffffff" color:background-color="#ffffff" color:border-color="#000000">
        <t070 x="2102" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1840" bpmnElement="CC2917">
        <t070 x="2224" y="672" width="36" height="36" />
        <t046>
          <t070 x="2218" y="715" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1066" bpmnElement="CC3114">
        <t070 x="2352" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1147" bpmnElement="CC0684">
        <t070 x="3990" y="620" width="100" height="80" />
      </t048>
      <t048 id="CC1815" bpmnElement="CC0331">
        <t070 x="4142" y="642" width="36" height="36" />
        <t046>
          <t070 x="4127" y="688" width="72" height="40" />
        </t046>
      </t048>
      <t048 id="CC1273" bpmnElement="CC2510" isMarkerVisible="true">
        <t070 x="3145" y="635" width="50" height="50" />
        <t046>
          <t070 x="3131" y="605" width="87" height="27" />
        </t046>
      </t048>
      <t048 id="CC1858" bpmnElement="CC2933">
        <t070 x="2900" y="796" width="36" height="36" />
        <t046>
          <t070 x="2847" y="772" width="65" height="27" />
        </t046>
      </t048>
      <t048 id="CC1918" bpmnElement="CC3016">
        <t070 x="4022" y="796" width="36" height="36" />
        <t046>
          <t070 x="4016" y="839" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1824" bpmnElement="CC2891">
        <t070 x="2384" y="672" width="36" height="36" />
        <t046>
          <t070 x="2378" y="715" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1301" bpmnElement="CC2552" isMarkerVisible="true">
        <t070 x="26461" y="545" width="50" height="50" />
        <t046>
          <t070 x="26449" y="495" width="74" height="40" />
        </t046>
      </t048>
      <t048 id="CC1246" bpmnElement="CC0320">
        <t070 x="26616" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1284" bpmnElement="CC2527" isMarkerVisible="true">
        <t070 x="26821" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1092" bpmnElement="CC1034" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="26556" y="662" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1114" bpmnElement="CC2687" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="26696" y="662" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1530" bpmnElement="CC3006">
        <t070 x="15265" y="672" width="36" height="36" />
        <t046>
          <t070 x="15258" y="715" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1599" bpmnElement="CC0934">
        <t070 x="16676" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1296" bpmnElement="CC2546" isMarkerVisible="true">
        <t070 x="16863" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1297" bpmnElement="CC2547" isMarkerVisible="true">
        <t070 x="17003" y="665" width="50" height="50" />
        <t046>
          <t070 x="16926" y="683" width="67" height="14" />
        </t046>
      </t048>
      <t048 id="CC1340" bpmnElement="CC2608" isMarkerVisible="true">
        <t070 x="17323" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1095" bpmnElement="CC4121" bioc:stroke="#000000" bioc:fill="#ffffff" color:background-color="#ffffff" color:border-color="#000000">
        <t070 x="17137" y="650" width="100" height="80" />
      </t048>
      <t048 id="CC1910" bpmnElement="CC3004">
        <t070 x="17480" y="809" width="36" height="36" />
        <t046>
          <t070 x="17460" y="852" width="77" height="14" />
        </t046>
      </t048>
      <t048 id="CC1132" bpmnElement="CC1706" isExpanded="true">
        <t070 x="796" y="1119" width="454" height="300" />
      </t048>
      <t048 id="CC1515" bpmnElement="CC3024">
        <t070 x="823" y="1251" width="36" height="36" />
      </t048>
      <t048 id="CC1425" bpmnElement="CC2916">
        <t070 x="923" y="1351" width="36" height="36" />
      </t048>
      <t048 id="CC1560" bpmnElement="CC4196" isMarkerVisible="true">
        <t070 x="916" y="1244" width="50" height="50" />
        <t046>
          <t070 x="902" y="1199" width="82" height="40" />
        </t046>
      </t048>
      <t048 id="CC1413" bpmnElement="CC2937">
        <t070 x="1162" y="1251" width="36" height="36" />
      </t048>
      <t048 id="CC1308" bpmnElement="CC0655">
        <t070 x="1065" y="1244" width="50" height="50" />
      </t048>
      <t048 id="CC1826" bpmnElement="CC3027">
        <t070 x="1112" y="1331" width="36" height="36" />
        <t046>
          <t070 x="1093" y="1374" width="75" height="27" />
        </t046>
      </t048>
      <t045 id="CC1719" bpmnElement="CC3564">
        <t071 x="859" y="1269" />
        <t071 x="916" y="1269" />
      </t045>
      <t045 id="CC1766" bpmnElement="CC3285">
        <t071 x="941" y="1294" />
        <t071 x="941" y="1351" />
        <t046>
          <t070 x="946" y="1319" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC1745" bpmnElement="CC3545">
        <t071 x="966" y="1269" />
        <t071 x="1065" y="1269" />
        <t046>
          <t070 x="975" y="1247" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2166" bpmnElement="CC3289">
        <t071 x="1115" y="1269" />
        <t071 x="1162" y="1269" />
      </t045>
      <t045 id="CC2466" bpmnElement="CC3623">
        <t071 x="1090" y="1294" />
        <t071 x="1090" y="1349" />
        <t071 x="1112" y="1349" />
      </t045>
      <t048 id="CC1496" bpmnElement="CC1699" isExpanded="true">
        <t070 x="1260" y="1121" width="540" height="300" />
      </t048>
      <t048 id="CC1579" bpmnElement="CC0592" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="1490" y="1231" width="100" height="80" />
      </t048>
      <t048 id="CC1577" bpmnElement="CC2881">
        <t070 x="1342" y="1253" width="36" height="36" />
      </t048>
      <t048 id="CC1889" bpmnElement="CC2976">
        <t070 x="1662" y="1253" width="36" height="36" />
      </t048>
      <t045 id="CC1725" bpmnElement="CC3557">
        <t071 x="1378" y="1271" />
        <t071 x="1490" y="1271" />
      </t045>
      <t045 id="CC2065" bpmnElement="CC3167">
        <t071 x="1590" y="1271" />
        <t071 x="1662" y="1271" />
      </t045>
      <t048 id="CC1129" bpmnElement="CC1704" isExpanded="true">
        <t070 x="3250" y="1117" width="880" height="308" />
      </t048>
      <t048 id="CC1561" bpmnElement="CC2779" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="3660" y="1177" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1327" bpmnElement="CC0833" isMarkerVisible="true">
        <t070 x="3438" y="1192" width="50" height="50" />
        <t046>
          <t070 x="3437" y="1170" width="58" height="14" />
        </t046>
      </t048>
      <t048 id="CC1851" bpmnElement="CC0744">
        <t070 x="3335" y="1199" width="36" height="36" />
        <t046>
          <t070 x="3316" y="1242" width="75" height="27" />
        </t046>
      </t048>
      <t048 id="CC1475" bpmnElement="CC0356" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="3900" y="1177" width="100" height="80" />
      </t048>
      <t048 id="CC1295" bpmnElement="CC2545" isMarkerVisible="true">
        <t070 x="3675" y="1302" width="50" height="50" />
      </t048>
      <t048 id="CC1921" bpmnElement="CC2958">
        <t070 x="4068" y="1362" width="36" height="36" />
      </t048>
      <t048 id="CC1848" bpmnElement="CC2941">
        <t070 x="4068" y="1199" width="36" height="36" />
      </t048>
      <t048 id="CC1817" bpmnElement="CC2883">
        <t070 x="3781" y="1309" width="36" height="36" />
        <t046>
          <t070 x="3769" y="1352" width="65" height="27" />
        </t046>
      </t048>
      <t048 id="CC1924" bpmnElement="CC2971">
        <t070 x="3597" y="1309" width="36" height="36" />
      </t048>
      <t048 id="CC1857" bpmnElement="CC1026">
        <t070 x="3682" y="1239" width="36" height="36" />
      </t048>
      <t045 id="CC2303" bpmnElement="CC2662">
        <t071 x="3488" y="1217" />
        <t071 x="3660" y="1217" />
        <t046>
          <t070 x="3568" y="1199" width="18" height="14" />
        </t046>
      </t045>
      <t045 id="CC2401" bpmnElement="CC3549">
        <t071 x="3760" y="1217" />
        <t071 x="3900" y="1217" />
      </t045>
      <t045 id="CC2278" bpmnElement="CC3413">
        <t071 x="3371" y="1217" />
        <t071 x="3438" y="1217" />
      </t045>
      <t045 id="CC2450" bpmnElement="CC4059">
        <t071 x="3463" y="1242" />
        <t071 x="3463" y="1380" />
        <t071 x="4068" y="1380" />
        <t046>
          <t070 x="3469" y="1308" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2086" bpmnElement="CC3190">
        <t071 x="3817" y="1327" />
        <t071 x="3849" y="1327" />
        <t071 x="3849" y="1237" />
        <t071 x="3900" y="1237" />
      </t045>
      <t045 id="CC2369" bpmnElement="CC3512">
        <t071 x="4000" y="1217" />
        <t071 x="4068" y="1217" />
      </t045>
      <t045 id="CC2261" bpmnElement="CC3396">
        <t071 x="3700" y="1275" />
        <t071 x="3700" y="1302" />
        <t071 x="3700" y="1327" />
      </t045>
      <t045 id="CC2375" bpmnElement="CC3521">
        <t071 x="3725" y="1327" />
        <t071 x="3781" y="1327" />
      </t045>
      <t045 id="CC2237" bpmnElement="CC3366">
        <t071 x="3675" y="1327" />
        <t071 x="3633" y="1327" />
      </t045>
      <t045 id="CC2061" bpmnElement="CC3163">
        <t071 x="3615" y="1309" />
        <t071 x="3615" y="1247" />
        <t071 x="3660" y="1247" />
      </t045>
      <t048 id="CC1513" bpmnElement="CC2964">
        <t070 x="17610" y="1412" width="36" height="36" />
        <t046>
          <t070 x="17600" y="1455" width="71" height="27" />
        </t046>
      </t048>
      <t048 id="CC1582" bpmnElement="CC2540" isMarkerVisible="true">
        <t070 x="18023" y="1405" width="50" height="50" />
        <t046>
          <t070 x="18014" y="1375" width="81" height="27" />
        </t046>
      </t048>
      <t048 id="CC1556" bpmnElement="CC0122" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="17838" y="1390" width="100" height="80" />
      </t048>
      <t048 id="CC1911" bpmnElement="CC3034">
        <t070 x="18250" y="1412" width="36" height="36" />
      </t048>
      <t048 id="CC1919" bpmnElement="CC2889">
        <t070 x="18250" y="1552" width="36" height="36" />
      </t048>
      <t048 id="CC1880" bpmnElement="CC2893">
        <t070 x="18250" y="1632" width="36" height="36" />
        <t046>
          <t070 x="18234" y="1675" width="75" height="27" />
        </t046>
      </t048>
      <t048 id="CC1316" bpmnElement="CC2591">
        <t070 x="17713" y="1405" width="50" height="50" />
      </t048>
      <t048 id="CC1539" bpmnElement="CC0639" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="17998" y="1530" width="100" height="80" />
      </t048>
      <t048 id="CC1893" bpmnElement="CC2989">
        <t070 x="11010" y="672" width="36" height="36" />
        <t046>
          <t070 x="11004" y="715" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1336" bpmnElement="CC2603" isMarkerVisible="true">
        <t070 x="11105" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1290" bpmnElement="CC2539" isMarkerVisible="true">
        <t070 x="11235" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1451" bpmnElement="CC2729" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="11080" y="668" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1321" bpmnElement="CC2584" isMarkerVisible="true">
        <t070 x="11235" y="683" width="50" height="50" />
      </t048>
      <t048 id="CC1492" bpmnElement="CC3032">
        <t070 x="11108" y="856" width="36" height="36" />
      </t048>
      <t048 id="CC1343" bpmnElement="CC2610" isMarkerVisible="true">
        <t070 x="12153" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1283" bpmnElement="CC2523" isMarkerVisible="true">
        <t070 x="12963" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1871" bpmnElement="CC2949">
        <t070 x="12360" y="744" width="36" height="36" />
        <t046>
          <t070 x="12351" y="787" width="56" height="14" />
        </t046>
      </t048>
      <t048 id="CC1432" bpmnElement="CC0637" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="10548" y="650" width="100" height="80" />
      </t048>
      <t048 id="CC1131" bpmnElement="CC2015">
        <t070 x="10428" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1063" bpmnElement="CC2646">
        <t070 x="13648" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1581" bpmnElement="CC0286" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="13610" y="690" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1872" bpmnElement="CC2950">
        <t070 x="13642" y="822" width="36" height="36" />
        <t046>
          <t070 x="13629" y="858" width="71" height="27" />
        </t046>
      </t048>
      <t048 id="CC1463" bpmnElement="CC0170">
        <t070 x="5722" y="552" width="36" height="36" />
        <t046>
          <t070 x="5709" y="595" width="75" height="27" />
        </t046>
      </t048>
      <t048 id="CC1564" bpmnElement="CC1702" isExpanded="true">
        <t070 x="4151" y="1119" width="578" height="300" />
        <t046 />
      </t048>
      <t048 id="CC1466" bpmnElement="CC2939">
        <t070 x="4643" y="1251" width="36" height="36" />
      </t048>
      <t048 id="CC1543" bpmnElement="CC0181">
        <t070 x="4173" y="1251" width="36" height="36" />
        <t046>
          <t070 x="4158" y="1294" width="75" height="27" />
        </t046>
      </t048>
      <t048 id="CC1430" bpmnElement="CC1007" bioc:stroke="#43a047" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#43a047">
        <t070 x="4341" y="1229" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1548" bpmnElement="CC0383" bioc:stroke="#43a047" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#43a047">
        <t070 x="4501" y="1229" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1332" bpmnElement="CC2596" isMarkerVisible="true">
        <t070 x="4366" y="1354" width="50" height="50" />
      </t048>
      <t048 id="CC1882" bpmnElement="CC2960">
        <t070 x="4473" y="1361" width="36" height="36" />
        <t046>
          <t070 x="4457" y="1404" width="76" height="14" />
        </t046>
      </t048>
      <t048 id="CC1517" bpmnElement="CC2879">
        <t070 x="4373" y="1291" width="36" height="36" />
      </t048>
      <t045 id="CC2159" bpmnElement="CC3280">
        <t071 x="4601" y="1269" />
        <t071 x="4643" y="1269" />
      </t045>
      <t045 id="CC1738" bpmnElement="CC3416">
        <t071 x="4209" y="1269" />
        <t071 x="4341" y="1269" />
      </t045>
      <t045 id="CC2312" bpmnElement="CC3453">
        <t071 x="4366" y="1379" />
        <t071 x="4301" y="1379" />
        <t071 x="4301" y="1299" />
        <t071 x="4341" y="1299" />
        <t046>
          <t070 x="4305" y="1333" width="55" height="14" />
        </t046>
      </t045>
      <t045 id="CC1712" bpmnElement="CC3301">
        <t071 x="4441" y="1269" />
        <t071 x="4501" y="1269" />
      </t045>
      <t045 id="CC2271" bpmnElement="CC3406">
        <t071 x="4509" y="1379" />
        <t071 x="4551" y="1379" />
        <t071 x="4551" y="1309" />
      </t045>
      <t045 id="CC1742" bpmnElement="CC3610">
        <t071 x="4391" y="1327" />
        <t071 x="4391" y="1354" />
      </t045>
      <t045 id="CC2398" bpmnElement="CC3546">
        <t071 x="4416" y="1379" />
        <t071 x="4473" y="1379" />
      </t045>
      <t048 id="CC1275" bpmnElement="CC2512" isMarkerVisible="true">
        <t070 x="28660" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1423" bpmnElement="CC3714" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="29238" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1431" bpmnElement="CC3742" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="29439" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1436" bpmnElement="CC2927">
        <t070 x="29600" y="552" width="36" height="36" />
      </t048>
      <t048 id="CC1596" bpmnElement="CC1024" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="28908" y="875" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1447" bpmnElement="CC2605" isMarkerVisible="true">
        <t070 x="29069" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1583" bpmnElement="CC2566">
        <t070 x="28797" y="755" width="50" height="50" />
      </t048>
      <t048 id="CC1489" bpmnElement="CC0791" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="28908" y="740" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1497" bpmnElement="CC2580">
        <t070 x="29069" y="755" width="50" height="50" />
      </t048>
      <t048 id="CC1457" bpmnElement="CC3013" bioc:stroke="#000" bioc:fill="#fff">
        <t070 x="28804" y="667" width="36" height="36" />
        <t046>
          <t070 x="28726" y="678" width="68" height="14" />
        </t046>
      </t048>
      <t048 id="CC1524" bpmnElement="CC2535" isMarkerVisible="true" bioc:stroke="#000" bioc:fill="#fff">
        <t070 x="28797" y="545" width="50" height="50" />
        <t046>
          <t070 x="28834" y="523" width="72" height="14" />
        </t046>
      </t048>
      <t048 id="CC1574" bpmnElement="CC2614" isMarkerVisible="true" bioc:stroke="#000" bioc:fill="#fff">
        <t070 x="28227" y="545" width="50" height="50" />
        <t046>
          <t070 x="28218" y="523" width="83" height="14" />
        </t046>
      </t048>
      <t048 id="CC1855" bpmnElement="CC2962" bioc:stroke="#000" bioc:fill="#fff">
        <t070 x="29190" y="647" width="36" height="36" />
        <t046>
          <t070 x="29202" y="690" width="19" height="14" />
        </t046>
      </t048>
      <t048 id="CC1151" bpmnElement="CC0242" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="27758" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1154" bpmnElement="CC1630" bioc:stroke="#1e88e5" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#1e88e5">
        <t070 x="27566" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1468" bpmnElement="CC0640" bioc:stroke="rgb(67, 160, 71)" bioc:fill="rgb(200, 230, 201)">
        <t070 x="26145" y="660" width="100" height="80" />
      </t048>
      <t048 id="CC1421" bpmnElement="CC2585" isMarkerVisible="true" bioc:stroke="#000" bioc:fill="#fff">
        <t070 x="25463" y="545" width="50" height="50" />
        <t046>
          <t070 x="25447" y="495" width="82" height="40" />
        </t046>
      </t048>
      <t048 id="CC1563" bpmnElement="CC2617" isMarkerVisible="true">
        <t070 x="26361" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1578" bpmnElement="CC1212" bioc:stroke="#1e88e5" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#1e88e5">
        <t070 x="25971" y="660" width="100" height="80" />
      </t048>
      <t048 id="CC1428" bpmnElement="CC2907" bioc:stroke="#000" bioc:fill="#fff">
        <t070 x="25563" y="682" width="36" height="36" />
        <t046>
          <t070 x="25556" y="658" width="49" height="14" />
        </t046>
      </t048>
      <t048 id="CC1591" bpmnElement="CC0632" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="25673" y="660" width="100" height="80" />
      </t048>
      <t048 id="CC1521" bpmnElement="CC2602" isMarkerVisible="true" bioc:stroke="#000" bioc:fill="#fff">
        <t070 x="25847" y="675" width="50" height="50" />
        <t046>
          <t070 x="25827" y="653" width="90" height="14" />
        </t046>
      </t048>
      <t048 id="CC1554" bpmnElement="CC2882" bioc:stroke="#000" bioc:fill="#fff">
        <t070 x="25854" y="804" width="36" height="36" />
        <t046>
          <t070 x="25830" y="847" width="84" height="14" />
        </t046>
      </t048>
      <t048 id="CC1312" bpmnElement="CC2574" isMarkerVisible="true">
        <t070 x="26170" y="797" width="50" height="50" />
        <t046>
          <t070 x="26101" y="808" width="59" height="27" />
        </t046>
      </t048>
      <t048 id="CC1294" bpmnElement="CC2544" isMarkerVisible="true">
        <t070 x="26170" y="923" width="50" height="50" />
        <t046>
          <t070 x="26176" y="983" width="54" height="40" />
        </t046>
      </t048>
      <t048 id="CC1449" bpmnElement="CC0809">
        <t070 x="26336" y="908" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1499" bpmnElement="CC3033">
        <t070 x="25563" y="930" width="36" height="36" />
        <t046>
          <t070 x="25550" y="976" width="72" height="27" />
        </t046>
      </t048>
      <t048 id="CC1130" bpmnElement="CC0540" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="24048" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1514" bpmnElement="CC2701" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="24186" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1504" bpmnElement="CC1022" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="670" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1538" bpmnElement="CC1631" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="860" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1287" bpmnElement="CC2531" isMarkerVisible="true">
        <t070 x="2893" y="545" width="50" height="50" />
        <t046>
          <t070 x="2929" y="543" width="90" height="14" />
        </t046>
      </t048>
      <t048 id="CC1342" bpmnElement="CC2609" isMarkerVisible="true">
        <t070 x="5325" y="545" width="50" height="50" />
        <t046>
          <t070 x="5363" y="510" width="58" height="40" />
        </t046>
      </t048>
      <t048 id="CC1123" bpmnElement="CC0972">
        <t070 x="5300" y="682" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1453" bpmnElement="CC3002">
        <t070 x="5332" y="958" width="36" height="36" />
      </t048>
      <t048 id="CC1502" bpmnElement="CC0949" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="5540" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1080" bpmnElement="CC1695" isExpanded="true">
        <t070 x="21918" y="390" width="1370" height="720" />
        <t046 />
      </t048>
      <t048 id="CC1853" bpmnElement="CC2932">
        <t070 x="21958" y="479" width="36" height="36" />
      </t048>
      <t048 id="CC1501" bpmnElement="CC2537" isMarkerVisible="true">
        <t070 x="22033" y="472" width="50" height="50" />
        <t046>
          <t070 x="22026" y="450" width="68" height="14" />
        </t046>
      </t048>
      <t048 id="CC1478" bpmnElement="CC2548" isMarkerVisible="true">
        <t070 x="23093" y="472" width="50" height="50" />
      </t048>
      <t048 id="CC1568" bpmnElement="CC2033" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="22238" y="667" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1435" bpmnElement="CC2571" isMarkerVisible="true">
        <t070 x="22493" y="682" width="50" height="50" />
      </t048>
      <t048 id="CC1512" bpmnElement="CC0868">
        <t070 x="22858" y="897" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1537" bpmnElement="CC2993">
        <t070 x="22500" y="809" width="36" height="36" />
      </t048>
      <t048 id="CC1519" bpmnElement="CC2974">
        <t070 x="22270" y="549" width="36" height="36" />
        <t046>
          <t070 x="22277" y="535" width="22" height="14" />
        </t046>
      </t048>
      <t048 id="CC1429" bpmnElement="CC0803" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="22858" y="667" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1486" bpmnElement="CC2618">
        <t070 x="22653" y="682" width="50" height="50" />
      </t048>
      <t048 id="CC1469" bpmnElement="CC2567">
        <t070 x="22653" y="912" width="50" height="50" />
      </t048>
      <t048 id="CC1484" bpmnElement="CC2982">
        <t070 x="23020" y="689" width="36" height="36" />
      </t048>
      <t048 id="CC1509" bpmnElement="CC2524" isMarkerVisible="true">
        <t070 x="22263" y="913" width="50" height="50" />
      </t048>
      <t048 id="CC1533" bpmnElement="CC2987">
        <t070 x="22040" y="809" width="36" height="36" />
        <t046>
          <t070 x="22070" y="797" width="16" height="14" />
        </t046>
      </t048>
      <t048 id="CC1551" bpmnElement="CC2526">
        <t070 x="22883" y="802" width="50" height="50" />
      </t048>
      <t048 id="CC1452" bpmnElement="CC2845">
        <t070 x="22140" y="689" width="36" height="36" />
        <t046>
          <t070 x="22127" y="728" width="65" height="14" />
        </t046>
      </t048>
      <t048 id="CC1498" bpmnElement="CC2558" isMarkerVisible="true">
        <t070 x="22493" y="912" width="50" height="50" />
      </t048>
      <t048 id="CC1920" bpmnElement="CC3017">
        <t070 x="23190" y="479" width="36" height="36" />
      </t048>
      <t048 id="CC1522" bpmnElement="CC2988">
        <t070 x="22270" y="729" width="36" height="36" />
      </t048>
      <t045 id="CC2402" bpmnElement="CC3550">
        <t071 x="21994" y="497" />
        <t071 x="22033" y="497" />
      </t045>
      <t045 id="CC1769" bpmnElement="CC3197">
        <t071 x="22083" y="497" />
        <t071 x="23093" y="497" />
      </t045>
      <t045 id="CC1768" bpmnElement="CC3276">
        <t071 x="22058" y="522" />
        <t071 x="22058" y="707" />
        <t071 x="22140" y="707" />
      </t045>
      <t045 id="CC1765" bpmnElement="CC3609">
        <t071 x="22678" y="682" />
        <t071 x="22678" y="497" />
        <t071 x="23093" y="497" />
      </t045>
      <t045 id="CC1748" bpmnElement="CC3442">
        <t071 x="22933" y="827" />
        <t071 x="23118" y="827" />
        <t071 x="23118" y="522" />
      </t045>
      <t045 id="CC2127" bpmnElement="CC3241">
        <t071 x="23143" y="497" />
        <t071 x="23190" y="497" />
      </t045>
      <t045 id="CC1753" bpmnElement="CC3225">
        <t071 x="22176" y="707" />
        <t071 x="22238" y="707" />
      </t045>
      <t045 id="CC1763" bpmnElement="CC3356">
        <t071 x="22338" y="707" />
        <t071 x="22493" y="707" />
      </t045>
      <t045 id="CC1717" bpmnElement="CC3601">
        <t071 x="22543" y="707" />
        <t071 x="22653" y="707" />
        <t046>
          <t070 x="22553" y="693" width="78" height="14" />
        </t046>
      </t045>
      <t045 id="CC1757" bpmnElement="CC3415">
        <t071 x="22518" y="732" />
        <t071 x="22518" y="809" />
        <t046>
          <t070 x="22528" y="742" width="50" height="27" />
        </t046>
      </t045>
      <t045 id="CC1743" bpmnElement="CC3347">
        <t071 x="22518" y="682" />
        <t071 x="22518" y="567" />
        <t071 x="22306" y="567" />
        <t046>
          <t070 x="22399" y="552" width="40" height="14" />
        </t046>
      </t045>
      <t045 id="CC1720" bpmnElement="CC3452">
        <t071 x="22703" y="937" />
        <t071 x="22858" y="937" />
      </t045>
      <t045 id="CC1749" bpmnElement="CC3204">
        <t071 x="22958" y="937" />
        <t071 x="22988" y="937" />
        <t071 x="22988" y="957" />
        <t071 x="22958" y="957" />
      </t045>
      <t045 id="CC1729" bpmnElement="CC3169">
        <t071 x="22908" y="897" />
        <t071 x="22908" y="852" />
      </t045>
      <t045 id="CC1775" bpmnElement="CC3389">
        <t071 x="22518" y="845" />
        <t071 x="22518" y="912" />
      </t045>
      <t045 id="CC1774" bpmnElement="CC3562">
        <t071 x="22270" y="567" />
        <t071 x="22058" y="567" />
        <t071 x="22058" y="707" />
        <t071 x="22140" y="707" />
      </t045>
      <t045 id="CC1752" bpmnElement="CC3616">
        <t071 x="22703" y="937" />
        <t071 x="22768" y="937" />
        <t071 x="22768" y="707" />
        <t071 x="22858" y="707" />
      </t045>
      <t045 id="CC1732" bpmnElement="CC3227">
        <t071 x="22703" y="707" />
        <t071 x="22858" y="707" />
      </t045>
      <t045 id="CC1754" bpmnElement="CC3648">
        <t071 x="22908" y="802" />
        <t071 x="22908" y="747" />
      </t045>
      <t045 id="CC1724" bpmnElement="CC3514">
        <t071 x="22958" y="707" />
        <t071 x="23020" y="707" />
      </t045>
      <t045 id="CC1723" bpmnElement="CC3515">
        <t071 x="22543" y="937" />
        <t071 x="22653" y="937" />
      </t045>
      <t045 id="CC1758" bpmnElement="CC3218">
        <t071 x="22288" y="765" />
        <t071 x="22288" y="913" />
        <t046>
          <t070 x="15459" y="807" width="20" height="14" />
        </t046>
      </t045>
      <t045 id="CC1759" bpmnElement="CC3229">
        <t071 x="22312" y="937" />
        <t071 x="22493" y="937" />
      </t045>
      <t045 id="CC1728" bpmnElement="CC3339">
        <t071 x="22263" y="938" />
        <t071 x="22058" y="938" />
        <t071 x="22058" y="845" />
        <t046>
          <t070 x="22223" y="919" width="40" height="14" />
        </t046>
      </t045>
      <t045 id="CC1764" bpmnElement="CC3386">
        <t071 x="22058" y="809" />
        <t071 x="22058" y="707" />
        <t071 x="22140" y="707" />
      </t045>
      <t048 id="CC1482" bpmnElement="CC1698" isExpanded="true">
        <t070 x="4750" y="1119" width="365" height="252" />
        <t046 />
      </t048>
      <t048 id="CC1520" bpmnElement="CC3045">
        <t070 x="5048" y="1202" width="36" height="36" />
      </t048>
      <t048 id="CC1576" bpmnElement="CC3023">
        <t070 x="4794" y="1202" width="36" height="36" />
        <t046>
          <t070 x="4776" y="1245" width="74" height="14" />
        </t046>
      </t048>
      <t048 id="CC1511" bpmnElement="CC1019" bioc:stroke="#43a047" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#43a047">
        <t070 x="4880" y="1180" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1843" bpmnElement="CC3021">
        <t070 x="4912" y="1242" width="36" height="36" />
      </t048>
      <t045 id="CC2417" bpmnElement="CC3569">
        <t071 x="4980" y="1220" />
        <t071 x="5048" y="1220" />
      </t045>
      <t045 id="CC2207" bpmnElement="CC3331">
        <t071 x="4930" y="1278" />
        <t071 x="4930" y="1298" />
        <t071 x="5003" y="1298" />
        <t071 x="5003" y="1220" />
        <t071 x="5048" y="1220" />
      </t045>
      <t045 id="CC2262" bpmnElement="CC3397">
        <t071 x="4830" y="1220" />
        <t071 x="4880" y="1220" />
      </t045>
      <t048 id="CC1507" bpmnElement="CC0701" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="8468" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1442" bpmnElement="CC0583" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="8727" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1544" bpmnElement="CC2977">
        <t070 x="8883" y="552" width="36" height="36" />
        <t046>
          <t070 x="8864" y="515" width="74" height="27" />
        </t046>
      </t048>
      <t048 id="CC1119" bpmnElement="CC2001">
        <t070 x="4364" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1454" bpmnElement="CC3022">
        <t070 x="4480" y="619" width="36" height="36" />
        <t046>
          <t070 x="4474" y="662" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1292" bpmnElement="CC2599" isMarkerVisible="true">
        <t070 x="21743" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1074" bpmnElement="CC0355" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="21718" y="660" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1547" bpmnElement="CC0591">
        <t070 x="21770" y="792" width="36" height="36" />
        <t046>
          <t070 x="21813" y="797" width="81" height="27" />
        </t046>
      </t048>
      <t048 id="CC1575" bpmnElement="CC0241" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="21718" y="878" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1839" bpmnElement="CC2913">
        <t070 x="21750" y="1002" width="36" height="36" />
      </t048>
      <t048 id="CC1464" bpmnElement="CC2910">
        <t070 x="21720" y="792" width="36" height="36" />
        <t046>
          <t070 x="21645" y="791" width="73" height="40" />
        </t046>
      </t048>
      <t048 id="CC1443" bpmnElement="CC0867">
        <t070 x="10127" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1494" bpmnElement="CC2894">
        <t070 x="10230" y="630" width="36" height="36" />
        <t046>
          <t070 x="10224" y="673" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1339" bpmnElement="CC2554">
        <t070 x="20433" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1338" bpmnElement="CC2565">
        <t070 x="20773" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1281" bpmnElement="CC2521" isMarkerVisible="true">
        <t070 x="10023" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1298" bpmnElement="CC2549" isMarkerVisible="true">
        <t070 x="10287" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1346" bpmnElement="CC2615" isMarkerVisible="true">
        <t070 x="1768" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1477" bpmnElement="CC3009">
        <t070 x="1775" y="1002" width="36" height="36" />
      </t048>
      <t048 id="CC1279" bpmnElement="CC2519" isMarkerVisible="true">
        <t070 x="545" y="545" width="50" height="50" />
        <t046>
          <t070 x="536" y="523" width="71" height="14" />
        </t046>
      </t048>
      <t048 id="CC1437" bpmnElement="CC0282" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="670" y="746" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1073" bpmnElement="CC0755" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="9260" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1137" bpmnElement="CC1646" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="9400" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1333" bpmnElement="CC2597" isMarkerVisible="true" bioc:stroke="#000000" bioc:fill="#ffffff">
        <t070 x="9655" y="545" width="50" height="50" />
        <t046>
          <t070 x="9635" y="516" width="90" height="14" />
        </t046>
      </t048>
      <t048 id="CC1289" bpmnElement="CC2538" isMarkerVisible="true" bioc:stroke="#000000" bioc:fill="#ffffff">
        <t070 x="9655" y="737" width="50" height="50" />
      </t048>
      <t048 id="CC1112" bpmnElement="CC0853">
        <t070 x="9260" y="722" width="100" height="80" />
      </t048>
      <t048 id="CC1079" bpmnElement="CC3716">
        <t070 x="9260" y="834" width="100" height="80" />
      </t048>
      <t048 id="CC1126" bpmnElement="CC1659">
        <t070 x="9260" y="936" width="100" height="80" />
      </t048>
      <t048 id="CC1569" bpmnElement="CC1709" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="9830" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1107" bpmnElement="CC2664" bioc:stroke="#43a047" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#43a047">
        <t070 x="13820" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1133" bpmnElement="CC0886" bioc:stroke="#1e88e5" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#1e88e5">
        <t070 x="13990" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1856" bpmnElement="CC2896">
        <t070 x="13892" y="652" width="36" height="36" />
        <t046>
          <t070 x="13886" y="695" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1433" bpmnElement="CC2724" bioc:stroke="#000000" bioc:fill="#ffffff" color:background-color="#ffffff" color:border-color="#000000">
        <t070 x="14250" y="668" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1500" bpmnElement="CC1017" bioc:stroke="#000000" bioc:fill="#ffffff" color:background-color="#ffffff" color:border-color="#000000">
        <t070 x="14400" y="668" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1552" bpmnElement="CC2880">
        <t070 x="14282" y="822" width="36" height="36" />
        <t046>
          <t070 x="14276" y="865" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1471" bpmnElement="CC2934">
        <t070 x="14432" y="828" width="36" height="36" />
        <t046>
          <t070 x="14426" y="871" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1274" bpmnElement="CC2511" isMarkerVisible="true">
        <t070 x="23455" y="545" width="50" height="50" />
        <t046>
          <t070 x="23441" y="521" width="78" height="14" />
        </t046>
      </t048>
      <t048 id="CC1441" bpmnElement="CC2606" isMarkerVisible="true">
        <t070 x="23855" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1495" bpmnElement="CC0072" bioc:stroke="#1e88e5" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#1e88e5">
        <t070 x="23560" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1593" bpmnElement="CC0582" bioc:stroke="#43a047" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#43a047">
        <t070 x="23710" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1438" bpmnElement="CC1994">
        <t070 x="14970" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1529" bpmnElement="CC2926">
        <t070 x="15004" y="662" width="36" height="36" />
        <t046>
          <t070 x="14997" y="705" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1458" bpmnElement="CC0142" bioc:stroke="rgb(67, 160, 71)" bioc:fill="rgb(200, 230, 201)">
        <t070 x="14630" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1528" bpmnElement="CC2575" isMarkerVisible="true">
        <t070 x="14525" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1416" bpmnElement="CC2534" isMarkerVisible="true">
        <t070 x="14175" y="545" width="50" height="50" />
        <t046>
          <t070 x="14162" y="521" width="76" height="14" />
        </t046>
      </t048>
      <t048 id="CC1505" bpmnElement="CC1679">
        <t070 x="15160" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1251" bpmnElement="CC0131" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="15770" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1309" bpmnElement="CC2569" isMarkerVisible="true">
        <t070 x="4215" y="545" width="50" height="50" />
        <t046>
          <t070 x="4211" y="515" width="62" height="27" />
        </t046>
      </t048>
      <t048 id="CC1450" bpmnElement="CC2688">
        <t070 x="4870" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1535" bpmnElement="CC2963">
        <t070 x="4952" y="622" width="36" height="36" />
        <t046>
          <t070 x="4945" y="665" width="49" height="27" />
        </t046>
      </t048>
      <t048 id="CC1326" bpmnElement="CC2589" isMarkerVisible="true">
        <t070 x="4767" y="545" width="50" height="50" />
        <t046>
          <t070 x="4761" y="602" width="73" height="14" />
        </t046>
      </t048>
      <t048 id="CC1311" bpmnElement="CC2573" isMarkerVisible="true">
        <t070 x="26461" y="677" width="50" height="50" />
      </t048>
      <t048 id="CC1570" bpmnElement="CC2586" isMarkerVisible="true">
        <t070 x="26821" y="677" width="50" height="50" />
      </t048>
      <t048 id="CC1573" bpmnElement="CC0793" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="6930" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1545" bpmnElement="CC2518" isMarkerVisible="true">
        <t070 x="2495" y="545" width="50" height="50" />
        <t046>
          <t070 x="2497" y="602" width="47" height="27" />
        </t046>
      </t048>
      <t048 id="CC1488" bpmnElement="CC0534" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="2590" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1418" bpmnElement="CC0677" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="2750" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1153" bpmnElement="CC0942" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="12260" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC0983" bpmnElement="CC2780" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="12429" y="650" width="100" height="80" />
      </t048>
      <t048 id="CC1117" bpmnElement="CC0735" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="12420" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1277" bpmnElement="CC2515" isMarkerVisible="true">
        <t070 x="12603" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1825" bpmnElement="CC2892">
        <t070 x="12684" y="552" width="36" height="36" />
        <t046>
          <t070 x="12663" y="595" width="78" height="40" />
        </t046>
      </t048>
      <t048 id="CC1105" bpmnElement="CC1705" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="16280" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1320" bpmnElement="CC2583" isMarkerVisible="true">
        <t070 x="16443" y="545" width="50" height="50" />
      </t048>
      <t048 id="CC1778" bpmnElement="CC1701" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="15940" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1550" bpmnElement="CC1703" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="16110" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1086" bpmnElement="CC0740" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="15470" y="708" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1299" bpmnElement="CC2550" isMarkerVisible="true">
        <t070 x="15795" y="723" width="50" height="50" />
        <t046>
          <t070 x="15850" y="738" width="79" height="27" />
        </t046>
      </t048>
      <t048 id="CC1323" bpmnElement="CC2587" isMarkerVisible="true">
        <t070 x="15495" y="545" width="50" height="50" />
        <t046>
          <t070 x="15478" y="515" width="84" height="14" />
        </t046>
      </t048>
      <t048 id="CC1460" bpmnElement="CC0166" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="15770" y="811" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1156" bpmnElement="CC1400" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="15630" y="708" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1415" bpmnElement="CC0738">
        <t070 x="1613" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1863" bpmnElement="CC3028">
        <t070 x="16032" y="940" width="36" height="36" />
        <t046>
          <t070 x="16022" y="983" width="68" height="27" />
        </t046>
      </t048>
      <t048 id="CC1907" bpmnElement="CC2948" isMarkerVisible="true">
        <t070 x="1645" y="672" width="36" height="36" />
        <t046>
          <t070 x="1638" y="715" width="65" height="27" />
        </t046>
      </t048>
      <t048 id="CC1462" bpmnElement="CC2600" isMarkerVisible="true">
        <t070 x="1120" y="545" width="50" height="50" />
        <t046>
          <t070 x="1106" y="516" width="78" height="27" />
        </t046>
      </t048>
      <t048 id="CC1448" bpmnElement="CC2560" isMarkerVisible="true">
        <t070 x="1120" y="635" width="50" height="50" />
        <t046>
          <t070 x="1048" y="653" width="71" height="14" />
        </t046>
      </t048>
      <t048 id="CC1567" bpmnElement="CC2612" isMarkerVisible="true">
        <t070 x="1020" y="545" width="50" height="50" />
        <t046>
          <t070 x="1017" y="605" width="57" height="14" />
        </t046>
      </t048>
      <t048 id="CC1474" bpmnElement="CC0638" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="1210" y="620" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1506" bpmnElement="CC0133" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="1185" y="787" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1527" bpmnElement="CC0782" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="1341" y="620" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1347" bpmnElement="CC2607" isMarkerVisible="true">
        <t070 x="7115" y="545" width="50" height="50" />
        <t046>
          <t070 x="7099" y="508" width="82" height="27" />
        </t046>
      </t048>
      <t048 id="CC1566" bpmnElement="CC1234" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="6640" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1310" bpmnElement="CC2572" isMarkerVisible="true">
        <t070 x="11325" y="545" width="50" height="50" />
        <t046>
          <t070 x="11309" y="601" width="82" height="27" />
        </t046>
      </t048>
      <t048 id="CC1446" bpmnElement="CC2559" isMarkerVisible="true">
        <t070 x="8615" y="545" width="50" height="50" />
        <t046>
          <t070 x="8599" y="507" width="82" height="27" />
        </t046>
      </t048>
      <t048 id="CC1585" bpmnElement="CC0124" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="8590" y="668" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1549" bpmnElement="CC0094" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="8727" y="668" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1315" bpmnElement="CC2578" isMarkerVisible="true">
        <t070 x="28115" y="545" width="50" height="50" />
        <t046>
          <t070 x="28100" y="602" width="82" height="27" />
        </t046>
      </t048>
      <t048 id="CC1476" bpmnElement="CC0106" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="7260" y="668" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1472" bpmnElement="CC0097" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="7090" y="668" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1291" bpmnElement="CC2542" isMarkerVisible="true">
        <t070 x="7805" y="545" width="50" height="50" />
        <t046>
          <t070 x="7789" y="508" width="82" height="27" />
        </t046>
      </t048>
      <t048 id="CC1559" bpmnElement="CC0248" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="7780" y="650" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1572" bpmnElement="CC0274" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="7950" y="650" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1532" bpmnElement="CC0357" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="29439" y="428" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1440" bpmnElement="CC2555" isMarkerVisible="true">
        <t070 x="15795" y="933" width="50" height="50" />
        <t046>
          <t070 x="15700" y="951" width="81" height="27" />
        </t046>
      </t048>
      <t048 id="CC1540" bpmnElement="CC2715">
        <t070 x="16000" y="1030" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1434" bpmnElement="CC2954">
        <t070 x="16032" y="1157" width="36" height="36" />
      </t048>
      <t048 id="CC1414" bpmnElement="CC2541" isMarkerVisible="true">
        <t070 x="15795" y="645" width="50" height="50" />
        <t046>
          <t070 x="15697" y="663" width="88" height="14" />
        </t046>
      </t048>
      <t048 id="CC1491" bpmnElement="CC0132" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="15980" y="708" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1503" bpmnElement="CC0287" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="16128" y="708" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1479" bpmnElement="CC2525" isMarkerVisible="true">
        <t070 x="16275" y="723" width="50" height="50" />
        <t046>
          <t070 x="16335" y="735" width="79" height="27" />
        </t046>
      </t048>
      <t048 id="CC1487" bpmnElement="CC1700" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="16250" y="812" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1510" bpmnElement="CC2576" isMarkerVisible="true">
        <t070 x="16275" y="933" width="50" height="50" />
        <t046>
          <t070 x="16333" y="944" width="81" height="27" />
        </t046>
      </t048>
      <t048 id="CC1558" bpmnElement="CC0856" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="4612" y="600" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1276" bpmnElement="CC2514" isMarkerVisible="true">
        <t070 x="4535" y="545" width="50" height="50" />
        <t046>
          <t070 x="4519" y="521" width="87" height="14" />
        </t046>
      </t048>
      <t048 id="CC1525" bpmnElement="CC3018">
        <t070 x="4742" y="622" width="36" height="36" />
      </t048>
      <t048 id="CC1595" bpmnElement="CC2568" isMarkerVisible="true">
        <t070 x="3250" y="635" width="50" height="50" />
        <t046>
          <t070 x="3247" y="605" width="72" height="14" />
        </t046>
      </t048>
      <t048 id="CC1062" bpmnElement="CC0167" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="3360" y="620" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1490" bpmnElement="CC0209" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="3810" y="620" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1456" bpmnElement="CC0308" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="3660" y="620" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1588" bpmnElement="CC0317" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="3510" y="620" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1426" bpmnElement="CC0184" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="3810" y="834" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1536" bpmnElement="CC0278" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="3660" y="834" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1461" bpmnElement="CC0168" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="3360" y="834" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1580" bpmnElement="CC0318" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="3510" y="834" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1584" bpmnElement="CC3706">
        <t070 x="10930" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1470" bpmnElement="CC2708" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="13110" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1598" bpmnElement="CC0028" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="14630" y="350" width="100" height="80" />
      </t048>
      <t048 id="CC1445" bpmnElement="CC0069" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="14796" y="350" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1553" bpmnElement="CC0647" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="14798" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1439" bpmnElement="CC3721" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="28520" y="658" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1444" bpmnElement="CC0870" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="28340" y="658" width="100" height="80" />
      </t048>
      <t048 id="CC1412" bpmnElement="CC0694" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="28340" y="530" width="100" height="80" />
      </t048>
      <t048 id="CC1589" bpmnElement="CC2692" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="28520" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1590" bpmnElement="CC0968" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="1743" y="806" width="100" height="80" />
      </t048>
      <t048 id="CC1541" bpmnElement="CC2616" isMarkerVisible="true">
        <t070 x="1945" y="545" width="50" height="50" />
        <t046>
          <t070 x="1929" y="495" width="83" height="40" />
        </t046>
      </t048>
      <t048 id="CC1480" bpmnElement="CC2556" isMarkerVisible="true">
        <t070 x="2127" y="665" width="50" height="50" />
        <t046>
          <t070 x="2048" y="670" width="83" height="40" />
        </t046>
      </t048>
      <t048 id="CC1330" bpmnElement="CC2594" isMarkerVisible="true">
        <t070 x="1768" y="919" width="50" height="50" />
        <t046>
          <t070 x="1673" y="934" width="83" height="40" />
        </t046>
      </t048>
      <t048 id="CC1459" bpmnElement="CC2899">
        <t070 x="2134" y="777" width="36" height="36" />
      </t048>
      <t048 id="CC1424" bpmnElement="CC0347" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="5300" y="827" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1555" bpmnElement="CC3728">
        <t070 x="1743" y="650" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1427" bpmnElement="CC0096" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="2868" y="620" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1565" bpmnElement="CC0172" bioc:stroke="#0d4372" bioc:fill="#bbdefb" color:background-color="#bbdefb" color:border-color="#0d4372">
        <t070 x="3000" y="620" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1417" bpmnElement="CC0533" bioc:stroke="#205022" bioc:fill="#c8e6c9" color:background-color="#c8e6c9" color:border-color="#205022">
        <t070 x="21500" y="530" width="100" height="80" />
        <t046 />
      </t048>
      <t048 id="CC1610" bpmnElement="CC2756">
        <t070 x="21800" y="253" width="36" height="36" />
      </t048>
      <t048 id="CC0673" bpmnElement="CC0849">
        <t070 x="24316" y="647" width="100" height="26" />
      </t048>
      <t045 id="CC2438" bpmnElement="CC3593">
        <t071 x="21818" y="221" />
        <t071 x="21818" y="181" />
        <t071 x="21982" y="181" />
      </t045>
      <t045 id="CC1271" bpmnElement="CC2439">
        <t071 x="22018" y="181" />
        <t071 x="22230" y="181" />
        <t071 x="22230" y="211" />
      </t045>
      <t045 id="CC2437" bpmnElement="CC3592">
        <t071 x="21818" y="289" />
        <t071 x="21818" y="321" />
        <t071 x="21982" y="321" />
      </t045>
      <t045 id="CC1174" bpmnElement="CC1945">
        <t071 x="22018" y="321" />
        <t071 x="22230" y="321" />
        <t071 x="22230" y="291" />
      </t045>
      <t048 id="CC1958" bpmnElement="CC3067">
        <t070 x="160" y="257" width="7218" height="813" />
        <t046>
          <t070 x="6036" y="264" width="50" height="14" />
        </t046>
      </t048>
      <t048 id="CC1950" bpmnElement="CC3058" bioc:stroke="black" bioc:fill="white">
        <t070 x="7408" y="257" width="3450" height="905" />
        <t046>
          <t070 x="7702" y="264" width="46" height="14" />
        </t046>
      </t048>
      <t048 id="CC1957" bpmnElement="CC3066">
        <t070 x="10868" y="257" width="5632" height="941" />
        <t046>
          <t070 x="13411" y="290" width="66" height="14" />
        </t046>
      </t048>
      <t048 id="CC1960" bpmnElement="CC3069">
        <t070 x="19708" y="390" width="2192" height="720" />
        <t046>
          <t070 x="20941" y="397" width="84" height="14" />
        </t046>
      </t048>
      <t048 id="CC1956" bpmnElement="CC3065">
        <t070 x="23378" y="390" width="3715" height="720" />
        <t046>
          <t070 x="25245" y="416" width="52" height="27" />
        </t046>
      </t048>
      <t048 id="CC1951" bpmnElement="CC3059">
        <t070 x="1812" y="1121" width="737" height="300" />
        <t046>
          <t070 x="2143" y="1128" width="83" height="27" />
        </t046>
      </t048>
      <t048 id="CC1953" bpmnElement="CC3062">
        <t070 x="17568" y="80" width="2130" height="1190" />
        <t046>
          <t070 x="19252" y="87" width="61" height="27" />
        </t046>
      </t048>
      <t048 id="CC0672" bpmnElement="CC0848">
        <t070 x="24316" y="771" width="100" height="30" />
      </t048>
      <t048 id="CC1949" bpmnElement="CC3057" bioc:stroke="#000" bioc:fill="#fff">
        <t070 x="25738" y="1169" width="460" height="265" />
        <t046>
          <t070 x="26066" y="1176" width="84" height="14" />
        </t046>
      </t048>
      <t048 id="CC1959" bpmnElement="CC3068">
        <t070 x="16518" y="257" width="1030" height="813" />
        <t046>
          <t070 x="16996" y="264" width="78" height="14" />
        </t046>
      </t048>
      <t048 id="CC1952" bpmnElement="CC3061">
        <t070 x="27116" y="390" width="950" height="720" />
        <t046>
          <t070 x="27567" y="397" width="66" height="14" />
        </t046>
      </t048>
      <t048 id="CC1955" bpmnElement="CC3064">
        <t070 x="28076" y="390" width="1612" height="720" />
      </t048>
      <t048 id="CC1493" bpmnElement="CC3060">
        <t070 x="17561" y="1285" width="777" height="440" />
        <t046>
          <t070 x="17963" y="1292" width="89" height="27" />
        </t046>
      </t048>
      <t048 id="CC1954" bpmnElement="CC3063">
        <t070 x="10383" y="516" width="295" height="255" />
        <t046>
          <t070 x="10561" y="527" width="89" height="14" />
        </t046>
      </t048>
      <t048 id="CC0671" bpmnElement="CC0847">
        <t070 x="18628" y="737" width="100" height="53" />
      </t048>
      <t048 id="CC1587" bpmnElement="CC0850">
        <t070 x="22128" y="648" width="70" height="30" />
        <t046 />
      </t048>
      <t048 id="CC1483" bpmnElement="CC3000">
        <t070 x="2900" y="682" width="36" height="36" />
      </t048>
      <t048 id="CC1586" bpmnElement="CC2897">
        <t070 x="1775" y="712" width="36" height="36" />
      </t048>
      <t048 id="CC1508" bpmnElement="CC2906">
        <t070 x="10972" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1465" bpmnElement="CC3030">
        <t070 x="3392" y="896" width="36" height="36" />
      </t048>
      <t048 id="CC1419" bpmnElement="CC2992">
        <t070 x="3692" y="896" width="36" height="36" />
      </t048>
      <t048 id="CC1526" bpmnElement="CC2908">
        <t070 x="3692" y="682" width="36" height="36" />
      </t048>
      <t048 id="CC1523" bpmnElement="CC2944">
        <t070 x="3392" y="682" width="36" height="36" />
      </t048>
      <t048 id="CC1485" bpmnElement="CC2970">
        <t070 x="16012" y="770" width="36" height="36" />
      </t048>
      <t048 id="CC1557" bpmnElement="CC2952">
        <t070 x="16032" y="1092" width="36" height="36" />
      </t048>
      <t048 id="CC1534" bpmnElement="CC2914">
        <t070 x="1242" y="682" width="36" height="36" />
      </t048>
      <t048 id="CC1516" bpmnElement="CC2979">
        <t070 x="1217" y="849" width="36" height="36" />
      </t048>
      <t048 id="CC1518" bpmnElement="CC3005">
        <t070 x="15502" y="770" width="36" height="36" />
      </t048>
      <t048 id="CC1562" bpmnElement="CC2902">
        <t070 x="16150" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1941" bpmnElement="CC2884">
        <t070 x="12292" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1546" bpmnElement="CC2966">
        <t070 x="2622" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1531" bpmnElement="CC2895">
        <t070 x="4902" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1481" bpmnElement="CC2924">
        <t070 x="15192" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1420" bpmnElement="CC2909">
        <t070 x="15004" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1467" bpmnElement="CC2997">
        <t070 x="14432" y="730" width="36" height="36" />
      </t048>
      <t048 id="CC1594" bpmnElement="CC2985">
        <t070 x="14282" y="730" width="36" height="36" />
      </t048>
      <t048 id="CC1877" bpmnElement="CC2965">
        <t070 x="13852" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1892" bpmnElement="CC2983">
        <t070 x="9242" y="958" width="36" height="36" />
      </t048>
      <t048 id="CC1820" bpmnElement="CC2956">
        <t070 x="9242" y="856" width="36" height="36" />
      </t048>
      <t048 id="CC1932" bpmnElement="CC3020">
        <t070 x="9242" y="744" width="36" height="36" />
      </t048>
      <t048 id="CC1571" bpmnElement="CC3011">
        <t070 x="702" y="808" width="36" height="36" />
      </t048>
      <t048 id="CC1473" bpmnElement="CC2957">
        <t070 x="10165" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1819" bpmnElement="CC2898">
        <t070 x="21770" y="722" width="36" height="36" />
      </t048>
      <t048 id="CC1926" bpmnElement="CC2969">
        <t070 x="4396" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1908" bpmnElement="CC2935">
        <t070 x="5352" y="744" width="36" height="36" />
      </t048>
      <t048 id="CC1542" bpmnElement="CC2885">
        <t070 x="702" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1592" bpmnElement="CC2928">
        <t070 x="24218" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1929" bpmnElement="CC2973">
        <t070 x="16758" y="552" width="36" height="36" />
      </t048>
      <t048 id="CC1455" bpmnElement="CC2900">
        <t070 x="26177" y="722" width="36" height="36" />
      </t048>
      <t048 id="CC1816" bpmnElement="CC2887">
        <t070 x="27300" y="724" width="36" height="36" />
      </t048>
      <t048 id="CC1859" bpmnElement="CC2984">
        <t070 x="27250" y="724" width="36" height="36" />
        <t046>
          <t070 x="27198" y="763" width="69" height="14" />
        </t046>
      </t048>
      <t048 id="CC1834" bpmnElement="CC2904">
        <t070 x="29270" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1812" bpmnElement="CC3012">
        <t070 x="13680" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1899" bpmnElement="CC2994">
        <t070 x="10490" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1422" bpmnElement="CC2998">
        <t070 x="11108" y="730" width="36" height="36" />
      </t048>
      <t048 id="CC1597" bpmnElement="CC2929">
        <t070 x="17620" y="912" width="36" height="36" />
      </t048>
      <t048 id="CC1923" bpmnElement="CC3026">
        <t070 x="17219" y="685" width="36" height="36" />
        <t046>
          <t070 x="17257" y="690" width="46" height="27" />
        </t046>
      </t048>
      <t048 id="CC1887" bpmnElement="CC2975">
        <t070 x="4022" y="682" width="36" height="36" />
      </t048>
      <t048 id="CC1875" bpmnElement="CC2955">
        <t070 x="2384" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1905" bpmnElement="CC3003">
        <t070 x="2134" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1829" bpmnElement="CC1239">
        <t070 x="2154" y="1213" width="36" height="36" />
        <t046>
          <t070 x="2198" y="1196" width="76" height="14" />
        </t046>
      </t048>
      <t048 id="CC1891" bpmnElement="CC2981">
        <t070 x="13410" y="752" width="36" height="36" />
      </t048>
      <t048 id="CC1885" bpmnElement="CC2967">
        <t070 x="17060" y="809" width="36" height="36" />
      </t048>
      <t048 id="CC1833" bpmnElement="CC2901">
        <t070 x="12020" y="722" width="36" height="36" />
      </t048>
      <t048 id="CC1904" bpmnElement="CC3001">
        <t070 x="18550" y="972" width="36" height="36" />
        <t046>
          <t070 x="18590" y="958" width="69" height="27" />
        </t046>
      </t048>
      <t048 id="CC1835" bpmnElement="CC2905">
        <t070 x="11450" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1915" bpmnElement="CC2986">
        <t070 x="11540" y="758" width="36" height="36" />
      </t048>
      <t048 id="CC1862" bpmnElement="CC2938">
        <t070 x="12790" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1842" bpmnElement="CC2946">
        <t070 x="8209" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1876" bpmnElement="CC2915">
        <t070 x="9130" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1838" bpmnElement="CC2953">
        <t070 x="7632" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1906" bpmnElement="CC3037">
        <t070 x="7472" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1898" bpmnElement="CC2947">
        <t070 x="6514" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1814" bpmnElement="CC2919">
        <t070 x="6344" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1836" bpmnElement="CC3040">
        <t070 x="6164" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1864" bpmnElement="CC2995">
        <t070 x="5876" y="592" width="36" height="36" />
      </t048>
      <t048 id="CC1837" bpmnElement="CC2911">
        <t070 x="11830" y="962" width="36" height="36" />
      </t048>
      <t048 id="CC1914" bpmnElement="CC3010">
        <t070 x="18930" y="320" width="36" height="36" />
        <t046>
          <t070 x="18911" y="291" width="73" height="14" />
        </t046>
      </t048>
      <t048 id="CC1930" bpmnElement="CC3038">
        <t070 x="18280" y="972" width="36" height="36" />
        <t046>
          <t070 x="18320" y="956" width="70" height="27" />
        </t046>
      </t048>
      <t048 id="CC1934" bpmnElement="CC3041">
        <t070 x="19140" y="972" width="36" height="36" />
      </t048>
      <t048 id="CC1927" bpmnElement="CC2878">
        <t070 x="18930" y="450" width="36" height="36" />
      </t048>
      <t048 id="CC1901" bpmnElement="CC2996">
        <t070 x="18840" y="972" width="36" height="36" />
        <t046>
          <t070 x="18878" y="963" width="60" height="14" />
        </t046>
      </t048>
      <t048 id="CC1867" bpmnElement="CC3036">
        <t070 x="17970" y="972" width="36" height="36" />
        <t046>
          <t070 x="18007" y="963" width="61" height="14" />
        </t046>
      </t048>
      <t045 id="CC2270" bpmnElement="CC3405">
        <t071 x="6412" y="570" />
        <t071 x="6482" y="570" />
      </t045>
      <t045 id="CC2274" bpmnElement="CC3409">
        <t071 x="5944" y="570" />
        <t071 x="6024" y="570" />
      </t045>
      <t045 id="CC2457" bpmnElement="CC3613">
        <t071 x="6235" y="570" />
        <t071 x="6312" y="570" />
      </t045>
      <t045 id="CC2154" bpmnElement="CC3274">
        <t071 x="6582" y="570" />
        <t071 x="6640" y="570" />
      </t045>
      <t045 id="CC2413" bpmnElement="CC3563">
        <t071 x="8115" y="570" />
        <t071 x="8177" y="570" />
        <t046>
          <t070 x="8120" y="548" width="20" height="14" />
        </t046>
      </t045>
      <t045 id="CC2329" bpmnElement="CC3471">
        <t071 x="9023" y="570" />
        <t071 x="9092" y="570" />
      </t045>
      <t045 id="CC2385" bpmnElement="CC3532">
        <t071 x="8397" y="570" />
        <t071 x="8468" y="570" />
      </t045>
      <t045 id="CC2269" bpmnElement="CC3404">
        <t071 x="7701" y="570" />
        <t071 x="7805" y="570" />
      </t045>
      <t045 id="CC2362" bpmnElement="CC3505">
        <t071 x="19888" y="570" />
        <t071 x="19958" y="570" />
      </t045>
      <t045 id="CC2115" bpmnElement="CC3226">
        <t071 x="20058" y="570" />
        <t071 x="20130" y="570" />
      </t045>
      <t045 id="CC2376" bpmnElement="CC3522">
        <t071 x="24923" y="570" />
        <t071 x="24968" y="570" />
      </t045>
      <t045 id="CC2210" bpmnElement="CC3334">
        <t071 x="25068" y="570" />
        <t071 x="25121" y="570" />
      </t045>
      <t045 id="CC2498" bpmnElement="CC3658">
        <t071 x="25308" y="570" />
        <t071 x="25351" y="570" />
      </t045>
      <t045 id="CC2129" bpmnElement="CC3244">
        <t071 x="23988" y="595" />
        <t071 x="23988" y="900" />
        <t071 x="24546" y="900" />
      </t045>
      <t045 id="CC2060" bpmnElement="CC3161">
        <t071 x="24646" y="900" />
        <t071 x="24898" y="900" />
        <t071 x="24898" y="595" />
      </t045>
      <t045 id="CC2503" bpmnElement="CC3664">
        <t071 x="20483" y="708" />
        <t071 x="20612" y="708" />
      </t045>
      <t045 id="CC2187" bpmnElement="CC3311">
        <t071 x="27048" y="570" />
        <t071 x="27271" y="570" />
      </t045>
      <t045 id="CC2441" bpmnElement="CC3595">
        <t071 x="17638" y="595" />
        <t071 x="17638" y="755" />
        <t046>
          <t070 x="17651" y="665" width="18" height="14" />
        </t046>
      </t045>
      <t045 id="CC2350" bpmnElement="CC3493">
        <t071 x="17638" y="545" />
        <t071 x="17638" y="350" />
        <t071 x="17988" y="352" />
        <t046>
          <t070 x="17649" y="450" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2400" bpmnElement="CC3548">
        <t071 x="17638" y="805" />
        <t071 x="17638" y="850" />
      </t045>
      <t045 id="CC2306" bpmnElement="CC3445">
        <t071 x="17663" y="780" />
        <t071 x="17708" y="780" />
      </t045>
      <t045 id="CC2506" bpmnElement="CC3668">
        <t071 x="17808" y="780" />
        <t071 x="17858" y="780" />
      </t045>
      <t045 id="CC2365" bpmnElement="CC3508">
        <t071 x="17608" y="930" />
        <t071 x="17608" y="976" />
        <t071 x="17638" y="976" />
        <t071 x="17638" y="1022" />
      </t045>
      <t045 id="CC2354" bpmnElement="CC3497">
        <t071 x="17988" y="1008" />
        <t071 x="17988" y="1040" />
      </t045>
      <t045 id="CC2487" bpmnElement="CC3645">
        <t071 x="19458" y="245" />
        <t071 x="19458" y="210" />
      </t045>
      <t045 id="CC2225" bpmnElement="CC3353">
        <t071 x="18948" y="270" />
        <t071 x="19433" y="270" />
      </t045>
      <t045 id="CC2357" bpmnElement="CC3500">
        <t071 x="19483" y="270" />
        <t071 x="19578" y="270" />
        <t071 x="19578" y="545" />
      </t045>
      <t045 id="CC2314" bpmnElement="CC3455">
        <t071 x="19508" y="170" />
        <t071 x="19560" y="170" />
      </t045>
      <t045 id="CC2464" bpmnElement="CC3621">
        <t071 x="18858" y="1008" />
        <t071 x="18858" y="1040" />
      </t045>
      <t045 id="CC2235" bpmnElement="CC3364">
        <t071 x="19328" y="825" />
        <t071 x="19438" y="825" />
      </t045>
      <t045 id="CC2169" bpmnElement="CC3292">
        <t071 x="19603" y="570" />
        <t071 x="19788" y="570" />
      </t045>
      <t045 id="CC2103" bpmnElement="CC3210">
        <t071 x="18858" y="1120" />
        <t071 x="18858" y="1162" />
      </t045>
      <t045 id="CC2184" bpmnElement="CC3308">
        <t071 x="17988" y="1120" />
        <t071 x="17988" y="1162" />
      </t045>
      <t045 id="CC2451" bpmnElement="CC3605">
        <t071 x="18966" y="468" />
        <t071 x="19130" y="468" />
      </t045>
      <t045 id="CC2259" bpmnElement="CC3394">
        <t071 x="19158" y="1008" />
        <t071 x="19158" y="1162" />
      </t045>
      <t045 id="CC2202" bpmnElement="CC3326">
        <t071 x="19538" y="825" />
        <t071 x="19578" y="825" />
        <t071 x="19578" y="595" />
      </t045>
      <t045 id="CC2406" bpmnElement="CC3554">
        <t071 x="25171" y="570" />
        <t071 x="25208" y="570" />
      </t045>
      <t045 id="CC2431" bpmnElement="CC3586">
        <t071 x="25146" y="595" />
        <t071 x="25146" y="690" />
        <t071 x="25240" y="690" />
      </t045>
      <t045 id="CC2319" bpmnElement="CC3460">
        <t071 x="25276" y="690" />
        <t071 x="25376" y="690" />
        <t071 x="25376" y="595" />
      </t045>
      <t045 id="CC2074" bpmnElement="CC3178">
        <t071 x="18298" y="1008" />
        <t071 x="18298" y="1040" />
      </t045>
      <t045 id="CC2272" bpmnElement="CC3407">
        <t071 x="18298" y="1120" />
        <t071 x="18298" y="1162" />
      </t045>
      <t045 id="CC2076" bpmnElement="CC3180">
        <t071 x="18966" y="338" />
        <t071 x="18998" y="338" />
      </t045>
      <t045 id="CC2136" bpmnElement="CC3252">
        <t071 x="19098" y="338" />
        <t071 x="19130" y="338" />
      </t045>
      <t045 id="CC2260" bpmnElement="CC3395">
        <t071 x="24013" y="570" />
        <t071 x="24048" y="570" />
      </t045>
      <t045 id="CC2077" bpmnElement="CC3181">
        <t071 x="24811" y="570" />
        <t071 x="24873" y="570" />
      </t045>
      <t045 id="CC2488" bpmnElement="CC3646">
        <t071 x="24646" y="708" />
        <t071 x="24786" y="708" />
        <t071 x="24786" y="595" />
      </t045>
      <t045 id="CC2424" bpmnElement="CC3579">
        <t071 x="24261" y="708" />
        <t071 x="24328" y="708" />
      </t045>
      <t045 id="CC2310" bpmnElement="CC3450">
        <t071 x="24236" y="733" />
        <t071 x="24236" y="814" />
        <t071 x="24328" y="814" />
      </t045>
      <t045 id="CC2382" bpmnElement="CC3529">
        <t071 x="24364" y="814" />
        <t071 x="24428" y="814" />
      </t045>
      <t045 id="CC2408" bpmnElement="CC3556">
        <t071 x="24464" y="814" />
        <t071 x="24488" y="814" />
        <t071 x="24488" y="708" />
        <t071 x="24546" y="708" />
      </t045>
      <t045 id="CC2171" bpmnElement="CC3294">
        <t071 x="24364" y="708" />
        <t071 x="24546" y="708" />
      </t045>
      <t045 id="CC2168" bpmnElement="CC3291">
        <t071 x="25816" y="1304" />
        <t071 x="25936" y="1304" />
      </t045>
      <t045 id="CC2426" bpmnElement="CC3581">
        <t071 x="26036" y="1304" />
        <t071 x="26130" y="1304" />
      </t045>
      <t045 id="CC2321" bpmnElement="CC3462">
        <t071 x="11708" y="570" />
        <t071 x="11773" y="570" />
      </t045>
      <t045 id="CC2252" bpmnElement="CC3383">
        <t071 x="11823" y="570" />
        <t071 x="11963" y="570" />
        <t046>
          <t070 x="11837" y="548" width="47" height="14" />
        </t046>
      </t045>
      <t045 id="CC2153" bpmnElement="CC3273">
        <t071 x="6172" y="530" />
        <t071 x="6172" y="490" />
        <t071 x="5920" y="490" />
        <t071 x="5920" y="530" />
        <t046>
          <t070 x="6022" y="473" width="28" height="14" />
        </t046>
      </t045>
      <t045 id="CC2172" bpmnElement="CC3295">
        <t071 x="6342" y="530" />
        <t071 x="6342" y="490" />
        <t071 x="6202" y="490" />
        <t071 x="6202" y="530" />
        <t046>
          <t070 x="6258" y="472" width="28" height="14" />
        </t046>
      </t045>
      <t045 id="CC2118" bpmnElement="CC3232">
        <t071 x="6512" y="530" />
        <t071 x="6512" y="490" />
        <t071 x="6382" y="490" />
        <t071 x="6382" y="530" />
        <t046>
          <t070 x="6433" y="472" width="28" height="14" />
        </t046>
      </t045>
      <t045 id="CC2497" bpmnElement="CC3657">
        <t071 x="5894" y="628" />
        <t071 x="5894" y="690" />
        <t071 x="5966" y="690" />
      </t045>
      <t045 id="CC2276" bpmnElement="CC3411">
        <t071 x="6182" y="628" />
        <t071 x="6182" y="690" />
        <t071 x="6254" y="690" />
      </t045>
      <t045 id="CC2134" bpmnElement="CC3249">
        <t071 x="6362" y="628" />
        <t071 x="6362" y="690" />
        <t071 x="6434" y="690" />
      </t045>
      <t045 id="CC2420" bpmnElement="CC3574">
        <t071 x="6532" y="628" />
        <t071 x="6532" y="690" />
        <t071 x="6604" y="690" />
      </t045>
      <t045 id="CC2186" bpmnElement="CC3310">
        <t071 x="7618" y="530" />
        <t071 x="7618" y="490" />
        <t071 x="7510" y="490" />
        <t071 x="7510" y="530" />
        <t046>
          <t070 x="7554" y="475" width="28" height="14" />
        </t046>
      </t045>
      <t045 id="CC2459" bpmnElement="CC3615">
        <t071 x="8277" y="570" />
        <t071 x="8347" y="570" />
      </t045>
      <t045 id="CC2452" bpmnElement="CC3606">
        <t071 x="8090" y="595" />
        <t071 x="8090" y="690" />
        <t071 x="8372" y="690" />
        <t071 x="8372" y="595" />
        <t046>
          <t070 x="8222" y="672" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2245" bpmnElement="CC3376">
        <t071 x="7470" y="530" />
        <t071 x="7470" y="490" />
        <t071 x="6552" y="490" />
        <t071 x="6552" y="530" />
        <t046>
          <t070 x="6945" y="472" width="28" height="14" />
        </t046>
      </t045>
      <t045 id="CC2151" bpmnElement="CC3271">
        <t071 x="7490" y="628" />
        <t071 x="7490" y="690" />
        <t071 x="7562" y="690" />
      </t045>
      <t045 id="CC2277" bpmnElement="CC3412">
        <t071 x="8227" y="530" />
        <t071 x="8227" y="490" />
        <t071 x="7688" y="490" />
        <t071 x="7688" y="530" />
      </t045>
      <t045 id="CC2295" bpmnElement="CC3433">
        <t071 x="7650" y="628" />
        <t071 x="7650" y="690" />
        <t071 x="7720" y="690" />
      </t045>
      <t045 id="CC2139" bpmnElement="CC3255">
        <t071 x="9118" y="530" />
        <t071 x="9118" y="470" />
        <t071 x="7651" y="470" />
        <t071 x="7651" y="530" />
        <t046>
          <t070 x="7808" y="452" width="28" height="14" />
        </t046>
      </t045>
      <t045 id="CC2320" bpmnElement="CC3461">
        <t071 x="9148" y="628" />
        <t071 x="9148" y="640" />
        <t071 x="9190" y="640" />
      </t045>
      <t045 id="CC2288" bpmnElement="CC3426">
        <t071 x="8227" y="628" />
        <t071 x="8227" y="660" />
        <t071 x="8259" y="660" />
      </t045>
      <t045 id="CC2491" bpmnElement="CC3650">
        <t071 x="11518" y="570" />
        <t071 x="11608" y="570" />
      </t045>
      <t045 id="CC2326" bpmnElement="CC3467">
        <t071 x="20458" y="733" />
        <t071 x="20458" y="846" />
        <t071 x="20612" y="846" />
      </t045>
      <t045 id="CC2421" bpmnElement="CC3575">
        <t071 x="20648" y="846" />
        <t071 x="20748" y="846" />
      </t045>
      <t045 id="CC2461" bpmnElement="CC3618">
        <t071 x="20648" y="708" />
        <t071 x="20773" y="708" />
      </t045>
      <t045 id="CC2200" bpmnElement="CC3324">
        <t071 x="12858" y="570" />
        <t071 x="12963" y="570" />
      </t045>
      <t045 id="CC2091" bpmnElement="CC3195">
        <t071 x="12808" y="628" />
        <t071 x="12808" y="643" />
        <t071 x="12844" y="643" />
      </t045>
      <t045 id="CC2176" bpmnElement="CC3299">
        <t071 x="11488" y="530" />
        <t071 x="11488" y="490" />
        <t071 x="11448" y="490" />
        <t071 x="11448" y="530" />
      </t045>
      <t045 id="CC2285" bpmnElement="CC3423">
        <t071 x="11438" y="610" />
        <t071 x="11438" y="736" />
        <t071 x="11508" y="736" />
      </t045>
      <t045 id="CC2449" bpmnElement="CC3604">
        <t071 x="11528" y="776" />
        <t071 x="11528" y="870" />
      </t045>
      <t045 id="CC2442" bpmnElement="CC3596">
        <t071 x="11558" y="794" />
        <t071 x="11558" y="870" />
      </t045>
      <t045 id="CC2305" bpmnElement="CC3444">
        <t071 x="11558" y="950" />
        <t071 x="11558" y="1002" />
      </t045>
      <t045 id="CC2135" bpmnElement="CC3250">
        <t071 x="11468" y="628" />
        <t071 x="11468" y="644" />
        <t071 x="11537" y="644" />
      </t045>
      <t045 id="CC2444" bpmnElement="CC3598">
        <t071 x="20798" y="949" />
        <t071 x="20798" y="886" />
      </t045>
      <t045 id="CC2482" bpmnElement="CC3640">
        <t071 x="20848" y="846" />
        <t071 x="20953" y="846" />
      </t045>
      <t045 id="CC2113" bpmnElement="CC3222">
        <t071 x="20978" y="821" />
        <t071 x="20978" y="733" />
        <t046>
          <t070 x="20994" y="798" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2509" bpmnElement="CC3672">
        <t071 x="20953" y="708" />
        <t071 x="20823" y="708" />
        <t046>
          <t070 x="20936" y="691" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2373" bpmnElement="CC3519">
        <t071 x="21003" y="708" />
        <t071 x="21100" y="708" />
        <t046>
          <t070 x="21006" y="691" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2410" bpmnElement="CC3559">
        <t071 x="21328" y="709" />
        <t071 x="21406" y="709" />
      </t045>
      <t045 id="CC2194" bpmnElement="CC3318">
        <t071 x="20978" y="871" />
        <t071 x="20978" y="967" />
        <t071 x="20816" y="967" />
        <t046>
          <t070 x="20987" y="872" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2110" bpmnElement="CC3219">
        <t071 x="21003" y="846" />
        <t071 x="21100" y="846" />
        <t046>
          <t070 x="21026" y="794" width="63" height="40" />
        </t046>
      </t045>
      <t045 id="CC2460" bpmnElement="CC3617">
        <t071 x="21136" y="846" />
        <t071 x="21278" y="846" />
        <t071 x="21278" y="749" />
      </t045>
      <t045 id="CC2283" bpmnElement="CC3421">
        <t071 x="21136" y="708" />
        <t071 x="21228" y="708" />
      </t045>
      <t045 id="CC2404" bpmnElement="CC3552">
        <t071 x="18568" y="1008" />
        <t071 x="18568" y="1040" />
      </t045>
      <t045 id="CC2170" bpmnElement="CC3293">
        <t071 x="18568" y="1120" />
        <t071 x="18568" y="1162" />
      </t045>
      <t045 id="CC2493" bpmnElement="CC3652">
        <t071 x="12013" y="570" />
        <t071 x="12153" y="570" />
      </t045>
      <t045 id="CC2219" bpmnElement="CC3345">
        <t071 x="11988" y="696" />
        <t071 x="11988" y="595" />
      </t045>
      <t045 id="CC2298" bpmnElement="CC3436">
        <t071 x="12056" y="740" />
        <t071 x="12120" y="740" />
      </t045>
      <t045 id="CC2121" bpmnElement="CC3235">
        <t071 x="11798" y="761" />
        <t071 x="11798" y="912" />
        <t046>
          <t070 x="11745" y="833" width="50" height="14" />
        </t046>
      </t045>
      <t045 id="CC2505" bpmnElement="CC3666">
        <t071 x="12038" y="952" />
        <t071 x="12120" y="952" />
      </t045>
      <t045 id="CC2508" bpmnElement="CC3671">
        <t071 x="11848" y="940" />
        <t071 x="11938" y="940" />
      </t045>
      <t045 id="CC2311" bpmnElement="CC3451">
        <t071 x="11866" y="980" />
        <t071 x="11938" y="980" />
      </t045>
      <t045 id="CC2363" bpmnElement="CC3506">
        <t071 x="11798" y="595" />
        <t071 x="11798" y="711" />
      </t045>
      <t045 id="CC2317" bpmnElement="CC3458">
        <t071 x="11823" y="736" />
        <t071 x="11938" y="736" />
        <t046>
          <t070 x="11864" y="718" width="37" height="14" />
        </t046>
      </t045>
      <t045 id="CC2143" bpmnElement="CC3263">
        <t071 x="6060" y="570" />
        <t071 x="6135" y="570" />
      </t045>
      <t045 id="CC2165" bpmnElement="CC3288">
        <t071 x="17053" y="570" />
        <t071 x="17137" y="570" />
        <t046>
          <t070 x="17083" y="552" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2309" bpmnElement="CC3449">
        <t071 x="17237" y="570" />
        <t071 x="17323" y="570" />
      </t045>
      <t045 id="CC2456" bpmnElement="CC3612">
        <t071 x="13343" y="570" />
        <t071 x="13493" y="570" />
        <t046>
          <t070 x="13402" y="552" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2191" bpmnElement="CC3315">
        <t071 x="13318" y="595" />
        <t071 x="13318" y="730" />
        <t071 x="13378" y="730" />
        <t046>
          <t070 x="13334" y="709" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2279" bpmnElement="CC3414">
        <t071 x="13478" y="730" />
        <t071 x="13518" y="730" />
        <t071 x="13518" y="595" />
      </t045>
      <t045 id="CC2477" bpmnElement="CC3635">
        <t071 x="13428" y="788" />
        <t071 x="13428" y="829" />
        <t071 x="13450" y="829" />
      </t045>
      <t045 id="CC2496" bpmnElement="CC3656">
        <t071 x="27321" y="570" />
        <t071 x="27566" y="570" />
        <t046>
          <t070 x="27437" y="548" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2374" bpmnElement="CC3520">
        <t071 x="27296" y="595" />
        <t071 x="27296" y="662" />
        <t046>
          <t070 x="27311" y="626" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2247" bpmnElement="CC3378">
        <t071 x="27346" y="702" />
        <t071 x="27431" y="702" />
      </t045>
      <t045 id="CC2141" bpmnElement="CC3259">
        <t071 x="27481" y="702" />
        <t071 x="27566" y="702" />
        <t046>
          <t070 x="27523" y="684" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2427" bpmnElement="CC3582">
        <t071 x="28028" y="570" />
        <t071 x="28115" y="570" />
      </t045>
      <t045 id="CC2364" bpmnElement="CC3507">
        <t071 x="12788" y="530" />
        <t071 x="12788" y="490" />
        <t071 x="11508" y="490" />
        <t071 x="11508" y="530" />
        <t046>
          <t070 x="12032" y="472" width="28" height="14" />
        </t046>
      </t045>
      <t045 id="CC2183" bpmnElement="CC3307">
        <t071 x="2372" y="1271" />
        <t071 x="2461" y="1271" />
      </t045>
      <t045 id="CC2117" bpmnElement="CC3231">
        <t071 x="2192" y="1271" />
        <t071 x="2272" y="1271" />
      </t045>
      <t045 id="CC2331" bpmnElement="CC3473">
        <t071 x="248" y="570" />
        <t071 x="382" y="570" />
      </t045>
      <t045 id="CC2467" bpmnElement="CC3624">
        <t071 x="2202" y="570" />
        <t071 x="2352" y="570" />
      </t045>
      <t045 id="CC2383" bpmnElement="CC3530">
        <t071 x="2152" y="628" />
        <t071 x="2152" y="665" />
      </t045>
      <t045 id="CC2289" bpmnElement="CC3427">
        <t071 x="4008" y="700" />
        <t071 x="4008" y="980" />
        <t071 x="2440" y="980" />
        <t071 x="2440" y="610" />
      </t045>
      <t045 id="CC2090" bpmnElement="CC3194">
        <t071 x="2900" y="814" />
        <t071 x="2440" y="814" />
        <t071 x="2440" y="610" />
      </t045>
      <t045 id="CC1944" bpmnElement="CC3055">
        <t071 x="4090" y="660" />
        <t071 x="4142" y="660" />
      </t045>
      <t045 id="CC2078" bpmnElement="CC3182">
        <t071 x="3195" y="660" />
        <t071 x="3250" y="660" />
        <t046>
          <t070 x="3212" y="644" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2058" bpmnElement="CC3159">
        <t071 x="4040" y="718" />
        <t071 x="4040" y="796" />
      </t045>
      <t045 id="CC2137" bpmnElement="CC3253">
        <t071 x="2402" y="628" />
        <t071 x="2402" y="672" />
      </t045>
      <t045 id="CC2071" bpmnElement="CC3175">
        <t071 x="5894" y="530" />
        <t071 x="5894" y="440" />
        <t071 x="2402" y="440" />
        <t071 x="2402" y="530" />
        <t046>
          <t070 x="4135" y="422" width="29" height="14" />
        </t046>
      </t045>
      <t045 id="CC2217" bpmnElement="CC3342">
        <t071 x="7540" y="570" />
        <t071 x="7601" y="570" />
      </t045>
      <t045 id="CC2470" bpmnElement="CC3628">
        <t071 x="26511" y="570" />
        <t071 x="26616" y="570" />
        <t046>
          <t070 x="26533" y="552" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2101" bpmnElement="CC3208">
        <t071 x="26716" y="570" />
        <t071 x="26821" y="570" />
      </t045>
      <t045 id="CC2448" bpmnElement="CC3603">
        <t071 x="26656" y="702" />
        <t071 x="26696" y="702" />
      </t045>
      <t045 id="CC2481" bpmnElement="CC3639">
        <t071 x="26871" y="570" />
        <t071 x="26948" y="570" />
      </t045>
      <t045 id="CC1722" bpmnElement="CC3661">
        <t071 x="16756" y="530" />
        <t071 x="16756" y="490" />
        <t071 x="16696" y="490" />
        <t071 x="16696" y="530" />
      </t045>
      <t045 id="CC2263" bpmnElement="CC3398">
        <t071 x="16613" y="570" />
        <t071 x="16676" y="570" />
        <t046>
          <t070 x="16634" y="552" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2179" bpmnElement="CC3303">
        <t071 x="16794" y="570" />
        <t071 x="16863" y="570" />
      </t045>
      <t045 id="CC2130" bpmnElement="CC3245">
        <t071 x="16913" y="570" />
        <t071 x="17003" y="570" />
      </t045>
      <t045 id="CC2494" bpmnElement="CC3653">
        <t071 x="17028" y="595" />
        <t071 x="17028" y="665" />
        <t046>
          <t070 x="17033" y="620" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2099" bpmnElement="CC3206">
        <t071 x="17053" y="690" />
        <t071 x="17137" y="690" />
        <t046>
          <t070 x="17084" y="672" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2162" bpmnElement="CC3284">
        <t071 x="17237" y="670" />
        <t071 x="17348" y="670" />
        <t071 x="17348" y="595" />
        <t046>
          <t070 x="17270" y="641" width="47" height="27" />
        </t046>
      </t045>
      <t045 id="CC2379" bpmnElement="CC3526">
        <t071 x="17028" y="715" />
        <t071 x="17028" y="787" />
        <t046>
          <t070 x="17033" y="741" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2150" bpmnElement="CC3270">
        <t071 x="17078" y="800" />
        <t071 x="17137" y="800" />
      </t045>
      <t045 id="CC2138" bpmnElement="CC3254">
        <t071 x="17096" y="827" />
        <t071 x="17137" y="827" />
      </t045>
      <t045 id="CC2152" bpmnElement="CC3272">
        <t071 x="17237" y="827" />
        <t071 x="17298" y="827" />
      </t045>
      <t045 id="CC2161" bpmnElement="CC3282">
        <t071 x="17255" y="703" />
        <t071 x="17348" y="703" />
        <t071 x="17348" y="787" />
        <t046>
          <t070 x="17280" y="708" width="50" height="27" />
        </t046>
      </t045>
      <t045 id="CC2380" bpmnElement="CC3527">
        <t071 x="17398" y="827" />
        <t071 x="17480" y="827" />
      </t045>
      <t045 id="CC2324" bpmnElement="CC3465">
        <t071 x="16588" y="595" />
        <t071 x="16588" y="690" />
        <t071 x="16888" y="690" />
        <t071 x="16888" y="595" />
        <t046>
          <t070 x="16718" y="577" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2500" bpmnElement="CC3660">
        <t071 x="2172" y="1213" />
        <t071 x="2172" y="1193" />
        <t071 x="2302" y="1193" />
        <t071 x="2302" y="1231" />
      </t045>
      <t045 id="CC2499" bpmnElement="CC3659">
        <t071 x="17646" y="1430" />
        <t071 x="17713" y="1430" />
      </t045>
      <t045 id="CC1755" bpmnElement="CC3391">
        <t071 x="17938" y="1430" />
        <t071 x="18023" y="1430" />
      </t045>
      <t045 id="CC1721" bpmnElement="CC3388">
        <t071 x="18073" y="1430" />
        <t071 x="18250" y="1430" />
      </t045>
      <t045 id="CC1730" bpmnElement="CC3257">
        <t071 x="18048" y="1455" />
        <t071 x="18048" y="1530" />
        <t046>
          <t070 x="18066" y="1491" width="57" height="27" />
        </t046>
      </t045>
      <t045 id="CC2366" bpmnElement="CC3509">
        <t071 x="18098" y="1570" />
        <t071 x="18250" y="1570" />
      </t045>
      <t045 id="CC2370" bpmnElement="CC3513">
        <t071 x="17763" y="1430" />
        <t071 x="17838" y="1430" />
      </t045>
      <t045 id="CC2430" bpmnElement="CC3585">
        <t071 x="17738" y="1455" />
        <t071 x="17738" y="1650" />
        <t071 x="18250" y="1650" />
      </t045>
      <t045 id="CC2361" bpmnElement="CC3504">
        <t071 x="17638" y="948" />
        <t071 x="17638" y="1022" />
      </t045>
      <t045 id="CC2092" bpmnElement="CC3196">
        <t071 x="11155" y="570" />
        <t071 x="11235" y="570" />
      </t045>
      <t045 id="CC2148" bpmnElement="CC3268">
        <t071 x="11130" y="595" />
        <t071 x="11130" y="668" />
      </t045>
      <t045 id="CC2359" bpmnElement="CC3502">
        <t071 x="11260" y="683" />
        <t071 x="11260" y="595" />
      </t045>
      <t045 id="CC2236" bpmnElement="CC3365">
        <t071 x="11180" y="708" />
        <t071 x="11235" y="708" />
      </t045>
      <t045 id="CC2088" bpmnElement="CC3192">
        <t071 x="11260" y="733" />
        <t071 x="11260" y="874" />
        <t071 x="11144" y="874" />
      </t045>
      <t045 id="CC2255" bpmnElement="CC3387">
        <t071 x="11126" y="766" />
        <t071 x="11126" y="856" />
      </t045>
      <t045 id="CC2462" bpmnElement="CC3619">
        <t071 x="13013" y="570" />
        <t071 x="13110" y="570" />
      </t045>
      <t045 id="CC2485" bpmnElement="CC3643">
        <t071 x="12178" y="595" />
        <t071 x="12178" y="762" />
        <t071 x="12360" y="762" />
      </t045>
      <t045 id="CC2409" bpmnElement="CC3558">
        <t071 x="12396" y="762" />
        <t071 x="12988" y="762" />
        <t071 x="12988" y="595" />
      </t045>
      <t045 id="CC2066" bpmnElement="CC3168">
        <t071 x="17373" y="570" />
        <t071 x="17613" y="570" />
      </t045>
      <t045 id="CC2104" bpmnElement="CC3211">
        <t071 x="10528" y="570" />
        <t071 x="10723" y="570" />
      </t045>
      <t045 id="CC2297" bpmnElement="CC3435">
        <t071 x="13698" y="628" />
        <t071 x="13698" y="690" />
      </t045>
      <t045 id="CC2315" bpmnElement="CC3456">
        <t071 x="13660" y="770" />
        <t071 x="13660" y="822" />
      </t045>
      <t045 id="CC2323" bpmnElement="CC3464">
        <t071 x="13543" y="570" />
        <t071 x="13648" y="570" />
      </t045>
      <t045 id="CC2195" bpmnElement="CC3319">
        <t071 x="13678" y="530" />
        <t071 x="13678" y="490" />
        <t071 x="12828" y="490" />
        <t071 x="12828" y="530" />
        <t046>
          <t070 x="13239" y="472" width="28" height="14" />
        </t046>
      </t045>
      <t045 id="CC2433" bpmnElement="CC3588">
        <t071 x="3170" y="685" />
        <t071 x="3170" y="814" />
        <t071 x="2936" y="814" />
        <t046>
          <t070 x="3175" y="757" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2180" bpmnElement="CC3304">
        <t071 x="28710" y="570" />
        <t071 x="28797" y="570" />
      </t045>
      <t045 id="CC1750" bpmnElement="CC3572">
        <t071 x="29119" y="570" />
        <t071 x="29238" y="570" />
      </t045>
      <t045 id="CC2492" bpmnElement="CC3651">
        <t071 x="29208" y="647" />
        <t071 x="29208" y="600" />
        <t071 x="29238" y="600" />
      </t045>
      <t045 id="CC1735" bpmnElement="CC3283">
        <t071 x="29338" y="570" />
        <t071 x="29439" y="570" />
      </t045>
      <t045 id="CC1736" bpmnElement="CC3224">
        <t071 x="29539" y="570" />
        <t071 x="29600" y="570" />
      </t045>
      <t045 id="CC1726" bpmnElement="CC3667">
        <t071 x="28822" y="805" />
        <t071 x="28822" y="915" />
        <t071 x="28908" y="915" />
      </t045>
      <t045 id="CC1731" bpmnElement="CC3470">
        <t071 x="29008" y="915" />
        <t071 x="29094" y="915" />
        <t071 x="29094" y="805" />
      </t045>
      <t045 id="CC1715" bpmnElement="CC3242" bioc:stroke="#000" bioc:fill="#fff">
        <t071 x="28847" y="570" />
        <t071 x="29069" y="570" />
        <t046>
          <t070 x="28922" y="552" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC1739" bpmnElement="CC3174">
        <t071 x="29094" y="755" />
        <t071 x="29094" y="595" />
      </t045>
      <t045 id="CC1746" bpmnElement="CC3654">
        <t071 x="28822" y="703" />
        <t071 x="28822" y="755" />
      </t045>
      <t045 id="CC1756" bpmnElement="CC3228">
        <t071 x="28847" y="780" />
        <t071 x="28908" y="780" />
      </t045>
      <t045 id="CC1771" bpmnElement="CC3344">
        <t071 x="29008" y="780" />
        <t071 x="29069" y="780" />
      </t045>
      <t045 id="CC1776" bpmnElement="CC3478" bioc:stroke="#000" bioc:fill="#fff">
        <t071 x="28822" y="595" />
        <t071 x="28822" y="667" />
        <t046>
          <t070 x="28840" y="608" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC1777" bpmnElement="CC3201" bioc:stroke="#000" bioc:fill="#fff">
        <t071 x="28252" y="595" />
        <t071 x="28252" y="698" />
        <t071 x="28340" y="698" />
        <t046>
          <t070 x="28274" y="683" width="12" height="14" />
        </t046>
      </t045>
      <t045 id="CC2348" bpmnElement="CC3491">
        <t071 x="29288" y="628" />
        <t071 x="29288" y="665" />
        <t071 x="29226" y="665" />
      </t045>
      <t045 id="CC2332" bpmnElement="CC3474">
        <t071 x="27858" y="570" />
        <t071 x="27928" y="570" />
      </t045>
      <t045 id="CC2069" bpmnElement="CC3172">
        <t071 x="27666" y="570" />
        <t071 x="27758" y="570" />
      </t045>
      <t045 id="CC2106" bpmnElement="CC3213">
        <t071 x="27456" y="677" />
        <t071 x="27456" y="590" />
        <t071 x="27566" y="590" />
        <t046>
          <t070 x="27461" y="631" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2473" bpmnElement="CC3631">
        <t071 x="27616" y="662" />
        <t071 x="27616" y="610" />
      </t045>
      <t045 id="CC2299" bpmnElement="CC3437">
        <t071 x="27268" y="760" />
        <t071 x="27268" y="800" />
        <t071 x="27138" y="800" />
        <t071 x="27138" y="702" />
        <t071 x="27246" y="702" />
      </t045>
      <t045 id="CC2132" bpmnElement="CC3247">
        <t071 x="27318" y="760" />
        <t071 x="27318" y="800" />
        <t071 x="27456" y="800" />
        <t071 x="27456" y="727" />
        <t046>
          <t070 x="27329" y="763" width="57" height="14" />
        </t046>
      </t045>
      <t045 id="CC1762" bpmnElement="CC3214">
        <t071 x="26071" y="700" />
        <t071 x="26145" y="700" />
      </t045>
      <t045 id="CC1772" bpmnElement="CC3567">
        <t071 x="26245" y="700" />
        <t071 x="26386" y="700" />
        <t071 x="26386" y="595" />
      </t045>
      <t045 id="CC1760" bpmnElement="CC3370" bioc:stroke="#000" bioc:fill="#fff">
        <t071 x="25513" y="570" />
        <t071 x="26361" y="570" />
        <t046>
          <t070 x="25557" y="552" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC1773" bpmnElement="CC3443">
        <t071 x="25488" y="595" />
        <t071 x="25488" y="700" />
        <t071 x="25563" y="700" />
        <t046>
          <t070 x="25506" y="610" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2185" bpmnElement="CC3309">
        <t071 x="26220" y="822" />
        <t071 x="26386" y="822" />
        <t071 x="26386" y="595" />
        <t046>
          <t070 x="26259" y="833" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2119" bpmnElement="CC3233">
        <t071 x="25581" y="930" />
        <t071 x="25581" y="718" />
      </t045>
      <t045 id="CC1716" bpmnElement="CC3571">
        <t071 x="25599" y="700" />
        <t071 x="25673" y="700" />
      </t045>
      <t045 id="CC1761" bpmnElement="CC3260">
        <t071 x="25773" y="700" />
        <t071 x="25847" y="700" />
      </t045>
      <t045 id="CC1733" bpmnElement="CC3448" bioc:stroke="#000" bioc:fill="#fff">
        <t071 x="25897" y="700" />
        <t071 x="25971" y="700" />
        <t046>
          <t070 x="25918" y="680" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC1737" bpmnElement="CC3262" bioc:stroke="#000" bioc:fill="#fff">
        <t071 x="25872" y="725" />
        <t071 x="25872" y="804" />
        <t046>
          <t070 x="25890" y="740" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2248" bpmnElement="CC3379">
        <t071 x="26195" y="758" />
        <t071 x="26195" y="797" />
      </t045>
      <t045 id="CC2204" bpmnElement="CC3328">
        <t071 x="26195" y="847" />
        <t071 x="26195" y="923" />
        <t046>
          <t070 x="26200" y="863" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2075" bpmnElement="CC3179">
        <t071 x="26170" y="948" />
        <t071 x="25599" y="948" />
        <t046>
          <t070 x="26120" y="955" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2093" bpmnElement="CC3198">
        <t071 x="26220" y="948" />
        <t071 x="26336" y="948" />
        <t046>
          <t070 x="26259" y="955" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2476" bpmnElement="CC3634">
        <t071 x="26411" y="908" />
        <t071 x="26411" y="883" />
        <t071 x="26361" y="883" />
        <t071 x="26361" y="908" />
      </t045>
      <t045 id="CC2489" bpmnElement="CC3647">
        <t071 x="26411" y="570" />
        <t071 x="26461" y="570" />
      </t045>
      <t045 id="CC2227" bpmnElement="CC3355">
        <t071 x="25401" y="570" />
        <t071 x="25463" y="570" />
      </t045>
      <t045 id="CC2122" bpmnElement="CC3236">
        <t071 x="2380" y="530" />
        <t071 x="2380" y="490" />
        <t071 x="2150" y="490" />
        <t071 x="2150" y="530" />
        <t046>
          <t070 x="2251" y="472" width="29" height="14" />
        </t046>
      </t045>
      <t045 id="CC2458" bpmnElement="CC3614">
        <t071 x="24148" y="570" />
        <t071 x="24186" y="570" />
      </t045>
      <t045 id="CC2144" bpmnElement="CC3264">
        <t071 x="24286" y="570" />
        <t071 x="24761" y="570" />
      </t045>
      <t045 id="CC2474" bpmnElement="CC3632">
        <t071 x="24236" y="628" />
        <t071 x="24236" y="683" />
      </t045>
      <t045 id="CC2399" bpmnElement="CC3547">
        <t071 x="770" y="570" />
        <t071 x="860" y="570" />
      </t045>
      <t045 id="CC2087" bpmnElement="CC3191">
        <t071 x="720" y="628" />
        <t071 x="720" y="680" />
        <t071 x="910" y="680" />
        <t071 x="910" y="610" />
      </t045>
      <t045 id="CC2282" bpmnElement="CC3420">
        <t071 x="482" y="570" />
        <t071 x="545" y="570" />
      </t045>
      <t045 id="CC2428" bpmnElement="CC3583">
        <t071 x="2943" y="570" />
        <t071 x="4215" y="570" />
      </t045>
      <t045 id="CC2175" bpmnElement="CC3298">
        <t071 x="2918" y="595" />
        <t071 x="2918" y="620" />
      </t045>
      <t045 id="CC2233" bpmnElement="CC3362">
        <t071 x="5350" y="595" />
        <t071 x="5350" y="682" />
        <t046>
          <t070 x="5359" y="633" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2330" bpmnElement="CC3472">
        <t071 x="5375" y="570" />
        <t071 x="5540" y="570" />
      </t045>
      <t045 id="CC2307" bpmnElement="CC3446">
        <t071 x="5330" y="762" />
        <t071 x="5330" y="827" />
      </t045>
      <t045 id="CC2242" bpmnElement="CC3372">
        <t071 x="5370" y="780" />
        <t071 x="5370" y="827" />
      </t045>
      <t045 id="CC2250" bpmnElement="CC3381">
        <t071 x="4160" y="642" />
        <t071 x="4160" y="570" />
        <t071 x="4215" y="570" />
      </t045>
      <t045 id="CC2301" bpmnElement="CC3439">
        <t071 x="8568" y="570" />
        <t071 x="8615" y="570" />
      </t045>
      <t045 id="CC2280" bpmnElement="CC3417">
        <t071 x="8827" y="570" />
        <t071 x="8883" y="570" />
      </t045>
      <t045 id="CC2454" bpmnElement="CC3608">
        <t071 x="8919" y="570" />
        <t071 x="8973" y="570" />
      </t045>
      <t045 id="CC2059" bpmnElement="CC3160">
        <t071 x="4414" y="628" />
        <t071 x="4414" y="637" />
        <t071 x="4480" y="637" />
      </t045>
      <t045 id="CC2287" bpmnElement="CC3425">
        <t071 x="5880" y="530" />
        <t071 x="5880" y="470" />
        <t071 x="4440" y="470" />
        <t071 x="4440" y="530" />
        <t046>
          <t070 x="5146" y="452" width="29" height="14" />
        </t046>
      </t045>
      <t045 id="CC2244" bpmnElement="CC3375">
        <t071 x="4390" y="530" />
        <t071 x="4390" y="490" />
        <t071 x="2430" y="490" />
        <t071 x="2430" y="530" />
        <t046>
          <t070 x="3396" y="472" width="29" height="14" />
        </t046>
      </t045>
      <t045 id="CC2073" bpmnElement="CC3177">
        <t071 x="21768" y="595" />
        <t071 x="21768" y="660" />
      </t045>
      <t045 id="CC2463" bpmnElement="CC3620">
        <t071 x="21738" y="740" />
        <t071 x="21738" y="792" />
      </t045>
      <t045 id="CC2294" bpmnElement="CC3432">
        <t071 x="21788" y="758" />
        <t071 x="21788" y="792" />
      </t045>
      <t045 id="CC2468" bpmnElement="CC3626">
        <t071 x="21788" y="828" />
        <t071 x="21788" y="878" />
      </t045>
      <t045 id="CC2125" bpmnElement="CC3239">
        <t071 x="21738" y="828" />
        <t071 x="21738" y="878" />
      </t045>
      <t045 id="CC2446" bpmnElement="CC3600">
        <t071 x="21768" y="958" />
        <t071 x="21768" y="1002" />
      </t045>
      <t045 id="CC2190" bpmnElement="CC3314">
        <t071 x="21793" y="570" />
        <t071 x="21918" y="570" />
      </t045>
      <t045 id="CC2440" bpmnElement="CC3594">
        <t071 x="21768" y="545" />
        <t071 x="21768" y="291" />
      </t045>
      <t045 id="CC1946" bpmnElement="CC3056">
        <t071 x="22280" y="251" />
        <t071 x="23480" y="251" />
        <t071 x="23480" y="545" />
      </t045>
      <t045 id="CC2367" bpmnElement="CC3510">
        <t071 x="10183" y="628" />
        <t071 x="10183" y="648" />
        <t071 x="10230" y="648" />
      </t045>
      <t045 id="CC2178" bpmnElement="CC3302">
        <t071 x="10177" y="530" />
        <t071 x="10177" y="500" />
        <t071 x="9168" y="500" />
        <t071 x="9168" y="530" />
        <t046>
          <t070 x="9659" y="482" width="28" height="14" />
        </t046>
      </t045>
      <t045 id="CC2335" bpmnElement="CC3477">
        <t071 x="20166" y="570" />
        <t071 x="20258" y="570" />
      </t045>
      <t045 id="CC2504" bpmnElement="CC3665">
        <t071 x="20358" y="570" />
        <t071 x="20433" y="570" />
      </t045>
      <t045 id="CC2393" bpmnElement="CC3540">
        <t071 x="20483" y="570" />
        <t071 x="20580" y="570" />
      </t045>
      <t045 id="CC2296" bpmnElement="CC3434">
        <t071 x="20458" y="595" />
        <t071 x="20458" y="683" />
      </t045>
      <t045 id="CC2224" bpmnElement="CC3352">
        <t071 x="20680" y="570" />
        <t071 x="20773" y="570" />
      </t045>
      <t045 id="CC2419" bpmnElement="CC3573">
        <t071 x="20798" y="683" />
        <t071 x="20798" y="595" />
      </t045>
      <t045 id="CC2072" bpmnElement="CC3176">
        <t071 x="20823" y="570" />
        <t071 x="21228" y="570" />
      </t045>
      <t045 id="CC2234" bpmnElement="CC3363">
        <t071 x="10048" y="595" />
        <t071 x="10048" y="730" />
        <t071 x="10312" y="730" />
        <t071 x="10312" y="595" />
      </t045>
      <t045 id="CC2333" bpmnElement="CC3475">
        <t071 x="10073" y="570" />
        <t071 x="10127" y="570" />
      </t045>
      <t045 id="CC2429" bpmnElement="CC3584">
        <t071 x="10227" y="570" />
        <t071 x="10287" y="570" />
      </t045>
      <t045 id="CC2174" bpmnElement="CC3297">
        <t071 x="10337" y="570" />
        <t071 x="10428" y="570" />
      </t045>
      <t045 id="CC2124" bpmnElement="CC3238">
        <t071 x="1818" y="570" />
        <t071 x="1945" y="570" />
      </t045>
      <t045 id="CC2479" bpmnElement="CC3637">
        <t071 x="1793" y="595" />
        <t071 x="1793" y="650" />
      </t045>
      <t045 id="CC2389" bpmnElement="CC3536">
        <t071 x="595" y="570" />
        <t071 x="670" y="570" />
        <t046>
          <t070 x="615" y="552" width="18" height="14" />
        </t046>
      </t045>
      <t045 id="CC2501" bpmnElement="CC3662">
        <t071 x="570" y="595" />
        <t071 x="570" y="786" />
        <t071 x="670" y="786" />
        <t046>
          <t070 x="575" y="687" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2080" bpmnElement="CC3184">
        <t071 x="770" y="786" />
        <t071 x="910" y="786" />
        <t071 x="910" y="610" />
      </t045>
      <t045 id="CC2425" bpmnElement="CC3580">
        <t071 x="720" y="844" />
        <t071 x="720" y="873" />
        <t071 x="910" y="873" />
        <t071 x="910" y="610" />
      </t045>
      <t045 id="CC2149" bpmnElement="CC3269">
        <t071 x="9192" y="570" />
        <t071 x="9260" y="570" />
      </t045>
      <t045 id="CC2232" bpmnElement="CC3361">
        <t071 x="9360" y="570" />
        <t071 x="9400" y="570" />
      </t045>
      <t045 id="CC2181" bpmnElement="CC3305">
        <t071 x="9705" y="570" />
        <t071 x="9830" y="570" />
      </t045>
      <t045 id="CC2483" bpmnElement="CC3641">
        <t071 x="9680" y="595" />
        <t071 x="9680" y="737" />
      </t045>
      <t045 id="CC2167" bpmnElement="CC3290">
        <t071 x="9655" y="762" />
        <t071 x="9360" y="762" />
        <t046>
          <t070 x="9494" y="740" width="79" height="14" />
        </t046>
      </t045>
      <t045 id="CC2082" bpmnElement="CC3186">
        <t071 x="9680" y="787" />
        <t071 x="9680" y="874" />
        <t071 x="9360" y="874" />
        <t046>
          <t070 x="9494" y="853" width="63" height="14" />
        </t046>
      </t045>
      <t045 id="CC2384" bpmnElement="CC3531">
        <t071 x="9705" y="570" />
        <t071 x="9740" y="570" />
        <t071 x="9740" y="976" />
        <t071 x="9360" y="976" />
        <t046>
          <t070 x="9518" y="955" width="85" height="14" />
        </t046>
      </t045>
      <t045 id="CC2290" bpmnElement="CC3428">
        <t071 x="9500" y="570" />
        <t071 x="9655" y="570" />
      </t045>
      <t045 id="CC2266" bpmnElement="CC3401">
        <t071 x="9930" y="570" />
        <t071 x="10023" y="570" />
      </t045>
      <t045 id="CC2089" bpmnElement="CC3193">
        <t071 x="9242" y="762" />
        <t071 x="8998" y="762" />
        <t071 x="8998" y="595" />
      </t045>
      <t045 id="CC2215" bpmnElement="CC3340">
        <t071 x="9242" y="874" />
        <t071 x="8998" y="874" />
        <t071 x="8998" y="595" />
      </t045>
      <t045 id="CC2146" bpmnElement="CC3266">
        <t071 x="9242" y="976" />
        <t071 x="8998" y="976" />
        <t071 x="8998" y="595" />
      </t045>
      <t045 id="CC2084" bpmnElement="CC3188">
        <t071 x="13870" y="628" />
        <t071 x="13870" y="670" />
        <t071 x="13892" y="670" />
      </t045>
      <t045 id="CC2273" bpmnElement="CC3408">
        <t071 x="13920" y="570" />
        <t071 x="13990" y="570" />
      </t045>
      <t045 id="CC2062" bpmnElement="CC3164">
        <t071 x="14300" y="766" />
        <t071 x="14300" y="822" />
      </t045>
      <t045 id="CC2254" bpmnElement="CC3385">
        <t071 x="14450" y="766" />
        <t071 x="14450" y="828" />
      </t045>
      <t045 id="CC2221" bpmnElement="CC3348">
        <t071 x="14350" y="708" />
        <t071 x="14400" y="708" />
      </t045>
      <t045 id="CC2347" bpmnElement="CC3490">
        <t071 x="14450" y="668" />
        <t071 x="14450" y="630" />
        <t071 x="14300" y="630" />
        <t071 x="14300" y="668" />
        <t046>
          <t070 x="14361" y="612" width="29" height="14" />
        </t046>
      </t045>
      <t045 id="CC2107" bpmnElement="CC3215">
        <t071 x="14250" y="730" />
        <t071 x="13730" y="730" />
        <t071 x="13730" y="610" />
        <t046>
          <t070 x="13977" y="712" width="29" height="14" />
        </t046>
      </t045>
      <t045 id="CC2339" bpmnElement="CC3482">
        <t071 x="23660" y="570" />
        <t071 x="23710" y="570" />
      </t045>
      <t045 id="CC2199" bpmnElement="CC3323">
        <t071 x="23810" y="570" />
        <t071 x="23855" y="570" />
      </t045>
      <t045 id="CC2265" bpmnElement="CC3400">
        <t071 x="23905" y="570" />
        <t071 x="23963" y="570" />
      </t045>
      <t045 id="CC2222" bpmnElement="CC3349">
        <t071 x="23480" y="595" />
        <t071 x="23480" y="690" />
        <t071 x="23880" y="690" />
        <t071 x="23880" y="595" />
        <t046>
          <t070 x="23671" y="672" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2484" bpmnElement="CC3642">
        <t071 x="23288" y="570" />
        <t071 x="23455" y="570" />
      </t045>
      <t045 id="CC2240" bpmnElement="CC3369">
        <t071 x="15022" y="628" />
        <t071 x="15022" y="662" />
      </t045>
      <t045 id="CC2390" bpmnElement="CC3537">
        <t071 x="14730" y="570" />
        <t071 x="14798" y="570" />
      </t045>
      <t045 id="CC2182" bpmnElement="CC3306">
        <t071 x="15020" y="530" />
        <t071 x="15020" y="490" />
        <t071 x="13710" y="490" />
        <t071 x="13710" y="530" />
        <t046>
          <t070 x="14351" y="472" width="29" height="14" />
        </t046>
      </t045>
      <t045 id="CC2238" bpmnElement="CC3367">
        <t071 x="14500" y="708" />
        <t071 x="14550" y="708" />
        <t071 x="14550" y="595" />
      </t045>
      <t045 id="CC2108" bpmnElement="CC3216">
        <t071 x="14200" y="595" />
        <t071 x="14200" y="690" />
        <t071 x="14250" y="690" />
        <t046>
          <t070 x="14209" y="640" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2205" bpmnElement="CC3329">
        <t071 x="14225" y="570" />
        <t071 x="14525" y="570" />
        <t046>
          <t070 x="14365" y="552" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2445" bpmnElement="CC3599">
        <t071 x="14090" y="570" />
        <t071 x="14175" y="570" />
      </t045>
      <t045 id="CC1751" bpmnElement="CC3625">
        <t071 x="15240" y="530" />
        <t071 x="15240" y="490" />
        <t071 x="15180" y="490" />
        <t071 x="15180" y="530" />
        <t046>
          <t070 x="15197" y="473" width="86" height="14" />
        </t046>
      </t045>
      <t045 id="CC2352" bpmnElement="CC3495">
        <t071 x="15210" y="628" />
        <t071 x="15210" y="690" />
        <t071 x="15265" y="690" />
      </t045>
      <t045 id="CC2405" bpmnElement="CC3553">
        <t071 x="15260" y="570" />
        <t071 x="15495" y="570" />
      </t045>
      <t045 id="CC2079" bpmnElement="CC3183">
        <t071 x="14575" y="570" />
        <t071 x="14630" y="570" />
      </t045>
      <t045 id="CC2507" bpmnElement="CC3670">
        <t071 x="4265" y="570" />
        <t071 x="4364" y="570" />
        <t046>
          <t070 x="4308" y="552" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2140" bpmnElement="CC3256">
        <t071 x="4240" y="595" />
        <t071 x="4240" y="730" />
        <t071 x="5020" y="730" />
        <t071 x="5020" y="570" />
        <t071 x="5325" y="570" />
        <t046>
          <t070 x="4259" y="639" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2422" bpmnElement="CC3577">
        <t071 x="4970" y="570" />
        <t071 x="5325" y="570" />
      </t045>
      <t045 id="CC2142" bpmnElement="CC3261">
        <t071 x="4920" y="628" />
        <t071 x="4920" y="640" />
        <t071 x="4952" y="640" />
      </t045>
      <t045 id="CC2147" bpmnElement="CC3267">
        <t071 x="4464" y="570" />
        <t071 x="4535" y="570" />
      </t045>
      <t045 id="CC2105" bpmnElement="CC3212">
        <t071 x="4817" y="570" />
        <t071 x="4870" y="570" />
        <t046>
          <t070 x="4836" y="552" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2341" bpmnElement="CC3484">
        <t071 x="4792" y="545" />
        <t071 x="4792" y="500" />
        <t071 x="5350" y="500" />
        <t071 x="5350" y="545" />
        <t046>
          <t070 x="5061" y="482" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2246" bpmnElement="CC3377">
        <t071 x="13748" y="570" />
        <t071 x="13820" y="570" />
      </t045>
      <t045 id="CC2196" bpmnElement="CC3320">
        <t071 x="23505" y="570" />
        <t071 x="23560" y="570" />
      </t045>
      <t045 id="CC2351" bpmnElement="CC3494">
        <t071 x="26486" y="595" />
        <t071 x="26486" y="677" />
      </t045>
      <t045 id="CC2230" bpmnElement="CC3359">
        <t071 x="26511" y="702" />
        <t071 x="26556" y="702" />
      </t045>
      <t045 id="CC2472" bpmnElement="CC3630">
        <t071 x="26796" y="702" />
        <t071 x="26821" y="702" />
      </t045>
      <t045 id="CC2293" bpmnElement="CC3431">
        <t071 x="26846" y="677" />
        <t071 x="26846" y="595" />
      </t045>
      <t045 id="CC2275" bpmnElement="CC3410">
        <t071 x="26486" y="727" />
        <t071 x="26486" y="790" />
        <t071 x="26846" y="790" />
        <t071 x="26846" y="727" />
        <t046>
          <t070 x="26632" y="756" width="76" height="27" />
        </t046>
      </t045>
      <t045 id="CC2123" bpmnElement="CC3237">
        <t071 x="15070" y="570" />
        <t071 x="15160" y="570" />
      </t045>
      <t045 id="CC2067" bpmnElement="CC3170">
        <t071 x="5640" y="570" />
        <t071 x="5722" y="570" />
      </t045>
      <t045 id="CC2239" bpmnElement="CC3368">
        <t071 x="5758" y="570" />
        <t071 x="5844" y="570" />
      </t045>
      <t045 id="CC2241" bpmnElement="CC3371">
        <t071 x="6880" y="570" />
        <t071 x="6930" y="570" />
      </t045>
      <t045 id="CC2081" bpmnElement="CC3185">
        <t071 x="7030" y="570" />
        <t071 x="7115" y="570" />
      </t045>
      <t045 id="CC2455" bpmnElement="CC3611">
        <t071 x="2452" y="570" />
        <t071 x="2495" y="570" />
      </t045>
      <t045 id="CC2131" bpmnElement="CC3246">
        <t071 x="2640" y="628" />
        <t071 x="2640" y="640" />
        <t071 x="2800" y="640" />
        <t071 x="2800" y="610" />
      </t045>
      <t045 id="CC2304" bpmnElement="CC3441">
        <t071 x="2690" y="570" />
        <t071 x="2750" y="570" />
      </t045>
      <t045 id="CC2346" bpmnElement="CC3489">
        <t071 x="2850" y="570" />
        <t071 x="2893" y="570" />
      </t045>
      <t045 id="CC2126" bpmnElement="CC3240">
        <t071 x="2520" y="545" />
        <t071 x="2520" y="520" />
        <t071 x="2918" y="520" />
        <t071 x="2918" y="545" />
        <t046>
          <t070 x="2688" y="502" width="63" height="14" />
        </t046>
      </t045>
      <t045 id="CC2156" bpmnElement="CC3277">
        <t071 x="2545" y="570" />
        <t071 x="2590" y="570" />
      </t045>
      <t045 id="CC2434" bpmnElement="CC3589">
        <t071 x="12360" y="570" />
        <t071 x="12420" y="570" />
      </t045>
      <t045 id="CC2173" bpmnElement="CC3296">
        <t071 x="12310" y="628" />
        <t071 x="12310" y="690" />
        <t071 x="12420" y="690" />
      </t045>
      <t045 id="CC2343" bpmnElement="CC3486">
        <t071 x="12520" y="690" />
        <t071 x="12628" y="690" />
        <t071 x="12628" y="595" />
      </t045>
      <t045 id="CC2490" bpmnElement="CC3649">
        <t071 x="12520" y="570" />
        <t071 x="12603" y="570" />
      </t045>
      <t045 id="CC2300" bpmnElement="CC3438">
        <t071 x="12653" y="570" />
        <t071 x="12684" y="570" />
      </t045>
      <t045 id="CC2423" bpmnElement="CC3578">
        <t071 x="12203" y="570" />
        <t071 x="12260" y="570" />
      </t045>
      <t045 id="CC2471" bpmnElement="CC3629">
        <t071 x="12720" y="570" />
        <t071 x="12758" y="570" />
      </t045>
      <t045 id="CC2418" bpmnElement="CC3570">
        <t071 x="16493" y="570" />
        <t071 x="16563" y="570" />
      </t045>
      <t045 id="CC2371" bpmnElement="CC3517">
        <t071 x="16380" y="570" />
        <t071 x="16443" y="570" />
      </t045>
      <t045 id="CC2391" bpmnElement="CC3538">
        <t071 x="15870" y="570" />
        <t071 x="15940" y="570" />
      </t045>
      <t045 id="CC2313" bpmnElement="CC3454">
        <t071 x="16040" y="570" />
        <t071 x="16110" y="570" />
      </t045>
      <t045 id="CC2318" bpmnElement="CC3459">
        <t071 x="16210" y="570" />
        <t071 x="16280" y="570" />
      </t045>
      <t045 id="CC2414" bpmnElement="CC3565">
        <t071 x="16168" y="628" />
        <t071 x="16168" y="648" />
        <t071 x="16468" y="648" />
        <t071 x="16468" y="595" />
      </t045>
      <t045 id="CC2337" bpmnElement="CC3480">
        <t071 x="15820" y="723" />
        <t071 x="15820" y="695" />
        <t046>
          <t070 x="15839" y="706" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2223" bpmnElement="CC3351">
        <t071 x="15545" y="570" />
        <t071 x="15770" y="570" />
        <t046>
          <t070 x="15650" y="552" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2372" bpmnElement="CC3518">
        <t071 x="15520" y="595" />
        <t071 x="15520" y="708" />
        <t046>
          <t070 x="15532" y="633" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2356" bpmnElement="CC3499">
        <t071 x="15820" y="773" />
        <t071 x="15820" y="811" />
        <t046>
          <t070 x="15830" y="785" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2097" bpmnElement="CC3203">
        <t071 x="15570" y="748" />
        <t071 x="15630" y="748" />
      </t045>
      <t045 id="CC2203" bpmnElement="CC3327">
        <t071 x="15730" y="748" />
        <t071 x="15795" y="748" />
      </t045>
      <t045 id="CC2328" bpmnElement="CC3469">
        <t071 x="15520" y="806" />
        <t071 x="15520" y="851" />
        <t071 x="15770" y="851" />
      </t045>
      <t045 id="CC2068" bpmnElement="CC3171">
        <t071 x="1713" y="570" />
        <t071 x="1768" y="570" />
      </t045>
      <t045 id="CC2251" bpmnElement="CC3382">
        <t071 x="15820" y="891" />
        <t071 x="15820" y="933" />
      </t045>
      <t045 id="CC2158" bpmnElement="CC3279">
        <t071 x="1681" y="690" />
        <t071 x="1743" y="690" />
      </t045>
      <t045 id="CC1718" bpmnElement="CC3251">
        <t071 x="1070" y="570" />
        <t071 x="1120" y="570" />
        <t046>
          <t070 x="1087" y="552" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC1727" bpmnElement="CC3350">
        <t071 x="1145" y="595" />
        <t071 x="1145" y="635" />
        <t046>
          <t070 x="1152" y="604" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC1740" bpmnElement="CC3576">
        <t071 x="1170" y="660" />
        <t071 x="1210" y="660" />
        <t046>
          <t070 x="1175" y="633" width="20" height="14" />
        </t046>
      </t045>
      <t045 id="CC1747" bpmnElement="CC3373">
        <t071 x="1145" y="685" />
        <t071 x="1145" y="827" />
        <t071 x="1185" y="827" />
        <t046>
          <t070 x="1150" y="744" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC1767" bpmnElement="CC3418">
        <t071 x="1250" y="877" />
        <t071 x="1391" y="877" />
        <t071 x="1391" y="700" />
      </t045>
      <t045 id="CC1713" bpmnElement="CC3669">
        <t071 x="1260" y="718" />
        <t071 x="1260" y="770" />
        <t071 x="1391" y="770" />
        <t071 x="1391" y="700" />
      </t045>
      <t045 id="CC1744" bpmnElement="CC3524">
        <t071 x="1310" y="660" />
        <t071 x="1341" y="660" />
      </t045>
      <t045 id="CC1714" bpmnElement="CC3516">
        <t071 x="1285" y="827" />
        <t071 x="1391" y="827" />
        <t071 x="1391" y="700" />
      </t045>
      <t045 id="CC2340" bpmnElement="CC3483">
        <t071 x="960" y="570" />
        <t071 x="1020" y="570" />
      </t045>
      <t045 id="CC2213" bpmnElement="CC3337">
        <t071 x="1045" y="545" />
        <t071 x="1045" y="500" />
        <t071 x="1793" y="500" />
        <t071 x="1793" y="545" />
        <t046>
          <t070 x="1409" y="482" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2211" bpmnElement="CC3335">
        <t071 x="1170" y="570" />
        <t071 x="1613" y="570" />
        <t046>
          <t070 x="1382" y="552" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2258" bpmnElement="CC3393">
        <t071 x="1441" y="660" />
        <t071 x="1527" y="660" />
        <t071 x="1527" y="570" />
        <t071 x="1613" y="570" />
      </t045>
      <t045 id="CC2133" bpmnElement="CC3248">
        <t071 x="7165" y="570" />
        <t071 x="7440" y="570" />
        <t046>
          <t070 x="7295" y="552" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2395" bpmnElement="CC3542">
        <t071 x="7140" y="595" />
        <t071 x="7140" y="668" />
        <t046>
          <t070 x="7111" y="623" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2257" bpmnElement="CC3392">
        <t071 x="6740" y="570" />
        <t071 x="6780" y="570" />
      </t045>
      <t045 id="CC2345" bpmnElement="CC3488">
        <t071 x="11350" y="545" />
        <t071 x="11350" y="390" />
        <t071 x="14630" y="390" />
        <t046>
          <t070 x="11175" y="536" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2214" bpmnElement="CC3338">
        <t071 x="11375" y="570" />
        <t071 x="11418" y="570" />
        <t046>
          <t070 x="11386" y="552" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2218" bpmnElement="CC3343">
        <t071 x="11285" y="570" />
        <t071 x="11325" y="570" />
      </t045>
      <t045 id="CC2416" bpmnElement="CC3568">
        <t071 x="8665" y="570" />
        <t071 x="8727" y="570" />
      </t045>
      <t045 id="CC2386" bpmnElement="CC3533">
        <t071 x="8640" y="595" />
        <t071 x="8640" y="668" />
      </t045>
      <t045 id="CC2291" bpmnElement="CC3429">
        <t071 x="8690" y="708" />
        <t071 x="8727" y="708" />
      </t045>
      <t045 id="CC2412" bpmnElement="CC3561">
        <t071 x="8777" y="668" />
        <t071 x="8777" y="610" />
      </t045>
      <t045 id="CC2355" bpmnElement="CC3498">
        <t071 x="28140" y="545" />
        <t071 x="28140" y="468" />
        <t071 x="29439" y="468" />
        <t046>
          <t070 x="28121" y="499" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2308" bpmnElement="CC3447">
        <t071 x="28165" y="570" />
        <t071 x="28227" y="570" />
        <t046>
          <t070 x="28186" y="552" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2128" bpmnElement="CC3243">
        <t071 x="7360" y="708" />
        <t071 x="7450" y="708" />
        <t071 x="7450" y="610" />
      </t045>
      <t045 id="CC2353" bpmnElement="CC3496">
        <t071 x="7190" y="708" />
        <t071 x="7260" y="708" />
      </t045>
      <t045 id="CC2407" bpmnElement="CC3555">
        <t071 x="7855" y="570" />
        <t071 x="8065" y="570" />
      </t045>
      <t045 id="CC2478" bpmnElement="CC3636">
        <t071 x="7830" y="595" />
        <t071 x="7830" y="650" />
      </t045>
      <t045 id="CC2432" bpmnElement="CC3587">
        <t071 x="7880" y="690" />
        <t071 x="7950" y="690" />
      </t045>
      <t045 id="CC2392" bpmnElement="CC3539">
        <t071 x="8000" y="650" />
        <t071 x="8000" y="570" />
        <t071 x="8065" y="570" />
      </t045>
      <t045 id="CC2334" bpmnElement="CC3476">
        <t071 x="29539" y="468" />
        <t071 x="29618" y="468" />
        <t071 x="29618" y="552" />
      </t045>
      <t045 id="CC2292" bpmnElement="CC3430">
        <t071 x="15845" y="958" />
        <t071 x="16032" y="958" />
        <t046>
          <t070 x="15911" y="929" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2397" bpmnElement="CC3544">
        <t071 x="15820" y="983" />
        <t071 x="15820" y="1070" />
        <t071 x="16000" y="1070" />
        <t046>
          <t070 x="15874" y="1046" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2056" bpmnElement="CC3157">
        <t071 x="16050" y="1128" />
        <t071 x="16050" y="1157" />
      </t045>
      <t045 id="CC2435" bpmnElement="CC3590">
        <t071 x="16010" y="1110" />
        <t071 x="16010" y="1175" />
        <t071 x="16032" y="1175" />
      </t045>
      <t045 id="CC2253" bpmnElement="CC3384">
        <t071 x="15820" y="645" />
        <t071 x="15820" y="610" />
        <t046>
          <t070 x="15792" y="626" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2188" bpmnElement="CC3312">
        <t071 x="15845" y="670" />
        <t071 x="16030" y="670" />
        <t071 x="16030" y="708" />
        <t046>
          <t070 x="15912" y="656" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2192" bpmnElement="CC3316">
        <t071 x="16030" y="806" />
        <t071 x="16030" y="852" />
        <t071 x="16250" y="852" />
      </t045>
      <t045 id="CC2100" bpmnElement="CC3207">
        <t071 x="16080" y="748" />
        <t071 x="16128" y="748" />
      </t045>
      <t045 id="CC2120" bpmnElement="CC3234">
        <t071 x="16228" y="748" />
        <t071 x="16275" y="748" />
      </t045>
      <t045 id="CC2469" bpmnElement="CC3627">
        <t071 x="16300" y="723" />
        <t071 x="16300" y="670" />
        <t071 x="16060" y="670" />
        <t071 x="16060" y="630" />
        <t071 x="15850" y="630" />
        <t071 x="15850" y="610" />
        <t046>
          <t070 x="16305" y="697" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2381" bpmnElement="CC3528">
        <t071 x="16300" y="892" />
        <t071 x="16300" y="933" />
      </t045>
      <t045 id="CC2085" bpmnElement="CC3189">
        <t071 x="16275" y="958" />
        <t071 x="16068" y="958" />
        <t046>
          <t070 x="16165" y="929" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2208" bpmnElement="CC3332">
        <t071 x="16300" y="983" />
        <t071 x="16300" y="1070" />
        <t071 x="16100" y="1070" />
        <t046>
          <t070 x="16189" y="1046" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2109" bpmnElement="CC3217">
        <t071 x="16300" y="773" />
        <t071 x="16300" y="812" />
        <t046>
          <t070 x="16307" y="779" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2163" bpmnElement="CC3286">
        <t071 x="4585" y="570" />
        <t071 x="4767" y="570" />
        <t046>
          <t070 x="4668" y="552" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2095" bpmnElement="CC3200">
        <t071 x="4560" y="595" />
        <t071 x="4560" y="640" />
        <t071 x="4612" y="640" />
        <t046>
          <t070 x="4567" y="615" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2465" bpmnElement="CC3622">
        <t071 x="4712" y="640" />
        <t071 x="4742" y="640" />
      </t045>
      <t045 id="CC2264" bpmnElement="CC3399">
        <t071 x="3760" y="660" />
        <t071 x="3810" y="660" />
      </t045>
      <t045 id="CC2155" bpmnElement="CC3275">
        <t071 x="3610" y="660" />
        <t071 x="3660" y="660" />
      </t045>
      <t045 id="CC2094" bpmnElement="CC3199">
        <t071 x="3300" y="660" />
        <t071 x="3360" y="660" />
        <t046>
          <t070 x="3321" y="642" width="19" height="14" />
        </t046>
      </t045>
      <t045 id="CC2486" bpmnElement="CC3644">
        <t071 x="3460" y="660" />
        <t071 x="3510" y="660" />
      </t045>
      <t045 id="CC2070" bpmnElement="CC3173">
        <t071 x="3410" y="718" />
        <t071 x="3410" y="814" />
        <t071 x="2936" y="814" />
      </t045>
      <t045 id="CC2116" bpmnElement="CC3230">
        <t071 x="3710" y="718" />
        <t071 x="3710" y="814" />
        <t071 x="2936" y="814" />
      </t045>
      <t045 id="CC2368" bpmnElement="CC3511">
        <t071 x="3760" y="874" />
        <t071 x="3810" y="874" />
      </t045>
      <t045 id="CC2189" bpmnElement="CC3313">
        <t071 x="3610" y="874" />
        <t071 x="3660" y="874" />
      </t045>
      <t045 id="CC2063" bpmnElement="CC3165">
        <t071 x="3460" y="874" />
        <t071 x="3510" y="874" />
      </t045>
      <t045 id="CC2502" bpmnElement="CC3663">
        <t071 x="3275" y="685" />
        <t071 x="3275" y="874" />
        <t071 x="3360" y="874" />
        <t046>
          <t070 x="3280" y="757" width="21" height="14" />
        </t046>
      </t045>
      <t045 id="CC2206" bpmnElement="CC3330">
        <t071 x="3910" y="660" />
        <t071 x="3990" y="660" />
      </t045>
      <t045 id="CC2447" bpmnElement="CC3602">
        <t071 x="3910" y="874" />
        <t071 x="3950" y="874" />
        <t071 x="3950" y="660" />
        <t071 x="3990" y="660" />
      </t045>
      <t045 id="CC2475" bpmnElement="CC3633">
        <t071 x="3410" y="932" />
        <t071 x="3410" y="968" />
        <t071 x="2918" y="968" />
        <t071 x="2918" y="832" />
      </t045>
      <t045 id="CC2388" bpmnElement="CC3535">
        <t071 x="3710" y="932" />
        <t071 x="3710" y="968" />
        <t071 x="2918" y="968" />
        <t071 x="2918" y="832" />
      </t045>
      <t045 id="CC2495" bpmnElement="CC3655">
        <t071 x="11030" y="570" />
        <t071 x="11105" y="570" />
      </t045>
      <t045 id="CC2055" bpmnElement="CC3156">
        <t071 x="10990" y="628" />
        <t071 x="10990" y="690" />
        <t071 x="11010" y="690" />
      </t045>
      <t045 id="CC2267" bpmnElement="CC3402">
        <t071 x="11108" y="874" />
        <t071 x="10960" y="874" />
        <t071 x="10960" y="610" />
      </t045>
      <t045 id="CC2226" bpmnElement="CC3354">
        <t071 x="10823" y="570" />
        <t071 x="10930" y="570" />
      </t045>
      <t045 id="CC2396" bpmnElement="CC3543">
        <t071 x="10960" y="530" />
        <t071 x="10960" y="470" />
        <t071 x="9142" y="470" />
        <t071 x="9142" y="530" />
      </t045>
      <t045 id="CC2098" bpmnElement="CC3205">
        <t071 x="13210" y="570" />
        <t071 x="13293" y="570" />
      </t045>
      <t045 id="CC2378" bpmnElement="CC3525">
        <t071 x="14898" y="570" />
        <t071 x="14970" y="570" />
      </t045>
      <t045 id="CC2480" bpmnElement="CC3638">
        <t071 x="14730" y="390" />
        <t071 x="14796" y="390" />
      </t045>
      <t045 id="CC2064" bpmnElement="CC3166">
        <t071 x="14896" y="390" />
        <t071 x="15040" y="390" />
        <t071 x="15040" y="530" />
      </t045>
      <t045 id="CC1741" bpmnElement="CC3258" bioc:stroke="#000" bioc:fill="#fff">
        <t071 x="28277" y="570" />
        <t071 x="28340" y="570" />
        <t046>
          <t070 x="28287" y="583" width="25" height="14" />
        </t046>
      </t045>
      <t045 id="CC2443" bpmnElement="CC3597">
        <t071 x="28620" y="698" />
        <t071 x="28685" y="698" />
        <t071 x="28685" y="595" />
      </t045>
      <t045 id="CC2057" bpmnElement="CC3158">
        <t071 x="28440" y="698" />
        <t071 x="28520" y="698" />
      </t045>
      <t045 id="CC2358" bpmnElement="CC3501">
        <t071 x="28440" y="570" />
        <t071 x="28520" y="570" />
      </t045>
      <t045 id="CC2229" bpmnElement="CC3358">
        <t071 x="28620" y="570" />
        <t071 x="28660" y="570" />
      </t045>
      <t045 id="CC2201" bpmnElement="CC3325">
        <t071 x="1793" y="886" />
        <t071 x="1793" y="919" />
      </t045>
      <t045 id="CC2322" bpmnElement="CC3463">
        <t071 x="1995" y="570" />
        <t071 x="2102" y="570" />
      </t045>
      <t045 id="CC2111" bpmnElement="CC3220">
        <t071 x="1970" y="595" />
        <t071 x="1970" y="846" />
        <t071 x="1843" y="846" />
      </t045>
      <t045 id="CC2256" bpmnElement="CC3390">
        <t071 x="1793" y="969" />
        <t071 x="1793" y="1002" />
      </t045>
      <t045 id="CC2415" bpmnElement="CC3566">
        <t071 x="1818" y="944" />
        <t071 x="2040" y="944" />
        <t071 x="2040" y="570" />
        <t071 x="2102" y="570" />
      </t045>
      <t045 id="CC2302" bpmnElement="CC3440">
        <t071 x="2177" y="690" />
        <t071 x="2224" y="690" />
      </t045>
      <t045 id="CC2157" bpmnElement="CC3278">
        <t071 x="2152" y="715" />
        <t071 x="2152" y="777" />
      </t045>
      <t045 id="CC2114" bpmnElement="CC3223">
        <t071 x="5350" y="907" />
        <t071 x="5350" y="958" />
      </t045>
      <t045 id="CC2453" bpmnElement="CC3607">
        <t071 x="1793" y="748" />
        <t071 x="1793" y="806" />
      </t045>
      <t045 id="CC2243" bpmnElement="CC3374">
        <t071 x="1760" y="730" />
        <t071 x="1760" y="806" />
      </t045>
      <t045 id="CC2286" bpmnElement="CC3424">
        <t071 x="3100" y="660" />
        <t071 x="3145" y="660" />
      </t045>
      <t045 id="CC2316" bpmnElement="CC3457">
        <t071 x="2918" y="718" />
        <t071 x="2918" y="796" />
      </t045>
      <t045 id="CC2197" bpmnElement="CC3321">
        <t071 x="2968" y="660" />
        <t071 x="3000" y="660" />
      </t045>
      <t045 id="CC2281" bpmnElement="CC3419">
        <t071 x="21328" y="570" />
        <t071 x="21500" y="570" />
      </t045>
      <t045 id="CC2436" bpmnElement="CC3591">
        <t071 x="21600" y="570" />
        <t071 x="21743" y="570" />
      </t045>
      <t045 id="CC0821" bpmnElement="CC1161">
        <t071 x="24353" y="692" />
        <t071 x="24361" y="673" />
      </t045>
      <t045 id="CC0822" bpmnElement="CC1162">
        <t071 x="24357" y="800" />
        <t071 x="24356" y="801" />
      </t045>
      <t045 id="CC1734" bpmnElement="CC1163">
        <t071 x="10508" y="628" />
        <t071 x="10508" y="690" />
        <t071 x="10548" y="690" />
      </t045>
      <t045 id="CC1770" bpmnElement="CC1160">
        <t071 x="22146" y="694" />
        <t071 x="22132" y="678" />
      </t045>
    </t047>
  </t044>
</t010>
