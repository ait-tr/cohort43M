package Student;

import Student.model.Student;

public class StudentAppl {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Paul", "Hoffner", 1980, "tester");
        Student student2 = new Student(2,"Lily", "Ern", 1985, "developer");
        Student student3 = new Student(3,"Piter", "Oliver", 1987, "system administrator");
        student1.displayStudent();
        student1.study();
        student1.takeExam();

        System.out.println();

        student2.displayStudent();
        student2.study();
        student2.takeExam();

        System.out.println();

        student3.displayStudent();
        student3.study();
        student3.takeExam();

    }
}
