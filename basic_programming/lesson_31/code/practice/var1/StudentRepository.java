package code.practice.var1;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    List<Student> students;
    private Integer studentCounter = 0;

    public StudentRepository() {
        this.students = new ArrayList<>();
    }

    public Student addStudent(Student student) {
        student.setId(++studentCounter);
        students.add(student);
        return student;
    }

    public List<Student> findAll() {
        return students;
    }

}
