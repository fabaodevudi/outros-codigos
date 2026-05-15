WEBVTT

00:00.000 --> 00:06.120
A gente consegue entrar no datadog e consultar os logs para a leitura e aí a gente por exemplo

00:06.120 --> 00:10.560
não conseguiria aqui nem no caso montar uma alerta quando alguma coisa tivesse a normal

00:10.560 --> 00:11.560
ali.

00:11.560 --> 00:15.920
Aí por isso que tipo assim eu acho que se a gente conseguir se mandar algumas coisas

00:15.920 --> 00:22.600
chave o máximo possível de informação via custom metric era uma boa que a gente consegue

00:22.600 --> 00:27.080
montar uma alerta por exemplo para poder avisar quando o comportamento estiver fora do comum

00:27.080 --> 00:31.440
ali dentro do camunda e aí tipo a partir do alerta a gente pode entrar no camunda como

00:31.440 --> 00:32.440
necessário olhar.

00:32.440 --> 00:36.280
Mas tipo a gente não fica a ser no pego de surpresa tipo eu tô ligado que já teve

00:36.280 --> 00:39.800
vários casos aí né Rafa que você já olhou e tipo olhando no camunda você viu que a

00:39.800 --> 00:41.800
superposta estava ficando presa.

00:41.800 --> 00:45.440
Só que isso já estava presa tipo já estava rolando o BO aí a gente não consegue ter

00:45.440 --> 00:53.800
uma alerta tipo se você entrar e achar bom mas se tipo a gente não teria que ficar entrando

00:53.800 --> 00:58.840
toda hora olhando é um trampo meio manual tipo libera vocês ó se não alertou é porque

00:58.840 --> 01:01.040
ela está tudo bem.

01:01.040 --> 01:06.800
E aí eu imagino que tenha outras métricas que a gente consegue mandar que ajudaria

01:06.800 --> 01:07.800
também né.

01:07.800 --> 01:12.800
Aí a gente poderia avaliar tipo uma única que vem na minha cabeça logo de cara é essa

01:12.800 --> 01:21.280
né da quantidade de de propostas ali tipo a quantidade de propostas no momento ou a

01:21.280 --> 01:25.680
quantidade de propostas passando em cada um porque a gente já consegue por exemplo montar

01:25.680 --> 01:30.240
no datadog aquela mesma visão das caixinhas ali e falar pô tem mais propostas nenhuma

01:30.240 --> 01:36.480
do que na outra então pô até algo errado e em cima disso montar um alerta tipo ó a

01:36.480 --> 01:40.560
quantidade de propostas está muito descrepante ali significa que as propostas não passando

01:40.560 --> 01:48.200
e isso é o que eu consegui imaginar ali baseado no que eu acompanho mas com certeza vocês sabem

01:48.200 --> 01:55.960
mais possibilidades ali de dados que serem úteis como métricas pra gente é conseguir

01:55.960 --> 02:03.920
pegar e aí talvez alguma coisa tipo tipo algum resumo do que teria nos logs por exemplo

02:03.920 --> 02:07.440
pra gente conseguir saber se está tudo bem ou se tem algum possível problema tipo sei

02:07.440 --> 02:13.480
lá a quantidade de erros tal pode ser uma boa também eu queria porque assim tem uma métrica

02:13.480 --> 02:19.560
que eu disse seria muito interessante eu só não sei como fazer isso tá porque por exemplo

02:19.560 --> 02:26.520
você fala né eu faço uma curação das caixinhas posso puxar a tela aqui rapidão opa puxei mano

02:26.520 --> 02:35.320
quando puxei o fabão desculpa mano eu esqueci de colocar na agenda cara aí o o rafa puxou a gente

02:35.320 --> 02:37.320
e para o

02:40.880 --> 02:49.880
é que assim na prática de seria muito interessante poder fazer e eu acho que ajudaria muito além

02:49.880 --> 02:56.840
da né pegar status que acho que é importante que a ma comentou ali né que vocês pegaram por por

02:57.040 --> 03:03.320
faltar para ver as tatas né tem uma métrica que a gente pode seguir aqui

03:04.980 --> 03:09.440
inclusive acho que tá fazendo mal hein acabei de ver aqui a curação

03:15.600 --> 03:19.260
pela pese aqui tá lá tá tá tá tá

03:19.260 --> 03:31.620
É que aqui, mano, a ideia é a gente discutir sobre implementar as costumétricas do Camunda

03:31.620 --> 03:32.620
no Datadog.

03:32.620 --> 03:39.140
Aí, tipo, para mandar as costumétricas, a gente teria que fazer isso direto dentro

03:39.140 --> 03:45.220
dos scripts, porque a gente não consegue plugar com a gente o Datadog no Camunda.

03:45.660 --> 03:47.180
Carão, um exemplo...

03:47.180 --> 03:48.180
Não.

03:48.180 --> 03:49.940
Um exemplo ao vivo aqui, ó.

03:51.380 --> 03:53.460
E isso aqui é muito estranho.

03:53.460 --> 03:54.460
Tá vendo isso aqui?

03:54.460 --> 03:55.460
Aham.

03:57.460 --> 03:59.060
391

04:01.540 --> 04:06.340
quantidades nessa caixa em específica, porque assim, é muito aqui, é filim, sabe?

04:07.260 --> 04:12.660
Mas, por exemplo, ó, atualmente no BPMN, eu tenho 1.061

04:13.660 --> 04:15.420
propostas rodando aqui.

04:16.420 --> 04:21.420
Hoje é o dia mais cheio que a gente tem dentro da semana, né?

04:21.420 --> 04:24.980
Que hoje é a terça-feira da pessoa, eles abrem SS lá, né?

04:25.980 --> 04:35.420
Então, esse número gira em torno de 800, 700, um dia normal.

04:36.700 --> 04:41.460
Aí na hora que eu abri o BPMN aqui, ó, eu já olhei e falei, meu, 1.061 já tá muito normal.

04:41.580 --> 04:45.140
Eu tenho 300 propostas a mais do que geralmente é.

04:45.900 --> 04:49.820
Então, esse é o primeiro indicador do tipo assim, olha, eu sei uma métrica,

04:50.300 --> 04:54.620
mais ou menos, eu sei que 1.700 tá ok para terça-feira.

04:54.620 --> 04:58.580
Um dia normal é 500, mas para uma terça-feira tá ok.

04:59.380 --> 05:02.380
Mil, já é uma coisa assim, opa, tem alguma coisa errada.

05:02.820 --> 05:05.300
Aí na hora que eu batigo o BPMN, tem alguma coisa errada, já achei aqui, ó.

05:06.100 --> 05:10.020
Aí, por exemplo, é essa parte aqui, a parte do back office.

05:10.540 --> 05:11.420
Como é que funciona?

05:12.420 --> 05:17.700
A gente manda a documentação lá para o back office, o back office, eles aprovam, reprovam.

05:18.740 --> 05:22.700
Esse valor 391 tá muito fora do que é o normal.

05:23.860 --> 05:28.380
Por exemplo, hoje é um dia corrido, 100 no máximo, estourando.

05:29.220 --> 05:33.860
Então, isso é uma boa métrica para a gente ir, sabe, porque é o trabalho que eu faço.

05:34.060 --> 05:36.300
E aí, assim, eu tenho que ficar fazendo isso manualmente.

05:37.220 --> 05:39.300
Se a gente tivesse uma forma de linkar

05:40.980 --> 05:47.460
essa numeração, essa quantidade, o C8 aqui, com a quantidade lá no datadog,

05:48.340 --> 05:52.100
seria muito interessante, cara, porque acho que é um dos fatorizmais

05:52.860 --> 05:55.620
ativos que a gente consegue ter, sabe, de noção.

05:57.300 --> 06:00.980
Então, essa é a ideia, mano, por exemplo, passar, por exemplo,

06:01.340 --> 06:03.060
a quantidade de instância que eu sou dando ali,

06:04.300 --> 06:05.980
já seria uma métrica para a gente enviar.

06:06.420 --> 06:08.020
É, a quantidade que tem cada...

06:08.820 --> 06:10.100
Eu tenho que ver isso aqui.

06:11.020 --> 06:11.820
Beleza, beleza.

06:12.020 --> 06:15.500
Só me dá um segundinho, tá? Deixa eu só avisar o pessoal lá,

06:15.500 --> 06:17.780
cara, que tá muito esquisito, tá, que é pró de aqui.

06:17.980 --> 06:19.860
Rapidão, mas pode ir falando aí.

06:20.380 --> 06:25.900
Boa. A ideia é isso, é tipo assim, a gente conseguiu enxergar esses números.

06:25.900 --> 06:29.620
Então, por exemplo, se lá no datadog eu consigo colocar um threshold,

06:29.620 --> 06:31.500
falar assim, ó, se passar de tanto no...

06:32.140 --> 06:34.660
Tipo, se a gente tivesse, por exemplo, uma métrica para cada caixinha dessa,

06:35.300 --> 06:40.660
falando, tipo, a quantidade de propostas na etapa tal, na etapa tal,

06:41.260 --> 06:43.620
e aí ter uma para cada, uma métrica para cada etapa,

06:44.180 --> 06:49.620
uma métrica para a quantidade de propostas rodando no camunda como um todo.

06:50.580 --> 06:54.580
E aí, tipo, eu conseguia colocar alertas em cada caixinha e falar, ó,

06:54.580 --> 06:58.340
se em qualquer uma delas a quantidade passar de x

06:59.020 --> 07:01.020
é porque é para alertar.

07:01.780 --> 07:04.660
E aí o datadog já vai alertar para a gente que tá a normal.

07:05.220 --> 07:07.620
Ou se ficar, tipo, abaixo, por exemplo, sei lá,

07:07.620 --> 07:11.900
se, por exemplo, a quantidade de propostas em execução tiver muito baixa,

07:12.940 --> 07:16.540
também alertar, tipo, ó, não tá entrando a proposta no camunda por algum motivo.

07:17.540 --> 07:18.860
Então, ele também alertaria.

07:18.860 --> 07:22.020
E aí, tipo, baseado nos alertas, você ia entrar aí para olhar.

07:22.460 --> 07:26.180
E não mais, tipo, ficar entrando todo dia ou toda hora para ver se é tudo bem

07:26.180 --> 07:28.540
ou pegando, tipo, de surpresa.

07:29.540 --> 07:30.540
É...

07:34.060 --> 07:37.260
É, ele chega, ele abre um incidente de monitoração no serve sinal

07:37.980 --> 07:39.980
e aí a gente tem uma automação lá.

07:39.980 --> 07:41.980
Inclusive, deixa eu te colocar no grupo, mano.

07:41.980 --> 07:43.980
Eu acho que vocês, eu não sei se vocês estão.

07:43.980 --> 07:45.980
Tem um grupo de alertas.

07:45.980 --> 07:47.980
Esse grupo, ele fica...

07:47.980 --> 07:51.580
É, aí, tipo, quando cai um incidente de monitoração, ele manda notinhas.

07:52.620 --> 07:54.620
Deixa eu ver se você tá nele, mano.

07:59.500 --> 08:01.500
E aí, a gente consegue pegar.

08:01.500 --> 08:06.060
Então, tipo, não precisaria ter um monitoramento iriprotivo, né?

08:08.060 --> 08:10.060
Eu só não sei...

08:10.060 --> 08:12.060
Eu vou ver o pessoal aqui.

08:12.060 --> 08:14.060
Eu só não sei muito bem como fazer, sabe?

08:16.060 --> 08:19.260
Como que eu posso quantificar isso aqui?

08:21.260 --> 08:23.260
Saber exatamente, especificamente, nessa etapa.

08:25.260 --> 08:27.260
Então, é isso que eu precisava muito da ajuda.

08:27.260 --> 08:29.260
Porque eu também não faço ideia.

08:29.260 --> 08:31.260
Tipo, por exemplo...

08:31.260 --> 08:33.260
Eu também não tenho ideia, tipo assim...

08:33.260 --> 08:35.260
A gente teria que olhar o log.

08:37.260 --> 08:41.260
Se você conseguir me ajudar a olhar o datadog,

08:41.260 --> 08:43.260
porque assim, só pra você entender,

08:43.260 --> 08:47.260
cada caixinha, por exemplo, aquela caixinha ali, né?

08:47.260 --> 08:51.260
Que tá com 391 parado ali.

08:51.260 --> 08:53.260
O nome dessa service aqui,

08:53.260 --> 08:55.260
é esse aqui, ó, até que teria que mudar o nome.

08:55.260 --> 08:57.260
Tá muito feio.

08:57.260 --> 09:03.260
Mas o nome do evento é evento, underline, isso aqui.

09:13.260 --> 09:17.260
Mas ele vai filtrar por...

09:17.260 --> 09:19.260
Então, porque é justamente esse o ponto, mano.

09:19.260 --> 09:21.260
Tipo, a gente tem o log,

09:21.260 --> 09:23.260
mas a gente não tem uma métrica disso.

09:23.260 --> 09:25.260
Sim.

09:25.260 --> 09:27.260
E aí, o log, depois de um mês, ele morre.

09:27.260 --> 09:31.260
E tem aquela limitação de eu não poder enviar muito log info.

09:31.260 --> 09:33.260
Então, tipo assim...

09:37.260 --> 09:39.260
Em produção, eles mantiveram.

09:39.260 --> 09:41.260
Mas, tipo...

09:41.260 --> 09:45.260
Eles estavam cogitando remover os logs info, de prod.

09:45.260 --> 09:47.260
Aí, eles fizeram essa questão do archive.

09:47.260 --> 09:49.260
Então, eles conseguiram reduzir o custo,

09:49.260 --> 09:51.260
porque muita gente meio que, tipo...

09:51.260 --> 09:55.260
Se pronto ficou a mandar os logs para o archive.

09:55.260 --> 09:57.260
Aí...

09:57.260 --> 09:59.260
Aí consegue, tipo...

09:59.260 --> 10:03.260
Conseguiu reduzir e dá para mandar log para lá.

10:03.260 --> 10:05.260
Tipo, normal, né?

10:05.260 --> 10:07.260
Mandar a mesma quantidade.

10:07.260 --> 10:09.260
Só que se ficar mandando muito,

10:09.260 --> 10:11.260
aumenta o custo do Datadog.

10:11.260 --> 10:13.260
Aí, meio que, tipo...

10:13.260 --> 10:15.260
Eles já vão começar a levantar a mão,

10:15.260 --> 10:17.260
tipo, ó, tá gastando muito aqui, esse RT.

10:17.260 --> 10:19.260
No Datadog.

10:19.260 --> 10:21.260
E aí, vai começar a cobrar conta e aí...

10:21.260 --> 10:25.260
Vão pedir para poder ver, para poder reduzir e tal.

10:25.260 --> 10:29.260
Vê se é necessário mesmo mandar tudo aquilo.

10:31.260 --> 10:33.260
Mas tem a questão da retenção também.

10:33.260 --> 10:35.260
A retenção ainda é só um mês.

10:35.260 --> 10:37.260
Então, tipo...

10:37.260 --> 10:39.260
É...

10:39.260 --> 10:41.260
Dependendo do que a gente precisar...

10:41.260 --> 10:43.260
Talvez, tipo assim, a gente mandar menos logs,

10:43.260 --> 10:45.260
a gente pode pedir para aumentar a retenção.

10:49.260 --> 10:51.260
Então...

11:03.260 --> 11:05.260
Cara, é difícil fazer isso aqui, cara.

11:05.260 --> 11:07.260
Essa métrica...

11:07.260 --> 11:09.260
Ele não tá puxando pela...

11:09.260 --> 11:11.260
Por essa...

11:11.260 --> 11:13.260
Seguir, gente...

11:13.260 --> 11:15.260
Tá vendo, ó...

11:15.260 --> 11:17.260
Por exemplo, eu passo por essa caixinha aqui.

11:17.260 --> 11:19.260
Ela chama análise documento 18.

11:19.260 --> 11:21.260
Essa provavelmente eu vou encontrar.

11:29.260 --> 11:31.260
Ah, também não.

11:31.260 --> 11:33.260
Eu acho que...

11:33.260 --> 11:37.260
Talvez uma forma de pegar esses eventos

11:37.260 --> 11:39.260
seria, por exemplo...

11:39.260 --> 11:43.260
Chegou numa primeira caixinha.

11:43.260 --> 11:45.260
Vou colocar assim, né?

11:45.260 --> 11:47.260
A coisa dessa caixinha no fluxo,

11:47.260 --> 11:49.260
a gente tem que ir para um outro...

11:49.260 --> 11:51.260
Um outro ponto.

11:51.260 --> 11:53.260
Então, vou colocar aqui.

11:53.260 --> 11:55.260
Ponto A, ponto B.

11:55.260 --> 11:57.260
Chegaram 100 eventos no ponto A.

11:57.260 --> 11:59.260
Esses 100 eventos

11:59.260 --> 12:01.260
são disparados para o datadog.

12:01.260 --> 12:03.260
No ponto B,

12:03.260 --> 12:05.260
chegaram apenas 50.

12:05.260 --> 12:07.260
Então, aí, eu acho que a gente...

12:07.260 --> 12:09.260
Pelo... das vezes que eu fio

12:09.260 --> 12:11.260
algum alarme lá no datadog,

12:11.260 --> 12:13.260
a gente fazia assim.

12:13.260 --> 12:15.260
A diferença, né?

12:15.260 --> 12:17.260
Ponto B, menos ponto A.

12:17.260 --> 12:19.260
Para...

12:19.260 --> 12:21.260
Para definir

12:21.260 --> 12:23.260
o que ficou represado.

12:23.260 --> 12:25.260
Então, seria, sei lá.

12:25.260 --> 12:27.260
Ponto B, 50, ponto A, 100.

12:27.260 --> 12:29.260
Então, 50 menos 100.

12:29.260 --> 12:31.260
Então, a gente tem um número negativo.

12:31.260 --> 12:33.260
Significa que 50 eventos

12:33.260 --> 12:35.260
ficaram represados.

12:37.260 --> 12:41.260
Poderia ser uma forma também, Fabrício.

12:41.260 --> 12:43.260
Ó, para vocês verem como a gente...

12:43.260 --> 12:45.260
Assim, a gente é

12:45.260 --> 12:47.260
capado de log.

12:47.260 --> 12:49.260
Eu tenho um monte de log

12:49.260 --> 12:51.260
por aqui.

12:51.260 --> 12:53.260
Por esse propósito layout.

12:53.260 --> 12:55.260
Agora, para esse tipo de evento,

12:55.260 --> 12:57.260
ou para esse,

12:57.260 --> 12:59.260
ou para esse,

12:59.260 --> 13:01.260
eu já não tenho visibilidade.

13:01.260 --> 13:03.260
Já não tem.

13:03.260 --> 13:05.260
Já não tem log desse, desse, desse.

13:05.260 --> 13:07.260
E vamos supor

13:07.260 --> 13:09.260
se, por exemplo,

13:09.260 --> 13:11.260
desse cara aqui, ó.

13:21.260 --> 13:23.260
Esse cara.

13:25.260 --> 13:27.260
Eu tenho, aqui eu consigo encontrar ele,

13:27.260 --> 13:29.260
esse parâmetro,

13:29.260 --> 13:31.260
que é o propósito layout.

13:31.260 --> 13:33.260
Vamos supor que o problema

13:33.260 --> 13:35.260
seja aqui, que está parando aqui,

13:35.260 --> 13:37.260
nessa caixinha específica.

13:39.260 --> 13:41.260
O que eu consigo puxar,

13:41.260 --> 13:43.260
de, por exemplo,

13:43.260 --> 13:45.260
em...

13:45.260 --> 13:47.260
em uma hora,

13:47.260 --> 13:49.260
eu passei

13:49.260 --> 13:51.260
911

13:51.260 --> 13:53.260
propostas

13:53.260 --> 13:55.260
aqui, não especificamente

13:55.260 --> 13:57.260
propostas, mas...

13:57.260 --> 13:59.260
Coloca ali,

13:59.260 --> 14:01.260
quer ver, no grupo,

14:01.260 --> 14:03.260
em 2 fields,

14:03.260 --> 14:05.260
mais aqui,

14:05.260 --> 14:07.260
proposta.

14:07.260 --> 14:09.260
Lá onde está o logs, coloca o

14:09.260 --> 14:11.260
arrubei de proposta.

14:17.260 --> 14:19.260
E aí, no count of,

14:19.260 --> 14:21.260
se troca para count, é,

14:21.260 --> 14:23.260
unique count.

14:23.260 --> 14:25.260
Do lado dele de proposta.

14:25.260 --> 14:27.260
Do lado dele aí,

14:27.260 --> 14:29.260
onde ficou branco,

14:29.260 --> 14:31.260
do count of.

14:31.260 --> 14:33.260
Em cima do count of mesmo, aí.

14:33.260 --> 14:35.260
Aí você coloca count unique.

14:37.260 --> 14:39.260
Aí ele vai contar propostas únicas,

14:39.260 --> 14:41.260
tirar a repetida. Ó, 84 propostas

14:41.260 --> 14:43.260
passaram.

14:49.260 --> 14:51.260
Mas mesmo assim,

14:51.260 --> 14:53.260
eu não consigo dizer se a

14:53.260 --> 14:55.260
proposta ficou parada, assim...

14:55.260 --> 14:57.260
É, então, aí eu teria que

14:57.260 --> 14:59.260
fazer aquilo que o Fabrício falou, comparar

14:59.260 --> 15:01.260
com a próxima.

15:01.260 --> 15:03.260
Eu acho que é mais ou menos isso aí

15:03.260 --> 15:05.260
que o que o Fabrício falou, então.

15:05.260 --> 15:07.260
Porque isso é uma maneira de você

15:07.260 --> 15:09.260
quantificar, né? Então assim,

15:09.260 --> 15:11.260
entrou 100 propostas na caixinha, né?

15:11.260 --> 15:13.260
E aí daqui,

15:13.260 --> 15:15.260
sei lá, 5 minutos, é uma hora,

15:15.260 --> 15:17.260
depende de cada caixinha,

15:17.260 --> 15:19.260
como é que vai fazer o monitoramento, né?

15:19.260 --> 15:21.260
Cada uma tem um padrão.

15:21.260 --> 15:23.260
Mas você compara

15:23.260 --> 15:25.260
daqui uma hora, se ainda

15:25.260 --> 15:27.260
é 100,

15:27.260 --> 15:29.260
quer dizer que não andou, né?

15:29.260 --> 15:31.260
Agora tem 50.

15:31.260 --> 15:33.260
Eu acho que

15:33.260 --> 15:35.260
uma possibilidade também

15:35.260 --> 15:37.260
de construir algo nesse sentido.

15:37.260 --> 15:39.260
Porque isso é igual

15:39.260 --> 15:41.260
que eu falei, é um dos melhores

15:41.260 --> 15:43.260
monitoramentos que você

15:43.260 --> 15:45.260
consegue pegar, que está tendo problema.

15:45.260 --> 15:47.260
Quando a gente tem problema

15:47.260 --> 15:49.260
com o fluxo aqui,

15:49.260 --> 15:51.260
o número

15:51.260 --> 15:53.260
de propostas, elas ficam retidas, né?

15:53.260 --> 15:55.260
O normal, ele passar por todo fluxo

15:55.260 --> 15:57.260
e

15:57.260 --> 15:59.260
e finalizar, né? Não ficar

15:59.260 --> 16:01.260
travada.

16:01.260 --> 16:03.260
Assim, tem áreas que têm

16:03.260 --> 16:05.260
particularidades, por exemplo,

16:05.260 --> 16:07.260
esse cara específico aqui do

16:07.260 --> 16:09.260
Backoff ser uma particularidade, porque

16:09.260 --> 16:11.260
ele, as propostas, elas vão

16:11.260 --> 16:13.260
caindo quando o pessoal aprova

16:13.260 --> 16:15.260
manualmente.

16:15.260 --> 16:17.260
Então não é um sistema que está

16:17.260 --> 16:19.260
cuidando, né?

16:19.260 --> 16:21.260
Mas sei lá, um lugar que trava

16:21.260 --> 16:23.260
bastante.

16:23.260 --> 16:25.260
Por exemplo,

16:25.260 --> 16:27.260
pega o benefício NSS, isso é o que a gente

16:27.260 --> 16:29.260
está falando de tela

16:29.260 --> 16:31.260
da nossa

16:31.260 --> 16:33.260
jornada.

16:33.260 --> 16:35.260
Então o benefício NSS, por exemplo,

16:35.260 --> 16:37.260
o 95.

16:37.260 --> 16:39.260
95 é um número

16:39.260 --> 16:41.260
eu diria que pra hoje

16:41.260 --> 16:43.260
é um número OK, mas

16:43.260 --> 16:45.260
150 já é um número

16:45.260 --> 16:47.260
opa, algo está,

16:47.260 --> 16:49.260
não está legal.

16:49.260 --> 16:51.260
É interessante, assim,

16:51.260 --> 16:53.260
150 aqui é um número que já

16:53.260 --> 16:55.260
meio que, opa, o que está rolando

16:55.260 --> 16:57.260
alguma coisa não está

16:57.260 --> 16:59.260
funcional, sabe?

17:01.260 --> 17:03.260
Eu estava pensando se a gente conseguisse

17:03.260 --> 17:05.260
essa questão da custa, porque, por exemplo, eu estou imaginando

17:05.260 --> 17:07.260
aqui, a gente fazendo isso

17:07.260 --> 17:09.260
tipo, por log,

17:09.260 --> 17:11.260
eu vou ter um número incremental, né?

17:11.260 --> 17:13.260
Porque, tipo assim, a quantidade

17:13.260 --> 17:15.260
de

17:15.260 --> 17:17.260
propostas nessa caixinha, por exemplo, do benefício

17:17.260 --> 17:19.260
NSS, durante o dia, ela só vai crescer

17:19.260 --> 17:21.260
cada vez mais. Eu não vou ter, tipo,

17:21.260 --> 17:23.260
que nem no caimundo ele quanto você abre,

17:23.260 --> 17:25.260
que você sabe o número real ali atual.

17:25.260 --> 17:27.260
Quantas tem agora?

17:27.260 --> 17:29.260
A ideia da custa o métrico seria isso, tipo assim,

17:29.260 --> 17:31.260
é,

17:31.260 --> 17:33.260
cada vez que rodasse,

17:33.260 --> 17:35.260
aí teria que entender se é possível, né?

17:35.260 --> 17:37.260
Por exemplo, cada vez

17:37.260 --> 17:39.260
que o script rodasse, ou fizesse alguma coisa,

17:39.260 --> 17:41.260
ele também mandasse

17:41.260 --> 17:43.260
prototadog quantas que tem no momento.

17:43.260 --> 17:45.260
E essa métrica ia ficar sendo atualizada,

17:45.260 --> 17:47.260
igual, por exemplo, sei lá, uma métrica de CPU.

17:47.260 --> 17:49.260
Tipo, a cada cinco segundos

17:49.260 --> 17:51.260
ela vai enviar ali quanto de CPU, quanto

17:51.260 --> 17:53.260
que está a CPU do

17:53.260 --> 17:55.260
conteúdo. Seria mesmo lógico, só que pra caixinha,

17:55.260 --> 17:57.260
tipo assim, de X em X tempo ela ia ficar

17:57.260 --> 17:59.260
enviando, ó, agora tem tantas, agora tem tantas.

17:59.260 --> 18:01.260
Às vezes ia ser maior, às vezes ia ser menor.

18:01.260 --> 18:03.260
Eu poderia comparar essa métrica

18:03.260 --> 18:05.260
com a métrica de outras caixinhas

18:05.260 --> 18:07.260
pra poder ver e falar, pô, pera aí.

18:07.260 --> 18:09.260
O número tá diferente,

18:09.260 --> 18:11.260
ou seja, uma métrica

18:11.260 --> 18:13.260
não tá diminuindo e a outra não tá subindo,

18:13.260 --> 18:15.260
logo, travou.

18:15.260 --> 18:17.260
É, porque nos logs

18:17.260 --> 18:19.260
eu posso ir fazendo a diferença de um pra outro.

18:19.260 --> 18:21.260
Ah, quantas propostas

18:21.260 --> 18:23.260
tem nenhum, só que esse número durante o dia

18:23.260 --> 18:25.260
vai sempre ficar incrementando, então, tipo,

18:25.260 --> 18:27.260
ele vai crescendo, tipo, eu não vou conseguir

18:27.260 --> 18:29.260
saber quantas tem agora.

18:29.260 --> 18:31.260
Porque pode ser, sei lá, tipo,

18:31.260 --> 18:33.260
que alguma travou,

18:33.260 --> 18:35.260
não sei, tô pensando aqui, tipo,

18:39.260 --> 18:41.260
como que seria.

18:41.260 --> 18:43.260
E aí também eu fiquei com dúvida, mano,

18:43.260 --> 18:45.260
sobre aquela outra, por exemplo,

18:45.260 --> 18:47.260
que a gente não conseguiu pegar.

18:47.260 --> 18:49.260
Pelo que eu entendi, ele é um fluxo à parte, não é?

18:49.260 --> 18:51.260
Aquela que tava com problema até agora.

18:51.260 --> 18:53.260
Que tá com problema, né?

18:53.260 --> 18:55.260
É, tipo assim, ó,

18:55.260 --> 18:57.260
primeiro que,

18:57.260 --> 18:59.260
por exemplo, né,

18:59.260 --> 19:01.260
esse do da tela, da tela de benefício

19:01.260 --> 19:03.260
NSS,

19:03.260 --> 19:05.260
esse cara aqui é o que

19:05.260 --> 19:07.260
a proposta tá parada aqui, né,

19:07.260 --> 19:09.260
e é a tela de benefício

19:09.260 --> 19:11.260
NSS, que você quer ou não colocar.

19:11.260 --> 19:13.260
Então,

19:13.260 --> 19:15.260
você, meio que, consegue colocar

19:15.260 --> 19:17.260
uma métrica aqui, né, por exemplo,

19:17.260 --> 19:19.260
ó, igual eu peguei.

19:19.260 --> 19:21.260
Passou 15 minutos,

19:21.260 --> 19:23.260
728 propostas.

19:23.260 --> 19:25.260
Então,

19:25.260 --> 19:27.260
é...

19:27.260 --> 19:29.260
meio que gera uma métrica lá, e meio que

19:29.260 --> 19:31.260
o Fabrício falou, eu consigo medir, né?

19:31.260 --> 19:33.260
Agora você pega, por exemplo,

19:33.260 --> 19:35.260
esse cara aqui, ó,

19:35.260 --> 19:37.260
que é especificamente o que tá dando

19:37.260 --> 19:39.260
agora.

19:39.260 --> 19:41.260
Opa.

19:41.260 --> 19:43.260
Pega aqui.

19:47.260 --> 19:49.260
Que é a parte do Backoffice.

19:49.260 --> 19:51.260
Essa do Backoffice,

19:53.260 --> 19:55.260
a gente tem duas questões.

19:55.260 --> 19:57.260
A primeira,

19:57.260 --> 19:59.260
eu não tenho visibilidade

19:59.260 --> 20:01.260
do log pra

20:01.260 --> 20:03.260
esse evento,

20:03.260 --> 20:05.260
porque, ó,

20:05.260 --> 20:07.260
eu vou procurar aquele evento lá

20:07.260 --> 20:09.260
que eu falei, que é o nome do evento,

20:09.260 --> 20:11.260
esse aqui, ó, ele não vai achar nada.

20:11.260 --> 20:13.260
Tá vendo?

20:13.260 --> 20:15.260
Porque, provavelmente,

20:15.260 --> 20:17.260
isso aqui foi capado.

20:17.260 --> 20:19.260
Eles não tão...

20:19.260 --> 20:21.260
Log, com certeza, deve ter

20:21.260 --> 20:23.260
algum log de comunicação,

20:23.260 --> 20:25.260
enfim, né?

20:25.260 --> 20:27.260
Ele passou por ele, ele deve ter gerado um log.

20:27.260 --> 20:29.260
Só que a gente não

20:29.260 --> 20:31.260
tem visibilidade disso.

20:31.260 --> 20:33.260
Isso é um problema.

20:33.260 --> 20:35.260
A segunda questão

20:35.260 --> 20:37.260
é que como que funciona

20:37.260 --> 20:39.260
a resposta desse cara, né?

20:39.260 --> 20:41.260
Comparando lá com o NSS.

20:41.260 --> 20:43.260
O NSS, se você pensar,

20:43.260 --> 20:45.260
é uma pessoa ali no máximo,

20:45.260 --> 20:47.260
tipo, fica

20:47.260 --> 20:49.260
10, 15 segundos.

20:51.260 --> 20:53.260
Então, assim, as propostas, elas

20:53.260 --> 20:55.260
entram ali e já saem.

20:55.260 --> 20:57.260
Porque é uma tela que você coloca,

20:57.260 --> 20:59.260
se você quer NSS sim ou não, sim.

20:59.260 --> 21:01.260
Próxima tela.

21:01.260 --> 21:03.260
Então, em padrão, sei lá,

21:03.260 --> 21:05.260
15 segundos no máximo aí,

21:05.260 --> 21:07.260
a proposta, ela não tende a ficar parada ali, né?

21:07.260 --> 21:09.260
Aqui,

21:09.260 --> 21:11.260
o back office aqui, a

21:11.260 --> 21:13.260
comunicação é um pouco diferente.

21:13.260 --> 21:15.260
Porque, aqui,

21:15.260 --> 21:17.260
as propostas vêm, né,

21:17.260 --> 21:19.260
de fato, aqui, pro pessoal analisar, igual,

21:19.260 --> 21:21.260
tá rolando aqui.

21:23.260 --> 21:25.260
As propostas, elas vêm pra cá

21:25.260 --> 21:27.260
e elas ficam acumuladas aqui.

21:27.260 --> 21:29.260
Só que não é uma resposta rápida.

21:29.260 --> 21:31.260
Não é uma...

21:31.260 --> 21:33.260
São pessoas,

21:33.260 --> 21:35.260
isso é feito por humano, né?

21:35.260 --> 21:37.260
Que fazem validação nesse processo.

21:37.260 --> 21:39.260
Então, eles olham aqui

21:39.260 --> 21:41.260
e falam, ah, beleza, essa proposta

21:41.260 --> 21:43.260
aqui que tá aprovada, não tá?

21:43.260 --> 21:45.260
São envios de documento,

21:45.260 --> 21:47.260
imagens.

21:47.260 --> 21:49.260
Então, esse processo aqui,

21:49.260 --> 21:51.260
humano, não um processo...

21:51.260 --> 21:53.260
Então, a métrica dele

21:53.260 --> 21:55.260
aqui é um pouco diferente, né,

21:55.260 --> 21:57.260
a quantidade.

21:57.260 --> 21:59.260
Mas é como eu falei, muito por

21:59.260 --> 22:01.260
feeling.

22:01.260 --> 22:03.260
Um dia de hoje,

22:03.260 --> 22:05.260
eu já cheguei a ver 100 propostas

22:05.260 --> 22:07.260
acumuladas aqui, 80

22:07.260 --> 22:09.260
propostas, 80...

22:09.260 --> 22:11.260
Mas eles sempre vão atuando e vai caindo, né?

22:11.260 --> 22:13.260
Então, no momento aqui,

22:13.260 --> 22:15.260
aqui rolou algum problema, com certeza,

22:15.260 --> 22:17.260
porque não tá sendo... não tão atuando, né?

22:17.260 --> 22:19.260
Ó, tá vendo, ó, subiu,

22:19.260 --> 22:21.260
413.

22:21.260 --> 22:23.260
Então, colocando, tipo,

22:23.260 --> 22:25.260
nesses alertas, né,

22:25.260 --> 22:27.260
você fazendo essa comparação, olha,

22:27.260 --> 22:29.260
15 minutos atrás, tinha

22:29.260 --> 22:31.260
100.

22:31.260 --> 22:33.260
Depois de 15 minutos, ou 10 minutos,

22:33.260 --> 22:35.260
não sei como que a gente vai fazer isso, né?

22:35.260 --> 22:37.260
É, agora tem 200.

22:37.260 --> 22:39.260
Esse número não tá caindo, né?

22:39.260 --> 22:41.260
Porque o problema

22:41.260 --> 22:43.260
do... e acumula aqui,

22:43.260 --> 22:45.260
o problema real é isso.

22:45.260 --> 22:47.260
As propostas elas estão acumulando, igual aconteceu aqui, ó.

22:47.260 --> 22:49.260
Tava 413, tava

22:49.260 --> 22:51.260
300 e pouco. Eu dei um refresh,

22:51.260 --> 22:53.260
413.

22:53.260 --> 22:55.260
Eu acumula mais um aqui.

22:55.260 --> 22:57.260
Então, a minha dúvida

22:57.260 --> 22:59.260
era isso, que, por exemplo,

22:59.260 --> 23:01.260
aí que nem, no caso do log,

23:01.260 --> 23:03.260
se eu contar quantas propostas

23:03.260 --> 23:05.260
tem no período de tempo,

23:05.260 --> 23:07.260
eu só vou saber quantas

23:07.260 --> 23:09.260
entraram.

23:09.260 --> 23:11.260
Então, tipo, assim, vamos pôr.

23:11.260 --> 23:13.260
Se entrou 100 propostas nos últimos 15 minutos,

23:13.260 --> 23:15.260
vai ter 100 logs,

23:15.260 --> 23:17.260
100 números de proposta nos últimos

23:17.260 --> 23:19.260
15 minutos nos logs.

23:19.260 --> 23:21.260
Se elas não prosseguiram

23:21.260 --> 23:23.260
pegando um count no log,

23:23.260 --> 23:25.260
eu acho que não conseguiria pegar.

23:25.260 --> 23:27.260
Aí eu teria que entender,

23:27.260 --> 23:29.260
tipo assim, pô,

23:29.260 --> 23:31.260
pra fazer via log,

23:31.260 --> 23:33.260
talvez seria, tipo assim, eu pegar a próxima etapa

23:33.260 --> 23:35.260
e falar quantas entraram na etapa seguinte.

23:35.260 --> 23:37.260
Só que aí tem as questões, tipo assim,

23:37.260 --> 23:39.260
às vezes vai por um lado e isso vai por outro,

23:39.260 --> 23:41.260
que nem no caso do NSS.

23:41.260 --> 23:43.260
Então, tipo assim, ali entrou na tela de NSS.

23:43.260 --> 23:45.260
É, coisas mais simples

23:45.260 --> 23:47.260
dá pra fazer.

23:47.260 --> 23:49.260
Dá pra fazer.

23:49.260 --> 23:51.260
No caso ali do benefício NSS.

23:51.260 --> 23:53.260
Isso.

23:53.260 --> 23:55.260
Ele pode ir pro...

23:55.260 --> 23:57.260
Ele só vai pra

23:57.260 --> 23:59.260
CNPJ.

23:59.260 --> 24:01.260
Então, aí só que se for

24:01.260 --> 24:03.260
ou se não for no NSS,

24:03.260 --> 24:05.260
muda, não muda pra onde ele vai?

24:05.260 --> 24:07.260
Ou você sempre vai pra CNPJ, tanto na sequência?

24:07.260 --> 24:09.260
Nesse caso, porque assim,

24:09.260 --> 24:11.260
é muito, tipo assim,

24:11.260 --> 24:13.260
tela-tela, sabe, muito...

24:13.260 --> 24:15.260
É...

24:15.260 --> 24:17.260
Tem níveis de complexidade pra fazer isso.

24:17.260 --> 24:19.260
Esse é...

24:19.260 --> 24:21.260
Eu acredito que esse aqui é o mais simples.

24:21.260 --> 24:23.260
Então, imagina, eu tenho 100

24:23.260 --> 24:25.260
aqui na caixinha. Entrou 100.

24:25.260 --> 24:27.260
Daqui pra cá,

24:27.260 --> 24:29.260
ele tem que ir na próxima tarefa que esse aqui.

24:29.260 --> 24:31.260
Isso poderia pegar...

24:31.260 --> 24:33.260
Tem que entrar 100.

24:33.260 --> 24:35.260
Então, mas eu tô pensando num mais complexo,

24:35.260 --> 24:37.260
por exemplo, que pode mudar.

24:37.260 --> 24:39.260
Por exemplo...

24:39.260 --> 24:41.260
Esse aqui, ó...

24:41.260 --> 24:43.260
Sei lá...

24:43.260 --> 24:45.260
Esse aqui...

24:46.260 --> 24:49.260
Seria muito caso a Clod.

24:49.260 --> 24:51.260
É, então, eu tô pensando, tipo assim, sei lá,

24:51.260 --> 24:53.260
em uma situação onde, tipo...

24:53.260 --> 24:55.260
Ele tem vários caminhos, né?

24:55.260 --> 24:57.260
É, e aí, tipo, se ele tem vários

24:57.260 --> 24:59.260
caminhos e eu não consigo fazer o cálculo,

24:59.260 --> 25:01.260
eu teria que fazer o cálculo, tipo assim,

25:01.260 --> 25:03.260
nos próximos dois possíveis

25:03.260 --> 25:05.260
caminhos,

25:05.260 --> 25:07.260
a soma dos dois

25:07.260 --> 25:09.260
dá a mesma quantidade do anterior pra eu saber

25:09.260 --> 25:11.260
a diferença do anterior pra saber

25:11.260 --> 25:13.260
se ficou preso ou não no anterior.

25:13.260 --> 25:15.260
Então, tipo...

25:15.260 --> 25:17.260
É, aí que eu tava falando,

25:17.260 --> 25:19.260
tipo assim, se a gente conseguisse...

25:19.260 --> 25:21.260
Eu não tenho certeza se é possível

25:21.260 --> 25:23.260
por conta do groove e tal.

25:23.260 --> 25:25.260
Mas se a gente conseguisse enviar pro datadog,

25:25.260 --> 25:27.260
tipo, uma forma de que...

25:27.260 --> 25:29.260
tipo, dentro do...

25:29.260 --> 25:31.260
do groove aí, ele já, tipo,

25:31.260 --> 25:33.260
enviasse na hora pro datadog.

25:33.260 --> 25:35.260
Agora tem tantas propostas aqui.

25:35.260 --> 25:37.260
Aí eu conseguiria pegar essa métrica,

25:37.260 --> 25:39.260
essa métrica que eu se manter por

25:39.260 --> 25:41.260
vários... por muito tempo. Então, por exemplo,

25:41.260 --> 25:43.260
eu ia montar um dash e falar assim,

25:43.260 --> 25:45.260
ah, ontem... ontem meio dia,

25:45.260 --> 25:47.260
quantas propostas tinha

25:47.260 --> 25:49.260
numa etapa específica? Eu conseguiria puxar.

25:49.260 --> 25:51.260
É... eu conseguiria comparar.

25:51.260 --> 25:53.260
Então, por exemplo, nesse falou,

25:53.260 --> 25:55.260
ali naquele... naquele lá que tem...

25:55.260 --> 25:57.260
Você falou que é o Philly, né? Então, tipo,

25:57.260 --> 25:59.260
pô, tem... agora tem

25:59.260 --> 26:01.260
400 e pouca, mas tem vezes que

26:01.260 --> 26:03.260
tá oitenta e tal. Eu conseguiria, por exemplo,

26:03.260 --> 26:05.260
se fosse uma métrica,

26:05.260 --> 26:07.260
comparar com terça-feira passada.

26:07.260 --> 26:09.260
E aí eu colocarei pro datadog, ó,

26:09.260 --> 26:11.260
e, pô, hoje tá muito

26:11.260 --> 26:13.260
diferente a quantidade de propostas paradas

26:13.260 --> 26:15.260
nessa caixinha. Comparado com a última terça-feira,

26:15.260 --> 26:17.260
alerta.

26:17.260 --> 26:19.260
Porque aí ele vai falar, ó,

26:19.260 --> 26:21.260
saiu alguma coisa do comum, vale a pena dar

26:21.260 --> 26:23.260
uma olhada. Aí a gente dá uma olhada e vê se

26:23.260 --> 26:25.260
realmente é um problema ou não.

26:25.260 --> 26:27.260
Aí eu não sei, porque que nem, eu entendi

26:27.260 --> 26:29.260
que... eu não manjo, por exemplo, como é que

26:29.260 --> 26:31.260
é o desenvolvimento desses

26:31.260 --> 26:33.260
script ali dentro do Camunda.

26:33.260 --> 26:35.260
Tipo, se é algo que dá pra personalizar,

26:35.260 --> 26:37.260
se é algo que dá pra poder, por exemplo,

26:37.260 --> 26:39.260
é...

26:39.260 --> 26:41.260
colocar aí alguma,

26:41.260 --> 26:43.260
por exemplo, se tivesse uma biblioteca

26:43.260 --> 26:45.260
do datadog pra isso, ou se é possível,

26:45.260 --> 26:47.260
aí que, tipo,

26:47.260 --> 26:49.260
querendo dizer com vocês, pra ver

26:49.260 --> 26:51.260
se é algo que é possível

26:51.260 --> 26:53.260
fazer.

26:53.260 --> 26:55.260
Porque aí, se não for também,

26:55.260 --> 26:57.260
a gente tenta fazer o que dá com os logs.

26:57.260 --> 26:59.260
E a ideia, a ideia também era, tipo assim,

26:59.260 --> 27:01.260
se for possível e for

27:01.260 --> 27:03.260
complexo, a gente considerar isso

27:03.260 --> 27:05.260
só pro vídeo ali mesmo,

27:05.260 --> 27:07.260
que é algo que a gente já tá fazendo.

27:07.260 --> 27:09.260
Cara, o conhecimento

27:09.260 --> 27:11.260
que eu tenho hoje aqui,

27:11.260 --> 27:13.260
eu entendo que não, tá?

27:13.260 --> 27:15.260
Mas,

27:15.260 --> 27:17.260
eu não tenho conhecimento tão profundo, assim, nessa parte

27:17.260 --> 27:19.260
de monitoramento.

27:19.260 --> 27:21.260
Seria interessante

27:21.260 --> 27:23.260
chamar aquela moça lá, o Fabrício,

27:23.260 --> 27:25.260
a...

27:25.260 --> 27:27.260
Estefânia?

27:27.260 --> 27:29.260
Estefânia e, tipo assim, a gente

27:29.260 --> 27:31.260
conversar com ela pra ver se tem essa possibilidade.

27:31.260 --> 27:33.260
Porque, eu entendo

27:33.260 --> 27:35.260
que o Camunda

27:35.260 --> 27:37.260
não consiga fazer

27:37.260 --> 27:39.260
mandar essa informação

27:39.260 --> 27:41.260
para o datadog,

27:41.260 --> 27:43.260
por exemplo, automaticamente, sabe?

27:43.260 --> 27:45.260
Olha, eu tenho 10 propostas

27:45.260 --> 27:47.260
rodando nesse exato momento aqui.

27:47.260 --> 27:49.260
A proposta saiu daqui?

27:49.260 --> 27:51.260
Ah, agora não tenho nenhuma.

27:51.260 --> 27:53.260
Não sei, pode ser que ela

27:53.260 --> 27:55.260
veja uma saída pra...

27:55.260 --> 27:57.260
como fazer isso, né?

27:57.260 --> 27:59.260
Tá, eu vou fazer assim,

27:59.260 --> 28:01.260
eu vou ver,

28:01.260 --> 28:03.260
acho que eu não lembro quem é,

28:03.260 --> 28:05.260
que é o SRIE lá

28:05.260 --> 28:07.260
deles. Eu vou ver se é

28:07.260 --> 28:09.260
do time do Leo aqui. Se for,

28:09.260 --> 28:11.260
eu já tento conectar com eles lá

28:11.260 --> 28:13.260
e entender, tipo, como que,

28:13.260 --> 28:15.260
se eles tem alguma solução, se eles aplicaram

28:15.260 --> 28:17.260
alguma coisa, fizeram alguma coisa.

28:17.260 --> 28:19.260
E aí, o que eu troquei daí com ela lá,

28:19.260 --> 28:21.260
ela é da Estefânia da squad

28:21.260 --> 28:23.260
do casão, não é?

28:23.260 --> 28:25.260
Você sabe quem que é, ela é Estef...

28:25.260 --> 28:27.260
Sei.

28:27.260 --> 28:29.260
Estef...

28:29.260 --> 28:31.260
Eu nem sei muito bem...

28:31.260 --> 28:33.260
Mano, é uma autêntese que eu ouvi um dela.

28:33.260 --> 28:35.260
É Estefânia com H aí.

28:35.260 --> 28:37.260
É com H, né?

28:37.260 --> 28:39.260
É Estefânia Antunes Guimarães.

28:43.260 --> 28:45.260
Mas eu tô ligado quem é.

28:45.260 --> 28:47.260
Aí eu tento...

28:47.260 --> 28:49.260
Vamos me bater um papo com ela,

28:49.260 --> 28:51.260
o Deeper.

28:51.260 --> 28:53.260
Acho que é legal a gente tentar

28:53.260 --> 28:55.260
pelo menos entender,

28:55.260 --> 28:57.260
mostrar essa dor pra ela ali,

28:57.260 --> 28:59.260
ela é muito mais experiente, assim,

28:59.260 --> 29:01.260
em Camunda, né?

29:01.260 --> 29:03.260
Quando o negócio é muito rádio,

29:03.260 --> 29:05.260
eu troco ideia com ela nesse...

29:05.260 --> 29:07.260
a gente chamar ela, né?

29:07.260 --> 29:09.260
Eu vou fazer assim, mano,

29:09.260 --> 29:11.260
a ver se vocês acharem uma boa,

29:11.260 --> 29:13.260
porque eu tô ligado que vocês tão,

29:13.260 --> 29:15.260
tipo, atolado de coisa.

29:15.260 --> 29:17.260
Eu vou tentar entender com ela se é possível.

29:17.260 --> 29:19.260
Aí se ela falar, pô, dá pra fazer assim,

29:19.260 --> 29:21.260
tem umas ideias.

29:21.260 --> 29:23.260
Aí eu junto a gente pra falar,

29:23.260 --> 29:25.260
se ela falar que alguém já fez,

29:25.260 --> 29:27.260
e aí se ela falar que não sabe,

29:27.260 --> 29:29.260
aí eu já vou pro plano B,

29:29.260 --> 29:31.260
já penso no plano B.

29:31.260 --> 29:33.260
Sim.

29:33.260 --> 29:35.260
Acho que vai ser

29:35.260 --> 29:37.260
interessante mesmo,

29:37.260 --> 29:39.260
perguntar pra ela, porque as vezes,

29:39.260 --> 29:41.260
deve ter alguma coisa de integração

29:41.260 --> 29:43.260
ali com o Datadog,

29:43.260 --> 29:45.260
enfim, alguma funcionalidade

29:45.260 --> 29:47.260
aqui do Camunda, que a gente não sabe,

29:47.260 --> 29:49.260
que mostra pra gente,

29:49.260 --> 29:51.260
tipo, já diga pra você,

29:51.260 --> 29:53.260
tipo, você consegue monitorar isso, sabe?

29:53.260 --> 29:55.260
Automaticamente, olha,

29:55.260 --> 29:57.260
nessa caixinha aqui, tinha 10 pra posta,

29:57.260 --> 29:59.260
agora não tem mais nenhuma,

29:59.260 --> 30:01.260
agora tem 200.

30:01.260 --> 30:03.260
Pode ser que seja uma coisa muito mais simples, sabe?

30:03.260 --> 30:05.260
É que assim, eu desconheço,

30:05.260 --> 30:07.260
eu sei que o pessoal da...

30:07.260 --> 30:09.260
da...

30:09.260 --> 30:11.260
no digital não tem isso, a princípio, né?

30:11.260 --> 30:13.260
Eles fazem monitoração

30:13.260 --> 30:15.260
tudo ali por...

30:15.260 --> 30:17.260
por... igual eu,

30:17.260 --> 30:19.260
tipo, vai no olho,

30:19.260 --> 30:21.260
ou às vezes tem alguns alertas, né?

30:21.260 --> 30:23.260
É, então, eu acho que os alertas

30:23.260 --> 30:25.260
que eles têm em cima de logs,

30:25.260 --> 30:27.260
mas eu também posso... o amigo

30:27.260 --> 30:29.260
até compartilhou comigo

30:29.260 --> 30:31.260
alguns...

30:31.260 --> 30:33.260
alguns casos deles lá.

30:33.260 --> 30:35.260
Eu tentei envolvê-los, inclusive,

30:35.260 --> 30:37.260
nessa busca, tipo, poder a gente ver

30:37.260 --> 30:39.260
se dá pra poder, como é que a gente faz

30:39.260 --> 30:41.260
pra monitorar, só que aí, tipo,

30:41.260 --> 30:43.260
não... não...

30:43.260 --> 30:45.260
Cosby, eu acreditava lá, que as paradas de funil

30:45.260 --> 30:47.260
e tudo, ele não conseguiu priorizar,

30:47.260 --> 30:49.260
tipo, ver essa questão.

30:49.260 --> 30:51.260
Aí, eu tô vendo por conta que, tipo,

30:51.260 --> 30:53.260
o que dá pra fazer pro nosso caso.

30:53.260 --> 30:55.260
E até pensando, né,

30:55.260 --> 30:57.260
essa forma de...

30:57.260 --> 30:59.260
de monitoração

30:59.260 --> 31:01.260
sem logs, sem...

31:01.260 --> 31:03.260
sem dash, cara,

31:03.260 --> 31:05.260
é o assim.

31:05.260 --> 31:07.260
É.

31:07.260 --> 31:09.260
É, então.

31:19.260 --> 31:21.260
É preço.

31:21.260 --> 31:23.260
Então, Afa, mas assim,

31:23.260 --> 31:25.260
não tem serviços específicos

31:25.260 --> 31:27.260
que estão limitados, mano.

31:27.260 --> 31:29.260
Eu acho que nesse caso aí,

31:29.260 --> 31:31.260
é alguma coisa de instrumentação,

31:31.260 --> 31:33.260
que, tipo, o serviço

31:33.260 --> 31:35.260
não tá enviando o log pro datadog.

31:35.260 --> 31:37.260
Porque, tipo assim, o que a gente tem

31:37.260 --> 31:39.260
de... o que tinha de possível

31:39.260 --> 31:41.260
limitação, os caras, tipo, eles lá no

31:41.260 --> 31:43.260
próprio datadog, eles limitavam

31:43.260 --> 31:45.260
porcentagem.

31:45.260 --> 31:47.260
Então, tipo assim, ia chegar

31:47.260 --> 31:49.260
log de tudo, mas não todos os logs.

31:49.260 --> 31:51.260
Nesse caso aí, que um serviço

31:51.260 --> 31:53.260
não tá mandando e o outro tá,

31:53.260 --> 31:55.260
é provavelmente instrumentação

31:55.260 --> 31:57.260
do serviço.

31:57.260 --> 31:59.260
Aí, tipo, tem que entender...

31:59.260 --> 32:01.260
Aí, eu não manjo como que eles instrumentam,

32:01.260 --> 32:03.260
como é, tipo, aonde que configura

32:03.260 --> 32:05.260
pra ver esses logs. Eu sei, por exemplo,

32:05.260 --> 32:07.260
no caso de aplicações ali

32:07.260 --> 32:09.260
de contêiner, Java normal,

32:09.260 --> 32:11.260
tem um contêiner

32:11.260 --> 32:13.260
sair de cara ali do datadog

32:13.260 --> 32:15.260
que fica enviando os logs pro datadog.

32:15.260 --> 32:17.260
Então, ele sobe junto ali dentro do DCS.

32:17.260 --> 32:19.260
No Camundo, eu não faço ideia de como

32:19.260 --> 32:21.260
quer a instrumentação desses logs.

32:21.260 --> 32:23.260
Tipo, como que eles configuram

32:23.260 --> 32:25.260
pra enviar isso? Como que eles instrumentam?

32:25.260 --> 32:27.260
Aí, eu vou tentar entender

32:27.260 --> 32:29.260
também, mas eu troco

32:29.260 --> 32:31.260
essa ideia com a Stephane até pra...

32:31.260 --> 32:33.260
ou com o SRD deles lá.

32:33.260 --> 32:35.260
E aí, eu marco um papel,

32:35.260 --> 32:37.260
a gente já falando nesse chat, no paralelo

32:37.260 --> 32:39.260
conforme eu for vendo coisas e tal,

32:39.260 --> 32:41.260
eu vou falando com vocês aqui.

32:41.260 --> 32:43.260
A gente mantém esse chat aqui pra ir falando

32:43.260 --> 32:45.260
pra ver alguma novidade,

32:45.260 --> 32:47.260
ou ver com a Stephane que tem uma

32:47.260 --> 32:49.260
possibilidade de chamar ela

32:49.260 --> 32:51.260
pra um papo com a gente.

32:51.260 --> 32:53.260
Aí, eu remarco essa agenda aqui de novo

32:53.260 --> 32:55.260
com alguma atualização.

32:55.260 --> 32:57.260
Desculpa não ajudar muito aí de...

32:57.260 --> 32:59.260
Não, ok, isso ajudou, mano.

32:59.260 --> 33:01.260
É que, eu vou ver essa questão também que

33:01.260 --> 33:03.260
vocês falaram. É uma boa, então,

33:03.260 --> 33:05.260
eu vou ver se eu já consigo criar

33:05.260 --> 33:07.260
alguma alerta, alguma coisa,

33:07.260 --> 33:09.260
em cima dos logs, pro que tem log.

33:09.260 --> 33:11.260
Porque, por exemplo,

33:11.260 --> 33:13.260
se com log atingindo, diminuir

33:13.260 --> 33:15.260
a complexidade, a gente usa log mesmo,

33:15.260 --> 33:17.260
para os alertas.

33:17.260 --> 33:19.260
E aí, não precisa ouvir de instrumentar

33:19.260 --> 33:21.260
a custom metrics.

33:21.260 --> 33:23.260
É importante a gente ser avisado quando

33:23.260 --> 33:25.260
alguma coisa sai do comum lá dentro.

33:25.260 --> 33:27.260
Aí, se a gente for avisado, a gente

33:27.260 --> 33:29.260
entra e olha, né?

33:29.260 --> 33:31.260
Por como é que a gente...

33:31.260 --> 33:33.260
É que nem por, a gente tem que ficar

33:33.260 --> 33:35.260
olhando todo dia na mão,

33:35.260 --> 33:37.260
ligado que gasta um tempo, né,

33:37.260 --> 33:39.260
de vocês aí, tipo, ficar todo de

33:39.260 --> 33:41.260
um, de outro, a gente tem

33:41.260 --> 33:43.260
tempestividade, tem hora que o que

33:43.260 --> 33:45.260
assim, é prática a minha ficar olhando, né?

33:45.260 --> 33:47.260
Vai ser com você ficar dependendo

33:47.260 --> 33:49.260
de um ano, uma hora falha, né?

33:49.260 --> 33:51.260
É, então...

33:51.260 --> 33:53.260
A datador ia ficar ali em cima

33:53.260 --> 33:55.260
o tempo todo. Teve uma diferença

33:55.260 --> 33:57.260
já lá, alerta no grupo, e aí a gente

33:57.260 --> 33:59.260
olha. Sim.

33:59.260 --> 34:01.260
Que ia pegar ao vivo, né?

34:01.260 --> 34:03.260
Mas, pessoal, então, eu vou avaliar

34:03.260 --> 34:05.260
que essa possibilidade

34:05.260 --> 34:07.260
de montar já alguma

34:07.260 --> 34:09.260
observabilidade de alerta e dash

34:09.260 --> 34:11.260
em cima dos logs,

34:11.260 --> 34:13.260
eu vou entender porque

34:13.260 --> 34:15.260
alguns serviços não estão logando,

34:15.260 --> 34:17.260
tentar entender porque não estão logando,

34:17.260 --> 34:19.260
e vou trocar uma ideia com a

34:19.260 --> 34:21.260
Stefânia, e pra entender

34:21.260 --> 34:23.260
o que que dá pra

34:23.260 --> 34:25.260
fazer em relação a essas custométricas.

34:25.260 --> 34:27.260
Eu estou repetindo

34:27.260 --> 34:29.260
aqui o resumo porque eu esqueço

34:29.260 --> 34:31.260
e eu estou ligado que a IA vai anotar.

34:31.260 --> 34:33.260
Aqui no Facilitado,

34:33.260 --> 34:35.260
vai anotar aqui na reunião e depois eu puxo.

34:35.260 --> 34:37.260
Eu fico com essas listões de casa

34:37.260 --> 34:39.260
e aí eu volto com vocês

34:39.260 --> 34:41.260
quando tiver alguma

34:41.260 --> 34:43.260
novidade.

34:43.260 --> 34:45.260
Eu vou falar aqui na chat.

34:45.260 --> 34:47.260
Bele, mano, obrigado, hein.

34:47.260 --> 34:49.260
Valeu, um abraço, hein.

34:49.260 --> 34:51.260
Um abraço.


