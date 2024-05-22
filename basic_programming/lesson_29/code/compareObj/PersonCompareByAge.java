package code.compareObj;

import java.util.Comparator;

public class PersonCompareByAge implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        int compareResult = person1.getAge() - person2.getAge();

        return compareResult;
    }
}
