package Homework.dict;

public class EngWords {
    String word;

    public EngWords(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return "EngWords{" +
                "word='" + word + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EngWords engWords)) return false;

        return getWord().equals(engWords.getWord());
    }

    @Override
    public int hashCode() {
        return getWord().hashCode();
    }
}
