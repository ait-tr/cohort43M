import java.util.Scanner;

public class GuessNumber {
    static Scanner scanner = new Scanner(System.in);
    static int secretNumber = 5;

    /*
    игра Угадай число. Игрок должен угадать задуманное программой
    секретное число введя его с клавиатуры.
     */

    public static void main(String[] args) {

        start();
    }


    public static void start() {
        int attempts = readNumberOfAttempts();
        guessNumber(attempts);
        scanner.close();
    }

    public static int readNumberOfAttempts() {
        System.out.println("Enter number of attempts");
        // int input =scanner.nextInt();
        return scanner.nextInt();
    }

    public static int readNumber() {
        System.out.println("Guess a number between 0 and 9");
        return scanner.nextInt();
    }


    public static void guessNumber(int attempts) {

        while (attempts > 0) {


            int answer = readNumber();
            attempts--;

            if (answer == secretNumber) {
                System.out.println("You are right! You have guessed the secret number !");
                return;

            } else {
                //  System.out.println("Sorry, you are wrong. Try again later");
                System.out.print("Sorry, the number ");

                // вложенный if
                if (answer < secretNumber)
                    System.out.println("is too small");
                else System.out.println("is too big");

                System.out.println("You have " + attempts + " attempts left");
            }
        }
        System.out.println("Sorry, buddy. Maybe some other time");
    }
}
