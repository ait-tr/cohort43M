package Homework_27.student;

import java.util.HashMap;
import java.util.Map;

public class Student {
    public static void main(String[] args) {

        Map<String, Double> student = new HashMap<>();


        student.put("Alice", 85.5);
        student.put("Bob", 90.0);
        student.put("Charlie", 78.5);
        student.put("Diana", 92.0);
        student.put("Edward", 88.0);


        System.out.println("Initial student grades: " + student);


        student.put("Charlie", 81.0);


        System.out.println("Updated student grades: " + student);
    }
}

