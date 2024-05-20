package homeWork;

import java.util.ArrayList;
import java.util.Random;

public class Number {
    public static void main(String[] args) {

        // Создайте ArrayList для хранения целых чисел.
        ArrayList<Integer> numbers = new ArrayList<>();

        //Добавьте в список случайные числа в диапазоне от 1 до 100.
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1;
            numbers.add(randomNumber);
        }

        System.out.println("10 чисел от 1-100: " + numbers);

        //Найдите и выведите максимальное и минимальное числа в списке.
        int maxNumber = numbers.get(0);
        int minNumber = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
        }
        System.out.println("Максимальное число: " + maxNumber);
        System.out.println("Минимальное число: " + minNumber);

        //Отсортируйте список в порядке возрастания и выведите его.
        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) > numbers.get(j)) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }

        System.out.println("Отсортированный список: " + numbers);







    }
}
