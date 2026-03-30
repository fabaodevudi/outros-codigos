# Efetivação da conta — visão compacta (negócio + técnico)

## 🧠 Resumo 

- O **script de efetivação** prepara todos os dados da conta no processo.
- A **external task** apenas dispara o worker (não carrega o payload de negócio).
- O **worker** monta o request e chama a API de efetivação.

---

## 🔄 O que acontece na prática

- Primeiro montamos os dados da conta (script).
- Depois disparamos a integração (external task).
- Por fim, atualizamos a proposta com o resultado.

---

## 🔁 Fluxo resumido

| Etapa | O que acontece |
|------|----------------|
| 1. Janela de horário | Aguarda momento permitido para efetivação |
| 2. Script | Monta variáveis da efetivação |
| 3. Gateway | Direciona fluxo |
| 4. External Task | Dispara worker (integração) |
| 5. Pós-efetivação | Atualiza proposta |

*Referência técnica do modelo:* `omnichannel.bpmn` — `timer_trava_X0` → `script_efetivacao_conta` → gateway paralelo → `efetiva_conta` → (join) `proposta_efetiva_conta`.

---

## 🧩 Dados principais envolvidos

| Bloco | O que contém |
|------|--------------|
| Envelope | IDs e correlação da proposta |
| Conta | Dados da conta e agência |
| Segmento | Informações comerciais |
| SPI | Dados de vínculo (se houver) |
| Produtos | Produtos contratados (inclui aplic aut) |

---

## ⚙️ Como o worker funciona (resumo)

- Lê variáveis do processo
- Monta o request da API
- Converte JSON quando necessário
- Chama o serviço de efetivação

---

## ▶️ Passo a passo

1. Validar dados de entrada (conta, titular, oferta)
2. Executar script de efetivação
3. Publicar external task
4. Worker consome e envia para API
5. Atualizar proposta com resultado

---

## ✅ Checklist

- [ ] Script executou e gerou variáveis
- [ ] External task publicada corretamente
- [ ] Worker conectado ao tópico certo
- [ ] Produtos e flags coerentes com oferta
- [ ] Proposta atualizada após retorno

---

## 🔎 Apêndice técnico 

- External Task: `JvccEfetivacaoAberturaContaCorrente`
- Variáveis definidas no script BPMN (trecho ~`L222-L425` em `omnichannel.bpmn`)
- Worker Java usa `getAllVariables` / `getVariable`
- Conversões com `ObjectMapper` para JSONs complexos

