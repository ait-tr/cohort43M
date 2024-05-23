package Task_3;

import java.util.HashSet;
import java.util.Set;

public class PhoneDemo {
    public static void main(String[] args) {
        Set<Phone> phoneSet = new HashSet<>();

        phoneSet.add(new Phone("Samsung", "S13"));
        phoneSet.add(new Phone("Samsung", "A13"));
        phoneSet.add(new Phone("Apple", "iPhone15"));
        phoneSet.add(new Phone("Huawei", "P30"));
        phoneSet.add(new Phone("Sony", "Xperia10"));
        phoneSet.add(new Phone("Samsung", "S13"));
        phoneSet.add(new Phone("Samsung", "A13"));
        phoneSet.add(new Phone("Apple", "iPhone15"));

        for (Phone phone : phoneSet){
            System.out.println(phone);
        }
    }
}
