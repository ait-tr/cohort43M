import java.util.Scanner;

public class Homework01_05_task3 {

    /*Task 3 (Использовать оператор switch)

Программа просит пользователя ввести число от 1 до 7
Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numDay ;
        System.out.println(" Enter you number of Day:");
        numDay = scanner.nextInt();
        switch (numDay){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday Weekend");
                break;
            case 7:
                System.out.println("Sunday Weekend");
                break;
            default:
                System.out.println("Enter anothe number");

        }
    }
}
