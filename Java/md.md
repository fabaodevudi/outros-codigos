# Voltar na jornada (nível 1)

Apoio ao desenho em `omnichannel_pai_nivel1_com_voltar.bpmn`.

## Resumo 

- Ordem normal: Configuração → Dados pessoais → Produtos e serviços → Validação → conclusão.
- O voltar só entra em cena a partir de **Dados**, **Produtos** ou **Validação**; pode reabrir qualquer uma das **quatro** etapas macro (incluindo repetir Validação).
- Destino inválido ou desconhecido → encerramento como **cancelamento por destino inválido** (não segue ao acaso).

## Roteamento 

**Origem do pedido (onde o usuário está):** Dados pessoais, Produtos e serviços ou Validação. Na Configuração não há “voltar antes da jornada” neste nível.

**Destino (o que reabrir):**

| Destino | Efeito em linhas grossas |
|--------|---------------------------|
| Configuração | Recomeça por ali; depois a ordem normal (Dados → Produtos → Validação) volta a valer. |
| Dados pessoais | Reabre cadastro/dados; segue para Produtos e o resto na ordem habitual. |
| Produtos e serviços | Reabre essa fase; segue para Validação e conclusão. |
| Validação | Reabre conferências finais quando o produto admite repetir essa fase. |

Dá para “pular” vários passos para trás (ex.: sair da Validação e voltar à Configuração). Combinações estranhas (ex.: de Dados pedir ir direto a Produtos) o desenho até permite tecnicamente; **negócio/canal** deve dizer o que a experiência aceita. Fora das quatro opções → cancelamento por destino inválido.

No diagrama de apresentação, vínculos a backoffice, análises, voucher e turnover são **contexto visual**; a linha executável da jornada macro é a sequência acima.

## Passo a passo 

1. Chegar à etapa onde há retificação.
2. Pedir voltar pelos canais combinados (só nas três origens permitidas).
3. Indicar claramente qual das quatro etapas macro reabrir.
4. Percorrer de novo para a frente até conclusão — ou tratar destino inválido se o pedido não bater.

## Checklist

- [ ] Todos sabem onde o voltar é permitido e que Configuração não tem esse “voltar macro” para fora da jornada.
- [ ] Está definido o que a experiência aceita em destinos “pulados” ou repetidos (sobretudo Validação).
- [ ] Há tratamento de destino inválido em branco ou errado (mensagem, log, cancelamento controlado).
- [ ] Integração sabe **qual destino** enviar em cada pedido (sem depender de detalhe de motor; ver apêndice se precisar).

## Apêndice técnico 

Mensagem `voltar_macro`; destino em `voltar_para_bpmn` (códigos 1–4 ou nomes das etapas no contrato). Ramo por defeito para fim “Cancelar por destino inválido”.
