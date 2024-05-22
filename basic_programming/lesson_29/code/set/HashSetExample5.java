package code.set;

import java.util.*;

public class HashSetExample5 {
    public static void main(String[] args) {
 /*
    Написать программу, которая сравнивает две коллекции Set (множество, набор)
    и выводит на экран:
    - элементы, которые присутствуют ТОЛЬКО в первой коллекции;
    - элементы, которые присутствуют ТОЛЬКО во второй коллекции;
    - элементы, которые присутствуют в обеих коллекциях;
     */

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

        Set<Integer> set2 = new HashSet<>(Arrays.asList(4,5,6,7,8));

        Set<Integer> uniqSet1 = new HashSet<>();

        for (Integer currentElement : set1){
            if (!set2.contains(currentElement)) {
                uniqSet1.add(currentElement);
            }
        }

        Set<Integer> uniqSet2 = new HashSet<>();

        for (Integer currentElement : set2){
            if (!set1.contains(currentElement)) {
                uniqSet2.add(currentElement);
            }
        }

        System.out.println(uniqSet1);
        System.out.println(uniqSet2);

        Set<Integer> commonSet = new HashSet<>();

        for (Integer currentElement : set1){
            if (set2.contains(currentElement)) {
                commonSet.add(currentElement);
            }
        }

        System.out.println(commonSet);

    }
}
