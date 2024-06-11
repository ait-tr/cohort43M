package HW_42.task_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringListDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Array list");
        list.add("Array arraylist");
        list.add("New array list");
        list.add("My list");
        list.add("Not list");
        list.add("Error warning");
        list.add("I'm making the array list again");
        list.add("Again and again");

       List<String> listStringWithA = list.stream()
               .filter(s -> s.toLowerCase().startsWith("a"))
               .sorted(String::compareToIgnoreCase)
               .collect(Collectors.toList());

       listStringWithA.forEach(System.out::println);


    }
}
