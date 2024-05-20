package homeWork;

import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();

        student.add("Bill");
        student.add("Barry");
        student.add("Denys");
        student.add("Juli");
        student.add("Lana");

        System.out.println(student);

        ArrayList<String> reversStudent = new ArrayList<>();
        for (int i = student.size() - 1; i >= 0 ; i--) {
            reversStudent.add(student.get(i));
        }
        System.out.println(reversStudent);

        reversStudent.remove(3);
        System.out.println(reversStudent);

    }
}
