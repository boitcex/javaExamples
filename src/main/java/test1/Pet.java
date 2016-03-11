package test1;


public abstract class Pet {
    String name;
    int age;
    boolean hungry;

    public abstract void voice();
    void food() {
        hungry = false;
    }
}

