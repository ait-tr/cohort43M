public class Main {

    public static void main(String[] args) {


        String[] fruits = {"Orange", "Apple", "Banana", "Mango" };
        for (int i = 0; i < fruits.length; i++) {
            System.out.println((i + 1) + " element is " + fruits[i]);

        }
        System.out.println();

        fruits[0] = "Kiwi";

        for (int i = 0; i < fruits.length; i++) {
            System.out.println((i + 1) + " element is " + fruits[i]);
        }

        //Задача1
        //-Cоздать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
        //-Вывести созданный массив на экран используя цикл for.
        //-Заменить в созданном массиве значение первого элемента на Kiwi
        // (т.е. присвоить первому элементу значение Kiwi)
        //-Вывести измененный массив на экран используя цикл for.
        //Задание можно выполнить непосредственно в методе main, не создавая отдельный метод.

        //Задача2
        //Дан массив целых чисел. Написать метод, возвращающий наименьший элемент массива.
        //public static int findMin(int[] ints)

        int ints[] = {10, 2, 3, 4, 115, 6, 7, 8, 99, 1111};


        System.out.println();
        System.out.println("Min = " + findMin(ints));
    }

    public static int findMin(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
