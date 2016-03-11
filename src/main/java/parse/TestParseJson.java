package parse;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestParseJson {
    public static void main(String[] args) throws ParseException {
        String ans1 = "{\"Ref\":\"111111111\",\"State\":\"y\",\"ExtId\":\"testextid\",\"CardPan\":\"111111111111111111\"," +
                "\"BaseAccount\":{\"FullRemain\":252.42,\"Overdraft\":0.00,\"Currency\":980,\"Remain\":52.42," +
                "\"Avail\":202.42,\"MinPay\":0.00,\"MinPaySM\":0.00,\"AccNumber\":\"1111111111111111\"," +
                "\"CreditLimit\":25000.00},\"BonusPlus\":{\"Currency\":80,\"BonusSumm\":14.71}}";

        String ans2 = "{\"Ref\":\"111111111\",\"State\":\"n\",\"ExtId\":\"testextid\",\"CardPan\":\"111111111111111111\"," +
                "\"BaseAccount\":{\"FullRemain\":252.42,\"Overdraft\":0.00,\"Currency\":980,\"Remain\":52.42," +
                "\"Avail\":202.42,\"MinPay\":0.00,\"MinPaySM\":0.00,\"AccNumber\":\"1111111111111111\"," +
                "\"CreditLimit\":25000.00},\"BonusPlus\":{\"Currency\":80,\"BonusSumm\":14.71}}";

        //parseJson(ans1);
        //parseJson(ans2);
        compare( parseJson(ans1),parseJson(ans2));

    }
    public static LinkedHashMap parseJson(String json) throws ParseException {
        JSONParser parser = new JSONParser();

            java.lang.Object obj = parser.parse(json);
            JSONObject jsonObject = (JSONObject) obj;

            String ref = (String) jsonObject.get("Ref");
            String state = (String) jsonObject.get("State");
            String extId = (String) jsonObject.get("ExtId");
            String cardPan = (String) jsonObject.get("CardPan");

            JSONObject structure = (JSONObject) jsonObject.get("BaseAccount");
            String fullRemain = String.valueOf(structure.get("FullRemain"));
            String overdraft = String.valueOf(structure.get("Overdraft"));
            String currency = String.valueOf(structure.get("Currency"));
            String remain = String.valueOf(structure.get("Remain"));
            String avail = String.valueOf(structure.get("Avail"));
            String minPay = String.valueOf(structure.get("MinPay"));
            String minPaySM = String.valueOf(structure.get("MinPaySM"));
            String accNumber = String.valueOf(structure.get("AccNumber"));
            String creditLimit = String.valueOf(structure.get("CreditLimit"));

            JSONObject structure2 = (JSONObject) jsonObject.get("BonusPlus");
            String currencyBonus = String.valueOf(structure2.get("Currency"));
            String bonusSumm = String.valueOf(structure2.get("BonusSumm"));

            Map<String, Object> hashMap = new LinkedHashMap<>();
            hashMap.put("FullRemain",fullRemain);
            hashMap.put("Ref",ref);
            hashMap.put("State",state);
            hashMap.put("ExtId",extId);
            hashMap.put("CardPan",cardPan);

            hashMap.put("Overdraft",overdraft);
            hashMap.put("Currency",currency);
            hashMap.put("Remain",remain);
            hashMap.put("Avail",avail);
            hashMap.put("MinPay",minPay);
            hashMap.put("MinPaySM",minPaySM);
            hashMap.put("AccNumber",accNumber);
            hashMap.put("CreditLimit",creditLimit);

            hashMap.put("CurrencyBonus",currencyBonus);
            hashMap.put("BonusSumm",bonusSumm);



            /*for (Map.Entry entry : hashMap.entrySet()){
                String key = entry.getKey().toString();
                String value =  entry.getValue().toString();
                System.out.println(key + " to " + value);
            }*/
        return (LinkedHashMap) hashMap;
    }

    public static void compare(LinkedHashMap json1,LinkedHashMap json2){
        Iterator<Map.Entry<String, Integer>> itr1 = json1.entrySet().iterator();
        Iterator<Map.Entry<String, Integer>> itr2 = json2.entrySet().iterator();

        while (itr1.hasNext()) {
            Map.Entry<String, Integer> entry1 = itr1.next();
            Map.Entry<String, Integer> entry2 = itr2.next();

            String value1 = String.valueOf(entry1.getValue());
            String value2 = String.valueOf(entry2.getValue());
            String key1 = String.valueOf(entry1.getKey());
            String key2 = String.valueOf(entry2.getKey());

            if(!value1.equals(value2)){
                System.out.println(key1+" : "+value1+" != "+key2+" : "+value2);
            }
            //System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }

    }




