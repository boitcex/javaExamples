package dateAndTime;

import java.text.SimpleDateFormat;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatData = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        long millis = date.getTime();
        long date1 = millis - 60000;
        long date2 = millis + 60000;
        String dtFrom = formatData.format(date1);
        String dtTo = formatData.format(date2);
        String time1 = formatData.format(millis);
        System.out.println(dtFrom);
        System.out.println(time1);
        System.out.println(dtTo);

    }

}