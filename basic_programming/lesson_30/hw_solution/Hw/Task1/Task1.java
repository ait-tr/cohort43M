package code.Hw.Task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter text : ");
        Scanner scr = new Scanner(System.in);
        String text = scr.nextLine();
        String corredctedText = preparingText(text);
        System.out.println(countWords(corredctedText));
    }

    public static String preparingText(String text){
        String correctText = text.toLowerCase();
        correctText = correctText.replace(",","");
        correctText = correctText.replace("  ","");
        correctText = correctText.replace("(","");
        correctText = correctText.replace(")","");
        correctText = correctText.replace("`","");
        correctText = correctText.replace(".","");
        return correctText;
    }

    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;}
}
