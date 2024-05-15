package code.arrayListPrctice;

import java.util.ArrayList;

public class TvCollection {
    public static void main(String[] args) {
        /*
        создать класс TV
        - производитель
        - размер

        создать коллекцию
        добавить 3 элемента
        распечатать коллекцию
        удалить один элемент - первый из всех у кого совпадает производитель

         */

        ArrayList<TV> tvs = new ArrayList<>();

        tvs.add(new TV("Sony", 55));
        tvs.add(new TV("Samsung", 65));
        tvs.add(new TV("Philips", 50));
        tvs.add(new TV("LG", 60));
        tvs.add(new TV("Philips", 42));

        for (int i = 0; i < tvs.size(); i++) {
            System.out.println(tvs.get(i));
        }

        String manufacturerForDelete = "Philips";

        for (int i = 0; i < tvs.size(); i++) {
            TV currentTV = tvs.get(i);
            if (currentTV.getManufacturer().equals(manufacturerForDelete)) {
               tvs.remove(i);
              //  tvs.remove(currentTV);
                //break;
            }

        }

        System.out.println(" ---------- ");
        for (int i = 0; i < tvs.size(); i++) {
            System.out.println(tvs.get(i));
        }



    }
}
