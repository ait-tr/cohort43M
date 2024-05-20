//Создайте ArrayList для хранения целых чисел.
//Добавьте в список случайные числа в диапазоне от 1 до 100.
//Найдите и выведите максимальное и минимальное числа в списке.
//Отсортируйте список в порядке возрастания и выведите его.

import java.util.ArrayList;
import java.util.Collections;


public class DigitsInt {
    public static void main(String[] args) {

        int arrayListSize = 33;

        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < arrayListSize; i++) {
            int integer  = (int) (Math.random()*100);
            integers.add(integer);
        }

        System.out.println("Дано "+integers.size()+" случайных чисел");
        System.out.println(integers);

        int maxOldStyle = integers.getFirst();
        int minOldStyle = integers.getFirst();

        for ( int i = 0; i < arrayListSize; i++) {
            if (maxOldStyle < integers.get(i)) {
                maxOldStyle = integers.get(i);
            }
            if (minOldStyle > integers.get(i)) {
                minOldStyle = integers.get(i);
            }
        }
             int max = Collections.max(integers);
             int min = Collections.min(integers);

        System.out.println("Макс число в списке - " + maxOldStyle + " / *** " + max + " / ");
        System.out.println("Мин число в списке - " + minOldStyle + " / *** " + min + " / ");

        for (int i = 0; i < integers.size() - 1; i++) {
            for (int j = 0; j < integers.size() - 1 - i; j++) {
                if (integers.get(j) > integers.get(j + 1)) {
                    int temp = integers.get(j);
                    integers.set(j, integers.get(j + 1));
                    integers.set(j + 1, temp);
                }
            }
        }
        System.out.println("ОтсортированыЙ по возрастанию список");
        System.out.println(integers);

        Collections.shuffle(integers);

        System.out.println("*** Перемешали все элементы");
        System.out.println(integers);

        Collections.sort(integers);

        System.out.println("*** И опять отсортировали");
        System.out.println(integers);


    }

}
