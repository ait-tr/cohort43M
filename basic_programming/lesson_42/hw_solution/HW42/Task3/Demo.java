package code.HW42.Task3;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        Purchase pr1 = new Purchase("Product A", 10.0);
        Purchase pr2 = new Purchase("Product B", 20.0);
        Purchase pr3 = new Purchase("Product C", 15.0);
        Purchase pr4 = new Purchase("Product D", 25.0);
        Purchase pr5 = new Purchase("Product E", 5.0);
        Purchase pr6 = new Purchase("Product F", 30.0);

        Order order1 = new Order(LocalDate.of(2023, Month.MAY, 15));
        Order order2 = new Order(LocalDate.of(2023, Month.JUNE, 15));
        Order order3 = new Order(LocalDate.of(2023, Month.JULY, 15));

        order1.addProduct(pr1);
        order1.addProduct(pr4);

        order3.addProduct(pr5);
        order3.addProduct(pr6);
        order3.addProduct(pr2);

        order2.addProduct(pr3);


        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        double totalForCurrentMonth = orders.stream()
                .filter(order -> order.getData().getMonth() == LocalDate.now().getMonth())
                .flatMap(order -> order.getProducts().stream())
                .mapToDouble(Purchase::getPrice)
                .sum();

        System.out.println("Total cost of purchases for the current month: $" + totalForCurrentMonth);
    }

}
