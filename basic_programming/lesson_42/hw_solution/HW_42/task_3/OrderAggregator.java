package HW_42.task_3;

import java.time.LocalDate;
import java.util.List;

public class OrderAggregator {

    public static double totalSpentThisMonth(List<Order> orders) {
        LocalDate now = LocalDate.now();  // Получаем текущую дату
        int currentYear = now.getYear();  // Извлекаем текущий год
        int currentMonth = now.getMonthValue();  // Извлекаем текущий месяц

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
