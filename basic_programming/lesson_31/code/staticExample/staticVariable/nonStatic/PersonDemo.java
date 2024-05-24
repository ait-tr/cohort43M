package code.staticExample.staticVariable.nonStatic;

public class PersonDemo {
    public static void main(String[] args) {

        Person personPetr = new Person();
        Person personOlga = new Person();

        personPetr.name = "Petr";
        personPetr.town = "Berlin";

        personOlga.name = "Olga";
        personOlga.town = "Leipzig";

        System.out.println(personPetr);
        System.out.println(personOlga);
    }
}
