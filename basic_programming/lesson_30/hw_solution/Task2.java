package code.HomeWork.Task2;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
//    Задача 2: Удаление дубликатов из списка с использованием HashSet.
//    Написать программу, которая принимает список целых чисел и удаляет все дубликаты.
//    Программа должна выводить список уникальных чисел.

    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(2);
        integers.add(4);
        integers.add(43);
        integers.add(5);
        integers.add(1);
        integers.add(5);
        integers.add(43);
        System.out.println(integers);
    }



}
