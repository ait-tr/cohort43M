package task5;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class WordReplacement {
    public static void main(String[] args) {


        List<String> words = new ArrayList<>();

        words.add("Big red apple");
        words.add("Many people like banana");
        words.add("kiwi is SMALL fruit");
        words.add("orange sweet");
        words.add("Apple was in my bag");
        words.add("grape very tasty");
        words.add("melon is different");


        System.out.println("Original list: " + words);

        ListIterator<String> iterator = words.listIterator();

        while (iterator.hasNext()){
            String string = iterator.next();

            string = string.toLowerCase();

            if ( string.contains("apple")) {
                String newString = string.replace("apple","orange");
                iterator.set(newString);
            }
        }
        System.out.println("List after replacement: " + words);



    }

}
