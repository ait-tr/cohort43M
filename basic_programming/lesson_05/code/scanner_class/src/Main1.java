import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        // чтение с клавиатуры с помощью сканера
        Scanner ourScanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = ourScanner.nextLine(); // введение строки с клавиатуры
        //   System.out.println("You have entered the name " + name);

        System.out.println("Enter a surname");
        String surname = ourScanner.nextLine();
        //  System.out.println("You have entered the second name " + surname);

        System.out.println("Enter age");
        int age = ourScanner.nextInt();

        System.out.println("The name is " + name + " " + surname + " , age is " + age);


    }


}
