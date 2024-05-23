package HW_30.task_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Задача 2: Удаление дубликатов из списка с использованием HashSet

Написать программу, которая принимает список целых чисел и удаляет все дубликаты.
Программа должна выводить список уникальных чисел.
 */

public class RemoveDuplicates {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Program menu:");
            System.out.println("1. Show unique numbers");
            System.out.println("2. Exit");
            System.out.print("Choose an option (1 or 2 ) or enter a number: ");

            String userInputStr = scanner.nextLine();

            try {
                int userChoice = Integer.parseInt(userInputStr);
                if (userChoice == 1) {
                    System.out.println("Unique numbers:");
                    for (Integer currentNumber : numbers) {
                        System.out.println(currentNumber);
                    }
                } else if (userChoice == 2) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    // Это число, которое нужно добавить в набор
                    if (numbers.add(userChoice)) {
                        System.out.println("Your number was added.");
                    } else {
                        System.out.println("Your number already exists.");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or choose an option from the menu.");
            }
        }

        scanner.close();
    }
}
