package dataBase.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.UUID;

public class Redis {
    public static void main(String[] args) {
    Redis riak = new Redis();
        //String ans = riak.setex("1",60,"gfgfgdfgdfg");
        /*String ans = riak.setexPool("1",60,"gfgfgdfgdfg");
        System.out.println(ans);*/
    }
    public String setex(String key,int timeLiveKey,String value){
        Jedis jedis = new Jedis("10.56.0.84", 6379, 20000);
        jedis.auth("86ED54wsE12aZ09U7REjf674tRe34HHffeo");
        String answer = jedis.setex(key, timeLiveKey,value);
        jedis.quit();
        jedis.close();
        return answer;
    }

    public String setexPool(String key,int timeLiveKey,String value) {
        String count = "";
        JedisPool pool = new JedisPool(new JedisPoolConfig(),"10.56.1.83", 6379, 5000,"LRowzZaDEPQlBkaHerrKXynlWdGgQeCF");
        Jedis jedis = pool.getResource();
        for (int i=1; i<=2; i++){
            String uniqueID = UUID.randomUUID().toString();
            String answer = jedis.setex(uniqueID, 180, value+i);
            if (answer.equals("OK")){
                count="OK";
            }else {
                count="Errors";
                throw new Error("Set not added!!");

            }
        }

        jedis.quit();
        pool.destroy();

        return count;
    }
}
