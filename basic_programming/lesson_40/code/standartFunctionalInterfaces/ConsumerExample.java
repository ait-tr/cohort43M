package code.standartFunctionalInterfaces;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Integer> printer = x -> System.out.printf("%d долларов \n", x);

        printer.accept(600);
    }

    public static class SupplierExample {
        public static void main(String[] args) {

        }
    }
}
