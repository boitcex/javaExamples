package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Roman on 18.02.2016.
 */
public class StringToInt {
    public static void main(String[] args) {
        String str = "139 234 грн.";
        System.out.println(workWithRegex(str,"[0-9]+"));

    }
    public static int workWithRegex(String line,String regex){
        String ans = "";
        Pattern r = Pattern.compile(regex);
        Matcher m = r.matcher(line);
        while (m.find()){ans += m.group(0);}
        return Integer.parseInt(ans);
    }
}
