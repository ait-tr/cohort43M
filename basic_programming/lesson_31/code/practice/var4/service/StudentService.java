package code.practice.var4.service;

import code.practice.var4.entity.Group;
import code.practice.var4.entity.Student;
import code.practice.var4.repository.StudentRepository;

import java.util.List;

public class StudentService {

    StudentRepository repository;
    GroupService groupService;

    public StudentService(StudentRepository repository, GroupService groupService) {
        this.repository = repository;
        this.groupService = groupService;
    }

    public Student addNewStudent(String studentName, String studentGroup){
        Group group = groupService.findGroupByName(studentGroup);

        if (group == null) {
            group = groupService.addNewGroup(studentGroup);
        }

        Student newStudent = new Student(0, studentName, group);
        Student savedStudent = repository.addStudent(newStudent);
        groupService.addNewStudentToGroup(studentGroup, savedStudent);
        return savedStudent;
    }

    public List<Student> findAllStudents(){
        return repository.findAll();
    }

    public List<Student> findByGroupName(String group){
        return groupService.findStudentsByGroupName(group);
    }

    public List<Student> findByStudentName(String studentName){
        return repository.findStudentByName(studentName);
    }


}
