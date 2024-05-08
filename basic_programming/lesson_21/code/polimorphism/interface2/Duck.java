package code.polimorphism.interface2;

public class Duck implements SwimInterface, Flying {
    @Override
    public void swim() {
        System.out.println("Плыви утка!");
    }

    @Override
    public void fly() {

    }
}
