package HW_30.task_3;

import java.util.*;

/* Задача 3: Хранение и сортировка имен студентов

  Написать программу, которая принимает список имен студентов
  и хранит их в коллекции в отсортированном виде.
  Программа должна выводить список имен в алфавитном порядке. */

public class StudentsName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имена студентов через запятую: ");
        String input = scanner.nextLine();

        String[] names = input.split(",");

        List<String> studentNames = new ArrayList<>();

        for (String name : names) {

            String trimmedName = name.trim(); // Удаляем лишние пробелы в начале и в конце имени
            studentNames.add(trimmedName);
        }

        Collections.sort(studentNames);

        System.out.println("Отсортированный список имен студентов:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        scanner.close();
    }
}