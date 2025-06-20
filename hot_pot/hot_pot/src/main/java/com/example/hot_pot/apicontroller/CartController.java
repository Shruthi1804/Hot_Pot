package com.example.hot_pot.apicontroller;


import com.example.hot_pot.entity.Cart;
import com.example.hot_pot.repository.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartRepo cartRepo;

    // Add item to cart
    @PostMapping("/add")
    public ResponseEntity<?> addToCart(@RequestBody Cart cart) {
        cartRepo.save(cart);
        return ResponseEntity.ok("Item added to cart");
    }

    // View items in cart for user
    @GetMapping("/view/{email}")
    public ResponseEntity<List<Cart>> viewCart(@PathVariable String email) {
        return ResponseEntity.ok(cartRepo.findByEmail(email));
    }

    // Remove item from cart
    @DeleteMapping("/remove/{id}")
    public ResponseEntity<?> removeItem(@PathVariable Long id) {
        cartRepo.deleteById(id);
        return ResponseEntity.ok("Item removed from cart");
    }
}
