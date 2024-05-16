package code.hw.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListInt {
    public static void main(String[] args) {
        ArrayList<Integer> repositoryInt = new ArrayList<>();
        repositoryInt.add(124);
        repositoryInt.add(554);
        repositoryInt.add(268);
        repositoryInt.add(538);
        repositoryInt.add(654);

        for (Integer num : repositoryInt) {
            System.out.println(num);
        }
        System.out.println("Max number is: ");
        int maxNumber = 0;
        int minNumber = 999999998;
        for (Integer num : repositoryInt) {
            if (maxNumber < num) {
                maxNumber = num;
            }
        }
        System.out.println(maxNumber);
        System.out.println("Min number is: ");
        for (Integer num : repositoryInt) {
            if (minNumber > num) {
                minNumber = num;
            }
        }
        System.out.println(minNumber);
        System.out.println("Sorted list: ");
        Collections.sort(repositoryInt);
        for (int num: repositoryInt){
            System.out.println(num);
        }
    }
}
