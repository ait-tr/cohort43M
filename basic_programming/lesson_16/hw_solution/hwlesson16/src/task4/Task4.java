package task4;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int grade = getRandomGrade(0, 12);
        System.out.println("Your grade: " + grade);

        int remainingTime = 45;

        switch (grade) {
            case 10:
            case 11:
            case 12:
                System.out.println("Excellent! I'm so proud of you. You can watch TV for an additional 1 hour.");
                remainingTime += 60;
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Good job. You can watch TV for an additional 45 minutes.");
                remainingTime += 45;
                break;
            case 3:
                System.out.println("I'm disappointed. You can only watch TV for 15 minutes today.");
                remainingTime -= 30;
                break;
            default:
                System.out.println("Oh no, that's a tragedy. You're not allowed to watch TV today.");
                remainingTime = 0;
        }

        // Print the remaining TV time for the day
        System.out.println("Remaining TV time for today: " + remainingTime + " minutes.");
    }

    private static int getRandomGrade(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}