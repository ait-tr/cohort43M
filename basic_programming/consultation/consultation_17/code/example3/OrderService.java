package code.example3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderService {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order){
        orders.add(order);
    }

    public void removeOrder(int orderId){
        orders.removeIf(order -> order.getId() == orderId);
    }


    public List<Order> findOrderByUserId(int userId){
        return orders.stream()
                .filter(order -> order.getUserId() == userId)
                .toList();
    }

    public void updateOrderStatus(int orderId, String status){
        orders.stream()
                .filter(order -> order.getId() == orderId)
                .findFirst()
                .ifPresent(order -> order.setStatus(status));
    }

    public List<Order> findAll(){
        return orders;
    }


}
