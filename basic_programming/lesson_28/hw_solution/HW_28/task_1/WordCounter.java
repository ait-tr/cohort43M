package task_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        Map<String, Integer> wordCounter = countWords(input);

        for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordNumber = new HashMap<>();
        String[] words = input.toLowerCase().split("\\s");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordNumber.put(word, wordNumber.getOrDefault(word, 0) + 1);
            }
        }
        return wordNumber;
    }
}




