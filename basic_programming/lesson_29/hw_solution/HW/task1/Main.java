package code.HW.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Robert", "Haus"));
        personList.add(new Person("Albert", "Kim"));
        personList.add(new Person("Alex", "Pushkin"));
        personList.add(new Person("Lena", "Ivanova"));
        personList.add(new Person("Yana", "Belova"));
        personList.add(new Person("Lea", "Ahmed"));

        Comparator<Person> personComparator = new PersonCompare();
        Set<Person> people = new TreeSet<>(personComparator);
        people.addAll(personList);
        System.out.println(people);
    }
}
