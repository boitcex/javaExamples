package collections;

import java.util.*;

public class RandomFromArrayList {
    public static void main(String[] args) {
        List<String> col = (List<String>) new ArrayList<String>();
        col.add("REP_CLID");
        col.add("REP_AGE_DAILY");
        col.add("FL_DEATH");
        col.add("FL_LOST_PASSP");
        col.add("FL_PROS_90");
        col.add("FL_PROS_90_UP ");
        col.add("FL_PASSP_COPY");
        col.add("FL_PASSP_COPY_25");
        col.add("FL_MOBILIZATION");
        col.add("FL_CR_DEPOS_3M");
        col.add("FL_DB_B_ACC_3M");
        col.add("FL_P24_MY_DEPOS");
        col.add("FL_MOB_MY_DEPOS");
        col.add("FL_BANKRUPT");
        col.add("FL_PAN_GOLD");

        RandomFromArrayList rand = new RandomFromArrayList();
        int numbOfParam = 10;
        String result = rand.chooseRand(col, numbOfParam);
        System.out.println(result);
        //System.out.println(col.toString());

    }


    public String chooseRand(List collection, int numbOfParam) {
        HashSet<Object> colOut = new HashSet();
        Random random = new Random();
        while (colOut.size() != numbOfParam) {
            int index = random.nextInt(collection.size());
            colOut.add(collection.get(index));
        }
        Iterator iterator = colOut.iterator();
        String result ="";
        for (int i = 0; i <= numbOfParam; i++) {
            if (i <= numbOfParam) {
                while (iterator.hasNext()) {
                    result += iterator.next() + ",";
                }
            } else {
                result += iterator.next();
            }

        }

        return result.substring(0,result.length()-1);
    }


}
