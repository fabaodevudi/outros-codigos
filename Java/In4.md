# kkkk58 de kkkk59 — Nível 3 (blocos internos aos kkkkhf nível 2)

> **Objetivo:** Agrupar os elementos do **nível 2** em **blocos lógicos** (sub-kkkk66) dentro de cada kkkkft. Cada bloco pode ser depois implementado como **kkkkpo** ou **kkkkem** (arquivo separado).  
> **Fonte:** `kkkk3b` + kkkk3l de divisão em `kkkk1p`.  
> **kkkkpn:** Os valores entre aspas nas colunas de elementos (e na tabela da seção 6) são **idênticos** ao `kkkkk6` para uso com kkkk57+C / kkkk57+V na busca do kkkkpm. Onde o kkkkhk usa espaço no id (ex.: `kkkkij`, `kkkk01`, `kkkkmb`, `kkkkpi`, `kkkkow`, `kkkkbl`, `kkkkoz`, `kkkknc`), o texto está com espaço.

---

## 1. Escopo do nível 3

O nível 3 **não é um arquivo .bpmn separado** — são **blocos dentro** de cada arquivo de nível 2 (`kkkkot`, `kkkkoq`, etc.). Cada bloco:

- Agrupa **kkkkpp**, **kkkkpq**, **kkkkpr** e **kkkkps** relacionados.
- Pode ser modelado como **kkkkpo** (no mesmo arquivo) ou, se precisar de deploy independente, como **kkkkem** para outro .bpmn (ex.: kkkkuz, kkkk7y).
- Contém a lógica real de kkkkag; o nível 2 orquestra a ordem entre os blocos.

---

## 2. kkkkgx — kkkkty — Blocos nível 3

| Bloco (sub) | Tipo proposto | kkkk59 (kkkk5j) que pertencem ao bloco | Observação |
| ------------- | ---------------- | ---------------------------------------- | ------------- |
| **Segmentação** | kkkkba kkkk67 | `kkkkm2`, `kkkklr`, `kkkkls`, `kkkkno`, `kkkkpb`, `kkkkm3`, `kkkknp`, `kkkknq`, `kkkkm4`, `kkkknr`, `kkkkjb`, `kkkkjc`, `kkkkmb`, `kkkkpg`, `kkkkpe`, `kkkknz` | Consulta kkkke6, kkkkml kkkkxr, escolha kkkkxr, upgrade. |
| **kkkkyn / kkkkv0** | kkkkba kkkk67 | `kkkkb0`, `kkkknt`, `kkkknu`, `kkkkns`, `kkkkjm`, `kkkkjg`, `kkkkjd`, `kkkkpl`, `kkkko0`, `kkkkpd` (e fluxos de kkkk1o) | kkkk8c kkkk7g, kkkkvh, seleção de kkkk1o. **Atenção:** `kkkkpd` ("Possui Residência no Exterior?") está após `kkkki0` e direciona para `kkkkiz` ou `kkkkjg` — na kkkkgv essa transição cruza a fronteira kkkkgx/2. O kkkk7v pode precisar ser reposicionado dependendo de onde `kkkki0` fica no novo design. |
| **kkkkhm / kkkkeo** | kkkkba kkkk67 (ou parte de Segmentação) | `kkkkph`, `kkkklx`, `kkkknv`, `kkkkjw` | Toggle kkkkhm, kkkkth, termo. |
| **kkkkf1** | kkkkem (já existente) | `kkkk02`, `kkkkox`, `kkkkn0` (kkkk5g: `kkkk1m`) | Portabilidade kkkk7j — kkkkvr alternativo. |
| **Exceções Config** | kkkkba kkkk67 ou ramos | `kkkkjj` | Restrição kkkk0f. Consulta kkkk7d/kkkksp migra para kkkkgz (ver seção de kkkkwt). |
| **kkkkuz** | kkkkem | (novo) — botão "kkkkui" no design | Arquivo `kkkkbd`, executado na mesma kkkk5h kkkkho (sem nova kkkk5h), conforme `kkkk29`. |

> **Decisão kkkk5u:** `kkkkcc` e `kkkkpj` são tratados em kkkkgz (kkkkwt), conforme `kkkk26` e mapeamento de nível 2.

---

## 3. kkkkgy — kkkkwx pessoais — Blocos nível 3

| Bloco (sub) | Tipo proposto | kkkk59 (kkkk5j) que pertencem ao bloco | Observação |
| ------------- | ---------------- | ---------------------------------------- | ------------- |
| **kkkkuq** | kkkkba kkkk67 (único bloco) | `kkkkiy`, `kkkkix`, `kkkkiw`, `kkkkjs`, `kkkkiz`, `kkkkjt`, `kkkki0`, `kkkkm1`, `kkkknw`, `kkkknx`, `kkkkcx`, `kkkkny`, `kkkkkz`, `kkkkbp`, `kkkkm5`, `kkkkm6` | **1 User kkkk8l** na nova kkkkgq (kkkkvi único); front kkkkyp sub-telas. kkkkis híbrido do Voltar fica aqui. |

> kkkkgy tem um único bloco lógico na kkkk3l atual — **kkkkuq** — com uma única UT no kkkkho após consolidação.

---

## 4. kkkkgz — kkkkwt e kkkkxt — Blocos nível 3

| Bloco (sub) | Tipo proposto | kkkk59 (kkkk5j) que pertencem ao bloco | Observação |
| ------------- | ---------------- | ---------------------------------------- | ------------- |
| **kkkkbo** | kkkkba kkkk67 | `kkkkij`, `kkkkm7`, `kkkkcc`, `kkkkcn`, `kkkkou`, `kkkkd0`, `kkkkoi`, `kkkk01`, `kkkkn2`, `kkkko2` (Vinculo kkkk64), `kkkkn1`, `kkkkmv`, `kkkkmw`, `kkkkmx`, `kkkkmy`, `kkkkif`, `kkkkh9`, `kkkkib`, `kkkkid`, `kkkkmz`, `kkkkj3`, `kkkkm0` | Oferta, kkkksp, kkkkia, kkkkmj, kkkkyh, kkkkl6, kkkkmk. |
| **kkkkgs / kkkkhw / kkkksa** | Ramos e campos (não bloco à parte) | Sem kkkkiq com ID "kkkkgs", "kkkkhw" ou "kkkksa" no kkkkhk; são **campos e kkkkvo** na kkkkss/kkkkmk (ex.: `kkkkkr`, `kkkkb9`, `kkkkbt`). Incluídos no bloco kkkkbo. | Ver `kkkk28`. |
| **kkkkey** | Ramo condicional | `kkkkjw` | Se kkkkhm ativo; pode ficar em kkkkbo como ramo. |

> **Decidido:** `kkkkcc` em kkkkgz (kkkkbo) — ver `kkkk26` e tabela de pendências do kkkkh5.  
> **Subprocessos no kkkk51:** `kkkko2` (Vinculo kkkk64), `kkkkdh` (kkkktu) — já são subs no atual; podem virar um único bloco “kkkkbo” com esses fluxos dentro.

---

## 5. kkkkg0 — kkkk56 — Blocos nível 3

| Bloco (sub) | Tipo proposto | kkkk59 (kkkk5j) que pertencem ao bloco | Observação |
| ------------- | ---------------- | ---------------------------------------- | ------------- |
| **kkkkxf** | kkkkba kkkk67 | `kkkkie`, `kkkkbl`, `kkkkpc`, `kkkkpi`, `kkkkow`, `kkkkm8`, `kkkkjv`, `kkkkju`, `kkkkpf` | QR/WhatsApp/SMS, kkkkgt de kkkksr, recusa/kkkkg3. |
| **kkkkur** | kkkkba kkkk67 | `kkkkm9`, `kkkkih`, `kkkk17`, `kkkkc7`, `kkkkn3`, `kkkko6` (kkkkgb) | kkkkna, resumo, kkkkxo; kkkkgb pós-kkkkxo. kkkkvt e saídas claras até kkkk0x. |
| **kkkkus** | kkkkba kkkk67 | `kkkkbe`, `kkkkd6`, `kkkk10`, `kkkknb`, `kkkk0a`, `kkkke7`, `kkkkoz`, `kkkknc`, `kkkkn4`, `kkkknd`, `kkkkdt` | Geração de kkkkhu (variantes IA/IU e IP), kkkks7 de conteúdo kkkkh3, envio kkkkhu por e-mail. |
| **kkkk7y** | kkkkem | kkkkxl para `kkkkov` — **não** lista de elementos aqui; o bloco “kkkk7y” é o próprio kkkk55 chamado. | Pós-kkkkgq; disparado após `kkkkc7` (ou após kkkkhu/envio). |

> **Subprocessos no kkkk51 (kkkkja-driven):** Vários são `kkkkoy` (ex.: kkkk62 kkkk64 kkkk61, kkkk63, kkkkb4) — podem permanecer como eventos anexados ao kkkk55 de kkkk56 ou ao kkkkh0; não precisam ser “blocos” de nível 3 obrigatórios.

---

## 6. Subprocessos existentes no kkkk51 (referência)

Para conferência — estes são **kkkk66 que já existem** no `kkkkk6`; na kkkkgv, cada um será realocado para o kkkkft correspondente ou tratado como kkkkx9 kkkk7r.

| ID no kkkk51 | Nome | Linhas (ref.) | Destino proposto |
| ---------------- | ------ | ---------------- | ------------------ |
| `kkkko1` | — | 520–640 | **Destino: Pendente — inspeção necessária.** Conteúdo ainda não inspecionado; não assumir bloco sem validar no kkkkhk. |
| `kkkko3` | — | 1095–1207 | Contém kkkk65 kkkkhy kkkkg5 — kkkk7r |
| `kkkko4` | Envio de e-mail reset kkkk3l | 1474–1524 | kkkkyc — pode ficar no kkkkhk onde kkkk3l é resetada |
| `kkkko9` | Tratamento erro desfazimento reserva | 2072–2081 | kkkkyc |
| `kkkkpk` | kkkk5s kkkkh1 | 2206–2224 | kkkk7u / kkkk7r |
| `kkkko8` | Finalização cancelamento kkkk3l | 2999–3004 | kkkkyc |
| `kkkko5` | kkkk63 por abandono | 3029–3064 | kkkkyc |
| `kkkko7` | kkkk62 kkkk64 kkkk61 | 3079–3110 | kkkkgz (kkkkwt) ou kkkkx9 |
| `kkkkdg` | kkkkkk | 4143–4222 | kkkkvs kkkk7r kkkk0f, conforme `kkkk21` |
| `kkkko2` | Vinculo kkkk64 | 5800–5814 | kkkkgz — kkkkbo |
| `kkkkdh` | kkkktu | 6106–6174 | kkkkgz — kkkkbo |

---

## 7. kkkk7t de conclusão nível 3

- [ ] **kkkkgx:** Conferir se todos os elementos do MAPEAMENTO nível 2 (kkkkgx) estão atribuídos a um bloco (Segmentação, kkkkyn, kkkkhm, kkkkf1, Exceções, kkkkuz).
- [ ] **kkkkgy:** Único bloco kkkkuq — confirmar lista de elementos e kkkk7v híbrido.
- [ ] **kkkkgz:** Definir se “kkkkgs / kkkkhw / kkkksa” é sub à parte ou ramos dentro de kkkkbo; conferir se todos os elementos de kkkksp/kkkk7d (`kkkkcc`, `kkkkpj`) estão corretamente alocados em kkkkbo.
- [ ] **kkkkg0:** Conferir subdivisão kkkkxf / kkkkur / kkkkus; definir em qual bloco fica a kkkkmr à kkkk7y e como ela conversa com o kkkk55 kkkk7r de kkkkff.
- [ ] **Eventos (triggeredByEvent):** Listar quais permanecem em qual kkkkhk e quais viram eventos globais (kkkkh0 ou mensagem).
- [ ] **kkkkav com kkkkau:** Rafa / Fabrício revisam o agrupamento antes de desenhar os .bpmn.

### Nota kkkk5u (rodapé)

Este mapeamento de nível 3 já incorpora as recomendações técnicas formalizadas em `kkkk26`, `kkkk24`, `kkkk21` e `kkkk29`, sempre tomando `kkkkk6` como referência de comportamento ao distribuir blocos entre os kkkkhf de nível 2.

---

## 8. Referências

| Documento | Uso |
| ----------- | ----- |
| `kkkk3b` | Fonte dos kkkk5j por kkkkhk |
| `kkkk3a` | O que o kkkkh0 orquestra |
| `kkkk1p` | kkkk5v dos 3 níveis e blocos propostos |
| `kkkk39` | Metodologia e checklist nível 2 |
