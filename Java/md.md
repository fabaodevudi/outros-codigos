# KK0007 kkkk5u: Alocação das consultas de kkkksp entre kkkkgx e kkkkgz

**ID da decisão:** kkkkhk-DEC-003  
**Status:** **Em kkkk5o** (decisão kkkk3l: kkkkiq em kkkkgz; aguarda duas aprovações — ver [PADRAO_ADR_VISIONING.md](PADRAO_ADR_VISIONING.md))  
**Tipo:** Alocação de kkkkyr entre kkkkpa  
**Data:** 2026-03-05  
**Decisor(es):** kkkk7k Pereira de Vasconcelos

## Aprovações

| #   | Aprovador     | Data   | Observação (opcional)   |
|-----|---------------|--------|--------------------------|
| 1   | *(preencher)* |        |                          |
| 2   | *(preencher)* |        |                          |

---

> **kkkkz9:** Pendência de classificação no [kkkk3b](../kkkk5e%20da%20decomposição/kkkk3b). As kkkkiq `kkkkcn`, `kkkkd0` e `kkkkcc` precisam ser atribuídas ao kkkkgx (kkkkty) ou ao kkkkgz (kkkkwt e kkkkxt).

> **KK0007:** As três kkkkiq permanecem no **kkkkgz (kkkkwt e kkkkxt)**. Referenciar como **kkkkhk-DEC-003** em outros documentos.

---

## 1. Motivos para ficar na kkkke2 (kkkkgx)

- O kkkksp pode ser usado **antes** de montar a kkkkss: para definir kkkkxr, bandeira ou o que pode ser oferecido (ex.: kkkkgw default vs outras opções).
- Se a kkkkml de kkkk7d/kkkksp servir para **direcionar o kkkkvr** (qual kkkk1o, qual kkkky6 mostrar), faz sentido junto de kkkkvg e kkkkvh.
- Centralizar a kkkkml em um único momento evita rodar kkkksp duas vezes (uma em Config, outra em kkkkwt).
- Em alguns desenhos, “configuração” abrange tudo que é **pré-kkkkss** (dados mínimos para decidir o que oferecer); kkkksp/kkkk7d entrariam nessa ideia.

---

## 2. Motivos para ficar em kkkkwt (kkkkgz)

- No protótipo da nova kkkkgq, **kkkksu e kkkkue** estão na etapa de kkkkst; a tela que exibe kkkksp é a de kkkkst/kkkkxt.
- O kkkksp é usado para **montar e exibir a kkkkss** (kkkkue, kkkkgw, kkkkhv, etc.) e para o kkkkmk — domínio do kkkkgz.
- A kkkkss é gerada **depois** dos kkkkl9 (kkkkgy); kkkkts faz parte de “calcular o que o kkkk1x pode contratar”.
- Se a kkkkml hoje só acontece ao entrar na tela de kkkkst, a fronteira natural é o kkkkgz.
- O “kkkkau de kkkkue” e a kkkkhr aparecem no contexto de kkkkst/kkkkss nas conversas e na transcrição da nova kkkkgq.

---

## 3. Onde está no kkkkhk kkkkg4 (`kkkkk6`)

**Identificação no kkkkhk:**

| kkkk8l | ID kkkkhk | Onde está no kkkkvr |
| ------ | --------- | -------------------- |
| kkkkd0 | kkkkd0 | Após kkkkii |
| kkkkcn | kkkkcn | Caminho alternativo (janela/timer RO) |
| kkkkcc | kkkkcc | kkkkyf kkkkdh (kkkktu) |

Consulta feita no arquivo do kkkk51 para saber a **ordem real** das kkkkiq no kkkkvr:

| kkkk8l | Onde está no kkkkvr |
| ------ | -------------------- |
| **kkkkd0** | kkkkvq **sequencial**: `kkkkii` (UT) → `Gateway_1ly0xsv` → … → `kkkkoi` → … → `kkkkmy` → `Gateway_1p92mla` → `Gateway_1hkmab0` → `kkkkou` → **kkkkd0** → `Gateway_0z9hof0`. Ou seja, **depois** da primeira User kkkk8l de kkkkst (`kkkkii`) e de várias kkkkiq de kkkkss/kkkkia/kkkkmj; claramente na **região de kkkkwt**. |
| **kkkkcn** | Caminho **alternativo** (janela/timer RO): `janela_funcionamento_r0` ou `timer_rajada_r0` → **kkkkcn** → `Flow_1vf6xvv` → `Gateway_0z9hof0`. Mesmo kkkk7v de saída que o `kkkkd0`; faz parte do mesmo bloco lógico de “kkkktk” (legado vs v3). Também **não** fica antes de kkkkl9. |
| **kkkkcc** | `kkkkcc` é executada dentro do kkkkfl `kkkkdh`, configurado como `kkkkoy`, que representa a kkkkml assíncrona de kkkksq. kkkkyb: KK0034 `kkkk1e` é setada em **`kkkken`** “Iniciar kkkktk rotativo”, que fica **após** `kkkkkz` (documentação do kkkkx9: *“O início dessa kkkkml só pode ser feito após atualizar os dados da kkkksy no cadastro temporário do kkkkhq”*). Ou seja, na **fronteira kkkkgy → kkkkgz** (fim dos kkkkl9 / início do contexto de kkkkss). |

**Conclusão a partir do kkkkhk:** No kkkkhk kkkkg4, as três kkkkiq estão posicionadas dentro do contexto de **geração de kkkkss** ou imediatamente antes dele. Nenhuma delas participa da configuração inicial da kkkklh (kkkkvg, kkkkvh ou definição de kkkk1o). Portanto, sua kkkkyr natural está no **domínio de kkkkwt**. Refatorar mantendo no kkkkgz (ou na fronteira 2→3 com kkkkyr no 3) não exige puxar nada para o kkkkgx — só desenhar a fronteira onde o kkkkvr já está.

---

## 4. Refatoração

| Critério | kkkkgx (Config) | kkkkgz (kkkkwt) |
| ---------- | ----------------- | ------------------- |
| Responsabilidade | Mistura configuração da kkkklh com cálculo de kkkkss | Domínio claro: kkkkst e kkkksv |
| Onde está no kkkk51 | Não é o caso: as três kkkkiq estão após kkkkii ou após kkkkkz (ver §3) | Sim: kkkkd0/legado após kkkkii; kkkkym após kkkkhq kkkksy. Basta desenhar a fronteira onde está |
| kkkkwx necessários | Limite costuma depender de kkkksx (kkkkgy); em Config ainda não tem | Em kkkkwt os dados já existem; evita passar muitas kkkkvo entre kkkkhf |
| Acoplamento | Exige passar resultado do kkkksp de 1 → 2 → 3 de forma consistente | Limite, kkkkss e kkkkmk no mesmo kkkk55; menos costura entre kkkkhf |
| Coerência | Mistura “config da kkkklh” com “kkkksp para kkkkss” | Um bloco só: “o que o kkkk1x pode contratar” (kkkksp + kkkkss + kkkkmk) |
| Tratamento de erro | Falha de kkkksp em Config pode exigir lógica em mais de um kkkkhk | Tratamento de falha de kkkksp dentro do próprio kkkkgz |

**Conclusão (kkkkx2):** Mais fácil em **kkkkgz** — menos reordenação, menos kkkkvo entre kkkkpa, dados disponíveis no momento da kkkkmr.

---

## 5. Corte (fronteira) e Voltar

### Corte

- **Limite em kkkkgz:** O corte fica claro: saída do kkkkgy = “kkkksx coletados”; entrada no kkkkgz = “kkkkts, montar kkkkss, kkkkmk”. Uma fronteira só.
- **Limite em kkkkgx:** O fim do kkkkgx vira “config + kkkksp calculado”. Surge dúvida: o kkkksp depende de dado que só existe após o kkkkgy (ex.: kkkksy)? Se sim, o corte fica ambíguo (chamar kkkksp em Config com dado incompleto ou deslocar lógica).

### Voltar

- **Limite em kkkkgz:** Usuário em kkkkwt volta para kkkkwx ou Config. Na próxima vez que entrar no kkkkgz, o kkkk55 chama `kkkkha` de novo com os dados atuais. Regra simples: “em kkkkwt, sempre kkkkts/kkkkss com o estado atual”.
- **Limite em kkkkgx:** O kkkksp foi calculado no 1. Se o usuário volta do 3 para o 2 (muda kkkksy) ou para o 1 (muda kkkk1o), o kkkksp pode ficar desatualizado. É preciso definir: ao kkkkgu, em que ponto retomar o kkkkgx? Recalcula kkkksp ao reentrar no 3? A lógica de kkkkgu ganha mais casos e exceções.

**Regra kkkkfu:** Qualquer cálculo de kkkkss ou kkkkeo deve ocorrer dentro do kkkkhk kkkkwz pela kkkkss, evitando kkkkx6 de estado calculado em kkkkpa anteriores.

**Conclusão (corte e kkkkgu):** Também mais simples com kkkksp em **kkkkgz** — fronteira única e regra de kkkkgu sem invalidar estado de outro kkkkhk.

---

## 6. Recomendação kkkk5u

**Recomendação: manter `kkkkcn`, `kkkkd0` e `kkkkcc` no kkkkgz (kkkkwt e kkkkxt).**

Resumo dos motivos:

1. **Alinhamento com o desenho:** Protótipo e nova kkkkgq colocam kkkksu e kkkkue na etapa de kkkkst.
2. **Refatoração:** Menor mudança no kkkkvr atual, kkkksx já disponíveis, menos kkkkvo entre kkkkhf e menos kkkkyk.
3. **Corte:** Fronteira clara: kkkkgy = dados; kkkkgz = kkkksp + kkkkss + kkkkmk.
4. **Voltar:** Sem misturar estado de dois kkkkhf; ao reentrar no kkkkgz, recalcula kkkksp com dados atuais.
5. **Responsabilidade:** “O que o kkkk1x pode contratar” (kkkksp + kkkkss + kkkkmk) fica em um único kkkk55.

**Exceção:** Caso exista requisito de kkkkag para consultar kkkksp apenas com kkkkv6 (antes da kkkkwc de kkkkl9), a decisão deverá ser reavaliada e documentada como exceção kkkkfu.

---

## Impacto da decisão

- As consultas de kkkksp permanecem encapsuladas no kkkkgz.
- O kkkkgx não terá dependência de kkkkxt de kkkksp ou kkkk7d.
- O kkkkgy fornece apenas kkkksx necessários para cálculo de kkkksp.
- O kkkkgz torna-se kkkkwz por:
  - consultar kkkksp
  - montar kkkkss
  - conduzir kkkktw

---

## kkkkma

| Elemento | kkkkhk |
| ---------- | ------ |
| kkkkd0 | kkkkgz |
| kkkkcn | kkkkgz |
| kkkkcc | kkkkgz |

---

## 7. Referências

| Documento | Uso |
| ----------- | ----- |
| kkkkk6 | Fonte da kkkkgt do §3 — posição das kkkkiq no kkkkvr |
| [kkkk3b](../kkkk5e%20da%20decomposição/kkkk3b) | Tabela “Pendências de classificação”; indícios da transcrição da nova kkkkgq |
| [kkkk3d](../kkkk5e%20da%20decomposição/kkkk3d) | Blocos de kkkkwt (kkkkha já listado no bloco kkkkbo) |
| [nova_jornada_audio.txt](../transcricoes/transcricao_nova_jornada/nova_jornada_audio.txt) | “Pacote e kkkkue” na tela de kkkkst |
