package Task_2;

import java.util.Comparator;

public class StudentRollComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRoll(), s2.getRoll());
    }
}
