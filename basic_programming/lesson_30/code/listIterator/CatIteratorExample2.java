package code.listIterator;

import java.util.*;

public class CatIteratorExample2 {
    public static void main(String[] args) {
        List<Cat> catsList = new ArrayList<>();

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

        ListIterator<Cat> catListIterator = catsList.listIterator();

        while (catListIterator.hasNext()){
            Cat tempCat = catListIterator.next();
            System.out.println(tempCat);
            if (tempCat.name.equals("Begemot")){
                catListIterator.remove();
                catListIterator.add(matroskin);
            }
        }

        System.out.println(catsList);

        System.out.println("пойдем обратно");

        while (catListIterator.hasPrevious()){
            Cat tempCat = catListIterator.previous();
            System.out.println(tempCat);
        }

    }
}
