package Homework;

import java.util.Scanner;

/*
Задача 1
Написать метод, принимающий с клавиатуры положительное число и печатающий затем таблицу умножения для этого числа
( т.е. печатающий произведение этого числа на все числа от 1 до 10).
Использовать в решении цикл for.

Задача 2
Переписать задачу про треугольник из сегодняшнего занятия используя циклы while
 */
public class HW240319 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string number above zero");

        int n = scanner.nextInt();

        multiplyTable(n);

        triangleWithWhile (n);
    }

    public static void multiplyTable (int n){

        if (n > 0) {

            System.out.println("Multiply table of " + n + ":");

            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + n * i);
            }
        }
        else {
            System.out.println("You've entered number below zero");
        }
        System.out.println("________________________");
    }
    public static void triangleWithWhile (int n) {

        System.out.println("The triangle of numbers of " + n + ":");

        int i = 1;

        while (i <= n) {
            int j = 1;

            while (j <=i){
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
