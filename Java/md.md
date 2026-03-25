# Voltar no fluxo nível 1 (Omnichannel PAI)

Referência de modelo: `omnichannel_pai_nivel1_com_voltar.bpmn`.

## Resumo (1 minuto)

- O voltar permite regressar da etapa de Produtos e serviços para uma etapa anterior da jornada.
- Esse retorno é acionado por uma mensagem de voltar durante Produtos e serviços.
- A decisão de destino usa um critério simples: voltar para Configuração, Dados pessoais ou manter em Produtos.

## O que muda

1. A jornada deixa de ser apenas linear (início até o fim) e passa a aceitar retorno controlado.
2. O retorno cai num ponto único de decisão: Para onde voltar?
3. Depois de voltar, o fluxo segue novamente para frente a partir da etapa escolhida.

## Passo a passo (objetivo)

1. Avance normalmente: Configuração, Dados pessoais, Produtos e serviços.
2. Durante Produtos e serviços, receba o sinal de voltar.
3. Interrompa essa etapa e direcione para a decisão de retorno.
4. Avalie o destino de retorno informado.
5. Se o destino for Configuração, retome nessa etapa.
6. Se o destino for Dados pessoais, retome nessa etapa.
7. Se o destino for Produtos e serviços, retome na própria etapa para ajuste e siga adiante.

## Checklist

- [ ] O retorno só é acionado quando há sinal de voltar em Produtos e serviços — No diagrama, o evento de voltar está ligado apenas à atividade de Produtos e serviços. Não há retorno modelado a partir de Configuração, Dados pessoais ou Validação; depois que Produtos e serviços conclui com sucesso, o fluxo segue para Validação sem esse desvio.
- [ ] A decisão de retorno escolhe um único destino — O gateway é exclusivo: em cada acionamento do voltar, deve caber uma única escolha (Configuração, Dados pessoais ou de novo Produtos e serviços), conforme o valor informado para o destino.
- [ ] O fluxo retorna somente para etapas previstas neste desenho: Configuração, Dados pessoais ou Produtos e serviços — Qualquer outro destino não tem ramo no modelo; validar que a aplicação e os dados não enviam destino fora desse conjunto.
- [ ] Depois do retorno, a jornada volta a progredir até Validação e conclusão — Ao reentrar numa etapa anterior, o caminho principal repete a sequência (por exemplo, de Dados pessoais de novo para Produtos e serviços e em seguida Validação), até o fim da jornada.
- [ ] Não existe retorno direto a partir da Validação neste desenho atual — Uma vez na Validação, não há evento de voltar nem gateway equivalente no BPMN; corrigir algo nessa fase exigiria outro comportamento (outro modelo, compensação ou reabertura), não coberto por este nível 1.
