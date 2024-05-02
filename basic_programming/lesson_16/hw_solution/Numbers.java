package Task1;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите число от 1 до 3");
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Вы ввели число 1.");
        } else if (number == 2) {
            System.out.println("Вы ввели число 2.");
        } else if (number == 3) {
            System.out.println("Вы ввели число 3.");
        } else {
            System.out.println("Вы ввели неправильное число. Пожалуйста, введите число от 1 до 3.");
        }

        scanner.close();
    }
}
/*
Scanner scanner = new Scanner(System.in);
System.out.println("Пожалуйста, введите число от 1 до 3:");
int number = scanner.nextInt();
switch (number) {
            case 1:
                System.out.println("Вы ввели число 1.");
                break;
            case 2:
                System.out.println("Вы ввели число 2.");
                break;
            case 3:
                System.out.println("Вы ввели число 3.");
                break;
            default:
                System.out.println("Вы ввели неправильное число. Пожалуйста, введите число от 1 до 3.");
        }

        scanner.close();
    }
    }
 */


