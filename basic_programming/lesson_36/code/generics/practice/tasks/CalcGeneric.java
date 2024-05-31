package code.generics.practice.tasks;

public class CalcGeneric {
    public static void main(String[] args) {
        GenericCalculator<Integer> intCalculator = new GenericCalculator<>();
        System.out.println("Integer Addition: " + intCalculator.add(5, 3)); 

        GenericCalculator<Double> doubleCalculator = new GenericCalculator<>();
        System.out.println("Double Division: " + doubleCalculator.divide(10.0, 4.0));

        GenericCalculator1<Integer, Integer> intCalculator3 = new GenericCalculator1<>();
        System.out.println("Integer Addition: " + intCalculator3.add(5, 3));



        System.out.println("Integer Divide: " + intCalculator.divide(5, 3));

    }
}
