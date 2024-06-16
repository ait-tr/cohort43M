package Homework_43.task1;

import java.util.Scanner;

public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Введите первое число: ");
            double num1 = Double.parseDouble(scanner.nextLine());


            System.out.print("Введите второе число: ");
            double num2 = Double.parseDouble(scanner.nextLine());


            double result = divideNumbers(num1, num2);
            System.out.println("Результат деления: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введено не числовое значение.");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }


    public static double divideNumbers(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        return num1 / num2;
    }
}

