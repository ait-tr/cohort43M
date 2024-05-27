package code.Hw.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task5 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("I like apples");
        strings.add("Green apple");
        strings.add("Red graped");
        strings.add("Orange juice");

        System.out.println("Original list: " + strings);
        ListIterator<String> iterator = strings.listIterator();

        while (iterator.hasNext()){
            String currentString = iterator.next();
            if (currentString.contains("apple")){
                String newString = currentString.replace("apple", "orange");
                iterator.set(newString);
            }
        }
        System.out.println("Modified list: " + strings);
    }
}
