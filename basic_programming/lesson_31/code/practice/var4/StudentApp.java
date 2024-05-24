package code.practice.var4;

import code.practice.var4.entity.Student;
import code.practice.var4.repository.GroupRepository;
import code.practice.var4.repository.StudentRepository;
import code.practice.var4.service.GroupService;
import code.practice.var4.service.StudentService;

public class StudentApp {
    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        GroupRepository groupRepository = new GroupRepository();
        GroupService groupService = new GroupService(groupRepository);
        StudentService service = new StudentService(repository,groupService);

        Student student1 = service.addNewStudent("Ruslan", "41M");
        Student student2 = service.addNewStudent("Olga", "41M");
        Student student3 = service.addNewStudent("Victor", "40.1M");
        Student student4 = service.addNewStudent("Roman", "41M");
        Student student5 = service.addNewStudent("Alex", "40.1M");
        Student student6 = service.addNewStudent("Inga", "40.1M");
        Student student7 = service.addNewStudent("Alena", "43M");
        Student student8 = service.addNewStudent("Natali", "43M");
        Student student9 = service.addNewStudent("Denis", "43M");
        Student student10 = service.addNewStudent("Vlad", "43M");
        Student student11 = service.addNewStudent("Anna", "43M");

        System.out.println(service.findAllStudents());

        System.out.println("Поиск по группе 43M");
        System.out.println(service.findByGroupName("43M"));

        System.out.println("Поиск студента по имени");
        System.out.println(service.findByStudentName("Denis"));


    }
}
