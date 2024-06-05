package code.lambda;

import code.lambda.interfaces.IAverage;

public class AvgExample1 {
    public static void main(String[] args) {
        /*
        вычислить среднее арифметическое трех чисел
         */

//        IAverage average = new IAverage() {
//            @Override
//            public double avg(double a, double b, double c) {
//                return (a + b + c) / 3.0;
//            }
//        };

        IAverage average = (a, b, c) -> (a + b + c) / 3.0;

        System.out.println("Our average value: " + average.avg(10, 12, 20));
    }
}
