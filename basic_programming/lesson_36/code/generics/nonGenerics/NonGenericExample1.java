package code.generics.nonGenerics;

import java.util.ArrayList;
import java.util.List;

public class NonGenericExample1 {
    public static void main(String[] args) {

        List list = new ArrayList<>(); // raw type - "сырой" тип
        list.add("Hello");
        String text = (String) list.get(0);

        System.out.println(text);

    }
}
