package collections;

import java.util.HashMap;
import java.util.Map;

public class WorkHashMap
{
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Roman",26);
        hashMap.put("Bohdan",26);
        hashMap.put("Alex",28);
        hashMap.put("Igor",24);
        hashMap.put("Rita",29);

            System.out.println(hashMap.get("Roman"));

        for (Map.Entry entry : hashMap.entrySet()){
            String key = entry.getKey().toString();
            String value =  entry.getValue().toString();
            System.out.println(key + " to " + value);
        }


    }


}
