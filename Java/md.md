# Mapeamento de Elementos — Nível 3 (blocos internos aos BPMNs nível 2)

> **Objetivo:** Agrupar os elementos do **nível 2** em **blocos lógicos** (sub-subprocessos) dentro de cada BPMN filho. Cada bloco pode ser depois implementado como **Embedded Subprocess** ou **Call Activity** (arquivo separado).  
> **Fonte:** `MAPEAMENTO_ELEMENTOS_NIVEL2.md` + proposta de divisão em `APRESENTACAO_DIVISAO_BPMN_V2_v2.md`.  
> **IDs para busca no Modeler:** Os valores entre aspas nas colunas de elementos (e na tabela da seção 6) são **idênticos** ao `omnichannel_completo.bpmn` para uso com Ctrl+C / Ctrl+V na busca do Camunda Modeler. Onde o BPMN usa espaço no id (ex.: `dados oferta`, `vincula proxy bc`, `nao elegivel`, `proposta oferta`, `proposta biometria recusada`, `analise score biometria`, `efetiva_conteudo DI4`, `efetiva conteudo selfie`), o texto está com espaço.

---

## 1. Escopo do nível 3

O nível 3 **não é um arquivo .bpmn separado** — são **blocos dentro** de cada arquivo de nível 2 (`omnichannel_configuracao.bpmn`, `omnichannel_dados_pessoais.bpmn`, etc.). Cada bloco:

- Agrupa **User Tasks**, **Service Tasks**, **Script Tasks** e **Gateways** relacionados.
- Pode ser modelado como **Embedded Subprocess** (no mesmo arquivo) ou, se precisar de deploy independente, como **Call Activity** para outro .bpmn (ex.: Voucher, Efetivação).
- Contém a lógica real de negócio; o nível 2 orquestra a ordem entre os blocos.

**Entradas e saídas (N3):** Cada bloco recebe o fluxo da orquestração do BPMN pai (nível 2); saída = conclusão do bloco (sequence flow para o próximo bloco ou para fim do BPMN). Call Activities (Turn Over, Voucher, Efetivação) têm contrato específico com o processo chamado.

---

## 2. BPMN 1 — Configuração da conta — Blocos nível 3

| Bloco (sub) | Tipo proposto | Elementos (IDs) que pertencem ao bloco | Manual (parte) | Observação |
| ------------- | ---------------- | ---------------------------------------- | ------------------- | ------------- |
| **Segmentação** | Embedded Sub | `script_atribui_tempo_decurso`, `direcionador_cliente`, … | [Parte 5](../Manual%20OMNICHANNEL/parte_05_segmentacao_direcionador/FLUXO_05_tecnico.md) | Consulta Direcionador, consulta segmento, escolha segmento, upgrade. |
| **Encarteiramento / Agência** | Embedded Sub | `direcionador_proposta`, `producer_atualiza_setup_contas`, … | [Parte 4](../Manual%20OMNICHANNEL/parte_04_selecao_agencia_proposta_segmentada/FLUXO_04_tecnico.md) | Setup contas, encarteiramento, seleção de agência. **Atenção:** `Gateway_0z7bw9p` cruza fronteira BPMN 1/2. |
| **INSS / elegibilidade** | Embedded Sub (ou parte de Segmentação) | `Gateway_lwomcvl`, `dados_inss`, `validacao_beneficio_inss`, `termo_autorizacao_beneficio_inss` | [Parte 13](../Manual%20OMNICHANNEL/parte_13_beneficio_inss/FLUXO_13_tecnico.md) | Toggle INSS, validação, termo. |
| **Turn Over** | Call Activity (já existente) | `informar_cnpj`, `confirmacao_dados_empresa`, `subfluxo_documentacao_turn_over` | — | Portabilidade salário — fluxo alternativo. |
| **Exceções Config** | Embedded Sub ou ramos | `restricao_bacen` | — | Restrição Bacen. Consulta PA/limite migra para BPMN 3. |
| **Voucher** | Call Activity | (novo) — botão "Continuar com voucher" | — | Conforme `DECISAO_VOUCHER_MESMA_INSTANCIA_OU_NOVA.md`. |

> **Decisão técnica:** `consultar_pa_cliente` e `obter_limite_*` são tratados em BPMN 3 (Produtos), conforme `DECISAO_OBTER_LIMITE_BPMN1_OU_3.md` e mapeamento de nível 2.

---

## 3. BPMN 2 — Dados pessoais — Blocos nível 3

| Bloco (sub) | Tipo proposto | Elementos (IDs) que pertencem ao bloco | Manual (parte) | Observação |
| ------------- | ---------------- | ---------------------------------------- | ------------------- | ------------- |
| **Coleta de Dados** | Embedded Sub (único bloco) | `dados_nome`, `dados_telefone`, … | [Partes 2, 3](../Manual%20OMNICHANNEL/INDICE_E_PLANEJAMENTO_MANUAL_CO8.md) | **1 User Task** na nova jornada (checkpoint único); front gerencia sub-telas. Gateway híbrido do Voltar fica aqui. |

> BPMN 2 tem um único bloco lógico na proposta atual — **Coleta de Dados** — com uma única UT no CO8 após consolidação.

---

## 4. BPMN 3 — Produtos e serviços — Blocos nível 3

| Bloco (sub) | Tipo proposto | Elementos (IDs) que pertencem ao bloco | Manual (parte) | Observação |
| ------------- | ---------------- | ---------------------------------------- | ------------------- | ------------- |
| **Produtos Complementares** | Embedded Sub | `dados oferta`, `atualizar_solicitacao_contratacao`, `consultar_pa_cliente`, … | [Partes 7, 8](../Manual%20OMNICHANNEL/parte_07_limites_oferta_mapeamento_ge/FLUXO_07_tecnico.md), [Parte 8](../Manual%20OMNICHANNEL/parte_08_produtos_aceite_termos/FLUXO_08_tecnico.md) | Oferta, limite, proxy, débito, termos, declarações, aceite. |
| **Seguros / STI / Combinaki** | Ramos e campos (não bloco à parte) | Campos e variáveis na oferta/aceite. Incluídos no bloco Produtos Complementares. | — | Ver `DECISAO_SEGUROS_STI_COMBINAKI_BLOCOS_N3.md`. |
| **INSS (termo)** | Ramo condicional | `termo_autorizacao_beneficio_inss` | [Parte 13](../Manual%20OMNICHANNEL/parte_13_beneficio_inss/FLUXO_13_tecnico.md) | Se INSS ativo; ramo em Produtos Complementares. |

> **Decidido:** `consultar_pa_cliente` em BPMN 3 (Produtos Complementares) — ver `DECISAO_OBTER_LIMITE_BPMN1_OU_3.md` e tabela de pendências do N2.  
> **Subprocessos no monolito:** `Activity_0bj2jjf` (Vinculo Proxy), `Activity_0fiiffd` (Consulta Limite Rotativo) — já são subs no atual; podem virar um único bloco “Produtos Complementares” com esses fluxos dentro.

---

## 5. BPMN 4 — Validação — Blocos nível 3

| Bloco (sub) | Tipo proposto | Elementos (IDs) que pertencem ao bloco | Manual (parte) | Observação |
| ------------- | ---------------- | ---------------------------------------- | ------------------- | ------------- |
| **Biometria** | Embedded Sub | `dados_biometria`, `analise score biometria`, `Gateway_0gpqk7m`, … | [Parte 9](../Manual%20OMNICHANNEL/parte_09_biometria_coleta_senha/FLUXO_09_tecnico.md) | QR/WhatsApp/SMS, análise de score, recusa/wayout. |
| **Senha e Liberação** | Embedded Sub | `atualizar_proposta`, `coletar_senha`, `resumo_conta`, `proposta_liberada`, … | [Parte 9](../Manual%20OMNICHANNEL/parte_09_biometria_coleta_senha/FLUXO_09_tecnico.md), [Parte 10](../Manual%20OMNICHANNEL/parte_10_validacao_pre_efetivacao_liberacao/FLUXO_10_tecnico.md) | Senha, resumo, liberação; Biocatch pós-liberação. |
| **PAC e Envios** | Embedded Sub | `consulta_restricao_bacen`, `gerar_pac_ia_iu`, `gerar_pac_ip`, … | [Parte 15](../Manual%20OMNICHANNEL/parte_15_pac_envios_finalizacao/FLUXO_15_tecnico.md) | Geração de PAC, efetivação DI4, envio PAC por e-mail. |
| **Efetivação** | Call Activity | Chamada para `omnichannel_efetivacao.bpmn` | [Parte 11](../Manual%20OMNICHANNEL/parte_11_efetivacao_conta/FLUXO_11_tecnico.md) | Pós-jornada; disparado após `proposta_liberada` (ou após PAC/envio). |

> **Subprocessos no monolito (event-driven):** Vários são `triggeredByEvent="true"` (ex.: Bloqueio Proxy Cartao, Expurgo, Cadastra Risco Bacen) — podem permanecer como eventos anexados ao processo de Validação ou ao PAI; não precisam ser “blocos” de nível 3 obrigatórios.

---

## 6. Subprocessos existentes no monolito (referência)

Para conferência — estes são **subprocessos que já existem** no `omnichannel_completo.bpmn`; na decomposição, cada um será realocado para o BPMN filho correspondente ou tratado como evento transversal.

| ID no monolito | Nome | Linhas (ref.) | Destino proposto |
| ---------------- | ------ | ---------------- | ------------------ |
| `Activity_015y93v` | — | 520–640 | **Destino: Pendente — inspeção necessária.** Conteúdo ainda não inspecionado; não assumir bloco sem validar no BPMN. |
| `Activity_0cxgupa` | — | 1095–1207 | Contém Call AQ5 fraude — transversal |
| `Activity_0f9n93e` | Envio de e-mail reset proposta | 1474–1524 | Evento — pode ficar no BPMN onde proposta é resetada |
| `Activity_1mz0kpx` | Tratamento erro desfazimento reserva | 2072–2081 | Evento |
| `Activity_lmiwqse` | Analise PLD | 2206–2224 | Backoffice / transversal |
| `Activity_1f8ev6f` | Finalização cancelamento proposta | 2999–3004 | Evento |
| `Activity_0ju43u7` | Expurgo por abandono | 3029–3064 | Evento |
| `Activity_127zbk2` | Bloqueio Proxy Cartao | 3079–3110 | BPMN 3 (Produtos) ou evento |
| `Activity_0wf6e5k` | Cadastra Autorização Risco Bacen | 4143–4222 | Processo transversal Bacen, conforme `DECISAO_CADASTRA_RISCO_BACEN_BPMN4_OU_TRANSVERSAL.md` |
| `Activity_0bj2jjf` | Vinculo Proxy | 5800–5814 | BPMN 3 — Produtos Complementares |
| `Activity_0fiiffd` | Consulta Limite Rotativo | 6106–6174 | BPMN 3 — Produtos Complementares |

---

## 7. Checklist de conclusão nível 3

- [ ] **BPMN 1:** Conferir se todos os elementos do MAPEAMENTO nível 2 (BPMN 1) estão atribuídos a um bloco (Segmentação, Encarteiramento, INSS, Turn Over, Exceções, Voucher).
- [ ] **BPMN 2:** Único bloco Coleta de Dados — confirmar lista de elementos e gateway híbrido.
- [ ] **BPMN 3:** Definir se “Seguros / STI / Combinaki” é sub à parte ou ramos dentro de Produtos Complementares; conferir se todos os elementos de limite/PA (`consultar_pa_cliente`, `obter_limite_*`) estão corretamente alocados em Produtos Complementares.
- [ ] **BPMN 4:** Conferir subdivisão Biometria / Senha e Liberação / PAC e Envios; definir em qual bloco fica a chamada à Efetivação e como ela conversa com o processo transversal de risco Bacen.
- [ ] **Eventos (triggeredByEvent):** Listar quais permanecem em qual BPMN e quais viram eventos globais (PAI ou mensagem).
- [ ] **Validar com time:** Rafa / Fabrício revisam o agrupamento antes de desenhar os .bpmn.

### Nota técnica (rodapé)

Este mapeamento de nível 3 já incorpora as recomendações técnicas formalizadas em `DECISAO_OBTER_LIMITE_BPMN1_OU_3.md`, `DECISAO_ENVIA_CONSENTIMENTO_SCR_BPMN2_OU_3.md`, `DECISAO_CADASTRA_RISCO_BACEN_BPMN4_OU_TRANSVERSAL.md` e `DECISAO_VOUCHER_MESMA_INSTANCIA_OU_NOVA.md`, sempre tomando `omnichannel_completo.bpmn` como referência de comportamento ao distribuir blocos entre os BPMNs de nível 2.

---

## 8. Referências

| Documento | Uso |
| ----------- | ----- |
| `MAPEAMENTO_ELEMENTOS_NIVEL2.md` | Fonte dos IDs por BPMN |
| `MAPEAMENTO_ELEMENTOS_NIVEL1.md` | O que o PAI orquestra |
| `APRESENTACAO_DIVISAO_BPMN_V2_v2.md` | Diagrama dos 3 níveis e blocos propostos |
| `LEVANTAMENTO_AGRUPAMENTO_NIVEL2.md` | Metodologia e checklist nível 2 |
