package code.standartFunctionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, String> convert = x -> String.valueOf(x) + " евро";

        String str = convert.apply(600);

        System.out.println(str);
    }
}
