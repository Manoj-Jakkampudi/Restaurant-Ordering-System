package com.example.restaurantorderingsystem.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.restaurantorderingsystem.model.MenuItem;

@Repository
public class MenuItemRepository {
    private List<MenuItem> menuItems = new ArrayList<>();
    private Long nextId = 1L;

    public MenuItemRepository() {
        // Initialize with some sample data in INR with reliable food images
        menuItems.add(new MenuItem(nextId++, "Margherita Pizza", "Classic cheese pizza", 299, "Pizza", "/images/IMG_6112.JPG", 10));
        menuItems.add(new MenuItem(nextId++, "Pepperoni Pizza", "Pizza with pepperoni", 349, "Pizza", "/images/pepperoni-pizza.jpg", 0));
        menuItems.add(new MenuItem(nextId++, "Paneer Tikka Pizza", "Pizza with paneer tikka", 399, "Pizza", "/images/paneer-tikka-pizza.jpg", 15));
        menuItems.add(new MenuItem(nextId++, "Caesar Salad", "Romaine lettuce with Caesar dressing", 199, "Salad", "/images/caesar-salad.jpg", 5));
        menuItems.add(new MenuItem(nextId++, "Chicken Biryani", "Aromatic basmati rice with chicken", 249, "Main Course", "/images/chicken-biryani.jpg", 20));
        menuItems.add(new MenuItem(nextId++, "Paneer Butter Masala", "Creamy paneer curry", 299, "Main Course", "/images/paneer-butter-masala.jpg", 0));
        menuItems.add(new MenuItem(nextId++, "Grilled Chicken Burger", "Burger with grilled chicken", 249, "Burger", "/images/grilled-chicken-burger.jpg", 10));
        menuItems.add(new MenuItem(nextId++, "Veg Burger", "Vegetarian burger with veggies", 199, "Burger", "/images/veg-burger.jpg", 0));
        menuItems.add(new MenuItem(nextId++, "French Fries", "Crispy golden fries", 99, "Sides", "/images/french-fries.jpg", 0));
        menuItems.add(new MenuItem(nextId++, "Masala Dosa", "South Indian crispy dosa with potato filling", 149, "Breakfast", "/images/masala-dosa.jpg", 5));
        menuItems.add(new MenuItem(nextId++, "Idli Sambar", "Steamed rice cakes with lentil soup", 99, "Breakfast", "/images/idli-sambar.jpg", 0));
        menuItems.add(new MenuItem(nextId++, "Gulab Jamun", "Sweet dumplings in rose syrup", 79, "Dessert", "/images/gulab-jamun.jpg", 10));
    }

    public List<MenuItem> findAll() {
        return new ArrayList<>(menuItems);
    }

    public Optional<MenuItem> findById(Long id) {
        return menuItems.stream().filter(item -> item.getId().equals(id)).findFirst();
    }
}
