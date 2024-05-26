package Homework_31.task1;
/*даны два класса:

Flat - у которого основными параметрами являются площадь и количество спален создать класс который сразу бы
определял правила сортировки - 1) по количеству комнат и 2) по площади создать коллекцию TreeSet, добавить
несколько элементов и проверить работу коллекции

*/

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class Flat {
    private double area;
    private int bedrooms;

    public Flat(double area, int bedrooms) {
        this.area = area;
        this.bedrooms = bedrooms;
    }

    public double getArea() {
        return area;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "area=" + area +
                ", bedrooms=" + bedrooms +
                '}';
    }


}