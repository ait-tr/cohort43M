package code.streamExample;

import java.util.*;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        System.out.println(numbers);

        // создать коллекцию из квадратов значений

        // oldSchool

        List<Integer> squareList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            squareList.add(numbers.get(i) * numbers.get(i));
        }

        System.out.println(squareList);

        // stream
        List<Integer> squareListStream = numbers.stream()
                .map(x -> x * x)
                .toList();

        System.out.println(squareListStream);

        // --------- task 2 -------

        List<String> word = Arrays.asList("Java", "Collection", "Stream", "Array", "System");

        List<String> result = word.stream()
                .filter(s -> s.startsWith("S"))
                .toList();

        System.out.println(result);


        // ---------- task 3  -------

        List<Integer> numbers2 = Arrays.asList(2,3,4,5,2,4);

        System.out.println(numbers2);

        List<Integer> uniqSquare = numbers2.stream()
                .distinct()
                .map(x -> x * x)
                .toList();

        System.out.println(uniqSquare);

        // --- второй вариант ----

        Set<Integer> uniqSquareSet = numbers2.stream()
                .map(x -> x * x)
                .collect(Collectors.toSet());

        System.out.println(uniqSquareSet);

        List<Integer> listFromSet = new ArrayList<>(uniqSquareSet);
        Collections.sort(listFromSet);

        System.out.println(listFromSet);


        List<Integer> listFromSetStream = uniqSquareSet.stream()
                .sorted()
                .toList();

        System.out.println(listFromSetStream);

    }
}
