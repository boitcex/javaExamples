package cancul;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Roman on 02.11.2015.
 */
public class CalcMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value:");
        int n1 = sc.nextInt();
        System.out.println("Enter operation:");
        String op = sc.next();
        System.out.println("Enter second value:");
        int n2 = sc.nextInt();
        sc.close();
        System.out.println("Result: "+ OperationsFactory.detectOperation(op).execute(n1, n2));

    }
    public static boolean checkWithRegExp(String userNameString){
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }

}
