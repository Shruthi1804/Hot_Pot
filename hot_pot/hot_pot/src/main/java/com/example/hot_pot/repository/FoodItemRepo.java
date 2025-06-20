package com.example.hot_pot.repository;

import com.example.hot_pot.entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepo extends JpaRepository<FoodItem, Long> {
    // you can add findByCategory later if needed
}

