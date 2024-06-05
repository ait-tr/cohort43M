package code.work1;

public class WordsDemo {
    public static void main(String[] args) {

        WordToUpperCase toUpperCase = a -> a.toUpperCase();

        String stringSmall = "small or big";

        String toCase = toUpperCase.wordsToUpperCase(stringSmall);

        System.out.println(toCase);


    }
}
