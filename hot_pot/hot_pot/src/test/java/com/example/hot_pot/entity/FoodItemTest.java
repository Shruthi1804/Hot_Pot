package com.example.hot_pot.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FoodItemTest {

    @Test
    void testNoArgConstructor() {
        FoodItem item = new FoodItem();
        assertNull(item.getId());
        assertNull(item.getName());
        assertNull(item.getCategory());
        assertEquals(0.0, item.getPrice());
        assertNull(item.getImageUrl());
    }

    @Test
    void testAllArgsConstructor() {
        FoodItem item = new FoodItem("Burger", "Fast Food", 199.99, "burger.jpg");

        assertEquals("Burger", item.getName());
        assertEquals("Fast Food", item.getCategory());
        assertEquals(199.99, item.getPrice());
        assertEquals("burger.jpg", item.getImageUrl());
    }

    @Test
    void testSettersAndGetters() {
        FoodItem item = new FoodItem();
        item.setId(10L);
        item.setName("Pizza");
        item.setCategory("Italian");
        item.setPrice(250.0);
        item.setImageUrl("pizza.jpg");

        assertEquals(10L, item.getId());
        assertEquals("Pizza", item.getName());
        assertEquals("Italian", item.getCategory());
        assertEquals(250.0, item.getPrice());
        assertEquals("pizza.jpg", item.getImageUrl());
    }
}
