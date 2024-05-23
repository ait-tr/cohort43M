package code.iterator;

import java.util.*;

public class CatIteratorExample2 {
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

        Iterator<Cat> catIterator = catsList.iterator();

        while (catIterator.hasNext()) {
            Cat tempCat = catIterator.next();
            //System.out.println(tempCat);
        }

  // --------- ITERATOR 2 ----

        Iterator<Cat> catIterator2 = catsList.iterator();

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
        System.out.println(catsList);

    }
}
