package code.practice.task1;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {

        String[][] array = new String[][] {
                {"Hello", "world"},
                {"Hello", "Java"},
                {"Hello", "student"},
                {"Welcome","to", "java"}
        };

      //  System.out.println(Arrays.toString(array));


        // задание - создать коллекцию List из всех уникальных слов

        List<String> streamArray = Arrays.stream(array)
                .flatMap(innerArray -> Arrays.stream(innerArray))
                .distinct()
                .map(s -> s.toLowerCase())
                .sorted()
                .toList();

        System.out.println(streamArray);


        long count = Arrays.stream(array)
                .flatMap(Arrays::stream)
                .count();

        long countUniq = Arrays.stream(array)
                .flatMap(Arrays::stream)
                .distinct()
                .count();


    }
}
