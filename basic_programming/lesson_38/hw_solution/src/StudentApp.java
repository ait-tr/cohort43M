import java.util.ArrayList;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {

        StudentManager studentManager = new StudentManager();

        Student student1 = new Student("Artyr","Pirozhkov",1);
        Student student2 = new Student("Anna","Smaula",2);
        Student student3 = new Student("Mike","Gover",3);

        Course course1 = new Course("Math");
        Course course2 = new Course("Biology");
        Course course3 = new Course("Chemistry");

        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);

        studentManager.addCourseToStudent(course1, student1);
        studentManager.addCourseToStudent(course2, student3);
        studentManager.addCourseToStudent(course3, student2);
        studentManager.addCourseToStudent(course3, student3);

       studentManager.toString1();





    }
}
