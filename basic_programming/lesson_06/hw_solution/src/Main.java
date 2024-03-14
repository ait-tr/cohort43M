public class Main {
    public static void main(String[] args) {

        //Условный оператор
        /*
        IF Statement
        control flow statement

        1. if (condition) statement
         */
        int num = 500;
        if (num <= 100) { //фигурные скобки можно не ставить, будет считаться условием только следующая строка
            System.out.println("num <= 100");
        }

        System.out.println(" after IF | num >=100");
    /*
    2. if - else statement
        if (condition) {
        statements
        }
        else {
        statement
        }
     */
        if (num <= 100) {
            System.out.println("num <= 100");
        } else {
            System.out.println(" after IF | num >=100");
        }
        /*
        3. if внутри if
        if (condition) {
        statements;
        }
        else {
        statement
        }
         */
        int number = 50;
        if (number < 100) {
            System.out.println("number is less than 100");

            if (number > 40) {
                System.out.println("number is greater than 40");
            }
        }
        /*
        4. if-else-if
        if (condition)
            statement
        else if (condition)
            statement
        else if (condition)
            statement
            .
            .
            .
        else
        statement
         */
        int x = 7;
        if (x == 1) {
            System.out.println("x = 1");
        }
        else if (x == 2) {
            System.out.println("x = 2");
        }
        else if (x == 3) {
            System.out.println("x = 3");
        }
        else {
            System.out.println("x is not between 1 and 4");
        }
        System.out.println("=========\n " + "\"Els if\" is over");

        /*
        Определить количество цифр положительного числа
        Решение:
            i >=1, i <10 -> 1 цифра
            i >=10, i <100 -> 2 цифры
            i >=100, i <1000 -> 3 цифры
            i >= 1000 -> 4 цифры
         */
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
        int i = 121111;

        Math.abs(i); //модуль числа - отбрасываем знак
        /*
        модуль числа через if
        if (i < 0)
            i = -i;
         */

        if (i < 10 && i >=1) {
            System.out.println("It's one digit number");
        }
        else if (i < 100 && i >=10) {
            System.out.println("It's two digit number");
        }
        else if (i < 1000 && i >=100) {
            System.out.println("It's three digit number");
        }
        else {
            System.out.println("It's more than three digit number");
        }
    }
}
