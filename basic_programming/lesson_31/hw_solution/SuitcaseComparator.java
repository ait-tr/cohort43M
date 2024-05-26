package Homework_31.task2;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class SuitcaseComparator {
    public static void main(String[] args) {
        Comparator<Suitcase> suitcaseComparator = Comparator
                .comparing(Suitcase::getSize)
                .thenComparing(Suitcase::getMaterial)
                .thenComparing(Suitcase::getColor);

        TreeSet<Suitcase> suitcaseTreeSet = new TreeSet<>(suitcaseComparator);
        suitcaseTreeSet.add(new Suitcase("Plastic", "L", "Red"));
        suitcaseTreeSet.add(new Suitcase("Fabric", "M", "Blue"));
        suitcaseTreeSet.add(new Suitcase("Plastic", "XL", "Black"));
        suitcaseTreeSet.add(new Suitcase("Fabric", "L", "Green"));

        System.out.println("Suitcases sorted by size, material, and color (TreeSet):");
        for (Suitcase suitcase : suitcaseTreeSet) {
            System.out.println(suitcase);
        }

        List<Suitcase> suitcaseLinkedList = new LinkedList<>(suitcaseTreeSet);

        System.out.println("Suitcases sorted by size, material, and color (LinkedList):");
        for (Suitcase suitcase : suitcaseLinkedList) {
            System.out.println(suitcase);
        }
    }
}
