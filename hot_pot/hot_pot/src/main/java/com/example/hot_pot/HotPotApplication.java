package com.example.hot_pot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.hot_pot")
public class HotPotApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotPotApplication.class, args);
	}

}
