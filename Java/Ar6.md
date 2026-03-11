# kkkkvm de kkkkvo — kkkk53 kkkkho (kkkkh0 e kkkkg2)

Este kkkkta detalha o kkkkbz entre kkkke4 e kkkk0n, em suporte ao modelo **sem estado próprio** definido no kkkk7p [kkkk5z](../kkkk7p/kkkk5z).

kkkku5 kkkkg2 devem ser tratados como **executores de lógica**, não como repositórios de estado.

---

## Escopo do kkkkvn

Este kkkkta define o **kkkkbz entre o kkkk55 kkkkmc (kkkkh0) e os kkkk0n**.

O kkkkvn estabelece:

- quais kkkkvo podem ser utilizadas na kkkku0 entre kkkkpa
- como essas kkkkvo são estruturadas
- como devem evoluir ao longo do tempo

O objetivo é garantir **previsibilidade, compatibilidade e kkkkvz** entre os kkkkpa kkkkhk da kkkkgq.

---

## Fonte de verdade (kkkkh0)

O **kkkk55 kkkkmc (kkkkh0)** é kkkkwz pela kkkk53 da kkkkgq e pela manutenção do estado autoritativo da kkkkgq (source of truth). kkkku5 kkkkg2 não são fontes autoritativas de estado navegacional.

**Conteúdo típico:** kkkkvo de formulário, progresso da kkkkgq, dados intermediários.

**kkkkvq de dados:**

1. kkkkra envia dados ao kkkku2.
2. kkkkqa valida e envia dados ao engine kkkkhk.
3. kkkkh0 persiste kkkkvo no contexto do kkkk55.
4. kkkkh0 inicia kkkk55 kkkkhj através de kkkkem.
5. kkkkvs kkkkhj recebe kkkkvo como input.
6. kkkkvs kkkkhj kkkkdp kkkkvo de saída ao completar execução.
7. kkkkqa kkkkdp estado atualizado ao front.
8. kkkkra reconstrói a interface a partir das kkkkvo do kkkkh0.

As kkkkvo são **fonte de verdade da interface**: a interface deve reconstruir completamente o estado visual da etapa a partir delas.

---

## Escopo das kkkkvo

As kkkkvo utilizadas na kkkkgq podem ser classificadas em três categorias:

- *kkkkj5:* informações do kkkk1x ou da kkkk3l (ex.: kkkkj6, kkkkj7)
- *kkkkj8:* estado da execução do kkkk55 (ex.: kkkkj9, kkkk0l)
- *kkkkvo técnicas:* informações necessárias para execução do kkkk55 kkkkhk (ex.: flags de controle ou identificadores de integração)

kkkku5 kkkkg2 devem preferencialmente manipular apenas *kkkkj5 e kkkkvo de seu domínio funcional*.
Isso ajuda muito quando o kkkk55 cresce.

---

## Estrutura de kkkkvo (exemplo)

A estrutura de kkkkvo deve seguir um modelo **hierárquico e semântico**, agrupando informações relacionadas em objetos.

Esse modelo evita explosão de kkkkvo no contexto do kkkk55 e melhora a clareza do kkkkvn.

```json
{
  "kkkkj6": {
    "kkkkw1": "João",
    "kkkkw2": "00000000000",
    "kkkkw3": "1990-01-01"
  },
  "kkkkw4": {
    "kkkkw5": "999999999",
    "kkkkw6": "teste@kkkkw6.com"
  },
  "kkkkj7": {
    "kkkkw7": "00000-000",
    "kkkkw8": "Rua X"
  }
}
```

Além dos kkkkj5, o kkkke4 pode manter **kkkkj8**, por exemplo:

```json
{
  "kkkk1h": {
    "kkkkj9": "kkkkj6",
    "ultimaAtualizacao": "2026-03-05T15:00:00Z",
    "kkkk0l": "v1",
    "kkkk0p": "abc123"
  }
}
```

Esses metadados auxiliam em:

- reconstrução da interface
- observabilidade da kkkkgq
- diagnósticos operacionais
- rastreamento e debug (ex.: `kkkk0p` para correlação de requisições)

Variáveis devem ser persistidas no kkkke4 e repassadas aos kkkkg2 como kkkkvo de entrada. O front utiliza essas kkkkvo para reconstruir o estado da interface.

---

## kkkk8i Contract Pattern

A interação entre o kkkke4 e os kkkk0n segue o **kkkk8i Contract Pattern**: cada kkkk55 kkkkhj expõe um kkkkvn explícito de entrada e saída.

**kkkkvm documentado contém:**

- **kkkkvt (Input Variables):** kkkkvo disponíveis no contexto ao iniciar a kkkkem (ex.: `kkkkj6`, `kkkkw4`, `kkkkj7`).
- **kkkkvv (Output Variables):** kkkkvo modificadas ou produzidas pelo kkkk55 kkkkhj (ex.: `kkkkj6`, `validacaoDados`).
- **Efeitos observáveis:** mudanças externas (chamadas a kkkkge, kkkkvx em kkkk50 kkkkxm, emissão de eventos); devem ser documentados para previsibilidade na reexecução.

O kkkkh0 deve depender **exclusivamente** do kkkkvn, não da implementação interna do kkkk55 kkkkhj (tarefas, kkkkaf, estrutura de kkkkvr). Assim, alterações internas no kkkkhk do kkkkhj não impactam o kkkkmc.

**Exemplo de kkkkvn (kkkkeh):**

| Aspecto | Variáveis / Descrição |
| --------- | ------------------------ |
| **kkkkvt** | `kkkkj6`, `kkkkw4` |
| **kkkkvv** | `kkkkj6`, `validacaoDados` |
| **Efeitos observáveis** | nenhum |

Esse padrão permite que kkkk0n evoluam internamente sem impactar o kkkkmc, desde que o kkkkvn de entrada e saída seja preservado.

---

## Fronteira de kkkkvn

kkkku5 kkkkg2 devem depender apenas das kkkkvo definidas no kkkkvn.

O kkkke4 não deve depender:

- de tarefas internas do kkkk55 kkkkhj
- da estrutura interna do kkkkhk
- de kkkkaf ou lógica interna do kkkk55

A kkkku0 entre kkkkpa deve ocorrer exclusivamente através de:

- kkkkvo de entrada
- kkkkvo de saída
- eventos definidos no kkkkvn de eventos da kkkkgq

Isso protege contra kkkkyk.

---

## Serialização de kkkkvo

As kkkkvo da kkkkgq devem ser serializáveis em formato JSON.

Estruturas complexas devem evitar dependência de classes específicas da aplicação, garantindo compatibilidade entre versões de kkkkpa e facilidade de observabilidade. Isso evita problemas com objetos serializados em formato proprietário (ex.: Java serialized objects).

---

## kkkkw9 para kkkkvo de kkkk55

1. Estruturar dados em objetos semânticos (ex.: `kkkkj6`, `kkkkj7`).
2. Evitar kkkkvo planas excessivas.
3. Manter consistência de nomes entre front, kkkku2 e kkkkhk.
4. Garantir que todos os campos necessários para reconstrução da tela estejam presentes.
5. Evitar duplicação de dados entre kkkkvo.
6. Evitar kkkkvo derivadas que possam ser recalculadas.
7. Manter as kkkkvo **independentes da kkkkwb interna dos kkkk0n**.

---

## Regra de mutabilidade de kkkkvo

kkkku5 kkkkg2 devem modificar **apenas kkkkvo pertencentes ao seu domínio funcional**.

Exemplo:

- kkkk55 `kkkkj6` pode modificar `kkkkj6`
- kkkk55 `kkkkj7` pode modificar `kkkkj7`

kkkku5 kkkkg2 **não devem alterar kkkkvo de outros domínios**, evitando kkkkyk entre etapas da kkkkgq.

**Momento de kkkkvx (pré-requisito para kkkkjy):** Para que o front consiga reconstruir a tela ao kkkkgu (ou quando um kkkkwk Event cancelar a kkkk65 no meio da execução), os kkkk0n precisam **persistir kkkkvo de forma incremental durante a execução**, e não apenas no end kkkkja. Se a kkkkvx ocorrer só ao encerrar o kkkk55 kkkkhj e a kkkk65 for cancelada (ex.: kkkker), os dados já preenchidos na tarefa de usuário podem ser perdidos e a reconstrução da interface falha. A kkkkwb kkkkhk e o kkkkbz devem prever kkkkvx em kkkk7o adequados (ex.: ao completar tarefas de usuário ou em pontos definidos), conforme detalhado em [kkkkvc](kkkkvc).

---

## Evolução de kkkkvo

Variáveis devem evoluir de forma **compatível** com instâncias já existentes:

- Evitar remoção de campos utilizados por versões antigas de kkkkpa.
- Preferir adicionar novos campos em vez de alterar estrutura existente.
- Evitar mudanças de tipo em campos existentes (ex.: `kkkkw5: string` não deve virar `kkkkw5: objeto`), pois isso quebra instâncias antigas.
- Quando necessário, introduzir versionamento explícito de kkkkvo.

Contratos de kkkk55 devem ser **kkkkw0** em mudanças incompatíveis (remoção de variável usada pelo kkkkh0, mudança de estrutura de objeto, alteração de semântica). Exemplo: `processo_dados_pessoais_v1`, `processo_dados_pessoais_v2`; o kkkkh0 direciona novas instâncias para a versão mais recente.

---

## Garantias do kkkkvn

O kkkkbz garante:

- previsibilidade na kkkku0 entre kkkkpa
- kkkkvz entre kkkk0n
- reconstrução completa da interface a partir do estado do kkkkh0
- evolução controlada da estrutura de dados da kkkkgq

---

## Referências

- [kkkk7p — Preservação de estado ao reabrir kkkk0n](../kkkk7p/kkkk5z)
- [kkkkvl](kkkkvl)
- [kkkk1y](kkkk1y) — eventos kkkkgu, retomar, kkkk3w, kkkkvi
- [kkkkvc](kkkkvc)
