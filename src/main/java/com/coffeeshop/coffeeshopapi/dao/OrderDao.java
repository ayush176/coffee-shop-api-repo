package com.coffeeshop.coffeeshopapi.dao;
import com.coffeeshop.coffeeshopapi.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Order,Long> {
}
