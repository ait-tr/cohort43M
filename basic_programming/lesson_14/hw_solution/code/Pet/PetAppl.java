package Pet;

import Pet.model.Pet;

public class PetAppl {
    public static void main(String[] args) {
        Pet p1 = new Pet(1, "cat", 2, "Mursik");
        Pet p2 = new Pet(2, "dog", 5, "Rex");
        Pet p3 = new Pet(3, "parrot", 7, "Kesha");
        Pet p4 = new Pet(4, "rabbit", 3, "Bunny");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        p1.eat();
        p2.walk();
        p3.sleep();
        p4.play();
        p2.noise();
    }
}
