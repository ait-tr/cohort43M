package code.practice;

public class LambdaExample1 {
    public static void main(String[] args) {
        MyNumber myNumber ;

        // ------ первый вариант логики работы метода getValue -----

        // одиночное лямбда-выражение
        myNumber = (a,b,c) -> (a + b + c); // вычисление суммы трех переменных

        double sumResult = myNumber.getValue(5,7.5,3.8);
        System.out.println("SumResult = " + sumResult);


        // ------ второй вариант логики работы метода getValue -----

        // нахождение максимума

        myNumber = (a,b,c) -> {
            double max = a;
            if (max < b) max = b;
            if (max < c) max = c;
            return max;

        };

        double maxResult = myNumber.getValue(5,7.5,3.8);
        System.out.println("MaxResult = " + maxResult);


    }
}
