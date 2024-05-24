package code.HomeWork.Task3;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class Task3 {
//    Задача 3: Хранение и сортировка имен студентов.
//    Написать программу, которая принимает список имен студентов и хранит их в коллекции в отсортированном виде.
//    Программа должна выводить список имен в алфавитном порядке.

    public static void main(String[] args) {

            Set<Student> students = new TreeSet<>();

            students.add(new Student("Jack","Black"));
            students.add(new Student("Bill","Johns"));
            students.add(new Student("Andrew","Johns"));
            students.add(new Student("Steve","Martin"));
            students.add(new Student("Ivan","Black"));
            students.add(new Student("Mark","Black"));

            for(Student student : students){
                System.out.println(student);
        }
    }

}
