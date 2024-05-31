package code.generics.practice.example1;

public class NumberDemo {
    public static void main(String[] args) {
        IntegerData integerData = new IntegerData();
        DoubleData doubleData = new DoubleData();
        integerData.number = 15;
        doubleData.number = 3.1415;

        OnlyNumbers<Integer> integerOnlyNumbers = new OnlyNumbers<>(10);
        OnlyNumbers<Double> doubleOnlyNumbers = new OnlyNumbers<>(3.1415);

        integerOnlyNumbers.printNumber();
        doubleOnlyNumbers.printNumber();

        // OnlyNumbers<String> stringOnlyNumbers = new OnlyNumbers<String>("число");

        integerOnlyNumbers.printSquare();
        doubleOnlyNumbers.printSquare();

    }
}
