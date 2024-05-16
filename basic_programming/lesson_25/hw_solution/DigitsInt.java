//Создайте ArrayList для хранения целых чисел.
//Добавьте в список случайные числа в диапазоне от 1 до 100.
//Найдите и выведите максимальное и минимальное числа в списке.
//Отсортируйте список в порядке возрастания и выведите его.

import java.sql.SQLOutput;
import java.util.ArrayList;


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

        int max = integers.getFirst();
        int min = integers.getFirst();

        for ( int i = 0; i < arrayListSize; i++) {
            if (max < integers.get(i)) {
                max = integers.get(i);
            }
            if (min > integers.get(i)) {
                min = integers.get(i);
            }
        }


        System.out.println("Максимальное число в списке - " + max);
        System.out.println("Минимальное число в списке - " + min);

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

    }

}
