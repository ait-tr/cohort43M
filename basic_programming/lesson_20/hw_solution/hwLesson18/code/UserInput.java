import java.util.Scanner;

public class UserInput {

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
}
