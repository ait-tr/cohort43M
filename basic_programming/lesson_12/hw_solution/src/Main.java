public class Main {
    /*
    Используя цикл for вывести на экран все нечетные элементы массива fruits из первой задачи дз предыдущего занятия.
    Задание можно выполнить непосредственно в методе main либо создать отдельный метод.
     */
    public static void main(String[] args) {
        System.out.println("Fruits");
        String[] fruits = {"Orange", "Apple", "Banana", "Mango"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("fruits[" + i + "] = " + fruits[i]);
        }
        fruits[1] = "Kiwi";
        System.out.println("With Kiwi");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("fruits[" + i + "] = " + fruits[i]);
        }
        System.out.println("Print even elements");
        for (int i = 0; i < fruits.length; i++) {
            if (i % 2 == 0) {
                System.out.println(fruits[i]);
            }
        }
        System.out.println("Print odd elements");
        for (int i = 0; i < fruits.length; i++){
            if (i % 2 == 1){
                System.out.println(fruits[i]);
            }
        }
        /*
    Есть массив целых чисел. Написать метод, находящий и возвращающий количество четных чисел в этом массиве.
    Пример: {1, 2, 8, 7} -> количество четных чисел = 2.
     */
        int[] array = {3, 8, 9, 4, 66, 99, 75, 78};
        int count = countEvenNumbers(array);
        System.out.println("Number of even numbers = " + count);
    }
    public static int countEvenNumbers(int[] array){
        int count = 0;
        for (int num : array){
            if (num % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
