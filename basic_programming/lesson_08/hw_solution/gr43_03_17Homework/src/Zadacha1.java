import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        /*Задача 1
Используя switch, написать программу, которая в зависимости от
ввода пользователем
 цифр от 1 до 7 выводит на экран название соответствующего дня недели. */
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Vvedite chuslo ");
        int day = scanner.nextInt();
        System.out.println("\n");
        switch (day){
            case 1:
                System.out.println("Montag");
                break;
            case  2:
                System.out.println("Dienstag");
                break;
            case  3:
                System.out.println("Mittwoch");
                break;
            case  4:
                System.out.println("Donnertag");
                break;
            case  5:
                System.out.println("Freitag");
                break;
            case  6:
                System.out.println("Samstag");
                break;
            case  7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println(" vvedite ot 1 do 7");

        }
    }
}
