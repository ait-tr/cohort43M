import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentManager {
    private static HashMap<Integer, Student> studentList;

    public StudentManager() {
        this.studentList = new HashMap<>();
    }

    public void addStudent(Student student) {
        studentList.put(student.getId(), student);
    }

    public void removeStudent(Student student) {
        studentList.remove(student.getId());
    }

    public Student findByStudentId(int id) {
        if (studentList.containsKey(id)){
            System.out.println("Студент успешно найден");

            return studentList.get(id);
        }
        return null;
    }

    public void addCourseToStudent(Course course, Student student) {

        List<Student> studentList1 = course.getStudent();
        if (studentList1 == null) {
            studentList1 = new ArrayList<>();
        }
        studentList1.add(student);
        course.setStudent(studentList1);

        List<Course> courseList = student.getCourses();
        if (courseList == null) {
            courseList = new ArrayList<>();
        }
        courseList.add(course);
        student.setCourses(courseList);
    }


    public void toString1() {
       for (Student student : studentList.values()){
           System.out.println(student);
       }
    }

}
