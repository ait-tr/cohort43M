public class Task_2 {
    public static void main(String[] args) {

int[] array = {2, 18, 37, 99, 16};
findMin(array);
    }

    public static void findMin(int[] arr){
        int min = arr[0];

        for ( int i = 0; i < arr.length; i++){
            if( arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}

/*
Задача2
Дан массив целых чисел. Написать метод, возвращающий наименьший элемент массива.
public static int findMin(int[] ints)
 */
