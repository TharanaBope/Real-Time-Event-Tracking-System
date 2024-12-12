package com.tharana.oop_backend.model;

import java.util.LinkedList;
import java.util.Queue;

public class TicketPool {

    private final Queue<Ticket> tickets = new LinkedList<>();
    private int maxCapacity;

    public void initialize(int totalTickets, int maxCapacity) {
        this.maxCapacity = maxCapacity;
        tickets.clear();
        for (int i = 0; i < totalTickets; i++) {
            tickets.add(new Ticket("Event " + (i + 1), false));
        }
    }

    public void clear() {
        tickets.clear();
    }

    public void addTicket(Ticket ticket) {
        if (tickets.size() < maxCapacity) {
            tickets.add(ticket);
        }
    }

    public Ticket retrieveTicket() {
        return tickets.poll();
    }

    public Queue<Ticket> getAvailableTickets() {
        return new LinkedList<>(tickets);
    }
}
