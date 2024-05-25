package task3;
//Хранение и сортировка имен студентов
//Написать программу, которая принимает список имен студентов
//и хранит их в коллекции в отсортированном виде. Программа должна выводить список имен в алфавитном порядке.

import java.util.Set;
import java.util.TreeSet;

public class StudentNames {

    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();

        names.add("Anton");
        names.add("Xeon");
        names.add("Wanga");
        names.add("Boris");
        names.add("Denis");
        names.add("Cavin");

        System.out.println(names);
    }







}
