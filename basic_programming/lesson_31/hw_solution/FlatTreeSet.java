package homework_31;

import java.util.Set;
import java.util.TreeSet;

public class FlatTreeSet {
    public static void main(String[] args) {
         Set<Flat> flats = new TreeSet<>();

         flats.add(new Flat(1,35.8));
        flats.add(new Flat(4,106.8));
        flats.add(new Flat(3,85.3));
        flats.add(new Flat(3,75.8));
        flats.add(new Flat(1,25.4));
        flats.add(new Flat(2,55.8));
        flats.add(new Flat(1,25.5));

        System.out.println(flats);
    }

}
