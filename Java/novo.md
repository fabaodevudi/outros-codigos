WEBVTT

00:00.000 --> 00:09.000
Aí, ele inicia a consulta, pega os valores e enriquece aqui essa variável, esse objeto aqui, ó.

00:09.000 --> 00:12.000
Entendi. Cadê?

00:12.000 --> 00:16.000
Esse objeto aqui, ó, limite rotativo, crédito V3, abertura contra as respostas.

00:16.000 --> 00:25.000
E aí, nesses dois aqui, ó, limite list pré-aprovado e valor cartão pré-aprovado.

00:25.000 --> 00:30.000
Tem desses dois valores aqui, vai ter uma outra etapa que é junto com o BFF.

00:30.000 --> 00:38.000
O BFF, na hora que o BFF dá o complete, ao lado dessa variável aqui, vai ter limite rotativo cartão pré-aprovado,

00:38.000 --> 00:43.000
o valor aqui e limite rotativo list pré-aprovado, o valor aqui.

00:43.000 --> 00:48.000
E esse valor limite máximo, 90 mil, no caso, esse cliente aqui é um person, né.

00:48.000 --> 00:54.000
Esse limite máximo, ele é o valor do limite list person, né.

00:54.000 --> 01:00.000
Não quer dizer que ele tem esse limite, mas que o limite list como o produto pode oferecer até 90 mil.

01:00.000 --> 01:06.000
E aí, ele usa esse campo aqui pra montar o CMS, tela, alguma coisa.

01:06.000 --> 01:10.000
De alguma forma, ele tá pegando esse valor e tá imputando em tudo.

01:10.000 --> 01:13.000
Mas o correto era esses três aqui, ó, entendeu.

01:13.000 --> 01:21.000
Só que esses dois só vai nascer se tiver limite pré-aprovado aqui nesse objeto, ou no R0.

01:21.000 --> 01:24.000
Entendeu?

01:24.000 --> 01:29.000
Tem sentido?

01:29.000 --> 01:33.000
Já isso não fez sentido, cês me falam que eu trinco? Explica até vocês entender.

01:33.000 --> 01:38.000
Não, fez sim, viu. Tô até olhando pro mesmo log que você tá olhando ali.

01:38.000 --> 01:44.000
Realmente retorna dentro do responso mesmo.

01:44.000 --> 01:48.000
Agora, por que será que não tá preenchendo?

01:48.000 --> 01:50.000
Entendeu.

01:50.000 --> 01:59.000
Externo teste.

01:59.000 --> 02:06.000
Sim, a tese que chama puque é uma external tese, mas ainda assim que empreende aqui é o script.

02:06.000 --> 02:10.000
Tem um script de dentro, que é esse aqui, ó.

02:10.000 --> 02:16.000
Cadê? Deixa eu enlumizar aqui.

02:16.000 --> 02:19.000
Deixa eu ver se é aqui, é aqui.

02:19.000 --> 02:22.000
Aqui, ó, solicitação.

02:22.000 --> 02:31.000
Ele tem aqui os input, bonitinho, do Marloses, cabeçalhos.

02:31.000 --> 02:37.000
Aí, depois, ele faz o um babado aqui.

02:37.000 --> 02:43.000
Eu não sei como, onde é exatamente, mas ele vai fazer aqui a inserção desses valores dentro daquela variável.

02:43.000 --> 02:45.000
Nasce daqui.

02:45.000 --> 02:54.000
O que eu acho que aconteceu é que no script que tá por trás dessa parte aqui,

02:54.000 --> 03:02.000
deve ter se perdido alguma coisa.

03:02.000 --> 03:06.000
Porque acho que é só isso o problema do limite.

03:06.000 --> 03:10.000
Não tem nada muito grotesco, sim.

03:10.000 --> 03:20.000
Lá nas variáveis, dentro do hash map, você consegue lá do cockpit,

03:20.000 --> 03:26.000
você consegue ver quais os alhões você tava mesmo, o que ele trouxe tanto?

03:26.000 --> 03:29.000
Ele só trouxe só o código, só do...

03:29.000 --> 03:31.000
Solco.

03:31.000 --> 03:35.000
Solco. E essa variável é que eu não sabia disso, mas ele só trouxe só o código do...

03:35.000 --> 03:37.000
Deixa eu recucar o nome mesmo, que eu esqueci.

03:37.000 --> 03:41.000
Limite rotativo.

03:41.000 --> 03:43.000
Essa é a medida de produção.

03:43.000 --> 03:46.000
Ah, tá, desculpa.

03:46.000 --> 03:49.000
Uda aqui, limite rotativo crédito.

03:49.000 --> 03:55.000
Tá vendo que tem o limite rotativo cartão pré provado, mas tá vazio porque aqui dentro não foi enriquecido.

03:55.000 --> 03:57.000
Tá.

03:57.000 --> 03:59.000
Tá vendo só, tá vendo isso?

03:59.000 --> 04:01.000
Tá.

04:01.000 --> 04:11.000
Tá vendo que tem uma coisa.

04:11.000 --> 04:13.000
Ok, o que eu tô pensando aqui, né?

04:13.000 --> 04:20.000
Daria pra gente passar no complete, assim, consultar o puque e passar no complete.

04:20.000 --> 04:25.000
Mas eu fico com medo de ficar uma coisa muito redundante, porque eu acho que o BPMN já tá fazendo isso.

04:25.000 --> 04:30.000
Então, eu acho que deveria buscar daqui, ó, o Igor.

04:30.000 --> 04:33.000
buscar disso daqui.

04:33.000 --> 04:37.000
Assim, era isso que eu pensei que era isso que tá fazendo, sabe?

04:37.000 --> 04:40.000
Na verdade.

04:40.000 --> 04:45.000
Não, não tá fazendo isso.

04:45.000 --> 04:53.000
Ele tinha que bater, ele bater, o C8 tinha que enviar os valores dos limites que estão aqui dentro.

04:53.000 --> 04:58.000
Pra você, pro produtos.

04:58.000 --> 05:02.000
Ao invés de bater lá no R0.

05:02.000 --> 05:04.000
Sim.

05:04.000 --> 05:16.000
Só que assim, essa lógica só tem que perpetuar só a NPC, porque eu não tenho a certeza do porquê que a Marcela colocou a consulta do R0, tá?

05:16.000 --> 05:19.000
E se a gente tirar isso, quebrar os fluxos que já existem.

05:19.000 --> 05:23.000
Então, no múltiplo, eu acho mais viável a gente fazer esse teste.

05:23.000 --> 05:25.000
Se não quebra.

05:25.000 --> 05:39.000
Pera aí que eu vou pegar um pouco d'água, gente.

05:39.000 --> 05:43.000
Nossa, esse negócio de limites é complicado, não?

05:43.000 --> 05:48.000
A ideia é muito diferente.

05:48.000 --> 05:50.000
São um pouquinho, né, Gão?

05:50.000 --> 06:02.000
Um.

06:02.000 --> 06:11.000
A meu pé chegou até a dormir C.

06:11.000 --> 06:22.000
Quanto isso, eu vou perguntar aqui pro meu oráculo, né, o que que pode ser aqui no negócio.

06:22.000 --> 06:30.000
E meu medo, aqui, é a gente adicionar uma chamada pra Puque.

06:30.000 --> 06:32.000
E acabar ficando mais lento ali, né, também.

06:32.000 --> 06:34.000
A gente vai adicionar uma chamada mais.

06:34.000 --> 06:37.000
Dá uma vez adição no 4 segundos a mais.

06:37.000 --> 06:43.000
Mas teria que fazer outra chamada pra ele consultar isso daqui, isso aqui não poderia ir com.

06:43.000 --> 06:55.000
E dentro do Tolkien ou dentro do que o C8 manda pro BFF produtos?

06:55.000 --> 06:57.000
É verdade, que é pensado isso não.

06:57.000 --> 07:01.000
Deixa eu ver como é que tá aqui no código.

07:01.000 --> 07:06.000
Porque a gente vai pagar realmente essas variáveis aí do C8, né?

07:06.000 --> 07:08.000
Se o C8 estiver preenchido, eu consigo achar.

07:08.000 --> 07:25.000
É, se caso o cliente, de alguma forma, ou se de alguma forma a Puque não tiver respondendo, não tiver nada...

07:25.000 --> 07:29.000
Não, eu não posso garantir se eu não testei esse cenário agora que lembrei.

07:29.000 --> 07:32.000
O que eu sei é que se não tiver limite, vai estar zerada essas variáveis.

07:32.000 --> 07:35.000
Essas variáveis aqui, elas sempre vão estar zeradas.

07:35.000 --> 07:37.000
Vai estar zero.

07:37.000 --> 07:39.000
Aqui.

07:39.000 --> 07:41.000
Vai estar zero.

07:41.000 --> 07:49.000
Mas sempre vai gerar um código de rastreio.

07:49.000 --> 07:51.000
Aí, deixa eu colocar aqui no oráculo.

07:51.000 --> 07:53.000
Por que não...

07:53.000 --> 08:01.000
Dofoso e Chobiseta.

08:53.000 --> 09:03.000
Nossa, eu tinha que ter falado com a Ailton.

09:03.000 --> 09:07.000
Ah, eu vou falar com ele assim, não assim, Crono.

10:23.000 --> 10:51.000
Mas assim, se for para pegar essa variável ali do Camunda

10:51.000 --> 10:58.000
e preencher as variáveis ali do LIS, não é muito problema não, sabe?

10:58.000 --> 11:01.000
Aí dá para fazer.

11:01.000 --> 11:03.000
Por que você acha?

11:03.000 --> 11:09.000
Porque se a gente já tivesse essas variáveis dentro do Camunda,

11:09.000 --> 11:15.000
na hora que eu rasgato elas aqui no BFF, eu consigo preencher elas e qualquer outra variável assim, sabe?

11:15.000 --> 11:23.000
O mesmo valor em qualquer canto assim.

11:23.000 --> 11:25.000
Sem precisar de nenhum chamar daí.

11:25.000 --> 11:43.000
O que eu gostaria de fazer é realmente fazer um set ali, sabe?

11:43.000 --> 11:51.000
Você iria pegar ela do que está vindo dar ali daquela consulta, daquele objeto no caso,

11:51.000 --> 11:56.000
iria setar ela ali naqueles dois...

11:56.000 --> 12:02.000
iria mandar para o front naquelas duas variáveis que a gente já manda.

12:02.000 --> 12:06.000
E depois iria fazer o complete, né?

12:06.000 --> 12:07.000
Mandar no complete.

12:07.000 --> 12:09.000
Complete com o valor atualizado.

12:09.000 --> 12:13.000
Acho que nem precisava, assim, eu não sei que tem necessidade,

12:13.000 --> 12:17.000
mas eu acho que nem precisa a gente passar ela no produto, sabe?

12:17.000 --> 12:20.000
No get-products.

12:20.000 --> 12:25.000
Acho que só no complete, eu acho que ele já pega as variáveis aqui do Camunda

12:25.000 --> 12:31.000
e pegando as variáveis eu consigo botar ela em qualquer lugar.

12:31.000 --> 12:33.000
E passar no complete, sabe?

12:33.000 --> 12:35.000
Aí meio que vai atualizar.

12:35.000 --> 12:38.000
Ela ia pegar esses valores no complete...

12:38.000 --> 12:40.000
Mas qual complete você fala exatamente?

12:40.000 --> 12:46.000
Complete ali do... da sua frente.

12:46.000 --> 12:52.000
E essa etapa seria ali depois que... no complete do produtos, né?

12:52.000 --> 12:54.000
No final do produtos, então.

12:54.000 --> 12:58.000
Isso, é...

12:58.000 --> 12:59.000
Beleza.

12:59.000 --> 13:04.000
Mas aí na renderização da tela do MFA, ele já teria que ter esses dados, não teria?

13:04.000 --> 13:08.000
Ah, teria.

13:08.000 --> 13:11.000
E a tela do M... do produtos antes.

13:11.000 --> 13:14.000
É, teria que passar na tela mesmo.

13:14.000 --> 13:18.000
E além disso, é...

13:18.000 --> 13:25.000
No múltiplo, a gente não vai pegar os valores de cartão.

13:25.000 --> 13:28.000
A gente não vai exibir o limite do cartão da PUC.

13:28.000 --> 13:31.000
E sim, do Xd2 mesmo sendo o mesmo limite.

13:31.000 --> 13:36.000
A gente vai exibir o que tá vindo ali do Xd2.

13:36.000 --> 13:38.000
Isso.

13:38.000 --> 13:41.000
Só o list que a gente vai manter.

13:41.000 --> 13:44.000
Aí a ideia seria...

13:44.000 --> 13:48.000
Ao invés de a gente bater, não é R0?

13:48.000 --> 13:52.000
Pra obter esses dados, a gente bateria, então...

13:52.000 --> 13:58.000
A gente pegaria do que já tava no Camunga.

13:59.000 --> 14:01.000
Foi o que a gente fez com uma variável já.

14:01.000 --> 14:04.000
Acho que foi uma das duas variáveis ali, Liz.

14:04.000 --> 14:05.000
Isso.

14:05.000 --> 14:08.000
A gente fez exatamente isso.

14:08.000 --> 14:10.000
Só não deixa eu lembrar de qual foi.

17:58.000 --> 18:00.000
Tá tenhando comigo aqui.

18:00.000 --> 18:02.000
Cadê?

18:02.000 --> 18:04.000
Vem aqui.

18:18.000 --> 18:21.000
Tá tenhando comigo aqui.

18:21.000 --> 18:23.000
Cadê?

18:23.000 --> 18:25.000
Vem aqui.

18:28.000 --> 18:31.000
Vem ali.

18:40.000 --> 18:41.000
比

18:41.000 --> 19:10.000
Pronto. Por que aqui? Aqui no no no complete, atualmente no complete, a gente tá fazendo, tá setando quatro variáveis relacionados ao limite, né?

19:10.000 --> 19:20.000
Que é o valor máximo cartão, o valor mínimo cartão, que é o que é apresentado ali no, no, no fonte, no fonte ali do, do gerente, né?

19:20.000 --> 19:26.000
E daí a gente tá setando também o limite pré-aprovado cartão, que foi aquela última variável que a gente mudou, lembra?

19:26.000 --> 19:37.000
Que a gente não podia mexer no, no lease, mas aí a gente mexeu no limite pré-aprovado cartão, que é a variável que aparece lá no, no, no fonte do, do cliente.

19:37.000 --> 19:44.000
Daí eu setei ali o limite pré-aprovado cartão pra aparecer igual o do xd2, né?

19:44.000 --> 19:52.000
Daí ali da variável do xd2. Aí tem o limite pré-aprovado, limite pré-aprovado lease.

19:52.000 --> 19:58.000
Deixa eu ver se é essa mesmo. Deixa eu ver aqui no camundo.

20:08.000 --> 20:14.000
Ou então eu posso acessar o valor limite, né? Mas aí eu não sei se vai sobrescrever, mas na frente no camundo.

20:14.000 --> 20:17.000
Ok.

20:44.000 --> 20:47.000
Ok.

21:14.000 --> 21:17.000
Ok.

21:44.000 --> 21:47.000
Ok.

22:14.000 --> 22:17.000
Ok.

22:17.000 --> 22:20.000
Ok.

22:20.000 --> 22:40.000
Ok.

22:40.000 --> 22:47.000
Eu tô vendo aqui.

22:47.000 --> 22:55.400
Eu posso até passar a variável que vai ser usada ali no valor limite pelo complete.

22:55.400 --> 23:05.000
Daí, se eu passar ela, ele vai ter que aturar no C8 também para ele buscar a variável que eu estou passando no complete.

23:05.000 --> 23:13.000
Porque hoje em dia, a função que está fazendo isso só está buscando ali daquela resposta da Cook.

23:17.000 --> 23:19.000
E não do complete.

23:19.000 --> 23:25.000
Eu descobri o porquê que não está enriquecendo a variável aqui, tá?

23:25.000 --> 23:33.000
Há pouco que não se decide, meu. Ah, que ódio. Eles não rentavam respeitando o contrato que eles mesmo me vendo.

23:33.000 --> 23:35.000
Problema lá, né?

23:35.000 --> 23:41.000
É, uma hora é Snakecase, outra é Camelcase. Vou pedir para fazer o seguinte, então.

23:41.000 --> 23:46.000
Primeiro, deixa eu baixar aqui a última versão do EDC BPMN.

23:46.000 --> 23:51.000
Porque se eu não me engano, acho que teve, está na 11.38.

23:51.000 --> 24:02.000
Eu não lembro qual foi a última, quando foi feito 11.17.50. Não, isso aqui não é data do upload.

24:02.000 --> 24:07.000
Não dá para saber, né, quando foi a última upload, né?

24:07.000 --> 24:19.000
Não, não mexi mais no BPMN. Só que teve uma alteração do Rafa, se eu não me engano.

24:19.000 --> 24:27.000
É, mas ele não mexeu nessa parte, não. Teve uma alteração do Rafa e eu preciso que conviva com alteração dele.

24:27.000 --> 24:35.000
Aí eu vou baixar essa versão aqui. Vou pedir para ir a reanalisar novamente.

24:35.000 --> 24:42.000
Esse aqui, deixa eu renomear aqui para renomear.

24:42.000 --> 24:48.000
Para upload.

24:48.000 --> 24:57.000
E colocar essa outra aqui, download.

24:57.000 --> 25:01.000
Pode fechar.

25:01.000 --> 25:15.000
Aqui eu renomear.

25:15.000 --> 25:18.000
Adei.

25:48.000 --> 26:17.000
Ai, tem outra coisa. Deixa eu pegar aqui essa proposta aqui de produção.

26:17.000 --> 26:26.000
Essa aqui.

26:26.000 --> 26:35.000
E olhar os logs em produção, porque eu preciso ter certeza que aquela...

26:35.000 --> 26:42.000
Qual que é o nome da... Ai, meu Deus, deixa eu ver aqui.

26:42.000 --> 26:49.000
Explora.

26:49.000 --> 26:52.000
Isso.

26:52.000 --> 27:00.000
Que efetiver cheque especial na resposta, ele não está utilizando o limite de...

27:00.000 --> 27:08.000
Ai, meu Deus, é muita coisa.

27:08.000 --> 27:35.000
O nome do babando.

27:35.000 --> 27:41.000
O nome do babando.

27:41.000 --> 27:58.000
Solestação do limite.

27:58.000 --> 28:00.000
Ai.

28:28.000 --> 28:38.000
Ai, meu Deus, é muita coisa.

28:38.000 --> 28:48.000
Ai, meu Deus.

28:48.000 --> 28:58.000
Ai, meu Deus.

29:18.000 --> 29:28.000
Ai, meu Deus.

29:28.000 --> 29:38.000
Ai, meu Deus.

29:38.000 --> 29:55.000
Ai, meu Deus.

29:55.000 --> 30:06.000
De qual problema? Qual dos problemas?

30:06.000 --> 30:12.000
Então, tem... Quem está me chamando?

30:12.000 --> 30:16.000
Gente, estou trabalhando.

30:16.000 --> 30:34.000
Espera aí, gente, rapidinho.

30:34.000 --> 30:43.000
Que o nome é valor limite.

30:43.000 --> 30:47.000
Isso.

30:47.000 --> 30:51.000
Então, encontrei uma função aqui.

30:51.000 --> 30:55.000
Em produtos?

30:55.000 --> 30:58.000
Não, um scriptzinho aqui.

30:58.000 --> 31:08.000
Que ele pega esse valor limite lá do...

31:08.000 --> 31:14.000
Que ele pega esse valor limite, ele busca lá do limite rotativo, que é justamente o que ele chamou da puque.

31:14.000 --> 31:21.000
Mas o problema que a gente está enfrentando aqui é porque ele não está pegando esse valor limite, não é?

31:22.000 --> 31:33.000
A resposta da puque.

31:33.000 --> 31:39.000
Não, não é isso não. Não é mexida. Não é mexida no BPMN, gente.

31:39.000 --> 31:47.000
É a puque que não se decide se ela vai ficar camel case ou snake case.

31:47.000 --> 31:50.000
Então, o que eu estou pensando aqui em fazer aqui no BPMN?

31:50.000 --> 31:52.000
Sabe ele conviver com as duas formas.

31:52.000 --> 31:55.000
Porque uma hora está vendo de um jeito, outra está vendo do outro.

31:55.000 --> 31:57.000
E quando vem de um jeito, quebra.

31:57.000 --> 32:00.000
Quando vem do outro, vai, entendeu? Então, convivo com as duas.

32:00.000 --> 32:05.000
Só que...

32:05.000 --> 32:10.000
Pelos retornos dos logs, pelo retorno de...

32:10.000 --> 32:17.000
Que um está às vezes bem camel case e às vezes vem snake case.

32:17.000 --> 32:20.000
Mas isso é para um cenário aqui, tá?

32:20.000 --> 32:25.000
Para um cenário do porquê que a gente não está enriquecendo um...

32:25.000 --> 32:27.000
Como falar?

32:27.000 --> 32:31.000
Um objeto aqui, que é a Dali, que nasce os limites.

32:31.000 --> 32:39.000
Mas tem outro BO também em pegando, que é a questão da exibição dos limites aqui para o cliente também,

32:39.000 --> 32:43.000
que é uma coisa que o Igor também está revendo.

32:43.000 --> 32:51.000
Mas essa parte do efetivar o check especial aqui, chamando API,

32:51.000 --> 32:55.000
ele está preenchendo aqui como aqui, nu, está vendo?

32:55.000 --> 33:00.000
Por quê? Porque ele não conseguiu percorrer no objeto e encontrar o valor do limite no objeto.

33:00.000 --> 33:04.000
Logo que ele não conseguiu, aí eu comecei a divulgar o porquê que ele não conseguiu.

33:04.000 --> 33:08.000
Por quê? Porque estava em snake case e ele esperava camel case.

33:08.000 --> 33:13.000
Aliás, é um contrário, tá?

33:13.000 --> 33:16.000
Aqui, isso aqui é snake case, no caso.

33:16.000 --> 33:23.000
Aí ele está recebendo os parâmetros de limite da pulque de uma forma diferente do que ele espera.

33:23.000 --> 33:26.000
Cadê? Deixa eu ver se sobra aqui.

33:26.000 --> 33:30.000
Aqui está vendo snake case?

33:30.000 --> 33:36.000
A pulque está respondendo lá na API de limites do R... Cadê?

33:36.000 --> 33:39.000
Deixa eu ver se eu tenho ela aqui.

33:39.000 --> 33:42.000
Ah, eu tenho ela aqui.

33:43.000 --> 33:50.000
FH6. Ela está respondendo em camel case.

33:50.000 --> 33:54.000
Você conseguiu entender agora? Fez sentido pra você?

33:54.000 --> 33:58.000
Omi, e parece que os valores estão diferentes também, né?

33:58.000 --> 34:07.000
O nome do campo, você vê que está valor limite e liço pré-aprovado.

34:07.000 --> 34:12.000
Sim, eles não estão tendo padrão, só que assim, vamos trabalhar com convivência.

34:12.000 --> 34:21.000
Entendeu? Porque, claro que se a gente for fazendo mal mesmo, vai ser um ano pra entregar isso.

34:21.000 --> 34:24.000
Então, é por isso que eu quero que trabalha com convivência.

34:24.000 --> 34:28.000
Porque se eles mudarem, voltar pro jeito que era ou aplicar de outra forma,

34:28.000 --> 34:31.000
a gente já tem uma inteligência pra saber lidar com isso, entendeu?

34:31.000 --> 34:35.000
Porque, meu, ficar batendo o pé com eles pra saber o que vai ser...

34:35.000 --> 34:42.000
Não, acho que é o caminho que a gente tem que percorrer, dado o tempo que a gente tem.

34:42.000 --> 34:46.000
Se casas começar também, a gente empatinar muito nisso, gente.

34:46.000 --> 34:48.000
Então, vamos fazer o seguinte, não vai ter limite pré-aprovado.

34:48.000 --> 34:51.000
A gente sobe só o fluxo, nem o mesmo, sem empenhar.

34:51.000 --> 34:53.000
Sem nada.

35:06.000 --> 35:09.000
É, mas pera aí, deixa eu só raciocinar aqui,

35:09.000 --> 35:12.000
porque senão eu vou perder o fio da meada aqui na minha mente,

35:12.000 --> 35:14.000
ou o que eu tô procurando aqui, pera aí.

35:14.000 --> 35:20.000
Deixa eu voltar aqui, a gente pega uma proposta, que tem a passada ali naquela tela.

35:20.000 --> 35:34.000
Tem limite pré-aprovado, tá tio?

35:34.000 --> 35:39.000
Que deu quanto?

35:39.000 --> 35:42.000
Tem limite pré-aprovado, zero.

35:42.000 --> 35:44.000
Valor pré-aprovado, zero.

35:44.000 --> 35:46.000
Código 0, 0, 0, 1.

35:46.000 --> 35:58.000
Ele deu esse código, será?

35:58.000 --> 36:07.000
Ele passou da etapa.

36:07.000 --> 36:13.000
Não, ele nem chegou ali.

36:13.000 --> 36:28.000
Ele não chegou.

36:28.000 --> 36:32.000
A maioria dessas propostas tá tudo em back-office.

37:14.000 --> 37:23.000
Código 0, 0, 0, 1.

38:53.000 --> 39:19.000
É isso, se vira procura e acha.

39:19.000 --> 39:39.000
É isso, se vira procura e acha.

39:49.000 --> 40:01.000
É isso, se vira procura e acha.

40:01.000 --> 40:17.000
É isso, se vira procura e acha.

40:31.000 --> 40:41.000
É isso, se vira procura e acha.

41:01.000 --> 41:21.000
É isso, se vira procura e acha.

41:21.000 --> 41:41.000
É isso, se vira procura e acha.

41:41.000 --> 42:01.000
É isso, se vira procura e acha.

42:01.000 --> 42:11.000
É isso, se vira procura e acha.

42:31.000 --> 42:59.000
É isso, se vira procura e acha.

42:59.000 --> 43:19.000
É isso, se vira procura e acha.

43:19.000 --> 43:31.000
É isso, se vira procura e acha.

43:31.000 --> 43:33.000
Vai jogar tudo fora.

44:01.000 --> 44:29.000
E aí? Será que ele já pegou? Pegou.

44:29.000 --> 44:35.000
Tá. Então, essa variável aqui tá certa, então.

44:35.000 --> 44:43.000
O valor limite para aprovar do global, então, é o limite do produto mesmo.

44:43.000 --> 44:49.000
E aí, o limite que a gente vai setar do cliente vai ser esse aqui, valor limite.

44:49.000 --> 45:03.000
Beleza. Aí aqui, aqui é o retorno que a external test que vai retornar quando efetiva mesmo ali, efetiva mesmo ali o produto, né?

45:03.000 --> 45:11.000
Mas ali um valor limite passou com 3 mil? Não, esse valor limite é do produto, ele é do produto.

45:11.000 --> 45:21.000
Ah, não, é diferente daquele lado assim, né? Isso aí é o que a gente retorna, isso aqui.

45:21.000 --> 45:29.000
Olha do produto, aí deixa eu ver se tem outro, não, aqui já é erro já.

45:29.000 --> 45:47.000
Beleza, vou pedir para ele.

45:47.000 --> 46:02.000
Ai, cadê? Aqui. Tudo bem? Voltei aqui, como a gente tá?

46:02.000 --> 46:09.000
Debugando aqui uma situação específica aqui para quando tem limite pré-aprovado.

46:09.000 --> 46:19.000
Mas pré-aprovado para Cartão ou pré-aprovado para Liz? Liz.

46:19.000 --> 46:23.000
O que que tá acontecendo para você ficar na mesma página, tá, amiga?

46:23.000 --> 46:28.000
Ah, porque ela não tá se decidindo, qual que é o contrato que vamos percorrer?

46:28.000 --> 46:35.000
Porque é assim, a gente tá preparado para um tipo de contrato, aí depois eles vão lá e mudam, entendeu?

46:35.000 --> 46:43.000
E aí quando eles respondem a gente não bate com o que a gente espera, nós simplesmente não enriquecemos nossas variáveis ali.

46:43.000 --> 46:51.000
Aí quando chega lá no finalzinho do fluxo, que a gente vai ter que chamar as APIs que efetiva a conta, efetiva a Liz, efetiva tudo,

46:51.000 --> 46:59.000
na hora que chega a efetivar Liz, a gente não sabe o que enviar e enviamos as variáveis como nu e eles não aceitam,

46:59.000 --> 47:07.000
e aí eles dão 400 e aí a gente fica no loop infinito ali de de validação, de abertura e tudo e tal.

47:07.000 --> 47:13.000
E agora a gente vai criar uma alternativa aqui de convivência.

47:13.000 --> 47:19.000
Ele vai saber lidar do jeito que ele já sabe lidar, mas ele também vai saber lidar do jeito que a PUC agora mudou.

47:19.000 --> 47:24.000
E aí nesse caso CD1 vai funcionar e CD2 tem que funcionar também, tá entendendo?

47:24.000 --> 47:31.000
Porque até ir lá na PUC e descobrir que o focinho de porco não é tomada, entendeu?

47:31.000 --> 47:36.000
Então já aprenda a fazer o BPMN lidar com as duas formas.

47:36.000 --> 47:42.000
O importante é saber as variáveis para chamar ali e ter o retorno ali, ó.

47:42.000 --> 47:50.000
Esse aqui contratou, é que eu estou olhando aqui os logs de produção para ter certeza, para não confundir as variáveis aqui.

47:50.000 --> 47:59.000
O valor limite então, então Igor, o valor limite pré aprovado global significa o valor limite do produto.

47:59.000 --> 48:04.000
Esse aqui é o Niklas, por esse valor que eu já sei que é o Niklas.

48:04.000 --> 48:13.000
E aí o valor limite que a gente envia é o valor limite que é o pré aprovado, o que vai contratar.

48:13.000 --> 48:23.000
No retorno deles, o valor limite passa a ser o valor do produto.

48:23.000 --> 48:33.000
É, mas é isso, é isso.

48:33.000 --> 48:40.000
Beleza.

48:40.000 --> 48:46.000
Tá, então esse valor limite pré aprovado global está funcionando corretamente, tá?

48:46.000 --> 48:50.000
Tá, aparentemente sim, tá certo.

48:50.000 --> 48:56.000
Simulação de limite único.

48:56.000 --> 49:04.000
É o que está quebrando mesmo isso aqui mesmo, o valor limite que ele não está encontrando lá na variável.

49:05.000 --> 49:10.000
No Camunda eu peguei qual é o...

49:10.000 --> 49:14.000
Qual é o script test que está acertando esse valor aí, então?

49:14.000 --> 49:19.000
Essa mapeia contrata contratação, o chefe especial.

49:19.000 --> 49:22.000
Qual que é?

49:22.000 --> 49:26.000
Mapeia contrato, deixa eu copiar com mais fácil.

49:26.000 --> 49:29.000
Contraço ou underline?

49:29.000 --> 49:32.000
É com espaço, assim.

49:32.000 --> 49:39.000
Mas o ID no caso, seu nome, seu ID.

49:39.000 --> 49:43.000
Ami, só fazendo um recap aqui.

49:43.000 --> 49:50.000
Aí, por conta dessa divergência do Liz, a conta não está efetivando?

49:50.000 --> 49:52.000
Não.

49:52.000 --> 49:57.000
Não abre conta.

49:57.000 --> 50:00.000
Não, gente.

50:00.000 --> 50:10.000
Ami, você consegue só passar um caso em que o liste está zerado e o crédito do cartão está ok?

50:10.000 --> 50:13.000
Só para ver se vai dar certo.

50:13.000 --> 50:17.000
Tá, mas esse já foi feito, não já?

50:17.000 --> 50:23.000
Então, mas lembra que antes não estava gerando o cartão, né?

50:23.000 --> 50:28.000
Ah, você fala o limite do cartão, limite do cartão.

50:28.000 --> 50:31.000
Tá, posso passar, mas pera aí.

50:31.000 --> 50:33.000
Porque o que acontece?

50:33.000 --> 50:41.000
Ele vai bater lá na poke para esse limite já acontecer e aí vai cair no mesmo problema que a gente está caindo aqui no Liz.

50:41.000 --> 50:47.000
Quando ele chega aqui, contrata a chefe especial, Liz.

50:47.000 --> 50:52.000
Ou ele vai chegar aqui, cadê?

50:52.000 --> 51:00.000
Ele vai ter que chegar aqui de qualquer forma para efetivar.

51:00.000 --> 51:13.000
Mas é porque no caso só do limite do cartão, a gente estava ignorando e estava considerando que o Igor recebia o lado do direcionador.

51:14.000 --> 51:25.000
Beleza, aí a gente vai pedir para quem vai efetivar com o limite do crédito, não é o XD2?

51:25.000 --> 51:29.000
Isso é o motor, vai bater lá na preoneração.

51:29.000 --> 51:31.000
Lá não está mocado?

51:31.000 --> 51:34.000
Não, desmocou, me lembra.

51:34.000 --> 51:36.000
Será que ele desmocou mesmo?

51:36.000 --> 51:38.000
Desmocou.

51:43.000 --> 52:05.000
O Mio, estou vendo que na external test, ela já está aceitando os dois, viu? Tanto com...

52:05.000 --> 52:09.000
Tá, então por que ela não está enriquecendo, então a variável?

52:09.000 --> 52:16.000
É, eu vou mandar aqui para vocês.

52:16.000 --> 52:21.000
Aqui está dando um erro ao chamar a NPC V2, tem alguma coisa errada.

52:21.000 --> 52:26.000
Só V2 nesse shield, a pessoa deve estar mexendo lá, não é?

52:26.000 --> 52:29.000
Então.

52:29.000 --> 52:33.000
Não, mas é algum parâmetro aqui que está colocando. Ah, lembrei o que é que está errado.

52:33.000 --> 52:35.000
Ah, tem que passar a lista.

52:35.000 --> 52:49.000
Aqui dá os produtos.

52:49.000 --> 52:54.000
Eu não acabei de chamar o Tolkien aqui, meu Deus.

52:54.000 --> 53:06.000
Ai, tem um...

53:06.000 --> 53:16.000
Ainda assim, está dando um erro aqui nesse caramba, olha isso.

53:16.000 --> 53:29.000
O que é que é?

53:29.000 --> 53:42.000
Vou gerar toda uma massa aqui, babadeiramente.

53:42.000 --> 53:51.000
Cara, entregando esse negócio do NPC, eu vou dar um jeito de baixar aquele projeto do Gerador de Massa

53:51.000 --> 53:54.000
e vou automatizar isso, que eu não aguento mais fazer isso aqui.

53:54.000 --> 53:58.000
Pelo amor de Deus, que é muito cornojóbi. Pelo amor de Deus.

53:58.000 --> 54:05.000
Santa Nossa Senhora da Tecnologia.

54:05.000 --> 54:13.000
Ai, socorro.

54:13.000 --> 54:20.000
402 fominhos nesse.

54:20.000 --> 54:32.000
Então, aqui no oráculo, ele falou aqui para mim que é a tasca de obter limite crédito.

54:32.000 --> 54:38.000
Ah, ele explicou exatamente o que eu expliquei para vocês.

54:38.000 --> 54:49.000
E aí, está retornando.

54:49.000 --> 54:53.000
Mas eu vejo isso.

54:53.000 --> 55:13.000
Realmente.

55:13.000 --> 55:40.000
1360 fominhos.

55:40.000 --> 55:47.000
Eu estou achando-me, posso tentar se publicar para vocês aqui depois, pelo que eu estou vendo.

55:47.000 --> 55:51.000
Mas tem uma divergência aqui nos retornos mesmo, viu.

55:51.000 --> 55:55.000
Mas é no nome em si.

55:55.000 --> 55:57.000
Eu posso roubar rapidinho aqui?

55:57.000 --> 55:59.000
Pode roubar, fica a vontade.

55:59.000 --> 56:04.000
Vou jogar aqui para cima.

56:04.000 --> 56:14.000
Isso é de prod, né?

56:14.000 --> 56:16.000
Aqui, vamos ao mesmo.

56:16.000 --> 56:24.000
Está vendo que aqui ele está retornando valor limite cartão pré-aprovado.

56:24.000 --> 56:27.000
C-R-T. Valor limite disso pré-aprovado.

56:28.000 --> 56:33.000
E aqui, estou vendo, ele retorna, valor cartão pré-aprovado.

56:33.000 --> 56:38.000
Não tem o limite, olha lá, valor limite e cartão diferente também.

56:38.000 --> 56:42.000
Mas esses dois endpoint são o mesmo?

56:42.000 --> 56:48.000
São, porque esse cara aqui, por exemplo, valor cartão pré-aprovado.

56:48.000 --> 56:52.000
O external test, ela está esperando isso aqui, olha.

56:52.000 --> 56:59.000
Valor limite pré-aprovado.

56:59.000 --> 57:04.000
Por isso que eu acho da empródio, se a gente olhar, olha lá.

57:04.000 --> 57:10.000
Valor limite C-R-T pré-aprovado.

57:10.000 --> 57:16.000
Vamos tentar recebendo ali o valor do lijo.

57:16.000 --> 57:19.000
Ali no external test, ele está esperando o tempo.

57:19.000 --> 57:26.000
Valor limite C-R-T pré-aprovado.

57:26.000 --> 57:29.000
Valor limite C-R-T pré-aprovado.

57:29.000 --> 57:33.000
Então ele aceita C-R-T pré-aprovado.

57:33.000 --> 57:36.000
Valor limite C-R-T pré-aprovado.

57:36.000 --> 57:38.000
E aí, está vendo?

57:38.000 --> 57:43.000
Então isso aqui, o valor limite C-R-T pré-aprovado.

57:43.000 --> 57:45.000
Ele bate.

57:45.000 --> 57:49.000
E aí, no caso, estou vendo, esse aqui, ele nem existe.

57:49.000 --> 57:52.000
Você vê, assim, a gente até pesquisar aqui.

57:52.000 --> 57:58.000
Vamos ver no GIT, se tem alguma coisa.

57:58.000 --> 58:01.000
É só isso aí o problema, então.

58:01.000 --> 58:05.000
É o que daí faz sentido de ele não estar conseguindo resolver mesmo.

58:05.000 --> 58:07.000
Espera lá que eu já vou resolver esse problema agora.

58:07.000 --> 58:09.000
Se for isso, então já vou resolver a Google.

58:09.000 --> 58:12.000
Que eu vou aqui na virtualização.

58:12.000 --> 58:14.000
É, vamos ver.

58:14.000 --> 58:16.000
Olha, eu achei um outro.

58:16.000 --> 58:18.000
É difícil mesmo.

58:18.000 --> 58:20.000
Essas ideias as vezes eu mostro aí.

58:20.000 --> 58:24.000
São indústrias mais diferentes, indústrias propostas diferentes.

58:24.000 --> 58:26.000
Do nada, ele começou a mudar.

58:26.000 --> 58:28.000
O nome do carro.

58:28.000 --> 58:31.000
É, a PULG que está retornando assim.

58:31.000 --> 58:33.000
Isso vem da PULG, gente.

58:33.000 --> 58:36.000
A PULG, ela é multa antes.

58:36.000 --> 58:41.000
Aqui é assim, gente, só para trazer um histórico.

58:41.000 --> 58:43.000
A gente atualizou a PULG.

58:43.000 --> 58:47.000
Lembra que a gente estava com uma dependência aqui de depreciação,

58:47.000 --> 58:50.000
que o Gateway estava na 1.0.

58:50.000 --> 58:54.000
E aí a gente teve que mudar esse Gateway na 2.0.

58:54.000 --> 58:59.000
Eu não tinha o entendimento que com essa mudança aqui para 2.0

58:59.000 --> 59:02.000
tinha mudança aqui do contrato, tá?

59:02.000 --> 59:05.000
Mas talvez possa ter tido.

59:05.000 --> 59:08.000
Mas isso não foi mencionado, tá?

59:08.000 --> 59:12.000
Porque nem o time da PULG e muito menos do time da digital

59:12.000 --> 59:16.000
falou que o contrato tinha mudanças.

59:16.000 --> 59:24.000
Porque foi feita um ajuste pelo time lá do C8 da digital

59:24.000 --> 59:27.000
que reflete aqui no BPNN da Fisto.

59:27.000 --> 59:31.000
E a gente só foi convidado para fazer os testes

59:31.000 --> 59:35.000
em produção, passando, efetivando conta

59:35.000 --> 59:39.000
para saber se estava tudo certo.

59:39.000 --> 59:41.000
Não, amigo, mas é só em um mall.

59:41.000 --> 59:44.000
Produção, eles não mudam assim, não.

59:44.000 --> 59:46.000
É só em um mall.

59:46.000 --> 59:47.000
Mas beleza.

59:47.000 --> 59:51.000
Qual o campo que está diferente? Desculpa.

59:51.000 --> 59:54.000
Os campos dos limites ali.

59:54.000 --> 01:00:00.000
Tá, mas me manda que a gente vai colocar lá no grupo.

01:00:00.000 --> 01:00:02.000
Vou mandar aqui.

01:00:02.000 --> 01:00:07.000
Enquanto isso, eu vou passar com o jeito que está vindo ali, tá?

01:00:07.000 --> 01:00:12.000
Vou configurar para receber do jeito que está ali na arbitraria.

01:00:12.000 --> 01:00:16.000
Aliás, não vou nem passar do jeito que está vindo ali.

01:00:16.000 --> 01:00:19.000
Na verdade, eu vou passar do jeito que já recebemos.

01:00:19.000 --> 01:00:22.000
Do jeito que está em produção.

01:00:22.000 --> 01:00:26.000
Qual que é a mesma?

01:00:27.000 --> 01:00:33.000
Valor limite, CRT pré-aprovado, né?

01:00:33.000 --> 01:00:36.000
Mas é só isso que está diferente?

01:00:36.000 --> 01:00:39.000
Ou tem mais alguma coisa? Será?

01:00:39.000 --> 01:00:41.000
Ó.

01:00:41.000 --> 01:00:45.000
Mas será que tem mais alguma coisa no campo que está diferente?

01:00:45.000 --> 01:00:49.000
O Mio, eu estou achando que sim.

01:00:49.000 --> 01:00:52.000
Eu acho que tem bastante a ver com isso.

01:00:52.000 --> 01:00:57.000
Eu queria que eu dê um pouquinho mais, forma um pouquinho mais detalhado aqui.

01:00:57.000 --> 01:01:03.000
Vamos ver. Vou dar mais uma conferida.

01:01:03.000 --> 01:01:06.000
Mas não faz sentido, gente. Peraí.

01:01:06.000 --> 01:01:09.000
Deixa eu achar aqui a virtualização do C8,

01:01:09.000 --> 01:01:14.000
que eu não lembro qual que era aqui a virtualização deles. Peraí.

01:01:22.000 --> 01:01:25.000
Peraí.

01:01:43.000 --> 01:01:49.000
Tá vendo, ó? Usando Devine, ele fez uma análise aqui no BPMN

01:01:49.000 --> 01:01:52.000
linkado com a external task.

01:01:52.000 --> 01:01:57.000
Então, ó, esse retorno desse tipo aqui, ó,

01:01:57.000 --> 01:02:02.000
valor cartão pré-aprovado, valor liso pré-aprovado,

01:02:02.000 --> 01:02:07.000
ele não está sendo, ele faz, ele faz parte de um tópico,

01:02:07.000 --> 01:02:11.000
que é esse aqui, ó, limite, que é o limite crédito

01:02:11.000 --> 01:02:18.000
external task handler v2, que não está sendo usado no nosso BPMN.

01:02:19.000 --> 01:02:24.000
Enquanto que o outro lá, que eu mostrei, que tem, ó,

01:02:24.000 --> 01:02:28.000
ele até fala, que é onde está o problema do Jason Ellias, que vimos.

01:02:28.000 --> 01:02:34.000
Aqui ele sim, está sendo referenciado pelo BPMN.

01:02:35.000 --> 01:02:39.000
Deixa eu fazer uma pesquisa.

01:02:46.000 --> 01:02:50.000
Entendi agora.

01:02:50.000 --> 01:02:54.000
E como que minha virtualização funciona, então?

01:02:54.000 --> 01:02:56.000
Será que minha virtualização está de antigo?

01:02:56.000 --> 01:02:59.000
Por isso que ela funciona? BPMN traço ETS.

01:02:59.000 --> 01:03:01.000
Deixa eu olhar aqui.

01:03:01.000 --> 01:03:04.000
BPMN traço ETS.

01:03:07.000 --> 01:03:10.000
Deixa eu ir compartilhando aqui até que vocês vão me ajudar.

01:03:13.000 --> 01:03:15.000
Não, aí é a virtualização, limite,

01:03:15.000 --> 01:03:22.000
elegibilidade, sucesso fígito, ó.

01:03:27.000 --> 01:03:30.000
Aqui ele está para retornar.

01:03:32.000 --> 01:03:36.000
Ah, o seu está certo, vi.

01:03:36.000 --> 01:03:39.000
É isso aí mesmo que ele está esperando.

01:03:41.000 --> 01:03:45.000
Então, tá, vou deixar esses mesmos limites aqui.

01:03:45.000 --> 01:03:49.000
Tá muito exagerado, vou colocar um...

01:03:49.000 --> 01:03:52.000
Eu vou colocar o mesmo limite que está aqui no pré-aprovado

01:03:52.000 --> 01:03:56.000
para não dar interferência na hora que ele for xumbar lá.

01:03:56.000 --> 01:04:01.000
É 14.100 e qualquer 24.100.

01:04:01.000 --> 01:04:03.000
Eita aqui, limitão, né?

01:04:03.000 --> 01:04:05.000
Espera aí, mas vai ser esse mesmo.

01:04:05.000 --> 01:04:08.000
14.100 e 24.100.

01:04:08.000 --> 01:04:10.000
Vou deixar desse jeito.

01:04:12.000 --> 01:04:17.000
14.100 e 24.100.

01:04:17.000 --> 01:04:20.000
Código canal, falsa, certo?

01:04:22.000 --> 01:04:24.000
Tá, e aqui?

01:04:25.000 --> 01:04:27.000
Eu vou deixar para dele.

01:04:27.000 --> 01:04:30.000
Código origem do sub fluxo,

01:04:30.000 --> 01:04:33.000
qual que era mesmo que ele usa para chamar?

01:04:39.000 --> 01:04:41.000
Fígito.

01:04:41.000 --> 01:04:44.000
Deixa eu desligar porque se não comece todo mundo

01:04:44.000 --> 01:04:46.000
ficar com pré-aprovado.

01:04:46.000 --> 01:04:48.000
Fígito solver.

01:04:49.000 --> 01:04:54.000
E aqui, eu vou chamar mesmo aqui para ter o pré-aprovado lá.

01:04:54.000 --> 01:04:57.000
Para não ser tão mó que assim, né?

01:04:57.000 --> 01:04:58.000
Cadê?

01:04:58.000 --> 01:05:00.000
Seguimento.

01:05:03.000 --> 01:05:05.000
7.1.

01:05:07.000 --> 01:05:09.000
Ah!

01:05:10.000 --> 01:05:12.000
E...

01:05:17.000 --> 01:05:19.000
5.

01:05:39.000 --> 01:05:41.000
Fui.

01:05:46.000 --> 01:05:48.000
Fui.

01:05:53.000 --> 01:05:55.000
5 baris.

01:05:55.000 --> 01:05:57.000
Beleza.

01:05:57.000 --> 01:05:59.000
5.

01:06:07.000 --> 01:06:09.000
Solver essa chave taligada.

01:06:09.000 --> 01:06:11.000
Tá.

01:06:27.000 --> 01:06:29.000
16.

01:06:29.000 --> 01:06:31.000
19.

01:06:31.000 --> 01:06:33.000
19.

01:06:33.000 --> 01:06:35.000
19.

01:06:35.000 --> 01:06:37.000
19.

01:06:37.000 --> 01:06:39.000
20.

01:06:39.000 --> 01:06:41.000
20.

01:06:41.000 --> 01:06:43.000
20.

01:06:43.000 --> 01:06:45.000
20.

01:06:45.000 --> 01:06:47.000
20.

01:06:49.000 --> 01:06:51.000
60.

01:06:51.000 --> 01:06:53.000
80.

01:06:53.000 --> 01:06:55.000
80.

01:06:55.000 --> 01:07:24.000
Não entendi, por que que foi jogada para produtos?

01:07:24.000 --> 01:07:50.000
Gente, não para lá, navegador está travando, só para lá de...

01:07:50.000 --> 01:07:52.000
até ele ficou confuso.

01:08:20.000 --> 01:08:35.000
Eu descobri por que que é que é que buga, olha.

01:08:36.000 --> 01:08:39.000
Ah, que passou porque eu demorei um deleizinho.

01:08:39.000 --> 01:08:44.000
Mas se você passa rápido ali, ele tenta excluir todos os timers que tem ali no céu.

01:08:44.000 --> 01:08:49.000
Oito aí não dá tempo e ali dá um quinhentos ali.

01:08:49.000 --> 01:09:02.000
Mas se você prosseguir de novo, ele continua.

01:09:02.000 --> 01:09:06.000
Beleza, até aqui já é para estar enriquecido então lá variável.

01:09:06.000 --> 01:09:09.000
Seguindo a lógica então.

01:09:09.000 --> 01:09:11.000
Cadê?

01:09:11.000 --> 01:09:13.000
Jornada, aqui é onde?

01:09:13.000 --> 01:09:15.000
É o prod, né?

01:09:32.000 --> 01:09:41.000
Então acho que passou a limite, né?

01:09:41.000 --> 01:09:43.000
Limite.

01:09:43.000 --> 01:09:46.000
Aqui retornou, gente, olha.

01:09:46.000 --> 01:09:48.000
Tornou o meu moque.

01:09:48.000 --> 01:09:50.000
Bonitius me.

01:09:50.000 --> 01:09:52.000
Vai abrir a conta agora, tá?

01:09:52.000 --> 01:09:54.000
O Pedrinho.

01:09:55.000 --> 01:10:00.000
Limite pré-aprovado, 14.100.

01:10:00.000 --> 01:10:04.000
Aí você já arrumou, Igor?

01:10:04.000 --> 01:10:06.000
Um beijo.

01:10:06.000 --> 01:10:08.000
Saiu de novo.

01:10:08.000 --> 01:10:10.000
Nossa.

01:10:10.000 --> 01:10:12.000
Que dor.

01:10:12.000 --> 01:10:14.000
Ótimo.

01:10:14.000 --> 01:10:16.000
Só que do cartão não veio.

01:10:16.000 --> 01:10:21.000
Ah, tá, porque ele está mirando lá no XD2.

01:10:22.000 --> 01:10:28.000
Mas por que que o XD2 retornou zero sendo que eu coloquei pré-aprovado nessa massa?

01:10:28.000 --> 01:10:30.000
Era para refletilar.

01:10:30.000 --> 01:10:32.000
Será que é na puque mesmo que eles batem?

01:10:32.000 --> 01:10:34.000
Ou tem algum parâmetro diferente?

01:10:34.000 --> 01:10:36.000
Eles batem lá.

01:10:36.000 --> 01:10:44.000
Eles batem no endpoint lá da puque para a NPC.

01:10:51.000 --> 01:10:53.000
Descrição do cartão.

01:10:53.000 --> 01:10:55.000
Unidade limite máxima disponível.

01:11:02.000 --> 01:11:04.000
Sei lá, hein, amigo?

01:11:04.000 --> 01:11:06.000
Não sei, não.

01:11:06.000 --> 01:11:09.000
Porque é assim.

01:11:09.000 --> 01:11:14.000
O Mi só tenta seguir com essa massa.

01:11:14.000 --> 01:11:16.000
Não vai passar o pré-aprovado, tá?

01:11:16.000 --> 01:11:18.000
Para o cartão.

01:11:18.000 --> 01:11:20.000
Só vai passar isso.

01:11:20.000 --> 01:11:23.000
Não, beleza. Só para ver se a gente efetiva.

01:11:23.000 --> 01:11:25.000
Porque...

01:11:25.000 --> 01:11:29.000
Eu vou falar aqui com Grilo no paralelo.

01:11:29.000 --> 01:11:32.000
Porque...

01:11:32.000 --> 01:11:37.000
Não faz sentido, tá? Assim...

01:11:37.000 --> 01:11:41.000
Tudo bem que eu moquei aqui, mas eu chamei ali o endpoint de pré-aprovado.

01:11:41.000 --> 01:11:45.000
Ele imputou o pré-aprovado na massa.

01:11:45.000 --> 01:11:48.000
Ó, limite da conta, 14.100.

01:11:48.000 --> 01:11:50.000
Agora, limite do cartão não veio.

01:11:50.000 --> 01:11:53.000
Porque nasci no XD2 e não veio.

01:11:59.000 --> 01:12:01.000
Ajuda.

01:12:01.000 --> 01:12:03.000
Abra ali o...

01:12:03.000 --> 01:12:05.000
O produto.

01:12:05.000 --> 01:12:06.000
Não, pera aí.

01:12:06.000 --> 01:12:08.000
Assim, é melhor ver no log.

01:12:08.000 --> 01:12:10.000
Com a resposta ali do...

01:12:13.000 --> 01:12:15.000
Do XD2.

01:12:18.000 --> 01:12:20.000
Veio zero.

01:12:20.000 --> 01:12:22.000
Foi zerado.

01:12:22.000 --> 01:12:24.000
Veio zerado o limite deles.

01:12:27.000 --> 01:12:29.000
Aí ele...

01:12:29.000 --> 01:12:32.000
Ó, aqui, tá vendo, ó? Zero, zero.

01:12:32.000 --> 01:12:34.000
Só que...

01:12:34.000 --> 01:12:37.000
Tem um pôrinho entre tanto da via.

01:12:39.000 --> 01:12:42.000
Eu vou chamar aqui a API de...

01:12:42.000 --> 01:12:46.000
Ó, abriu a conta. Vou esperar passar os pós-journada, tá?

01:12:46.000 --> 01:12:51.000
Mas aqui, ó, eu vou pegar aqui o client ID e vou...

01:12:51.000 --> 01:12:53.000
Pessoal, me, por favor.

01:12:59.000 --> 01:13:02.000
Aí é aqui no... Cadê?

01:13:02.000 --> 01:13:04.000
DMPS.

01:13:04.000 --> 01:13:06.000
DMPS.

01:13:06.000 --> 01:13:11.000
Esse aqui é o endpoint que eu bato pra me poder olhar o pré-aprovado que a pouco retorna.

01:13:11.000 --> 01:13:14.000
Aqui eu vou deixar assim.

01:13:14.000 --> 01:13:17.000
Aqui também vou deixar aqui.

01:13:17.000 --> 01:13:22.000
Aí eu vou pegar aqui no headers, no token.

01:13:22.000 --> 01:13:26.000
Essa endpoint é meio chato de chamar por causa disso.

01:13:36.000 --> 01:13:38.000
Jogo pra cá.

01:13:38.000 --> 01:13:40.000
E chamo.

01:13:44.000 --> 01:13:47.000
Ah, não, eu ramelei.

01:13:47.000 --> 01:13:49.000
Vou refazer o teste.

01:13:49.000 --> 01:13:52.000
Para a gravação, não manda esse personão, manda esse personão, vou fazer outro.

01:13:52.000 --> 01:13:54.000
Para a gravação, não deu certo, não.

01:13:54.000 --> 01:13:57.000
Eu fiz errada alguma coisa aqui, pera aí.

01:13:59.000 --> 01:14:01.000
Acho que baixaria.

01:14:01.000 --> 01:14:03.000
Até fazer um unicance.

01:14:14.000 --> 01:14:16.000
Oi.

01:14:40.000 --> 01:14:42.000
Oi.

01:14:42.000 --> 01:14:44.000
Oi.

01:14:57.000 --> 01:15:01.000
Mi, a API deles é muito lixo, né?

01:15:01.000 --> 01:15:03.000
Tá caindo na contingência.

01:15:03.000 --> 01:15:05.000
Aí eu acho que tá chamando na reserve.

01:15:05.000 --> 01:15:11.000
Sim, tem que cair na contingência mesmo, mas eu até falei pra você não chamar, não mudar pra eles.

01:15:11.000 --> 01:15:14.000
Eu esqueci de validar o pré-aprovado.

01:15:14.000 --> 01:15:19.000
Eu confei muito, confei muito e não validei o pré-aprovado, tá?

01:15:19.000 --> 01:15:21.000
Eu vou fazer outro teste aqui, aí você passa.

01:15:21.000 --> 01:15:30.000
Beleza, se você quiser fazer, mas ele constou o person e retornou falha no redirecionamento para contingência, tá?

01:15:30.000 --> 01:15:36.000
Talvez a API tá fora em uma mão, mas se quiser tentar isso, só pra gente morrer de certeza.

01:15:36.000 --> 01:15:38.000
Ah, a contingência tá funcionando.

01:15:38.000 --> 01:15:40.000
No nosso lado, tá perfeitamente.

01:15:40.000 --> 01:15:43.000
Tudo tá funcionando.

01:15:43.000 --> 01:15:49.000
Eu tô achando que é eles que estão mirando alguma coisa errada lá na contingência.

01:15:49.000 --> 01:15:51.000
Vai, pera aí, esqueci.

01:15:51.000 --> 01:15:53.000
Altir.

01:15:53.000 --> 01:16:05.000
Ó, insere a massa lá na contingência.

01:16:05.000 --> 01:16:09.000
Agora eu vou confirmar que tá refletindo.

01:16:09.000 --> 01:16:13.000
Que já tá refletindo lá na PUC.

01:16:13.000 --> 01:16:16.000
Joga aqui.

01:16:16.000 --> 01:16:20.000
Joga aqui.

01:16:20.000 --> 01:16:41.000
Joga aqui.

01:16:41.000 --> 01:16:43.000
Agora vai, agora vai.

01:16:43.000 --> 01:16:47.000
Tá retornando aqui da PUC, ó, o pré-aprovado que eu coloquei.

01:16:47.000 --> 01:16:50.000
Agora vamos passar a proposta agora.

01:16:50.000 --> 01:16:59.000
Agora tudo tem que dar certo, gente, pelo amor de Deus, tem que dar certo.

01:16:59.000 --> 01:17:01.000
Vai dar, vai dar.

01:17:47.000 --> 01:18:12.000
Vai.

01:18:12.000 --> 01:18:15.000
Ai, que que aconteceu, hein?

01:18:15.000 --> 01:18:25.000
Vou ter que refazer todo o fluxo, meu.

01:18:25.000 --> 01:18:28.000
Ai, foi grasa, Deus.

01:18:28.000 --> 01:18:41.000
Produtos.

01:18:41.000 --> 01:18:45.000
Ó, o limite liso feio.

01:18:45.000 --> 01:18:49.000
Vou colocar isso aqui também.

01:18:49.000 --> 01:18:53.000
Nossa, a AD voltou a funcionar, gente.

01:18:53.000 --> 01:18:59.000
Ah não, a chave tá desligada, porque não tem isso aqui, né?

01:18:59.000 --> 01:19:01.000
Agora, agora eu fiquei confuso.

01:19:01.000 --> 01:19:03.000
Alguém desligou a chave do AD?

01:19:03.000 --> 01:19:05.000
Esse AD é desligado.

01:19:05.000 --> 01:19:08.000
Alguém desligou a chave do AD?

01:19:08.000 --> 01:19:15.000
Não sei, esse é velho AD.

01:19:15.000 --> 01:19:32.000
Não refletiu lá no xd2, não, não sei o que, onde x2 tá batendo, gente, não faço ideia.

01:19:32.000 --> 01:19:45.000
Mas na etapa de formalizar cartão, ele vai buscar esse valor pra mandar lá pra formalização, não vai?

01:19:45.000 --> 01:19:50.000
Não necessariamente, Miki, o que acontece?

01:19:50.000 --> 01:20:06.000
A gente recebe da xd2, o Igor vai fazer o complete, do complete, o Fabio pega esse valor e vai repassando aqui dentro do camunda, tá?

01:20:06.000 --> 01:20:13.000
Se vi zerado, vai ser zerado, agora se vi é valor, vai ter valor, entendeu?

01:20:13.000 --> 01:20:25.000
Não, sim, mas é qual variável que o camunda vai percorrer pra poder mandar lá pro xd2 fazer a formalização com limite?

01:20:25.000 --> 01:20:27.000
Você sabe, Fabio?

01:20:27.000 --> 01:20:36.000
Você consegue? Eu acho que é valor limite, NPC?

01:20:36.000 --> 01:20:39.000
Deixa eu olhar aqui, pera aí.

01:20:39.000 --> 01:20:57.000
Aí eu vou fazer um teste aqui, vou lá, pega aqui a proposta, antes de formalizar.

01:20:57.000 --> 01:20:59.000
Formalização, hein?

01:20:59.000 --> 01:21:06.000
Antes de formalizar, eu quero enriquecer aqui o valor do pré-aprovado manualmente.

01:21:06.000 --> 01:21:15.000
Mas eu queria saber qual que é o nome da variável que ele vai usar pra poder formalizar, usar na formalização.

01:21:15.000 --> 01:21:20.000
Ou será que vai estar dentro de um objeto? Vai dentro do objeto e ferrou, não tem como fazer não.

01:21:20.000 --> 01:21:27.000
Limite cartão pré-aprovado e limite lixe pré-aprovado.

01:21:27.000 --> 01:21:33.000
Limite minimum disponível, limite pré-aprovado, NPC, aqui.

01:21:33.000 --> 01:21:37.000
Qual que é o valor? 24.600, né?

01:21:37.000 --> 01:21:44.000
24.800.

01:21:44.000 --> 01:21:47.000
Perfeito.

01:21:47.000 --> 01:21:50.000
24.100.

01:21:50.000 --> 01:21:59.000
Em VR Park.

01:21:59.000 --> 01:22:14.000
Abreu a conta, vamos ver agora o fluxo acontecer.

01:22:14.000 --> 01:22:18.000
Recebi os e-mails.

01:22:18.000 --> 01:22:29.000
CBSMS.

01:22:29.000 --> 01:22:32.000
Efetiva a conta.

01:22:32.000 --> 01:22:38.000
Vou ter que esperar o tópico percorrer.

01:22:38.000 --> 01:22:41.000
O tópico cá fica anos.

01:23:02.000 --> 01:23:06.000
Ah, que demora.

01:23:32.000 --> 01:23:57.000
Caldelas.

01:23:58.000 --> 01:24:04.000
Ah, então. Pessoal do XZ2, eles batem lá na poke.

01:24:04.000 --> 01:24:18.000
Só que parece que eles estão batendo em alguma poke diferente do que a gente bate, porque eles não estão conseguindo trazer o valor de pré-aprovado que eu setei lá na poke.

01:24:18.000 --> 01:24:21.000
Ah, tá indo. Recebi algum e-mail.

01:24:22.000 --> 01:24:24.000
Não, ainda tá aqui.

01:24:31.000 --> 01:24:34.000
Ei, gente, será que o tópico morreu?

01:24:36.000 --> 01:24:39.000
Às vezes, eles dão uma dessa.

01:24:39.000 --> 01:24:52.000
Ah, eu queria ajustar esse negócio aqui.

01:25:09.000 --> 01:25:27.000
A velocidade da rolagem parece que tá lenta.

01:25:28.000 --> 01:25:34.000
É isso.

01:25:34.000 --> 01:25:45.000
Ai, avançou. Agora ele tá.

01:25:45.000 --> 01:25:48.000
Mas, gente, o que aconteceu?

01:25:48.000 --> 01:25:51.000
Não era pra ele ter tacado aqui nesse cenário.

01:25:51.000 --> 01:25:54.000
Ai, que labaçura, viu.

01:26:18.000 --> 01:26:27.000
Mas por que que ele se tonou aqui, gente?

01:26:27.000 --> 01:26:36.000
Então, não é da ali que ele tá pegando esse valor. Da onde ele tá pegando esse valor? Ai, cadê?

01:26:36.000 --> 01:26:39.000
O que é o nome desse tópico?

01:26:39.000 --> 01:26:49.000
Efeito Varchek Especial, gerando toque de ateticação, iniciação, encerrando, enviando variáveis para complex, consultar conta corrente.

01:27:07.000 --> 01:27:15.000
O pior contrato. Bem aqui. Deixa eu sentar aqui o que tá acontecendo.

01:27:18.000 --> 01:27:25.000
Olha aí, essa função aí, valor limita e limita.

01:27:25.000 --> 01:27:30.000
Só se ele pegou aqui do obter limita e limita.

01:27:30.000 --> 01:27:35.000
Mas aí, o que tá acontecendo, que não faz sentido.

01:27:35.000 --> 01:27:47.000
Mas aí, se ele pegasse ali do obter limite a risério, estaria aqui no log.

01:27:47.000 --> 01:27:51.000
Chama na PI.

01:27:51.000 --> 01:27:59.000
E trouxe aqui, trouxe os valores certinho.

01:27:59.000 --> 01:28:08.000
Aí, depois vem o tópico especial. Tá certo? Ele obteve o limite certinho do que a gente esperava.

01:28:08.000 --> 01:28:18.000
Aí, vamos...

01:28:18.000 --> 01:28:21.000
Da onde?

01:28:49.000 --> 01:28:51.000
Tá.

01:29:00.000 --> 01:29:03.000
Tá vendo o logo também? Que merda.

01:29:03.000 --> 01:29:10.000
Valor limite, contrato lease, pulte. Valor limite, valor limite. Tá, mas...

01:29:19.000 --> 01:29:28.000
Valor lease para... por isso, gente.

01:29:28.000 --> 01:29:37.000
Por mais que a external test que tá vendo, do Fabrício, por mais que a external test que tá sabendo lidar...

01:29:37.000 --> 01:29:41.000
Mas ele não tá pegando da external test.

01:29:41.000 --> 01:29:45.000
Então, o estranho é que, agora, aquele outro teste passou, né, mi?

01:29:46.000 --> 01:29:48.000
Que ódio.

01:29:48.000 --> 01:29:52.000
Ele tá pegando aqui, ó.

01:29:52.000 --> 01:29:55.000
Tá deu o retorno.

01:29:55.000 --> 01:30:02.000
Não, não é aqui. É aqui, ó.

01:30:02.000 --> 01:30:05.000
Então, mas ele tá acetando aqui como...

01:30:06.000 --> 01:30:10.000
Sim, ele tá acetando em outro lugar, mas só que não sei por que, caramba,

01:30:10.000 --> 01:30:14.000
elas têm essa lógica aqui, que ele vai pegar dessa daqui, ó.

01:30:19.000 --> 01:30:25.000
Então, mi, eu acho que... Quer ver, ó, deixa eu mostrar aqui.

01:30:25.000 --> 01:30:27.000
Vou roubar rapidinho.

01:30:27.000 --> 01:30:30.000
Não faz sentido, porque ele... Tá, deixa eu olhar aqui também.

01:30:30.000 --> 01:30:35.000
Tá vendo, ó, a external test que ela...

01:30:35.000 --> 01:30:39.000
Ela vai devolver com esse nome aqui, ó.

01:30:39.000 --> 01:30:41.000
Valor lease pré-aprovado.

01:30:41.000 --> 01:30:43.000
É isso.

01:30:43.000 --> 01:30:48.000
Só que ela pega do valor limite lease pré-aprovado.

01:30:48.000 --> 01:30:51.000
Deixa eu só confirmar uma coisa aqui.

01:30:51.000 --> 01:30:55.000
Deixa eu olhar aqui novamente a variável.

01:30:55.000 --> 01:31:00.000
Que tá a variável limite lease piririporo.

01:31:00.000 --> 01:31:04.000
Como que ela tá aqui?

01:31:04.000 --> 01:31:09.000
Que eu tô achando que tem algum momento que ele tá sobrescrevendo alguma coisa.

01:31:09.000 --> 01:31:12.000
Limite lease abertura.

01:31:12.000 --> 01:31:14.000
Desse realizando.

01:31:14.000 --> 01:31:16.000
É.

01:31:18.000 --> 01:31:22.000
Tá sobrescrevendo.

01:31:22.000 --> 01:31:24.000
Em algum lugar, tá sobrescrevendo.

01:31:24.000 --> 01:31:29.000
Porque no início, ela começou dessa forma.

01:31:29.000 --> 01:31:35.000
E depois, ela ficou desse jeito aí.

01:31:35.000 --> 01:31:38.000
Daquele jeito lá que tava, sabe?

01:31:38.000 --> 01:31:42.000
Deixa eu só olhar se eu tô na proposta certa.

01:31:42.000 --> 01:31:44.000
Pra não tá falando um groselho.

01:31:44.000 --> 01:31:48.000
Foi a sete três no final. Eu tô na sete três.

01:31:48.000 --> 01:31:50.000
É isso mesmo.

01:31:51.000 --> 01:31:56.000
Então, quem que tá sobrescrevendo?

01:31:59.000 --> 01:32:04.000
É esse monta contrato?

01:32:07.000 --> 01:32:12.000
Não, ele só dá um get de limite getcredito v3.

01:32:12.000 --> 01:32:16.000
Valor limite def lease.

01:32:16.000 --> 01:32:18.000
Não é aqui.

01:32:18.000 --> 01:32:20.000
Então, eu tô achando que é...

01:32:20.000 --> 01:32:23.000
Ai, meu Deus. Será que é nesse...

01:32:23.000 --> 01:32:27.000
Montar payload, obter limite.

01:32:30.000 --> 01:32:32.000
Também não é aqui.

01:32:32.000 --> 01:32:36.000
Algum lugar tá sobrescrevendo essa variável.

01:32:36.000 --> 01:32:40.000
Será que é mapeia campo jet? Deixa eu ver.

01:32:41.000 --> 01:32:47.000
Ah, aperta produto. Também não é aqui.

01:32:54.000 --> 01:32:59.000
Ou será que é mais pra trás ali no...

01:33:02.000 --> 01:33:07.000
O dados ofertas fica dentro de onde mesmo vocês lembram.

01:33:08.000 --> 01:33:13.000
Onde é criado dados oferta.

01:33:13.000 --> 01:33:17.000
Ela atualiza a efetivação da proposta?

01:33:17.000 --> 01:33:19.000
Não.

01:33:19.000 --> 01:33:21.000
Não.

01:33:21.000 --> 01:33:23.000
O dados oferta...

01:33:25.000 --> 01:33:27.000
Ele...

01:33:29.000 --> 01:33:31.000
Tem um...

01:33:31.000 --> 01:33:33.000
Um user test que é um dados oferta.

01:33:34.000 --> 01:33:38.000
Olha, ele é preenche os campos.

01:33:43.000 --> 01:33:45.000
Aqui, ó.

01:33:48.000 --> 01:33:51.000
Não, mas tem uma última etapa do dados oferta.

01:33:55.000 --> 01:33:57.000
É isso, é nesse script.

01:34:04.000 --> 01:34:06.000
É...

01:34:10.000 --> 01:34:12.000
Aqui é...

01:34:12.000 --> 01:34:15.000
Vai lá embaixo, lá embaixo, lá embaixo.

01:34:15.000 --> 01:34:18.000
Isso, vai...

01:34:18.000 --> 01:34:20.000
Em script.

01:34:23.000 --> 01:34:26.000
Tá, beleza. Vai nesse output aí.

01:34:26.000 --> 01:34:28.000
É aí, Fabio, que tá...

01:34:28.000 --> 01:34:30.000
É aí mesmo que tá no script.

01:34:30.000 --> 01:34:34.000
Tem alguma coisa que interage com a variável de limite?

01:34:40.000 --> 01:34:42.000
Isso aqui, por favor.

01:35:01.000 --> 01:35:03.000
Image...

01:35:07.000 --> 01:35:10.000
Não, só copiei tudo aqui, tá?

01:35:10.000 --> 01:35:12.000
Achei você de ser alguma coisa.

01:35:23.000 --> 01:35:26.000
Acho que é isso, nem recortei, nem...

01:35:26.000 --> 01:35:28.000
Agora não...

01:35:28.000 --> 01:35:30.000
Existe limites aqui, não.

01:35:34.000 --> 01:35:36.000
Tá muito comum.

01:35:47.000 --> 01:35:49.000
Eita.

01:35:49.000 --> 01:35:51.000
Tá.

01:35:54.000 --> 01:35:56.000
Tem uma etapa...

01:35:56.000 --> 01:35:58.000
Vai ali no modo xdml ali, ó.

01:36:01.000 --> 01:36:05.000
Aí vai na linha 1799.

01:36:19.000 --> 01:36:21.000
Tá aqui.

01:36:22.000 --> 01:36:25.000
Pô, que tá perto, um pouquinho mais pra baixo.

01:36:25.000 --> 01:36:27.000
Pode ser mais um pouquinho.

01:36:29.000 --> 01:36:31.000
Só mais um pouquinho, ó.

01:36:31.000 --> 01:36:33.000
É, 1799.

01:36:33.000 --> 01:36:35.000
Aí, ó.

01:36:35.000 --> 01:36:37.000
Aí tá vendo?

01:36:37.000 --> 01:36:39.000
Eu não entendi...

01:36:39.000 --> 01:36:41.000
Uma palavrinha dessa lógica.

01:36:41.000 --> 01:36:43.000
O que que tem aí?

01:36:45.000 --> 01:36:47.000
Isso aqui default value.

01:36:47.000 --> 01:36:49.000
Ou seja, valor padrão.

01:36:49.000 --> 01:36:51.000
Se tiver a variável limite rotativo,

01:36:51.000 --> 01:36:53.000
o V3 responsa, então...

01:36:57.000 --> 01:36:59.000
Limites rotativas respostas.

01:36:59.000 --> 01:37:01.000
Ele pega essa variável aqui, não?

01:37:01.000 --> 01:37:03.000
Ou seja, o valor padrão aqui,

01:37:03.000 --> 01:37:05.000
é se...

01:37:05.000 --> 01:37:07.000
Se tiver essa variável aqui,

01:37:07.000 --> 01:37:09.000
ela existiria e ele vai pegar esse valor aqui.

01:37:09.000 --> 01:37:11.000
Do responsa.

01:37:11.000 --> 01:37:13.000
É, isso é nosso coletar 100.

01:37:13.000 --> 01:37:15.000
Eita, será que é isso aí?

01:37:15.000 --> 01:37:17.000
Porque isso aqui a gente só tá falando de um...

01:37:17.000 --> 01:37:19.000
De um... De um canto, ó.

01:37:21.000 --> 01:37:23.000
Provavelmente...

01:37:23.000 --> 01:37:25.000
Coletar 100.

01:37:25.000 --> 01:37:27.000
Isso daí não é...

01:37:27.000 --> 01:37:29.000
Do completar 100?

01:37:29.000 --> 01:37:31.000
Mas por que que...

01:37:31.000 --> 01:37:33.000
Mas por...

01:37:33.000 --> 01:37:35.000
Por que que tá dentro de col...

01:37:35.000 --> 01:37:37.000
Por que que dentro de coletar 100

01:37:37.000 --> 01:37:39.000
tem um fluxo de limite?

01:37:39.000 --> 01:37:41.000
Isso aqui...

01:37:41.000 --> 01:37:43.000
O que é isso?

01:37:43.000 --> 01:37:45.000
O que é isso?

01:37:45.000 --> 01:37:47.000
O que é isso?

01:37:47.000 --> 01:37:49.000
O que é isso?

01:37:49.000 --> 01:37:51.000
O que é isso?

01:37:51.000 --> 01:37:53.000
O que é isso?

01:37:53.000 --> 01:37:55.000
O que é isso aqui?

01:38:03.000 --> 01:38:05.000
Será que essa é a lógica de exibir a tela do cliente,

01:38:05.000 --> 01:38:07.000
o limite pro cliente?

01:38:07.000 --> 01:38:09.000
Eu acho.

01:38:13.000 --> 01:38:15.000
É porque... Eu acredito que você disse aqui, pessoal.

01:38:15.000 --> 01:38:17.000
Porque é assim.

01:38:17.000 --> 01:38:19.000
A gente vai usar esse campo aqui

01:38:19.000 --> 01:38:21.000
em vários locais.

01:38:21.000 --> 01:38:23.000
Essa lógica aqui,

01:38:23.000 --> 01:38:25.000
é se ele não estiver preenchido.

01:38:25.000 --> 01:38:27.000
Por exemplo, se o campo estiver nulo,

01:38:27.000 --> 01:38:29.000
ele vai pegar aqui do valor...

01:38:29.000 --> 01:38:31.000
do valor de ful, que é justamente o que vem ali do...

01:38:31.000 --> 01:38:33.000
da puque.

01:38:33.000 --> 01:38:35.000
Isso aqui é a resposta lá da puque.

01:38:35.000 --> 01:38:37.000
Agora, se ele já estiver preenchido,

01:38:37.000 --> 01:38:39.000
ele vai valer o valor que tá preenchido já.

01:38:39.000 --> 01:38:41.000
Isso aqui é como se fosse mais um fallback mesmo, sabe?

01:38:41.000 --> 01:38:43.000
Ah, tá.

01:38:43.000 --> 01:38:45.000
E isso aqui também não vai estar só no coletar 100.

01:38:45.000 --> 01:38:47.000
Eu acredito que isso aqui vai estar aí outros...

01:38:47.000 --> 01:38:49.000
Outras...

01:38:49.000 --> 01:38:53.000
Socofim, mas...

01:39:19.000 --> 01:39:21.000
Ai, meu Deus,

01:39:21.000 --> 01:39:23.000
minha psicóloga...

01:39:23.000 --> 01:39:25.000
Calma aí, gata garota.

01:39:25.000 --> 01:39:27.000
Gente, eu vou ficar só mais 10 minutos,

01:39:27.000 --> 01:39:29.000
que é o tempo que eu tenho.

01:39:29.000 --> 01:39:31.000
Preciso usar daí, pessoal.

01:39:31.000 --> 01:39:33.000
Ficou com tal cabeça,

01:39:33.000 --> 01:39:35.000
só o meu aniversário...

01:39:35.000 --> 01:39:37.000
Tá vendo?

01:39:41.000 --> 01:39:43.000
Não, eu vou ter que bater ponto e voltar, né?

01:39:43.000 --> 01:39:45.000
Porque eu não vou ter que fazer

01:39:45.000 --> 01:39:47.000
o relatóriozinho de hoje,

01:39:47.000 --> 01:39:49.000
os evoluções de hoje,

01:39:49.000 --> 01:39:51.000
mas tem algum lugar, gente,

01:39:51.000 --> 01:39:53.000
que tá alterando ali.

01:39:53.000 --> 01:39:55.000
Não tô louca, não tô louca.

01:39:55.000 --> 01:39:57.000
Ômio, aquela peita mocada...

01:39:59.000 --> 01:40:01.000
Aqui o C8 tá batendo pra limite, sim?

01:40:01.000 --> 01:40:03.000
É.

01:40:05.000 --> 01:40:07.000
Lá no...

01:40:09.000 --> 01:40:11.000
Lá no C8 dá pra pegar de novo

01:40:11.000 --> 01:40:13.000
aquele valorzinho lá pra ver.

01:40:13.000 --> 01:40:15.000
Qual deles?

01:40:15.000 --> 01:40:17.000
Sabe lá nos atributos,

01:40:17.000 --> 01:40:19.000
nas variáveis lá do...

01:40:19.000 --> 01:40:21.000
da Mundo?

01:40:21.000 --> 01:40:23.000
A gente tava olhando aquele map.

01:40:25.000 --> 01:40:27.000
Vivem serializando...

01:40:27.000 --> 01:40:29.000
Serializando...

01:40:29.000 --> 01:40:31.000
Ah, aqui tá...

01:40:31.000 --> 01:40:33.000
Aqui, ó...

01:40:33.000 --> 01:40:35.000
Ele tá conseguindo serializar aí?

01:40:35.000 --> 01:40:37.000
Sim.

01:40:37.000 --> 01:40:39.000
Ah lá, é que tá...

01:40:39.000 --> 01:40:41.000
É isso que tá super escrevendo.

01:40:41.000 --> 01:40:43.000
É isso que é...

01:40:43.000 --> 01:40:45.000
Eu acho que...

01:40:45.000 --> 01:40:47.000
Ah, eu acho que...

01:40:47.000 --> 01:40:49.000
Eu acho que é isso, velho.

01:40:49.000 --> 01:40:51.000
Porque aqui nesse valor padrão aqui,

01:40:51.000 --> 01:40:53.000
ele tá sobrescrevendo...

01:40:53.000 --> 01:40:55.000
Ele tá vendo se essa variável aí que a minha brilha existe.

01:40:55.000 --> 01:40:57.000
Se ela existe,

01:40:57.000 --> 01:40:59.000
ela vai substituir aquele valor limite

01:40:59.000 --> 01:41:01.000
com a variável que tá aí dentro.

01:41:01.000 --> 01:41:03.000
A variável que tá aí dentro, tá novo.

01:41:03.000 --> 01:41:05.000
Tá substituindo por novo.

01:41:05.000 --> 01:41:07.000
Eu acho que é isso.

01:41:07.000 --> 01:41:09.000
E ele pega daquela API lá

01:41:09.000 --> 01:41:11.000
que eu comentei

01:41:11.000 --> 01:41:13.000
e tá voltando...

01:41:13.000 --> 01:41:15.000
Teria que voltar do outro.

01:41:15.000 --> 01:41:17.000
Eu acho que é isso.

01:41:17.000 --> 01:41:19.000
Tem duas vezes que chamam esse external task.

01:41:19.000 --> 01:41:21.000
Lá depois de agências,

01:41:21.000 --> 01:41:23.000
que aí é onde ele deixa tudo bonitinho aqui,

01:41:23.000 --> 01:41:25.000
e depois tem a parte...

01:41:25.000 --> 01:41:27.000
Não, três vezes, chama esse external task.

01:41:27.000 --> 01:41:29.000
Lá de agências,

01:41:29.000 --> 01:41:31.000
aí depois tem a etapa...

01:41:31.000 --> 01:41:33.000
Essa etapa aqui, ó...

01:41:35.000 --> 01:41:37.000
Essa etapa aqui...

01:41:37.000 --> 01:41:39.000
Essa aqui...

01:41:39.000 --> 01:41:41.000
Entendeu que aí ele vai bater lá

01:41:41.000 --> 01:41:43.000
pra buscar o limite de novo.

01:41:45.000 --> 01:41:47.000
Mas se caso der errado aqui,

01:41:47.000 --> 01:41:49.000
ele vai bater na contingência.

01:41:51.000 --> 01:41:53.000
E aí...

01:41:53.000 --> 01:41:55.000
A parte que seria aqui,

01:41:55.000 --> 01:41:57.000
na efetiva cartão,

01:41:57.000 --> 01:41:59.000
no GE, efetiva cartão,

01:41:59.000 --> 01:42:01.000
só que aí não era nós, aí seria o pessoal do GE mesmo,

01:42:01.000 --> 01:42:03.000
queria bater.

01:42:03.000 --> 01:42:05.000
Mas a gente vai passar por cima aqui,

01:42:05.000 --> 01:42:07.000
então não vai ali.

01:42:07.000 --> 01:42:09.000
Aqui no...

01:42:09.000 --> 01:42:11.000
No MAP,

01:42:11.000 --> 01:42:13.000
contrato check especial,

01:42:13.000 --> 01:42:15.000
e contrato check especial list.

01:42:15.000 --> 01:42:17.000
É aí que ele tá sobrexervendo.

01:42:17.000 --> 01:42:19.000
Só que tá sobrexervendo com nulos, né?

01:42:19.000 --> 01:42:21.000
O objeto lá, ele não tá completo.

01:42:21.000 --> 01:42:23.000
Ele só tá com dois valores.

01:42:23.000 --> 01:42:25.000
Mas ele não tem...

01:42:25.000 --> 01:42:27.000
Mas aqui não tem lógica de sobre escrita.

01:42:27.000 --> 01:42:29.000
Tem? Tem, tem.

01:42:29.000 --> 01:42:31.000
Esse dev valor, bem aí, bem aí.

01:42:31.000 --> 01:42:33.000
Primeiro ele faz o quê?

01:42:33.000 --> 01:42:35.000
Primeiro ele monta a função, né?

01:42:35.000 --> 01:42:37.000
Ele limita e lisa a função.

01:42:37.000 --> 01:42:39.000
Essa valor limita e lisa a função,

01:42:39.000 --> 01:42:41.000
que é a função,

01:42:41.000 --> 01:42:43.000
ele desce e feia aí, ele faz o quê?

01:42:43.000 --> 01:42:45.000
Tem a variável, limita e rotativa,

01:42:45.000 --> 01:42:47.000
preto, abertura, conta e resposta, tem.

01:42:47.000 --> 01:42:49.000
Quando tem,

01:42:49.000 --> 01:42:51.000
ele vai entrar dentro do IF

01:42:51.000 --> 01:42:53.000
e vai substituir a resposta

01:42:53.000 --> 01:42:55.000
com essa variável ali do...

01:42:55.000 --> 01:42:57.000
com essa valor lisper aprovado,

01:42:57.000 --> 01:42:59.000
que é pra estar dentro dessa...

01:42:59.000 --> 01:43:01.000
dessa responsabilidade que a gente viu agora.

01:43:01.000 --> 01:43:03.000
Só que essa variável aí

01:43:03.000 --> 01:43:05.000
não tá novo, né?

01:43:05.000 --> 01:43:07.000
É.

01:43:07.000 --> 01:43:09.000
Era pra ele, pra gente fazer, que ele...

01:43:09.000 --> 01:43:11.000
Aquela parada que eu...

01:43:13.000 --> 01:43:15.000
É, isso aí é só a função.

01:43:15.000 --> 01:43:17.000
Aí, da linha de baixo, ele faz o quê?

01:43:17.000 --> 01:43:19.000
Ele faz valor limite, igual a...

01:43:19.000 --> 01:43:21.000
Essa função aí que a gente acabou de ver.

01:43:21.000 --> 01:43:23.000
E depois, no contrato lisa, ele vai lá

01:43:23.000 --> 01:43:25.000
e bota valor limite lisa, igual o valor que ele

01:43:25.000 --> 01:43:27.000
substituiu logo acima ali.

01:43:27.000 --> 01:43:29.000
Ah, então,

01:43:29.000 --> 01:43:31.000
ele tem um fallback, tecnicamente,

01:43:31.000 --> 01:43:33.000
caso não existir nada preenchida aqui,

01:43:33.000 --> 01:43:35.000
ele mesmo preenche pra não quebrar que

01:43:35.000 --> 01:43:37.000
eu entendi isso.

01:43:37.000 --> 01:43:39.000
Caramba.

01:43:39.000 --> 01:43:41.000
E daí, ele não tá nem caindo lá,

01:43:41.000 --> 01:43:43.000
ele não tá nem patendo no R0, porque só tá

01:43:43.000 --> 01:43:45.000
verificando ali, se aquela variável existe.

01:43:45.000 --> 01:43:47.000
Ela existe, só que a variável...

01:43:47.000 --> 01:43:49.000
Ele não chega a cair no fallback

01:43:49.000 --> 01:43:51.000
porque o...

01:43:51.000 --> 01:43:53.000
comparativo aí

01:43:53.000 --> 01:43:55.000
tá errado, né?

01:43:55.000 --> 01:43:57.000
É só do objeto, né?

01:43:57.000 --> 01:43:59.000
Não é no campo que tá dentro do objeto.

01:43:59.000 --> 01:44:01.000
É...

01:44:01.000 --> 01:44:03.000
Mas eu acho,

01:44:03.000 --> 01:44:05.000
que se colocar ali

01:44:05.000 --> 01:44:07.000
no seu mock,

01:44:07.000 --> 01:44:09.000
porque aquela hora que você ajustou, foi, né?

01:44:09.000 --> 01:44:11.000
Foi até o final.

01:44:11.000 --> 01:44:13.000
É, com o mock, deveria estar subindo.

01:44:13.000 --> 01:44:15.000
Mas o problema não é o mock, gente.

01:44:15.000 --> 01:44:17.000
O problema é o que tá dentro

01:44:17.000 --> 01:44:19.000
do objeto.

01:44:19.000 --> 01:44:21.000
O que ele tá esperando dentro do objeto.

01:44:21.000 --> 01:44:23.000
E como ele não tá encontrando

01:44:23.000 --> 01:44:25.000
o que ele tá esperando de alguma forma...

01:44:25.000 --> 01:44:27.000
Na verdade...

01:44:27.000 --> 01:44:29.000
Na verdade, na verdade, ele não tinha que

01:44:29.000 --> 01:44:31.000
esperar, adatar.

01:44:31.000 --> 01:44:33.000
Ele só tem que percorrer lá e pegar os valor

01:44:33.000 --> 01:44:35.000
do que já existe.

01:44:35.000 --> 01:44:37.000
E ele não tinha que fazer fallback nenhum?

01:44:37.000 --> 01:44:39.000
Sim. É que é external test

01:44:39.000 --> 01:44:41.000
que...

01:44:41.000 --> 01:44:43.000
Ela tá esperando campos

01:44:43.000 --> 01:44:45.000
com valor X.

01:44:45.000 --> 01:44:47.000
E o back-end...

01:44:47.000 --> 01:44:49.000
Mas não é external test que tá sobre escrevendo, gente.

01:44:49.000 --> 01:44:51.000
Não é sobre escrevendo,

01:44:51.000 --> 01:44:53.000
ela não tá conseguindo

01:44:53.000 --> 01:44:55.000
interpretar

01:44:55.000 --> 01:44:57.000
a resposta do back-end.

01:44:57.000 --> 01:44:59.000
Porque o nome do campo

01:44:59.000 --> 01:45:01.000
não é o que ela espera.

01:45:01.000 --> 01:45:03.000
Porque não existe aqui, ó.

01:45:03.000 --> 01:45:05.000
Não existe.

01:45:05.000 --> 01:45:07.000
Esse é o objeto que tem que tá ali, o valorzinho

01:45:07.000 --> 01:45:09.000
bonitinho.

01:45:09.000 --> 01:45:11.000
Isso. Então, esse já é o valor

01:45:11.000 --> 01:45:13.000
retornado pela external test, que...

01:45:13.000 --> 01:45:15.000
Não, mas não faz sentido

01:45:15.000 --> 01:45:17.000
o Fabrício, porque até

01:45:17.000 --> 01:45:19.000
chegar em produtos, esse objeto tá completo.

01:45:19.000 --> 01:45:21.000
Aí, depois, quando eu

01:45:21.000 --> 01:45:23.000
chego nessa etapa, só tem isso de informação.

01:45:23.000 --> 01:45:25.000
Mas essa aí não é a resposta

01:45:25.000 --> 01:45:27.000
da API?

01:45:27.000 --> 01:45:29.000
Isso, mas só que essa

01:45:29.000 --> 01:45:31.000
resposta, ela é preenchida aqui, ó.

01:45:31.000 --> 01:45:33.000
Ela é preenchida nessa etapa

01:45:33.000 --> 01:45:35.000
aqui, ó. Vixe lá, traizão, ó.

01:45:35.000 --> 01:45:37.000
Por isso que eu tô te falando que não faz sentido.

01:45:37.000 --> 01:45:39.000
Ele vai... Aqui, ó,

01:45:39.000 --> 01:45:41.000
iniciar consulta limite rotativo.

01:45:41.000 --> 01:45:43.000
Quando chega aqui,

01:45:43.000 --> 01:45:45.000
ele vai cair aqui nesse sub fluxo, aqui, ó.

01:45:45.000 --> 01:45:47.000
E vai bater lá na poke.

01:45:47.000 --> 01:45:49.000
Quer ver? Eu vou passar aqui

01:45:49.000 --> 01:45:51.000
rapidinho.

01:45:51.000 --> 01:45:53.000
Mas é isso, cara.

01:45:53.000 --> 01:45:55.000
Esse momento aí, que

01:45:55.000 --> 01:45:57.000
não tá preenchendo tudo?

01:45:57.000 --> 01:45:59.000
Não, quer ver.

01:45:59.000 --> 01:46:01.000
Eu vou passar aqui.

01:46:03.000 --> 01:46:05.000
Gente, eu tô muito doido

01:46:05.000 --> 01:46:07.000
já, então.

01:46:07.000 --> 01:46:09.000
É fim do dia, é fim do dia. Não,

01:46:09.000 --> 01:46:11.000
velho, não tem como não ficar também, né?

01:46:11.000 --> 01:46:13.000
Alvornautinho,

01:46:13.000 --> 01:46:15.000
quer ser seu amiguinho?

01:46:15.000 --> 01:46:17.000
Você não tem consulta

01:46:17.000 --> 01:46:19.000
e não... Tem, mas ela

01:46:19.000 --> 01:46:21.000
espera.

01:46:23.000 --> 01:46:25.000
Vai, passa logo.

01:46:31.000 --> 01:46:33.000
A gente, vou ter que ir lá,

01:46:33.000 --> 01:46:35.000
senão...

01:46:35.000 --> 01:46:37.000
Calma lá, você vai até eu chegar em produto.

01:46:37.000 --> 01:46:39.000
Você não vai me deixar o toito.

01:46:39.000 --> 01:46:41.000
Vai esperar eu chegar em produto.

01:46:41.000 --> 01:46:43.000
Calma aí.

01:46:43.000 --> 01:46:45.000
Tá com um moque.

01:46:45.000 --> 01:46:47.000
Tá com um moque lá,

01:46:47.000 --> 01:46:49.000
não vai bater lá no...

01:46:49.000 --> 01:46:51.000
Na hora que eu passar,

01:46:51.000 --> 01:46:53.000
a gente vai estar, só que tá aqui, lerdeza.

01:46:53.000 --> 01:46:55.000
Beleza.

01:47:07.000 --> 01:47:09.000
Ok, ok.

01:47:17.000 --> 01:47:19.000
Ok.

01:47:31.000 --> 01:47:33.000
Agora, aqui a mágica

01:47:33.000 --> 01:47:35.000
acontece, ó. Quando eu clicar

01:47:35.000 --> 01:47:37.000
em continuar...

01:47:39.000 --> 01:47:41.000
Pronto, ele já enriqueceu lá.

01:47:41.000 --> 01:47:43.000
Eu vou pegar aqui

01:47:43.000 --> 01:47:45.000
o console aqui, a proposta.

01:47:45.000 --> 01:47:47.000
Eu vou olhar aqui no datador.

01:47:47.000 --> 01:47:49.000
Põe processos.

01:48:05.000 --> 01:48:07.000
Aí, cadê? Limite...

01:48:07.000 --> 01:48:09.000
Aqui. Limite a abertura de contas.

01:48:09.000 --> 01:48:11.000
Ó, o tamanho desse cereal.

01:48:11.000 --> 01:48:13.000
Lise, daqui. Ó, tá vendo?

01:48:13.000 --> 01:48:15.000
Aqui, eu não tô doida, gente.

01:48:15.000 --> 01:48:17.000
Eu não tô doida.

01:48:17.000 --> 01:48:19.000
Eu não sou louca, Pedrinho.

01:48:21.000 --> 01:48:23.000
Ô, Mi, mas agora...

01:48:23.000 --> 01:48:25.000
Agora...

01:48:25.000 --> 01:48:27.000
Eu não sei se foi um moque, mas

01:48:27.000 --> 01:48:29.000
voltou os campos certos.

01:48:29.000 --> 01:48:31.000
Não.

01:48:31.000 --> 01:48:33.000
Eu vou chegar até o final.

01:48:33.000 --> 01:48:35.000
Vai lá, vai lá.

01:48:35.000 --> 01:48:37.000
Vou chegar até o final agora.

01:48:37.000 --> 01:48:39.000
Ó, coloquei o que tá no banalogue.

01:48:39.000 --> 01:48:41.000
Aí, preenchei.

01:48:41.000 --> 01:48:43.000
Aí, preenchei.

01:48:43.000 --> 01:48:45.000
Não é esse 14 mi.

01:48:45.000 --> 01:48:47.000
Tem alguma etapa que chega

01:48:47.000 --> 01:48:49.000
ali naquela etapa lá na frente

01:48:49.000 --> 01:48:51.000
que ele...

01:48:51.000 --> 01:48:53.000
E isso, ele sobreescreve.

01:48:53.000 --> 01:48:55.000
É isso que eu tô falando. Tá sobreescrevendo

01:48:55.000 --> 01:48:57.000
aquele objeto. Agora, né?

01:48:57.000 --> 01:48:59.000
Nesse momento, o que você tá fazendo agora?

01:48:59.000 --> 01:49:01.000
Não sei. Eu vou olhar aqui.

01:49:01.000 --> 01:49:03.000
Cada etapa que eu vou olhar aqui.

01:49:03.000 --> 01:49:05.000
Pera aí.

01:49:05.000 --> 01:49:07.000
O que você tá falando?

01:49:07.000 --> 01:49:09.000
Ou vai dar erro?

01:49:09.000 --> 01:49:11.000
Deu erro.

01:49:11.000 --> 01:49:13.000
Deu 500 e alguma coisa.

01:49:13.000 --> 01:49:15.000
E eu não vou conseguir avançar, porque

01:49:15.000 --> 01:49:17.000
ele já vai jogar pra biometria, quer ver?

01:49:31.000 --> 01:49:33.000
Já jogou pra biometria.

01:49:33.000 --> 01:49:35.000
Não vou conseguir com...

01:49:35.000 --> 01:49:37.000
Mas eu acho que não é

01:49:37.000 --> 01:49:39.000
aqui no...

01:49:39.000 --> 01:49:41.000
Ou será que é a

01:49:41.000 --> 01:49:43.000
parte de produtos?

01:49:43.000 --> 01:49:45.000
Limite máximo.

01:49:45.000 --> 01:49:47.000
NPC.

01:49:47.000 --> 01:49:49.000
Pra provar NPC.

01:49:49.000 --> 01:49:51.000
Ainda não é em produtos.

01:49:51.000 --> 01:49:53.000
Até produtos tá chegando até

01:49:53.000 --> 01:49:55.000
aqui.

01:49:55.000 --> 01:49:57.000
Entendeu?

01:49:57.000 --> 01:49:59.000
Até aqui.

01:49:59.000 --> 01:50:01.000
Talvez seja na tela de visão cliente,

01:50:01.000 --> 01:50:03.000
me.

01:50:03.000 --> 01:50:05.000
Ai.

01:50:07.000 --> 01:50:09.000
York, quando eu voltar

01:50:09.000 --> 01:50:11.000
não vou conseguir

01:50:11.000 --> 01:50:13.000
repasar esses testes, porque já vai ter

01:50:13.000 --> 01:50:15.000
ligado os servidores.

01:50:15.000 --> 01:50:17.000
Não tem que deixar isso pra amanhã, então, gente.

01:50:21.000 --> 01:50:23.000
Mas, vocês entenderam

01:50:23.000 --> 01:50:25.000
que eu não tô louca?

01:50:25.000 --> 01:50:27.000
Você entendeu, Fabrício? É que eu não consigo...

01:50:27.000 --> 01:50:29.000
Sim, sim. Não, eu entendi.

01:50:29.000 --> 01:50:31.000
Eu estava achando que era

01:50:31.000 --> 01:50:33.000
outro ponto ainda.

01:50:33.000 --> 01:50:35.000
Eu só não sei onde que é que tá sobre escrevendo.

01:50:35.000 --> 01:50:37.000
A gente vai ter que, tipo, em cada tela, avançou

01:50:37.000 --> 01:50:39.000
uma tela, olha lá.

01:50:39.000 --> 01:50:41.000
Avançou outra tela, olha lá, pra achar exatamente

01:50:41.000 --> 01:50:43.000
onde que é que tá sobre escrevendo os valores

01:50:43.000 --> 01:50:45.000
dali.

01:50:45.000 --> 01:50:47.000
Aomete ele em 5x3.

01:50:47.000 --> 01:50:49.000
Vai, o...

01:50:49.000 --> 01:50:51.000
Qual som, tipo, eu tô praticando aqui.

01:50:51.000 --> 01:50:53.000
Qual som aí, momentos que ele chama esse topo?

01:50:57.000 --> 01:50:59.000
Redrinho.

01:50:59.000 --> 01:51:01.000
Você vai falar com o pessoal do XD2

01:51:01.000 --> 01:51:03.000
depois, perguntar por que

01:51:03.000 --> 01:51:05.000
que quando a gente impota um pré-aprovado

01:51:05.000 --> 01:51:07.000
lá na contingência, os XD2

01:51:07.000 --> 01:51:09.000
não tá aparecendo

01:51:09.000 --> 01:51:11.000
os valores do

01:51:11.000 --> 01:51:13.000
pré-aprovado.

01:51:13.000 --> 01:51:15.000
Mas pergunta de bem

01:51:15.000 --> 01:51:17.000
de inocente mesmo, porque,

01:51:17.000 --> 01:51:19.000
talvez, tem alguma coisa errada lá do lado

01:51:19.000 --> 01:51:21.000
deles.

01:51:21.000 --> 01:51:23.000
Tá, assim, Mia, eu vou te chamar amanhã

01:51:23.000 --> 01:51:25.000
porque eu não sei explicar isso

01:51:25.000 --> 01:51:27.000
muito bem pro Grilo e pro Guilherme.

01:51:27.000 --> 01:51:29.000
E aí, a gente fala

01:51:29.000 --> 01:51:31.000
com eles pra avaliar, tá?

01:51:31.000 --> 01:51:33.000
Tá.

01:51:33.000 --> 01:51:35.000
Soco mais tarde.

01:51:35.000 --> 01:51:37.000
Eu acho que da maneira como eu vou falar,

01:51:37.000 --> 01:51:39.000
talvez eles não entendam.

01:51:39.000 --> 01:51:41.000
Então, se você tiver,

01:51:41.000 --> 01:51:43.000
aí fica mais fácil, entendeu?

01:51:43.000 --> 01:51:45.000
Tá bom. Então, é isso, gente.

01:51:45.000 --> 01:51:47.000
Eu acho que... Eu vou voltar aqui

01:51:47.000 --> 01:51:49.000
daqui uma hora, mas eu só vou voltar pra poder

01:51:49.000 --> 01:51:51.000
deixar lá o farol, porque

01:51:51.000 --> 01:51:53.000
eu tenho que deixar o farol.

01:51:53.000 --> 01:51:55.000
Mas, assim, não vou conseguir testar mais nada.

01:51:55.000 --> 01:51:57.000
Já...

01:51:57.000 --> 01:51:59.000
Eu também já tô exaust...

01:51:59.000 --> 01:52:01.000
exaust só pra caramba,

01:52:01.000 --> 01:52:03.000
que eu não aguento mais ver esse BPM

01:52:03.000 --> 01:52:05.000
em N na minha frente.

01:52:05.000 --> 01:52:07.000
Tá bom.

01:52:07.000 --> 01:52:09.000
Mas acho que a gente avançou

01:52:09.000 --> 01:52:11.000
bastante. Eu acho que a gente avançou

01:52:11.000 --> 01:52:13.000
bastante aqui. Tá pronto.

01:52:13.000 --> 01:52:15.000
Tá bom.

01:52:15.000 --> 01:52:17.000
Então, tá bom, meus amores.

01:52:17.000 --> 01:52:19.000
Eu vou em Blimey.

01:52:19.000 --> 01:52:21.000
Beijo, beijo, eu quero agradecer.

01:52:21.000 --> 01:52:23.000
Valeu, pessoal.

01:52:23.000 --> 01:52:25.000
Até a próxima.

01:52:53.000 --> 01:52:55.000
Tchau, tchau.

01:53:23.000 --> 01:53:25.000
Tchau, tchau.

01:53:53.000 --> 01:53:55.000
Tchau, tchau.

01:54:23.000 --> 01:54:25.000
Tchau, tchau.

01:54:53.000 --> 01:54:55.000
Tchau, tchau.

01:55:23.000 --> 01:55:25.000
Tchau.

01:55:53.000 --> 01:55:55.000
Tchau, tchau.

01:56:23.000 --> 01:56:25.000
Tchau, tchau.

01:56:53.000 --> 01:56:55.000
Tchau, tchau.

01:57:23.000 --> 01:57:25.000
Tchau, tchau.

01:57:53.000 --> 01:57:55.000
Tchau, tchau.

01:58:23.000 --> 01:58:25.000
Tchau, tchau.

01:58:53.000 --> 01:58:55.000
Tchau, tchau.

01:59:23.000 --> 01:59:25.000
Tchau, tchau.

01:59:53.000 --> 01:59:55.000
Tchau, tchau.

02:00:23.000 --> 02:00:25.000
Tchau, tchau.

02:00:53.000 --> 02:00:55.000
Tchau, tchau.

02:01:23.000 --> 02:01:25.000
Tchau, tchau.

02:01:53.000 --> 02:01:55.000
Tchau, tchau.

02:02:23.000 --> 02:02:25.000
Tchau, tchau.

02:02:53.000 --> 02:02:55.000
Tchau, tchau.

02:03:23.000 --> 02:03:25.000
Tchau, tchau.

02:03:53.000 --> 02:03:55.000
Tchau, tchau.

02:04:23.000 --> 02:04:25.000
Tchau, tchau.

02:04:53.000 --> 02:04:55.000
Tchau, tchau.

02:05:23.000 --> 02:05:25.000
Tchau, tchau.

02:05:53.000 --> 02:05:55.000
Tchau, tchau.

02:06:23.000 --> 02:06:25.000
Tchau, tchau.

02:06:53.000 --> 02:06:55.000
Tchau, tchau.

02:07:23.000 --> 02:07:25.000
Tchau, tchau.

02:07:53.000 --> 02:07:55.000
Tchau, tchau.

02:08:23.000 --> 02:08:25.000
Tchau, tchau.

02:08:53.000 --> 02:08:55.000
Tchau, tchau.

02:09:23.000 --> 02:09:25.000
Tchau, tchau.

02:09:53.000 --> 02:09:55.000
Tchau, tchau.

02:10:23.000 --> 02:10:25.000
Tchau, tchau.

02:10:53.000 --> 02:10:55.000
Tchau, tchau.

02:11:23.000 --> 02:11:25.000
Tchau, tchau.

02:11:53.000 --> 02:11:55.000
Tchau, tchau.

02:12:23.000 --> 02:12:25.000
Tchau, tchau.

02:12:53.000 --> 02:12:55.000
Tchau, tchau.

02:13:23.000 --> 02:13:25.000
Tchau, tchau.

02:13:53.000 --> 02:13:55.000
Tchau, tchau.

02:14:23.000 --> 02:14:25.000
Tchau, tchau.

02:14:53.000 --> 02:14:55.000
Tchau, tchau.

02:15:23.000 --> 02:15:25.000
Tchau, tchau.

02:15:53.000 --> 02:15:55.000
Tchau, tchau.

02:16:23.000 --> 02:16:25.000
Tchau, tchau.

02:16:53.000 --> 02:16:55.000
Tchau, tchau.

02:17:23.000 --> 02:17:25.000
Tchau, tchau.

02:17:53.000 --> 02:17:55.000
Tchau, tchau.

02:18:23.000 --> 02:18:25.000
Tchau, tchau.

02:18:53.000 --> 02:18:55.000
Tchau, tchau.

02:19:23.000 --> 02:19:25.000
Tchau, tchau.

02:19:53.000 --> 02:19:55.000
Tchau, tchau.

02:20:23.000 --> 02:20:25.000
Tchau, tchau.

02:20:53.000 --> 02:20:55.000
Tchau, tchau.

02:21:23.000 --> 02:21:25.000
Tchau, tchau.

02:21:53.000 --> 02:21:55.000
Tchau, tchau.

02:22:23.000 --> 02:22:25.000
Tchau, tchau.

02:22:53.000 --> 02:22:55.000
Tchau, tchau.

02:23:23.000 --> 02:23:25.000
Tchau, tchau.

02:23:53.000 --> 02:23:55.000
Tchau, tchau.

02:24:23.000 --> 02:24:25.000
Tchau, tchau.

02:24:53.000 --> 02:24:55.000
Tchau, tchau.

02:25:23.000 --> 02:25:25.000
Tchau, tchau.

02:25:53.000 --> 02:25:55.000
Tchau, tchau.

02:26:23.000 --> 02:26:25.000
Tchau, tchau.

02:26:53.000 --> 02:26:55.000
Tchau, tchau.

02:27:23.000 --> 02:27:25.000
Tchau, tchau.

02:27:53.000 --> 02:27:55.000
Tchau, tchau.

02:28:23.000 --> 02:28:25.000
Tchau, tchau.

