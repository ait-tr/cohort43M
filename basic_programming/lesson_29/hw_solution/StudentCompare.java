package homework_29.Student;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StudentCompare {
    public static void main(String[] args) {

        Comparator<Student> studentComparator = new StudentIntComparator().thenComparing(new StudentStringComparator());

        Set<Student> students = new TreeSet<>(studentComparator);

        students.add(new Student(1,"John"));
        students.add(new Student(13,"Petr"));
        students.add(new Student(22,"Alex"));
        students.add(new Student(5,"Roma"));
        students.add(new Student(22,"Stive"));
        students.add(new Student(13,"Bill"));

        System.out.println(students);

    }
}
