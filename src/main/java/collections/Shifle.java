package collections;

import file.ReadAndWriteFromFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Shifle {
    public static void main(String[] args) throws IOException {
        ArrayList list = ReadAndWriteFromFile.readFromFile("D:\\works\\AdressReference\\testdata\\2sts.txt");
        Collections.shuffle(list);
        ReadAndWriteFromFile.writeToFile(list, "D:\\downloads\\out.txt");
    }
}

