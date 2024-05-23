package code.setCollectionExample;

import java.util.HashSet;
import java.util.Set;

public class CatSet {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();

        cats.add(new Cat("Murzik"));
        cats.add(new Cat("Barsik"));
        cats.add(new Cat("Lastochka"));
        cats.add(new Cat("Lucky"));

        for (Cat cat : cats){
            System.out.println(cat);
        }


    }
}
