package code.lambdaExample;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        String string = null;

        Optional<String> optionalString = Optional.ofNullable(string);

        optionalString.ifPresentOrElse(
                value -> System.out.println("Значение присутствует: " + value),
                () -> System.out.println("Значение отсутствует")
                );

        if (optionalString.isPresent()) {
            System.out.println("Значение присутствует: " + optionalString.get());
        } else {
            System.out.println("Значение отсутствует");
        }
    }
}
