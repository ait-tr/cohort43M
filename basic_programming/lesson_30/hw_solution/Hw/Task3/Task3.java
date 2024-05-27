package code.Hw.Task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> studentsNames = new ArrayList<>();
        studentsNames.add("Jacob");
        studentsNames.add("Elison");
        studentsNames.add("Karol");
        studentsNames.add("Annet");
        studentsNames.add("Henry");

        System.out.println("Original list: " + studentsNames);
        studentsNames.sort(Comparator.naturalOrder());
        System.out.println("Sorted list: " + studentsNames);
    }
}
