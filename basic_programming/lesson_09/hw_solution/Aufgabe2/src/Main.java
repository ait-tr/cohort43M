import java.util.Scanner;

public class Main {
    public static void printMulti(int n) {
        int i = 0;
        while (i <= n) {
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printMulti(n);
    }
}
