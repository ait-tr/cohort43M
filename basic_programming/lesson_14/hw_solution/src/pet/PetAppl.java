package pet;

import pet.model.Pet ;

public class PetAppl {
    public static void main(String[] args) {
        Pet dog = new Pet(1, "Dog", 3, "Tommy");
        Pet cat = new Pet(2, "Cat", 6, "Holly");
        System.out.println(dog);
        System.out.println(cat);

        dog.sleep();
        cat.eat();
        dog.bark();
        cat.play();
        dog.walk();


    }
}