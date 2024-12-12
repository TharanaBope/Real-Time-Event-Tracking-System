package com.tharana.oop_backend.Threads;

import com.tharana.oop_backend.model.Ticket;
import com.tharana.oop_backend.model.TicketPool;
// Customer class that buys tickets from the ticket pool
public class Customer implements Runnable {
    private final TicketPool ticketPool;

    public Customer(TicketPool ticketPool) {
        this.ticketPool = ticketPool;
    }

    @Override
    public void run() { // Buy tickets from the ticket pool
        while (true) {
            Ticket ticket = ticketPool.retrieveTicket();
            if (ticket != null) {
                System.out.println("[Customer] Ticket ID: " + ticket.getId() + " bought for event: " + ticket.getEventName());
            } else {
                System.out.println("[Customer] No tickets available.");
            }
        }
    }
}

