package homeWork;

import java.util.HashMap;

public class StudentGrades {
    public static void main(String[] args) {
        HashMap<String, Double> grades = new HashMap<>();

        grades.put("Denys", 4.5);
        grades.put("Ryta", 4.9);
        grades.put("Rost", 4.2);
        grades.put("David", 4.8);
        grades.put("Eve", 3.7);

        System.out.println("Средний балл студента Ryta: " + grades.get("Ryta"));

        // Изменяем средний балл студента Alice
        grades.put("Ryta", 4.7);

        System.out.println("Обновленный средний балл студента Alice: " + grades.get("Ryta"));
    }
}