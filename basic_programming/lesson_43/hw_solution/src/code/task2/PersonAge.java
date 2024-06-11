package code.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = 0;

        while (true) {
            System.out.println("Введите возраст пользователя:");

            try {
                age = scanner.nextInt();
                checkPersonAge(age);
                System.out.println("Возраст принят");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Введены некорректные данные. Попробуйте снова");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    static void checkPersonAge(int personAge) {
        if (personAge <= 0) {
            throw new IllegalArgumentException("Возраст должен быть положительным числом больше нуля");
        }
    }
}
