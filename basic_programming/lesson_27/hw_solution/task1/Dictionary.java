package homework.task1;

import java.util.*;

public class Dictionary {
    private Map<String, List<String>> translations;

    public Dictionary(){
        translations = new HashMap<>();

    }

    public  void addTranslation(String englishWord, String translatedWord){
        translations.computeIfAbsent(englishWord, k -> new ArrayList<>()).add(translatedWord);
    }

    public List<String> getTranslations(String englishWord){
        return translations.getOrDefault(englishWord, Collections.emptyList());
    }
}
