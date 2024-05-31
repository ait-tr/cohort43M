package code.generics.practice.tasks;

public class CalcGeneric {
    public static void main(String[] args) {
        GenericCalculator<Integer> intCalculator = new GenericCalculator<>();
        System.out.println("Integer Addition: " + intCalculator.add(5, 3)); // Вывод: 8

        GenericCalculator<Double> doubleCalculator = new GenericCalculator<>();
        System.out.println("Double Division: " + doubleCalculator.divide(10.0, 4.0)); // Вывод: 2.5
    }
}
