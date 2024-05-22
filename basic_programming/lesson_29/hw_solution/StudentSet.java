package Homework_29.task2;

import java.util.Set;
import java.util.TreeSet;

public class StudentSet {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();

        students.add(new Student(1, "Olga"));
        students.add(new Student(2, "Anna"));
        students.add(new Student(3, "Alex"));
        students.add(new Student(4, "Inga"));
        students.add(new Student(5, "Mira"));
        students.add(new Student(6, "Oleg"));

        students.add(new Student(1, "Olga"));
        students.add(new Student(2, "Anna"));
        System.out.println(students);

    }
}
