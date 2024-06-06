package code.standartFunctionalInterfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> calc = (x,y) -> x * y;

       calculate(5,7,calc);

       calc = (x,y) -> x / y;

       calculate(15,3,calc);


    }

    public static  void calculate(Integer x, Integer y, BinaryOperator<Integer> uo){
        System.out.println(uo.apply(x,y));
    }

}
