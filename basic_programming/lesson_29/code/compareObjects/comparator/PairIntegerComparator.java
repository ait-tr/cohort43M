package code.compareObjects.comparator;

import java.util.Comparator;

public class PairIntegerComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair pair1, Pair pair2) {
        return pair1.getOurInteger() - pair2.getOurInteger();
    }
}
