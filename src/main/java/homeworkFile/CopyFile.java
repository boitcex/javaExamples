package homeworkFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by Roman on 11.11.2015.
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        copyTwoParametr("D:\\test\\st.csv","D:\\test\\fn.csv");

    }

    private static void myLogging(String str) {
        final Logger log = Logger.getLogger(CopyFile.class.getName());
        log.info(str);
    }

    public static void copyTwoParametr(String from, String to) throws IOException {
        myLogging("Start copy(case 1)......");
        File firstFile = new File(from);
        File secondFile = new File(to);
        FileInputStream start = new FileInputStream(firstFile);
        FileOutputStream finish = new FileOutputStream(secondFile);
            int lenght;
            while ((lenght = start.read()) != -1) {
                finish.write(lenght);
            }
        System.out.println("Copy from "+firstFile.getAbsolutePath()+" to "+secondFile.getAbsolutePath());
        }
    }
