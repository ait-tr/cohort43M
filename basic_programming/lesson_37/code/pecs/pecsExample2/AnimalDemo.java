package code.pecs.pecsExample2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalDemo {
    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog(), new DogSmall());

        AnimalsService service = new AnimalsService();

        service.addDog(dogs);

        List<Animal> animals = new ArrayList<>();
        service.addDog(animals);

    }
}
