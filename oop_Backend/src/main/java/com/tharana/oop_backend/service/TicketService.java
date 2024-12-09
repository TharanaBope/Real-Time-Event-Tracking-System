package com.tharana.oop_backend.service;

import com.tharana.oop_backend.entity.Ticket;
import java.util.List;

public interface TicketService {
    List<Ticket> getAllTickets();
    Ticket getTicketById(int id);
    Ticket addTicket(Ticket ticket);
    void deleteTicketById(int id);
    List<Ticket> getAvailableTickets();
}
