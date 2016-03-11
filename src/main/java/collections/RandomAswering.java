package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Roman on 23.11.2015.
 */
public class RandomAswering {
    public static void main(String[] args) {
        List<String> col = new ArrayList<String>();
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

        Random random = new Random();
        int index = random.nextInt(col.size());
        String randomValue = col.get(index);
        System.out.println(randomValue);
    }
}
