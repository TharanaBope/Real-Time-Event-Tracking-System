package com.tharana.oop_backend.repository;

import com.tharana.oop_backend.model.TransactionLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// Repository class for log operations
@Repository
public interface LogRepository extends JpaRepository<TransactionLog, Integer> {
}

