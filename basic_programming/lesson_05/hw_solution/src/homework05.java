import java.util.Scanner;

public class homework05 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = myScanner.nextLine();
        System.out.println("Enter surname");
        String surname = myScanner.nextLine();
        System.out.println("Enter age");
        int age = myScanner.nextInt();
        System.out.println("Name: "+ name +"\nSurname: "+ surname +  "\nAge: "+ age);
        // Задание номер:2
        System.out.print("Введите символ: ");
        char a = myScanner.next().charAt(0);
        int b = a;
        System.out.println("ASCII значение символа '" + a + "': " + b);
    }
}
