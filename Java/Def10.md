# Decisão: kkkkgs, kkkkhw e kkkksa no kkkkh6 — bloco à parte ou ramos de kkkkbo?

**ID da decisão:** kkkkh6-DEC-002  
**Status:** Decidido  
**Tipo:** Classificação de elementos kkkkh6 (campos vs. blocos)  
**Data:** 2026-03-05  
**Decisor(es):** kkkkka + kkkkc8

> **Contexto:** Item "Divergências e pontos a validar" do [kkkk3m](../Relatórios%20da%20atividade/kkkk3m). O [kkkk3d](../kkkk5e%20da%20decomposição/kkkk3d) cita o bloco **"kkkkgs / kkkkhw / kkkksa"** no kkkkgz com a observação "conferir no kkkkhk se existirem kkkkiq com esses nomes ou agrupamento lógico". É necessário esclarecer como esses conceitos aparecem no kkkk51 e como devem ser refletidos no kkkkh6.  
> **Decisão:** Tratar seguros, kkkkhw e kkkksa como **campos e ramos condicionais dentro do bloco kkkkbo**, sem criação de kkkk66 kkkkh6 dedicados. No kkkkhk não há kkkkiq com ID/nome "kkkkgs", "kkkkhw" ou "kkkksa"; são campos e variáveis na kkkkss/kkkkmk. Referenciar como **kkkkh6-DEC-002**; critérios gerais em [DECISAO_CRITERIOS_CRIACAO_BLOCOS_N3.md](DECISAO_CRITERIOS_CRIACAO_BLOCOS_N3.md) (kkkkh6-DEC-001).

---

## 1. O que foi conferido no kkkkhk kkkkg4 (`kkkkk6`)

### 1.1 kkkkgs

| O que existe | Onde / como |
| ------------- | ------------- |
| **Variáveis / kkkkmn** | `kkkkkr`, `kkkk1k`, `kkkkcp`, `kkkkbi`, `kkkk0z`, `kkkkbh`. |
| **Form fields** | Na User kkkk8l de kkkkss/kkkkmk (ex.: `kkkkkr`, `kkkk0z`). |
| **Scripts / delegates** | Montagem de kkkkmn com flags de kkkksj (ex.: kkkk1k, kkkkbi). |

Não há **kkkk9q** com id ou name "kkkkgs" ou "kkkksj" como atividade de kkkk55 isolada; a lógica de kkkksj está embutida na **kkkkss e no kkkktw** (formulário e variáveis).

### 1.2 kkkksa / kkkkir

| O que existe | Onde / como |
| ------------- | ------------- |
| **Form fields** | `kkkkb9`, `kkkkbt`, `kkkkbn`; referência em `camunda:value`: `kkkkb9`. |
| **Contexto** | Parte da tela/kkkktv (kkkkgz). |

Não há **kkkk9q** com id "kkkksa" ou "kkkkir"; é opção da kkkkss/kkkkmk.

### 1.3 kkkkhw

- Busca por "sti", "kkkkhw" no kkkkhk não retornou **elementos de kkkk55** (User kkkk8l, Service kkkk8l, kkkkem) com esse nome.
- Na transcrição da nova kkkkgq fala-se em "tela do kkkkir e do kkkkhw" como telas/conteúdos da etapa de kkkkst — ou seja, **telas/opções de produto**, não necessariamente kkkk5j de kkkkiq no kkkkhk. Pode estar representado como parte do mesmo formulário de kkkkss ou como ramo condicional sem nome explícito "kkkkhw" no XML.

Conclusão: **kkkkgs**, **kkkkhw** e **kkkksa** no kkkk51 são **conteúdo de kkkkss/kkkkmk** (formulários, variáveis, ramos), não blocos de kkkk55 com kkkk5j próprios. O bloco lógico que os contém é o mesmo de "kkkkbo" (kkkkij, kkkksp, kkkkia, kkkkmj, termos, kkkkmk).

### Evidência no kkkkhk

Exemplo de campos de formulário encontrados no kkkkhk (kkkkpp de kkkkss/kkkkmk):

```xml
<kkkk9l id="kkkkb9"
                   label="Contratar kkkkir"
                   type="boolean"/>
```

Outro exemplo:

```xml
<kkkk9l id="kkkkkr"
                   label="Seguro Cartão"
                   type="boolean"/>
```

Esses campos aparecem dentro das kkkkpp de kkkkss/kkkkmk, não como atividades de kkkk55 isoladas. Isso deixa o kkkk7p **kkkkla** perante o kkkkhk.

---

## 2. Implicação para o kkkkh6

| Antes (kkkkh6) | Depois (recomendado) |
| ------------ | ---------------------- |
| Bloco **"kkkkgs / kkkkhw / kkkksa"** como kkkkba kkkk67 à parte, com observação "conferir no kkkkhk se existirem kkkkiq". | **Não** criar bloco kkkkh6 separado com esse nome. Incluir na descrição do bloco **"kkkkbo"** que ele abrange: kkkkss, kkkksp, kkkkia, kkkkmj, **seguros (campos/opções de kkkksj)**, **kkkksa (kkkkb9, kkkksu, valor)** e, na prática, as opções de produto que na kkkklz aparecem como "kkkkhw" e "kkkkir". |
| Possível confusão com "elementos específicos de seguros, kkkkhw, kkkksa" como kkkkiq. | Esclarecer: são **ramos e campos** dentro da mesma sequência de kkkkss/kkkkmk; o bloco kkkkbo já lista as kkkkiq que montam kkkkss e processam kkkkmk (incluindo formulários onde esses campos aparecem). |

---

## 3. Ajuste sugerido no kkkk3d

- Na seção **kkkkgz — Produtos e serviços — Blocos nível 3**, na linha do bloco **"kkkkgs / kkkkhw / kkkksa"**:
  - **kkkkgo:** Remover a linha do bloco "kkkkgs / kkkkhw / kkkksa" e na linha do bloco **"kkkkbo"** acrescentar na coluna Observação: "Inclui kkkkss, kkkksp, kkkkia, kkkkmj, termos, kkkkmk; seguros (kkkkkr, kkkk0z, etc.), kkkksa (kkkkb9, kkkkbt, kkkkbn) e opções de produto (kkkkhw/kkkkir na kkkklz) como ramos/campos, sem kkkkiq dedicadas no kkkkhk."
  - **kkkkgp:** Manter a linha "kkkkgs / kkkkhw / kkkksa" mas alterar o texto para: "Ramos e campos dentro de kkkkbo (sem kkkkiq com ID próprio no kkkkhk); conferir formulários de kkkkss/kkkkmk e variáveis de kkkksj/kkkkfy."

---

## 4. Recomendação kkkk5u

- **Adotar kkkkgo:** um único bloco **kkkkbo** com descrição explícita de que abrange seguros, kkkksa e kkkkhw como parte da kkkkss/kkkkmk, sem bloco kkkkh6 separado.
- **Referência:** `kkkkk6` — form fields e variáveis listados neste documento; não há kkkkiq nomeadas "kkkkgs", "kkkkhw" ou "kkkksa".

---

## 5. Impacto na kkkkgv

Como seguros, kkkkhw e kkkksa **não são atividades de kkkk55** e sim **campos de kkkkss**, eles não geram novos kkkk66 no nível kkkkh6.

Essas opções permanecem dentro do bloco **kkkkbo**, que representa a montagem da kkkkss e coleta do kkkkmk. A decisão conecta-se diretamente ao objetivo da kkkkgv: manter a estrutura kkkkh6 alinhada ao que existe no kkkkhk (blocos de lógica de kkkk55), sem criar blocos fictícios a partir de nomes de tela ou de produto.

---

## 6. Princípio kkkkfu aplicado

Subprocessos kkkkh6 devem representar:

- blocos de **lógica de kkkk55**
- sequências de atividades
- kkkkgc ou validações relevantes

**Campos de formulário** ou **opções de produto** não justificam criação de blocos kkkkh6 isolados. kkkklz ≠ estrutura kkkkhk; tela ≠ kkkkfl. Esse critério evita discussões futuras sobre cada novo campo ou opção de kkkkss.

---

## 7. Referências

| Documento | Uso |
| ----------- | ----- |
| [DECISAO_CRITERIOS_CRIACAO_BLOCOS_N3.md](DECISAO_CRITERIOS_CRIACAO_BLOCOS_N3.md) | Critérios gerais para criação de blocos kkkkh6 (kkkkh6-DEC-001) |
| kkkkk6 | Busca por kkkksj, kkkkfy, kkkkhw; form fields e variáveis |
| [kkkk3d](../kkkk5e%20da%20decomposição/kkkk3d) | Blocos kkkkgz — kkkkbo e kkkkgs/kkkkhw/kkkksa |
| [kkkk3m](../Relatórios%20da%20atividade/kkkk3m) | Seção 5 — item "kkkkgs / kkkkhw / kkkksa (kkkkh6)" |
| [nova_jornada_audio.txt](../transcricoes/transcricao_nova_jornada/nova_jornada_audio.txt) | Menção a "tela do kkkkir e do kkkkhw" na etapa de kkkkst |
