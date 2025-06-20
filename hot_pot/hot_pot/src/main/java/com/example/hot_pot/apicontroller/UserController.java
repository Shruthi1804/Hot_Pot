package com.example.hot_pot.apicontroller;

import com.example.hot_pot.entity.Register;
import com.example.hot_pot.repository.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private RegisterRepo registerRepo;

    // Get user profile by email
    @GetMapping("/profile/{email}")
    public ResponseEntity<?> getProfile(@PathVariable String email) {
        Register user = registerRepo.findByEmail(email);
        if (user != null) {
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.status(404).body("User not found");
    }

    //Update user profile
    @PutMapping("/profile/{email}")
    public ResponseEntity<?> updateProfile(@PathVariable String email, @RequestBody Register updatedUser) {
        Register user = registerRepo.findByEmail(email);
        if (user != null) {
            user.setName(updatedUser.getName());
            user.setPassword(updatedUser.getPassword());
            registerRepo.save(user);
            return ResponseEntity.ok("Profile updated successfully");
        }
        return ResponseEntity.status(404).body("User not found");
    }

    //Just a dummy example for categories
    @GetMapping("/categories")
    public ResponseEntity<?> getCategories() {
        return ResponseEntity.ok(new String[]{"Biryani", "Pizza", "Burger"});
    }
}
