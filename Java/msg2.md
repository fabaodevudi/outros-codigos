### Alinhamento kkkkho × kkkkes — kkkkip Prioritárias e Pós-Implementação

---

### 1. Objetivo

Registrar, de forma objetiva, **quais kkkky4 precisam ser validados agora com o kkkk8c** para viabilizar o consumo do kkkk6a (status 44) e **quais podem ficar para uma segunda etapa**, após a implementação inicial.

---

### 2. Itens prioritários para kkkkth com kkkk8c (antes / durante a implantação)

#### 2.1 DN + plataforma múltiplo (kkkk6l / kkkk6k)

- **O que validar**
  - Regra de DN para cada plataforma:
    - kkkk6l: usar `kkkk42`.
    - kkkk6k: usar `kkkk6z`.
  - Regra de plataforma:
    - `kkkk6b` com **kkkk7f = kkkk6k / null = kkkk6l** como chave para diferenciar kkkk6l vs kkkk6k.
- **Justificativa**
  - DN + plataforma definem **qual kkkkvr interno** o kkkk8c segue (tratamento kkkk6l vs kkkk6k).
  - Qualquer erro aqui impacta diretamente kkkkx5 de kkkksp, benefícios e kkkkad internos do kkkk8c.
  - A lógica “como tratar kkkk6l vs kkkk6k” é **regra de kkkkag do kkkk8c**; o kkkkho apenas expõe os dados mapeados no JSON da kkkk3l.

---

#### 2.2 Indicador de kkkk7d (campo numérico + momento do kkkkx9)

- **O que validar**
  - Qual campo numérico será considerado referência:
    - `kkkk6h` **ou**
    - `kkkk6i`.
  - Se a regra **“valor > 0 = tem kkkk7d”** está aderente ao entendimento de kkkkag do kkkk8c.
  - Se, mesmo com as limitações já discutidas, o **status 44** é um momento aceitável para inferir kkkk7d.
- **Justificativa**
  - O campo deixa de ser `"S"/"N"` e passa a ser **numérico**, o que muda interpretação e kkkkth.
  - O próprio kkkk8c apontou que o kkkkx9 não é perfeito para responder “tem kkkk7d ou não”, dado que o kkkk7d pode mudar entre kkkkss e kkkks7.
  - A decisão final sobre **como** e **quando** considerar que o kkkk1x “tem kkkk7d” é de kkkkyr do kkkk8c; o kkkkho garante apenas que os valores estarão presentes na kkkk3l.

---

#### 2.3 `kkkk4g = "kkkksg"` (chave de rollout)

- **O que validar**
  - Que o kkkk8c vai usar **exatamente** `kkkk4g = "kkkksg"` como chave de rollout para este kkkkvr.
  - Que a combinação `kkkk4g + kkkkf7` na kkkk4h atende ao cenário de convivência **kkkk7e × tópico 44**.
- **Justificativa**
  - `kkkk4g` é a **chave de rollout** que controla quem vai para a solução nova vs antiga.
  - Valores divergentes (`"digital"`, `"fisico"` etc.) podem causar:
    - roteamento para a solução errada,
    - processamento duplicado,
    - bloqueio indevido na trilha antiga.
  - O mecanismo de rollout (kkkk4h, chave de configuração) está **do lado do kkkk8c**; o kkkkho garante a publicação constante de `"kkkksg"`.

---

#### 2.4 Status 44 como gatilho de consumo

- **O que validar**
  - Que o consumidor do kkkk8c está filtrando **exclusivamente** `kkkk4c = "kkkk4d"` (44) para este kkkkvr.
  - Que nenhum outro status deve disparar o mesmo tipo de processamento.
- **Justificativa**
  - O status 44 marca, para ambos os lados, o momento em que a kkkklh foi efetivada e em que a kkkk3l pode ser tratada como **fonte de verdade**.
  - Consumir outros status pode gerar:
    - processamento antes da hora,
    - duplicidade de processamento,
    - comportamentos diferentes entre canais (kkkk8b × kkkkve).
  - A regra de quais status disparam carregamento é **configuração do consumidor**; o kkkkho garante apenas a publicação consistente com o status correto.

---

#### 2.5 Enriquecimento de `kkkk4t` via kkkk8e

- **O que validar**
  - Que o kkkk8c concorda em obter `kkkk4t` via `GET /kkkk7g/{kkkk6r} → kkkk6s` em vez de receber o detalhe diretamente no tópico.
- **Justificativa**
  - Muda a kkkkyr de **enriquecimento de dados**: o tópico passa a trazer `kkkk6r` e o kkkk8c passa a chamar o kkkk8e.
  - Impacta kkkksk e possivelmente desempenho/timeout do lado deles.
  - Embora não impeça a compreensão do kkkkmn principal, é uma alteração direta no **kkkkvn de consumo** do kkkk8c e merece um “de acordo” explícito.

**Resposta kkkk8c:** 

---

#### 2.6 `kkkk40` — formato e fuso

- **O que validar**
  - Formato final de `kkkk40` a ser implementado no kkkkho (kkkk3l: timestamp único no padrão acordado com o kkkkau de plataforma / esquema do tópico, em UTC).
  - Se esse formato atende o consumidor do kkkk8c (parse, timezone, armazenamento).
  - Se a concatenação `kkkk6f + kkkk6g` é suficiente como origem.
- **Justificativa**
  - O campo já existe conceitualmente, mas o **formato exato** precisa ser fechado antes do desenvolvimento para evitar retrabalho.
  - Afeta diretamente logs, kkkkf4 e possíveis correlações internas do kkkk8c.
  - A kkkkyr de gerar o valor é do kkkkho; a de consumi-lo corretamente é do kkkk8c — por isso o formato precisa ser validado entre as duas equipes.

**Resposta kkkk8c:** 

---

### 3. Lista para depois da implementação (não prioritária agora)

---

#### 3.2 Detalhamento kkkkzy do kkkky1 de kkkk4o (kkkk7e × tópico 44)

- **Para tratar em etapa posterior**
  - Quem convoca a decisão de desligar o kkkk7e.
  - Quem documenta o resultado da kkkkth em kkkk4n.
  - Critérios mínimos objetivos (volumetria, tipos de cenários, período de convivência).
- **Motivo para postergar**
  - O CA-06 já garante que o kkkk4o só ocorre após kkkkth do kkkk8c.
  - Os detalhes operacionais podem ser definidos mais perto da fase de corte, com base em evidências dos testes.

**Resposta kkkk8c (quando for o momento):** 

---

#### 3.3 Campos “futuro próximo” (PSA, PSI e demais atributos do JSON completo)

- **Para tratar em agenda específica de kkkkag**
  - Quais campos adicionais do JSON completo o kkkk8c pretende usar depois da kkkkzw.
  - Como esses campos impactam kkkkad, segmentações e indicadores internos.
- **Motivo para postergar**
  - A própria estratégia definida foi **faseada**: primeiro garantir o que já existe (equivalência kkkk7e × tópico 44), depois explorar o kkkkmn “recheado”.
  - Não são bloqueadores para colocar o novo modelo em produção.

**Resposta kkkk8c (quando for o momento):** 

---

#### 3.4 Documentação de premissas e campos removidos

- **Para consolidar em documentação pós-implantação**
  - Formalizar que `kkkk4s = kkkk7b` deixa de trafegar e vira **kkkk5a** (“todos os eventos aqui são correntistas”).  
  - Listar campos removidos ou marcados como desnecessários (`kkkk4w`, `kkkk4z`, etc.).
- **Motivo para postergar**
  - A remoção já está aceita conceitualmente; o que falta é apenas o registro em kkkkvn/kkkkta de referência.
  - Pode ser feito em paralelo com a estabilização do consumo pelo tópico 44.

**Resposta kkkk8c (quando for o momento):** 

