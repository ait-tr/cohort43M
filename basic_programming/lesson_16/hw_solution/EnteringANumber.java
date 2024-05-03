
package Task1;

import java.util.Scanner;

        public class EnteringANumber {
            public static void main(String[] args) {
// if - else
            int number;
            System.out.println("Введите число 1,2 или 3.");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            if (number >= 1 && number <= 3) {
            System.out.println("Вы ввели число: " + number);
            } else System.out.println("Неверный ввод");

//Switch
            int number2;
            do{System.out.println("Введите число 1, 2 или 3.");
            number2 = scanner.nextInt();
            switch (number2) {
            case 1:
            case 2:
            case 3:
            System.out.println("Вы ввели число: " + number2);
            break;
            default:
            System.out.println("Неверный ввод.Введите число 1, 2 или 3.");
            }
            }while (number2<1||number2>3);
        }}