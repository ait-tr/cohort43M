package Homework_43.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeInputApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = -1;

        while (true) {
            try {

                System.out.print("Введите ваш возраст: ");
                age = scanner.nextInt();


                if (age <= 0) {
                    System.out.println("Ошибка: Возраст должен быть положительным числом. Попробуйте снова.");
                    continue;
                }


                break;
            } catch (InputMismatchException e) {

                System.out.println("Ошибка: Введены некорректные данные. Попробуйте снова.");
                scanner.next();
            }
        }


        scanner.close();


        System.out.println("Ваш возраст: " + age);
    }
}

