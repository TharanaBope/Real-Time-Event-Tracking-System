package com.tharana.real_time_event_tracking.repository;

import com.tharana.real_time_event_tracking.entity.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Long> {
}

