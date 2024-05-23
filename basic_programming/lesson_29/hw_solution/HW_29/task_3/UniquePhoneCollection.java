package HW_29.task_3;

import java.util.HashSet;
import java.util.Set;

public class UniquePhoneCollection {
    public static void main(String[] args) {
        Set<Phone> phoneSet = new HashSet<>();

        phoneSet.add(new Phone("Apple", "iPhone 12"));
        phoneSet.add(new Phone("Samsung", "Galaxy S21"));
        phoneSet.add(new Phone("Google", "Pixel 5"));
        phoneSet.add(new Phone("Apple", "iPhone 12"));
        phoneSet.add(new Phone("OnePlus", "8T"));

            System.out.println("Collection of unique phones: " + phoneSet);

    }
}
