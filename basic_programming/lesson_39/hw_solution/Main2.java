package Homework_39.task2;


    public class Main2 {
        public static void main(String[] args) {

            SumCalculator sumCalculator = (a, b) -> a + b;

            int num1 = 5;
            int num2 = 10;

            int result = sumCalculator.calculate(num1, num2);
            System.out.println("Сумма " + num1 + " и " + num2 + " равна " + result);
        }
    }

