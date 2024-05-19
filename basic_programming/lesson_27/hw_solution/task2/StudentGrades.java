package homework.task2;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    public static void main(String[] args) {

        HashMap<String, Double> studentGrades = new HashMap<>();

        studentGrades.put("Ivan", 4.5);
        studentGrades.put("Mary", 3.8);
        studentGrades.put("Petr", 4.2);
        studentGrades.put("Anna", 4.7);
        studentGrades.put("Ruslan", 3.9);

        System.out.println("Начальные данные студентов:");
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        String studentToUpdate = "Mary";
        double newGrade = 4.1;
        studentGrades.put(studentToUpdate, newGrade);


        System.out.println("\nОбновленные данные студентов:");
        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
