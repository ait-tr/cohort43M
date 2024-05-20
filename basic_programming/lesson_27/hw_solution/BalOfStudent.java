package Homework.Students;

import java.util.Objects;

public class BalOfStudent {
    Double bal;

    public BalOfStudent(Double bal) {
        this.bal = bal;
    }

    public Double getBal() {
        return bal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BalOfStudent that)) return false;
        return getBal().equals(that.getBal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBal());
    }

    @Override
    public String toString() {
        return "BalOfStudent{" +
                "bal=" + bal +
                '}';
    }


}
