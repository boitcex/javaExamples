package dataBase.riak;

import com.basho.riak.client.api.RiakClient;
import com.basho.riak.client.api.cap.Quorum;
import com.basho.riak.client.api.commands.kv.StoreValue;
import com.basho.riak.client.core.query.Location;
import com.basho.riak.client.core.query.Namespace;
import com.basho.riak.client.core.query.RiakObject;
import com.basho.riak.client.core.util.BinaryValue;

import java.io.IOException;
import java.util.concurrent.ExecutionException;


public class TestRiak {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        int KEY_LEN=14;
        int VALUE_LEN=1000;
        RiakClient client = RiakClient.newClient(8087, "10.56.1.83", "10.56.1.201", "10.56.1.202", "10.56.0.53", "10.56.0.60");
        Namespace ns = new Namespace("default", "test");
        for (int i=0;i<100;i++) {
            byte[]  value=new byte[VALUE_LEN];
            byte[]  key=new byte[KEY_LEN];
            for (int j=0;j<VALUE_LEN;j++) {
                value[j]=(byte)((System.currentTimeMillis()+j+i*1000)&255);
            }
            key=Double.toString(Math.random()).getBytes("utf8");
            Location location = new Location(ns, BinaryValue.create(key));
            RiakObject riakObject = new RiakObject();
            riakObject.setValue(BinaryValue.create(value));
            StoreValue store = new StoreValue.Builder(riakObject).withLocation(location).withOption(StoreValue.Option.W, new Quorum(3)).build();
            client.execute(store);
        }
        client.shutdown();
    }
}
