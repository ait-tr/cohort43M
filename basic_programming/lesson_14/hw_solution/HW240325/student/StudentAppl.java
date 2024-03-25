package HW240325.student;

import HW240325.student.model.Student;

public class StudentAppl {
    public static void main(String[] args) {
        Student alex = new Student(1, "Alex", "Ilchenko", 1988, "Developer");
        Student maiia = new Student(2, "Maiia", "Ilchenko", 2018, "Wonderkind");
        Student oscar = new Student(3, "Oscar", "Marques", 1987, "QA");

        System.out.println("** Here is Oscar:");
        System.out.println(oscar);
        System.out.println("~~~~~\n");

        System.out.print("All the semester long ");
        oscar.study();

        System.out.print("Twice a year ");
        oscar.vacation();

        System.out.print("And in the end ");
        oscar.exam();

    }
}
