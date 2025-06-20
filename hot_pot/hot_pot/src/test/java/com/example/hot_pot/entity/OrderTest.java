package com.example.hot_pot.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    void testNoArgConstructor() {
        Order order = new Order();
        assertNull(order.getId());
        assertNull(order.getEmail());
        assertNull(order.getFoodName());
        assertEquals(0, order.getQuantity());
        assertEquals(0.0, order.getPrice());
    }

    @Test
    void testAllArgsConstructor() {
        Order order = new Order("shruthi@gmail.com", "Pizza", 2, 499.99);

        assertEquals("shruthi@gmail.com", order.getEmail());
        assertEquals("Pizza", order.getFoodName());
        assertEquals(2, order.getQuantity());
        assertEquals(499.99, order.getPrice());
    }

    @Test
    void testSettersAndGetters() {
        Order order = new Order();
        order.setId(1L);
        order.setEmail("admin@example.com");
        order.setFoodName("Burger");
        order.setQuantity(3);
        order.setPrice(299.0);

        assertEquals(1L, order.getId());
        assertEquals("admin@example.com", order.getEmail());
        assertEquals("Burger", order.getFoodName());
        assertEquals(3, order.getQuantity());
        assertEquals(299.0, order.getPrice());
    }

    @Test
    void testToString() {
        Order order = new Order("test@food.com", "Noodles", 1, 120.5);
        order.setId(10L);
        String output = order.toString();
        assertTrue(output.contains("id=10"));
        assertTrue(output.contains("email=test@food.com"));
        assertTrue(output.contains("foodName=Noodles"));
        assertTrue(output.contains("quantity=1"));
        assertTrue(output.contains("price=120.5"));
    }
}

