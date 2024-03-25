public class StudentAppl {
    public static void main(String[] args) {
        Student student = new Student(101,"Vadim","Tacov", 2003,"Mechanik");
        Student student1 = new Student(102,"Alex","Vakit", 2004,"Dantist");
        Student student2 = new Student(103,"Stas","Uber", 2006,"Chef");

        student.thisIs();
        student1.thisIs();
        student2.thisIs();

        student.passTheexam();
        student1.study();
        student2.takeVacation();
    }
}
