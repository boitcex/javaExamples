package dateAndTime;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * Created by Roman on 02.06.2015.
 */
public class UnixToBasicDate {
    public static void main(String a[])
    {
        //String epochString = "1432799383";
        //long epoch = Long.parseLong( epochString );
        long epoch = 1432799383;
        Date expiry = new Date( epoch * 1000 );
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.sss");
        String dateText = df2.format(expiry);
        System.out.println(dateText);
    }
}
