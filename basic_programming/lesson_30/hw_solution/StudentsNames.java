package Homework_30.task3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
//Задача 3: Хранение и сортировка имен студентов
//
//Написать программу, которая принимает список имен студентов и хранит их в коллекции
// в отсортированном виде. Программа должна выводить список имен в алфавитном порядке.
public class StudentsNames {
    public static void main(String[] args) {

        Set<String> studentNames = new TreeSet<>();


        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите количество студентов:");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Введите имена студентов:");
        for (int i = 0; i < numberOfStudents; i++) {
            String name = scanner.nextLine();
            studentNames.add(name);
        }


        System.out.println("Имена студентов в алфавитном порядке:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}
