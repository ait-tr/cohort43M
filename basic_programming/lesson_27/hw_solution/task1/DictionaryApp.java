package homework.task1;

import java.util.List;
import java.util.Scanner;

public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        dictionary.addTranslation("apple", "яблоко");
        dictionary.addTranslation("banana", "банан");
        dictionary.addTranslation("orange", "апельсин");
        dictionary.addTranslation("grape", "виноград");
        dictionary.addTranslation("watermelon", "арбуз");
        dictionary.addTranslation("leap", "прыгать");
        dictionary.addTranslation("leap", "скакать");
        dictionary.addTranslation("leap", "ухватить");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово на английском: ");
        String word = scanner.nextLine();

        List<String> translations = dictionary.getTranslations(word);
        if (translations.isEmpty()) {
            System.out.println("Переводы не найдены.");
        } else {
            System.out.println("Переводы для слова '" + word + "': " + translations);
        }
    }
}
