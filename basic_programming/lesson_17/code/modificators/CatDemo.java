package code.modificators;

import code.modificators.entity.Cat;

public class CatDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = " Murzik";
        System.out.println(cat.name);

        Dog dog = new Dog();
        dog.name = " Barbos";
        System.out.println(dog.name);

        Parrot parrot = new Parrot("Kesha");
        System.out.println(parrot.getName());


    }
}
