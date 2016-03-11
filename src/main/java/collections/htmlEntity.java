package collections;

public class htmlEntity {
    public static void main(String[] args) {
        String link = "/click/shop?shop_id=52&amp;offer_model=Ariston+ABS+PRO+R+80V+SLIM&amp;product_id=361485&amp;product_name=Ariston+ABS+PRO+ECO+80+V+Slim&amp;product_category=%D0%91%D0%BE%D0%B9%D0%BB%D0%B5%D1%80%D1%8B%2C+%D0%BA%D0%BE%D0%BB%D0%BE%D0%BD%D0%BA%D0%B8%2C+%D0%B2%D0%BE%D0%B4%D0%BE%D0%BD%D0%B0%D0%B3%D1%80%D0%B5%D0%B2%D0%B0%D1%82%D0%B5%D0%BB%D0%B8&amp;product_category_id=1277&amp;click_price=1.8";
        String escaped = link.replace("&amp;", "&");
        //String source = "The less than sign (<) and ampersand (&) must be escaped before using them in HTML";
        //String escaped = source.replace("<", "&lt;").replace("&", "&amp;"); // ...
        System.out.println(escaped);
    }
}