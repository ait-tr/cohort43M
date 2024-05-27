package Task_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task_2 {
    public static void main(String[] args) {
        //Задача 2: Удаление дубликатов из списка с использованием HashSet
        //
        //Написать программу, которая принимает список целых чисел и удаляет все дубликаты.
        //Программа должна выводить список уникальных чисел.

        List<Integer> integersList = new ArrayList<>();

        integersList.add(5);
        integersList.add(13);
        integersList.add(17);
        integersList.add(0);
        integersList.add(8);
        integersList.add(11);
        integersList.add(12);
        integersList.add(17);
        integersList.add(0);
        integersList.add(8);

        System.out.println("список целых чисел: " + integersList);

        Set<Integer> integerSet = new HashSet<>(integersList);

        System.out.println("список уникальных чисел: " + integerSet);
    }
}
