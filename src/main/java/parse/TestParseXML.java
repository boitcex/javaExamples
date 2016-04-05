package parse;

import org.w3c.dom.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TestParseXML {
    List<String> list = new ArrayList<String>();
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        TestParseXML XMLParseTwo = new TestParseXML();


        String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?><doc><mes task_id=\"56e6894cc72821abdd4a8d55\" res=\"ok\" dateODB=\"2016-03-12 00:00:00\" clid=\"1000809438\" bank=\"AB\" pan=\"5211527307307286\" MaxSum=\"0\" MaxPay=\"0\" id_type=\"D098\" id_types=\"Шановний клієнте, ця послуга Вам недоступна\" KolAct=\"0\" MaxKOlPP=\"0\" DateAct=\"2016-03-09 00:00:00\" kolPPactAPR=\"0\" status=\"P\"><mes task_id=\"56e6894cc72821abdd4a8d55\" res=\"ok\" dateODB=\"2016-03-12 00:00:00\" clid=\"1000809438\" bank=\"AB\" pan=\"5211527307307286\" MaxSum=\"0\" MaxPay=\"0\" id_type=\"D098\" id_types=\"лох\" KolAct=\"0\" MaxKOlPP=\"0\" DateAct=\"2016-03-09 00:00:00\" kolPPactAPR=\"0\" status=\"P\" /></mes><mes task_id=\"56e6894cc72821abdd4a8d55\" res=\"ok\" dateODB=\"2016-03-12 00:00:00\" clid=\"1000809438\" bank=\"AB\" pan=\"5211527305766483\" MaxSum=\"0\" MaxPay=\"0\" id_type=\"D098\" id_types=\"Шановний клієнте, ця послуга Вам недоступна\" KolAct=\"0\" MaxKOlPP=\"0\" DateAct=\"2016-03-09 00:00:00\" kolPPactAPR=\"0\" status=\"P\"/><mes task_id=\"56e6894cc72821abdd4a8d55\" res=\"ok\" dateODB=\"2016-03-12 00:00:00\" clid=\"1000809438\" bank=\"PB\" pan=\"5577212702785109\" MaxSum=\"0\" MaxPay=\"0\" id_type=\"D098\" id_types=\"Шановний клієнте, ця послуга Вам недоступна\" KolAct=\"0\" MaxKOlPP=\"0\" DateAct=\"2016-03-09 00:00:00\" kolPPactAPR=\"0\" status=\"P\"/><mes task_id=\"56e6894cc72821abdd4a8d55\" res=\"ok\" dateODB=\"2016-03-12 00:00:00\" clid=\"1000809438\" bank=\"AB\" pan=\"5211527307307286\" MaxSum=\"0\" MaxPay=\"0\" id_type=\"D098\" id_types=\"Шановний клієнте, ця послуга Вам недоступна\" KolAct=\"0\" MaxKOlPP=\"0\" DateAct=\"2016-03-09 00:00:00\" kolPPactAPR=\"0\" status=\"P\"><mes task_id=\"56e6894cc72821abdd4a8d55\" res=\"ok\" dateODB=\"2016-03-12 00:00:00\" clid=\"1000809438\" bank=\"AB\" pan=\"5211527307307286\" MaxSum=\"0\" MaxPay=\"0\" id_type=\"D098\" id_types=\"лох\" KolAct=\"0\" MaxKOlPP=\"0\" DateAct=\"2016-03-09 00:00:00\" kolPPactAPR=\"0\" status=\"P\" /></mes><mes task_id=\"56e6894cc72821abdd4a8d55\" res=\"ok\" dateODB=\"2016-03-12 00:00:00\" clid=\"1000809438\" bank=\"AB\" pan=\"5211527305766483\" MaxSum=\"0\" MaxPay=\"0\" id_type=\"D098\" id_types=\"Шановний клієнте, ця послуга Вам недоступна\" KolAct=\"0\" MaxKOlPP=\"0\" DateAct=\"2016-03-09 00:00:00\" kolPPactAPR=\"0\" status=\"P\"/><mes task_id=\"56e6894cc72821abdd4a8d55\" res=\"ok\" dateODB=\"2016-03-12 00:00:00\" clid=\"1000809438\" bank=\"PB\" pan=\"5577212702785109\" MaxSum=\"0\" MaxPay=\"0\" id_type=\"D098\" id_types=\"Шановний клієнте, ця послуга Вам недоступна\" KolAct=\"0\" MaxKOlPP=\"0\" DateAct=\"2016-03-09 00:00:00\" kolPPactAPR=\"0\" status=\"P\"/></doc>";
/*        String xml = "\t<State>y</State>\n" +
                "\t<ExtId>testextid</ExtId>\n" +
                "\t<CardPan>26205600746852</CardPan>\n" +
                "\t<BaseAccount>\n" +
                "\t\t<Overdraft>0</Overdraft>\n" +
                "\t\t<Currency>810</Currency>\n" +
                "\t\t<Remain>0</Remain>\n" +
                "\t\t<Avail>0</Avail>\n" +
                "\t\t<AccNumber>26205600746852810</AccNumber>\n" +
                "\t</BaseAccount>";*/
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(new ByteArrayInputStream(xml.getBytes("utf-8"))));
        Element root = document.getDocumentElement();

        NodeList nodeList = root.getChildNodes();
        XMLParseTwo.getAllElementsFromNodeList(nodeList);
        for(String str:XMLParseTwo.list){
            System.out.println(str);
        }


    }
    public void workWithElements(Node node){
        getNameAndValueElement(node);
        getAllAttributes(node);
        getChildNodes(node);
    }


    public void getAllAttributes(Node node){
        NamedNodeMap namedNodeMap = node.getAttributes();
        if (namedNodeMap != null){
            for (int i = 0; i < namedNodeMap.getLength(); i++){
                list.add("\""+namedNodeMap.item(i).getNodeName()+"\":"+"\""+namedNodeMap.item(i).getNodeValue()+"\"");
            }
        }
    }

    public void getNameAndValueElement(Node node){
        if(node.getNodeValue() != null){
            System.out.println(node.getNodeName()+"=\""+node.getNodeValue()+"\"");
        }
    }

    public void getAllElementsFromNodeList(NodeList nodeList){
        if(nodeList!=null){
            for (int i = 0 ;i < nodeList.getLength();i++){
                workWithElements(nodeList.item(i));
            }
        }

    }
    public void getChildNodes(Node node){
        NodeList nodeList = node.getChildNodes();
        if(nodeList != null){
            getAllElementsFromNodeList(nodeList);
        }
    }
    }