# Voltar no fluxo nivel 1 (Omnichannel PAI)

Referencia de modelo: `omnichannel_pai_nivel1_com_voltar.bpmn`.

## Resumo (1 minuto)

- O voltar permite regressar da etapa de Produtos e servicos para uma etapa anterior da jornada.
- Esse retorno e acionado por uma mensagem de voltar durante Produtos e servicos.
- A decisao de destino usa um criterio simples: voltar para Configuracao, Dados pessoais ou manter em Produtos.

## O que muda

1. A jornada deixa de ser apenas linear (inicio ate fim) e passa a aceitar retorno controlado.
2. O retorno cai num ponto unico de decisao: Para onde voltar?
3. Depois de voltar, o fluxo segue novamente para frente a partir da etapa escolhida.

## Passo a passo (objetivo)

1. Avance normalmente: Configuracao, Dados pessoais, Produtos e servicos.
2. Durante Produtos e servicos, receba o sinal de voltar.
3. Interrompa essa etapa e direcione para a decisao de retorno.
4. Avalie o destino de retorno informado.
5. Se o destino for Configuracao, retome nessa etapa.
6. Se o destino for Dados pessoais, retome nessa etapa.
7. Se o destino for Produtos e servicos, retome na propria etapa para ajuste e siga adiante.

## Checklist

- O retorno so e acionado quando ha sinal de voltar em Produtos e servicos.
- A decisao de retorno sempre escolhe apenas um destino.
- O fluxo retorna para etapa valida: Configuracao, Dados pessoais ou Produtos.
- Depois do retorno, a jornada volta a progredir ate Validacao e conclusao.
- Nao existe retorno direto a partir de Validacao neste desenho atual.

## Apendice tecnico (opcional)

- O evento de voltar esta modelado como Boundary Message Event anexado a `call_produtos` (mensagem `voltar_macro`).
- O roteamento usa o gateway exclusivo Para onde voltar? com base em `voltar_para_bpmn` (nomes das etapas ou codigos `1`, `2`, `3`).

