package task2;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SuitcaseCollection {
    public static void main(String[] args) {


        List<Suitcase> suitcases = new LinkedList<>();


        suitcases.add(new Suitcase("Plastic","XL","Black"));
        suitcases.add(new Suitcase("Plastic","L","Black"));
        suitcases.add(new Suitcase("Plastic","M","Black"));
        suitcases.add(new Suitcase("Fabric" ,"M","Black"));
        suitcases.add(new Suitcase("Fabric" ,"L","Black"));
        suitcases.add(new Suitcase("Fabric" ,"XL","Black"));

        suitcases.add(new Suitcase("Plastic","XL","Red"));
        suitcases.add(new Suitcase("Plastic","L","Red"));
        suitcases.add(new Suitcase("Plastic","M","Red"));
        suitcases.add(new Suitcase("Fabric","M","Gray"));
        suitcases.add(new Suitcase("Fabric","L","Gray"));
        suitcases.add(new Suitcase("Fabric","XL","Gray"));
        suitcases.add(new Suitcase("Plastic","XL","Yellow"));
        suitcases.add(new Suitcase("Plastic","M","Green"));

        for (Suitcase suitcase: suitcases) {
            System.out.println(suitcase);
        }
        System.out.println();

        Set<Suitcase> suitcaseSet = new TreeSet<>(suitcases);

        for (Suitcase suitcase : suitcaseSet) {
            System.out.println(suitcase);
        }



    }
}