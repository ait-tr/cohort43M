import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class IntegerList {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(20);
        integers.add(99);
        integers.add(23);
        integers.add(31);
        integers.add(19);
        integers.add(67);
        integers.add(5);
        integers.add(8);
        integers.add(85);
        integers.add(49);
        integers.add(68);
        integers.add(99);
        integers.add(1);
        integers.add(99);
        integers.add(30);
        integers.add(20);
        integers.add(99);
        integers.add(99);
        integers.add(43);
        integers.add(1);
        integers.add(1);

        System.out.println("\nСозданый Список integers включает следующие значения:");
        System.out.println(integers);

        int max = Collections.max(integers);
        System.out.println("\nМаксимальное значение: " + max);

        int min = Collections.min(integers);
        System.out.println("\nМинимальное значение: " + min);

        Collections.sort(integers);
        System.out.println("\nВывод отсортированного списка по возрастанию: "+ integers);

        Collections.reverse(integers);
        System.out.println("\nВывод отсортированного списка по убыванию: " + integers);

    }
}
