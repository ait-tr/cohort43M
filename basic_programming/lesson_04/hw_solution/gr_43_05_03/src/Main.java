import jdk.dynalink.beans.StaticClass;

public class Main {
    static int square (int a) {
        return a * a;
    }
    public static void main(String[] args) {
        System.out.println("Hello Java! ");
        System.out.println("My name is ");
        System.out.println("Kateryna");


        System.out.print("Hello Java! ");
        System.out.print("My name is ");
        System.out.print("Kateryna ");

        int x;
        x = 10;
        System.out.println(x);
        x = 15;
        System.out.println(x);
        int y = 5;
        x = y + 1 + x;
        x = y;
        System.out.println(x + y);

        int sum = x + y;
        System.out.println(sum);

        int fifty = 50;
        System.out.println(fifty + "1");
        System.out.println(fifty + 1);

        System.out.println("variable fifty is " + fifty);
        System.out.println("Sum of 1 and 2 = " + (1 + 2));

        String firstName = "Kateryna";
        int age = 34;
        String country = " Ukraine ";

        System.out.println("My name is " + firstName);
        System.out.println("I am " + age + " years old");
        System.out.println("I am from " + country);

// 07.03 Homework
//1
        int x1 = 25;
        int x2 = 3;
        double y1 = (double) x1 / x2;
        System.out.println(y1);

        int remainder = x1 % x2;
        System.out.println(remainder);

        //2
        int a = 4;
        int n = 2;

int power = a* a * (n-1);
        System.out.println(power);

        int result = a * a;
        System.out.println(result);

        System.out.println(square(4));

        System.out.println(Math.pow(4,2));

// 11.03 Homework

//1
        int a1, b;
        a1= 10;
       b = 0;
        if (a1 == 10 || (a1 + b) == 10) {
            System.out.println("i have to write a sentence " + true);

        }
}}