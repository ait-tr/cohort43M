package code.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("10","20","1","10","50","25","20","25","10");

        System.out.println(strings);


      // anyMatch


        System.out.println("anyMatch() result: " +
                strings.stream()
                        .filter(x -> Integer.parseInt(x) >= 10)
   //                     .toList());
                        .anyMatch(x -> x.equals("10")));


        // allMatch


        System.out.println("allMatch() result: " +
                strings.stream()
                        .filter(x -> Integer.parseInt(x) > 10)
                        //.toList());
                        .allMatch(x -> x.equals("10")));




    }
}
