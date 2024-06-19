package code.HW42.Task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("ananas");
        strings.add("Kiwi");
        List<String> startsWithA = strings.stream()
                .filter(string -> string.toLowerCase().startsWith("a"))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        System.out.println("Strings starts with A: " + startsWithA);

    }
}
