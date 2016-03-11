package file;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * Created by Roman on 19.01.2016.
 */
public class Wr {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("D:\\works\\corezoid\\RES.txt", "UTF-8");
        writer.println("The first line");
        writer.println("The second line");
        writer.close();
    }
}
