package com.coffeeshop.coffeeshopapi.pojoClasses;

public class ItemDetail {
    private int quantity;
    private String name;
    private int price;

    public ItemDetail() {
    }

    public ItemDetail(int quantity, String name, int price) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
