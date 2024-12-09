package com.tharana.oop_backend.service.impl;

import com.tharana.oop_backend.entity.Ticket;
import com.tharana.oop_backend.repository.TicketRepository;
import com.tharana.oop_backend.service.TicketService;
import com.tharana.oop_backend.util.enums.TicketStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;

    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket getTicketById(int id) {
        return ticketRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ticket not found with ID: " + id));
    }

    @Override
    public Ticket addTicket(Ticket ticket) {
        ticket.setStatus(TicketStatus.AVAILABLE); // Default status for a new ticket
        return ticketRepository.save(ticket);
    }

    @Override
    public void deleteTicketById(int id) {
        if (!ticketRepository.existsById(id)) {
            throw new RuntimeException("Ticket not found with ID: " + id);
        }
        ticketRepository.deleteById(id);
    }

    @Override
    public List<Ticket> getAvailableTickets() {
        return ticketRepository.findByStatus(TicketStatus.AVAILABLE.name());
    }
}
