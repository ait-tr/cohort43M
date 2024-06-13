package code.junit.src.main.java;

public class LetterCountFromText {

    public int countLetter(String text){

        int count = 0;

        for (char ch:text.toLowerCase().toCharArray()){
            if (ch == 'a' ||
                    ch == 'e' ||
                    ch == 'o' ||
                    ch == 'i' ||
                    ch == 'u' ||
                    ch == 'y'){
                count++;
            }
        }

        return count;
    }
}
