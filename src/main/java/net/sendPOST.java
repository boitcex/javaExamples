package net;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


public class sendPOST {
    public static void main(String[] args) throws IOException {
        HttpClient client = new DefaultHttpClient(); // Use Apache Commons HTTPClient to perform GET request
        HttpPost post = new HttpPost("http://  vm-sdo-app5.sdo.it.loc//prometeus/close/students/LadCamp/ViewTimetable.aspx");

        post.setHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        post.setHeader("Accept-Encoding", "gzip, deflat");
        post.setHeader("Accept-Language", "en-US,en;q=0.5");
        post.setHeader("Cache-Control", "no-cache");
        post.setHeader("Connection", "keep-alive");
        post.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8Host:vm-sdo-app5.sdo.it.loc");
        post.setHeader("Pragma", "no-cache");
        post.setHeader("Referer", "http://vm-sdo-app5.sdo.it.loc/prometeus/close/students/ladCamp/ViewTimetable.aspx?lang=UA");
        post.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; rv:42.0) Gecko/20100101 Firefox/42.0");
        post.setHeader("Host", "vm-sdo-app5.sdo.it.loc");

        String body = "__EVENTTARGET=ctl00_cphBody_btnFinishPractic&ctl00%24cphBody%24btnFinishPractic=%D0%97%D0%B1%D0%B5%D1%80%D0%B5%D0%B3%D1%82%D0%B8&ctl00%24cphBody%24hfNpsBall=5&ctl00%24cphBody%24tbNpsDescr=test"; // Body of request
        HttpEntity entity = new ByteArrayEntity(body.getBytes("UTF-8"));
        post.setEntity(entity); // Add Body
        HttpResponse response = client.execute(post);
        String result = EntityUtils.toString(response.getEntity());
        int code = response.getStatusLine().getStatusCode();  // 200, 404 и т.д.
        System.out.println("code : " + code);
        System.out.println("It's result "+result);
        System.out.println("***********************************");
        if (code != 200){
            System.err.println("Response code "+code);

        }
        EntityUtils.consume(entity);

    }
}
