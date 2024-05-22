package code.setClassic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample5var3 {
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

        Set<Integer> uniqSet1 = new HashSet<>(set1);

        Set<Integer> uniqSet2 = new HashSet<>(set2);

        Set<Integer> commonSet = new HashSet<>();

        uniqSet1.removeAll(set2);
        uniqSet2.removeAll(set1);

        commonSet.addAll(set1);
        commonSet.retainAll(set2);

        System.out.println(uniqSet1);
        System.out.println(uniqSet2);
        System.out.println(commonSet);
    }
}
