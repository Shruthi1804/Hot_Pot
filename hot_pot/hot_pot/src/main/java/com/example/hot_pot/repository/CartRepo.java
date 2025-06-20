package com.example.hot_pot.repository;


import com.example.hot_pot.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepo extends JpaRepository<Cart, Long> {
    List<Cart> findByEmail(String email);
}
