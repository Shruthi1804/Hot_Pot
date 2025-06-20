package com.example.hot_pot.apicontroller;


import com.example.hot_pot.entity.Register;
import com.example.hot_pot.repository.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private RegisterRepo registerRepo;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody Register user) {
        if ("admin@hotpot.com".equalsIgnoreCase(user.getEmail())) {
            user.setRole("admin");
        } else {
            user.setRole("user");
        }
        registerRepo.save(user);
        return ResponseEntity.ok("Registered Successfully");
    }


    // 🟢 Login API
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody Register loginData) {
        Register user = registerRepo.findByEmailAndPassword(
            loginData.getEmail(), loginData.getPassword()
        );

        if (user != null) {
            return ResponseEntity.ok(user); // return user object as JSON
        } else {
            return ResponseEntity.status(401).body("Invalid email or password");
        }
    }
}
