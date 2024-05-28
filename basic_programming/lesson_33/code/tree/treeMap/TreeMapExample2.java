package code.tree.treeMap;

import java.util.TreeMap;

public class TreeMapExample2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> numberMap = new TreeMap<>();

        numberMap.put(7, "node 7");
        numberMap.put(3, "node 3");
        numberMap.put(9, "node 9");
        numberMap.put(5, "node 5");
        numberMap.put(1, "node 1");
        numberMap.put(2, "node 2");
        numberMap.put(4, "node 4");
        numberMap.put(6, "node 6");
        numberMap.put(8, "node 8");
        numberMap.put(10, "node 10");

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
