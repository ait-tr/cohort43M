package task1;

import java.util.Objects;

//Дан класс Flat - у которого основными параметрами являются площадь и количество спален
//создать класс который сразу бы определял правила сортировки
//1) по количеству комнат и 2) по площади
//создать коллекцию TreeSet, добавить несколько элементов и проверить работу коллекции
public class FlatBySquare implements Comparable<FlatBySquare> {
    private Double square;
    private Integer bedroom;

    public FlatBySquare(Double square, Integer bedroom) {
        this.square = square;
        this.bedroom = bedroom;
    }

    public Double getSquare() {
        return square;
    }

    public Integer getBedroom() {
        return bedroom;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "square=" + square +
                ", bedroom=" + bedroom +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlatBySquare flat = (FlatBySquare) o;
        return Objects.equals(square, flat.square) && Objects.equals(bedroom, flat.bedroom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(square, bedroom);
    }


    @Override
    public int compareTo(FlatBySquare o) {
        int compateResult = (int) (square - o.getSquare());
        if (compateResult == 0) {
            compateResult = bedroom.compareTo(o.getBedroom());
        }
        return compateResult;
    }




}
