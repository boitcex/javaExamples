package dateAndTime;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Roman on 02.06.2015.
 */
public class Time {
    public static void main(String[] args) {
        //Date date = new Date();
        SimpleDateFormat formatData = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");

        long epoch = 1432885989;
        Date exp = new Date( epoch * 1000 );
        long millis = epoch * 1000;
        long date1 = millis - 60000;
        long date2 = millis + 60000;
        String dtFrom = formatData.format(date1);
        String dtTo = formatData.format(date2);
        String time1 = formatData.format(millis);
        //System.out.println(dtFrom);
        //System.out.println(dtTo);
        System.out.println(time1);


    }
}
