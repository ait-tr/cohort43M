package code.HW.task1;

import java.util.Comparator;

public class PersonCompare implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int compareResult = o1.getFamilyName().compareTo(o2.getFamilyName());
        if (compareResult == 0){
            compareResult = (-1) * o1.getName().compareTo(o2.getName());
        }
        return compareResult;
    }
}
