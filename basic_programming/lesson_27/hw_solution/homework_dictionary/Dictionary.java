package homework_dictionary;

import java.util.*;

public class Dictionary {
    public static void main(String[] args) {


        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter your word: ");
        //String inputWord = scanner.nextLine();


        List<String> words = new ArrayList<>();
words.add("яблоко");
words.add("книга" );
words.add("привет");
words.add("мир");
words.add("комп");
System.out.println(words);




    EnglishWord englishWord1 = new EnglishWord("apple");
    EnglishWord englishWord2 = new EnglishWord("book");
    EnglishWord englishWord3 = new EnglishWord("hello");
    EnglishWord englishWord4 = new EnglishWord("world");
    EnglishWord englishWord5 = new EnglishWord("computer");

    Map<EnglishWord, List<String>> dictionary = new HashMap<>();

    dictionary.put(englishWord1,words);
    dictionary.put(englishWord2,words);
    dictionary.put(englishWord3,words);
    dictionary.put(englishWord4,words);
    dictionary.put(englishWord5,words);



    System.out.println(dictionary);

}


}











