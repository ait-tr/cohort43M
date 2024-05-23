package code.Task3;

import java.util.HashSet;
import java.util.Set;

public class PhonesSet {
    public static void main(String[] args) {

        Set<Phone> phones = new HashSet<>();

        phones.add(new Phone("Apple","15"));
        phones.add(new Phone("Apple","15"));
        phones.add(new Phone("Apple","15"));
        phones.add(new Phone("Samsung","A56"));
        phones.add(new Phone("Oppo","Super"));
        phones.add(new Phone("Sony","E123"));

        System.out.println(phones);






    }
}