package homeWork_30Words;

import java.util.Scanner;

public class Words {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text:" );
        String input = scanner.nextLine();

        System.out.println("Enter your search word: ");
        String targetWord = scanner.nextLine();

        String[] words = input.split("\\s+");
        int count = 0;
        for(String word : words){
            if(word.equals(targetWord)){
                count++;

            }
        }
        System.out.println("Word" + " " + targetWord + " " + " appears " + count + " " + " times ");
    }


}
