# Decisão técnica: envia_consentimento_scr (MD7) — BPMN 2 ou BPMN 3?

**ID da decisão:** BPMN-DEC-004
**Status:** **Em Análise** (aguarda validação de negócio e duas aprovações — ver [PADRAO_ADR_VISIONING.md](PADRAO_ADR_VISIONING.md))
**Tipo:** Classificação de responsabilidade BPMN
**Data:** 2026-03-05
**Decisor(es):** Fábio Pereira de Vasconcelos

## Aprovações

| #   | Aprovador     | Data   | Observação (opcional)   |
|-----|---------------|--------|--------------------------|
| 1   | *(preencher)* |        |                          |
| 2   | *(preencher)* |        |                          |

---

> **Contexto:** Pendência de classificação no [MAPEAMENTO_ELEMENTOS_NIVEL2.md](../Inventário%20da%20decomposição/MAPEAMENTO_ELEMENTOS_NIVEL2.md). A task `envia_consentimento_scr` (Sigla MD7 — Informa Abertura de Conta ao SCR) precisa ser atribuída ao BPMN 2 (Dados pessoais) ou ao começo do BPMN 3 (Produtos e serviços).

> **Nota:** Incompleto até validação de negócio; referenciar como **BPMN-DEC-004** em outros documentos.

---

## Contexto regulatório (SCR)

O **SCR (Sistema de Informações de Crédito do Banco Central)** registra operações de crédito e autorizações relacionadas ao cliente. A comunicação ao SCR pode exigir consentimento do cliente, dependendo da natureza da operação. A task `envia_consentimento_scr` no CO8 representa a notificação/consentimento ligado à abertura de conta nesse contexto regulatório.

---

## 1. Motivos para ficar no BPMN 2 (Dados pessoais)

- A informação ao SCR é sobre **abertura de conta** e pode ser considerada “dado cadastral” ou notificação assim que os dados do cliente estão consolidados (EQ3 atualizado).
- No monolito a task está **logo após** `atualiza_dados_eq3` — ou seja, no fim do bloco de “atualizar pessoa/dados no EQ3”, que pertence ao domínio de Dados pessoais.
- Manter no BPMN 2 evita depender do BPMN 3 para uma ação que não é de oferta/aceite, e deixa “dados atualizados + SCR informado” como saída clara do BPMN 2.

---

## 2. Motivos para ficar no BPMN 3 (Produtos / começo)

- Na transcrição da nova jornada: *“Até a questão do SCR, porque no SCR, na tela de aceite, hoje, traz também. Então, eu entendo que ficaria tudo aí nessa tela, Mari.”* — Ou seja, o **conteúdo** ligado ao SCR aparece na **tela de aceite** (etapa produtos).
- **Ressalva:** A presença de informações do SCR na tela de aceite **não implica necessariamente** que a integração técnica com o SCR ocorra nesse momento. Pode tratar-se apenas de exibição de consentimento ou informação regulatória ao cliente. Se a regra de negócio for "informar SCR no momento do aceite", faria sentido a **chamada** estar no BPMN 3; caso contrário, a posição atual (BPMN 2) permanece coerente.
- Se o SCR for informado só quando há “intenção de oferta/aceite”, o momento correto seria ao entrar em Produtos (ou no aceite), não ao sair de Dados.

---

## 3. Onde está no BPMN monolítico (`omnichannel_completo.bpmn`)

| Task | Onde está no fluxo |
| ------ | -------------------- |
| **envia_consentimento_scr** | Fluxo **sequencial**: `atualiza_dados_eq3` → **envia_consentimento_scr** → `Gateway_1pjnllx`. Ou seja, **dentro do bloco de dados pessoais**, logo após atualizar dados no EQ3; **antes** de qualquer User Task de produtos (`dados_oferta`). |

**Identificação no BPMN:**

| Elemento | ID BPMN / localização |
| ---------- | ------------------------ |
| envia_consentimento_scr | ID técnico da ServiceTask em `omnichannel_completo.bpmn` (ex.: ServiceTask_xxxxx); fluxo entre `atualiza_dados_eq3` e `Gateway_1pjnllx` |

**Conclusão a partir do BPMN:** A posição da task no BPMN monolítico indica que ela pertence ao domínio de **Dados pessoais**, pois ocorre imediatamente após a consolidação dos dados no EQ3 e antes de qualquer etapa de oferta ou seleção de produtos. Refatorar mantendo no BPMN 2 não exige mudar ordem — só desenhar a fronteira onde o fluxo já está.

---

## 4. Refatoração

| Critério | BPMN 2 (Dados) | BPMN 3 (Produtos) |
| ---------- | ---------------- | ------------------- |
| Onde está no monolito | Sim: após atualiza_dados_eq3, antes de dados_oferta | Seria deslocar a task para depois da fronteira 2→3 |
| Coerência | “Dados atualizados + notificação SCR” como saída de Dados | SCR junto com aceite/oferta — depende da regra de negócio |

Mover a task para o BPMN 3 exigiria alterar a ordem atual do fluxo, introduzindo dependência entre a integração SCR e a etapa de produtos. Isso aumentaria o acoplamento entre domínios e divergiria do comportamento do BPMN monolítico.

**Conclusão (refatoração):** Mais fácil em **BPMN 2** — posição atual no fluxo; sem reordenação.

---

## 5. Corte e voltar

- **No BPMN 2:** Saída do BPMN 2 = “dados pessoais atualizados (EQ3) + SCR informado”. Entrada no BPMN 3 = oferta/aceite. Fronteira clara.
- **No BPMN 3:** Seria preciso definir se a chamada ocorre no início do BPMN 3 (ao entrar) ou na tela de aceite; pode exigir variáveis vindas do BPMN 2.

---

## 6. Recomendação técnica

**Recomendação: manter `envia_consentimento_scr` no BPMN 2 (Dados pessoais).**

1. **Posição no monolito:** Já está após `atualiza_dados_eq3` e antes de qualquer tarefa de produtos.
2. **Refatoração:** Sem mudança de ordem; fronteira 2→3 continua “dados prontos + SCR informado” → produtos.
3. **Regra de negócio:** Se no futuro o negócio exigir “informar SCR somente no aceite”, pode-se reavaliar e mover para o BPMN 3; até lá, manter no BPMN 2 é o que reflete o fluxo atual.

**Critério de reavaliação:** A recomendação será revista caso a regra de negócio confirme que:

- o consentimento SCR é obtido **apenas** no aceite de produtos, ou
- a comunicação ao SCR **depende** de confirmação de contratação.

Isso deixa a decisão condicional e auditável.

---

## Rastreabilidade

```text
omnichannel_completo.bpmn
    → atualiza_dados_eq3
        → envia_consentimento_scr
            → Gateway_1pjnllx
                → dados_oferta
```

---

## 7. Referências

| Documento | Uso |
| ----------- | ----- |
| omnichannel_completo.bpmn | Fluxo: atualiza_dados_eq3 → envia_consentimento_scr → Gateway_1pjnllx |
| [MAPEAMENTO_ELEMENTOS_NIVEL2.md](../Inventário%20da%20decomposição/MAPEAMENTO_ELEMENTOS_NIVEL2.md) | Pendências de classificação |
| [nova_jornada_audio.txt](../transcricoes/transcricao_nova_jornada/nova_jornada_audio.txt) | Menção ao SCR na tela de aceite (conteúdo; decisão de onde chamar segue fluxo atual) |
