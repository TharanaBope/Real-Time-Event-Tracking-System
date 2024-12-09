package com.tharana.oop_backend.repository;

import com.tharana.oop_backend.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

    // Custom query to find all available tickets
    List<Ticket> findByStatus(String status);

    // Custom query to find tickets by event name
    List<Ticket> findByEventContainingIgnoreCase(String event);
}

