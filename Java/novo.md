<camunda:inputParameter name="headersDev">{"x-itau-apikey":"${"x-itau-apikey"}","x-itau-flowID":"${"x-itau-flowID"}","x-itau-correlationID":"${execution.getVariable('x-itau-correlationID')}","Accept":"application/json"}</camunda:inputParameter>
<camunda:inputParameter name="headersHomolog">{"x-itau-apikey":"${"x-itau-apikey"}","x-itau-flowID":"${"x-itau-flowID"}","x-itau-correlationID":"${execution.getVariable('x-itau-correlationID')}","Accept":"application/json"}</camunda:inputParameter>
 <camunda:inputParameter name="headersProd">{"x-itau-apikey":"${"x-itau-apikey"}","x-itau-flowID":"${"x-itau-flowID"}","x-itau-correlationID":"${execution.getVariable('x-itau-correlationID')}","Accept":"application/json"}</camunda:inputParameter>



 <camunda:inputParameter name="headersDev">{"Content-Type":"application/json","x-itau-apikey":"${"x-itau-apikey"}","x-itau-flowID":"${"x-itau-flowID"}","id-jornada":"MULTIPLO_PHYGITAL","x-itau-correlationID":"${execution.getVariable('x-itau-correlationID')}"}</camunda:inputParameter>
<camunda:inputParameter name="headersHomolog">{"Content-Type":"application/json","x-itau-apikey":"${"x-itau-apikey"}","x-itau-flowID":"${"x-itau-flowID"}","id-jornada":"MULTIPLO_PHYGITAL","x-itau-correlationID":"${execution.getVariable('x-itau-correlationID')}"}</camunda:inputParameter>
<camunda:inputParameter name="headersProd">{"Content-Type":"application/json","x-itau-apikey":"${"x-itau-apikey"}","x-itau-flowID":"${"x-itau-flowID"}","id-jornada":"MULTIPLO_PHYGITAL","x-itau-correlationID":"${execution.getVariable('x-itau-correlationID')}"}</camunda:inputParameter>
