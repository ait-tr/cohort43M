package HW_42.task_3;

import java.time.LocalDate;
import java.util.List;

public class OrderAggregator {

    public static double totalSpentThisMonth(List<Order> orders) {
        LocalDate now = LocalDate.now();
        int currentYear = now.getYear();
        int currentMonth = now.getMonthValue();  

        return orders.stream()
                .filter(order -> {
                    LocalDate orderDate = order.getOrderDate();
                    return orderDate.getYear() == currentYear && orderDate.getMonthValue() == currentMonth;
                })
                .flatMap(order -> order.getPurchaseList().stream())
                .mapToDouble(Purchase::getPrice)
                .sum();
    }
}
