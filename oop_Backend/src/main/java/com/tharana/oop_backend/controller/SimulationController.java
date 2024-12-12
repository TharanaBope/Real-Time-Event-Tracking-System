package com.tharana.oop_backend.controller;

import com.tharana.oop_backend.dto.SimulationRequest;
import com.tharana.oop_backend.service.SimulationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/simulation")
public class SimulationController {

    private final SimulationService simulationService;

    public SimulationController(SimulationService simulationService) {
        this.simulationService = simulationService;
    }

    @PostMapping("/start")
    public String startSimulation(@RequestBody SimulationRequest request) {
        simulationService.startSimulation(
                request.getTotalTickets(),
                request.getTicketReleaseRate(),
                request.getCustomerRetrievalRate(),
                request.getMaxTicketCapacity()
        );
        return "Simulation started with parameters: " + request;
    }

    @PostMapping("/stop")
    public String stopSimulation() {
        simulationService.stopSimulation();
        return "Simulation stopped.";
    }

    @PostMapping("/reset")
    public String resetSimulation() {
        simulationService.resetSimulation();
        return "Simulation reset. You can now start again.";
    }

    @GetMapping("/status")
    public String getStatus() {
        return simulationService.getSystemStatus();
    }

    @GetMapping("/available-tickets")
    public int getAvailableTickets() {
        return simulationService.getAvailableTicketsCount();
    }

    @GetMapping("/activity-logs")
    public List<String> getActivityLogs() {
        return simulationService.getActivityLogs();
    }
}

