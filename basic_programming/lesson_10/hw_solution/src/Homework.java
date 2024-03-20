import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
         myWork(n);
         printTriangle(n);

    }
    public static void printTriangle( int n){
        int i = 0;
        while (i < n) {
            i++;
            int j = 0;

            while(j < i) {
                j++;
                System.out.print(j);

            }
            System.out.println();
        }

    }
    static public void myWork(int n) {

        for (int i = 0; i <= 10; i++){
            System.out.println( i + " * " + n + " = "+ (i * n));
        }
    }
}