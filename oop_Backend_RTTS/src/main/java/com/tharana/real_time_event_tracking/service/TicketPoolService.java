package com.tharana.real_time_event_tracking.service;

import com.tharana.real_time_event_tracking.entity.Ticket;
import com.tharana.real_time_event_tracking.repo.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.Queue;

@Service
public class TicketPoolService {
    @Autowired
    private TicketRepo ticketRepo;

    private final Queue<Ticket> ticketPool = new LinkedList<>();

    public void addTicket(Ticket ticket) {
        ticketPool.add(ticket);
        ticketRepo.save(ticket);
    }

    public Ticket buyTicket() {
        return ticketPool.poll();
    }

    public int availableTickets() {
        return ticketPool.size();
    }
}
