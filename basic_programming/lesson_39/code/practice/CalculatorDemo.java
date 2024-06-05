package code.practice;

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator calculator =  (x,y) -> {return x + y;};

        System.out.println("Результат операции сложения: " + calculator.operationResult(5,7));


        calculator = (x,y) -> x * y;

//        Calculator fullClassText = new Calculator() {
//            @Override
//            public double operationResult(double x, double y) {
//                return x * y;
//            }
//        };
//
//        System.out.println("Результат операции умножения: " + fullClassText.operationResult(5,7));


        System.out.println("Результат операции умножения: " + calculator.operationResult(5,7));


        calculator = (x,y) -> x - y;

        System.out.println("Результат операции вычитания: " + calculator.operationResult(5,7));


        calculator = (x,y) -> x / y;

        System.out.println("Результат операции деления: " + calculator.operationResult(5,7));



    }
}
