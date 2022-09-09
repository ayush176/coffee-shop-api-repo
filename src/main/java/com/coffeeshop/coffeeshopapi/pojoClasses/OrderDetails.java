package com.coffeeshop.coffeeshopapi.pojoClasses;

import java.util.List;


public class OrderDetails {

    private long id;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
//    private String itemNames;
//    private String itemPrices;
    private String totalAmount;

    List<ItemDetail> itemDetails;  // [{quantity:3,name:tea}, {quantity:2, name:coffee}]

    public OrderDetails() {
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

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<ItemDetail> getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(List<ItemDetail> itemDetails) {
        this.itemDetails = itemDetails;
    }

    public OrderDetails(long id, String customerName, String customerEmail, String customerPhone, String totalAmount, List<ItemDetail> itemDetails) {
        this.id = id;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.totalAmount = totalAmount;
        this.itemDetails = itemDetails;
    }
}
