package task2;

//Удаление дубликатов из списка с использованием HashSet
//Написать программу, которая принимает список целых чисел и удаляет все дубликаты. Программа должна выводить список уникальных чисел.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);

        System.out.println(numbers);

        Set<Integer> uniqnumbers = new HashSet<>(numbers);
        System.out.println(uniqnumbers);





    }
}
