package students;

import java.util.HashMap;
import java.util.Map;


public class StudentGrades {
        public static void main(String[] args) {

            Map<String, Double> studentGrades = new HashMap<>();

            studentGrades.put("Alice", 85.5);
            studentGrades.put("Bob", 90.0);
            studentGrades.put("Charlie", 78.5);
            studentGrades.put("Diana", 92.0);
            studentGrades.put("Edward", 88.0);

            System.out.println("Initial student grades: " + studentGrades);

            studentGrades.put("Charlie", 80.5);

            System.out.println("Updated student grades: " + studentGrades);
        }
    }

