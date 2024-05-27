package code.homework.hw1;

import java.util.Set;
import java.util.TreeSet;

public class FlatDemo {
    public static void main(String[] args) {
        Set<Flat> flats = new TreeSet<>();

        flats.add(new Flat(3,70.5));
        flats.add(new Flat(2,54.5));
        flats.add(new Flat(2,54.9));
        flats.add(new Flat(3,90.5));
        flats.add(new Flat(1,33.0));


        System.out.println(flats);
    }
}
