package task4;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RemoveNegativeNumbers {
    public static void main(String[] args) {


        List<Integer> numberList = new ArrayList<>();

        Random random = new Random();

        for ( int i=0; i < 10; i++) {
            numberList.add(random.nextInt(1000)-500);
        }
//        numberList.add(255);
//        numberList.add(-356);
//        numberList.add(456);
//        numberList.add(-134);
//        numberList.add(132);
//        numberList.add(-134);
//        numberList.add(111);
//        numberList.add(0);
//        numberList.add(1435);

        System.out.println("Original list:" + numberList);

        Iterator<Integer> iterator = numberList.iterator();

        while (iterator.hasNext()){
            int number = iterator.next();

            if (number < 0 ) {iterator.remove();}
        }
        System.out.println("List without negative numbers " + numberList);


    }

}
