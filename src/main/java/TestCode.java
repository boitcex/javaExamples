import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Roman on 13.11.2015.
 */
public class TestCode {
    public static void main(String[] args) {
            List<String> urls = new ArrayList<String>(); // initialize array of URLs
    Collections.addAll(urls,args); // read URLs from "Parameters" input and add them to array
    ExecutorService pool = Executors.newFixedThreadPool(urls.size()); // initialize pool of Future Tasks with number of threads equal to size of URLs provided
    for (String url : urls) { // for each URL from list
        final String currentURL = url;
        pool.submit(new Runnable() { // Sumbit a new thread which will execute GET request

            @Override
            public void run() {
                try {
                    DefaultHttpClient client = new DefaultHttpClient(); // Use Apache Commons HTTPClient to perform GET request
                    HttpGet get = new HttpGet(currentURL);
                    HttpResponse response = client.execute(get);
                    HttpEntity entity = response.getEntity();
                    EntityUtils.consume(entity);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });
    }
    pool.shutdown(); // shut down thread pool
}
}