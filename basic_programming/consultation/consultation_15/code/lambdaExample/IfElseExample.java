package code.lambdaExample;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class IfElseExample {
    public static void main(String[] args) {

        int x = -10;

        if (x < 0) {
            System.out.println("число отрицательное");
        }

        if (x % 2 == 0) {
            System.out.println("число четное");
        }

        //------------------------------


        Function<Integer, String> checkNegative = v -> v < 0 ? "число отрицательное" : "число положительное";

        Function<Integer, String> checkEven = v -> v % 2 == 0 ? "число четное" : "число не четное";

        String checkNegativeMessage = checkNegative.apply(x);

        String checkEvenMessage = checkEven.apply(x);


        System.out.println(checkNegativeMessage);

        System.out.println(checkEvenMessage);


        // -----------

        Predicate<Integer> isNegative = v -> v < 0;
        Predicate<Integer> isEven = v -> v % 2 == 0;

        if (isNegative.test(x)) {
            System.out.println("число отрицательное");
        }

        if (isEven.test(x)){
            System.out.println("число четное");
        }


    }
}
