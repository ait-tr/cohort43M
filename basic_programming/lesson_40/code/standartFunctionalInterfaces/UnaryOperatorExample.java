package code.standartFunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> calc = x -> x * x;

       calculate(5,calc);

       calc = x -> x * x * x;

       calculate(5,calc);


    }

    public static  void calculate(Integer x, UnaryOperator<Integer> uo){
        System.out.println(uo.apply(x));
    }

}
