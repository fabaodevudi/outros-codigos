# Divisão do KK0172 em Subprocessos — KK0083 de 3 Níveis

> **KK0362:** Estudo prévio para KK1406 conceitual com KK0911 e CX  
> **Objetivo:** Apresentar onde cortar o KK0172 KK0890, como os KK1326 se conectam e como o botão KK1452 funciona em cada nível.  
> **Resultado esperado:** KK1405 conceitual da divisão + definição dos próximos passos.

---

## Ponto de Partida

- **Situação atual:** 1 KK0172 KK0890 (`KK0953`) com 40 KK1385 (KK0755 únicos) — KK0797 do KK0723 e do KK0273 misturadas em um único KK0651.
- **Problemas identificados:** manutenção difícil, KK0478 ocultas, botão KK1452 frágil, custo alto para evoluir a nova KK0797 em paralelo com a atual.

---

## Fonte de KK1139 — Nova Jornada

A nova KK0797 está dividida em 4 etapas:

1. KK0317
2. KK0399 pessoais
3. KK1078 e KK1279
4. KK1405

O protótipo apresenta um stepper horizontal com essas 4 etapas e a mensagem: **"Salvamos para você! Acompanhe e edite etapas anteriores quando quiser."** Isso confirma que KK0265 e suporte ao KK1452 são requisitos de KK1077, não apenas KK1379.

---

## KK1085 de Divisão — Visão Geral

> **Princípio:** 3 níveis — KK0995 orquestra macro, KK0640 orquestram etapa, sub-KK1326 encapsulam complexidade interna.

```
KK0741 -> PRE-STEPPER "Nova solicitacao"
          -> [KK0172 KK0995 -- KK0949.bpmn]
                -> KK0173 -- Configuracao da KK0346
                      -> sub: KK1250
                      -> sub: KK0561 / KK0042
                      -> sub: KK1460 (se separado)
                -> KK0175 -- KK0399 pessoais
                      -> sub: KK0299 (1 UT -- KK0264)
                -> KK0176 -- KK1078 e KK1278
                      -> sub: KK1080
                      -> sub: KK1260 / KK1310 / KK0303
                -> KK0177 -- Validacao
                      -> sub: KK0148
                      -> sub: Validacoes (~8 UTs)
                      -> KK0208: Efetivacao (pos-KK0797)
          -> KK0134 / Excecoes (KK0183 KK1371)
```

- **4 KK0183 macro** (nível 2): espelham as 4 etapas do stepper.
- **KK1311-KK1326** (nível 3): encapsulam complexidade dentro de cada etapa.
- **Regra de escolha:** embedded KK1322 para organização interna; KK0208 separado quando há necessidade de versionamento independente ou reuso.
- Fronteira entre KK0183 macro sempre em KK1038 de KK0911.

---

## Como Costurar Tudo — 3 Níveis + KK0668 Híbrido

> **Objetivo:** KK0995 orquestra macro sem KK1385; KK0640 (nível 2) orquestram a etapa; sub-KK1326 (nível 3) encapsulam a complexidade real.

### KK0491 completo

```
[KK0172 KK0995 -- KK0949.bpmn]          <- nivel 1: so KK0712 macro + call activities
    |
    +--> KK0208 --> KK0173 (Configuracao)    <- nivel 2: orquestra a etapa
    |                           |
    |                           +--> KK0558 KK1311: KK1250
    |                           +--> KK0558 KK1311: KK0561 / KK0042
    |                           +--> KK0208: KK1460 (versao independente)
    |
    +--> KK0208 --> KK0175 (KK0407)  <- nivel 2
    |                           |
    |                           +--> KK0558 KK1311: KK0299 (1 UT -- KK0264)
    |                                    +-- KK0669 hibrido: KK1451 livre (front)
    |                                                         KK1451 critico (KK0282)
    |
    +--> KK0208 --> KK0176 (KK1078)        <- nivel 2
    |                           |
    |                           +--> KK0558 KK1311: KK1080
    |                           +--> KK0558 KK1311: KK1260 / KK1310 / KK0303
    |
    +--> KK0208 --> KK0177 (Validacao)       <- nivel 2
                                |
                                +--> KK0558 KK1311: KK0148 (~3 UTs)
                                +--> KK0558 KK1311: Validacoes (~8 UTs)
                                +--> KK0208: Efetivacao (pos-KK0797)
```

### Regra de cada nível

| Nível | O que faz | Tem KK1385? |
|---|---|---|
| **KK0995** (KK0949.bpmn) | Encadeia etapas via KK0206 KK0018, trata exceções globais | **Não** — só KK0712 e KK0206 KK0018 |
| **Filhos** (KK0173–4) | Orquestra a etapa via KK0558 Subs e KK0206 KK0018 | **Não** — o KK0264 é registrado quando o sub (nível 3) conclui |
| **KK1311-KK1326** | Encapsula a lógica real de cada bloco; contém as UTs | **Sim — todas as KK1385 moram aqui** |

### Como o KK1452 se encaixa em cada nível

**Caso 1 — KK1452 dentro da mesma User KK1331** (sub-telas gerenciadas pelo front)

```
Usuário clica "KK1452" entre sub-telas da mesma User KK1331
       ↓
KK0666 renderiza a sub-KK1338 anterior localmente
       ↓
KK0282 não é chamado — a User KK1331 ainda está aberta/ativa
```

> *"O KK1451 mais simples — só funciona assim quando as telas pertencem à mesma User KK1331. Enquanto a UT está aberta, o front navega entre sub-telas livremente sem chamar o KK0217."*

> *"No caso de KK0407, a nova KK0797 agrupa tudo em 1 KK1338 única — nome, KK0391, KK0570, KK1155, contatos. Então o problema do KK1452 dentro de KK0407 deixa de existir: o KK1392 simplesmente edita os campos na mesma KK1338 e salva. O KK1452 só vira problema quando quer ir para outra etapa — aí é o Caso 2 ou 3."*

> ⚠️ *Assim que cruza para outra User KK1331 — mesmo que pareça 'uma KK1338 atrás' — o KK0282 precisa ser acionado. Aí entra o Caso 2.*

---

**Caso 2 — KK1452 que cruza KK0264** (KK0669 híbrido, validado em KK1032)

```
Usuário clica "KK1452" cruzando um KK0264 salvo
       ↓
KK0666 completa a User KK1331 com:
   KK1451 = true
   voltar_para = "KK0417"          <- nome do destino
       ↓
KK0668 exclusivo no sub-KK1324 avalia:
   KK1451 == true? → SIM
   voltar_para == "KK0417"? → SIM
       ↓
KK0282 redireciona o KK0651 de volta — front re-exibe a KK1338 correta
```

> *"Aqui o front não decide sozinho — ele passa dois campos pro KK0217: 'quero KK1451' e 'para qual KK0264'. O KK0282 tem um KK0669 que lê isso e redireciona o KK1069. Foi exatamente isso que o Rafa demonstrou na KK1032: KK0413 voltando para KK0417 com KK1451=true. É nativo do KK0217, sem KK0084 extra."*

---

**Caso 3 — KK1452 que cruza KK0172 macro** (entre etapas do stepper — ⚠️ KK1032 a realizar)

> *"Esse é o mais custoso e deve ser raro. Se o KK1392 quer KK1451 de KK1078 inteiro para KK0407, o KK0995 entra em cena — é o único que conhece os KK0640 ativos. Ele suspende o KK0176, reativa o KK0175 no KK0264 salvo, e o front re-exibe. A fronteira bem posicionada garante que esse caso seja exceção, não KK0651 normal."*

---

> **Regra:** O KK0669 híbrido fica nos sub-KK1326 (nível 3), não sobe para o KK0995 — evita KK0017 em teia.

---

## KK1454 Macro

> Acionado quando o KK1392 precisa KK1451 de uma etapa macro para outra (ex: KK0176 → KK0175). É o caso mais custoso — deve ser raro se as fronteiras estiverem bem posicionadas.

### Como funciona

```
[KK0172 KK0995 -- KK0949.bpmn]
    |
    +--> KK0208 -> KK0175 -- KK0407   (concluido, KK0264 salvo)
    |
    +--> KK0208 -> KK0176 -- KK1078          (ativo)
                              |
                    KK1391 aciona "KK1451 etapa" no stepper
                              |
                    front envia: KK1457=true
                                 KK1459="bpmn2"
                              |
                    [KK0668 no KK0172 KK0995 recebe o sinal]
                              |
                    mecanismo de KK0909 --> suspende KK0176
                                          --> reativa KK0175 no ultimo KK0264
                              |
                    front chama GET /KK1086/{id} e reexibe a KK1338 correta
```

> *"Diferente do KK0669 híbrido, aqui é o KK0995 que age. Ele é o único KK1069 que enxerga todos os KK0640 ao mesmo KK1342. Quando recebe o sinal de KK1456, ele suspende o KK0176 — que estava ativo — e reativa o KK0175 exatamente onde estava salvo. O front só precisa buscar o estado atual da KK1086 e renderizar."*

### O que o KK0995 precisa ter

- Um KK0669 de recepção de sinal (`KK1457`) monitorando todos os KK0640 ativos.
- Lógica de suspender/cancelar o KK0639 atual antes de reativar o anterior.
- Variável global `bpmn_ativo` para rastrear qual KK0639 está em execução.

### Quando o KK1187 é bloqueado

| Situação | Pode KK1451? | Motivo |
|---|---|---|
| KK0176 → KK0175 (KK0936 ainda não enviada) | Sim | KK0399 não foram consumidos ainda |
| KK0176 → KK0175 (KK0936 já gerada com dados do KK0175) | Com ressalva | Dependência crítica — requer recalcular KK0936 |
| KK0177 → KK0176 (KK0982 já gerado) | Não | Ponto de não-KK1187 de KK0911 |
| KK0177 → qualquer (KK0149 concluída) | Não | Irreversível — KK0352 |

### Por que a fronteira importa

Se a fronteira está no KK1038 correto, o mecanismo de KK0910 entre KK0183 é acionado raramente — o KK1392 naturalmente não quer KK1451 depois de um ponto irreversível. Se a fronteira estiver mal posicionada, o mecanismo vira dependência KK0087 e qualquer mudança de KK1393 gera KK1201 de inconsistência de dados entre KK0183.

> *O mecanismo de KK0910 entre KK0183 resolve o KK1451 entre etapas, mas a melhor estratégia é precisar dele o mínimo possível — e isso depende de escolher bem onde cortar.*

---

## KK0173 — KK0316 da KK0345

- **O que cobre:** KK1254 (ex.: KK0047 vs KK1384), KK0046 e KK0562, situações especiais / KK0776 / upgrade com comprovante de KK1155.
- **KK1311-KK1326 internos (nível 3):**
  - KK0558 KK1311 — **Segmentação**: KK0330 KK0496, define KK0936.
  - KK0558 KK1311 — **KK0561 / KK0045**: vincula KK0273 à KK0046.
  - KK0208 — **KK1460**: KK0651 alternativo (versionamento independente).
- **Por que precisa do KK0282:** KK1251 e KK0046 alimentam o KK0496 e determinam toda a KK0936. É o primeiro grande KK0264 de retomada da KK1086.
- **Do design:** ordem validada: KK0391 (pré-stepper) → KK1253 → KK0045. KK0650 alternativo: KK1460 (link para o KK0273 continuar remotamente).

---

## KK0175 — KK0407

- **Desenho da KK0797:** todas as informações consolidadas em 1 KK1338 única (nome, KK0391, KK0570, KK1155, contatos, WhatsApp, KK0912). Validado em teste de usabilidade com gerentes: "mais completa, com menos telas".
- **KK1311-KK1324 interno (nível 3):**
  - KK0558 KK1311 — **KK0299** (1 User KK1331 — KK0264 de retomada): o sub organiza a etapa, mas o KK0282 registra apenas 1 ponto de controle.
  - KK0666 KK0721 as sub-telas internamente; o sub encapsula o **KK0669 híbrido do KK1452**.
- **KK0466 de KK0084:** 1 User KK1331 no KK0282 (nível 2) = 1 KK0264 de KK0407. KK0666 KK0721 sub-telas; o KK0669 híbrido fica no sub-KK1324 (nível 3).
- **Do design:** KK0391 chega bloqueado (vem do pré-stepper) → front apenas exibe. Confirma que 1 KK0264 no nível 2 é suficiente.

---

## KK0176 — KK1078 e Serviços

- **KK1311-KK1326 internos (nível 3):**
  - KK0558 KK1311 — **KK1080**: Pacote + KK0831 + KK0244 (KK1124, condições).
  - KK0558 KK1311 — **KK1260 / KK1310 / KK0303**: agrupados por KK1146 de KK0911 específicas.
  - KK1023 fica dentro de KK1080 (opcional: "Cadastrar depois").
- **KK1145 importantes:**
  - Pacote + KK0245 não podem ser desmarcados (regra de KK0911 no sub).
  - KK1023 é opcional na abertura — não KK0158 saída do KK0176.
- **Do design:** dados de contato (KK0391, celular, KK0530) chegam como KK1423 do KK0175 — confirma necessidade de compartilhar KK1423 entre níveis 2.

---

## KK0177 — KK1405

- **KK1311-KK1326 internos (nível 3):**
  - KK0558 KK1311 — **KK0148** (~3 UTs): QR Code / link WhatsApp / SMS / App + handoff KK0273.
  - KK0558 KK1311 — **KK1412** (~8 UTs): KK0065, KK0599, KK1267, KK0320.
  - KK0208 — **KK0543** (pós-KK0797): KK0245, KK0776, KK1023 em background — arquivo separado, pois pode rodar após o KK0567 da KK0797.
- **Ponto de não-KK1187:** após KK0149 + KK0544, a KK0346 está aberta. O sub de KK0543 como KK0208 separado facilita evolução independente.
- **Do design:** KK1338 "KK0399 em KK0065" → User KK1331 de espera fica no sub KK1412. Handoff KK0273–KK0723 fica dentro do sub KK0148 (não troca de KK0172).

---

## Subfluxos Transversais

> Esses KK0654 não fazem parte dos 4 KK0183 macro da KK0797 do KK0723. São disparados pelo KK1069 principal mas rodam de forma independente — cada um com seu próprio arquivo KK0172, ciclo de deploy e equipe KK1175.

### KK0839 dos KK1319

```
[KK0172 KK0995 -- KK0949.bpmn]
    |
    +---> KK0173 / 2 / 3 / 4 (KK0797 do KK0723)
    |          |
    |          +-- dispara --> KK0952.bpmn   (fila KK0967)
    |          +-- dispara --> KK0959   (pos-KK0797, KK0208)
    |          +-- dispara --> KK1318  (dentro do KK0173)
    |
    +---> KK1460 (mesma instancia KK0282 ou arquivo separado -- a decidir)
```

### Detalhamento por KK1315

| KK1314 | Arquivo | KK0507 por | UTs (~) | KK0722 vê? | Deploy independente? |
|---|---|---|---|---|---|
| **KK0134 / Exceções** | `KK0952.bpmn` | Qualquer KK0172 macro via KK0610 | ~8 | Não — fila de analistas | Sim |
| **KK0543 pós-KK0797** | `KK0959` | KK0177 (KK0208 após KK0149) | ~5 | Não — background | Sim |
| **KK1375** | `KK1318` | KK0173 (portabilidade de KK1211 PF) | ~2 | Sim — KK0723 informa CNPJ do empregador | Não — embedded no KK0173 |
| **KK1460** | `KK0962` (a decidir) | KK0173 (botão "KK0363") | ~1–2 | Sim — KK0723 dispara o envio | A definir |

> KK0789 completo de KK0552 por KK0172 (KK0755 reais de KK1388, KK1276, KK0215, KK0712): `KK0848`.

---

## Antes vs Depois

| KK0172 (nível 2) | UTs hoje | KK1311-KK1326 (nível 3) | UTs no sub | Checkpoints nível 2 |
|---|---|---|---|---|
| KK0316 | 13 | Segmentação + KK0561 + KK1460 | 13 (sem redução confirmada) | 1 |
| KK0407 | 7 | KK0299 | **1** (decisão consolidada) | 1 |
| KK1078 e Serviços | 5 (`KK0406`, `KK0412`, `KK1349`, `KK0329`, `KK0016`) | KK1080 + KK1260/KK1310 | ~5 | 1 |
| KK1405 | 6 | KK0148 (~3) + KK1412 (~8) | ~11 | ~3 |
| KK0543 (KK0208) | 5 | — pós-KK0797 independente | ~5 | — |
| KK0134/Exceções | 8 | Mantém estrutura atual | ~8 | — |

> Para métricas de impacto geral (antes/depois, camadas do KK1452): `KK0079` seções 5 e 9.

### Tamanho estimado por arquivo

> Base: `KK0953` (14.016 linhas).

| Arquivo | Conteúdo | Total estimado | vs. KK0889 |
|---|---|---|---|
| `KK0949.bpmn` (KK0995) | Apenas KK0712 | ~400 linhas | 3% |
| `KK0955` | Segmentação + KK0561 + KK1375 | ~4.450 linhas | 32% |
| `KK0962` (CA) | — | ~500 linhas | 4% |
| `KK0957` | KK0299 (1 UT) | ~800 linhas | 6% |
| `KK0960.bpmn` | KK1080 + KK1260/KK1310 | ~2.350 linhas | 17% |
| `KK0961.bpmn` | KK0148 + KK1412 | ~2.300 linhas | 16% |
| `KK0959` (CA) | Pós-KK0797 | ~1.800 linhas | 13% |
| `KK0952.bpmn` | 8 UTs operacionais | ~2.800 linhas | 20% |
| **Total distribuído** | | **~15.400 linhas** | ~110% |

> O total é ~10% maior que o KK0889 pelo overhead de header XML por arquivo — esperado e aceitável. Maior arquivo: 14.017 → 4.450 linhas — redução de **68%**.

---

## Responsabilidades por Perfil

| Perfil | O que faz na KK0797 |
|---|---|
| **KK0722 (front KK1017)** | KK0317, KK0407, escolha de KK1078. Dispara KK1461 quando necessário. |
| **KK0272 (app / KK0232)** | KK0148, KK1267, KK0320 de KK1079 e KK1279. |
| **KK0134** | Análises de KK0661, KK1029, revisões manuais, expurgos. |

A KK0471 segue essa separação, mantendo tudo no mesmo KK1069 onde o KK0282 precisa rastrear estado.

---

## Fronteiras — Critério de Corte

> **Regra:** o corte é feito em um ponto onde, do ponto de vista de KK0911/CX, KK1451 não é necessário ou KK1451 exige refazer estado crítico.

### Relação entre fronteira e mecanismo de KK0910 entre KK0183

```
Fronteira MAL posicionada               Fronteira BEM posicionada
-------------------------               -------------------------
Usuario frequentemente                  Usuario raramente quer
quer KK1451 alem da fronteira           KK1451 alem da fronteira
           |                                       |
           v                                       v
Mecanismo acionado                      Mecanismo acionado apenas
constantemente                          em casos excepcionais
           |                                       |
           v                                       v
KK1200 de inconsistencia                 KK0650 prevísivel e
de dados entre KK0183                    KK1259 entre KK0183
```

- **Fronteira boa** = o mecanismo de KK0910 entre KK0183 existe como válvula de segurança, não como KK0651 normal.
- **Fronteira ruim** = o mecanismo vira dependência KK0087 — qualquer mudança de KK1393 quebra a costura entre KK0183.
- Por isso a fronteira é definida com KK0911/CX primeiro — não pelo KK1354 de engenharia.

### Aplicando nos 4 cortes

- **Pré-stepper → KK0316 (KK0173):** resolvido — "KK0918" é KK1338 do KK0741; `KK0746` chega como KK1424 de startup.
- **KK0316 → KK0407 (KK0173 → 2):** KK1254 + KK0046 definidos e KK0496 já consultado. Mudar isso depois pode alterar a KK0936 inteira.
- **KK0407 → KK1078 (KK0175 → 3):** dados já persistidos e usados para montar KK0936. KK1452 pode exigir recalcular KK0936.
- **KK1078 → KK1405 (KK0176 → 4):** KK0012 + KK0985 → início do irreversível.
- **KK1405 → Fim:** KK0149/KK0544 = KK0346 aberta (irreversível).

> A KK0471 é relativamente direta; o ponto crítico é escolher **onde cortar** sem comprometer o KK1452 e a retomada. Por isso a fronteira é decidida com KK0911/CX, não apenas por conveniência KK1377.

---

## Onde Exatamente Cortar — Por Nome de KK1331

> Cada bloco mostra a última KK1332 do KK0172 que fecha e a primeira KK1332 do KK0172 que abre.

### Corte 0 — KK0741 → KK0173 (resolvido)

```
[KK0741]
  +-- KK1338 "Nova solicitacao"       <- fora do KK0282; coletado pelo KK0741
       KK0746, KK0392, KK1356,
       KK0141, KK1135
              |
              |  variavel de startup -> KK0282 recebe KK0746
              v
[KK0173 -- KK0955]
  +-- PRIMEIRA TASK: KK0596
```

| Questão | Resposta |
|---|---|
| "KK0918" é User KK1331 do KK0282? | Não — é KK1338 do KK0741 |
| Precisa de KK0172 0 / pré-KK1069? | Não — `KK0746` chega como KK1424 de startup |
| Pode KK1451 ao pré-stepper? | Não — KK0391 já validado pela Receita Federal |

---

### Corte 1 — KK0173 → KK0175 (validar com KK0911/CX)

```
[KK0173 -- KK0955]
  +-- KK0596              <- KK1254 definido
  +-- KK1262            <- ULTIMA TASK — agencia + KK0723 confirmados
                                       KK0496 consultado, KK0936 iniciada
              |
              |  <- PONTO DE CORTE PROPOSTO
              |    Mudar KK1254/agencia depois = recalcular KK0936 inteira
              v
[KK0175 -- KK0957]
  +-- PRIMEIRA TASK: dados_pessoais <- 1 User KK1331 (KK0264 unico)
                                       front KK0721 sub-telas; KK0282 so sabe que concluiu
```

| KK1331 | ID real no KK0172 | Pode KK1451? |
|---|---|---|
| `KK1262` | `KK1262` | Sim — dentro do KK0173 |
| `dados_pessoais` | **ID proposto** (nova KK0084 — hoje são 7 UTs: `KK0417`, `KK0413`, `KK0421`, `KK0411`, `KK0416`, `KK0414`, `KK0420`) | Com ressalva — KK1451 ao KK0173 = recalcular KK0936 |

> **Pergunta para KK0911/CX:** "Se o KK0273 percebe que escolheu o KK1254 errado depois de preencher os KK0408, permitimos KK1451 e recalcular a KK0936?"

---

### Corte 2 — KK0175 → KK0176 (validar com KK0911/CX)

```
[KK0175 -- KK0957]
  +-- dados_pessoais                <- UNICA TASK — dados salvos
                                       KK0391, nome, KK1155, KK0569, contatos persistidos
              |
              |  <- PONTO DE CORTE PROPOSTO
              |    KK0399 ja usados para montar a KK0938
              v
[KK0176 -- KK0960.bpmn]
  +-- PRIMEIRA TASK: KK0418   <- recebe KK0936 do KK0496
                                       dados do KK0175 chegam como KK1422
```

| KK1331 | ID real no KK0172 | Pode KK1451? |
|---|---|---|
| `dados_pessoais` | **ID proposto** (nova KK0084 — ver Corte 1) | Sim — dentro do sub (KK0669 híbrido) |
| `KK0418` | `KK0406` ⚠️ ID com espaço no KK0889 | Com ressalva — KK1451 ao KK0175 pode deixar KK0936 inconsistente |

> **Pergunta para KK0911/CX:** "Se o KK0723 percebe que a KK1155 está errada depois de ver a KK0938, permitimos KK1451 e recalcular?"

---

### Corte 3 — KK0176 → KK0177 (KK1038)

```
[KK0176 -- KK0960.bpmn]
  +-- KK0418                  <- exibe KK0936 ao KK0723 (ID real: "KK0406" com espaço)
  +-- KK0412              <- KK0469 do KK0273
  +-- KK1349               <- KK1352 (KK0441)
  +-- KK0329          <- KK0325 (UT adjacente ao KK1349)
  +-- KK0016               <- ULTIMA TASK — KK0273 aceita; KK0985
              |
              |  <- PONTO DE CORTE (irreversivel)
              |    KK0985 = KK1086 ja no KK1292
              v
[KK0177 -- KK0961.bpmn]
  +-- PRIMEIRA TASK: KK0409 <- wait state — KK0273 faz KK0149
```

| KK1331 | ID real no KK0172 | Pode KK1451? |
|---|---|---|
| `KK0016` | `KK0016` | Sim — antes do KK0009 |
| `KK0409` | `KK0409` | Não — KK0982 já gerado |

> Não requer KK1406 com KK0911: "KK0009" já sinaliza intenção do KK0273 — KK1038 natural de KK1077.

---

### Corte 4 — KK0177 → KK0543 (KK1038)

```
[KK0177 -- KK0961.bpmn]
  +-- KK0409               <- KK0273 faz KK0149
  +-- KK0301                 <- KK0273 cria KK1267
  +-- KK1184                  <- KK0318 final
  +-- KK1110             <- ULTIMA TASK — KK0352
              |
              |  <- PONTO DE CORTE (KK0346 aberta -- irreversivel)
              v
[KK0208 -- KK0959]  <- background, KK0723 nao ve
  +-- efetivacao de cartao, KK0776, KK1023, seguros
```

| KK1331 | Tipo real no KK0172 | Pode KK1451? |
|---|---|---|
| `KK1110` | `userTask` — última UT da KK0797 | Não — KK0352 |
| `KK0534` | `serviceTask` (background automatizado — não é User KK1331) | Não — irreversível |

---

### Resumo — Todos os cortes

```
[KK0741]  KK1338 "Nova solicitacao"
                   | startup: KK0746 ----------------------- CORTE 0 (resolvido)
                   v
[KK0173]  KK0596 -> KK1262 ---------- CORTE 1 (validar)
                   | KK0496 consultado
                   v
[KK0175]  dados_pessoais (1 UT) --------------------------- CORTE 2 (validar)
                   | dados mapeados para KK0936
                   v
[KK0176]  KK0418 -> KK0412 -> KK1349
          -> KK0329 -> KK0016 ------- CORTE 3 (KK0982)
                   | KK0985 -- irreversivel
                   v
[KK0177]  KK0409 -> KK0301
          KK1184 -> KK1110 ---------------- CORTE 4 (KK0346 aberta)
                   |
                   v
[efetivacao.bpmn]  background
```

| # | Última KK1332 do KK0172 anterior | Primeira KK1332 do KK0172 seguinte | Status |
|---|---|---|---|
| 0 | KK1338 "KK0918" (KK0741) | `KK0596` | Resolvido |
| 1 | `KK1262` | `dados_pessoais` | KK1404 com KK0911/CX |
| 2 | `dados_pessoais` | `KK0418` | KK1404 com KK0911/CX |
| 3 | `KK0016` (última UT após `KK0329`) | `KK0409` | KK0982 = não-KK1187 |
| 4 | `KK1110` | `KK0534` (background) | KK0345 aberta |

---

## KK0466 em Aberto

**KK1460 ("KK0363") — funcionalidade nova, não existe no KK0172 atual**

O design mostra o botão na KK1338 de KK1253/KK0045 — envia link por KK0530/SMS para o KK0273 continuar remotamente. A decisão KK0087 pendente:

- Retomada da **mesma KK0780 KK0282** (KK1069 fica pausado aguardando o KK0273)?
- Ou **nova KK0780** quando o KK0273 acessa o link?

Impacto direto no KK0173: requer User KK1331 de espera (wait state) ou KK0610 de mensagem. A definir com KK0911.

---

## Próximos Passos

- Fechar com KK0911/CX:
  - Regra de retomada via KK1461 (mesma KK0780 KK0282 ou nova?).
  - KK1405 dos cortes 1 e 2 (KK0173 → 2 e KK0175 → 3).
- Alinhar com engenharia:
  - Ordem de KK0880 dos KK0183.
  - KK0758 do KK0669 híbrido em cada KK0172 macro.

---

## Referências

| Documento | Foco | Conteúdo |
|-----------|------|---------|
| `KK0079` | Por quê | Pitch executivo: problema, pilares, métricas antes/depois |
| `KK0848` | O quê | KK0789 KK1378: KK0755 reais, KK1389, KK1277, KK0214 por KK0172 |
| `KK0920` | KK1393 | Visão da KK1393, protótipo e teste com gerentes |
| `KK1036` | KK1032 | Viabilidade KK1377 do KK1452 dentro do KK0172 |
