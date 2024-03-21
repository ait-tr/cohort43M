public class Main {
    public static void main(String[] args) {
        //Task 1
        //Используя цикл for вывести на экран все нечетные элементы массива fruits из первой
        // задачи дз предыдущего занятия.
        //Задание можно выполнить непосредственно в методе main либо создать отдельный метод.
        String [] fruits = {"Orange", "Apple", "Banana", "Mango"};
        for (int i = 0; i < fruits.length; i++){
            if ( i % 2 != 0 ){
                System.out.println(fruits[i]);
            }
        }
        //Task 2
        //Есть массив целых чисел. Написать метод, находящий и возвращающий количество четных чисел в этом массиве.
        // Пример: {1, 2, 8, 7} -> количество четных чисел = 2.
        int [] nums = {1, 8, 2, 7, 11, 12};
        System.out.println("Amount of even in array is: " + countEvenSearch(nums));

    }
    public static int countEvenSearch (int[] arr){
        int count = 0;
        if(arr.length == 0)
            return -1;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
