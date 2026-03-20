# Instruções para validar KK0172 original (KK0134)

## Objetivo

KK1404 se o `KK0903 KK0135` que reconstruímos está “paridade por estrutura” com o monólito, especialmente no desvio ligado ao **KK0668 de KK0466 de Retorno** `KK0680`.

Fonte do monólito: `KK0953` (KK0953).

Ver também o gap já registrado: `GAPS_N2_FECHAMENTO_LINHA_BASE.md` (KK0310).

## O que você precisa trazer do KK0172 original (KK0953)

Trazer trechos do XML (copiar do Modeler) para eu comparar “de verdade” as condições/derivações e confirmar se o KK0903 ficou certo ou se houve erro de reconstrução.

1. **Trecho que indica o problema de XML/escape (KK1406 de integridade)**
   - Cole o bloco do `KK1223` (ou `scriptTask`) em volta do início do trecho que aparece por volta da **linha ~939** no arquivo.
   - Quero ver o começo e o fim do bloco (umas dezenas de linhas já ajudam), para confirmar se o original está realmente com escape/CDATA quebrado (hoje o arquivo falha em parse estrito de XML).

2. **KK0668 completo do desvio de KK1187**
   - Cole o XML do `exclusiveGateway` `KK0680`.
   - Inclua também os `sequenceFlow` ligados a esse KK0669 (principalmente os que vão para:
     - `KK1099` (KK1099)
     - caminho padrão/recusa (`Event_05idg99`, sem necessidade de trazer o ID se não tiver mapeamento no glossário)
     - e qualquer outro ramo relevante).
   - Se houver `conditionExpression` nos `sequenceFlow`, traga exatamente essas expressões.

3. **Como o monólito deriva `resultado_analise_backoffice` para o caso KK0661/aprovada**
   - Cole o trecho onde o monólito KK1281/transforma `resultado_analise_backoffice` (e qualquer KK1001/KK0135 KK1001 que alimenta essa KK1424).
   - Mostre como esse valor se conecta ao desvio que leva para:
     - `KK1108` (KK1108)
     - vs `KK1099` (KK1099)
   - Se existir algum KK0669 intermediário (ex.: KK0669 de “sucesso da KK0065” que decide se vai para “KK1190 vs seguir”), inclua também esse contexto.

## Como enviar (formato)

- Copie e cole o XML **exato** do Modeler.
- Se possível, mande em blocos separados (1, 2, 3) como acima.
- Se algum ID não estiver presente no glossário, não tem problema: traga mesmo assim, porque eu comparo pelo XML.

## Critério de aceitação (o que eu vou checar quando você mandar)

1. Se o monólito decide `KK0680` por `conditionExpression` (ou se o desvio depende de `KK0472` + valores implícitos).
2. Se os valores efetivamente usados no monólito para `resultado_analise_backoffice` batem com o que modelamos no KK0903 para os ramos de KK0661/aprovada.
3. Se o caminho que leva a `KK1108` está mapeado corretamente (ou se no monólito “KK0661” se manifesta por outro valor/branch).

KK0311
