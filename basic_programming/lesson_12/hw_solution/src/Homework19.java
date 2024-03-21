import java.util.Scanner;

public class Homework19 {

    public static void main(String[] args) {
printTriangelWhile(5);

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter any positive number");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + +n + " = " + (i * n));
        }


    }

    public static void printTriangelWhile(int n){

        int i = 1;
        while(i<=n){
            int k=1;
            while (k<=i){
                System.out.print(k);
                k++;
            }
            i++;
            System.out.println();
        }

    }

    }