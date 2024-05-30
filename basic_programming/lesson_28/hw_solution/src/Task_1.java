import java.util.HashMap;
import java.util.Map;

public class Task_1 {
    public static void main(String[] args) {
        //Задача 1: Подсчет частоты слов
        //
        //Напишите программу, которая принимает на вход строку и подсчитывает количество вхождений
        // каждого слова в этой строке.

        String text = "Hello! I like Java, but I need more time.  Can you help me with Java? Java for beginners (Hello Java)";

        String correctText = text.toLowerCase();
        correctText = correctText.replace(",","");
        correctText = correctText.replace("  "," ");
        correctText = correctText.replace("(","");
        correctText = correctText.replace(")","");
        correctText = correctText.replace("!","");
        correctText = correctText.replace(".","");
        correctText = correctText.replace("?","");

        System.out.println(correctText);

        String [] words = correctText.split(" ");
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
