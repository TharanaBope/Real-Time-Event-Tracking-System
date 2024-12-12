package com.tharana.oop_backend.service;

import com.tharana.oop_backend.model.Ticket;
import com.tharana.oop_backend.repository.TicketRepository;
import org.springframework.stereotype.Service;
// Service class for ticket operations
@Service
public class TicketService {
    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public Iterable<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }
        // Update ticket status
    public void updateTicketStatus(int ticketId, boolean isSold) {
        Ticket ticket = ticketRepository.findById(ticketId)
                .orElseThrow(() -> new IllegalArgumentException("Ticket not found with ID: " + ticketId));
        ticket.setSold(isSold);
        ticketRepository.save(ticket);
    }
}
