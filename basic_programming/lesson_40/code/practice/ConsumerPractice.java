package code.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();

        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);

        Consumer<List<Integer>> modify = list -> list.replaceAll(integer -> integer * integer);

        modify.accept(integers);

        System.out.println(integers);

        Consumer<List<Integer>> displayList = list -> list.forEach(listElement -> System.out.print(listElement + ", "));
        displayList.accept(integers);

        System.out.println();

        Consumer<List<Integer>> modify2 = list -> list.replaceAll(integer -> integer * 3);

        modify2.accept(integers);

        System.out.println(integers);

        // АНАЛОГИЧНО ТОЛЬКО БЕЗ ФИ И ЛЯМБД

        integers.clear();
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);


        for (int i = 0; i < integers.size(); i++) {
            integers.set(i, integers.get(i) * integers.get(i));
        }

        System.out.println();
        for (Integer listElement : integers){
            System.out.print(listElement + ", ");
        }


    }
}
