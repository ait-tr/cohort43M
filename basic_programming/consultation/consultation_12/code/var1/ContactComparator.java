package code.var1;

import java.util.Comparator;

public class ContactComparator implements Comparator<Contact> {
    @Override
    public int compare(Contact o1, Contact o2) {
        if (o1.getName().compareTo(o2.getName()) == 0) {
            return o1.getPhoneNumber().compareTo(o2.getPhoneNumber());
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
