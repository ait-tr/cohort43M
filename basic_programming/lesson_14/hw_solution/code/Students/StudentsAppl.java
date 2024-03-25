package Students;

import Students.Student.Student;

public class StudentsAppl {

    public static void main(String[] args) {
        Student s1 = new Student(1, "John", "Smith", 2001, "Java Developer");
        Student s2 = new Student(2, "Myke", "Tyson", 2002, "Manual Tester");
        Student s3 = new Student(3, "Kris", "Rock", 2001, "Automated Tester");
        Student s4 = new Student(4, "Rocky", "Balboa", 2000, "Java FullStack Developer");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("\n");

    s1.passTheExam();
    s2.takeAVacation();
    s3.study();
    s4.transferred();
    }
}