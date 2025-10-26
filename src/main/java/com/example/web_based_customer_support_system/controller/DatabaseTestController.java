package com.example.web_based_customer_support_system.controller;

import com.example.web_based_customer_support_system.modelentity.TestEntity;
import com.example.web_based_customer_support_system.repository.TestRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dbtest")
public class DatabaseTestController {
    private final TestRepository repo;

    public DatabaseTestController(TestRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/add")
    public TestEntity addMessage(@RequestParam String msg) {
        TestEntity entity = new TestEntity();
        entity.setMessage(msg);
        return repo.save(entity);
    }

    @GetMapping("/all")
    public List<TestEntity> getAll() {
        return repo.findAll();
    }
}
