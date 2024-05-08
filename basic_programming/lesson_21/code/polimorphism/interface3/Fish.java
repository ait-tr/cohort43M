package code.polimorphism.interface3;

public class Fish implements SwimInterface {

    @Override
    public void swim() {
        System.out.println("Плыви рыбка большая и маленькая!");
    }
}
