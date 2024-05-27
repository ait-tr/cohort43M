package Task_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_1 {
    //Задача 1: Подсчет частоты слов
    //
    //Написать программу, которая считывает текст (например, строку), разбивает его на слова
    // и подсчитывает частоту каждого слова. Программа должна выводить количество вхождений каждого слова.
    public static void main(String[] args) {

        String text = "В Java, `enum` (или перечисление) используется для определения коллекции именованных констант. " +
                "Эти константы могут быть примитивными значениями или комплексными объектами. Использование `enum` " +
                "в Java помогает сделать код более читаемым и безопасным, поскольку оно ограничивает возможные значения " +
                "переменной до предопределённого набора.";

        String correctText = text.toLowerCase();
        correctText = correctText.replace(",","");
        correctText = correctText.replace("  ","");
        correctText = correctText.replace("(","");
        correctText = correctText.replace(")","");
        correctText = correctText.replace("`","");
        correctText = correctText.replace(".","");

        String[] words = correctText.split(" ");
        System.out.println(correctText);

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }


        System.out.println(wordCount);

    }
}
