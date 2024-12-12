package com.tharana.oop_backend.Threads;

import com.tharana.oop_backend.model.Ticket;
import com.tharana.oop_backend.model.TicketPool;

public class Vendor implements Runnable {
    private final TicketPool ticketPool;
    private final int totalTickets;

    public Vendor(TicketPool ticketPool, int totalTickets) {
        this.ticketPool = ticketPool;
        this.totalTickets = totalTickets;
    }

    @Override
    public void run() {
        for (int i = 0; i < totalTickets; i++) {
            Ticket ticket = new Ticket("Event " + (i + 1), false);
            ticketPool.addTicket(ticket);
            System.out.println("[Vendor] Ticket added: " + ticket.getEventName());
        }
    }
}
