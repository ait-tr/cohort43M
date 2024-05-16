package code.practice.listInterface;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("Text1");
        strings.add("Text2");
        strings.add("Text3");
        strings.add("Text4");
        strings.add("Text5");


        for (int i = 0; i < strings.size(); i++) {
            String currentElement = strings.get(i);
            currentElement = currentElement + " ! ";
            strings.set(i, currentElement);
            System.out.println(strings.get(i));
        }


        System.out.println("==============");

        for ( String currentElement : strings) {
            currentElement = currentElement + " !!! ";
            System.out.println(currentElement);
        }

        System.out.println("==============");

        System.out.println(strings);
    }
}
