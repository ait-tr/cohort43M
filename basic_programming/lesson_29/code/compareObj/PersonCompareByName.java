package code.compareObj;

import java.util.Comparator;

public class PersonCompareByName implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        int compareResult = person1.getName().compareTo(person2.getName());

        return compareResult;
    }
}
