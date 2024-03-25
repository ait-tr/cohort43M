package HW240325.pet;

import HW240325.pet.model.Pet;

/*
Task 1. Create a Pet class with private fields:

id
view
age
nickname
Standard methods:

constructor for all fields;
getters and setters for all fields;
toString method.
Additional methods:

sleep
There is
make sound
play
walk
In the PetAppl class, create several pet instances. Display the day lived.
 */
public class PetAppl {

    public static void main(String[] args) {

        Pet dog = new Pet(1, "dog", 3, "Milo");
        Pet cat = new Pet(2, "cat", 2, "Tom");
        Pet cow = new Pet(3, "cow", 4, "Milka");
        Pet rat = new Pet(4, "rat", 1, "Ratatouille");

        System.out.println(dog + "\n~~~~~~~~\n");

        System.out.println("** That's how the day of my pets looks like");

        cat.thereIs();

        System.out.print("The most part of the day ");
        cat.sleep();

        System.out.print("When it is hungry, ");
        cat.makeSound();

        System.out.print("When it has a good mood, ");
        cat.play();

        System.out.print("And when it goes outside, ");
        cat.walk();

    }
}
