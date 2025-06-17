package com.example.hot_pot.controller;

import com.example.hot_pot.entity.Register;
import com.example.hot_pot.repository.RegisterRepo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    @Autowired
    private RegisterRepo registerRepo;

    
    @RequestMapping("/")
    public String home() {
        return "homepage.jsp"; 
    }

    // 📄 Show Sign Up Page
    @GetMapping("/signup")
    public String signupPage() {
        return "signup.jsp"; 
    }

  
    @PostMapping("/register")
    public String registerUser(@ModelAttribute Register user, Model model) {
        registerRepo.save(user);
        model.addAttribute("msg", "Registration successful! Please log in.");
        return "signin.jsp"; 
    }

 
    @GetMapping("/signin")
    public String signinPage(@RequestParam(value = "error", required = false) String error,
                             HttpServletRequest request) {
        request.setAttribute("errorMessage", error);
        return "signin.jsp"; 
    }


    @PostMapping("/login")
    public String signinUser(@RequestParam("email") String email,
                             @RequestParam("password") String password,
                             Model model) {
        Register user = registerRepo.findByEmailAndPassword(email, password);
        if (user != null) {
            model.addAttribute("username", user.getName());
            return "usermain.jsp"; 
        } else {
            model.addAttribute("error", "Invalid email or password.");
            return "signin.jsp"; 
        }
    }
}
