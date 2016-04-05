package week4_String;

/**
 * Created by Roman on 11.03.2016.
 */
public class StringBilderTest {

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            s.append("<id>"+i+"</id>\n");

        }
        System.out.println(s);

        //System.out.println(s);
    }
}
