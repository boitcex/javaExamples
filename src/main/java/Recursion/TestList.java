package Recursion;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class TestList {
    static List<String> arrayList = new ArrayList<String>();

    public static void main(String[] args){

        String input = "{\"Ref\":\"12345678\",\"State\":\"y\",\"ExtId\":\"testextid\",\"CardPan\":\"5584242210669181\",\"BaseAccount\":{\"MinPay\":0.00,\"MinPaySM\":0.00},\"BonusPlus\":{\"Ref\":\"12345678\"}}";
        JSONObject jsonObject = new JSONObject(input);
        TestList testList = new TestList();
        testList.getElements(jsonObject);
        for(String str : testList.arrayList){
            System.out.println(str);
        }
    }
    public void getElements(JSONObject jsonObject){
        JSONArray jsonArray = jsonObject.names();
        if(jsonArray != null){
            for(int i = 0;i<jsonArray.length();i++){
                Object object = jsonObject.get(jsonArray.getString(i));
                if(object instanceof JSONObject){
                    getElements((JSONObject)object);
                }else if(object instanceof JSONArray){
                    workWithJSONArray((JSONArray)object);
                }else {
                    arrayList.add("\""+jsonArray.optString(i)+"\":\""+object+"\"");
                }
            }
        }
    }
    public boolean isJSONObject(Object object){
        if(object instanceof JSONObject){
            return true;
        }else {
            return false;
        }
    }
    public boolean isJSONArray(Object object){
        if(object instanceof JSONArray){
            return true;
        }else {
            return false;
        }
    }
    public void workWithJSONArray(JSONArray jsonArray){
        for (int i = 0;i<jsonArray.length();i++){
            if(isJSONObject(jsonArray.get(i))){
                getElements((JSONObject) jsonArray.get(i));
            }else if (isJSONArray(jsonArray.get(i))){
                workWithJSONArray((JSONArray) jsonArray.get(i));
            };
        }
    }
}
