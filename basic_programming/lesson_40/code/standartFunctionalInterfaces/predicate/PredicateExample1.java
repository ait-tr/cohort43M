package code.standartFunctionalInterfaces.predicate;

import java.util.function.Predicate;

public class PredicateExample1 {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;

//        Predicate<Integer> isPositiveFullCode = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer > 0;
//            }
//        };

        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-7));


    }
}
