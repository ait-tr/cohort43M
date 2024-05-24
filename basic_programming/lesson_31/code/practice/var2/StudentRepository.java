package code.practice.var2;

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

    public List<Student> findByGroup(String group){
        List<Student> studentsByGroup = new ArrayList<>();

        for (Student student : students){
            String currentStudentGroup = student.getGroup();

            if (currentStudentGroup.equals(group)){
                studentsByGroup.add(student);
            }
        }

        return studentsByGroup;

    }
}
