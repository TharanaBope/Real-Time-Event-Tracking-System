package com.tharana.real_time_event_tracking.service;

import com.tharana.real_time_event_tracking.entity.Ticket;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.Queue;

@Service
public class TicketPool {
    private final Queue<Ticket> tickets = new LinkedList<>();

    public synchronized boolean addTicket(Ticket ticket) {
        // Assuming no capacity limit for simplicity. You might want to implement one.
        tickets.add(ticket);
        notifyAll(); // Notify consumers that a ticket is available
        return true;
    }

    public synchronized Ticket retrieveTicket() {
        while (tickets.isEmpty()) {
            try {
                wait(); // Wait until a ticket is available
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Properly handle thread interruption
                return null;
            }
        }
        return tickets.poll(); // Return the first ticket
    }
}
