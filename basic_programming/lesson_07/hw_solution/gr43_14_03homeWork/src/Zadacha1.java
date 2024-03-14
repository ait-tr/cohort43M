public class Zadacha1 {
    public static void main(String[] args) {
        /* Задача 1
Написать метод, считающий сумму двух целых чисел и возвращающий результат в основную программу.
 Значения этих чисел должны передаваться в качестве аргументов метода.
Затем, в методе main вывести полученный результат на экран */
        mymetod(10,13);    }
    public static int mymetod(int a, int b){
        int sum = a + b;
        System.out.println("a + b = "+sum);
        return sum;

    }
}
