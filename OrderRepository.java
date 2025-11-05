package com.example.restaurantorderingsystem.repository;

import com.example.restaurantorderingsystem.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class OrderRepository {
    private List<Order> orders = new ArrayList<>();
    private Long nextId = 1L;

    public Order save(Order order) {
        if (order.getId() == null) {
            order.setId(nextId++);
        }
        orders.add(order);
        return order;
    }

    public List<Order> findAll() {
        return new ArrayList<>(orders);
    }

    public Optional<Order> findById(Long id) {
        return orders.stream().filter(order -> order.getId().equals(id)).findFirst();
    }

    public void update(Order order) {
        orders.removeIf(o -> o.getId().equals(order.getId()));
        orders.add(order);
    }
}
