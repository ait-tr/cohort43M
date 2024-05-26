package homework_31;

import java.util.Objects;

public class Flat implements Comparable<Flat>{
    private Integer room;
    private Double square;

    public Flat(Integer room, Double square) {
        this.room = room;
        this.square = square;
    }

    public Integer getRoom() {
        return room;
    }

    public Double getSquare() {
        return square;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flat flat = (Flat) o;
        return Objects.equals(room, flat.room) && Objects.equals(square, flat.square);
    }


    @Override
    public int hashCode() {
        return Objects.hash(room, square);
    }

    @Override
    public String toString() {
        return "Flat{" +
                "room=" + room +
                ", square=" + square +
                '}';
    }

    @Override
    public int compareTo(Flat o) {
        int compareResult = room.compareTo(o.getRoom());
        if (compareResult == 0){
            compareResult = square.compareTo(o.getSquare());
        }
        return compareResult;
    }
}
