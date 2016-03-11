package homeworkFile;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Roman on 11.11.2015.
 */
public class TreeOfPaskage {
    public static void main(String[] args) {
        TreeOfPaskage tree = new TreeOfPaskage();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path");
        String inPath = sc.nextLine();
        System.out.println("How many folders do you want?");
        int inCount = sc.nextInt();
        tree.createFile(inPath,inCount);

    }
    public void createFile(String pathToFile,int countFolders){
        for (int i = 1; i <= countFolders; i++) {
            File myPath = new File(pathToFile);
            myPath.mkdirs();
            pathToFile+="\\"+i;
                    }
        //System.out.println("File was created "+myPath.getAbsolutePath());
    }
}
