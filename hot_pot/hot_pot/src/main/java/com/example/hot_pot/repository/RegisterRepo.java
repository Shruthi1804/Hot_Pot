package com.example.hot_pot.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hot_pot.entity.Register;
public interface RegisterRepo extends JpaRepository<Register, String> {
	 Register findByEmail(String email);

	 Register findByEmailAndPassword(String email, String password);
}
