import Pet.Pet;

public class PetAppl {
    public static void main(String[] args) {
        Pet pet1 = new Pet(1, "dog", 3, "Stiwi");
        Pet pet2 = new Pet(2, "cat", 7, "Susi");
        Pet pet3 = new Pet(3, "hamster", 1, "Maks");

        simulateDay(pet1);
        simulateDay(pet2);
        simulateDay(pet3);

    }
    public static void simulateDay(Pet pet){
        System.out.println(pet.getNickname() + " is starting its day: ");

        System.out.println(pet.sleep());
        System.out.println(pet.eat());
        System.out.println(pet.makeSound());
        System.out.println(pet.play());
        System.out.println(pet.walk());
        System.out.println();

    }
}
