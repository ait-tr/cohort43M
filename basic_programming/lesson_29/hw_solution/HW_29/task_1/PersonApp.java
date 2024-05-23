package HW_29.task_1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PersonApp {
    public static void main(String[] args) {
        Set<Person> people = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                int lastNameComparison = person1.getLastName().compareTo(person2.getLastName());
                if (lastNameComparison != 0){
                    return lastNameComparison;
                }
               return person1.getFirstName().compareTo(person2.getFirstName());
            }
        });

        people.add(new Person("Illya", "Lavoshnyk"));
        people.add(new Person("Illya", "Lavoshnyk"));
        people.add(new Person("Maria", "Lavoshnyk"));
        people.add(new Person("Illya", "Gazin"));
        people.add(new Person("Mario", "Salierri"));
        people.add(new Person("Francheska", "Torinni"));
        people.add(new Person("Amayak", "Akopyan"));

        for (Person person : people){
            System.out.println(person);
        }
    }




}
