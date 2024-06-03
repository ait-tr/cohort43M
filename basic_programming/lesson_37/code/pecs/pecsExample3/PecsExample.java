package code.pecs.pecsExample3;

import java.util.ArrayList;
import java.util.List;

public class PecsExample {
    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();

        List<DogSmall> dogSmalls = new ArrayList<>();

        addDogs(animalList);
       // addDogs(dogSmalls);

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        Animal cat2 = new Cat();
        Animal dog2 = new Dog();




    }

    public static void addDogs(List<? super Animal> list) {
        list.add(new Dog());
        list.add(new DogSmall());

    }
}
