package cancul.operation;

/**
 * Created by Roman on 03.11.2015.
 */
public class Deduction implements Operationable {
    @Override
    public float execute(float x, float y) {
        return x-y;
    }
}
