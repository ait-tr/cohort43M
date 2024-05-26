package code.practice.hw.task1;

import java.util.Objects;

public class Flat {
    private Integer roomsAmount;
    private Double area;

    public Flat(Integer roomsAmount, Double area) {
        this.roomsAmount = roomsAmount;
        this.area = area;
    }

    public Integer getRoomsAmount() {
        return roomsAmount;
    }

    public Double getArea() {
        return area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flat flat = (Flat) o;
        return Objects.equals(roomsAmount, flat.roomsAmount) && Objects.equals(area, flat.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomsAmount, area);
    }

    @Override
    public String toString() {
        return "Flat{" +
                "roomsAmount=" + roomsAmount +
                ", area=" + area +
                '}';
    }
}
