package task1_Comparable;

import java.util.Set;
import java.util.TreeSet;

public class Flat_Demo {
    //Flat - у которого основными параметрами являются площадь и количество спален создать класс который
    // сразу бы определял правила сортировки - 1) по количеству комнат и 2) по площади
    // создать коллекцию TreeSet, добавить несколько элементов и проверить работу коллекции
    public static void main(String[] args) {
        Set<Flat> flats = new TreeSet<>();

        flats.add(new Flat(70.5,3));
        flats.add(new Flat(54.5,2));
        flats.add(new Flat(54.9,1));
        flats.add(new Flat(90.5,3));
        flats.add(new Flat(33.0,1));

        System.out.println(flats);
    }
}
