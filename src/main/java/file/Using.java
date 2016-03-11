package file;

import java.util.ArrayList;

/**
 * Created by Roman on 18.03.2015.
 */
public class Using {
    public static void main(String[] args) {

        ArrayList<String> list = ReadAndWriteFromFile.readFromFile("D:\\works\\training\\readTest.txt");
        //D:\\works\\PaysBPOnline\\PaysBPOnline\\tData\\ClientLinkData_TESTDATA.TXT
        for(String str : list){
            System.out.println(str);
        }
    }
}



