package code.HW.task2;

import java.util.Comparator;

public class CompareByRoll implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRoll() - o2.getRoll();
    }
}
