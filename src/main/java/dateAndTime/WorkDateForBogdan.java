package dateAndTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Roman on 05.02.2016.
 */
public class WorkDateForBogdan {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Calendar cal = Calendar.getInstance();

        String curDate = dateFormat.format(cal.getTime());
        System.out.println(curDate);

        cal.add(Calendar.DATE,1);
        String newDate = dateFormat.format(cal.getTime());
        System.out.println(newDate);



    }
}
