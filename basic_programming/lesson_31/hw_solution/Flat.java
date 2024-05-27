package code.Homework.Task1;

import java.util.TreeSet;

public class Flat implements Comparable<Flat> {
    private int area;
    private int bedrooms;

    public Flat(int area, int bedrooms) {
        this.area = area;
        this.bedrooms = bedrooms;
    }

    public int getArea() {
        return area;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    @Override
    public int compareTo(Flat other) {
        int bedroomComparison = Integer.compare(this.bedrooms, other.bedrooms);
        if (bedroomComparison != 0) {
            return bedroomComparison;
        }
        return Integer.compare(this.area, other.area);
    }

    @Override
    public String toString() {
        return "Flat{area=" + area + ", bedrooms=" + bedrooms + "}";
    }

    public static void main(String[] args) {
        TreeSet<Flat> flats = new TreeSet<>();
        flats.add(new Flat(30, 2));
        flats.add(new Flat(45, 2));
        flats.add(new Flat(60, 3));
        flats.add(new Flat(30, 1));

        for (Flat flat : flats) {
            System.out.println(flat);
        }
    }
}
