package parse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ParseJson {
    public static void main(String[] args) {
        String responseFirst = "{\"purseId\":19683270,\"ekbId\":20508385,\"phone\":\"+380661325364\",\"inn\":\"3285005173\",\"fio\":\"Войцешевский Роман Владимирович\"}";

        JSONObject jsonObject;
        try{jsonObject = new JSONObject(responseFirst);}
        catch (JSONException e){
            responseFirst = "{\"text\":"+responseFirst+"}";
            jsonObject = new JSONObject(responseFirst);
        }

        TestJson testJson = new TestJson();
        testJson.getElements(jsonObject);

        for(String str : testJson.getList()){
            System.out.println(str);
        }
    }

    public static class TestJson{

        List<String> arrayList = new ArrayList<String>();
        //List<String> listNotCheck = new ArrayList<String>();
        String stopWords = "fio,inn";
        List<String> listStopWords = new LinkedList<String>(Arrays.asList(stopWords.split(",")));



        public void getElements(JSONObject jsonObject){
            JSONArray jsonArray = jsonObject.names();
            //System.out.println(jsonArray.toString());
                        if(jsonArray != null){
                for(int i = 0;i<jsonArray.length();i++){
                    Object object = jsonObject.get(jsonArray.getString(i));
                    if(object instanceof JSONObject){
                        getElements((JSONObject)object);
                    }else if(object instanceof JSONArray){
                        workWithJSONArray((JSONArray)object);
                    }else {

                            if (!listStopWords.contains(jsonArray.optString(i)))
                                arrayList.add("\"" + jsonArray.optString(i) + "\":\"" + object + "\"");

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
        public List<String> getList(){
            return this.arrayList;
        }

    }
}
