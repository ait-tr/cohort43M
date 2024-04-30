import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 3 ");

        int numbers = myScanner.nextInt();

        switch (numbers){
            case 1:
                System.out.println("Число : 1");
                break;
            case 2:
                System.out.println("Число : 2");
                break;
            case 3:
                System.out.println("Число : 3");
                break;
            default:
                System.out.println("Неверный ввод. Введите цыфру от 1 до 3");
        }
    }
}
