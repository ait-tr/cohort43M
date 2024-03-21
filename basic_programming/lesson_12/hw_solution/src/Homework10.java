import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {

        printTriangle(5);
    }
    //-----------1----------------

      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        printTable(number);
    }
        public static void printTable(int number) {

            if (number <= 0) {
                System.out.println("The number must be positive");
                return;
            }
            for (int i = 1; i <= 10; i++){

                    System.out.println(number + " * " + i + " = " + (number * i));

                }
                System.out.println("            ");

       */


}



public static void printTriangle(int n) {
    int i = 1;
    while (1 <= n) {
        int j = 1;

        while (j <= i) {
            System.out.println(j + " ");

            j++;
        }
        System.out.println();
        i++;
    }










