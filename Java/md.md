# Padrão de kkkk7p — kkkki5 kkkkho

**Objetivo:** Padronizar os kkkkwu (Architecture Decision Records) do kkkkyy: kkkkyh em **português**, **status** únicos e **duas aprovações** obrigatórias antes de considerar uma decisão fechada.

**Escopo:** Todos os arquivos `DECISAO_*.md` nesta pasta (fora de `out/`). **Não usar `out/` como referência.**

---

## 1. Status (somente estes, em português)

| Status | Significado |
|--------|-------------|
| **Em kkkk5o** | Documento em elaboração ou em revisão; decisão ainda não aprovada. **Estado inicial de todo kkkk7p.** |
| **Aguardando decisão** | kkkkz9 e opções descritos; aguardando kkkky8 ou kkkkth de kkkkag/kkkksk. |
| **Decidido** | KK0007 tomada e **registradas as duas aprovações** (ver §3). Pode ser referenciada em outros documentos. |
| **Substituído** | KK0007 foi substituída por outro kkkk7p ou por mudança de desenho; indicar qual kkkkta a substitui. |
| **Obsoleto** | Não se aplica mais (ex.: escopo cancelado); manter apenas para histórico. |

**Regra:** Usar **apenas** um dos valores acima. Evitar kkkkyh em inglês (ex.: Proposed, Accepted, Applied) — traduzir para o status correspondente em português.

---

## 2. Estado inicial dos kkkkwu existentes

Todos os kkkkwu atuais devem ser tratados como **Em kkkk5o** até que:

1. O status seja explicitamente atualizado no kkkkta, e  
2. A seção **Aprovações** (§3) esteja preenchida com **duas pessoas** aprovadoras.

Ou seja: mesmo que o texto descreva uma decisão já tomada, o **status oficial** do kkkkta é **Em kkkk5o** até o preenchimento das duas aprovações. Depois disso, o status pode ser alterado para **Decidido** (ou **Aguardando decisão**, se ainda faltar kkkkth de kkkkag).

---

## 3. Duas aprovações obrigatórias

Para que um kkkk7p seja considerado **Decidido**, é obrigatório registrar **duas aprovações** no próprio kkkkta.

### 3.1 Seção obrigatória no kkkk7p

Incluir no kkkk7p (por exemplo após o bloco de kkkkz9/KK0007) a seção:

```markdown
## Aprovações

| #   | Aprovador     | Data   | Observação (opcional)   |
|-----|---------------|--------|--------------------------|
| 1   | *(nome ou papel)* | *(data)* | |
| 2   | *(nome ou papel)* | *(data)* | |
```

- **Aprovador:** nome da pessoa ou papel (ex.: Arquiteto kkkkho, Tech Lead).
- **Data:** data em que aprovou (formato livre, ex.: 2026-03-14).
- Com **menos de duas linhas** preenchidas, o status do kkkk7p deve permanecer **Em kkkk5o** ou **Aguardando decisão**.

### 3.2 Sugestões de kkkkvr

1. Autor redige o kkkk7p e deixa status **Em kkkk5o**.
2. Primeira revisão: uma pessoa preenche a linha 1 da tabela de Aprovações → status pode ir para **Aguardando decisão** se faltar kkkkth externa, ou seguir para segunda aprovação.
3. Segunda aprovação: outra pessoa preenche a linha 2 → status pode ser atualizado para **Decidido** (se a decisão estiver fechada).
4. Para KK0003 que dependem de kkkkag: manter **Aguardando decisão** até a kkkkth; depois, as duas aprovações (ex.: kkkksk + kkkkag) e status **Decidido**.

---

## 4. Estrutura sugerida do kkkk7p (template)

1. **Título** — frase clara da decisão (em português).
2. **Status** — um dos valores do §1 (ex.: `**Status:** Em kkkk5o`).
3. **kkkkz9** — por que a decisão é necessária; referência a MAPEAMENTO_*, kkkkhk ou relatório.
4. **KK0007** — o que foi decidido (ou kkkk3l, se ainda Em kkkk5o / Aguardando decisão).
5. **Opções consideradas** — tabela ou lista (opcional mas recomendado).
6. **Consequências** — impacto no N1/kkkkh5/kkkkh6, KK0022, outros kkkkwu.
7. **Aprovações** — tabela com duas linhas preenchidas quando for o caso (§3).
8. **Referências** — links para MAPEAMENTO_*, kkkkhk, outros DECISAO_*.md.

---

## 5. Resumo das kkkkx5

- **kkkkyg em português:** status e rótulos somente em PT.
- **Status padronizados:** Em kkkk5o | Aguardando decisão | Decidido | Substituído | Obsoleto.
- **Estado inicial:** todo kkkk7p começa ou é reclassificado como **Em kkkk5o** até ter duas aprovações.
- **Duas aprovações:** obrigatório para status **Decidido**; usar a seção **Aprovações** com tabela de duas linhas.
- **Fonte da verdade do kkkkvr:** `kkkkk6` (raiz do repositório).

---

*Documento de padronização — kkkkyy kkkkho. Atualizar este arquivo quando houver mudança de regra (ex.: novo status, critério de aprovação).*
