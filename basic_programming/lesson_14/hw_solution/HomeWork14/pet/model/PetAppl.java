package pet.model;

public class PetAppl {
    public static void main(String[] args) {

        Pet a = new Pet(1, "dog",3.3, "Druzok");
        Pet a1 = new Pet(2, "dog",2.5, "Barbos");
        Pet a2 = new Pet(3, "cat",1.0, "Funtik");
        Pet a3 = new Pet(4, "cat",5.4, "Vasy");
        Pet a4 = new Pet(5, "turtle",7.3, "Tortila");

        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        a.eat();
        a1.growl();
        a2.play();
        a3.walk();
        a4.sleep();

    }
}
