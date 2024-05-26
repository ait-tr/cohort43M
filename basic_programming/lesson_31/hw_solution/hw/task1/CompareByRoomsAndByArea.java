package code.practice.hw.task1;

import java.util.Comparator;

public class CompareByRoomsAndByArea implements Comparator<Flat> {
    @Override
    public int compare(Flat o1, Flat o2) {
        int compareResult = o1.getRoomsAmount().compareTo(o2.getRoomsAmount());
        if (compareResult == 0){
            compareResult = (-1) * o1.getArea().compareTo(o2.getArea());
        }
        return compareResult;
    }
}
