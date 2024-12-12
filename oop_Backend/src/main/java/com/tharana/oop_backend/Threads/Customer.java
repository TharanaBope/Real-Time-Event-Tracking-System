package com.tharana.oop_backend.Threads;

import com.eventticketing.event_ticketing_system.model.Ticket;
import com.eventticketing.event_ticketing_system.model.TicketPool;

public class Customer implements Runnable {
    private final TicketPool ticketPool;

    public Customer(TicketPool ticketPool) {
        this.ticketPool = ticketPool;
    }

    @Override
    public void run() {
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
