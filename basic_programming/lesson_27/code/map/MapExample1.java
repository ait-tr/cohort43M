package code.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {
    public static void main(String[] args) {

        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(10,"Ruslan");
        myMap.put(20,"Oleg");
        myMap.put(30,"Roman");

        System.out.println(myMap);

        System.out.println(myMap.get(20));


        Map<String, Integer> map2 = new HashMap<>();

        map2.put("Ruslan", 30);
        map2.put("Oleg", 35);
        map2.put("Roman", 32);

        System.out.println(map2.get("Roman"));


        System.out.println(map2);


        map2.put("Roman",35);

        System.out.println(map2);



    }
}
