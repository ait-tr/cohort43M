package code.HomeWork.Task1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String text = " Домашнее задание.Задача 1: Подсчет частоты слов.Написать программу, которая считывает текст (например, строку)," +
                "разбивает его на слова и подсчитывает частоту каждого слова. Программа должна выводить количество вхождений каждого слова." +
                "Задача 2: Удаление дубликатов из списка с использованием HashSet.Написать программу," +
                " которая принимает список целых чисел и удаляет все дубликаты. Программа должна выводить список уникальных чисел." +
                "Задача 3: Хранение и сортировка имен студентов.Написать программу, которая принимает список имен студентов" +
                " и хранит их в коллекции в отсортированном виде. Программа должна выводить список имен в алфавитном порядке." +
                "Задача 4: Удаление отрицательных чисел из списка.Написать программу, которая создает список целых чисел," +
                " в том числе и отрицательных, а затем удаляет из него все отрицательные числа, используя Iterator." +
                "Задача 5: Итерация по списку строк и замена слова.Написать программу, которая создает список строк," +
                " а затем проходит по нему с использованием Iterator, заменяя все вхождения слова apple на orange.";

        String correctText = text.toLowerCase();
        correctText = correctText.replace(".", " ");
        correctText = correctText.replace(",", " ");
        correctText = correctText.replace(":", " ");
        correctText = correctText.replace("(", " ");
        correctText = correctText.replace(")", " ");

        String[] words = correctText.split("\\s+");
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        List<WordCount> wordCountList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            wordCountList.add(new WordCount(entry.getKey(), entry.getValue()));
        }

        WordCount[] wordCountArray = wordCountList.toArray(new WordCount[0]);

        for (WordCount wc : wordCountArray) {
            System.out.println(wc);
        }
    }
}
