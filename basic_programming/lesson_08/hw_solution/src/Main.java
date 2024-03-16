import java.util.Scanner;

public class Main {


       /*
        Используя switch, написать программу, которая в зависимости от ввода
        пользователем цифр от 1 до 7 выводит на экран название соответствующего дня недели.
         */
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number");
            int week = scanner.nextInt();

            System.out.println("\n");

            switch (week){

                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;

                case 3:
                    System.out.println("Wednesday");
                    break;

                case 4:
                    System.out.println("Thursday");
                    break;

                case 5:
                    System.out.println("Friday");
                    break;

                case 6:
                    System.out.println("Saturday");
                    break;

                case 7:
                    System.out.println("Sunday");
                    break;

                default:
                    System.out.println("Please enter from 1 to 7");
            }

        }
}
