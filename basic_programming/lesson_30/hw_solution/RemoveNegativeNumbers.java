package homework_30Numbers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RemoveNegativeNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        Random random = new Random();
        int min = -10;
        int max = 10;

        for (int i = 0; i < 10; i++){
            int number = random.nextInt(max - min + 1) + min;
            numbers.add(number);
        }
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            Integer number = iterator.next();
            if(number < 0){
                iterator.remove();
            }
        }
        System.out.println(" List without negative numbers : " + numbers);



    }
}
