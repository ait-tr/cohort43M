package code.javaInputOutput.standartIO;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите число как 'текст':");
        String doubleAsText = scanner.nextLine();
        System.out.println("Ваше число как текст : " + doubleAsText);


        scanner.close();


        scanner = new Scanner(System.in); // НЕ РАБОТАЕТ ВТОРОЙ РАЗ

        System.out.println("Введите число:");
        double number1 = scanner.nextDouble();
        System.out.println("Ваше число : " + number1);

        scanner.close();

    }

}
