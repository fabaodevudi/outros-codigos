com esse processo, a gente alimenta o tópico do pessoal do setup. E aí a ideia é que eles passem a
consumir o nosso tópico. E a alteração que a gente vai fazer é criar um step a mais, passando ali as
alterações gerais, assim, da abertura de conta pra esse tópico. Eu tenho que abrir aqui o...
Posso puxar aqui, Ogir? Pode. É que essa parte específica do setup, eu nunca mexi nela, pra ser
eu nem sei muito bem o que a gente faz lá. Se eu não tiver enganado, é essa parte aqui do setup,
setup de contas? Eu não sei muito bem o que eles fazem aqui, tá? Eu sei que... Eita, minha tela apagou aqui...
Ah, voltou. Aqui, quando eu chego nessa parte, esse aqui é um Delegate, então esse aqui é onde entra
nosso banco de dados. Toda vez que você ver esse atualizar a efetiva flexão da proposta, ou se você
clicar aqui, e você clicar em Implementation, toda vez que você ver esse cara aqui, atualizar a proposta
do Delegate. Isso aqui é um banco de dados que a gente salva a informação lá do C8. Então, o C8
transita as informações, né? E esse Delegate é um banco de dados da AWS que a gente tem. Então,
esse cara aqui a gente salva a informação. Aí, esse cara aqui, eu não sei se você conhece, tipo,
da arquitetura do C8, do BPMN, como é que funciona... Conheço, tô começando a conhecer agora, assim, tá?
Então, esse cara aqui, ele é um gateway de paralelismo. O que significa? O meu tokenzinho tá
passando por aqui, né? A proposta tá passando aqui, aqui ele divide. Então, um cara vem pra cá,
segue pra cá, e outro cara vem pra cá, outro desce. Ele meio que, tipo, duplica em dois. Então,
a proposta, ela tanto vai pra cá quanto vai pra cá. Ele faz esse processo aqui e finaliza,
que esse cara aqui termina, e a proposta continua aqui. Aí, acho que a parte é de proxy. Beleza.
Aqui, até também trazendo contexto, a ideia é que, a princípio, o pessoal do setup ainda tá olhando
pra esse atualiza e pra esse tópico que a gente tá alimentando nesse atualiza setup contas, tá?
A ideia era criar um novo stepzinho aí pra ele atualizar, pra ficar convivendo os dois por um
tempo, até o pessoal do setup começar a usar o novo ali pra depois a gente mexer, tá? Mas então,
por enquanto, a gente não ia mexer nesse atualiza setup, a gente ia criar um novo, tá? Entendi, entendi.
E aí a gente cria os dois. Tá. E aí, assim, essa alteração já foi feita pelo pessoal da digital,
a gente só vai fazer, basicamente, replicar o que eles fizeram lá pra cá, tá? Isso já tá feito lá,
e a gente só vai replicar e é só nesse pedacinho aí mesmo que a gente vai alterar. E aí aqui a gente
vai pegar todo o JSON da proposta como um todo e alimentar, sabe? Porque eu acho que hoje, se não
me engano, a galera, esse que tem aí hoje, ele só manda alguns dados específicos e a gente vai
fazer o JSON da proposta inteira e aí o pessoal lá de setup que vai pegar o que interessar e de
informação pra eles. Aqui, cês sabem também, ou quando cês forem olhar, quando o pessoal fala da
digital, é esse cara aqui, ó, jornal do tapete laranja. Eu não sei só se eles já fizeram e tá em
produção, se tá em homologação, mas se eles já fizeram, né? Se tá em homologação, aí cês procuram
o tapete laranja aqui, ó. Vamos ver, ó, esse cara aqui, jornal do tapete laranja. Se você pegar, se vocês
verem, tipo, a estrutura é muito parecida com o nosso. Muda, tipo assim, inclusive o começo aqui, né?
Muda um pouco, mas se vocês pegarem, tipo, a estrutura é muito parecido. O nome, dados e-mail,
a check-in. Isso aqui deve tá lá pro final, ó, a parte do... Essa aqui é a parte do back office, né?
Que a gente manda a informação, tipo, ou tem back office, aí desce pra cá, cê não tem
conteúdo. Se eles fizeram, deve tá aqui, ó. Aparentemente, não tá aqui, não.
Cê tá pedindo contas. Eu acho que esse atualiza status proposta efetivada ali, ó. Tá, esse atualiza
status de proposta efetivada. Se você ver, tá igualzinho o nosso. Ele, na verdade, ele é um delegate.
Ali em cima. Esse aqui? Não, é o... Lá no outro desenho, depois do atualiza efetivação,
depois do delegate lá em cima. Ah, achei aqui. Entendi, tá certo. É esse aí. Tá. Atualiza status proposta
efetivada. Boa. É só essa... Isso aí que a gente vai adicionar aqui, da mesma forma que eles tão
fazendo, a gente vai adicionar aqui, que a gente entendeu que a demanda era o que eles fizeram,
atendia o que o pessoal precisa aqui do nosso lado também, tá? Boa. Então é esse daí do atualiza status.
Aí a gente até combinou ali que eles criaram o status 44, é isso, né, Fábio? Cê sabe quem que
fez isso aqui? É, Matheus. Quem conversou com a gente foi o Matheus. Matheus Rosa? Isso. Tá.
Ele que passou aqui pra gente o que ele tinha feito e a gente viu que fazia sentido seguir ali da mesma
forma. Ele tá mexendo num delegate aqui também. É basicamente um delegate de proposta.
É o que ele falou ali que era essencial que a gente colocasse esse democratiza aí pra poder, né?
Ele colocou uma informaçãozinha a mais aqui, ó, é de proposta. Não, é de proposta não, tem metadata
skin, mas tá aqui, status proposta, mais uma mais, proposta. Aqui, novo democratiza proposta,
vamos ver se ele tá aqui, democratiza sim, democratiza sim. Acho que é o democratiza
Kafka. Ah, democratiza Kafka. De fato, democratiza Kafka, esse cara aqui. Entendi. Tá. Aí o meu,
eu nem lembro mais o que eu fiz. Cara, eu nem lembrei que eu comi ontem.
Ah, eu fiz do agro, mas eu nem lembro aonde que eu mexi. Aqui.
Eu tô abrindo aí.
Ah, tá. O meu eu vou mexer aqui. Aí é mais umas boas
coisas também, mais pro Fábio. O que que eu geralmente faço, tá, quando eu subo em homologação?
Eu pinto de roxo, ou sei lá, qualquer outra coisa que vocês quiserem aí. As peças que, tipo assim,
é novo, sabe? Por exemplo, eu mexi aqui, né? Aí eu deixei em roxinho. Olha, se caso tiver,
a gente pode impactar vocês, tá? Porque, por exemplo, se eu subir o agro agora,
a gente vai começar a testar. Aí provavelmente pode dar problema, ou sei lá, se caso der problema aqui,
ele ele trava a jornada pra vocês.
Mas, assim, em vias, a gente impacta vocês e vocês não impactam a gente, tá? Quando a gente for subir
o agro aqui e o b2b. Então, assim, é mais fácil a gente impactar vocês. Se caso vocês tiverem
um problema. Por que que você impacta? Porque, ó, tá vendo a minha alteração aqui? Ela é bem no
comecinho. Tipo, quando eu começar a mexer no agro, quando eu for começar a testar a parte do agro
aqui, né? Porque isso aqui é tudo novo. Então, por exemplo, essa caixinha dá problema, né? Porque,
às vezes, a integração, enfim, tá? Pode dar ele problemas. Se tiver qualquer tipo de problema,
vocês vão conseguir avançar. Então, imagina, assim, a alteração de vocês tá lá na frente. Tá,
tipo, tipo aqui, ó, a alteração de vocês. Tá bem no final. Vocês ainda, tipo, assim, vocês seguem a
jornada inteira pra vocês chegarem nesse ponto específico, né? Que vai criar a caixinha nova.
Você segue a jornada inteira. Aí, quando terminar a jornada, ia ter essa parte que chama de pós-jornada,
que seria a parte ali do que o cliente e o gerente não veem, né? E aí aqui, se der problema pra vocês,
vai dar aqui na frente. Pra gente, né? Se der problema, as alterações que eu fiz tá aqui. Então,
bem no comecinho do fluxo, tipo, a proposta não vai andar, sabe? Então, é mais fácil a gente
impactar vocês. Tá. Aí, assim, impacta no sentido do tipo assim, ah, eu vou fazer o regressivo. Eu
vou mandar com tudo isso aqui. Ah, aí eu não sei, eu acho que era bom colocar a Gabi aqui e a Mi,
mas, assim, dá pra conviver, não vejo problema, mas é como eu falei, se impactar é a gente que vai
acabar impactando vocês. Se caso começar a dar problema aqui, ter que mexer e blá, blá, blá.
Se a gente precisar subir antes de vocês, o de vocês ele, assim, dá pra subir desligado,
não impacta o fluxo atual ou... Dá, porque aí, até onde eu lembro, a gente vai ter chave aqui agora,
né? Então, só pra você entender o que a gente tá fazendo. Esse aqui específico do agro, ele é uma
nova categoria que a gente chama, né? O gerente, ele tem uma carteira específica, a funcional dele,
agência dele, ele vai ter tipo agência agro. E aí, se o cara for agro, tipo, considerado agro,
ou gerente, aí o cliente ele pode ser considerado como agro também. E aí, eu tenho que meio que
fazer uma marcação. Então, se caso o cara for recusado, ele cai pra cá, pra essa parte aqui.
Aí aparece um modal, tipo assim, olha, você é gerente agro, beleza, tudo bonitinho, mas o cliente
não é agro, o cliente não foi aceitar, não aceitou. Se não, ele segue a proposta como agro mesmo,
passa por todas as caixinhas normalmente. Mas eu acho que é isso, Gi. A gente tem mais possibilidade
de impactar vocês do que vocês a gente. E aí, tem que ver mais com a Gabi, com o Amido, tipo assim,
por mim, eu geralmente fazia homologação, né? Mas aí é mais com elas, ver o que elas acham,
porque assim, às vezes, aí começa a carregar, né? Tipo, aí carrega problema daqui e carrega problema
de lá. Que, cara, sempre dá xabu, sabe? Não é um negócio que passa liso de primeira. A gente tem que
ficar testando e tals. E aí, se caso a gente fizer com chave, se a gente desligar, essa funcionalidade
não afeta, né? Ela passa reta. Acho que vale, então, a gente ver com a Milena e com a Gabi,
deixa eu chamar elas aqui, peraí. Se elas conseguirem para vocês. Ah, já puxou aqui. Ah, pode ser.
Mas de qualquer forma, a gente também vai precisar alinhar com a Luna e com o Zé Léo e também
com o Rapão hoje para entender como funciona aqui essa iniciativa. Meninas, puxei vocês aqui.
Obrigado, viu? E aí? O que que tá acontecendo? Um pouco com o texto. Só para alinhar a jogatina
e fazer aqui, coisa rápida, tá? Eu tava vendo com o pessoal aqui, com a Gi e com o Fábio,
sobre a nossa subida e a subida deles, né? Aí eu tô chamando vocês para mais entender
assim como que vocês querem fazer essa validação. A validação que eu tenho é que a gente aqui da
Core vai impactar mais vocês do que vocês da Hentab, da nichos, né? Do que vocês com a gente.
Porque a nossa alteração tanto do Agro quanto do B2B vai ser bem no comecinho do BPMN, né?
Então se tiver erros ou afins que a gente for homologando e tendo que resolver, a gente vai parar
bem no começo. Então assim, imagina todo mundo subindo junto, né? Todo mundo começa a homologar.
A gente vai começar a passar proposta. A nossa tá bem no começo. Então provavelmente quando tiver
problema a gente vai impactar vocês porque vocês vão conseguir avançar no fluxo. A alteração dos
jogos aqui vai ser bem no finalzinho, nessa parte de setup de conta. Aí a validação que eu tenho é
que assim, a Core impacta mais do que vocês da Hentab. Então eu chamei vocês duas para ver como
que a gente vai alinhar esse jogo. A gente pode subir junto. Vocês querem que cada um suba separado.
Mas espera, a gente tá falando do que aqui, Rafa? Do AD? Porque o que tá em ambiente hoje é o AD e só, e modal?
Não, é que, Gabi, só reforçando aqui, hoje mais cedo a gente tinha, quando a gente estava passando a reunião lá do backlog,
lá no step do BPMN do C8, o Rafa já tá fazendo o ajuste do Agro e tinha mais alguma coisa da Core,
não me engano. E aqui na Hentab a gente tá precisando realizar um ajuste no evento que é propagado
para o time de setup, de engajamento, de conta efetivada com sucesso. A gente tem que mandar
diferenciar um parâmetro para o time conseguir ter clareza, o time do setup, ter clareza dessa
forma aberta e de como os produtos que foram ofertados, basicamente, pelo que eu tinha entendido com a Pamela.
Por conta disso, vai ter que uma convivência entre o que o Rafa já tá fazendo, porque o Rafa já tá adaptando
o Agro aqui para o C8, só que o Fábio, essa semana, vai mexer aqui no step do... Na verdade, a gente não vai mexer
no step, a gente vai adicionar mais um novo step dentro aqui da esteira de BPMN, entendeu? Só que enquanto vocês
estão no começo, a gente tá aqui quase no final aqui da abertura de conta, sabe? E esse é o ponto que o
Rafa tá comentando que pode gerar impasse, porque se vocês pegarem algum erro aqui no Amol agora,
a gente não consegue ter convivência. Ficou claro? Ficou, agora ficou. E vocês pretendem colocar isso
aqui? A gente quando? Esse ajuste de vocês? Gabi, a gente vai começar a fazer isso essa semana e acho que
provavelmente aí, Fábio, e de que dia que vocês acham que já reflete o Amol? Ainda essa semana, né?
E mais um ponto aí, Gabi, é que assim, na teoria por complexidade, o deles é menos complexo que o
nosso, né? Porque o nosso tem um monte de caixinha nova, vai ter que ter integração com o front, vai
o nosso tá bem mais chatinho, assim. É, são duas semanas grandes aqui, né? Vocês é mais simples mesmo.
A deles já tá meio que até inclusive pronta, o pessoal da digital já fez. Eu acho que dá pra conviver
os dois, mas pode ser pela urgência ali também, pela facilidade. Acho que vale a pena deixar eles
fazerem o deles, se vocês não quiserem testar isso junto, sabe? Eu acho que vale a pena deixar
o Amol primeiro, porque o nosso pode até semana que vem, certo? O B2B e o agro? Então, o que eu sei de B2B e agro?
Que ele veio com calor e priorizado, mas aí de semana passada pra cá, não é que foi despriorizado,
mas a atenção, o foco mudou um pouquinho. Então, até o Léo pediu pra não pôr em Amol ainda,
até terminar os modais. Só que a gente deve terminar os modais entre hoje e amanhã.
Aí o que tem que ver? Tem que entender com o Léo se quando entregar os modais, se já é pra subir os dois,
porque se for, vai conviver com o Hentab. E aí se conviver com o Hentab nisso aqui, a gente vai poder
impactar ele sim. Então, é bom ver com o Léo qual que é, porque eu não tenho cronograma, Rafa,
de como que tá o backlog, aí é com o Léo mesmo. Porque ele tem mais noção da expectativa de homologar
os dois frentes, né? Então, assim, eu acho que um plano legal pra vocês aí quando vocês forem
conversar com a Pan, com o Léo, com a Lu, eu entendo que, já que a gente tá com prioridade,
a gente termina a parte dos modais, vocês depois sobem de vocês, que é a parte aqui do setup que
a gente tava discutindo, finaliza a parte setup que eu acredito que é mais rápido, e aí depois a gente
faz uma agro aí com o B2B. Eu acho que, assim, pela pela complexidade e pelo que a gente avaliou
aqui, eu acho que a sequência é mais lógica, só que bater o martelo mesmo, eu acho que é mais
eles, né? Porque eles que sabem, assim, o apetite de fato que tem que entregar primeiro. Dá pra
conviver os dois? Dá, mas provavelmente a gente vai impactar vocês. Daria pra gente por chave,
já que o nosso agro, o nosso B2B, é no começo da jornada, daria pra colocar alguma decisão ali
pra tipo, se igual a gente fez no bassim, porque aí no pior dos casos, daria pra homologar a nossa
frente desligada, eles validam ligado e sobe. É que a gente não teria tanto ganho também pensando
na entrega em si da cor, mas pelo menos daria pra conviver e não impactaria o rentabilização.
Isso se o prazo for mega apertado lá do B2B do agro, que eu não sei. Mas eu acho que questão de
chave a gente tem que sempre subir agora com chave, né, Gabi? Dependente do... Tem, só que aí tem que ver onde
ela vai ficar. Raramente ela fica no C8, né? Geralmente a gente coloca lá no que config.
Porque aí teria que ter uma chave tanto pro agro quanto pro B2B, né? Então os meninos criaram no
front, só que aqui a gente tá falando só de C8. Não, mas aí se caso eles desligarem a chave e não
mandar mais, aí beleza, não tem problema. Não poderia ter um cenário onde o C8 sobe sem front, ou teria?
Não teria problema de subir, porque o C8, as variáveis que eu tô de cabeça aqui, né? As variáveis
que eu tô colocando, elas não são required. Tipo assim, o C8 não depende dela pra... Dá pra seguir
sem a variável, tá? Tá bom. Gente, eu acho que é isso. Então o plano é esse. Acho que é mais
pra ajustar agora com o Léo e com o pessoal aí. É, eu acho que vale entender com ele a quando que
ele pretendia que a gente homologasse o B2B e o agro pra subir. Porque aí se tudo bem, se for mais
pra frente, cês vêm primeiro. Agora se for logo, aí teria que conviver. Eu vou conversar com o Léo
pra entender aqui se a gente prioriza aqui o nosso, ou se a gente convive, mas entendo que se precisar
conviver, a gente convive aqui. É, meio que não tem muito tempo por aqui. Não vou aqui discordar
disso, mas eu vou conversar com o Léo ali só pra alinhar então com ele qual é o tempo que ele tá
falando disso aqui ficar disponível ele protestar, tá? E aí qualquer coisa.
Fechou. Porque é isso, Gigi. O que tá no nosso, nós meros mortais, o que chegou no nosso ouvido é
gente, seguem o desenvolvimento, mas não coloquem homologação ainda porque não é o foco. Sim. Mas aí
quando que esse foco vai mudar? Já essa semana? Não sei, entendeu? Aham. Beleza. Diga, Amy.
Tem uma possibilidade aí de testar também qualquer coisa sem impactar um ou outro, né? Você
criar um outro BPMN ali apartado do que a gente usa. Sim, também dá. Aí você poderia fazer os
testes que você precisar dentro desse BPMN que você tá atuando. E aí se caso você precisar de
um front, eu posso te ajudar depois a, sei lá, rodar um front que chama esse BPMN. Só pra vocês
entenderem, né? Tipo, porque assim, a gente vive lutando aí por ambiente, né? A gente já tem
inclusive um BPMN aqui, a parte. Esse cara aqui, ó. Teste, teste. A gente usou isso acho que uma
vez só, né Rafa? É, a gente usou uma vez só. Aqui, ó. Teste parcial. Esse cara, ele é um outro BPMN
que a gente tem, né? Que a gente inclusive fez teste, né? Porque a gente tava meio que apertado.
Porque assim, se realmente apertar o calo, o que que dá pra fazer? É que só pra vocês entenderem,
ele é um BPMN dentro de outro BPMN. Então imagina que esse aqui, né? O teste que eu consigo subir
aqui, né? Então imagina, eu colocaria o agro e o B2B aqui pra testar. Só que da onde que ele vem,
esse cara, como que a gente fez isso, né? A gente tá no nosso aqui, no nosso BPMN, que é esse aqui,
né? Que é o, por exemplo, aí vocês colocam de vocês o setup aqui. E aí eu faço uma perninha,
bem no comecinho aqui, eu pego uma variável, acho que chama subfluxo atual, que se eu não me engano,
eu coloco tudo que for teste, quando vier subfluxo atual igual a teste, eu crio uma perninha aqui,
e aí ele, daqui ele sai pra, pra ir praquele outro BPMN. Ele sai de lá, ele vem pra, ele sai daqui e
vai pra lá. Então ele não segue por aqui. Então vocês passariam os testes de vocês por aqui,
o homologação normal, né? Que a gente tem, que a gente sempre utiliza. E aí os nossos testes,
eles vêm um daqui, e aí quando caso ele tiver aquela flag teste, né? Ele desce pra cá,
e daqui ele vai pro outro de teste. Dá pra fazer isso também, uma possibilidade?
Acho que vale analisar a necessidade de qualquer coisa, é um bom, é uma boa alternativa. Tem essa
alternativa também, tá? Beleza. E ainda mais que tá no começo, a gente tem as informações do começo.
É isso, gente. Beleza. Mas eu vou falar aqui com o Zé Léo pra entender, e aí a gente,
e eu aviso lá no chat, tá gente? Gente, eu já comi um pouco bola aqui. O do B2B ficou muito claro pra
mim. Só que a questão é que não tá mais pro agro do que pro B2B, porque o agro já tá em homologo.
Então, só que... O agro não tá em homologo, não. Não? Não, o que tá em homologo é que é confuso.
O nome faz a gente confundir. O que tá do agro em homologo, que tá até em prod, é o CNPF, que é
quando a gente tem um CPF agro pra vincular como pagador. Aí é só um matou golzinho ali pra falar
pro gerente, quando ele for abrir uma conta com o SPI, colocando o CPF agro ali no CNPJ,
tem que mandar como CPF agro, mas só naquela tela. Só uma flagzinha que ele muda lá no IQ3,
na base de cadastro, o tipo de pessoa ali pra F, de J pra F. Mas é só essa partezinha,
que não tem nada a ver com o segmento agro, sabe? Isso. Só que esse ponto aí tem ajuste no C8 ou não?
Tem. Porque aí agora, Pedro, é o que eu fiz. Imagina que agora assim, eu tenho uma pessoa que
ela é segmento agro. A gente tem o segmento 3, L e 4, certo? Então são os segmentos principais
que a gente trabalha. E mais o segmento I. Quando é segmento I, pro banco ele descarta,
ele não tem 3 comercial. Agora, além desses 4 segmentos que a gente tem, a gente vai ter um novo
segmento, que é o segmento agro. O segmento agro é o segmento 4-1-1-5. Eu vou bater na casinha do
direcionador lá agora e vou falar assim, ô fulano, qual que é esse segmento? É segmento agro,
e agora é segmento 4-1-1-5, que é o segmento agro. Só que no final das contas eu tive que fazer
alteração, porque esse segmento 4-1-1-5 a gente não transita ele. É tipo assim, eu trabalho com
segmento 4, segmento 3, segmento L. Fora esses, eu teria que mexer em um monte de outra coisa,
pra eu poder fazer contratação de produto, fazer contratação de tarifa. Então tudo envolve esses
segmentos, só que agora eu tenho que fazer meio que uma transformação. Eu recebo do cara lá do
direcionador, olha, o segmento dele é segmento agro, 4-1-1-5, só que eu tenho que transformar
esse cara em segmento 4. Então eu tive que fazer as alterações, isso é 8, né? E aí todas essas
alterações que eu fiz aqui pro agro, elas são feitas no começo. Então eu recebo do direcionador,
agora o cara é segmento 4-1-1-5, só que eu tenho que transformar ele em segmento 4,
porque se eu não consigo transitar durante todo o fluxo. Esse é o agro que a gente tá fazendo.
Ele vai começar agro, vira, sei lá, persona, passa a jornada inteira,
persona, quando efetiva volta a ser agro. Exatamente isso. Quando efetiva não, no fim do fluxo ali, né?
Ele não chega a ser segmento, ele vai continuar como segmento 4. No final da efetivação eu de
fato mando ele como 4-1-1-5, na efetivação de conta, que aí eu tive que alterar aqui também,
no finalzinho. Eu tive bastante alteração, mas aí pro efetiva conta aqui ó, pro efetiva conta,
o cara é agro, mas o segmento dele é 4. É basicamente isso, do segmento agro.
E depois ainda tem o B2B, né? Que aí é outro cliente. Não sei se ficou muito claro, Pedro.
Ah, não ficou sim, né? Eu só preciso, Gi, aí eu não sei se você quer puxar por aí,
eu também posso puxar por aqui pra gente alinhar com os meninos, tá? Eu só queria realmente já
encerrar esse tema aqui do setup o quanto antes. Eu já mandei uma mensagem aqui pro Zé Léo,
mas eu tô entendendo que não é nenhum problema a gente conviver, dado que a gente ainda tem a
mensagem ali de separar as coisas ali por ter um outro cenário de teste, né? Então eu tô
confortável da gente seguir com a convivência aqui, tá? Eu acho que assim, Gi, dado que o Léo já
falou isso, o que a gente pode fazer? A princípio a gente convive junto. Se a gente começar a ter
muito problema aqui no início por causa do agro, a gente parte pro plano B, que seria criar a perninha
ali e mandar via o outro ambiente. Aí eu construo essa parte e aí a gente meio que deixa livre pra
vocês. Pode ser? Acho que a gente pode tentar, porque às vezes a gente tá esperando que tenha
problemas e pode ser que não tenha que a convivência seja tranquila, né? Isso, pode ser que assim,
não dê nenhum problema e a gente siga tranquilo, mas se a gente ver que tá enroscando aqui do nosso
lado, aí eu faço isso. Eu crio a perninha e mando pro outro BPMN. Já adianto que costuma ter bastante
problema. Gente, eu tô tentando ser otimista. Dessa vez eu não seria otimista não, pelo que a gente tá pegando aqui,
porque eu queria muito também que fosse um negócio mais fluido, mas assim, costuma dar uns barulhos,
uns enroscos grandes e ainda mais que a gente vai subir pelo visto duas features juntas da Core aqui,
eu acho que a gente vai gastar pelo menos com ajuste de integração um dia e meio, dois dias,
só pra integração, mas enfim, vamos conversando. Eu mandei mensagem pro Zé Lé, eu tô esperando ele
me responder aqui sobre os prazos, tá? É, então, porque ele falando os prazos vai ajudar muito,
porque eu também não sei. Tá, eu perguntei aqui pra ele, é ele, mas eu entendo que tendo a possibilidade
da gente ter a perninha ali, acho que dá uma ajudada aqui no cenário de teste pra gente seguir
os testes. Eu iria por esse caminho se a gente precisasse conviver, tá? Show. Mas eu vou só
confirmar aqui com ele, quando ele responder aí a gente. Mas o que eu queria mesmo que o Léo falasse,
que vocês podem ir na frente, e aí vocês vão de boa sem a gente impactar vocês, depois a gente
entra com a Agro e com o B2B, mas eu não sei se ele vai falar isso. Eu e o Rafa gostamos dessa ideia, né Rafa?
Eu gostei dessa ideia também, mas não sei. Tá, vou esperar ele responder aqui, tá? E aí eu aviso,
gente. Fechou. Mas eu já puxei aqui, tá Pedrinho? Já mandei mensagem pra ele. Tá, porque qualquer
coisa eu também posso colocar lá no chat do backlog, tá? Porque lá já tá todo mundo, aí eu dou
arroba na Luma, na Fê, no Rafa, e aí já fica lá de... com todo mundo, né? Acho que a gente pode
formalizar lá depois que a gente... Porque como eu já mandei mensagem pra ele aqui direto, aí a
gente formaliza lá pra ficar registrado, né? Fechado, a gente fica combinado assim, querida.
Fechou, gente. Fechou, gente. Vai, valeu, gente. Até mais, tchau, tchau. Ô, Gabi, rapidinho. Eu.
Cara, eu tô tentando dar uma olhadinha no... aqui o Omol lá na efetivação do Day 4. Pra mim só
sobrou a última alternativa, se caso for, que eu acho muito difícil, a external task. Eu vou dar uma
olhada pra ver se alguém alterou, mas eu acho que não. E aí, assim, não é com a gente, porque eu
até já voltei o BPM mini de produção. Coloquei a homologação e mesmo assim tá dando o mesmo
erro, né? Eu vou chamar o pessoal aqui, dar uma olhada pro Domingo Ailton, pra ver se ele consegue
dar uma força, mas aparentemente não é a gente, tá? É lá com o pessoal do Day 4 mesmo. Tá bom,
mas eles responderam lá? Responderam, ela deu uma olhada lá, ela falou que não conseguiu achar
nenhum erro. Aí, aquele erro de efetivação que você tinha encontrado, eu passei uma outra proposta
que eu tive e peguei que a Gabi passou, eu não consegui ver erro, tipo tava dando 200 na chamada.
Antes tava dando 400 lá, 500, nem lembro. E gerou a PAC desses? Chegou bem? Não, ele fica... o que
que acontece? Ele bate lá na parte geral Day 4 e aí ele dá... ele dá erro. Aí tem um negócio que
eu nunca vi na vida aqui, primeira vez. Aparece assim, tarefa, lançando BPM N, erro. Só que assim,
eu nunca vi isso e tá tudo de produção. Então assim, minha única alternativa, minha última
alternativa pra ser agente é olhar agora a external task. Se eu ver que não alterou external task,
cara, é com eles lá, não é com a gente de fato. Eu queria um log mais assertivo pra ver o que que
o external task tá mandando Day 4. Isso eu não consigo ver no datadoc. Não tem, não tem. Isso é uma porcaria, tá?
A gente não tem chamada tipo da external task pra ver o que que tipo de fato aconteceu.
Ai, ai. Vou dar uma olhadinha aqui. Mas aí você me fala qualquer coisa, porque lá do lado deles,
lá a menina explicou que ia datando 200. Não, tudo bem, o 200 tá acontecendo, mas não tá fluindo
todos. Ele tá no loop infinito. Aí ele vê, dá o erro e volta pros 15 segundos, aí vai, depois volta
pros 15 segundos e fica nesse loop infinito e nada acontece. Romi, mas aí enquanto vocês disseram que
o AD desligado também tá quebrado, é esse mesmo ponto ou é outro ponto? É a mesma coisa. É a mesma coisa, né?
Mas fora isso não tem mais nenhum bug pra desligado do AD. Não, aí só tem os bugs referente ao
mesmo ali na exibição ali pro cliente. Mas é só com a chave ligada, né? Isso. Tá bom. Tá acontecendo também
com a chave desligada agora de volta aqui em person. Mas é só na exibição ali da do front pro cliente,
ali não tá impactando ali no fluxo, tá? No fluxo ele tá persistindo normalmente como se tivesse
contratado certinho, mas tá quebrando a tela pra mostrar pro cliente o que que ele tá contratando.
Ah, então. Só que aí esse é um ponto importante que acho que já prejudicaria a subida da cor do
MFE confirmações, né? É, não, não dá pra subir desse jeito, tá? Então tá, então tem dois pontos, né?
Esse da PAC e esse do visualização do AD. Pra desligado também tá bichado a visualização?
Sim, em person, em person sim, já em barijo não. Barijo e uniclass não. Tá bom, beleza.
Aí eu vou te atualizando no decorrer do recontro. Tá, fechou. Obrigada. Fechou aqui, gente.
Fechou. Fechou, obrigado, gente. Valeu, gente. Tchau, tchau.
Tchau, tchau.
E aí, pessoal, boa tarde.
É, gente, essas agendas nossas tão encavalando tudo, hein.
É, tá, realmente tá tendo muita, muita coisa na frente da outra, assim, emendando.
É, a gente fica perdido mesmo. O volume nosso de informação tá bem alto.
Boa tarde.
Opa, eu posso te puxar rapidinho pra alinhar contigo umas coisinhas? É cinco minutos.
Pode, pode. Tá, gente, vou pegar aqui a panela rapidinho, tá? Só um minuto. Liscença, rapidinho.
A G foi pegar uma água e ela já entra, tá? Tá, ok.
E aí, gente, eu vou pegar aqui a panela rapidinho pra alinhar contigo umas coisinhas, tá?
Boa tarde.
E aí, gente, eu vou pegar aqui a panela rapidinho pra alinhar contigo umas coisinhas, tá?

WEBVTT

00:00.000 --> 00:05.400
que a gente tivesse o NPC. Então, a princípio, aqui no VQ, a gente não envia esse campo,

00:05.400 --> 00:21.240
eles vão entender que é VQ. É isso, né? Isso. Eu não sei, mas é VQ. É tudo VQ.

00:30.000 --> 00:44.000
É, esse ponto tem certeza, tá? Não tem VQ mesmo. Acho que deve, não. Não aqui no nosso contexto.

01:01.000 --> 01:07.000
Hoje, o que a gente envia? A gente envia esses dois valores.

01:10.000 --> 01:17.000
A gente envia esse valor cartão pré-aprovado ou esse valor limite pré-aprovado.

01:30.000 --> 01:35.000
A gente envia esse valor.

02:01.000 --> 02:10.000
Aqui, você conseguiu pegar um JSON com as informações que a gente vai enviar.

02:18.000 --> 02:24.000
Mas você conseguiu chegar a validar que a gente vai começar, que a gente vai passar a enviar?

02:24.000 --> 02:30.000
Você conseguiu extrair essa informação para a gente comparar o JSON que eles estão esperando?

02:32.000 --> 02:38.000
E isso? Esse JSON do que a gente vai enviar? Você conseguiu extrair ele?

02:38.000 --> 02:45.000
Agora, é só um segundinho.

03:08.000 --> 03:13.000
Agora, é só um segundinho.

03:38.000 --> 03:43.000
Agora, é só um segundinho.

04:08.000 --> 04:13.000
Agora, é só um segundinho.

04:38.000 --> 04:43.000
Agora, é só um segundinho.

05:08.000 --> 05:13.000
Agora, é só um segundinho.

05:38.000 --> 05:43.000
Agora, é só um segundinho.

06:08.000 --> 06:13.000
Agora, é só um segundinho.

06:38.000 --> 06:43.000
Agora, é só um segundinho.

07:08.000 --> 07:13.000
Agora, é só um segundinho.

07:38.000 --> 07:43.000
Agora, é só um segundinho.

07:43.000 --> 07:48.000
Agora, é só um segundinho.

08:06.000 --> 08:11.000
Oi, desculpa. Voltei aqui.

08:13.000 --> 08:34.000
Isso, isso, é, acho que foi um erro aí na hora de transcrever alguma coisa, mas é ver que mesmo. Aqui, sabe aquelas variáveis que a gente passa hoje no tópico?

08:43.000 --> 09:00.000
E hoje a gente passa e para eles vai ser tranquilo, né? Só esse do que a gente já envia hoje mesmo, porque assim, eles até têm outras coisas lá que eles esperam.

09:00.000 --> 09:11.000
Mas, mas a princípio que eles vão consumir é só o que a gente já envia hoje para eles. E eu entendo que como a gente já envia, não vai ser um problema, né?

09:11.000 --> 09:16.000
Isso, é isso. Você olhou e tá, e tá ok.

09:41.000 --> 09:59.000
Entendi.

09:59.000 --> 10:02.000
Tá.

10:02.000 --> 10:12.000
E daquilo lá, você falou que nada é impeditivo, então, para já começar a fazer. Seria mais bom confirmar ali antes de entregar isso, né?

10:12.000 --> 10:20.000
Ou tem alguma coisa específica que você precisa que a gente cobre ali, que eles respondam antes da gente criar a história aqui?

10:32.000 --> 10:57.000
Sim.

10:57.000 --> 11:13.000
Tá. E aí, toda a parte de NPC, a princípio a gente não precisa preocupar, tá? E aí, na demanda do NPC, a gente volta e vê. A princípio a gente só precisa focar aqui no ESIS mesmo, no que tá no VQ.

11:13.000 --> 11:20.000
Tá. Não, era mais para entender aqui com você se tinha algum, algum ponto que estava impeditivo, sabe?

11:20.000 --> 11:25.000
Para, se há alguma coisa que está faltando assim, para você poder começar.

11:25.000 --> 11:40.000
Mas estou entendendo que não, né? Que a gente pode ali cocar a história para começar a fazer essa alteração e depois a gente só valida se tá ok ali. É isso, né?

11:40.000 --> 12:00.000
Sim.

12:00.000 --> 12:18.000
Tá. Beleza.

12:19.000 --> 12:38.000
É, acho que aí eu vou passar aqui para a pãe para o Pedrinho, porque eles que vão abrir aqui, acho que eles que vão abrir a história, mas aí a gente vê a parte do preenchimento.

12:39.000 --> 12:51.000
É porque aqui, até para explicar, né, não sei se a pãe passou essa visão, lá dentro do yuclique, ele tem a ya lá, que ele tem o padrão dele, né?

12:51.000 --> 12:56.000
Se a gente coloca do nosso padrão lá na descrição da história, às vezes ele abaixa a nota da história, sabe?

12:56.000 --> 13:07.000
Aí tem uns problemas, aí meio que a gente acaba colocando vinculado a um arquivo com o nosso jeito de escrever e na descrição vai estar, acaba deixando o jeito que a ya pede, porque senão ela abaixa a nossa nota, sabe?

13:07.000 --> 13:14.000
É ruim, mas é assim que funciona.

13:14.000 --> 13:24.000
Ah, só Deus sabe o que que ela, assim, a gente vai colocando algumas informações lá e ela gera, e aí o que ela gera nem sempre atende a gente, sabe?

13:24.000 --> 13:29.000
E a gente não tá tentando entender aqui como que escreve de um jeito que atende a gente ali para, mas tá difícil.

13:29.000 --> 13:41.000
Aí num geral a gente acaba vinculando ali um arquivo, botando o arquivo como referência e deixando a história do jeito que a ya escreve mesmo e usando o arquivo como referência, sabe?

13:41.000 --> 13:47.000
Porque a ya em si ali não tá sendo, não tá ajudando a gente 100% aqui.

13:47.000 --> 14:03.000
É, então, aqui acho que o que a PAN tá fazendo é isso, ela tá, ela vai, eu até tinha encaminhado esse documento para ela, para ela usar para geraiar.

14:03.000 --> 14:15.000
Aí a gente vai ver se o que ela gera é suficiente, tá? Mas pode ser que não fique tão bom, e aí você usa o, a gente pode deixar esse arquivo lá vinculado na história para ser consultado,

14:15.000 --> 14:32.000
porque às vezes ela não vai colocar todas as informações ali que a gente achava necessário e se a gente altera na mão, ela reclama, a plataforma reclama.

14:32.000 --> 14:41.000
Sim, a ideia é que isso seja feito primeiro e aí depois vem a demanda do múltiplo. É como a gente ainda tem aqui alguns refinamentos do múltiplo para fazer?

14:41.000 --> 14:47.000
E aqui, assim, né, não sei, eu tô entendendo que aqui não é tão complexo essa alteração, né?

14:47.000 --> 14:58.000
Porque é só para entender que é criar ali aquela nova caixinha e pegar tudo que a gente tem ali, tudo que a gente tem até o momento ali daquela caixinha e mandar para o tópico, né?

14:58.000 --> 15:00.000
A princípio.

15:06.000 --> 15:08.000
Sim.

15:12.000 --> 15:14.000
Sim.

15:15.000 --> 15:16.000
Sim.

15:16.000 --> 15:19.000
É isso, eu vou combinar com o pessoal, tá?

15:19.000 --> 15:21.000
É...

15:21.000 --> 15:47.000
É, essa parte aí aqui, a gente... Eu vou combinar com o pessoal, tá? A gente vai fazer esse combinado, mas assim, você acha que quando você pegar essa parte, você consegue assim dar uma estimativa, assim, enquanto o tempo que demora ali para fazer,

15:47.000 --> 15:54.000
para a gente já poder alinhar com o pessoal os tempos ali para testar. Claro que é assim.

16:17.000 --> 16:19.000
Sim.

16:38.000 --> 16:40.000
Sim.

16:41.000 --> 16:43.000
Sim.

16:59.000 --> 17:04.000
Mas você consegue assim dar uma estimativa só do desenvolvimento?

17:10.000 --> 17:12.000
Sim.

17:13.000 --> 17:16.000
Então, a gente não tem muito...

17:16.000 --> 17:26.000
Uma regra, né? Mas se você quiser me falar enquanto o tempo você gasta assim mais ou menos uma estimativa, não tem problema. Aí depois a gente pontua.

17:31.000 --> 17:33.000
Tá.

17:34.000 --> 17:39.000
Se você começasse isso hoje lá para ter, só estaria disponível para testar.

17:46.000 --> 17:57.000
Tá. É, assim, a gente vai precisar só alinhar ali, quando é que a gente vai poder subir, né, para uma alugação, porque a gente acabou disputando ali o ambiente, né?

17:57.000 --> 18:02.000
Mas aí dá para você ir fazendo e aguardar para poder subir, né?

18:03.000 --> 18:15.000
Tá. Então, eu vou pedir para criar aqui a história, para você já começar enquanto a gente vai aguardando ali a resposta para ir para já planejar as partes do teste.

18:15.000 --> 18:21.000
Mas, a princípio, o desenvolvimento para você estar ok e já abrir a história para você começar, né?

18:22.000 --> 18:31.000
Tá. Mas aí eu vou esses pontos aqui e depois, se eu ver que eles não vão responder ali, com a coisa eu puxo eles e a gente bate os pontos, tá?

18:31.000 --> 18:41.000
Às vezes acho que é mais... Pessoal, acaba não respondendo tanto, sim, em alguns grupos e eles mais fácil chamar para falar ali uns minutinhos.

18:42.000 --> 18:51.000
É, mas aí a gente não fica parado esperando, né? A gente já desenvolve aqui e aí a gente combina ali com eles como é que a gente faz para testar, tá?

18:51.000 --> 19:09.000
Talvez entre sim, provavelmente vai entrar sim, é que a gente está na primeira semana da sprint, né?

19:09.000 --> 19:15.000
A gente já vai deixar algumas histórias ali na sprint do NPC, mas a gente ainda tem algumas coisas para refinar.

19:15.000 --> 19:21.000
A gente nem chegou a falar do CO8 ainda, né, nos refinamentos, então...

19:25.000 --> 19:27.000
Ah, boa.

19:27.000 --> 19:37.000
Tá, se você puder compartilhar, até para já me ajudar aqui, quando a gente for passar na parte dessa parte do CO8 no refinamento do múltiplo,

19:37.000 --> 19:48.000
é bom que eu já tenho uma visão ali, mas a... Beleza, mas a ideia é que sim a gente comece ainda essa sprint,

19:48.000 --> 19:54.000
a gente já tem algumas histórias mapeadas, mas ainda tem alguns pontos aqui para a gente terminar de refinar, né?

19:54.000 --> 20:05.000
Então a gente vai meio que não vai dar para ser perfeito do como fechar a sprint, depois a gente volta e cria as histórias, acho que vai ficar meio...

20:05.000 --> 20:07.000
vai ter que fazer as duas coisas, sabe?

20:07.000 --> 20:15.000
Plana já a sprint, e depois ainda refinar, e é para entrar em um pedaço ainda na sprint, porque tá meio corrida aqui os tempos,

20:15.000 --> 20:21.000
e como é muita coisa aqui do múltiplo, não deu tempo de refinar tudo antes da sprint começar,

20:21.000 --> 20:26.000
então a gente vai ter que trabalhar aqui como que não é o ideal, mas a princípio é o que a gente tá tendo.

20:35.000 --> 20:59.000
Então a gente pode ver como é que a divisão das coisas do NPC vão se distribuir aqui, tá?

20:59.000 --> 21:10.000
Mas a gente pode planejar aqui para ver se dá, é que como você tem essa parte do tópico e vai ter as coisas do NPC,

21:10.000 --> 21:21.000
pelo menos o início aqui do NPC, talvez nessa sprint não, mas aí na próxima a gente já começa planejando isso, tá?

21:21.000 --> 21:26.000
Sim.

21:26.000 --> 21:28.000
Alta?

21:28.000 --> 21:39.000
Sim.

21:39.000 --> 21:46.000
Sim, com certeza.

21:47.000 --> 21:52.000
Sim.

21:52.000 --> 21:53.000
Sim.

21:53.000 --> 22:00.000
É, a gente deixa isso assim sempre frisado aqui, sempre que ideia a gente encaixa, tá?

22:00.000 --> 22:07.000
Eu não sei se necessariamente nessa sprint eu vou conseguir, mas eu vou estar sempre focando aqui nisso, tá?

22:07.000 --> 22:14.000
De tentar aqui encaixar, sempre que possível.

22:14.000 --> 22:17.000
O que é isso?

22:17.000 --> 22:20.000
Ganhou.

22:20.000 --> 22:25.000
Tchau, tchau.
