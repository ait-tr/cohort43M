package Aufgabe2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Symbol eingeben: ");
        char bd = scanner.next().charAt(0);

        System.out.println("ASCII Bedeutung: <" + bd + "> = " + (int) bd);
    }
}

