public class Main {
    public static void main(String[] args) {
        /*
        Написать программу, выводящую на экран ASCII значение символа.
Пример: 'А' результат - 65
         */
        char ch = '\n';
        String str = "A";
        int intCh = 'A';
      //  System.out.println(intCh);


        /*
        IF Statement
        control flow statements

        1. if(condition) statement
         */
        int num = 500;
        if( num <= 100) { // команды в фигурных скобках после if будут выполняться только если условие в круглых скобках
                            //  истинно. Иначе эти команды игнорируются
        //    System.out.println("num <= 100");
        //    System.out.println("This is still if");
        }
       // System.out.println("After if statement");

        /*
        2. if - else statement
        if(condition){
        statements
        }
        else {
        statement
        }
         */
        num = 30;
        if( num <= 100){
      //      System.out.println("num <= 100");
        }
        else{
       //     System.out.println("num > 100");
        }

        /*
        3. if внутри if

        if( condition1){
            statements;

            if(condition2){
                statements
            }

        }
         */
        int number = 160;

        if( number < 100){
      //      System.out.println(" number is less 100");

            if( number > 40){
       //         System.out.println("number is greater than 40");
            }
        }

        /*
        4. if-else-if

            if(condition)
                statement
            else if ( condition)
                statement
            else if ( condition)
                statement
                .
                .
                .
                .
                .
             else
                statement
         */
        int x = 0;

        if( x == 1){
            System.out.println("x = 1");
        }
        else if( x == 2){
            System.out.println("x = 2");
        }
        else if( x == 3){
            System.out.println("x = 3");
        }
        else if ( x == 4){
            System.out.println("x = 4");
        }
        else{
        //    System.out.println(" x is not between 1 and 4");
        }



       // System.out.println("if-else is finished");

        if(false)
            System.out.println("True");

        /*
        Определить количество цифр положительного числа
         i >=10 , i < 100

         */
        int i = -8;
       // Math.abs(i)
        if( i < 0)
            i = -i;


        if( i < 10 && i >= 0){
            System.out.println("It is a one digit number");
        }
        else if ( i < 100 && i >= 10){
            System.out.println("It is a two-digit number");
        }
        else if( i < 1000 && i >= 100){
            System.out.println("It is a three digit number");
        }
        else{
            System.out.println("The number has more than 3 digits");
        }






    }
}
