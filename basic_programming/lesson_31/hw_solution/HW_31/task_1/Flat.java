package HW_31.task_1;

import java.util.Objects;

public class Flat implements Comparable<Flat> {

    private int bedrooms;
    private double area;

    public Flat(int bedrooms, double area) {
        this.bedrooms = bedrooms;
        this.area = area;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public double getArea() {
        return area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flat flat = (Flat) o;
        return bedrooms == flat.bedrooms && Double.compare(flat.area, area) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bedrooms, area);
    }

    @Override
    public String toString() {
        return "Flat{" +
                "bedrooms=" + bedrooms +
                ", area=" + area +
                '}';
    }

    @Override
    public int compareTo(Flat other) {
        if (this.bedrooms != other.bedrooms) {
            return Integer.compare(this.bedrooms, other.bedrooms);
        }
        return Double.compare(this.area, other.area);
    }
}
