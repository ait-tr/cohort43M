package code;

import java.util.*;

public class Task5VerSet {

        public static void main(String[] args) {
            Set<String> strings = new HashSet<>();
            strings.add("I love Java programming");
            strings.add("Java is super");
            strings.add("Java and Python are popular languages");
            strings.add("Learning Java is fun");

            System.out.println("Original list: " + strings);

            // Использование Iterator для замены подстроки "Java" на "Kotlin"
             Iterator<String> iterator = strings.iterator();
             Set<String> newStrings = new HashSet<>();

            while (iterator.hasNext()) {
                String currentString = iterator.next();
                if (currentString.contains("Java")) {
                    String modifiedString = currentString.replace("Java", "Kotlin");
                    newStrings.add(modifiedString);
                } else {
                    newStrings.add(currentString);
                }
            }

            System.out.println("Modified list: " + newStrings);
        }
}
