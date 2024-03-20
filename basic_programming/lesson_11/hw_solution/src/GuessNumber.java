import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        guessNumber();
    }


    public static void guessNumber() {


        Scanner scanner = new Scanner(System.in);

        int secretNumber = 5;
        int attempts = 3;

        while (attempts > 0) {


            System.out.println("Guess a number between 0 and 9");
            int answer = scanner.nextInt();
            attempts--;


            if (answer == secretNumber) {
                System.out.println("You are right ! You have guessed the secret number !");
                return;

            } else {
                System.out.println("Sorry, the number  ");

                if (answer < secretNumber)
                    System.out.println("is too small");
                else System.out.println("is too big");

                System.out.println("You have " + attempts + " attempts left");


            }

        }
        System.out.println("Sorry, buddy. Maybe some other time ");
    }
}