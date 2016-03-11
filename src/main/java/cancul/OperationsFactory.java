package cancul;

import cancul.operation.*;

/**
 * Created by Roman on 03.11.2015.
 */
public class OperationsFactory  {

    public static Operationable detectOperation(String action){
        Operationable operation = null;
        switch (action){
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Deduction();
                break;
            case "*":
                operation = new Multi();
                break;
            case "/":
                operation = new Deviding();
                break;
            default:
                throw  new IllegalArgumentException("wrong action");
        }
        return operation;
    }
}
