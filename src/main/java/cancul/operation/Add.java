package cancul.operation;

/**
 * Created by Roman on 03.11.2015.
 */
public class Add implements Operationable {

    @Override
    public float execute(float x, float y) {
        return x+y;
    }
}
