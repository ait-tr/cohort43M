package HomeWork_14_Lesson.Student;

public class StudentAppl {
    public static void main(String[] args) {
        Student st1 = new Student(1,"John","Wick",2002,"Mathematik");
        Student st2 = new Student(1,"Katrin","Hitman",2004,"Chemie");
        Student st3 = new Student(1,"Joi","Lenz",2005,"Bilogie");

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        st1.pass_the_exam();
        st2.take_a_vacation();
        st3.study();

    }
}
