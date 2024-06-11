package code.task3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDate localDate;
    private List<Purchase> purchases;

    public Order(LocalDate localDate) {
        this.localDate = localDate;
        this.purchases = new ArrayList<>();
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    @Override
    public String toString() {
        return "Order{" +
                "localDate=" + localDate +
                ", purchases=" + purchases +
                '}';
    }
}
