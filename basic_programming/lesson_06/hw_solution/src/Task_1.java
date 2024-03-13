import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
          /*
        Задача 2
Есть три переменные целого типа. Написать программу, которая сравнивает эти числа
 и выводит на экран результат:

All numbers are equal если они равны
All numbers are different если все они все разные
Some numbers are equal если какие-то из них равны
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number");
        System.out.println("Enter a second number");
        System.out.println("Enter a third number");

        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        int numThree = scanner.nextInt();

        if (numOne == numTwo && numTwo == numThree) {
            System.out.println("All numbers are equal");
        }
         if (numOne != numTwo && numTwo != numThree) {
            System.out.println("All numbers are different");
        }
         if ( numOne == numTwo && numTwo != numThree) {
             System.out.println("Some numbers are equal");
         }
    }
}
