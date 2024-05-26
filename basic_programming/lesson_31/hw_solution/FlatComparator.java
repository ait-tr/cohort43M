package Homework_31.task1;

import java.util.Comparator;
import java.util.TreeSet;

public class FlatComparator {

    public static void main(String[] args) {
        Comparator<Flat> flatComparator = Comparator
                .comparingInt(Flat::getBedrooms)
                .thenComparingDouble(Flat::getArea);

        TreeSet<Flat> flats = new TreeSet<>(flatComparator);
        flats.add(new Flat(50.5, 2));
        flats.add(new Flat(60.0, 3));
        flats.add(new Flat(45.0, 2));
        flats.add(new Flat(55.5, 1));

        System.out.println("Flats sorted by bedrooms and area:");
        for (Flat flat : flats) {
            System.out.println(flat);
        }
    }
}
