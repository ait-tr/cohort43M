package Task_1;

import java.util.Set;
import java.util.TreeSet;

public class PersonTreeSet {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();
        persons.add(new Person("Ivan", "Ivanov"));
        persons.add(new Person("Olga", "Makeeva"));
        persons.add(new Person("Alina", "Pushkina"));
        persons.add(new Person("Bogdan", "Pushkin"));
        persons.add(new Person("Alxander", "Dudin"));

        System.out.println(persons);

        for (Person person : persons){
            System.out.println("Surname, name: " + person.getSurname() + " , " + person.getName());
        }

    }
}
