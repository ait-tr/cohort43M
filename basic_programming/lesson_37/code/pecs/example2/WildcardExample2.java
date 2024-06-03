package code.pecs.example2;

import java.util.Arrays;
import java.util.List;

public class WildcardExample2 {
    public static void main(String[] args) {

        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        processAnimals(dogs);

        List<Cat> cats = Arrays.asList(new Cat(), new Cat());
        processAnimals(cats);


    }
    // этот метод принимает список объектов типа 'Animal\ или его подклассов (Cat и Dog)

    public static void processAnimals(List<? extends Animal> animals){
        for (Animal animal : animals){
            animal.sound();
        }

    }
}
