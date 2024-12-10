package com.tharana.real_time_event_tracking.repo;

import com.tharana.real_time_event_tracking.entity.SystemConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemConfigRepo extends JpaRepository<SystemConfig, Long> {
}

