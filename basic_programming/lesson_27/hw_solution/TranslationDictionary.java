package homeWork;

import java.util.HashMap;
import java.util.Scanner;

public class TranslationDictionary {
    private HashMap<String, String[]> dictionary;

    public TranslationDictionary() {
        this.dictionary = new HashMap<>();
    }

    public void addTranslation(String english, String... translations) {
        dictionary.put(english, translations);
    }

    public String[] getTranslation(String english) {
        return dictionary.get(english);
    }

    public static void main(String[] args) {
        TranslationDictionary dict = new TranslationDictionary();
        dict.addTranslation("house", "дом");
        dict.addTranslation("car", "автомобиль");
        dict.addTranslation("cat", "кошка");
        dict.addTranslation("dog", "собака");
        dict.addTranslation("book", "книга");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово на английском: ");
        String input = scanner.nextLine();

        String[] translations = dict.getTranslation(input);
        if (translations != null) {
            System.out.println("Перевод слова " + input + ":");
            for (String translation : translations) {
                System.out.println("- " + translation);
            }
        } else {
            System.out.println("Перевод для слова " + input + " не найден");
        }
    }
}
