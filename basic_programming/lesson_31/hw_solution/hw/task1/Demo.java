package code.practice.hw.task1;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Flat> flats = new ArrayList<>();
        flats.add(new Flat(2, 60.5));
        flats.add(new Flat(4, 140.5));
        flats.add(new Flat(2, 30.5));
        flats.add(new Flat(1, 60.5));
        flats.add(new Flat(3, 70.5));
        System.out.println(flats);
        Comparator<Flat> comparatorRoomsAmount = new CompareRoomsAmount();
        Set<Flat> flatsSortedByRoomsAmount = new TreeSet<>(comparatorRoomsAmount);
        flatsSortedByRoomsAmount.addAll(flats);

        Comparator<Flat> comparatorArea = new CompareArea();
        Set<Flat> flatsSortedByArea = new TreeSet<>(comparatorArea);
        flatsSortedByArea.addAll(flats);

        System.out.println("Sorted by rooms Amount: ");
        System.out.println(flatsSortedByRoomsAmount);

        System.out.println("Sorted by Area: ");
        System.out.println(flatsSortedByArea);

        Comparator<Flat> comparatorByRoomsAndArea = new CompareByRoomsAndByArea();
        Set<Flat> flatsSortedByRoomsAndByArea = new TreeSet<>(comparatorByRoomsAndArea);
        flatsSortedByRoomsAndByArea.addAll(flats);

        System.out.println("Sorted by amount of rooms and by area: ");
        System.out.println(flatsSortedByRoomsAndByArea);
    }

}
