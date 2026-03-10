# kkkkvj de tarefas kkkkhk — kkkkho

Lista consolidada das tarefas presentes nos kkkkhf da kkkkfj, com **tipo**, **sistema executor** e **observação**, para kkkkgt kkkkfu e integração com kkkk50.

**Este kkkkvk não substitui o kkkk5f kkkkh5.** Ele consolida as tarefas para visão kkkkfu e para responder: *qual sistema executa essa kkkk9q?*, *qual kkkkhk chama qual serviço?*, *qual domínio é dono?*

**Fonte:** [kkkk3b](../kkkk5e%20da%20decomposição/kkkk3b).

| Documento | Papel |
| ----------- | ------- |
| MAPEAMENTO_N2 | kkkk5e completo |
| **CATALOGO_TAREFAS_BPMN** | Visão kkkkfu das kkkkiq |
| kkkk2g | Integrações |
| MAPA_RESPONSABILIDADES_PROCESSO | Ownership |

**⚠ = kkkk9q crítica** (prioridade em observabilidade, incidentes e troubleshooting).

---

## kkkkgx — kkkkty

| kkkk8l | Tipo | Sistema executor | Domínio | Observação |
| ------ | ------ | ------------------ | --------- | ------------ |
| kkkkjb | User kkkk8l | kkkkra / usuário | — | seleção de segmento |
| kkkkjg | User kkkk8l | kkkkra / usuário | — | escolha kkkk1o |
| kkkklr | Service kkkk8l | kkkkb5 | kkkkgd / kkkkgk | kkkkml perfil kkkk1x |
| kkkknp | Service kkkk8l | kkkkb5 | kkkkgd | kkkkml segmento elegível |
| kkkknt | Service kkkk8l | kkkkfe | Core / Config | kkkk8g kkkk7g |
| kkkknv | Service kkkk8l | kkkkfn | kkkkfn | valida kkkktz |
| kkkk1m | kkkkem | kkkkf1 | Produtos | portabilidade kkkk7j |
| kkkkbj | kkkkem | kkkkd9 | Antifraude | kkkkgt kkkkg5 |

---

## kkkkgy — Dados pessoais

| kkkk8l | Tipo | Sistema executor | Domínio | Observação |
| ------ | ------ | ------------------ | --------- | ------------ |
| kkkkiy | User kkkk8l | kkkkra / usuário | — | coleta nome |
| kkkkix | User kkkk8l | kkkkra / usuário | — | coleta telefone |
| kkkkiw | User kkkk8l | kkkkra / usuário | — | coleta email |
| kkkki0 | User kkkk8l | kkkkra / usuário | — | coleta kkkksy |
| kkkknw | Service kkkk8l | kkkkf9 | kkkkgd | atualização cadastro |
| kkkkcx | Service kkkk8l | kkkkhq | kkkkgd | sincronização cadastro |
| kkkkbp | Service kkkk8l | kkkkgn | Regulatório | kkkkmm kkkksz |
| kkkkm5 | Service kkkk8l | kkkkb5 | kkkkgd / kkkkgk | refresh perfil |

---

## kkkkgz — Produtos e serviços

| kkkk8l | Tipo | Sistema executor | Domínio | Observação |
| ------ | ------ | ------------------ | --------- | ------------ |
| kkkkii | User kkkk8l | kkkkra / usuário | — | seleção kkkkst |
| kkkkid | User kkkk8l | kkkkra / usuário | — | kkkkmk kkkkss |
| kkkkif | User kkkk8l | kkkkra / usuário | — | kkkkmk termos |
| kkkkcc ⚠ | Service kkkk8l | kkkkhr | Produtos / Limite | kkkkml kkkk7d |
| kkkkd0 ⚠ | Service kkkk8l | kkkkhs | Produtos / Limite | kkkktk |
| kkkkoi | Service kkkk8l | kkkk0s | Core / Cartão | valida kkkkia |
| vincula_proxy_bc | Service kkkk8l | kkkk0s | Core / Cartão | vinculação |
| kkkkmv | Service kkkk8l | kkkket | kkkket | kkkkml kkkkmj |
| kkkkmy | Service kkkk8l | kkkket | kkkket | kkkkce |

---

## kkkkg0 — kkkk56

| kkkk8l | Tipo | Sistema executor | Domínio | Observação |
| ------ | ------ | ------------------ | --------- | ------------ |
| kkkkie | User kkkk8l | kkkkra / usuário | — | captura kkkks4 |
| kkkkih | User kkkk8l | kkkkra / usuário | — | definição kkkkiu |
| kkkk17 | User kkkk8l | kkkkra / usuário | — | revisão |
| kkkkc7 | User kkkk8l | kkkkra / usuário | — | kkkkim |
| analise_score_biometria | kkkkht | Biometria | Documento / Contrato | kkkkgt kkkksr |
| biocatch | Service kkkk8l | kkkkgb | Antifraude | antifraude comportamental |
| gerar_pac ⚠ | Service kkkk8l | kkkkhl | Documento / Contrato | geração kkkkhu |
| kkkke7 ⚠ | Service kkkk8l | kkkkhl | Documento / Contrato | kkkks7 kkkkhu |
| kkkkdt | Service kkkk8l | kkkkhl | Documento / Contrato | envio e-mail |

---

## kkkk7y

| kkkk8l | Tipo | Sistema executor | Domínio | Observação |
| ------ | ------ | ------------------ | --------- | ------------ |
| kkkkel ⚠ | Service kkkk8l | kkkket | kkkket | criação kkkklh |
| kkkkn5 | Service kkkk8l | kkkkeu | kkkket | emissão kkkkgw |
| kkkkn6 | Service kkkk8l | kkkkev | Produtos / Core | kkkksv tarifa |
| kkkkhv | Service kkkk8l | kkkket | Produtos / Core | kkkksp kkkkhv |
| kkkkhm | Service kkkk8l | kkkkfn | Produtos / Core | vinculação benefício |

---

## Regras de governança

Este kkkkvk deve permanecer consistente com:

- [kkkk5e kkkkh5](../kkkk5e%20da%20decomposição/kkkk3b)
- [kkkkvj de interações kkkkhk](kkkk1v)
- [Mapa de responsabilidades](kkkku6)

Novas tarefas devem ser registradas no kkkk5f kkkkh5 antes de serem adicionadas aqui.

---

## Referências

- [kkkk3b](../kkkk5e%20da%20decomposição/kkkk3b)
- [kkkk1v](kkkk1v)
- [kkkku6](kkkku6)
