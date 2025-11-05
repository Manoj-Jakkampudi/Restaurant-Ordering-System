package com.example.restaurantorderingsystem.model;

public class MenuItem {
    private Long id;
    private String name;
    private String description;
    private double price;
    private String category;
    private String imageUrl;
    private double discount;

    public MenuItem() {}

    public MenuItem(Long id, String name, String description, double price, String category, String imageUrl, double discount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.imageUrl = imageUrl;
        this.discount = discount;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public double getDiscount() { return discount; }
    public void setDiscount(double discount) { this.discount = discount; }

    public double getDiscountedPrice() {
        return price * (1 - discount / 100);
    }
}
