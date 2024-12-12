package com.tharana.oop_backend.service;

import com.tharana.oop_backend.model.Ticket;
import com.tharana.oop_backend.model.TicketPool;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimulationService {

    private final TicketPool ticketPool = new TicketPool();
    private final List<String> activityLogs = new ArrayList<>();
    private boolean isRunning = false;

    public String startSimulation(int totalTickets, int ticketReleaseRate, int customerRetrievalRate, int maxTicketCapacity) {
        // Initialize the simulation
        isRunning = true;
        ticketPool.initialize(totalTickets, maxTicketCapacity);
        activityLogs.clear();
        activityLogs.add("Simulation started with " + totalTickets + " tickets.");

        // Start vendor thread to release tickets
        new Thread(() -> {
            for (int i = 0; i < totalTickets; i++) {
                if (!isRunning) break;
                ticketPool.addTicket(new Ticket("Event", false));
                activityLogs.add("[Vendor] Ticket added to the pool.");
                try {
                    Thread.sleep(ticketReleaseRate * 1000L);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();

        // Start customer thread to buy tickets
        new Thread(() -> {
            while (isRunning) {
                Ticket ticket = ticketPool.retrieveTicket();
                if (ticket != null) {
                    activityLogs.add("[Customer] Ticket bought: " + ticket.getId());
                } else {
                    activityLogs.add("[Customer] No tickets available.");
                }
                try {
                    Thread.sleep(customerRetrievalRate * 1000L);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();

        return "Simulation started";
    }

    public void stopSimulation() {
        // Stop the simulation
        isRunning = false;
        activityLogs.add("Simulation stopped.");
    }

    public void resetSimulation() {
        // Reset the simulation
        isRunning = false;
        ticketPool.clear();
        activityLogs.clear();
        activityLogs.add("Simulation reset.");
    }

    public String getSystemStatus() {
        return isRunning ? "Running" : "Stopped";
    }

    public int getAvailableTicketsCount() {
        return ticketPool.getAvailableTickets().size();
    }

    public List<String> getActivityLogs() {
        return new ArrayList<>(activityLogs);
    }
}
