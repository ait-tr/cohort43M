package code.hw;

import java.util.HashMap;
import java.util.Map;

public class Grades {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();
        grades.put("Alisa", 5.0);
        grades.put("Alina", 4.8);
        grades.put("Alena", 4.5);
        grades.put("Nikita", 3.0);
        grades.put("Alexandr", 4.9);
        System.out.println(grades);
        grades.put("Alina",2.8);
        System.out.println(grades);
    }

}
