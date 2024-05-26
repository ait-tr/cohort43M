package homework_29.Student;

import java.util.Comparator;

public class StudentIntComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRoll() - o2.getRoll();
    }
}
