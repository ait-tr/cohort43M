package Homework_29.task3;

import java.util.HashSet;
import java.util.Set;

public class PhoneCollection {
    public static void main(String[] args) {
        Set<Phone> phoneSet = new HashSet<>();


        phoneSet.add(new Phone("Apple", "IPhone 12"));
        phoneSet.add(new Phone("Samsung", "Galaxy S21"));
        phoneSet.add(new Phone("Nokia", "Pixel 5"));
        phoneSet.add(new Phone("Apple", "IPhone 12"));
        phoneSet.add(new Phone("Apple", "IPhone 13"));

        // Вывод элементов коллекции
        System.out.println("Unique phones in the collection:");
        for (Phone phone : phoneSet) {
            System.out.println(phone);
        }
    }
}
