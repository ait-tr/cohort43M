public class Main_1 {
    public static void main(String[] args) {

        int[] ints = {1, 2, 8, 7};
        System.out.println(countEven(ints));

    }

    public static int countEven(int[] numbers) {

        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                counter++;
            }

        }
        return counter;

    }
}

/*
Задача2
Есть массив целых чисел. Написать метод, находящий и возвращающий количество
четных чисел в этом массиве. Пример: {1, 2, 8, 7} -> количество четных чисел = 2.
 */

