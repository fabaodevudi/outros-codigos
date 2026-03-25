# Voltar na jornada (nível 1)

Documento de apoio ao desenho executivo em `documentacao/visioning/arquitetura/omnichannel_pai_nivel1_com_voltar.bpmn`.

## Resumo (1 minuto)

- A jornada segue na ordem: Configuração, Dados pessoais, Produtos e serviços, Validação, e no fim conclui com sucesso.
- O usuário pode pedir para voltar a partir de Dados pessoais, de Produtos e serviços ou de Validação, e o sistema reabre uma destas quatro etapas (incluindo Validação como destino), conforme o que foi combinado na integração.
- Se o destino pedido não for reconhecido, o processo encerra num resultado de cancelamento por destino inválido, em vez de avançar à vontade.

## O que muda

1. A linha principal continua linear; o voltar é um desvio controlado a partir de três etapas (não a partir da Configuração inicial).
2. Há um ponto único de decisão de negócio: para onde regressar (Configuração, Dados, Produtos ou Validação).
3. No desenho de apresentação aparecem também vínculos com temas transversais (ex.: backoffice, análises, voucher, turnover): servem para contexto no diagrama, não substituem a linha principal da jornada.

## Possibilidades de roteamento (origem e destino)

### De onde o voltar pode ser pedido

Só faz sentido, no modelo, pedir voltar quando o usuário ainda está num destes blocos da jornada macro:

- **Dados pessoais**
- **Produtos e serviços**
- **Validação**

Na **Configuração** (primeiro bloco depois do início) não existe “voltar para antes da jornada” neste nível: o usuário segue em frente até Dados ou trata correções dentro do próprio ecrã de configuração, conforme regra do canal.

### Para onde o processo pode mandar depois do pedido

O pedido de voltar deve dizer **qual etapa macro reabrir**. As quatro opções previstas são:

1. **Configuração** — volta ao início da sequência macro; depois disso a jornada volta a passar por Dados, Produtos e Validação na ordem normal, até fechar ou novo voltar.
2. **Dados pessoais** — reabre essa etapa; em seguida segue para Produtos, Validação, etc., como na linha principal.
3. **Produtos e serviços** — reabre escolha de produto/contratação associada a essa fase; depois segue para Validação e conclusão, na ordem habitual.
4. **Validação** — reabre a etapa de conferências finais (biometria, senha, PAC, etc., conforme o desenho do produto); útil quando o negócio aceita **repetir** essa fase sem refazer tudo o que veio antes.

Ou seja: a partir de Produtos ou Validação é possível “saltar” vários passos para trás (por exemplo, da Validação direto para Configuração). A partir de Dados, em termos de diagrama, também pode pedir-se destinos à frente na macro (ex.: ir para Produtos sem passar outra vez pelo ecrã atual de Dados), mas **convém o negócio e o canal validarem** se isso é desejado na experiência real; o desenho técnico não impõe essa validação sozinho.

### Se o destino não bater com nenhuma destas quatro opções

Qualquer valor em falta, desconhecido ou fora do combinado não deve seguir a jornada “no escuro”: o modelo prevê encerramento com **cancelamento por destino inválido**, para exigir correção no canal ou na integração.

## Passo a passo (objetivo)

1. Avançar normalmente até a etapa em que for preciso corrigir algo.
2. Nessa etapa (Dados, Produtos ou Validação), acionar o fluxo de voltar acordado com negócio e canais.
3. Com base no destino enviado no pedido de voltar, reabrir a etapa certa entre Configuração, Dados, Produtos ou Validação.
4. Depois da correção, seguir outra vez a jornada em frente até à conclusão, quando fizer sentido.
5. Se o destino não for um dos quatro previstos ou estiver inconsistente, tratar como erro de rota e encerrar com o cancelamento por destino inválido.

## Checklist (negócio / revisão com áreas)

- [ ] Fica claro para negócio e canais em quais telad ou etapas o voltar é permitido (Dados, Produtos, Validação) e que na Configuração inicial não há “voltar para trás” da jornada.
- [ ] O usuário consegue voltar tanto para etapas anteriores como, quando fizer sentido no produto, repetir ou reentrar em Validação.
- [ ] Existe regra ou tratamento para pedido de destino inválido ou em branco (cancelamento controlado, mensagem ao usuário, log).
- [ ] Depois de voltar, a ordem esperada da jornada (Configuração → Dados → Produtos → Validação → conclusão) continua conhecida por todos.
- [ ] Os temas transversais no desenho são entendidos como apoios visuais de contexto, não como passos obrigatórios da mesma linha da jornada principal.
- [ ] Quem integra sistemas externo sabe qual informação de destino enviar em cada pedido de voltar, sem depender de saber nomes internos do motor.
