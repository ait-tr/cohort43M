import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Нужно написать логическое выражение, определяющее, является ли год високосным
        Год является високосным при условии:
        1. Год делится без остатка на 4
        2. При этом год будет високосным, если он не делится на 100 без остатка
        3. Либо, если он делится на 100 без остатка, он может быть високосным,
        но только если он делится и на 400 без остатка.
         */
        int year = 2024;

        boolean a1 = (year % 4) == 0;
        boolean b1 = (year % 100) != 0;
        boolean c1 = (year % 100 ==0) && (year % 400 == 0);

        boolean leapYear = a1 && (b1 || c1);
        System.out.println("Is " + year + " a leap year? " + leapYear);

        /*
        приоритет операций
        Highest
        ++ (postfix)    --(postfix)
        ++(prefix)      --(prefix)
        *   /   %
        +   -
        >  >=   <  <=
        ==   !=
        &
        ^
        |
        &&
        ||
        =


        int x = 10;
        x++; // postfix x+1
        ++x; // prefix

         */

        // Преобразование типов
        // Type conversion

        int i = 50;
        float f;
         f = i;
        System.out.println(f);  // 50.0 получается

        long l = 12345678L;
        double d = l;
        System.out.println(d); // 1.2345678E7 - ответ

        d = 123456.0;
       // l = d;  // так нельзя, так как теряется целостная часть

        double x1, y1;
        x1 = 10.0;
        y1 = 5.0;
        System.out.println(x1/y1); // чтобы x1/y1 преобразовать в int
        // нужно добавить casting еще скобки
        // внутри скобок System.out.println((int) (x1/y1))
        // при этом он откидывает все значения после точки

        System.out.println((int) (x1/y1));

        byte b2;
        int i1;
        char ch;

        i1 = (int) (x1/y1); // casting double to int

        i1 = 70;
        b2 = (byte) i1;
        System.out.println("b2 = " + b2);

        i1 = 350;
        b2 = (byte) i1; // потеря информации
        System.out.println("b2 = " + b2);

        b2 = 88; // ASCII for X - значение в таблице ASCII
        ch = (char) b2;
        System.out.println("ch " +ch);

        var num = 1;
      //  num = "Str"


        // SCANNER

        Scanner ourScanner = new Scanner (System.in);







    }
}
