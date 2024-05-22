package work1;

import java.util.Set;
import java.util.TreeSet;

public class PersonDemo {
    public static void main(String[] args) {

        Set<Person1> personSet = new TreeSet<>();

        personSet.add(new Person("Ruslan","Patrikov"));
        personSet.add(new Person("Alex","Maslov"));
        personSet.add(new Person("Yilia","Kanic"));

        for (Person1 person : personSet){
            System.out.println(person);
        }
    }
}
