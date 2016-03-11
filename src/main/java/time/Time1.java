package time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Roman on 27.10.2015.
 */
public class Time1 {
    public static void main(String[] args) {
        //String testtime="1";
        Date date = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("yyMMdd");
        String curDate = format1.format(date);
        System.out.println(curDate);
    }

}
