<?xml version="1.0" encoding="UTF-8"?>
<bpmn:definitions xmlns:bpmn="http://www.omg.org/spec/KK0172/20100524/MODEL" xmlns:bpmndi="http://www.omg.org/spec/KK0172/20100524/DI" xmlns:dc="http://www.omg.org/spec/DD/20100524/DC" xmlns:di="http://www.omg.org/spec/DD/20100524/DI" xmlns:bioc="http://bpmn.io/KK1214/bpmn/biocolor/1.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" id="Definitions_omnichannel_pai_com_voltar" targetNamespace="http://bpmn.io/KK1214/bpmn" exporter="KK0218" exporterVersion="5.44.0">
  <bpmn:message id="KK0874" name="KK1457" />
  <bpmn:process id="omnichannel_pai" name="KK0948 KK0995 (Nível 1 — executivo com KK1452)" isExecutable="true">
    <bpmn:documentation>Versão executiva do Nível 1 com visual completo para apresentação: KK0651 principal e KK1456 (KK0968), com KK0552 KK1371 explícitos como apoio visual.</bpmn:documentation>
    <bpmn:startEvent id="StartEvent_1" name="Início">
      <bpmn:outgoing>Flow_start_to_config</bpmn:outgoing>
    </bpmn:startEvent>
    <bpmn:callActivity id="KK0210" name="① KK0316" KK0216="KK0954">
      <bpmn:incoming>Flow_start_to_config</bpmn:incoming>
      <bpmn:incoming>Flow_voltar_to_config</bpmn:incoming>
      <bpmn:outgoing>Flow_config_to_dados</bpmn:outgoing>
    </bpmn:callActivity>
    <bpmn:callActivity id="KK0211" name="② KK0399 pessoais" KK0216="KK0956">
      <bpmn:incoming>Flow_config_to_dados</bpmn:incoming>
      <bpmn:outgoing>Flow_dados_to_produtos</bpmn:outgoing>
    </bpmn:callActivity>
    <bpmn:KK0169 id="BE_voltar_dados" name="KK1452 (mensagem)" attachedToRef="KK0211">
      <bpmn:outgoing>Flow_boundary_dados_to_gateway_voltar</bpmn:outgoing>
      <bpmn:messageEventDefinition messageRef="KK0874" />
    </bpmn:KK0169>
    <bpmn:callActivity id="KK0212" name="③ KK1078 e KK1279" KK0216="KK0960">
      <bpmn:incoming>Flow_dados_to_produtos</bpmn:incoming>
      <bpmn:incoming>Flow_voltar_to_produtos</bpmn:incoming>
      <bpmn:outgoing>Flow_produtos_to_validacao</bpmn:outgoing>
    </bpmn:callActivity>
    <bpmn:KK0169 id="BE_voltar_produtos" name="KK1452 (mensagem)" attachedToRef="KK0212">
      <bpmn:outgoing>Flow_boundary_produtos_to_gateway_voltar</bpmn:outgoing>
      <bpmn:messageEventDefinition messageRef="KK0874" />
    </bpmn:KK0169>
    <bpmn:callActivity id="KK0213" name="④ KK1405" KK0216="KK0961">
      <bpmn:incoming>Flow_voltar_to_validacao</bpmn:incoming>
      <bpmn:incoming>Flow_produtos_to_validacao</bpmn:incoming>
      <bpmn:outgoing>Flow_validacao_to_end</bpmn:outgoing>
    </bpmn:callActivity>
    <bpmn:KK0169 id="BE_voltar_validacao" name="KK1452 (mensagem)" attachedToRef="KK0213">
      <bpmn:outgoing>Flow_boundary_validacao_to_gateway_voltar</bpmn:outgoing>
      <bpmn:messageEventDefinition messageRef="KK0874" />
    </bpmn:KK0169>
    <bpmn:exclusiveGateway id="Gateway_voltar_para" name="Para onde KK1451?" KK0472="Flow_voltar_default_erro">
      <bpmn:incoming>Flow_boundary_dados_to_gateway_voltar</bpmn:incoming>
      <bpmn:incoming>Flow_boundary_produtos_to_gateway_voltar</bpmn:incoming>
      <bpmn:incoming>Flow_boundary_validacao_to_gateway_voltar</bpmn:incoming>
      <bpmn:outgoing>Flow_voltar_to_config</bpmn:outgoing>
      <bpmn:outgoing>Flow_voltar_to_produtos</bpmn:outgoing>
      <bpmn:outgoing>Flow_voltar_to_validacao</bpmn:outgoing>
      <bpmn:outgoing>Flow_voltar_default_erro</bpmn:outgoing>
      <bpmn:outgoing>Flow_voltar_to_dados</bpmn:outgoing>
    </bpmn:exclusiveGateway>
    <bpmn:endEvent id="EndEvent_jornada_ok" name="Jornada concluída">
      <bpmn:incoming>Flow_validacao_to_end</bpmn:incoming>
    </bpmn:endEvent>
    <bpmn:endEvent id="EndEvent_cancelamento" name="Cancelar por destino inválido">
      <bpmn:incoming>Flow_voltar_default_erro</bpmn:incoming>
    </bpmn:endEvent>
    <bpmn:callActivity id="call_backoffice" name="Transversal: KK0134" KK0216="KK0952" />
    <bpmn:callActivity id="call_analises" name="Transversal: Análises (AQ4/KK0082)" KK0216="KK1469" />
    <bpmn:callActivity id="call_voucher" name="Transversal: KK1460" KK0216="omnichannel_voucher" />
    <bpmn:callActivity id="call_turnover" name="Transversal: Turnover/Vínculo" KK0216="KK1376" />
    <bpmn:sequenceFlow id="Flow_start_to_config" sourceRef="StartEvent_1" targetRef="KK0210" />
    <bpmn:sequenceFlow id="Flow_config_to_dados" sourceRef="KK0210" targetRef="KK0211" />
    <bpmn:sequenceFlow id="Flow_dados_to_produtos" sourceRef="KK0211" targetRef="KK0212" />
    <bpmn:sequenceFlow id="Flow_produtos_to_validacao" sourceRef="KK0212" targetRef="KK0213" />
    <bpmn:sequenceFlow id="Flow_validacao_to_end" sourceRef="KK0213" targetRef="EndEvent_jornada_ok" />
    <bpmn:sequenceFlow id="Flow_boundary_dados_to_gateway_voltar" sourceRef="BE_voltar_dados" targetRef="Gateway_voltar_para" />
    <bpmn:sequenceFlow id="Flow_boundary_produtos_to_gateway_voltar" sourceRef="BE_voltar_produtos" targetRef="Gateway_voltar_para" />
    <bpmn:sequenceFlow id="Flow_boundary_validacao_to_gateway_voltar" sourceRef="BE_voltar_validacao" targetRef="Gateway_voltar_para" />
    <bpmn:sequenceFlow id="Flow_voltar_to_config" name="KK1451 para Config" sourceRef="Gateway_voltar_para" targetRef="KK0210">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression" language="groovy">KK1459 == "KK0954" || KK1459 == "1"</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="Flow_voltar_to_dados" name="KK1451 para KK0399" sourceRef="Gateway_voltar_para" targetRef="KK0211">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression" language="groovy">KK1459 == "KK0956" || KK1459 == "2"</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="Flow_voltar_to_produtos" name="KK1451 para KK1078" sourceRef="Gateway_voltar_para" targetRef="KK0212">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression" language="groovy">KK1459 == "KK0960" || KK1459 == "3"</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="Flow_voltar_to_validacao" name="KK1451 para Validacao" sourceRef="Gateway_voltar_para" targetRef="KK0213">
      <bpmn:conditionExpression xsi:type="bpmn:tFormalExpression" language="groovy">KK1459 == "KK0961" || KK1459 == "4"</bpmn:conditionExpression>
    </bpmn:sequenceFlow>
    <bpmn:sequenceFlow id="Flow_voltar_default_erro" name="KK0472" sourceRef="Gateway_voltar_para" targetRef="EndEvent_cancelamento" />
    <bpmn:association id="Assoc_validacao_backoffice" sourceRef="KK0213" targetRef="call_backoffice" />
    <bpmn:association id="Assoc_validacao_analises" sourceRef="KK0213" targetRef="call_analises" />
    <bpmn:association id="Assoc_produtos_voucher" sourceRef="KK0212" targetRef="call_voucher" />
    <bpmn:association id="Assoc_voucher_validacao" sourceRef="call_voucher" targetRef="KK0213" />
    <bpmn:association id="Assoc_validacao_turnover" sourceRef="KK0213" targetRef="call_turnover" />
    <bpmn:association id="Assoc_turnover_fim" sourceRef="call_turnover" targetRef="EndEvent_jornada_ok" />
  </bpmn:process>
  <bpmndi:BPMNDiagram id="BPMNDiagram_omnichannel_pai_com_voltar">
    <bpmndi:BPMNPlane id="BPMNPlane_omnichannel_pai" bpmnElement="omnichannel_pai">
      <bpmndi:BPMNShape id="StartEvent_1_di" bpmnElement="StartEvent_1" bioc:stroke="#2E7D32" bioc:fill="#E8F5E9">
        <dc:Bounds x="577" y="115" width="46" height="46" />
        <bpmndi:BPMNLabel>
          <dc:Bounds x="587" y="161" width="27" height="14" />
        </bpmndi:BPMNLabel>
      </bpmndi:BPMNShape>
      <bpmndi:BPMNShape id="call_configuracao_di" bpmnElement="KK0210" bioc:stroke="#1565C0" bioc:fill="#E3F2FD">
        <dc:Bounds x="1220" y="80" width="180" height="110" />
      </bpmndi:BPMNShape>
      <bpmndi:BPMNShape id="call_dados_pessoais_di" bpmnElement="KK0211" bioc:stroke="#1565C0" bioc:fill="#E3F2FD">
        <dc:Bounds x="1980" y="375" width="180" height="110" />
      </bpmndi:BPMNShape>
      <bpmndi:BPMNShape id="call_produtos_di" bpmnElement="KK0212" bioc:stroke="#1565C0" bioc:fill="#E3F2FD">
        <dc:Bounds x="1220" y="665" width="180" height="110" />
      </bpmndi:BPMNShape>
      <bpmndi:BPMNShape id="call_validacao_di" bpmnElement="KK0213" bioc:stroke="#1565C0" bioc:fill="#E3F2FD">
        <dc:Bounds x="510" y="365" width="180" height="110" />
      </bpmndi:BPMNShape>
      <bpmndi:BPMNShape id="Gateway_voltar_para_di" bpmnElement="Gateway_voltar_para" isMarkerVisible="true" bioc:stroke="#F57C00" bioc:fill="#FFF8E1">
        <dc:Bounds x="1278" y="388" width="64" height="64" />
        <bpmndi:BPMNLabel>
          <dc:Bounds x="1352" y="403" width="87" height="14" />
        </bpmndi:BPMNLabel>
      </bpmndi:BPMNShape>
      <bpmndi:BPMNShape id="EndEvent_jornada_ok_di" bpmnElement="EndEvent_jornada_ok" bioc:stroke="#2E7D32" bioc:fill="#E8F5E9">
        <dc:Bounds x="577" y="217" width="46" height="46" />
        <bpmndi:BPMNLabel>
          <dc:Bounds x="555" y="193" width="90" height="14" />
        </bpmndi:BPMNLabel>
      </bpmndi:BPMNShape>
      <bpmndi:BPMNShape id="EndEvent_cancelamento_di" bpmnElement="EndEvent_cancelamento" bioc:stroke="#C62828" bioc:fill="#FFEBEE">
        <dc:Bounds x="967" y="197" width="46" height="46" />
        <bpmndi:BPMNLabel>
          <dc:Bounds x="952" y="243" width="76" height="27" />
        </bpmndi:BPMNLabel>
      </bpmndi:BPMNShape>
      <bpmndi:BPMNShape id="call_voucher_di" bpmnElement="call_voucher" bioc:stroke="#2E7D32" bioc:fill="#E8F5E9">
        <dc:Bounds x="1200" y="945" width="220" height="90" />
      </bpmndi:BPMNShape>
      <bpmndi:BPMNShape id="call_turnover_di" bpmnElement="call_turnover" bioc:stroke="#2E7D32" bioc:fill="#E8F5E9">
        <dc:Bounds x="170" y="143" width="220" height="90" />
      </bpmndi:BPMNShape>
      <bpmndi:BPMNShape id="call_backoffice_di" bpmnElement="call_backoffice" bioc:stroke="#2E7D32" bioc:fill="#E8F5E9">
        <dc:Bounds x="170" y="365" width="220" height="90" />
      </bpmndi:BPMNShape>
      <bpmndi:BPMNShape id="call_analises_di" bpmnElement="call_analises" bioc:stroke="#2E7D32" bioc:fill="#E8F5E9">
        <dc:Bounds x="160" y="605" width="220" height="90" />
      </bpmndi:BPMNShape>
      <bpmndi:BPMNEdge id="Assoc_validacao_backoffice_di" bpmnElement="Assoc_validacao_backoffice">
        <di:waypoint x="510" y="397" />
        <di:waypoint x="390" y="402" />
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="Assoc_validacao_analises_di" bpmnElement="Assoc_validacao_analises">
        <di:waypoint x="517" y="474" />
        <di:waypoint x="341" y="605" />
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNShape id="BE_voltar_validacao_di" bpmnElement="BE_voltar_validacao" bioc:stroke="#EF6C00" bioc:fill="#FFF3E0">
        <dc:Bounds x="672" y="402" width="36" height="36" />
        <bpmndi:BPMNLabel>
          <dc:Bounds x="712" y="406" width="62" height="27" />
        </bpmndi:BPMNLabel>
      </bpmndi:BPMNShape>
      <bpmndi:BPMNShape id="BE_voltar_produtos_di" bpmnElement="BE_voltar_produtos" bioc:stroke="#EF6C00" bioc:fill="#FFF3E0">
        <dc:Bounds x="1292" y="647" width="36" height="36" />
        <bpmndi:BPMNLabel>
          <dc:Bounds x="1279" y="610" width="62" height="27" />
        </bpmndi:BPMNLabel>
      </bpmndi:BPMNShape>
      <bpmndi:BPMNShape id="BE_voltar_dados_di" bpmnElement="BE_voltar_dados" bioc:stroke="#EF6C00" bioc:fill="#FFF3E0">
        <dc:Bounds x="1962" y="412" width="36" height="36" />
        <bpmndi:BPMNLabel>
          <dc:Bounds x="1890" y="416" width="62" height="27" />
        </bpmndi:BPMNLabel>
      </bpmndi:BPMNShape>
      <bpmndi:BPMNEdge id="Flow_start_to_config_di" bpmnElement="Flow_start_to_config">
        <di:waypoint x="623" y="135" />
        <di:waypoint x="1220" y="135" />
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="Flow_config_to_dados_di" bpmnElement="Flow_config_to_dados">
        <di:waypoint x="1400" y="135" />
        <di:waypoint x="2070" y="135" />
        <di:waypoint x="2070" y="375" />
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="Flow_dados_to_produtos_di" bpmnElement="Flow_dados_to_produtos">
        <di:waypoint x="2070" y="485" />
        <di:waypoint x="2070" y="720" />
        <di:waypoint x="1400" y="720" />
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="Flow_produtos_to_validacao_di" bpmnElement="Flow_produtos_to_validacao">
        <di:waypoint x="1220" y="720" />
        <di:waypoint x="600" y="720" />
        <di:waypoint x="600" y="475" />
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="Flow_validacao_to_end_di" bpmnElement="Flow_validacao_to_end">
        <di:waypoint x="600" y="365" />
        <di:waypoint x="600" y="263" />
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="Flow_boundary_dados_to_gateway_voltar_di" bpmnElement="Flow_boundary_dados_to_gateway_voltar">
        <di:waypoint x="1965" y="420" />
        <di:waypoint x="1342" y="420" />
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="Flow_boundary_produtos_to_gateway_voltar_di" bpmnElement="Flow_boundary_produtos_to_gateway_voltar">
        <di:waypoint x="1310" y="647" />
        <di:waypoint x="1310" y="452" />
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="Flow_boundary_validacao_to_gateway_voltar_di" bpmnElement="Flow_boundary_validacao_to_gateway_voltar">
        <di:waypoint x="708" y="420" />
        <di:waypoint x="1278" y="420" />
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="Flow_voltar_to_config_di" bpmnElement="Flow_voltar_to_config">
        <di:waypoint x="1310" y="388" />
        <di:waypoint x="1310" y="190" />
        <bpmndi:BPMNLabel>
          <dc:Bounds x="1300" y="225" width="87" height="14" />
        </bpmndi:BPMNLabel>
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="Flow_voltar_to_dados_di" bpmnElement="Flow_voltar_to_dados">
        <di:waypoint x="1342" y="420" />
        <di:waypoint x="1980" y="420" />
        <bpmndi:BPMNLabel>
          <dc:Bounds x="1597" y="395" width="87" height="14" />
        </bpmndi:BPMNLabel>
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="Flow_voltar_to_produtos_di" bpmnElement="Flow_voltar_to_produtos">
        <di:waypoint x="1310" y="452" />
        <di:waypoint x="1310" y="665" />
        <bpmndi:BPMNLabel>
          <dc:Bounds x="1302" y="474" width="52" height="27" />
        </bpmndi:BPMNLabel>
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="Flow_voltar_to_validacao_di" bpmnElement="Flow_voltar_to_validacao">
        <di:waypoint x="1278" y="420" />
        <di:waypoint x="690" y="420" />
        <bpmndi:BPMNLabel>
          <dc:Bounds x="820" y="404" width="52" height="27" />
        </bpmndi:BPMNLabel>
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="Flow_voltar_default_erro_di" bpmnElement="Flow_voltar_default_erro">
        <di:waypoint x="1290" y="408" />
        <di:waypoint x="1009" y="232" />
        <bpmndi:BPMNLabel>
          <dc:Bounds x="1143" y="307" width="34" height="14" />
        </bpmndi:BPMNLabel>
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="Assoc_produtos_voucher_di" bpmnElement="Assoc_produtos_voucher">
        <di:waypoint x="1310" y="775" />
        <di:waypoint x="1310" y="945" />
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="Assoc_voucher_validacao_di" bpmnElement="Assoc_voucher_validacao">
        <di:waypoint x="1200" y="990" />
        <di:waypoint x="660" y="990" />
        <di:waypoint x="665" y="475" />
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="Assoc_validacao_turnover_di" bpmnElement="Assoc_validacao_turnover">
        <di:waypoint x="510" y="373" />
        <di:waypoint x="312" y="233" />
      </bpmndi:BPMNEdge>
      <bpmndi:BPMNEdge id="Assoc_turnover_fim_di" bpmnElement="Assoc_turnover_fim">
        <di:waypoint x="386" y="231" />
        <di:waypoint x="579" y="231" />
      </bpmndi:BPMNEdge>
    </bpmndi:BPMNPlane>
  </bpmndi:BPMNDiagram>
</bpmn:definitions>
