package HW_30.task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
Задача 5: Итерация по списку строк и замена слова

Написать программу, которая создает список строк,
а затем проходит по нему с использованием Iterator,
заменяя все вхождения слова "apple" на "orange".
 */

public class WordReplacement {
        public static void main(String[] args) {
            List<String> stringList = new ArrayList<>();

            stringList.add("Tasty apple");
            stringList.add("Beautiful apple");
            stringList.add("Early apple");
            stringList.add("Beautiful cherry");
            stringList.add("Everything is great, but apple is the best!");

            System.out.println(stringList);
            replace(stringList);
            System.out.println("-----------------------------------------------------");
            System.out.println(stringList);


        }
        public static void replace (List<String> stringList){
            ListIterator<String> listIterator = stringList.listIterator();
            while (listIterator.hasNext()){
                String string = listIterator.next();

                if (string.contains("apple")){
                    listIterator.set(string.replace("apple", "orange"));
                }
            }
        }
    }

