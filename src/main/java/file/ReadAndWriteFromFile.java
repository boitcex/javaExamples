package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Roman on 18.03.2015.
 */
public class ReadAndWriteFromFile {
    public static ArrayList readFromFile(String file) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            //Create object of FileReader
            FileReader inputFile = new FileReader(file);
            //Instantiate the BufferedReader Class
            BufferedReader bufferReader = new BufferedReader(inputFile);
            //Variable to hold the one line data
            String line;
            // Read file line by line and print on the console
            while ((line = bufferReader.readLine()) != null) {
                list.add(line);
            }
            //Close the buffer reader
            bufferReader.close();
        } catch (Exception e) {
            System.out.println("Error while reading file line by line:" + e.getMessage());
        }
        return list;


    }

    public static void writeToFile(ArrayList<String> writeList, String file) throws IOException {
        FileWriter sw = new FileWriter(file);
        for (String val : writeList) {
            sw.write(val + "\n");
        }
        sw.close();
    }
}
