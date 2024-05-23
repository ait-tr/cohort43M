package HW_30.task_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Задача 1: Подсчет частоты слов

Написать программу, которая считывает текст (например, строку),
разбивает его на слова и подсчитывает частоту каждого слова.
Программа должна выводить количество вхождений каждого слова.
 */
public class WordCount {
    public static void main(String[] args) {
        Scanner wordScanner = new Scanner(System.in);
        System.out.println("Please, enter a text");
        String text = wordScanner.nextLine();

        Map<String, Integer> wordFrequency = countWordFrequency(text);

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        String[] words = text.split("\\s+");

        for (String word : words){
            word = word.toLowerCase();
            if (wordFrequency.containsKey(word)){
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }
        return wordFrequency;
    }
}
