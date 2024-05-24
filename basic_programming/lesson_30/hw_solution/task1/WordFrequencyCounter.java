package task1;

//Подсчет частоты слов
//Написать программу, которая считывает текст (например, строку),
//разбивает его на слова и подсчитывает частоту каждого слова. Программа должна выводить количество вхождений каждого слова.

import java.util.HashMap;
import java.util.Map;


public class WordFrequencyCounter {


    public static void main(String[] args) {


    String inputLine = "Олень-северное животное.В летнее время оленям в тайге жарко," +
            "а в горах даже в июле холодно.Олень как бы создан для северных просторов,жёсткого ветра," +
            "длинных морозных ночей.Олень легко бежит вперёд по тайге,подминает под себя кусты," +
            "переплывает быстрые реки.Олень не тонет,потому что каждая его шерстинка-это длинная трубочка," +
            "которую внутри наполняет воздух.Нос у оленя покрыт серебристой шёрсткой.Если бы шерсти на носу не было," +
            "олень бы его отморозил.";



        String correctText = inputLine.toLowerCase();
        correctText = correctText.replace(","," ");
        correctText = correctText.replace("  "," ");
        correctText = correctText.replace("("," ");
        correctText = correctText.replace(")"," ");
        correctText = correctText.replace("`"," ");
        correctText = correctText.replace("."," ");
        correctText = correctText.replace("-"," ");

    String[] words = correctText.split(" ");

        System.out.println(correctText);

        Map<String, Integer> WordsFrequency = new HashMap<>();

        for (String word : words) {

            if (WordsFrequency.containsKey(word)) {
                WordsFrequency.put(word, WordsFrequency.get(word) + 1);
            } else {
                WordsFrequency.put(word, 1);
            }
        }
            System.out.println("Частота использования слов " + WordsFrequency);


            }
        }







