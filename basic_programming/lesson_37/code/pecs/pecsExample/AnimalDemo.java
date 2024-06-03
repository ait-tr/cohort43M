package code.pecs.pecsExample;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalDemo {
    public static void main(String[] args) {
        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat(), new Cat());

        AnimalsService service = new AnimalsService();

        service.processAnimal(dogs);
        service.processAnimal(cats);

        service.addDog(dogs);

        List<Animal> animals = new ArrayList<>();
        service.addDog(animals);

    }
}
