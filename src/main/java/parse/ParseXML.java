package parse;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

/**
 * Created by Roman on 28.07.2015.
 */
public class ParseXML {
    private static String xmlStr = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
            + "<catalog>"
            + "<book id=\"1\">"
            + "<author>Charles Dickens</author>"
            + "<title>Oliver Twist</title>"
            + "</book>"
            + "<book id=\"2\">"
            + "<author>Mark Twain</author>"
            + "<title>The Adventures of Tom Sawyer</title>"
            + "</book>"
            + "</catalog>";

    private static String ans ="<?xml version=\"1.0\" ?><list><creditCardInfo><pan>5457082234148471</pan><dataUri>ua.pb.comp</dataUri><exDate>1018</exDate><cardName>MС Standard Universal PayPass</cardName><cardState>a</cardState><can>26254620842464980</can><currency>980</currency><balance>14646.650</balance><creditLimit>15000.000</creditLimit><canState>3</canState><refContract>SAMDNWFC00009919269</refContract><contractType>CRPL</contractType><contractState>a</contractState><productType>KUN</productType><bank>PB</bank><san>8100302011685155</san><channel>WAVE</channel><updateSysDate>2014-10-08T13:38:38.000</updateSysDate></creditCardInfo><creditCardInfo><pan>4731217103344022</pan><dataUri>ua.pb.comp</dataUri><exDate>0418</exDate><cardName>Карта для выплат</cardName><cardAlias>Visa USD Gold Debit</cardAlias><cardState>a</cardState><can>4731217103344022840</can><currency>980</currency><balance>0.600</balance><creditLimit>0.000</creditLimit><canState>3</canState><refContract>SAMDNWFC00009919194</refContract><contractType>GLMG</contractType><contractState>a</contractState><productType>KDV</productType><bank>PB</bank><san>8100368016508387</san><channel>WAVE</channel><updateSysDate>2014-09-30T19:58:08.000</updateSysDate></creditCardInfo><creditCardInfo><pan>4405882301741132</pan><dataUri>ua.pb.pctl</dataUri><exDate>1115</exDate><cardName>Зарплатная карта для выплат</cardName><cardAlias>Зарплатка</cardAlias><cardState>a</cardState><can>6762466798233316980</can><currency>980</currency><balance>0.930</balance><creditLimit>0.000</creditLimit><canState>3</canState><refContract>SAMDP00000000392617</refContract><contractType>PREW</contractType><contractState>a</contractState><productType>KDV</productType><bank>PB</bank><san>8110600036459995</san><channel>CONV</channel><updateSysDate>2014-09-30T19:50:29.000</updateSysDate></creditCardInfo><creditCardInfo><pan>2222221308284892</pan><dataUri>ua.pb.comp</dataUri><exDate>1250</exDate><cardName>Bonus plus</cardName><cardAlias>quot;</cardAlias><cardState>a</cardState><can>2222221308284892980</can><currency>980</currency><balance>101.820</balance><creditLimit>0.000</creditLimit><canState>3</canState><refContract>SAMDN30000030100231</refContract><contractType>BCRC</contractType><contractState>a</contractState><productType>BON</productType><bank>PB</bank><channel>CONV</channel></creditCardInfo><creditCardInfo><pan>22222269806083</pan><dataUri>ua.pb.comp</dataUri><exDate>1015</exDate><cardName>ACRPR VIRTUAL ACCOUNT</cardName><cardAlias>Страхование</cardAlias><cardState>a</cardState><can>22222269806083980</can><currency>980</currency><balance>0.000</balance><creditLimit>0.000</creditLimit><canState>3</canState><refContract>SAMDN11000146204979</refContract><contractType>STAS</contractType><contractState>a</contractState><productType>DEF</productType><bank>PB</bank><channel>samson</channel></creditCardInfo><creditCardInfo><pan>26254620842464</pan><dataUri>ua.pb.comp</dataUri><exDate>0916</exDate><cardName> Virtual account</cardName><cardAlias>Кредитка</cardAlias><cardState>a</cardState><can>26254620842464980</can><currency>980</currency><balance>14646.650</balance><creditLimit>15000.000</creditLimit><canState>3</canState><refContract>SAMDNWFC00009919269</refContract><contractType>CRPL</contractType><contractState>a</contractState><productType>KUN</productType><bank>PB</bank><channel>WAVE</channel><updateSysDate>2014-09-30T13:50:30.000</updateSysDate></creditCardInfo><creditCardInfo><pan>4731185600161738</pan><dataUri>ua.pb.comp</dataUri><exDate>1123</exDate><cardName>Internet card</cardName><cardAlias>Internet card</cardAlias><cardState>a</cardState><can>4731185600161738840</can><currency>840</currency><balance>1.450</balance><creditLimit>0.000</creditLimit><canState>3</canState><refContract>SAMDN11000123904256</refContract><contractType>PIWE</contractType><contractState>a</contractState><productType>DEF</productType><bank>PB</bank><san>8100810003835034</san><channel>samson</channel><updateSysDate>2013-11-25T15:39:13.000</updateSysDate></creditCardInfo><creditCardInfo><pan>5168755600094748</pan><dataUri>ua.pb.comp</dataUri><exDate>0918</exDate><cardName>Карта Универсальная</cardName><cardAlias>Кредитка универсальная GOLD Patriotic</cardAlias><cardState>a</cardState><can>26254620842464980</can><currency>980</currency><balance>14646.650</balance><creditLimit>15000.000</creditLimit><canState>3</canState><refContract>SAMDNWFC00009919269</refContract><contractType>CRPL</contractType><contractState>a</contractState><productType>KUN</productType><bank>PB</bank><san>8100355009108804</san><channel>samson</channel><updateSysDate>2014-10-27T16:12:46.000</updateSysDate></creditCardInfo><creditCardInfo><pan>4731185011239719</pan><dataUri>ua.pb.comp</dataUri><exDate>1120</exDate><cardName>Виртуальный счет Приват24</cardName><cardAlias>Виртуальный счет Приват24</cardAlias><cardState>a</cardState><can>4731185011239719840</can><currency>840</currency><balance>0.010</balance><creditLimit>0.000</creditLimit><canState>3</canState><refContract>SAMDN11000038396247</refContract><contractType>LIQP</contractType><contractState>a</contractState><productType>Cred</productType><bank>PB</bank><san>8100819009882767</san><channel>SVR</channel><updateSysDate>2014-04-28T16:45:39.000</updateSysDate></creditCardInfo></list>";

    public static void main(String[] args) throws Exception {

        //System.out.println(ans);
        DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
        DocumentBuilder b = f.newDocumentBuilder();
        Document doc = (Document) b.parse(new ByteArrayInputStream(xmlStr.getBytes("UTF-8")));
        NodeList books = doc.getElementsByTagName("book");
        for (int i = 0; i < books.getLength(); i++) {
            Element book = (Element) books.item(i);
            Node title = book.getElementsByTagName("title").item(0);
            System.out.println(title.getTextContent());
        }
    }
}
