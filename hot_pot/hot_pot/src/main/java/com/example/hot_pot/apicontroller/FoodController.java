package com.example.hot_pot.apicontroller;


import com.example.hot_pot.entity.FoodItem;
import com.example.hot_pot.repository.FoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food")
public class FoodController {

    @Autowired
    private FoodItemRepo foodRepo;

    // Add a food item (admin)
    @PostMapping("/add")
    public ResponseEntity<?> addFood(@RequestBody FoodItem item) {
        foodRepo.save(item);
        return ResponseEntity.ok("Food item added successfully");
    }

    //View all food items
    @GetMapping("/all")
    public ResponseEntity<List<FoodItem>> getAll() {
        return ResponseEntity.ok(foodRepo.findAll());
    }
}

