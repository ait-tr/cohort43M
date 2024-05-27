package HW_31.task_1;

import java.util.TreeSet;

public class FlatApp {
    public static void main(String[] args) {
        TreeSet<Flat> flats = new TreeSet<>();
        flats.add(new Flat(2, 50.5));
        flats.add(new Flat(2, 45.0));
        flats.add(new Flat(3, 70.0));
        flats.add(new Flat(1, 55.0));
        flats.add(new Flat(3, 65.0));

        for (Flat flat : flats) {
            System.out.println(flat);
        }
    }
}
