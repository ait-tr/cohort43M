package code.generics.generics2;

import java.util.ArrayList;
import java.util.List;

public class CacheDemo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        Cache<String> stringCache = new Cache<>(strings);

        stringCache.addElement("One");
        stringCache.addElement("Two");
        stringCache.addElement("Three");

        stringCache.printList();

        //-----------


        List<Cat> cats = new ArrayList<>();
        Cache<Cat> catCache = new Cache<>(cats);

        catCache.addElement(new Cat("Barsik"));
        catCache.addElement(new Cat("Murzik"));

        catCache.printList();
    }
}
