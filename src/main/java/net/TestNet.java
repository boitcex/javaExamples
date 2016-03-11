package net;


import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Roman on 14.12.2015.
 */
public class TestNet {
    public static void main(String[] args) throws Exception {
        //System.out.println(sendGET("https://www.google.com.ua/"));

    }
    public static StringBuilder sendGET(String url) throws Exception {
        URLConnection connection = new URL(url).openConnection();
        InputStream is = connection.getInputStream();
        InputStreamReader reader = new InputStreamReader(is,"windows-1251");
        char[] buffer = new char[256];
        int rc;
        StringBuilder sb = new StringBuilder();
        while ((rc = reader.read(buffer)) != -1){
            sb.append(buffer,0,rc);
        }
        reader.close();
        return sb;
    }
   }
