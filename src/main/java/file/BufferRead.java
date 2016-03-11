package file;

import java.io.*;

public class BufferRead {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("D:\\works\\Справочник адресов\\tGASFixedAttrs5.txt")));
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("D:\\works\\Справочник адресов\\tGASFixedAttrs6.txt"), true));
        String read = "";
        int start = 3679340;
        int end =18926145;
        for (int j = 0; j < start; j++){
            br.readLine();
        }


        for (int i= start;i < end; i++){
            read = br.readLine();
            bw.write(read+"\n");
            bw.flush();
        }
        bw.close();
        br.close();
        System.out.println("Finished");
}

   }
