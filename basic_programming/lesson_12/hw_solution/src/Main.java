import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] fruits = {"Orange", "Apple", "Banana", "Mango"};

        System.out.println("Print odd elements");
        for (int i = 0; i < fruits.length; i++) {

            if (i % 2 != 0) {

                System.out.println(fruits[i]);
            }
        }
    }
}

/*
Задача1
Используя цикл for вывести на экран все нечетные элементы массива fruits
из первой задачи дз предыдущего занятия.
Задание можно выполнить непосредственно в методе main либо создать отдельный метод.
 */
