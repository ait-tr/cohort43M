package code.lambda;

import code.lambda.interfaces.IAverage;

public class AvgExample3 {
    public static void main(String[] args) {
        /*
        вычислить среднее арифметическое трех чисел
         */

        IAverage ref1 = (x, y, z) -> (x + y + z) / 3.0;
        printMyAverage(ref1, 10,12,20);


        IAverage ref2 = (x, y, z) ->
        {
           double avg = (x + y + z) / 3.0;
           avg = avg * Math.PI;
           avg = Math.sqrt(avg) / z;
           return avg;
        };

        printMyAverage(ref2, 10,12,20);

        IAverage ref3 = (x, y, z) ->
        {
            double avg = (x + y + z) / 3.0;
            double result = avg * avg;
            return result;
        };

        printMyAverage(ref3, 10,12,20);

    }

 public static void printMyAverage(IAverage average, double a, double b, double c){

     System.out.println("Our average value: " + average.avg(a,b,c));

 }
}
