package code.methodReference;

import java.util.Arrays;
import java.util.List;

public class MethodRef {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one","two","three");

        strings.forEach(element -> System.out.print(element + ", "));

        strings.forEach(element -> System.out.println(element));

        strings.forEach(System.out::println);
    }
}
