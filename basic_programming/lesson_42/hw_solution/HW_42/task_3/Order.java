package HW_42.task_3;

import java.time.LocalDate;
import java.util.List;

public class Order {

    private List<Purchase> purchaseList;
    private LocalDate orderDate;

    public Order(List<Purchase> purchaseList, LocalDate orderDate) {
        this.purchaseList = purchaseList;
        this.orderDate = orderDate;
    }

    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
