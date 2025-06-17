package com.example.hot_pot.MyController;


import com.example.hot_pot.entity.Register;
import com.example.hot_pot.repository.RegisterRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class HotPotApplicationTests {

    @Autowired
    private RegisterRepo registerRepo;

    @Test
    void testRegisterSaveAndFind() {
        // Creating a dummy user
        Register user = new Register();
        user.setName("Shruthi");
        user.setEmail("shruthi@example.com");
        user.setPassword("12345");

        // Save the user
        registerRepo.save(user);

        // Retrieve the user
        Register found = registerRepo.findByEmailAndPassword("shruthi@example.com", "12345");

        // Assertion
        assertThat(found).isNotNull();
        assertThat(found.getName()).isEqualTo("Shruthi");
    }
    
    @Test
    void testDeleteUser() {
        Register user = new Register();
        user.setName("DeleteUser");
        user.setEmail("delete@example.com");
        user.setPassword("delete123");
        registerRepo.save(user);

        Register saved = registerRepo.findByEmailAndPassword("delete@example.com", "delete123");
        assertThat(saved).isNotNull();

        registerRepo.delete(saved);

        Register afterDelete = registerRepo.findByEmailAndPassword("delete@example.com", "delete123");
        assertThat(afterDelete).isNull();
    }
    
    @Test
    void testFindNonExistentUser_returnsNull() {
        Register user = registerRepo.findByEmailAndPassword("fake@mail.com", "wrongpass");
        assertThat(user).isNull();
    }


}
