package code.streamExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("BigBen", "BigBob", "Big", "BigMagic", "Big Ben", "Ben");

        System.out.println(
                list.stream()
                        .filter(s -> s.contains("Big"))
                        .count()
        );

        // ------------------------------

        List<String> list2 = Arrays.asList("a1", "b5","a2","b4","c1","a1","b5");

        // отсортировать, убрать дубликаты

        List<String> result = list2.stream()
                .sorted()
                .distinct()
                .toList();

        System.out.println(result);


        List<String> resultAnotherSorted = list2.stream()
                .sorted((s1,s2) -> s2.compareTo(s1))
                //.sorted(Comparator.reverseOrder())
                //.sorted((s1,s2) -> (-1) * s1.compareTo(s2))
                .distinct()
                .toList();

        System.out.println(resultAnotherSorted);


    }
}
