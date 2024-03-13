import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter numbers :");
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();
        if (a == b ) {
            System.out.println(" Вы получаете : " + ((a + b) + (a + b )));
        } else {
            System.out.println(" Вы получаете : " + (a + b));
        }
        //задание номер 2
        int a1 = myScanner.nextInt();
        int b1 = myScanner.nextInt();
        int c1 = myScanner.nextInt();
        if (a1 == b1 && a1 == c1) {
            System.out.println("All numbers are equal");
        } if (a1 != b1 && a1 != c1) {
            System.out.println("All numbers are different");
        } else{
            System.out.println("Some numbers are equal");
        }



    }
}
