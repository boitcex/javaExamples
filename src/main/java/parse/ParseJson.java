package parse;

import org.json.simple.parser.ParseException;

import java.io.UnsupportedEncodingException;

public class ParseJson {
    public static void main(String[] args) throws ParseException, UnsupportedEncodingException {
        String fgfdgf = new String("ghghgfhgfh".getBytes(),"utf-8");
        System.out.println(fgfdgf);
       /* String jsontext = "{\"message\":null,\"response_code\":\"PC0000\",\"data\":[{\"pan\":\"\",\"datauri\":\"ua.ab.auth\",\"exdate\":\"1299\",\"card_name\":\"UNKNOWN\",\"card_alias\":null,\"card_state\":\"A\",\"can\":\"88031600025763980\",\"currency\":\"980\",\"balance\":0,\"credit_limit\":\"0\",\"can_state\":\"3\",\"refcontract\":\"SAMAB01000001220019\",\"contract_type\":\"SHTR\",\"contract_state\":\"a\",\"product_type\":\"BAD\",\"bank\":\"AB\",\"san\":null,\"channel\":\"SVR\",\"updatesysdate\":\"2013-06-04 10:38:22\"},{\"pan\":\"5168755386092965\",\"datauri\":\"ua.pb.comp\",\"exdate\":\"0118\",\"card_name\":\"PKMMU UNEMBOSSED CREDIT 1-4% FIRST PIN\",\"card_alias\":null,\"card_state\":\"1\",\"can\":\"5168755386092965980\",\"currency\":\"980\",\"balance\":0,\"credit_limit\":\"0\",\"can_state\":\"3\",\"refcontract\":\"SAMDNWFC00002536077\",\"contract_type\":\"CRPL\",\"contract_state\":\"a\",\"product_type\":\"KUN\",\"bank\":\"PB\",\"san\":\"8100300114688639\",\"channel\":\"WAVE\",\"updatesysdate\":\"2015-06-05 12:33:49\"},{\"pan\":\"2222225376192614\",\"datauri\":\"ua.pb.comp\",\"exdate\":\"1250\",\"card_name\":\"Bonus plus\",\"card_alias\":\"Bonus plus\",\"card_state\":\"1\",\"can\":\"2222225376192614980\",\"currency\":\"980\",\"balance\":0,\"credit_limit\":\"0\",\"can_state\":\"3\",\"refcontract\":\"SAMDN30000143063379\",\"contract_type\":\"BCRC\",\"contract_state\":\"a\",\"product_type\":\"BON\",\"bank\":\"PB\",\"san\":null,\"channel\":\"samson\",\"updatesysdate\":\"2015-06-05 12:33:49\"},{\"pan\":\"5168757241399312\",\"datauri\":\"ua.pb.comp\",\"exdate\":\"0917\",\"card_name\":\"Зарплатная карта для выплат\",\"card_alias\":\"Карта для выплат\",\"card_state\":\"1\",\"can\":\"5168757241399312980\",\"currency\":\"980\",\"balance\":-3941.79,\"credit_limit\":\"0\",\"can_state\":\"3\",\"refcontract\":\"SAMDNFF000132800190\",\"contract_type\":\"PRKV\",\"contract_state\":\"a\",\"product_type\":\"KDV\",\"bank\":\"PB\",\"san\":\"8100361046168421\",\"channel\":\"samson\",\"updatesysdate\":\"2015-06-05 12:33:49\"},{\"pan\":\"26350609219826\",\"datauri\":\"ua.pb.auth\",\"exdate\":\"1299\",\"card_name\":\"ACRPR VIRTUAL ACCOUNT\",\"card_alias\":\"Накопительный на 12 мес.\",\"card_state\":\"R\",\"can\":\"26350609219826980\",\"currency\":\"980\",\"balance\":1281.7,\"credit_limit\":\"0\",\"can_state\":\"3\",\"refcontract\":\"SAMDN27000716174492\",\"contract_type\":\"KOPP\",\"contract_state\":\"a\",\"product_type\":\"KPLK\",\"bank\":\"PB\",\"san\":null,\"channel\":\"WAVE\",\"updatesysdate\":\"2011-05-03 10:11:28\"},{\"pan\":\"4323365310008700\",\"datauri\":\"ua.ab.comp\",\"exdate\":\"0413\",\"card_name\":\"ABNK PKMVE ELECTRON CREDIT 1-4% FIRST PI\",\"card_alias\":\"CREDIT 1-4% FIRST PIN\",\"card_state\":\"1\",\"can\":\"4323365310008700980\",\"currency\":\"980\",\"balance\":-1798.6,\"credit_limit\":\"2000\",\"can_state\":\"3\",\"refcontract\":\"SAMAB00000000360641\",\"contract_type\":\"CRC3\",\"contract_state\":\"a\",\"product_type\":\"KUN\",\"bank\":\"AB\",\"san\":null,\"channel\":\"WAVE\",\"updatesysdate\":\"2015-06-05 12:33:49\"}]}";
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(jsontext);
        JSONObject jsonObj = (JSONObject) obj;
        Object code = jsonObj.get("response_code");
        JSONArray data = (JSONArray) jsonObj.get("data");

        /*//**************************************************
        for (Object elem : data) {
            JSONObject jsonObject = (JSONObject) elem;

            if (jsonObject.get("pan")== null || jsonObject.get("pan").equals("")) {
                System.out.println("Error in pan");
            }else {
                System.out.println("pan is "+jsonObject.get("pan"));

        }


    }*/
}}
