package HomeWork_14_Lesson.Pet;

public class PetAppl {
    public static void main(String[] args) {
        Pet p1 = new Pet(1,"Kolly",12,"Lessi");
        Pet p2 = new Pet(2,"Dachshund",15,"Jessi");
        Pet p3 = new Pet(3,"German Shepherd",8,"Nik");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.eat();
        p2.play();
        p3.sleep();

    }
}
