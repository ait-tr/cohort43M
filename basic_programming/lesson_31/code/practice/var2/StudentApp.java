package code.practice.var2;

public class StudentApp {
    public static void main(String[] args) {
        StudentRepository repository = new StudentRepository();
        StudentService service = new StudentService(repository);

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

    }
}
