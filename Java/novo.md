Yuri, tudo bem?

A gente está implementando o fluxo de formalização do múltiplo NPC no CO8.
Hoje, o oferta_multiplo_npc chega pra gente no complete da jornada (via BFF/direcionador) e é persistido no processo dentro de dados_proposta.

Dentro desse objeto já vem o proxy_npc. A partir daí, no fluxo, a gente:

- extrai esse proxy_npc
- faz a validação via API de proxy
- e, quando está ok, reaproveita esse mesmo valor como id_proxy_para_formalizacao

Nossa ideia seria enviar esse valor no campo idAtrelamentoCartao na formalização.

Queria validar contigo se esse entendimento está correto:

- esse proxy_npc que recebemos pode ser usado diretamente como idAtrelamentoCartao?
- ou existe alguma transformação/regra antes de enviar (ex: outro identificador, formatação, etc)?

E em caso de falha na validação do proxy, vocês preferem:

- não enviar o campo
- ou enviar vazio/nulo?
