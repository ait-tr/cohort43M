package homework_25.No_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NumberList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++){
            numbers.add(rand.nextInt(101));
        }
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);


    }

}
