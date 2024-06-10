package code.student;

import code.student.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {

        Student student1 = new Student("John", 19, 3.4,2023);
        Student student2 = new Student("Mark", 28, 4.4,2012);
        Student student3 = new Student("Sem", 34, 5.0,1998);
        Student student4 = new Student("Tomi", 18, 2.1,2022);
        Student student5 = new Student("Anna", 44, 4.6,1988 );
        Student student6 = new Student("Jana", 23, 4.8, 2017);


        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6);

        List<Student> studentGrade = students.stream()
                .filter(x -> x.getAvgGrade() > 4.5)
                .toList();
        System.out.println(studentGrade);

        // Сортировка по году поступления

        List<Student> studentGradeAndYear = students.stream()
                .sorted(Comparator.comparingInt(Student::getYear).reversed())
                .toList();
        System.out.println(studentGradeAndYear);

        String string1 = "ABC";
        String string2 = "QWE";
        String string3 = "FSD";
        String string4 = "FKG";

       List<String> strings = Arrays.asList(string1,string2,string3,string4);










    }
}
