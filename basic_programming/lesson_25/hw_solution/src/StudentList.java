import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        System.out.println(students);
        System.out.println(students.size());

        students.add(new Student(01, "Pavel"));
        students.add(new Student(02, "Egor"));
        students.add(new Student(03,"Alex"));
        students.add(new Student(04, "Max"));
        students.add(new Student(05,"Irina"));

        for (int i = 0; i < students.size(); i++) {

            System.out.println(students.get(i).toString());
        }
        System.out.println("Распечатать в обратном порядке студентов");

        for (int i = (students.size() - 1); i >= 0; i--) {

            System.out.println(students.get(i).toString());
        }
        System.out.println("Удалить студента из списка по индексу и выведите обновленный список");

        students.remove(3);

        for (int i = 0; i < students.size(); i++) {

            System.out.println(students.get(i).toString());
        }

    }
}
