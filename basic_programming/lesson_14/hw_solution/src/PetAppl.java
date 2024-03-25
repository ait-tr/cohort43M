public class PetAppl {
    public static void main(String[] args) {
        Pet pet = new Pet(2345,"Sporting dog",6,"Jack");
        Pet pet1 = new Pet(0345,"Terrier dog",2,"Maggi");
        Pet pet2 = new Pet(5829,"Herding dog",5,"Boris");
        Pet pet3 = new Pet(3848,"Labrador dog",7,"Tyson");

        pet.petsDogs();
        pet1.petsDogs();
        pet2.petsDogs();
        pet3.petsDogs();

        pet.sleep();
        pet1.thereIs();
        pet2.play();
        pet3.makeSound();

    }
}
