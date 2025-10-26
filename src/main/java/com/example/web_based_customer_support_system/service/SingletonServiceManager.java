package com.example.web_based_customer_support_system.service;

import com.example.web_based_customer_support_system.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Singleton pattern implementation for managing service instances
 * Ensures only one instance of service manager exists throughout the application
 */
@Component
public class SingletonServiceManager {

    private static volatile SingletonServiceManager instance;
    private static final Object lock = new Object();

    @Autowired
    private com.example.web_based_customer_support_system.repository.UserRepository userRepository;

    @Autowired
    private com.example.web_based_customer_support_system.repository.TicketRepository ticketRepository;

    @Autowired
    private com.example.web_based_customer_support_system.repository.FeedbackRepository feedbackRepository;

    @Autowired
    private com.example.web_based_customer_support_system.repository.FAQRepository faqRepository;

    @Autowired
    private com.example.web_based_customer_support_system.repository.ChatSessionRepository chatSessionRepository;

    @Autowired
    private com.example.web_based_customer_support_system.repository.ChatMessageRepository chatMessageRepository;

    @Autowired
    private AgentResponseRepository agentResponseRepository;

    // Private constructor to prevent instantiation
    private SingletonServiceManager() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    /**
     * Thread-safe singleton implementation using double-checked locking
     * @return SingletonServiceManager instance
     */
    public static SingletonServiceManager getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new SingletonServiceManager();
                }
            }
        }
        return instance;
    }

    // Getters for repositories
    public com.example.web_based_customer_support_system.repository.UserRepository getUserRepository() {
        return userRepository;
    }

    public com.example.web_based_customer_support_system.repository.TicketRepository getTicketRepository() {
        return ticketRepository;
    }

    public com.example.web_based_customer_support_system.repository.FeedbackRepository getFeedbackRepository() {
        return feedbackRepository;
    }

    public com.example.web_based_customer_support_system.repository.FAQRepository getFAQRepository() {
        return faqRepository;
    }

    public com.example.web_based_customer_support_system.repository.ChatSessionRepository getChatSessionRepository() {
        return chatSessionRepository;
    }

    public com.example.web_based_customer_support_system.repository.ChatMessageRepository getChatMessageRepository() {
        return chatMessageRepository;
    }

    public AgentResponseRepository getAgentResponseRepository() {
        return agentResponseRepository;
    }

    /**
     * Prevent cloning of singleton
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton cannot be cloned");
    }

    /**
     * Prevent deserialization of singleton
     */
    protected Object readResolve() {
        return getInstance();
    }
}

