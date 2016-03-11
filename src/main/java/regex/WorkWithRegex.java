package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Roman on 12.02.2016.
 */
public class WorkWithRegex {
    public static void main(String args[]) {
        String line = "Acura\n87";
        String pattern = "(\\w+)";
        System.out.print(workWithRegex(line,pattern));
        System.out.print(workWithRegex(line,pattern));
    }
    public static String workWithRegex(String line,String regex){
        String ans = "";
        Pattern r = Pattern.compile(regex);
        Matcher m = r.matcher(line);
        if (m.find()){ans = m.group(1);}
        return ans;
    }

}
