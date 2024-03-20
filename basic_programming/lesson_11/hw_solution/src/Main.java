public class Main {

    public static void main(String[] args) {
        //Task 1
        //-Cоздать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
        //-Вывести созданный массив на экран используя цикл for.
        //-Заменить в созданном массиве значение первого элемента на Kiwi (т.е. присвоить первому элементу значение Kiwi)
        //-Вывести измененный массив на экран используя цикл for.
        //Задание можно выполнить непосредственно в методе main, не создавая отдельный метод.

        System.out.println("Table of fruits: ");
        String [] fruits = {"Orange","Apple","Banana","Mango"};
        for (int i = 0; i < fruits.length; i++)
        {
           System.out.println(i + " - " + fruits[i]);
        }
        System.out.println("The first line have been changed to Kiwi!");
        fruits[0] = "Kiwi";
        for (int i = 0; i < fruits.length; i++)
        {
            System.out.println(i + " - " + fruits[i]);
        }
        //Task 2
        //Дан массив целых чисел. Написать метод, возвращающий наименьший элемент массива.
        //public static int findMin(int[] ints)
        System.out.println("Massive of numbers: ");
        int [] numbers = {4, 10, 2, 50, 7};
        for (int i = 0; i < fruits.length; i++)
        {
            System.out.print(numbers[i] + "; ");
        }
        System.out.println("\nMIN number from massive => " + findMin(numbers));

    }
    public static int findMin(int[]ints){
        int min = ints[0];
        for (int i = 0; i < ints.length; i++){
            if(ints[i] < min){
                min = ints[i];
            }
        }
        return min;
    }
}
