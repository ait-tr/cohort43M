package code.comparatorExample;

import java.util.Comparator;
import java.util.Objects;

public class StudentCompare implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {

        if (student1.roll.equals(student2.roll)) {
            return student1.name.compareTo(student2.name);
        } else {
            return student1.roll.compareTo(student2.roll);
        }


//        // --- равносильно -----
//        int compareResult = student1.roll.compareTo(student2.roll);
//        if (compareResult == 0) {
//            compareResult = student1.name.compareTo(student2.name);
//        }
//        return compareResult;
//

    }
}
