package week4_String;

/**
 * Created by Roman on 12.01.2016.
 */
public class SplitString {
    public static void main(String[] args) {
        String models = "[{CS10001364},{DN2500005},{DN2500006},{DN3800001},{DN3800002},{DN4900001},{DN4900002},{DN4900015},{DN4900047},{DN4900048}]";
        String ans = "Ваше звернення №0-8811872 успішно зареєстровано,";
        //System.out.println(ans.matches("[0-9-]+"));



/*
        String[] result = ans.split(",");
        for (int i = 0; i <result.length ; i++) {
            System.out.println(result[i].substring(result[i].indexOf("{")+1, result[i].indexOf('}')));

        }
*/
        /*String[] result = models.split("\\W+");
        for(int i = 1; i < result.length; i++){
            System.out.println(result[i]);
            //vars.put("model_"+i,str);
        }*/

    }
    
}
