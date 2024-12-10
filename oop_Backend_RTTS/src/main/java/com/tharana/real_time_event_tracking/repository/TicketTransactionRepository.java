package com.tharana.real_time_event_tracking.repository;

import com.tharana.real_time_event_tracking.entity.TicketTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketTransactionRepository extends JpaRepository<TicketTransaction, Long> {
}
