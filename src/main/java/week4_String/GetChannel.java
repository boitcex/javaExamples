package week4_String;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Roman on 16.12.2015.
 */
public class GetChannel {
    private static final int BSIZE = 1024;


    public static void main(String[] args) throws Exception {
        String pathToFile = "D:\\downloads\\data.txt";
        //Write in file
        FileChannel fc =new FileOutputStream(pathToFile).getChannel();
        fc.write(ByteBuffer.wrap("Hello Roma".getBytes()));
        fc.close();
        //Add in end of file
        fc = new RandomAccessFile(pathToFile,"rw").getChannel();
        fc.position(fc.size());//Go to end
        fc.write (ByteBuffer.wrap (" Some more".getBytes()));
        fc.close();
        // Read file
        fc = new FileInputStream(pathToFile).getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();
        while(buff.hasRemaining()){
            System.out.println((char)buff.get());
        }

    }
}
