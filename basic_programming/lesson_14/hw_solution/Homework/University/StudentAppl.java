package University;

import University.Student.Student;

public class StudentAppl {
    public static void main(String[] args) {
        Student s1 = new Student(123, "Denys", "Kovalenko",1984, "History");
        Student s2 = new Student(124, "Margaryta", "Ivannikova",1993, "Philology");
        Student s3 = new Student(125, "Oleksandr", "Okul",1989, "Management");

        s1.study();
        s2.takeAVacation();
        s3.passTheExam();
    }
}
