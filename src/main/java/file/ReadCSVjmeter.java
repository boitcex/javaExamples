package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Roman on 06.11.2015.
 */
public class ReadCSVjmeter {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        FileReader inputFile = new FileReader("D:\\downloads\\testClient.TXT");
        BufferedReader bufferReader = new BufferedReader(inputFile);
        String line;
        while ((line = bufferReader.readLine()) != null) {list.add(line);}
        bufferReader.close();
        for (int i = 0; i < list.size() ; i++) {System.out.println((i + 1)+";"+ list.get(i));}
    }

}
