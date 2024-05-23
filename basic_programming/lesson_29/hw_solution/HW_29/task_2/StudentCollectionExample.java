package HW_29.task_2;

import java.util.*;

public class StudentCollectionExample {
    public static void main(String[] args) {

        Comparator<Student> rollComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getRoll(), s2.getRoll());
            }
        };

        Comparator<Student> nameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        };

        Set<Student> studentsByRoll = new TreeSet<>(rollComparator);

        Set<Student> studentsByName = new TreeSet<>(nameComparator);

        List<Student> students = Arrays.asList(
                new Student(3, "Alice"),
                new Student(1, "Bob"),
                new Student(2, "Charlie"),
                new Student(4, "Dave")
        );

        studentsByRoll.addAll(students);
        studentsByName.addAll(students);

        System.out.println("Students sorted by roll:");
        for (Student student : studentsByRoll) {
            System.out.println(student);
        }
        System.out.println("\n");

        System.out.println("Students sorted by name:");
        for (Student student : studentsByName) {
            System.out.println(student);
        }
    }
}