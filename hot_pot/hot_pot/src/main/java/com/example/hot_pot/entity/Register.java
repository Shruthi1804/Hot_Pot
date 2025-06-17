package com.example.hot_pot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Register {

    @Id
    private String email;
    private String name;
    private String password;
    
    public Register(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
   public Register() {
	   
   }
	public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

	@Override
	public String toString() {
		return "Register [name=" + name + ", email=" + email + ", password=" + password + "]";
	}
    
    
}
