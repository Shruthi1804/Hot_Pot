package com.example.hot_pot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Register {

    @Id
    private String email;
    private String name;
    private String password;
    @Column(nullable = false)
    private String role = "user";  // default role
    
    public Register() {
    	
    }

    
    public Register(String name, String email, String password, String role) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.role=role;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Register [email=" + email + ", name=" + name + ", password=" + password + ", role=" + role + "]";
	}
    
    


    
    
}
