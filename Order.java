package com.example.restaurantorderingsystem.model;

import java.util.List;

public class Order {
    private Long id;
    private List<OrderItem> items;
    private String status; // e.g., "pending", "preparing", "ready", "completed"
    private double total;
    private String paymentMethod;

    public Order() {}

    public Order(Long id, List<OrderItem> items, String status, String paymentMethod) {
        this.id = id;
        this.items = items;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.total = calculateTotal();
    }

    private double calculateTotal() {
        return items.stream().mapToDouble(item -> item.getPrice() * item.getQuantity()).sum();
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public List<OrderItem> getItems() { return items; }
    public void setItems(List<OrderItem> items) { this.items = items; this.total = calculateTotal(); }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public double getTotal() { return total; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
}
