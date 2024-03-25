package Student;

import Student.model.Student;

public class StudentAppl {
    public static void main(String[] args) {
        Student st1 = new Student(1, "John", "Trall", 19, "Informatics");
        Student st2 = new Student(2, "Mary", "Marly", 22, "Management");
        Student st3 = new Student(3, "Bruise", "Chan", 25, "Economy");

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        st1.vacation();
        st2.study();
        st3.exam();
    }
}
