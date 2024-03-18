import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");

        int n = scanner.nextInt();
        printCube(n);
        wHile(n);
    }
    static void printCube( int n ) {
        int i = 0;
        while (i < n) {
            i++;
            System.out.println(i * i * i);
        }
    }
    public static void wHile (int n ){
        int i = 0;
        while (i < n) {
            i++;
            System.out.println(i * n);
        }
    }
}

