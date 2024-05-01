package task1;

import java.util.Scanner;

public class Task1SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: 1, 2 or 3");
        int number = scanner.nextInt();
        switch (number){
            case 1:
                System.out.println("You entered number: " + 1);
                break;

            case 2:
                System.out.println("You entered number: " + 2);
                break;

            case 3:
                System.out.println("You entered number: " + 3);
                break;

            default:
                System.out.println("You should enter number 1, 2, or 3");
        }
    }
}
