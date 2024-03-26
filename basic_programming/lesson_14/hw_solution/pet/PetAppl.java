package pet;

import pet.model.Pet;

public class PetAppl {
    public static void main(String[] args) {
        Pet pet1 = new Pet(12,"black and white", 2,"Mike");
        pet1.displayPet();
        pet1.sleepPet();
        Pet pet2 = new Pet(1,"braun",5,"Tom");
        pet2.displayPet();
        pet2.makeSound();
        Pet pet3 = new Pet(8,"braun",7,"Jerry");
        pet3.displayPet();
        pet3.thereIs();
        Pet pet4 = new Pet(7,"black",3,"Lucky");
        System.out.println(pet4);;
        pet4.walk();

    }
}
