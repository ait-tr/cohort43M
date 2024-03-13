import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        //Task 1

        Scanner ourScanner = new Scanner(System.in);

        System.out.println("First name");

        String name = ourScanner.nextLine();

        System.out.println("Last name");

        String surname = ourScanner.nextLine();

        System.out.println("Your age");

        int age = ourScanner.nextInt();

        System.out.println("The name is " + name + " " + surname + ", age is " + age);


        // Task 2

        int chInt = 'A';
        System.out.println(chInt);

        int intCh = 'F';
        System.out.println(intCh);


    }
}
