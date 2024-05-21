package code.hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DictionaryApp {
    private static HashMap<String, ArrayList> dictionary = new HashMap<>();

    public static void main(String[] args) {
        addTranslation("hi", "привет");
        addTranslation("hello", "здравствуйте");
        addTranslation("book", "книга");
        addTranslation("computer", "компьютер");
        addTranslation("apple", "яблоко");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите английское слово: ");
        String word = scanner.nextLine();

        if (dictionary.containsKey(word)) {
            System.out.println("Переводы для слова \"" + word + "\":");
            for (Object translation : dictionary.get(word)) {
                System.out.println("- " + translation);
            }
        } else {
            System.out.println("Перевод для слова \"" + word + "\" не найден.");
        }
    }
    private static void printDictionary() {
        for (int i = 0; i < dictionary.size(); i++) {
            System.out.println(dictionary.get(i));
        }
    }
    private static void addTranslation(String englishWord, String translation) {
        ArrayList<String> translations = dictionary.getOrDefault(englishWord, new ArrayList<>());
        translations.add(translation);
        dictionary.put(englishWord, translations);
    }
}