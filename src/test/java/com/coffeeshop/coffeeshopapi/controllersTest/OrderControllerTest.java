package com.coffeeshop.coffeeshopapi.controllersTest;

import com.coffeeshop.coffeeshopapi.controllers.OrderController;
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
        orderService.getAllOrders();
        verify(orderService).getAllOrders();
    }

}
