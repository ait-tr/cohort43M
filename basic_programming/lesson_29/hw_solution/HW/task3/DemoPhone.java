package code.HW.task3;

import java.util.HashSet;
import java.util.Set;

public class DemoPhone {
    public static void main(String[] args) {
        Set<Phone> phoneSet = new HashSet<>();
        phoneSet.add(new Phone("Samsung", "A57"));
        phoneSet.add(new Phone("Samsung", "Galaxy"));
        phoneSet.add(new Phone("Samsung", "Ultra light"));
        phoneSet.add(new Phone("Iphone", "14"));
        phoneSet.add(new Phone("Iphone", "13 Pro"));
        phoneSet.add(new Phone("Samsung", "A57"));
        phoneSet.add(new Phone("Iphone", "13 Pro"));
        for (Phone phone: phoneSet){
            System.out.println(phone);
        }
    }
}
