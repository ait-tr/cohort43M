package code.pecs.example3;

import code.pecs.example2.Animal;
import code.pecs.example2.Cat;
import code.pecs.example2.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardExample3 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        List<Dog> dogs = Arrays.asList(new Dog(), new Dog());
        List<Cat> cats = Arrays.asList(new Cat(), new Cat());




        ListCopyExample lce = new ListCopyExample();

        // animals.addAll(dogs);
        lce.listAnyTypeDataCopyWildcard(animals,dogs);
        lce.listAnyTypeDataCopyWildcard(animals,cats);


        System.out.println(animals);
    }
}
