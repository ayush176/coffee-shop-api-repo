package com.coffeeshop.coffeeshopapi.controllers;

import com.coffeeshop.coffeeshopapi.entities.Order;

import com.coffeeshop.coffeeshopapi.pojoClasses.OrderDetails;
import com.coffeeshop.coffeeshopapi.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<OrderDetails> getCourses(){
        return this.orderService.getAllOrders();
    }

    @PostMapping("/order")
    public OrderDetails addOrder(@RequestBody OrderDetails orderDetails) {
        return this.orderService.addOrder(orderDetails);
    }
}
