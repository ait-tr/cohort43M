package Pet;

import Pet.model.Pet;

public class PetAppl {
    public static void main(String[] args) {
        Pet p1 = new Pet(123,"Cat",3,"Barsick");
        Pet p2 = new Pet(124,"Dog",2,"Lui");

        p1.walk();
        p2.eating();
    }

}
