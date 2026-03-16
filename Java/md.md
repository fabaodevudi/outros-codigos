# Mapeamento de Elementos — Backoffice (processo transversal, nível 2/3)

> **Objetivo:** Inventariar e agrupar os elementos do processo **`omnichannel_backoffice.bpmn`** seguindo o mesmo padrão dos mapeamentos `MAPEAMENTO_ELEMENTOS_NIVEL*`.  
> **Escopo:** processo transversal iniciado por **evento/mensagem** a partir de qualquer BPMN macro (Configuração, Dados Pessoais, Produtos, Validação).  
> **IDs para busca no Modeler:** Os valores entre aspas nas seções 3 e 4 (UserTasks, ServiceTasks) são **idênticos** ao `omnichannel_completo.bpmn` para uso com Ctrl+C / Ctrl+V na busca do Camunda Modeler.

**Manual (partes):** [Parte 6](../Manual%20OMNICHANNEL/parte_06_backoffice_wayout_analise_documentos/FLUXO_06_tecnico.md) (backoffice/wayout, análise documentos), [Parte 14](../Manual%20OMNICHANNEL/parte_14_pld_mesa_pld/FLUXO_14_tecnico.md) (PLD/mesa), [Parte 16](../Manual%20OMNICHANNEL/parte_16_eventos_transversais_excecoes/FLUXO_16_tecnico.md) (transversais/exceções).

**Entradas e saídas:** Iniciado por **Message Start Event** (mensagens publicadas pelos BPMNs macro ou sistemas externos — ver `DECISAO_BACKOFFICE_QUEM_PUBLICA_EVENTO.md`). Não retorna token ao PAI; atualiza proposta/conta e publica eventos quando aplicável.

---

## 1. Escopo do processo `omnichannel_backoffice.bpmn`

- Iniciado por **Message Start Event** (um ou mais tipos de solicitação de backoffice).  
- Atendido por **analistas de fraude/PLD/supervisão/backoffice**, não pelo gerente da agência.  
- Pode **interagir** com a instância da jornada (proposta/conta) via:
  - Atualizações em sistemas legados (EQ3, proposta, risco, etc.).
  - Publicação de eventos para que a jornada principal ajuste estado (quando aplicável).
- Não participa da **orquestração principal** da jornada (isso é papel do PAI).

---

## 2. Eventos de início (mensagens)

| ID (sugerido) | Tipo | Origem (quem publica) | Quando dispara | Observação |
| --------------- | ------ | ------------------------ | ---------------- | ----------- |
| `Message_backoffice_fraude` | Message Start | BPMN 3 / Validação / eventos AQ5 | Suspeita de fraude na proposta/conta | Abre caso de backoffice fraude/PLD |
| `Message_backoffice_pld` | Message Start | Eventos de risco Bacen / PLD | Sinalização de PLD | Pode compartilhar infraestrutura com fraude, mas filas distintas |
| `Message_backoffice_operacional` | Message Start | Qualquer BPMN macro / sistemas externos | Ajustes operacionais (dados, conta, produtos) | Ex.: correção de dados pós-efetivação |

> **Origem dos IDs:** Os IDs acima são **propostos para o novo design** (não necessariamente existentes no monolito). Eventuais Message Start / eventos de disparo do backoffice no `omnichannel_completo.bpmn` devem ser inspecionados para alinhar nomes. Ajustar granularidade conforme `DECISAO_BACKOFFICE_QUEM_PUBLICA_EVENTO.md`.

---

## 3. User Tasks (filas de trabalho)

IDs e filas extraídos do `omnichannel_completo.bpmn` — replicados de `MAPEAMENTO_ELEMENTOS_NIVEL2.md` (seção Backoffice).

| ID | Nome | Fila / Grupo | Observação |
| ---- | ------ | -------------- | ----------- |
| `analise_documentos_backoffice` | Analise de fraude em andamento | Analista de fraude (AQ5) | Fraude |
| `documentos_analise_backoffice` | Documentos Análise Backoffice | Analista | Fraude/documentos |
| `analise_pld_alto` | Risco PLD - ALTO | Analista de PLD | PLD |
| `analise_pld_andamento` | Analise de pld em andamento | Analista de PLD | PLD |
| `erro_validacao_fraude` | Erro AQ5 (Biocatch) | Backoffice | Erro Biocatch |
| `revisao_manual_proposta` | Revisão manual da proposta | Supervisor | Revisão |
| `expurgo_manual` | Expurgo Manual | Backoffice | Encerramento |

> **Configuração Camunda:** usar as filas exatamente como no BPMN (ex.: "Analista de fraude (AQ5)", "Analista de PLD") para candidaturas/tasklists.

---

## 4. ServiceTasks / ScriptTasks

IDs extraídos do `omnichannel_completo.bpmn` — replicados de `MAPEAMENTO_ELEMENTOS_NIVEL2.md` (seção Backoffice).

| ID | Nome | Observação |
| ---- | ------ | ----------- |
| `proposta_wayout` | Proposta enviada para Backoffice | Entrada no backoffice |
| `proposta_aprovada_backoffice` | Proposta Aprovada Backoffice | Saída OK |
| `proposta_falha_analise_bko` | Proposta com Falha na Analise | Saída com falha |
| `proposta_fraudulenta` | Proposta Fraudulenta | Recusa por fraude |
| `proposta_manutencao_jornada` | Atualiza proposta manual | Intervenção manual |
| `desfazimento_reserva_por_analise_fraude` | Desfazimento de reserva de conta | Cancel de reserva |
| `service_email_recusa_fraude` | [EK7] Enviar e-mail recusa Fraudes | Notificação |

> **CallActivities** do backoffice (subfluxos fraude/PLD/reserva) estão no N2; ver seção "CallActivities já separados" em `MAPEAMENTO_ELEMENTOS_NIVEL2.md`. Outras ServiceTasks auxiliares do backoffice no monolito: _(a preencher se identificadas)_.

---

## 5. Gateways principais

IDs extraídos do `omnichannel_completo.bpmn` no fluxo backoffice/fraude/PLD. Lista principal — podem existir outros gateways no mesmo fluxo; conferir no BPMN.

| ID | Nome / pergunta | Observação |
| ---- | ----------------- | ----------- |
| `Gateway_0jzo998` | _(sem name no BPMN)_ | Resposta do backoffice → proposta_aprovada_backoffice ou recusa (Flow_08ceoql) |
| `Gateway_05ylo9i` | Tem wayout, upgrade, situação especial? | Após proposta_aprovada_backoffice → wayout, efetiva_conta ou Activity_0cxgupa |
| `Gateway_lie9j0k` | Sucesso analise da documentação? | Após subfluxo fraude / Activity_015y93v → Sim: proposta_aprovada_backoffice; Não: Event_0nm8w4d |
| `Gateway_0ep3706` | _(parallel)_ | Split → analise_documentos_backoffice e proposta_wayout |
| `Gateway_0z82qe4` | _(sem name no BPMN)_ | Após proposta_fraudulenta / proposta_falha → erro_validacao_fraude |
| `Gateway_1k92sy4` | _(sem name no BPMN)_ | Wayout → documentos_analise_backoffice; Recusada → biometria_recusada |
| `Gateway_0veqmhy` | _(sem name no BPMN)_ | Após documentos_analise_backoffice |
| `Gateway_1cy2f4c` | O retorno do aq4 foi sucesso? | PLD — Sim/Não → analise_pld_andamento ou segue |
| `Gateway_197jwo5` | Risco baixo? | PLD |
| `Gateway_0nu7je3` | Risco médio? | PLD — Sim → mesa_pld; Não → analise_pld_alto |
| `Gateway_1quu812` | _(sem name no BPMN)_ | Após mesa_pld → Flow_025xqbq (Gateway_05ylo9i) |
| `Gateway_0ixpl0f` | Qual o resultado da análise? | Após desfazimento_reserva_por_analise_fraude |
| `Gateway_1hilsus` | _(parallel)_ | Encaminha para desfazimento_reserva_por_analise_fraude (ou Event_07ttzcw) |

> **Nota:** No BPMN há referência a `Gateway_lhilsus` (com L) em alguns flows; o elemento definido é `Gateway_1hilsus` (com 1). Usar `Gateway_1hilsus` na busca no Modeler.

---

## 6. Blocos nível 3 (subprocessos internos)

| Bloco (sub) | Tipo proposto | Elementos (IDs) que pertencem ao bloco | Observação |
| ------------- | ---------------- | ---------------------------------------- | ----------- |
| **Análise de Fraude** | Embedded Sub | UserTasks/ServiceTasks de fraude; gateways: `Gateway_lie9j0k`, `Gateway_0z82qe4`, `Gateway_0veqmhy`, `Gateway_1k92sy4` (ver seção 5) | Recebe casos de suspeita de fraude; sucesso doc. → `Gateway_lie9j0k`; fraudulenta → `Gateway_0z82qe4`. |
| **Análise PLD** | Embedded Sub | UserTasks/ServiceTasks de PLD; gateways: `Gateway_1cy2f4c`, `Gateway_197jwo5`, `Gateway_0nu7je3`, `Gateway_1quu812` (ver seção 5) | Casos de lavagem de dinheiro / risco regulatório; retorno aq4 → `Gateway_1cy2f4c`; risco médio → `Gateway_0nu7je3`. |
| **Ajustes Operacionais** | Embedded Sub | _(UserTasks + ServiceTasks para ajuste de dados/produtos)_ | Correções de dados, produtos, limites, etc. |
| **Encerramento / Retorno** | Embedded Sub ou sequência final | Gateways: `Gateway_0jzo998`, `Gateway_05ylo9i`, `Gateway_0ixpl0f`, `Gateway_1hilsus`; tasks finais (ver seção 5) | Resposta backoffice → `Gateway_0jzo998`; wayout/upgrade → `Gateway_05ylo9i`; resultado análise → `Gateway_0ixpl0f`. |

> **Nota:** Assim como no `MAPEAMENTO_ELEMENTOS_NIVEL3.md`, cada bloco poderá virar **Embedded Subprocess** dentro de `omnichannel_backoffice.bpmn`. Só vira **Call Activity** para outro .bpmn se houver necessidade de deploy independente (ex.: processo de PLD corporativo).

---

## 7. Interação com a jornada principal

- **Entrada:** sempre via **mensagem** (`Message Start`) publicada pelos BPMNs filhos ou por sistemas externos.  
- **Saída:** três possibilidades principais:
  - Atualizar apenas **sistemas de registro** (proposta, conta, risco, etc.) — a jornada não precisa “acordar”.  
  - Publicar **evento de retorno** (ex.: `Message_backoffice_decisao`) para que um BPMN macro trate consequência (bloquear conta, cancelar proposta, etc.).  
  - Encerrar o caso de backoffice sem impacto adicional (monitoramento apenas).

> **Pendência:** detalhar, por caso de uso, se há ou não evento de retorno para a jornada, e qual BPMN assina esse evento.

---

## 8. Checklist de conclusão Backoffice

- [x] Extrair do `omnichannel_completo.bpmn` os **gateways** do fluxo backoffice e preencher a seção 5; conferir se há outras ServiceTasks além das listadas na seção 4.  
- [ ] **Validar com o time de negócio/risco quais tipos de casos devem virar Message Start distintos** — pendência rastreada na tabela de pendências do N2 (`MAPEAMENTO_ELEMENTOS_NIVEL2.md`, seção Pendências de classificação).  
- [ ] Definir claramente os blocos nível 3 (fraude, PLD, operacional, encerramento) e checar se todos os elementos estão alocados em algum bloco.  
- [ ] Desenhar o `omnichannel_backoffice.bpmn` seguindo este mapeamento e as decisões de `DECISAO_BACKOFFICE_QUEM_PUBLICA_EVENTO.md`.  
- [ ] Revisar impacto de cada caminho (aprova, reprova, retorna) na jornada principal e, se necessário, modelar eventos de retorno.
