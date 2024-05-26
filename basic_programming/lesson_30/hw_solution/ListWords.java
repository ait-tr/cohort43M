package homework_30listWords;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListWords {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();

        fruitsList.add("apple");
        fruitsList.add("banana");
        fruitsList.add("apple");
        fruitsList.add("cherry");
        fruitsList.add("apple");
        fruitsList.add("grape");

        System.out.println(fruitsList);

        ListIterator<String> fruitsIterator = fruitsList.listIterator();

        while (fruitsIterator.hasNext()){
            String fruit = fruitsIterator.next();
            System.out.println(fruit);
            if(fruit.equalsIgnoreCase("apple")){
                fruitsIterator.remove();
                fruitsIterator.add("orange");
            }
        }
        System.out.println(fruitsList);




    }
}
