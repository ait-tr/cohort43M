package homework_29.Phone;

import java.util.HashSet;
import java.util.Set;

public class HashPhone {
    public static void main(String[] args) {

        Set<Phone> phones = new HashSet<>();

        phones.add(new Phone("Apple","iPhone15"));
        phones.add(new Phone("Apple","iPhoneXR"));
        phones.add(new Phone("Samsung","Galaxy S20"));
        phones.add(new Phone("Motorolla","M15"));
        phones.add(new Phone("Nokia","8008"));
        phones.add(new Phone("Apple","iPhoneXR"));

        System.out.println(phones);


        }

}

