package dataBase.kioto;

import kt4j.binary.KyotoTycoonBinaryClient;

/**
 * Created by Roman on 01.04.2016.
 */
public class Kioto {
  public static void main(String[] args) {
      int KEY_LEN = 14;
      int VALUE_LEN = 1000;
      KyotoTycoonBinaryClient client = new KyotoTycoonBinaryClient("10.56.1.83", 1978);
      client.setDatabase("", 0);
      client.start();
      long curTime = System.currentTimeMillis();
      for (int i = 0; i < 1000; i++) {
          byte[] value = new byte[VALUE_LEN];
          byte[] key = new byte[KEY_LEN];
          for (int j = 0; j < VALUE_LEN; j++) {
              value[j] = (byte) ((System.currentTimeMillis() + j + i * 1000) & 255);
          }
          for (int j = 0; j < KEY_LEN; j++) {
              key[j] = (byte) ((System.currentTimeMillis() + j + i * 1000) & 255);
          }
          client.set(key, value);
      }
      System.out.println(System.currentTimeMillis() - curTime);
      curTime = System.currentTimeMillis();
      client.stop();
  }
}
