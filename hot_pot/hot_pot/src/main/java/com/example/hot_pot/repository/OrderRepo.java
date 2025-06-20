package com.example.hot_pot.repository;


import com.example.hot_pot.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepo extends JpaRepository<Order, Long> {
    List<Order> findByEmail(String email);
}

