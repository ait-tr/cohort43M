package code.arrayList;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {

        Integer x1 = 10;
        Double y1 = 10.0;

        Integer x = x1 + 10;

        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println(integers.size());

        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        System.out.println(integers.size());
        System.out.println(integers);


        for (int i = 100; i < 120; i++) {
            integers.add(i);
        }

        System.out.println(integers.size());
        System.out.println(integers);


    }
}
