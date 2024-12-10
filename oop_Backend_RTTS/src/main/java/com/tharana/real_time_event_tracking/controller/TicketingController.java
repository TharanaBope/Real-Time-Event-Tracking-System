package com.tharana.real_time_event_tracking.controller;

import com.tharana.real_time_event_tracking.entity.SystemConfig;
import com.tharana.real_time_event_tracking.service.SystemControlService;
import com.tharana.real_time_event_tracking.service.TicketPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TicketingController {
    @Autowired
    private SystemControlService systemControlService;

    @Autowired
    private TicketPoolService ticketPoolService;

    @GetMapping("/configuration")
    public SystemConfig getConfiguration() {
        return systemControlService.getConfiguration();
    }

    @PostMapping("/configuration")
    public void updateConfiguration(@RequestBody SystemConfig config) {
        systemControlService.updateConfiguration(config);
    }

    @GetMapping("/tickets/available")
    public int getAvailableTickets() {
        return ticketPoolService.availableTickets();
    }
}

