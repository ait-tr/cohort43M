package code.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Task1 {
    /*
    создайте коллекцию которая будет содержать 30 случайных чисел

    напишите метод, который удаляет из этой коллекции все числа, которые больше заданного значения

    при решении задачи НЕ ИСПОЛЬЗОВАТЬ СОЗДАНИЕ НОВОЙ КОЛЛЕКЦИИ

     */

    public static void main(String[] args) {

        Random random = new Random();

        Set<Integer> integers = new HashSet<>();

        for (int i = 0; i < 30; i++) {
            integers.add(random.nextInt(100));
        }

        System.out.println("Original collection: " + integers);

        Integer maxValue = 50;

        removeNumber(integers, maxValue);

        System.out.println("Modified collection: " + integers);

    }

    public static void removeNumber(Set<Integer> ourCollection, Integer maxValue){
        Iterator<Integer> iterator = ourCollection.iterator();

        while (iterator.hasNext()){
            Integer currentElement = iterator.next();
            if (currentElement > maxValue){
                iterator.remove();
            }
        }
    }
}
