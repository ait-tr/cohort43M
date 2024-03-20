public class Task_1 {
    public static void main(String[] args) {

        String[] fruits = {"Orange", "Apple", "Banana", "Mango"};

        for ( int i = 0; i < fruits.length; i++)
        {
            System.out.println("fruits[" + i + "] = " + fruits[i] );
        }

        fruits[1] = "Kiwi";
        System.out.println();

        for ( int i = 0; i < fruits.length; i++)
        {
            System.out.println("fruits[" + i + "] = " + fruits[i] );
        }
    }
}

/*
Задача1
- Написать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
- Вывести созданный массив на экран используя цикл for.
- Заменить в созданном массиве значение первого элемента на Kiwi (т.е. присвоить первому элементу значение Kiwi)
- Вывести измененный массив на экран используя цикл for.
Задание можно выполнить непосредственно в методе main, не создавая отдельный метод.

 */

