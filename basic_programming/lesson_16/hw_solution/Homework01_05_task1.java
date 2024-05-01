import java.util.Scanner;

public class Homework01_05_task1 {
    public static void main(String[] args) {
        //Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
        // 1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
        //
        //Перепишите решение задачи с использованием switch вместо if-else
Scanner scanner = new Scanner(System.in);
int number;
System.out.println("Enter you number 1 or 2 or 3:");
number = scanner.nextInt();
switch (number){
    case 1:
        System.out.println("You entered number = 1");
        break;
    case  2:
        System.out.println("You entered number = 2");
        break;
    case  3:
        System.out.println("You entered number = 3");
        break;
    default:
        System.out.println("Enter you another number" );

}
    }
}
