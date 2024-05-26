package homework_29.Phone;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListPhone {
    public static void main(String[] args) {


        List<Phone> phones = new ArrayList<>();

        Phone phone1 = new Phone("Apple", "iPhone15");
        Phone phone2 = new Phone("Apple", "iPhone12");
        Phone phone3 = new Phone("Apple", "iPhone15");
        Phone phone4 = new Phone("Apple", "iPhoneXR");

        phones.add(phone1);
        phones.add(phone2);
        phones.add(phone3);
        phones.add(phone4);


        System.out.println(phones);


    }


}








