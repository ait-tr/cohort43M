package HomeWorkL39.Task2;

public class SumCalculatorExample {
//Напишите функциональный интерфейс для вычисления суммы двух целых чисел.
    public static void main(String[] args) {

        SumCalculator sumCalculator = (a, b) -> a + b;


        int num1 = 17;
        int num2 = 70;
        int result = sumCalculator.calculate(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + result);
    }
}
