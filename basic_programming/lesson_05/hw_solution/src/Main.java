import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner infUser = new Scanner(System.in);

        System.out.println("Enter your first name ");
        String firstName = infUser.nextLine();
        //System.out.println("First Name: " + firstName);

        System.out.println("Enter your last name ");
        String lastName = infUser.nextLine();
        //System.out.println("Last Name: " + lastName);

        System.out.println("Enter your age ");
        int age = infUser.nextInt();

        System.out.println("First name: " + firstName + " Last name: " + lastName + " Age: " + age);

    }
}
