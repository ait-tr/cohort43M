package code.compareObjects.comparator;

import java.util.Comparator;

public class PairstringComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair pair1, Pair pair2) {
        return pair1.getOurString().compareTo(pair2.getOurString());
    }
}
