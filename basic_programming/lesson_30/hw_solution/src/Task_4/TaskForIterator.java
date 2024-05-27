package Task_4;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TaskForIterator {
    //Задача 4:
    //Удаление отрицательных чисел из списка
    //Написать программу, которая создает список целых чисел, в том числе и отрицательных,
    // а затем удаляет из него все отрицательные числа, используя Iterator.
    public static void main(String[] args) {

        List<Integer> integersList = new ArrayList<>();

        integersList.add(5);
        integersList.add(-3);
        integersList.add(-7);
        integersList.add(0);
        integersList.add(8);
        integersList.add(-1);
        integersList.add(12);

        System.out.println("Исходный список целых чисел" + integersList);

        Iterator<Integer> iterator = integersList.iterator();
        while (iterator.hasNext()){
        Integer currentElement = iterator.next();
        if(currentElement < 0){
            iterator.remove();
        }
        }
        System.out.println("Список после удаления отрицательных чисел: " + integersList);
    }

}
