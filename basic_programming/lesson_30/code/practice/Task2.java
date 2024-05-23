package code.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task2 {
    /*
    Дана коллекция string

    написать метод, который в  коллекции заменяет все элементы,
    которые содержат букву 'a' на "..."

     */

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("orange");
        strings.add("lemon");
        strings.add("kiwi");

        System.out.println("Original list: " + strings);

        replaceString(strings,"a","...");

        System.out.println("Modified list: " + strings);



    }

    public static void replaceString(List<String> ourList, String checkContain, String replaceElement){
        ListIterator<String> listIterator = ourList.listIterator();

        while (listIterator.hasNext()){
            String currentString = listIterator.next();

            if (currentString.contains(checkContain)){
                listIterator.set(replaceElement);
            }
        }

    }
}
