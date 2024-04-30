package code.classExample3;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum();
        calculator.sum1(120,150);

        int resultSum3 = calculator.sum2(250,300);

        System.out.println("Результат работы метода sum3 = " + resultSum3);
    }
}
