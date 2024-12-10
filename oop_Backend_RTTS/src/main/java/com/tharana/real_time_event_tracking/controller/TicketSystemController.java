package com.tharana.real_time_event_tracking.controller;

import com.tharana.real_time_event_tracking.service.TicketingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ticketing")
public class TicketSystemController {
    private final TicketingService ticketingService;

    @Autowired
    public TicketSystemController(TicketingService ticketingService) {
        this.ticketingService = ticketingService;
    }

    @PostMapping("/start")
    public ResponseEntity<String> startSimulation(@RequestParam int vendorCount, @RequestParam int consumerCount) {
        ticketingService.startSimulation(vendorCount, 1000, consumerCount, 500); // Sample rates
        return ResponseEntity.ok("Simulation started");
    }

    @PostMapping("/stop")
    public ResponseEntity<String> stopSimulation() {
        ticketingService.stopSimulation();
        return ResponseEntity.ok("Simulation stopped");
    }
}

