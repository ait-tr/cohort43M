import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number from 1 to 10: ");
        int num = scanner.nextInt();
        printTable(num);

        // Task 2
        printTriangle(6);
    }


    public static void printTable(int i) {


            int j = 1;
            while (j <=10) {
                System.out.println(i + " * " + j + " = " + i * j);
                j++;
            }
            System.out.println("**************");


    }
    public static void printTriangle(int n){
        int i = 1;
        while (i <= n){
            int j = 1;
            while (j<=i){
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
        }
    }

}
