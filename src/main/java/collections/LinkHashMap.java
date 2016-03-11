package collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHashMap {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
        linkedHashMap.put("Roman",26);
        linkedHashMap.put("Bohdan",26);
        linkedHashMap.put("Alex",28);
        linkedHashMap.put("Igor",24);
        linkedHashMap.put("Rita",29);


        Iterator<Map.Entry<String, Integer>> itr1 = linkedHashMap.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry<String, Integer> entry = itr1.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

}
