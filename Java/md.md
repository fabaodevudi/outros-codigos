# Mapeamento de Elementos — Nível 2 (por BPMN filho)

> **Fonte:** `omnichannel_completo.bpmn` — extração direta dos IDs (UserTask, ServiceTask, ScriptTask, CallActivity)  
> **Data:** 24/02/2026  
> **Método:** grep dos elementos + rastreamento de sequence flows  
> **Objetivo:** inventário completo para guiar a decomposição — saber o que cortar e para onde mover  
> **IDs para busca no Modeler:** os valores entre aspas nas colunas ID (e Flow ID, De/Para) são **idênticos** ao `omnichannel_completo.bpmn` para uso com Ctrl+V na busca do Camunda Modeler. Onde o BPMN usa espaço no id (ex.: `dados oferta`, `vincula proxy bc`, `nao elegivel`), o texto está com espaço.

---

## Legenda de tipos

| Tipo | Descrição |
| --- | --- |
| UserTask | Interação humana |
| ServiceTask | Chamada externa/delegate |
| ScriptTask | Script interno (Groovy/JS) |
| CallActivity | Chamada para BPMN filho já existente |
| Gateway | Decisão ou junção relevante |

---

## BPMN 1 — `omnichannel_configuracao.bpmn`

**Manual (partes):** [Parte 1](../Manual%20OMNICHANNEL/parte_01_inicio_identificacao_jornada/FLUXO_01_tecnico.md), [Parte 2](../Manual%20OMNICHANNEL/parte_02_cadastro_inicial_dados_contato/FLUXO_02_tecnico.md), [Parte 3](../Manual%20OMNICHANNEL/parte_03_dados_pessoais_nome_endereco_renda/FLUXO_03_tecnico.md), [Parte 4](../Manual%20OMNICHANNEL/parte_04_selecao_agencia_proposta_segmentada/FLUXO_04_tecnico.md), [Parte 5](../Manual%20OMNICHANNEL/parte_05_segmentacao_direcionador/FLUXO_05_tecnico.md), [Parte 6](../Manual%20OMNICHANNEL/parte_06_backoffice_wayout_analise_documentos/FLUXO_06_tecnico.md), [Parte 12](../Manual%20OMNICHANNEL/parte_12_pos_efetivacao_setup_vinculo_proxy/FLUXO_12_tecnico.md).

> **Etapa:** ① Configuração da conta (stepper)  
> **Checkpoint CO8:** entrada em `escolha_segmento`  
> **Ponto de não-retorno:** após `selecionar_agencia` → Direcionador consultado, oferta iniciada

**Entradas e saídas:** Invocado pela Call Activity `call_configuracao` do PAI. Retorno ao PAI → próximo BPMN (Dados Pessoais); ou voltar (mensagem) antes do fim desta Call.

### UserTasks

| ID | Nome | Observação |
| --- | --- | --- |
| `escolha_segmento` | Escolha Segmento | Primeira UT da etapa |
| `escolha_upgrade` | Envio Documentos | Condicional: Uniclass ou situação especial |
| `selecionar_agencia` | Selecionar Agência | Última UT — ponto de corte para BPMN 2 |
| `dados_inss` | Benefício INSS | Condicional: toggle INSS ativo |
| `informar_cnpj` | Informar CNPJ | Sub: Turn Over (portabilidade salário) |
| `confirmacao_dados_empresa` | Confirmação de dados empresa | Sub: Turn Over |
| `encarteiramento_manual` | Encarteiramento Manual | Exceção operacional |
| `segmento_nao_atendido` | Segmento não atendido | Estado de exceção |
| `nao elegivel` | Não Elegível | Estado de exceção |
| `restricao_bacen` | Restrição Bacen | Estado de exceção |
| `agencia_nao_encontrada` | Erro GQ | Estado de erro |
| `erro_agencia` | Erro GQ | Estado de erro |
| `erro_gq_funcional` | Erro GQ | Estado de erro |

### ServiceTasks / ScriptTasks

| ID | Nome | Tipo | Observação |
| --- | --- | --- | --- |
| `script_atribui_tempo_decurso` | Atribui tempo decurso | 📜 | START → aqui (inicializa variáveis de fluxo) |
| `direcionador_cliente` | [CC] Direcionador Cliente | ⚙️ | Consulta perfil quando há agência logada |
| `direcionador_cliente_sem_agencia` | [CC] Direcionador Cliente | ⚙️ | Idem quando sem agência logada |
| `atualizar_cliente` | Atualizar Cliente | 📜 | Persiste dados do cliente pós-direcionador |
| `direcionador_proposta` | Atualiza dados direcionador na proposta | ⚙️ | Após direcionador, antes de `dados_nome` |
| `scripr_consulta_segmento` | Consulta Segmento | 📜 | Script prep para chamada externa |
| `consulta_segmento` | Consulta Segmento | ⚙️ External (`consultarCarteira`) | Verifica carteira/segmento |
| `proposta_segmentada` | proposta segmentada | ⚙️ delegate | Persiste segmento na proposta |
| `atualiza_segmento_nao_atendido` | Segmento não atendido | ⚙️ delegate | Caminho de exceção |
| `proposta_nao_elegivel` | Proposta não elegível | ⚙️ delegate | Caminho de exceção |
| `Activity_1xf5sfp` | Mapeamento Encarteiramento | 📜 | Mapeia dados para encarteiramento manual |
| `producer_atualiza_setup_contas` | Atualiza Setup Contas | ⚙️ External (`atualiza-setup-contas`) | Configura conta |
| `atualiza_proposta_setup_de_contas` | Atualiza Proposta Setup de Contas | ⚙️ delegate | Persiste setup na proposta |
| `validacao_beneficio_inss` | Validação Beneficio INSS | ⚙️ External (`validaBeneficioInss`) | Valida INSS se ativo |

### CallActivities (já existentes)

| ID | calledElement | Observação |
| --- | --- | --- |
| `subfluxo_documentacao_turn_over` | `turn_over_email_documentos` | Portabilidade de salário — permanece embedded no BPMN 1 |
| `subfluxo_analide_fraudes_aq5` | `worker_fraude_v2_contas` | Fraude AQ5 — transversal |

### Gateways chave

| ID | Nome | Decisão |
| --- | --- | --- |
| `Gateway_05f9e0t` | Tem agência? | Direciona para `direcionador_cliente` ou `direcionador_cliente_sem_agencia` |
| `Gateway_lwomcvl` | — | Elegibilidade: ok → `dados_inss`, não → `nao_elegivel` |
| `Gateway_1e7x93k` | — | Após `escolha_segmento`: precisa de upgrade? |
| `Gateway_10mxqtp` | Pode mudar segmento? | Permite re-segmentação ou não |
| `Gateway_0z7bw9p` | Possui Residência no Exterior? | Após `dados_renda`: SIM → `dados_nif`, NÃO → `selecionar_agencia` |

---

## BPMN 2 — `omnichannel_dados_pessoais.bpmn`

**Manual (partes):** [Parte 2](../Manual%20OMNICHANNEL/parte_02_cadastro_inicial_dados_contato/FLUXO_02_tecnico.md), [Parte 3](../Manual%20OMNICHANNEL/parte_03_dados_pessoais_nome_endereco_renda/FLUXO_03_tecnico.md).

> **Etapa:** ② Dados pessoais (stepper)  
> **Checkpoint CO8:** 1 UserTask única (decisão 24/02)  
> **Ponto de não-retorno:** após dados salvos → próximo passo usa esses dados para montar oferta

**Entradas e saídas:** Invocado pela Call Activity `call_dados_pessoais` do PAI. Retorno ao PAI → próximo BPMN (Produtos); ou voltar (mensagem) para Configuração.

### UserTasks

| ID | Nome | Observação |
| --- | --- | --- |
| `dados_nome` | nome | Primeira UT — abre dados pessoais |
| `dados_telefone` | DadosTelefone | ⚠️ Nova jornada: front gerencia como sub-tela |
| `dados_email` | Dados E-mail | ⚠️ Nova jornada: front gerencia como sub-tela |
| `dados_data_nascimento` | Dados Data Nascimento | ⚠️ Nova jornada: front gerencia como sub-tela |
| `dados_nif` | Dados NIF | Condicional: cliente com residência fiscal no exterior |
| `dados_endereco` | Endereço | ⚠️ Nova jornada: front gerencia como sub-tela |
| `dados_renda` | renda | Última UT — CO8 segue para agência/segmento (fluxo atual) |

> **Decisão de arquitetura (24/02):** na nova jornada, as 7 UTs acima colapsam em **1 User Task** no CO8. O front navega entre as sub-telas internamente. O CO8 só sabe que a etapa foi concluída.

### ServiceTasks / ScriptTasks

| ID | Nome | Tipo | Observação |
| --- | --- | --- | --- |
| `gera_script_atualizar_pessoa` | Gerar script para atualizar pessoa | 📜 | Monta payload para atualização |
| `atualizar_pessoa` | Atualizar Pessoa | ⚙️ delegate (`atualizar PessoaV2Delegate`) | Persiste dados pessoais |
| `mapeia_campos_ge` | mapeio campos GE | 📜 Javascript | Mapeia campos para GE |
| `atualiza_dados_eq3` | Atualiza Dados EQ3 | ⚙️ delegate (`atualizar PessoaV2Delegate`) | Persiste endereço/renda no EQ3 |
| `script_renda_endereco_eq3` | variaveis atualiza EQ3 | 📜 | Prepara variáveis para EQ3 |
| `atualiza_renda_endereco_eq3` | Atualiza Dados EQ3 | ⚙️ delegate | Segunda chamada EQ3 (renda + endereço) |
| `envia_consentimento_scr` | Sigla MD7 — Informa Abertura de Conta | ⚙️ delegate | Informa SCR sobre abertura |
| `direcionador_cliente_refresh` | [CC] Direcionador Cliente | ⚙️ External | Refresh do direcionador após dados pessoais |
| `atualizar_cliente_refresh` | Atualizar Cliente | 📜 | Persiste resultado do refresh |

> **Flows de voltar cross-BPMN** que envolvem este BPMN: ver seção **Flows cross-BPMN existentes em produção** no final do documento.

---

## BPMN 3 — `omnichannel_produtos.bpmn`

**Manual (partes):** [Parte 5](../Manual%20OMNICHANNEL/parte_05_segmentacao_direcionador/FLUXO_05_tecnico.md), [Parte 6](../Manual%20OMNICHANNEL/parte_06_backoffice_wayout_analise_documentos/FLUXO_06_tecnico.md), [Parte 7](../Manual%20OMNICHANNEL/parte_07_limites_oferta_mapeamento_ge/FLUXO_07_tecnico.md), [Parte 8](../Manual%20OMNICHANNEL/parte_08_produtos_aceite_termos/FLUXO_08_tecnico.md), [Parte 12](../Manual%20OMNICHANNEL/parte_12_pos_efetivacao_setup_vinculo_proxy/FLUXO_12_tecnico.md).

> **Etapa:** ③ Produtos e serviços (stepper)  
> **Checkpoint CO8:** entrada em `dados oferta`  
> **Ponto de não-retorno:** após `aceite_produtos` → PAC gerado

**Entradas e saídas:** Invocado pela Call Activity `call_produtos` do PAI. Retorno ao PAI → próximo BPMN (Validação); ou voltar (mensagem) para Configuração ou Dados Pessoais.

### UserTasks

| ID | Nome | Observação |
| --- | --- | --- |
| `dados oferta` | Dados Oferta | Primeira UT — recebe `oferta_produto` + `oferta_ad` |
| `aceite_produtos` | Aceite Produtos | Ponto de não-retorno — PAC é gerado após aqui |
| `dados_declaracao` | Declarações | Declarações do cliente |
| `termo_contratos` | Termo Autorização Consulta débito | Termo legal |
| `consentimento_debito` | Consentimento Débito | Condicional: cliente com débito |
| `termo_autorizacao_beneficio_inss` | Termo Autorização Benefício INSS | Condicional: INSS ativo |
| `erro_vincular_proxy_bc` | Erro Vincular Proxy BC | Estado de erro: proxy cartão |

### ServiceTasks / ScriptTasks

| ID | Nome | Tipo | Observação |
| --- | --- | --- | --- |
| `consulta_debito` | Consulta débito | ⚙️ External (`operacaoGetDelegate`) | Logo após `aceite_produtos` |
| `scrpit_consulta_debito` | script consulta debito | 📜 | Processa retorno da consulta |
| `script_aceite_consentimento_listagem_debito` | script aceite consentimento listagem de débito | 📜 | Monta payload consentimento |
| `aceite_consentimento_debito` | Aceite consentimento listagem de débito | ⚙️ External | Registra consentimento débito |
| `atualiza_proposta_com_aceite_produtos` | Atualiza proposta com aceite produtos | ⚙️ delegate | Após aceite, antes de script_mapeia |
| `script_mapeia_dados_oferta` | Mapeia Dados Pessoa Ofertas | 📜 | Roda DEPOIS do aceite — não é ponte BPMN 2→3 |
| `proposta_com_nao_aceite_produtos` | Proposta com não aceite produtos | ⚙️ delegate | Caminho de não-aceite |
| `consultar_pa_cliente` | [PUC] Consultar PA Cliente | ⚙️ External | Consulta limite rotativo — alocado em BPMN 3 conforme DECISAO_OBTER_LIMITE_BPMN1_OU_3.md |
| `obter_limite_legado` | Obter Limite RO | ⚙️ External | Consulta limite rotativo legado |
| `monta_payload_obter_limie_v3` | Montar Payload Obter Limite | 📜 | Prepara chamada FC6 |
| `obter_limite_v3` | [FC6] Obter Limite V3 | ⚙️ External | Consulta limite rotativo v3 |
| `valida_proxy_bc` | Valida Proxy BC | ⚙️ External | Valida proxy do cartão |
| `vincula proxy bc` | Vincular Proxy BC | ⚙️ External | Vincula proxy ao cartão |
| `proposta_vincular_proxy` | Atualizar Proposta Vincular Proxy | ⚙️ delegate | Persiste proxy na proposta |
| `atualizar_solicitacao_contratacao` | Atualizar Solicitação de Contratação | ⚙️ External | Atualiza vitrine de ofertas |

> **Flows de voltar cross-BPMN** que envolvem este BPMN: ver seção **Flows cross-BPMN existentes em produção** no final do documento.

---

## BPMN 4 — `omnichannel_validacao.bpmn`

**Manual (partes):** [Parte 9](../Manual%20OMNICHANNEL/parte_09_biometria_coleta_senha/FLUXO_09_tecnico.md), [Parte 10](../Manual%20OMNICHANNEL/parte_10_validacao_pre_efetivacao_liberacao/FLUXO_10_tecnico.md), [Parte 11](../Manual%20OMNICHANNEL/parte_11_efetivacao_conta/FLUXO_11_tecnico.md), [Parte 12](../Manual%20OMNICHANNEL/parte_12_pos_efetivacao_setup_vinculo_proxy/FLUXO_12_tecnico.md), [Parte 13](../Manual%20OMNICHANNEL/parte_13_beneficio_inss/FLUXO_13_tecnico.md), [Parte 14](../Manual%20OMNICHANNEL/parte_14_pld_mesa_pld/FLUXO_14_tecnico.md), [Parte 15](../Manual%20OMNICHANNEL/parte_15_pac_envios_finalizacao/FLUXO_15_tecnico.md), [Parte 16](../Manual%20OMNICHANNEL/parte_16_eventos_transversais_excecoes/FLUXO_16_tecnico.md).

> **Etapa:** ④ Validação (stepper)  
> **Checkpoint CO8:** entrada em `dados_biometria`  
> **Ponto de não-retorno:** após biometria aprovada / após `proposta_liberada`

**Entradas e saídas:** Invocado pela Call Activity `call_validacao` do PAI. Retorno ao PAI → fim da jornada (Efetivação é Call interna). Ou voltar (mensagem) para Configuração, Dados Pessoais ou Produtos.

### UserTasks

| ID | Nome | Observação |
| --- | --- | --- |
| `dados_biometria` | Dados Biometria | Wait state — cliente faz biometria (QR/WhatsApp/SMS) |
| `biometria recusada` | Biometria recusada | Estado de exceção |
| `biometria_nao_elegivel` | biometria não elegível | Estado de exceção |
| `coletar_senha` | Coleta de Senha | Cliente cria senha do cartão |
| `resumo_conta` | Resumo Conta | Confirmação final |
| `proposta_liberada` | Proposta Liberada | Last UT — loop até `proposta_liberada==true` |

### ServiceTasks / ScriptTasks / BusinessRuleTasks

| ID | Nome | Tipo | Observação |
| --- | --- | --- | --- |
| `analise score biometria` | Analisa Score Biometria Selfie | 🔀 BusinessRule (DMN) | Após `dados_biometria` — classifica resultado |
| `atualizar_proposta` | Atualiza Proposta | ⚙️ delegate | Persiste status da proposta |
| `proposta oferta` | Atualiza dados perfil na proposta | ⚙️ delegate | Atualiza perfil pós-biometria |
| `proposta biometria recusada` | Proposta recusada por biometria | ⚙️ delegate | Caminho de recusa |
| `proposta_biometria_nao_elegivel` | Proposta biometria não elegível | ⚙️ delegate | Caminho de exceção |
| `atualiza_proposta_liberada_declaracoes` | Atualiza proposta liberada e declarações | ⚙️ delegate | Após `proposta_liberada==true` |
| `Activity_112h8wq` | [AQ5] Biocatch | ⚙️ External | Análise comportamental pós-liberação |
| `consulta_restricao_bacen` | Consulta restrição Bacen | ⚙️ | Consulta restrição antes de efetivação. **Distinto** de `cadastra_risco_bacen` (este no processo transversal Bacen — ver `DECISAO_CADASTRA_RISCO_BACEN_BPMN4_OU_TRANSVERSAL.md`). Nome/ID a confirmar no BPMN se necessário. |
| `gerar_pac_ia_iu` | Gerar Pac | ⚙️ External (`JvccPropostaAberturaConta`) | Após `proposta_liberada` |
| `gerar_pac_ip` | Gerar Pac (IP) | ⚙️ External | Variante para pessoa física |
| `mapear_contrato_pac_ia_iu` | Mapear contrato gerar PAC | 📜 | Monta payload PAC |
| `mapear_contrato_pac_ip` | Mapear contrato gerar PAC person | 📜 | Variante pessoa física |
| `efetivar_pac` | [DI4] Efetivar PAC | ⚙️ External (`JvccAtivaDocumentoPorIdConteudo`) | Ativa o documento PAC |
| `efetiva_conteudo DI4` | [DI4] Efetiva Conteudo DI4 | ⚙️ External | Ativa conteúdo DI4 |
| `efetiva conteudo selfie` | [DI4] Efetiva Conteudo Selfie | ⚙️ External | Ativa selfie DI4 |
| `proposta_pac` | Atualiza PAC na proposta | ⚙️ delegate | Persiste dados do PAC |
| `monta_contrato_email` | Montar contrato para envio PAC e-mail | 📜 | Prepara envio por e-mail |
| `envia_pac_email` | [EK7] Enviar PAC e-mail | ⚙️ External (`jvcc-envia-email-v2`) | Envia PAC por e-mail |

### Gateways chave

| ID | Nome | Decisão |
| --- | --- | --- |
| `Gateway_0gpqk7m` | Biometria aprovada? | Após `analise score biometria` — aprovada / recusada / wayout |
| `Gateway_11wr3zw` | — | Tem representante? → direciona para `dados_biometria` |

---

## Efetivação — `omnichannel_efetivacao.bpmn` (Call Activity pós-jornada)

> **Quando:** após `proposta_liberada` / `gerar_pac` — roda em background  
> **Gerente não vê.** Pode demorar mais que a sessão.

### ServiceTasks / ScriptTasks

| ID | Nome | Tipo | Observação |
| --- | --- | --- | --- |
| `script_efetivacao_conta` | Script Efetiva Conta | 📜 | Prepara payload de efetivação |
| `efetiva_conta` | Efetiva Conta | ⚙️ External (`JvccEfetivacaoAberturaContaCorrente`) | Abre a conta de fato |
| `efetiva_cartao` | Efetiva Cartão | ⚙️ External (`jvcc-efetivar-cartao`) | Ativa o cartão |
| `contratar_tarifa_bt` | Contratar Tarifa BT | ⚙️ External (`contratarTarifas`) | Contrata tarifas |
| `proposta_efetiva_conta` | Atualiza Efetivação na proposta | ⚙️ delegate | Persiste efetivação |
| `proposta_efetivacao_produtos` | Atualiza Produtos na proposta | ⚙️ delegate | Persiste produtos efetivados |
| `script_atualiza_eq3` | Script Atualiza EQ3 | 📜 | Persiste dados finais no EQ3 |
| `atualiza_dados_eq3` | Atualiza Dados EQ3 | ⚙️ delegate | Atualização EQ3 pós-efetivação |
| `gera_script_atualizar_pessoa` | Gerar script para atualizar pessoa | 📜 | Monta payload de pessoa |
| `atualizar_pessoa` | Atualizar Pessoa | ⚙️ delegate | Atualização final de pessoa |
| `et_efetiva_cheque_especial` | Contratar Cheque Especial LIS | ⚙️ External | Contrata LIS (cheque especial) |
| `mapeia_contrato_lis` | Mapeia contrato contratação LIS | 📜 | Prepara payload LIS |
| `validacao_beneficio_inss` | Validação Beneficio INSS | ⚙️ External | Valida INSS pós-conta aberta |
| `efetivacao_beneficio_inss` | Efetivação Beneficio INSS | ⚙️ External | Efetiva INSS |
| `agrupa_dados_inss` | Agrupar dados INSS | 📜 | Agrupa dados para efetivação |
| `atualiza_proposta_efetivacao_inss` | Atualiza Proposta Efetivacao INSS | ⚙️ delegate | Persiste INSS na proposta |

### Gateways (Efetivação)

IDs extraídos do `omnichannel_completo.bpmn` no fluxo de Efetivação (script_efetivacao_conta → efetiva_conta → proposta_efetiva_conta / proposta_efetivacao_produtos, tarifas, EQ3, INSS, LIS).

| ID | Nome / pergunta | Tipo | Observação |
| ---- | ----------------- | ------ | ----------- |
| `Gateway_0sy3fcf` | *(parallel)* | Parallel | script_efetivacao_conta → efetiva_conta e Gateway_de_efetivacao |
| `Gateway_de_efetivacao` | *(event-based)* | EventBased | Após atualiza_dados_eq3: mensagem conta efetivada ou timer 1 dia |
| `Gateway_0zvmi2k` | *(parallel)* | Parallel | Junção: efetiva_conta ou Gateway_1stfi0x → proposta_efetiva_conta |
| `Gateway_1stfi0x` | *(sem name no BPMN)* | Exclusive | message_conta_efetivada ou “conta efetivada mesmo id_pessoa?” → segue para proposta_efetiva_conta |
| `Gateway_0s0llvk` | A conta efetivada com mesmo id_pessoa da proposta? | Exclusive | Consulta conta; Sim → Gateway_1stfi0x |
| `Gateway_11349uj` | *(parallel)* | Parallel | proposta_efetiva_conta → producer_atualiza_setup_contas e Activity_0bj2jjf |
| `Gateway_013qtua` | *(parallel)* | Parallel | Após contratar_tarifa_bt → ramos paralelos |
| `Gateway_1g7aykp` | O cliente aceitou vincular o benefício? | Exclusive | INSS: Sim → validacao_beneficio_inss; Não → agrupa_dados_inss |
| `Gateway_14101g5` | O beneficio INSS foi validado? | Exclusive | Sim → efetivacao_beneficio_inss; Não → agrupa_dados_inss |
| `Gateway_14z41a2` | Fluxo Alternativo ? | Exclusive | Após atualiza_proposta_efetivacao_inss |
| `Gateway_la27abu` | Cliente optou pela contratação do LIS? | Exclusive | LIS (cheque especial) |
| `Gateway_1lxlzrj` | Conta Encerrada? | Exclusive | LIS: Não → mapeia_contrato_lis; Sim → Event_03z0vm0 |
| `Gateway_12jwm3u` | Produto contratado? | Exclusive | LIS: Sim → Gateway_1xciylx; Não → Gateway_0lus07a |
| `Gateway_0lus07a` | Máximo de tentativas atendidas | Exclusive | LIS: Sim → revisao_manual_proposta; Não → retry |
| `Gateway_1xciylx` | *(sem name no BPMN)* | Exclusive | Após et_efetiva_cheque_especial ou ramos LIS → segue (ex.: Gateway_Orzool0) |

---

## Backoffice — `omnichannel_backoffice.bpmn` (transversal)

> **Quando:** disparado por evento desde qualquer BPMN macro  
> **Quem trabalha:** analistas de fraude, PLD, supervisores — não o gerente

### UserTasks

| ID | Nome | Fila |
| --- | --- | --- |
| `analise_documentos_backoffice` | Analise de fraude em andamento | Analista de fraude (AQ5) |
| `documentos_analise_backoffice` | Documentos Análise Backoffice | Analista |
| `analise_pld_alto` | Risco PLD - ALTO | Analista de PLD |
| `analise_pld_andamento` | Analise de pld em andamento | Analista de PLD |
| `erro_validacao_fraude` | Erro AQ5 (Biocatch) | Backoffice |
| `revisao_manual_proposta` | Revisão manual da proposta | Supervisor |
| `expurgo_manual` | Expurgo Manual | Backoffice |

### ServiceTasks

| ID | Nome | Observação |
| --- | --- | --- |
| `proposta_wayout` | Proposta enviada para Backoffice | Entrada no backoffice |
| `proposta_aprovada_backoffice` | Proposta Aprovada Backoffice | Saída OK |
| `proposta_falha_analise_bko` | Proposta com Falha na Analise | Saída com falha |
| `proposta_fraudulenta` | Proposta Fraudulenta | Recusa por fraude |
| `proposta_manutencao_jornada` | Atualiza proposta manual | Intervenção manual |
| `desfazimento_reserva_por_analise_fraude` | Desfazimento de reserva de conta | Cancel de reserva |
| `service_email_recusa_fraude` | [EK7] Enviar e-mail recusa Fraudes | Notificação |

### CallActivities já separados (mantêm como estão)

| ID | calledElement | Observação |
| --- | --- | --- |
| `subfluxo_analide_fraudes_aq5` | `worker_fraude_v2_contas` | Análise fraude AQ5 |
| `subfluxo_aq5_analise_fraude` | `worker_fraude_v2_contas` | Duplicata — mesma chamada |
| `call_activity_analisa_pld` | `worker_pld_contas` | Análise PLD AQ4 |
| `mesa_pld` | `worker_mesa_pld_contas` | Mesa PLD |
| `reserva_da_conta` | `reserva-conta` | Reserva de número de conta |

---

## Flows cross-BPMN existentes em produção

> Esses flows JÁ EXISTEM no monolito como sequence flows diretos. Após a decomposição: flows de **voltar** viram "buraco de minhoca" (coordenação via PAI); flow de **avanço** 1→2 vira sequência normal do PAI.

### Flows de voltar (buraco de minhoca)

| Flow ID | De (task) | Para (task) | BPMN futuro |
| --- | --- | --- | --- |
| `Flow_11m3pcg` | `dados_nome` | `escolha_segmento` | BPMN 2 → BPMN 1 via PAI |
| `Flow_03fc21n` | `dados oferta` | `selecionar_agencia` | BPMN 3 → BPMN 1 via PAI |
| `Flow_0m9vbwt` | `aceite_produtos` | `coletar_senha` | BPMN 3 → BPMN 4 via PAI (voltar para coletar_senha) — ver `DECISAO_FLOW_VOLTAR_ACEITE_PRODUTOS_COLETAR_SENHA.md` |

### Flow de avanço — sequência PAI (1→2)

| Flow ID | De (task) | Para (task) | BPMN futuro |
| --- | --- | --- | --- |
| `Flow_0ca3z8j` | `selecionar_agencia` | `dados_endereco` | BPMN 1 → BPMN 2 via PAI |

> **Semântica:** este flow é **avanço** (sequência normal). O PAI retorna da Call Configuração e invoca a Call Dados Pessoais; implementado pelo `Gateway_sequencia_1_2` do N1 (`MAPEAMENTO_ELEMENTOS_NIVEL1.md`), não por mensagem de voltar.

### Impacto (flows de voltar)

> **Impacto:** cada flow de **voltar** acima é ponto de implementação do "buraco de minhoca". Na **Opção A** (ver `DECISAO_VOLTAR_MACRO_OPCAO_A_OU_B.md`), o PAI usa Boundary Message Event e Gateway "para onde voltar?"; a posição do token já indica a Call ativa. A variável `bpmn_ativo` pode ser dispensável ou usada apenas para observabilidade (ver `MAPEAMENTO_ELEMENTOS_NIVEL1.md`, variáveis).

---

## Pendências de classificação

| Elemento | Dúvida | Quem decide | Status |
| --- | --- | --- | --- |
| `obter_limite_legado` / `obter_limite_v3` | BPMN 1 (Configuração) ou BPMN 3 (Produtos)? | Engenharia | **Decidido: BPMN 3** — ver `DECISAO_OBTER_LIMITE_BPMN1_OU_3.md` |
| `consultar_pa_cliente` | BPMN 1 ou BPMN 3? | Engenharia | **Decidido: BPMN 3** — ver `DECISAO_OBTER_LIMITE_BPMN1_OU_3.md` |
| `envia_consentimento_scr` (MD7) | BPMN 2 ou começo do BPMN 3? | Regra de negócio | **Recomendado: BPMN 2** — aguarda confirmação de negócio; ver `DECISAO_ENVIA_CONSENTIMENTO_SCR_BPMN2_OU_3.md` |
| `cadastra_risco_bacen` | BPMN 4 ou transversal Bacen? | Engenharia | **Decidido: processo transversal Bacen** — ver `DECISAO_CADASTRA_RISCO_BACEN_BPMN4_OU_TRANSVERSAL.md` |
| Voucher | Mesma instância CO8 ou nova? | Fernanda + negócio | **Decidido: mesma instância CO8** — ver `DECISAO_VOUCHER_MESMA_INSTANCIA_OU_NOVA.md` |
| Gateways da Efetivação | Extração do BPMN | Engenharia | **Concluído** — ver subseção "Gateways (Efetivação)" em Efetivação |
| Message Start Backoffice (tipos/granularidade) | Validar com negócio quais tipos de casos devem virar Message Start distintos | Negócio / Arquitetura | **Pendente** — ver `MAPEAMENTO_ELEMENTOS_NIVEL2_BACKOFFICE.md` seções 2 e 8 |

> Nota técnica: as decisões acima seguem as recomendações técnicas formalizadas nos documentos `DECISAO_*` e são aplicadas tomando `omnichannel_completo.bpmn` como fonte de verdade para o comportamento.
---

## Referências

| Documento | Foco | Conteúdo |
| ----------- | ------ | --------- |
| `APRESENTACAO_SOLUCAO_BPMN_HOJE.md` | **Por quê** | Pitch executivo: problema, pilares, métricas antes/depois, benchmarks |
| `APRESENTACAO_DIVISAO_BPMN_V2.md` | **Como** | Decisões arquiteturais, fronteiras, cortes exatos por task, buraco de minhoca |
| `omnichannel_completo.bpmn` | Fonte | BPMN monolítico — origem de todos os IDs mapeados aqui |
| `DECISAO_OBTER_LIMITE_BPMN1_OU_3.md` | Decisão | obter_limite / consultar_pa → BPMN 3 (adotado) |
| `DECISAO_ENVIA_CONSENTIMENTO_SCR_BPMN2_OU_3.md` | Decisão | envia_consentimento_scr (MD7) — BPMN 2 ou 3 |
| `DECISAO_CADASTRA_RISCO_BACEN_BPMN4_OU_TRANSVERSAL.md` | Decisão | cadastra_risco_bacen — BPMN 4 ou transversal |
| `DECISAO_VOUCHER_MESMA_INSTANCIA_OU_NOVA.md` | Decisão | Voucher — mesma instância CO8 ou nova |
| `DECISAO_CONSISTENCIA_N2_CONSULTAR_PA.md` | Decisão | consultar_pa só no BPMN 3 no N2 (consistência) |
| `DECISAO_FLOW_VOLTAR_ACEITE_PRODUTOS_COLETAR_SENHA.md` | Decisão | Flow_0m9vbwt = buraco de minhoca BPMN 3→4 |
| `DECISAO_EFETIVACAO_PAI_OU_BPMN4.md` | Decisão | Efetivação chamada pelo BPMN 4 |
| `DECISAO_BACKOFFICE_QUEM_PUBLICA_EVENTO.md` | Pendência | Quem publica evento de início do Backoffice |
| `MAPEAMENTO_ELEMENTOS_NIVEL2_BACKOFFICE.md` | Inventário | UserTasks, ServiceTasks e blocos do processo backoffice; pendência Message Start (seções 2 e 8) |
| `DECISAO_SEGUROS_STI_COMBINAKI_BLOCOS_N3.md` | Decisão | Seguros/STI/Combinaki = ramos em Produtos Complementares |
