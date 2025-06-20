package com.example.hot_pot.apicontroller;
import com.example.hot_pot.entity.Order;
import com.example.hot_pot.entity.Register;
import com.example.hot_pot.repository.OrderRepo;
import com.example.hot_pot.repository.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private RegisterRepo registerRepo;
    @Autowired
    private OrderRepo orderRepo;
    

    // View all users
    @GetMapping("/users")
    public ResponseEntity<?> getAllUsers() {
        List<Register> users = registerRepo.findAll();
        return ResponseEntity.ok(users);
    }

    // View one user
    @GetMapping("/user/{email}")
    public ResponseEntity<?> getUser(@PathVariable String email) {
        Register user = registerRepo.findByEmail(email);
        if (user != null) {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.status(404).body("User not found");
    }

    // Delete a user
    @DeleteMapping("/users/{email}")
    public ResponseEntity<?> deleteUser(@PathVariable String email) {
        Register user = registerRepo.findByEmail(email);
        if (user != null) {
            registerRepo.delete(user);
            return ResponseEntity.ok("User deleted successfully");
        }
        return ResponseEntity.status(404).body("User not found");
    }
    @GetMapping("/orders")
    public List<Order> viewAllOrders() {
        return orderRepo.findAll();
    }
}
