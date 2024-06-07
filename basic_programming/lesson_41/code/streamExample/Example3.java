package code.streamExample;

import java.util.Arrays;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("a1", "a5","a2","a4","a1","a10","a15");


        String firstElement = list.stream()
                .findFirst()
                .orElse("Empty collection");

        System.out.println("First element: " + firstElement);


        // как получить последний элемент?

        String last = list.stream()
                .skip(list.size() - 1)
                .findFirst()
                //.findAny()
                .orElse("Empty collection");
        System.out.println("Last element: " + last);

        // как найти нужный элемент

        String searchElement = "a5";

        String foundedElement = list.stream()
                .filter(s -> s.equals(searchElement))
                .findFirst()
                .orElseGet(() -> "Nothing");

        System.out.println("Элемент поиска " + searchElement + " : " + foundedElement);
    }
}
