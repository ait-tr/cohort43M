package Homework;

import java.util.Scanner;

public class HW240320 {
    static Scanner scanner = new Scanner(System.in);
    /*
    Задача1
-Cоздать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
-Вывести созданный массив на экран используя цикл for.
-Заменить в созданном массиве значение первого элемента на Kiwi (т.е. присвоить первому элементу значение Kiwi)
-Вывести измененный массив на экран используя цикл for.
Задание можно выполнить непосредственно в методе main, не создавая отдельный метод.

     */
    public static void main(String[] args) {
        String [] fruits = {"Orange", "Apple", "Banana", "Mango"};

        System.out.println("I like this fruits: ");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println("~~~~~");

        fruits [0] = "Kiwi";

        System.out.println("And now with Kiwi instead of an Orange: ");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println("~~~~~");

        System.out.println("Enter the length of array:");
        int n = scanner.nextInt();

        System.out.println("The min element of array is " + findMin (fillingInts(n)));

    }
    /*
    Задача2
Дан массив целых чисел. Написать метод, возвращающий наименьший элемент массива.
public static int findMin(int[] ints)
     */
    public static int findMin(int[] ints) {
        int min = ints [0];
        for (int i = 0; i < ints.length; i++){
            if (ints [i] < min){
                min = ints [i];
            }
        }
        return min;
    }

    public static int[] fillingInts (int n){
        System.out.println("* Filling the \"ints\" array");

        int [] ints = new int [n];

        for (int i = 0; i < ints.length; i++){
            System.out.println("Enter integer element #" + i);
            ints [i] = scanner.nextInt();
        }
        return ints;
    }
}
