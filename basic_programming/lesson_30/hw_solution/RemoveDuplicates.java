package Homework_30.task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);


        System.out.println("Исходный список: " + numbers);


        List<Integer> uniqueNumbers = removeDuplicates(numbers);


        System.out.println("Список уникальных чисел: " + uniqueNumbers);
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {

        Set<Integer> set = new HashSet<>(list);


        return new ArrayList<>(set);
    }
}

