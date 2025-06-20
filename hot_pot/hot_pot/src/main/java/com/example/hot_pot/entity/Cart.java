package com.example.hot_pot.entity;


import jakarta.persistence.*;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String foodName;
    private int quantity;
    private double price;

    public Cart() {}

    public Cart(String email, String foodName, int quantity, double price) {
        this.email = email;
        this.foodName = foodName;
        this.quantity = quantity;
        this.price = price;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", email=" + email + ", foodName=" + foodName + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
    

    
}
