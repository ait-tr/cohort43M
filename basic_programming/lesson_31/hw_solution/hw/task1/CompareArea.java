package code.practice.hw.task1;

import java.util.Comparator;

public class CompareArea  implements Comparator<Flat> {
    @Override
    public int compare(Flat o1, Flat o2) {
        return o1.getArea().compareTo(o2.getArea());
    }
}
