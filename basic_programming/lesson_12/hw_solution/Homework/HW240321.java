package Homework;

import java.util.Arrays;

public class HW240321 {
    /*
    Задача1
Используя цикл for вывести на экран все нечетные элементы массива fruits из первой задачи дз предыдущего занятия.
Задание можно выполнить непосредственно в методе main либо создать отдельный метод.

Задача2
Есть массив целых чисел. Написать метод, находящий и возвращающий количество четных чисел в этом массиве.
Пример: {1, 2, 8, 7} -> количество четных чисел = 2.
     */
    public static void main(String[] args) {

        String [] fruits = {"Orange", "Apple", "Banana", "Mango"};
        for (int j = 1; j < fruits.length; j += 2){
            System.out.println(fruits[j]);
        }


        int [] array = {12,4,5,6,8,80};
        System.out.println("Amount of Evens in array " + Arrays.toString(array) + " is " + amountOfEven(array));

    }
// Задача 2
    public static int amountOfEven (int [] array) {
        int amount = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                amount++;
            }
        }

        return amount;
    }
}
