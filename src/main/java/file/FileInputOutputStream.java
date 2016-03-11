package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Roman on 13.11.2015.
 */
public class FileInputOutputStream {
    public static void main(String[] args) {

        File file = new File("D:\\downloads\\NEGTEST.csv");
        try (FileInputStream fis = new FileInputStream(file)) {
            System.out.println("Total file size to read (in bytes) : "+ fis.available());
            int content;
            while ((content = fis.read()) != -1) {
                // convert to char and display it
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
