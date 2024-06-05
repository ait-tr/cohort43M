package Homework_39.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {

        ListMerger<Integer> listMerger = (list1, list2) -> {
            List<Integer> mergedList = new ArrayList<>(list1);
            mergedList.addAll(list2);
            return mergedList;
        };


        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(5, 6, 7, 8);


        List<Integer> mergedList = listMerger.merge(list1, list2);


        System.out.println("Объединенный список: " + mergedList);
    }
}
