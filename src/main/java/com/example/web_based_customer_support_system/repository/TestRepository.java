package com.example.web_based_customer_support_system.repository;

import com.example.web_based_customer_support_system.modelentity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity, Long> {
}
