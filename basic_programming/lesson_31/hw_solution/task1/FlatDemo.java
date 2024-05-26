package task1;

import java.util.Set;
import java.util.TreeSet;

public class FlatDemo {
    public static void main(String[] args) {

        Set<Flat> home = new TreeSet<>();

        home.add(new Flat(120.9,3));
        home.add(new Flat(54.6,1));
        home.add(new Flat(80.4,2));
        home.add(new Flat(42.5,2));
        home.add(new Flat(51.0,1));
        home.add(new Flat(64.8,3));
        home.add(new Flat(140.9,3));
        home.add(new Flat(210.2,4));
        home.add(new Flat(49.9,1));
        home.add(new Flat(27.0,1));

        for (Flat flat: home){
            System.out.println( "Bedrooms = " + flat.getBedroom() + ",  Square = "+ flat.getSquare());
        }


    }
}
