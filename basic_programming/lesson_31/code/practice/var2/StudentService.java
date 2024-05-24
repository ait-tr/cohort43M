package code.practice.var2;

import java.util.List;

public class StudentService {

    StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student addNewStudent(String studentName, String studentGroup){
        Student newStudent = new Student(0, studentName, studentGroup);
        Student savedStudent = repository.addStudent(newStudent);
        return savedStudent;
    }

    public List<Student> findAllStudents(){
        return repository.findAll();
    }

    public List<Student> findByGroupName(String group){
        return repository.findByGroup(group);
    }

}
