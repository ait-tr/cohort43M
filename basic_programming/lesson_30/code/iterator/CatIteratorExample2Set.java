package code.iterator;

import java.util.*;

public class CatIteratorExample2Set {
    public static void main(String[] args) {
        Set<Cat> catSet = new HashSet<>();

        Cat murzik = new Cat("Murzik");
        Cat barsik = new Cat("Barsik");
        Cat lastochka = new Cat("Lastochka");
        Cat begemot = new Cat("Begemot");
        Cat matroskin = new Cat("Matroskin");

        Cat lucky = new Cat("Lucky");

        catSet.add(murzik);
        catSet.add(barsik);
        catSet.add(begemot);
        catSet.add(lastochka);
        catSet.add(lucky);

        System.out.println(catSet);

        Iterator<Cat> catIterator2 = catSet.iterator();

        while (catIterator2.hasNext()) {
            Cat tempCat = catIterator2.next();
            System.out.println(tempCat);

            if (tempCat.getName().equals("Begemot")){
                System.out.println("EQUALS");
                catIterator2.remove();
            }

            System.out.println("Есть ли следующий элемент? да / нет" + catIterator2.hasNext());
        }

        System.out.println("Коллекция кошек:");
        System.out.println(catSet);

    }
}
