package code.HW.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> allStudents = new ArrayList<>();
        allStudents.add(new Student(1, "James"));
        allStudents.add(new Student(5, "Krong"));
        allStudents.add(new Student(6, "Kuzko"));
        allStudents.add(new Student(2, "Eva"));
        allStudents.add(new Student(4, "Kate"));
        allStudents.add(new Student(3, "Paul"));

        Comparator<Student> studentsComparedByRoll = new CompareByRoll();
        Set<Student> studentsSortedByRoll = new TreeSet<>(studentsComparedByRoll);
        studentsSortedByRoll.addAll(allStudents);

        Comparator<Student> studentsComparedByName = new CompareByName();
        Set<Student> studentsSortedByName = new TreeSet<>(studentsComparedByName);
        studentsSortedByName.addAll(allStudents);

        System.out.println("All students:");
        System.out.println(allStudents);

        System.out.println("Students sorted by name: ");
        System.out.println(studentsSortedByName);

        System.out.println("Students sorted by roll: ");
        System.out.println(studentsSortedByRoll);
    }
}
