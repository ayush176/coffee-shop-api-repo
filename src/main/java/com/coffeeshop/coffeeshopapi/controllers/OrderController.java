package com.coffeeshop.coffeeshopapi.controllers;

import com.coffeeshop.coffeeshopapi.entities.Order;

import com.coffeeshop.coffeeshopapi.pojoClasses.OrderDetails;
import com.coffeeshop.coffeeshopapi.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
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

    @PutMapping("/order")
    public OrderDetails updateOrder(@RequestBody OrderDetails orderDetails) {
        return this.orderService.updateOrder(orderDetails);
    }

    @DeleteMapping("/order/{id}")
    public ResponseEntity<HttpStatus> deleteOrder(@PathVariable String id){
        try {
            this.orderService.deleteOrder(Long.parseLong(id));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
