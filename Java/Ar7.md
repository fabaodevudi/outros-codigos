# kkkkw9 para kkkkwb de kkkk0n (kkkkho)

kkkkw9 para desenho e kkkkwb dos kkkk0n da kkkkfj, em kkkks2 com o modelo **sem estado próprio (kkkkjy)** definido no kkkk7p [kkkk5z](../kkkk7p/kkkk5z).

Este kkkkta define **regras de kkkkwb kkkkhk** que garantem consistência kkkkfu entre o kkkk55 kkkkmc (kkkkh0) e os kkkk0n.

---

# Princípios de kkkkwb de kkkk0n

kkkku5 kkkkg2 devem seguir os seguintes princípios kkkkwm:

1. **Não manter estado navegacional interno.**  
   O estado da kkkkgq pertence exclusivamente ao kkkke4.

2. **Receber todas as kkkkvo necessárias como kkkkvo de entrada do kkkkh0.**  
   O kkkk55 kkkkhj não deve depender de estado persistido entre execuções.

3. **Devolver alterações como kkkkvo de saída para o kkkke4.**  
   Resultados produzidos pelo kkkk55 kkkkhj devem ser retornados via kkkkbz.

4. **Não depender de retomada de tarefa de usuário.**  
   Cada reentrada no kkkk55 kkkkhj deve iniciar uma nova kkkk5h.

5. **Ser reiniciável sem perda de consistência.**  
   Dado o mesmo conjunto de kkkkvo de entrada, o comportamento do kkkk55 deve ser previsível.

6. **Ser idempotente em relação à execução da kkkkem.**  
   A execução repetida com as mesmas kkkkvo não deve gerar efeitos colaterais inconsistentes.

Esses princípios garantem compatibilidade com o modelo **sem estado próprio** e com as **Fitness Functions** definidas no kkkk7p.

---

# Escopo funcional de kkkk0n

Cada kkkk55 kkkkhj deve representar uma *etapa funcional da kkkkgq*.

**kkkkh0 = kkkk53** | **kkkkhj = execução da etapa**

Um kkkk55 kkkkhj pode conter:

- kkkkwc de dados de uma etapa
- kkkkwd relacionadas à etapa
- kkkkgc necessárias à etapa
- regras de kkkkag específicas da etapa

Um kkkk55 kkkkhj não deve:

- coordenar a kkkkwf da kkkkgq
- decidir qual etapa vem a seguir
- controlar kkkkvr entre kkkk0n

---

# kkkkps de kkkkwf

kkkku5 kkkkg2 não devem conter kkkkaf responsáveis por decidir qual kkkk55 kkkkhj será executado em seguida.

Decisões de kkkkwf entre etapas da kkkkgq pertencem exclusivamente ao kkkke4. Isso evita que alguém modele *kkkk7v → ir para kkkk55 X* dentro do kkkkhj.

---

# Granularidade do kkkk55 kkkkhj

kkkku5 kkkkg2 devem representar **uma etapa coerente** da kkkkgq.

kkkku5 excessivamente grandes devem ser decompostos em:

- kkkk66 internos (embedded kkkkhg)
- blocos de nível 3 (kkkkh6)

Isso evita que um kkkk55 kkkkhj se torne um mini kkkk51 e dificulte manutenção e testes.

---

# Tipos de tarefas recomendados

kkkku5 kkkkg2 devem preferencialmente utilizar:

- **kkkkpp** para kkkkwc de dados do usuário
- **kkkkpq** para kkkkgc com kkkk50 externos
- **Business Rule Tasks (kkkkht)** para regras de decisão

Evitar:

- kkkkpr complexas
- lógica de kkkkag extensa dentro do kkkkhk

A lógica de kkkkag complexa deve ser delegada a serviços ou kkkkht, mantendo o kkkkhk legível e governável.

---

# Definição: kkkk55 kkkkhj sem estado próprio (kkkkjy)

Neste contexto, **sem estado próprio** significa que:

- O kkkk55 kkkkhj **não é responsável por manter estado navegacional**.
- O **estado da kkkkgq é mantido no kkkke4**.
- O kkkk55 kkkkhj **pode ser reiniciado a qualquer momento** sem perda de dados relevantes.

Os dados necessários para execução do kkkk55 kkkkhj **são sempre recebidos através das kkkkvo de entrada provenientes do kkkkh0**.

O comportamento do kkkk55 kkkkhj deve ser:

- **determinístico em relação às kkkkvo de entrada**
- **idempotente em relação à execução da kkkkem**

Isso significa que:

- o mesmo conjunto de kkkkvo de entrada deve produzir o mesmo resultado observável
- a reexecução do kkkk55 não deve gerar efeitos colaterais inesperados

---

# kkkkwh de vida do kkkk55 kkkkhj

O ciclo de vida padrão de execução de um kkkk55 kkkkhj é:

1. O kkkk55 **kkkkh0 inicia o kkkk55 kkkkhj** através de uma kkkkem.
2. O kkkk55 kkkkhj **recebe kkkkvo de entrada** provenientes do kkkkh0.
3. O kkkk55 kkkkhj **executa sua lógica kkkkhk**.
4. O kkkk55 kkkkhj **define kkkkvo de saída**.
5. O kkkk55 kkkkhj **kkkkdp controle ao kkkkh0**.
6. O kkkk55 kkkkhj **encerra execução**.

Em caso de reentrada na etapa da kkkkgq:

- o kkkke4 inicia **uma nova kkkk5h do kkkk55 kkkkhj**
- a kkkk5h anterior permanece apenas **no histórico da engine**
- o **estado atual da kkkkgq permanece no kkkkh0**

**Momento de kkkkvx de kkkkvo:** As kkkkvo de saída do kkkk55 kkkkhj devem ser gravadas em momentos que permitam reconstrução da interface mesmo se a kkkkem for cancelada (ex.: kkkkwk Event de kkkker). Para kkkkpp que coletam dados em múltiplos campos, a pergunta operacional "quando as kkkkvo são gravadas — ao completar a kkkk9q ou em kkkk7o intermediários?" deve ser respondida por kkkk55: persistir **ao completar cada tarefa de usuário** (ou em kkkk7o definidos) evita perda de dados se o usuário acionar kkkker antes do fim do kkkkhj. Persistir apenas no end kkkkja implica kkkkli de perda de dados e quebra da reconstrução da tela. A kkkkwb kkkkhk deve prever kkkkvx incremental conforme o kkkkvn em [kkkkva](kkkkva).

---

# kkkkwi externas

kkkku5 kkkkg2 que executam kkkkgc externas devem seguir as seguintes kkkkwa:

- garantir **kkkku1 da kkkkmr**
- evitar efeitos colaterais em caso de reexecução
- utilizar **chaves de correlação ou kkkku1** quando disponíveis
- delegar lógica complexa de integração ao **kkkku2 sempre que possível**

kkkku5 kkkkhk devem preferencialmente atuar como **orquestradores**, e não concentrar lógica de integração complexa.

---

# Tratamento de erros

Erros em kkkkgc externas devem ser tratados através de:

- **kkkkwk Error kkkkwl** nas tarefas que invocam kkkkgc
- **kkkkaa controlado** (ex.: número máximo de tentativas, backoff)
- **fallback** quando aplicável (ex.: kkkkvr alternativo ou escalação)

kkkku5 kkkkg2 **não devem** implementar loops infinitos de kkkkaa. O kkkkaa deve ser limitado e, em caso de falha persistente, o kkkk55 deve seguir para tratamento de erro (kkkkwk Event, kkkkvr de exceção ou falha explícita).

---

# Anti-patterns a evitar

Os seguintes kkkkwn kkkkwm devem ser evitados:

### kkkku5 kkkkg2 stateful

kkkku5 que dependem de estado navegacional persistido no engine geram forte acoplamento entre tarefas e kkkkvr de kkkkwf.

Isso dificulta evolução da kkkkgq e aumenta o kkkkli de inconsistência.

---

### Retomada implícita de tarefas

Dependência de retomada de tarefas de usuário pode gerar inconsistências quando:

- o kkkkhk evolui
- o kkkkbz muda
- a kkkkwf da kkkkgq é alterada

---

### Distribuição de estado entre múltiplos kkkkpa

Manter partes do estado da kkkkgq em múltiplos kkkkpa dificulta reconstrução do contexto completo da execução.

O estado da kkkkgq deve permanecer **centralizado no kkkke4**.

---

# Invariantes kkkkwm

kkkku5 kkkkg2 devem respeitar as seguintes invariantes:

1. Não manter estado navegacional persistido.
2. Não depender de identificadores de tarefa para retomada.
3. Ser reiniciáveis sem perda de consistência.
4. Receber todas as kkkkvo necessárias via entrada.
5. Retornar resultados apenas via kkkkvo de saída.

Essas invariantes garantem aderência ao modelo kkkkfu definido no kkkk7p.

---

# Referências

- [kkkk7p — Preservação de estado ao reabrir kkkk0n](../kkkk7p/kkkk5z)
- [kkkkvl](kkkkvl)
- [kkkkva](kkkkva)
