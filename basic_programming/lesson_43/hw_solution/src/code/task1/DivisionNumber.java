package code.task1;

import java.util.Scanner;

public class DivisionNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два числа для деления");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        try {
            double result = division(firstNumber, secondNumber);
            System.out.println("Деление произошло успешно " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }
    }

    static double division(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return (double) x / y;
    }
}
