package Homework_30.task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveNegativeNumb {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(-2);
        numbers.add(3);
        numbers.add(-4);
        numbers.add(5);
        numbers.add(-6);


        System.out.println("Исходный список: " + numbers);


        removeNegativeNumbers(numbers);


        System.out.println("Список после удаления отрицательных чисел: " + numbers);
    }

    public static void removeNegativeNumbers(List<Integer> list) {

        Iterator<Integer> iterator = list.iterator();


        while (iterator.hasNext()) {

            Integer number = iterator.next();

            if (number < 0) {
                iterator.remove();
            }
        }
    }
}

