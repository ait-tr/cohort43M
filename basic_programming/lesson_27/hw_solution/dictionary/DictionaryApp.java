package Homework_27.dictionary;

import java.util.List;
import java.util.Scanner;

public class DictionaryApp {
    public static void main(String[] args) {
        TranslationDictionary dictionary = new TranslationDictionary();


        dictionary.addTranslation("apple", "яблоко");
        dictionary.addTranslation("apple", "яблочко");
        dictionary.addTranslation("book", "книга");
        dictionary.addTranslation("car", "машина");
        dictionary.addTranslation("car", "автомобиль");
        dictionary.addTranslation("dog", "собака");
        dictionary.addTranslation("cat", "кот");
        dictionary.addTranslation("cat", "кошка");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an English word to get its translations: ");
        String word = scanner.nextLine();


        List<String> translations = dictionary.getTranslations(word);
        if (translations.isEmpty()) {
            System.out.println("No translations found for the word: " + word);
        } else {
            System.out.println("Translations for the word '" + word + "': " + translations);
        }

        scanner.close();
    }
}
