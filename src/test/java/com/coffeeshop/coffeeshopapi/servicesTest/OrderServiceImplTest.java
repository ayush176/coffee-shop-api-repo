package com.coffeeshop.coffeeshopapi.servicesTest;

import com.coffeeshop.coffeeshopapi.dao.OrderDao;
import com.coffeeshop.coffeeshopapi.entities.Order;
import com.coffeeshop.coffeeshopapi.pojoClasses.OrderDetails;
import com.coffeeshop.coffeeshopapi.services.OrderService;
import com.coffeeshop.coffeeshopapi.services.OrderServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class OrderServiceImplTest {
    @Mock
    private OrderDao orderDao;

    private OrderService orderService;

    @BeforeEach
    void setUp(){
        this.orderService = new OrderServiceImpl(this.orderDao);
    }

    @Test
    void getAllOrders(){
        orderService.getAllOrders();
        verify(orderDao).findAll();
    }

//    @Test
//    void addOrders(){
//        orderService.addOrder(new OrderDetails());
//        verify(orderDao).save(new Order());
//    }

}
