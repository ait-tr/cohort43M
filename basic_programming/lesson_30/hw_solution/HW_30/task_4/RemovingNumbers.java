package HW_30.task_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
/*
Задача 4: Удаление отрицательных чисел из списка

Написать программу, которая создает список целых чисел, в том числе и отрицательных,
а затем удаляет из него все отрицательные числа, используя Iterator.
 */

public class RemovingNumbers {

        public static void main(String[] args) {
            List<Integer> integerList = new ArrayList<>();
            Random random = new Random();

            for (int i = 0; i < 20; i++) {
                integerList.add(random.nextInt(40));
            }

            System.out.println(integerList);
            removeNegativeNumbers(integerList);
            System.out.println(integerList);
        }

        public static void removeNegativeNumbers(List<Integer> integerList){
            Iterator<Integer> integerIterator = integerList.iterator();
            while (integerIterator.hasNext()){
                Integer number = integerIterator.next();
                if (number %2 == 1){
                    integerIterator.remove();
                }
            }
        }
    }

