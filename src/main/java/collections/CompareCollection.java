package collections;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class CompareCollection {

    public static void main(String[] args) {
        ArrayList<String> listFirst = new ArrayList<String>();
        CompareCollection compareCollection = new CompareCollection();

        listFirst.add("apple");
        listFirst.add("orange");
        listFirst.add("orange2");

        ArrayList<String> listSecond = new ArrayList<String>();
        listSecond.add("apple");
        listSecond.add("orange");
        listSecond.add("banana");
        listSecond.add("strawberry");
        compareCollection.getCompareArrayList().compare(listFirst,listSecond,"DN");
        compareCollection.getCompareArrayList().compare(listSecond,listFirst,"KV");


    }
    public CompareArrayList getCompareArrayList(){
        return new CompareArrayList();
    }




    class CompareArrayList {


        public void writeErrorToFile(String error) {
            File file = new File("D:\\works\\test\\errors.txt");
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
                bw.write(error);
                bw.flush();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        public void compare(ArrayList<String> list1,ArrayList<String> list2,String nameCompared){
            StringBuilder res = new StringBuilder(nameCompared+": ");
            ArrayList<String> newList1 = (ArrayList) list1.clone();
            ArrayList<String> newList2 = (ArrayList) list2.clone();
            for (String str2 : newList2){
                newList1.remove(str2);
            }

            if(newList1.size()!=0){
                for(String str : newList1) {

                    res.append(str+";");
                }
            System.out.println(res);
                //writeErrorToFile(res+"\n");
            }
        }

    }
}
