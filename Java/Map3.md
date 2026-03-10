# kkkk58 de kkkk59 — Nível 2 (por kkkkft)

> **Fonte:** `kkkkk6` — extração direta dos kkkk5j (kkkk8m, kkkk8n, kkkk8o, kkkk8k)  
> **Data:** 24/02/2026  
> **Método:** grep dos elementos + rastreamento de sequence kkkkoa  
> **Objetivo:** kkkk5f completo para guiar a kkkkgv — saber o que cortar e para onde mover  
> **kkkkpn:** os valores entre aspas nas colunas ID (e Flow ID, De/Para) são **idênticos** ao `kkkkk6` para uso com kkkk57+V na busca do kkkkpm. Onde o kkkkhk usa espaço no id (ex.: `kkkkij`, `kkkk01`, `kkkkmb`), o texto está com espaço.

---

## Legenda de tipos

| Tipo | Descrição |
| --- | --- |
| kkkk8m | Interação humana |
| kkkk8n | kkkkxl externa/kkkkaq |
| kkkk8o | Script interno (Groovy/JS) |
| kkkk8k | kkkkxl para kkkkft já existente |
| kkkkis | Decisão ou junção relevante |

---

## kkkkgx — `kkkkot`

> **Etapa:** ① kkkkty (stepper)  
> **kkkkyl kkkkho:** entrada em `kkkkjb`  
> **Ponto de não-kkkkdy:** após `kkkkjg` → kkkke6 consultado, kkkkss iniciada

### kkkka5

| ID | Nome | Observação |
| --- | --- | --- |
| `kkkkjb` | kkkkt1 | Primeira UT da etapa |
| `kkkknz` | Envio kkkk5m | Condicional: kkkkgg ou situação especial |
| `kkkkjg` | kkkkjh | Última UT — ponto de corte para kkkkgy |
| `kkkklx` | Benefício kkkkhm | Condicional: toggle kkkkhm ativo |
| `kkkk02` | kkkkl1 | kkkk67: kkkkf1 (portabilidade kkkk7j) |
| `kkkkox` | kkkkl2 | kkkk67: kkkkf1 |
| `kkkkjm` | kkkkt3 | Exceção operacional |
| `kkkkjc` | kkkki3 kkkkmd | Estado de exceção |
| `kkkkmb` | kkkkme | Estado de exceção |
| `kkkkjj` | Restrição kkkk0f | Estado de exceção |
| `kkkkjd` | kkkkje | Estado de erro |
| `kkkkpl` | kkkkje | Estado de erro |
| `kkkko0` | kkkkje | Estado de erro |

### kkkka6 / kkkkg1

| ID | Nome | Tipo | Observação |
| --- | --- | --- | --- |
| `kkkkm2` | kkkklt | 📜 | START → aqui (inicializa kkkkvo de kkkkvr) |
| `kkkklr` | [kkkk8e] kkkkb5 | ⚙️ | Consulta perfil quando kkkklo |
| `kkkkls` | [kkkk8e] kkkkb5 | ⚙️ | Idem quando kkkklp |
| `kkkkno` | kkkkln | 📜 | Persiste kkkksx pós-kkkkxg |
| `kkkkb0` | Atualiza dados kkkkxg na kkkk3l | ⚙️ | Após kkkkxg, antes de `kkkkiy` |
| `kkkkm3` | Consulta kkkki3 | 📜 | kkkkng externa |
| `kkkknp` | Consulta kkkki3 | ⚙️ External (`kkkkc1`) | Verifica kkkkxk/kkkkxr |
| `kkkknq` | kkkklu | ⚙️ kkkkaq | Persiste kkkkxr na kkkk3l |
| `kkkkm4` | kkkki3 kkkkmd | ⚙️ kkkkaq | Caminho de exceção |
| `kkkknr` | kkkklg não elegível | ⚙️ kkkkaq | Caminho de exceção |
| `kkkkns` | kkkk58 kkkkyn | 📜 | Mapeia dados para kkkkvh manual |
| `kkkknt` | kkkktn | ⚙️ External (`kkkkbx`) | Configura kkkklh |
| `kkkknu` | kkkkto | ⚙️ kkkkaq | Persiste kkkk8g na kkkk3l |
| `kkkknv` | kkkk56 Beneficio kkkkhm | ⚙️ External (`kkkkci`) | kkkkfg se ativo |

### kkkkac (já existentes)

| ID | kkkk5g | Observação |
| --- | --- | --- |
| `kkkkn0` | `kkkk1m` | Portabilidade de kkkk7j — permanece embedded no kkkkgx |
| `kkkkpt` | `kkkkbj` | kkkkfm — kkkk7r |

### kkkkps chave

| ID | Nome | Decisão |
| --- | --- | --- |
| `kkkkpb` | kkkklq | Direciona para `kkkklr` ou `kkkkls` |
| `kkkkph` | — | Elegibilidade: ok → `kkkklx`, não → `kkkkly` |
| `kkkkpg` | — | Após `kkkkjb`: precisa de upgrade? |
| `kkkkpe` | Pode mudar kkkkxr? | Permite re-kkkkvg ou não |
| `kkkkpd` | Possui Residência no Exterior? | Após `kkkki0`: SIM → `kkkkiz`, NÃO → `kkkkjg` |

---

## kkkkgy — `kkkkoq`

> **Etapa:** ② kkkkwx pessoais (stepper)  
> **kkkkyl kkkkho:** 1 kkkk8m única (decisão 24/02)  
> **Ponto de não-kkkkdy:** após dados salvos → próximo passo usa esses dados para montar kkkkss

### kkkka5

| ID | Nome | Observação |
| --- | --- | --- |
| `kkkkiy` | nome | Primeira UT — abre kkkkl9 |
| `kkkkix` | kkkkkm | ⚠️ Nova kkkkgq: front kkkkyp como sub-tela |
| `kkkkiw` | kkkkkl | ⚠️ Nova kkkkgq: front kkkkyp como sub-tela |
| `kkkkjs` | kkkkkn | ⚠️ Nova kkkkgq: front kkkkyp como sub-tela |
| `kkkkiz` | kkkkwx NIF | Condicional: kkkk1x com residência fiscal no exterior |
| `kkkkjt` | Endereço | ⚠️ Nova kkkkgq: front kkkkyp como sub-tela |
| `kkkki0` | kkkksy | Última UT — kkkkho segue para kkkk1o/kkkkxr (kkkkvr atual) |

> **Decisão de kkkksk (24/02):** na nova kkkkgq, as 7 UTs acima colapsam em **1 User kkkk8l** no kkkkho. O front navega entre as sub-telas internamente. O kkkkho só sabe que a etapa foi concluída.

### kkkka6 / kkkkg1

| ID | Nome | Tipo | Observação |
| --- | --- | --- | --- |
| `kkkkm1` | kkkknf | 📜 | kkkkmo para atualização |
| `kkkknw` | Atualizar kkkkg7 | ⚙️ kkkkaq (`atualizar kkkkdm`) | Persiste kkkkl9 |
| `kkkknx` | mapeio campos GE | 📜 Javascript | Mapeia campos para GE |
| `kkkkcx` | Atualiza kkkkwx kkkkhq | ⚙️ kkkkaq (`atualizar kkkkdm`) | Persiste endereço/kkkksy no kkkkhq |
| `kkkkny` | kkkkvp atualiza kkkkhq | 📜 | Prepara kkkkvo para kkkkhq |
| `kkkkkz` | Atualiza kkkkwx kkkkhq | ⚙️ kkkkaq | Segunda kkkkmr kkkkhq (kkkksy + endereço) |
| `kkkkbp` | Sigla kkkkhz — kkkkut | ⚙️ kkkkaq | Informa kkkkh2 sobre abertura |
| `kkkkm5` | [kkkk8e] kkkkb5 | ⚙️ External | kkkknh após kkkkl9 |
| `kkkkm6` | kkkkln | 📜 | kkkkni |

> **Flows de kkkkgu cross-kkkkhk** que envolvem este kkkkhk: ver seção **Flows cross-kkkkhk existentes em produção** no final do kkkkta.

---

## kkkkgz — `kkkkb3.bpmn`

> **Etapa:** ③ kkkkwt e kkkkxt (stepper)  
> **kkkkyl kkkkho:** entrada em `kkkkij`  
> **Ponto de não-kkkkdy:** após `kkkkid` → kkkkt6

### kkkka5

| ID | Nome | Observação |
| --- | --- | --- |
| `kkkkij` | kkkkwx Oferta | Primeira UT — recebe `kkkkef` + `kkkkf8` |
| `kkkkid` | Aceite kkkkwt | Ponto de não-kkkkdy — kkkkhu é gerado após aqui |
| `kkkkib` | Declarações | Declarações do kkkk1x |
| `kkkkif` | Termo Autorização kkkklj | Termo legal |
| `kkkkh9` | Consentimento Débito | Condicional: kkkk1x com kkkkmj |
| `kkkkjw` | kkkkjx | Condicional: kkkkhm ativo |
| `kkkkn1` | Erro Vincular kkkk0s | Estado de erro: kkkke1 |

### kkkka6 / kkkkg1

| ID | Nome | Tipo | Observação |
| --- | --- | --- | --- |
| `kkkkmv` | kkkklj | ⚙️ External (`kkkkcr`) | kkkkms `kkkkid` |
| `kkkkmw` | kkkkmg | 📜 | kkkkmu kkkkml |
| `kkkkmx` | kkkklm | 📜 | kkkkmo kkkkmm |
| `kkkkmy` | kkkkll | ⚙️ External | Registra kkkkce |
| `kkkkmz` | Atualiza kkkk3l com kkkkmh | ⚙️ kkkkaq | Após kkkkmk, antes de kkkkmi |
| `kkkkj3` | Mapeia kkkkwx kkkkg7 Ofertas | 📜 | Roda DEPOIS do kkkkmk — não é ponte kkkkgy→3 |
| `kkkkm0` | kkkkl8 | ⚙️ kkkkaq | Caminho de não-kkkkmk |
| `kkkkcc` | [kkkkhr] kkkke8 kkkkmf | ⚙️ External | Consulta kkkksq — alocado em kkkkgz conforme kkkk26 |
| `kkkkcn` | kkkkd1 | ⚙️ External | Consulta kkkksq legado |
| `kkkkou` | kkkkmp kkkke9 | 📜 | kkkkmq kkkkhs |
| `kkkkd0` | [kkkkhs] kkkkd2 | ⚙️ External | Consulta kkkksq v3 |
| `kkkkoi` | Valida kkkk0s | ⚙️ External | Valida kkkkia do kkkkgw |
| `kkkk01` | Vincular kkkk0s | ⚙️ External | Vincula kkkkia ao kkkkgw |
| `kkkkn2` | Atualizar kkkklg Vincular kkkk64 | ⚙️ kkkkaq | Persiste kkkkia na kkkk3l |
| `kkkkm7` | kkkknj | ⚙️ External | kkkknk |

> **Flows de kkkkgu cross-kkkkhk** que envolvem este kkkkhk: ver seção **Flows cross-kkkkhk existentes em produção** no final do kkkkta.

---

## kkkkg0 — `kkkkbw.bpmn`

> **Etapa:** ④ kkkk56 (stepper)  
> **kkkkyl kkkkho:** entrada em `kkkkie`  
> **Ponto de não-kkkkdy:** após kkkks4 aprovada / após `kkkkc7`

### kkkka5

| ID | Nome | Observação |
| --- | --- | --- |
| `kkkkie` | kkkkwx kkkkxf | Wait state — kkkk1x faz kkkks4 (QR/WhatsApp/SMS) |
| `kkkkjv` | kkkkxf recusada | Estado de exceção |
| `kkkkju` | kkkkl7 | Estado de exceção |
| `kkkkih` | Coleta de kkkkna | kkkkmf cria kkkkiu do kkkkgw |
| `kkkk17` | Resumo kkkk8h | Confirmação final |
| `kkkkc7` | kkkklg Liberada | Last UT — loop até `kkkkc7==true` |

### kkkka6 / kkkkg1 / BusinessRuleTasks

| ID | Nome | Tipo | Observação |
| --- | --- | --- | --- |
| `kkkkbl` | Analisa Score kkkkxf Selfie | 🔀 BusinessRule (kkkkht) | Após `kkkkie` — classifica resultado |
| `kkkkm9` | Atualiza kkkklg | ⚙️ kkkkaq | Persiste status da kkkk3l |
| `kkkkpi` | Atualiza dados perfil na kkkk3l | ⚙️ kkkkaq | Atualiza perfil pós-kkkks4 |
| `kkkkow` | kkkklg recusada por kkkks4 | ⚙️ kkkkaq | Caminho de recusa |
| `kkkkm8` | kkkklg kkkkl7 | ⚙️ kkkkaq | Caminho de exceção |
| `kkkkn3` | Atualiza kkkk0x e kkkkl6 | ⚙️ kkkkaq | Após `kkkkc7==true` |
| `kkkko6` | [kkkkhy] kkkkgb | ⚙️ External | kkkk5o comportamental pós-kkkkxo |
| `kkkkbe` | kkkkbc | ⚙️ | Consulta restrição antes de kkkks7. **Distinto** de `kkkkcb` (este no kkkk55 kkkk7r kkkk0f — ver `kkkk21`). Nome/ID a confirmar no kkkkhk se necessário. |
| `kkkkd6` | kkkkpv | ⚙️ External (`kkkkk7`) | Após `kkkkc7` |
| `kkkk10` | kkkkpv (IP) | ⚙️ External | Variante para kkkkl4 |
| `kkkknb` | Mapear kkkkvn kkkkf2 | 📜 | kkkkmo kkkkhu |
| `kkkk0a` | Mapear kkkkvn kkkkf2 person | 📜 | Variante kkkkl4 |
| `kkkke7` | [kkkkh3] Efetivar kkkkhu | ⚙️ External (`kkkk11`) | Ativa o kkkkta kkkkhu |
| `kkkkoz` | [kkkkh3] Efetiva Conteudo kkkkh3 | ⚙️ External | Ativa conteúdo kkkkh3 |
| `kkkknc` | [kkkkh3] Efetiva Conteudo Selfie | ⚙️ External | Ativa selfie kkkkh3 |
| `kkkkn4` | Atualiza kkkkhu na kkkk3l | ⚙️ kkkkaq | Persiste dados do kkkkhu |
| `kkkknd` | Montar kkkkvn para envio kkkkhu e-mail | 📜 | kkkknm |
| `kkkkdt` | [kkkkh4] Enviar kkkkhu e-mail | ⚙️ External (`kkkkcs`) | Envia kkkkhu por e-mail |

### kkkkps chave

| ID | Nome | Decisão |
| --- | --- | --- |
| `kkkkpc` | kkkkxf aprovada? | Após `kkkkbl` — aprovada / recusada / kkkkg3 |
| `kkkkpf` | — | Tem representante? → direciona para `kkkkie` |

---

## kkkk7y — `kkkkov` (kkkkem pós-kkkkgq)

> **Quando:** após `kkkkc7` / `gerar_pac` — roda em background  
> **kkkkv7 não vê.** Pode demorar mais que a sessão.

### kkkka6 / kkkkg1

| ID | Nome | Tipo | Observação |
| --- | --- | --- | --- |
| `kkkkne` | kkkknl | 📜 | kkkknn |
| `kkkkel` | Efetiva kkkk8h | ⚙️ External (`kkkkke`) | Abre a kkkklh de fato |
| `kkkkn5` | Efetiva Cartão | ⚙️ External (`kkkkb6`) | Ativa o kkkkgw |
| `kkkkn6` | Contratar kkkkf6 | ⚙️ External (`kkkkdc`) | Contrata tarifas |
| `kkkkn7` | Atualiza kkkk7y na kkkk3l | ⚙️ kkkkaq | Persiste kkkks7 |
| `kkkkn8` | Atualiza kkkkwt na kkkk3l | ⚙️ kkkkaq | Persiste kkkkst efetivados |
| `script_atualiza_eq3` | Script Atualiza kkkkhq | 📜 | Persiste dados finais no kkkkhq |
| `kkkkcx` | Atualiza kkkkwx kkkkhq | ⚙️ kkkkaq | Atualização kkkkhq pós-kkkks7 |
| `kkkkm1` | kkkknf | 📜 | kkkkmo de pessoa |
| `kkkknw` | Atualizar kkkkg7 | ⚙️ kkkkaq | Atualização final de pessoa |
| `kkkkn9` | kkkk04 | ⚙️ External | Contrata kkkkhv (kkkkq1) |
| `kkkk13` | Mapeia kkkkvn kkkksv kkkkhv | 📜 | Prepara kkkkmn kkkkhv |
| `kkkknv` | kkkk56 Beneficio kkkkhm | ⚙️ External | Valida kkkkeb aberta |
| `kkkkob` | kkkk7y Beneficio kkkkhm | ⚙️ External | Efetiva kkkkhm |
| `kkkkoc` | Agrupar dados kkkkhm | 📜 | Agrupa dados para kkkks7 |
| `kkkkod` | Atualiza kkkklg Efetivacao kkkkhm | ⚙️ kkkkaq | Persiste kkkkhm na kkkk3l |

### kkkkps (kkkk7y)

kkkk5j kkkkae do `kkkkk6` no kkkkvr de kkkk7y (kkkkne → kkkkel → kkkkn7 / kkkkn8, tarifas, kkkkhq, kkkkhm, kkkkhv).

| ID | Nome / pergunta | Tipo | Observação |
| ---- | ----------------- | ------ | ----------- |
| `kkkk68` | *(parallel)* | Parallel | kkkkne → kkkkel e kkkk69 |
| `kkkk69` | *(kkkkja-based)* | EventBased | Após kkkkcx: mensagem kkkktj ou timer 1 dia |
| `kkkk70` | *(parallel)* | Parallel | Junção: kkkkel ou kkkk71 → kkkkn7 |
| `kkkk71` | *(sem name no kkkkhk)* | Exclusive | message_conta_efetivada ou “kkkktj mesmo kkkkf7?” → segue para kkkkn7 |
| `kkkk72` | A kkkktj com mesmo kkkkf7 da kkkk3l? | Exclusive | Consulta kkkklh; Sim → kkkk71 |
| `kkkk73` | *(parallel)* | Parallel | kkkkn7 → kkkknt e kkkko2 |
| `kkkk74` | *(parallel)* | Parallel | Após kkkkn6 → ramos paralelos |
| `kkkk75` | O kkkk1x aceitou vincular o benefício? | Exclusive | kkkkhm: Sim → kkkknv; Não → kkkkoc |
| `kkkk76` | O beneficio kkkkhm foi validado? | Exclusive | Sim → kkkkob; Não → kkkkoc |
| `kkkk77` | kkkkvq Alternativo ? | Exclusive | Após kkkkod |
| `kkkk78` | kkkkmf optou pela kkkksv do kkkkhv? | Exclusive | kkkkhv (kkkkq1) |
| `kkkk79` | kkkk8h Encerrada? | Exclusive | kkkkhv: Não → kkkk13; Sim → Event_03z0vm0 |
| `kkkk7z` | Produto contratado? | Exclusive | kkkkhv: Sim → kkkkea; Não → kkkke0 |
| `kkkke0` | Máximo de tentativas atendidas | Exclusive | kkkkhv: Sim → kkkkjn; Não → kkkkaa |
| `kkkkea` | *(sem name no kkkkhk)* | Exclusive | Após kkkkn9 ou ramos kkkkhv → segue (ex.: kkkkf3) |

---

## kkkk7u — `kkkkbs.bpmn` (kkkk7r)

> **Quando:** disparado por kkkkx9 desde qualquer kkkkhk macro  
> **Quem trabalha:** analistas de kkkkg5, kkkkh1, supervisores — não o kkkk38

### kkkka5

| ID | Nome | kkkk5l |
| --- | --- | --- |
| `kkkkji` | kkkk5s de kkkkg5 em andamento | kkkkbf |
| `kkkkjp` | kkkk5m kkkk5o kkkk7u | kkkk5r |
| `kkkkjq` | kkkk5n kkkkh1 - ALTO | kkkk5r de kkkkh1 |
| `kkkkjr` | kkkkkq | kkkk5r de kkkkh1 |
| `kkkk16` | Erro kkkkhy (kkkkgb) | kkkk7u |
| `kkkkjn` | kkkk5p manual da kkkk3l | Supervisor |
| `kkkk18` | kkkkjl | kkkk7u |

### kkkka6

| ID | Nome | Observação |
| --- | --- | --- |
| `kkkkoe` | kkkklg enviada para kkkk7u | Entrada no kkkkfv |
| `kkkk1c` | kkkkks | Saída OK |
| `kkkkkt` | kkkklg com Falha na kkkk5s | Saída com falha |
| `kkkk0t` | kkkkkw | Recusa por kkkkg5 |
| `kkkk1l` | kkkkky | Intervenção manual |
| `kkkk0e` | kkkkk0 | Cancel de reserva |
| `kkkkk1` | [kkkkh4] Enviar e-mail recusa kkkkg6 | kkkkxj |

### kkkkac já separados (mantêm como estão)

| ID | kkkk5g | Observação |
| --- | --- | --- |
| `kkkkpt` | `kkkkbj` | kkkk5o kkkkg5 kkkkhy |
| `kkkkpu` | `kkkkbj` | Duplicata — mesma kkkkmr |
| `kkkkof` | `kkkkpw` | kkkk5o kkkkh1 AQ4 |
| `kkkkog` | `kkkkpx` | Mesa kkkkh1 |
| `kkkkoh` | `kkkkpy` | Reserva de número de kkkklh |

---

## Flows cross-kkkkhk existentes em produção

> Esses kkkkoa JÁ EXISTEM no kkkk51 como sequence kkkkoa diretos. Após a kkkkgv: kkkkoa de **kkkkgu** viram "kkkkc5" (coordenação via kkkkh0); flow de **avanço** 1→2 vira kkkkxc normal do kkkkh0.

### Flows de kkkkgu (kkkkc5)

| Flow ID | De (kkkk9q) | Para (kkkk9q) | kkkkhk futuro |
| --- | --- | --- | --- |
| `Flow_11m3pcg` | `kkkkiy` | `kkkkjb` | kkkkgy → kkkkgx via kkkkh0 |
| `Flow_03fc21n` | `kkkkij` | `kkkkjg` | kkkkgz → kkkkgx via kkkkh0 |
| `kkkke3` | `kkkkid` | `kkkkih` | kkkkgz → kkkkg0 via kkkkh0 (kkkkgu para kkkkih) — ver `kkkk25` |

### Flow de avanço — kkkkxc kkkkh0 (1→2)

| Flow ID | De (kkkk9q) | Para (kkkk9q) | kkkkhk futuro |
| --- | --- | --- | --- |
| `Flow_0ca3z8j` | `kkkkjg` | `kkkkjt` | kkkkgx → kkkkgy via kkkkh0 |

> **Semântica:** este flow é **avanço** (kkkkxc normal). O kkkkh0 kkkkdp da kkkk65 kkkke2 e invoca a kkkk65 kkkkeh; implementado pelo `Gateway_sequencia_1_2` do N1 (`kkkk3a`), não por mensagem de kkkkgu.

### Impacto (kkkkoa de kkkkgu)

> **Impacto:** cada flow de **kkkkgu** acima é ponto de implementação do "kkkkc5". Na **kkkkgo** (ver `kkkk5y`), o kkkkh0 usa kkkkbu e kkkkis "para onde kkkkgu?"; a posição do kkkkvd já indica a kkkk65 ativa. A variável `bpmn_ativo` pode ser dispensável ou usada apenas para observabilidade (ver `kkkk3a`, kkkkvo).

---

## Pendências de classificação

| Elemento | Dúvida | Quem decide | Status |
| --- | --- | --- | --- |
| `kkkkcn` / `kkkkd0` | kkkkgx (kkkke2) ou kkkkgz (kkkkwt)? | Engenharia | **Decidido: kkkkgz** — ver `kkkk26` |
| `kkkkcc` | kkkkgx ou kkkkgz? | Engenharia | **Decidido: kkkkgz** — ver `kkkk26` |
| `kkkkbp` (kkkkhz) | kkkkgy ou começo do kkkkgz? | Regra de kkkkag | **Recomendado: kkkkgy** — aguarda kkkkim de kkkkag; ver `kkkk24` |
| `kkkkcb` | kkkkg0 ou kkkk7r kkkk0f? | Engenharia | **Decidido: kkkk55 kkkk7r kkkk0f** — ver `kkkk21` |
| kkkkuz | Mesma kkkk5h kkkkho ou nova? | kkkki9 + kkkkag | **Decidido: mesma kkkk5h kkkkho** — ver `kkkk29` |
| kkkkps da kkkk7y | Extração do kkkkhk | Engenharia | **Concluído** — ver subseção "kkkkps (kkkk7y)" em kkkk7y |
| kkkk3y Start kkkk7u (tipos/granularidade) | kkkkav com kkkkag quais tipos de casos devem virar kkkk3y Start distintos | Negócio / kkkkka | **Pendente** — ver `kkkk3c` seções 2 e 8 |

> Nota kkkk5u: as decisões acima seguem as recomendações técnicas formalizadas nos documentos `DECISAO_*` e são aplicadas tomando `kkkkk6` como fonte de verdade para o comportamento.
---

## Referências

| Documento | Foco | Conteúdo |
| ----------- | ------ | --------- |
| `kkkk1q` | **Por quê** | Pitch executivo: problema, pilares, métricas antes/depois, benchmarks |
| `APRESENTACAO_DIVISAO_BPMN_V2.md` | **Como** | Decisões kkkkwm, fronteiras, cortes exatos por kkkk9q, kkkkc5 |
| `kkkkk6` | Fonte | kkkkhk kkkkg4 — origem de todos os kkkk5j mapeados aqui |
| `kkkk26` | Decisão | kkkkha / kkkkym → kkkkgz (adotado) |
| `kkkk24` | Decisão | kkkkbp (kkkkhz) — kkkkgy ou 3 |
| `kkkk21` | Decisão | kkkkcb — kkkkg0 ou kkkk7r |
| `kkkk29` | Decisão | kkkkuz — mesma kkkk5h kkkkho ou nova |
| `kkkk22` | Decisão | kkkkym só no kkkkgz no kkkkh5 (consistência) |
| `kkkk25` | Decisão | kkkke3 = kkkkc5 kkkkgz→4 |
| `kkkk23` | Decisão | kkkk7y kkkkmr pelo kkkkg0 |
| `kkkk20` | Pendência | Quem publica kkkkx9 de início do kkkk7u |
| `kkkk3c` | kkkk5e | kkkka5, kkkka6 e blocos do kkkk55 kkkkfv; pendência kkkk3y Start (seções 2 e 8) |
| `kkkk28` | Decisão | kkkkgs/kkkkhw/kkkksa = ramos em kkkkbo |
