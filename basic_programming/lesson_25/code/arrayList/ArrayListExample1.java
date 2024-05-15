package code.arrayList;

import java.util.ArrayList;

public class ArrayListExample1 {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        System.out.println(strings);
        System.out.println(strings.size());

        strings.add("Text1");
        strings.add("Text2");
        strings.add("Text3");
        strings.add("Text4");
        strings.add("Text5");

        System.out.println(strings);
        System.out.println("Размер коллекции: " + strings.size());





    }
}
