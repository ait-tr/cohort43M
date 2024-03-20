public class Zadacha2 {
    /*    Задача2
Дан массив целых чисел. Написать метод, возвращающий наименьший элемент массива.
public static int findMin(int[] ints)  */
    public static void main(String[] args) {

    }
    public static int findMin(int[] ints) {

        int min = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
            }
        }
        System.out.println(min);
        return min;

    }
}


