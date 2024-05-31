package code.generics.nonGenerics;

import java.util.ArrayList;
import java.util.List;

public class NonGenericExample3 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("123");
        //list.add(1);
        list.add("true");

       printData(list);

    }

    public static void printData(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println("Длина строки = " + item.length());
        }
    }
}
