import Task1.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<Student> students= new ArrayList<>();
        students.add(new Student(1,"Jeff Bridges","Cinema"));
        students.add(new Student(2,"John Johns","MMA"));
        students.add(new Student(3,"Eddie Murphy","Cinema"));
        students.add(new Student(4,"Al Pacino","Cinema"));
        students.add(new Student(5,"Jack London","Literature"));

        System.out.println("Список студентов: ");
        printStudentList(students);

        System.out.println("\nСписок студентов в обратном порядке:");
        printStudentListInReverse(students);

        System.out.println("\nИщем студентов факультета Cinema и выводим на печать: ");
        String facultyToFind = "Cinema";
        List<Student> studentsByFaculty = findStudentsByFaculty(students, facultyToFind);
        printStudentListByFaculty(new ArrayList<>(studentsByFaculty));


        System.out.println("\n Удаляем Эдди Мэрфи.");
        String studentNameToRemove= "Eddie Murphy";
        removeStudentByName(students, studentNameToRemove);

        System.out.println("\n Список студентов после удаления по имени: ");
        printStudentList(students);

        System.out.println("\n Удаляем студента с id 2.");

        Integer studentIdToRemove = 2;
        removeStudentById(students, studentIdToRemove);


        System.out.println("\n Список студентов после удаления по Id: ");
        printStudentList(students);
    }
    public static void printStudentList(ArrayList<Student> students){
        for(Student student: students){
            System.out.println(student);
        }
    }
    public static void printStudentListInReverse(ArrayList<Student> students) {
        for (int i = students.size() - 1; i >= 0; i--) {
            System.out.println(students.get(i));
        }
    }
    public static void printStudentListByFaculty(ArrayList<Student> studentsByFaculty){
        for(Student student: studentsByFaculty){
            System.out.println(student);
        }
    }
    public static void removeStudentByName(ArrayList<Student> students, String name){
        for(int i=0;i< students.size();i++){
            if (students.get(i).getName().equals(name)){
                students.remove(i);
                break;
            }
        }
    }
    public static void removeStudentById(ArrayList<Student> students, Integer id){
        for(int i=0;i< students.size();i++){
            if (students.get(i).getId().equals(id)){
                students.remove(i);
                break;
            }
        }
    }
    public static List<Student> findStudentsByFaculty(ArrayList<Student> students, String faculty) {
        List<Student> studentsByFaculty = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equalsIgnoreCase(faculty)) {
                studentsByFaculty.add(student);
            }
        }
        return studentsByFaculty;
    }

   }
