package code.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Stream6 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("10","20","1","10","50","25","20","25","10");

        System.out.println(strings);


     // min

        System.out.println("min() result: " +
                strings.stream()
                        .min((str1,str2) -> str1.compareTo(str2))
        );

        // max for String

        System.out.println("max() result: " +
                strings.stream()
                        .max((str1,str2) -> str1.compareTo(str2))
                        .orElse("empty")
        );


        //forEach терминальный метод, который применит функцию ко всем элементам потока
        //но НЕ МОЖЕТ гарантировать порядок выполнения

        System.out.println("Result forEach(): ");
        strings.stream()
                .forEach(elem -> System.out.print(elem + ", "));


        System.out.println();

        // toArray

        String[] stringsArray = strings.stream()
                .toArray(size -> new String[size]);

        System.out.println(Arrays.toString(stringsArray));


        // reduce (аккумулятор)

        System.out.println("Result of string reduce: " +
                strings.stream()
                        .reduce((acc, elem) -> acc + "; " + elem)
                        .orElse("empty")
        );
/*

        алгоритм работы :

        String acc = "";

        for (String str : strings) {
            acc = acc + "; " + str;
        }
        System.out.println(acc);

 */

        List<Integer> integers = Arrays.asList(1,2,3,4,5);


        System.out.println("Result of integer reduce: " +
                integers.stream()
                        .reduce((acc, elem) -> acc + elem)
                        .orElse(0)
        );

    }
}
