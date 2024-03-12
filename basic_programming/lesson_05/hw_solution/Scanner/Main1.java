package Scanner;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vorname eingeben: ");
        String firstName = scanner.nextLine();

        System.out.print("Nachname eingeben: ");
        String lastName = scanner.nextLine();

        System.out.print("Alter eingeben: ");
        int age = scanner.nextInt();

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
    }
}