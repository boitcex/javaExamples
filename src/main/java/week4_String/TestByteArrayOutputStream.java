package week4_String;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by Roman on 16.12.2015.
 */
public class TestByteArrayOutputStream {
    public static void main(String[] args) throws IOException {
        int i;
        ByteArrayOutputStream fo = new ByteArrayOutputStream(12);
        System.out.println("Enter 10 characters and Enter");
        while (fo.size() != 10){
            fo.write(System.in.read());
            System.out.println("Buffer as a string");
            System.out.println(fo.toString());
            System.out.println ("Into array");

            byte b[] = fo.toByteArray();
            for (i=0; i < b.length; i++)     {
                System.out.print((char) b[i]);
            }

        }
    }
}
