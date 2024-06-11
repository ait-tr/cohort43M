package HW_31.task_2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class SuitcaseApp {
    public static void main(String[] args) {

        Suitcase suitcase1 = new Suitcase("PLASTIC", "M", "Red");
        Suitcase suitcase2 = new Suitcase("FABRIC", "L", "Blue");
        Suitcase suitcase3 = new Suitcase("PLASTIC", "XL", "Black");
        Suitcase suitcase4 = new Suitcase("FABRIC", "M", "Green");
        Suitcase suitcase5 = new Suitcase("PLASTIC", "L", "Yellow");
        Suitcase suitcase6 = new Suitcase("FABRIC", "XL", "White");


        TreeSet<Suitcase> suitcaseTreeSet = new TreeSet<>();
        suitcaseTreeSet.add(suitcase1);
        suitcaseTreeSet.add(suitcase2);
        suitcaseTreeSet.add(suitcase3);
        suitcaseTreeSet.add(suitcase4);
        suitcaseTreeSet.add(suitcase5);
        suitcaseTreeSet.add(suitcase6);


        LinkedList<Suitcase> suitcaseLinkedList = new LinkedList<>();
        suitcaseLinkedList.add(suitcase1);
        suitcaseLinkedList.add(suitcase2);
        suitcaseLinkedList.add(suitcase3);
        suitcaseLinkedList.add(suitcase4);
        suitcaseLinkedList.add(suitcase5);
        suitcaseLinkedList.add(suitcase6);


        Collections.sort(suitcaseLinkedList);


        System.out.println("TreeSet (Sorted):");
        for (Suitcase suitcase : suitcaseTreeSet) {
            System.out.println(suitcase);
        }


        System.out.println("\nLinkedList (Sorted):");
        for (Suitcase suitcase : suitcaseLinkedList) {
            System.out.println(suitcase);
        }
    }
}
