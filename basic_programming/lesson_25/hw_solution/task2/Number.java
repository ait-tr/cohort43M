package homework.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Number {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 5; i++){
            numbers.add(random.nextInt(100) +1);
        }

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);

        Collections.sort(numbers);

        System.out.println(numbers);
        
    }
}
