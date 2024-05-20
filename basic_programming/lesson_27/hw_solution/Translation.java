package Homework.dict;

public class Translation {
    String wordTranslate1;
    String wordTranslate2;
    String wordTranslate3;


    public Translation(String wordTranslate1, String wordTranslate2, String wordTranslate3) {
        this.wordTranslate1 = wordTranslate1;
        this.wordTranslate2 = wordTranslate2;
        this.wordTranslate3 = wordTranslate3;
    }

    public String getWordTranslate1() {
        return wordTranslate1;
    }

    public String getWordTranslate2() {
        return wordTranslate2;
    }

    public String getWordTranslate3() {
        return wordTranslate3;
    }

    @Override
    public String toString() {
        return "Translation{" +
                "wordTranslate1='" + wordTranslate1 + '\'' +
                ", wordTranslate2='" + wordTranslate2 + '\'' +
                ", wordTranslate3='" + wordTranslate3 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Translation that)) return false;

        if (!getWordTranslate1().equals(that.getWordTranslate1())) return false;
        if (!getWordTranslate2().equals(that.getWordTranslate2())) return false;
        return getWordTranslate3().equals(that.getWordTranslate3());
    }

    @Override
    public int hashCode() {
        int result = getWordTranslate1().hashCode();
        result = 31 * result + getWordTranslate2().hashCode();
        result = 31 * result + getWordTranslate3().hashCode();
        return result;
    }
}
