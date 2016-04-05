package parse;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;


public class ParseXML2 {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {

        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();

        String ans = "<?xml version=\"1.0\" ?><list><creditCardInfo>" +
                "<pan>5457082234148471</pan>" +
                "<dataUri>ua.pb.comp</dataUri>" +
                "<exDate>1018</exDate>" +
                "<san>8100302011685155</san>" +
                "<channel>WAVE</channel></creditCardInfo></list>";
        Document doc = (Document) docBuilder.parse(new ByteArrayInputStream(ans.getBytes("UTF-8")));
        //Document document = docBuilder.parse(ans);
        //parse(doc.getDocumentElement());
        parse(doc.getDocumentElement());
    }

    public static void parse(Node node) {
        ArrayList list = new ArrayList();
        NodeList nodeList = node.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node currentNode = nodeList.item(i);
            list.add(currentNode.getNodeName());
            System.out.println(list.get(i));
            //currentNode.getAttributes();
            System.out.println(currentNode.toString());
            if (currentNode.getNodeType() == Node.ELEMENT_NODE) {
                //calls this method for all the children which is Element
                parse(currentNode);
            }
        }
    }

}


