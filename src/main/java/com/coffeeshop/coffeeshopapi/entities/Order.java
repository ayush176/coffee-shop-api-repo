package com.coffeeshop.coffeeshopapi.entities;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private String itemNames; //tea, coffee
    private String itemQuantities;// 1,3
    private String totalAmount;

    public Order() {
    }

    public Order(long id, String customerName, String customerEmail, String customerPhone, String itemNames, String itemQuantities, String totalAmount) {
        this.id = id;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.itemNames = itemNames;
        this.itemQuantities = itemQuantities;
        this.totalAmount = totalAmount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getItemNames() {
        return itemNames;
    }

    public void setItemNames(String itemNames) {
        this.itemNames = itemNames;
    }

    public String getItemQuantities() {
        return itemQuantities;
    }

    public void setItemQuantities(String itemQuantities) {
        this.itemQuantities = itemQuantities;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }
}
