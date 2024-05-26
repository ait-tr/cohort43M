package task1;

import java.util.Set;
import java.util.TreeSet;

public class FlatBySquareDemo {
    public static void main(String[] args) {

        Set<FlatBySquare> home = new TreeSet<>();

        home.add(new FlatBySquare(120.9,3));
        home.add(new FlatBySquare(54.6,1));
        home.add(new FlatBySquare(80.4,2));
        home.add(new FlatBySquare(42.5,2));
        home.add(new FlatBySquare(51.0,1));
        home.add(new FlatBySquare(124.8,3));
        home.add(new FlatBySquare(140.9,3));
        home.add(new FlatBySquare(210.2,4));
        home.add(new FlatBySquare(49.9,1));
        home.add(new FlatBySquare(27.0,1));

        for (FlatBySquare flat: home){
            System.out.println("Square - "+ flat.getSquare()+ " , Bedrooms = " + flat.getBedroom());
        }


    }
}
