package dictionary;

import java.util.*;

public class DictionaryApp {
    public static void main(String[] args) {

        List<Meaning> meanings = new ArrayList<>();
        meanings.add(new Meaning(0, "встречаться"));
        meanings.add(new Meaning(1, "знакомиться"));
        meanings.add(new Meaning(2, "удовлетворять"));
        meanings.add(new Meaning(3, "переписываться"));
        meanings.add(new Meaning(4, "соответствовать"));
        meanings.add(new Meaning(5, "согласовываться"));
        meanings.add(new Meaning(6, "жесткий"));
        meanings.add(new Meaning(7, "тяжелый"));
        meanings.add(new Meaning(8, "крутой"));
        meanings.add(new Meaning(9, "другой"));
        meanings.add(new Meaning(10, "различный"));
        meanings.add(new Meaning(11, "непохожий"));
        meanings.add(new Meaning(12, "изредка"));
        meanings.add(new Meaning(13, "порой"));
        meanings.add(new Meaning(14, "случайно"));

        Word word1 = new Word("meet");
        Word word2 = new Word("correspond");
        Word word3 = new Word("tough");
        Word word4 = new Word("different");
        Word word5 = new Word("occasionally");

        Map<Word, List<Meaning>> dictionary = new HashMap<>();

        dictionary.put(word1, new ArrayList<>());
        dictionary.put(word2, new ArrayList<>());
        dictionary.put(word3, new ArrayList<>());
        dictionary.put(word4, new ArrayList<>());
        dictionary.put(word5, new ArrayList<>());

        List<Meaning> meaningForWord1 = dictionary.get(word1);
        List<Meaning> meaningForWord2 = dictionary.get(word2);
        List<Meaning> meaningForWord3 = dictionary.get(word3);
        List<Meaning> meaningForWord4 = dictionary.get(word4);
        List<Meaning> meaningForWord5 = dictionary.get(word5);

        meaningForWord1.add(meanings.get(0));
        meaningForWord1.add(meanings.get(1));
        meaningForWord1.add(meanings.get(2));
        meaningForWord2.add(meanings.get(3));
        meaningForWord2.add(meanings.get(4));
        meaningForWord2.add(meanings.get(5));
        meaningForWord3.add(meanings.get(6));
        meaningForWord3.add(meanings.get(7));
        meaningForWord3.add(meanings.get(8));
        meaningForWord4.add(meanings.get(9));
        meaningForWord4.add(meanings.get(10));
        meaningForWord4.add(meanings.get(11));
        meaningForWord5.add(meanings.get(12));
        meaningForWord5.add(meanings.get(13));
        meaningForWord5.add(meanings.get(14));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите английское слово");
        Word searchWord = new Word(scanner.nextLine());

       List<Meaning> translations = dictionary.get(searchWord);
        if (translations != null) {
            System.out.println("Переводы слова '" + searchWord + "': " + translations);
        } else {
            System.out.println("Переводы для слова '" + searchWord + "' не найдены.");
        }
    }



    }


