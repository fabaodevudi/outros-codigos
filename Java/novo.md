import groovy.json.JsonBuilder
import groovy.json.JsonSlurperClassic

def ofertaMultiploNpc = execution.getVariable('oferta_multiplo_npc')

if (ofertaMultiploNpc != null) {
  def dadosProposta = new JsonSlurperClassic()
    .parseText(execution.getVariable('dados_proposta').toString())

  dadosProposta.oferta_multiplo_npc = [
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
  ]

  execution.setVariable(
    'dados_proposta',
    new JsonBuilder(dadosProposta).toString()
  )
}
