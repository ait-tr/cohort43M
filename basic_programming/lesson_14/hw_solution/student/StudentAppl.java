package student;

import student.model.Student;

public class StudentAppl {
    public static void main(String[] args) {


        Student s1 = new Student(1, "Sem", "Morozov", 1999, "Telecom");
        Student s2 = new Student(2, "Oleg", "Rozov", 2001, "Mobile");
        Student s3 = new Student(3, "Ann", "Rogova", 2003, "Radio");
        s1.takeAvacation();
        s2.passTheExam();
        s3.study();
    }
}
