package com.tharana.oop_backend.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
// Controller class for log operations
@Controller
public class LogController {

    @MessageMapping("/logs") // Endpoint for incoming messages
    @SendTo("/topic/logs")   // Endpoint for broadcasting messages
    public String processLog(String logMessage) {
        return logMessage; // Broadcasts the message to subscribers
    }
}
