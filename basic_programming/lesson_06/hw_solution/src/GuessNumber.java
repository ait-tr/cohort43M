import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        /*
        Игра Угадай число
        Игрок должен угадать задуманное программой число, введя его с клавиатуры
         */
        Scanner scanner = new Scanner(System.in);

        int secretNumber = 5;

        System.out.println("Guess number between 0 and 9");
        int answer = scanner.nextInt();

        if (answer == secretNumber) {
            System.out.println("You're right, that's " + answer);
        }
        else {
            System.out.print("Sorry, the number is ");
            if (answer <= secretNumber)
                System.out.println("too small");
            else System.out.println("too big");

            //System.out.println("You're wrong");
        }

    }
}
