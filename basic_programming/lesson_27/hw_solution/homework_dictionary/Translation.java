package homework_dictionary;

public class Translation{

    private String word;

    public Translation(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return "Translation{" +
                "word='" + word + '\'' +
                '}';
    }
}

