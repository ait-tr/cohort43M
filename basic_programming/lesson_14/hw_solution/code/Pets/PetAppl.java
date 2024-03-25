package Pets;

import Pets.Pet.Pet;

public class PetAppl {
    public static void main(String[] args) {
        Pet p1=new Pet(1,"dog",7,"Knopka");
        Pet p2=new Pet(2,"cat",3,"Kira");
        Pet p3=new Pet(3,"cat",3,"Maks");
        Pet p4=new Pet(4,"dog",5,"Belka");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        p1.play();
        p2.thereIs();
        p3.walk();
        p4.sleep();
    }
}
