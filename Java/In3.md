# kkkk58 de kkkk59 — kkkk7u (kkkk55 kkkk7r, nível 2/3)

> **Objetivo:** kkkk5d e agrupar os elementos do kkkk55 **`kkkkbs.bpmn`** seguindo o mesmo padrão dos mapeamentos `MAPEAMENTO_ELEMENTOS_NIVEL*`.  
> **Escopo:** kkkk55 kkkk7r iniciado por **kkkkx9/mensagem** a partir de qualquer kkkkhk macro (kkkke2, kkkkeh, kkkkwt, kkkk56).  
> **kkkkpn:** Os valores entre aspas nas seções 3 e 4 (kkkka5, kkkka6) são **idênticos** ao `kkkkk6` para uso com kkkk57+C / kkkk57+V na busca do kkkkpm.

---

## 1. Escopo do kkkk55 `kkkkbs.bpmn`

- Iniciado por **kkkk3y Start Event** (um ou mais tipos de solicitação de kkkkfv).  
- Atendido por **analistas de kkkkfp/kkkk54/kkkkfv**, não pelo kkkk38 da kkkk1o.  
- Pode **interagir** com a kkkk5h da kkkkgq (kkkk3l/kkkklh) via:
  - Atualizações em kkkk50 kkkk5i (kkkkhq, kkkk3l, kkkkli, etc.).
  - Publicação de eventos para que a kkkkgq principal ajuste estado (quando aplicável).
- Não participa da **kkkk53 principal** da kkkkgq (isso é papel do kkkkh0).

---

## 2. Eventos de início (mensagens)

| ID (sugerido) | Tipo | Origem (quem publica) | Quando dispara | Observação |
| --------------- | ------ | ------------------------ | ---------------- | ----------- |
| `kkkkko` | kkkk3y Start | kkkkgz / kkkk56 / eventos kkkkhy | Suspeita de kkkkg5 na kkkk3l/kkkklh | Abre caso de kkkkfv kkkkfp |
| `kkkkkp` | kkkk3y Start | Eventos de kkkkff / kkkkh1 | Sinalização de kkkkh1 | Pode compartilhar kkkk52 com kkkkg5, mas filas distintas |
| `Message_backoffice_operacional` | kkkk3y Start | Qualquer kkkkhk macro / kkkk50 kkkkxm | Ajustes operacionais (dados, kkkklh, kkkkst) | Ex.: correção de dados pós-kkkks7 |

> **Origem dos kkkk5j:** Os kkkk5j acima são **propostos para o novo design** (não necessariamente existentes no kkkk51). Eventuais kkkk3y Start / eventos de kkkk5k do kkkkfv no `kkkkk6` devem ser inspecionados para alinhar nomes. Ajustar granularidade conforme `kkkk20`.

---

## 3. kkkkpp (filas de trabalho)

kkkk5j e filas kkkkae do `kkkkk6` — replicados de `kkkk3b` (seção kkkk7u).

| ID | Nome | kkkk5l / Grupo | Observação |
| ---- | ------ | -------------- | ----------- |
| `kkkkji` | kkkk5s de kkkkg5 em andamento | kkkkbf | kkkkyd |
| `kkkkjp` | kkkk5m kkkk5o kkkk7u | kkkk5r | kkkkyd/documentos |
| `kkkkjq` | kkkk5n kkkkh1 - ALTO | kkkk5r de kkkkh1 | kkkkh1 |
| `kkkkjr` | kkkkkq | kkkk5r de kkkkh1 | kkkkh1 |
| `kkkk16` | Erro kkkkhy (kkkkgb) | kkkk7u | Erro kkkkgb |
| `kkkkjn` | kkkk5p manual da kkkk3l | Supervisor | kkkk5p |
| `kkkk18` | kkkkjl | kkkk7u | kkkka9 |

> **kkkke2 kkkkgm:** usar as filas exatamente como no kkkkhk (ex.: "kkkkbf", "kkkk5r de kkkkh1") para candidaturas/kkkk5q.

---

## 4. kkkka6 / kkkkg1

kkkk5j kkkkae do `kkkkk6` — replicados de `kkkk3b` (seção kkkk7u).

| ID | Nome | Observação |
| ---- | ------ | ----------- |
| `kkkkoe` | kkkklg enviada para kkkk7u | Entrada no kkkkfv |
| `kkkk1c` | kkkkks | Saída OK |
| `kkkkkt` | kkkklg com Falha na kkkk5s | Saída com falha |
| `kkkk0t` | kkkkkw | Recusa por kkkkg5 |
| `kkkk1l` | kkkkky | Intervenção manual |
| `kkkk0e` | kkkkk0 | Cancel de reserva |
| `kkkkk1` | [kkkkh4] Enviar e-mail recusa kkkkg6 | kkkkxj |

> **kkkkac** do kkkkfv (kkkkad kkkkfp/reserva) estão no kkkkh5; ver seção "kkkkac já separados" em `kkkk3b`. Outras kkkka6 auxiliares do kkkkfv no kkkk51: _(a preencher se identificadas)_.

---

## 5. kkkkps principais

kkkk5j kkkkae do `kkkkk6` no kkkkvr kkkkfv/kkkkfp. Lista principal — podem existir outros kkkkaf no mesmo kkkkvr; conferir no kkkkhk.

| ID | Nome / pergunta | Observação |
| ---- | ----------------- | ----------- |
| `kkkkaw` | _(sem name no kkkkhk)_ | Resposta do kkkkfv → kkkk1c ou recusa (Flow_08ceoql) |
| `kkkkax` | Tem kkkkg3, upgrade, situação especial? | Após kkkk1c → kkkkg3, kkkkel ou kkkko3 |
| `kkkkk9` | Sucesso analise da documentação? | Após subfluxo kkkkg5 / kkkko1 → Sim: kkkk1c; Não: Event_0nm8w4d |
| `kkkkay` | _(parallel)_ | Split → kkkkji e kkkkoe |
| `kkkklk` | _(sem name no kkkkhk)_ | Após kkkk0t / kkkk1j → kkkk16 |
| `kkkklc` | _(sem name no kkkkhk)_ | Wayout → kkkkjp; Recusada → biometria_recusada |
| `kkkklb` | _(sem name no kkkkhk)_ | Após kkkkjp |
| `kkkkaz` | O kkkkdy do aq4 foi sucesso? | kkkkh1 — Sim/Não → kkkkjr ou segue |
| `kkkkld` | kkkkle | kkkkh1 |
| `kkkka0` | kkkk5n médio? | kkkkh1 — Sim → kkkkog; Não → kkkkjq |
| `kkkka1` | _(sem name no kkkkhk)_ | Após kkkkog → Flow_025xqbq (kkkkax) |
| `kkkka2` | Qual o resultado da kkkkgt? | Após kkkk0e |
| `kkkka3` | _(parallel)_ | Encaminha para kkkk0e (ou Event_07ttzcw) |

> **Nota:** No kkkkhk há referência a `kkkka4` (com L) em alguns kkkkoa; o elemento definido é `kkkka3` (com 1). Usar `kkkka3` na busca no Modeler.

---

## 6. Blocos nível 3 (kkkk66 internos)

| Bloco (sub) | Tipo proposto | kkkk59 (kkkk5j) que pertencem ao bloco | Observação |
| ------------- | ---------------- | ---------------------------------------- | ----------- |
| **kkkkk8** | kkkkba kkkk67 | kkkklf de kkkkg5; kkkkaf: `kkkkk9`, `kkkklk`, `kkkklb`, `kkkklc` (ver seção 5) | Recebe casos de suspeita de kkkkg5; sucesso doc. → `kkkkk9`; kkkkby → `kkkklk`. |
| **kkkk5o kkkkh1** | kkkkba kkkk67 | kkkklf de kkkkh1; kkkkaf: `kkkkaz`, `kkkkld`, `kkkka0`, `kkkka1` (ver seção 5) | Casos de kkkka7 de kkkka8 / kkkks1; kkkkdy aq4 → `kkkkaz`; kkkkli médio → `kkkka0`. |
| **kkkkk5** | kkkkba kkkk67 | _(kkkka5 + kkkka6 para ajuste de dados/kkkkst)_ | Correções de dados, kkkkst, limites, etc. |
| **kkkka9 / Retorno** | kkkkba kkkk67 ou kkkkxc final | kkkkps: `kkkkaw`, `kkkkax`, `kkkka2`, `kkkka3`; kkkkiq finais (ver seção 5) | Resposta kkkkfv → `kkkkaw`; kkkkg3/upgrade → `kkkkax`; resultado kkkkgt → `kkkka2`. |

> **Nota:** Assim como no `kkkk3d`, cada bloco poderá virar **kkkkpo** dentro de `kkkkbs.bpmn`. Só vira **kkkkem** para outro .bpmn se houver necessidade de deploy independente (ex.: kkkk55 de kkkkh1 corporativo).

---

## 7. Interação com a kkkkgq principal

- **Entrada:** sempre via **mensagem** (`kkkk3y Start`) publicada pelos kkkkhf kkkkg2 ou por kkkk50 kkkkxm.  
- **Saída:** três possibilidades principais:
  - Atualizar apenas **kkkk1i** (kkkk3l, kkkklh, kkkkli, etc.) — a kkkkgq não precisa “acordar”.  
  - Publicar **kkkkx9 de kkkkdy** (ex.: `kkkk3x`) para que um kkkkhk macro trate consequência (kkkk3z kkkklh, cancelar kkkk3l, etc.).  
  - Encerrar o caso de kkkkfv sem impacto adicional (kkkkca apenas).

> **Pendência:** detalhar, por caso de uso, se há ou não kkkkx9 de kkkkdy para a kkkkgq, e qual kkkkhk assina esse kkkkx9.

---

## 8. kkkk7t de conclusão kkkk7u

- [x] Extrair do `kkkkk6` os **kkkkaf** do kkkkvr kkkkfv e preencher a seção 5; conferir se há outras kkkka6 além das listadas na seção 4.  
- [ ] **kkkkav com o kkkkau de kkkkag/kkkkli quais tipos de casos devem virar kkkk3y Start distintos** — pendência rastreada na tabela de pendências do kkkkh5 (`kkkk3b`, seção Pendências de classificação).  
- [ ] Definir claramente os kkkk0h (kkkkg5, kkkkh1, operacional, kkkkcg) e checar se todos os elementos estão alocados em algum bloco.  
- [ ] kkkkds o `kkkkbs.bpmn` seguindo este mapeamento e as decisões de `kkkk20`.  
- [ ] kkkkdq impacto de cada caminho (kkkkc3, kkkkda, kkkkdp) na kkkkgq principal e, se necessário, kkkkdx eventos de kkkkdy.
