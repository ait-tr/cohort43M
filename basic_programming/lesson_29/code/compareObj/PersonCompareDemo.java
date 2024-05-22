package code.compareObj;

import java.util.*;

public class PersonCompareDemo {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Tom",25));
        personList.add(new Person("Nick",35));
        personList.add(new Person("James",49));
        personList.add(new Person("Bill",35));
        personList.add(new Person("Alice",18));


        Comparator<Person> personComparator = new PersonCompareFirst();

        Set<Person> people = new TreeSet<>(personComparator);

        people.addAll(personList);

     //   System.out.println(people);


        Comparator<Person> personComparatorByAge = new PersonCompareByAge();
        Set<Person> personSortedByAge = new TreeSet<>(personComparatorByAge);
        personSortedByAge.addAll(personList);

        Comparator<Person> personComparatorByName = new PersonCompareByName();
        Set<Person> personSortedByName = new TreeSet<>(personComparatorByName);
        personSortedByName.addAll(personList);

        Comparator<Person> personComparatorByNameAndAge = new PersonCompareByAge().thenComparing(new PersonCompareByName());
        Set<Person> personSortedByNameAndAge = new TreeSet<>(personComparatorByNameAndAge);
        personSortedByNameAndAge.addAll(personList);

        System.out.println(personSortedByAge);

        System.out.println(personSortedByName);

        System.out.println(personSortedByNameAndAge);


    }
}
