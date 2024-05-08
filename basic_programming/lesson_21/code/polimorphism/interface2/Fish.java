package code.polimorphism.interface2;

public class Fish implements SwimInterface {

    @Override
    public void swim() {
        System.out.println("Плыви рыбка большая и маленькая!");
    }
}
