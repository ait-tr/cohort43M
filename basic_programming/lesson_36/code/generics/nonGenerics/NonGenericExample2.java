package code.generics.nonGenerics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NonGenericExample2 {
    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add("Hello");
        list.add(123);
        list.add(true);

        for (Object str : list){
            System.out.println((String) str);
        }
    }
}
