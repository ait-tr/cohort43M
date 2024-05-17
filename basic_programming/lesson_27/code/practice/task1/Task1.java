package code.practice.task1;

public class Task1 {
    /*
    написать метод, который получает на входе массив
    должен посчитать и вернуть данные о том сколько раз
    каждый уникальный элемент массива повторяется
     */

    public static void main(String[] args) {
        int[] arr = {1,7,49,4,12,9,45,3,9,23,1,7,12,1,7,23};

        ArrayToMap service = new ArrayToMap();

        System.out.println(service.counter(arr));

    }


}
