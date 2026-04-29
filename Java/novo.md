import groovy.json.JsonBuilder

def ofertaMultiploNpc = execution.getVariable('oferta_multiplo_npc')

if (ofertaMultiploNpc != null) {
  def oferta_produto = execution.getVariable('oferta_produto')
  def oferta_seguro_transacoes = execution.getVariable('oferta_seguro_transacoes')
  def telefone_completo = execution.getVariable('ddd_telefone') + execution.getVariable('numero_telefone')
  def oferta_multiplo_npc = [
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
  execution.setVariable('oferta_multiplo_npc', oferta_multiplo_npc)

  def dados_proposta = [
    'id_proposta': execution.getVariable('id_proposta'),
    'segmento' : execution.getVariable('segmento'),
    'ofertas' : oferta_produto,
    'oferta_seguro_transacoes' : oferta_seguro_transacoes,
    'cpf' : execution.getVariable('cpf'),
    'nome_completo' : execution.getVariable('nome_completo'),
    'data_nascimento' : execution.getVariable('data_nascimento'),
    'email' : execution.getVariable('email'),
    'telefone_completo' : telefone_completo,
    'renda' : execution.getVariable('valor_renda'),
    'CEP' : execution.getVariable('CEP'),
    'UF' : execution.getVariable('estado'),
    'numero' : execution.getVariable('numero'),
    'rua' : execution.getVariable('rua'),
    'complemento' : execution.getVariable('complemento'),
    'bairro' : execution.getVariable('bairro'),
    'cidade' : execution.getVariable('cidade'),
    'NIF' : execution.getVariable('declaracao_nif'),
    'oferta_ad' : execution.getVariable('oferta_ad'),
    'oferta_multiplo_npc' : oferta_multiplo_npc
  ]
  def builderJson = new JsonBuilder()
  builderJson(dados_proposta)
  execution.setVariable('dados_proposta', builderJson.toString())
}
