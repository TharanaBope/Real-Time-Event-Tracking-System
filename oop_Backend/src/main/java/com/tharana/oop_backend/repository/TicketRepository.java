package com.tharana.oop_backend.repository;

import com.tharana.oop_backend.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
// Repository class for ticket operations
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
