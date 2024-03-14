public class Main {

    public static void main(String[] args) {

       int a1 = 12;
       int a2 = 20;

       System.out.println("Summ "+a1+" and "+a2+" is "+sumTwo(a1,a2));
        System.out.println();

        System.out.print("Also " +sumTwo(a1,a2) +" of Farenheit ");
        System.out.println("it`s "+convertFar(sumTwo(a1,a2))+" degrees of Celsius");

    }
    //Задача 1
    //Написать метод, считающий сумму двух целых чисел
    // и возвращающий результат в основную программу.
    // Значения этих чисел должны передаваться в качестве аргументов метода.
    //Затем, в методе main вывести полученный результат на экран

    public static int sumTwo (int a1 ,int a2 ) {
    int sum=a1+a2;
    return sum;

    }

    //Задача 2*
    //Написать метод, конвертирующий температуру из градусов Фаренгейта в градусы Цельсия
    // по формуле С = 5*(F-32)/9
    // Значение градусов Фаренгейта должно передаваться как аргумент метода.
    //Метод должен возвращать полученное значение в основную программу.
    //Затем, в методе main вывести полученное значение на экран.

    public static double convertFar ( double f ) {
        double cel = 5 * (f - 32) / 9;
        return cel;
    }
}
