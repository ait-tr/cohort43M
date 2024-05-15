package Work.work2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NumberDemo {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1;
            numbers.add(randomNumber);
        }
        System.out.println(numbers);

         int maxNumber = Collections.max(numbers);
         int minNumber = Collections.min(numbers);

         Collections.sort(numbers);

        System.out.println(numbers);

    }
}

