package student.model;

public class StudAppl {

    public static void main(String[] args) {

        Student c = new Student(1,"Vlad", "Velykyy",1971,"welding");
        Student c1 = new Student(2,"Victor", "Mann",1972,"engineering");
        Student c2 = new Student(3,"Valera", "Mustermann",1970,"transport");
        Student c3= new Student(4,"Vasiliy", "Ach",1969,"economy");

        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c.beer();
        c1.exam();
        c2.study();
        c3.vacation();

    }
}
