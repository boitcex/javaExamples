package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Scaner {
    public static void main(String[] args) {
        File file = new File("D:\\works\\PanDataProcessing\\tData\\ACC_for_test_PanDataProcessing_CMP_DN00.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String i = sc.nextLine();
                System.out.println(i);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
