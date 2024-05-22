package code.setClassic;

import java.util.*;

public class HashSetExample4 {
    public static void main(String[] args) {

        String text = "В Java, `enum` (или перечисление) используется для определения коллекции именованных констант. " +
                "Эти константы могут быть примитивными значениями или комплексными объектами. Использование `enum` " +
                "в Java помогает сделать код более читаемым и безопасным, поскольку оно ограничивает возможные значения " +
                "переменной до предопределённого набора.";

        /*
        Дан текст - вывести список уникальных слов в этом тексте
         */

        String correctText = text.toLowerCase();
        correctText = correctText.replace(",","");
        correctText = correctText.replace("  ","");
        correctText = correctText.replace("(","");
        correctText = correctText.replace(")","");
        correctText = correctText.replace("`","");
        correctText = correctText.replace(".","");


        String[] words = correctText.split(" ");
        List<String> wordsList = Arrays.asList(words);
        Set<String> setWords = new HashSet<>(wordsList);

        List<String> finalWordList = new ArrayList<>(setWords);
        Collections.sort(finalWordList);


        System.out.println(finalWordList);

    }
}
