package Homework_29.task1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PersonSet {
    public static void main(String[] args) {
        Set<Person> person = new HashSet<>();

        person.add(new Person("Olga", "Frolova"));
        person.add(new Person("Anna", "Ivanova"));
        person.add(new Person("Anna", "Petrova"));
        person.add(new Person("Igor", "Karlov"));
        person.add(new Person("Alex", "Ivanov"));
        person.add(new Person("Stepan", "Govorov"));

        person.add(new Person("Stepan", "Govorov"));
        person.add(new Person("Alex", "Ivanov"));

        System.out.println(person);


    }
}
