package hwLesson19.entity;
import java.util.Scanner;
public class UsersInput {
    public String inputText(String message){
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        return inputText;
    }
    public int inputInt(String message){
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();
        return inputInt;
    }
    public double inputDouble(String message){
        System.out.println(message);

        Scanner scanner = new Scanner(System.in);
        double inputDouble = scanner.nextDouble();
        return inputDouble;
    }
}
