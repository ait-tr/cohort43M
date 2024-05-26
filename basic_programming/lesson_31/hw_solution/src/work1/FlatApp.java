package work1;

import java.util.TreeSet;

public class FlatApp {
    public static void main(String[] args) {
        TreeSet<Flat> flatTreeSet = new TreeSet<>();

        flatTreeSet.add(new Flat(32.5,4));
        flatTreeSet.add(new Flat(44.0,4));
        flatTreeSet.add(new Flat(14.5,2));
        flatTreeSet.add(new Flat(27.0,3));
        flatTreeSet.add(new Flat(50.5,6));

        flatTreeSet.forEach(System.out::println);






    }
}
