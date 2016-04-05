package dataBase.kioto;


import kt4j.binary.KyotoTycoonBinaryClient;
import java.io.UnsupportedEncodingException;

public class KiotoPool {
    public static void main(String[] args) throws UnsupportedEncodingException {
        int KEY_LEN=14;
        int VALUE_LEN=1000;
        KyotoTycoonBinaryClient client=new KyotoTycoonBinaryClient("10.56.1.83",1978);
        client.setDatabase("", 0);
        client.start();
        for (int i=0;i<1000;i++) {
            byte[]  value=new byte[VALUE_LEN];
            byte[]  key=new byte[KEY_LEN];
            for (int j=0;j<VALUE_LEN;j++) {
                value[j]=(byte)((System.currentTimeMillis()+j+i*1000)&255);
            }
            key=Double.toString(Math.random()).getBytes("utf8");
            client.set(key, value);
        }
        client.stop();
    }
}
