package com.tharana.oop_backend.Repository;

import com.tharana.oop_backend.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    // Custom query to find a customer by name (case-insensitive)
    Customer findByNameIgnoreCase(String name);
}

