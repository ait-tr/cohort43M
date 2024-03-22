public class Homework {
    /*
    Задача1
Используя цикл for вывести на экран все нечетные элементы массива fruits из
первой задачи дз предыдущего занятия.
Задание можно выполнить непосредственно в методе main либо создать отдельный метод.
     */

    public static void main(String[] args) {
        //                      0      1       2       3
        String[] fruits = {"Kiwi", "Orange", "Apple", "Mango"};

        for (int i = 0; i < fruits.length; i++) {
            if (i % 2 != 0)
                System.out.println(fruits[i]);
        }

        int[] ints = {1, 2, 8, 7};
        System.out.println(countEven(ints));
    }

    /*
    Задача2
Есть массив целых чисел. Написать метод, находящий и возвращающий количество четных чисел в этом массиве.
 Пример: {1, 2, 8, 7} -> количество четных чисел = 2.
     */

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
