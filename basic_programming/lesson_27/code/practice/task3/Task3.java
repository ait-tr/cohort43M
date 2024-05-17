package code.practice.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    /*
    создайте коллекцию для хранения перевода слов
    ключом должно являться английское слово,
    а значением - перевод

    задайте 5 слов с переводом

    выведите словарь на экран
     */

    public static void main(String[] args) {
        // создадим коллекцию для хранения перевода слов

        List<String> englishWord = new ArrayList<>();
        List<String> translation = new ArrayList<>();

        englishWord.add("apple");
        translation.add("яблоко");

        for (int i = 0; i < englishWord.size(); i++) {
            System.out.println("Слово " + englishWord.get(i) + " - перевод: " + translation.get(i));
        }

        // альтернативный вариант

        Map<String , String > dictionary = new HashMap<>();

        // задаем 5 слов с переводом

        dictionary.put("apple", "яблоко");
        dictionary.put("book", "книга");
        dictionary.put("cat", "кошка");
        dictionary.put("dog", "собака");
        dictionary.put("house", "дом");

        System.out.println(dictionary);

    }

}
