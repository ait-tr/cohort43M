package code.practice.hw.task2;

public class CompareBySizeMaterialColor implements java.util.Comparator<Suitcase> {
    @Override
    public int compare(Suitcase o1, Suitcase o2) {
        int sizeCompare = o1.getSize().compareTo(o2.getSize());
        if (sizeCompare != 0) {
            return sizeCompare;
        }

        int materialCompare = o1.getMaterial().compareTo(o2.getMaterial());
        if (materialCompare != 0) {
            return materialCompare;
        }

        return o1.getColor().compareTo(o2.getColor());
    }
}
