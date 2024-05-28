package code.tree.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> numberMap = new TreeMap<>();

        numberMap.put(30,"Tree");
        numberMap.put(50,"Five");
        numberMap.put(20,"Two");
        numberMap.put(10,"One");
        numberMap.put(40,"Four");

        System.out.println("Our map collection: " + numberMap);

        numberMap.remove(40);


        System.out.println("Our map collection: " + numberMap);

        System.out.println("Перебор всех элементов нашей коллекции: ");
        for (Integer key : numberMap.keySet()){
            System.out.println("Key: " + key + ", value: " + numberMap.get(key));
        }

        System.out.println("First key: " + numberMap.firstKey());
        System.out.println("First value: " + numberMap.firstEntry().getValue());
        System.out.println("Last key: " + numberMap.lastKey());
        System.out.println("Last value: " + numberMap.lastEntry().getValue());



    }
}
