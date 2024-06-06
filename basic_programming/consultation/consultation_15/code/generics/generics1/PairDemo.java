package code.generics.generics1;

public class PairDemo {
    public static void main(String[] args) {
        PairDoubleInteger pairDoubleInteger = new PairDoubleInteger();

        Pair<Integer, String> integerStringPair = new Pair<>(1,"james");
        Pair<String,String> stringStringPair = new Pair<>("James","Bond");

        Pair<Double,Integer> doubleIntegerPair = new Pair<>(10.5,4);


    }
}
