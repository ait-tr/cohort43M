package code.hw.task1;

import java.util.ArrayList;

public class ArrayListStudents {
    public static void main(String[] args) {
        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("James");
        studentsName.add("Nil");
        studentsName.add("Mike");
        studentsName.add("Emma");
        studentsName.add("Paul");

        System.out.println("Reversed list:");
        for (int i = studentsName.size() -1; i>= 0; i--){
            System.out.println(studentsName.get(i));
        }
        System.out.println();
        System.out.println("List without Nil");
        studentsName.remove(1);
        for (int i = studentsName.size() -1; i>= 0; i--){
            System.out.println(studentsName.get(i));
        }

    }
}
