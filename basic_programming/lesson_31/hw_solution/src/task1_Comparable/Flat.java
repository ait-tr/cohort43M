package task1_Comparable;

import java.util.Objects;

public class Flat implements Comparable<Flat> {

    private Double area;
    private Integer amountOfBedrooms;

    public Flat(Double area, Integer amountOfBedrooms) {
        this.area = area;
        this.amountOfBedrooms = amountOfBedrooms;
    }


    @Override
    public int compareTo(Flat otherFlat) {
        if(!amountOfBedrooms.equals(otherFlat.getAmountOfBedrooms())){
            return Integer.compare(amountOfBedrooms, otherFlat.amountOfBedrooms);
        } else {
            return Double.compare(this.area, otherFlat.getArea());
        }
    }

    public Double getArea() {
        return area;
    }

    public Integer getAmountOfBedrooms() {
        return amountOfBedrooms;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "area=" + area +
                ", amountOfBedrooms=" + amountOfBedrooms +
                '}';
    }


}
