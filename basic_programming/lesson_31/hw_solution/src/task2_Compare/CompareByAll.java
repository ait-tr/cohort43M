package task2_Compare;

import java.util.Comparator;

public class CompareByAll implements Comparator<Suitcase> {
    @Override
    public int compare(Suitcase sc1, Suitcase sc2) {
        int compareResult = sc1.getMaterial().compareTo(sc2.getMaterial());

        if(compareResult == 0){
            compareResult = sc1.getSize().compareTo(sc2.getSize());
        }
        if (compareResult ==0){
            compareResult = sc1.getColor().compareTo(sc2.getColor());
        }
        return compareResult;
    }
}
