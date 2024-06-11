package code.task3;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class OrderDemo {
    public static void main(String[] args) {

        Purchase purchase1 = new Purchase("Product1", 1023);
        Purchase purchase2 = new Purchase("Product2", 578);
        Purchase purchase3 = new Purchase("Product3", 210);
        Purchase purchase4 = new Purchase("Product4", 734);

        Order order1 = new Order(LocalDate.of(2024, Month.MAY, 10));
        Order order2 = new Order(LocalDate.of(2024, Month.MAY, 15));
        Order order3 = new Order(LocalDate.of(2024, Month.APRIL, 25));

        List<Order> orders = Arrays.asList(order1, order2, order3);

        double totalSum = calculateTotalSumCurrentMonth(orders);
        System.out.println("Total sum of purchases in the current month: " + totalSum);
    }
    public static double calculateTotalSumCurrentMonth(List<Order> orders) {
        LocalDate now = LocalDate.now();

        return orders.stream()
                .filter(order -> order.getLocalDate().getMonth() == now.getMonth() && order.getLocalDate().getYear() == now.getYear())
                .flatMap(order -> order.getPurchases().stream())
                .mapToDouble(Purchase::getPrise)
                .sum();
    }
}
