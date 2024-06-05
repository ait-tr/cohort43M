package code.lambda;

import code.lambda.interfaces.IAverage;

public class AvgExample2 {
    public static void main(String[] args) {
        /*
        вычислить среднее арифметическое трех чисел
         */

        printMyAverage(10,12,20);

 }

 public static void printMyAverage(double a, double b, double c){
     IAverage average = (x, y, z) -> (x + y + z) / 3.0;

     System.out.println("Our average value: " + average.avg(a,b,c));

 }
}
