package com.tharana.oop_backend.controller;

import com.tharana.oop_backend.dto.SimulationRequest;
import com.tharana.oop_backend.service.SimulationService;
import org.springframework.web.bind.annotation.*;
// Controller class for simulation operations
import java.util.List;

@RestController
@RequestMapping("/api/simulation")// This class is a REST controller and all the endpoints are prefixed with /api/simulation
public class SimulationController {

    private final SimulationService simulationService;

    public SimulationController(SimulationService simulationService) {
        this.simulationService = simulationService;
    }

    @PostMapping("/start")// The startSimulation method is mapped to the /start endpoint
    public String startSimulation(@RequestBody SimulationRequest request) {
        simulationService.startSimulation(
                request.getTotalTickets(),
                request.getTicketReleaseRate(),
                request.getCustomerRetrievalRate(),
                request.getMaxTicketCapacity()
        );
        return "Simulation started with parameters: " + request;
    }

    @PostMapping("/stop")// The stopSimulation method is mapped to the /stop endpoint
    public String stopSimulation() {
        simulationService.stopSimulation();
        return "Simulation stopped.";
    }

    @PostMapping("/reset")//    The resetSimulation method is mapped to the /reset endpoint
    public String resetSimulation() {
        simulationService.resetSimulation();
        return "Simulation reset. You can now start again.";
    }

    @GetMapping("/status")// The getStatus method is mapped to the /status endpoint
    public String getStatus() {
        return simulationService.getSystemStatus();
    }

    @GetMapping("/available-tickets")// The getAvailableTickets method is mapped to the /available-tickets endpoint
    public int getAvailableTickets() {
        return simulationService.getAvailableTicketsCount();
    }

    @GetMapping("/activity-logs")// The getActivityLogs method is mapped to the /activity-logs endpoint
    public List<String> getActivityLogs() {
        return simulationService.getActivityLogs();
    }
}

