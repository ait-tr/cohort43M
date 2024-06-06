package task_2;

public class SumResult {
    //Напишите функциональный интерфейс для вычисления суммы двух целых чисел.
    public static void main(String[] args) {
        SumInterface sumFunc = (a, b) -> (a + b);
        int res = sumFunc.sum(4, 8);
        System.out.println("Sum of a + b is: " + res);
    }
}
