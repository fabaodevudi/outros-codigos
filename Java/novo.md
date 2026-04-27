import groovy.json.JsonOutput
import groovy.json.JsonSlurperClassic
import java.math.RoundingMode

def dadosProposta = new JsonSlurperClassic()
  .parseText(execution.getVariable('dados_proposta').toString())

def npc = dadosProposta.oferta_multiplo_npc
def produto = dadosProposta.oferta_produto
def responseConsultaConta = execution.hasVariable('responseConsultaConta') ? execution.getVariable('responseConsultaConta') : null
def idContaFormalizacao = (execution.hasVariable('numero_unico_conta') && numero_unico_conta != null && numero_unico_conta != 'null' && numero_unico_conta != '') ? execution.getVariable('numero_unico_conta') : responseConsultaConta[0].id_conta

def corpoFormalizacaoNpc = [
  idintencao: npc.id_intencao,
  pessoa: [idPessoa: execution.getVariable('id_pessoa')],
  canal: [
    canalOrigem: npc.canal_origem_npc,
    subcanalOrigem: npc.subcanal_origem_npc
  ],
  conta: [
    idConta: idContaFormalizacao,
    tipo: produto.codigo_tipo_conta.toString().trim(),
    segmento: produto.codigo_segmento_cliente.toString().trim()
  ],
  produtosEscolhidos: [[
    idOferta: npc.id_oferta,
    idProdutoOferta: npc.id_produto,
    limiteCreditoSelecionado: new BigDecimal(npc.limite_pre_aprovado.toString().trim()).setScale(0, RoundingMode.HALF_UP).intValue(),
    dataVencimento: Integer.parseInt(npc.dt_vencimento.toString().trim()),
    plano: [idPlano: npc.id_plano]
  ]]
]

if (execution.getVariable('status_validacao_proxy_npc') == 'Sucesso') {
  corpoFormalizacaoNpc.produtosEscolhidos[0].idAtrelamentoCartao = npc.proxy_npc
}

execution.setVariable('formaliza_npc_body', JsonOutput.toJson(corpoFormalizacaoNpc))
