import student.Student;

public class StudentAppl {
    public static void main(String[] args) {
        // Создаем несколько студентов
        Student student1 = new Student(1, "Dima", "Fakel", 2004, "Computer Science");
        Student student2 = new Student(2, "Jana", "Nakel", 1999, "Engineering");

        // Отображаем процесс учебы
        student1.display();
        student1.study();
        student1.takeVacation();
        student1.study();
        student1.takeExam();

        System.out.println();

        student2.display();
        student2.study();
        student2.takeExam();
    }

}
