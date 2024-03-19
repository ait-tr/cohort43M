import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of 1 to 9");
        int i = scanner.nextInt();
        System.out.println("Enter number of 1 to 9");
        int j = scanner.nextInt();
        printTable();
        System.out.println( j + " * " + i + " = " + i*j);


        triangle(6);

        }

    public static void printTable() {
        for (int i = 1; i < 10; i++) {
            if (i == i) {
                break;
            }
            for (int j = 1; j < 10; j++) {
                if (j == j) {
                    break;
                }

            }
        }
    }

    public static void triangle(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }


}