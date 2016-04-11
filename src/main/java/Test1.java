/**
 * Created by Roman on 08.04.2016.
 */
public class Test1 {
    public static void main(String[] args) {
        String str = "[{Hello}]".substring(1,"[{Hello}]".length()-1);
        System.out.println(str);
    }
}
