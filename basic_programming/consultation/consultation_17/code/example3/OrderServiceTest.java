package code.example3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    OrderService service;
    Order order1;
    Order order2;

    @BeforeEach
    public void setUp(){
        service = new OrderService();
        order1 = new Order(1,1, 100,"Created");
        order2 = new Order(2,1, 200,"HoldOn");

        service.addOrder(order1);
        service.addOrder(order2);
    }

    @Test
    public void testAddOrder(){
        Order order3 = new Order(3,1,500,"Confirmed");
        service.addOrder(order3);
        List<Order> orders = service.findAll();

        assertEquals(3,orders.size());

        assertTrue(orders.contains(order3));
    }

    @Test
    public void testRemoveOrder(){
        service.removeOrder(1);
        List<Order> orders = service.findAll();
        assertFalse(orders.contains(order1));
    }

}