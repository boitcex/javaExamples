import java.util.Random;

/**
 * Created by Roman on 13.10.2015.
 */
public class RandomValue {

    public static void main(String[] args) {
        System.out.println(random(1,10));
        int i = random(1,10);

        System.out.println("fgfdgdfgdf"+i);

    }
    public static int random(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }



}
