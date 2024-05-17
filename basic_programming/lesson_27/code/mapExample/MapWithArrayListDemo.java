package code.mapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapWithArrayListDemo {
    public static void main(String[] args) {

        Map<String, List<String>> listMap = new HashMap<>();

        List<String> strings1 = new ArrayList<>();
        strings1.add("One");
        strings1.add("Two");
        strings1.add("Three");

        List<String> strings2 = new ArrayList<>();
        strings2.add("Banana");
        strings2.add("Apple");
        strings2.add("Kiwi");


        listMap.put("Digital", strings1);
        listMap.put("Fruits", strings2);

        System.out.println(listMap);


    }
}
