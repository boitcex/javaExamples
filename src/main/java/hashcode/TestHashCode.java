package hashcode;


public class TestHashCode {
    public static void main(String[] args) {
        String object1 = "Hello";
        String object2 = "Hello Roman";
        int hCode;
        hCode = object1.hashCode();
        System.out.println(hCode);
        hCode = object2.hashCode();
        System.out.println(hCode);
    }
}
