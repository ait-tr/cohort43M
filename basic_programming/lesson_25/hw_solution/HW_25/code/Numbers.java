package code;

import java.util.ArrayList;
import java.util.Random;

public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 17; i++) {
            int randomNumber = random.nextInt(100) + 1;
            numbers.add(randomNumber);
        }

        System.out.println("Initial numbers list:  " + numbers);

        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int number : numbers){
            if (number > maxNumber){
                maxNumber = number;
            }
            if (number < minNumber){
                minNumber = number;
        }
            }
    numbers.sort(null);

        System.out.println("Sorted numbers list:  " + numbers);

    }
}
