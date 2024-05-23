package code.Task2;

import java.util.Comparator;

public class StudentComparatorByName implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        int compareResult = student1.getName().compareTo(student2.getName());
        if (compareResult == 0) {
            compareResult = student1.getRoll() - student2.getRoll();
        }
        return compareResult;
    }
}
