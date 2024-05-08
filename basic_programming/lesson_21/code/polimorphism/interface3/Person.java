package code.polimorphism.interface3;

public class Person implements SwimInterface {

    @Override
    public void swim(){
        System.out.println("Пловец кролем!");
    }
}
