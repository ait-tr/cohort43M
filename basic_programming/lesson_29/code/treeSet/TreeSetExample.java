package code.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        Set<String> ourTreeSetCollection = new TreeSet<>();

        ourTreeSetCollection.add("Alex");
        ourTreeSetCollection.add("Robert");
        ourTreeSetCollection.add("John");
        ourTreeSetCollection.add("Bill");
        ourTreeSetCollection.add("Andrew");

        System.out.println(ourTreeSetCollection);


        Set<Integer> ourTreeSetCollectionInteger = new TreeSet<>();

        ourTreeSetCollectionInteger.add(10);
        ourTreeSetCollectionInteger.add(1);
        ourTreeSetCollectionInteger.add(7);
        ourTreeSetCollectionInteger.add(112);
        ourTreeSetCollectionInteger.add(0);
        ourTreeSetCollectionInteger.add(100);

        ourTreeSetCollectionInteger.add(10);
        ourTreeSetCollectionInteger.add(100);


        System.out.println(ourTreeSetCollectionInteger);

    }
}
