package HomeWork.Task1;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();

        persons.add(new Person("John","Johns"));
        persons.add(new Person("Bill","Johns"));
        persons.add(new Person("Andrew","Johns"));
        persons.add(new Person("Steve","Martin"));
        persons.add(new Person("Ivan","Black"));
        persons.add(new Person("Mark","Black"));

        for(Person person : persons){
            System.out.println(person);
        }

    }
}
