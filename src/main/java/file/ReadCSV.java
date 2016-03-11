package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by Roman on 06.11.2015.
 */
public class ReadCSV {
    public static void main(String[] args) {
        ArrayList<String> list = ReadAndWriteFromFile.readFromFile("D:\\downloads\\testClient.TXT");
        for (int i = 0; i < list.size() ; i++) {
            System.out.println((i+1)+";"+list.get(i));

        }
    }

    public static ArrayList readFromFile(String file) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            FileReader inputFile = new FileReader(file);
            BufferedReader bufferReader = new BufferedReader(inputFile);
            String line;
            while ((line = bufferReader.readLine()) != null) {
                list.add(line);
            }
            bufferReader.close();
        } catch (Exception e) {
            System.out.println("Error while reading file line by line:" + e.getMessage());
        }
        return list;
    }
}
