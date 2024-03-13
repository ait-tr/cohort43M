import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Task 1
        Есть две переменные целого типа.
        Написать программу, выводящую на экран сумму их значений,
        а в том в случае, если эти числа равны, должна выводиться двойная сумма.
Пример: 1 + 2 -> 3
3 + 2 -> 5
2 + 2 -> 8
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print( "Enter digit: ");
        int a = scanner.nextInt();

        System.out.println("Enter digit: ");
        int b = scanner.nextInt();

        if (a == b) {
            int doubleSum = (a+b) *2;
            System.out.println("Sum of doubled digit " + doubleSum);
        } else {
            int sum = a+b;
            System.out.println("Sum of a and b is " + sum);
        }


/* Task 2
Есть три переменные целого типа.
Написать программу, которая сравнивает эти числа и выводит на экран результат:

All numbers are equal если они равны
All numbers are different если все они все разные
Some numbers are equal если какие-то из них равны
 */


        int num1 = 6;
        int num2 = 6;
        int num3 = 4;

        if( num1 == num2 && num2 == num3 && num1 == num3 ){
            System.out.println("All numbers are equal");
        }
        else if (num1 != num2 && num2 != num3 && num1 != num3){
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Some numbers are equal");
        }



    }
}
