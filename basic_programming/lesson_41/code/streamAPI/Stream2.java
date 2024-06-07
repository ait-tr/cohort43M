package code.streamAPI;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {
        Integer[] arr = {50,60,70,80,90,100,110,120};

        // вывести числа, которые больше или равны 90
        // при этом каждое из них увеличить на 10
        // из них взять только первые три

        System.out.println("С помощью циклов:");

        int counter = 0;

        for (int x : arr){
            if (x >= 90){
                x = x + 10;
                counter++;
                if (counter > 3) break;
                System.out.println(x);
            }
        }

        System.out.println();

        System.out.println("Делаем с помощью Stream API: ");

        //IntStream.of(50,60,70,80,90,100,110,120)

        Stream<Integer> myStream = Arrays.stream(arr);

        myStream
                .filter(x -> x >= 90)
                .map(x -> x + 10)
                .limit(3)
                .forEach(x -> System.out.println(x));


    }
}
