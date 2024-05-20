package Homework_27.dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TranslationDictionary {
    private HashMap<String, List<String>> dictionary;

    public TranslationDictionary() {
        dictionary = new HashMap<>();
    }


    public void addTranslation(String englishWord, String translation) {

        if (dictionary.containsKey(englishWord)) {
            dictionary.get(englishWord).add(translation);
        } else {

            List<String> translations = new ArrayList<>();
            translations.add(translation);
            dictionary.put(englishWord, translations);
        }
    }


    public List<String> getTranslations(String englishWord) {
        return dictionary.getOrDefault(englishWord, new ArrayList<>());
    }
}