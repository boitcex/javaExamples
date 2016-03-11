package exeption;

public class Main {
    public static void main(String[] args) {
        try{
            int i = 4;
            System.out.println(i/0);
        }catch (ArithmeticException e){
            System.out.println("Error!!You can not divide by 0");
        }

    }
}
