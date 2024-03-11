public class Main {

    public static void main(String[] args) {
        double result = 25.0 / 3;
        System.out.println(result);


        int remainder = 25 % 3;
        System.out.println(remainder);

        int n = 5;
        System.out.println(n * n);

        int abs1 = Math.abs(-10); // значение по модулю
        System.out.println(abs1);

        int a = 1;
        int b = 2;
        int min = Math.min(a, b); // минимум
        System.out.println(min);

        int max = Math.max(a, b); // максимум
        System.out.println(max);

        double roundDown = Math.round(21.234);
        System.out.println("roundDown = " + roundDown);

        double roundUp = Math.round(21.57);
        System.out.println("roundUp = " + roundUp);


        double rand = Math.random();// генерирует случайное число в диапазоне от 0 до 1
        System.out.println(Math.random() * 1000 + 100);

        double power = Math.pow(3, 2); // возведение в степень
        System.out.println(power);
        System.out.println(Math.pow(2, 3));

        System.out.println(Math.sqrt(4)); //  извлечение корня

        // число PI = 3.14
        System.out.println(Math.PI);


        // Тип Boolean . Имеет 2 значения - true, false
        boolean bol;
        bol = false;
        System.out.println("bol is " + bol);

        bol = true;
        System.out.println("bol is " + bol);

        // Relational and logical operators
        // операторы сравнения и логические операторы

        /*
        Операторы сравнения:
         ==  равенство
         !=  не равно
         >   больше
         <    меньше
         >=  больше равно
         <=  меньше равно
         */

        int i = 9;
        int j = 10;

        // boolean res;
        boolean res = i == j;
        res = i != j;
        res = i > j;
        res = i < j;
        res = i >= j;
        res = i <= j;

        System.out.println(i < j);


       /*
        logical operators

        &  AND (И)
        |  OR ( ИЛИ)
        !  NOT  (НЕ)
        ^  XOR  ( исключающее ИЛИ)

        &&
        ||
        */

        boolean p = false;
        boolean q = false;
        System.out.println(p ^ q);
        /*
        Если значения p  и q  одинаковые, то результат False.  Если разные , то True
        p       q       p^q
        False   False   False
        True    False   True
        False   True    True
        True    True    False
         */

        if (p & q) {
            System.out.println("10 < 9");
        }

        int n1, d1;

        n1 = 10;
        d1 = 0;
        //  System.out.println(n1 % d1 == 0);

        //  false   &
        if (d1 != 0 && (n1 % d1) == 0) {
            System.out.println("can be divided without remainder");
        }

        /*
        Джон спит днем если у него выходной день или  отпуск. Переменная weekday( рабочий день) = true  если
        это рабочий день. Переменная  vacation = true  если  Джона отпуск.
        Написать логическое выражение, результатом которого  будет true  если Джон спит и false  если он не спит

        boolean sleep

        weekday  vacation    sleep
        false     false  ->   true
        true      false  ->   false
        false     true  ->    true
        true      true  ->  not possible

        sleep =
         */
        boolean weekday = false;
        boolean vacation = true;
        boolean sleep = !weekday || vacation;
        System.out.println("John is sleeping? " + sleep);


    }


}
