public class HW {
    public static void main(String[] args) {

        /*
        Задача1
-Cоздать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
-Вывести созданный массив на экран используя цикл for.
-Заменить в созданном массиве значение первого элемента на Kiwi (т.е. присвоить первому элементу значение Kiwi)
-Вывести измененный массив на экран используя цикл for.
Задание можно выполнить непосредственно в методе main, не создавая отдельный метод.
         */
        String [] fruits = {"Orange", "Apple", "Banana", "Mango"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruits [" + i + "] = " + fruits[i]);
        }

        fruits[0] = "Kiwi";
        System.out.println("Change to Kiwi:");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruits [" + i + "] = " + fruits[i]);
        }



        /*
        Задача2
Дан массив целых чисел. Написать метод, возвращающий наименьший элемент массива.
public static int findMin(int[] ints)
         */

        System.out.println("Print min");
        int[] nums = {3, 35, 6, 2, 46};
        System.out.println(findMin(nums));

    }

    public static int findMin (int[] ints) {
        int min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < min) {
               min = ints[i];
            }

        }
        return min;

    }
}
