package code.practice.task2;

public class CourseApp {
    public static void main(String[] args) {

        CoursesManagement management = new CoursesManagement();


        Course course1 = new Course("JBB","Java Back-end basic");
        Course course2 = new Course("FBC","Front-end basic");
        Course course3 = new Course("QBC","QA basic");
        Course course4 = new Course("Survive","Survive basic");


        Teacher teacher1 = new Teacher("ABC", "Arnold");
        Teacher teacher2 = new Teacher("007", "James Bond");


        management.addTeacherToCourse(teacher1, course1);
        management.addTeacherToCourse(teacher1, course2);
        management.addTeacherToCourse(teacher1, course3);

        management.addTeacherToCourse(teacher2, course4);
        //--------- добавим студентов ------

        Student student1 = management.createStudent();
        Student student2 = management.createStudent();
        Student student3 = management.createStudent();
        Student student4 = management.createStudent();
        Student student5 = management.createStudent();
        Student student6 = management.createStudent();
        Student student7 = management.createStudent();
        Student student8 = management.createStudent();
        Student student9 = management.createStudent();


        // -------- распределим студентов по курсам ----

        management.addStudentToCourse(student1,course1);
        management.addStudentToCourse(student2,course2);
        management.addStudentToCourse(student3,course3);
        management.addStudentToCourse(student4,course2);
        management.addStudentToCourse(student5,course1);
        management.addStudentToCourse(student6,course4);
        management.addStudentToCourse(student7,course1);
        management.addStudentToCourse(student8,course4);
        management.addStudentToCourse(student9,course3);



        management.printCourseInfo(course1);
        management.printCourseInfo(course2);
        management.printCourseInfo(course3);
        management.printCourseInfo(course4);




    }
}
