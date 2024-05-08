package code.polimorphism.interface3;

public class Duck extends Bird implements SwimInterface, Flying {
    @Override
    public void swim() {
        System.out.println("Плыви утка!");
    }

    @Override
    public void fly() {

    }

    @Override
    void voice() {

    }
}
