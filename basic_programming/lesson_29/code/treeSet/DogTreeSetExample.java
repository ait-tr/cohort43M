package code.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class DogTreeSetExample {
    public static void main(String[] args) {
        Set<Dog> dogs = new TreeSet<>();

        dogs.add(new Dog("Мухтар","овчарка"));
        dogs.add(new Dog("Лесси","колли"));
        dogs.add(new Dog("Рыжик","спаниель"));
        dogs.add(new Dog("Бобик","дворняга"));
        dogs.add(new Dog("Зевс","кане корсо"));
        dogs.add(new Dog("Рекс","овчарка"));

        System.out.println(dogs);
    }
}
