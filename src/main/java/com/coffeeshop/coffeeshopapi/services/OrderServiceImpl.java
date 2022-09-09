package com.coffeeshop.coffeeshopapi.services;

import com.coffeeshop.coffeeshopapi.dao.OrderDao;
import com.coffeeshop.coffeeshopapi.entities.Order;
import com.coffeeshop.coffeeshopapi.pojoClasses.ItemDetail;
import com.coffeeshop.coffeeshopapi.pojoClasses.OrderDetails;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    public OrderServiceImpl() {
    }

    @Override
    public List<OrderDetails> getAllOrders() {

        List<Order> orders = orderDao.findAll();

        List<OrderDetails> orderDetails = new ArrayList<>();

        for(Order order: orders){
            orderDetails.add(convertOrderIntoOrderDetials(order));
        }
        return orderDetails;
    }

    public OrderDetails addOrder(OrderDetails orderDetails) {
        Order order = convertOrderDetailsIntoOrder(orderDetails);
        Order response = orderDao.save(order);

        return convertOrderIntoOrderDetials(response);
    }


    public OrderDetails convertOrderIntoOrderDetials(Order order) {
        OrderDetails orderDetails = new OrderDetails();

        orderDetails.setId(order.getId());
        orderDetails.setCustomerName(order.getCustomerName());
        orderDetails.setCustomerEmail(order.getCustomerEmail());
        orderDetails.setCustomerPhone(order.getCustomerPhone());
        orderDetails.setTotalAmount(order.getTotalAmount());

        String[] itemNames = order.getItemNames().split(",");
        String[] itemQuantities = order.getItemQuantities().split(",");

        List<ItemDetail> itemDetails = new ArrayList<>();

        for(int i=0;i< itemNames.length;i++){
            itemDetails.add(new ItemDetail(Integer.parseInt(itemQuantities[i].trim()), itemNames[i].trim()));
        }

        orderDetails.setItemDetails(itemDetails);

        return orderDetails;
    }

    public Order convertOrderDetailsIntoOrder(OrderDetails orderDetails){
        Order order = new Order();

        order.setId(orderDetails.getId());
        order.setCustomerName(orderDetails.getCustomerName());
        order.setCustomerEmail(orderDetails.getCustomerEmail());
        order.setCustomerPhone(orderDetails.getCustomerPhone());
        order.setTotalAmount(orderDetails.getTotalAmount());

        StringBuilder itemNames = new StringBuilder();
        StringBuilder itemQuantities = new StringBuilder();

        for(int i=0; i<orderDetails.getItemDetails().size(); i++) {
            if(i>0) {
                itemNames.append(",");
                itemQuantities.append(",");
            }
            itemNames.append(orderDetails.getItemDetails().get(i).getName());
            itemQuantities.append(orderDetails.getItemDetails().get(i).getQuantity());
        }
        order.setItemNames(String.valueOf(itemNames));
        order.setItemQuantities(String.valueOf(itemQuantities));

        return order;
    }

}
