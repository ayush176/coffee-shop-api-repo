package com.coffeeshop.coffeeshopapi.services;

import com.coffeeshop.coffeeshopapi.entities.Order;
import com.coffeeshop.coffeeshopapi.pojoClasses.OrderDetails;

import java.util.List;

public interface OrderService {

    public List<OrderDetails> getAllOrders();

    public OrderDetails addOrder(OrderDetails orderDetails);

    public OrderDetails updateOrder(OrderDetails orderDetails);

    public void deleteOrder(long id);

}
