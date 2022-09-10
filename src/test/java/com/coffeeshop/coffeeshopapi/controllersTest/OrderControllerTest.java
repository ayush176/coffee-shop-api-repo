package com.coffeeshop.coffeeshopapi.controllersTest;

import com.coffeeshop.coffeeshopapi.controllers.OrderController;
import com.coffeeshop.coffeeshopapi.pojoClasses.OrderDetails;
import com.coffeeshop.coffeeshopapi.services.OrderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class OrderControllerTest {
    @Mock
    private OrderService orderService;

    private OrderController orderController;

    @BeforeEach
    void setUp(){
        this.orderController = new OrderController(this.orderService);
    }

    @Test
    void getAllOrders(){
        orderController.getAllOrders();
        verify(orderService).getAllOrders();
    }

    @Test
    void addOrder(){
        OrderDetails orderDetails = new OrderDetails();
        orderController.addOrder(orderDetails);
        verify(orderService).addOrder(orderDetails);
    }

    @Test
    void updateOrder(){
        OrderDetails orderDetails = new OrderDetails();
        orderController.updateOrder(orderDetails);
        verify(orderService).updateOrder(orderDetails);
    }

    @Test
    void deleteOrder(){
        orderController.deleteOrder("1");
        verify(orderService).deleteOrder(1);
    }
}
