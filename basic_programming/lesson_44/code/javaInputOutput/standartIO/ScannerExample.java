package code.javaInputOutput.standartIO;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите число как 'текст':");
            String doubleAsText = scanner.nextLine();
            System.out.println("Ваше число как текст : " + doubleAsText);

            Double doubleAsDouble = Double.parseDouble(doubleAsText);

            System.out.println("Ваше число как число : " + doubleAsDouble);

            System.out.println("Введите число:");
            double number1 = scanner.nextDouble();
            System.out.println("Ваше число : " + number1);
        } finally {
            scanner.close();
        }
    }

}
