package HW_39.task_4;

public class FactorialDemo {
    public static void main(String[] args) {

        FactorialCalculator factorialCalculator = (n) -> {
            if (n < 0) throw new IllegalArgumentException("Number must be non-negative.");
            long result = 1;
            for (long i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };


        long number1 = 5;
        long number2 = 7;

        System.out.println("Factorial of " + number1 + " is: " + factorialCalculator.calculate(number1));
        System.out.println("Factorial of " + number2 + " is: " + factorialCalculator.calculate(number2));
    }
}