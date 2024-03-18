import java.util.Scanner;

public class homework08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 - 7 ");
        int m = scanner.nextInt();

        switch (m){

            case 1:
                System.out.println("This is monday");
                break;

            case 2:
                System.out.println("This is tuesday");
                break;

            case 3:
                System.out.println("This is wednesday");
                break;

            case 4:
                System.out.println("This is thursday");
                break;

            case 5:
                System.out.println("This is friday");
                break;

            case 6:
                System.out.println("This is saturday");
                break;

            case 7:
                System.out.println("This is sunday");
            default:
                System.out.println("Please enter number 1 - 7");
        }
    }
}
