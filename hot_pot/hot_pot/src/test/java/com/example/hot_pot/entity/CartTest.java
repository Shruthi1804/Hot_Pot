package com.example.hot_pot.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

    @Test
    void testNoArgsConstructor() {
        Cart cart = new Cart();
        assertNull(cart.getId());
        assertNull(cart.getEmail());
        assertNull(cart.getFoodName());
        assertEquals(0, cart.getQuantity());
        assertEquals(0.0, cart.getPrice());
    }

    @Test
    void testAllArgsConstructor() {
        Cart cart = new Cart("shruthi@gmail.com", "Pizza", 2, 499.50);

        assertEquals("shruthi@gmail.com", cart.getEmail());
        assertEquals("Pizza", cart.getFoodName());
        assertEquals(2, cart.getQuantity());
        assertEquals(499.50, cart.getPrice());
    }

    @Test
    void testSettersAndGetters() {
        Cart cart = new Cart();
        cart.setId(100L);
        cart.setEmail("admin@example.com");
        cart.setFoodName("Burger");
        cart.setQuantity(3);
        cart.setPrice(299.99);

        assertEquals(100L, cart.getId());
        assertEquals("admin@example.com", cart.getEmail());
        assertEquals("Burger", cart.getFoodName());
        assertEquals(3, cart.getQuantity());
        assertEquals(299.99, cart.getPrice());
    }

    @Test
    void testToString() {
        Cart cart = new Cart("test@hotpot.com", "Noodles", 1, 120.0);
        cart.setId(20L);
        String str = cart.toString();
        assertTrue(str.contains("id=20"));
        assertTrue(str.contains("email=test@hotpot.com"));
        assertTrue(str.contains("foodName=Noodles"));
        assertTrue(str.contains("quantity=1"));
        assertTrue(str.contains("price=120.0"));
    }
}

