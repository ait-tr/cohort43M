import java.util.Scanner;

public class Homework {

    /*
    Задача 1
Написать метод, принимающий с клавиатуры положительное число и печатающий затем
таблицу умножения для этого числа ( т.е. печатающий произведение этого числа на все числа от 1 до 10).
Использовать в решении цикл for.
     */
    public static void main(String[] args) {
        //   printTableForNumber();
        //   printTriangle(6);
        printTriangleWhile(6);
    }

    public static void printTableForNumber() {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Enter a number");

        num = sc.nextInt();

        System.out.println("Multiplication table of " + num);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + " = " + (num * i));
        }
    }

    /*
    Задача 2
Переписать задачу про треугольник из сегодняшнего занятия используя циклы while
     */

    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printTriangleWhile(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
