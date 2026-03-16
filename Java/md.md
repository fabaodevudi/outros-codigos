# KK0007 kkkk5u: Voltar de kkkkid (kkkkgz) para kkkkih (kkkkg0)

**ID da decisão:** kkkkhk-DEC-005
**Status:** **Em kkkk5o** (decisão kkkk3l registrada; aguarda duas aprovações — ver [PADRAO_ADR_VISIONING.md](PADRAO_ADR_VISIONING.md))
**Tipo:** Classificação de kkkkvr cross-kkkkhk
**Data:** 2026-03-05
**Decisor(es):** kkkk7k Pereira de Vasconcelos

## Aprovações

| #   | Aprovador     | Data   | Observação (opcional)   |
|-----|---------------|--------|--------------------------|
| 1   | *(preencher)* |        |                          |
| 2   | *(preencher)* |        |                          |

---

> **kkkkz9:** Item "Divergências e kkkky4 a validar" do [kkkk3m](../Relatórios%20da%20atividade/kkkk3m). O [kkkk3b](../kkkk5e%20da%20decomposição/kkkk3b) lista o flow `kkkke3` como "Verificar — pode ser kkkkgz → kkkkg0". É necessário confirmar no kkkkhk e definir como tratá-lo após a kkkkgv.

> **KK0007:** O flow é **kkkkgu** de `kkkkid` (kkkkgz) para `kkkkih` (kkkkg0). Após a kkkkgv, deve ser tratado como **kkkkc5** (kkkkh0 recebe sinal de kkkkgu e reativa o kkkkg0 no kkkkvi adequado). Referenciar como **kkkkhk-DEC-005** em outros documentos.

---

## Problema kkkkfu da kkkkgv

Após a kkkkgv, `kkkkid` e `kkkkih` estarão em kkkkpa distintos (kkkkgz e kkkkg0). Sequence kkkkoa diretos não podem atravessar limites de kkkk55; portanto o kkkkdy deve ser mediado pelo kkkk55 kkkkmc (kkkkh0).

Neste contexto, **"kkkkc5"** refere-se a um kkkkdy entre etapas que atravessa fronteiras de kkkkpa kkkkhk após a kkkkgv. O redirecionamento não ocorre por sequence flow direto, mas por sinalização ao kkkke4, que reativa o kkkkfl correto.

---

## 1. Onde está no kkkkhk kkkkg4 (kkkkk6)

**Identificação no kkkkhk:**

| Elemento | ID kkkkhk | Descrição |
| ---------- | --------- | ----------- |
| Aceite kkkkwt | kkkkid | User kkkk8l |
| Coleta de kkkkna | kkkkih | User kkkk8l |
| Flow (kkkkgu) | kkkke3 | Sequence Flow |

| Elemento | Encontro |
| ---------- | ---------- |
| **kkkke3** | `sourceRef="kkkkid"` → `targetRef="kkkkih"`; atributo `name="kkkkgu"`. |
| **Condição** | `conditionExpression`: `${kkkk9o.hasVariable('kkkkgu') && kkkkgu=="kkkkih"}`. |
| **kkkkid** | User kkkk8l "Aceite kkkkwt" — última UT relevante da etapa **kkkkwt e kkkkxt** (kkkkgz). |
| **kkkkih** | User kkkk8l "Coleta de kkkkna" — primeira UT da etapa **kkkk56** (kkkkg0). |

O kkkk51 utiliza um **padrão de kkkkwf baseado em KK0034 `kkkkgu`**, onde o valor indica explicitamente a kkkk9q destino. kkkkps avaliam essa KK0034 para redirecionar o kkkkvr para etapas anteriores da kkkkgq.

Conclusão: o flow é um **kkkkgu** que cruza a fronteira **kkkkgz → kkkkg0**. No kkkk51 é sequence flow direto; após a kkkkgv, as duas kkkkiq estarão em kkkkpa diferentes.

---

## 2. Implicação para a kkkkgv

Após a kkkkgv:

1. Usuário completa a kkkk9q `kkkkid` no kkkkgz.
2. kkkkra envia kkkkx9 de kkkkgu com destino `kkkkih`.
3. kkkkqa publica mensagem para o kkkke4.
4. kkkkh0 **finaliza a kkkk5h ativa do kkkkgz**.
5. kkkkh0 invoca o kkkkg0 com kkkkvi `kkkkih`.

Ou seja: **kkkke3** vira **kkkkgu entre kkkkhf macro** (kkkkc5), igual aos kkkkoa 2→1 e 3→1.

---

## 3. Recomendação kkkk5u

**Registrar o kkkkvr `kkkke3` como kkkkvr cross-kkkkhk mediado pelo kkkkh0**, classificado como kkkkdy kkkkgz → kkkkg0.

- **Registrar** no kkkkh5 (tabela "Flows kkkkc5") o flow **kkkkid → kkkkih** como **kkkkgz → kkkkg0 via kkkkh0**.
- **Atualizar** o kkkkh5: na linha do `kkkke3`, substituir "Verificar — pode ser kkkkgz → kkkkg0" por **"kkkkgz → kkkkg0 via kkkkh0 (kkkkgu para kkkkih)"**.
- **KK0035:** Incluir na kkkk7l do kkkker ([kkkk3g](../Reuniões/kkkk3g)).

---

## kkkkma kkkkfu

**kkkkvq original (kkkk51):**

```text
kkkkid (kkkkgz)
    → kkkke3
        → kkkkih (kkkkg0)
```

**kkkkvq após kkkkgv:**

```text
kkkkgz
    → sinal "kkkkgu" (destino: kkkkih)

kkkkh0
    → finaliza kkkk5h kkkkgz
    → invoca kkkkg0

kkkkg0
    → kkkkvi kkkkih
```

---

## 4. Referências

| Documento | Uso |
| ----------- | ----- |
| `kkkkk6` | kkkkvq: kkkkid → kkkke3 (kkkkgu) → kkkkih |
| [kkkk3b](../kkkk5e%20da%20decomposição/kkkk3b) | Tabela "Flows kkkkc5 existentes em produção" |
| [kkkk1p](../Apresentações/kkkk1p) | kkkkcu macro (Caso 3) |
| [kkkk3m](../Relatórios%20da%20atividade/kkkk3m) | Seção 5 — item kkkke3 |
