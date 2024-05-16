package Numbers;

public class Num {
    private Integer digit;

    public Num(Integer digit) {
        this.digit = digit;
    }

    public Integer getDigit() {
        return digit;
    }

    @Override
    public String toString() {
        return "Num{" +
                "digit=" + digit +
                '}';
    }
}
