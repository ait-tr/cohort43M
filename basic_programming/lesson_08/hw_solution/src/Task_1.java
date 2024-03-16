import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7");
        int day = scanner.nextInt();

        switch (day) {

            case 1:
                System.out.println("Today is Monday");
                break;

            case 2:
                System.out.println("Today is Tuesday");
                break;

            case 3:
                System.out.println("Today is Wednesday");
                break;

            case 4:
                System.out.println("Today is Thursday");
                break;

            case 5:
                System.out.println("Today is Friday");
                break;

            case 6:
                System.out.println("Today is Saturday");
                break;

            case 7:
                System.out.println("Today is Sunday");
                break;

            default:
                System.out.println("Enter another number");

        }
    }

}

/*
Задача 1
Используя switch, написать программу, которая в зависимости
от ввода пользователем цифр от 1 до 7 выводит на экран название соответствующего дня недели.

 */