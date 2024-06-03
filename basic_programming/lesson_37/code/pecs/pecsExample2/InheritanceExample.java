package code.pecs.pecsExample2;


import java.util.Arrays;
import java.util.List;

public class InheritanceExample {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        DogSmall dogSmall = new DogSmall();

        List<Animal> animals = Arrays.asList(animal, dogSmall, dog,cat);

        printAnimalCollection(animals);

        List<Dog> dogs = Arrays.asList(new Dog(), new Dog(), new DogSmall());




    }

    public static void printAnimalCollection(List<Animal> animals){
        for (Animal element : animals){
            System.out.println(element);
        }
    }
}
