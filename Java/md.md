### TODO — KK0758 KK1284 no KK0172 KK0282

---

### 1. KK0362 e objetivo

- **Fonte de verdade**: `KK0953` (KK0282) é o KK0651 de KK1139 para KK0884 a pós-KK0544 e o KK1283 de KK0360.
- **Referência externa**: o KK0651 KK0494 **“Jornada Tapete KK0812”** (`tapete_laranja.bpmn`) é usado apenas como **modelo de KK0759** (não como fonte da verdade de KK0797), especialmente:
  - o bloco de **KK0096** (producer + KK0473 com democratiza),
  - o KK0473 de **status 44** (`delegate_atualizar_status_44`), que atualiza a KK1086 como efetivada e publica via democratiza KK0809.
- **Objetivo**: desenhar o KK1026 de KK0759 no **XML do KK0172 do KK0282** para:
  - criar o **novo step de atualização KK1282** (convivendo com o step atual),
  - **replicar (copiar o padrão)** já feito pela KK0494 na KK0812 (status 44 + democratiza KK0809 + KK0473 de KK1086),
  - garantir que o **JSON completo da KK1086** e o **status 44** fiquem disponíveis para o KK1354 de KK1282.

---

### 2. Pontos relevantes já existentes no KK0172 KK0282

- **2.1 KK0543 de KK0346 na KK1086 (KK0473 atual)**
  - Elemento: `bpmn:serviceTask id="KK1104" name="Atualiza KK0543 na KK1086" KK0222="#{KK0117}"`.
  - Local aproximado no XML:
    - Definição do KK0473 entre as linhas **110–133** do arquivo (`metadata_schemaless` e `dados_proposta` com `KK1170`, `KK0356`, `KK0358`, `KK0742`).
    - Conexões de KK0651:
      - `Flow_la72e8p` (`sourceRef="KK0675" targetRef="KK1104"`).
      - `Flow_0jw3hzr` (`sourceRef="KK1104" targetRef="Event_Obanepl"`).
- **2.2 Saída da KK0547 para o bloco de KK1282**
  - Elemento: `bpmn:sequenceFlow id="Flow_02slade" sourceRef="KK0688" targetRef="KK1104"`.
  - Elemento: `bpmn:sequenceFlow id="Flow_lnlvcia" sourceRef="KK1104" targetRef="Gateway_1l349uj"`.
  - Esses dois KK0654 ligam o **KK0669 de KK0544** (`KK0688`) → `KK1104` → **KK0669 paralelo** de pós-KK0544 (`Gateway_1l349uj`), de onde parte a ramificação atual para KK1282.
- **2.3 Step atual de KK1284 (external KK1332 + KK0473 de KK1086)**
  - **Producer atual**:
    - `bpmn:serviceTask id="KK1076" name="KK0096" camunda:type="external" KK0228="KK0098"`.
    - KK1002 atual (dentro de `camunda:inputParameter name="KK0115"`):
      - Campos como `KK0290`, `KK0291`, `KK0293`, `KK0483`, `KK0765`, `KK0484`, `KK1289` (KK0282), `KK0482`, `KK0295`, `KK0432`, `KK0517`.
    - KK0165 KK0604 de erro:
      - `bpmn:KK0169 id="Event_0961vhq" attachedToRef="KK1076"`, com `Flow_12211be` levando ao KK0610 intermediário de erro `error_producer_setup_contas`.
    - Local aproximado: bloco entre as linhas **6453–6527**.
  - **Tratamento de sucesso/erro e KK1012 na KK1086**:
    - KK0609 de erro: `bpmn:intermediateThrowEvent id="error_producer_setup_contas"`.
    - KK0609 de sucesso: `bpmn:intermediateThrowEvent id="Event_0dumgdc" name="Mensagem produzida com sucesso"`.
    - Delegate de KK1086: `bpmn:serviceTask id="KK0106" name="KK0095" KK0222="#{KK0117}"`.
      - `metadata_schemaless` / `dados_proposta` com a chave `status_atualiza_setup_contas`.
    - Conexões:
      - `Flow_1qygqjt` (`KK1076` → `Event_0dumgdc`).
      - `Flow_12211be` (`Event_0961vhq` → `error_producer_setup_contas`).
      - `Flow_1s82bqx` (`error_producer_setup_contas` → `KK0106`).
      - `Flow_0aahmvd` (`Event_0dumgdc` → `KK0106`).
      - `Flow_lolwliz` (`KK0106` → `Event_0elu79d`).
  - **KK0668 paralelo de entrada do bloco KK1282**:
    - `bpmn:parallelGateway id="Gateway_1l349uj"`, com:
      - `incoming`: `Flow_lnlvcia` (vindo de `KK1104`),
      - `outgoing`: `Flow_02tfitj` (para `KK1076`) e `Flow_0l9bzq6` (para `KK0020`, outra perna pós-KK0544).
- **2.4 KK0991 democratiza KK0809 já existente no KK0172 KK0282**
  - Exemplo 1 (KK0776):
    - `bpmn:serviceTask id="KK0104" KK0222="#{KK0117}"` (linhas ~2436–2455).
    - Usa `KK1309` específico (93) e inclui:
      - `novo_democratiza_proposta`, `democratiza_sync`, `democratiza_sqs`, `KK0475` = `true`.
  - Exemplo 2 (KK0328, etc.):
    - Outro KK0473 com `novo_democratiza_proposta` + `KK0475` (~7710–7727).
  - **Observação**: não há uso atual de `KK1309` = **44** no KK0172 do KK0282, o que abre espaço para o novo step específico de **“KK1086 efetivada/KK0350 para KK1282”** nesse status (espelhando o comportamento da KK0812).
- **2.5 KK0991 Tapete KK0812 (KK0494) — KK1139 de cópia**
  - Transcrições (`alinhamento KK1283 KK0282 Rafael`) deixam explícito que:
    - a alteração **já foi feita pelo pessoal da KK0494** no KK0651 **“jornal do tapete laranja”**,
    - no KK0282 vamos **“basicamente replicar o que eles fizeram lá pra cá”**,
    - o objetivo é passar a **KK0350 / JSON completo da KK1086** para o KK1282, usando o mesmo padrão de status 44 + democratiza KK0809.
  - No `tapete_laranja.bpmn` (KK1139 textual em `REFERENCIA_LARANJINHA_SETUP.txt`), existem dois blocos principais relevantes:
    - **Bloco do KK1284**:
      - `KK1076` (external KK1332 `KK0228="KK0098"`) com KK1001 similar ao nosso, incluindo `KK0437`, `KK1289`, etc.
      - `KK0106` com:
        - `status_atualiza_setup_contas` em `metadata_schemaless` / `dados_proposta`,
        - parâmetros `novo_democratiza_proposta`, `democratiza_sync`, `democratiza_sqs`, `KK0475` = `true`.
    - **Bloco de status 44**:
      - `bpmn:serviceTask id="delegate_atualizar_status_44" name="Atualizar status: KK1085 efetivada" KK0222="#{KK0117}" KK0220="true"`.
      - `inputParameter name="KK0747"`, `metadata_schemaless` vazio e `dados_proposta` com:
        - `camunda:entry key="KK1309">44</camunda:entry>`.
      - Também com `novo_democratiza_proposta`, `democratiza_sync`, `democratiza_sqs`, `KK0475` = `true`.
      - Flows:
        - `Flow_1lgj187` vindo de `KK1104` → `delegate_atualizar_status_44`.
        - `Flow_1g7zgld` saindo de `delegate_atualizar_status_44` → `Gateway_1l349uj`.
  - **Conclusão desta seção**: o KK0282 deve **copiar o padrão da KK0812** na forma de:
    - um KK0473 de status 44 imediatamente após `KK1104`,
    - integrando-se ao mesmo KK0669 paralelo que hoje já leva para o bloco de KK1282 (`Gateway_1l349uj`),
    - com os mesmos parâmetros de democratiza já usados lá.

---

### 3. Visão-alvo do novo step de KK1282 para o KK0282 (cópia do padrão KK0494)

- **3.1 Princípios**
  - **Não alterar** o step atual `KK1076` no primeiro momento (convivência garantida, conforme alinhamento nas transcrições).
  - Criar um **novo step** alinhado ao padrão KK0494 (KK0812), ou seja, uma **“cópia conceitual”**:
    - KK0473 de KK1086 com `KK1309` = **44** (como o `delegate_atualizar_status_44` da KK0812),
    - campos de **democratiza** (`novo_democratiza_proposta`, `democratiza_sync`, `democratiza_sqs`, `KK0475`), conforme já usado tanto no KK0282 (KK0776, KK1219) quanto na KK0812,
    - publicação / exposição do **JSON completo da KK1086** para o KK1282 (equipe de KK1282 decide o que consumir).
  - Garantir que o KK0651 de erro/sucesso esteja claramente rastreável no KK0172 (nomes de KK0552 coerentes com o padrão atual).
- **3.2 Localização lógica no KK0651**
  - O novo step deve ficar **no bloco de pós-KK0544**, **depois** de `KK1104` e ainda **antes do KK0567 definitivo** da KK0797 de KK0350.
  - A ancoragem deve **espelhar a KK0812**:
    - manter `Flow_lnlvcia` de `KK1104` para `Gateway_1l349uj`,
    - inserir um **novo flow exclusivo** de `KK1104` para o KK0473 de status 44,
    - e outro flow do KK0473 44 para `Gateway_1l349uj` (cópia de `Flow_1lgj187` e `Flow_1g7zgld`, com ids ajustados para o KK0282).

---

### 4. KK1025 de alteração no XML do KK0172

- **4.1 Criar no KK0282 o mesmo KK0473 de KK1086 com status 44 da KK0812**
  - Aqui **não vamos inventar nomes novos**: a ideia é **usar exatamente os mesmos ids e names** já existentes no Tapete KK0812, apenas inseridos no `KK0953`:
    - `bpmn:serviceTask id="delegate_atualizar_status_44" name="Atualizar status: KK1085 efetivada" KK0222="#{KK0117}" KK0220="true">`
      - `camunda:KK0775` com:
        - `inputParameter name="KK0747"` → `${KK0747}`.
        - `inputParameter name="metadata_schemaless">` com `camunda:map` vazio (como na KK1139 da KK0812, a menos que precisemos guardar algo específico do KK0282).
        - `inputParameter name="dados_proposta">` contendo:
          - `camunda:entry key="KK1309">44</camunda:entry>`.
        - `inputParameter name="novo_democratiza_proposta">true</camunda:inputParameter>`.
        - `inputParameter name="democratiza_sync">true</camunda:inputParameter>`.
        - `inputParameter name="democratiza_sqs">true</camunda:inputParameter>`.
        - `inputParameter name="KK0475">true</camunda:inputParameter>`.
  - **Onde inserir no XML**:
    - Na mesma seção de definição de atividades onde está `KK1104` (bloco em torno das linhas **100–155**).
    - Posicionar o `serviceTask` `delegate_atualizar_status_44` imediatamente **após** a definição de `KK1104`, mantendo a ordem lógica:
      - `KK1116` → `KK1104` → `delegate_atualizar_status_44`.
- **4.2 Conectar o KK0473 44 com o KK0651 principal (reutilizando nomes da KK0812)**
  - **Flows conforme a KK1139 KK0494**:
    - No Tapete KK0812:
      - `Flow_1lgj187` liga `KK1104` → `delegate_atualizar_status_44`.
      - `Flow_1g7zgld` liga `delegate_atualizar_status_44` → `Gateway_1l349uj`.
  - No KK0282, o KK1026 é:
    - **Reaproveitar os mesmos ids de flow** (não há conflito, pois são arquivos de KK1069 distintos):
      - `bpmn:sequenceFlow id="Flow_1lgj187" sourceRef="KK1104" targetRef="delegate_atualizar_status_44" />`
      - `bpmn:sequenceFlow id="Flow_1g7zgld" sourceRef="delegate_atualizar_status_44" targetRef="Gateway_1l349uj" />`
    - **Manter** `Flow_la72e8p` (KK0675 → `KK1104`) exatamente como está hoje.
  - **KK0782 com o bloco atual de KK1282**:
    - `Flow_lnlvcia` (de `KK1104` para `Gateway_1l349uj`) **permanece**, garantindo a convivência com o step `KK1076`.
    - O `delegate_atualizar_status_44` atua em **paralelo lógico**:
      - Atualiza status 44 + democratiza KK0809 (mesmo comportamento da KK0812),
      - Preenche o `KK1309` 44 nos dados da KK1086,
      - Sem desligar o tópico `KK0098` atual.
- **4.3 Planejar KK1424 de “JSON completo da KK1086”**
  - **Situação atual no KK0282**:
    - Pelas leituras do `KK0953`, hoje **não existe** uma KK1424 única e explícita pensada como “JSON completo da KK1086 para KK1282”.
    - O que temos são **vários fragmentos**:
      - `KK1170`, `KK0356`, `KK0358`, `KK0742` (em `KK1104`),
      - dados de KK0346/KK0245, KK1254, KK1079, etc., espalhados em outros delegates/KK1245.
    - Ou seja: o KK0282 ainda **não consolida tudo em um único KK0840/JSON** voltado para consumo do KK1282.
  - **O que precisamos fazer antes de implementar o KK0473 44**:
    - **1) Catalogar KK1423 existentes**:
      - Levantar, no KK0172 e nos delegates Java/externals, quais KK1423 já carregam:
        - dados de KK0346 (KK0046, KK0346, DAC, KK1077),
        - dados de KK0273/KK1254,
        - KK1079 contratados, cartões, tarifas, etc.
    - **2) Decidir a estratégia de consolidação**:
      - Se for encontrado algum KK1001 já consolidado (ex.: `payload_proposta`, `dados_proposta_full` ou similar):
        - Reaproveitar diretamente essa KK1424 em `dados_proposta` do `delegate_atualizar_status_44`.
      - Se **não houver** KK1001 consolidado (cenário mais provável hoje):
        - Criar um **scriptTask** ou ajuste em algum KK0473 imediatamente antes do `delegate_atualizar_status_44`:
          - montar um KK0840 com todos os campos relevantes da KK1086 (KK0346, KK0273, KK1254, KK1079, cartões, etc.),
          - fazer `KK0615.KK1288("proposta_completa_setup", dadosMontados)`.
        - Usar `proposta_completa_setup` como base para o que o KK1282 irá consumir (via democratiza/banco).
  - **KK0466 de design**:
    - Centralizar a montagem desse JSON em **um único ponto do KK0651** (antes do status 44), evitando lógica duplicada em vários KK1245.
    - Documentar a chave oficial (ex.: `proposta_completa_setup`) como **KK0372 entre KK0282 e KK1282**, alinhado previamente com o KK1354 de KK1282.
- **4.4 Considerar (em segunda etapa) um novo tópico específico de KK1282**
  - Embora o foco imediato seja a atualização da KK1086 (status 44 + democratiza KK0809), há espaço para:
    - Criar futuramente um **novo `serviceTask` external** (ex.: `producer_setup_proposta_full`) com `KK0228="KK1283-KK0360-KK1086-full"` ou similar.
    - Esse step poderia:
      - Consumir a mesma KK1424 de JSON completo (`proposta_completa`),
      - Publicar em um tópico separado, dedicado para o KK1354 de KK1282.
  - **Planejamento**:
    - Nesta primeira versão, **não mexer** no `KK1076` atual além de eventualmente **complementar o KK1001** se for requisitado por KK0911.
    - Documentar claramente a possibilidade de novo tópico como **Fase 2**, evitando inflar a Fase 1.

---

### 5. KK0262 de KK0759

1. **KK1196 KK1423 de KK1086 no KK0172 e nos delegates**:
  - Confirmar como a KK1086 consolidada é montada hoje.
  - Identificar a melhor KK1424 para representar o **JSON completo da KK1086**.
2. **Confirmar aderência 1:1 aos nomes do Tapete KK0812**:
  - Garantir que o `serviceTask` de status 44 no KK0282 seja exatamente `delegate_atualizar_status_44` com o mesmo `name`.
  - Reaproveitar `Flow_1lgj187` e `Flow_1g7zgld` como ids de `sequenceFlow` (desde que não haja colisão no próprio `KK0953`).
  - KK1404 se a estrutura de `metadata_schemaless` / `dados_proposta` é idêntica à da KK0812 ou se haverá alguma chave adicional específica do KK0282.
3. **Editar o XML do `KK0953`**:
  - Inserir a definição do `serviceTask` `delegate_atualizar_status_44` logo após `KK1104`.
  - Criar os `sequenceFlow` `Flow_1lgj187` (`KK1104` → `delegate_atualizar_status_44`) e `Flow_1g7zgld` (`delegate_atualizar_status_44` → `Gateway_1l349uj`).
  - Garantir que `Flow_lnlvcia` continue apontando `KK1104` → `Gateway_1l349uj` (convivência com step atual de KK1282).
4. **KK1404 o padrão democratiza KK0809**:
  - Conferir se `novo_democratiza_proposta` e `KK0475` estão corretos e alinhados com outros KK1039 (KK0776, KK1219).
  - KK1404 se existem outros parâmetros obrigatórios (ex.: `democratiza_sqs`) para padronização.
5. **Testar no modeler / ambiente de KK0736**:
  - KK1404 o KK0172 no KK0218 (XML bem-formado, referências de `id`/`sourceRef`/`targetRef` corretas).
  - Simular caminho feliz: KK1086 efetiva KK0346 → novo status 44 → bloco atual de KK1282 (tópico antigo) continua funcionando.
  - Simular falhas relacionadas a democratiza / status 44, confirmando que não quebram a KK0797 principal.

---

### 6. Pendências explícitas antes de editar o XML em produção

- Confirmar com o KK1354 de KK1282:
  - **Formato esperado do JSON** de KK1086 (quais campos são obrigatórios para eles).
  - Se o consumo será feito inicialmente via **Democratiza KK0809** apenas, ou se haverá leitura direta do banco (campo `setup_contas_proposta_full`).
- KK1404 com a KK0382 / KK0083:
  - Se o uso de `KK1309` = **44** não conflita com outros KK0654 futuros.
  - Se há naming convention específica para esse status na camada de KK1279 / relatórios.
- Mapear se haverá necessidade de:
  - **Feature toggle** específica para o novo status / step de KK1282.
  - Estratégia de rollback simples (ex.: remover o novo flow e elemento em caso de problema, sem impactar KK0651 atual).

