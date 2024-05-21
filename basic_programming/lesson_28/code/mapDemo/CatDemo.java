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

        List<Cat> greyCats = new ArrayList<>();
        List<Cat> whiteCats = new ArrayList<>();

        greyCats.add(cat1);
        greyCats.add(cat3);
        greyCats.add(cat5);

        whiteCats.add(cat2);
        whiteCats.add(cat4);
        whiteCats.add(cat6);

        Map<String, List<Cat>> stringListMap = new HashMap<>();

        stringListMap.put("greyCats", greyCats);
        stringListMap.put("whiteCats", whiteCats);

        System.out.println(stringListMap);





    }
}
