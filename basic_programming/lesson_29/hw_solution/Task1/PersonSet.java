package code.Task1;



import java.util.Set;
import java.util.TreeSet;


public class PersonSet {
    public static void main(String[] args) {

        Set<Person> persons = new TreeSet<>();

        persons.add(new Person( "Ivan", "Ivanov")); // 1
        persons.add(new Person( "John", "Smith"));
        persons.add(new Person( "Petr", "Petrov"));
        persons.add(new Person( "Sidor", "Sidorov"));
        persons.add(new Person( "Ivan", "Ivanov")); // 2
        persons.add(new Person( "Ivan", "Busurman"));



            System.out.println(persons);

    }
}
