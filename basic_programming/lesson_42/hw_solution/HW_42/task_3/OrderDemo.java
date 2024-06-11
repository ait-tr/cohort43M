package HW_42.task_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderDemo {
    public static void main(String[] args) {

        List<Purchase> purchases1 = new ArrayList<>();
        purchases1.add(new Purchase("Item1", 100.0));
        purchases1.add(new Purchase("Item2", 200.0));

        List<Purchase> purchases2 = new ArrayList<>();
        purchases2.add(new Purchase("Item3", 150.0));

        List<Purchase> purchases3 = new ArrayList<>();
        purchases3.add(new Purchase("Item4", 300.0));
        purchases3.add(new Purchase("Item5", 50.0));

        List<Order> orders = new ArrayList<>();
        orders.add(new Order(purchases1, LocalDate.of(2024, 6, 1)));
        orders.add(new Order(purchases2, LocalDate.of(2024, 5, 20)));
        orders.add(new Order(purchases3, LocalDate.of(2024, 6, 15)));

        double result = OrderAggregator.totalSpentThisMonth(orders);
        System.out.println("Total spent this month: " + result);

    }
}
