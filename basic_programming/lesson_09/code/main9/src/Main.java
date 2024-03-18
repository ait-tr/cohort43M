import java.util.Scanner;

public class Main {

    // While loop -  цикл While
    /*
    while( condition )
    {
      statement(s) // блок кода
    }
     */
    public static void main(String[] args) {
        int j = 1;
        System.out.println(j);

        j++;
        System.out.println(j);

        j++;
        System.out.println(j);

        j++;
        System.out.println(j);

        j++;
        System.out.println(j);

        System.out.println("In while loop");

        int i = 1;

        while( i <= 10){

            System.out.print(i++ + " ");
           // i++;
        }
        System.out.println("\nAfter while");

        System.out.println("decreasing loop");
        i = 10;
        while (i > 0) {
            System.out.println(i);
            //  i--;
            i = i - 2;
        }


    /*    while( true){  // бесконечный цикл
            System.out.println("True!");
        }

     */

        /*
        Используя цикл while написать метод, возвращающий сумму цифр от 1 до 5
         */
        int n = 10;
        System.out.println("Sum of 1 to " + n + " is " + countSum(n));

        System.out.println("count square");
        printSquareNumber(n);

        System.out.println("Print even and odd numbers");
        printEvenOdd(n);

        System.out.println("char with while");
        char ch = 'a';
        while (ch <= 'z'){
            System.out.print(ch + " ");
            ch++;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter a letter");

        char chStr =  scanner.next().charAt(0); // для получения 1 символа

        System.out.println("You entered " + chStr);



    }

    public static int countSum( int n ){
        // 1 + 2 + 3 + 4 + 5 = 15
        int sum = 0;

        int i = 1;

        while (i <= n){
            sum = sum + i; // 15
            i++; // 6
        }
       // System.out.println(sum);
     return sum;
    }

    /*
    Написать метод, выводящий на экран квадрат числа от 1 до заданного числа n
     */
    public static void  printSquareNumber( int n){

        int i = 1;

        while (i <= n){
            System.out.println("Number is: " + i + " and square of " + i + " is " + (i*i));
            i++;
        }
    }

    /*
    Написать метод, который печатает является ли каждое целое число в диапазоне от 2 до n  четным или нечетным
     */

    public static void printEvenOdd( int n){

        int i = 2;
        while (i <= n){

            if(i % 2 == 0) {
                System.out.println(i + " is even");
            }
            else{
                System.out.println(i + " is odd");
            }

            i++;
        }
    }



}
