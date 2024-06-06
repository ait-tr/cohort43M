package task_4;

public class FactorialDemo {
    //Напишите функциональный интерфейс для вычисления факториала числа.
    public static void main(String[] args) {
IFactorialCalc factorialCalc = (n) -> {
    int result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
};
int number = 5;
int factOfNumber = factorialCalc.calculate(number);
        System.out.println("Factorial of " + number + " is: " + factOfNumber);
    }
}
