package asserts;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Roman on 16.11.2015.
 */
public class ChooseFromSomeVariants {


    public static void main(String[] args) {
        //ArrayList<Integer> numbers= new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        //Map<Integer, Integer> maps = new LinkedHashMap<>();


        for (int i = 1; i <= 100000; i++) {
            if (i % 10000 == 0 || i == 1) {
                //System.out.println(i);
                hm.put(i, i + 10000);
                //numbers.add(i);
            }
        }

        for (Map.Entry entry : hm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
            int st = (int) entry.getKey();
            int fn = (int) entry.getValue();



        }
        //numbers.add(1);
    }
}
