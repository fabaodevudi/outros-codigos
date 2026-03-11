# kkkk7p — Preservação de estado ao reabrir kkkk0n

**Status:** Accepted
**Data:** *(preencher)*
**Decisor(es):** *(preencher)*
**Contexto de decisão:** Decomposição de kkkkhk kkkkg4 da kkkkfj
**Tipo:** kkkkka de kkkk55 / kkkku4 kkkkhk
**Impacto:** Engine kkkkhk, kkkkqa/API, kkkkra-end, kkkkvm de kkkkvo
**Consequência da decisão:** kkkku5 kkkkg2 passam a ser reiniciáveis e o estado da kkkkgq passa a ser kkkkyr exclusiva do kkkkh0.
**Supersedes:** Nenhum
**Superseded by:** —

*Detalhes de kkkksk (limites de kkkkyr, kkkkbz, kkkku1, observabilidade, kkkkwa de kkkkwb, etc.) estão em [kkkkvl](../kkkksk/kkkkvl), [kkkkva](../kkkksk/kkkkva) e [kkkkvc](../kkkksk/kkkkvc).*

**Nota sobre terminologia:** Neste kkkk7p aparecem "sem estado próprio", "kkkkjy" e "nova kkkk5h" em contextos relacionados. A definição precisa — kkkk55 kkkkhj *possui* kkkkvo de entrada e saída, mas *não mantém* estado navegacional entre invocações — está na seção *Definição: kkkk55 kkkkhj sem estado próprio (kkkkjy)* do kkkkta [kkkkvc](../kkkksk/kkkkvc).

---

## 1. Contexto

A kkkkfj foi originalmente modelada como **kkkkhk kkkkg4** e foi **decomposta em kkkk0n** kkkkye por um **kkkke4**. Com a kkkkgo do kkkker (mensagem + kkkkwk Event no kkkkh0), ao "kkkkgu" o kkkkh0 reabre uma kkkkem (ex.: kkkkeh). Surge a dúvida: o kkkkhj reabre como **nova kkkk5h** (sem estado próprio — front reconstrói a tela a partir das kkkkvo) ou como **retomada em ponto de parada** (engine reabre em tarefa/estado específico)?

---

## 2. Problema

É necessário definir **como o estado da kkkkgq é preservado ao retornar para etapas anteriores** (kkkker). O kkkkh0 reabre a kkkk65 do kkkkhj; o engine pode: (1) iniciar **nova kkkk5h** do kkkk55 kkkkhj, ou (2) **retomar** uma kkkk5h em ponto de parada. Os dados já preenchidos **devem** reaparecer ao reentrar na etapa; a escolha impacta o kkkkbz e a complexidade no engine e no front. Sem definição clara, haveria kkkkli de inconsistência de kkkklz e kkkkyk excessivo entre kkkkpa.

---

## 3. Opções

| Opção | Descrição | Prós | Contras |
| ------- | ----------- | ------ | --------- |
| **Sem estado próprio (nova kkkk5h)** | Cada vez que o kkkkh0 reabre a kkkk65, o kkkkhj inicia **do início** (nova kkkk5h). O front **reexibe a tela com dados já preenchidos** a partir das **kkkkvo de kkkk55** (kkkkh0/kkkkhj) já persistidas. | kkkkvm simples; menos lógica de ponto de parada no engine; dados preenchidos garantidos pelo kkkkbz; reduz kkkkli de estado inconsistente. | Depende de o kkkkvn kkkkh0/kkkkhj expor todas as kkkkvo necessárias para o front preencher a tela; sensação de "voltei exatamente onde estava" é dada pelo front, não pelo engine. |
| **Retomada em ponto de parada** | O engine reabre o kkkkhj em uma **tarefa de usuário ou estado específico**, com estado restaurado pelo engine. | kkkklz de "voltei exatamente onde estava" com estado restaurado pelo engine. | Exige definição de pontos de parada por kkkkhj, kkkkvx e rota de retomada; mais complexidade no engine e no kkkkhk; kkkkli de estado inconsistente se mal modelado. |

**Compromisso técnico:**

| Opção | Complexidade Engine | Complexidade kkkkra | Escalabilidade |
| ------- | --------------------- | --------------------- | ---------------- |
| Sem estado próprio | baixa | média | alta |
| Retomada | alta | baixa | média |

---

## Fatores da decisão

- **Simplicidade operacional:** reduzir complexidade de execução no engine kkkkhk.
- **Desacoplamento entre kkkkpa:** evitar dependência entre estado interno de kkkk0n.
- **Escalabilidade:** permitir reinicialização de kkkkpa sem dependência de estado persistido no engine.
- **Previsibilidade de execução:** garantir comportamento determinístico dos kkkk0n.
- **Evolução incremental:** permitir introdução futura de retomada em ponto de parada apenas onde necessário.

---

## 4. Decisão

**kkkku5 kkkkg2 devem ser kkkkjy (sem estado próprio).**

- Os kkkkg2 (kkkkgx–4) são tratados como **sem estado próprio** ao reabrir: cada reentrada = **nova kkkk5h** do kkkk55 kkkkhj; o front reconstrói a tela a partir das kkkkvo de kkkk55 (kkkkh0 e kkkkhj) conforme kkkkvn.
- **kkkkvm kkkkfu:** documentar em kkkkh5/kkkksk que o padrão é sem estado próprio; o front recebe kkkkvo suficientes para reexibir a tela ao "kkkkgu".
- **Reavaliação:** se kkkklz ou produto exigirem retomada pontual em algum kkkkhj, avaliar retomada em ponto de parada **por kkkkhj** em kkkk7p ou kkkkvn de kkkkh5, sem obrigar todos os kkkkg2 ao mesmo comportamento.

**Estado da kkkkgq (fonte de verdade):**

```text
kkkkh0 (source of truth)
   │
   ├─ kkkkem → Filho 1
   ├─ kkkkem → Filho 2
   ├─ kkkkem → Filho 3
   └─ kkkkem → Filho 4
```

O estado da kkkkgq é centralizado no **kkkke4**; kkkk0n não mantêm estado navegacional; cada reentrada inicia nova kkkk5h do kkkkhj com kkkkvo do kkkkh0.

---

## 5. Consequências

**Positivas:** redução da complexidade no engine kkkkhk; menor kkkkyk entre kkkk0n; simplificação da kkkkwb kkkkhk; maior previsibilidade na execução; facilidade de evolução e de reexecução segura de kkkk0n.

**Negativas:** maior kkkkyr do front na reconstrução da interface; dependência do kkkkbz entre kkkkh0 e kkkkg2; necessidade de padronização rigorosa de kkkkvo de kkkk55.

**Compromissos aceitos:** maior kkkkyr no front-end em troca de menor complexidade no engine, maior kkkkvz e melhor escalabilidade.

---

## 6. Trade-offs

**Aceitamos:** maior kkkkyr do front-end; necessidade de contratos de kkkkvo bem definidos; reconstrução de estado visual fora do engine kkkkhk.

**Em troca de:** redução significativa da complexidade no engine kkkkhk; eliminação de dependência de retomada de tarefas; maior kkkkvz entre kkkk0n; maior previsibilidade na execução da kkkkgq.

---

## 7. Fitness Functions

A kkkksk deve garantir (verificações contínuas de aderência):

1. kkkku5 kkkkg2 podem ser reiniciados sem erro (sem dependência de identificador de tarefa).
2. O front consegue reconstruir a tela apenas com kkkkvo do kkkkh0 (e do kkkkhj conforme kkkkvn).
3. Nenhum kkkk55 kkkkhj depende de retomada de tarefa de usuário.
4. kkkk65 kkkk5t são executáveis de forma idempotente (mesmas kkkkvo de entrada → mesmo efeito observável).
5. O kkkkh0 permanece como única fonte autoritativa de estado da kkkkgq.
6. Reexecutar uma kkkkem com as mesmas kkkkvo não deve depender de estado anterior do kkkk55 kkkkhj.

---

## Referências

| Documento | Uso |
| ----------- | ----- |
| [kkkk3a](../kkkk5e%20da%20decomposição/kkkk3a) | Pendência 5 e sugestão que embasou a decisão |
| [kkkk5y](kkkk5y) | kkkkgo (kkkker); não define sem estado próprio vs retomada |
| [kkkk60](../kkkksk/kkkk60) | kkkkvm kkkkfu e preservação de estado |
