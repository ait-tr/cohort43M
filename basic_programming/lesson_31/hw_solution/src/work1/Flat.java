package work1;

public class Flat implements Comparable<Flat>{
    private double square;
    private Integer numberOfBedrooms;

    public Flat(double square, Integer numberOfBedrooms) {
        this.square = square;
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public double getSquare() {
        return square;
    }

    public Integer getNumberOfBedrooms() {
        return numberOfBedrooms;
    }


    @Override
    public String toString() {
        return "Flat{" +
                "square=" + square +
                ", numberOfBedrooms=" + numberOfBedrooms +
                '}';
    }

    @Override
    public int compareTo(Flat flat) {
        double compareResult = numberOfBedrooms - flat.numberOfBedrooms;
        if (compareResult == 0){
            compareResult = square - flat.square;
        }

        return (int)compareResult;
    }
}
