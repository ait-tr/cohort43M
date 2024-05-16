package code.practice.task2;

import code.UserInput;

import java.util.List;

public class CoursesManagement {

    private int teacherCounter = 1;
    private int studentCounter = 1;
    private int courseCounter = 1;


    /**
     * Создать методы которые бы позволяли создавать :
     *  - преподавателя
     *  - студента
     *  - курс
     *
     *  создать методы, которые бы позволяли :
     *  - добавить на курс преподавателя
     *  - добавить на курс студента
     *
     *  вывод информации о курсах, студентах и преподавателях
     */

    public Teacher createTeacher(){

        String teacherId = "Tid # " + teacherCounter;
        String teacherName = "Teacher Name " + teacherCounter;
        teacherCounter++;

        return new Teacher(teacherId,teacherName);
    }

    public Student createStudent(){

        String studentId = "StudentId # " + studentCounter;
        String studentName = "Student Name " + studentCounter;
        studentCounter++;

        return new Student(studentId,studentName);
    }

    public Course createCourse(){

        String courseId = "CourseId # " + courseCounter;
        String courseName = "Course Name " + courseCounter;
        courseCounter++;

        return new Course(courseId,courseName);
    }

    public void addTeacherToCourse(Teacher teacher, Course course){
        course.setTeacher(teacher);

        List<Course> teacherCourses =  teacher.getCourses();
        teacherCourses.add(course);
    }

    public void addStudentToCourse(Student student, Course course){
        List<Student> studentsFromCourse = course.getStudents();
        studentsFromCourse.add(student);

        List<Course> coursesFromStudent = student.getCourses();
        coursesFromStudent.add(course);

    }

    public void printCourseInfo(Course course) {
        System.out.println(" -------------------------------------------");
        System.out.println("Идентификатор курса: " + course.getCourseId());
        System.out.println("Название курса: " + course.getCourseTitle());
        System.out.println("Преподаватель курса: " + course.getTeacher().getName());

        List<Student> studentsFromOurCourse = course.getStudents();

        for (Student currentStudent : studentsFromOurCourse) {
            System.out.println("Идентификатор студента: " + currentStudent.getStudentId());
            System.out.println("Имя студента: " + currentStudent.getName());

        }


    }


    public void printTeacherInfo(Teacher teacher) {}


    public void printStudentInfo(Student student) {}


}
