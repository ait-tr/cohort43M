package code.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream4 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("10","20","1","10","50","25","20","25","10");

        System.out.println(strings);

        List<Integer> integers = Arrays.asList(1,2,3,4,5);


        // find first

        System.out.println("Get find first element : " +
                integers.stream()
                        .findFirst()
                        .orElseGet(() -> 0));

        System.out.println("Get find first element : " +
                strings.stream()
                        .sorted()
                        .findFirst()
                        .orElseGet(() -> "empty"));


        // collect

        System.out.println("Collect.toSet() result: " +
                strings.stream()
                        .collect(Collectors.toSet()));

        System.out.println("Collect.toList() result: " +
                strings.stream()
                        .distinct()
                        .collect(Collectors.toList()));


        // count

        System.out.println("Count() result: " +
                strings.stream()
                        .count());



    }
}
