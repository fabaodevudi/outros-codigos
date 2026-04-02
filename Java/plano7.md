// Substitui o bloco original (mantém a mesma regra de negócio, mas em JS válido)

// 1) valor_limite_maximo_cartao: usa limite do direcionador quando existir e não estiver vazio
var limite_cartao_direcionador = execution.hasVariable("limite_cartao_direcionador")
  ? execution.getVariable("limite_cartao_direcionador")
  : null;

execution.setVariable(
  "valor_limite_maximo_cartao",
  (limite_cartao_direcionador !== null && limite_cartao_direcionador !== "")
    ? limite_cartao_direcionador
    : valor_maximo_cartao_credito
);

// 2) id_intencao: inicializa com null se não existir
var id_intencao = execution.hasVariable("id_intencao")
  ? execution.getVariable("id_intencao")
  : null;
execution.setVariable("id_intencao", id_intencao);

// 3) oferta_npc: inicializa a partir de is_npc se não existir
var is_npc = execution.hasVariable("is_npc") ? execution.getVariable("is_npc") : false;

var oferta_npc = execution.hasVariable("oferta_npc")
  ? execution.getVariable("oferta_npc")
  : is_npc;

execution.setVariable("oferta_npc", oferta_npc);

// 4) Se tiver oferta_multiplo_npc, sobrescreve id_intencao e oferta_npc
var oferta_multiplo_npc = execution.hasVariable("oferta_multiplo_npc")
  ? execution.getVariable("oferta_multiplo_npc")
  : null;

if (oferta_multiplo_npc !== null) {
  // pode vir como Map (Java) ou objeto; tentamos ambos sem quebrar
  var om = oferta_multiplo_npc;

  var om_id_intencao =
    (om && typeof om.get === "function") ? om.get("id_intencao") :
    (om && om["id_intencao"] !== undefined) ? om["id_intencao"] :
    null;

  if (om_id_intencao !== null && om_id_intencao !== "") {
    execution.setVariable("id_intencao", om_id_intencao);
  }

  var om_contratar =
    (om && typeof om.get === "function") ? om.get("contratar_multiplo_npc") :
    (om && om["contratar_multiplo_npc"] !== undefined) ? om["contratar_multiplo_npc"] :
    null;

  if (om_contratar !== null && om_contratar !== "") {
    execution.setVariable("oferta_npc", om_contratar);
  }
}
