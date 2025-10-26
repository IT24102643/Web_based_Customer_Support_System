package com.example.web_based_customer_support_system.repository;

import com.example.web_based_customer_support_system.modelentity.AgentResponse;
import com.example.web_based_customer_support_system.modelentity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AgentResponseRepository extends JpaRepository<AgentResponse, Long> {

    // Return a list of responses for a ticket (even if there is only one)
    List<AgentResponse> findByTicket(Ticket ticket);
}
