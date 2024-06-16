package Homework_43.task3;

import java.util.Scanner;

public class NumberParsingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {

                System.out.print("Введите строку, которую нужно преобразовать в целое число: ");
                String input = scanner.nextLine();


                number = Integer.parseInt(input);


                validInput = true;
            } catch (NumberFormatException e) {

                System.out.println("Ошибка: Введенная строка не может быть преобразована в целое число. Попробуйте снова.");
            }
        }


        scanner.close();


        System.out.println("Преобразованное целое число: " + number);
    }
}
