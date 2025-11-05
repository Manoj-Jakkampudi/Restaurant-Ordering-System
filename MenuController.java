package com.example.restaurantorderingsystem.controller;

import com.example.restaurantorderingsystem.model.MenuItem;
import com.example.restaurantorderingsystem.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping
    public List<MenuItem> getMenu() {
        return menuService.getAllMenuItems();
    }

    @GetMapping("/{id}")
    public Optional<MenuItem> getMenuItem(@PathVariable Long id) {
        return menuService.getMenuItemById(id);
    }
}
