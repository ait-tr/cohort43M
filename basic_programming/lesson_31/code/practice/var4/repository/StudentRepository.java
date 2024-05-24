package code.practice.var4.repository;

import code.practice.var4.entity.Group;
import code.practice.var4.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private List<Student> students;
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

    public List<Student> findStudentByName(String studentName){
        List<Student> studentListByName = new ArrayList<>();
        for (Student student : students){
            if (student.getName().equals(studentName)){
               studentListByName.add(student);
            }
        }
        return studentListByName;
    }


    public List<Student> findStudentByName(String studentName, String groupName){
        List<Student> studentListByName = new ArrayList<>();
        for (Student student : students){
            if (student.getGroup().getGroupId().equals(groupName) && student.getName().equals(studentName)){
                studentListByName.add(student);
            }
        }
        return studentListByName;
    }

    public List<Student> findStudentByName(String studentName, List<Student> studentFromGroup){
        List<Student> studentListByName = new ArrayList<>();

        for (Student student : studentFromGroup){
            if (student.getName().equals(studentName)){
                studentListByName.add(student);
            }
        }
        return studentListByName;
    }


}
