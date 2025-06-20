package com.example.hot_pot.apicontroller;
import com.example.hot_pot.entity.Order;
import com.example.hot_pot.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderRepo orderRepo;

    // 🔸 Place Order
    @PostMapping("/place")
    public ResponseEntity<?> placeOrder(@RequestBody Order order) {
        orderRepo.save(order);
        return ResponseEntity.ok("Order placed successfully");
    }

    // 🔸 View user's order history
    @GetMapping("/history/{email}")
    public ResponseEntity<List<Order>> getUserOrders(@PathVariable String email) {
        return ResponseEntity.ok(orderRepo.findByEmail(email));
    }
}

