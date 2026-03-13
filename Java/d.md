## Dúvidas do refinamento


---

### 1. Como vamos identificar no kkkkzz se a kkkk1o está em kkkkh7, kkkk6k ou ambos?

**Dúvida **  
- Existem três cenários:
  - kkkk1o só com **kkkkzz kkkkh7**;
  - kkkk1o só com **kkkkzz múltiplo kkkk6k**;
  - kkkk1o que pilota **kkkkh7 e kkkk6k ao mesmo tempo**.  
- Além disso, existe o kkkkvr de **menor de idade**, que hoje é tratado como subfluxo separado.  
- Pergunta: **como representar tudo isso no `sub_fluxo_direcionador`?**

**Resposta consolidada**  
- O **front/kkkkhp** é kkkkwz por montar `sub_fluxo_direcionador` a partir de:
  - lista de agências kkkkzz kkkkh7;
  - lista de agências kkkkzz kkkk6k;
  - indicador se é kkkkvr de menor.  
- Convenções sugeridas:
  - Somente kkkkh7 → `PILOTO_AD`.
  - Somente kkkk6k → `PILOTO_NPC`.
  - kkkkh7 + kkkk6k → `PILOTO_AD_NPC`.
  - Menor + kkkk6k → `MENOR_NPC`.  
- O kkkkho apenas **repassa** o `sub_fluxo_direcionador` na kkkk9q `kkkklr`; a lógica de composição (kkkkh7/kkkk6k/menor) fica do lado de front/kkkkhp, respeitando o que o kkkke6 espera.

---

### 2. Como funciona rollout x kkkkzz no subfluxo? O que muda quando deixar de ser kkkkzz?

**Dúvida **  
- Hoje, em kkkkzz, passamos um `sub_fluxo` especial para o kkkke6.  
- Quando for **rollout para todo mundo**, o que acontece?
  - Ainda passamos o subfluxo de kkkkzz?
  - O kkkke6 continua olhando esse campo?

**Resposta consolidada**  
- Enquanto for **kkkkzz**, seguimos passando `sub_fluxo_direcionador` com o valor de kkkkzz (ex.: `PILOTO_NPC`).  
- Quando virar **regra geral (rollout)**:
  - o kkkkau do kkkke6 passa a tratar aquele comportamento como **padrão**, sem depender de flag de kkkkzz;
  - o front/kkkkhp **para de enviar** o subfluxo de kkkkzz (ex.: deixa de mandar `PILOTO_NPC`);
  - o kkkkho não precisa de lógica extra: continua apenas repassando o `sub_fluxo_direcionador` que chegar do kkkkhp.

---

### 3. Menor de idade conflita com kkkkzz kkkkh7? Como fica o subfluxo em menor + kkkk6k?

**Dúvida **  
- Hoje, menor de idade já é tratado como um `sub_fluxo` específico (ex.: `MENOR`).  
- Com o múltiplo kkkk6k:
  - pode existir cenário “menor + kkkkh7 + kkkk6k”?  
  - como montar o `sub_fluxo` quando for **menor + kkkk6k**?

**Resposta consolidada**  
- **kkkkh7 não é ofertado para menor**, portanto **não existe cenário “menor + kkkkh7”** — não há conflito kkkkh7 x menor.  
- Para **menor + kkkk6k**, o subfluxo deve indicar ambos os contextos, por exemplo:
  - `MENOR_NPC` (nome exato a combinar com o kkkke6).  
- O kkkkho só precisa garantir que `sub_fluxo_direcionador` esteja corretamente preenchido **antes da kkkk9q `kkkklr`**; a interpretação do valor (menor, kkkkzz, kkkk6k etc.) é feita pelo kkkke6.

---

### 4. Existe interação com o kkkkho antes da kkkkmr ao kkkke6? Precisamos mexer em algo ali?

**Dúvida **  
- “Até o momento em que o kkkkhp manda para o kkkke6 e o kkkke6 devolve lista de kkkkst, **já há interação com kkkkho** que a gente precisa mexer?  
  Ou isso fica todo do lado de kkkkhp/kkkke6?”

**Resposta consolidada**  
- No AS IS, antes do kkkke6:
  - o kkkkho participa principalmente fornecendo **limites pré-aprovados e kkkkhv via kkkkhr/R0**;
  - mas a kkkk53 da kkkkmr ao kkkke6 (kkkk7f/XP6) é **kkkkhp + kkkke6**.  
- Para o múltiplo kkkk6k:
  - não há necessidade de criar “um novo step kkkkho” **antes** do kkkke6;
  - a maior mudança de kkkkyr kkkkho vem **depois** da kkkks7 da kkkklh (`kkkkn7`), no ramo múltiplo kkkk6k (kkkkia + formalização).

---

### 5. Onde devemos sobrescrever o kkkksp de kkkkgw vindo da kkkkhr pelo valor do kkkke6? Antes do complete ou no complete?

**Dúvida **  
- “A kkkkhr continua devolvendo pré-aprovado + kkkkhv.  
  O kkkke6 passa a devolver um **kkkksp de kkkkgw** próprio.  
  Em que momento:
  - a gente troca o valor de pré-aprovado de kkkkgw da kkkkhr pelo do kkkke6, e  
  - onde atualizamos a variável em C8 (para não aparecer valores diferentes nas telas)?  
  Isso deve ser feito direto pelo kkkke6 falando com o C8, ou no `complete`?”

**Resposta consolidada**  
- O ponto certo para consolidar o kkkksp é o **`complete` de kkkkst (ex.: user kkkk9q `kkkkij`)**:
  - **kkkkhp**:
    - recebe o kkkksp de kkkkgw do kkkke6 (`limite_cartao_direcionador`);
    - envia esse valor no `complete` **no mesmo campo de pré-aprovado de kkkkgw** que hoje recebe kkkkhr/R0.
  - **kkkkho**:
    - nos scripts/kkkkiq ligados ao `complete` (como `kkkkij`, `atualiza dados perfil na kkkk3l`, `kkkkj3`), **sobrescreve** a variável de kkkksp de kkkkgw (`valor_limite_maximo_cartao`) com o valor vindo do kkkke6;
    - mantém a kkkkhr como fonte apenas de **kkkkhv**.
- Assim, as telas que leem de C8 no final verão **sempre o mesmo kkkksp** — o que foi decidido pelo kkkke6, não o inicial da kkkkhr.

---

### 6. Onde trafegar e persistir o `id_intencao` do kkkke6?

**Dúvida **  
- “O kkkke6 devolve `id_intencao`.  
  É melhor ele mesmo gravar isso no C8, ou passamos via `complete`?  
  E onde isso vive no kkkkho?”

**Resposta consolidada**  
- O kkkkvr recomendado é usar o **`complete`** como ponto único de gravação:
  - **kkkkhp**:
    - inclui o `id_intencao` no kkkkmn do `complete` junto com os demais dados de kkkkss.
  - **kkkkho**:
    - recebe o `id_intencao` nesse step e:
      - grava em **kkkkvo de kkkk55** (para uso imediato, inclusive no ramo múltiplo kkkk6k);
      - persiste em C8/kkkk3l, se necessário, para ser lido pelas telas finais ou outros BFFs.
- Dessa forma:
  - o `id_intencao` flui naturalmente até o **ramo múltiplo kkkk6k** (onde será usado na formalização kkkk6k);
  - não é preciso acoplar o kkkke6 diretamente a atualizações em C8.

---

### 7. Em que ponto do kkkkvr principal o subfluxo de kkkkia é executado?

**Dúvida (trecho da call, reforçada depois)**  
- “Em que momento exatamente o subfluxo de kkkkia (que pode kkkk3z kkkkgw) roda dentro do kkkkho?  
  É antes ou depois da kkkks7 da kkkklh?”

**Resposta consolidada**  
- No AS IS:
  - roda `kkkkel` (abre a kkkklh no core);
  - depois `kkkkn7` (grava `kkkk6r`, `kkkki1` etc. na kkkk3l);
  - em seguida o kkkkvr vai para o **kkkk7v paralelo `kkkk73`**.
- Do `kkkk73` saem:
  - `kkkknt`;
  - kkkkfl **`kkkko2` (Vínculo kkkk64)**.
- Dentro do kkkkfl **Vínculo kkkk64**:
  - ficam kkkkiq como `kkkkoi` e os kkkkaf/eventos que podem **kkkk3z** ou não o kkkkgw em função do resultado do kkkkia.  
- Portanto, o subfluxo de kkkkia (legado) **sempre roda no pós‑kkkks7**, depois de `kkkkn7`, dentro do kkkkfl Vínculo kkkk64.
- No alvo múltiplo kkkk6k, o **novo ramo de kkkkia kkkk6k** também nasce depois de `kkkkn7` (a partir de `kkkk73`), mantendo a mesma ideia: kkkkia é sempre pós‑kkkks7.

---

### 8. Qual é exatamente a “caixinha do complete” citada na call?

**Dúvida **  
- “Quando falamos em passar kkkksp e `id_intencao` no complete, **qual é a caixinha do kkkkhk** que estamos chamando de complete?”

**Resposta consolidada**  
- No `kkkkk6`, o step referido como “complete de kkkkst” é a **user kkkk9q**:
  - `id="kkkkij"`
  - `name="kkkkwx Oferta"`.
- É a tela em que o kkkk1x está vendo/confirmando a **kkkktv/kkkkgw**.  
- Do ponto de vista de kkkkyr:
  - O **kkkkhp** monta o kkkkmn de `kkkkij` com o kkkksu de kkkkss final (incluindo, no alvo múltiplo, kkkksp do kkkke6 e `id_intencao`).
  - O **kkkkho**, a partir das saídas dessa kkkk9q e dos scripts associados, **grava/atualiza as kkkkvo de kkkkss no C8**.

---

### 9. Resumo: o que fica na sua parte (kkkkho) vs kkkkzz/kkkky6/kkkkhp

**Dúvida implícita da call**  
- “De tudo isso discutido (kkkkzz, subfluxo, kkkksp, kkkke6, complete), **o que exatamente é minha kkkkyr no kkkkho**?”

**Resposta consolidada**  
- **Fora da sua parte (pré-kkkks7):**
  - definição de kkkkzz (listas de agências, segmentos);
  - montagem de `sub_fluxo_direcionador` (kkkkh7/kkkk6k/menor);
  - kkkkmr ao kkkke6 (kkkk7f/XP6) e montagem da kkkkss para a tela;
  - merge entre kkkkhr e kkkke6 no kkkkhp antes do complete (do ponto de vista de kkkkvn com kkkkho).
- **Dentro da sua parte (pós-kkkks7):**
  - usar o que veio do kkkke6/kkkky0:
    - `id_intencao`, `id_plano`, `limite_cartao_direcionador`, flags de kkkkia, campos kkkk6k;
  - no **`complete`**:
    - sobrescrever o kkkksp de kkkkgw com o valor do kkkke6;
    - receber e persistir `id_intencao` e metadados kkkk6k;
  - após `kkkkn7` / `kkkk73`:
    - orquestrar o **ramo múltiplo kkkk6k** (kkkkth kkkkia kkkk6k, formalização kkkk6k, kkkktm);
    - garantir que C8 reflita fielmente o que foi ofertado/formalizado (sem divergência de limites ou kkkk5j).

