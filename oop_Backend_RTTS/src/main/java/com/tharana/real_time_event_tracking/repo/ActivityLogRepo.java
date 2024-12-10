package com.tharana.real_time_event_tracking.repo;

import com.tharana.real_time_event_tracking.entity.ActivityLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityLogRepo extends JpaRepository<ActivityLog, Long> {
}

