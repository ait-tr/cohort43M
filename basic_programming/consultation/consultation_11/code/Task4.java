package code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task4 {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            // Добавление чисел в список
            for (int i = 1; i <= 20; i++) {
                numbers.add(i);
            }

            System.out.println("Original list: " + numbers);

            // Использование Iterator для удаления четных чисел
            Iterator<Integer> iterator = numbers.iterator();
            while (iterator.hasNext()) {
                int number = iterator.next();
                if (number % 2 == 0) {
                    iterator.remove();
                }
            }

            System.out.println("List after removing even numbers: " + numbers);
        }
}
