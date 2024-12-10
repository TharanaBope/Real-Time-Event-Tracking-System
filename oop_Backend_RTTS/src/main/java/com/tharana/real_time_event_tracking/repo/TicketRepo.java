package com.tharana.real_time_event_tracking.repo;


import com.tharana.real_time_event_tracking.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<Ticket, Long> {
}

