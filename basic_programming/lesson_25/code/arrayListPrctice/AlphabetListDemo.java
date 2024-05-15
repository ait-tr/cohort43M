package code.arrayListPrctice;

import java.util.ArrayList;
import java.util.Collections;

public class AlphabetListDemo {
    public static void main(String[] args) {
        // Создадим ArrayList для хранения букв
        ArrayList<String> alphabet = new ArrayList<>();

        // добавим буквы в коллекцию
        for (int i = 65; i < 91; i++) {
            alphabet.add(String.valueOf((char) i));
        }

        System.out.println(alphabet);

        alphabet.clear();

        for (char letter = 'A'; letter <= 'Z'; letter++) {
            alphabet.add(String.valueOf(letter));
        }

        System.out.println(alphabet);


        for (int i = alphabet.size() - 1; i >= 0; i--) {
            System.out.println(alphabet.get(i));
        }


        ArrayList<String> reverseAlphabet = new ArrayList<>();

        for (int i = alphabet.size() - 1; i >= 0; i--) {
            reverseAlphabet.add(alphabet.get(i));
        }

        System.out.println(reverseAlphabet);

        reverseAlphabet.clear();

        for (int i = 0; i < alphabet.size(); i++) {
            reverseAlphabet.add(0,alphabet.get(i));
        }

        System.out.println(reverseAlphabet);

        reverseAlphabet.clear();

        reverseAlphabet = alphabet;

        Collections.reverse(reverseAlphabet);

        System.out.println(reverseAlphabet);

        Collections.sort(reverseAlphabet);

        System.out.println(reverseAlphabet);
    }
}
