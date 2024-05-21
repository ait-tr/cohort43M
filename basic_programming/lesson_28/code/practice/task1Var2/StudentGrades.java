package code.practice.task1Var2;

import java.util.ArrayList;
import java.util.Map;

public class StudentGrades {
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        students.add(new Student("Olga"));
        students.add(new Student("Ruslan"));

        students.get(0).addGrade("History", 4);
        students.get(0).addGrade("English", 5);
        students.get(1).addGrade("Math", 4);
        students.get(1).addGrade("History", 5);




        // Получение данных об оценках конкретного студента


        Student student = findStudentByName("olga");
        System.out.println("Оценки студента " + student.getName() + ":");
        for (Map.Entry<String, Integer> entry : student.getGrades().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    private static Student findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }
}
