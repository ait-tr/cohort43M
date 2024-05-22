package code.compareObjects.comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PairCompareDemo {
    public static void main(String[] args) {

        Comparator<Pair> pairComparator = new PairstringComparator().thenComparing(new PairIntegerComparator());

        Set<Pair> pairs = new TreeSet<>(pairComparator);

        pairs.add(new Pair("John", 1));
        pairs.add(new Pair("Zigmund", 11));
        pairs.add(new Pair("Boris", 7));
        pairs.add(new Pair("John", 46));
        pairs.add(new Pair("Alex", 25));
        pairs.add(new Pair("Elena", 91));
        pairs.add(new Pair("Andrew", 17));

        System.out.println(pairs);
    }
}
