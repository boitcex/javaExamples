package courses;

/**
 * Created by Roman on 21.10.2015.
 */
public class Continue {

    public static void main(String args[]) {
        err:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println("");
                    continue err;
                }
                System.out.print(" " + (i * j));
            }
        }
    }
}
