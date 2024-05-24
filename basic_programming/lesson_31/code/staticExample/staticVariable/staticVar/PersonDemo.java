package code.staticExample.staticVariable.staticVar;

public class PersonDemo {
    public static void main(String[] args) {

        Person personPetr = new Person();
        Person personOlga = new Person();

        personPetr.name = "Petr";
        Person.town = "Berlin";
        System.out.println(personPetr);


        personOlga.name = "Olga";
        Person.town = "Leipzig";

        System.out.println(personOlga);
        System.out.println(personPetr);
    }
}
