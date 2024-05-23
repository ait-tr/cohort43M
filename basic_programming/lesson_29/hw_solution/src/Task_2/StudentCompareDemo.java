package Task_2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StudentCompareDemo {
    public static void main(String[] args) {
        // Создание компараторов
        Comparator<Student> rollComparator = new StudentRollComparator();
        Comparator<Student> nameComparator = new StudentNameComparator();

        // Коллекция с сортировкой по roll
        Set<Student> studentsSortedByRoll = new TreeSet<>(rollComparator);

        // Коллекция с сортировкой по name
        Set<Student> studentsSortedByName = new TreeSet<>(nameComparator);

        // Добавление студентов в коллекции
        studentsSortedByRoll.add(new Student(3, "John"));
        studentsSortedByRoll.add(new Student(1, "Mike"));
        studentsSortedByRoll.add(new Student(2, "Bob"));

        studentsSortedByName.add(new Student(3, "John"));
        studentsSortedByName.add(new Student(1, "Mike"));
        studentsSortedByName.add(new Student(2, "Bob"));

        // Вывод студентов, отсортированных по roll
        System.out.println("Students sorted by roll:");
        for (Student student : studentsSortedByRoll) {
            System.out.println(student);
        }

        // Вывод студентов, отсортированных по name
        System.out.println("Students sorted by name:");
        for (Student student : studentsSortedByName) {
            System.out.println(student);
        }
    }
}
