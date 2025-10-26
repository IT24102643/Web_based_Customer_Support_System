package com.example.web_based_customer_support_system.repository;

import com.example.web_based_customer_support_system.modelentity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Find user by username
    Optional<User> findByUsername(String username);

    // Check if username already exists (useful for registration validation)
    boolean existsByUsername(String username);

    // (Optional) Find user by role
    Optional<User> findByRole(String role);
}
