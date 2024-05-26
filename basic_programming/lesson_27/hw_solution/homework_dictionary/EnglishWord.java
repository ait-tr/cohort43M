package homework_dictionary;

import java.util.Objects;

public class EnglishWord {

    private String englishWord;

    public EnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    @Override
    public String toString() {
        return "EnglishWord{" +
                "englishWord='" + englishWord + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnglishWord that = (EnglishWord) o;
        return Objects.equals(englishWord, that.englishWord);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(englishWord);
    }
}
