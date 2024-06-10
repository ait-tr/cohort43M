package code.streamPractice.task3;

import java.util.Arrays;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {

        Student student1 = new Student("Alex");

        student1.addBook("Java 8 vx Java 21");
        student1.addBook("Spring Boot in Action");
        student1.addBook("Effective Java");

        Student student2 = new Student("Thomas");
        student2.addBook("HTML introducing");
        student2.addBook("Effective Java");


        List<Student> students = Arrays.asList(student1,student2);

        List<String> bookNames = students.stream()
                .map(student -> student.getBook())
                .flatMap(setCollection -> setCollection.stream())
                .distinct()
                .toList();

        System.out.println(bookNames);

    }
}
