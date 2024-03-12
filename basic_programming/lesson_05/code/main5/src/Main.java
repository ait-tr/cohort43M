public class Main {
    public static void main(String[] args) {
        /*
        Пусть есть две переменные целого типа a и b. Используя логические операторы
        написать выражение, результат которого будет true если значение
         хотя бы одной из этих переменных равно 10 или их сумма равна 10.
         */
        int a, b;
        a = 8;
        b = 2;

        boolean result = a == 10 || b == 10 || a + b == 10;
        //  System.out.println("Result is " +result );

        /*
        Написать логическое выражение, определяющее является ли год високосным
        Год является високосным при таких условиях:
        1. Год делится без остатка на 4 - обязательное условие високосности года
        2. При этом год будет високосным если он не делится на 100 без остатка
        3. Либо год даже при том что он делится без остатка на 100 может быть високосным,но только в том случае если он
            делится и на 400 без остатка
         */
        int year = 2024;

        boolean a1 = (year % 4) == 0;
        boolean b1 = (year % 100) != 0;
        boolean c1 = (year % 100 == 0) && (year % 400 == 0);
        boolean isLeapYear = a1 && (b1 || c1);
        //  System.out.println("Is " + year + " a leap year ? " + isLeapYear);

        /*
        приоритет операций
        Highest
        ++(postfix)   --(postfix)
        ++(prefix)    --(prefix)   !
        *   /   %
        +  -
        >  >=  <  <=
        ==    !=
        &
        ^
        |
        &&
        ||
        =

        Lowest

         */
        int x = 10;
        // x++; // postfix
        ++x; // prefix

        /*
        Преобразование типов
        Type Conversion


         */
        int i = 50;
        float f;
        f = i;
        System.out.println(f);

        long l = 12345678L;
        double d = l;
        System.out.println(d);

        d = 123456.0;
        // l = d;

        double x1, y1;
        x1 = 10.0;
        y1 = 3.0;
        System.out.println((int) (x1 / y1));
        byte b2;
        int i1 = 1000;
        char ch;

        i1 = (int) (x1 / y1); // casting double to int

        i1 = 70;
        b2 = (byte) i1;
        System.out.println("b2 = " + b2);

        i1 = 350;
        b2 = (byte) i1; //  потеря информации
        System.out.println("b2 = " + b2);

        b2 = 88; // ASCII for X
        ch = (char) b2;
        System.out.println("ch = " + ch);


        // VAR
        double j = 1000.0;
        boolean b3 = true;
        var jVariable = 10;
        //  b3 = 10;
        jVariable = 100;

        int var = 35;
        var m = -var;
        var num = 10.0;
        //  num = "Str"


    }

}
