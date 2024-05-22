//Подсчет частоты слов
//Напишите программу, которая принимает на вход строку
// и подсчитывает количество вхождений каждого слова в этой строке.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordsCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку ");

        String inputLine = scanner.nextLine();

        String[] words = inputLine.split(" ");

        Map<String, Integer> WordsQuantity = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            if (WordsQuantity.containsKey(word)) {
                WordsQuantity.put(word, WordsQuantity.get(word) + 1);
            } else {
                WordsQuantity.put(word, 1);
            }
        }
            System.out.println("Частота использования слов " + WordsQuantity);


            }
        }







