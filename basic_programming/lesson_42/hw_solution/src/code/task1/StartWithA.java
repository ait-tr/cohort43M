package code.task1;


import java.util.Arrays;
import java.util.List;

public class StartWithA {
    public static void main(String[] args) {

        String string1 = "avocado";
        String string2 = "another";
        String string3 = "avenger";
        String string4 = "apartment";
        String string5 = "aalc";

        List<String> strings = Arrays.asList(string1, string2, string3, string4, string5);

        List<String> stringList = strings.stream()
                .filter(x -> x.toUpperCase().startsWith("A"))
                .sorted()
                .toList();

        System.out.println(stringList);
    }
}
