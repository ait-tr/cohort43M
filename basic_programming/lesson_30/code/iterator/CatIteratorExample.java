package code.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CatIteratorExample {
    public static void main(String[] args) {
        List<Cat> catsList = new ArrayList<>();
        Set<Cat> catSet = new HashSet<>();

        Cat murzik = new Cat("Murzik");
        Cat barsik = new Cat("Barsik");
        Cat lastochka = new Cat("Lastochka");
        Cat begemot = new Cat("Begemot");
        Cat matroskin = new Cat("Matroskin");

        Cat lucky = new Cat("Lucky");

        catsList.add(murzik);
        catsList.add(barsik);
        catsList.add(begemot);
        catsList.add(lastochka);
        catsList.add(lucky);

        System.out.println(catsList);

        for (Cat tempCat : catsList){
            if (tempCat.getName().equals("Begemot")) {
                catsList.remove(tempCat);
            }
        }


    }
}
