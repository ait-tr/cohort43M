public class Main {
    public static void main(String[] args) {
        //Task 1
        //Написать метод, считающий сумму двух целых чисел и возвращающий результат в основную программу.
        // Значения этих чисел должны передаваться в качестве аргументов метода.
        //Затем, в методе main вывести полученный результат на экран
        int sum;
        sum = calcSum(12,3);
        System.out.println("Result of calculation is " + sum);

        // Task 2
        //Написать метод, конвертирующий температуру из градусов Фаренгейта в градусы Цельсия по формуле С = 5*(F-32)/9.
        // Значение градусов Фаренгейта должно передаваться как аргумент метода.
        //Метод должен возвращать полученное значение в основную программу.
        //Затем, в методе main вывести полученное значение на экран.

        double tempC = calcC(2);
        System.out.println("Temperature in celsius is = " + tempC);


    }
    public static int calcSum(int a1, int b1){
        int result = a1 + b1;
        System.out.println("a1 + b1 = " + result);
        return result;
    }

    public static double calcC(double f1) {
        double celsius = 5.0 * (f1 - 32.0) / 9.0;
        System.out.println("Celsius is = " + celsius);

        return celsius;
    }
}
