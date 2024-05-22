package code.compareObjects.comparator;

import java.util.Objects;

public class Pair {
    private String ourString;
    private Integer ourInteger;

    public Pair(String ourString, Integer ourInteger) {
        this.ourString = ourString;
        this.ourInteger = ourInteger;
    }

    public String getOurString() {
        return ourString;
    }

    public Integer getOurInteger() {
        return ourInteger;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Objects.equals(ourString, pair.ourString) && Objects.equals(ourInteger, pair.ourInteger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ourString, ourInteger);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "ourString='" + ourString + '\'' +
                ", ourInteger=" + ourInteger +
                '}';
    }
}
