package Task5HappyNumber;

import java.util.Scanner;

public class Task5HappyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число");
        String inputStr= scanner.nextLine();
        char[] numbers = inputStr.toCharArray();
        if(numbers.length>4){
            System.out.println("Не верное значение");
        }
        else {
            for (int i = 0; i < numbers.length; i++) {
                char c = numbers[i];
                System.out.print(c + " ");
            }
            System.out.println();
            if (numbers[0] + numbers[1] != numbers[2] + numbers[3]) {
                System.out.println("число НЕ является счастливым");
            } else {
                System.out.println(" число счастливое");
            }
        }
    }//main
}//end
