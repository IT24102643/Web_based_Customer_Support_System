package com.example.web_based_customer_support_system.repository;

import com.example.web_based_customer_support_system.modelentity.Ticket;
import com.example.web_based_customer_support_system.modelentity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByUser(User user);  // ✅ get tickets for logged-in user
    long countByStatus(String status);   // ✅ count tickets by status

    // ✅ Fetch all tickets with user eagerly loaded (avoid DISTINCT on TEXT columns)
    @Query("SELECT t FROM Ticket t LEFT JOIN FETCH t.user")
    List<Ticket> findAllWithUser();
}