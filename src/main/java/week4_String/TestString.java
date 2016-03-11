package week4_String;

import java.util.StringTokenizer;

/**
 * Created by Roman on 16.12.2015.
 */
public class TestString {
    public static void main(String[] args) {

        String s = "Ваше звернення №0-8811872 успішно зареєстровано,";
        StringTokenizer st = new StringTokenizer(s, " \t\n\r,.");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken()) ;
        }
    }
}
