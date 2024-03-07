public class Main {

    public static void main(String[] args) {
        /*
        Задача 1
Напишите программу, которая выводит на экран информацию о вас (или выдуманном персонаже) в три строчки:
"Меня зовут ..."
"Мне ... лет"
"Я из ..."
На месте многоточий должны использоваться переменные!
         */

        String name = "John";
      //  name = "Bill";
        int age = 30;
        String city = "Berlin";

        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("I am from " + city);

       // Variables Types
        byte b = 100;
      //  b = 1000;
        short s = 30000;
        long l = 12_345_678_989L;

        // вещественные типы ( с точкой)
        float f = 3.134f;

        double d = 34567.78D;

        int result = 10/3;
        // + - * / %
        System.out.println(result);
        int remainder = 10%3;
        System.out.println("10 % 3 = " + remainder);

        double doubleResult = 10.0/3;
        System.out.println("10 / 3 with remainder = " + doubleResult);

        int x = 0;
        x = x + 1;
        x++; // increment ,  увеличивает значение переменной на 1
        x = x -1;
        x--; // decrement,  уменьшает значение на 1
       // x = x +5;
       // x+=5;
        ++x;
        --x;

        int y;
        x = 10;
      //  y = x + 1;
        y = ++x;
        y = x++;
        System.out.println("x= " + x);
        System.out.println("y = " + y);

        x++;
        x = x + 1;

        int a = 5;
        a++;
        System.out.println("a = " + a);

        x = x - 10;
        x -= 10;

        // char
        // ASCII

        char ch;
        ch = 'X';
        System.out.println("This is character " + ch);
        ch++;
        System.out.println("Char  is " + ch);

        ch = 90;
        System.out.println("Char now is " + ch);

       char ch1 = 'k';
      // String str = "my name is "Evgeny""
        /*
        \'
        \"
        \\
        \n
        \t

         */
        ch ='\'';

        char u = '\u0024';
        System.out.println(u);

        char dollar = '$';

        int i = 100;
        float fl;
        fl = i;
        System.out.println(fl);

        /*
        автоматическое преобразование типов возможно когда:
        1. Типы данных совместимы
        2. тип, в который происходит преобразование должен быть больше чем тип источника
         */







    }
}
