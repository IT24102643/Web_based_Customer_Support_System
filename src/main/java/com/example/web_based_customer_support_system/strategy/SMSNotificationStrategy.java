package com.example.web_based_customer_support_system.strategy;

import com.example.web_based_customer_support_system.modelentity.User;
import org.springframework.stereotype.Component;

/**
 * SMS notification strategy implementation
 * Sends notifications via SMS
 */
@Component
public class SMSNotificationStrategy implements com.example.web_based_customer_support_system.strategy.NotificationStrategy {

    @Override
    public boolean sendNotification(User user, String subject, String message) {
        try {
            // Simulate SMS sending
            System.out.println("=== SMS NOTIFICATION ===");
            System.out.println("To: " + user.getPhoneNumber());
            System.out.println("Message: " + subject + " - " + message);
            System.out.println("========================");

            // In a real implementation, you would integrate with an SMS service
            // like Twilio, AWS SNS, etc.
            return true;
        } catch (Exception e) {
            System.err.println("Failed to send SMS notification: " + e.getMessage());
            return false;
        }
    }

    @Override
    public String getNotificationType() {
        return "SMS";
    }
}

