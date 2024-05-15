package code;

import java.util.ArrayList;

public class Students {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Tomas");
        students.add("Gerry");
        students.add("Ingvar");
        students.add("Lana");
        students.add("Kerry");

        System.out.println("Initial students list: " + students);
        System.out.println("\n");

        ArrayList<String> reverseStudents = new ArrayList<>();

        for (int i = students.size() -1; i >= 0; i--) {
            reverseStudents.add(students.get(i));
        }
        System.out.println("Reversed students list: " + reverseStudents);
        System.out.println("\n");

        reverseStudents.remove(3);
        System.out.println("Final students list: " + reverseStudents);

    }
}
