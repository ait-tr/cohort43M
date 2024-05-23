package code.Task2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StudentTreeSet {
    public static void main(String[] args) {

        Comparator<Student> studentComparator = new StudentComparatorByName();

        Set<Student> students = new TreeSet<>(studentComparator);

        students.add(new Student(1,"Alex"));
        students.add(new Student(2,"John"));
        students.add(new Student(3,"Bogdan"));
        students.add(new Student(4,"Anton"));
        students.add(new Student(5,"Daniel"));
        students.add(new Student(7,"Alex"));

        System.out.println(students);

        Comparator<Student> studentComparator1 = new StudentComparatorByRoll();
        Set<Student> students1 = new TreeSet<>(studentComparator1);
        students1.addAll(students);

        System.out.println(students1);


    }
}
