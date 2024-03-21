public class Main {

    public static void main(String[] args) {

        String[] fruits = {"Orange", "Apple", "Banana", "Mango"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
            i++;
        }

        int[] arroy = {1, 2, 8, 7};
        System.out.println("Even elements is " + counter(arroy));

    }

    public static int counter(int[] arr) {
        int q = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                q++;
            }
        }
        return q;
    }
}

//Задача1
//Используя цикл for вывести на экран все нечетные элементы массива fruits
//из первой задачи дз предыдущего занятия.
//Задание можно выполнить непосредственно в методе main либо создать отдельный метод.
//
//Задача2
//Есть массив целых чисел. Написать метод, находящий и возвращающий количество четных чисел
//в этом массиве. Пример: {1, 2, 8, 7} -> количество четных чисел = 2.