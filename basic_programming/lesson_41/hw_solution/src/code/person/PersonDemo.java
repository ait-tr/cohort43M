package code.person;

import java.util.Arrays;
import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Karter",26);
        Person person2 = new Person("Anna",18);
        Person person3 = new Person("John",34);


        Ability ability1 = new Ability("JavaScript");
        Ability ability2 = new Ability("JavaPro");
        Ability ability3 = new Ability("Java");


        person1.addSkills(ability1);
        person1.addSkills(ability3);
        person2.addSkills(ability3);
        person3.addSkills(ability2);

        List<Person> people = Arrays.asList(person1, person2, person3);

        List<Person> personSortedAge = people.stream()
                .filter(x -> x.getAge() > 25)
                .toList();

        System.out.println(personSortedAge);
    }
}
