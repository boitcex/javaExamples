package dateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WorkWithData {

    public static void main(String[] args) throws ParseException {
        String dt = "2014-12-29 07:16:57.000";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        //SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(dt));
        c.add(Calendar.DATE, 1);  //добавили 1 день
        //c.add(Calendar.YEAR, 1);  //добавили 1 месяц
        dt = sdf.format(c.getTime());
        System.out.println(dt);

        Calendar c2 = Calendar.getInstance();
        c2.setTime(sdf.parse(dt));
        c2.add(Calendar.DATE, -2);
        String dt2 = sdf.format(c2.getTime());
        System.out.println(dt2);
    }
}