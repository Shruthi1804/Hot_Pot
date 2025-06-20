package com.example.hot_pot.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegisterTest {

    @Test
    void testRegisterFields() {
        Register r = new Register("Shruthi", "admin@hotpot.com", "1804", "admin");

        assertEquals("Shruthi", r.getName());
        assertEquals("admin@hotpot.com", r.getEmail());
        assertEquals("1804", r.getPassword());
        assertEquals("admin", r.getRole());
    }

    @Test
    void testDefaultRole() {
        Register r = new Register();
        assertEquals("user", r.getRole()); // default role
    }
}
