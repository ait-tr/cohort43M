package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Task5 {

        public static void main(String[] args) {
            List<String> strings = new ArrayList<>();
            strings.add("I love Java programming");
            strings.add("Java is super");
            strings.add("Java and Python are popular languages");
            strings.add("Learning Java is fun");

            System.out.println("Original list: " + strings);

            // Использование Iterator для замены подстроки "Java" на "Kotlin"
             ListIterator<String> iterator = strings.listIterator();

            while (iterator.hasNext()) {
                String currentString = iterator.next();
                if (currentString.contains("Java")) {
                    String modifiedString = currentString.replace("Java", "Kotlin");
                    iterator.set(modifiedString);
                }
            }

            System.out.println("Modified list: " + strings);
        }
}
