package code.mapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatDemo {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik", "grey");
        Cat cat2 = new Cat("Murzik", "white");
        Cat cat3 = new Cat("Lastochka", "grey");
        Cat cat4 = new Cat("Dexter", "white");
        Cat cat5 = new Cat("Lucky", "grey");
        Cat cat6 = new Cat("Vasjka", "white");

        List<Cat> cats = new ArrayList<>();
        List<Cat> greyCats = new ArrayList<>();
        List<Cat> whiteCats = new ArrayList<>();


        cats.add(cat1);
        cats.add(cat3);
        cats.add(cat5);
        cats.add(cat2);
        cats.add(cat4);
        cats.add(cat6);


        for (Cat cat : cats){

            if (cat.getColor().equals("grey")) {
                greyCats.add(cat);
            }
            if (cat.getColor().equals("white")) {
                whiteCats.add(cat);
            }

        }


        Map<String, List<Cat>> stringListMap = new HashMap<>();

        stringListMap.put("greyCats", greyCats);
        stringListMap.put("whiteCats", whiteCats);

        System.out.println(stringListMap);


    }
}
