package code.practice.hw.task2;

import java.util.*;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        List<Suitcase> suitcases = new ArrayList<>();
        suitcases.add(new Suitcase(Suitcase.Material.Fabric, Suitcase.Size.M, "Blue"));
        suitcases.add(new Suitcase(Suitcase.Material.Fabric, Suitcase.Size.M, "Yellow"));
        suitcases.add(new Suitcase(Suitcase.Material.Plastic, Suitcase.Size.XL, "Grey"));
        suitcases.add(new Suitcase(Suitcase.Material.Fabric, Suitcase.Size.L, "Green"));
        suitcases.add(new Suitcase(Suitcase.Material.Plastic, Suitcase.Size.M, "Pink"));
        suitcases.add(new Suitcase(Suitcase.Material.Fabric, Suitcase.Size.XL, "Red"));

        Comparator<Suitcase> comparator = new CompareBySizeMaterialColor();
        LinkedList<Suitcase> linkSuitcases = new LinkedList<>(suitcases);
        linkSuitcases.sort(comparator);
        System.out.println("Linked list: ");
        for (Suitcase suitcase: linkSuitcases){
            System.out.println(suitcase);
        }

        TreeSet<Suitcase>  setSuitcases = new TreeSet<>(comparator);
        setSuitcases.addAll(suitcases);
        System.out.println("TreeSet: ");
        for (Suitcase suitcase: setSuitcases){
            System.out.println(suitcase);
        }

    }
}
