package random;

/**
 * Created by Roman on 12.01.2016.
 */
public class RandomDouble {
    public static void main(String[] args) {
        Double maxLat = 52.333333;
        Double minLat = 45.333333;
        Double maxLng = 41.250000;
        Double minLng = 22.083333;
        String lat = String.valueOf(Math.random() * ( maxLat - minLat )+minLat);
        String lng = String.valueOf(Math.random() * ( maxLng - minLng )+minLng);
        /*double newLat = new BigDecimal(lat).setScale(3, RoundingMode.UP).doubleValue();
        double newLng = new BigDecimal(lng).setScale(3, RoundingMode.UP).doubleValue();
        System.out.println(newLat);
        System.out.println(lat);*/
    }
}
