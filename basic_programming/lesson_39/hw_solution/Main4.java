package Homework_39.task4;

public class Main4 {
    public static void main(String[] args) {

        Factorial factorialCalculator = n -> {

            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };


        int num1 = 5;
        int num2 = 10;


        long result1 = factorialCalculator.calculate(num1);
        long result2 = factorialCalculator.calculate(num2);


        System.out.println("Факториал " + num1 + " равен " + result1);
        System.out.println("Факториал " + num2 + " равен " + result2);
    }
}

