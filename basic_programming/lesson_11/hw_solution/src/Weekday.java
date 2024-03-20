import java.util.Scanner;

public class Weekday {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numDay;

        System.out.println(" Enter please number from 1 to 7");
        numDay = scanner.nextInt();

        switch(numDay){
            case 1:
                System.out.println(" Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println(" Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
                break;
            default:System.out.println("Choose another number");







        }


    }
}
