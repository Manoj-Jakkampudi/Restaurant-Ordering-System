package com.example.restaurantorderingsystem.controller;

import java.util.List;

import com.example.restaurantorderingsystem.model.OrderItem;

public class OrderRequest {
    private List<OrderItem> items;
    private String paymentMethod;

    public OrderRequest() {}

    public OrderRequest(List<OrderItem> items, String paymentMethod) {
        this.items = items;
        this.paymentMethod = paymentMethod;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
