package code.polimorphism.interface1;

public class Person implements SwimInterface{

    @Override
    public void swim(){
        System.out.println("Пловец кролем!");
    }
}
