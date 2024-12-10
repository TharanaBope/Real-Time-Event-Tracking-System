package com.tharana.real_time_event_tracking.repository;

import com.tharana.real_time_event_tracking.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {
}

