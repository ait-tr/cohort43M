package code.homework.hw2;

import java.util.Comparator;

public class CompareByAllParameters implements Comparator<SuitCase> {

    @Override
    public int compare(SuitCase suitCase1, SuitCase suitCase2) {

        int compareResult = suitCase1.getMaterial().compareTo(suitCase2.getMaterial());

        if (compareResult == 0) {
            compareResult = suitCase1.getSize().compareTo(suitCase2.getSize());
        }

        if (compareResult == 0) {
            compareResult = suitCase1.getColor().compareTo(suitCase2.getColor());
        }

        return compareResult;
    }
}
